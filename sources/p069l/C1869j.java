package p069l;

import java.util.Arrays;
import p069l.C1855b;

/* renamed from: l.j */
public class C1869j implements C1855b.C1856a {

    /* renamed from: n */
    private static float f7229n = 0.001f;

    /* renamed from: a */
    private final int f7230a = -1;

    /* renamed from: b */
    private int f7231b = 16;

    /* renamed from: c */
    private int f7232c = 16;

    /* renamed from: d */
    int[] f7233d = new int[16];

    /* renamed from: e */
    int[] f7234e = new int[16];

    /* renamed from: f */
    int[] f7235f = new int[16];

    /* renamed from: g */
    float[] f7236g = new float[16];

    /* renamed from: h */
    int[] f7237h = new int[16];

    /* renamed from: i */
    int[] f7238i = new int[16];

    /* renamed from: j */
    int f7239j = 0;

    /* renamed from: k */
    int f7240k = -1;

    /* renamed from: l */
    private final C1855b f7241l;

    /* renamed from: m */
    protected final C1857c f7242m;

    C1869j(C1855b bVar, C1857c cVar) {
        this.f7241l = bVar;
        this.f7242m = cVar;
        clear();
    }

    /* renamed from: l */
    private void m7769l(C1867i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f7208f % this.f7232c;
        int[] iArr2 = this.f7233d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f7234e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f7234e[i] = -1;
    }

    /* renamed from: m */
    private void m7770m(int i, C1867i iVar, float f) {
        this.f7235f[i] = iVar.f7208f;
        this.f7236g[i] = f;
        this.f7237h[i] = -1;
        this.f7238i[i] = -1;
        iVar.mo6423a(this.f7241l);
        iVar.f7218p++;
        this.f7239j++;
    }

    /* renamed from: n */
    private int m7771n() {
        for (int i = 0; i < this.f7231b; i++) {
            if (this.f7235f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m7772o() {
        int i = this.f7231b * 2;
        this.f7235f = Arrays.copyOf(this.f7235f, i);
        this.f7236g = Arrays.copyOf(this.f7236g, i);
        this.f7237h = Arrays.copyOf(this.f7237h, i);
        this.f7238i = Arrays.copyOf(this.f7238i, i);
        this.f7234e = Arrays.copyOf(this.f7234e, i);
        for (int i2 = this.f7231b; i2 < i; i2++) {
            this.f7235f[i2] = -1;
            this.f7234e[i2] = -1;
        }
        this.f7231b = i;
    }

    /* renamed from: q */
    private void m7773q(int i, C1867i iVar, float f) {
        int n = m7771n();
        m7770m(n, iVar, f);
        if (i != -1) {
            this.f7237h[n] = i;
            int[] iArr = this.f7238i;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f7237h[n] = -1;
            if (this.f7239j > 0) {
                this.f7238i[n] = this.f7240k;
                this.f7240k = n;
            } else {
                this.f7238i[n] = -1;
            }
        }
        int i2 = this.f7238i[n];
        if (i2 != -1) {
            this.f7237h[i2] = n;
        }
        m7769l(iVar, n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7774r(p069l.C1867i r6) {
        /*
            r5 = this;
            int r6 = r6.f7208f
            int r0 = r5.f7232c
            int r0 = r6 % r0
            int[] r1 = r5.f7233d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f7235f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f7234e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f7234e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f7235f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f7235f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069l.C1869j.m7774r(l.i):void");
    }

    /* renamed from: a */
    public float mo6346a(int i) {
        int i2 = this.f7239j;
        int i3 = this.f7240k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f7236g[i3];
            }
            i3 = this.f7238i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: b */
    public float mo6347b(C1855b bVar, boolean z) {
        float g = mo6353g(bVar.f7157a);
        mo6354h(bVar.f7157a, z);
        C1869j jVar = (C1869j) bVar.f7161e;
        int d = jVar.mo6350d();
        int i = 0;
        int i2 = 0;
        while (i < d) {
            int i3 = jVar.f7235f[i2];
            if (i3 != -1) {
                mo6351e(this.f7242m.f7166d[i3], jVar.f7236g[i2] * g, z);
                i++;
            }
            i2++;
        }
        return g;
    }

    /* renamed from: c */
    public void mo6348c(C1867i iVar, float f) {
        float f2 = f7229n;
        if (f <= (-f2) || f >= f2) {
            if (this.f7239j == 0) {
                m7770m(0, iVar, f);
                m7769l(iVar, 0);
                this.f7240k = 0;
                return;
            }
            int p = mo6432p(iVar);
            if (p != -1) {
                this.f7236g[p] = f;
                return;
            }
            if (this.f7239j + 1 >= this.f7231b) {
                m7772o();
            }
            int i = this.f7239j;
            int i2 = this.f7240k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.f7235f[i2];
                int i6 = iVar.f7208f;
                if (i5 == i6) {
                    this.f7236g[i2] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i2;
                }
                i2 = this.f7238i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m7773q(i3, iVar, f);
            return;
        }
        mo6354h(iVar, true);
    }

    public void clear() {
        int i = this.f7239j;
        for (int i2 = 0; i2 < i; i2++) {
            C1867i f = mo6352f(i2);
            if (f != null) {
                f.mo6426d(this.f7241l);
            }
        }
        for (int i3 = 0; i3 < this.f7231b; i3++) {
            this.f7235f[i3] = -1;
            this.f7234e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f7232c; i4++) {
            this.f7233d[i4] = -1;
        }
        this.f7239j = 0;
        this.f7240k = -1;
    }

    /* renamed from: d */
    public int mo6350d() {
        return this.f7239j;
    }

    /* renamed from: e */
    public void mo6351e(C1867i iVar, float f, boolean z) {
        float f2 = f7229n;
        if (f <= (-f2) || f >= f2) {
            int p = mo6432p(iVar);
            if (p == -1) {
                mo6348c(iVar, f);
                return;
            }
            float[] fArr = this.f7236g;
            float f3 = fArr[p] + f;
            fArr[p] = f3;
            float f4 = f7229n;
            if (f3 > (-f4) && f3 < f4) {
                fArr[p] = 0.0f;
                mo6354h(iVar, z);
            }
        }
    }

    /* renamed from: f */
    public C1867i mo6352f(int i) {
        int i2 = this.f7239j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f7240k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f7242m.f7166d[this.f7235f[i3]];
            }
            i3 = this.f7238i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: g */
    public float mo6353g(C1867i iVar) {
        int p = mo6432p(iVar);
        if (p != -1) {
            return this.f7236g[p];
        }
        return 0.0f;
    }

    /* renamed from: h */
    public float mo6354h(C1867i iVar, boolean z) {
        int p = mo6432p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m7774r(iVar);
        float f = this.f7236g[p];
        if (this.f7240k == p) {
            this.f7240k = this.f7238i[p];
        }
        this.f7235f[p] = -1;
        int[] iArr = this.f7237h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.f7238i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.f7238i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.f7239j--;
        iVar.f7218p--;
        if (z) {
            iVar.mo6426d(this.f7241l);
        }
        return f;
    }

    /* renamed from: i */
    public boolean mo6355i(C1867i iVar) {
        return mo6432p(iVar) != -1;
    }

    /* renamed from: j */
    public void mo6356j(float f) {
        int i = this.f7239j;
        int i2 = this.f7240k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f7236g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f7238i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo6357k() {
        int i = this.f7239j;
        int i2 = this.f7240k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f7236g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f7238i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6432p(p069l.C1867i r4) {
        /*
            r3 = this;
            int r0 = r3.f7239j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f7208f
            int r0 = r3.f7232c
            int r0 = r4 % r0
            int[] r2 = r3.f7233d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f7235f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f7234e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f7235f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f7235f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p069l.C1869j.mo6432p(l.i):int");
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i = this.f7239j;
        for (int i2 = 0; i2 < i; i2++) {
            C1867i f = mo6352f(i2);
            if (f != null) {
                String str3 = str2 + f + " = " + mo6346a(i2) + " ";
                int p = mo6432p(f);
                String str4 = str3 + "[p: ";
                if (this.f7237h[p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(this.f7242m.f7166d[this.f7235f[this.f7237h[p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("none");
                }
                String str5 = sb.toString() + ", n: ";
                if (this.f7238i[p] != -1) {
                    str = str5 + this.f7242m.f7166d[this.f7235f[this.f7238i[p]]];
                } else {
                    str = str5 + "none";
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }
}
