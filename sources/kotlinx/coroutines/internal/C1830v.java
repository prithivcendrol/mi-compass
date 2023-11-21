package kotlinx.coroutines.internal;

import p029e1.C1518d;
import p029e1.C1523g;
import p041g1.C1598d;
import p077m1.C1906l;
import p121u1.C2738a;
import p121u1.C2806u;

/* renamed from: kotlinx.coroutines.internal.v */
public class C1830v<T> extends C2738a<T> implements C1598d {

    /* renamed from: f */
    public final C1518d<T> f7089f;

    public C1830v(C1523g gVar, C1518d<? super T> dVar) {
        super(gVar, true, true);
        this.f7089f = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final boolean mo6307S() {
        return true;
    }

    /* renamed from: e */
    public final C1598d mo5744e() {
        C1518d<T> dVar = this.f7089f;
        if (dVar instanceof C1598d) {
            return (C1598d) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo6308r0(Object obj) {
        C1518d<T> dVar = this.f7089f;
        dVar.mo5630f(C2806u.m11666a(obj, dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo6309v(Object obj) {
        C1809e.m7509c(C1554c.m6673b(this.f7089f), C2806u.m11666a(obj, this.f7089f), (C1906l) null, 2, (Object) null);
    }
}
