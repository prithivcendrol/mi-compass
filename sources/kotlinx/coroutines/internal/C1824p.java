package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p121u1.C2776k1;

/* renamed from: kotlinx.coroutines.internal.p */
public final class C1824p {

    /* renamed from: a */
    public static final C1824p f7082a;

    /* renamed from: b */
    private static final boolean f7083b = C1832x.m7583e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C2776k1 f7084c;

    static {
        C1824p pVar = new C1824p();
        f7082a = pVar;
        f7084c = pVar.m7558a();
    }

    private C1824p() {
    }

    /* renamed from: a */
    private final C2776k1 m7558a() {
        T t;
        Class<C1823o> cls = C1823o.class;
        try {
            List<C1823o> c = f7083b ? C1810f.f7058a.mo6268c() : C2656h.m11153d(C2653f.m11150a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = c.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((C1823o) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((C1823o) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            C1823o oVar = (C1823o) t;
            C2776k1 e = oVar == null ? null : C1825q.m7563e(oVar, c);
            return e == null ? C1825q.m7560b((Throwable) null, (String) null, 3, (Object) null) : e;
        } catch (Throwable th) {
            return C1825q.m7560b(th, (String) null, 2, (Object) null);
        }
    }
}
