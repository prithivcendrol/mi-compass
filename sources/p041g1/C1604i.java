package p041g1;

import p029e1.C1518d;
import p029e1.C1523g;
import p029e1.C1529h;

/* renamed from: g1.i */
public abstract class C1604i extends C1595a {
    public C1604i(C1518d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.mo5629c() == C1529h.f6170d)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: c */
    public C1523g mo5629c() {
        return C1529h.f6170d;
    }
}
