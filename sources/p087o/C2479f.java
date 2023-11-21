package p087o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p069l.C1858d;
import p069l.C1867i;
import p087o.C2476e;
import p093p.C2512b;
import p093p.C2517e;

/* renamed from: o.f */
public class C2479f extends C2486l {

    /* renamed from: M0 */
    C2512b f9643M0 = new C2512b(this);

    /* renamed from: N0 */
    public C2517e f9644N0 = new C2517e(this);

    /* renamed from: O0 */
    private int f9645O0;

    /* renamed from: P0 */
    protected C2512b.C2514b f9646P0 = null;

    /* renamed from: Q0 */
    private boolean f9647Q0 = false;

    /* renamed from: R0 */
    protected C1858d f9648R0 = new C1858d();

    /* renamed from: S0 */
    int f9649S0;

    /* renamed from: T0 */
    int f9650T0;

    /* renamed from: U0 */
    int f9651U0;

    /* renamed from: V0 */
    int f9652V0;

    /* renamed from: W0 */
    public int f9653W0 = 0;

    /* renamed from: X0 */
    public int f9654X0 = 0;

    /* renamed from: Y0 */
    C2472c[] f9655Y0 = new C2472c[4];

    /* renamed from: Z0 */
    C2472c[] f9656Z0 = new C2472c[4];

    /* renamed from: a1 */
    public boolean f9657a1 = false;

    /* renamed from: b1 */
    public boolean f9658b1 = false;

    /* renamed from: c1 */
    public boolean f9659c1 = false;

    /* renamed from: d1 */
    public int f9660d1 = 0;

    /* renamed from: e1 */
    public int f9661e1 = 0;

    /* renamed from: f1 */
    private int f9662f1 = 257;

    /* renamed from: g1 */
    public boolean f9663g1 = false;

    /* renamed from: h1 */
    private boolean f9664h1 = false;

    /* renamed from: i1 */
    private boolean f9665i1 = false;

    /* renamed from: j1 */
    int f9666j1 = 0;

    /* renamed from: k1 */
    private WeakReference<C2473d> f9667k1 = null;

    /* renamed from: l1 */
    private WeakReference<C2473d> f9668l1 = null;

    /* renamed from: m1 */
    private WeakReference<C2473d> f9669m1 = null;

    /* renamed from: n1 */
    private WeakReference<C2473d> f9670n1 = null;

    /* renamed from: o1 */
    HashSet<C2476e> f9671o1 = new HashSet<>();

    /* renamed from: p1 */
    public C2512b.C2513a f9672p1 = new C2512b.C2513a();

    /* renamed from: O1 */
    public static boolean m10575O1(int i, C2476e eVar, C2512b.C2514b bVar, C2512b.C2513a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (eVar.mo9501T() == 8 || (eVar instanceof C2480g) || (eVar instanceof C2470a)) {
            aVar.f9921e = 0;
            aVar.f9922f = 0;
            return false;
        }
        aVar.f9917a = eVar.mo9564y();
        aVar.f9918b = eVar.mo9497R();
        aVar.f9919c = eVar.mo9503U();
        aVar.f9920d = eVar.mo9560v();
        aVar.f9925i = false;
        aVar.f9926j = i2;
        C2476e.C2478b bVar2 = aVar.f9917a;
        C2476e.C2478b bVar3 = C2476e.C2478b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f9918b == bVar3;
        boolean z3 = z && eVar.f9591d0 > 0.0f;
        boolean z4 = z2 && eVar.f9591d0 > 0.0f;
        if (z && eVar.mo9511Y(0) && eVar.f9628w == 0 && !z3) {
            aVar.f9917a = C2476e.C2478b.WRAP_CONTENT;
            if (z2 && eVar.f9630x == 0) {
                aVar.f9917a = C2476e.C2478b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.mo9511Y(1) && eVar.f9630x == 0 && !z4) {
            aVar.f9918b = C2476e.C2478b.WRAP_CONTENT;
            if (z && eVar.f9628w == 0) {
                aVar.f9918b = C2476e.C2478b.FIXED;
            }
            z2 = false;
        }
        if (eVar.mo9432l0()) {
            aVar.f9917a = C2476e.C2478b.FIXED;
            z = false;
        }
        if (eVar.mo9433m0()) {
            aVar.f9918b = C2476e.C2478b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.f9632y[0] == 4) {
                aVar.f9917a = C2476e.C2478b.FIXED;
            } else if (!z2) {
                C2476e.C2478b bVar4 = aVar.f9918b;
                C2476e.C2478b bVar5 = C2476e.C2478b.FIXED;
                if (bVar4 == bVar5) {
                    i4 = aVar.f9920d;
                } else {
                    aVar.f9917a = C2476e.C2478b.WRAP_CONTENT;
                    bVar.mo2454b(eVar, aVar);
                    i4 = aVar.f9922f;
                }
                aVar.f9917a = bVar5;
                aVar.f9919c = (int) (eVar.mo9557t() * ((float) i4));
            }
        }
        if (z4) {
            if (eVar.f9632y[1] == 4) {
                aVar.f9918b = C2476e.C2478b.FIXED;
            } else if (!z) {
                C2476e.C2478b bVar6 = aVar.f9917a;
                C2476e.C2478b bVar7 = C2476e.C2478b.FIXED;
                if (bVar6 == bVar7) {
                    i3 = aVar.f9919c;
                } else {
                    aVar.f9918b = C2476e.C2478b.WRAP_CONTENT;
                    bVar.mo2454b(eVar, aVar);
                    i3 = aVar.f9921e;
                }
                aVar.f9918b = bVar7;
                aVar.f9920d = eVar.mo9559u() == -1 ? (int) (((float) i3) / eVar.mo9557t()) : (int) (eVar.mo9557t() * ((float) i3));
            }
        }
        bVar.mo2454b(eVar, aVar);
        eVar.mo9531h1(aVar.f9921e);
        eVar.mo9482I0(aVar.f9922f);
        eVar.mo9480H0(aVar.f9924h);
        eVar.mo9563x0(aVar.f9923g);
        aVar.f9926j = C2512b.C2513a.f9914k;
        return aVar.f9925i;
    }

    /* renamed from: Q1 */
    private void m10576Q1() {
        this.f9653W0 = 0;
        this.f9654X0 = 0;
    }

    /* renamed from: u1 */
    private void m10577u1(C2476e eVar) {
        int i = this.f9653W0 + 1;
        C2472c[] cVarArr = this.f9656Z0;
        if (i >= cVarArr.length) {
            this.f9656Z0 = (C2472c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f9656Z0[this.f9653W0] = new C2472c(eVar, 0, mo9579L1());
        this.f9653W0++;
    }

    /* renamed from: x1 */
    private void m10578x1(C2473d dVar, C1867i iVar) {
        this.f9648R0.mo6399h(iVar, this.f9648R0.mo6406q(dVar), 0, 5);
    }

    /* renamed from: y1 */
    private void m10579y1(C2473d dVar, C1867i iVar) {
        this.f9648R0.mo6399h(this.f9648R0.mo6406q(dVar), iVar, 0, 5);
    }

    /* renamed from: z1 */
    private void m10580z1(C2476e eVar) {
        int i = this.f9654X0 + 1;
        C2472c[] cVarArr = this.f9655Y0;
        if (i >= cVarArr.length) {
            this.f9655Y0 = (C2472c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f9655Y0[this.f9654X0] = new C2472c(eVar, 1, mo9579L1());
        this.f9654X0++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void mo9568A1(C2473d dVar) {
        WeakReference<C2473d> weakReference = this.f9669m1;
        if (weakReference == null || weakReference.get() == null || dVar.mo9448d() > this.f9669m1.get().mo9448d()) {
            this.f9669m1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo9569B1(C2473d dVar) {
        WeakReference<C2473d> weakReference = this.f9667k1;
        if (weakReference == null || weakReference.get() == null || dVar.mo9448d() > this.f9667k1.get().mo9448d()) {
            this.f9667k1 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: C1 */
    public boolean mo9570C1(boolean z) {
        return this.f9644N0.mo9684f(z);
    }

    /* renamed from: D1 */
    public boolean mo9571D1(boolean z) {
        return this.f9644N0.mo9685g(z);
    }

    /* renamed from: E1 */
    public boolean mo9572E1(boolean z, int i) {
        return this.f9644N0.mo9686h(z, i);
    }

    /* renamed from: F1 */
    public C2512b.C2514b mo9573F1() {
        return this.f9646P0;
    }

    /* renamed from: G1 */
    public int mo9574G1() {
        return this.f9662f1;
    }

    /* renamed from: H1 */
    public C1858d mo9575H1() {
        return this.f9648R0;
    }

    /* renamed from: I1 */
    public void mo9576I1() {
        this.f9644N0.mo9687j();
    }

    /* renamed from: J1 */
    public void mo9577J1() {
        this.f9644N0.mo9688k();
    }

    /* renamed from: K1 */
    public boolean mo9578K1() {
        return this.f9665i1;
    }

    /* renamed from: L1 */
    public boolean mo9579L1() {
        return this.f9647Q0;
    }

    /* renamed from: M */
    public void mo9489M(StringBuilder sb) {
        sb.append(this.f9612o + ":{\n");
        sb.append("  actualWidth:" + this.f9587b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f9589c0);
        sb.append("\n");
        Iterator<C2476e> it = mo9613o1().iterator();
        while (it.hasNext()) {
            it.next().mo9489M(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* renamed from: M1 */
    public boolean mo9580M1() {
        return this.f9664h1;
    }

    /* renamed from: N1 */
    public long mo9581N1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f9649S0 = i10;
        int i11 = i9;
        this.f9650T0 = i11;
        return this.f9643M0.mo9673d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: P1 */
    public boolean mo9582P1(int i) {
        return (this.f9662f1 & i) == i;
    }

    /* renamed from: R1 */
    public void mo9583R1(C2512b.C2514b bVar) {
        this.f9646P0 = bVar;
        this.f9644N0.mo9690n(bVar);
    }

    /* renamed from: S1 */
    public void mo9584S1(int i) {
        this.f9662f1 = i;
        C1858d.f7167r = mo9582P1(512);
    }

    /* renamed from: T1 */
    public void mo9585T1(int i) {
        this.f9645O0 = i;
    }

    /* renamed from: U1 */
    public void mo9586U1(boolean z) {
        this.f9647Q0 = z;
    }

    /* renamed from: V1 */
    public boolean mo9587V1(C1858d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = mo9582P1(64);
        mo9546n1(dVar, P1);
        int size = this.f9698L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2476e eVar = this.f9698L0.get(i);
            eVar.mo9546n1(dVar, P1);
            if (eVar.mo9515a0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: W1 */
    public void mo9588W1() {
        this.f9643M0.mo9674e(this);
    }

    /* renamed from: m1 */
    public void mo9543m1(boolean z, boolean z2) {
        super.mo9543m1(z, z2);
        int size = this.f9698L0.size();
        for (int i = 0; i < size; i++) {
            this.f9698L0.get(i).mo9543m1(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0310  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9589p1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f9595f0 = r2
            r1.f9597g0 = r2
            r1.f9664h1 = r2
            r1.f9665i1 = r2
            java.util.ArrayList<o.e> r0 = r1.f9698L0
            int r3 = r0.size()
            int r0 = r18.mo9503U()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.mo9560v()
            int r4 = java.lang.Math.max(r2, r4)
            o.e$b[] r5 = r1.f9583Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f9645O0
            if (r8 != 0) goto L_0x0088
            int r8 = r1.f9662f1
            boolean r8 = p087o.C2484j.m10635b(r8, r6)
            if (r8 == 0) goto L_0x0088
            p.b$b r8 = r18.mo9573F1()
            p093p.C2521h.m10711h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0088
            java.util.ArrayList<o.e> r9 = r1.f9698L0
            java.lang.Object r9 = r9.get(r8)
            o.e r9 = (p087o.C2476e) r9
            boolean r10 = r9.mo9538k0()
            if (r10 == 0) goto L_0x0085
            boolean r10 = r9 instanceof p087o.C2480g
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof p087o.C2470a
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof p087o.C2485k
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9.mo9535j0()
            if (r10 != 0) goto L_0x0085
            o.e$b r10 = r9.mo9555s(r2)
            o.e$b r11 = r9.mo9555s(r6)
            o.e$b r12 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0076
            int r10 = r9.f9628w
            if (r10 == r6) goto L_0x0076
            if (r11 != r12) goto L_0x0076
            int r10 = r9.f9630x
            if (r10 == r6) goto L_0x0076
            r10 = r6
            goto L_0x0077
        L_0x0076:
            r10 = r2
        L_0x0077:
            if (r10 != 0) goto L_0x0085
            p.b$a r10 = new p.b$a
            r10.<init>()
            p.b$b r11 = r1.f9646P0
            int r12 = p093p.C2512b.C2513a.f9914k
            m10575O1(r2, r9, r11, r10, r12)
        L_0x0085:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0088:
            r8 = 2
            if (r3 <= r8) goto L_0x00d1
            o.e$b r9 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0091
            if (r7 != r9) goto L_0x00d1
        L_0x0091:
            int r10 = r1.f9662f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = p087o.C2484j.m10635b(r10, r11)
            if (r10 == 0) goto L_0x00d1
            p.b$b r10 = r18.mo9573F1()
            boolean r10 = p093p.C2522i.m10715c(r1, r10)
            if (r10 == 0) goto L_0x00d1
            if (r5 != r9) goto L_0x00b9
            int r10 = r18.mo9503U()
            if (r0 >= r10) goto L_0x00b5
            if (r0 <= 0) goto L_0x00b5
            r1.mo9531h1(r0)
            r1.f9664h1 = r6
            goto L_0x00b9
        L_0x00b5:
            int r0 = r18.mo9503U()
        L_0x00b9:
            if (r7 != r9) goto L_0x00cd
            int r9 = r18.mo9560v()
            if (r4 >= r9) goto L_0x00c9
            if (r4 <= 0) goto L_0x00c9
            r1.mo9482I0(r4)
            r1.f9665i1 = r6
            goto L_0x00cd
        L_0x00c9:
            int r4 = r18.mo9560v()
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d4
        L_0x00d1:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d4:
            r10 = 64
            boolean r11 = r1.mo9582P1(r10)
            if (r11 != 0) goto L_0x00e7
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.mo9582P1(r11)
            if (r11 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r11 = r2
            goto L_0x00e8
        L_0x00e7:
            r11 = r6
        L_0x00e8:
            l.d r12 = r1.f9648R0
            r12.f7182h = r2
            r12.f7183i = r2
            int r13 = r1.f9662f1
            if (r13 == 0) goto L_0x00f6
            if (r11 == 0) goto L_0x00f6
            r12.f7183i = r6
        L_0x00f6:
            java.util.ArrayList<o.e> r11 = r1.f9698L0
            o.e$b r12 = r18.mo9564y()
            o.e$b r13 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0109
            o.e$b r12 = r18.mo9497R()
            if (r12 != r13) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r12 = r2
            goto L_0x010a
        L_0x0109:
            r12 = r6
        L_0x010a:
            r18.m10576Q1()
            r13 = r2
        L_0x010e:
            if (r13 >= r3) goto L_0x0124
            java.util.ArrayList<o.e> r14 = r1.f9698L0
            java.lang.Object r14 = r14.get(r13)
            o.e r14 = (p087o.C2476e) r14
            boolean r15 = r14 instanceof p087o.C2486l
            if (r15 == 0) goto L_0x0121
            o.l r14 = (p087o.C2486l) r14
            r14.mo9589p1()
        L_0x0121:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0124:
            boolean r10 = r1.mo9582P1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x012b:
            if (r14 == 0) goto L_0x0317
            int r15 = r0 + 1
            l.d r0 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            r0.mo6392D()     // Catch:{ Exception -> 0x01dc }
            r18.m10576Q1()     // Catch:{ Exception -> 0x01dc }
            l.d r0 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            r1.mo9537k(r0)     // Catch:{ Exception -> 0x01dc }
            r0 = r2
        L_0x013d:
            if (r0 >= r3) goto L_0x0151
            java.util.ArrayList<o.e> r6 = r1.f9698L0     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01dc }
            o.e r6 = (p087o.C2476e) r6     // Catch:{ Exception -> 0x01dc }
            l.d r2 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            r6.mo9537k(r2)     // Catch:{ Exception -> 0x01dc }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x013d
        L_0x0151:
            l.d r0 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            boolean r14 = r1.mo9591t1(r0)     // Catch:{ Exception -> 0x01dc }
            java.lang.ref.WeakReference<o.d> r0 = r1.f9667k1     // Catch:{ Exception -> 0x01dc }
            r2 = 0
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0177
            java.lang.ref.WeakReference<o.d> r0 = r1.f9667k1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            o.d r0 = (p087o.C2473d) r0     // Catch:{ Exception -> 0x01dc }
            l.d r6 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            o.d r8 = r1.f9573P     // Catch:{ Exception -> 0x01dc }
            l.i r6 = r6.mo6406q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.m10579y1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f9667k1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0177:
            java.lang.ref.WeakReference<o.d> r0 = r1.f9669m1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.ref.WeakReference<o.d> r0 = r1.f9669m1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            o.d r0 = (p087o.C2473d) r0     // Catch:{ Exception -> 0x01dc }
            l.d r6 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            o.d r8 = r1.f9575R     // Catch:{ Exception -> 0x01dc }
            l.i r6 = r6.mo6406q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.m10578x1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f9669m1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0196:
            java.lang.ref.WeakReference<o.d> r0 = r1.f9668l1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.ref.WeakReference<o.d> r0 = r1.f9668l1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            o.d r0 = (p087o.C2473d) r0     // Catch:{ Exception -> 0x01dc }
            l.d r6 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            o.d r8 = r1.f9572O     // Catch:{ Exception -> 0x01dc }
            l.i r6 = r6.mo6406q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.m10579y1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f9668l1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01b5:
            java.lang.ref.WeakReference<o.d> r0 = r1.f9670n1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.ref.WeakReference<o.d> r0 = r1.f9670n1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            o.d r0 = (p087o.C2473d) r0     // Catch:{ Exception -> 0x01dc }
            l.d r6 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            o.d r8 = r1.f9574Q     // Catch:{ Exception -> 0x01dc }
            l.i r6 = r6.mo6406q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.m10578x1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f9670n1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01d4:
            if (r14 == 0) goto L_0x01f6
            l.d r0 = r1.f9648R0     // Catch:{ Exception -> 0x01dc }
            r0.mo6411z()     // Catch:{ Exception -> 0x01dc }
            goto L_0x01f6
        L_0x01dc:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f6:
            l.d r0 = r1.f9648R0
            if (r14 == 0) goto L_0x0201
            boolean[] r2 = p087o.C2484j.f9684a
            boolean r0 = r1.mo9587V1(r0, r2)
            goto L_0x0218
        L_0x0201:
            r1.mo9546n1(r0, r10)
            r0 = 0
        L_0x0205:
            if (r0 >= r3) goto L_0x0217
            java.util.ArrayList<o.e> r2 = r1.f9698L0
            java.lang.Object r2 = r2.get(r0)
            o.e r2 = (p087o.C2476e) r2
            l.d r6 = r1.f9648R0
            r2.mo9546n1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0205
        L_0x0217:
            r0 = 0
        L_0x0218:
            r2 = 8
            if (r12 == 0) goto L_0x0289
            if (r15 >= r2) goto L_0x0289
            boolean[] r6 = p087o.C2484j.f9684a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0289
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0228:
            if (r6 >= r3) goto L_0x0252
            java.util.ArrayList<o.e> r2 = r1.f9698L0
            java.lang.Object r2 = r2.get(r6)
            o.e r2 = (p087o.C2476e) r2
            r16 = r0
            int r0 = r2.f9595f0
            int r17 = r2.mo9503U()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f9597g0
            int r2 = r2.mo9560v()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0228
        L_0x0252:
            r16 = r0
            int r0 = r1.f9609m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f9611n0
            int r2 = java.lang.Math.max(r2, r8)
            o.e$b r6 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0275
            int r8 = r18.mo9503U()
            if (r8 >= r0) goto L_0x0275
            r1.mo9531h1(r0)
            o.e$b[] r0 = r1.f9583Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0275:
            if (r7 != r6) goto L_0x028b
            int r0 = r18.mo9560v()
            if (r0 >= r2) goto L_0x028b
            r1.mo9482I0(r2)
            o.e$b[] r0 = r1.f9583Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028b
        L_0x0289:
            r16 = r0
        L_0x028b:
            int r0 = r1.f9609m0
            int r2 = r18.mo9503U()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo9503U()
            if (r0 <= r2) goto L_0x02a8
            r1.mo9531h1(r0)
            o.e$b[] r0 = r1.f9583Z
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a8:
            int r0 = r1.f9611n0
            int r2 = r18.mo9560v()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo9560v()
            if (r0 <= r2) goto L_0x02c6
            r1.mo9482I0(r0)
            o.e$b[] r0 = r1.f9583Z
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02c8
        L_0x02c6:
            r6 = 1
            r2 = r13
        L_0x02c8:
            if (r2 != 0) goto L_0x0307
            o.e$b[] r0 = r1.f9583Z
            r8 = 0
            r0 = r0[r8]
            o.e$b r13 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e9
            if (r4 <= 0) goto L_0x02e9
            int r0 = r18.mo9503U()
            if (r0 <= r4) goto L_0x02e9
            r1.f9664h1 = r6
            o.e$b[] r0 = r1.f9583Z
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            r0[r8] = r2
            r1.mo9531h1(r4)
            r2 = r6
            r16 = r2
        L_0x02e9:
            o.e$b[] r0 = r1.f9583Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0307
            if (r9 <= 0) goto L_0x0307
            int r0 = r18.mo9560v()
            if (r0 <= r9) goto L_0x0307
            r1.f9665i1 = r6
            o.e$b[] r0 = r1.f9583Z
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            r0[r6] = r2
            r1.mo9482I0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030c
        L_0x0307:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030c:
            if (r15 <= r0) goto L_0x0310
            r14 = 0
            goto L_0x0311
        L_0x0310:
            r14 = r2
        L_0x0311:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x012b
        L_0x0317:
            r1.f9698L0 = r11
            if (r13 == 0) goto L_0x0323
            o.e$b[] r0 = r1.f9583Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0323:
            l.d r0 = r1.f9648R0
            l.c r0 = r0.mo6409v()
            r1.mo9558t0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2479f.mo9589p1():void");
    }

    /* renamed from: r0 */
    public void mo9554r0() {
        this.f9648R0.mo6392D();
        this.f9649S0 = 0;
        this.f9651U0 = 0;
        this.f9650T0 = 0;
        this.f9652V0 = 0;
        this.f9663g1 = false;
        super.mo9554r0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo9590s1(C2476e eVar, int i) {
        if (i == 0) {
            m10577u1(eVar);
        } else if (i == 1) {
            m10580z1(eVar);
        }
    }

    /* renamed from: t1 */
    public boolean mo9591t1(C1858d dVar) {
        boolean P1 = mo9582P1(64);
        mo9430g(dVar, P1);
        int size = this.f9698L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2476e eVar = this.f9698L0.get(i);
            eVar.mo9494P0(0, false);
            eVar.mo9494P0(1, false);
            if (eVar instanceof C2470a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C2476e eVar2 = this.f9698L0.get(i2);
                if (eVar2 instanceof C2470a) {
                    ((C2470a) eVar2).mo9440v1();
                }
            }
        }
        this.f9671o1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            C2476e eVar3 = this.f9698L0.get(i3);
            if (eVar3.mo9525f()) {
                if (eVar3 instanceof C2485k) {
                    this.f9671o1.add(eVar3);
                } else {
                    eVar3.mo9430g(dVar, P1);
                }
            }
        }
        while (this.f9671o1.size() > 0) {
            int size2 = this.f9671o1.size();
            Iterator<C2476e> it = this.f9671o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2485k kVar = (C2485k) it.next();
                if (kVar.mo9610r1(this.f9671o1)) {
                    kVar.mo9430g(dVar, P1);
                    this.f9671o1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f9671o1.size()) {
                Iterator<C2476e> it2 = this.f9671o1.iterator();
                while (it2.hasNext()) {
                    it2.next().mo9430g(dVar, P1);
                }
                this.f9671o1.clear();
            }
        }
        if (C1858d.f7167r) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C2476e eVar4 = this.f9698L0.get(i4);
                if (!eVar4.mo9525f()) {
                    hashSet.add(eVar4);
                }
            }
            mo9522e(this, dVar, hashSet, mo9564y() == C2476e.C2478b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C2476e eVar5 = (C2476e) it3.next();
                C2484j.m10634a(this, dVar, eVar5);
                eVar5.mo9430g(dVar, P1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C2476e eVar6 = this.f9698L0.get(i5);
                if (eVar6 instanceof C2479f) {
                    C2476e.C2478b[] bVarArr = eVar6.f9583Z;
                    C2476e.C2478b bVar = bVarArr[0];
                    C2476e.C2478b bVar2 = bVarArr[1];
                    C2476e.C2478b bVar3 = C2476e.C2478b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.mo9490M0(C2476e.C2478b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo9521d1(C2476e.C2478b.FIXED);
                    }
                    eVar6.mo9430g(dVar, P1);
                    if (bVar == bVar3) {
                        eVar6.mo9490M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo9521d1(bVar2);
                    }
                } else {
                    C2484j.m10634a(this, dVar, eVar6);
                    if (!eVar6.mo9525f()) {
                        eVar6.mo9430g(dVar, P1);
                    }
                }
            }
        }
        if (this.f9653W0 > 0) {
            C2471b.m10437b(this, dVar, (ArrayList<C2476e>) null, 0);
        }
        if (this.f9654X0 > 0) {
            C2471b.m10437b(this, dVar, (ArrayList<C2476e>) null, 1);
        }
        return true;
    }

    /* renamed from: v1 */
    public void mo9592v1(C2473d dVar) {
        WeakReference<C2473d> weakReference = this.f9670n1;
        if (weakReference == null || weakReference.get() == null || dVar.mo9448d() > this.f9670n1.get().mo9448d()) {
            this.f9670n1 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: w1 */
    public void mo9593w1(C2473d dVar) {
        WeakReference<C2473d> weakReference = this.f9668l1;
        if (weakReference == null || weakReference.get() == null || dVar.mo9448d() > this.f9668l1.get().mo9448d()) {
            this.f9668l1 = new WeakReference<>(dVar);
        }
    }
}
