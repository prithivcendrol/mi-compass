package p087o;

import java.util.ArrayList;
import p087o.C2476e;

/* renamed from: o.c */
public class C2472c {

    /* renamed from: a */
    protected C2476e f9505a;

    /* renamed from: b */
    protected C2476e f9506b;

    /* renamed from: c */
    protected C2476e f9507c;

    /* renamed from: d */
    protected C2476e f9508d;

    /* renamed from: e */
    protected C2476e f9509e;

    /* renamed from: f */
    protected C2476e f9510f;

    /* renamed from: g */
    protected C2476e f9511g;

    /* renamed from: h */
    protected ArrayList<C2476e> f9512h;

    /* renamed from: i */
    protected int f9513i;

    /* renamed from: j */
    protected int f9514j;

    /* renamed from: k */
    protected float f9515k = 0.0f;

    /* renamed from: l */
    int f9516l;

    /* renamed from: m */
    int f9517m;

    /* renamed from: n */
    int f9518n;

    /* renamed from: o */
    boolean f9519o;

    /* renamed from: p */
    private int f9520p;

    /* renamed from: q */
    private boolean f9521q;

    /* renamed from: r */
    protected boolean f9522r;

    /* renamed from: s */
    protected boolean f9523s;

    /* renamed from: t */
    protected boolean f9524t;

    /* renamed from: u */
    protected boolean f9525u;

    /* renamed from: v */
    private boolean f9526v;

    public C2472c(C2476e eVar, int i, boolean z) {
        this.f9505a = eVar;
        this.f9520p = i;
        this.f9521q = z;
    }

    /* renamed from: b */
    private void m10438b() {
        int i = this.f9520p * 2;
        C2476e eVar = this.f9505a;
        boolean z = true;
        this.f9519o = true;
        C2476e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f9513i++;
            C2476e[] eVarArr = eVar.f9559F0;
            int i2 = this.f9520p;
            C2476e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f9557E0[i2] = null;
            if (eVar.mo9501T() != 8) {
                this.f9516l++;
                C2476e.C2478b s = eVar.mo9555s(this.f9520p);
                C2476e.C2478b bVar = C2476e.C2478b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.f9517m += eVar.mo9469C(this.f9520p);
                }
                int e = this.f9517m + eVar.f9580W[i].mo9449e();
                this.f9517m = e;
                int i3 = i + 1;
                this.f9517m = e + eVar.f9580W[i3].mo9449e();
                int e2 = this.f9518n + eVar.f9580W[i].mo9449e();
                this.f9518n = e2;
                this.f9518n = e2 + eVar.f9580W[i3].mo9449e();
                if (this.f9506b == null) {
                    this.f9506b = eVar;
                }
                this.f9508d = eVar;
                C2476e.C2478b[] bVarArr = eVar.f9583Z;
                int i4 = this.f9520p;
                if (bVarArr[i4] == bVar) {
                    int i5 = eVar.f9632y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f9514j++;
                        float f = eVar.f9555D0[i4];
                        if (f > 0.0f) {
                            this.f9515k += f;
                        }
                        if (m10439c(eVar, i4)) {
                            if (f < 0.0f) {
                                this.f9522r = true;
                            } else {
                                this.f9523s = true;
                            }
                            if (this.f9512h == null) {
                                this.f9512h = new ArrayList<>();
                            }
                            this.f9512h.add(eVar);
                        }
                        if (this.f9510f == null) {
                            this.f9510f = eVar;
                        }
                        C2476e eVar4 = this.f9511g;
                        if (eVar4 != null) {
                            eVar4.f9557E0[this.f9520p] = eVar;
                        }
                        this.f9511g = eVar;
                    }
                    if (this.f9520p != 0 ? !(eVar.f9630x == 0 && eVar.f9552C == 0 && eVar.f9554D == 0) : !(eVar.f9628w == 0 && eVar.f9634z == 0 && eVar.f9548A == 0)) {
                        this.f9519o = false;
                    }
                    if (eVar.f9591d0 != 0.0f) {
                        this.f9519o = false;
                        this.f9525u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f9559F0[this.f9520p] = eVar;
            }
            C2473d dVar = eVar.f9580W[i + 1].f9532f;
            if (dVar != null) {
                C2476e eVar5 = dVar.f9530d;
                C2473d dVar2 = eVar5.f9580W[i].f9532f;
                if (dVar2 != null && dVar2.f9530d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C2476e eVar6 = this.f9506b;
        if (eVar6 != null) {
            this.f9517m -= eVar6.f9580W[i].mo9449e();
        }
        C2476e eVar7 = this.f9508d;
        if (eVar7 != null) {
            this.f9517m -= eVar7.f9580W[i + 1].mo9449e();
        }
        this.f9507c = eVar;
        if (this.f9520p != 0 || !this.f9521q) {
            this.f9509e = this.f9505a;
        } else {
            this.f9509e = eVar;
        }
        if (!this.f9523s || !this.f9522r) {
            z = false;
        }
        this.f9524t = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f9632y[r3];
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m10439c(p087o.C2476e r2, int r3) {
        /*
            int r0 = r2.mo9501T()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            o.e$b[] r0 = r2.f9583Z
            r0 = r0[r3]
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f9632y
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2472c.m10439c(o.e, int):boolean");
    }

    /* renamed from: a */
    public void mo9444a() {
        if (!this.f9526v) {
            m10438b();
        }
        this.f9526v = true;
    }
}
