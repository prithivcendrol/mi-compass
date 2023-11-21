package p029e1;

import p029e1.C1523g;
import p029e1.C1523g.C1526b;
import p077m1.C1906l;
import p083n1.C2422g;

/* renamed from: e1.b */
public abstract class C1515b<B extends C1523g.C1526b, E extends B> implements C1523g.C1528c<E> {

    /* renamed from: d */
    private final C1906l<C1523g.C1526b, E> f6162d;

    /* renamed from: e */
    private final C1523g.C1528c<?> f6163e;

    public C1515b(C1523g.C1528c<B> cVar, C1906l<? super C1523g.C1526b, ? extends E> lVar) {
        C2422g.m10285e(cVar, "baseKey");
        C2422g.m10285e(lVar, "safeCast");
        this.f6162d = lVar;
        this.f6163e = cVar instanceof C1515b ? ((C1515b) cVar).f6163e : cVar;
    }

    /* renamed from: a */
    public final boolean mo5623a(C1523g.C1528c<?> cVar) {
        C2422g.m10285e(cVar, "key");
        return cVar == this || this.f6163e == cVar;
    }

    /* renamed from: b */
    public final E mo5624b(C1523g.C1526b bVar) {
        C2422g.m10285e(bVar, "element");
        return (C1523g.C1526b) this.f6162d.mo3838h(bVar);
    }
}
