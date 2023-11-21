package p087o;

import p069l.C1858d;
import p069l.C1867i;
import p087o.C2473d;
import p087o.C2476e;

/* renamed from: o.a */
public class C2470a extends C2483i {

    /* renamed from: N0 */
    private int f9501N0 = 0;

    /* renamed from: O0 */
    private boolean f9502O0 = true;

    /* renamed from: P0 */
    private int f9503P0 = 0;

    /* renamed from: Q0 */
    boolean f9504Q0 = false;

    /* renamed from: g */
    public void mo9430g(C1858d dVar, boolean z) {
        C2473d[] dVarArr;
        boolean z2;
        C1867i iVar;
        C2473d dVar2;
        int i;
        int i2;
        int i3;
        C1867i iVar2;
        int i4;
        C2473d[] dVarArr2 = this.f9580W;
        dVarArr2[0] = this.f9572O;
        dVarArr2[2] = this.f9573P;
        dVarArr2[1] = this.f9574Q;
        dVarArr2[3] = this.f9575R;
        int i5 = 0;
        while (true) {
            dVarArr = this.f9580W;
            if (i5 >= dVarArr.length) {
                break;
            }
            C2473d dVar3 = dVarArr[i5];
            dVar3.f9535i = dVar.mo6406q(dVar3);
            i5++;
        }
        int i6 = this.f9501N0;
        if (i6 >= 0 && i6 < 4) {
            C2473d dVar4 = dVarArr[i6];
            if (!this.f9504Q0) {
                mo9434q1();
            }
            if (this.f9504Q0) {
                this.f9504Q0 = false;
                int i7 = this.f9501N0;
                if (i7 == 0 || i7 == 1) {
                    dVar.mo6397f(this.f9572O.f9535i, this.f9595f0);
                    iVar2 = this.f9574Q.f9535i;
                    i4 = this.f9595f0;
                } else if (i7 == 2 || i7 == 3) {
                    dVar.mo6397f(this.f9573P.f9535i, this.f9597g0);
                    iVar2 = this.f9575R.f9535i;
                    i4 = this.f9597g0;
                } else {
                    return;
                }
                dVar.mo6397f(iVar2, i4);
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.f9683M0) {
                    z2 = false;
                    break;
                }
                C2476e eVar = this.f9682L0[i8];
                if ((this.f9502O0 || eVar.mo9431h()) && ((((i2 = this.f9501N0) == 0 || i2 == 1) && eVar.mo9564y() == C2476e.C2478b.MATCH_CONSTRAINT && eVar.f9572O.f9532f != null && eVar.f9574Q.f9532f != null) || (((i3 = this.f9501N0) == 2 || i3 == 3) && eVar.mo9497R() == C2476e.C2478b.MATCH_CONSTRAINT && eVar.f9573P.f9532f != null && eVar.f9575R.f9532f != null))) {
                    z2 = true;
                } else {
                    i8++;
                }
            }
            z2 = true;
            boolean z3 = this.f9572O.mo9455k() || this.f9574Q.mo9455k();
            boolean z4 = this.f9573P.mo9455k() || this.f9575R.mo9455k();
            boolean z5 = !z2 && (((i = this.f9501N0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
            int i9 = 5;
            if (!z5) {
                i9 = 4;
            }
            for (int i10 = 0; i10 < this.f9683M0; i10++) {
                C2476e eVar2 = this.f9682L0[i10];
                if (this.f9502O0 || eVar2.mo9431h()) {
                    C1867i q = dVar.mo6406q(eVar2.f9580W[this.f9501N0]);
                    C2473d[] dVarArr3 = eVar2.f9580W;
                    int i11 = this.f9501N0;
                    C2473d dVar5 = dVarArr3[i11];
                    dVar5.f9535i = q;
                    C2473d dVar6 = dVar5.f9532f;
                    int i12 = (dVar6 == null || dVar6.f9530d != this) ? 0 : dVar5.f9533g + 0;
                    if (i11 == 0 || i11 == 2) {
                        dVar.mo6400i(dVar4.f9535i, q, this.f9503P0 - i12, z2);
                    } else {
                        dVar.mo6398g(dVar4.f9535i, q, this.f9503P0 + i12, z2);
                    }
                    dVar.mo6396e(dVar4.f9535i, q, this.f9503P0 + i12, i9);
                }
            }
            int i13 = this.f9501N0;
            if (i13 == 0) {
                dVar.mo6396e(this.f9574Q.f9535i, this.f9572O.f9535i, 0, 8);
                dVar.mo6396e(this.f9572O.f9535i, this.f9585a0.f9574Q.f9535i, 0, 4);
                iVar = this.f9572O.f9535i;
                dVar2 = this.f9585a0.f9572O;
            } else if (i13 == 1) {
                dVar.mo6396e(this.f9572O.f9535i, this.f9574Q.f9535i, 0, 8);
                dVar.mo6396e(this.f9572O.f9535i, this.f9585a0.f9572O.f9535i, 0, 4);
                iVar = this.f9572O.f9535i;
                dVar2 = this.f9585a0.f9574Q;
            } else if (i13 == 2) {
                dVar.mo6396e(this.f9575R.f9535i, this.f9573P.f9535i, 0, 8);
                dVar.mo6396e(this.f9573P.f9535i, this.f9585a0.f9575R.f9535i, 0, 4);
                iVar = this.f9573P.f9535i;
                dVar2 = this.f9585a0.f9573P;
            } else if (i13 == 3) {
                dVar.mo6396e(this.f9573P.f9535i, this.f9575R.f9535i, 0, 8);
                dVar.mo6396e(this.f9573P.f9535i, this.f9585a0.f9573P.f9535i, 0, 4);
                iVar = this.f9573P.f9535i;
                dVar2 = this.f9585a0.f9575R;
            } else {
                return;
            }
            dVar.mo6396e(iVar, dVar2.f9535i, 0, 0);
        }
    }

    /* renamed from: h */
    public boolean mo9431h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo9432l0() {
        return this.f9504Q0;
    }

    /* renamed from: m0 */
    public boolean mo9433m0() {
        return this.f9504Q0;
    }

    /* renamed from: q1 */
    public boolean mo9434q1() {
        int i;
        C2473d.C2475b bVar;
        C2473d.C2475b bVar2;
        C2473d.C2475b bVar3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f9683M0;
            if (i4 >= i) {
                break;
            }
            C2476e eVar = this.f9682L0[i4];
            if ((this.f9502O0 || eVar.mo9431h()) && ((((i2 = this.f9501N0) == 0 || i2 == 1) && !eVar.mo9432l0()) || (((i3 = this.f9501N0) == 2 || i3 == 3) && !eVar.mo9433m0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f9683M0; i6++) {
            C2476e eVar2 = this.f9682L0[i6];
            if (this.f9502O0 || eVar2.mo9431h()) {
                if (!z2) {
                    int i7 = this.f9501N0;
                    if (i7 == 0) {
                        bVar3 = C2473d.C2475b.LEFT;
                    } else if (i7 == 1) {
                        bVar3 = C2473d.C2475b.RIGHT;
                    } else if (i7 == 2) {
                        bVar3 = C2473d.C2475b.TOP;
                    } else {
                        if (i7 == 3) {
                            bVar3 = C2473d.C2475b.BOTTOM;
                        }
                        z2 = true;
                    }
                    i5 = eVar2.mo9542m(bVar3).mo9448d();
                    z2 = true;
                }
                int i8 = this.f9501N0;
                if (i8 == 0) {
                    bVar2 = C2473d.C2475b.LEFT;
                } else {
                    if (i8 == 1) {
                        bVar = C2473d.C2475b.RIGHT;
                    } else if (i8 == 2) {
                        bVar2 = C2473d.C2475b.TOP;
                    } else if (i8 == 3) {
                        bVar = C2473d.C2475b.BOTTOM;
                    }
                    i5 = Math.max(i5, eVar2.mo9542m(bVar).mo9448d());
                }
                i5 = Math.min(i5, eVar2.mo9542m(bVar2).mo9448d());
            }
        }
        int i9 = i5 + this.f9503P0;
        int i10 = this.f9501N0;
        if (i10 == 0 || i10 == 1) {
            mo9470C0(i9, i9);
        } else {
            mo9476F0(i9, i9);
        }
        this.f9504Q0 = true;
        return true;
    }

    /* renamed from: r1 */
    public boolean mo9435r1() {
        return this.f9502O0;
    }

    /* renamed from: s1 */
    public int mo9436s1() {
        return this.f9501N0;
    }

    /* renamed from: t1 */
    public int mo9437t1() {
        return this.f9503P0;
    }

    public String toString() {
        String str = "[Barrier] " + mo9553r() + " {";
        for (int i = 0; i < this.f9683M0; i++) {
            C2476e eVar = this.f9682L0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo9553r();
        }
        return str + "}";
    }

    /* renamed from: u1 */
    public int mo9439u1() {
        int i = this.f9501N0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo9440v1() {
        for (int i = 0; i < this.f9683M0; i++) {
            C2476e eVar = this.f9682L0[i];
            if (this.f9502O0 || eVar.mo9431h()) {
                int i2 = this.f9501N0;
                if (i2 == 0 || i2 == 1) {
                    eVar.mo9494P0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    eVar.mo9494P0(1, true);
                }
            }
        }
    }

    /* renamed from: w1 */
    public void mo9441w1(boolean z) {
        this.f9502O0 = z;
    }

    /* renamed from: x1 */
    public void mo9442x1(int i) {
        this.f9501N0 = i;
    }

    /* renamed from: y1 */
    public void mo9443y1(int i) {
        this.f9503P0 = i;
    }
}
