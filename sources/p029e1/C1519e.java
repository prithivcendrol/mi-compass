package p029e1;

import p029e1.C1523g;
import p083n1.C2422g;

/* renamed from: e1.e */
public interface C1519e extends C1523g.C1526b {

    /* renamed from: a */
    public static final C1521b f6167a = C1521b.f6168d;

    /* renamed from: e1.e$a */
    public static final class C1520a {
        /* renamed from: a */
        public static <E extends C1523g.C1526b> E m6579a(C1519e eVar, C1523g.C1528c<E> cVar) {
            C2422g.m10285e(cVar, "key");
            if (cVar instanceof C1515b) {
                C1515b bVar = (C1515b) cVar;
                if (!bVar.mo5623a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo5624b(eVar);
                if (b instanceof C1523g.C1526b) {
                    return b;
                }
                return null;
            } else if (C1519e.f6167a != cVar) {
                return null;
            } else {
                C2422g.m10283c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C1523g m6580b(C1519e eVar, C1523g.C1528c<?> cVar) {
            C2422g.m10285e(cVar, "key");
            if (!(cVar instanceof C1515b)) {
                return C1519e.f6167a == cVar ? C1529h.f6170d : eVar;
            }
            C1515b bVar = (C1515b) cVar;
            return (!bVar.mo5623a(eVar.getKey()) || bVar.mo5624b(eVar) == null) ? eVar : C1529h.f6170d;
        }
    }

    /* renamed from: e1.e$b */
    public static final class C1521b implements C1523g.C1528c<C1519e> {

        /* renamed from: d */
        static final /* synthetic */ C1521b f6168d = new C1521b();

        private C1521b() {
        }
    }

    /* renamed from: k */
    <T> C1518d<T> mo5631k(C1518d<? super T> dVar);

    /* renamed from: q */
    void mo5632q(C1518d<?> dVar);
}
