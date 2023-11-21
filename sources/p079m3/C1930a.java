package p079m3;

import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: m3.a */
class C1930a {

    /* renamed from: g */
    public static final ThreadLocal<C1930a> f7325g = new ThreadLocal<>();

    /* renamed from: a */
    private final ArrayMap<C1932b, Long> f7326a = new ArrayMap<>();

    /* renamed from: b */
    final ArrayList<C1932b> f7327b = new ArrayList<>();

    /* renamed from: c */
    private final C1931a f7328c = new C1931a();

    /* renamed from: d */
    private C1933c f7329d;

    /* renamed from: e */
    long f7330e = 0;

    /* renamed from: f */
    private boolean f7331f = false;

    /* renamed from: m3.a$a */
    class C1931a {
        C1931a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6524a() {
            C1930a.this.f7330e = SystemClock.uptimeMillis();
            C1930a aVar = C1930a.this;
            aVar.mo6521c(aVar.f7330e);
            if (C1930a.this.f7327b.size() > 0) {
                C1930a.this.mo6522e().mo6526a();
            }
        }
    }

    /* renamed from: m3.a$b */
    interface C1932b {
        boolean doAnimationFrame(long j);
    }

    /* renamed from: m3.a$c */
    static abstract class C1933c {

        /* renamed from: a */
        final C1931a f7333a;

        C1933c(C1931a aVar) {
            this.f7333a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo6526a();
    }

    /* renamed from: m3.a$d */
    private static class C1934d extends C1933c {

        /* renamed from: b */
        private final Choreographer f7334b = Choreographer.getInstance();

        /* renamed from: c */
        private final Choreographer.FrameCallback f7335c = new C1935a();

        /* renamed from: m3.a$d$a */
        class C1935a implements Choreographer.FrameCallback {
            C1935a() {
            }

            public void doFrame(long j) {
                C1934d.this.f7333a.mo6524a();
            }
        }

        C1934d(C1931a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6526a() {
            this.f7334b.postFrameCallback(this.f7335c);
        }
    }

    C1930a() {
    }

    /* renamed from: b */
    private void m7880b() {
        if (this.f7331f) {
            for (int size = this.f7327b.size() - 1; size >= 0; size--) {
                if (this.f7327b.get(size) == null) {
                    this.f7327b.remove(size);
                }
            }
            this.f7331f = false;
        }
    }

    /* renamed from: d */
    public static C1930a m7881d() {
        ThreadLocal<C1930a> threadLocal = f7325g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C1930a());
        }
        return threadLocal.get();
    }

    /* renamed from: f */
    private boolean m7882f(C1932b bVar, long j) {
        Long l = this.f7326a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f7326a.remove(bVar);
        return true;
    }

    /* renamed from: a */
    public void mo6520a(C1932b bVar, long j) {
        if (this.f7327b.size() == 0) {
            mo6522e().mo6526a();
        }
        if (!this.f7327b.contains(bVar)) {
            this.f7327b.add(bVar);
        }
        if (j > 0) {
            this.f7326a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6521c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f7327b.size(); i++) {
            C1932b bVar = this.f7327b.get(i);
            if (bVar != null && m7882f(bVar, uptimeMillis)) {
                bVar.doAnimationFrame(j);
            }
        }
        m7880b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1933c mo6522e() {
        if (this.f7329d == null) {
            this.f7329d = new C1934d(this.f7328c);
        }
        return this.f7329d;
    }

    /* renamed from: g */
    public void mo6523g(C1932b bVar) {
        this.f7326a.remove(bVar);
        int indexOf = this.f7327b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f7327b.set(indexOf, (Object) null);
            this.f7331f = true;
        }
    }
}
