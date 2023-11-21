package p121u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p017c1.C1344q;
import p077m1.C1906l;

/* renamed from: u1.z0 */
final class C2828z0 extends C2752d1 {

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10623i = AtomicIntegerFieldUpdater.newUpdater(C2828z0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: h */
    private final C1906l<Throwable, C1344q> f10624h;

    public C2828z0(C1906l<? super Throwable, C1344q> lVar) {
        this.f10624h = lVar;
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Object mo3838h(Object obj) {
        mo9982v((Throwable) obj);
        return C1344q.f4517a;
    }

    /* renamed from: v */
    public void mo9982v(Throwable th) {
        if (f10623i.compareAndSet(this, 0, 1)) {
            this.f10624h.mo3838h(th);
        }
    }
}
