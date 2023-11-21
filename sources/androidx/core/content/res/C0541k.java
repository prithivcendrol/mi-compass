package androidx.core.content.res;

/* renamed from: androidx.core.content.res.k */
final class C0541k {

    /* renamed from: k */
    static final C0541k f2535k = m2234k(C0519b.f2506c, (float) ((((double) C0519b.m2167h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f2536a;

    /* renamed from: b */
    private final float f2537b;

    /* renamed from: c */
    private final float f2538c;

    /* renamed from: d */
    private final float f2539d;

    /* renamed from: e */
    private final float f2540e;

    /* renamed from: f */
    private final float f2541f;

    /* renamed from: g */
    private final float[] f2542g;

    /* renamed from: h */
    private final float f2543h;

    /* renamed from: i */
    private final float f2544i;

    /* renamed from: j */
    private final float f2545j;

    private C0541k(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f2541f = f;
        this.f2536a = f2;
        this.f2537b = f3;
        this.f2538c = f4;
        this.f2539d = f5;
        this.f2540e = f6;
        this.f2542g = fArr;
        this.f2543h = f7;
        this.f2544i = f8;
        this.f2545j = f9;
    }

    /* renamed from: k */
    static C0541k m2234k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4 = f;
        float[][] fArr2 = C0519b.f2504a;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = (fArr3[0] * f5) + (fArr3[1] * f6) + (fArr3[2] * f7);
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[0] * f5) + (fArr4[1] * f6) + (fArr4[2] * f7);
        float[] fArr5 = fArr2[2];
        float f10 = (f5 * fArr5[0]) + (f6 * fArr5[1]) + (f7 * fArr5[2]);
        float f11 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f11) >= 0.9d ? C0519b.m2163d(0.59f, 0.69f, (f11 - 0.9f) * 10.0f) : C0519b.m2163d(0.525f, 0.59f, (f11 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f11;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f4) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f4) + (0.1f * f14 * f14 * ((float) Math.cbrt(((double) f4) * 5.0d)));
        float h = C0519b.m2167h(f2) / fArr[1];
        double d3 = (double) h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f10)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f9)) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        return new C0541k(h, ((f16 * 2.0f) + ((f17 * 400.0f) / (f17 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, d, f11, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2594a() {
        return this.f2536a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo2595b() {
        return this.f2539d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2596c() {
        return this.f2543h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo2597d() {
        return this.f2544i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo2598e() {
        return this.f2541f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo2599f() {
        return this.f2537b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2600g() {
        return this.f2540e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo2601h() {
        return this.f2538c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] mo2602i() {
        return this.f2542g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2603j() {
        return this.f2545j;
    }
}
