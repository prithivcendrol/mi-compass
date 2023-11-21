package miuix.animation.styles;

import android.animation.TimeInterpolator;
import miuix.animation.IAnimTarget;
import miuix.animation.internal.AnimData;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.physics.AccelerateOperator;
import miuix.animation.physics.EquilibriumChecker;
import miuix.animation.physics.FrictionOperator;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.physics.SpringOperator;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;

public class PropertyStyle {
    private static final long LONGEST_DURATION = 10000;
    static EquilibriumChecker checker;
    static final ThreadLocal<EquilibriumChecker> mCheckerLocal = new ThreadLocal<>();
    static final AccelerateOperator sAccelerate = new AccelerateOperator();
    static final FrictionOperator sFriction = new FrictionOperator();
    static final SpringOperator sSpring = new SpringOperator();

    public static void doAnimationFrame(IAnimTarget iAnimTarget, AnimData animData, long j, long j2, long j3) {
        long j4 = j - animData.startTime;
        if (EaseManager.isPhysicsStyle(animData.ease.style)) {
            updatePhysicsAnim(iAnimTarget, animData, j4, j2, j3);
        } else {
            updateInterpolatorAnim(animData, j4);
        }
    }

    private static void doPhysicsCalculation(AnimData animData, double d) {
        double d2 = animData.velocity;
        PhysicsOperator phyOperator = getPhyOperator(animData.ease.style);
        if (phyOperator == null || ((phyOperator instanceof SpringOperator) && AnimValueUtils.isInvalid(animData.targetValue))) {
            animData.value = animData.targetValue;
            animData.velocity = 0.0d;
            return;
        }
        double[] dArr = animData.ease.parameters;
        double updateVelocity = phyOperator.updateVelocity(d2, dArr[0], dArr[1], d, animData.targetValue, animData.value);
        animData.value += (animData.velocity + updateVelocity) * 0.5d * d;
        animData.velocity = updateVelocity;
    }

    public static PhysicsOperator getPhyOperator(int i) {
        if (i == -4) {
            return sFriction;
        }
        if (i == -3) {
            return sAccelerate;
        }
        if (i != -2) {
            return null;
        }
        return sSpring;
    }

    public static float getVelocityThreshold() {
        EquilibriumChecker equilibriumChecker = checker;
        if (equilibriumChecker != null) {
            return equilibriumChecker.getVelocityThreshold();
        }
        return 0.0f;
    }

    static boolean isAnimRunning(EquilibriumChecker equilibriumChecker, FloatProperty floatProperty, int i, double d, double d2, long j) {
        boolean z = !equilibriumChecker.isAtEquilibrium(i, d, d2);
        if (!z || j <= LONGEST_DURATION) {
            return z;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("animation for " + floatProperty.getName() + " stopped for running time too long, totalTime = " + j, new Object[0]);
        }
        return false;
    }

    private static boolean isUsingSpringPhy(AnimData animData) {
        return animData.ease.style == -2;
    }

    private static void setFinishValue(AnimData animData) {
        if (isUsingSpringPhy(animData)) {
            animData.value = animData.targetValue;
        }
    }

    private static void updateInterpolatorAnim(AnimData animData, long j) {
        double d;
        EaseManager.InterpolateEaseStyle interpolateEaseStyle = (EaseManager.InterpolateEaseStyle) animData.ease;
        TimeInterpolator interpolator = EaseManager.getInterpolator(interpolateEaseStyle);
        long j2 = interpolateEaseStyle.duration;
        if (j < j2) {
            d = (double) interpolator.getInterpolation(((float) j) / ((float) j2));
        } else {
            animData.setOp((byte) 3);
            d = 1.0d;
        }
        animData.progress = d;
        animData.value = d;
    }

    private static void updatePhysicsAnim(IAnimTarget iAnimTarget, AnimData animData, long j, long j2, long j3) {
        AnimData animData2 = animData;
        long j4 = j2;
        long j5 = j3;
        int round = j4 > j5 ? Math.round(((float) j4) / ((float) j5)) : 1;
        double d = ((double) j5) / 1000.0d;
        EquilibriumChecker equilibriumChecker = (EquilibriumChecker) CommonUtils.getLocal(mCheckerLocal, EquilibriumChecker.class);
        checker = equilibriumChecker;
        IAnimTarget iAnimTarget2 = iAnimTarget;
        equilibriumChecker.init(iAnimTarget, animData2.property, animData2.targetValue);
        for (int i = 0; i < round; i++) {
            doPhysicsCalculation(animData2, d);
            if (!isAnimRunning(checker, animData2.property, animData2.ease.style, animData2.value, animData2.velocity, j)) {
                animData2.setOp((byte) 3);
                if (LogUtils.isLogEnabled()) {
                    LogUtils.debug("----- updatePhysicsAnim data.setOp(AnimTask.OP_END)", new Object[0]);
                }
                setFinishValue(animData);
                return;
            }
        }
    }
}
