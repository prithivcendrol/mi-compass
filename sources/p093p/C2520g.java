package p093p;

import p093p.C2518f;

/* renamed from: p.g */
class C2520g extends C2518f {

    /* renamed from: m */
    public int f9959m;

    public C2520g(C2532p pVar) {
        super(pVar);
        this.f9942e = pVar instanceof C2525l ? C2518f.C2519a.HORIZONTAL_DIMENSION : C2518f.C2519a.VERTICAL_DIMENSION;
    }

    /* renamed from: d */
    public void mo9693d(int i) {
        if (!this.f9947j) {
            this.f9947j = true;
            this.f9944g = i;
            for (C2516d next : this.f9948k) {
                next.mo9675a(next);
            }
        }
    }
}
