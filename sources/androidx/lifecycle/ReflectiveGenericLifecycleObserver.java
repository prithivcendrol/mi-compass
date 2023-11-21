package androidx.lifecycle;

import androidx.lifecycle.C1011a;
import androidx.lifecycle.C1035g;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C1046k {

    /* renamed from: d */
    private final Object f3418d;

    /* renamed from: e */
    private final C1011a.C1012a f3419e;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3418d = obj;
        this.f3419e = C1011a.f3444c.mo3757c(obj.getClass());
    }

    /* renamed from: g */
    public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        this.f3419e.mo3759a(mVar, bVar, this.f3418d);
    }
}
