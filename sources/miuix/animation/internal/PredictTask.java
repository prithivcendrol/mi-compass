package miuix.animation.internal;

import android.animation.TimeInterpolator;
import java.util.ArrayList;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.internal.TransitionInfo;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.property.FloatProperty;
import miuix.animation.styles.PropertyStyle;
import miuix.animation.utils.EaseManager;

public class PredictTask {
    private static final TransitionInfo.IUpdateInfoCreator sCreator = new TransitionInfo.IUpdateInfoCreator() {
        public UpdateInfo getUpdateInfo(FloatProperty floatProperty) {
            return new UpdateInfo(floatProperty);
        }
    };

    public static long predictDuration(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        TransitionInfo transitionInfo = new TransitionInfo(iAnimTarget, animState, animState2, animConfigLink);
        transitionInfo.initUpdateList(sCreator);
        transitionInfo.setupTasks(true);
        long averageDelta = AnimRunner.getInst().getAverageDelta();
        long j = averageDelta;
        while (true) {
            for (AnimTask doAnimationFrame : transitionInfo.animTasks) {
                AnimRunnerTask.doAnimationFrame(doAnimationFrame, j, averageDelta, false, true);
            }
            if (!transitionInfo.getAnimStats().isRunning()) {
                return j;
            }
            j += averageDelta;
        }
    }

    public static double predictNextValue(IAnimTarget iAnimTarget, AnimState animState, FloatProperty floatProperty, AnimConfig animConfig) {
        IAnimTarget iAnimTarget2 = iAnimTarget;
        FloatProperty floatProperty2 = floatProperty;
        EaseManager.EaseStyle ease = AnimConfigUtils.getEase(animState.getConfig(), animConfig.getSpecialConfig(floatProperty2));
        float value = iAnimTarget2.getValue(floatProperty2);
        double velocity = iAnimTarget2.getVelocity(floatProperty2);
        ArrayList<TransitionInfo> arrayList = new ArrayList<>();
        iAnimTarget2.animManager.getTransitionInfos(arrayList);
        UpdateInfo updateInfo = null;
        for (TransitionInfo transitionInfo : arrayList) {
            if (transitionInfo.containsProperty(floatProperty2)) {
                updateInfo = UpdateInfo.findBy(transitionInfo.updateList, floatProperty2);
            }
        }
        if (updateInfo == null) {
            return Double.MAX_VALUE;
        }
        double averageDelta = ((double) AnimRunner.getInst().getAverageDelta()) / 1000.0d;
        if (EaseManager.isPhysicsStyle(ease.style)) {
            PhysicsOperator phyOperator = PropertyStyle.getPhyOperator(ease.style);
            if (AnimValueUtils.isInvalid(updateInfo.animInfo.targetValue)) {
                return Double.MAX_VALUE;
            }
            double[] dArr = ease.parameters;
            double d = dArr[0];
            double d2 = dArr[1];
            double d3 = (double) value;
            double d4 = averageDelta;
            return d3 + ((velocity + phyOperator.updateVelocity(velocity, d, d2, d4, updateInfo.animInfo.targetValue, d3)) * 0.5d * d4);
        }
        EaseManager.InterpolateEaseStyle interpolateEaseStyle = (EaseManager.InterpolateEaseStyle) ease;
        TimeInterpolator interpolator = EaseManager.getInterpolator(interpolateEaseStyle);
        long currentTimeMillis = (System.currentTimeMillis() - updateInfo.animInfo.startTime) + ((long) averageDelta);
        long j = interpolateEaseStyle.duration;
        return currentTimeMillis < j ? (double) interpolator.getInterpolation(((float) currentTimeMillis) / ((float) j)) : updateInfo.animInfo.targetValue;
    }

    public static double predictNextVelocity(IAnimTarget iAnimTarget, AnimState animState, FloatProperty floatProperty, AnimConfig animConfig) {
        FloatProperty floatProperty2 = floatProperty;
        EaseManager.EaseStyle ease = AnimConfigUtils.getEase(animState.getConfig(), animConfig.getSpecialConfig(floatProperty2));
        float value = iAnimTarget.getValue(floatProperty2);
        double velocity = iAnimTarget.getVelocity(floatProperty2);
        ArrayList<TransitionInfo> arrayList = new ArrayList<>();
        iAnimTarget.animManager.getTransitionInfos(arrayList);
        UpdateInfo updateInfo = null;
        for (TransitionInfo transitionInfo : arrayList) {
            if (transitionInfo.containsProperty(floatProperty2)) {
                updateInfo = UpdateInfo.findBy(transitionInfo.updateList, floatProperty2);
            }
        }
        if (updateInfo == null || !EaseManager.isPhysicsStyle(ease.style)) {
            return Double.MAX_VALUE;
        }
        double averageDelta = ((double) AnimRunner.getInst().getAverageDelta()) / 1000.0d;
        PhysicsOperator phyOperator = PropertyStyle.getPhyOperator(ease.style);
        if (AnimValueUtils.isInvalid(updateInfo.animInfo.targetValue)) {
            return Double.MAX_VALUE;
        }
        double[] dArr = ease.parameters;
        return phyOperator.updateVelocity(velocity, dArr[0], dArr[1], averageDelta, updateInfo.animInfo.targetValue, (double) value);
    }
}
