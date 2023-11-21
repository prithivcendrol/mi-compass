package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0727l0;
import miuix.animation.internal.AnimTask;

/* renamed from: androidx.core.widget.a */
public abstract class C0806a implements View.OnTouchListener {

    /* renamed from: u */
    private static final int f2857u = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final C0807a f2858d = new C0807a();

    /* renamed from: e */
    private final Interpolator f2859e = new AccelerateInterpolator();

    /* renamed from: f */
    final View f2860f;

    /* renamed from: g */
    private Runnable f2861g;

    /* renamed from: h */
    private float[] f2862h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f2863i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f2864j;

    /* renamed from: k */
    private int f2865k;

    /* renamed from: l */
    private float[] f2866l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f2867m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f2868n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f2869o;

    /* renamed from: p */
    boolean f2870p;

    /* renamed from: q */
    boolean f2871q;

    /* renamed from: r */
    boolean f2872r;

    /* renamed from: s */
    private boolean f2873s;

    /* renamed from: t */
    private boolean f2874t;

    /* renamed from: androidx.core.widget.a$a */
    private static class C0807a {

        /* renamed from: a */
        private int f2875a;

        /* renamed from: b */
        private int f2876b;

        /* renamed from: c */
        private float f2877c;

        /* renamed from: d */
        private float f2878d;

        /* renamed from: e */
        private long f2879e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2880f = 0;

        /* renamed from: g */
        private int f2881g = 0;

        /* renamed from: h */
        private int f2882h = 0;

        /* renamed from: i */
        private long f2883i = -1;

        /* renamed from: j */
        private float f2884j;

        /* renamed from: k */
        private int f2885k;

        C0807a() {
        }

        /* renamed from: e */
        private float m3242e(long j) {
            long j2 = this.f2879e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2883i;
            if (j3 < 0 || j < j3) {
                return C0806a.m3221e(((float) (j - j2)) / ((float) this.f2875a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2884j;
            return (1.0f - f) + (f * C0806a.m3221e(((float) (j - j3)) / ((float) this.f2885k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m3243g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3055a() {
            if (this.f2880f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m3243g(m3242e(currentAnimationTimeMillis));
                this.f2880f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2880f)) * g;
                this.f2881g = (int) (this.f2877c * f);
                this.f2882h = (int) (f * this.f2878d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3056b() {
            return this.f2881g;
        }

        /* renamed from: c */
        public int mo3057c() {
            return this.f2882h;
        }

        /* renamed from: d */
        public int mo3058d() {
            float f = this.f2877c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3059f() {
            float f = this.f2878d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3060h() {
            return this.f2883i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2883i + ((long) this.f2885k);
        }

        /* renamed from: i */
        public void mo3061i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2885k = C0806a.m3222f((int) (currentAnimationTimeMillis - this.f2879e), 0, this.f2876b);
            this.f2884j = m3242e(currentAnimationTimeMillis);
            this.f2883i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3062j(int i) {
            this.f2876b = i;
        }

        /* renamed from: k */
        public void mo3063k(int i) {
            this.f2875a = i;
        }

        /* renamed from: l */
        public void mo3064l(float f, float f2) {
            this.f2877c = f;
            this.f2878d = f2;
        }

        /* renamed from: m */
        public void mo3065m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2879e = currentAnimationTimeMillis;
            this.f2883i = -1;
            this.f2880f = currentAnimationTimeMillis;
            this.f2884j = 0.5f;
            this.f2881g = 0;
            this.f2882h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C0808b implements Runnable {
        C0808b() {
        }

        public void run() {
            C0806a aVar = C0806a.this;
            if (aVar.f2872r) {
                if (aVar.f2870p) {
                    aVar.f2870p = false;
                    aVar.f2858d.mo3065m();
                }
                C0807a aVar2 = C0806a.this.f2858d;
                if (aVar2.mo3060h() || !C0806a.this.mo3054u()) {
                    C0806a.this.f2872r = false;
                    return;
                }
                C0806a aVar3 = C0806a.this;
                if (aVar3.f2871q) {
                    aVar3.f2871q = false;
                    aVar3.mo3041c();
                }
                aVar2.mo3055a();
                C0806a.this.mo3042j(aVar2.mo3056b(), aVar2.mo3057c());
                C0727l0.m2870T(C0806a.this.f2860f, this);
            }
        }
    }

    public C0806a(View view) {
        this.f2860f = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3047o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3049p(f3, f3);
        mo3044l(1);
        mo3046n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3052s(0.2f, 0.2f);
        mo3053t(1.0f, 1.0f);
        mo3043k(f2857u);
        mo3051r(AnimTask.MAX_TO_PAGE_SIZE);
        mo3050q(AnimTask.MAX_TO_PAGE_SIZE);
    }

    /* renamed from: d */
    private float m3220d(int i, float f, float f2, float f3) {
        float h = m3224h(this.f2862h[i], f2, this.f2863i[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2866l[i];
        float f5 = this.f2867m[i];
        float f6 = this.f2868n[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m3221e(h * f7, f5, f6) : -m3221e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m3221e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m3222f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m3223g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2864j;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f2872r || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m3224h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m3221e(f * f2, 0.0f, f3);
        float g = m3223g(f2 - f4, e) - m3223g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f2859e.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2859e.getInterpolation(g);
        }
        return m3221e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m3225i() {
        if (this.f2870p) {
            this.f2872r = false;
        } else {
            this.f2858d.mo3061i();
        }
    }

    /* renamed from: v */
    private void m3226v() {
        int i;
        if (this.f2861g == null) {
            this.f2861g = new C0808b();
        }
        this.f2872r = true;
        this.f2870p = true;
        if (this.f2869o || (i = this.f2865k) <= 0) {
            this.f2861g.run();
        } else {
            C0727l0.m2871U(this.f2860f, this.f2861g, (long) i);
        }
        this.f2869o = true;
    }

    /* renamed from: a */
    public abstract boolean mo3039a(int i);

    /* renamed from: b */
    public abstract boolean mo3040b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3041c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2860f.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo3042j(int i, int i2);

    /* renamed from: k */
    public C0806a mo3043k(int i) {
        this.f2865k = i;
        return this;
    }

    /* renamed from: l */
    public C0806a mo3044l(int i) {
        this.f2864j = i;
        return this;
    }

    /* renamed from: m */
    public C0806a mo3045m(boolean z) {
        if (this.f2873s && !z) {
            m3225i();
        }
        this.f2873s = z;
        return this;
    }

    /* renamed from: n */
    public C0806a mo3046n(float f, float f2) {
        float[] fArr = this.f2863i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C0806a mo3047o(float f, float f2) {
        float[] fArr = this.f2868n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2873s
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m3225i()
            goto L_0x0058
        L_0x001a:
            r5.f2871q = r2
            r5.f2869o = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2860f
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3220d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2860f
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3220d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2858d
            r7.mo3064l(r0, r6)
            boolean r6 = r5.f2872r
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3054u()
            if (r6 == 0) goto L_0x0058
            r5.m3226v()
        L_0x0058:
            boolean r6 = r5.f2874t
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2872r
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0806a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C0806a mo3049p(float f, float f2) {
        float[] fArr = this.f2867m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C0806a mo3050q(int i) {
        this.f2858d.mo3062j(i);
        return this;
    }

    /* renamed from: r */
    public C0806a mo3051r(int i) {
        this.f2858d.mo3063k(i);
        return this;
    }

    /* renamed from: s */
    public C0806a mo3052s(float f, float f2) {
        float[] fArr = this.f2862h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C0806a mo3053t(float f, float f2) {
        float[] fArr = this.f2866l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3054u() {
        C0807a aVar = this.f2858d;
        int f = aVar.mo3059f();
        int d = aVar.mo3058d();
        return (f != 0 && mo3040b(f)) || (d != 0 && mo3039a(d));
    }
}
