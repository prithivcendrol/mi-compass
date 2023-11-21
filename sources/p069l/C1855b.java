package p069l;

import java.util.ArrayList;
import p069l.C1858d;
import p069l.C1867i;

/* renamed from: l.b */
public class C1855b implements C1858d.C1859a {

    /* renamed from: a */
    C1867i f7157a = null;

    /* renamed from: b */
    float f7158b = 0.0f;

    /* renamed from: c */
    boolean f7159c = false;

    /* renamed from: d */
    ArrayList<C1867i> f7160d = new ArrayList<>();

    /* renamed from: e */
    public C1856a f7161e;

    /* renamed from: f */
    boolean f7162f = false;

    /* renamed from: l.b$a */
    public interface C1856a {
        /* renamed from: a */
        float mo6346a(int i);

        /* renamed from: b */
        float mo6347b(C1855b bVar, boolean z);

        /* renamed from: c */
        void mo6348c(C1867i iVar, float f);

        void clear();

        /* renamed from: d */
        int mo6350d();

        /* renamed from: e */
        void mo6351e(C1867i iVar, float f, boolean z);

        /* renamed from: f */
        C1867i mo6352f(int i);

        /* renamed from: g */
        float mo6353g(C1867i iVar);

        /* renamed from: h */
        float mo6354h(C1867i iVar, boolean z);

        /* renamed from: i */
        boolean mo6355i(C1867i iVar);

        /* renamed from: j */
        void mo6356j(float f);

        /* renamed from: k */
        void mo6357k();
    }

    public C1855b() {
    }

    public C1855b(C1857c cVar) {
        this.f7161e = new C1854a(this, cVar);
    }

    /* renamed from: u */
    private boolean m7669u(C1867i iVar, C1858d dVar) {
        return iVar.f7218p <= 1;
    }

    /* renamed from: w */
    private C1867i m7670w(boolean[] zArr, C1867i iVar) {
        C1867i.C1868a aVar;
        int d = this.f7161e.mo6350d();
        C1867i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float a = this.f7161e.mo6346a(i);
            if (a < 0.0f) {
                C1867i f2 = this.f7161e.mo6352f(i);
                if ((zArr == null || !zArr[f2.f7208f]) && f2 != iVar && (((aVar = f2.f7215m) == C1867i.C1868a.SLACK || aVar == C1867i.C1868a.ERROR) && a < f)) {
                    f = a;
                    iVar2 = f2;
                }
            }
        }
        return iVar2;
    }

    /* renamed from: A */
    public void mo6359A(C1858d dVar, C1867i iVar, boolean z) {
        if (iVar != null && iVar.f7212j) {
            this.f7158b += iVar.f7211i * this.f7161e.mo6353g(iVar);
            this.f7161e.mo6354h(iVar, z);
            if (z) {
                iVar.mo6426d(this);
            }
            if (C1858d.f7169t && this.f7161e.mo6350d() == 0) {
                this.f7162f = true;
                dVar.f7175a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo6360B(C1858d dVar, C1855b bVar, boolean z) {
        this.f7158b += bVar.f7158b * this.f7161e.mo6347b(bVar, z);
        if (z) {
            bVar.f7157a.mo6426d(this);
        }
        if (C1858d.f7169t && this.f7157a != null && this.f7161e.mo6350d() == 0) {
            this.f7162f = true;
            dVar.f7175a = true;
        }
    }

    /* renamed from: C */
    public void mo6361C(C1858d dVar, C1867i iVar, boolean z) {
        if (iVar != null && iVar.f7219q) {
            float g = this.f7161e.mo6353g(iVar);
            this.f7158b += iVar.f7221s * g;
            this.f7161e.mo6354h(iVar, z);
            if (z) {
                iVar.mo6426d(this);
            }
            this.f7161e.mo6351e(dVar.f7188n.f7166d[iVar.f7220r], g, z);
            if (C1858d.f7169t && this.f7161e.mo6350d() == 0) {
                this.f7162f = true;
                dVar.f7175a = true;
            }
        }
    }

    /* renamed from: D */
    public void mo6362D(C1858d dVar) {
        if (dVar.f7181g.length != 0) {
            boolean z = false;
            while (!z) {
                int d = this.f7161e.mo6350d();
                for (int i = 0; i < d; i++) {
                    C1867i f = this.f7161e.mo6352f(i);
                    if (f.f7209g != -1 || f.f7212j || f.f7219q) {
                        this.f7160d.add(f);
                    }
                }
                int size = this.f7160d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        C1867i iVar = this.f7160d.get(i2);
                        if (iVar.f7212j) {
                            mo6359A(dVar, iVar, true);
                        } else if (iVar.f7219q) {
                            mo6361C(dVar, iVar, true);
                        } else {
                            mo6360B(dVar, dVar.f7181g[iVar.f7209g], true);
                        }
                    }
                    this.f7160d.clear();
                } else {
                    z = true;
                }
            }
            if (C1858d.f7169t && this.f7157a != null && this.f7161e.mo6350d() == 0) {
                this.f7162f = true;
                dVar.f7175a = true;
            }
        }
    }

    /* renamed from: a */
    public C1867i mo6363a(C1858d dVar, boolean[] zArr) {
        return m7670w(zArr, (C1867i) null);
    }

    /* renamed from: b */
    public void mo6364b(C1858d.C1859a aVar) {
        if (aVar instanceof C1855b) {
            C1855b bVar = (C1855b) aVar;
            this.f7157a = null;
            this.f7161e.clear();
            for (int i = 0; i < bVar.f7161e.mo6350d(); i++) {
                this.f7161e.mo6351e(bVar.f7161e.mo6352f(i), bVar.f7161e.mo6346a(i), true);
            }
        }
    }

    /* renamed from: c */
    public void mo6365c(C1867i iVar) {
        int i = iVar.f7210h;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f7161e.mo6348c(iVar, f);
    }

    public void clear() {
        this.f7161e.clear();
        this.f7157a = null;
        this.f7158b = 0.0f;
    }

    /* renamed from: d */
    public C1855b mo6367d(C1858d dVar, int i) {
        this.f7161e.mo6348c(dVar.mo6404o(i, "ep"), 1.0f);
        this.f7161e.mo6348c(dVar.mo6404o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1855b mo6368e(C1867i iVar, int i) {
        this.f7161e.mo6348c(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo6369f(C1858d dVar) {
        boolean z;
        C1867i g = mo6370g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo6388x(g);
            z = false;
        }
        if (this.f7161e.mo6350d() == 0) {
            this.f7162f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1867i mo6370g(C1858d dVar) {
        int d = this.f7161e.mo6350d();
        C1867i iVar = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        C1867i iVar2 = null;
        for (int i = 0; i < d; i++) {
            float a = this.f7161e.mo6346a(i);
            C1867i f3 = this.f7161e.mo6352f(i);
            if (f3.f7215m == C1867i.C1868a.UNRESTRICTED) {
                if (iVar == null || f > a) {
                    z = m7669u(f3, dVar);
                    f = a;
                    iVar = f3;
                } else if (!z && m7669u(f3, dVar)) {
                    f = a;
                    iVar = f3;
                    z = true;
                }
            } else if (iVar == null && a < 0.0f) {
                if (iVar2 == null || f2 > a) {
                    z2 = m7669u(f3, dVar);
                    f2 = a;
                    iVar2 = f3;
                } else if (!z2 && m7669u(f3, dVar)) {
                    f2 = a;
                    iVar2 = f3;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public C1867i getKey() {
        return this.f7157a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1855b mo6372h(C1867i iVar, C1867i iVar2, int i, float f, C1867i iVar3, C1867i iVar4, int i2) {
        float f2;
        int i3;
        if (iVar2 == iVar3) {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar4, 1.0f);
            this.f7161e.mo6348c(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
            this.f7161e.mo6348c(iVar3, -1.0f);
            this.f7161e.mo6348c(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
            }
            return this;
        }
        if (f <= 0.0f) {
            this.f7161e.mo6348c(iVar, -1.0f);
            this.f7161e.mo6348c(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f7161e.mo6348c(iVar4, -1.0f);
            this.f7161e.mo6348c(iVar3, 1.0f);
            i3 = -i2;
        } else {
            float f3 = 1.0f - f;
            this.f7161e.mo6348c(iVar, f3 * 1.0f);
            this.f7161e.mo6348c(iVar2, f3 * -1.0f);
            this.f7161e.mo6348c(iVar3, -1.0f * f);
            this.f7161e.mo6348c(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f7158b = f2;
        return this;
        f2 = (float) i3;
        this.f7158b = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1855b mo6373i(C1867i iVar, int i) {
        this.f7157a = iVar;
        float f = (float) i;
        iVar.f7211i = f;
        this.f7158b = f;
        this.f7162f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f7157a == null && this.f7158b == 0.0f && this.f7161e.mo6350d() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1855b mo6375j(C1867i iVar, C1867i iVar2, float f) {
        this.f7161e.mo6348c(iVar, -1.0f);
        this.f7161e.mo6348c(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C1855b mo6376k(C1867i iVar, C1867i iVar2, C1867i iVar3, C1867i iVar4, float f) {
        this.f7161e.mo6348c(iVar, -1.0f);
        this.f7161e.mo6348c(iVar2, 1.0f);
        this.f7161e.mo6348c(iVar3, f);
        this.f7161e.mo6348c(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C1855b mo6377l(float f, float f2, float f3, C1867i iVar, C1867i iVar2, C1867i iVar3, C1867i iVar4) {
        this.f7158b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
            this.f7161e.mo6348c(iVar4, 1.0f);
            this.f7161e.mo6348c(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f7161e.mo6348c(iVar3, 1.0f);
            this.f7161e.mo6348c(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
            this.f7161e.mo6348c(iVar4, f4);
            this.f7161e.mo6348c(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C1855b mo6378m(C1867i iVar, int i) {
        C1856a aVar;
        float f;
        if (i < 0) {
            this.f7158b = (float) (i * -1);
            aVar = this.f7161e;
            f = 1.0f;
        } else {
            this.f7158b = (float) i;
            aVar = this.f7161e;
            f = -1.0f;
        }
        aVar.mo6348c(iVar, f);
        return this;
    }

    /* renamed from: n */
    public C1855b mo6379n(C1867i iVar, C1867i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7158b = (float) i;
        }
        if (!z) {
            this.f7161e.mo6348c(iVar, -1.0f);
            this.f7161e.mo6348c(iVar2, 1.0f);
        } else {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C1855b mo6380o(C1867i iVar, C1867i iVar2, C1867i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7158b = (float) i;
        }
        if (!z) {
            this.f7161e.mo6348c(iVar, -1.0f);
            this.f7161e.mo6348c(iVar2, 1.0f);
            this.f7161e.mo6348c(iVar3, 1.0f);
        } else {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
            this.f7161e.mo6348c(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C1855b mo6381p(C1867i iVar, C1867i iVar2, C1867i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7158b = (float) i;
        }
        if (!z) {
            this.f7161e.mo6348c(iVar, -1.0f);
            this.f7161e.mo6348c(iVar2, 1.0f);
            this.f7161e.mo6348c(iVar3, -1.0f);
        } else {
            this.f7161e.mo6348c(iVar, 1.0f);
            this.f7161e.mo6348c(iVar2, -1.0f);
            this.f7161e.mo6348c(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C1855b mo6382q(C1867i iVar, C1867i iVar2, C1867i iVar3, C1867i iVar4, float f) {
        this.f7161e.mo6348c(iVar3, 0.5f);
        this.f7161e.mo6348c(iVar4, 0.5f);
        this.f7161e.mo6348c(iVar, -0.5f);
        this.f7161e.mo6348c(iVar2, -0.5f);
        this.f7158b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6383r() {
        float f = this.f7158b;
        if (f < 0.0f) {
            this.f7158b = f * -1.0f;
            this.f7161e.mo6357k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo6384s() {
        C1867i iVar = this.f7157a;
        return iVar != null && (iVar.f7215m == C1867i.C1868a.UNRESTRICTED || this.f7158b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo6385t(C1867i iVar) {
        return this.f7161e.mo6355i(iVar);
    }

    public String toString() {
        return mo6390z();
    }

    /* renamed from: v */
    public C1867i mo6387v(C1867i iVar) {
        return m7670w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo6388x(C1867i iVar) {
        C1867i iVar2 = this.f7157a;
        if (iVar2 != null) {
            this.f7161e.mo6348c(iVar2, -1.0f);
            this.f7157a.f7209g = -1;
            this.f7157a = null;
        }
        float h = this.f7161e.mo6354h(iVar, true) * -1.0f;
        this.f7157a = iVar;
        if (h != 1.0f) {
            this.f7158b /= h;
            this.f7161e.mo6356j(h);
        }
    }

    /* renamed from: y */
    public void mo6389y() {
        this.f7157a = null;
        this.f7161e.clear();
        this.f7158b = 0.0f;
        this.f7162f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo6390z() {
        /*
            r10 = this;
            l.i r0 = r10.f7157a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            l.i r1 = r10.f7157a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f7158b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f7158b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            l.b$a r5 = r10.f7161e
            int r5 = r5.mo6350d()
        L_0x0059:
            if (r3 >= r5) goto L_0x00d1
            l.b$a r6 = r10.f7161e
            l.i r6 = r6.mo6352f(r3)
            if (r6 != 0) goto L_0x0064
            goto L_0x00ce
        L_0x0064:
            l.b$a r7 = r10.f7161e
            float r7 = r7.mo6346a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x006f
            goto L_0x00ce
        L_0x006f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0086
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a2
        L_0x0086:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x009a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00aa
        L_0x009a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        L_0x00aa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c3
        L_0x00b6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        L_0x00ce:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x00d1:
            if (r1 != 0) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p069l.C1855b.mo6390z():java.lang.String");
    }
}
