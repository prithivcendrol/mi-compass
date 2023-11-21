package p121u1;

import p029e1.C1523g;

/* renamed from: u1.a0 */
public final class C2739a0 {
    /* renamed from: a */
    public static final void m11422a(C1523g gVar, Throwable th) {
        try {
            C2824y yVar = (C2824y) gVar.get(C2824y.f10619b);
            if (yVar == null) {
                C2827z.m11699a(gVar, th);
            } else {
                yVar.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            C2827z.m11699a(gVar, m11423b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m11423b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C1327b.m5978a(runtimeException, th);
        return runtimeException;
    }
}
