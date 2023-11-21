package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.C0459b;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p075m.C1885b;

/* renamed from: androidx.constraintlayout.motion.widget.k */
class C0451k implements Comparable<C0451k> {

    /* renamed from: v */
    static String[] f1679v = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: d */
    C1885b f1680d;

    /* renamed from: e */
    int f1681e = 0;

    /* renamed from: f */
    float f1682f;

    /* renamed from: g */
    float f1683g;

    /* renamed from: h */
    float f1684h;

    /* renamed from: i */
    float f1685i;

    /* renamed from: j */
    float f1686j;

    /* renamed from: k */
    float f1687k;

    /* renamed from: l */
    float f1688l = Float.NaN;

    /* renamed from: m */
    float f1689m = Float.NaN;

    /* renamed from: n */
    int f1690n;

    /* renamed from: o */
    int f1691o;

    /* renamed from: p */
    float f1692p;

    /* renamed from: q */
    C0442g f1693q;

    /* renamed from: r */
    LinkedHashMap<String, C0459b> f1694r;

    /* renamed from: s */
    int f1695s;

    /* renamed from: t */
    double[] f1696t;

    /* renamed from: u */
    double[] f1697u;

    public C0451k() {
        int i = C0439d.f1585a;
        this.f1690n = i;
        this.f1691o = i;
        this.f1692p = Float.NaN;
        this.f1693q = null;
        this.f1694r = new LinkedHashMap<>();
        this.f1695s = 0;
        this.f1696t = new double[18];
        this.f1697u = new double[18];
    }

    /* renamed from: a */
    public int compareTo(C0451k kVar) {
        return Float.compare(this.f1683g, kVar.f1683g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2417b(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f1684h;
        float f3 = this.f1685i;
        float f4 = this.f1686j;
        float f5 = this.f1687k;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        C0442g gVar = this.f1693q;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.mo2338b(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            double d2 = (double) f2;
            float f18 = fArr4[1];
            double d3 = (double) f3;
            f = f4;
            double d4 = (double) f6;
            double d5 = (double) f8;
            float sin = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f16) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2418c(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f1684h;
        float f5 = this.f1685i;
        float f6 = this.f1686j;
        float f7 = this.f1687k;
        if (iArr2.length != 0 && this.f1696t.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f1696t = new double[i];
            this.f1697u = new double[i];
        }
        Arrays.fill(this.f1696t, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            double[] dArr5 = this.f1696t;
            int i3 = iArr2[i2];
            dArr5[i3] = dArr[i2];
            this.f1697u[i3] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr6 = this.f1696t;
            if (i4 >= dArr6.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr6[i4]) || !(dArr3 == null || dArr3[i4] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f1696t[i4])) {
                    d = this.f1696t[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f1697u[i4];
                if (i4 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i4 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i4 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i4 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i4 == 5) {
                    f8 = f13;
                }
                i4++;
                double[] dArr7 = dArr2;
            } else {
                f3 = f8;
            }
            f8 = f3;
            i4++;
            double[] dArr72 = dArr2;
        }
        float f15 = f8;
        C0442g gVar = this.f1693q;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.mo2338b((double) f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = (double) f4;
            double d3 = (double) f5;
            double sin = ((double) f16) + (Math.sin(d3) * d2);
            f2 = f7;
            float f20 = (float) (sin - ((double) (f6 / 2.0f)));
            float cos = (float) ((((double) f17) - (Math.cos(d3) * d2)) - ((double) (f7 / 2.0f)));
            double d4 = (double) f9;
            double d5 = (double) f10;
            float sin2 = (float) (((double) f18) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float f21 = f20;
            float cos2 = (float) ((((double) f19) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            double[] dArr8 = dArr2;
            if (dArr8.length >= 2) {
                z3 = false;
                dArr8[0] = (double) sin2;
                z2 = true;
                dArr8[1] = (double) cos2;
            } else {
                z3 = false;
                z2 = true;
            }
            if (!Float.isNaN(f15)) {
                view2.setRotation((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            z3 = false;
            z2 = true;
            if (!Float.isNaN(f22)) {
                view2.setRotation((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        if (view2 instanceof C0438c) {
            ((C0438c) view2).mo2336a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f23 = f4 + 0.5f;
        int i5 = (int) f23;
        float f24 = f5 + 0.5f;
        int i6 = (int) f24;
        int i7 = (int) (f23 + f6);
        int i8 = (int) (f24 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (!(i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight())) {
            z3 = z2;
        }
        if (z3 || z) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view2.layout(i5, i6, i7, i8);
    }
}
