package miuix.animation.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.IAnimTarget;
import miuix.animation.ViewTarget;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.ForegroundColorStyle;
import miuix.animation.utils.LogUtils;

public final class TargetHandler extends Handler {
    public static final int ANIM_MSG_END = 2;
    public static final int ANIM_MSG_REMOVE_WAIT = 3;
    public static final int ANIM_MSG_REPLACED = 5;
    public static final int ANIM_MSG_START_TAG = 0;
    public static final int ANIM_MSG_UPDATE_LISTENER = 4;
    private static final int MASS_UPDATE_THRESHOLD = 40000;
    private final IAnimTarget mTarget;
    private final List<TransitionInfo> mTransList = new ArrayList();
    public final long threadId;

    public TargetHandler(IAnimTarget iAnimTarget) {
        super(Looper.myLooper());
        this.mTarget = iAnimTarget;
        this.threadId = Looper.myLooper().getThread().getId();
    }

    private static void notifyStartOrEnd(TransitionInfo transitionInfo, boolean z) {
        if (transitionInfo.getAnimCount() <= 4000) {
            for (UpdateInfo next : transitionInfo.updateList) {
                if (next.property == ViewPropertyExt.FOREGROUND) {
                    IAnimTarget iAnimTarget = transitionInfo.target;
                    if (z) {
                        ForegroundColorStyle.start(iAnimTarget, next);
                    } else {
                        ForegroundColorStyle.end(iAnimTarget, next);
                    }
                }
            }
        }
    }

    private void onEnd(TransitionInfo transitionInfo, int i) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("<<< onEnd, info.id = " + transitionInfo.f7490id + ", reason = " + i + ", info.key = " + transitionInfo.key + " " + transitionInfo.key.hashCode() + ", info.startTime = " + transitionInfo.startTime + ", target = " + this.mTarget, new Object[0]);
        }
        update(false, transitionInfo);
        notifyStartOrEnd(transitionInfo, false);
        transitionInfo.target.animManager.removePendingRemovedInfo(transitionInfo);
        if (i == 4) {
            transitionInfo.target.getNotifier().notifyCancelAll(transitionInfo.key, transitionInfo.tag);
        } else {
            transitionInfo.target.getNotifier().notifyEndAll(transitionInfo.key, transitionInfo.tag);
        }
        transitionInfo.target.getNotifier().removeListeners(transitionInfo.key);
    }

    private void onReplaced(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("<<< onReplaced, info.id = " + transitionInfo.f7490id + ", info.key = " + transitionInfo.key + " " + transitionInfo.key.hashCode() + ", info.startTime = " + transitionInfo.startTime + ", target = " + this.mTarget, new Object[0]);
        }
        transitionInfo.target.animManager.removePendingRemovedInfo(transitionInfo);
        if (transitionInfo.getAnimCount() <= 4000) {
            this.mTarget.getNotifier().notifyPropertyEnd(transitionInfo.key, transitionInfo.tag, transitionInfo.updateList);
        }
        this.mTarget.getNotifier().notifyCancelAll(transitionInfo.key, transitionInfo.tag);
        this.mTarget.getNotifier().removeListeners(transitionInfo.key);
    }

    private void onStart(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug(">>> onStart, info.id = " + transitionInfo.f7490id + ", info.key = " + transitionInfo.key + ", info.starTime = " + transitionInfo.startTime + ", mRunningInfo.contains = " + transitionInfo.target.animManager.mRunningInfo.contains(transitionInfo) + ", target = " + this.mTarget, new Object[0]);
        }
        transitionInfo.target.getNotifier().addListeners(transitionInfo.key, transitionInfo.config);
        transitionInfo.target.getNotifier().notifyBegin(transitionInfo.key, transitionInfo.tag);
        List<UpdateInfo> list = transitionInfo.updateList;
        if (!list.isEmpty() && list.size() <= 4000) {
            transitionInfo.target.getNotifier().notifyPropertyBegin(transitionInfo.key, transitionInfo.tag, list);
        }
        notifyStartOrEnd(transitionInfo, true);
    }

    private static void setValueAndNotify(IAnimTarget iAnimTarget, Object obj, Object obj2, List<UpdateInfo> list, boolean z) {
        if (!z || (iAnimTarget instanceof ViewTarget)) {
            updateValueAndVelocity(iAnimTarget, list);
        }
        if (list.size() > MASS_UPDATE_THRESHOLD) {
            iAnimTarget.getNotifier().notifyMassUpdate(obj, obj2);
            return;
        }
        iAnimTarget.getNotifier().notifyPropertyEnd(obj, obj2, list);
        iAnimTarget.getNotifier().notifyUpdate(obj, obj2, list);
    }

    private void update(boolean z, TransitionInfo transitionInfo) {
        if (transitionInfo.updateList != null && !transitionInfo.updateList.isEmpty()) {
            if (this.mTarget.shouldCheckValue()) {
                ArrayList arrayList = new ArrayList(transitionInfo.updateList.size());
                for (UpdateInfo next : transitionInfo.updateList) {
                    if (!AnimValueUtils.isInvalid(next.animInfo.value)) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    setValueAndNotify(transitionInfo.target, transitionInfo.key, transitionInfo.tag, arrayList, z);
                    return;
                }
                return;
            }
            setValueAndNotify(transitionInfo.target, transitionInfo.key, transitionInfo.tag, transitionInfo.updateList, z);
        }
    }

    private static void updateValueAndVelocity(IAnimTarget iAnimTarget, List<UpdateInfo> list) {
        for (UpdateInfo next : list) {
            if (!AnimValueUtils.isInvalid(next.animInfo.value)) {
                next.setTargetValue(iAnimTarget);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: miuix.animation.internal.TransitionInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            if (r0 == 0) goto L_0x00ec
            r1 = 2
            r2 = 0
            java.lang.String r3 = ", target "
            java.lang.String r4 = ", obj info = "
            java.lang.String r5 = ", info.id = "
            if (r0 == r1) goto L_0x009c
            r1 = 3
            if (r0 == r1) goto L_0x0092
            r1 = 4
            if (r0 == r1) goto L_0x0069
            r1 = 5
            if (r0 == r1) goto L_0x0019
            goto L_0x00ff
        L_0x0019:
            java.util.Map<java.lang.Integer, miuix.animation.internal.TransitionInfo> r0 = miuix.animation.internal.TransitionInfo.sMap
            int r1 = r8.arg1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.remove(r1)
            miuix.animation.internal.TransitionInfo r0 = (miuix.animation.internal.TransitionInfo) r0
            boolean r1 = miuix.animation.utils.LogUtils.isLogEnabled()
            if (r1 == 0) goto L_0x005b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "<<< handler ANIM_MSG_REPLACED, , info = "
            r1.append(r6)
            r1.append(r0)
            r1.append(r5)
            int r5 = r8.arg1
            r1.append(r5)
            r1.append(r4)
            java.lang.Object r4 = r8.obj
            r1.append(r4)
            r1.append(r3)
            miuix.animation.IAnimTarget r3 = r7.mTarget
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            miuix.animation.utils.LogUtils.debug(r1, r2)
        L_0x005b:
            if (r0 != 0) goto L_0x0062
            java.lang.Object r8 = r8.obj
            r0 = r8
            miuix.animation.internal.TransitionInfo r0 = (miuix.animation.internal.TransitionInfo) r0
        L_0x0062:
            if (r0 == 0) goto L_0x00ff
            r7.onReplaced(r0)
            goto L_0x00ff
        L_0x0069:
            java.util.Map<java.lang.Integer, miuix.animation.internal.TransitionInfo> r0 = miuix.animation.internal.TransitionInfo.sMap
            int r8 = r8.arg1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r0.remove(r8)
            miuix.animation.internal.TransitionInfo r8 = (miuix.animation.internal.TransitionInfo) r8
            if (r8 == 0) goto L_0x00ff
            miuix.animation.IAnimTarget r0 = r7.mTarget
            miuix.animation.listener.ListenerNotifier r0 = r0.getNotifier()
            java.lang.Object r1 = r8.key
            r0.removeListeners(r1)
            miuix.animation.IAnimTarget r0 = r7.mTarget
            miuix.animation.listener.ListenerNotifier r0 = r0.getNotifier()
            java.lang.Object r1 = r8.key
            miuix.animation.base.AnimConfig r8 = r8.config
            r0.addListeners(r1, r8)
            goto L_0x00ff
        L_0x0092:
            miuix.animation.IAnimTarget r8 = r7.mTarget
            miuix.animation.internal.AnimManager r8 = r8.animManager
            java.util.concurrent.ConcurrentLinkedQueue<miuix.animation.internal.TransitionInfo> r8 = r8.mWaitState
            r8.clear()
            goto L_0x00ff
        L_0x009c:
            java.util.Map<java.lang.Integer, miuix.animation.internal.TransitionInfo> r0 = miuix.animation.internal.TransitionInfo.sMap
            int r1 = r8.arg1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.remove(r1)
            miuix.animation.internal.TransitionInfo r0 = (miuix.animation.internal.TransitionInfo) r0
            boolean r1 = miuix.animation.utils.LogUtils.isLogEnabled()
            if (r1 == 0) goto L_0x00de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "<<< handler ANIM_MSG_END, , info = "
            r1.append(r6)
            r1.append(r0)
            r1.append(r5)
            int r5 = r8.arg1
            r1.append(r5)
            r1.append(r4)
            java.lang.Object r4 = r8.obj
            r1.append(r4)
            r1.append(r3)
            miuix.animation.IAnimTarget r3 = r7.mTarget
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            miuix.animation.utils.LogUtils.debug(r1, r2)
        L_0x00de:
            if (r0 != 0) goto L_0x00e4
            java.lang.Object r0 = r8.obj
            miuix.animation.internal.TransitionInfo r0 = (miuix.animation.internal.TransitionInfo) r0
        L_0x00e4:
            if (r0 == 0) goto L_0x00ff
            int r8 = r8.arg2
            r7.onEnd(r0, r8)
            goto L_0x00ff
        L_0x00ec:
            java.util.Map<java.lang.Integer, miuix.animation.internal.TransitionInfo> r0 = miuix.animation.internal.TransitionInfo.sMap
            int r8 = r8.arg1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r0.remove(r8)
            miuix.animation.internal.TransitionInfo r8 = (miuix.animation.internal.TransitionInfo) r8
            if (r8 == 0) goto L_0x00ff
            r7.onStart(r8)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.internal.TargetHandler.handleMessage(android.os.Message):void");
    }

    public boolean isInTargetThread() {
        return Looper.myLooper() == getLooper();
    }

    public void runUpdate(final boolean z) {
        if (Looper.myLooper() != getLooper()) {
            post(new Runnable() {
                public void run() {
                    TargetHandler.this.update(z);
                }
            });
        } else {
            update(z);
        }
    }

    public void update(boolean z) {
        this.mTarget.animManager.getTransitionInfos(this.mTransList);
        for (TransitionInfo update : this.mTransList) {
            update(z, update);
        }
        this.mTransList.clear();
    }
}
