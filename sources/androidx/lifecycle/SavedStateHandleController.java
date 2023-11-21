package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import p040g0.C1587c;

final class SavedStateHandleController implements C1046k {

    /* renamed from: d */
    private final String f3436d;

    /* renamed from: e */
    private boolean f3437e;

    /* renamed from: f */
    private final C1067y f3438f;

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        if (bVar == C1035g.C1037b.ON_DESTROY) {
            this.f3437e = false;
            mVar.mo252c().mo3792c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3755h(C1587c cVar, C1035g gVar) {
        if (!this.f3437e) {
            this.f3437e = true;
            gVar.mo3790a(this);
            cVar.mo5737h(this.f3436d, this.f3438f.mo3834c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo3756i() {
        return this.f3437e;
    }
}
