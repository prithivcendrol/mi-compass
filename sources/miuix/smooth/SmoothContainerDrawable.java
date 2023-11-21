package miuix.smooth;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050h4.C1631a;

public class SmoothContainerDrawable extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private static final PorterDuffXfermode f9202f = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* renamed from: d */
    private ContainerState f9203d;

    /* renamed from: e */
    private C1631a f9204e;

    static class ChildDrawable {
        Drawable mDrawable;

        ChildDrawable() {
        }

        ChildDrawable(ChildDrawable childDrawable, SmoothContainerDrawable smoothContainerDrawable, Resources resources, Resources.Theme theme) {
            Drawable drawable;
            Drawable drawable2 = childDrawable.mDrawable;
            if (drawable2 != null) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                drawable = constantState == null ? drawable2 : resources == null ? constantState.newDrawable() : theme == null ? constantState.newDrawable(resources) : constantState.newDrawable(resources, theme);
                drawable.setLayoutDirection(drawable2.getLayoutDirection());
                drawable.setBounds(drawable2.getBounds());
                drawable.setLevel(drawable2.getLevel());
                drawable.setCallback(smoothContainerDrawable);
            } else {
                drawable = null;
            }
            this.mDrawable = drawable;
        }
    }

    static final class ContainerState extends Drawable.ConstantState {
        ChildDrawable mChildDrawable;
        int mLayerType;
        float[] mRadii;
        float mRadius;
        int mStrokeColor;
        int mStrokeWidth;

        public ContainerState() {
            this.mLayerType = 0;
            this.mChildDrawable = new ChildDrawable();
        }

        public ContainerState(ContainerState containerState, SmoothContainerDrawable smoothContainerDrawable, Resources resources, Resources.Theme theme) {
            this.mLayerType = 0;
            this.mChildDrawable = new ChildDrawable(containerState.mChildDrawable, smoothContainerDrawable, resources, theme);
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
            return this.mChildDrawable.mDrawable.getAlpha();
        }

        public Rect getBounds() {
            return this.mChildDrawable.mDrawable.getBounds();
        }

        public int getChangingConfigurations() {
            return this.mChildDrawable.mDrawable.getChangingConfigurations();
        }

        public Rect getDirtyBounds() {
            return this.mChildDrawable.mDrawable.getDirtyBounds();
        }

        public int getIntrinsicHeight() {
            return this.mChildDrawable.mDrawable.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mChildDrawable.mDrawable.getIntrinsicWidth();
        }

        public int getOpacity() {
            return this.mChildDrawable.mDrawable.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mChildDrawable.mDrawable.getPadding(rect);
        }

        public final boolean isStateful() {
            return this.mChildDrawable.mDrawable.isStateful();
        }

        public void jumpToCurrentState() {
            this.mChildDrawable.mDrawable.jumpToCurrentState();
        }

        public Drawable newDrawable() {
            return new SmoothContainerDrawable((Resources) null, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources) {
            return new SmoothContainerDrawable(resources, (Resources.Theme) null, this);
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new SmoothContainerDrawable(resources, theme, this);
        }

        public void onBoundsChange(Rect rect) {
            this.mChildDrawable.mDrawable.setBounds(rect);
        }

        public boolean onStateChange(int[] iArr) {
            return isStateful() && this.mChildDrawable.mDrawable.setState(iArr);
        }

        public void setAlpha(int i) {
            this.mChildDrawable.mDrawable.setAlpha(i);
            this.mChildDrawable.mDrawable.invalidateSelf();
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            this.mChildDrawable.mDrawable.setBounds(i, i2, i3, i4);
        }

        public void setBounds(Rect rect) {
            this.mChildDrawable.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i) {
            this.mChildDrawable.mDrawable.setChangingConfigurations(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mChildDrawable.mDrawable.setColorFilter(colorFilter);
        }

        public void setDither(boolean z) {
            this.mChildDrawable.mDrawable.setDither(z);
        }

        public void setFilterBitmap(boolean z) {
            this.mChildDrawable.mDrawable.setFilterBitmap(z);
        }
    }

    public SmoothContainerDrawable() {
        this.f9204e = new C1631a();
        this.f9203d = new ContainerState();
    }

    private SmoothContainerDrawable(Resources resources, Resources.Theme theme, ContainerState containerState) {
        this.f9204e = new C1631a();
        this.f9203d = new ContainerState(containerState, this, resources, theme);
        this.f9204e.mo5810j(containerState.mStrokeWidth);
        this.f9204e.mo5809i(containerState.mStrokeColor);
        this.f9204e.mo5807g(containerState.mRadii);
        this.f9204e.mo5808h(containerState.mRadius);
    }

    /* renamed from: d */
    private void m10084d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                        ChildDrawable childDrawable = new ChildDrawable();
                        Drawable createFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        childDrawable.mDrawable = createFromXmlInner;
                        createFromXmlInner.setCallback(this);
                        this.f9203d.mChildDrawable = childDrawable;
                        return;
                    }
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <child> tag requires a 'drawable' attribute or child tag defining a drawable");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private TypedArray m10085e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public final Rect mo9109a() {
        return this.f9203d.getBounds();
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.f9203d.mChildDrawable.mDrawable.applyTheme(theme);
    }

    /* renamed from: b */
    public float mo9111b() {
        return this.f9203d.mRadius;
    }

    /* renamed from: c */
    public int mo9112c() {
        return this.f9203d.mLayerType;
    }

    public boolean canApplyTheme() {
        ContainerState containerState = this.f9203d;
        return (containerState != null && containerState.canApplyTheme()) || super.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        int i;
        if (mo9112c() != 2) {
            i = canvas.saveLayer((float) mo9109a().left, (float) mo9109a().top, (float) mo9109a().right, (float) mo9109a().bottom, (Paint) null, 31);
        } else {
            i = -1;
        }
        this.f9203d.mChildDrawable.mDrawable.draw(canvas);
        this.f9204e.mo5802a(canvas, f9202f);
        if (mo9112c() != 2) {
            canvas.restoreToCount(i);
        }
        this.f9204e.mo5803b(canvas);
    }

    /* renamed from: f */
    public void mo9115f(float[] fArr) {
        this.f9203d.mRadii = fArr;
        this.f9204e.mo5807g(fArr);
        if (fArr == null) {
            this.f9203d.mRadius = 0.0f;
            this.f9204e.mo5808h(0.0f);
        }
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo9116g(float f) {
        if (!Float.isNaN(f)) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            ContainerState containerState = this.f9203d;
            containerState.mRadius = f;
            containerState.mRadii = null;
            this.f9204e.mo5808h(f);
            this.f9204e.mo5807g((float[]) null);
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f9203d.getAlpha();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f9203d;
    }

    public Rect getDirtyBounds() {
        return this.f9203d.getDirtyBounds();
    }

    public int getIntrinsicHeight() {
        return this.f9203d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9203d.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f9203d.getOpacity();
    }

    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f9204e.mo5804c(mo9109a()));
        } else {
            outline.setRoundRect(mo9109a(), mo9111b());
        }
    }

    public boolean getPadding(Rect rect) {
        return this.f9203d.getPadding(rect);
    }

    /* renamed from: h */
    public void mo9125h(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        ContainerState containerState = this.f9203d;
        if (containerState.mLayerType != i) {
            containerState.mLayerType = i;
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public void mo9126i(int i) {
        ContainerState containerState = this.f9203d;
        if (containerState.mStrokeColor != i) {
            containerState.mStrokeColor = i;
            this.f9204e.mo5809i(i);
            invalidateSelf();
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray e = m10085e(resources, theme, attributeSet, C2383a.f9252l);
        mo9116g((float) e.getDimensionPixelSize(C2383a.f9253m, 0));
        int i = C2383a.f9254n;
        if (e.hasValue(i) || e.hasValue(C2383a.f9255o) || e.hasValue(C2383a.f9257q) || e.hasValue(C2383a.f9256p)) {
            float dimensionPixelSize = (float) e.getDimensionPixelSize(i, 0);
            float dimensionPixelSize2 = (float) e.getDimensionPixelSize(C2383a.f9255o, 0);
            float dimensionPixelSize3 = (float) e.getDimensionPixelSize(C2383a.f9257q, 0);
            float dimensionPixelSize4 = (float) e.getDimensionPixelSize(C2383a.f9256p, 0);
            mo9115f(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        mo9130j(e.getDimensionPixelSize(C2383a.f9260t, 0));
        mo9126i(e.getColor(C2383a.f9259s, 0));
        mo9125h(e.getInt(C2383a.f9258r, 0));
        e.recycle();
        m10084d(resources, xmlPullParser, attributeSet, theme);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        return this.f9203d.isStateful();
    }

    /* renamed from: j */
    public void mo9130j(int i) {
        ContainerState containerState = this.f9203d;
        if (containerState.mStrokeWidth != i) {
            containerState.mStrokeWidth = i;
            this.f9204e.mo5810j(i);
            invalidateSelf();
        }
    }

    public void jumpToCurrentState() {
        this.f9203d.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9203d.onBoundsChange(rect);
        this.f9204e.mo5805e(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f9203d.onStateChange(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f9203d.setAlpha(i);
        this.f9204e.mo5806f(i);
        invalidateSelf();
    }

    public void setChangingConfigurations(int i) {
        this.f9203d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9203d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f9203d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9203d.setFilterBitmap(z);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
