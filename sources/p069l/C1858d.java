package p069l;

import java.util.Arrays;
import java.util.HashMap;
import p069l.C1867i;
import p087o.C2473d;
import p087o.C2476e;

/* renamed from: l.d */
public class C1858d {

    /* renamed from: r */
    public static boolean f7167r = false;

    /* renamed from: s */
    public static boolean f7168s = true;

    /* renamed from: t */
    public static boolean f7169t = true;

    /* renamed from: u */
    public static boolean f7170u = true;

    /* renamed from: v */
    public static boolean f7171v = false;

    /* renamed from: w */
    private static int f7172w = 1000;

    /* renamed from: x */
    public static long f7173x;

    /* renamed from: y */
    public static long f7174y;

    /* renamed from: a */
    public boolean f7175a;

    /* renamed from: b */
    int f7176b;

    /* renamed from: c */
    private HashMap<String, C1867i> f7177c;

    /* renamed from: d */
    private C1859a f7178d;

    /* renamed from: e */
    private int f7179e;

    /* renamed from: f */
    private int f7180f;

    /* renamed from: g */
    C1855b[] f7181g;

    /* renamed from: h */
    public boolean f7182h;

    /* renamed from: i */
    public boolean f7183i;

    /* renamed from: j */
    private boolean[] f7184j;

    /* renamed from: k */
    int f7185k;

    /* renamed from: l */
    int f7186l;

    /* renamed from: m */
    private int f7187m;

    /* renamed from: n */
    final C1857c f7188n;

    /* renamed from: o */
    private C1867i[] f7189o;

    /* renamed from: p */
    private int f7190p;

    /* renamed from: q */
    private C1859a f7191q;

    /* renamed from: l.d$a */
    interface C1859a {
        /* renamed from: a */
        C1867i mo6363a(C1858d dVar, boolean[] zArr);

        /* renamed from: b */
        void mo6364b(C1859a aVar);

        /* renamed from: c */
        void mo6365c(C1867i iVar);

        void clear();

        C1867i getKey();

        boolean isEmpty();
    }

    /* renamed from: l.d$b */
    class C1860b extends C1855b {
        public C1860b(C1857c cVar) {
            this.f7161e = new C1869j(this, cVar);
        }
    }

    public C1858d() {
        this.f7175a = false;
        this.f7176b = 0;
        this.f7177c = null;
        this.f7179e = 32;
        this.f7180f = 32;
        this.f7181g = null;
        this.f7182h = false;
        this.f7183i = false;
        this.f7184j = new boolean[32];
        this.f7185k = 1;
        this.f7186l = 0;
        this.f7187m = 32;
        this.f7189o = new C1867i[f7172w];
        this.f7190p = 0;
        this.f7181g = new C1855b[32];
        m7711C();
        C1857c cVar = new C1857c();
        this.f7188n = cVar;
        this.f7178d = new C1864h(cVar);
        this.f7191q = f7171v ? new C1860b(cVar) : new C1855b(cVar);
    }

    /* renamed from: B */
    private final int m7710B(C1859a aVar, boolean z) {
        for (int i = 0; i < this.f7185k; i++) {
            this.f7184j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f7185k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f7184j[aVar.getKey().f7208f] = true;
            }
            C1867i a = aVar.mo6363a(this, this.f7184j);
            if (a != null) {
                boolean[] zArr = this.f7184j;
                int i3 = a.f7208f;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f7186l; i5++) {
                    C1855b bVar = this.f7181g[i5];
                    if (bVar.f7157a.f7215m != C1867i.C1868a.UNRESTRICTED && !bVar.f7162f && bVar.mo6385t(a)) {
                        float g = bVar.f7161e.mo6353g(a);
                        if (g < 0.0f) {
                            float f2 = (-bVar.f7158b) / g;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1855b bVar2 = this.f7181g[i4];
                    bVar2.f7157a.f7209g = -1;
                    bVar2.mo6388x(a);
                    C1867i iVar = bVar2.f7157a;
                    iVar.f7209g = i4;
                    iVar.mo6430h(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    private void m7711C() {
        int i = 0;
        if (f7171v) {
            while (i < this.f7186l) {
                C1855b bVar = this.f7181g[i];
                if (bVar != null) {
                    this.f7188n.f7163a.mo6412a(bVar);
                }
                this.f7181g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f7186l) {
            C1855b bVar2 = this.f7181g[i];
            if (bVar2 != null) {
                this.f7188n.f7164b.mo6412a(bVar2);
            }
            this.f7181g[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    private C1867i m7712a(C1867i.C1868a aVar, String str) {
        C1867i b = this.f7188n.f7165c.mo6413b();
        if (b == null) {
            b = new C1867i(aVar, str);
        } else {
            b.mo6427e();
        }
        b.mo6429g(aVar, str);
        int i = this.f7190p;
        int i2 = f7172w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f7172w = i3;
            this.f7189o = (C1867i[]) Arrays.copyOf(this.f7189o, i3);
        }
        C1867i[] iVarArr = this.f7189o;
        int i4 = this.f7190p;
        this.f7190p = i4 + 1;
        iVarArr[i4] = b;
        return b;
    }

    /* renamed from: l */
    private final void m7713l(C1855b bVar) {
        int i;
        if (!f7169t || !bVar.f7162f) {
            C1855b[] bVarArr = this.f7181g;
            int i2 = this.f7186l;
            bVarArr[i2] = bVar;
            C1867i iVar = bVar.f7157a;
            iVar.f7209g = i2;
            this.f7186l = i2 + 1;
            iVar.mo6430h(this, bVar);
        } else {
            bVar.f7157a.mo6428f(this, bVar.f7158b);
        }
        if (f7169t && this.f7175a) {
            int i3 = 0;
            while (i3 < this.f7186l) {
                if (this.f7181g[i3] == null) {
                    System.out.println("WTF");
                }
                C1855b bVar2 = this.f7181g[i3];
                if (bVar2 != null && bVar2.f7162f) {
                    bVar2.f7157a.mo6428f(this, bVar2.f7158b);
                    (f7171v ? this.f7188n.f7163a : this.f7188n.f7164b).mo6412a(bVar2);
                    this.f7181g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f7186l;
                        if (i4 >= i) {
                            break;
                        }
                        C1855b[] bVarArr2 = this.f7181g;
                        int i6 = i4 - 1;
                        C1855b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        C1867i iVar2 = bVar3.f7157a;
                        if (iVar2.f7209g == i4) {
                            iVar2.f7209g = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f7181g[i5] = null;
                    }
                    this.f7186l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f7175a = false;
        }
    }

    /* renamed from: n */
    private void m7714n() {
        for (int i = 0; i < this.f7186l; i++) {
            C1855b bVar = this.f7181g[i];
            bVar.f7157a.f7211i = bVar.f7158b;
        }
    }

    /* renamed from: s */
    public static C1855b m7715s(C1858d dVar, C1867i iVar, C1867i iVar2, float f) {
        return dVar.mo6407r().mo6375j(iVar, iVar2, f);
    }

    /* renamed from: u */
    private int m7716u(C1859a aVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f7186l) {
                z = false;
                break;
            }
            C1855b bVar = this.f7181g[i];
            if (bVar.f7157a.f7215m != C1867i.C1868a.UNRESTRICTED && bVar.f7158b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f7186l; i6++) {
                C1855b bVar2 = this.f7181g[i6];
                if (bVar2.f7157a.f7215m != C1867i.C1868a.UNRESTRICTED && !bVar2.f7162f && bVar2.f7158b < 0.0f) {
                    int i7 = 9;
                    if (f7170u) {
                        int d = bVar2.f7161e.mo6350d();
                        int i8 = 0;
                        while (i8 < d) {
                            C1867i f2 = bVar2.f7161e.mo6352f(i8);
                            float g = bVar2.f7161e.mo6353g(f2);
                            if (g > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f3 = f2.f7213k[i9] / g;
                                    if ((f3 < f && i9 == i5) || i9 > i5) {
                                        i4 = f2.f7208f;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f3;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f7185k; i10++) {
                            C1867i iVar = this.f7188n.f7166d[i10];
                            float g2 = bVar2.f7161e.mo6353g(iVar);
                            if (g2 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f4 = iVar.f7213k[i11] / g2;
                                    if ((f4 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i3 = i6;
                                        i5 = i11;
                                        f = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C1855b bVar3 = this.f7181g[i3];
                bVar3.f7157a.f7209g = -1;
                bVar3.mo6388x(this.f7188n.f7166d[i4]);
                C1867i iVar2 = bVar3.f7157a;
                iVar2.f7209g = i3;
                iVar2.mo6430h(this, bVar3);
            } else {
                z2 = true;
            }
            if (i2 > this.f7185k / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: w */
    public static C1861e m7717w() {
        return null;
    }

    /* renamed from: y */
    private void m7718y() {
        int i = this.f7179e * 2;
        this.f7179e = i;
        this.f7181g = (C1855b[]) Arrays.copyOf(this.f7181g, i);
        C1857c cVar = this.f7188n;
        cVar.f7166d = (C1867i[]) Arrays.copyOf(cVar.f7166d, this.f7179e);
        int i2 = this.f7179e;
        this.f7184j = new boolean[i2];
        this.f7180f = i2;
        this.f7187m = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo6391A(C1859a aVar) {
        m7716u(aVar);
        m7710B(aVar, false);
        m7714n();
    }

    /* renamed from: D */
    public void mo6392D() {
        C1857c cVar;
        int i = 0;
        while (true) {
            cVar = this.f7188n;
            C1867i[] iVarArr = cVar.f7166d;
            if (i >= iVarArr.length) {
                break;
            }
            C1867i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo6427e();
            }
            i++;
        }
        cVar.f7165c.mo6414c(this.f7189o, this.f7190p);
        this.f7190p = 0;
        Arrays.fill(this.f7188n.f7166d, (Object) null);
        HashMap<String, C1867i> hashMap = this.f7177c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f7176b = 0;
        this.f7178d.clear();
        this.f7185k = 1;
        for (int i2 = 0; i2 < this.f7186l; i2++) {
            C1855b bVar = this.f7181g[i2];
            if (bVar != null) {
                bVar.f7159c = false;
            }
        }
        m7711C();
        this.f7186l = 0;
        this.f7191q = f7171v ? new C1860b(this.f7188n) : new C1855b(this.f7188n);
    }

    /* renamed from: b */
    public void mo6393b(C2476e eVar, C2476e eVar2, float f, int i) {
        C2476e eVar3 = eVar;
        C2476e eVar4 = eVar2;
        C2473d.C2475b bVar = C2473d.C2475b.LEFT;
        C1867i q = mo6406q(eVar3.mo9542m(bVar));
        C2473d.C2475b bVar2 = C2473d.C2475b.TOP;
        C1867i q2 = mo6406q(eVar3.mo9542m(bVar2));
        C2473d.C2475b bVar3 = C2473d.C2475b.RIGHT;
        C1867i q3 = mo6406q(eVar3.mo9542m(bVar3));
        C2473d.C2475b bVar4 = C2473d.C2475b.BOTTOM;
        C1867i q4 = mo6406q(eVar3.mo9542m(bVar4));
        C1867i q5 = mo6406q(eVar4.mo9542m(bVar));
        C1867i q6 = mo6406q(eVar4.mo9542m(bVar2));
        C1867i q7 = mo6406q(eVar4.mo9542m(bVar3));
        C1867i q8 = mo6406q(eVar4.mo9542m(bVar4));
        C1855b r = mo6407r();
        double d = (double) f;
        C1867i iVar = q7;
        double d2 = (double) i;
        r.mo6382q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        mo6395d(r);
        C1855b r2 = mo6407r();
        r2.mo6382q(q, q3, q5, iVar, (float) (Math.cos(d) * d2));
        mo6395d(r2);
    }

    /* renamed from: c */
    public void mo6394c(C1867i iVar, C1867i iVar2, int i, float f, C1867i iVar3, C1867i iVar4, int i2, int i3) {
        int i4 = i3;
        C1855b r = mo6407r();
        r.mo6372h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo6367d(this, i4);
        }
        mo6395d(r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6395d(p069l.C1855b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f7186l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f7187m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f7185k
            int r0 = r0 + r1
            int r2 = r5.f7180f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.m7718y()
        L_0x0015:
            r0 = 0
            boolean r2 = r6.f7162f
            if (r2 != 0) goto L_0x0081
            r6.mo6362D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.mo6383r()
            boolean r2 = r6.mo6369f(r5)
            if (r2 == 0) goto L_0x0078
            l.i r2 = r5.mo6405p()
            r6.f7157a = r2
            int r3 = r5.f7186l
            r5.m7713l(r6)
            int r4 = r5.f7186l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x0078
            l.d$a r0 = r5.f7191q
            r0.mo6364b(r6)
            l.d$a r0 = r5.f7191q
            r5.m7710B(r0, r1)
            int r0 = r2.f7209g
            r3 = -1
            if (r0 != r3) goto L_0x0079
            l.i r0 = r6.f7157a
            if (r0 != r2) goto L_0x0059
            l.i r0 = r6.mo6387v(r2)
            if (r0 == 0) goto L_0x0059
            r6.mo6388x(r0)
        L_0x0059:
            boolean r0 = r6.f7162f
            if (r0 != 0) goto L_0x0062
            l.i r0 = r6.f7157a
            r0.mo6430h(r5, r6)
        L_0x0062:
            boolean r0 = f7171v
            if (r0 == 0) goto L_0x006b
            l.c r0 = r5.f7188n
            l.f<l.b> r0 = r0.f7163a
            goto L_0x006f
        L_0x006b:
            l.c r0 = r5.f7188n
            l.f<l.b> r0 = r0.f7164b
        L_0x006f:
            r0.mo6412a(r6)
            int r0 = r5.f7186l
            int r0 = r0 - r1
            r5.f7186l = r0
            goto L_0x0079
        L_0x0078:
            r1 = r0
        L_0x0079:
            boolean r0 = r6.mo6384s()
            if (r0 != 0) goto L_0x0080
            return
        L_0x0080:
            r0 = r1
        L_0x0081:
            if (r0 != 0) goto L_0x0086
            r5.m7713l(r6)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069l.C1858d.mo6395d(l.b):void");
    }

    /* renamed from: e */
    public C1855b mo6396e(C1867i iVar, C1867i iVar2, int i, int i2) {
        if (!f7168s || i2 != 8 || !iVar2.f7212j || iVar.f7209g != -1) {
            C1855b r = mo6407r();
            r.mo6379n(iVar, iVar2, i);
            if (i2 != 8) {
                r.mo6367d(this, i2);
            }
            mo6395d(r);
            return r;
        }
        iVar.mo6428f(this, iVar2.f7211i + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo6397f(C1867i iVar, int i) {
        C1855b bVar;
        if (!f7168s || iVar.f7209g != -1) {
            int i2 = iVar.f7209g;
            if (i2 != -1) {
                C1855b bVar2 = this.f7181g[i2];
                if (!bVar2.f7162f) {
                    if (bVar2.f7161e.mo6350d() == 0) {
                        bVar2.f7162f = true;
                    } else {
                        bVar = mo6407r();
                        bVar.mo6378m(iVar, i);
                    }
                }
                bVar2.f7158b = (float) i;
                return;
            }
            bVar = mo6407r();
            bVar.mo6373i(iVar, i);
            mo6395d(bVar);
            return;
        }
        float f = (float) i;
        iVar.mo6428f(this, f);
        for (int i3 = 0; i3 < this.f7176b + 1; i3++) {
            C1867i iVar2 = this.f7188n.f7166d[i3];
            if (iVar2 != null && iVar2.f7219q && iVar2.f7220r == iVar.f7208f) {
                iVar2.mo6428f(this, iVar2.f7221s + f);
            }
        }
    }

    /* renamed from: g */
    public void mo6398g(C1867i iVar, C1867i iVar2, int i, boolean z) {
        C1855b r = mo6407r();
        C1867i t = mo6408t();
        t.f7210h = 0;
        r.mo6380o(iVar, iVar2, t, i);
        mo6395d(r);
    }

    /* renamed from: h */
    public void mo6399h(C1867i iVar, C1867i iVar2, int i, int i2) {
        C1855b r = mo6407r();
        C1867i t = mo6408t();
        t.f7210h = 0;
        r.mo6380o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo6403m(r, (int) (r.f7161e.mo6353g(t) * -1.0f), i2);
        }
        mo6395d(r);
    }

    /* renamed from: i */
    public void mo6400i(C1867i iVar, C1867i iVar2, int i, boolean z) {
        C1855b r = mo6407r();
        C1867i t = mo6408t();
        t.f7210h = 0;
        r.mo6381p(iVar, iVar2, t, i);
        mo6395d(r);
    }

    /* renamed from: j */
    public void mo6401j(C1867i iVar, C1867i iVar2, int i, int i2) {
        C1855b r = mo6407r();
        C1867i t = mo6408t();
        t.f7210h = 0;
        r.mo6381p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo6403m(r, (int) (r.f7161e.mo6353g(t) * -1.0f), i2);
        }
        mo6395d(r);
    }

    /* renamed from: k */
    public void mo6402k(C1867i iVar, C1867i iVar2, C1867i iVar3, C1867i iVar4, float f, int i) {
        C1855b r = mo6407r();
        r.mo6376k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo6367d(this, i);
        }
        mo6395d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6403m(C1855b bVar, int i, int i2) {
        bVar.mo6368e(mo6404o(i2, (String) null), i);
    }

    /* renamed from: o */
    public C1867i mo6404o(int i, String str) {
        if (this.f7185k + 1 >= this.f7180f) {
            m7718y();
        }
        C1867i a = m7712a(C1867i.C1868a.ERROR, str);
        int i2 = this.f7176b + 1;
        this.f7176b = i2;
        this.f7185k++;
        a.f7208f = i2;
        a.f7210h = i;
        this.f7188n.f7166d[i2] = a;
        this.f7178d.mo6365c(a);
        return a;
    }

    /* renamed from: p */
    public C1867i mo6405p() {
        if (this.f7185k + 1 >= this.f7180f) {
            m7718y();
        }
        C1867i a = m7712a(C1867i.C1868a.SLACK, (String) null);
        int i = this.f7176b + 1;
        this.f7176b = i;
        this.f7185k++;
        a.f7208f = i;
        this.f7188n.f7166d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C1867i mo6406q(Object obj) {
        C1867i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f7185k + 1 >= this.f7180f) {
            m7718y();
        }
        if (obj instanceof C2473d) {
            C2473d dVar = (C2473d) obj;
            iVar = dVar.mo9452h();
            if (iVar == null) {
                dVar.mo9462r(this.f7188n);
                iVar = dVar.mo9452h();
            }
            int i = iVar.f7208f;
            if (i == -1 || i > this.f7176b || this.f7188n.f7166d[i] == null) {
                if (i != -1) {
                    iVar.mo6427e();
                }
                int i2 = this.f7176b + 1;
                this.f7176b = i2;
                this.f7185k++;
                iVar.f7208f = i2;
                iVar.f7215m = C1867i.C1868a.UNRESTRICTED;
                this.f7188n.f7166d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C1855b mo6407r() {
        C1855b bVar;
        if (f7171v) {
            bVar = this.f7188n.f7163a.mo6413b();
            if (bVar == null) {
                bVar = new C1860b(this.f7188n);
                f7174y++;
                C1867i.m7761c();
                return bVar;
            }
        } else {
            bVar = this.f7188n.f7164b.mo6413b();
            if (bVar == null) {
                bVar = new C1855b(this.f7188n);
                f7173x++;
                C1867i.m7761c();
                return bVar;
            }
        }
        bVar.mo6389y();
        C1867i.m7761c();
        return bVar;
    }

    /* renamed from: t */
    public C1867i mo6408t() {
        if (this.f7185k + 1 >= this.f7180f) {
            m7718y();
        }
        C1867i a = m7712a(C1867i.C1868a.SLACK, (String) null);
        int i = this.f7176b + 1;
        this.f7176b = i;
        this.f7185k++;
        a.f7208f = i;
        this.f7188n.f7166d[i] = a;
        return a;
    }

    /* renamed from: v */
    public C1857c mo6409v() {
        return this.f7188n;
    }

    /* renamed from: x */
    public int mo6410x(Object obj) {
        C1867i h = ((C2473d) obj).mo9452h();
        if (h != null) {
            return (int) (h.f7211i + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo6411z() {
        if (this.f7178d.isEmpty()) {
            m7714n();
            return;
        }
        if (this.f7182h || this.f7183i) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f7186l) {
                    z = true;
                    break;
                } else if (!this.f7181g[i].f7162f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m7714n();
                return;
            }
        }
        mo6391A(this.f7178d);
    }
}
