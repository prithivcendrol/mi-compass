package p029e1;

import java.io.Serializable;
import p029e1.C1523g;
import p077m1.C1910p;
import p083n1.C2422g;

/* renamed from: e1.h */
public final class C1529h implements C1523g, Serializable {

    /* renamed from: d */
    public static final C1529h f6170d = new C1529h();

    private C1529h() {
    }

    public <R> R fold(R r, C1910p<? super R, ? super C1523g.C1526b, ? extends R> pVar) {
        C2422g.m10285e(pVar, "operation");
        return r;
    }

    public <E extends C1523g.C1526b> E get(C1523g.C1528c<E> cVar) {
        C2422g.m10285e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C1523g minusKey(C1523g.C1528c<?> cVar) {
        C2422g.m10285e(cVar, "key");
        return this;
    }

    public C1523g plus(C1523g gVar) {
        C2422g.m10285e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
