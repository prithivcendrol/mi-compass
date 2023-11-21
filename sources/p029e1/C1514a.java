package p029e1;

import p029e1.C1523g;
import p077m1.C1910p;
import p083n1.C2422g;

/* renamed from: e1.a */
public abstract class C1514a implements C1523g.C1526b {
    private final C1523g.C1528c<?> key;

    public C1514a(C1523g.C1528c<?> cVar) {
        C2422g.m10285e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C1910p<? super R, ? super C1523g.C1526b, ? extends R> pVar) {
        return C1523g.C1526b.C1527a.m6585a(this, r, pVar);
    }

    public <E extends C1523g.C1526b> E get(C1523g.C1528c<E> cVar) {
        return C1523g.C1526b.C1527a.m6586b(this, cVar);
    }

    public C1523g.C1528c<?> getKey() {
        return this.key;
    }

    public C1523g minusKey(C1523g.C1528c<?> cVar) {
        return C1523g.C1526b.C1527a.m6587c(this, cVar);
    }

    public C1523g plus(C1523g gVar) {
        return C1523g.C1526b.C1527a.m6588d(this, gVar);
    }
}
