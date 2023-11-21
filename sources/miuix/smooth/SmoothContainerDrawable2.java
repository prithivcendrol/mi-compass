package miuix.smooth;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SmoothContainerDrawable2 extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private ContainerState f9205d;

    /* renamed from: e */
    private int f9206e;

    /* renamed from: f */
    private int f9207f;

    /* renamed from: g */
    private float[] f9208g;

    /* renamed from: h */
    private float[] f9209h;

    /* renamed from: i */
    private float f9210i;

    /* renamed from: j */
    private Paint f9211j;

    /* renamed from: k */
    private RectF f9212k;

    /* renamed from: l */
    private Path f9213l;

    /* renamed from: m */
    private boolean f9214m;

    static class ChildDrawableWrapper {
        Drawable mDrawable;

        ChildDrawableWrapper() {
            this.mDrawable = new GradientDrawable();
        }

        ChildDrawableWrapper(ChildDrawableWrapper childDrawableWrapper, SmoothContainerDrawable2 smoothContainerDrawable2, Resources resources, Resources.Theme theme) {
            Drawable drawable;
            Drawable drawable2 = childDrawableWrapper.mDrawable;
            if (drawable2 != null) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                drawable = constantState == null ? drawable2 : resources == null ? constantState.newDrawable() : theme == null ? constantState.newDrawable(resources) : constantState.newDrawable(resources, theme);
                drawable.setLayoutDirection(drawable2.getLayoutDirection());
                drawable.setBounds(drawable2.getBounds());
                drawable.setLevel(drawable2.getLevel());
                drawable.setCallback(smoothContainerDrawable2);
            } else {
                drawable = null;
            }
            this.mDrawable = drawable;
        }
    }

    static final class ContainerState extends Drawable.ConstantState {
        ChildDrawableWrapper mChildDrawableWrapper;
        int mLayerType;
        float[] mRadii;
        float mRadius;
        int mStrokeColor;
        int mStrokeWidth;

        public ContainerState() {
            this.mLayerType = 0;
            this.mChildDrawableWrapper = new ChildDrawableWrapper();
        }

        public ContainerState(ContainerState containerState, SmoothContainerDrawable2 smoothContainerDrawable2, Resources resources, Resources.Theme theme) {
            this.mLayerType = 0;
            this.mChildDrawableWrapper = new ChildDrawableWrapper(containerState.mChildDrawableWrapper, smoothContainerDrawable2, resources, theme);
            this.mRadius = containerState.mRadius;
            this.mRadii = containerState.mRadii;
            this.mStrokeWidth = containerState.mStrokeWidth;
            this.mStrokeColor = containerState.mStrokeColor;
            this.mLayerType = containerState.mLayerType;
        }

        public boolean canApplyTheme() {
            return true;
        }

        public int getAlpha() {
            return this.mChildDrawableWrapper.mDrawable.getAlpha();
        }

        public Rect getBounds() {
            return this.mChildDrawableWrapper.mDrawable.getBounds();
        }

        public int getChangingConfigurations() {
            return this.mChildDrawableWrapper.mDrawable.getChangingConfigurations();
        }

        public Rect getDirtyBounds() {
            return this.mChildDrawableWrapper.mDrawable.getDirtyBounds();
        }

        public int getIntrinsicHeight() {
            return this.mChildDrawableWrapper.mDrawable.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mChildDrawableWrapper.mDrawable.getIntrinsicWidth();
        }

        public int getOpacity() {
            return this.mChildDrawableWrapper.mDrawable.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mChildDrawableWrapper.mDrawable.getPadding(rect);
        }

        public final boolean isStateful() {
            return this.mChildDrawableWrapper.mDrawable.isStateful();
        }

        public void jumpToCurrentState() {
            this.mChildDrawableWrapper.mDrawable.jumpToCurrentState();
        }

        public Drawable newDrawable() {
            return new SmoothContainerDrawable2((Resources) null, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources) {
            return new SmoothContainerDrawable2(resources, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new SmoothContainerDrawable2(resources, theme, this);
        }

        public void onBoundsChange(Rect rect) {
            this.mChildDrawableWrapper.mDrawable.setBounds(rect);
        }

        public boolean onStateChange(int[] iArr) {
            return isStateful() && this.mChildDrawableWrapper.mDrawable.setState(iArr);
        }

        public void setAlpha(int i) {
            this.mChildDrawableWrapper.mDrawable.setAlpha(i);
            this.mChildDrawableWrapper.mDrawable.invalidateSelf();
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            this.mChildDrawableWrapper.mDrawable.setBounds(i, i2, i3, i4);
        }

        public void setBounds(Rect rect) {
            this.mChildDrawableWrapper.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i) {
            this.mChildDrawableWrapper.mDrawable.setChangingConfigurations(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mChildDrawableWrapper.mDrawable.setColorFilter(colorFilter);
        }

        public void setDither(boolean z) {
            this.mChildDrawableWrapper.mDrawable.setDither(z);
        }

        public void setFilterBitmap(boolean z) {
            this.mChildDrawableWrapper.mDrawable.setFilterBitmap(z);
        }
    }

    public SmoothContainerDrawable2() {
        this.f9212k = new RectF();
        this.f9213l = new Path();
        this.f9205d = new ContainerState();
        m10096c();
    }

    private SmoothContainerDrawable2(Resources resources, Resources.Theme theme, ContainerState containerState) {
        this.f9212k = new RectF();
        this.f9213l = new Path();
        this.f9205d = new ContainerState(containerState, this, resources, theme);
        this.f9206e = containerState.mStrokeWidth;
        this.f9207f = containerState.mStrokeColor;
        this.f9208g = containerState.mRadii;
        this.f9210i = containerState.mRadius;
        m10096c();
    }

    /* renamed from: a */
    private void m10094a(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        this.f9213l.reset();
        RectF rectF = this.f9212k;
        rectF.left = (float) bounds.left;
        rectF.top = (float) bounds.top;
        rectF.right = (float) bounds.right;
        rectF.bottom = (float) bounds.bottom;
        float[] fArr = this.f9208g;
        if (fArr == null) {
            Path path = this.f9213l;
            float f = this.f9210i;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else {
            this.f9213l.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        canvas.clipPath(this.f9213l);
        int i = this.f9206e;
        float f2 = ((float) i) * 0.5f;
        if (i != 0) {
            int save2 = canvas.save();
            this.f9212k.inset(f2, f2);
            this.f9213l.reset();
            float[] fArr2 = this.f9208g;
            if (fArr2 == null) {
                Path path2 = this.f9213l;
                RectF rectF2 = this.f9212k;
                float f3 = this.f9210i;
                path2.addRoundRect(rectF2, f3 + f2, f3 + f2, Path.Direction.CW);
            } else {
                float[] fArr3 = (float[]) fArr2.clone();
                this.f9209h = fArr3;
                float[] fArr4 = this.f9208g;
                fArr3[0] = fArr4[0] + f2;
                fArr3[1] = fArr4[1] + f2;
                fArr3[2] = fArr4[2] + f2;
                fArr3[3] = fArr4[3] + f2;
                this.f9213l.addRoundRect(this.f9212k, fArr3, Path.Direction.CCW);
            }
            canvas.clipPath(this.f9213l);
            this.f9205d.mChildDrawableWrapper.mDrawable.draw(canvas);
            canvas.restoreToCount(save2);
            canvas.drawPath(this.f9213l, this.f9211j);
        } else {
            this.f9205d.mChildDrawableWrapper.mDrawable.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: b */
    private void m10095b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("child")) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next == 2) {
                        ChildDrawableWrapper childDrawableWrapper = new ChildDrawableWrapper();
                        Drawable createFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        childDrawableWrapper.mDrawable = createFromXmlInner;
                        createFromXmlInner.setCallback(this);
                        this.f9205d.mChildDrawableWrapper = childDrawableWrapper;
                        return;
                    }
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <child> tag requires a 'drawable' attribute or child tag defining a drawable");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m10096c() {
        Paint paint = new Paint(1);
        this.f9211j = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f9211j.setColor(this.f9207f);
        this.f9211j.setStrokeWidth((float) this.f9206e);
    }

    /* renamed from: d */
    protected static TypedArray m10097d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: i */
    private void m10098i(boolean z) {
        C2385c.m10111b(this, z);
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.f9205d.mChildDrawableWrapper.mDrawable.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        ContainerState containerState = this.f9205d;
        return (containerState != null && containerState.canApplyTheme()) || super.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        m10094a(canvas);
    }

    /* renamed from: e */
    public void mo9167e(Drawable drawable) {
        if (this.f9205d != null) {
            ChildDrawableWrapper childDrawableWrapper = new ChildDrawableWrapper();
            childDrawableWrapper.mDrawable = drawable;
            drawable.setCallback(this);
            this.f9205d.mChildDrawableWrapper = childDrawableWrapper;
        }
    }

    /* renamed from: f */
    public void mo9168f(float[] fArr) {
        ContainerState containerState = this.f9205d;
        containerState.mRadii = fArr;
        this.f9208g = fArr;
        if (fArr == null) {
            containerState.mRadius = 0.0f;
            this.f9210i = 0.0f;
        }
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo9169g(float f) {
        if (!Float.isNaN(f)) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            ContainerState containerState = this.f9205d;
            containerState.mRadius = f;
            containerState.mRadii = null;
            this.f9210i = f;
            this.f9208g = null;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f9205d.getAlpha();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f9205d;
    }

    public Rect getDirtyBounds() {
        return this.f9205d.getDirtyBounds();
    }

    public int getIntrinsicHeight() {
        return this.f9205d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9205d.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f9205d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9205d.getPadding(rect);
    }

    /* renamed from: h */
    public void mo9177h(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        ContainerState containerState = this.f9205d;
        if (containerState.mLayerType != i) {
            containerState.mLayerType = i;
            invalidateSelf();
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray d = m10097d(resources, theme, attributeSet, C2383a.f9261u);
        mo9169g((float) d.getDimensionPixelSize(C2383a.f9262v, 0));
        int i = C2383a.f9263w;
        if (d.hasValue(i) || d.hasValue(C2383a.f9264x) || d.hasValue(C2383a.f9266z) || d.hasValue(C2383a.f9265y)) {
            float dimensionPixelSize = (float) d.getDimensionPixelSize(i, 0);
            float dimensionPixelSize2 = (float) d.getDimensionPixelSize(C2383a.f9264x, 0);
            float dimensionPixelSize3 = (float) d.getDimensionPixelSize(C2383a.f9266z, 0);
            float dimensionPixelSize4 = (float) d.getDimensionPixelSize(C2383a.f9265y, 0);
            mo9168f(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        mo9182k(d.getDimensionPixelSize(C2383a.f9228C, 0));
        mo9180j(d.getColor(C2383a.f9227B, 0));
        mo9177h(d.getInt(C2383a.f9226A, 0));
        this.f9214m = d.getBoolean(C2383a.f9229D, true);
        Boolean bool = C2385c.f9267a;
        if (bool != null) {
            this.f9214m = bool.booleanValue();
        }
        if (this.f9214m) {
            m10098i(true);
        }
        d.recycle();
        m10095b(resources, xmlPullParser, attributeSet, theme);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        return this.f9205d.isStateful();
    }

    /* renamed from: j */
    public void mo9180j(int i) {
        ContainerState containerState = this.f9205d;
        if (containerState.mStrokeColor != i) {
            containerState.mStrokeColor = i;
            this.f9207f = i;
            this.f9211j.setColor(i);
            invalidateSelf();
        }
    }

    public void jumpToCurrentState() {
        this.f9205d.jumpToCurrentState();
    }

    /* renamed from: k */
    public void mo9182k(int i) {
        ContainerState containerState = this.f9205d;
        if (containerState.mStrokeWidth != i) {
            containerState.mStrokeWidth = i;
            this.f9206e = i;
            this.f9211j.setStrokeWidth((float) i);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9205d.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f9205d.onStateChange(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f9205d.setAlpha(i);
        this.f9211j.setAlpha(i);
        invalidateSelf();
    }

    public void setChangingConfigurations(int i) {
        this.f9205d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9205d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f9205d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9205d.setFilterBitmap(z);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
