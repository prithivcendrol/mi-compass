package p079m3;

import p079m3.C1936b;

/* renamed from: m3.c */
public final class C1956c extends C1936b<C1956c> {

    /* renamed from: B */
    private final C1957a f7368B;

    /* renamed from: C */
    private C1958b f7369C;

    /* renamed from: m3.c$a */
    static final class C1957a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f7370a = -4.2f;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f7371b;

        /* renamed from: c */
        private final C1936b.C1952p f7372c = new C1936b.C1952p();

        /* renamed from: d */
        private double f7373d;

        /* renamed from: e */
        private final float f7374e = 1000.0f;

        C1957a() {
        }

        /* renamed from: c */
        public boolean mo6582c(float f, float f2) {
            return Math.abs(f2) < this.f7371b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6583d(float f) {
            float f2 = f * -4.2f;
            this.f7370a = f2;
            this.f7373d = 1.0d - Math.pow(2.718281828459045d, (double) f2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6584e(float f) {
            this.f7371b = f * 62.5f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1936b.C1952p mo6585f(float f, float f2, long j) {
            float min = ((float) Math.min(j, 16)) / 1000.0f;
            double pow = Math.pow(1.0d - this.f7373d, (double) min);
            C1936b.C1952p pVar = this.f7372c;
            float f3 = (float) (((double) f2) * pow);
            pVar.f7367b = f3;
            float f4 = f + (min * f3);
            pVar.f7366a = f4;
            if (mo6582c(f4, f3)) {
                this.f7372c.f7367b = 0.0f;
            }
            return this.f7372c;
        }
    }

    /* renamed from: m3.c$b */
    public interface C1958b {
        /* renamed from: a */
        void mo6586a(int i);
    }

    public C1956c(C1960e eVar, C1958b bVar) {
        super(eVar);
        C1957a aVar = new C1957a();
        this.f7368B = aVar;
        aVar.mo6584e(mo6530e());
        this.f7369C = bVar;
    }

    /* renamed from: x */
    private float m7969x(float f) {
        return (float) ((Math.log((double) (f / this.f7351a)) * 1000.0d) / ((double) this.f7368B.f7370a));
    }

    /* renamed from: A */
    public C1956c mo6534k(float f) {
        super.mo6534k(f);
        return this;
    }

    /* renamed from: B */
    public C1956c mo6538o(float f) {
        super.mo6538o(f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6539p(float f) {
        this.f7368B.mo6584e(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo6541s(long j) {
        C1936b.C1952p f = this.f7368B.mo6585f(this.f7352b, this.f7351a, j);
        float f2 = f.f7366a;
        this.f7352b = f2;
        float f3 = f.f7367b;
        this.f7351a = f3;
        float f4 = this.f7358h;
        if (f2 < f4) {
            this.f7352b = f4;
            return true;
        }
        float f5 = this.f7357g;
        if (f2 > f5) {
            this.f7352b = f5;
            return true;
        } else if (!mo6576t(f2, f3)) {
            return false;
        } else {
            this.f7369C.mo6586a((int) this.f7352b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo6576t(float f, float f2) {
        return f >= this.f7357g || f <= this.f7358h || this.f7368B.mo6582c(f, f2);
    }

    /* renamed from: u */
    public float mo6577u() {
        return m7969x(Math.signum(this.f7351a) * this.f7368B.f7371b);
    }

    /* renamed from: v */
    public float mo6578v() {
        return (this.f7352b - (this.f7351a / this.f7368B.f7370a)) + ((Math.signum(this.f7351a) * this.f7368B.f7371b) / this.f7368B.f7370a);
    }

    /* renamed from: w */
    public float mo6579w(float f) {
        return m7969x(((f - this.f7352b) + (this.f7351a / this.f7368B.f7370a)) * this.f7368B.f7370a);
    }

    /* renamed from: y */
    public C1956c mo6580y(float f) {
        if (f > 0.0f) {
            this.f7368B.mo6583d(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    /* renamed from: z */
    public C1956c mo6533j(float f) {
        super.mo6533j(f);
        return this;
    }
}
