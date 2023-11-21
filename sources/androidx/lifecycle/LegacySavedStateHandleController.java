package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import p040g0.C1587c;
import p040g0.C1593e;

class LegacySavedStateHandleController {

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    static final class C1004a implements C1587c.C1588a {
        C1004a() {
        }

        /* renamed from: a */
        public void mo3735a(C1593e eVar) {
            if (eVar instanceof C1039g0) {
                C1034f0 H = ((C1039g0) eVar).mo243H();
                C1587c f = eVar.mo254f();
                for (String b : H.mo3788c()) {
                    LegacySavedStateHandleController.m4139a(H.mo3787b(b), f, eVar.mo252c());
                }
                if (!H.mo3788c().isEmpty()) {
                    f.mo5738i(C1004a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m4139a(C1019c0 c0Var, C1587c cVar, C1035g gVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) c0Var.mo3780c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo3756i()) {
            savedStateHandleController.mo3755h(cVar, gVar);
            m4140b(cVar, gVar);
        }
    }

    /* renamed from: b */
    private static void m4140b(final C1587c cVar, final C1035g gVar) {
        C1035g.C1038c b = gVar.mo3791b();
        if (b == C1035g.C1038c.INITIALIZED || b.mo3794a(C1035g.C1038c.STARTED)) {
            cVar.mo5738i(C1004a.class);
        } else {
            gVar.mo3790a(new C1046k() {
                /* renamed from: g */
                public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
                    if (bVar == C1035g.C1037b.ON_START) {
                        C1035g.this.mo3792c(this);
                        cVar.mo5738i(C1004a.class);
                    }
                }
            });
        }
    }
}
