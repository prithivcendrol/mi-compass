package p111s1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p083n1.C2422g;

/* renamed from: s1.a */
public final class C2648a<T> implements C2649b<T> {

    /* renamed from: a */
    private final AtomicReference<C2649b<T>> f10323a;

    public C2648a(C2649b<? extends T> bVar) {
        C2422g.m10285e(bVar, "sequence");
        this.f10323a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        C2649b andSet = this.f10323a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
