package p093p;

import java.util.ArrayList;
import p069l.C1858d;
import p087o.C2473d;
import p087o.C2476e;
import p087o.C2479f;
import p087o.C2480g;
import p087o.C2482h;
import p087o.C2484j;
import p087o.C2485k;

/* renamed from: p.b */
public class C2512b {

    /* renamed from: a */
    private final ArrayList<C2476e> f9911a = new ArrayList<>();

    /* renamed from: b */
    private C2513a f9912b = new C2513a();

    /* renamed from: c */
    private C2479f f9913c;

    /* renamed from: p.b$a */
    public static class C2513a {

        /* renamed from: k */
        public static int f9914k = 0;

        /* renamed from: l */
        public static int f9915l = 1;

        /* renamed from: m */
        public static int f9916m = 2;

        /* renamed from: a */
        public C2476e.C2478b f9917a;

        /* renamed from: b */
        public C2476e.C2478b f9918b;

        /* renamed from: c */
        public int f9919c;

        /* renamed from: d */
        public int f9920d;

        /* renamed from: e */
        public int f9921e;

        /* renamed from: f */
        public int f9922f;

        /* renamed from: g */
        public int f9923g;

        /* renamed from: h */
        public boolean f9924h;

        /* renamed from: i */
        public boolean f9925i;

        /* renamed from: j */
        public int f9926j;
    }

    /* renamed from: p.b$b */
    public interface C2514b {
        /* renamed from: a */
        void mo2453a();

        /* renamed from: b */
        void mo2454b(C2476e eVar, C2513a aVar);
    }

    public C2512b(C2479f fVar) {
        this.f9913c = fVar;
    }

    /* renamed from: a */
    private boolean m10668a(C2514b bVar, C2476e eVar, int i) {
        this.f9912b.f9917a = eVar.mo9564y();
        this.f9912b.f9918b = eVar.mo9497R();
        this.f9912b.f9919c = eVar.mo9503U();
        this.f9912b.f9920d = eVar.mo9560v();
        C2513a aVar = this.f9912b;
        aVar.f9925i = false;
        aVar.f9926j = i;
        C2476e.C2478b bVar2 = aVar.f9917a;
        C2476e.C2478b bVar3 = C2476e.C2478b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f9918b == bVar3;
        boolean z3 = z && eVar.f9591d0 > 0.0f;
        boolean z4 = z2 && eVar.f9591d0 > 0.0f;
        if (z3 && eVar.f9632y[0] == 4) {
            aVar.f9917a = C2476e.C2478b.FIXED;
        }
        if (z4 && eVar.f9632y[1] == 4) {
            aVar.f9918b = C2476e.C2478b.FIXED;
        }
        bVar.mo2454b(eVar, aVar);
        eVar.mo9531h1(this.f9912b.f9921e);
        eVar.mo9482I0(this.f9912b.f9922f);
        eVar.mo9480H0(this.f9912b.f9924h);
        eVar.mo9563x0(this.f9912b.f9923g);
        C2513a aVar2 = this.f9912b;
        aVar2.f9926j = C2513a.f9914k;
        return aVar2.f9925i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f9591d0 <= 0.0f) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10669b(p087o.C2479f r13) {
        /*
            r12 = this;
            java.util.ArrayList<o.e> r0 = r13.f9698L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo9582P1(r1)
            p.b$b r2 = r13.mo9573F1()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList<o.e> r5 = r13.f9698L0
            java.lang.Object r5 = r5.get(r4)
            o.e r5 = (p087o.C2476e) r5
            boolean r6 = r5 instanceof p087o.C2480g
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof p087o.C2470a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.mo9535j0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            p.l r6 = r5.f9592e
            if (r6 == 0) goto L_0x0047
            p.n r7 = r5.f9594f
            if (r7 == 0) goto L_0x0047
            p.g r6 = r6.f9995e
            boolean r6 = r6.f9947j
            if (r6 == 0) goto L_0x0047
            p.g r6 = r7.f9995e
            boolean r6 = r6.f9947j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            o.e$b r6 = r5.mo9555s(r3)
            r7 = 1
            o.e$b r8 = r5.mo9555s(r7)
            o.e$b r9 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f9628w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f9630x
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.mo9582P1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof p087o.C2485k
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f9628w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.mo9528g0()
            if (r11 != 0) goto L_0x007c
            r10 = r7
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f9630x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.mo9528g0()
            if (r11 != 0) goto L_0x008b
            r10 = r7
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f9591d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = p093p.C2512b.C2513a.f9914k
            r12.m10668a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.mo2453a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2512b.m10669b(o.f):void");
    }

    /* renamed from: c */
    private void m10670c(C2479f fVar, String str, int i, int i2, int i3) {
        int G = fVar.mo9477G();
        int F = fVar.mo9475F();
        fVar.mo9510X0(0);
        fVar.mo9508W0(0);
        fVar.mo9531h1(i2);
        fVar.mo9482I0(i3);
        fVar.mo9510X0(G);
        fVar.mo9508W0(F);
        this.f9913c.mo9585T1(i);
        this.f9913c.mo9589p1();
    }

    /* renamed from: d */
    public long mo9673d(C2479f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        int i11;
        C2479f fVar2;
        int i12;
        boolean z2;
        int i13;
        boolean z3;
        C2512b bVar = this;
        C2479f fVar3 = fVar;
        int i14 = i;
        int i15 = i4;
        int i16 = i6;
        C2514b F1 = fVar.mo9573F1();
        int size = fVar3.f9698L0.size();
        int U = fVar.mo9503U();
        int v = fVar.mo9560v();
        boolean b = C2484j.m10635b(i14, 128);
        boolean z4 = b || C2484j.m10635b(i14, 64);
        if (z4) {
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                C2476e eVar = fVar3.f9698L0.get(i17);
                C2476e.C2478b y = eVar.mo9564y();
                C2476e.C2478b bVar2 = C2476e.C2478b.MATCH_CONSTRAINT;
                boolean z5 = (y == bVar2) && (eVar.mo9497R() == bVar2) && eVar.mo9557t() > 0.0f;
                if ((!eVar.mo9528g0() || !z5) && ((!eVar.mo9532i0() || !z5) && !(eVar instanceof C2485k) && !eVar.mo9528g0() && !eVar.mo9532i0())) {
                    i17++;
                }
            }
            z4 = false;
        }
        if (z4) {
            boolean z6 = C1858d.f7167r;
        }
        boolean z7 = z4 & ((i15 == 1073741824 && i16 == 1073741824) || b);
        int i18 = 2;
        if (z7) {
            int min = Math.min(fVar.mo9473E(), i5);
            int min2 = Math.min(fVar.mo9471D(), i7);
            if (i15 == 1073741824 && fVar.mo9503U() != min) {
                fVar3.mo9531h1(min);
                fVar.mo9576I1();
            }
            if (i16 == 1073741824 && fVar.mo9560v() != min2) {
                fVar3.mo9482I0(min2);
                fVar.mo9576I1();
            }
            if (i15 == 1073741824 && i16 == 1073741824) {
                z = fVar3.mo9570C1(b);
                i10 = 2;
            } else {
                boolean D1 = fVar3.mo9571D1(b);
                if (i15 == 1073741824) {
                    D1 &= fVar3.mo9572E1(b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i16 == 1073741824) {
                    z = fVar3.mo9572E1(b, 1) & D1;
                    i10++;
                } else {
                    z = D1;
                }
            }
            if (z) {
                fVar3.mo9543m1(i15 == 1073741824, i16 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        int G1 = fVar.mo9574G1();
        if (size > 0) {
            m10669b(fVar);
        }
        mo9674e(fVar);
        int size2 = bVar.f9911a.size();
        if (size > 0) {
            m10670c(fVar, "First pass", 0, U, v);
        }
        if (size2 > 0) {
            C2476e.C2478b y2 = fVar.mo9564y();
            C2476e.C2478b bVar3 = C2476e.C2478b.WRAP_CONTENT;
            boolean z8 = y2 == bVar3;
            boolean z9 = fVar.mo9497R() == bVar3;
            int max = Math.max(fVar.mo9503U(), bVar.f9913c.mo9477G());
            int max2 = Math.max(fVar.mo9560v(), bVar.f9913c.mo9475F());
            int i19 = 0;
            boolean z10 = false;
            while (i19 < size2) {
                C2476e eVar2 = bVar.f9911a.get(i19);
                if (!(eVar2 instanceof C2485k)) {
                    i13 = G1;
                } else {
                    int U2 = eVar2.mo9503U();
                    int v2 = eVar2.mo9560v();
                    i13 = G1;
                    boolean a = bVar.m10668a(F1, eVar2, C2513a.f9915l) | z10;
                    int U3 = eVar2.mo9503U();
                    boolean z11 = a;
                    int v3 = eVar2.mo9560v();
                    if (U3 != U2) {
                        eVar2.mo9531h1(U3);
                        if (z8 && eVar2.mo9485K() > max) {
                            max = Math.max(max, eVar2.mo9485K() + eVar2.mo9542m(C2473d.C2475b.RIGHT).mo9449e());
                        }
                        z3 = true;
                    } else {
                        z3 = z11;
                    }
                    if (v3 != v2) {
                        eVar2.mo9482I0(v3);
                        if (z9 && eVar2.mo9549p() > max2) {
                            max2 = Math.max(max2, eVar2.mo9549p() + eVar2.mo9542m(C2473d.C2475b.BOTTOM).mo9449e());
                        }
                        z3 = true;
                    }
                    z10 = z3 | ((C2485k) eVar2).mo9611s1();
                }
                i19++;
                C2479f fVar4 = fVar;
                G1 = i13;
                i18 = 2;
            }
            int i20 = G1;
            int i21 = i18;
            int i22 = 0;
            while (i22 < i21) {
                int i23 = 0;
                while (i23 < size2) {
                    C2476e eVar3 = bVar.f9911a.get(i23);
                    if ((!(eVar3 instanceof C2482h) || (eVar3 instanceof C2485k)) && !(eVar3 instanceof C2480g) && eVar3.mo9501T() != 8 && ((!z7 || !eVar3.f9592e.f9995e.f9947j || !eVar3.f9594f.f9995e.f9947j) && !(eVar3 instanceof C2485k))) {
                        int U4 = eVar3.mo9503U();
                        int v4 = eVar3.mo9560v();
                        z2 = z7;
                        int n = eVar3.mo9544n();
                        int i24 = C2513a.f9915l;
                        i12 = size2;
                        if (i22 == 1) {
                            i24 = C2513a.f9916m;
                        }
                        boolean a2 = bVar.m10668a(F1, eVar3, i24) | z10;
                        int U5 = eVar3.mo9503U();
                        int v5 = eVar3.mo9560v();
                        if (U5 != U4) {
                            eVar3.mo9531h1(U5);
                            if (z8 && eVar3.mo9485K() > max) {
                                max = Math.max(max, eVar3.mo9485K() + eVar3.mo9542m(C2473d.C2475b.RIGHT).mo9449e());
                            }
                            a2 = true;
                        }
                        if (v5 != v4) {
                            eVar3.mo9482I0(v5);
                            if (z9 && eVar3.mo9549p() > max2) {
                                max2 = Math.max(max2, eVar3.mo9549p() + eVar3.mo9542m(C2473d.C2475b.BOTTOM).mo9449e());
                            }
                            a2 = true;
                        }
                        z10 = (!eVar3.mo9509X() || n == eVar3.mo9544n()) ? a2 : true;
                    } else {
                        z2 = z7;
                        i12 = size2;
                    }
                    i23++;
                    bVar = this;
                    z7 = z2;
                    size2 = i12;
                }
                boolean z12 = z7;
                int i25 = size2;
                if (!z10) {
                    break;
                }
                i22++;
                m10670c(fVar, "intermediate pass", i22, U, v);
                bVar = this;
                z7 = z12;
                size2 = i25;
                i21 = 2;
                z10 = false;
            }
            fVar2 = fVar;
            i11 = i20;
        } else {
            fVar2 = fVar;
            i11 = G1;
        }
        fVar2.mo9584S1(i11);
        return 0;
    }

    /* renamed from: e */
    public void mo9674e(C2479f fVar) {
        this.f9911a.clear();
        int size = fVar.f9698L0.size();
        for (int i = 0; i < size; i++) {
            C2476e eVar = fVar.f9698L0.get(i);
            C2476e.C2478b y = eVar.mo9564y();
            C2476e.C2478b bVar = C2476e.C2478b.MATCH_CONSTRAINT;
            if (y == bVar || eVar.mo9497R() == bVar) {
                this.f9911a.add(eVar);
            }
        }
        fVar.mo9576I1();
    }
}
