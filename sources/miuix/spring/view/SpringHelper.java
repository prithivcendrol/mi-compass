package miuix.spring.view;

import androidx.annotation.Keep;

public abstract class SpringHelper {

    /* renamed from: a */
    private C2391c f9289a = new C2389a(0);

    /* renamed from: b */
    private C2391c f9290b = new C2390b(1);

    /* renamed from: miuix.spring.view.SpringHelper$a */
    class C2389a extends C2391c {
        C2389a(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo9238a() {
            return SpringHelper.this.mo4713a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo9239b() {
            return SpringHelper.this.mo4718h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo9240f() {
            SpringHelper.this.vibrate();
        }
    }

    /* renamed from: miuix.spring.view.SpringHelper$b */
    class C2390b extends C2391c {
        C2390b(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo9238a() {
            return SpringHelper.this.mo4714b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo9239b() {
            return SpringHelper.this.mo4717e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo9240f() {
            SpringHelper.this.vibrate();
        }
    }

    /* renamed from: miuix.spring.view.SpringHelper$c */
    private abstract class C2391c {

        /* renamed from: a */
        float f9293a;

        /* renamed from: b */
        float f9294b;

        /* renamed from: c */
        int f9295c;

        C2391c(int i) {
            this.f9295c = i;
        }

        /* renamed from: e */
        private float m10174e(float f) {
            float f2;
            int b = mo9239b();
            float abs = Math.abs(f);
            if (b == 0) {
                f2 = 0.5f;
            } else {
                f2 = (float) b;
                double min = (double) Math.min(abs / f2, 1.0f);
                abs = (float) (((Math.pow(min, 3.0d) / 3.0d) - Math.pow(min, 2.0d)) + min);
            }
            return abs * f2;
        }

        /* renamed from: g */
        private void m10175g(int i, int[] iArr, boolean z) {
            if (i != 0 && mo9238a()) {
                float f = (float) i;
                float f2 = this.f9294b + f;
                this.f9294b = f2;
                if (z) {
                    this.f9293a = Math.signum(f2) * m10174e(Math.abs(this.f9294b));
                } else {
                    if (this.f9293a == 0.0f) {
                        mo9240f();
                    }
                    float f3 = this.f9293a + f;
                    this.f9293a = f3;
                    this.f9294b = Math.signum(f3) * m10177i(Math.abs(this.f9293a));
                }
                int i2 = this.f9295c;
                iArr[i2] = iArr[i2] + i;
            }
        }

        /* renamed from: h */
        private int m10176h(int i, int[] iArr, boolean z) {
            float f = this.f9293a;
            float f2 = this.f9294b;
            float signum = Math.signum(f);
            float f3 = this.f9294b + ((float) i);
            this.f9294b = f3;
            if (z) {
                this.f9293a = Math.signum(f3) * m10174e(Math.abs(this.f9294b));
                int i2 = this.f9295c;
                iArr[i2] = iArr[i2] + (i - i);
            }
            int i3 = (int) (this.f9293a + (this.f9294b - f2));
            float f4 = (float) i3;
            if (signum * f4 >= 0.0f) {
                if (!z) {
                    this.f9293a = f4;
                }
                iArr[this.f9295c] = i;
            } else {
                this.f9293a = 0.0f;
                int i4 = this.f9295c;
                iArr[i4] = (int) (((float) iArr[i4]) + f);
            }
            float f5 = this.f9293a;
            if (f5 == 0.0f) {
                this.f9294b = 0.0f;
            }
            if (!z) {
                this.f9294b = Math.signum(f5) * m10177i(Math.abs(this.f9293a));
            }
            return i3;
        }

        /* renamed from: i */
        private float m10177i(float f) {
            int b = mo9239b();
            if (b == 0) {
                return Math.abs(f) * 2.0f;
            }
            float f2 = (float) b;
            if (Math.abs(f) / f2 > 0.33333334f) {
                return f * 3.0f;
            }
            double d = (double) b;
            return (float) (d - (Math.pow(d, 0.6666666865348816d) * Math.pow((double) (f2 - (Math.abs(f) * 3.0f)), 0.3333333432674408d)));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo9238a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract int mo9239b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo9241c(int[] iArr, int[] iArr2, boolean z) {
            int i = iArr[this.f9295c];
            if (i != 0 && mo9238a()) {
                float f = this.f9293a;
                if (f == 0.0f || Integer.signum((int) f) * i > 0) {
                    return false;
                }
                iArr[this.f9295c] = m10176h(i, iArr2, z);
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo9242d(int i, int[] iArr, int i2, int[] iArr2) {
            if (SpringHelper.this.mo4719k()) {
                m10175g(i, iArr2, i2 == 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract void mo9240f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo4713a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo4714b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo4715c(int i, int i2, int[] iArr, int[] iArr2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo4716d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo4717e();

    /* renamed from: f */
    public int mo9234f() {
        return (int) this.f9289a.f9293a;
    }

    /* renamed from: g */
    public int mo9235g() {
        return (int) this.f9290b.f9293a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo4718h();

    /* renamed from: i */
    public boolean mo9236i(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean z;
        int i4;
        int i5;
        int[] iArr3 = {0, 0};
        if (mo4719k()) {
            boolean z2 = i3 == 0;
            int[] iArr4 = {i, i2};
            boolean c = this.f9290b.mo9241c(iArr4, iArr3, z2) | this.f9289a.mo9241c(iArr4, iArr3, z2);
            i4 = iArr4[0];
            i5 = iArr4[1];
            z = c;
        } else {
            i4 = i;
            i5 = i2;
            z = false;
        }
        if (z) {
            i4 -= iArr3[0];
            i5 -= iArr3[1];
        }
        boolean c2 = mo4715c(i4, i5, iArr, iArr2, i3) | z;
        if (iArr != null) {
            iArr[0] = iArr[0] + iArr3[0];
            iArr[1] = iArr[1] + iArr3[1];
        }
        return c2;
    }

    /* renamed from: j */
    public void mo9237j(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (iArr2 == null) {
            iArr2 = new int[]{0, 0};
        }
        mo4716d(i, i2, i3, i4, iArr, i5, iArr2);
        int i6 = i3 - iArr2[0];
        int i7 = i4 - iArr2[1];
        if (i6 != 0 || i7 != 0) {
            this.f9289a.mo9242d(i6, iArr, i5, iArr2);
            this.f9290b.mo9242d(i7, iArr, i5, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo4719k();

    /* access modifiers changed from: protected */
    @Keep
    public abstract void vibrate();
}
