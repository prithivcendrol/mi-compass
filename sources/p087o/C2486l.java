package p087o;

import java.util.ArrayList;
import p069l.C1857c;

/* renamed from: o.l */
public class C2486l extends C2476e {

    /* renamed from: L0 */
    public ArrayList<C2476e> f9698L0 = new ArrayList<>();

    /* renamed from: b */
    public void mo9612b(C2476e eVar) {
        this.f9698L0.add(eVar);
        if (eVar.mo9481I() != null) {
            ((C2486l) eVar.mo9481I()).mo9614q1(eVar);
        }
        eVar.mo9514Z0(this);
    }

    /* renamed from: o1 */
    public ArrayList<C2476e> mo9613o1() {
        return this.f9698L0;
    }

    /* renamed from: p1 */
    public void mo9589p1() {
        ArrayList<C2476e> arrayList = this.f9698L0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2476e eVar = this.f9698L0.get(i);
                if (eVar instanceof C2486l) {
                    ((C2486l) eVar).mo9589p1();
                }
            }
        }
    }

    /* renamed from: q1 */
    public void mo9614q1(C2476e eVar) {
        this.f9698L0.remove(eVar);
        eVar.mo9554r0();
    }

    /* renamed from: r0 */
    public void mo9554r0() {
        this.f9698L0.clear();
        super.mo9554r0();
    }

    /* renamed from: r1 */
    public void mo9615r1() {
        this.f9698L0.clear();
    }

    /* renamed from: t0 */
    public void mo9558t0(C1857c cVar) {
        super.mo9558t0(cVar);
        int size = this.f9698L0.size();
        for (int i = 0; i < size; i++) {
            this.f9698L0.get(i).mo9558t0(cVar);
        }
    }
}
