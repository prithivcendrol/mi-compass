package p029e1;

import p029e1.C1519e;
import p077m1.C1910p;
import p083n1.C2422g;
import p083n1.C2423h;

/* renamed from: e1.g */
public interface C1523g {

    /* renamed from: e1.g$a */
    public static final class C1524a {

        /* renamed from: e1.g$a$a */
        static final class C1525a extends C2423h implements C1910p<C1523g, C1526b, C1523g> {

            /* renamed from: e */
            public static final C1525a f6169e = new C1525a();

            C1525a() {
                super(2);
            }

            /* renamed from: a */
            public final C1523g mo3751g(C1523g gVar, C1526b bVar) {
                C1516c cVar;
                C2422g.m10285e(gVar, "acc");
                C2422g.m10285e(bVar, "element");
                C1523g minusKey = gVar.minusKey(bVar.getKey());
                C1529h hVar = C1529h.f6170d;
                if (minusKey == hVar) {
                    return bVar;
                }
                C1519e.C1521b bVar2 = C1519e.f6167a;
                C1519e eVar = (C1519e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C1516c(minusKey, bVar);
                } else {
                    C1523g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C1516c(bVar, eVar);
                    }
                    cVar = new C1516c(new C1516c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C1523g m6582a(C1523g gVar, C1523g gVar2) {
            C2422g.m10285e(gVar2, "context");
            return gVar2 == C1529h.f6170d ? gVar : (C1523g) gVar2.fold(gVar, C1525a.f6169e);
        }
    }

    /* renamed from: e1.g$b */
    public interface C1526b extends C1523g {

        /* renamed from: e1.g$b$a */
        public static final class C1527a {
            /* renamed from: a */
            public static <R> R m6585a(C1526b bVar, R r, C1910p<? super R, ? super C1526b, ? extends R> pVar) {
                C2422g.m10285e(pVar, "operation");
                return pVar.mo3751g(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C1526b> E m6586b(C1526b bVar, C1528c<E> cVar) {
                C2422g.m10285e(cVar, "key");
                if (!C2422g.m10281a(bVar.getKey(), cVar)) {
                    return null;
                }
                C2422g.m10283c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C1523g m6587c(C1526b bVar, C1528c<?> cVar) {
                C2422g.m10285e(cVar, "key");
                return C2422g.m10281a(bVar.getKey(), cVar) ? C1529h.f6170d : bVar;
            }

            /* renamed from: d */
            public static C1523g m6588d(C1526b bVar, C1523g gVar) {
                C2422g.m10285e(gVar, "context");
                return C1524a.m6582a(bVar, gVar);
            }
        }

        <E extends C1526b> E get(C1528c<E> cVar);

        C1528c<?> getKey();
    }

    /* renamed from: e1.g$c */
    public interface C1528c<E extends C1526b> {
    }

    <R> R fold(R r, C1910p<? super R, ? super C1526b, ? extends R> pVar);

    <E extends C1526b> E get(C1528c<E> cVar);

    C1523g minusKey(C1528c<?> cVar);

    C1523g plus(C1523g gVar);
}
