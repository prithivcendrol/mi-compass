package p087o;

import java.util.ArrayList;
import java.util.Arrays;
import p093p.C2522i;
import p093p.C2530o;

/* renamed from: o.i */
public class C2483i extends C2476e implements C2482h {

    /* renamed from: L0 */
    public C2476e[] f9682L0 = new C2476e[4];

    /* renamed from: M0 */
    public int f9683M0 = 0;

    /* renamed from: a */
    public void mo9604a(C2479f fVar) {
    }

    /* renamed from: b */
    public void mo9605b(C2476e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f9683M0 + 1;
            C2476e[] eVarArr = this.f9682L0;
            if (i > eVarArr.length) {
                this.f9682L0 = (C2476e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C2476e[] eVarArr2 = this.f9682L0;
            int i2 = this.f9683M0;
            eVarArr2[i2] = eVar;
            this.f9683M0 = i2 + 1;
        }
    }

    /* renamed from: c */
    public void mo9606c() {
        this.f9683M0 = 0;
        Arrays.fill(this.f9682L0, (Object) null);
    }

    /* renamed from: o1 */
    public void mo9607o1(ArrayList<C2530o> arrayList, int i, C2530o oVar) {
        for (int i2 = 0; i2 < this.f9683M0; i2++) {
            oVar.mo9701a(this.f9682L0[i2]);
        }
        for (int i3 = 0; i3 < this.f9683M0; i3++) {
            C2522i.m10713a(this.f9682L0[i3], i, arrayList, oVar);
        }
    }

    /* renamed from: p1 */
    public int mo9608p1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f9683M0; i4++) {
            C2476e eVar = this.f9682L0[i4];
            if (i == 0 && (i3 = eVar.f9565I0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = eVar.f9567J0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
