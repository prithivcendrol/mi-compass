package p121u1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: u1.j */
public final /* synthetic */ class C2771j {
    /* renamed from: a */
    public static /* synthetic */ boolean m11556a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
