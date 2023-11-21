package p022d0;

import p022d0.C1457a;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: d0.d */
public final class C1462d extends C1457a {
    public C1462d() {
        this((C1457a) null, 1, (C2420e) null);
    }

    public C1462d(C1457a aVar) {
        C2422g.m10285e(aVar, "initialExtras");
        mo5478a().putAll(aVar.mo5478a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1462d(C1457a aVar, int i, C2420e eVar) {
        this((i & 1) != 0 ? C1457a.C1458a.f6103b : aVar);
    }

    /* renamed from: b */
    public final <T> void mo5481b(C1457a.C1459b<T> bVar, T t) {
        C2422g.m10285e(bVar, "key");
        mo5478a().put(bVar, t);
    }
}
