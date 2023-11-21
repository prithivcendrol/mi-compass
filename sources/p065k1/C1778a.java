package p065k1;

import java.io.Closeable;

/* renamed from: k1.a */
public final class C1778a {
    /* renamed from: a */
    public static final void m7408a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C1327b.m5978a(th, th2);
        }
    }
}
