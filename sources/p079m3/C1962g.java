package p079m3;

import p079m3.C1936b;

/* renamed from: m3.g */
public final class C1962g {

    /* renamed from: a */
    double f7380a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f7381b = 0.5d;

    /* renamed from: c */
    double f7382c = 1000.0d;

    /* renamed from: d */
    private boolean f7383d = false;

    /* renamed from: e */
    private double f7384e;

    /* renamed from: f */
    private double f7385f;

    /* renamed from: g */
    private double f7386g;

    /* renamed from: h */
    private double f7387h;

    /* renamed from: i */
    private double f7388i;

    /* renamed from: j */
    private double f7389j = Double.MAX_VALUE;

    /* renamed from: k */
    private final C1936b.C1952p f7390k = new C1936b.C1952p();

    /* renamed from: b */
    private void m8001b() {
        if (!this.f7383d) {
            if (this.f7389j != Double.MAX_VALUE) {
                double d = this.f7381b;
                if (d > 1.0d) {
                    double d2 = this.f7380a;
                    this.f7386g = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f7381b;
                    double d4 = this.f7380a;
                    this.f7387h = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f7388i = this.f7380a * Math.sqrt(1.0d - (d * d));
                }
                this.f7383d = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public float mo6592a() {
        return (float) this.f7389j;
    }

    /* renamed from: c */
    public boolean mo6593c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f7385f && ((double) Math.abs(f - mo6592a())) < this.f7384e;
    }

    /* renamed from: d */
    public C1962g mo6594d(float f) {
        if (f >= 0.0f) {
            this.f7381b = (double) f;
            this.f7383d = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C1962g mo6595e(float f) {
        this.f7389j = (double) f;
        return this;
    }

    /* renamed from: f */
    public C1962g mo6596f(float f) {
        if (f > 0.0f) {
            this.f7380a = Math.sqrt((double) f);
            this.f7383d = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: g */
    public C1962g mo6597g(double d) {
        this.f7382c = d;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6598h(double d) {
        double abs = Math.abs(d);
        this.f7384e = abs;
        this.f7385f = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1936b.C1952p mo6599i(double d, double d2, long j) {
        double d3;
        double d4;
        m8001b();
        double d5 = ((double) j) / this.f7382c;
        double d6 = d - this.f7389j;
        double d7 = this.f7381b;
        if (d7 > 1.0d) {
            double d8 = this.f7387h;
            double d9 = this.f7386g;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f7386g * d5) * d11);
            double d12 = this.f7387h;
            double pow = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f7386g;
            d3 = pow + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f7380a;
            double d15 = d2 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            d4 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow2 = d16 * Math.pow(2.718281828459045d, (-this.f7380a) * d5);
            double d17 = this.f7380a;
            d3 = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow2 * (-d17));
        } else {
            double d18 = 1.0d / this.f7388i;
            double d19 = this.f7380a;
            double d20 = d18 * ((d7 * d19 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f7388i * d5) * d6) + (Math.sin(this.f7388i * d5) * d20));
            double d21 = this.f7380a;
            double d22 = this.f7381b;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.f7388i;
            double d24 = pow3;
            double sin = (-d23) * d6 * Math.sin(d23 * d5);
            double d25 = this.f7388i;
            d3 = ((-d21) * pow3 * d22) + (pow4 * (sin + (d20 * d25 * Math.cos(d25 * d5))));
            d4 = d24;
        }
        if (Math.abs(d4) < 0.6000000238418579d) {
            d4 = 0.0d;
            d3 = 0.0d;
        }
        C1936b.C1952p pVar = this.f7390k;
        pVar.f7366a = (float) (d4 + this.f7389j);
        pVar.f7367b = (float) d3;
        return pVar;
    }
}
