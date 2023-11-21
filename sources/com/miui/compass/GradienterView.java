package com.miui.compass;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class GradienterView extends View {

    /* renamed from: A */
    private final int f5235A;

    /* renamed from: B */
    private final int f5236B;

    /* renamed from: C */
    private final float f5237C;

    /* renamed from: D */
    private final float f5238D;

    /* renamed from: E */
    private final float f5239E;

    /* renamed from: F */
    private Paint f5240F;

    /* renamed from: G */
    private Paint f5241G;

    /* renamed from: H */
    private Paint f5242H;

    /* renamed from: I */
    private int f5243I;

    /* renamed from: J */
    private int f5244J;

    /* renamed from: K */
    private int f5245K;

    /* renamed from: L */
    private int f5246L;

    /* renamed from: d */
    private int f5247d;

    /* renamed from: e */
    private int f5248e;

    /* renamed from: f */
    private int f5249f;

    /* renamed from: g */
    private boolean f5250g;

    /* renamed from: h */
    private float f5251h;

    /* renamed from: i */
    private float f5252i;

    /* renamed from: j */
    private float f5253j;

    /* renamed from: k */
    private float f5254k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5255l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f5256m;

    /* renamed from: n */
    private boolean f5257n;

    /* renamed from: o */
    private ValueAnimator f5258o;

    /* renamed from: p */
    private int f5259p;

    /* renamed from: q */
    private int f5260q;

    /* renamed from: r */
    private int f5261r;

    /* renamed from: s */
    private final int f5262s;

    /* renamed from: t */
    private final int f5263t;

    /* renamed from: u */
    private final int f5264u;

    /* renamed from: v */
    private final int f5265v;

    /* renamed from: w */
    private final int f5266w;

    /* renamed from: x */
    private final int f5267x;

    /* renamed from: y */
    private final int f5268y;

    /* renamed from: z */
    private final int f5269z;

    /* renamed from: com.miui.compass.GradienterView$a */
    class C1388a implements Animator.AnimatorListener {
        C1388a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = GradienterView.this.f5255l = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.miui.compass.GradienterView$b */
    class C1389b implements Animator.AnimatorListener {
        C1389b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = GradienterView.this.f5255l = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.miui.compass.GradienterView$c */
    private class C1390c implements ValueAnimator.AnimatorUpdateListener {
        private C1390c() {
        }

        /* synthetic */ C1390c(GradienterView gradienterView, C1388a aVar) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = GradienterView.this.f5256m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GradienterView.this.invalidate();
        }
    }

    public GradienterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradienterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5255l = false;
        this.f5256m = 0.0f;
        this.f5257n = false;
        this.f5262s = getResources().getColor(2131100588);
        this.f5263t = getResources().getColor(2131100604);
        this.f5264u = getResources().getColor(2131099714);
        this.f5265v = getResources().getColor(2131099709);
        this.f5266w = getResources().getColor(2131099708);
        this.f5267x = getResources().getColor(2131099710);
        this.f5268y = 16711680;
        this.f5269z = 65280;
        this.f5235A = 255;
        this.f5236B = -16777216;
        this.f5237C = (float) getResources().getDimensionPixelSize(2131165976);
        this.f5238D = (float) getResources().getDimensionPixelSize(2131165977);
        this.f5239E = (float) getResources().getDimensionPixelSize(2131165978);
        m6187f();
        mo5301k();
    }

    /* renamed from: c */
    private void m6184c(Canvas canvas) {
        this.f5240F.setColor(m6190j(this.f5262s, this.f5266w, this.f5256m));
        this.f5242H.setColor(m6190j(this.f5263t, 0, this.f5256m));
        this.f5241G.setColor(m6190j(this.f5265v, this.f5267x, this.f5256m));
        float measuredWidth = (float) (getMeasuredWidth() / 2);
        float measuredHeight = (float) (getMeasuredHeight() / 2);
        canvas.drawCircle(measuredWidth, measuredHeight, (float) this.f5259p, this.f5240F);
        canvas.drawCircle(measuredWidth, measuredHeight, (float) this.f5260q, this.f5242H);
        float f = this.f5254k;
        int i = this.f5249f;
        canvas.drawCircle((f * ((float) i)) + measuredWidth, (this.f5253j * ((float) i)) + measuredHeight, (float) this.f5261r, this.f5241G);
        if (this.f5256m != 1.0f) {
            this.f5257n = false;
        } else if (!this.f5257n) {
            this.f5257n = true;
            C1424l.m6361a().mo5401e(this);
        }
    }

    /* renamed from: d */
    private void m6185d(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i = this.f5259p;
        RectF rectF = new RectF((float) (measuredWidth - i), (float) (measuredHeight - i), (float) (measuredWidth + i), (float) (i + measuredHeight));
        this.f5240F.setColor(m6190j(this.f5262s, this.f5266w, this.f5256m));
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        canvas2.drawArc(rectF2, 185.0f, 170.0f, false, this.f5240F);
        canvas2.drawArc(rectF2, 5.0f, 170.0f, false, this.f5240F);
        float f = (float) measuredHeight;
        float f2 = f;
        canvas.drawLine((float) (measuredWidth - (this.f5243I / 2)), f, (float) (measuredWidth - (this.f5244J / 2)), f2, this.f5240F);
        float f3 = f;
        canvas.drawLine((float) ((this.f5243I / 2) + measuredWidth), f2, (float) ((this.f5244J / 2) + measuredWidth), f3, this.f5240F);
        canvas.rotate(this.f5252i, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        this.f5242H.setColor(m6190j(this.f5263t, this.f5266w, this.f5256m));
        canvas.drawCircle((float) measuredWidth, f, (float) this.f5260q, this.f5242H);
        this.f5240F.setColor(m6190j(this.f5264u, this.f5266w, this.f5256m));
        Canvas canvas3 = canvas;
        canvas3.drawLine((float) (measuredWidth - (this.f5245K / 2)), f2, (float) (measuredWidth - (this.f5246L / 2)), f3, this.f5240F);
        canvas3.drawLine((float) ((this.f5245K / 2) + measuredWidth), f2, (float) (measuredWidth + (this.f5246L / 2)), f3, this.f5240F);
        if (this.f5256m != 1.0f) {
            this.f5257n = false;
        } else if (!this.f5257n) {
            this.f5257n = true;
            C1424l.m6361a().mo5401e(this);
        }
    }

    /* renamed from: e */
    private int m6186e(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 0) ? i2 : View.MeasureSpec.getSize(i);
    }

    /* renamed from: f */
    private void m6187f() {
        Paint paint = new Paint();
        this.f5240F = paint;
        paint.setAntiAlias(true);
        this.f5240F.setStyle(Paint.Style.STROKE);
        this.f5240F.setStrokeWidth(this.f5237C);
        Paint paint2 = new Paint();
        this.f5241G = paint2;
        paint2.setAntiAlias(true);
        this.f5241G.setStyle(Paint.Style.STROKE);
        this.f5241G.setStrokeWidth(this.f5239E);
        Paint paint3 = new Paint();
        this.f5242H = paint3;
        paint3.setAntiAlias(true);
        this.f5242H.setStyle(Paint.Style.STROKE);
        this.f5242H.setStrokeWidth(this.f5238D);
    }

    /* renamed from: g */
    private int m6188g(int i, int i2, float f) {
        return (int) (((float) i) + (((float) (i2 - i)) * f));
    }

    /* renamed from: i */
    private void m6189i() {
        Animator.AnimatorListener animatorListener;
        ValueAnimator valueAnimator;
        if (this.f5255l) {
            if ((!this.f5250g && Math.round(this.f5251h) != 0) || (this.f5250g && Math.round(this.f5252i) != 0)) {
                this.f5255l = false;
                if (this.f5256m != 0.0f) {
                    ValueAnimator valueAnimator2 = this.f5258o;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f5256m, 0.0f});
                    this.f5258o = ofFloat;
                    ofFloat.addUpdateListener(new C1390c(this, (C1388a) null));
                    valueAnimator = this.f5258o;
                    animatorListener = new C1388a();
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if ((!this.f5250g && Math.round(this.f5251h) == 0) || (this.f5250g && Math.round(this.f5252i) == 0)) {
            this.f5255l = true;
            if (this.f5256m != 1.0f) {
                ValueAnimator valueAnimator3 = this.f5258o;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f5256m, 1.0f});
                this.f5258o = ofFloat2;
                ofFloat2.addUpdateListener(new C1390c(this, (C1388a) null));
                valueAnimator = this.f5258o;
                animatorListener = new C1389b();
            } else {
                return;
            }
        } else {
            return;
        }
        valueAnimator.addListener(animatorListener);
        this.f5258o.start();
    }

    /* renamed from: j */
    private int m6190j(int i, int i2, float f) {
        return m6188g(i & 255, i2 & 255, f) | (m6188g((i & -16777216) >>> 24, (-16777216 & i2) >>> 24, f) << 24) | (m6188g((i & 16711680) >>> 16, (16711680 & i2) >>> 16, f) << 16) | (m6188g((i & 65280) >>> 8, (65280 & i2) >>> 8, f) << 8);
    }

    public float getDirectionLying() {
        return this.f5251h;
    }

    public float getDirectionPortart() {
        return this.f5252i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5300h(float r11, float r12) {
        /*
            r10 = this;
            boolean r0 = r10.f5250g
            if (r0 != 0) goto L_0x0071
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r11 = java.lang.Math.max(r11, r0)
            r1 = 1119092736(0x42b40000, float:90.0)
            float r11 = java.lang.Math.min(r11, r1)
            float r12 = java.lang.Math.max(r12, r0)
            float r12 = java.lang.Math.min(r12, r1)
            float r0 = java.lang.Math.abs(r1)
            float r11 = r11 / r0
            double r2 = (double) r11
            float r11 = java.lang.Math.abs(r1)
            float r11 = r12 / r11
            double r0 = (double) r11
            double r4 = r2 * r2
            double r6 = r0 * r0
            double r4 = r4 + r6
            double r6 = java.lang.Math.abs(r2)
            double r8 = java.lang.Math.abs(r0)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            if (r11 <= 0) goto L_0x0042
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 / r2
        L_0x003d:
            double r4 = java.lang.Math.abs(r4)
            goto L_0x004e
        L_0x0042:
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x0048
            r4 = r6
            goto L_0x004e
        L_0x0048:
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 / r0
            goto L_0x003d
        L_0x004e:
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 0
            if (r11 != 0) goto L_0x0055
            r2 = r6
            goto L_0x0057
        L_0x0055:
            double r2 = r2 / r4
            float r2 = (float) r2
        L_0x0057:
            r10.f5253j = r2
            if (r11 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            double r0 = r0 / r4
            float r6 = (float) r0
        L_0x005e:
            r10.f5254k = r6
            float r2 = r2 * r2
            float r6 = r6 * r6
            float r2 = r2 + r6
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r0 = r0 * r2
            float r11 = (float) r0
            r10.f5251h = r11
        L_0x0071:
            r10.f5252i = r12
            r10.m6189i()
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.GradienterView.mo5300h(float, float):void");
    }

    /* renamed from: k */
    public void mo5301k() {
        this.f5244J = getResources().getDimensionPixelSize(2131165997);
        this.f5246L = getResources().getDimensionPixelSize(2131165999);
        this.f5249f = getResources().getDimensionPixelSize(2131165276);
        int i = this.f5244J;
        float f = this.f5238D;
        this.f5259p = (i - ((int) f)) / 2;
        this.f5260q = (this.f5246L - ((int) f)) / 2;
        this.f5261r = (getResources().getDimensionPixelSize(2131166000) - ((int) this.f5238D)) / 2;
        this.f5245K = getResources().getDimensionPixelSize(2131166001);
        this.f5243I = getResources().getDimensionPixelSize(2131165998);
        this.f5247d = getResources().getDimensionPixelSize(2131165998);
        this.f5248e = getResources().getDimensionPixelSize(2131165316);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f5250g) {
            m6184c(canvas);
        } else {
            m6185d(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m6186e(i, this.f5247d), m6186e(i2, this.f5248e));
    }

    public void setIsPortrait(boolean z) {
        this.f5250g = z;
    }
}
