package miuix.animation;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import miuix.animation.controller.FolmeBlink;
import miuix.animation.controller.FolmeFont;
import miuix.animation.controller.FolmeHover;
import miuix.animation.controller.FolmeTouch;
import miuix.animation.controller.FolmeVisible;
import miuix.animation.controller.ListViewTouchListener;
import miuix.animation.controller.StateComposer;
import miuix.animation.internal.AnimRunner;
import miuix.animation.internal.ThreadPoolUtil;
import miuix.animation.physics.AnimationHandler;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;
import miuix.animation.utils.ObjectPool;
import p142y2.C2945b;

public class Folme {
    private static final float DEFALUT_FRICTION = 0.4761905f;
    private static float DEFAULT_THRESHOLD_VELOCITY = 12.5f;
    private static final long DELAY_TIME = 20000;
    private static final long DELAY_TIME_MSG_TARGET_CLEAN_DIE_MUCH = 1000;
    private static final long DELAY_TIME_MSG_TARGET_CLEAN_UI_FREE = 20000;
    private static final int MSG_TARGET = 1;
    private static final int MSG_TARGET_CLEAN_DIE_MUCH = 2;
    private static final int MSG_TARGET_CLEAN_UI_FREE = 1;
    private static final long THRESHOLD_LIMIT = 1024;
    private static final double USE_PHY_MIN_VELOCITY = 1000.0d;
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<IAnimTarget, FolmeImpl> sImplMap = new ConcurrentHashMap<>();
    private static volatile Handler sMainHandler;
    private static Looper sRunLooper;
    private static AtomicReference<Float> sTimeRatio = new AtomicReference<>(Float.valueOf(1.0f));

    private static class FolmeImpl implements IFolme {
        private IBlinkStyle mBlink;
        private IHoverStyle mHover;
        private IStateStyle mState;
        private IAnimTarget[] mTargets;
        private ITouchStyle mTouch;
        private IVisibleStyle mVisible;

        private FolmeImpl(IAnimTarget... iAnimTargetArr) {
            this.mTargets = iAnimTargetArr;
            Folme.sendToTargetMessage(false);
            Folme.performTargetCleanForTooMuchInvalid();
        }

        public IBlinkStyle blink() {
            if (this.mBlink == null) {
                this.mBlink = new FolmeBlink(this.mTargets);
            }
            return this.mBlink;
        }

        /* access modifiers changed from: package-private */
        public void clean() {
            ITouchStyle iTouchStyle = this.mTouch;
            if (iTouchStyle != null) {
                iTouchStyle.clean();
            }
            IVisibleStyle iVisibleStyle = this.mVisible;
            if (iVisibleStyle != null) {
                iVisibleStyle.clean();
            }
            IStateStyle iStateStyle = this.mState;
            if (iStateStyle != null) {
                iStateStyle.clean();
            }
            IHoverStyle iHoverStyle = this.mHover;
            if (iHoverStyle != null) {
                iHoverStyle.clean();
            }
        }

        /* access modifiers changed from: package-private */
        public void end() {
            ITouchStyle iTouchStyle = this.mTouch;
            if (iTouchStyle != null) {
                iTouchStyle.end(new Object[0]);
            }
            IVisibleStyle iVisibleStyle = this.mVisible;
            if (iVisibleStyle != null) {
                iVisibleStyle.end(new Object[0]);
            }
            IStateStyle iStateStyle = this.mState;
            if (iStateStyle != null) {
                iStateStyle.end(new Object[0]);
            }
            IHoverStyle iHoverStyle = this.mHover;
            if (iHoverStyle != null) {
                iHoverStyle.end(new Object[0]);
            }
        }

        public IHoverStyle hover() {
            if (this.mHover == null) {
                this.mHover = new FolmeHover(this.mTargets);
            }
            return this.mHover;
        }

        public IStateStyle state() {
            if (this.mState == null) {
                this.mState = StateComposer.composeStyle(this.mTargets);
            }
            return this.mState;
        }

        public ITouchStyle touch() {
            if (this.mTouch == null) {
                FolmeTouch folmeTouch = new FolmeTouch(this.mTargets);
                folmeTouch.setFontStyle(new FolmeFont());
                this.mTouch = folmeTouch;
            }
            return this.mTouch;
        }

        public IVisibleStyle visible() {
            if (this.mVisible == null) {
                this.mVisible = new FolmeVisible(this.mTargets);
            }
            return this.mVisible;
        }
    }

    public interface FontType {
        public static final int MITYPE = 1;
        public static final int MITYPE_MONO = 2;
        public static final int MIUI = 0;
    }

    public interface FontWeight {
        public static final int BOLD = 8;
        public static final int DEMI_BOLD = 6;
        public static final int EXTRA_LIGHT = 1;
        public static final int HEAVY = 9;
        public static final int LIGHT = 2;
        public static final int MEDIUM = 5;
        public static final int NORMAL = 3;
        public static final int REGULAR = 4;
        public static final int SEMI_BOLD = 7;
        public static final int THIN = 0;
    }

    static {
        ThreadPoolUtil.post(new Runnable() {
            public void run() {
                LogUtils.getLogEnableInfo();
            }
        });
        Looper mainLooper = Looper.getMainLooper();
        sRunLooper = mainLooper;
        createMainHandler(mainLooper);
    }

    public static float afterFrictionValue(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = f >= 0.0f ? 1.0f : -1.0f;
        float min = Math.min(Math.abs(f) / f2, 1.0f);
        float f4 = min * min;
        return f3 * ((((f4 * min) / 3.0f) - f4) + min) * f2;
    }

    @SafeVarargs
    public static <T> void clean(T... tArr) {
        if (CommonUtils.isArrayEmpty(tArr)) {
            for (IAnimTarget cleanAnimTarget : sImplMap.keySet()) {
                cleanAnimTarget(cleanAnimTarget);
            }
            return;
        }
        for (T doClean : tArr) {
            doClean(doClean);
        }
    }

    private static void cleanAnimTarget(IAnimTarget iAnimTarget) {
        if (iAnimTarget != null) {
            iAnimTarget.clean();
            FolmeImpl remove = sImplMap.remove(iAnimTarget);
            iAnimTarget.animManager.clear();
            iAnimTarget.getNotifier().removeListeners();
            if (remove != null) {
                remove.clean();
            }
        }
    }

    /* access modifiers changed from: private */
    public static void clearInvalidTargets(List<IAnimTarget> list) {
        for (IAnimTarget next : list) {
            if (!next.isValid() && !next.animManager.isAnimRunning(new FloatProperty[0]) && !next.animManager.isAnimSetup() && next.isValidFlag()) {
                clean(next);
            }
        }
    }

    private static void clearTargetMessage(int i) {
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.removeMessages(i);
        }
    }

    /* access modifiers changed from: private */
    public static void clearTargets() {
        for (IAnimTarget next : sImplMap.keySet()) {
            if (!next.isValid() || (next.hasFlags(1) && !next.animManager.isAnimRunning(new FloatProperty[0]) && !next.animManager.isAnimSetup() && next.isValidFlag())) {
                clean(next);
            }
        }
    }

    private static void createMainHandler(Looper looper) {
        if (looper != null) {
            sMainHandler = new Handler(looper) {
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i == 1) {
                        Folme.clearTargets();
                        Folme.sendToTargetMessage(true);
                    } else if (i == 2) {
                        Folme.clearInvalidTargets((List) message.obj);
                    }
                }
            };
        }
    }

    private static <T> void doClean(T t) {
        cleanAnimTarget(getTarget(t, (ITargetCreator) null));
    }

    public static <T> void end(T... tArr) {
        FolmeImpl folmeImpl;
        for (T target : tArr) {
            IAnimTarget target2 = getTarget(target, (ITargetCreator) null);
            if (!(target2 == null || (folmeImpl = sImplMap.get(target2)) == null)) {
                folmeImpl.end();
            }
        }
    }

    private static FolmeImpl fillTargetArrayAndGetImpl(View[] viewArr, IAnimTarget[] iAnimTargetArr) {
        FolmeImpl folmeImpl = null;
        boolean z = false;
        for (int i = 0; i < viewArr.length; i++) {
            IAnimTarget target = getTarget(viewArr[i], ViewTarget.sCreator);
            iAnimTargetArr[i] = target;
            FolmeImpl folmeImpl2 = sImplMap.get(target);
            if (folmeImpl == null) {
                folmeImpl = folmeImpl2;
            } else if (folmeImpl != folmeImpl2) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        return folmeImpl;
    }

    public static float getDefaultThresholdVelocity() {
        return DEFAULT_THRESHOLD_VELOCITY;
    }

    public static Looper getLooper() {
        if (sRunLooper == null) {
            sRunLooper = Looper.getMainLooper();
        }
        return sRunLooper;
    }

    public static Handler getMainHandler() {
        return sMainHandler;
    }

    private static float getPredict(float f, float f2) {
        return (-f) / (f2 * -4.2f);
    }

    private static float getPredict(float f, float f2, float f3) {
        return getPredict(f, f2) - getPredict(f3, f2);
    }

    public static float getPredictDistance(float f) {
        return getPredict(f, DEFALUT_FRICTION);
    }

    public static float getPredictDistance(float f, float... fArr) {
        return (fArr == null || fArr.length <= 0) ? getPredict(f, DEFALUT_FRICTION) : getPredict(f, DEFALUT_FRICTION, fArr[0]);
    }

    public static float getPredictDistanceWithFriction(float f, float f2, float... fArr) {
        return (fArr == null || fArr.length <= 0) ? getPredict(f, f2) : getPredict(f, f2, fArr[0]);
    }

    public static float getPredictFriction(float f, float f2, float f3, float... fArr) {
        float f4 = f2 - f;
        if (f3 * f4 <= 0.0f) {
            return -1.0f;
        }
        float signum = Math.signum(f3) * Math.abs(getDefaultThresholdVelocity());
        if (fArr != null && fArr.length > 0) {
            signum = Math.signum(f3) * Math.abs(fArr[0]);
        }
        return (f3 - signum) / (f4 * 4.2f);
    }

    public static <T> IAnimTarget getTarget(T t) {
        return getTarget(t, (ITargetCreator) null);
    }

    public static <T> IAnimTarget getTarget(T t, ITargetCreator<T> iTargetCreator) {
        IAnimTarget createTarget;
        if (t == null) {
            return null;
        }
        if (t instanceof IAnimTarget) {
            return (IAnimTarget) t;
        }
        for (IAnimTarget next : sImplMap.keySet()) {
            Object targetObject = next.getTargetObject();
            if (targetObject != null && targetObject.equals(t)) {
                return next;
            }
        }
        if (iTargetCreator == null || (createTarget = iTargetCreator.createTarget(t)) == null) {
            return null;
        }
        useAt(createTarget);
        return createTarget;
    }

    public static IAnimTarget getTargetById(int i) {
        for (IAnimTarget next : sImplMap.keySet()) {
            if (next.f7484id == i) {
                return next;
            }
        }
        return null;
    }

    public static Collection<IAnimTarget> getTargets() {
        if (LogUtils.isLogEnabled()) {
            int i = 0;
            for (IAnimTarget isValid : sImplMap.keySet()) {
                if (!isValid.isValid()) {
                    i++;
                }
            }
            LogUtils.debug("current sImplMap total : " + sImplMap.size() + "  , target invalid count :  " + i, new Object[0]);
        }
        return sImplMap.keySet();
    }

    public static void getTargets(Collection<IAnimTarget> collection) {
        for (IAnimTarget next : sImplMap.keySet()) {
            if (!next.isValid() || (next.hasFlags(1) && !next.animManager.isAnimRunning(new FloatProperty[0]))) {
                clean(next);
            } else {
                collection.add(next);
            }
        }
    }

    public static float getTimeRatio() {
        return sTimeRatio.get().floatValue();
    }

    public static <T> ValueTarget getValueTarget(T t) {
        return (ValueTarget) getTarget(t, ValueTarget.sCreator);
    }

    public static boolean isInDraggingState(View view) {
        return view.getTag(C2945b.f11151a) != null;
    }

    public static void onListViewTouchEvent(AbsListView absListView, MotionEvent motionEvent) {
        ListViewTouchListener listViewTouchListener = FolmeTouch.getListViewTouchListener(absListView);
        if (listViewTouchListener != null) {
            listViewTouchListener.onTouch(absListView, motionEvent);
        }
    }

    public static float perFromValue(float f, float f2, float f3) {
        if (f3 == f2) {
            return 0.0f;
        }
        return (f - f2) / (f3 - f2);
    }

    /* access modifiers changed from: private */
    public static void performTargetCleanForTooMuchInvalid() {
        ConcurrentHashMap<IAnimTarget, FolmeImpl> concurrentHashMap = sImplMap;
        if (concurrentHashMap.size() > 0 && ((long) concurrentHashMap.size()) % THRESHOLD_LIMIT == 0) {
            ThreadPoolUtil.post(new Runnable() {
                public void run() {
                    ArrayList arrayList = new ArrayList();
                    for (IAnimTarget iAnimTarget : Folme.sImplMap.keySet()) {
                        if (!iAnimTarget.isValid()) {
                            arrayList.add(iAnimTarget);
                        }
                    }
                    Handler mainHandler = Folme.getMainHandler();
                    if (mainHandler != null && arrayList.size() > 0) {
                        Message obtain = Message.obtain();
                        obtain.obj = arrayList;
                        obtain.what = 2;
                        mainHandler.sendMessageDelayed(obtain, Folme.DELAY_TIME_MSG_TARGET_CLEAN_DIE_MUCH);
                    }
                }
            });
        }
    }

    public static <T> void post(T t, Runnable runnable) {
        IAnimTarget target = getTarget(t, (ITargetCreator) null);
        if (target != null) {
            target.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static void sendToTargetMessage(boolean z) {
        clearTargetMessage(1);
        if (z && LogUtils.isLogEnabled()) {
            for (IAnimTarget next : sImplMap.keySet()) {
                LogUtils.debug("exist target:" + next.getTargetObject() + " , target isValid : " + next.isValid(), new Object[0]);
            }
        }
        if (sImplMap.size() > 0) {
            Handler mainHandler = getMainHandler();
            if (mainHandler != null) {
                mainHandler.sendEmptyMessageDelayed(1, 20000);
                return;
            }
            return;
        }
        clearTargetMessage(1);
    }

    public static void setAnimPlayRatio(float f) {
        sTimeRatio.set(Float.valueOf(f));
    }

    public static void setDraggingState(View view, boolean z) {
        int i;
        Boolean bool;
        if (z) {
            i = C2945b.f11151a;
            bool = Boolean.TRUE;
        } else {
            i = C2945b.f11151a;
            bool = null;
        }
        view.setTag(i, bool);
    }

    public static void setLooper(Looper looper) {
        sRunLooper = looper;
        createMainHandler(looper);
        ObjectPool.createMainHandler(sRunLooper);
        AnimRunner.createMainHandler(sRunLooper);
        AnimationHandler.getInstance().recreateProvider();
    }

    public static void setThreadPriority(int i) {
        AnimRunner.setThreadPriority(i);
        ThreadPoolUtil.setThreadPriority(i);
    }

    public static IFolme useAt(IAnimTarget iAnimTarget) {
        ConcurrentHashMap<IAnimTarget, FolmeImpl> concurrentHashMap = sImplMap;
        FolmeImpl folmeImpl = concurrentHashMap.get(iAnimTarget);
        if (folmeImpl != null) {
            return folmeImpl;
        }
        FolmeImpl folmeImpl2 = new FolmeImpl(new IAnimTarget[]{iAnimTarget});
        FolmeImpl putIfAbsent = concurrentHashMap.putIfAbsent(iAnimTarget, folmeImpl2);
        return putIfAbsent != null ? putIfAbsent : folmeImpl2;
    }

    public static IFolme useAt(View... viewArr) {
        if (viewArr.length != 0) {
            if (viewArr.length == 1) {
                return useAt(getTarget(viewArr[0], ViewTarget.sCreator));
            }
            int length = viewArr.length;
            IAnimTarget[] iAnimTargetArr = new IAnimTarget[length];
            FolmeImpl fillTargetArrayAndGetImpl = fillTargetArrayAndGetImpl(viewArr, iAnimTargetArr);
            if (fillTargetArrayAndGetImpl == null) {
                fillTargetArrayAndGetImpl = new FolmeImpl(iAnimTargetArr);
                for (int i = 0; i < length; i++) {
                    FolmeImpl put = sImplMap.put(iAnimTargetArr[i], fillTargetArrayAndGetImpl);
                    if (put != null) {
                        put.clean();
                    }
                }
            }
            return fillTargetArrayAndGetImpl;
        }
        throw new IllegalArgumentException("useAt can not be applied to empty views array");
    }

    public static void useSystemAnimatorDurationScale(Context context) {
        sTimeRatio.set(Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
    }

    public static IStateStyle useValue(Object... objArr) {
        IAnimTarget iAnimTarget;
        if (objArr.length > 0) {
            iAnimTarget = getTarget(objArr[0], ValueTarget.sCreator);
        } else {
            iAnimTarget = new ValueTarget();
            iAnimTarget.setFlags(1);
        }
        return useAt(iAnimTarget).state();
    }

    public static IVarFontStyle useVarFontAt(TextView textView, int i, int i2) {
        return new FolmeFont().useAt(textView, i, i2);
    }

    public static float valueFromPer(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }
}
