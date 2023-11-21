package p078m2;

import android.util.Log;
import android.view.View;
import p055i3.C1656j;

/* renamed from: m2.e */
public class C1925e {

    /* renamed from: l */
    public static boolean f7308l = true;

    /* renamed from: a */
    private boolean f7309a;

    /* renamed from: b */
    private int f7310b = 0;

    /* renamed from: c */
    private int f7311c = 0;

    /* renamed from: d */
    private int f7312d = 0;

    /* renamed from: e */
    private int f7313e = 0;

    /* renamed from: f */
    private boolean f7314f = true;

    /* renamed from: g */
    private int f7315g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f7316h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int[] f7317i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int[] f7318j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int[] f7319k;

    /* renamed from: m2.e$a */
    public static class C1926a {

        /* renamed from: a */
        C1925e f7320a = new C1925e();

        /* renamed from: a */
        public C1925e mo6506a() {
            return this.f7320a;
        }

        /* renamed from: b */
        public C1925e mo6507b(int i) {
            C1926a c;
            if (i == 2) {
                c = mo6510e(670, 960).mo6508c(0, 36, 100).mo6511f(670).mo6509d(0, 44);
            } else if (i != 3) {
                return null;
            } else {
                c = mo6510e(670).mo6508c(0, 28);
            }
            return c.mo6506a();
        }

        /* renamed from: c */
        public C1926a mo6508c(int... iArr) {
            int[] unused = this.f7320a.f7317i = iArr;
            return this;
        }

        /* renamed from: d */
        public C1926a mo6509d(int... iArr) {
            int[] unused = this.f7320a.f7319k = iArr;
            return this;
        }

        /* renamed from: e */
        public C1926a mo6510e(int... iArr) {
            int[] unused = this.f7320a.f7316h = iArr;
            return this;
        }

        /* renamed from: f */
        public C1926a mo6511f(int... iArr) {
            int[] unused = this.f7320a.f7318j = iArr;
            return this;
        }
    }

    C1925e() {
    }

    /* renamed from: e */
    public void mo6499e(View view) {
        int i;
        int i2;
        if (this.f7309a) {
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            int f = (int) (((float) mo6500f()) * (((float) view.getResources().getConfiguration().densityDpi) / 160.0f));
            if (C1656j.m6983b(view)) {
                i2 = left - f;
                i = right - f;
            } else {
                i2 = left + f;
                i = right + f;
            }
            view.layout(i2, top, i, bottom);
        }
    }

    /* renamed from: f */
    public int mo6500f() {
        return mo6501g(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f7319k;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6501g(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f7314f
            if (r0 != 0) goto L_0x000e
            int[] r0 = r2.f7319k
            if (r0 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            int r1 = r2.f7315g
            r0 = r0[r1]
            goto L_0x0014
        L_0x000e:
            int[] r0 = r2.f7317i
            int r1 = r2.f7315g
            r0 = r0[r1]
        L_0x0014:
            if (r0 != 0) goto L_0x0017
            return r0
        L_0x0017:
            if (r3 == 0) goto L_0x001a
            return r0
        L_0x001a:
            int r0 = r0 + 28
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p078m2.C1925e.mo6501g(boolean):int");
    }

    /* renamed from: h */
    public int mo6502h() {
        return this.f7315g;
    }

    /* renamed from: i */
    public boolean mo6503i() {
        return this.f7309a;
    }

    /* renamed from: j */
    public void mo6504j(int i, int i2, int i3, int i4, float f, boolean z) {
        if (this.f7312d != i3 || this.f7310b != i) {
            if (f7308l) {
                Log.d("ExtraPaddingPolicy", "onContainerSizeChanged new Win w = " + i + " h = " + i2 + " new C w = " + i3 + " h = " + i4);
                Log.d("ExtraPaddingPolicy", "onContainerSizeChanged old Win w = " + this.f7310b + " h = " + this.f7311c + " old C w = " + this.f7312d + " h = " + this.f7313e);
                StringBuilder sb = new StringBuilder();
                sb.append("onContainerSizeChanged density ");
                sb.append(f);
                sb.append(" isInFloatingWindow = ");
                sb.append(z);
                Log.d("ExtraPaddingPolicy", sb.toString());
            }
            this.f7310b = i;
            this.f7311c = i2;
            this.f7312d = i3;
            this.f7313e = i4;
            int i5 = 0;
            this.f7314f = (((float) i3) * 1.0f) / (((float) i) * f) >= 0.95f || z;
            if (f7308l) {
                Log.d("ExtraPaddingPolicy", "onContainerSizeChanged isFullWindow " + this.f7314f);
            }
            if (this.f7311c <= 550) {
                this.f7315g = 0;
                return;
            }
            if (this.f7314f || this.f7318j == null) {
                while (true) {
                    int[] iArr = this.f7316h;
                    if (i5 < iArr.length) {
                        int i6 = (int) (((float) iArr[i5]) * f);
                        if ((i5 == 0 && i3 < i6) || i3 <= i6) {
                            break;
                        }
                        if (i5 == iArr.length - 1) {
                            this.f7315g = i5 + 1;
                        }
                        i5++;
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    int[] iArr2 = this.f7318j;
                    if (i5 < iArr2.length) {
                        int i7 = (int) (((float) iArr2[i5]) * f);
                        if ((i5 == 0 && i3 < i7) || i3 <= i7) {
                            break;
                        }
                        if (i5 == iArr2.length - 1) {
                            this.f7315g = i5 + 1;
                        }
                        i5++;
                    } else {
                        return;
                    }
                }
            }
            this.f7315g = i5;
        }
    }

    /* renamed from: k */
    public void mo6505k(boolean z) {
        this.f7309a = z;
    }
}
