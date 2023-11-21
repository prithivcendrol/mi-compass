package p087o;

import p069l.C1858d;
import p087o.C2476e;

/* renamed from: o.j */
public class C2484j {

    /* renamed from: a */
    static boolean[] f9684a = new boolean[3];

    /* renamed from: a */
    static void m10634a(C2479f fVar, C1858d dVar, C2476e eVar) {
        eVar.f9622t = -1;
        eVar.f9624u = -1;
        C2476e.C2478b bVar = fVar.f9583Z[0];
        C2476e.C2478b bVar2 = C2476e.C2478b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f9583Z[0] == C2476e.C2478b.MATCH_PARENT) {
            int i = eVar.f9572O.f9533g;
            int U = fVar.mo9503U() - eVar.f9574Q.f9533g;
            C2473d dVar2 = eVar.f9572O;
            dVar2.f9535i = dVar.mo6406q(dVar2);
            C2473d dVar3 = eVar.f9574Q;
            dVar3.f9535i = dVar.mo6406q(dVar3);
            dVar.mo6397f(eVar.f9572O.f9535i, i);
            dVar.mo6397f(eVar.f9574Q.f9535i, U);
            eVar.f9622t = 2;
            eVar.mo9488L0(i, U);
        }
        if (fVar.f9583Z[1] != bVar2 && eVar.f9583Z[1] == C2476e.C2478b.MATCH_PARENT) {
            int i2 = eVar.f9573P.f9533g;
            int v = fVar.mo9560v() - eVar.f9575R.f9533g;
            C2473d dVar4 = eVar.f9573P;
            dVar4.f9535i = dVar.mo6406q(dVar4);
            C2473d dVar5 = eVar.f9575R;
            dVar5.f9535i = dVar.mo6406q(dVar5);
            dVar.mo6397f(eVar.f9573P.f9535i, i2);
            dVar.mo6397f(eVar.f9575R.f9535i, v);
            if (eVar.f9607l0 > 0 || eVar.mo9501T() == 8) {
                C2473d dVar6 = eVar.f9576S;
                dVar6.f9535i = dVar.mo6406q(dVar6);
                dVar.mo6397f(eVar.f9576S.f9535i, eVar.f9607l0 + i2);
            }
            eVar.f9624u = 2;
            eVar.mo9520c1(i2, v);
        }
    }

    /* renamed from: b */
    public static final boolean m10635b(int i, int i2) {
        return (i & i2) == i2;
    }
}
