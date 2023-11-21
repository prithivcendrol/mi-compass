package miuix.animation.controller;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.ArrayMap;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import miuix.animation.C1991R;
import miuix.animation.IAnimTarget;
import miuix.animation.ITouchStyle;
import miuix.animation.ViewTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.ForegroundColorStyle;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;
import p142y2.C2944a;
import p142y2.C2945b;

public class FolmeTouch extends FolmeBase implements ITouchStyle {
    private static final float DEFAULT_SCALE = 0.9f;
    private static final int SCALE_DIS = 10;
    private static WeakHashMap<View, InnerViewTouchListener> sTouchRecord = new WeakHashMap<>();
    private boolean mClearTint = false;
    private boolean mClickInvoked;
    private View.OnClickListener mClickListener;
    private TransitionListener mDefListener = new TransitionListener() {
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            if (obj.equals(ITouchStyle.TouchType.DOWN)) {
                AnimState.alignState(FolmeTouch.this.mState.getState(ITouchStyle.TouchType.UP), collection);
            }
        }
    };
    private AnimConfig mDownConfig = new AnimConfig();
    private int mDownWeight;
    private float mDownX;
    private float mDownY;
    private FolmeFont mFontStyle;
    private Rect mGlobalBoundInWindow = new Rect();
    private boolean mIsDown;
    private WeakReference<View> mListView;
    private int[] mLocationInScreen = new int[2];
    /* access modifiers changed from: private */
    public boolean mLongClickInvoked;
    /* access modifiers changed from: private */
    public View.OnLongClickListener mLongClickListener;
    private LongClickTask mLongClickTask;
    private Rect mRootGlobalBoundInWindow = new Rect();
    private float mScaleDist;
    private Map<ITouchStyle.TouchType, Boolean> mScaleSetMap = new ArrayMap();
    private boolean mSetTint;
    private int mTouchIndex;
    private WeakReference<View> mTouchView;
    private AnimConfig mUpConfig = new AnimConfig();
    private int mUpWeight;

    private static class InnerListViewTouchListener implements View.OnTouchListener {
        private AnimConfig[] mConfigs;
        private WeakReference<FolmeTouch> mFolmeTouchRef;

        InnerListViewTouchListener(FolmeTouch folmeTouch, AnimConfig... animConfigArr) {
            this.mFolmeTouchRef = new WeakReference<>(folmeTouch);
            this.mConfigs = animConfigArr;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            WeakReference<FolmeTouch> weakReference = this.mFolmeTouchRef;
            FolmeTouch folmeTouch = weakReference == null ? null : weakReference.get();
            if (folmeTouch == null) {
                return false;
            }
            if (motionEvent == null) {
                folmeTouch.onEventUp(this.mConfigs);
                return false;
            }
            folmeTouch.handleMotionEvent(view, motionEvent, this.mConfigs);
            return false;
        }
    }

    private static class InnerViewTouchListener implements View.OnTouchListener {
        private WeakHashMap<FolmeTouch, AnimConfig[]> mTouchMap;

        private InnerViewTouchListener() {
            this.mTouchMap = new WeakHashMap<>();
        }

        /* access modifiers changed from: package-private */
        public void addTouch(FolmeTouch folmeTouch, AnimConfig... animConfigArr) {
            this.mTouchMap.put(folmeTouch, animConfigArr);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            for (Map.Entry next : this.mTouchMap.entrySet()) {
                ((FolmeTouch) next.getKey()).handleMotionEvent(view, motionEvent, (AnimConfig[]) next.getValue());
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean removeTouch(FolmeTouch folmeTouch) {
            this.mTouchMap.remove(folmeTouch);
            return this.mTouchMap.isEmpty();
        }
    }

    private static class ListViewInfo {
        View itemView;
        AbsListView listView;

        private ListViewInfo() {
        }
    }

    private static final class LongClickTask implements Runnable {
        private WeakReference<FolmeTouch> mTouchRef;

        private LongClickTask() {
        }

        public void run() {
            View view;
            FolmeTouch folmeTouch = this.mTouchRef.get();
            if (folmeTouch != null) {
                IAnimTarget target = folmeTouch.mState.getTarget();
                if ((target instanceof ViewTarget) && (view = (View) target.getTargetObject()) != null && folmeTouch.mLongClickListener != null) {
                    view.performLongClick();
                    folmeTouch.invokeLongClick(view);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void start(FolmeTouch folmeTouch) {
            View targetObject;
            IAnimTarget target = folmeTouch.mState.getTarget();
            if ((target instanceof ViewTarget) && (targetObject = ((ViewTarget) target).getTargetObject()) != null) {
                this.mTouchRef = new WeakReference<>(folmeTouch);
                targetObject.postDelayed(this, (long) ViewConfiguration.getLongPressTimeout());
            }
        }

        /* access modifiers changed from: package-private */
        public void stop(FolmeTouch folmeTouch) {
            View targetObject;
            IAnimTarget target = folmeTouch.mState.getTarget();
            if ((target instanceof ViewTarget) && (targetObject = ((ViewTarget) target).getTargetObject()) != null) {
                targetObject.removeCallbacks(this);
            }
        }
    }

    public FolmeTouch(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        initScaleDist(iAnimTargetArr.length > 0 ? iAnimTargetArr[0] : null);
        this.mState.getState(ITouchStyle.TouchType.UP).add(ViewProperty.SCALE_X, 1.0d).add(ViewProperty.SCALE_Y, 1.0d);
        setTintColor();
        this.mDownConfig.setEase(EaseManager.getStyle(-2, 0.99f, 0.15f));
        this.mDownConfig.addListeners(this.mDefListener);
        this.mUpConfig.setEase(-2, 0.99f, 0.3f).setSpecial((FloatProperty) ViewProperty.ALPHA, -2, DEFAULT_SCALE, 0.2f);
    }

    /* access modifiers changed from: private */
    public boolean bindListView(View view, boolean z, AnimConfig... animConfigArr) {
        ListViewInfo listViewInfo;
        if (this.mState.getTarget() == null || (listViewInfo = getListViewInfo(view)) == null || listViewInfo.listView == null) {
            return false;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("handleListViewTouch for " + view, new Object[0]);
        }
        handleListViewTouch(listViewInfo.listView, view, z, animConfigArr);
        return true;
    }

    private void doHandleTouchOf(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, boolean z, AnimConfig... animConfigArr) {
        setClickAndLongClickListener(onClickListener, onLongClickListener);
        handleViewTouch(view, animConfigArr);
        if (setTouchView(view)) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("handleViewTouch for " + view, new Object[0]);
            }
            final boolean isClickable = view.isClickable();
            view.setClickable(true);
            final boolean z2 = z;
            final View view2 = view;
            final AnimConfig[] animConfigArr2 = animConfigArr;
            CommonUtils.runOnPreDraw(view, new Runnable() {
                public void run() {
                    if (!z2 && FolmeTouch.this.bindListView(view2, true, animConfigArr2)) {
                        FolmeTouch.this.resetViewTouch(view2, isClickable);
                    }
                }
            });
        }
    }

    private AnimConfig[] getDownConfig(AnimConfig... animConfigArr) {
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mDownConfig);
    }

    private ListViewInfo getListViewInfo(View view) {
        AbsListView absListView = null;
        ListViewInfo listViewInfo = new ListViewInfo();
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                break;
            } else if (parent instanceof AbsListView) {
                absListView = (AbsListView) parent;
                break;
            } else {
                if (parent instanceof View) {
                    view = (View) parent;
                }
                parent = parent.getParent();
            }
        }
        if (absListView != null) {
            this.mListView = new WeakReference<>(listViewInfo.listView);
            listViewInfo.listView = absListView;
            listViewInfo.itemView = view;
        }
        return listViewInfo;
    }

    public static ListViewTouchListener getListViewTouchListener(AbsListView absListView) {
        return (ListViewTouchListener) absListView.getTag(C2945b.f11152b);
    }

    private ITouchStyle.TouchType getType(ITouchStyle.TouchType... touchTypeArr) {
        return touchTypeArr.length > 0 ? touchTypeArr[0] : ITouchStyle.TouchType.DOWN;
    }

    private AnimConfig[] getUpConfig(AnimConfig... animConfigArr) {
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mUpConfig);
    }

    private void handleClick(View view, MotionEvent motionEvent) {
        if (this.mIsDown && this.mClickListener != null && this.mTouchIndex == motionEvent.getActionIndex()) {
            IAnimTarget target = this.mState.getTarget();
            if ((target instanceof ViewTarget) && isInTouchSlop(view, motionEvent)) {
                View targetObject = ((ViewTarget) target).getTargetObject();
                targetObject.performClick();
                invokeClick(targetObject);
            }
        }
    }

    private void handleListViewTouch(AbsListView absListView, View view, boolean z, AnimConfig... animConfigArr) {
        ListViewTouchListener listViewTouchListener = getListViewTouchListener(absListView);
        if (listViewTouchListener == null) {
            listViewTouchListener = new ListViewTouchListener(absListView);
            absListView.setTag(C2945b.f11152b, listViewTouchListener);
        }
        if (z) {
            absListView.setOnTouchListener(listViewTouchListener);
        }
        listViewTouchListener.putListener(view, new InnerListViewTouchListener(this, animConfigArr));
    }

    /* access modifiers changed from: private */
    public void handleMotionEvent(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                handleClick(view, motionEvent);
            } else if (actionMasked == 2) {
                onEventMove(motionEvent, view, animConfigArr);
                return;
            }
            onEventUp(animConfigArr);
            return;
        }
        recordDownEvent(motionEvent);
        onEventDown(animConfigArr);
    }

    private void handleViewTouch(View view, AnimConfig... animConfigArr) {
        InnerViewTouchListener innerViewTouchListener = sTouchRecord.get(view);
        if (innerViewTouchListener == null) {
            innerViewTouchListener = new InnerViewTouchListener();
            sTouchRecord.put(view, innerViewTouchListener);
        }
        view.setOnTouchListener(innerViewTouchListener);
        innerViewTouchListener.addTouch(this, animConfigArr);
    }

    private void initScaleDist(IAnimTarget iAnimTarget) {
        View targetObject = iAnimTarget instanceof ViewTarget ? ((ViewTarget) iAnimTarget).getTargetObject() : null;
        if (targetObject != null) {
            this.mScaleDist = TypedValue.applyDimension(1, 10.0f, targetObject.getResources().getDisplayMetrics());
        }
    }

    /* access modifiers changed from: private */
    public void invokeClick(View view) {
        if (!this.mClickInvoked && !this.mLongClickInvoked) {
            this.mClickInvoked = true;
            this.mClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: private */
    public void invokeLongClick(View view) {
        if (!this.mLongClickInvoked) {
            this.mLongClickInvoked = true;
            this.mLongClickListener.onLongClick(view);
        }
    }

    private boolean isInTouchSlop(View view, MotionEvent motionEvent) {
        return CommonUtils.getDistance(this.mDownX, this.mDownY, motionEvent.getRawX(), motionEvent.getRawY()) < ((double) CommonUtils.getTouchSlop(view));
    }

    static boolean isOnTouchView(View view, int[] iArr, Rect rect, Rect rect2, MotionEvent motionEvent) {
        if (view == null) {
            return true;
        }
        view.getGlobalVisibleRect(rect);
        View rootView = view.getRootView();
        if (rootView != null) {
            rootView.getLocationOnScreen(iArr);
            rootView.getGlobalVisibleRect(rect2);
        } else {
            view.getLocationOnScreen(iArr);
            rect2.set(rect);
        }
        return rect.contains(((int) motionEvent.getRawX()) - iArr[0], (((int) motionEvent.getRawY()) - iArr[1]) + rect2.top);
    }

    private boolean isScaleSet(ITouchStyle.TouchType touchType) {
        return Boolean.TRUE.equals(this.mScaleSetMap.get(touchType));
    }

    private void onEventDown(AnimConfig... animConfigArr) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("onEventDown, touchDown", new Object[0]);
        }
        this.mIsDown = true;
        touchDown(animConfigArr);
    }

    private void onEventMove(MotionEvent motionEvent, View view, AnimConfig... animConfigArr) {
        if (!this.mIsDown) {
            return;
        }
        if (!isOnTouchView(view, this.mLocationInScreen, this.mGlobalBoundInWindow, this.mRootGlobalBoundInWindow, motionEvent)) {
            touchUp(animConfigArr);
            resetTouchStatus();
        } else if (this.mLongClickTask != null && !isInTouchSlop(view, motionEvent)) {
            this.mLongClickTask.stop(this);
        }
    }

    /* access modifiers changed from: private */
    public void onEventUp(AnimConfig... animConfigArr) {
        if (this.mIsDown) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("onEventUp, touchUp", new Object[0]);
            }
            touchUp(animConfigArr);
            resetTouchStatus();
        }
    }

    private void recordDownEvent(MotionEvent motionEvent) {
        if (this.mClickListener != null || this.mLongClickListener != null) {
            this.mTouchIndex = motionEvent.getActionIndex();
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
            this.mClickInvoked = false;
            this.mLongClickInvoked = false;
            startLongClickTask();
        }
    }

    private void resetTouchStatus() {
        LongClickTask longClickTask = this.mLongClickTask;
        if (longClickTask != null) {
            longClickTask.stop(this);
        }
        this.mIsDown = false;
        this.mTouchIndex = 0;
        this.mDownX = 0.0f;
        this.mDownY = 0.0f;
    }

    private View resetView(WeakReference<View> weakReference) {
        View view = weakReference.get();
        if (view != null) {
            view.setOnTouchListener((View.OnTouchListener) null);
        }
        return view;
    }

    /* access modifiers changed from: private */
    public void resetViewTouch(View view, boolean z) {
        view.setClickable(z);
        view.setOnTouchListener((View.OnTouchListener) null);
    }

    private void setClickAndLongClickListener(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        IAnimTarget target = this.mState.getTarget();
        View targetObject = target instanceof ViewTarget ? ((ViewTarget) target).getTargetObject() : null;
        if (targetObject != null) {
            if (this.mClickListener != null && onClickListener == null) {
                targetObject.setOnClickListener((View.OnClickListener) null);
            } else if (onClickListener != null) {
                targetObject.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        FolmeTouch.this.invokeClick(view);
                    }
                });
            }
            this.mClickListener = onClickListener;
            if (this.mLongClickListener != null && onLongClickListener == null) {
                targetObject.setOnLongClickListener((View.OnLongClickListener) null);
            } else if (onLongClickListener != null) {
                targetObject.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        if (FolmeTouch.this.mLongClickInvoked) {
                            return false;
                        }
                        FolmeTouch.this.invokeLongClick(view);
                        return true;
                    }
                });
            }
            this.mLongClickListener = onLongClickListener;
        }
    }

    private void setHoverCorner(float f) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            ((View) targetObject).setTag(C1991R.C1992id.miuix_animation_tag_view_hover_corners, Float.valueOf(f));
        }
    }

    private void setTargetValue(int i, Object obj) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            ((View) targetObject).setTag(i, obj);
        }
    }

    private void setTintColor() {
        if (!this.mSetTint && !this.mClearTint) {
            int argb = Color.argb(20, 0, 0, 0);
            Object targetObject = this.mState.getTarget().getTargetObject();
            if (targetObject instanceof View) {
                argb = ((View) targetObject).getResources().getColor(C2944a.f11150c);
            }
            ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
            this.mState.getState(ITouchStyle.TouchType.DOWN).add(foregroundProperty, (double) argb);
            this.mState.getState(ITouchStyle.TouchType.UP).add(foregroundProperty, 0.0d);
        }
    }

    private boolean setTouchView(View view) {
        WeakReference<View> weakReference = this.mTouchView;
        if ((weakReference != null ? weakReference.get() : null) == view) {
            return false;
        }
        this.mTouchView = new WeakReference<>(view);
        return true;
    }

    private void startLongClickTask() {
        if (this.mLongClickListener != null) {
            if (this.mLongClickTask == null) {
                this.mLongClickTask = new LongClickTask();
            }
            this.mLongClickTask.start(this);
        }
    }

    public void bindViewOfListItem(final View view, final AnimConfig... animConfigArr) {
        if (setTouchView(view)) {
            CommonUtils.runOnPreDraw(view, new Runnable() {
                public void run() {
                    boolean unused = FolmeTouch.this.bindListView(view, false, animConfigArr);
                }
            });
        }
    }

    public void cancel() {
        super.cancel();
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.cancel();
        }
    }

    public void clean() {
        super.clean();
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.clean();
        }
        this.mScaleSetMap.clear();
        WeakReference<View> weakReference = this.mTouchView;
        if (weakReference != null) {
            resetView(weakReference);
            this.mTouchView = null;
        }
        WeakReference<View> weakReference2 = this.mListView;
        if (weakReference2 != null) {
            View resetView = resetView(weakReference2);
            if (resetView != null) {
                resetView.setTag(C2945b.f11152b, (Object) null);
            }
            this.mListView = null;
        }
        resetTouchStatus();
    }

    public ITouchStyle clearTintColor() {
        this.mClearTint = true;
        ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
        this.mState.getState(ITouchStyle.TouchType.DOWN).remove(foregroundProperty);
        this.mState.getState(ITouchStyle.TouchType.UP).remove(foregroundProperty);
        return this;
    }

    public void handleTouchOf(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, AnimConfig... animConfigArr) {
        doHandleTouchOf(view, onClickListener, onLongClickListener, false, animConfigArr);
    }

    public void handleTouchOf(View view, View.OnClickListener onClickListener, AnimConfig... animConfigArr) {
        doHandleTouchOf(view, onClickListener, (View.OnLongClickListener) null, false, animConfigArr);
    }

    public void handleTouchOf(View view, boolean z, AnimConfig... animConfigArr) {
        doHandleTouchOf(view, (View.OnClickListener) null, (View.OnLongClickListener) null, z, animConfigArr);
    }

    public void handleTouchOf(View view, AnimConfig... animConfigArr) {
        handleTouchOf(view, false, animConfigArr);
    }

    public void ignoreTouchOf(View view) {
        InnerViewTouchListener innerViewTouchListener = sTouchRecord.get(view);
        if (innerViewTouchListener != null && innerViewTouchListener.removeTouch(this)) {
            sTouchRecord.remove(view);
        }
    }

    public void onMotionEvent(MotionEvent motionEvent) {
        handleMotionEvent((View) null, motionEvent, new AnimConfig[0]);
    }

    public void onMotionEventEx(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        handleMotionEvent(view, motionEvent, animConfigArr);
    }

    public ITouchStyle setAlpha(float f, ITouchStyle.TouchType... touchTypeArr) {
        this.mState.getState(getType(touchTypeArr)).add(ViewProperty.ALPHA, (double) f);
        return this;
    }

    public ITouchStyle setBackgroundColor(float f, float f2, float f3, float f4) {
        return setBackgroundColor(Color.argb((int) (f * 255.0f), (int) (f2 * 255.0f), (int) (f3 * 255.0f), (int) (f4 * 255.0f)));
    }

    public ITouchStyle setBackgroundColor(int i) {
        ViewPropertyExt.BackgroundProperty backgroundProperty = ViewPropertyExt.BACKGROUND;
        this.mState.getState(ITouchStyle.TouchType.DOWN).add(backgroundProperty, (double) i);
        this.mState.getState(ITouchStyle.TouchType.UP).add(backgroundProperty, (double) ((int) AnimValueUtils.getValueOfTarget(this.mState.getTarget(), backgroundProperty, 0.0d)));
        return this;
    }

    public void setFontStyle(FolmeFont folmeFont) {
        this.mFontStyle = folmeFont;
    }

    public ITouchStyle setScale(float f, ITouchStyle.TouchType... touchTypeArr) {
        ITouchStyle.TouchType type = getType(touchTypeArr);
        this.mScaleSetMap.put(type, Boolean.TRUE);
        double d = (double) f;
        this.mState.getState(type).add(ViewProperty.SCALE_X, d).add(ViewProperty.SCALE_Y, d);
        return this;
    }

    public ITouchStyle setTint(float f, float f2, float f3, float f4) {
        return setTint(Color.argb((int) (f * 255.0f), (int) (f2 * 255.0f), (int) (f3 * 255.0f), (int) (f4 * 255.0f)));
    }

    public ITouchStyle setTint(int i) {
        boolean z = true;
        this.mSetTint = true;
        if (i != 0) {
            z = false;
        }
        this.mClearTint = z;
        this.mState.getState(ITouchStyle.TouchType.DOWN).add(ViewPropertyExt.FOREGROUND, (double) i);
        return this;
    }

    public ITouchStyle setTintMode(int i) {
        this.mDownConfig.setTintMode(i);
        this.mUpConfig.setTintMode(i);
        return this;
    }

    public void setTouchDown() {
        setTintColor();
        this.mState.setTo((Object) ITouchStyle.TouchType.DOWN);
    }

    public ITouchStyle setTouchPadding(float f, float f2, float f3, float f4) {
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_padding_rect, new RectF(f, f2, f3, f4));
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_rect_location_mode, 4);
        return this;
    }

    public ITouchStyle setTouchRadius(float f) {
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_corners, Float.valueOf(f));
        return this;
    }

    public ITouchStyle setTouchRadius(float f, float f2, float f3, float f4) {
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_corners, new RectF(f, f2, f3, f4));
        return this;
    }

    public ITouchStyle setTouchRect(RectF rectF, ITouchStyle.TouchRectGravity touchRectGravity) {
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_rect, rectF);
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_rect_gravity, touchRectGravity);
        setTargetValue(C1991R.C1992id.miuix_animation_tag_view_touch_rect_location_mode, Integer.valueOf(ForegroundColorStyle.MIUIX_TOUCH_RECT_LOCATION_MODE_RELATIVE));
        return this;
    }

    public void setTouchUp() {
        this.mState.setTo((Object) ITouchStyle.TouchType.UP);
    }

    public void touchDown(AnimConfig... animConfigArr) {
        setHoverCorner(0.0f);
        setTintColor();
        AnimConfig[] downConfig = getDownConfig(animConfigArr);
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.mo6846to(this.mDownWeight, downConfig);
        }
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        ITouchStyle.TouchType touchType = ITouchStyle.TouchType.DOWN;
        AnimState state = iFolmeStateStyle.getState(touchType);
        if (!isScaleSet(touchType)) {
            IAnimTarget target = this.mState.getTarget();
            float max = Math.max(target.getValue(ViewProperty.WIDTH), target.getValue(ViewProperty.HEIGHT));
            double max2 = (double) Math.max((max - this.mScaleDist) / max, DEFAULT_SCALE);
            state.add(ViewProperty.SCALE_X, max2).add(ViewProperty.SCALE_Y, max2);
        }
        this.mState.mo6815to(state, downConfig);
    }

    public void touchUp(AnimConfig... animConfigArr) {
        AnimConfig[] upConfig = getUpConfig(animConfigArr);
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.mo6846to(this.mUpWeight, upConfig);
        }
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        iFolmeStateStyle.mo6815to(iFolmeStateStyle.getState(ITouchStyle.TouchType.UP), upConfig);
    }

    public ITouchStyle useVarFont(TextView textView, int i, int i2, int i3) {
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            this.mUpWeight = i2;
            this.mDownWeight = i3;
            folmeFont.useAt(textView, i, i2);
        }
        return this;
    }
}
