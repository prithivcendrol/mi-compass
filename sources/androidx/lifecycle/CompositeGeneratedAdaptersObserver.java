package androidx.lifecycle;

import androidx.lifecycle.C1035g;

class CompositeGeneratedAdaptersObserver implements C1046k {

    /* renamed from: d */
    private final C1031e[] f3390d;

    CompositeGeneratedAdaptersObserver(C1031e[] eVarArr) {
        this.f3390d = eVarArr;
    }

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        C1053q qVar = new C1053q();
        for (C1031e a : this.f3390d) {
            a.mo3785a(mVar, bVar, false, qVar);
        }
        for (C1031e a2 : this.f3390d) {
            a2.mo3785a(mVar, bVar, true, qVar);
        }
    }
}
