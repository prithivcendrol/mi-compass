package com.miui.compass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CompassView extends View {

    /* renamed from: A */
    private int f5192A;

    /* renamed from: B */
    private int f5193B;

    /* renamed from: C */
    private int f5194C;

    /* renamed from: D */
    private float f5195D;

    /* renamed from: d */
    private int f5196d;

    /* renamed from: e */
    private int f5197e;

    /* renamed from: f */
    private int f5198f;

    /* renamed from: g */
    private Drawable f5199g;

    /* renamed from: h */
    private float f5200h;

    /* renamed from: i */
    private Drawable f5201i;

    /* renamed from: j */
    private Drawable f5202j;

    /* renamed from: k */
    private Drawable f5203k;

    /* renamed from: l */
    private Drawable f5204l;

    /* renamed from: m */
    private Drawable f5205m;

    /* renamed from: n */
    private int f5206n;

    /* renamed from: o */
    private int f5207o;

    /* renamed from: p */
    private int f5208p;

    /* renamed from: q */
    private int f5209q;

    /* renamed from: r */
    private Drawable f5210r;

    /* renamed from: s */
    private Drawable f5211s;

    /* renamed from: t */
    private Paint f5212t;

    /* renamed from: u */
    private Paint f5213u;

    /* renamed from: v */
    private float f5214v;

    /* renamed from: w */
    private float f5215w;

    /* renamed from: x */
    private float f5216x;

    /* renamed from: y */
    private int f5217y;

    /* renamed from: z */
    private int f5218z;

    public CompassView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5288i(context);
    }

    /* renamed from: c */
    private int m6166c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 0) ? i2 : View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public int[] mo5279a(float f, Drawable drawable) {
        int[] iArr = new int[4];
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        iArr[0] = (int) ((((double) this.f5206n) + (((double) this.f5208p) + (((double) this.f5209q) * Math.cos(d)))) - (((double) intrinsicWidth) / 2.0d));
        int sin = (int) ((((double) this.f5207o) + (((double) this.f5208p) + (((double) this.f5209q) * Math.sin(d)))) - (((double) intrinsicHeight) / 2.0d));
        iArr[1] = sin;
        iArr[2] = iArr[0] + intrinsicWidth;
        iArr[3] = sin + intrinsicHeight;
        return iArr;
    }

    /* renamed from: b */
    public void mo5280b(Canvas canvas, int i, int i2, float f) {
        canvas.translate((float) i, (float) i2);
        int round = Math.round(this.f5195D);
        float round2 = (float) Math.round(f);
        for (int i3 = 0; i3 < 360; i3++) {
            if (i3 % 2 == 0) {
                mo5287h(canvas, this.f5193B, this.f5192A, i3);
            }
        }
        float f2 = (float) round;
        float f3 = f2 + round2;
        if (f2 > f3) {
            round += Math.round(round2);
        } else {
            f2 = f3;
        }
        while (((float) round) < f2) {
            if (round % 2 == 0) {
                mo5287h(canvas, this.f5218z, this.f5217y, -round);
            }
            round++;
        }
        canvas.translate((float) (-i), (float) (-i2));
    }

    /* renamed from: d */
    public void mo5281d() {
        Paint paint = new Paint();
        this.f5212t = paint;
        paint.setAntiAlias(true);
        this.f5212t.setStyle(Paint.Style.STROKE);
        this.f5212t.setStrokeWidth(getResources().getDimension(2131165279));
        this.f5212t.setColor(getResources().getColor(2131099699));
        Paint paint2 = new Paint();
        this.f5213u = paint2;
        paint2.setAntiAlias(true);
        this.f5213u.setStyle(Paint.Style.STROKE);
        this.f5213u.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public float mo5282e(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        while (f >= 360.0f) {
            f -= 360.0f;
        }
        return f;
    }

    /* renamed from: f */
    public float mo5283f(float f) {
        if (this.f5194C != 0) {
            return f < -180.0f ? f + 360.0f : f > 180.0f ? f - 360.0f : f;
        }
        this.f5195D = 0.0f;
        return 0.0f;
    }

    /* renamed from: g */
    public void mo5284g(int i, float f) {
        this.f5195D = mo5282e(f);
        this.f5194C = i;
        invalidate();
    }

    public float getCurrentDirection() {
        return this.f5200h;
    }

    public int getMode() {
        return this.f5194C;
    }

    /* renamed from: h */
    public void mo5287h(Canvas canvas, int i, int i2, int i3) {
        float f;
        canvas.save();
        if (i3 % 30 == 0) {
            this.f5213u.setColor(i);
        } else {
            this.f5213u.setColor(i2);
        }
        if (i3 % 90 == 0) {
            this.f5213u.setStrokeWidth(this.f5216x);
            f = this.f5216x;
        } else {
            this.f5213u.setStrokeWidth(this.f5215w);
            f = this.f5215w;
        }
        float f2 = f / 2.0f;
        float f3 = this.f5214v - (2.0f * f2);
        canvas.rotate((float) i3);
        canvas.translate(0.0f, ((float) (-this.f5208p)) + f2);
        canvas.drawLine(0.0f, 0.0f, 0.0f, f3, this.f5213u);
        canvas.restore();
    }

    /* renamed from: i */
    public void mo5288i(Context context) {
        Context context2;
        int i;
        this.f5198f = getResources().getDimensionPixelSize(2131165279);
        this.f5201i = getContext().getDrawable(2131230843);
        if (C1403c0.m6266m()) {
            this.f5202j = getContext().getDrawable(2131230855);
            this.f5203k = getContext().getDrawable(2131230859);
            this.f5204l = getContext().getDrawable(2131230851);
            context2 = getContext();
            i = 2131230861;
        } else {
            this.f5202j = getContext().getDrawable(2131230854);
            this.f5203k = getContext().getDrawable(2131230858);
            this.f5204l = getContext().getDrawable(2131230850);
            context2 = getContext();
            i = 2131230860;
        }
        this.f5205m = context2.getDrawable(i);
        this.f5199g = getContext().getDrawable(2131230846);
        this.f5210r = getContext().getDrawable(2131230847);
        this.f5211s = getContext().getDrawable(2131230847);
        this.f5196d = this.f5201i.getIntrinsicWidth();
        this.f5197e = this.f5201i.getIntrinsicHeight();
        Log.d("Compass:CompassView", "updateCompassView: " + this.f5196d);
        int i2 = this.f5196d / 2;
        this.f5208p = i2;
        this.f5209q = i2 / 2;
        this.f5214v = getResources().getDimension(2131165279);
        this.f5215w = getResources().getDimension(2131165280);
        this.f5216x = getResources().getDimension(2131165278);
        this.f5217y = getResources().getColor(2131099697);
        this.f5218z = getResources().getColor(2131099695);
        this.f5192A = getResources().getColor(2131099698);
        this.f5193B = getResources().getColor(2131099696);
        mo5281d();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int intrinsicWidth = this.f5201i.getIntrinsicWidth();
        int intrinsicHeight = this.f5201i.getIntrinsicHeight();
        int intrinsicWidth2 = this.f5199g.getIntrinsicWidth();
        int intrinsicHeight2 = this.f5199g.getIntrinsicHeight();
        this.f5206n = measuredWidth - (intrinsicWidth / 2);
        int i = intrinsicHeight / 2;
        this.f5207o = measuredHeight - i;
        int i2 = measuredWidth - (intrinsicWidth2 / 2);
        int i3 = measuredHeight - ((i - this.f5198f) + intrinsicHeight2);
        int i4 = intrinsicWidth2 + i2;
        int i5 = intrinsicHeight2 + i3;
        this.f5199g.setBounds(i2, i3, i4, i5);
        this.f5199g.draw(canvas2);
        int[] a = mo5279a(this.f5200h + 270.0f, this.f5202j);
        this.f5202j.setBounds(a[0], a[1], a[2], a[3]);
        this.f5202j.draw(canvas2);
        int[] a2 = mo5279a(this.f5200h + 180.0f, this.f5205m);
        this.f5205m.setBounds(a2[0], a2[1], a2[2], a2[3]);
        this.f5205m.draw(canvas2);
        int[] a3 = mo5279a(this.f5200h + 90.0f, this.f5203k);
        this.f5203k.setBounds(a3[0], a3[1], a3[2], a3[3]);
        this.f5203k.draw(canvas2);
        int[] a4 = mo5279a(this.f5200h, this.f5204l);
        this.f5204l.setBounds(a4[0], a4[1], a4[2], a4[3]);
        this.f5204l.draw(canvas2);
        canvas.save();
        Drawable drawable = this.f5201i;
        int i6 = this.f5206n;
        int i7 = this.f5207o;
        drawable.setBounds(i6, i7, i6 + intrinsicWidth, intrinsicHeight + i7);
        float f = (float) measuredWidth;
        float f2 = (float) measuredHeight;
        canvas2.rotate(this.f5200h, f, f2);
        this.f5201i.draw(canvas2);
        float f3 = mo5283f(this.f5200h - this.f5195D);
        mo5280b(canvas2, measuredWidth, measuredHeight, f3);
        canvas.restore();
        if (this.f5194C == 1) {
            this.f5210r.setBounds(i2, i3, i4, i5);
            this.f5210r.draw(canvas2);
            canvas.save();
            canvas2.rotate(f3, f, f2);
            this.f5211s.setBounds(i2, i3, i4, i5);
            this.f5211s.draw(canvas2);
            canvas.restore();
            int i8 = this.f5206n;
            float f4 = this.f5214v;
            int i9 = this.f5207o;
            canvas.drawArc(((float) i8) + (f4 / 2.0f), ((float) i9) + (f4 / 2.0f), ((float) (i8 + intrinsicWidth)) - (f4 / 2.0f), ((float) (i9 + intrinsicWidth)) - (f4 / 2.0f), -90.0f, f3, false, this.f5212t);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m6166c(i, this.f5196d), m6166c(i2, this.f5197e));
    }

    public void setTargetDirection(float f) {
        this.f5200h = mo5282e(f);
        invalidate();
    }
}
