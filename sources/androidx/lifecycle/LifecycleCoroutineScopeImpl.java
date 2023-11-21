package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import java.util.concurrent.CancellationException;
import p029e1.C1523g;
import p083n1.C2422g;

public final class LifecycleCoroutineScopeImpl extends C1040h implements C1046k {

    /* renamed from: d */
    private final C1035g f3396d;

    /* renamed from: e */
    private final C1523g f3397e;

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        C2422g.m10285e(mVar, "source");
        C2422g.m10285e(bVar, "event");
        if (mo3737i().mo3791b().compareTo(C1035g.C1038c.DESTROYED) <= 0) {
            mo3737i().mo3792c(this);
            C2758f1.m11454b(mo3736h(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: h */
    public C1523g mo3736h() {
        return this.f3397e;
    }

    /* renamed from: i */
    public C1035g mo3737i() {
        return this.f3396d;
    }
}
