package p121u1;

import java.util.List;
import java.util.ServiceLoader;
import p017c1.C1336k;
import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1523g;

/* renamed from: u1.z */
public final class C2827z {

    /* renamed from: a */
    private static final List<C2824y> f10622a;

    static {
        Class<C2824y> cls = C2824y.class;
        f10622a = C2656h.m11153d(C2653f.m11150a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m11699a(C1523g gVar, Throwable th) {
        for (C2824y handleException : f10622a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C2739a0.m11423b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C1336k.C1337a aVar = C1336k.f4511d;
            C1327b.m5978a(th, new C2772j0(gVar));
            C1336k.m5985a(C1344q.f4517a);
        } catch (Throwable th3) {
            C1336k.C1337a aVar2 = C1336k.f4511d;
            C1336k.m5985a(C1339l.m5989a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
