package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p121u1.C2771j;

/* renamed from: kotlinx.coroutines.internal.m */
public class C1819m<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7072a = AtomicReferenceFieldUpdater.newUpdater(C1819m.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C1819m(boolean z) {
        this._cur = new C1820n(8, z);
    }

    /* renamed from: a */
    public final boolean mo6283a(E e) {
        while (true) {
            C1820n nVar = (C1820n) this._cur;
            int a = nVar.mo6287a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C2771j.m11556a(f7072a, this, nVar, nVar.mo6291i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo6284b() {
        while (true) {
            C1820n nVar = (C1820n) this._cur;
            if (!nVar.mo6288d()) {
                C2771j.m11556a(f7072a, this, nVar, nVar.mo6291i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo6285c() {
        return ((C1820n) this._cur).mo6289f();
    }

    /* renamed from: d */
    public final E mo6286d() {
        while (true) {
            C1820n nVar = (C1820n) this._cur;
            E j = nVar.mo6292j();
            if (j != C1820n.f7076h) {
                return j;
            }
            C2771j.m11556a(f7072a, this, nVar, nVar.mo6291i());
        }
    }
}
