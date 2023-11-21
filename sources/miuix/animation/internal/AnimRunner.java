package miuix.animation.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.physics.AnimationHandler;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

public class AnimRunner implements AnimationHandler.AnimationFrameCallback {
    public static final long MAX_DELTA = 16;
    private static final int MAX_RECORD = 5;
    private static final int MSG_END = 1;
    private static final int MSG_START = 0;
    static volatile Handler sMainHandler;
    public static final RunnerHandler sRunnerHandler;
    private static final HandlerThread sRunnerThread;
    private volatile long mAverageDelta;
    private long[] mDeltaRecord;
    private volatile boolean mIsRunning;
    private long mLastFrameTime;
    private float mRatio;
    private int mRecordCount;

    private static class Holder {
        static final AnimRunner inst = new AnimRunner();

        private Holder() {
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("AnimRunnerThread");
        sRunnerThread = handlerThread;
        createMainHandler(Folme.getLooper());
        handlerThread.start();
        sRunnerHandler = new RunnerHandler(handlerThread.getLooper());
    }

    private AnimRunner() {
        this.mAverageDelta = 16;
        this.mDeltaRecord = new long[]{0, 0, 0, 0, 0};
        this.mRecordCount = 0;
    }

    private long average(long[] jArr) {
        int i = 0;
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
            if (j2 > 0) {
                i++;
            }
        }
        if (i > 0) {
            return j / ((long) i);
        }
        return 0;
    }

    private long calculateAverageDelta(long j) {
        long average = average(this.mDeltaRecord);
        if (average > 0) {
            j = average;
        }
        if (j == 0 || j > 16) {
            j = 16;
        }
        return (long) Math.ceil((double) (((float) j) / this.mRatio));
    }

    public static void createMainHandler(Looper looper) {
        if (looper != null) {
            sMainHandler = new Handler(looper) {
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i == 0) {
                        AnimRunner.startAnimRunner();
                    } else if (i == 1) {
                        AnimRunner.endAnimation();
                    }
                }
            };
        }
    }

    /* access modifiers changed from: private */
    public static void endAnimation() {
        AnimRunner inst = getInst();
        if (inst.mIsRunning) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("AnimRunner.endAnimation", new Object[0]);
            }
            inst.mIsRunning = false;
            AnimationHandler.getInstance().removeCallback(inst);
        }
    }

    public static AnimRunner getInst() {
        return Holder.inst;
    }

    public static Handler getMainHandler() {
        return sMainHandler;
    }

    public static void setThreadPriority(int i) {
        Process.setThreadPriority(sRunnerThread.getThreadId(), i);
    }

    /* access modifiers changed from: private */
    public static void startAnimRunner() {
        AnimRunner inst = getInst();
        if (!inst.mIsRunning) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("AnimRunner.start", new Object[0]);
            }
            inst.mRatio = Folme.getTimeRatio();
            inst.mIsRunning = true;
            AnimationHandler.getInstance().addAnimationFrameCallback(inst, 0);
        }
    }

    private static void updateAnimRunner(Collection<IAnimTarget> collection, boolean z) {
        if (collection.size() == 0) {
            sRunnerHandler.sendEmptyMessage(5);
        }
        for (IAnimTarget next : collection) {
            boolean isAnimRunning = next.animManager.isAnimRunning(new FloatProperty[0]);
            boolean isAnimSetup = next.animManager.isAnimSetup();
            boolean isValidFlag = next.isValidFlag();
            if (isAnimRunning) {
                next.animManager.update(z);
            } else if (!isAnimSetup && !isAnimRunning && next.hasFlags(1) && isValidFlag) {
                Folme.clean(next);
            }
        }
    }

    private void updateRunningTime(long j) {
        long j2 = this.mLastFrameTime;
        long j3 = 0;
        if (j2 != 0) {
            j3 = j - j2;
        }
        this.mLastFrameTime = j;
        int i = this.mRecordCount;
        this.mDeltaRecord[i % 5] = j3;
        this.mRecordCount = i + 1;
        this.mAverageDelta = calculateAverageDelta(j3);
    }

    public void cancel(IAnimTarget iAnimTarget, String... strArr) {
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 4, strArr, (FloatProperty[]) null));
    }

    public void cancel(IAnimTarget iAnimTarget, FloatProperty... floatPropertyArr) {
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 4, (String[]) null, floatPropertyArr));
    }

    public boolean doAnimationFrame(long j) {
        updateRunningTime(j);
        if (this.mIsRunning) {
            Collection<IAnimTarget> targets = Folme.getTargets();
            boolean z = false;
            int i = 0;
            for (IAnimTarget next : targets) {
                if (next.animManager.isAnimRunning(new FloatProperty[0])) {
                    i += next.animManager.getTotalAnimCount();
                }
            }
            if (i > 500) {
                z = true;
            }
            if ((!z && targets.size() > 0) || targets.size() == 0) {
                updateAnimRunner(targets, z);
            }
            RunnerHandler runnerHandler = sRunnerHandler;
            Message obtainMessage = runnerHandler.obtainMessage();
            obtainMessage.what = 3;
            obtainMessage.obj = Boolean.valueOf(z);
            runnerHandler.sendMessage(obtainMessage);
            if (z && targets.size() > 0) {
                updateAnimRunner(targets, z);
            }
        }
        return this.mIsRunning;
    }

    /* access modifiers changed from: package-private */
    public void end() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            endAnimation();
            return;
        }
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.sendEmptyMessage(1);
            return;
        }
        Log.w(CommonUtils.TAG, "AnimRunner.end handler is null! looper: " + Looper.myLooper());
    }

    public void end(IAnimTarget iAnimTarget, String... strArr) {
        if (CommonUtils.isArrayEmpty(strArr)) {
            iAnimTarget.handler.sendEmptyMessage(3);
        }
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 3, strArr, (FloatProperty[]) null));
    }

    public void end(IAnimTarget iAnimTarget, FloatProperty... floatPropertyArr) {
        if (CommonUtils.isArrayEmpty(floatPropertyArr)) {
            iAnimTarget.handler.sendEmptyMessage(3);
        }
        sRunnerHandler.setOperation(new AnimOperationInfo(iAnimTarget, (byte) 3, (String[]) null, floatPropertyArr));
    }

    public long getAverageDelta() {
        return this.mAverageDelta;
    }

    public void run(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        run(new TransitionInfo(iAnimTarget, animState, animState2, animConfigLink));
    }

    public void run(final TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("- AnimManager.run", new Object[0]);
        }
        transitionInfo.target.executeOnInitialized(new Runnable() {
            public void run() {
                TransitionInfo transitionInfo = transitionInfo;
                transitionInfo.target.animManager.startAnim(transitionInfo);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            startAnimRunner();
            return;
        }
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.sendEmptyMessage(0);
            return;
        }
        Log.w(CommonUtils.TAG, "AnimRunner.start handler is null! looper: " + Looper.myLooper());
    }
}
