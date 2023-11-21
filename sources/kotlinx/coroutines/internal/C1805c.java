package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p121u1.C2771j;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class C1805c<T> extends C1827s {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7046a = AtomicReferenceFieldUpdater.newUpdater(C1805c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C1803b.f7043a;

    /* renamed from: a */
    public C1805c<?> mo6249a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo6250c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C1803b.f7043a) {
            obj2 = mo6252e(mo6254g(obj));
        }
        mo6251d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo6251d(T t, Object obj);

    /* renamed from: e */
    public final Object mo6252e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C1803b.f7043a;
        return obj2 != obj3 ? obj2 : C2771j.m11556a(f7046a, this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long mo6253f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo6254g(T t);
}
