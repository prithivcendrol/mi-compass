package miuix.animation.controller;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.util.ArrayMap;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import miuix.animation.C1991R;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.IHoverStyle;
import miuix.animation.ViewTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;
import p142y2.C2944a;

public class FolmeHover extends FolmeBase implements IHoverStyle {
    private static final int CORNER_DIS = 36;
    private static final float DEFAULT_CORNER = 0.5f;
    private static final float DEFAULT_SCALE = 1.15f;
    private static final int SCALE_DIS = 12;
    private static WeakHashMap<View, InnerViewHoverListener> sHoverRecord = new WeakHashMap<>();
    private String HoverMoveType = "MOVE";
    private boolean isSetAutoTranslation = false;
    private WeakReference<View> mChildView;
    private boolean mClearTint = false;
    private IHoverStyle.HoverEffect mCurrentEffect = IHoverStyle.HoverEffect.NORMAL;
    private TransitionListener mDefListener = new TransitionListener() {
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            if (obj.equals(IHoverStyle.HoverType.ENTER)) {
                AnimState.alignState(FolmeHover.this.mState.getState(IHoverStyle.HoverType.EXIT), collection);
            }
        }
    };
    private AnimConfig mEnterConfig = new AnimConfig();
    private AnimConfig mExitConfig = new AnimConfig();
    private WeakReference<View> mHoverView;
    private boolean mIsEnter;
    private int[] mLocation = new int[2];
    private AnimConfig mMoveConfig = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.4f));
    private WeakReference<View> mParentView;
    private float mRadius = 0.0f;
    private Map<IHoverStyle.HoverType, Boolean> mScaleSetMap = new ArrayMap();
    private boolean mSetTint;
    private int mTargetHeight = 0;
    private int mTargetWidth = 0;
    private float mTranslateDist = Float.MAX_VALUE;
    private Map<IHoverStyle.HoverType, Boolean> mTranslationSetMap = new ArrayMap();

    /* renamed from: miuix.animation.controller.FolmeHover$2 */
    static /* synthetic */ class C20062 {
        static final /* synthetic */ int[] $SwitchMap$miuix$animation$IHoverStyle$HoverEffect;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                miuix.animation.IHoverStyle$HoverEffect[] r0 = miuix.animation.IHoverStyle.HoverEffect.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$miuix$animation$IHoverStyle$HoverEffect = r0
                miuix.animation.IHoverStyle$HoverEffect r1 = miuix.animation.IHoverStyle.HoverEffect.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$miuix$animation$IHoverStyle$HoverEffect     // Catch:{ NoSuchFieldError -> 0x001d }
                miuix.animation.IHoverStyle$HoverEffect r1 = miuix.animation.IHoverStyle.HoverEffect.FLOATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$miuix$animation$IHoverStyle$HoverEffect     // Catch:{ NoSuchFieldError -> 0x0028 }
                miuix.animation.IHoverStyle$HoverEffect r1 = miuix.animation.IHoverStyle.HoverEffect.FLOATED_WRAPPED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.animation.controller.FolmeHover.C20062.<clinit>():void");
        }
    }

    private static class InnerViewHoverListener implements View.OnHoverListener {
        private WeakHashMap<FolmeHover, AnimConfig[]> mHoverMap;

        private InnerViewHoverListener() {
            this.mHoverMap = new WeakHashMap<>();
        }

        /* access modifiers changed from: package-private */
        public void addHover(FolmeHover folmeHover, AnimConfig... animConfigArr) {
            this.mHoverMap.put(folmeHover, animConfigArr);
        }

        public boolean onHover(View view, MotionEvent motionEvent) {
            for (Map.Entry next : this.mHoverMap.entrySet()) {
                ((FolmeHover) next.getKey()).handleMotionEvent(view, motionEvent, (AnimConfig[]) next.getValue());
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean removeHover(FolmeHover folmeHover) {
            this.mHoverMap.remove(folmeHover);
            return this.mHoverMap.isEmpty();
        }
    }

    public FolmeHover(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        initDist(iAnimTargetArr.length > 0 ? iAnimTargetArr[0] : null);
        updateHoverState(this.mCurrentEffect);
        this.mEnterConfig.setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
        this.mEnterConfig.addListeners(this.mDefListener);
        this.mExitConfig.setEase(-2, 0.99f, 0.4f).setSpecial((FloatProperty) ViewProperty.ALPHA, -2, 0.9f, 0.2f);
    }

    private void actualTranslatDist(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        view.getLocationOnScreen(this.mLocation);
        float width = ((float) this.mLocation[0]) + (((float) view.getWidth()) * 0.5f);
        float height = (rawY - (((float) this.mLocation[1]) + (((float) view.getHeight()) * 0.5f))) / ((float) view.getHeight());
        float f = 1.0f;
        float max = Math.max(-1.0f, Math.min(1.0f, (rawX - width) / ((float) view.getWidth())));
        float max2 = Math.max(-1.0f, Math.min(1.0f, height));
        float f2 = this.mTranslateDist;
        float f3 = max * (f2 == Float.MAX_VALUE ? 1.0f : f2);
        if (f2 != Float.MAX_VALUE) {
            f = f2;
        }
        this.mState.mo6815to(this.mState.getState(this.HoverMoveType).add(ViewProperty.TRANSLATION_X, (double) f3).add(ViewProperty.TRANSLATION_Y, (double) (max2 * f)), this.mMoveConfig);
    }

    private static void addMagicPoint(View view, Point point) {
        try {
            Class.forName("android.view.View").getMethod("addMagicPoint", new Class[]{Point.class}).invoke(view, new Object[]{point});
        } catch (Exception e) {
            Log.e("", "addMagicPoint failed , e:" + e.toString());
        }
    }

    private static void clearMagicPoint(View view) {
        try {
            Class.forName("android.view.View").getMethod("clearMagicPoint", new Class[0]).invoke(view, new Object[0]);
        } catch (Exception e) {
            Log.e("", "clearMagicPoint failed , e:" + e.toString());
        }
    }

    private void clearRound() {
    }

    private void clearScale() {
        IHoverStyle.HoverType hoverType = IHoverStyle.HoverType.ENTER;
        if (isScaleSet(hoverType)) {
            this.mState.getState(hoverType).remove(ViewProperty.SCALE_X);
            this.mState.getState(hoverType).remove(ViewProperty.SCALE_Y);
        }
        IHoverStyle.HoverType hoverType2 = IHoverStyle.HoverType.EXIT;
        if (isScaleSet(hoverType2)) {
            this.mState.getState(hoverType2).remove(ViewProperty.SCALE_X);
            this.mState.getState(hoverType2).remove(ViewProperty.SCALE_Y);
        }
        this.mScaleSetMap.clear();
    }

    private void clearTranslation() {
        this.isSetAutoTranslation = false;
        IHoverStyle.HoverType hoverType = IHoverStyle.HoverType.ENTER;
        if (isTranslationSet(hoverType)) {
            this.mState.getState(hoverType).remove(ViewProperty.TRANSLATION_X);
            this.mState.getState(hoverType).remove(ViewProperty.TRANSLATION_Y);
        }
        IHoverStyle.HoverType hoverType2 = IHoverStyle.HoverType.EXIT;
        if (isTranslationSet(hoverType2)) {
            this.mState.getState(hoverType2).remove(ViewProperty.TRANSLATION_X);
            this.mState.getState(hoverType2).remove(ViewProperty.TRANSLATION_Y);
        }
        this.mTranslationSetMap.clear();
    }

    private void doHandleHoverOf(View view, AnimConfig... animConfigArr) {
        handleViewHover(view, animConfigArr);
        if (setHoverView(view) && LogUtils.isLogEnabled()) {
            LogUtils.debug("handleViewHover for " + view, new Object[0]);
        }
    }

    private AnimConfig[] getEnterConfig(AnimConfig... animConfigArr) {
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mEnterConfig);
    }

    private AnimConfig[] getExitConfig(AnimConfig... animConfigArr) {
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mExitConfig);
    }

    private static int getFeedbackColor(View view) {
        try {
            return ((Integer) Class.forName("android.view.View").getMethod("getFeedbackColor", new Class[0]).invoke(view, new Object[0])).intValue();
        } catch (Exception e) {
            Log.e("", "getFeedbackColor failed , e:" + e.toString());
            return -1;
        }
    }

    private static float getFeedbackRadius(View view) {
        try {
            return ((Float) Class.forName("android.view.View").getMethod("getFeedbackRadius", new Class[0]).invoke(view, new Object[0])).floatValue();
        } catch (Exception e) {
            Log.e("", "getFeedbackRadius failed , e:" + e.toString());
            return -1.0f;
        }
    }

    private static int getPointerShapeType(View view) {
        try {
            return ((Integer) Class.forName("android.view.View").getMethod("getPointerShapeType", new Class[0]).invoke(view, new Object[0])).intValue();
        } catch (Exception e) {
            Log.e("", "getPointerShapeType failed , e:" + e.toString());
            return -1;
        }
    }

    private IHoverStyle.HoverType getType(IHoverStyle.HoverType... hoverTypeArr) {
        return hoverTypeArr.length > 0 ? hoverTypeArr[0] : IHoverStyle.HoverType.ENTER;
    }

    /* access modifiers changed from: private */
    public void handleMotionEvent(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            onEventMove(view, motionEvent, animConfigArr);
        } else if (actionMasked == 9) {
            onEventEnter(motionEvent, animConfigArr);
        } else if (actionMasked == 10) {
            onEventExit(motionEvent, animConfigArr);
        }
    }

    private void handleViewHover(View view, AnimConfig... animConfigArr) {
        InnerViewHoverListener innerViewHoverListener = sHoverRecord.get(view);
        if (innerViewHoverListener == null) {
            innerViewHoverListener = new InnerViewHoverListener();
            sHoverRecord.put(view, innerViewHoverListener);
        }
        view.setOnHoverListener(innerViewHoverListener);
        innerViewHoverListener.addHover(this, animConfigArr);
    }

    private void hoverEnterAuto(boolean z, AnimConfig... animConfigArr) {
        this.isSetAutoTranslation = z;
        this.mIsEnter = true;
        if (this.mCurrentEffect == IHoverStyle.HoverEffect.FLOATED_WRAPPED) {
            WeakReference<View> weakReference = this.mHoverView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null) {
                setMagicView(view, true);
                setWrapped(view, true);
            }
        }
        if (isHideHover()) {
            setMagicView(true);
            setPointerHide(true);
        }
        setCorner(this.mRadius);
        setTintColor();
        AnimConfig[] enterConfig = getEnterConfig(animConfigArr);
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        IHoverStyle.HoverType hoverType = IHoverStyle.HoverType.ENTER;
        AnimState state = iFolmeStateStyle.getState(hoverType);
        if (isScaleSet(hoverType)) {
            IAnimTarget target = this.mState.getTarget();
            float max = Math.max(target.getValue(ViewProperty.WIDTH), target.getValue(ViewProperty.HEIGHT));
            double min = (double) Math.min((12.0f + max) / max, DEFAULT_SCALE);
            state.add(ViewProperty.SCALE_X, min).add(ViewProperty.SCALE_Y, min);
        }
        WeakReference<View> weakReference2 = this.mParentView;
        if (weakReference2 != null) {
            Folme.useAt(weakReference2.get()).state().add((FloatProperty) ViewProperty.SCALE_X, 1.0f).add((FloatProperty) ViewProperty.SCALE_Y, 1.0f).mo6817to(enterConfig);
        }
        this.mState.mo6815to(state, enterConfig);
    }

    private void hoverEnterToolType(int i, AnimConfig... animConfigArr) {
        if (i == 1 || i == 3 || i == 0) {
            hoverEnter(animConfigArr);
        } else if (i == 4 || i == 2) {
            hoverEnterAuto(false, animConfigArr);
        }
    }

    private void initDist(IAnimTarget iAnimTarget) {
        View targetObject = iAnimTarget instanceof ViewTarget ? ((ViewTarget) iAnimTarget).getTargetObject() : null;
        if (targetObject != null) {
            float max = Math.max(iAnimTarget.getValue(ViewProperty.WIDTH), iAnimTarget.getValue(ViewProperty.HEIGHT));
            float min = Math.min((12.0f + max) / max, DEFAULT_SCALE);
            this.mTargetWidth = targetObject.getWidth();
            int height = targetObject.getHeight();
            this.mTargetHeight = height;
            float f = 0.0f;
            float min2 = Math.min(15.0f, valFromPer(Math.max(0.0f, Math.min(1.0f, perFromVal((float) (this.mTargetWidth - 40), 0.0f, 360.0f))), 15.0f, 0.0f));
            float min3 = Math.min(15.0f, valFromPer(Math.max(0.0f, Math.min(1.0f, perFromVal((float) (height - 40), 0.0f, 360.0f))), 15.0f, 0.0f));
            if (min != 1.0f) {
                f = Math.min(min2, min3);
            }
            this.mTranslateDist = f;
            int i = this.mTargetWidth;
            int i2 = this.mTargetHeight;
            setCorner((i != i2 || i >= 100 || i2 >= 100) ? 36.0f : (float) ((int) (((float) i) * 0.5f)));
        }
    }

    private static boolean isMagicView(View view) {
        try {
            return ((Boolean) Class.forName("android.view.View").getMethod("isMagicView", new Class[0]).invoke(view, new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.e("", "isMagicView failed , e:" + e.toString());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r6 = r6[1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean isOnHoverView(android.view.View r5, int[] r6, android.view.MotionEvent r7) {
        /*
            r0 = 1
            if (r5 == 0) goto L_0x0029
            r5.getLocationOnScreen(r6)
            float r1 = r7.getRawX()
            int r1 = (int) r1
            float r7 = r7.getRawY()
            int r7 = (int) r7
            r2 = 0
            r3 = r6[r2]
            if (r1 < r3) goto L_0x0028
            int r4 = r5.getWidth()
            int r3 = r3 + r4
            if (r1 > r3) goto L_0x0028
            r6 = r6[r0]
            if (r7 < r6) goto L_0x0028
            int r5 = r5.getHeight()
            int r6 = r6 + r5
            if (r7 > r6) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.controller.FolmeHover.isOnHoverView(android.view.View, int[], android.view.MotionEvent):boolean");
    }

    private boolean isScaleSet(IHoverStyle.HoverType hoverType) {
        return Boolean.TRUE.equals(this.mScaleSetMap.get(hoverType));
    }

    private boolean isTranslationSet(IHoverStyle.HoverType hoverType) {
        return Boolean.TRUE.equals(this.mTranslationSetMap.get(hoverType));
    }

    private static boolean isWrapped(View view) {
        try {
            return ((Boolean) Class.forName("android.view.View").getMethod("isWrapped", new Class[0]).invoke(view, new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.e("", " isWrapped failed , e:" + e.toString());
            return false;
        }
    }

    private void onEventEnter(MotionEvent motionEvent, AnimConfig... animConfigArr) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("onEventEnter, touchEnter", new Object[0]);
        }
        hoverEnter(motionEvent, animConfigArr);
    }

    private void onEventExit(MotionEvent motionEvent, AnimConfig... animConfigArr) {
        if (this.mIsEnter) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("onEventExit, touchExit", new Object[0]);
            }
            hoverExit(motionEvent, animConfigArr);
            resetTouchStatus();
        }
    }

    private void onEventMove(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        if (this.mIsEnter && view != null && isTranslationSet(IHoverStyle.HoverType.ENTER) && this.isSetAutoTranslation) {
            actualTranslatDist(view, motionEvent);
        }
    }

    private float perFromVal(float f, float f2, float f3) {
        return (f - f2) / (f3 - f2);
    }

    private void resetTouchStatus() {
        this.mIsEnter = false;
    }

    private View resetView(WeakReference<View> weakReference) {
        View view = weakReference.get();
        if (view != null) {
            view.setOnHoverListener((View.OnHoverListener) null);
        }
        return view;
    }

    private void setAutoRound() {
    }

    private void setAutoScale() {
        Map<IHoverStyle.HoverType, Boolean> map = this.mScaleSetMap;
        IHoverStyle.HoverType hoverType = IHoverStyle.HoverType.ENTER;
        Boolean bool = Boolean.TRUE;
        map.put(hoverType, bool);
        Map<IHoverStyle.HoverType, Boolean> map2 = this.mScaleSetMap;
        IHoverStyle.HoverType hoverType2 = IHoverStyle.HoverType.EXIT;
        map2.put(hoverType2, bool);
        this.mState.getState(hoverType2).add(ViewProperty.SCALE_X, 1.0d).add(ViewProperty.SCALE_Y, 1.0d);
    }

    private void setAutoTranslation() {
        this.isSetAutoTranslation = true;
        Map<IHoverStyle.HoverType, Boolean> map = this.mTranslationSetMap;
        IHoverStyle.HoverType hoverType = IHoverStyle.HoverType.ENTER;
        Boolean bool = Boolean.TRUE;
        map.put(hoverType, bool);
        Map<IHoverStyle.HoverType, Boolean> map2 = this.mTranslationSetMap;
        IHoverStyle.HoverType hoverType2 = IHoverStyle.HoverType.EXIT;
        map2.put(hoverType2, bool);
        this.mState.getState(hoverType2).add(ViewProperty.TRANSLATION_X, 0.0d).add(ViewProperty.TRANSLATION_Y, 0.0d);
    }

    private static void setFeedbackColor(View view, int i) {
        try {
            Class.forName("android.view.View").getMethod("setFeedbackColor", new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.e("", "setFeedbackColor failed , e:" + e.toString());
        }
    }

    private static void setFeedbackRadius(View view, float f) {
        try {
            Class.forName("android.view.View").getMethod("setFeedbackRadius", new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(f)});
        } catch (Exception e) {
            Log.e("", "setFeedbackRadius failed , e:" + e.toString());
        }
    }

    private static void setHotXOffset(View view, int i) {
        try {
            Class.forName("android.view.View").getMethod("setHotXOffset", new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.e("", "setHotXOffset failed , e:" + e.toString());
        }
    }

    private static void setHotYOffset(View view, int i) {
        try {
            Class.forName("android.view.View").getMethod("setHotYOffset", new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.e("", "setHotYOffset failed , e:" + e.toString());
        }
    }

    private boolean setHoverView(View view) {
        WeakReference<View> weakReference = this.mHoverView;
        if ((weakReference != null ? weakReference.get() : null) == view) {
            return false;
        }
        this.mHoverView = new WeakReference<>(view);
        return true;
    }

    private static void setMagicView(View view, boolean z) {
        try {
            Class.forName("android.view.View").getMethod("setMagicView", new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.e("", "setMagicView failed , e:" + e.toString());
        }
    }

    private static void setPointerHide(View view, boolean z) {
        try {
            Class.forName("android.view.View").getMethod("setPointerHide", new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.e("", "setPointerHide failed , e:" + e.toString());
        }
    }

    private static void setPointerShape(View view, Bitmap bitmap) {
        try {
            Class.forName("android.view.View").getMethod("setPointerShape", new Class[]{Bitmap.class}).invoke(view, new Object[]{bitmap});
        } catch (Exception e) {
            Log.e("", "setPointerShape failed , e:" + e.toString());
        }
    }

    private static void setPointerShapeType(View view, int i) {
        try {
            Class.forName("android.view.View").getMethod("setPointerShapeType", new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.e("", "setPointerShapeType failed , e:" + e.toString());
        }
    }

    private void setTintColor() {
        if (!this.mSetTint && !this.mClearTint) {
            int argb = Color.argb(15, 0, 0, 0);
            Object targetObject = this.mState.getTarget().getTargetObject();
            if (targetObject instanceof View) {
                argb = ((View) targetObject).getResources().getColor(C2944a.f11149b);
            }
            ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
            this.mState.getState(IHoverStyle.HoverType.ENTER).add(foregroundProperty, (double) argb);
            this.mState.getState(IHoverStyle.HoverType.EXIT).add(foregroundProperty, 0.0d);
        }
    }

    private static void setWrapped(View view, boolean z) {
        try {
            Class.forName("android.view.View").getMethod("setWrapped", new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.e("", "setWrapped failed , e:" + e.toString());
        }
    }

    private void updateHoverState(IHoverStyle.HoverEffect hoverEffect) {
        int i = C20062.$SwitchMap$miuix$animation$IHoverStyle$HoverEffect[hoverEffect.ordinal()];
        if (i == 1) {
            IHoverStyle.HoverEffect hoverEffect2 = this.mCurrentEffect;
            if (hoverEffect2 == IHoverStyle.HoverEffect.FLOATED) {
                clearScale();
                clearTranslation();
            } else if (hoverEffect2 == IHoverStyle.HoverEffect.FLOATED_WRAPPED) {
                clearScale();
                clearTranslation();
                clearRound();
            }
            setTintColor();
        } else if (i == 2) {
            if (this.mCurrentEffect == IHoverStyle.HoverEffect.FLOATED_WRAPPED) {
                clearRound();
            }
            setTintColor();
            setAutoScale();
            setAutoTranslation();
        } else if (i == 3) {
            IHoverStyle.HoverEffect hoverEffect3 = this.mCurrentEffect;
            if (hoverEffect3 == IHoverStyle.HoverEffect.NORMAL || hoverEffect3 == IHoverStyle.HoverEffect.FLOATED) {
                clearTintColor();
            }
            setAutoScale();
            setAutoTranslation();
            setAutoRound();
        } else {
            return;
        }
        this.mCurrentEffect = hoverEffect;
    }

    private float valFromPer(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    public void addMagicPoint(Point point) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            addMagicPoint((View) targetObject, point);
        }
    }

    public void clean() {
        super.clean();
        this.mScaleSetMap.clear();
        WeakReference<View> weakReference = this.mHoverView;
        if (weakReference != null) {
            resetView(weakReference);
            this.mHoverView = null;
        }
        WeakReference<View> weakReference2 = this.mChildView;
        if (weakReference2 != null) {
            resetView(weakReference2);
            this.mChildView = null;
        }
        WeakReference<View> weakReference3 = this.mParentView;
        if (weakReference3 != null) {
            resetView(weakReference3);
            this.mParentView = null;
        }
    }

    public void clearMagicPoint() {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            clearMagicPoint((View) targetObject);
        }
    }

    public IHoverStyle clearTintColor() {
        this.mClearTint = true;
        ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
        this.mState.getState(IHoverStyle.HoverType.ENTER).remove(foregroundProperty);
        this.mState.getState(IHoverStyle.HoverType.EXIT).remove(foregroundProperty);
        return this;
    }

    public int getFeedbackColor() {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            return getFeedbackColor((View) targetObject);
        }
        return -1;
    }

    public float getFeedbackRadius() {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            return getFeedbackRadius((View) targetObject);
        }
        return -1.0f;
    }

    public int getPointerShapeType() {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            return getPointerShapeType((View) targetObject);
        }
        return -1;
    }

    public void handleHoverOf(View view, AnimConfig... animConfigArr) {
        doHandleHoverOf(view, animConfigArr);
    }

    public void hoverEnter(MotionEvent motionEvent, AnimConfig... animConfigArr) {
        hoverEnterToolType(motionEvent.getToolType(0), animConfigArr);
    }

    public void hoverEnter(AnimConfig... animConfigArr) {
        hoverEnterAuto(true, animConfigArr);
    }

    public void hoverExit(MotionEvent motionEvent, AnimConfig... animConfigArr) {
        if (this.mParentView != null && !isOnHoverView(this.mHoverView.get(), this.mLocation, motionEvent)) {
            Folme.useAt(this.mParentView.get()).hover().hoverEnter(this.mEnterConfig);
        }
        IHoverStyle.HoverType hoverType = IHoverStyle.HoverType.EXIT;
        if (isTranslationSet(hoverType) && this.isSetAutoTranslation) {
            this.mState.getState(hoverType).add(ViewProperty.TRANSLATION_X, 0.0d).add(ViewProperty.TRANSLATION_Y, 0.0d);
        }
        hoverExit(animConfigArr);
    }

    public void hoverExit(AnimConfig... animConfigArr) {
        AnimConfig[] exitConfig = getExitConfig(animConfigArr);
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(IHoverStyle.HoverType.EXIT), exitConfig);
    }

    public void hoverMove(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        onEventMove(view, motionEvent, animConfigArr);
    }

    public void ignoreHoverOf(View view) {
        InnerViewHoverListener innerViewHoverListener = sHoverRecord.get(view);
        if (innerViewHoverListener != null && innerViewHoverListener.removeHover(this)) {
            sHoverRecord.remove(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.isSetAutoTranslation;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r0 = r2.mCurrentEffect;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isHideHover() {
        /*
            r2 = this;
            int r0 = r2.mTargetWidth
            r1 = 100
            if (r0 >= r1) goto L_0x001c
            int r0 = r2.mTargetHeight
            if (r0 >= r1) goto L_0x001c
            boolean r0 = r2.isSetAutoTranslation
            if (r0 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x001c
            miuix.animation.IHoverStyle$HoverEffect r0 = r2.mCurrentEffect
            miuix.animation.IHoverStyle$HoverEffect r1 = miuix.animation.IHoverStyle.HoverEffect.FLOATED
            if (r0 == r1) goto L_0x001a
            miuix.animation.IHoverStyle$HoverEffect r1 = miuix.animation.IHoverStyle.HoverEffect.FLOATED_WRAPPED
            if (r0 != r1) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.controller.FolmeHover.isHideHover():boolean");
    }

    public boolean isMagicView() {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            return isMagicView((View) targetObject);
        }
        return false;
    }

    public boolean isWrapped() {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            return isWrapped((View) targetObject);
        }
        return false;
    }

    public void onMotionEvent(MotionEvent motionEvent) {
        handleMotionEvent((View) null, motionEvent, new AnimConfig[0]);
    }

    public void onMotionEventEx(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        handleMotionEvent(view, motionEvent, animConfigArr);
    }

    public IHoverStyle setAlpha(float f, IHoverStyle.HoverType... hoverTypeArr) {
        this.mState.getState(getType(hoverTypeArr)).add(ViewProperty.ALPHA, (double) f);
        return this;
    }

    public IHoverStyle setBackgroundColor(float f, float f2, float f3, float f4) {
        return setBackgroundColor(Color.argb((int) (f * 255.0f), (int) (f2 * 255.0f), (int) (f3 * 255.0f), (int) (f4 * 255.0f)));
    }

    public IHoverStyle setBackgroundColor(int i) {
        ViewPropertyExt.BackgroundProperty backgroundProperty = ViewPropertyExt.BACKGROUND;
        this.mState.getState(IHoverStyle.HoverType.ENTER).add(backgroundProperty, (double) i);
        this.mState.getState(IHoverStyle.HoverType.EXIT).add(backgroundProperty, (double) ((int) AnimValueUtils.getValueOfTarget(this.mState.getTarget(), backgroundProperty, 0.0d)));
        return this;
    }

    public IHoverStyle setCorner(float f) {
        this.mRadius = f;
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            ((View) targetObject).setTag(C1991R.C1992id.miuix_animation_tag_view_hover_corners, Float.valueOf(f));
        }
        return this;
    }

    public IHoverStyle setEffect(IHoverStyle.HoverEffect hoverEffect) {
        updateHoverState(hoverEffect);
        return this;
    }

    public void setFeedbackColor(int i) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setFeedbackColor((View) targetObject, i);
        }
    }

    public void setFeedbackRadius(float f) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setFeedbackRadius((View) targetObject, f);
        }
    }

    public void setHotXOffset(int i) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setHotXOffset((View) targetObject, i);
        }
    }

    public void setHotYOffset(int i) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setHotYOffset((View) targetObject, i);
        }
    }

    public void setHoverEnter() {
        setTintColor();
        this.mState.setTo((Object) IHoverStyle.HoverType.ENTER);
    }

    public void setHoverExit() {
        this.mState.setTo((Object) IHoverStyle.HoverType.EXIT);
    }

    public void setMagicView(boolean z) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setMagicView((View) targetObject, z);
        }
    }

    public IHoverStyle setParentView(View view) {
        WeakReference<View> weakReference = this.mParentView;
        if (view == (weakReference != null ? weakReference.get() : null)) {
            return this;
        }
        this.mParentView = new WeakReference<>(view);
        return this;
    }

    public void setPointerHide(boolean z) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setPointerHide((View) targetObject, z);
        }
    }

    public void setPointerShape(Bitmap bitmap) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setPointerShape((View) targetObject, bitmap);
        }
    }

    public void setPointerShapeType(int i) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setPointerShapeType((View) targetObject, i);
        }
    }

    public IHoverStyle setScale(float f, IHoverStyle.HoverType... hoverTypeArr) {
        IHoverStyle.HoverType type = getType(hoverTypeArr);
        this.mScaleSetMap.put(type, Boolean.TRUE);
        double d = (double) f;
        this.mState.getState(type).add(ViewProperty.SCALE_X, d).add(ViewProperty.SCALE_Y, d);
        return this;
    }

    public IHoverStyle setTint(float f, float f2, float f3, float f4) {
        return setTint(Color.argb((int) (f * 255.0f), (int) (f2 * 255.0f), (int) (f3 * 255.0f), (int) (f4 * 255.0f)));
    }

    public IHoverStyle setTint(int i) {
        boolean z = true;
        this.mSetTint = true;
        if (i != 0) {
            z = false;
        }
        this.mClearTint = z;
        this.mState.getState(IHoverStyle.HoverType.ENTER).add(ViewPropertyExt.FOREGROUND, (double) i);
        return this;
    }

    public IHoverStyle setTintMode(int i) {
        this.mEnterConfig.setTintMode(i);
        this.mExitConfig.setTintMode(i);
        return this;
    }

    public IHoverStyle setTranslate(float f, IHoverStyle.HoverType... hoverTypeArr) {
        this.isSetAutoTranslation = false;
        IHoverStyle.HoverType type = getType(hoverTypeArr);
        this.mTranslationSetMap.put(type, Boolean.TRUE);
        double d = (double) f;
        this.mState.getState(type).add(ViewProperty.TRANSLATION_X, d).add(ViewProperty.TRANSLATION_Y, d);
        return this;
    }

    public void setWrapped(boolean z) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            setWrapped((View) targetObject, z);
        }
    }
}
