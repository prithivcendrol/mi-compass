package miuix.animation.styles;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import miuix.animation.C1991R;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.utils.CommonUtils;

public class TintDrawable extends Drawable {
    private static final View.OnAttachStateChangeListener sListener = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            TintDrawable tintDrawable = TintDrawable.get(view);
            if (tintDrawable != null) {
                Drawable access$000 = tintDrawable.mOriDrawable;
                if (access$000 != null) {
                    view.setForeground(access$000);
                }
                tintDrawable.clear();
                view.removeOnAttachStateChangeListener(this);
            }
        }
    };
    private final int TINT_STYLE_HOVER = 4;
    private final int TINT_STYLE_RECT_ROUND = 2;
    private final int TINT_STYLE_VIEW_SHAPE = 1;
    private final float TOUCH_RADIUS_RECT_ROUND_DEFAULT = 26.0f;
    private Bitmap mBitmap;
    private RectF mBounds = new RectF();
    private RectF mCornerBounds = new RectF();
    private float mHoverRadius = 0.0f;
    /* access modifiers changed from: private */
    public Drawable mOriDrawable;
    private Paint mPaint = new Paint();
    private Rect mSrcRect = new Rect();
    private int mTintStyle = 1;
    private float[] mTouchRadius = {0.0f};
    private ITouchStyle.TouchRectGravity mTouchRectGravity = ITouchStyle.TouchRectGravity.CENTER_IN_PARENT;
    private int mTouchRectLocationMode = 1;
    private RectF mTouchRectRoundPadding = new RectF();
    private RectF mTouchRectRoundRect = null;
    private View mView;

    /* renamed from: miuix.animation.styles.TintDrawable$3 */
    static /* synthetic */ class C20513 {
        static final /* synthetic */ int[] $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                miuix.animation.ITouchStyle$TouchRectGravity[] r0 = miuix.animation.ITouchStyle.TouchRectGravity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity = r0
                miuix.animation.ITouchStyle$TouchRectGravity r1 = miuix.animation.ITouchStyle.TouchRectGravity.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity     // Catch:{ NoSuchFieldError -> 0x001d }
                miuix.animation.ITouchStyle$TouchRectGravity r1 = miuix.animation.ITouchStyle.TouchRectGravity.TOP_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity     // Catch:{ NoSuchFieldError -> 0x0028 }
                miuix.animation.ITouchStyle$TouchRectGravity r1 = miuix.animation.ITouchStyle.TouchRectGravity.CENTER_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity     // Catch:{ NoSuchFieldError -> 0x0033 }
                miuix.animation.ITouchStyle$TouchRectGravity r1 = miuix.animation.ITouchStyle.TouchRectGravity.CENTER_IN_PARENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.animation.styles.TintDrawable.C20513.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void clear() {
        recycleBitmap();
    }

    private void createBitmap(int i, int i2) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.getWidth() != i || this.mBitmap.getHeight() != this.mView.getHeight()) {
            recycleBitmap();
            this.mPaint.setAntiAlias(true);
            try {
                this.mBitmap = Bitmap.createBitmap(this.mView.getResources().getDisplayMetrics(), i, i2, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                Log.w(CommonUtils.TAG, "TintDrawable.createBitmap failed, out of memory");
            }
        }
    }

    private void drawBlackeningByExtractingBg(Canvas canvas, int i) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            this.mView.setForeground(this.mOriDrawable);
            return;
        }
        this.mPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.mBitmap, this.mSrcRect, this.mBounds, this.mPaint);
    }

    private void drawHoverTint(Canvas canvas, int i) {
        this.mCornerBounds.set(this.mSrcRect);
        this.mPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        RectF rectF = this.mCornerBounds;
        float f = this.mHoverRadius;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    private void drawRectRound(Canvas canvas, int i) {
        RectF rectF;
        this.mPaint.setAntiAlias(true);
        this.mPaint.setShader((Shader) null);
        this.mPaint.setColorFilter((ColorFilter) null);
        this.mPaint.setColor(i);
        int i2 = this.mTouchRectLocationMode;
        if (i2 == 1) {
            setBounds((float) this.mView.getWidth(), (float) this.mView.getHeight());
            rectF = this.mBounds;
        } else if (i2 == 4) {
            setBounds((float) this.mView.getWidth(), (float) this.mView.getHeight());
            RectF rectF2 = this.mCornerBounds;
            Rect rect = this.mSrcRect;
            RectF rectF3 = this.mTouchRectRoundPadding;
            rectF2.left = ((float) rect.left) + rectF3.left;
            rectF2.top = ((float) rect.top) + rectF3.top;
            rectF2.right = ((float) rect.right) - rectF3.right;
            rectF2.bottom = ((float) rect.bottom) - rectF3.bottom;
            if (rectF2.width() < 0.0f) {
                RectF rectF4 = this.mCornerBounds;
                rectF4.right = rectF4.left;
            }
            if (this.mCornerBounds.height() < 0.0f) {
                RectF rectF5 = this.mCornerBounds;
                rectF5.bottom = rectF5.top;
            }
            rectF = this.mCornerBounds;
        } else if (i2 == 4104) {
            perFromDrawRoundRectRelative(canvas, i);
            return;
        } else {
            return;
        }
        realPerFromDrawRoundRect(canvas, i, rectF);
    }

    public static TintDrawable get(View view) {
        Drawable foreground = view.getForeground();
        if (foreground instanceof TintDrawable) {
            return (TintDrawable) foreground;
        }
        return null;
    }

    private void getRectRoundEnableFromView(int i) {
        this.mTintStyle = i == 3 ? 2 : this.mTintStyle;
    }

    private void getRectRoundGravityFromView() {
        Object tag = this.mView.getTag(C1991R.C1992id.miuix_animation_tag_view_touch_rect_gravity);
        if (tag instanceof ITouchStyle.TouchRectGravity) {
            this.mTouchRectGravity = (ITouchStyle.TouchRectGravity) tag;
        }
    }

    private void getRectRoundPaddingsFromView() {
        Object tag = this.mView.getTag(C1991R.C1992id.miuix_animation_tag_view_touch_padding_rect);
        if (tag instanceof RectF) {
            RectF rectF = (RectF) tag;
            this.mTouchRectRoundPadding.left = Math.max(rectF.left, 0.0f);
            this.mTouchRectRoundPadding.top = Math.max(rectF.top, 0.0f);
            this.mTouchRectRoundPadding.right = Math.max(rectF.right, 0.0f);
            this.mTouchRectRoundPadding.bottom = Math.max(rectF.bottom, 0.0f);
            return;
        }
        RectF rectF2 = this.mTouchRectRoundPadding;
        rectF2.left = 0.0f;
        rectF2.top = 0.0f;
        rectF2.right = 0.0f;
        rectF2.bottom = 0.0f;
    }

    private void getRectRoundRadiusFromView() {
        Object tag = this.mView.getTag(C1991R.C1992id.miuix_animation_tag_view_touch_corners);
        if ((tag instanceof Float) || (tag instanceof Integer)) {
            this.mTouchRadius = new float[]{((Float) tag).floatValue()};
        } else if (tag instanceof RectF) {
            float[] fArr = {26.0f, 26.0f, 26.0f, 26.0f, 26.0f, 26.0f, 26.0f, 26.0f};
            this.mTouchRadius = fArr;
            RectF rectF = (RectF) tag;
            fArr[0] = Math.max(rectF.left, 0.0f);
            this.mTouchRadius[1] = Math.max(rectF.left, 0.0f);
            this.mTouchRadius[2] = Math.max(rectF.top, 0.0f);
            this.mTouchRadius[3] = Math.max(rectF.top, 0.0f);
            this.mTouchRadius[4] = Math.max(rectF.right, 0.0f);
            this.mTouchRadius[5] = Math.max(rectF.right, 0.0f);
            this.mTouchRadius[6] = Math.max(rectF.bottom, 0.0f);
            this.mTouchRadius[7] = Math.max(rectF.bottom, 0.0f);
        } else {
            this.mTouchRadius = new float[]{26.0f};
        }
    }

    private void getTouchLocationModeFromView() {
        Object tag = this.mView.getTag(C1991R.C1992id.miuix_animation_tag_view_touch_rect_location_mode);
        this.mTouchRectLocationMode = tag instanceof Integer ? ((Integer) tag).intValue() : 1;
    }

    private void getTouchRectFromView() {
        Object tag = this.mView.getTag(C1991R.C1992id.miuix_animation_tag_view_touch_rect);
        if (tag instanceof RectF) {
            this.mTouchRectRoundRect = new RectF((RectF) tag);
        } else {
            this.mTouchRectRoundRect = null;
        }
    }

    private void initBitmap(int i) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            this.mView.setForeground(this.mOriDrawable);
            return;
        }
        try {
            this.mBitmap.eraseColor(0);
            Canvas canvas = new Canvas(this.mBitmap);
            canvas.translate((float) (-this.mView.getScrollX()), (float) (-this.mView.getScrollY()));
            this.mView.setForeground(this.mOriDrawable);
            this.mView.draw(canvas);
            this.mView.setForeground(this);
            if (i == 0) {
                try {
                    this.mPaint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Float.MAX_VALUE, 0.0f})));
                    canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
                } catch (Exception unused) {
                    Log.w(CommonUtils.TAG, "the Bitmap empty or Recycled");
                }
            }
        } catch (Exception e) {
            Log.w(CommonUtils.TAG, "TintDrawable.initBitmap failed, " + e);
        }
    }

    private void perFromDrawRoundRectRelative(Canvas canvas, int i) {
        int i2 = C20513.$SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity[this.mTouchRectGravity.ordinal()];
        if (i2 == 1) {
            setBounds(0.0f, 0.0f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        } else if (i2 == 2) {
            setBounds((((float) this.mView.getWidth()) - Math.max(0.0f, this.mTouchRectRoundRect.width())) * 0.5f, 0.0f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        } else if (i2 != 3) {
            setBounds((((float) this.mView.getWidth()) - Math.max(0.0f, this.mTouchRectRoundRect.width())) * 0.5f, (((float) this.mView.getHeight()) - Math.max(0.0f, this.mTouchRectRoundRect.height())) * 0.5f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        } else {
            setBounds(0.0f, (((float) this.mView.getHeight()) - Math.max(0.0f, this.mTouchRectRoundRect.height())) * 0.5f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        }
        realPerFromDrawRoundRect(canvas, i, this.mBounds);
    }

    private void processingOOMForDrawBitmap(RuntimeException runtimeException, Canvas canvas) {
        if (runtimeException.getMessage() == null || runtimeException.getMessage().length() <= 0 || !runtimeException.getMessage().contains("Canvas: trying to draw too large")) {
            throw runtimeException;
        }
        try {
            Bitmap compressImage = CommonUtils.compressImage(this.mBitmap, 50, 2);
            this.mBitmap = compressImage;
            canvas.drawBitmap(compressImage, this.mSrcRect, this.mBounds, this.mPaint);
        } catch (Exception e) {
            Log.w(CommonUtils.TAG, "TintDrawable.processingOOMForDrawBitmap failed, " + e);
        }
    }

    private void realPerFromDrawRoundRect(Canvas canvas, int i, RectF rectF) {
        float[] fArr = this.mTouchRadius;
        if (fArr.length == 1) {
            float f = fArr[0];
            canvas.drawRoundRect(rectF, f, f, this.mPaint);
        } else if (fArr.length == 8) {
            Path path = new Path();
            path.addRoundRect(rectF, this.mTouchRadius, Path.Direction.CCW);
            canvas.drawPath(path, this.mPaint);
        }
    }

    private void recycleBitmap() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmap = null;
        }
    }

    static TintDrawable setAndGet(final View view) {
        TintDrawable tintDrawable = get(view);
        if (tintDrawable != null) {
            return tintDrawable;
        }
        final TintDrawable tintDrawable2 = new TintDrawable();
        tintDrawable2.mView = view;
        tintDrawable2.setOriDrawable(view.getForeground());
        view.addOnAttachStateChangeListener(sListener);
        Folme.post(view, new Runnable() {
            public void run() {
                view.setForeground(tintDrawable2);
            }
        });
        return tintDrawable2;
    }

    private void setBounds(float f, float f2) {
        float scrollX = (float) this.mView.getScrollX();
        float scrollY = (float) this.mView.getScrollY();
        this.mBounds.set(scrollX, scrollY, scrollX + f, scrollY + f2);
        this.mSrcRect.set(0, 0, (int) f, (int) f2);
    }

    private void setBounds(float f, float f2, float f3, float f4) {
        this.mBounds.set(f, f2, f + f3, f2 + f4);
        this.mSrcRect.set(0, 0, (int) f3, (int) f4);
    }

    private void setOriDrawable(Drawable drawable) {
        this.mOriDrawable = drawable;
    }

    private void tintStyleLoadData() {
        getTouchLocationModeFromView();
        int i = this.mTouchRectLocationMode;
        if (i == 1) {
            getRectRoundRadiusFromView();
        } else if (i == 2) {
            getRectRoundRadiusFromView();
            getTouchRectFromView();
        } else if (i == 4) {
            getRectRoundRadiusFromView();
            getRectRoundPaddingsFromView();
        } else if (i == 4104) {
            getRectRoundRadiusFromView();
            getTouchRectFromView();
            getRectRoundGravityFromView();
        }
    }

    public void draw(Canvas canvas) {
        int scrollX = this.mView.getScrollX();
        int scrollY = this.mView.getScrollY();
        int width = this.mView.getWidth();
        int height = this.mView.getHeight();
        this.mBounds.set((float) scrollX, (float) scrollY, (float) (scrollX + width), (float) (scrollY + height));
        this.mSrcRect.set(0, 0, width, height);
        canvas.save();
        int intValue = ViewPropertyExt.FOREGROUND.getIntValue(this.mView);
        try {
            canvas.clipRect(this.mBounds);
            canvas.drawColor(0);
            Drawable drawable = this.mOriDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int i = this.mTintStyle;
            if (i == 2) {
                drawRectRound(canvas, intValue);
            } else if (i != 4) {
                drawBlackeningByExtractingBg(canvas, intValue);
            } else {
                drawHoverTint(canvas, intValue);
            }
        } catch (RuntimeException e) {
            processingOOMForDrawBitmap(e, canvas);
        } catch (Throwable th) {
            canvas.restore();
            throw th;
        }
        canvas.restore();
    }

    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: package-private */
    public void initTintBuffer(int i) {
        if (this.mView != null) {
            getRectRoundEnableFromView(i);
            int i2 = this.mTintStyle;
            if (i2 == 2) {
                tintStyleLoadData();
            } else if (i2 != 4) {
                int width = this.mView.getWidth();
                int height = this.mView.getHeight();
                if (width == 0 || height == 0) {
                    recycleBitmap();
                    return;
                }
                createBitmap(width, height);
                initBitmap(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreOriginalDrawable() {
        clear();
        invalidateSelf();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* access modifiers changed from: package-private */
    public void setHoverCorner(float f) {
        this.mTintStyle = f != 0.0f ? 4 : this.mTintStyle;
        this.mHoverRadius = f;
    }
}
