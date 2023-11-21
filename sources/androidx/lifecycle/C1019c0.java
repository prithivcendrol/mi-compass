package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.c0 */
public abstract class C1019c0 {

    /* renamed from: a */
    private final Map<String, Object> f3457a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f3458b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f3459c = false;

    /* renamed from: b */
    private static void m4201b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3779a() {
        this.f3459c = true;
        Map<String, Object> map = this.f3457a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f3457a.values()) {
                    m4201b(b);
                }
            }
        }
        Set<Closeable> set = this.f3458b;
        if (set != null) {
            synchronized (set) {
                for (Closeable b2 : this.f3458b) {
                    m4201b(b2);
                }
            }
        }
        mo3719d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo3780c(String str) {
        T t;
        Map<String, Object> map = this.f3457a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3457a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3719d() {
    }
}
