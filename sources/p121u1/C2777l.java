package p121u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: u1.l */
public final class C2777l extends C2792q {

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10574c = AtomicIntegerFieldUpdater.newUpdater(C2777l.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* renamed from: c */
    public final boolean mo10046c() {
        return f10574c.compareAndSet(this, 0, 1);
    }
}
