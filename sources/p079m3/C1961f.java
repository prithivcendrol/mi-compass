package p079m3;

import p079m3.C1936b;

/* renamed from: m3.f */
public final class C1961f extends C1936b<C1961f> {

    /* renamed from: B */
    private C1962g f7377B = null;

    /* renamed from: C */
    private float f7378C = Float.MAX_VALUE;

    /* renamed from: D */
    private boolean f7379D = false;

    public C1961f(C1960e eVar) {
        super(eVar);
    }

    /* renamed from: v */
    private void m7994v() {
        C1962g gVar = this.f7377B;
        if (gVar != null) {
            double a = (double) gVar.mo6592a();
            if (a > ((double) this.f7357g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f7358h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6539p(float f) {
    }

    /* renamed from: q */
    public void mo6540q(boolean z) {
        m7994v();
        this.f7377B.mo6598h((double) mo6530e());
        super.mo6540q(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo6541s(long j) {
        long j2;
        double d;
        double d2;
        C1962g gVar;
        if (this.f7379D) {
            float f = this.f7378C;
            if (f != Float.MAX_VALUE) {
                this.f7377B.mo6595e(f);
                this.f7378C = Float.MAX_VALUE;
            }
            this.f7352b = this.f7377B.mo6592a();
            this.f7351a = 0.0f;
            this.f7379D = false;
            return true;
        }
        if (this.f7378C != Float.MAX_VALUE) {
            this.f7377B.mo6592a();
            j2 = j / 2;
            C1936b.C1952p i = this.f7377B.mo6599i((double) this.f7352b, (double) this.f7351a, j2);
            this.f7377B.mo6595e(this.f7378C);
            this.f7378C = Float.MAX_VALUE;
            gVar = this.f7377B;
            d2 = (double) i.f7366a;
            d = (double) i.f7367b;
        } else {
            gVar = this.f7377B;
            d2 = (double) this.f7352b;
            d = (double) this.f7351a;
            j2 = j;
        }
        C1936b.C1952p i2 = gVar.mo6599i(d2, d, j2);
        this.f7352b = i2.f7366a;
        this.f7351a = i2.f7367b;
        float max = Math.max(this.f7352b, this.f7358h);
        this.f7352b = max;
        float min = Math.min(max, this.f7357g);
        this.f7352b = min;
        if (!mo6590u(min, this.f7351a)) {
            return false;
        }
        this.f7352b = this.f7377B.mo6592a();
        this.f7351a = 0.0f;
        return true;
    }

    /* renamed from: t */
    public C1962g mo6589t() {
        return this.f7377B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo6590u(float f, float f2) {
        return this.f7377B.mo6593c(f, f2);
    }

    /* renamed from: w */
    public C1961f mo6591w(C1962g gVar) {
        this.f7377B = gVar;
        return this;
    }
}
