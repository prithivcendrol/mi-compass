package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0727l0;
import androidx.recyclerview.widget.RecyclerView;
import miuix.animation.internal.AnimTask;

/* renamed from: androidx.recyclerview.widget.d */
class C1231d extends RecyclerView.C1182o implements RecyclerView.C1191t {

    /* renamed from: D */
    private static final int[] f4269D = {16842919};

    /* renamed from: E */
    private static final int[] f4270E = new int[0];

    /* renamed from: A */
    int f4271A;

    /* renamed from: B */
    private final Runnable f4272B;

    /* renamed from: C */
    private final RecyclerView.C1192u f4273C;

    /* renamed from: a */
    private final int f4274a;

    /* renamed from: b */
    private final int f4275b;

    /* renamed from: c */
    final StateListDrawable f4276c;

    /* renamed from: d */
    final Drawable f4277d;

    /* renamed from: e */
    private final int f4278e;

    /* renamed from: f */
    private final int f4279f;

    /* renamed from: g */
    private final StateListDrawable f4280g;

    /* renamed from: h */
    private final Drawable f4281h;

    /* renamed from: i */
    private final int f4282i;

    /* renamed from: j */
    private final int f4283j;

    /* renamed from: k */
    int f4284k;

    /* renamed from: l */
    int f4285l;

    /* renamed from: m */
    float f4286m;

    /* renamed from: n */
    int f4287n;

    /* renamed from: o */
    int f4288o;

    /* renamed from: p */
    float f4289p;

    /* renamed from: q */
    private int f4290q = 0;

    /* renamed from: r */
    private int f4291r = 0;

    /* renamed from: s */
    private RecyclerView f4292s;

    /* renamed from: t */
    private boolean f4293t = false;

    /* renamed from: u */
    private boolean f4294u = false;

    /* renamed from: v */
    private int f4295v = 0;

    /* renamed from: w */
    private int f4296w = 0;

    /* renamed from: x */
    private final int[] f4297x = new int[2];

    /* renamed from: y */
    private final int[] f4298y = new int[2];

    /* renamed from: z */
    final ValueAnimator f4299z;

    /* renamed from: androidx.recyclerview.widget.d$a */
    class C1232a implements Runnable {
        C1232a() {
        }

        public void run() {
            C1231d.this.mo4888q(AnimTask.MAX_TO_PAGE_SIZE);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    class C1233b extends RecyclerView.C1192u {
        C1233b() {
        }

        /* renamed from: b */
        public void mo4653b(RecyclerView recyclerView, int i, int i2) {
            C1231d.this.mo4886B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private class C1234c extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f4302d = false;

        C1234c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4302d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4302d) {
                this.f4302d = false;
            } else if (((Float) C1231d.this.f4299z.getAnimatedValue()).floatValue() == 0.0f) {
                C1231d dVar = C1231d.this;
                dVar.f4271A = 0;
                dVar.mo4892y(0);
            } else {
                C1231d dVar2 = C1231d.this;
                dVar2.f4271A = 2;
                dVar2.mo4891v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    private class C1235d implements ValueAnimator.AnimatorUpdateListener {
        C1235d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1231d.this.f4276c.setAlpha(floatValue);
            C1231d.this.f4277d.setAlpha(floatValue);
            C1231d.this.mo4891v();
        }
    }

    C1231d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f4299z = ofFloat;
        this.f4271A = 0;
        this.f4272B = new C1232a();
        this.f4273C = new C1233b();
        this.f4276c = stateListDrawable;
        this.f4277d = drawable;
        this.f4280g = stateListDrawable2;
        this.f4281h = drawable2;
        this.f4278e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4279f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4282i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4283j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4274a = i2;
        this.f4275b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1234c());
        ofFloat.addUpdateListener(new C1235d());
        mo4887j(recyclerView);
    }

    /* renamed from: C */
    private void m5592C(float f) {
        int[] p = m5598p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f4285l) - max) >= 2.0f) {
            int x = m5602x(this.f4286m, max, p, this.f4292s.computeVerticalScrollRange(), this.f4292s.computeVerticalScrollOffset(), this.f4291r);
            if (x != 0) {
                this.f4292s.scrollBy(0, x);
            }
            this.f4286m = max;
        }
    }

    /* renamed from: k */
    private void m5593k() {
        this.f4292s.removeCallbacks(this.f4272B);
    }

    /* renamed from: l */
    private void m5594l() {
        this.f4292s.mo4261W0(this);
        this.f4292s.mo4263X0(this);
        this.f4292s.mo4265Y0(this.f4273C);
        m5593k();
    }

    /* renamed from: m */
    private void m5595m(Canvas canvas) {
        int i = this.f4291r;
        int i2 = this.f4282i;
        int i3 = i - i2;
        int i4 = this.f4288o;
        int i5 = this.f4287n;
        int i6 = i4 - (i5 / 2);
        this.f4280g.setBounds(0, 0, i5, i2);
        this.f4281h.setBounds(0, 0, this.f4290q, this.f4283j);
        canvas.translate(0.0f, (float) i3);
        this.f4281h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f4280g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m5596n(Canvas canvas) {
        int i = this.f4290q;
        int i2 = this.f4278e;
        int i3 = i - i2;
        int i4 = this.f4285l;
        int i5 = this.f4284k;
        int i6 = i4 - (i5 / 2);
        this.f4276c.setBounds(0, 0, i2, i5);
        this.f4277d.setBounds(0, 0, this.f4279f, this.f4291r);
        if (m5600s()) {
            this.f4277d.draw(canvas);
            canvas.translate((float) this.f4278e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4276c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i3 = this.f4278e;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f4277d.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f4276c.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m5597o() {
        int[] iArr = this.f4298y;
        int i = this.f4275b;
        iArr[0] = i;
        iArr[1] = this.f4290q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m5598p() {
        int[] iArr = this.f4297x;
        int i = this.f4275b;
        iArr[0] = i;
        iArr[1] = this.f4291r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m5599r(float f) {
        int[] o = m5597o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f4288o) - max) >= 2.0f) {
            int x = m5602x(this.f4289p, max, o, this.f4292s.computeHorizontalScrollRange(), this.f4292s.computeHorizontalScrollOffset(), this.f4290q);
            if (x != 0) {
                this.f4292s.scrollBy(x, 0);
            }
            this.f4289p = max;
        }
    }

    /* renamed from: s */
    private boolean m5600s() {
        return C0727l0.m2916u(this.f4292s) == 1;
    }

    /* renamed from: w */
    private void m5601w(int i) {
        m5593k();
        this.f4292s.postDelayed(this.f4272B, (long) i);
    }

    /* renamed from: x */
    private int m5602x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m5603z() {
        this.f4292s.mo4294g(this);
        this.f4292s.mo4318i(this);
        this.f4292s.mo4323j(this.f4273C);
    }

    /* renamed from: A */
    public void mo4885A() {
        int i = this.f4271A;
        if (i != 0) {
            if (i == 3) {
                this.f4299z.cancel();
            } else {
                return;
            }
        }
        this.f4271A = 1;
        ValueAnimator valueAnimator = this.f4299z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4299z.setDuration(500);
        this.f4299z.setStartDelay(0);
        this.f4299z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4886B(int i, int i2) {
        int computeVerticalScrollRange = this.f4292s.computeVerticalScrollRange();
        int i3 = this.f4291r;
        this.f4293t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f4274a;
        int computeHorizontalScrollRange = this.f4292s.computeHorizontalScrollRange();
        int i4 = this.f4290q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f4274a;
        this.f4294u = z;
        boolean z2 = this.f4293t;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f4285l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f4284k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f4294u) {
                float f2 = (float) i4;
                this.f4288o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f4287n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f4295v;
            if (i5 == 0 || i5 == 1) {
                mo4892y(1);
            }
        } else if (this.f4295v != 0) {
            mo4892y(0);
        }
    }

    /* renamed from: a */
    public boolean mo4649a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4295v;
        if (i == 1) {
            boolean u = mo4890u(motionEvent.getX(), motionEvent.getY());
            boolean t = mo4889t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u && !t) {
                return false;
            }
            if (t) {
                this.f4296w = 1;
                this.f4289p = (float) ((int) motionEvent.getX());
            } else if (u) {
                this.f4296w = 2;
                this.f4286m = (float) ((int) motionEvent.getY());
            }
            mo4892y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo4650b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4295v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo4890u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo4889t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f4296w = 1;
                        this.f4289p = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f4296w = 2;
                        this.f4286m = (float) ((int) motionEvent.getY());
                    }
                    mo4892y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4295v == 2) {
                this.f4286m = 0.0f;
                this.f4289p = 0.0f;
                mo4892y(1);
                this.f4296w = 0;
            } else if (motionEvent.getAction() == 2 && this.f4295v == 2) {
                mo4885A();
                if (this.f4296w == 1) {
                    m5599r(motionEvent.getX());
                }
                if (this.f4296w == 2) {
                    m5592C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4651c(boolean z) {
    }

    /* renamed from: i */
    public void mo4082i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1162b0 b0Var) {
        if (this.f4290q != this.f4292s.getWidth() || this.f4291r != this.f4292s.getHeight()) {
            this.f4290q = this.f4292s.getWidth();
            this.f4291r = this.f4292s.getHeight();
            mo4892y(0);
        } else if (this.f4271A != 0) {
            if (this.f4293t) {
                m5596n(canvas);
            }
            if (this.f4294u) {
                m5595m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo4887j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4292s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5594l();
            }
            this.f4292s = recyclerView;
            if (recyclerView != null) {
                m5603z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4888q(int i) {
        int i2 = this.f4271A;
        if (i2 == 1) {
            this.f4299z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4271A = 3;
        ValueAnimator valueAnimator = this.f4299z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f4299z.setDuration((long) i);
        this.f4299z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo4889t(float f, float f2) {
        if (f2 >= ((float) (this.f4291r - this.f4282i))) {
            int i = this.f4288o;
            int i2 = this.f4287n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo4890u(float f, float f2) {
        if (!m5600s() ? f >= ((float) (this.f4290q - this.f4278e)) : f <= ((float) this.f4278e)) {
            int i = this.f4285l;
            int i2 = this.f4284k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4891v() {
        this.f4292s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4892y(int i) {
        int i2;
        if (i == 2 && this.f4295v != 2) {
            this.f4276c.setState(f4269D);
            m5593k();
        }
        if (i == 0) {
            mo4891v();
        } else {
            mo4885A();
        }
        if (this.f4295v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f4295v = i;
        }
        this.f4276c.setState(f4270E);
        i2 = 1200;
        m5601w(i2);
        this.f4295v = i;
    }
}
