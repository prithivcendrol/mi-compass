package miuix.animation.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.IAnimTarget;
import miuix.animation.ViewTarget;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.LinkNode;
import miuix.animation.utils.LogUtils;

class RunnerHandler extends Handler {
    public static final int ANIM_MSG_CLEAN = 5;
    public static final int ANIM_MSG_RUNNER_RUN = 3;
    public static final int ANIM_MSG_SETUP = 1;
    public static final int ANIM_MSG_SET_TO = 4;
    public static final int ANIM_MSG_UPDATE = 2;
    private final List<IAnimTarget> mDelList = new ArrayList();
    private int mFrameCount = 0;
    private boolean mIsTaskRunning;
    private long mLastRun = 0;
    private final Map<IAnimTarget, AnimOperationInfo> mOpMap = new ConcurrentHashMap();
    private boolean mRunnerStart;
    private final int[] mSplitInfo = new int[2];
    private boolean mStart;
    private final List<AnimTask> mTaskList = new ArrayList();
    private long mTotalT = 0;
    private final List<TransitionInfo> mTransList = new ArrayList();
    private final Map<IAnimTarget, TransitionInfo> mTransMap = new HashMap();
    private final Set<IAnimTarget> runningTarget = new HashSet();

    private static class SetToInfo {
        AnimState state;
        IAnimTarget target;

        private SetToInfo() {
        }
    }

    public RunnerHandler(Looper looper) {
        super(looper);
    }

    private void addAnimTask(List<TransitionInfo> list, int i, int i2) {
        for (TransitionInfo transitionInfo : list) {
            for (AnimTask next : transitionInfo.animTasks) {
                AnimTask taskOfMinCount = getTaskOfMinCount();
                if (taskOfMinCount == null || (this.mTaskList.size() < i2 && taskOfMinCount.getTotalAnimCount() + next.getAnimCount() > i)) {
                    this.mTaskList.add(next);
                } else {
                    taskOfMinCount.addToTail(next);
                }
            }
        }
    }

    private <T extends LinkNode> void addToMap(IAnimTarget iAnimTarget, T t, Map<IAnimTarget, T> map) {
        LinkNode linkNode = (LinkNode) map.get(iAnimTarget);
        if (linkNode == null) {
            map.put(iAnimTarget, t);
        } else {
            linkNode.addToTail(t);
        }
    }

    private static void doSetOperation(AnimTask animTask, AnimStats animStats, UpdateInfo updateInfo, AnimOperationInfo animOperationInfo) {
        List<FloatProperty> list;
        byte b = updateInfo.animInfo.f7488op;
        if (AnimTask.isRunning(b) && animOperationInfo.f7489op != 0 && (((list = animOperationInfo.propList) == null || list.contains(updateInfo.property)) && AnimTask.isRunning(updateInfo.animInfo.f7488op))) {
            animOperationInfo.usedCount++;
            byte b2 = animOperationInfo.f7489op;
            if (b2 == 3) {
                if (updateInfo.animInfo.targetValue != Double.MAX_VALUE) {
                    AnimInfo animInfo = updateInfo.animInfo;
                    animInfo.value = animInfo.targetValue;
                }
                animTask.animStats.endCount++;
                animStats.endCount++;
            } else if (b2 == 4) {
                animTask.animStats.cancelCount++;
                animStats.cancelCount++;
            }
            updateInfo.setOp(animOperationInfo.f7489op);
            TransitionInfo.decreaseStartCountForDelayAnim(animTask, animStats, updateInfo, b);
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("---- RunnerHandler handleUpdate doSetOperation " + b + " taskInfo " + animTask.info, new Object[0]);
        }
    }

    private void doSetup() {
        for (TransitionInfo next : this.mTransMap.values()) {
            this.runningTarget.add(next.target);
            do {
                next.target.animManager.setupTransition(next);
                next = (TransitionInfo) next.remove();
            } while (next != null);
        }
        this.mTransMap.clear();
        if (!this.mRunnerStart) {
            this.mRunnerStart = true;
            AnimRunner.getInst().start();
        }
    }

    private AnimTask getTaskOfMinCount() {
        AnimTask animTask = null;
        int i = Integer.MAX_VALUE;
        for (AnimTask next : this.mTaskList) {
            int totalAnimCount = next.getTotalAnimCount();
            if (totalAnimCount < i) {
                animTask = next;
                i = totalAnimCount;
            }
        }
        return animTask;
    }

    private int getTotalAnimCount() {
        int i = 0;
        for (IAnimTarget iAnimTarget : this.runningTarget) {
            i += iAnimTarget.animManager.getTotalAnimCount();
        }
        return i;
    }

    private static boolean handleSetTo(AnimTask animTask, AnimStats animStats, UpdateInfo updateInfo) {
        if (!AnimValueUtils.handleSetToValue(updateInfo)) {
            return false;
        }
        if (AnimTask.isRunning(updateInfo.animInfo.f7488op)) {
            animTask.animStats.cancelCount++;
            animStats.cancelCount++;
            updateInfo.setOp((byte) 4);
            TransitionInfo.decreaseStartCountForDelayAnim(animTask, animStats, updateInfo, updateInfo.animInfo.f7488op);
        }
        return true;
    }

    private static void handleUpdate(TransitionInfo transitionInfo, AnimOperationInfo animOperationInfo, AnimStats animStats) {
        boolean contains = transitionInfo.target.animManager.mStartAnim.contains(transitionInfo.key);
        for (AnimTask next : transitionInfo.animTasks) {
            List<UpdateInfo> list = transitionInfo.updateList;
            int i = next.startPos;
            int animCount = next.getAnimCount() + i;
            while (i < animCount) {
                UpdateInfo updateInfo = list.get(i);
                if (updateInfo != null && !handleSetTo(next, animStats, updateInfo) && contains && animOperationInfo != null) {
                    doSetOperation(next, animStats, updateInfo, animOperationInfo);
                }
                i++;
            }
        }
        if (!contains) {
            transitionInfo.target.animManager.mStartAnim.add(transitionInfo.key);
        }
        if (animStats.isRunning() && animStats.updateCount > 0 && transitionInfo.target.animManager.mBeginAnim.add(transitionInfo.key)) {
            TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.f7490id), transitionInfo);
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("---- RunnerHandler handleUpdate ANIM_MSG_START_TAG " + transitionInfo, new Object[0]);
            }
            transitionInfo.target.handler.obtainMessage(0, transitionInfo.f7490id, 0).sendToTarget();
        }
    }

    private boolean isInfoInTransMap(TransitionInfo transitionInfo) {
        T t = this.mTransMap.get(transitionInfo.target);
        while (true) {
            TransitionInfo transitionInfo2 = (TransitionInfo) t;
            if (transitionInfo2 == null) {
                return false;
            }
            if (transitionInfo2 == transitionInfo) {
                return true;
            }
            t = transitionInfo2.next;
        }
    }

    private void onSetTo(SetToInfo setToInfo) {
        boolean z = setToInfo.target instanceof ViewTarget;
        for (Object property : setToInfo.state.keySet()) {
            FloatProperty property2 = setToInfo.state.getProperty(property);
            UpdateInfo updateInfo = setToInfo.target.animManager.mUpdateMap.get(property2);
            if (updateInfo != null) {
                updateInfo.animInfo.setToValue = setToInfo.state.get(setToInfo.target, property2);
                if (!z) {
                    updateInfo.setTargetValue(setToInfo.target);
                }
            }
        }
        if (!setToInfo.target.isAnimRunning(new FloatProperty[0])) {
            setToInfo.target.animManager.mUpdateMap.clear();
        }
    }

    private void runAnim(long j, long j2, boolean z) {
        if (this.runningTarget.isEmpty()) {
            stopAnimRunner();
            return;
        }
        this.mLastRun = j;
        long averageDelta = AnimRunner.getInst().getAverageDelta();
        int i = this.mFrameCount;
        if (i == 1 && j2 > 2 * averageDelta) {
            j2 = averageDelta;
        }
        this.mTotalT += j2;
        this.mFrameCount = i + 1;
        ThreadPoolUtil.getSplitCount(getTotalAnimCount(), this.mSplitInfo);
        int[] iArr = this.mSplitInfo;
        int i2 = iArr[0];
        int i3 = iArr[1];
        for (IAnimTarget iAnimTarget : this.runningTarget) {
            iAnimTarget.animManager.getTransitionInfos(this.mTransList);
        }
        addAnimTask(this.mTransList, i3, i2);
        this.mIsTaskRunning = !this.mTaskList.isEmpty();
        AnimTask.sTaskCount.set(this.mTaskList.size());
        for (AnimTask start : this.mTaskList) {
            start.start(this.mTotalT, j2, z);
        }
        boolean isEmpty = this.mTransList.isEmpty();
        this.mTransList.clear();
        this.mTaskList.clear();
        if (isEmpty && !this.mIsTaskRunning) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("-- runAnim no transList then clean", new Object[0]);
            }
            AnimRunner.sRunnerHandler.sendEmptyMessage(5);
        }
    }

    private boolean setupWaitTrans(IAnimTarget iAnimTarget) {
        TransitionInfo poll = iAnimTarget.animManager.mWaitState.poll();
        if (poll == null) {
            return false;
        }
        addToMap(poll.target, poll, this.mTransMap);
        return true;
    }

    private void stopAnimRunner() {
        if (this.mStart) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("-- stopAnimRunner", "total time = " + this.mTotalT, "frame count = " + this.mFrameCount);
            }
            this.mStart = false;
            this.mRunnerStart = false;
            this.mTotalT = 0;
            this.mFrameCount = 0;
            AnimRunner.getInst().end();
        }
    }

    private void updateAnim() {
        this.mIsTaskRunning = false;
        boolean z = false;
        for (IAnimTarget next : this.runningTarget) {
            if (updateTarget(next, this.mTransList) || setupWaitTrans(next)) {
                z = true;
            } else {
                this.mDelList.add(next);
            }
            this.mTransList.clear();
        }
        this.runningTarget.removeAll(this.mDelList);
        this.mDelList.clear();
        if (!this.mTransMap.isEmpty()) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("- updateAnim->doSetup", new Object[0]);
            }
            doSetup();
            z = true;
        }
        if (!z) {
            stopAnimRunner();
        }
    }

    private boolean updateTarget(IAnimTarget iAnimTarget, List<TransitionInfo> list) {
        AnimOperationInfo animOperationInfo;
        int i;
        int i2;
        int i3;
        int i4;
        IAnimTarget iAnimTarget2 = iAnimTarget;
        iAnimTarget2.animManager.getTransitionInfos(list);
        AnimOperationInfo animOperationInfo2 = this.mOpMap.get(iAnimTarget2);
        char c = 0;
        int i5 = 0;
        int i6 = 0;
        for (TransitionInfo next : list) {
            if (isInfoInTransMap(next)) {
                i6++;
            } else {
                if (animOperationInfo2 == null || next.startTime <= animOperationInfo2.sendTime) {
                    animOperationInfo = animOperationInfo2;
                } else {
                    i5++;
                    animOperationInfo = null;
                }
                AnimStats animStats = next.getAnimStats();
                if (animStats.isStarted()) {
                    handleUpdate(next, animOperationInfo, animStats);
                }
                if (LogUtils.isLogEnabled()) {
                    String str = "---- updateAnim, target = " + iAnimTarget2;
                    Object[] objArr = new Object[7];
                    objArr[c] = "id = " + next.f7490id;
                    objArr[1] = "key = " + next.key;
                    objArr[2] = "useOp = " + animOperationInfo;
                    i2 = 3;
                    objArr[3] = "info.startTime = " + next.startTime;
                    StringBuilder sb = new StringBuilder();
                    sb.append("opInfo.time = ");
                    i = i5;
                    sb.append(animOperationInfo2 != null ? Long.valueOf(animOperationInfo2.sendTime) : null);
                    objArr[4] = sb.toString();
                    objArr[5] = "stats.isRunning = " + animStats.isRunning();
                    objArr[6] = "stats = " + animStats;
                    LogUtils.debug(str, objArr);
                } else {
                    i = i5;
                    i2 = 3;
                }
                if (!animStats.isRunning()) {
                    AnimManager animManager = iAnimTarget2.animManager;
                    if (animStats.cancelCount > animStats.endCount) {
                        i4 = 2;
                        i3 = 4;
                    } else {
                        i3 = i2;
                        i4 = 2;
                    }
                    animManager.notifyTransitionEnd(next, i4, i3);
                } else {
                    i6++;
                }
                i5 = i;
                c = 0;
            }
        }
        if (animOperationInfo2 != null && (i5 == list.size() || animOperationInfo2.isUsed())) {
            this.mOpMap.remove(iAnimTarget2);
        }
        list.clear();
        return i6 > 0;
    }

    public void addSetToState(IAnimTarget iAnimTarget, AnimState animState) {
        SetToInfo setToInfo = new SetToInfo();
        setToInfo.target = iAnimTarget;
        if (animState.isTemporary) {
            AnimState animState2 = new AnimState();
            setToInfo.state = animState2;
            animState2.set(animState);
        } else {
            setToInfo.state = animState;
        }
        obtainMessage(4, setToInfo).sendToTarget();
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            TransitionInfo remove = TransitionInfo.sMap.remove(Integer.valueOf(message.arg1));
            if (remove != null) {
                addToMap(remove.target, remove, this.mTransMap);
                remove.target.animManager.mSetupInfo.remove(Integer.valueOf(remove.f7490id));
                if (!this.mIsTaskRunning) {
                    if (LogUtils.isLogEnabled()) {
                        LogUtils.debug("- ANIM_MSG_SETUP->doSetup", new Object[0]);
                    }
                    doSetup();
                }
            }
        } else if (i == 2) {
            updateAnim();
        } else if (i != 3) {
            if (i == 4) {
                onSetTo((SetToInfo) message.obj);
            } else if (i == 5) {
                this.runningTarget.clear();
                stopAnimRunner();
            }
        } else if (this.mRunnerStart) {
            long currentTimeMillis = System.currentTimeMillis();
            long averageDelta = AnimRunner.getInst().getAverageDelta();
            boolean booleanValue = ((Boolean) message.obj).booleanValue();
            if (!this.mStart) {
                this.mStart = true;
                this.mTotalT = 0;
                this.mFrameCount = 0;
            } else if (!this.mIsTaskRunning) {
                averageDelta = currentTimeMillis - this.mLastRun;
            }
            runAnim(currentTimeMillis, averageDelta, booleanValue);
        }
        message.obj = null;
    }

    public void setOperation(AnimOperationInfo animOperationInfo) {
        if (animOperationInfo.target.isAnimRunning(new FloatProperty[0])) {
            animOperationInfo.sendTime = System.nanoTime();
            this.mOpMap.put(animOperationInfo.target, animOperationInfo);
        }
    }
}
