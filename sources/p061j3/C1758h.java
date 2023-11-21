package p061j3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;
import miuix.smooth.C2385c;
import p018c2.C1350f;

/* renamed from: j3.h */
public class C1758h extends FrameLayout {

    /* renamed from: d */
    private float[] f6769d;

    /* renamed from: e */
    private Path f6770e;

    /* renamed from: f */
    private Paint f6771f;

    /* renamed from: g */
    private Region f6772g;

    /* renamed from: h */
    private RectF f6773h;

    /* renamed from: i */
    private float f6774i;

    /* renamed from: j */
    private float f6775j;

    /* renamed from: k */
    private int f6776k;

    /* renamed from: l */
    private boolean f6777l;

    public C1758h(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1758h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1758h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7323a();
    }

    /* renamed from: a */
    private void m7323a() {
        float dimensionPixelSize = (float) getContext().getResources().getDimensionPixelSize(C1350f.f4629Y);
        this.f6774i = dimensionPixelSize;
        this.f6769d = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize};
        this.f6773h = new RectF();
        this.f6777l = true;
        C2385c.m10112c(this, true);
        this.f6770e = new Path();
        this.f6772g = new Region();
        Paint paint = new Paint();
        this.f6771f = paint;
        paint.setColor(-1);
        this.f6771f.setAntiAlias(true);
    }

    /* renamed from: b */
    private void m7324b(Canvas canvas) {
        if (this.f6769d != null && this.f6775j != 0.0f && Color.alpha(this.f6776k) != 0) {
            RectF rectF = new RectF();
            float f = this.f6775j / 2.0f;
            rectF.left = ((float) getPaddingLeft()) + f;
            rectF.top = ((float) getPaddingTop()) + f;
            rectF.right = ((float) (((int) this.f6773h.width()) - getPaddingRight())) - f;
            rectF.bottom = ((float) (((int) this.f6773h.height()) - getPaddingBottom())) - f;
            this.f6771f.reset();
            this.f6771f.setAntiAlias(true);
            this.f6771f.setColor(this.f6776k);
            this.f6771f.setStyle(Paint.Style.STROKE);
            this.f6771f.setStrokeWidth(this.f6775j);
            float f2 = this.f6774i - (f * 2.0f);
            canvas.drawRoundRect(rectF, f2, f2, this.f6771f);
        }
    }

    /* renamed from: d */
    private void m7325d() {
        if (this.f6769d != null) {
            RectF rectF = new RectF();
            rectF.left = (float) getPaddingLeft();
            rectF.top = (float) getPaddingTop();
            rectF.right = (float) (((int) this.f6773h.width()) - getPaddingRight());
            rectF.bottom = (float) (((int) this.f6773h.height()) - getPaddingBottom());
            this.f6770e.reset();
            this.f6770e.addRoundRect(rectF, this.f6769d, Path.Direction.CW);
            this.f6772g.setPath(this.f6770e, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        }
    }

    /* renamed from: c */
    public void mo6041c(Canvas canvas) {
        if (this.f6769d != null) {
            canvas.clipPath(this.f6770e);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        mo6041c(canvas);
        super.dispatchDraw(canvas);
        m7324b(canvas);
    }

    /* renamed from: e */
    public void mo6043e(float f, int i) {
        this.f6775j = f;
        this.f6776k = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6773h.set(0.0f, 0.0f, (float) i, (float) i2);
        m7325d();
    }

    public void setRadius(float f) {
        this.f6774i = f;
        setRadius(new float[]{f, f, f, f, f, f, f, f});
    }

    public void setRadius(float[] fArr) {
        if (!Arrays.equals(this.f6769d, fArr)) {
            this.f6769d = fArr;
            invalidate();
        }
    }
}
