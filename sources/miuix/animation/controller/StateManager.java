package miuix.animation.controller;

import android.util.ArrayMap;
import java.util.Map;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.EaseManager;

class StateManager {
    static final String TAG_AUTO_SET_TO = "autoSetTo";
    static final String TAG_SET_TO = "defaultSetTo";
    static final String TAG_TO = "defaultTo";
    final AnimState mAutoSetToState = new AnimState(TAG_AUTO_SET_TO, true);
    Object mCurTag;
    final AnimState mSetToState = new AnimState(TAG_SET_TO, true);
    StateHelper mStateHelper = new StateHelper();
    final Map<Object, AnimState> mStateMap = new ArrayMap();
    final AnimState mToState = new AnimState(TAG_TO, true);

    StateManager() {
    }

    private AnimState getState(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof AnimState) {
            return (AnimState) obj;
        }
        AnimState animState = this.mStateMap.get(obj);
        if (animState != null || !z) {
            return animState;
        }
        AnimState animState2 = new AnimState(obj);
        addState(animState2);
        return animState2;
    }

    private AnimState getStateByArgs(Object obj, Object... objArr) {
        AnimState animState;
        if (objArr.length > 0) {
            animState = getState(objArr[0], false);
            if (animState == null) {
                animState = getStateByName(objArr);
            }
        } else {
            animState = null;
        }
        return animState == null ? getState(obj) : animState;
    }

    private AnimState getStateByName(Object... objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr.length > 1 ? objArr[1] : null;
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return null;
        }
        return getState(obj, true);
    }

    private void setAnimState(IAnimTarget iAnimTarget, AnimState animState, AnimConfigLink animConfigLink, Object... objArr) {
        this.mStateHelper.parse(iAnimTarget, animState, animConfigLink, objArr);
    }

    public void add(String str, float f) {
        getCurrentState().add(str, (double) f);
    }

    public void add(String str, float f, long j) {
        AnimState currentState = getCurrentState();
        currentState.setConfigFlag(str, j);
        currentState.add(str, (double) f);
    }

    public void add(String str, int i) {
        getCurrentState().add(str, (double) i);
    }

    public void add(String str, int i, long j) {
        AnimState currentState = getCurrentState();
        currentState.setConfigFlag(str, j);
        currentState.add(str, (double) i);
    }

    public void add(FloatProperty floatProperty, float f) {
        getCurrentState().add(floatProperty, (double) f);
    }

    public void add(FloatProperty floatProperty, float f, long j) {
        AnimState currentState = getCurrentState();
        currentState.setConfigFlag(floatProperty, j);
        currentState.add(floatProperty, (double) f);
    }

    public void add(FloatProperty floatProperty, int i) {
        getCurrentState().add(floatProperty, (double) i);
    }

    public void add(FloatProperty floatProperty, int i, long j) {
        AnimState currentState = getCurrentState();
        currentState.setConfigFlag(floatProperty, j);
        currentState.add(floatProperty, (double) i);
    }

    public void addInitProperty(String str, float f) {
        add(str, f, 2);
    }

    public void addInitProperty(String str, int i) {
        add(str, i, 2);
    }

    public void addInitProperty(FloatProperty floatProperty, float f) {
        add(floatProperty, f, 2);
    }

    public void addInitProperty(FloatProperty floatProperty, int i) {
        add(floatProperty, i, 2);
    }

    public void addListener(TransitionListener transitionListener) {
        getCurrentState().getConfig().addListeners(transitionListener);
    }

    public void addState(AnimState animState) {
        this.mStateMap.put(animState.getTag(), animState);
    }

    public void addTempConfig(AnimState animState, AnimConfigLink animConfigLink) {
        AnimState animState2 = this.mToState;
        if (animState != animState2) {
            animConfigLink.add(animState2.getConfig(), new boolean[0]);
        }
    }

    public void clear() {
        this.mStateMap.clear();
    }

    public void clearTempState(AnimState animState) {
        if (animState == this.mToState || animState == this.mSetToState) {
            animState.clear();
        }
    }

    public AnimState getCurrentState() {
        if (this.mCurTag == null) {
            this.mCurTag = this.mToState;
        }
        return getState(this.mCurTag);
    }

    public AnimState getSetToState(IAnimTarget iAnimTarget, AnimConfigLink animConfigLink, Object... objArr) {
        AnimState stateByArgs = getStateByArgs(this.mSetToState, objArr);
        setAnimState(iAnimTarget, stateByArgs, animConfigLink, objArr);
        return stateByArgs;
    }

    public AnimState getState(Object obj) {
        return getState(obj, true);
    }

    public AnimState getToState(IAnimTarget iAnimTarget, AnimConfigLink animConfigLink, Object... objArr) {
        AnimState stateByArgs = getStateByArgs(getCurrentState(), objArr);
        setAnimState(iAnimTarget, stateByArgs, animConfigLink, objArr);
        return stateByArgs;
    }

    public boolean hasState(Object obj) {
        return this.mStateMap.containsKey(obj);
    }

    public void removeListener(TransitionListener transitionListener) {
        getCurrentState().getConfig().removeListeners(transitionListener);
    }

    public void setEase(int i, float... fArr) {
        getCurrentState().getConfig().setEase(i, fArr);
    }

    public void setEase(FloatProperty floatProperty, int i, float... fArr) {
        getCurrentState().getConfig().setSpecial(floatProperty, (long) i, fArr);
    }

    public void setEase(EaseManager.EaseStyle easeStyle, FloatProperty... floatPropertyArr) {
        AnimConfig config = getCurrentState().getConfig();
        if (floatPropertyArr.length == 0) {
            config.setEase(easeStyle);
            return;
        }
        for (FloatProperty special : floatPropertyArr) {
            config.setSpecial(special, easeStyle, new float[0]);
        }
    }

    public void setStateFlags(Object obj, long j) {
        getState(obj).flags = j;
    }

    public void setTransitionFlags(Object obj, long j, FloatProperty... floatPropertyArr) {
        AnimConfig config = getState(obj).getConfig();
        if (floatPropertyArr.length == 0) {
            config.flags = j;
            return;
        }
        for (FloatProperty floatProperty : floatPropertyArr) {
            AnimSpecialConfig specialConfig = config.getSpecialConfig(floatProperty);
            if (specialConfig == null) {
                specialConfig = new AnimSpecialConfig();
                config.setSpecial(floatProperty, specialConfig);
            }
            specialConfig.flags = j;
        }
    }

    public AnimState setup(Object obj) {
        AnimState animState;
        if (obj instanceof AnimState) {
            animState = (AnimState) obj;
        } else {
            AnimState animState2 = this.mStateMap.get(obj);
            if (animState2 == null) {
                animState2 = new AnimState(obj);
                addState(animState2);
            }
            animState = animState2;
        }
        this.mCurTag = animState;
        return animState;
    }
}
