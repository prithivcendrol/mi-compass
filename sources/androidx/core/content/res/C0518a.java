package androidx.core.content.res;

import androidx.core.graphics.C0542a;

/* renamed from: androidx.core.content.res.a */
class C0518a {

    /* renamed from: a */
    private final float f2495a;

    /* renamed from: b */
    private final float f2496b;

    /* renamed from: c */
    private final float f2497c;

    /* renamed from: d */
    private final float f2498d;

    /* renamed from: e */
    private final float f2499e;

    /* renamed from: f */
    private final float f2500f;

    /* renamed from: g */
    private final float f2501g;

    /* renamed from: h */
    private final float f2502h;

    /* renamed from: i */
    private final float f2503i;

    C0518a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f2495a = f;
        this.f2496b = f2;
        this.f2497c = f3;
        this.f2498d = f4;
        this.f2499e = f5;
        this.f2500f = f6;
        this.f2501g = f7;
        this.f2502h = f8;
        this.f2503i = f9;
    }

    /* renamed from: b */
    private static C0518a m2144b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        float f5 = 0.0f;
        C0518a aVar = null;
        float f6 = 100.0f;
        float f7 = 1000.0f;
        while (Math.abs(f5 - f6) > 0.01f) {
            float f8 = ((f6 - f5) / 2.0f) + f5;
            int p = m2147e(f8, f2, f).mo2576p();
            float b = C0519b.m2161b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C0518a c = m2145c(p);
                float a = c.mo2568a(m2147e(c.mo2573k(), c.mo2571i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f4 = abs;
                    f7 = a;
                }
            }
            if (f4 == 0.0f && f7 == 0.0f) {
                break;
            } else if (b < f3) {
                f5 = f8;
            } else {
                f6 = f8;
            }
        }
        return aVar;
    }

    /* renamed from: c */
    static C0518a m2145c(int i) {
        return m2146d(i, C0541k.f2535k);
    }

    /* renamed from: d */
    static C0518a m2146d(int i, C0541k kVar) {
        float[] f = C0519b.m2165f(i);
        float[][] fArr = C0519b.f2504a;
        float f2 = f[0];
        float[] fArr2 = fArr[0];
        float f3 = f[1];
        float f4 = f[2];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = kVar.mo2602i()[0] * f5;
        float f9 = kVar.mo2602i()[1] * f6;
        float f10 = kVar.mo2602i()[2] * f7;
        float pow = (float) Math.pow(((double) (kVar.mo2596c() * Math.abs(f8))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (kVar.mo2596c() * Math.abs(f9))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (kVar.mo2596c() * Math.abs(f10))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f11 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f12 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = (((signum * 20.0f) + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f12, (double) f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f15 * kVar.mo2599f()) / kVar.mo2594a()), (double) (kVar.mo2595b() * kVar.mo2603j()))) * 100.0f;
        float d2 = kVar.mo2597d() * (4.0f / kVar.mo2595b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (kVar.mo2594a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) kVar.mo2598e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f16) < 20.14d ? 360.0f + f16 : f16)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.mo2600g()) * kVar.mo2601h()) * ((float) Math.sqrt((double) ((f11 * f11) + (f12 * f12))))) / (f14 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * kVar.mo2597d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * kVar.mo2595b()) / (kVar.mo2594a() + 4.0f)))) * 50.0f;
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f17;
        return new C0518a(f16, sqrt, pow4, d2, d3, sqrt2, f18, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: e */
    private static C0518a m2147e(float f, float f2, float f3) {
        return m2148f(f, f2, f3, C0541k.f2535k);
    }

    /* renamed from: f */
    private static C0518a m2148f(float f, float f2, float f3, C0541k kVar) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / kVar.mo2595b()) * ((float) Math.sqrt(d)) * (kVar.mo2594a() + 4.0f) * kVar.mo2597d();
        float d2 = f2 * kVar.mo2597d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * kVar.mo2595b()) / (kVar.mo2594a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C0518a(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: m */
    static int m2149m(float f, float f2, float f3) {
        return m2150n(f, f2, f3, C0541k.f2535k);
    }

    /* renamed from: n */
    static int m2150n(float f, float f2, float f3, C0541k kVar) {
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return C0519b.m2160a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        C0518a aVar = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            C0518a b = m2144b(min, f5, f3);
            if (z) {
                if (b != null) {
                    return b.mo2575o(kVar);
                }
                z = false;
            } else if (b == null) {
                f2 = f5;
            } else {
                f4 = f5;
                aVar = b;
            }
            f5 = ((f2 - f4) / 2.0f) + f4;
        }
        return aVar == null ? C0519b.m2160a(f3) : aVar.mo2575o(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2568a(C0518a aVar) {
        float l = mo2574l() - aVar.mo2574l();
        float g = mo2569g() - aVar.mo2569g();
        float h = mo2570h() - aVar.mo2570h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2569g() {
        return this.f2502h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo2570h() {
        return this.f2503i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2571i() {
        return this.f2496b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2572j() {
        return this.f2495a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo2573k() {
        return this.f2497c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo2574l() {
        return this.f2501g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo2575o(C0541k kVar) {
        float pow = (float) Math.pow(((double) ((((double) mo2571i()) == 0.0d || ((double) mo2573k()) == 0.0d) ? 0.0f : mo2571i() / ((float) Math.sqrt(((double) mo2573k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) kVar.mo2598e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo2572j() * 3.1415927f) / 180.0f);
        float a = kVar.mo2594a() * ((float) Math.pow(((double) mo2573k()) / 100.0d, (1.0d / ((double) kVar.mo2595b())) / ((double) kVar.mo2603j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * kVar.mo2600g() * kVar.mo2601h();
        float f = a / kVar.mo2599f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / kVar.mo2596c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / kVar.mo2596c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum3 = Math.signum(f8) * (100.0f / kVar.mo2596c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float f9 = signum / kVar.mo2602i()[0];
        float f10 = signum2 / kVar.mo2602i()[1];
        float f11 = signum3 / kVar.mo2602i()[2];
        float[][] fArr = C0519b.f2505b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C0542a.m2245a((double) f12, (double) ((fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11)), (double) ((f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2])));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo2576p() {
        return mo2575o(C0541k.f2535k);
    }
}
