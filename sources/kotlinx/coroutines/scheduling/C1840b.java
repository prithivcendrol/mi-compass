package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.C1832x;
import p029e1.C1523g;
import p029e1.C1529h;
import p121u1.C2810v0;
import p121u1.C2820x;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C1840b extends C2810v0 implements Executor {

    /* renamed from: f */
    public static final C1840b f7119f = new C1840b();

    /* renamed from: g */
    private static final C2820x f7120g = C1851m.f7139e.mo10095f(C1834z.m7591d("kotlinx.coroutines.io.parallelism", C2581f.m10984a(64, C1832x.m7579a()), 0, 0, 12, (Object) null));

    private C1840b() {
    }

    /* renamed from: c */
    public void mo6270c(C1523g gVar, Runnable runnable) {
        f7120g.mo6270c(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo6270c(C1529h.f6170d, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
