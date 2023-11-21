package com.miui.compass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

public class RotateView extends View {

    /* renamed from: A */
    private boolean[] f5273A;

    /* renamed from: B */
    private int f5274B;

    /* renamed from: C */
    private int f5275C;

    /* renamed from: D */
    private long f5276D;

    /* renamed from: E */
    private long f5277E;

    /* renamed from: d */
    private float f5278d;

    /* renamed from: e */
    private float f5279e;

    /* renamed from: f */
    private final int f5280f;

    /* renamed from: g */
    private int f5281g;

    /* renamed from: h */
    private final int f5282h;

    /* renamed from: i */
    private final int f5283i;

    /* renamed from: j */
    private final int f5284j;

    /* renamed from: k */
    private final int f5285k;

    /* renamed from: l */
    private final int f5286l;

    /* renamed from: m */
    private int f5287m;

    /* renamed from: n */
    private final int f5288n;

    /* renamed from: o */
    private final int f5289o;

    /* renamed from: p */
    private final int f5290p;

    /* renamed from: q */
    private final RectF f5291q;

    /* renamed from: r */
    private Paint f5292r;

    /* renamed from: s */
    private Paint f5293s;

    /* renamed from: t */
    private Paint f5294t;

    /* renamed from: u */
    private float f5295u;

    /* renamed from: v */
    private float f5296v;

    /* renamed from: w */
    private float f5297w;

    /* renamed from: x */
    private float f5298x;

    /* renamed from: y */
    private int f5299y;

    /* renamed from: z */
    private int f5300z;

    public RotateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RotateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5280f = 2000;
        this.f5282h = 4;
        this.f5283i = 60;
        this.f5284j = 25;
        this.f5285k = 70;
        this.f5286l = 20;
        this.f5288n = getResources().getColor(2131099691);
        this.f5289o = getResources().getColor(2131099682);
        this.f5290p = getResources().getColor(2131099713);
        mo5316l(context);
        this.f5273A = new boolean[360];
        this.f5291q = new RectF();
        this.f5296v = (float) Math.cos(1.0471975511965976d);
        this.f5295u = (float) Math.sin(1.0471975511965976d);
        m6201h();
        m6196c();
    }

    /* renamed from: a */
    private void m6194a(int i) {
        if (m6202j(i)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f5276D;
            int i2 = i - this.f5275C;
            int i3 = 1;
            if (currentTimeMillis < 70) {
                int abs = Math.abs(i2);
                if (abs < 20) {
                    int min = Math.min(i, this.f5275C);
                    while (i3 < abs) {
                        m6202j((min + i3) % 360);
                        i3++;
                    }
                } else if (abs > 340) {
                    int max = Math.max(i, this.f5275C);
                    while (i3 < 360 - abs) {
                        m6202j((max + i3) % 360);
                        i3++;
                    }
                }
                i3 = 0;
            }
            if (i3 != 0) {
                for (int i4 = 0; i4 < 5; i4++) {
                    m6202j((i + i4) % 360);
                }
            }
            this.f5275C = i;
            this.f5276D = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    private int m6195b() {
        int i;
        float f = this.f5296v;
        if (f == 0.0f) {
            i = this.f5295u > 0.0f ? 90 : 270;
        } else {
            i = (int) (Math.atan((double) (this.f5295u / f)) * 57.29577951308232d);
            if (this.f5296v < 0.0f) {
                i += 180;
            } else if (this.f5295u < 0.0f) {
                i += 360;
            }
        }
        return i % 360;
    }

    /* renamed from: c */
    private void m6196c() {
        for (int i = 0; i < 360; i++) {
            this.f5273A[i] = false;
        }
        this.f5274B = 0;
    }

    /* renamed from: d */
    private void m6197d(Canvas canvas) {
        canvas.drawCircle(this.f5297w, this.f5298x, this.f5279e, this.f5294t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6198e(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r0 = -1
        L_0x0001:
            r1 = 360(0x168, float:5.04E-43)
            if (r0 >= r1) goto L_0x002e
        L_0x0005:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0010
            boolean[] r2 = r10.f5273A
            boolean r2 = r2[r0]
            if (r2 != 0) goto L_0x0010
            goto L_0x0005
        L_0x0010:
            if (r0 != r1) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            r2 = r0
        L_0x0014:
            int r2 = r2 + 1
            if (r2 >= r1) goto L_0x001f
            boolean[] r3 = r10.f5273A
            boolean r3 = r3[r2]
            if (r3 == 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            android.graphics.RectF r5 = r10.f5291q
            float r6 = (float) r0
            int r0 = r2 - r0
            float r7 = (float) r0
            r8 = 0
            android.graphics.Paint r9 = r10.f5292r
            r4 = r11
            r4.drawArc(r5, r6, r7, r8, r9)
            r0 = r2
            goto L_0x0001
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.RotateView.m6198e(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    private void m6199f(Canvas canvas) {
        float f = this.f5278d;
        canvas.drawCircle((this.f5296v * f) + this.f5297w, (this.f5295u * f) + this.f5298x, (float) this.f5287m, this.f5293s);
    }

    /* renamed from: g */
    private int m6200g(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 0) ? i2 : View.MeasureSpec.getSize(i);
    }

    /* renamed from: h */
    private void m6201h() {
        Paint paint = new Paint();
        this.f5294t = paint;
        paint.setAntiAlias(true);
        this.f5294t.setColor(this.f5288n);
        this.f5294t.setStyle(Paint.Style.STROKE);
        this.f5294t.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.f5292r = paint2;
        paint2.setAntiAlias(true);
        this.f5292r.setColor(this.f5289o);
        this.f5292r.setStyle(Paint.Style.STROKE);
        this.f5292r.setStrokeWidth(4.0f);
        Paint paint3 = new Paint();
        this.f5293s = paint3;
        paint3.setAntiAlias(true);
        this.f5293s.setColor(this.f5290p);
        this.f5293s.setStyle(Paint.Style.FILL);
    }

    /* renamed from: j */
    private boolean m6202j(int i) {
        boolean[] zArr = this.f5273A;
        if (zArr[i]) {
            return false;
        }
        zArr[i] = true;
        this.f5274B++;
        return true;
    }

    /* renamed from: i */
    public void mo5314i() {
        this.f5277E = 0;
        this.f5276D = 0;
        this.f5296v = (float) Math.cos(1.0471975511965976d);
        this.f5295u = (float) Math.sin(1.0471975511965976d);
        m6196c();
    }

    /* renamed from: k */
    public void mo5315k(float f, float f2) {
        float f3;
        if (this.f5277E == 0) {
            this.f5277E = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - this.f5277E > 2000) {
            float f4 = -Math.min(Math.max(f, -90.0f), 90.0f);
            float f5 = -Math.min(Math.max(f2, -90.0f), 90.0f);
            double abs = (double) (f4 / Math.abs(90.0f));
            double abs2 = (double) (f5 / Math.abs(90.0f));
            double sqrt = Math.sqrt((abs * abs) + (abs2 * abs2));
            if (sqrt == 0.0d) {
                this.f5295u = 0.0f;
                f3 = 1.0f;
            } else {
                this.f5295u = (float) (abs / sqrt);
                f3 = (float) (abs2 / sqrt);
            }
            this.f5296v = f3;
            if (Math.abs(f4) >= 25.0f || Math.abs(f5) >= 25.0f) {
                m6194a(m6195b());
            }
            if ((this.f5274B * 100) / 360 == 100 && getVisibility() == 0) {
                Toast.makeText(getContext(), 2131820594, 1).show();
                m6196c();
            }
        }
        invalidate();
    }

    /* renamed from: l */
    public void mo5316l(Context context) {
        this.f5287m = getResources().getDimensionPixelSize(2131165326);
        this.f5278d = (float) getResources().getDimensionPixelSize(2131165277);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165296);
        this.f5281g = dimensionPixelSize;
        int ceil = (int) Math.ceil((double) ((this.f5278d + ((float) this.f5287m) + ((float) dimensionPixelSize)) * 2.0f));
        this.f5299y = ceil;
        this.f5300z = ceil;
        this.f5279e = this.f5278d + ((float) this.f5287m) + ((float) this.f5281g);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m6197d(canvas);
        m6199f(canvas);
        m6198e(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m6200g(i, this.f5299y), m6200g(i2, this.f5300z));
        this.f5298x = (float) (getMeasuredHeight() / 2);
        float measuredWidth = (float) (getMeasuredWidth() / 2);
        this.f5297w = measuredWidth;
        RectF rectF = this.f5291q;
        float f = this.f5279e;
        float f2 = this.f5298x;
        rectF.set(measuredWidth - f, f2 - f, measuredWidth + f, f2 + f);
    }
}
