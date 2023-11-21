package miuix.animation.controller;

import java.lang.reflect.Array;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.IStateStyle;
import miuix.animation.ValueTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.internal.AnimRunner;
import miuix.animation.internal.PredictTask;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;

public class FolmeState implements IFolmeStateStyle {
    AnimConfigLink mConfigLink = new AnimConfigLink();
    private boolean mEnableAnim = true;
    StateManager mStateMgr = new StateManager();
    IAnimTarget mTarget;

    FolmeState(IAnimTarget iAnimTarget) {
        this.mTarget = iAnimTarget;
    }

    private IStateStyle fromTo(Object obj, Object obj2, AnimConfigLink animConfigLink) {
        if (this.mEnableAnim) {
            this.mStateMgr.setup(obj2);
            if (obj != null) {
                setTo(obj);
            }
            AnimState state = getState(obj2);
            this.mStateMgr.addTempConfig(state, animConfigLink);
            AnimRunner.getInst().run(this.mTarget, getState(obj), getState(obj2), animConfigLink);
            this.mStateMgr.clearTempState(state);
            animConfigLink.clear();
        }
        return this;
    }

    private AnimConfigLink getConfigLink() {
        return this.mConfigLink;
    }

    private IStateStyle setTo(final Object obj, final AnimConfigLink animConfigLink) {
        IAnimTarget iAnimTarget = this.mTarget;
        if (iAnimTarget == null) {
            return this;
        }
        if ((obj instanceof Integer) || (obj instanceof Float)) {
            return setTo(obj, animConfigLink);
        }
        iAnimTarget.executeOnInitialized(new Runnable() {
            public void run() {
                AnimState state = FolmeState.this.getState(obj);
                IAnimTarget target = FolmeState.this.getTarget();
                if (LogUtils.isLogEnabled()) {
                    LogUtils.debug("FolmeState.setTo, state = " + state, new Object[0]);
                }
                target.animManager.setTo(state, animConfigLink);
                FolmeState.this.mStateMgr.clearTempState(state);
            }
        });
        return this;
    }

    public IStateStyle add(String str, float f) {
        this.mStateMgr.add(str, f);
        return this;
    }

    public IStateStyle add(String str, float f, long j) {
        this.mStateMgr.add(str, f, j);
        return this;
    }

    public IStateStyle add(String str, int i) {
        this.mStateMgr.add(str, i);
        return this;
    }

    public IStateStyle add(String str, int i, long j) {
        this.mStateMgr.add(str, i, j);
        return this;
    }

    public IStateStyle add(FloatProperty floatProperty, float f) {
        this.mStateMgr.add(floatProperty, f);
        return this;
    }

    public IStateStyle add(FloatProperty floatProperty, float f, long j) {
        this.mStateMgr.add(floatProperty, f, j);
        return this;
    }

    public IStateStyle add(FloatProperty floatProperty, int i) {
        this.mStateMgr.add(floatProperty, i);
        return this;
    }

    public IStateStyle add(FloatProperty floatProperty, int i, long j) {
        this.mStateMgr.add(floatProperty, i, j);
        return this;
    }

    @Deprecated
    public void addConfig(Object obj, AnimConfig... animConfigArr) {
    }

    public IStateStyle addInitProperty(String str, float f) {
        this.mStateMgr.addInitProperty(str, f);
        return this;
    }

    public IStateStyle addInitProperty(String str, int i) {
        this.mStateMgr.addInitProperty(str, i);
        return this;
    }

    public IStateStyle addInitProperty(FloatProperty floatProperty, float f) {
        this.mStateMgr.addInitProperty(floatProperty, f);
        return this;
    }

    public IStateStyle addInitProperty(FloatProperty floatProperty, int i) {
        this.mStateMgr.addInitProperty(floatProperty, i);
        return this;
    }

    public IStateStyle addListener(TransitionListener transitionListener) {
        this.mStateMgr.addListener(transitionListener);
        return this;
    }

    public void addState(AnimState animState) {
        this.mStateMgr.addState(animState);
    }

    public IStateStyle autoSetTo(Object... objArr) {
        return this;
    }

    public void cancel() {
        AnimRunner.getInst().cancel(this.mTarget, (FloatProperty[]) null);
    }

    public void cancel(String... strArr) {
        IAnimTarget target = getTarget();
        if (strArr.length != 0 && (target instanceof ValueTarget)) {
            AnimRunner.getInst().cancel(this.mTarget, strArr);
        }
    }

    public void cancel(FloatProperty... floatPropertyArr) {
        AnimRunner.getInst().cancel(this.mTarget, floatPropertyArr);
    }

    public void clean() {
        cancel();
    }

    public void enableDefaultAnim(boolean z) {
        this.mEnableAnim = z;
    }

    public void end(Object... objArr) {
        if (objArr.length <= 0) {
            return;
        }
        if (objArr[0] instanceof FloatProperty) {
            FloatProperty[] floatPropertyArr = new FloatProperty[objArr.length];
            System.arraycopy(objArr, 0, floatPropertyArr, 0, objArr.length);
            AnimRunner.getInst().end(this.mTarget, floatPropertyArr);
            return;
        }
        String[] strArr = new String[objArr.length];
        System.arraycopy(objArr, 0, strArr, 0, objArr.length);
        AnimRunner.getInst().end(this.mTarget, strArr);
    }

    public IStateStyle fromTo(Object obj, Object obj2, AnimConfig... animConfigArr) {
        AnimConfigLink configLink = getConfigLink();
        for (AnimConfig add : animConfigArr) {
            configLink.add(add, new boolean[0]);
        }
        return fromTo(obj, obj2, configLink);
    }

    public AnimState getCurrentState() {
        return this.mStateMgr.getCurrentState();
    }

    public float getPredictFriction(FloatProperty floatProperty, float f) {
        float velocity = (float) this.mTarget.getVelocity(floatProperty);
        if (velocity == 0.0f) {
            return -1.0f;
        }
        return Folme.getPredictFriction(this.mTarget.getValue(floatProperty), f, velocity, Math.signum(velocity) * ((float) Folme.getTarget(this.mTarget).getThresholdVelocity(floatProperty)));
    }

    public float getPredictValue(FloatProperty floatProperty, float... fArr) {
        float predictDistance;
        float velocity = (float) this.mTarget.getVelocity(floatProperty);
        float value = this.mTarget.getValue(floatProperty);
        float thresholdVelocity = (float) Folme.getTarget(this.mTarget).getThresholdVelocity(floatProperty);
        if (velocity != 0.0f) {
            thresholdVelocity = Math.abs(thresholdVelocity) * Math.signum(velocity);
        }
        if (fArr == null || fArr.length == 0) {
            predictDistance = Folme.getPredictDistance(velocity, thresholdVelocity);
        } else {
            predictDistance = Folme.getPredictDistanceWithFriction(velocity, fArr[0], thresholdVelocity);
        }
        return value + predictDistance;
    }

    public AnimState getState(Object obj) {
        return this.mStateMgr.getState(obj);
    }

    public IAnimTarget getTarget() {
        return this.mTarget;
    }

    public long predictDuration(Object... objArr) {
        IAnimTarget target = getTarget();
        AnimConfigLink configLink = getConfigLink();
        AnimState toState = this.mStateMgr.getToState(target, configLink, objArr);
        long predictDuration = PredictTask.predictDuration(target, (AnimState) null, toState, configLink);
        this.mStateMgr.clearTempState(toState);
        configLink.clear();
        return predictDuration;
    }

    public IStateStyle removeListener(TransitionListener transitionListener) {
        this.mStateMgr.removeListener(transitionListener);
        return this;
    }

    public IStateStyle set(Object obj) {
        this.mStateMgr.setup(obj);
        return this;
    }

    @Deprecated
    public IStateStyle setConfig(AnimConfig animConfig, FloatProperty... floatPropertyArr) {
        return this;
    }

    public IStateStyle setEase(int i, float... fArr) {
        this.mStateMgr.setEase(i, fArr);
        return this;
    }

    public IStateStyle setEase(FloatProperty floatProperty, int i, float... fArr) {
        this.mStateMgr.setEase(floatProperty, i, fArr);
        return this;
    }

    public IStateStyle setEase(EaseManager.EaseStyle easeStyle, FloatProperty... floatPropertyArr) {
        this.mStateMgr.setEase(easeStyle, floatPropertyArr);
        return this;
    }

    public IStateStyle setFlags(long j) {
        getTarget().setFlags(j);
        return this;
    }

    public IStateStyle setTo(Object obj) {
        return setTo(obj, new AnimConfig[0]);
    }

    public IStateStyle setTo(Object obj, AnimConfig... animConfigArr) {
        return setTo(obj, AnimConfigLink.linkConfig(animConfigArr));
    }

    public IStateStyle setTo(Object... objArr) {
        AnimConfigLink configLink = getConfigLink();
        setTo((Object) this.mStateMgr.getSetToState(getTarget(), configLink, objArr), configLink);
        return this;
    }

    public IStateStyle setTransitionFlags(long j, FloatProperty... floatPropertyArr) {
        StateManager stateManager = this.mStateMgr;
        stateManager.setTransitionFlags(stateManager.getCurrentState(), j, floatPropertyArr);
        return this;
    }

    public IStateStyle setup(Object obj) {
        this.mStateMgr.setup(obj);
        return this;
    }

    public IStateStyle then(Object obj, AnimConfig... animConfigArr) {
        this.mStateMgr.setStateFlags(obj, 1);
        return mo6815to(obj, animConfigArr);
    }

    public IStateStyle then(Object... objArr) {
        AnimConfig animConfig = new AnimConfig();
        AnimState state = getState(objArr);
        state.flags = 1;
        return mo6815to(state, animConfig);
    }

    /* renamed from: to */
    public IStateStyle mo6815to(Object obj, AnimConfig... animConfigArr) {
        if ((obj instanceof AnimState) || this.mStateMgr.hasState(obj)) {
            return fromTo((Object) null, (Object) getState(obj), animConfigArr);
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            Object[] objArr = new Object[(animConfigArr.length + length)];
            System.arraycopy(obj, 0, objArr, 0, length);
            System.arraycopy(animConfigArr, 0, objArr, length, animConfigArr.length);
            return mo6816to(objArr);
        }
        return mo6816to(obj, animConfigArr);
    }

    /* renamed from: to */
    public IStateStyle mo6816to(Object... objArr) {
        return fromTo((Object) null, (Object) this.mStateMgr.getToState(getTarget(), getConfigLink(), objArr), new AnimConfig[0]);
    }

    /* renamed from: to */
    public IStateStyle mo6817to(AnimConfig... animConfigArr) {
        return mo6815to(getCurrentState(), animConfigArr);
    }
}
