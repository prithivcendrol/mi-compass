package p017c1;

import java.io.Serializable;
import p077m1.C1895a;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: c1.m */
final class C1340m<T> implements C1330e<T>, Serializable {

    /* renamed from: d */
    private C1895a<? extends T> f4513d;

    /* renamed from: e */
    private volatile Object f4514e;

    /* renamed from: f */
    private final Object f4515f;

    public C1340m(C1895a<? extends T> aVar, Object obj) {
        C2422g.m10285e(aVar, "initializer");
        this.f4513d = aVar;
        this.f4514e = C1342o.f4516a;
        this.f4515f = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1340m(C1895a aVar, Object obj, int i, C2420e eVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean mo5196a() {
        return this.f4514e != C1342o.f4516a;
    }

    public T getValue() {
        T t;
        T t2 = this.f4514e;
        T t3 = C1342o.f4516a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f4515f) {
            t = this.f4514e;
            if (t == t3) {
                C1895a aVar = this.f4513d;
                C2422g.m10282b(aVar);
                t = aVar.mo3765b();
                this.f4514e = t;
                this.f4513d = null;
            }
        }
        return t;
    }

    public String toString() {
        return mo5196a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
