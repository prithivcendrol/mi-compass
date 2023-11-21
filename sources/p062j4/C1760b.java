package p062j4;

import android.view.animation.AnimationUtils;

/* renamed from: j4.b */
public class C1760b {

    /* renamed from: a */
    private long f6780a;

    /* renamed from: b */
    private long f6781b;

    /* renamed from: c */
    private double f6782c;

    /* renamed from: d */
    private double f6783d;

    /* renamed from: e */
    private C1759a f6784e;

    /* renamed from: f */
    private double f6785f;

    /* renamed from: g */
    private double f6786g;

    /* renamed from: h */
    private double f6787h;

    /* renamed from: i */
    private double f6788i;

    /* renamed from: j */
    private double f6789j;

    /* renamed from: k */
    private double f6790k;

    /* renamed from: l */
    private double f6791l;

    /* renamed from: m */
    private double f6792m;

    /* renamed from: n */
    private int f6793n;

    /* renamed from: o */
    private boolean f6794o = true;

    /* renamed from: p */
    private boolean f6795p;

    /* renamed from: q */
    private int f6796q;

    /* renamed from: a */
    public boolean mo6048a() {
        if (this.f6784e == null || this.f6794o) {
            return false;
        }
        int i = this.f6796q;
        if (i != 0) {
            if (this.f6793n == 1) {
                this.f6782c = (double) i;
                this.f6786g = (double) i;
            } else {
                this.f6783d = (double) i;
                this.f6789j = (double) i;
            }
            this.f6796q = 0;
            return true;
        } else if (this.f6795p) {
            this.f6794o = true;
            return true;
        } else {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f6781b = currentAnimationTimeMillis;
            float f = 0.016f;
            float min = Math.min(((float) (currentAnimationTimeMillis - this.f6780a)) / 1000.0f, 0.016f);
            if (min != 0.0f) {
                f = min;
            }
            this.f6780a = this.f6781b;
            int i2 = this.f6793n;
            C1759a aVar = this.f6784e;
            double d = this.f6792m;
            if (i2 == 2) {
                double a = aVar.mo6047a(d, f, this.f6788i, this.f6789j);
                double d2 = this.f6789j + (((double) f) * a);
                this.f6783d = d2;
                this.f6792m = a;
                if (mo6052e(d2, this.f6790k, this.f6788i)) {
                    this.f6795p = true;
                    this.f6783d = this.f6788i;
                } else {
                    this.f6789j = this.f6783d;
                }
            } else {
                double a2 = aVar.mo6047a(d, f, this.f6785f, this.f6786g);
                double d3 = this.f6786g + (((double) f) * a2);
                this.f6782c = d3;
                this.f6792m = a2;
                if (mo6052e(d3, this.f6787h, this.f6785f)) {
                    this.f6795p = true;
                    this.f6782c = this.f6785f;
                } else {
                    this.f6786g = this.f6782c;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo6049b() {
        this.f6794o = true;
        this.f6796q = 0;
    }

    /* renamed from: c */
    public final int mo6050c() {
        return (int) this.f6782c;
    }

    /* renamed from: d */
    public final int mo6051d() {
        return (int) this.f6783d;
    }

    /* renamed from: e */
    public boolean mo6052e(double d, double d2, double d3) {
        if (d2 < d3 && d > d3) {
            return true;
        }
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        if (i <= 0 || d >= d3) {
            return (i == 0 && Math.signum(this.f6791l) != Math.signum(d)) || Math.abs(d - d3) < 1.0d;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo6053f() {
        return this.f6794o;
    }

    /* renamed from: g */
    public void mo6054g(float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        this.f6794o = false;
        this.f6795p = false;
        double d = (double) f;
        this.f6786g = d;
        this.f6787h = d;
        this.f6785f = (double) f2;
        double d2 = (double) f3;
        this.f6789j = d2;
        this.f6790k = d2;
        this.f6783d = (double) ((int) d2);
        this.f6788i = (double) f4;
        double d3 = (double) f5;
        this.f6791l = d3;
        this.f6792m = d3;
        this.f6784e = (Math.abs(d3) <= 5000.0d || z) ? new C1759a(1.0f, 0.4f) : new C1759a(1.0f, 0.55f);
        this.f6793n = i;
        this.f6780a = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: h */
    public void mo6055h(int i) {
        this.f6796q = i;
    }
}
