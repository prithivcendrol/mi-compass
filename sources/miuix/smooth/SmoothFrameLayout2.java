package miuix.smooth;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SmoothFrameLayout2 extends FrameLayout {

    /* renamed from: d */
    private RectF f9215d;

    /* renamed from: e */
    private float f9216e;

    /* renamed from: f */
    private Paint f9217f;

    /* renamed from: g */
    private Paint f9218g;

    /* renamed from: h */
    private int f9219h;

    /* renamed from: i */
    private int f9220i;

    /* renamed from: j */
    private Path f9221j;

    /* renamed from: k */
    private float[] f9222k;

    /* renamed from: l */
    private float[] f9223l;

    /* renamed from: m */
    private boolean f9224m;

    /* renamed from: n */
    private boolean f9225n;

    public SmoothFrameLayout2(Context context) {
        this(context, (AttributeSet) null);
    }

    public SmoothFrameLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmoothFrameLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9215d = new RectF();
        this.f9221j = new Path();
        this.f9225n = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2383a.f9231F);
        this.f9216e = (float) obtainStyledAttributes.getDimensionPixelSize(C2383a.f9232G, 0);
        int i2 = C2383a.f9233H;
        if (obtainStyledAttributes.hasValue(i2) || obtainStyledAttributes.hasValue(C2383a.f9234I) || obtainStyledAttributes.hasValue(C2383a.f9236K) || obtainStyledAttributes.hasValue(C2383a.f9235J)) {
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(i2, 0);
            float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(C2383a.f9234I, 0);
            float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(C2383a.f9236K, 0);
            float dimensionPixelSize4 = (float) obtainStyledAttributes.getDimensionPixelSize(C2383a.f9235J, 0);
            setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        this.f9219h = obtainStyledAttributes.getDimensionPixelSize(C2383a.f9238M, 0);
        this.f9220i = obtainStyledAttributes.getColor(C2383a.f9237L, 0);
        this.f9224m = obtainStyledAttributes.getBoolean(C2383a.f9229D, true);
        Boolean bool = C2385c.f9267a;
        if (bool != null) {
            this.f9224m = bool.booleanValue();
        }
        if (this.f9224m) {
            setSmoothCornerEnable(true);
        }
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f9217f = paint;
        paint.setFlags(1);
        Paint paint2 = new Paint();
        this.f9218g = paint2;
        paint2.setFlags(1);
        this.f9218g.setStyle(Paint.Style.STROKE);
        this.f9218g.setStrokeWidth((float) this.f9219h);
        this.f9218g.setColor(this.f9220i);
    }

    /* renamed from: a */
    private void m10105a(Canvas canvas) {
        this.f9221j.reset();
        float f = ((float) this.f9219h) * 0.5f;
        float[] fArr = this.f9222k;
        if (fArr == null) {
            Path path = this.f9221j;
            RectF rectF = this.f9215d;
            float f2 = rectF.bottom - f;
            float f3 = this.f9216e;
            path.addRoundRect(rectF.left + f, rectF.top + f, rectF.right - f, f2, f3 + f, f3 + f, Path.Direction.CW);
        } else {
            float[] fArr2 = (float[]) fArr.clone();
            this.f9223l = fArr2;
            float[] fArr3 = this.f9222k;
            fArr2[0] = fArr3[0] + f;
            fArr2[1] = fArr3[1] + f;
            fArr2[2] = fArr3[2] + f;
            fArr2[3] = fArr3[3] + f;
            Path path2 = this.f9221j;
            RectF rectF2 = this.f9215d;
            path2.addRoundRect(rectF2.left + f, rectF2.top + f, rectF2.right - f, rectF2.bottom - f, fArr2, Path.Direction.CW);
        }
        canvas.clipPath(this.f9221j);
    }

    /* renamed from: b */
    private void m10106b(Canvas canvas) {
        this.f9221j.reset();
        float[] fArr = this.f9222k;
        if (fArr == null) {
            Path path = this.f9221j;
            RectF rectF = this.f9215d;
            float f = this.f9216e;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else {
            this.f9221j.addRoundRect(this.f9215d, fArr, Path.Direction.CW);
        }
        canvas.clipPath(this.f9221j);
    }

    /* renamed from: c */
    private void m10107c(Canvas canvas) {
        this.f9221j.reset();
        float f = ((float) this.f9219h) * 0.5f;
        float[] fArr = this.f9222k;
        if (fArr == null) {
            Path path = this.f9221j;
            RectF rectF = this.f9215d;
            float f2 = rectF.bottom - f;
            float f3 = this.f9216e;
            path.addRoundRect(rectF.left + f, rectF.top + f, rectF.right - f, f2, f3 + f, f3 + f, Path.Direction.CW);
        } else {
            float[] fArr2 = (float[]) fArr.clone();
            this.f9223l = fArr2;
            float[] fArr3 = this.f9222k;
            fArr2[0] = fArr3[0] + f;
            fArr2[1] = fArr3[1] + f;
            fArr2[2] = fArr3[2] + f;
            fArr2[3] = fArr3[3] + f;
            Path path2 = this.f9221j;
            RectF rectF2 = this.f9215d;
            path2.addRoundRect(rectF2.left + f, rectF2.top + f, rectF2.right - f, rectF2.bottom - f, fArr2, Path.Direction.CW);
        }
        canvas.drawPath(this.f9221j, this.f9218g);
    }

    /* renamed from: d */
    private void m10108d() {
        invalidateOutline();
        invalidate();
    }

    private void setSmoothCornerEnable(boolean z) {
        C2385c.m10112c(this, z);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        if (!this.f9225n) {
            m10106b(canvas);
        }
        if (this.f9219h > 0) {
            int save2 = canvas.save();
            m10105a(canvas);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save2);
        } else {
            super.dispatchDraw(canvas);
        }
        if (!this.f9225n && this.f9219h > 0) {
            m10107c(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        m10106b(canvas);
        this.f9225n = true;
        if (this.f9219h > 0) {
            int save2 = canvas.save();
            m10105a(canvas);
            super.draw(canvas);
            canvas.restoreToCount(save2);
        } else {
            super.draw(canvas);
        }
        if (this.f9219h > 0) {
            m10107c(canvas);
        }
        this.f9225n = false;
        canvas.restoreToCount(save);
    }

    public float[] getCornerRadii() {
        return (float[]) this.f9222k.clone();
    }

    public float getCornerRadius() {
        return this.f9216e;
    }

    public int getStrokeColor() {
        return this.f9220i;
    }

    public int getStrokeWidth() {
        return this.f9219h;
    }

    public boolean getUseSmooth() {
        return this.f9224m;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9215d.set(0.0f, 0.0f, (float) i, (float) i2);
    }

    public void setCornerRadii(float[] fArr) {
        this.f9222k = fArr;
        m10108d();
    }

    public void setCornerRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f9216e = f;
        this.f9222k = null;
        m10108d();
    }

    public void setStrokeColor(int i) {
        this.f9220i = i;
        m10108d();
    }

    public void setStrokeWidth(int i) {
        this.f9219h = i;
        m10108d();
    }

    public void setUseSmooth(boolean z) {
        this.f9224m = z;
        setSmoothCornerEnable(z);
    }
}
