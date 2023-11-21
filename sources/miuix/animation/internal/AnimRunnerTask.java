package miuix.animation.internal;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.TypeEvaluator;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

class AnimRunnerTask {
    static final ThreadLocal<AnimData> animDataLocal = new ThreadLocal<>();

    AnimRunnerTask() {
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [miuix.animation.utils.LinkNode] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void doAnimationFrame(miuix.animation.internal.AnimTask r20, long r21, long r23, boolean r25, boolean r26) {
        /*
            java.lang.ThreadLocal<miuix.animation.internal.AnimData> r0 = animDataLocal
            java.lang.Class<miuix.animation.internal.AnimData> r1 = miuix.animation.internal.AnimData.class
            java.lang.Object r0 = miuix.animation.utils.CommonUtils.getLocal(r0, r1)
            miuix.animation.internal.AnimData r0 = (miuix.animation.internal.AnimData) r0
            boolean r1 = miuix.animation.utils.LogUtils.isLogEnabled()
            r0.logEnabled = r1
            miuix.animation.internal.AnimRunner r1 = miuix.animation.internal.AnimRunner.getInst()
            long r10 = r1.getAverageDelta()
            r12 = r20
        L_0x001a:
            if (r12 == 0) goto L_0x00cd
            miuix.animation.internal.AnimStats r1 = r12.animStats
            r2 = 0
            r1.updateCount = r2
            boolean r1 = r1.isStarted()
            r13 = 1
            r14 = r1 ^ 1
            miuix.animation.internal.TransitionInfo r1 = r12.info
            java.util.List<miuix.animation.listener.UpdateInfo> r15 = r1.updateList
            miuix.animation.internal.TransitionInfo r1 = r12.info
            miuix.animation.IAnimTarget r1 = r1.target
            boolean r9 = r1 instanceof miuix.animation.ViewTarget
            int r1 = r12.startPos
            int r2 = r12.getAnimCount()
            int r7 = r1 + r2
            r8 = r1
        L_0x003b:
            if (r8 >= r7) goto L_0x00c4
            java.lang.Object r1 = r15.get(r8)
            r5 = r1
            miuix.animation.listener.UpdateInfo r5 = (miuix.animation.listener.UpdateInfo) r5
            if (r5 != 0) goto L_0x004e
            r17 = r7
            r18 = r8
            r19 = r9
            goto L_0x00bc
        L_0x004e:
            miuix.animation.internal.TransitionInfo r1 = r12.info
            miuix.animation.base.AnimConfig r1 = r1.config
            miuix.animation.property.FloatProperty r2 = r5.property
            java.lang.String r2 = r2.getName()
            miuix.animation.base.AnimSpecialConfig r4 = r1.getSpecialConfig((java.lang.String) r2)
            miuix.animation.internal.TransitionInfo r1 = r12.info
            miuix.animation.base.AnimConfig r1 = r1.config
            r0.from(r5, r1, r4)
            if (r14 == 0) goto L_0x0077
            miuix.animation.internal.TransitionInfo r3 = r12.info
            r1 = r12
            r2 = r0
            r16 = r5
            r5 = r21
            r17 = r7
            r18 = r8
            r7 = r23
            setup(r1, r2, r3, r4, r5, r7)
            goto L_0x007d
        L_0x0077:
            r16 = r5
            r17 = r7
            r18 = r8
        L_0x007d:
            byte r1 = r0.f7487op
            if (r1 != r13) goto L_0x008c
            miuix.animation.internal.TransitionInfo r3 = r12.info
            r1 = r12
            r2 = r0
            r4 = r21
            r6 = r23
            startAnim(r1, r2, r3, r4, r6)
        L_0x008c:
            byte r1 = r0.f7487op
            r2 = 2
            if (r1 != r2) goto L_0x00a0
            miuix.animation.internal.TransitionInfo r3 = r12.info
            r1 = r12
            r2 = r0
            r4 = r21
            r6 = r23
            r19 = r9
            r8 = r10
            updateAnimation(r1, r2, r3, r4, r6, r8)
            goto L_0x00a2
        L_0x00a0:
            r19 = r9
        L_0x00a2:
            r1 = r16
            r0.mo7012to(r1)
            if (r25 == 0) goto L_0x00bc
            if (r26 == 0) goto L_0x00bc
            if (r19 != 0) goto L_0x00bc
            double r2 = r0.value
            boolean r2 = miuix.animation.internal.AnimValueUtils.isInvalid(r2)
            if (r2 != 0) goto L_0x00bc
            miuix.animation.internal.TransitionInfo r2 = r12.info
            miuix.animation.IAnimTarget r2 = r2.target
            r1.setTargetValue(r2)
        L_0x00bc:
            int r8 = r18 + 1
            r7 = r17
            r9 = r19
            goto L_0x003b
        L_0x00c4:
            miuix.animation.utils.LinkNode r1 = r12.remove()
            r12 = r1
            miuix.animation.internal.AnimTask r12 = (miuix.animation.internal.AnimTask) r12
            goto L_0x001a
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.internal.AnimRunnerTask.doAnimationFrame(miuix.animation.internal.AnimTask, long, long, boolean, boolean):void");
    }

    private static double evaluateValue(AnimData animData, float f) {
        TypeEvaluator evaluator = getEvaluator(animData.property);
        return evaluator instanceof IntEvaluator ? ((IntEvaluator) evaluator).evaluate(f, Integer.valueOf((int) animData.startValue), Integer.valueOf((int) animData.targetValue)).doubleValue() : ((FloatEvaluator) evaluator).evaluate(f, Float.valueOf((float) animData.startValue), Float.valueOf((float) animData.targetValue)).doubleValue();
    }

    private static void finishProperty(AnimTask animTask, AnimData animData) {
        animData.setOp((byte) 5);
        animTask.animStats.failCount++;
    }

    private static TypeEvaluator getEvaluator(FloatProperty floatProperty) {
        return (floatProperty != ViewPropertyExt.BACKGROUND || !(floatProperty instanceof ColorProperty)) ? floatProperty instanceof IIntValueProperty ? new IntEvaluator() : new FloatEvaluator() : CommonUtils.sArgbEvaluator;
    }

    private static boolean initAnimation(AnimTask animTask, AnimData animData, long j, long j2) {
        if (!setValues(animData)) {
            if (animData.logEnabled) {
                LogUtils.logThread(CommonUtils.TAG, "StartTask, set start value failed, break, tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", start value = " + animData.startValue + ", target value = " + animData.targetValue + ", value = " + animData.value);
            }
            finishProperty(animTask, animData);
            return false;
        } else if (isValueInvalid(animData)) {
            if (animData.logEnabled) {
                LogUtils.logThread(CommonUtils.TAG, "StartTask, values invalid, break, tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", startValue = " + animData.startValue + ", targetValue = " + animData.targetValue + ", value = " + animData.value + ", velocity = " + animData.velocity);
            }
            animData.reset();
            animData.value = animData.startValue;
            finishProperty(animTask, animData);
            return false;
        } else {
            animData.startTime = j - j2;
            animData.frameCount = 0;
            animData.setOp((byte) 2);
            return true;
        }
    }

    private static boolean isValueInvalid(AnimData animData) {
        return animData.startValue == animData.targetValue && Math.abs(animData.velocity) < 16.66666603088379d;
    }

    private static float regulateProgress(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private static void setStartData(AnimTask animTask, AnimData animData) {
        animData.progress = 0.0d;
        animData.reset();
        if (animData.logEnabled) {
            LogUtils.debug("+++++ start anim, target = " + animTask.info.target + ", tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", op = " + animData.f7487op + ", ease = " + animData.ease + ", delay = " + animData.delay + ", start value = " + animData.startValue + ", target value = " + animData.targetValue + ", value = " + animData.value + ", progress = " + animData.progress + ", velocity = " + animData.velocity, new Object[0]);
        }
    }

    private static boolean setValues(AnimData animData) {
        boolean isInvalid = AnimValueUtils.isInvalid(animData.value);
        double d = animData.startValue;
        if (!isInvalid) {
            if (AnimValueUtils.isInvalid(d)) {
                animData.startValue = animData.value;
            }
            return true;
        } else if (AnimValueUtils.isInvalid(d)) {
            return false;
        } else {
            animData.value = animData.startValue;
            return true;
        }
    }

    static void setup(AnimTask animTask, AnimData animData, TransitionInfo transitionInfo, AnimSpecialConfig animSpecialConfig, long j, long j2) {
        if (AnimValueUtils.isInvalid(animData.startValue)) {
            animData.startValue = AnimValueUtils.getValue(transitionInfo.target, animData.property, animData.startValue);
        }
        long j3 = j - j2;
        animData.initTime = j3;
        AnimStats animStats = animTask.animStats;
        animStats.initCount++;
        if (animData.f7487op != 2 || animData.delay > 0) {
            animData.setOp((byte) 1);
            float fromSpeed = AnimConfigUtils.getFromSpeed(transitionInfo.config, animSpecialConfig);
            if (fromSpeed != Float.MAX_VALUE) {
                animData.velocity = (double) fromSpeed;
                return;
            }
            return;
        }
        animData.startTime = j3;
        animData.delay = 0;
        animStats.startCount--;
        setStartData(animTask, animData);
    }

    static void startAnim(AnimTask animTask, AnimData animData, TransitionInfo transitionInfo, long j, long j2) {
        if (animData.delay > 0) {
            if (animData.logEnabled) {
                LogUtils.debug("StartTask, tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", delay = " + animData.delay + ", initTime = " + animData.initTime + ", totalT = " + j, new Object[0]);
            }
            if (j >= animData.initTime + animData.delay) {
                double value = AnimValueUtils.getValue(transitionInfo.target, animData.property, Double.MAX_VALUE);
                if (value != Double.MAX_VALUE) {
                    animData.startValue = value;
                }
            } else {
                return;
            }
        }
        AnimStats animStats = animTask.animStats;
        animStats.startCount--;
        if (initAnimation(animTask, animData, j, j2)) {
            setStartData(animTask, animData);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void updateAnimation(miuix.animation.internal.AnimTask r15, miuix.animation.internal.AnimData r16, miuix.animation.internal.TransitionInfo r17, long r18, long r20, long r22) {
        /*
            r0 = r15
            r9 = r16
            r1 = r17
            miuix.animation.internal.AnimStats r2 = r0.animStats
            int r3 = r2.updateCount
            r10 = 1
            int r3 = r3 + r10
            r2.updateCount = r3
            int r2 = r9.frameCount
            int r2 = r2 + r10
            r9.frameCount = r2
            miuix.animation.property.FloatProperty r2 = r9.property
            miuix.animation.property.ViewPropertyExt$ForegroundProperty r3 = miuix.animation.property.ViewPropertyExt.FOREGROUND
            if (r2 == r3) goto L_0x0040
            miuix.animation.property.ViewPropertyExt$BackgroundProperty r3 = miuix.animation.property.ViewPropertyExt.BACKGROUND
            if (r2 == r3) goto L_0x0040
            boolean r2 = r2 instanceof miuix.animation.property.ColorProperty
            if (r2 == 0) goto L_0x0021
            goto L_0x0040
        L_0x0021:
            miuix.animation.IAnimTarget r1 = r1.target
            r2 = r16
            r3 = r18
            r5 = r20
            r7 = r22
            miuix.animation.styles.PropertyStyle.doAnimationFrame(r1, r2, r3, r5, r7)
            miuix.animation.utils.EaseManager$EaseStyle r1 = r9.ease
            int r1 = r1.style
            boolean r1 = miuix.animation.utils.EaseManager.isPhysicsStyle(r1)
            if (r1 != 0) goto L_0x0086
            double r1 = r9.progress
            float r1 = (float) r1
            double r1 = evaluateValue(r9, r1)
            goto L_0x0084
        L_0x0040:
            double r11 = r9.startValue
            double r13 = r9.targetValue
            r2 = 0
            r9.startValue = r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9.targetValue = r2
            double r2 = r9.progress
            r9.value = r2
            miuix.animation.IAnimTarget r1 = r1.target
            r2 = r16
            r3 = r18
            r5 = r20
            r7 = r22
            miuix.animation.styles.PropertyStyle.doAnimationFrame(r1, r2, r3, r5, r7)
            double r1 = r9.value
            float r1 = (float) r1
            float r1 = regulateProgress(r1)
            double r1 = (double) r1
            r9.progress = r1
            r9.startValue = r11
            r9.targetValue = r13
            android.animation.ArgbEvaluator r3 = miuix.animation.utils.CommonUtils.sArgbEvaluator
            float r1 = (float) r1
            int r2 = (int) r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            double r4 = r9.targetValue
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r3.evaluate(r1, r2, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            double r1 = r1.doubleValue()
        L_0x0084:
            r9.value = r1
        L_0x0086:
            byte r1 = r9.f7487op
            r2 = 3
            if (r1 != r2) goto L_0x0094
            r9.justEnd = r10
            miuix.animation.internal.AnimStats r1 = r0.animStats
            int r2 = r1.endCount
            int r2 = r2 + r10
            r1.endCount = r2
        L_0x0094:
            boolean r1 = r9.logEnabled
            if (r1 == 0) goto L_0x014d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "----- update anim, target = "
            r1.append(r2)
            miuix.animation.internal.TransitionInfo r2 = r0.info
            miuix.animation.IAnimTarget r2 = r2.target
            r1.append(r2)
            java.lang.String r2 = ", info.id = "
            r1.append(r2)
            miuix.animation.internal.TransitionInfo r2 = r0.info
            int r2 = r2.f7490id
            r1.append(r2)
            java.lang.String r2 = ", tag = "
            r1.append(r2)
            miuix.animation.internal.TransitionInfo r2 = r0.info
            java.lang.Object r2 = r2.key
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            miuix.animation.internal.TransitionInfo r0 = r0.info
            java.lang.Object r0 = r0.key
            int r0 = r0.hashCode()
            r1.append(r0)
            java.lang.String r0 = ", property = "
            r1.append(r0)
            miuix.animation.property.FloatProperty r0 = r9.property
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = ", op = "
            r1.append(r0)
            byte r0 = r9.f7487op
            r1.append(r0)
            java.lang.String r0 = ", justEnd = "
            r1.append(r0)
            boolean r0 = r9.justEnd
            r1.append(r0)
            java.lang.String r0 = ", init time = "
            r1.append(r0)
            long r2 = r9.initTime
            r1.append(r2)
            java.lang.String r0 = ", start time = "
            r1.append(r0)
            long r2 = r9.startTime
            r1.append(r2)
            java.lang.String r0 = ", start value = "
            r1.append(r0)
            double r2 = r9.startValue
            r1.append(r2)
            java.lang.String r0 = ", target value = "
            r1.append(r0)
            double r2 = r9.targetValue
            r1.append(r2)
            java.lang.String r0 = ", value = "
            r1.append(r0)
            double r2 = r9.value
            r1.append(r2)
            java.lang.String r0 = ", progress = "
            r1.append(r0)
            double r2 = r9.progress
            r1.append(r2)
            java.lang.String r0 = ", velocity = "
            r1.append(r0)
            double r2 = r9.velocity
            r1.append(r2)
            java.lang.String r0 = ", delta = "
            r1.append(r0)
            r2 = r20
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            miuix.animation.utils.LogUtils.debug(r0, r1)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.internal.AnimRunnerTask.updateAnimation(miuix.animation.internal.AnimTask, miuix.animation.internal.AnimData, miuix.animation.internal.TransitionInfo, long, long, long):void");
    }
}
