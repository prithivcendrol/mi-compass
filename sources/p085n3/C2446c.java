package p085n3;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import miuix.animation.physics.SpringOperator;

/* renamed from: n3.c */
public class C2446c {

    /* renamed from: a */
    private int f9475a;

    /* renamed from: b */
    private final C2447a f9476b;

    /* renamed from: c */
    private final C2447a f9477c;

    /* renamed from: d */
    private Interpolator f9478d;

    /* renamed from: e */
    private final boolean f9479e;

    /* renamed from: n3.c$a */
    static class C2447a {

        /* renamed from: q */
        private static float f9480q = ((float) (Math.log(0.78d) / Math.log(0.9d)));

        /* renamed from: r */
        private static final float[] f9481r = new float[101];

        /* renamed from: s */
        private static final float[] f9482s = new float[101];

        /* renamed from: a */
        private Context f9483a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public double f9484b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public double f9485c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public double f9486d;

        /* renamed from: e */
        private double f9487e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public double f9488f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f9489g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f9490h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f9491i;

        /* renamed from: j */
        private float f9492j = ViewConfiguration.getScrollFriction();

        /* renamed from: k */
        private int f9493k = 0;

        /* renamed from: l */
        private float f9494l;

        /* renamed from: m */
        private SpringOperator f9495m;

        /* renamed from: n */
        private boolean f9496n;

        /* renamed from: o */
        private double f9497o;

        /* renamed from: p */
        private double[] f9498p;

        static {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i = 0; i < 100; i++) {
                float f13 = ((float) i) / 100.0f;
                float f14 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f14 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = 1.0f - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f15 = (((f4 * 0.175f) + (f2 * 0.35000002f)) * f5) + f6;
                    float f16 = f15;
                    if (((double) Math.abs(f15 - f13)) < 1.0E-5d) {
                        break;
                    } else if (f16 > f13) {
                        f14 = f2;
                    } else {
                        f11 = f2;
                    }
                }
                f9481r[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f17 = 1.0f;
                while (true) {
                    f7 = ((f17 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (((double) Math.abs(f18 - f13)) < 1.0E-5d) {
                        break;
                    }
                    if (f18 > f13) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                f9482s[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
            }
            float[] fArr = f9481r;
            f9482s[100] = 1.0f;
            fArr[100] = 1.0f;
        }

        C2447a(Context context) {
            this.f9483a = context;
            this.f9491i = true;
            this.f9494l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public final void mo9390A(int i) {
            this.f9484b = (double) i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public final void mo9391B(long j) {
            this.f9489g = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public final void mo9392C(int i) {
            this.f9493k = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo9352D(int i, int i2, int i3) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo9393E(float f, int i, int i2) {
            this.f9491i = false;
            this.f9496n = false;
            mo9392C(0);
            double d = (double) f;
            this.f9497o = d;
            this.f9484b = d;
            this.f9485c = d;
            this.f9486d = (double) (f + ((float) i));
            this.f9489g = AnimationUtils.currentAnimationTimeMillis();
            double d2 = (double) i2;
            this.f9487e = d2;
            this.f9488f = d2;
            SpringOperator springOperator = new SpringOperator();
            this.f9495m = springOperator;
            double[] dArr = new double[2];
            this.f9498p = dArr;
            springOperator.getParameters(new float[]{0.99f, 0.4f}, dArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public boolean mo9353F() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo9394G(float f) {
            double d = this.f9484b;
            this.f9485c = d + ((double) Math.round(((double) f) * (this.f9486d - d)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo9395i() {
            if (this.f9495m == null || this.f9491i) {
                return false;
            }
            if (this.f9496n) {
                this.f9491i = true;
                this.f9485c = this.f9486d;
                return true;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            double d = 0.01600000075995922d;
            double min = Math.min((double) (((float) (currentAnimationTimeMillis - this.f9489g)) / 1000.0f), 0.01600000075995922d);
            if (min != 0.0d) {
                d = min;
            }
            this.f9489g = currentAnimationTimeMillis;
            SpringOperator springOperator = this.f9495m;
            double d2 = this.f9488f;
            double[] dArr = this.f9498p;
            double updateVelocity = springOperator.updateVelocity(d2, dArr[0], dArr[1], d, this.f9486d, this.f9484b);
            double d3 = this.f9484b + (d * updateVelocity);
            this.f9485c = d3;
            this.f9488f = updateVelocity;
            if (mo9401r(d3, this.f9486d)) {
                this.f9496n = true;
            } else {
                this.f9484b = this.f9485c;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo9355j() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo9356k() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo9357l(int i, int i2, int i3, int i4, int i5) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public final float mo9396m() {
            return (float) this.f9488f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public final int mo9397n() {
            return (int) this.f9485c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public final int mo9398o() {
            return (int) this.f9486d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public final int mo9399p() {
            return (int) this.f9484b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public final int mo9400q() {
            return this.f9493k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo9401r(double d, double d2) {
            return Math.abs(d - d2) < 1.0d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public final boolean mo9402s() {
            return this.f9491i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo9358t(int i, int i2, int i3) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public final void mo9403u(float f) {
            this.f9488f = (double) f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo9404v(int i) {
            this.f9485c = (double) i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final void mo9405w(int i) {
            this.f9490h = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public final void mo9406x(int i) {
            this.f9486d = (double) i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo9359y(int i) {
            this.f9486d = (double) i;
            this.f9491i = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public final void mo9407z(boolean z) {
            this.f9491i = z;
        }
    }

    /* renamed from: n3.c$b */
    static class C2448b implements Interpolator {

        /* renamed from: a */
        private static final float f9499a;

        /* renamed from: b */
        private static final float f9500b;

        static {
            float a = 1.0f / m10422a(1.0f);
            f9499a = a;
            f9500b = 1.0f - (a * m10422a(1.0f));
        }

        C2448b() {
        }

        /* renamed from: a */
        private static float m10422a(float f) {
            float f2 = f * 8.0f;
            return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp((double) (-f2)))) : ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f) + 0.36787945f;
        }

        public float getInterpolation(float f) {
            float a = f9499a * m10422a(f);
            return a > 0.0f ? a + f9500b : a;
        }
    }

    public C2446c(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public C2446c(Context context, Interpolator interpolator, boolean z) {
        this.f9478d = interpolator == null ? new C2448b() : interpolator;
        this.f9479e = z;
        this.f9476b = new C2440a(context);
        this.f9477c = new C2440a(context);
    }

    /* renamed from: s */
    private void m10369s(C2447a aVar) {
        aVar.mo9390A(0);
        aVar.mo9406x(0);
        aVar.mo9404v(0);
    }

    /* renamed from: a */
    public void mo9370a() {
        this.f9476b.mo9356k();
        this.f9477c.mo9356k();
    }

    /* renamed from: b */
    public boolean mo9371b() {
        if (mo9384o()) {
            return false;
        }
        int i = this.f9475a;
        if (i == 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f9476b.f9489g;
            int g = this.f9476b.f9490h;
            if (currentAnimationTimeMillis < ((long) g)) {
                float interpolation = this.f9478d.getInterpolation(((float) currentAnimationTimeMillis) / ((float) g));
                this.f9476b.mo9394G(interpolation);
                this.f9477c.mo9394G(interpolation);
            } else {
                mo9370a();
            }
        } else if (i == 1) {
            if (!this.f9476b.f9491i && !this.f9476b.mo9353F() && !this.f9476b.mo9355j()) {
                this.f9476b.mo9356k();
            }
            if (!this.f9477c.f9491i && !this.f9477c.mo9353F() && !this.f9477c.mo9355j()) {
                this.f9477c.mo9356k();
            }
        } else if (i == 2) {
            return this.f9477c.mo9395i() || this.f9476b.mo9395i();
        }
        return true;
    }

    /* renamed from: c */
    public void mo9372c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo9373d(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    /* renamed from: d */
    public void mo9373d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!this.f9479e || mo9384o()) {
            i14 = i3;
        } else {
            float d = (float) this.f9476b.f9488f;
            float d2 = (float) this.f9477c.f9488f;
            i14 = i3;
            float f = (float) i14;
            if (Math.signum(f) == Math.signum(d)) {
                i13 = i4;
                float f2 = (float) i13;
                if (Math.signum(f2) == Math.signum(d2)) {
                    i12 = (int) (f2 + d2);
                    i11 = (int) (f + d);
                    this.f9475a = 1;
                    this.f9476b.mo9357l(i, i11, i5, i6, i9);
                    this.f9477c.mo9357l(i2, i12, i7, i8, i10);
                }
                i12 = i13;
                i11 = i14;
                this.f9475a = 1;
                this.f9476b.mo9357l(i, i11, i5, i6, i9);
                this.f9477c.mo9357l(i2, i12, i7, i8, i10);
            }
        }
        i13 = i4;
        i12 = i13;
        i11 = i14;
        this.f9475a = 1;
        this.f9476b.mo9357l(i, i11, i5, i6, i9);
        this.f9477c.mo9357l(i2, i12, i7, i8, i10);
    }

    /* renamed from: e */
    public float mo9374e() {
        return (float) Math.hypot(this.f9476b.f9488f, this.f9477c.f9488f);
    }

    /* renamed from: f */
    public float mo9375f() {
        return (float) this.f9476b.f9488f;
    }

    /* renamed from: g */
    public float mo9376g() {
        return (float) this.f9477c.f9488f;
    }

    /* renamed from: h */
    public final int mo9377h() {
        return (int) this.f9476b.f9485c;
    }

    /* renamed from: i */
    public final int mo9378i() {
        return (int) this.f9477c.f9485c;
    }

    /* renamed from: j */
    public final int mo9379j() {
        return (int) this.f9476b.f9486d;
    }

    /* renamed from: k */
    public final int mo9380k() {
        return (int) this.f9477c.f9486d;
    }

    /* renamed from: l */
    public int mo9381l() {
        return this.f9475a;
    }

    /* renamed from: m */
    public final int mo9382m() {
        return (int) this.f9476b.f9484b;
    }

    /* renamed from: n */
    public final int mo9383n() {
        return (int) this.f9477c.f9484b;
    }

    /* renamed from: o */
    public final boolean mo9384o() {
        return this.f9476b.f9491i && this.f9477c.f9491i;
    }

    /* renamed from: p */
    public void mo9385p(int i, int i2, int i3) {
        this.f9476b.mo9358t(i, i2, i3);
    }

    /* renamed from: q */
    public void mo9386q(int i, int i2, int i3) {
        this.f9477c.mo9358t(i, i2, i3);
    }

    /* renamed from: r */
    public final void mo9387r() {
        m10369s(this.f9476b);
        m10369s(this.f9477c);
    }

    /* renamed from: t */
    public boolean mo9388t(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f9475a = 1;
        return this.f9476b.mo9352D(i, i3, i4) || this.f9477c.mo9352D(i2, i5, i6);
    }

    /* renamed from: u */
    public void mo9389u(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f9475a = 2;
        this.f9476b.mo9393E((float) i, i3, i5);
        this.f9477c.mo9393E((float) i2, i4, i6);
    }
}
