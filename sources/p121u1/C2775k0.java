package p121u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C1809e;
import kotlinx.coroutines.internal.C1830v;
import p077m1.C1906l;

/* renamed from: u1.k0 */
public final class C2775k0<T> extends C1830v<T> {

    /* renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10573g = AtomicIntegerFieldUpdater.newUpdater(C2775k0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    /* renamed from: v0 */
    private final boolean m11580v0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f10573g.compareAndSet(this, 0, 2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo6308r0(Object obj) {
        if (!m11580v0()) {
            C1809e.m7509c(C1554c.m6673b(this.f7089f), C2806u.m11666a(obj, this.f7089f), (C1906l) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo6309v(Object obj) {
        mo6308r0(obj);
    }
}
