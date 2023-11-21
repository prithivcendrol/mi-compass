package p087o;

import java.util.HashSet;
import p093p.C2512b;

/* renamed from: o.k */
public class C2485k extends C2483i {

    /* renamed from: N0 */
    private int f9685N0 = 0;

    /* renamed from: O0 */
    private int f9686O0 = 0;

    /* renamed from: P0 */
    private int f9687P0 = 0;

    /* renamed from: Q0 */
    private int f9688Q0 = 0;

    /* renamed from: R0 */
    private int f9689R0 = 0;

    /* renamed from: S0 */
    private int f9690S0 = 0;

    /* renamed from: T0 */
    private int f9691T0 = 0;

    /* renamed from: U0 */
    private int f9692U0 = 0;

    /* renamed from: V0 */
    private boolean f9693V0 = false;

    /* renamed from: W0 */
    private int f9694W0 = 0;

    /* renamed from: X0 */
    private int f9695X0 = 0;

    /* renamed from: Y0 */
    protected C2512b.C2513a f9696Y0 = new C2512b.C2513a();

    /* renamed from: Z0 */
    C2512b.C2514b f9697Z0 = null;

    /* renamed from: a */
    public void mo9604a(C2479f fVar) {
        mo9609q1();
    }

    /* renamed from: q1 */
    public void mo9609q1() {
        for (int i = 0; i < this.f9683M0; i++) {
            C2476e eVar = this.f9682L0[i];
            if (eVar != null) {
                eVar.mo9498R0(true);
            }
        }
    }

    /* renamed from: r1 */
    public boolean mo9610r1(HashSet<C2476e> hashSet) {
        for (int i = 0; i < this.f9683M0; i++) {
            if (hashSet.contains(this.f9682L0[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s1 */
    public boolean mo9611s1() {
        return this.f9693V0;
    }
}
