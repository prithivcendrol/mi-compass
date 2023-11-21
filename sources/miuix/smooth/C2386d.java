package miuix.smooth;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: miuix.smooth.d */
public class C2386d {

    /* renamed from: a */
    private float f9270a = 0.8f;

    /* renamed from: b */
    private float f9271b = 0.46f;

    /* renamed from: miuix.smooth.d$a */
    public static class C2387a {

        /* renamed from: a */
        public RectF f9272a;

        /* renamed from: b */
        public float f9273b;

        /* renamed from: c */
        public double f9274c;

        /* renamed from: d */
        public double f9275d;

        /* renamed from: e */
        public double f9276e;

        /* renamed from: f */
        public double f9277f;

        /* renamed from: g */
        public float f9278g;

        /* renamed from: h */
        public PointF[] f9279h = new PointF[4];

        /* renamed from: i */
        public PointF[] f9280i = new PointF[4];

        /* renamed from: a */
        public void mo9233a(float f, RectF rectF, float f2, float f3, double d, float f4, int i) {
            RectF rectF2 = rectF;
            float f5 = f2;
            float f6 = f3;
            double d2 = d;
            float f7 = f4;
            int i2 = i;
            this.f9273b = f;
            float width = rectF.width();
            float height = rectF.height();
            float f8 = rectF2.left;
            float f9 = rectF2.top;
            float f10 = rectF2.right;
            float f11 = rectF2.bottom;
            this.f9274c = C2386d.m10123K(width, this.f9273b, d2, f7);
            this.f9275d = C2386d.m10122J(height, this.f9273b, d2, f7);
            this.f9276e = C2386d.m10125M(this.f9274c);
            double k = C2386d.m10124L(this.f9275d);
            this.f9277f = k;
            this.f9278g = (float) C2386d.m10121I((1.5707963267948966d - k) - this.f9276e);
            double d3 = (double) f7;
            double m = C2386d.m10114B(this.f9274c * d3, this.f9276e);
            float f12 = f10;
            double n = C2386d.m10116D(this.f9273b, this.f9276e);
            double o = C2386d.m10118F(this.f9273b, this.f9276e);
            double p = C2386d.m10120H(this.f9273b, this.f9276e);
            double q = C2386d.m10127O(this.f9273b, this.f9276e);
            double c = C2386d.m10129Q(m, q);
            double d4 = C2386d.m10113A(this.f9275d * d3, this.f9277f);
            double d5 = q;
            double e = C2386d.m10115C(this.f9273b, this.f9277f);
            double f13 = C2386d.m10117E(this.f9273b, this.f9277f);
            double g = C2386d.m10119G(this.f9273b, this.f9277f);
            double d6 = e;
            double h = C2386d.m10126N(this.f9273b, this.f9277f);
            double i3 = C2386d.m10128P(d4, h);
            if (i2 == 0) {
                float f14 = f8 + f5;
                float f15 = f9 + f6;
                float f16 = this.f9273b;
                this.f9272a = new RectF(f14, f15, (f16 * 2.0f) + f14, (f16 * 2.0f) + f15);
                double d7 = (double) f14;
                double d8 = (double) f15;
                this.f9279h[0] = new PointF((float) (n + d7), (float) (o + d8));
                this.f9279h[1] = new PointF((float) (p + d7), f15);
                double d9 = p + d5;
                double d10 = d8;
                this.f9279h[2] = new PointF((float) (d9 + d7), f15);
                this.f9279h[3] = new PointF((float) (d9 + c + d7), f15);
                double d11 = h + g;
                float f17 = f14;
                this.f9280i[0] = new PointF(f17, (float) (d11 + i3 + d10));
                this.f9280i[1] = new PointF(f17, (float) (d11 + d10));
                this.f9280i[2] = new PointF(f17, (float) (g + d10));
                this.f9280i[3] = new PointF((float) (d6 + d7), (float) (f13 + d10));
                return;
            }
            double d12 = n;
            double d13 = i3;
            if (i2 == 1) {
                float f18 = f9 + f6;
                float f19 = this.f9273b;
                float f20 = f12 - f5;
                this.f9272a = new RectF((f12 - (f19 * 2.0f)) - f5, f18, f20, (f19 * 2.0f) + f18);
                double d14 = (double) f12;
                double d15 = d14 - p;
                double d16 = d15 - d5;
                double d17 = h;
                double d18 = (double) f5;
                this.f9279h[0] = new PointF((float) ((d16 - c) - d18), f18);
                this.f9279h[1] = new PointF((float) (d16 - d18), f18);
                this.f9279h[2] = new PointF((float) (d15 - d18), f18);
                double d19 = (double) f18;
                this.f9279h[3] = new PointF((float) ((d14 - d12) - d18), (float) (o + d19));
                this.f9280i[0] = new PointF((float) ((d14 - d6) - d18), (float) (f13 + d19));
                float f21 = f20;
                this.f9280i[1] = new PointF(f21, (float) (g + d19));
                double d20 = g + d17;
                this.f9280i[2] = new PointF(f21, (float) (d20 + d19));
                this.f9280i[3] = new PointF(f21, (float) (d20 + d13 + d19));
                return;
            }
            float f22 = f12;
            double d21 = h;
            if (i2 == 2) {
                float f23 = this.f9273b;
                float f24 = f22 - f5;
                float f25 = f11 - f6;
                this.f9272a = new RectF((f22 - (f23 * 2.0f)) - f5, (f11 - (f23 * 2.0f)) - f6, f24, f25);
                double d22 = (double) f22;
                double d23 = (double) f5;
                double d24 = g;
                double d25 = (double) f11;
                double d26 = (double) f6;
                this.f9279h[0] = new PointF((float) ((d22 - d12) - d23), (float) ((d25 - o) - d26));
                double d27 = d22 - p;
                this.f9279h[1] = new PointF((float) (d27 - d23), f25);
                double d28 = d27 - d5;
                this.f9279h[2] = new PointF((float) (d28 - d23), f25);
                this.f9279h[3] = new PointF((float) ((d28 - c) - d23), f25);
                double d29 = d25 - d24;
                double d30 = d29 - d21;
                double d31 = d25;
                float f26 = f24;
                this.f9280i[0] = new PointF(f26, (float) ((d30 - d13) - d26));
                this.f9280i[1] = new PointF(f26, (float) (d30 - d26));
                this.f9280i[2] = new PointF(f26, (float) (d29 - d26));
                this.f9280i[3] = new PointF((float) ((d22 - d6) - d23), (float) ((d31 - f13) - d26));
                return;
            }
            double d32 = g;
            if (i2 == 3) {
                float f27 = f8 + f5;
                float f28 = this.f9273b;
                float f29 = f11 - f6;
                this.f9272a = new RectF(f27, (f11 - (f28 * 2.0f)) - f6, (f28 * 2.0f) + f27, f29);
                double d33 = p + d5;
                double d34 = (double) f27;
                this.f9279h[0] = new PointF((float) (d33 + c + d34), f29);
                this.f9279h[1] = new PointF((float) (d33 + d34), f29);
                this.f9279h[2] = new PointF((float) (p + d34), f29);
                double d35 = (double) f11;
                double d36 = (double) f6;
                this.f9279h[3] = new PointF((float) (d12 + d34), (float) ((d35 - o) - d36));
                this.f9280i[0] = new PointF((float) (d6 + d34), (float) ((d35 - f13) - d36));
                double d37 = d35 - d32;
                this.f9280i[1] = new PointF(f27, (float) (d37 - d36));
                double d38 = d37 - d21;
                this.f9280i[2] = new PointF(f27, (float) (d38 - d36));
                this.f9280i[3] = new PointF(f27, (float) ((d38 - d13) - d36));
            }
        }
    }

    /* renamed from: miuix.smooth.d$b */
    public static class C2388b {

        /* renamed from: a */
        public float f9281a;

        /* renamed from: b */
        public float f9282b;

        /* renamed from: c */
        public double f9283c;

        /* renamed from: d */
        public float f9284d;

        /* renamed from: e */
        public C2387a f9285e = null;

        /* renamed from: f */
        public C2387a f9286f = null;

        /* renamed from: g */
        public C2387a f9287g = null;

        /* renamed from: h */
        public C2387a f9288h = null;

        public C2388b(float f, float f2, double d, float f3) {
            this.f9281a = f;
            this.f9282b = f2;
            this.f9283c = d;
            this.f9284d = f3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static double m10113A(double d, double d2) {
        if (d2 == 0.0d) {
            return 0.0d;
        }
        double d3 = d2 / 2.0d;
        return (((((d * 0.46000000834465027d) + Math.tan(d3)) * 2.0d) * (Math.cos(d2) + 1.0d)) / (Math.tan(d3) * 3.0d)) - 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static double m10114B(double d, double d2) {
        if (d2 == 0.0d) {
            return 0.0d;
        }
        double d3 = d2 / 2.0d;
        return (((((d * 0.46000000834465027d) + Math.tan(d3)) * 2.0d) * (Math.cos(d2) + 1.0d)) / (Math.tan(d3) * 3.0d)) - 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static double m10115C(float f, double d) {
        return ((double) f) * (1.0d - Math.cos(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static double m10116D(float f, double d) {
        return ((double) f) * (1.0d - Math.sin(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static double m10117E(float f, double d) {
        return ((double) f) * (1.0d - Math.sin(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static double m10118F(float f, double d) {
        return ((double) f) * (1.0d - Math.cos(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static double m10119G(float f, double d) {
        return ((double) f) * (1.0d - Math.tan(d / 2.0d));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static double m10120H(float f, double d) {
        return ((double) f) * (1.0d - Math.tan(d / 2.0d));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static double m10121I(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static double m10122J(float f, float f2, double d, float f3) {
        return m10149y(f, f2, f2, d, f3) ? (double) Math.max(Math.min(((f / (f2 * 2.0f)) - 1.0f) / f3, 1.0f), 0.0f) : d;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static double m10123K(float f, float f2, double d, float f3) {
        return m10150z(f, f2, f2, d, f3) ? (double) Math.max(Math.min(((f / (f2 * 2.0f)) - 1.0f) / f3, 1.0f), 0.0f) : d;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static double m10124L(double d) {
        return (d * 3.141592653589793d) / 4.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static double m10125M(double d) {
        return (d * 3.141592653589793d) / 4.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static double m10126N(float f, double d) {
        return ((((double) f) * 1.5d) * Math.tan(d / 2.0d)) / (Math.cos(d) + 1.0d);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static double m10127O(float f, double d) {
        return ((((double) f) * 1.5d) * Math.tan(d / 2.0d)) / (Math.cos(d) + 1.0d);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static double m10128P(double d, double d2) {
        return d * d2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static double m10129Q(double d, double d2) {
        return d * d2;
    }

    /* renamed from: t */
    private void m10147t(C2388b bVar) {
        if (bVar.f9285e == null) {
            bVar.f9285e = new C2387a();
        }
        if (bVar.f9286f == null) {
            bVar.f9286f = new C2387a();
        }
        if (bVar.f9287g == null) {
            bVar.f9287g = new C2387a();
        }
        if (bVar.f9288h == null) {
            bVar.f9288h = new C2387a();
        }
    }

    /* renamed from: x */
    private boolean m10148x(C2388b bVar) {
        return bVar.f9285e == null || bVar.f9286f == null || bVar.f9287g == null || bVar.f9288h == null;
    }

    /* renamed from: y */
    private static boolean m10149y(float f, float f2, float f3, double d, float f4) {
        return ((double) f) <= ((double) (f2 + f3)) * ((d * ((double) f4)) + 1.0d);
    }

    /* renamed from: z */
    private static boolean m10150z(float f, float f2, float f3, double d, float f4) {
        return ((double) f) <= ((double) (f2 + f3)) * ((d * ((double) f4)) + 1.0d);
    }

    /* renamed from: r */
    public C2388b mo9228r(RectF rectF, float f, float f2, float f3) {
        return mo9229s(rectF, new float[]{f, f, f, f, f, f, f, f}, f2, f3);
    }

    /* renamed from: s */
    public C2388b mo9229s(RectF rectF, float[] fArr, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        C2386d dVar;
        float[] fArr2 = fArr;
        if (fArr2 == null) {
            return null;
        }
        float u = mo9230u();
        float v = mo9231v();
        float width = rectF.width();
        float height = rectF.height();
        double d = (double) v;
        C2388b bVar = new C2388b(width, height, d, u);
        float[] fArr3 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        for (int i = 0; i < Math.min(8, fArr2.length); i++) {
            if (!Float.isNaN(fArr2[i])) {
                fArr3[i] = fArr2[i];
            }
        }
        float f7 = fArr3[0];
        float f8 = fArr3[1];
        float f9 = fArr3[2];
        float f10 = fArr3[3];
        float f11 = fArr3[4];
        float f12 = fArr3[5];
        float f13 = fArr3[6];
        float f14 = fArr3[7];
        if (f7 + f9 > width) {
            float f15 = (width * f7) / (f7 + f9);
            f9 = (width * f9) / (f7 + f9);
            f7 = f15;
        }
        float f16 = f9;
        if (f10 + f12 > height) {
            float f17 = (height * f10) / (f10 + f12);
            f12 = (height * f12) / (f10 + f12);
            f3 = f17;
        } else {
            f3 = f10;
        }
        if (f11 + f13 > width) {
            f5 = (width * f13) / (f11 + f13);
            f4 = (width * f11) / (f11 + f13);
        } else {
            f5 = f13;
            f4 = f11;
        }
        if (f14 + f8 > height) {
            f8 = (height * f8) / (f14 + f8);
            dVar = this;
            f6 = (height * f14) / (f14 + f8);
        } else {
            dVar = this;
            f6 = f14;
        }
        dVar.m10147t(bVar);
        C2387a aVar = bVar.f9285e;
        float min = Math.min(f7, f8);
        C2387a aVar2 = aVar;
        float f18 = min;
        RectF rectF2 = rectF;
        float f19 = f;
        float f20 = f2;
        float f21 = f12;
        double d2 = d;
        float f22 = f6;
        float f23 = u;
        aVar2.mo9233a(f18, rectF2, f19, f20, d2, f23, 0);
        bVar.f9286f.mo9233a(Math.min(f16, f3), rectF2, f19, f20, d2, f23, 1);
        RectF rectF3 = rectF;
        bVar.f9287g.mo9233a(Math.min(f4, f21), rectF3, f19, f20, d2, f23, 2);
        bVar.f9288h.mo9233a(Math.min(f5, f22), rectF3, f19, f20, d2, f23, 3);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo9230u() {
        return this.f9271b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public float mo9231v() {
        return this.f9270a;
    }

    /* renamed from: w */
    public Path mo9232w(Path path, C2388b bVar) {
        C2388b bVar2 = bVar;
        Path path2 = path == null ? new Path() : path;
        path2.reset();
        if (bVar2 == null) {
            return path2;
        }
        if (m10148x(bVar2)) {
            path2.addRect(new RectF(0.0f, 0.0f, bVar2.f9281a, bVar2.f9282b), Path.Direction.CCW);
            return path2;
        }
        C2387a aVar = bVar2.f9285e;
        if (aVar.f9278g != 0.0f) {
            path2.arcTo(aVar.f9272a, (float) m10121I(aVar.f9277f + 3.141592653589793d), bVar2.f9285e.f9278g);
        } else {
            PointF pointF = aVar.f9279h[0];
            path2.moveTo(pointF.x, pointF.y);
        }
        C2387a aVar2 = bVar2.f9285e;
        if (aVar2.f9274c != 0.0d) {
            PointF[] pointFArr = aVar2.f9279h;
            PointF pointF2 = pointFArr[1];
            float f = pointF2.x;
            float f2 = pointF2.y;
            PointF pointF3 = pointFArr[2];
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            PointF pointF4 = pointFArr[3];
            path2.cubicTo(f, f2, f3, f4, pointF4.x, pointF4.y);
        }
        if (!m10150z(bVar2.f9281a, bVar2.f9285e.f9273b, bVar2.f9286f.f9273b, bVar2.f9283c, bVar2.f9284d)) {
            PointF pointF5 = bVar2.f9286f.f9279h[0];
            path2.lineTo(pointF5.x, pointF5.y);
        }
        C2387a aVar3 = bVar2.f9286f;
        if (aVar3.f9274c != 0.0d) {
            PointF[] pointFArr2 = aVar3.f9279h;
            PointF pointF6 = pointFArr2[1];
            float f5 = pointF6.x;
            float f6 = pointF6.y;
            PointF pointF7 = pointFArr2[2];
            float f7 = pointF7.x;
            float f8 = pointF7.y;
            PointF pointF8 = pointFArr2[3];
            path2.cubicTo(f5, f6, f7, f8, pointF8.x, pointF8.y);
        }
        C2387a aVar4 = bVar2.f9286f;
        if (aVar4.f9278g != 0.0f) {
            path2.arcTo(aVar4.f9272a, (float) m10121I(aVar4.f9276e + 4.71238898038469d), bVar2.f9286f.f9278g);
        }
        C2387a aVar5 = bVar2.f9286f;
        if (aVar5.f9275d != 0.0d) {
            PointF[] pointFArr3 = aVar5.f9280i;
            PointF pointF9 = pointFArr3[1];
            float f9 = pointF9.x;
            float f10 = pointF9.y;
            PointF pointF10 = pointFArr3[2];
            float f11 = pointF10.x;
            float f12 = pointF10.y;
            PointF pointF11 = pointFArr3[3];
            path2.cubicTo(f9, f10, f11, f12, pointF11.x, pointF11.y);
        }
        if (!m10149y(bVar2.f9282b, bVar2.f9286f.f9273b, bVar2.f9287g.f9273b, bVar2.f9283c, bVar2.f9284d)) {
            PointF pointF12 = bVar2.f9287g.f9280i[0];
            path2.lineTo(pointF12.x, pointF12.y);
        }
        C2387a aVar6 = bVar2.f9287g;
        if (aVar6.f9275d != 0.0d) {
            PointF[] pointFArr4 = aVar6.f9280i;
            PointF pointF13 = pointFArr4[1];
            float f13 = pointF13.x;
            float f14 = pointF13.y;
            PointF pointF14 = pointFArr4[2];
            float f15 = pointF14.x;
            float f16 = pointF14.y;
            PointF pointF15 = pointFArr4[3];
            path2.cubicTo(f13, f14, f15, f16, pointF15.x, pointF15.y);
        }
        C2387a aVar7 = bVar2.f9287g;
        if (aVar7.f9278g != 0.0f) {
            path2.arcTo(aVar7.f9272a, (float) m10121I(aVar7.f9277f), bVar2.f9287g.f9278g);
        }
        C2387a aVar8 = bVar2.f9287g;
        if (aVar8.f9274c != 0.0d) {
            PointF[] pointFArr5 = aVar8.f9279h;
            PointF pointF16 = pointFArr5[1];
            float f17 = pointF16.x;
            float f18 = pointF16.y;
            PointF pointF17 = pointFArr5[2];
            float f19 = pointF17.x;
            float f20 = pointF17.y;
            PointF pointF18 = pointFArr5[3];
            path2.cubicTo(f17, f18, f19, f20, pointF18.x, pointF18.y);
        }
        if (!m10150z(bVar2.f9281a, bVar2.f9287g.f9273b, bVar2.f9288h.f9273b, bVar2.f9283c, bVar2.f9284d)) {
            PointF pointF19 = bVar2.f9288h.f9279h[0];
            path2.lineTo(pointF19.x, pointF19.y);
        }
        C2387a aVar9 = bVar2.f9288h;
        if (aVar9.f9274c != 0.0d) {
            PointF[] pointFArr6 = aVar9.f9279h;
            PointF pointF20 = pointFArr6[1];
            float f21 = pointF20.x;
            float f22 = pointF20.y;
            PointF pointF21 = pointFArr6[2];
            float f23 = pointF21.x;
            float f24 = pointF21.y;
            PointF pointF22 = pointFArr6[3];
            path2.cubicTo(f21, f22, f23, f24, pointF22.x, pointF22.y);
        }
        C2387a aVar10 = bVar2.f9288h;
        if (aVar10.f9278g != 0.0f) {
            path2.arcTo(aVar10.f9272a, (float) m10121I(aVar10.f9276e + 1.5707963267948966d), bVar2.f9288h.f9278g);
        }
        C2387a aVar11 = bVar2.f9288h;
        if (aVar11.f9275d != 0.0d) {
            PointF[] pointFArr7 = aVar11.f9280i;
            PointF pointF23 = pointFArr7[1];
            float f25 = pointF23.x;
            float f26 = pointF23.y;
            PointF pointF24 = pointFArr7[2];
            float f27 = pointF24.x;
            float f28 = pointF24.y;
            PointF pointF25 = pointFArr7[3];
            path2.cubicTo(f25, f26, f27, f28, pointF25.x, pointF25.y);
        }
        if (!m10149y(bVar2.f9282b, bVar2.f9288h.f9273b, bVar2.f9285e.f9273b, bVar2.f9283c, bVar2.f9284d)) {
            PointF pointF26 = bVar2.f9285e.f9280i[0];
            path2.lineTo(pointF26.x, pointF26.y);
        }
        C2387a aVar12 = bVar2.f9285e;
        if (aVar12.f9275d != 0.0d) {
            PointF[] pointFArr8 = aVar12.f9280i;
            PointF pointF27 = pointFArr8[1];
            float f29 = pointF27.x;
            float f30 = pointF27.y;
            PointF pointF28 = pointFArr8[2];
            float f31 = pointF28.x;
            float f32 = pointF28.y;
            PointF pointF29 = pointFArr8[3];
            path2.cubicTo(f29, f30, f31, f32, pointF29.x, pointF29.y);
        }
        path2.close();
        return path2;
    }
}
