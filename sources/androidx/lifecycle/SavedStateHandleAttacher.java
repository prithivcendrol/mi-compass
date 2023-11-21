package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import p083n1.C2422g;

public final class SavedStateHandleAttacher implements C1046k {

    /* renamed from: d */
    private final C1014a0 f3435d;

    public SavedStateHandleAttacher(C1014a0 a0Var) {
        C2422g.m10285e(a0Var, "provider");
        this.f3435d = a0Var;
    }

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        C2422g.m10285e(mVar, "source");
        C2422g.m10285e(bVar, "event");
        if (bVar == C1035g.C1037b.ON_CREATE) {
            mVar.mo252c().mo3792c(this);
            this.f3435d.mo3763c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
