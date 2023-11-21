package kotlinx.coroutines.internal;

import java.util.List;
import p017c1.C1329d;
import p121u1.C2776k1;

/* renamed from: kotlinx.coroutines.internal.q */
public final class C1825q {

    /* renamed from: a */
    private static final boolean f7085a = true;

    /* renamed from: a */
    private static final C1826r m7559a(Throwable th, String str) {
        if (f7085a) {
            return new C1826r(th, str);
        }
        if (th == null) {
            m7562d();
            throw new C1329d();
        }
        throw th;
    }

    /* renamed from: b */
    static /* synthetic */ C1826r m7560b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m7559a(th, str);
    }

    /* renamed from: c */
    public static final boolean m7561c(C2776k1 k1Var) {
        return k1Var.mo6298h() instanceof C1826r;
    }

    /* renamed from: d */
    public static final Void m7562d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final C2776k1 m7563e(C1823o oVar, List<? extends C1823o> list) {
        try {
            return oVar.createDispatcher(list);
        } catch (Throwable th) {
            return m7559a(th, oVar.hintOnError());
        }
    }
}
