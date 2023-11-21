package miuix.animation.internal;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.internal.TransitionInfo;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

public class AnimManager implements TransitionInfo.IUpdateInfoCreator {
    final Set<Object> mBeginAnim = new HashSet();
    final ConcurrentHashMap<Object, TransitionInfo> mPendingRemovedInfo = new ConcurrentHashMap<>();
    final ConcurrentHashMap<Object, TransitionInfo> mRunningInfo = new ConcurrentHashMap<>();
    final ConcurrentHashMap<Integer, Object> mSetupInfo = new ConcurrentHashMap<>();
    final Set<Object> mStartAnim = new HashSet();
    IAnimTarget mTarget;
    private List<UpdateInfo> mUpdateList;
    final ConcurrentHashMap<FloatProperty, UpdateInfo> mUpdateMap = new ConcurrentHashMap<>();
    final ConcurrentLinkedQueue<TransitionInfo> mWaitState = new ConcurrentLinkedQueue<>();

    private void clearRunningInfo() {
        for (TransitionInfo transitionInfo : this.mRunningInfo.values()) {
            TransitionInfo.sMap.remove(Integer.valueOf(transitionInfo.f7490id));
        }
        this.mRunningInfo.clear();
    }

    private boolean containProperties(TransitionInfo transitionInfo, FloatProperty... floatPropertyArr) {
        for (FloatProperty containsProperty : floatPropertyArr) {
            if (transitionInfo.containsProperty(containsProperty)) {
                return true;
            }
        }
        return false;
    }

    private boolean pendState(TransitionInfo transitionInfo) {
        if (!CommonUtils.hasFlags(transitionInfo.f7491to.flags, 1)) {
            return false;
        }
        this.mWaitState.add(transitionInfo);
        return true;
    }

    private void removeSameAnim(TransitionInfo transitionInfo) {
        for (TransitionInfo next : this.mRunningInfo.values()) {
            if (next != transitionInfo) {
                List<UpdateInfo> list = next.updateList;
                if (this.mUpdateList == null) {
                    this.mUpdateList = new ArrayList();
                }
                for (UpdateInfo next2 : list) {
                    if (!transitionInfo.f7491to.contains(next2.property)) {
                        this.mUpdateList.add(next2);
                    }
                }
                if (this.mUpdateList.isEmpty()) {
                    if (next.f7490id != transitionInfo.f7490id) {
                        notifyTransitionEnd(next, 5, 4);
                    }
                } else if (this.mUpdateList.size() != next.updateList.size()) {
                    next.updateList = this.mUpdateList;
                    this.mUpdateList = null;
                    next.setupTasks(false);
                } else {
                    this.mUpdateList.clear();
                }
            }
        }
    }

    private void setTargetValue(AnimState animState, AnimConfigLink animConfigLink) {
        for (Object tempProperty : animState.keySet()) {
            FloatProperty tempProperty2 = animState.getTempProperty(tempProperty);
            double d = animState.get(this.mTarget, tempProperty2);
            UpdateInfo updateInfo = this.mTarget.animManager.mUpdateMap.get(tempProperty2);
            if (updateInfo != null) {
                updateInfo.animInfo.setToValue = d;
            }
            if (tempProperty2 instanceof IIntValueProperty) {
                this.mTarget.setIntValue((IIntValueProperty) tempProperty2, (int) d);
            } else {
                this.mTarget.setValue(tempProperty2, (float) d);
            }
            this.mTarget.trackVelocity(tempProperty2, d);
        }
        this.mTarget.setToNotify(animState, animConfigLink);
    }

    public void clear() {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("- AnimManager.clear() " + Log.getStackTraceString(new Throwable()), new Object[0]);
        }
        this.mStartAnim.clear();
        this.mBeginAnim.clear();
        this.mUpdateMap.clear();
        clearRunningInfo();
        this.mPendingRemovedInfo.clear();
        this.mWaitState.clear();
        this.mSetupInfo.clear();
    }

    public int getTotalAnimCount() {
        int i = 0;
        for (TransitionInfo animCount : this.mRunningInfo.values()) {
            i += animCount.getAnimCount();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void getTransitionInfos(List<TransitionInfo> list) {
        for (TransitionInfo next : this.mRunningInfo.values()) {
            if (next.updateList != null && !next.updateList.isEmpty()) {
                list.add(next);
            }
        }
    }

    public UpdateInfo getUpdateInfo(FloatProperty floatProperty) {
        UpdateInfo updateInfo = this.mUpdateMap.get(floatProperty);
        if (updateInfo != null) {
            return updateInfo;
        }
        UpdateInfo updateInfo2 = new UpdateInfo(floatProperty);
        UpdateInfo putIfAbsent = this.mUpdateMap.putIfAbsent(floatProperty, updateInfo2);
        return putIfAbsent != null ? putIfAbsent : updateInfo2;
    }

    public double getVelocity(FloatProperty floatProperty) {
        return getUpdateInfo(floatProperty).velocity;
    }

    public boolean isAnimRunning(FloatProperty... floatPropertyArr) {
        if (CommonUtils.isArrayEmpty(floatPropertyArr) && (!this.mRunningInfo.isEmpty() || !this.mWaitState.isEmpty())) {
            return true;
        }
        for (TransitionInfo containProperties : this.mRunningInfo.values()) {
            if (containProperties(containProperties, floatPropertyArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAnimSetup() {
        return !this.mSetupInfo.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void notifyTransitionEnd(TransitionInfo transitionInfo, int i, int i2) {
        if (this.mStartAnim.remove(transitionInfo.key)) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("-- notifyTransitionEnd 0, msg = " + i + ", info = " + transitionInfo, new Object[0]);
            }
            this.mBeginAnim.remove(transitionInfo.key);
            removeRunningInfo(transitionInfo, true);
            TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.f7490id), transitionInfo);
            this.mTarget.handler.obtainMessage(i, transitionInfo.f7490id, i2, transitionInfo).sendToTarget();
            return;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("-- notifyTransitionEnd 1, msg = " + i + ", info = " + transitionInfo, new Object[0]);
        }
        removeRunningInfo(transitionInfo, false);
    }

    /* access modifiers changed from: package-private */
    public boolean removePendingRemovedInfo(TransitionInfo transitionInfo) {
        boolean z;
        TransitionInfo transitionInfo2 = this.mPendingRemovedInfo.get(transitionInfo.key);
        if (transitionInfo2 == null || transitionInfo2.f7490id != transitionInfo.f7490id) {
            z = false;
        } else {
            this.mPendingRemovedInfo.remove(transitionInfo2.key);
            z = true;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("----- removePendingRemovedInfo", "removed = " + z, "id = " + transitionInfo.f7490id, "key = " + transitionInfo.key + " " + transitionInfo.key.hashCode(), "mRunningInfo.size = " + this.mRunningInfo.size(), "info.startTime = " + transitionInfo.startTime, "pendingInfo = " + transitionInfo2);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean removeRunningInfo(TransitionInfo transitionInfo, boolean z) {
        boolean z2;
        TransitionInfo transitionInfo2 = this.mRunningInfo.get(transitionInfo.key);
        if (transitionInfo2 == null || transitionInfo2.f7490id != transitionInfo.f7490id) {
            z2 = false;
        } else {
            this.mRunningInfo.remove(transitionInfo.key);
            if (z) {
                this.mPendingRemovedInfo.put(transitionInfo.key, transitionInfo2);
            }
            z2 = true;
        }
        boolean isAnimRunning = isAnimRunning(new FloatProperty[0]);
        if (!isAnimRunning) {
            this.mUpdateMap.clear();
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("----- removeRunningInfo, pending = " + z, "removed = " + z2, "id = " + transitionInfo.f7490id, "key = " + transitionInfo.key + " " + transitionInfo.key.hashCode(), "mRunningInfo.size = " + this.mRunningInfo.size(), "info.startTime = " + transitionInfo.startTime, "isAnimRunning = " + isAnimRunning, "target = " + this.mTarget);
            if (this.mRunningInfo.size() > 0) {
                for (TransitionInfo transitionInfo3 : this.mRunningInfo.values()) {
                    LogUtils.debug("------ after remove resetRunInfo = " + transitionInfo3, new Object[0]);
                }
            }
        }
        return z2;
    }

    public void setTarget(IAnimTarget iAnimTarget) {
        this.mTarget = iAnimTarget;
    }

    public void setTo(AnimState animState, AnimConfigLink animConfigLink) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("setTo, target = " + this.mTarget, "to = " + animState);
        }
        if (animState.keySet().size() > 150) {
            AnimRunner.sRunnerHandler.addSetToState(this.mTarget, animState);
        } else {
            setTargetValue(animState, animConfigLink);
        }
    }

    public void setVelocity(FloatProperty floatProperty, float f) {
        getUpdateInfo(floatProperty).velocity = (double) f;
    }

    /* access modifiers changed from: package-private */
    public void setupTransition(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("-- setupTransition " + transitionInfo, new Object[0]);
        }
        this.mRunningInfo.put(transitionInfo.key, transitionInfo);
        transitionInfo.initUpdateList(this);
        transitionInfo.setupTasks(true);
        removeSameAnim(transitionInfo);
        boolean contains = transitionInfo.target.animManager.mStartAnim.contains(transitionInfo.key);
        if (!transitionInfo.config.listeners.isEmpty() && contains) {
            TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.f7490id), transitionInfo);
            transitionInfo.target.handler.obtainMessage(4, transitionInfo.f7490id, 0, transitionInfo).sendToTarget();
        }
    }

    public void startAnim(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("- AnimManager.startAnim ", new Object[0]);
        }
        if (pendState(transitionInfo)) {
            LogUtils.debug(this + ".startAnim, pendState", new Object[0]);
            return;
        }
        TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.f7490id), transitionInfo);
        this.mSetupInfo.put(Integer.valueOf(transitionInfo.f7490id), transitionInfo);
        AnimRunner.sRunnerHandler.obtainMessage(1, transitionInfo.f7490id, 0).sendToTarget();
    }

    public void update(boolean z) {
        this.mTarget.handler.runUpdate(z);
    }
}
