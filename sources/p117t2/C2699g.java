package p117t2;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/* renamed from: t2.g */
public final class C2699g {

    /* renamed from: a */
    private static final HashMap<Class<?>, Object> f10493a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final HashMap<Class<?>, C2706f<?>> f10494b = new HashMap<>();

    /* renamed from: c */
    private static final C2705e<StringBuilder> f10495c = m11289b(new C2700a(), 4);

    /* renamed from: t2.g$a */
    class C2700a extends C2704d<StringBuilder> {
        C2700a() {
        }

        /* renamed from: e */
        public StringBuilder mo9790a() {
            return new StringBuilder();
        }

        /* renamed from: f */
        public void mo9940d(StringBuilder sb) {
            sb.setLength(0);
        }
    }

    /* renamed from: t2.g$b */
    static abstract class C2701b<T> implements C2705e<T> {

        /* renamed from: a */
        private final C2704d<T> f10496a;

        /* renamed from: b */
        private final int f10497b;

        /* renamed from: c */
        private C2703c<T> f10498c;

        /* renamed from: d */
        private final Object f10499d;

        /* renamed from: t2.g$b$a */
        class C2702a {
            C2702a() {
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                try {
                    C2701b.this.mo9945c();
                } finally {
                    super.finalize();
                }
            }
        }

        public C2701b(C2704d<T> dVar, int i) {
            C2702a aVar = new C2702a();
            this.f10499d = aVar;
            if (dVar == null || i < 1) {
                this.f10497b = aVar.hashCode();
                throw new IllegalArgumentException("manager cannot be null and size cannot less then 1");
            }
            this.f10496a = dVar;
            this.f10497b = i;
            T a = dVar.mo9790a();
            if (a != null) {
                this.f10498c = mo9946d(a.getClass(), i);
                mo9949g(a);
                return;
            }
            throw new IllegalStateException("manager create instance cannot return null");
        }

        /* renamed from: a */
        public void mo9943a(T t) {
            mo9949g(t);
        }

        /* renamed from: b */
        public T mo9944b() {
            return mo9948f();
        }

        /* renamed from: c */
        public void mo9945c() {
            C2703c<T> cVar = this.f10498c;
            if (cVar != null) {
                mo9947e(cVar, this.f10497b);
                this.f10498c = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C2703c<T> mo9946d(Class<T> cls, int i);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo9947e(C2703c<T> cVar, int i);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final T mo9948f() {
            C2703c<T> cVar = this.f10498c;
            if (cVar != null) {
                T t = cVar.get();
                if (t == null && (t = this.f10496a.mo9790a()) == null) {
                    throw new IllegalStateException("manager create instance cannot return null");
                }
                this.f10496a.mo9953b(t);
                return t;
            }
            throw new IllegalStateException("Cannot acquire object after close()");
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo9949g(T t) {
            if (this.f10498c == null) {
                throw new IllegalStateException("Cannot release object after close()");
            } else if (t != null) {
                this.f10496a.mo9940d(t);
                if (!this.f10498c.put(t)) {
                    this.f10496a.mo9954c(t);
                }
            }
        }
    }

    /* renamed from: t2.g$c */
    private interface C2703c<T> {
        T get();

        boolean put(T t);
    }

    /* renamed from: t2.g$d */
    public static abstract class C2704d<T> {
        /* renamed from: a */
        public abstract T mo9790a();

        /* renamed from: b */
        public void mo9953b(T t) {
        }

        /* renamed from: c */
        public void mo9954c(T t) {
        }

        /* renamed from: d */
        public void mo9940d(T t) {
        }
    }

    /* renamed from: t2.g$e */
    public interface C2705e<T> {
        /* renamed from: a */
        void mo9943a(T t);

        /* renamed from: b */
        T mo9944b();
    }

    /* renamed from: t2.g$f */
    private static class C2706f<T> implements C2703c<T> {

        /* renamed from: a */
        private final Class<T> f10501a;

        /* renamed from: b */
        private volatile SoftReference<T>[] f10502b;

        /* renamed from: c */
        private volatile int f10503c = 0;

        /* renamed from: d */
        private volatile int f10504d;

        C2706f(Class<T> cls, int i) {
            this.f10501a = cls;
            this.f10504d = i;
            this.f10502b = new SoftReference[i];
        }

        /* renamed from: a */
        public Class<T> mo9955a() {
            return this.f10501a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo9956b(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f10504d     // Catch:{ all -> 0x002f }
                int r4 = r4 + r0
                if (r4 > 0) goto L_0x001c
                java.util.HashMap r4 = p117t2.C2699g.f10494b     // Catch:{ all -> 0x002f }
                monitor-enter(r4)     // Catch:{ all -> 0x002f }
                java.util.HashMap r0 = p117t2.C2699g.f10494b     // Catch:{ all -> 0x0019 }
                java.lang.Class r1 = r3.mo9955a()     // Catch:{ all -> 0x0019 }
                r0.remove(r1)     // Catch:{ all -> 0x0019 }
                monitor-exit(r4)     // Catch:{ all -> 0x0019 }
                monitor-exit(r3)
                return
            L_0x0019:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0019 }
                throw r0     // Catch:{ all -> 0x002f }
            L_0x001c:
                r3.f10504d = r4     // Catch:{ all -> 0x002f }
                java.lang.ref.SoftReference<T>[] r0 = r3.f10502b     // Catch:{ all -> 0x002f }
                int r1 = r3.f10503c     // Catch:{ all -> 0x002f }
                int r2 = r0.length     // Catch:{ all -> 0x002f }
                if (r4 <= r2) goto L_0x002d
                java.lang.ref.SoftReference[] r4 = new java.lang.ref.SoftReference[r4]     // Catch:{ all -> 0x002f }
                r2 = 0
                java.lang.System.arraycopy(r0, r2, r4, r2, r1)     // Catch:{ all -> 0x002f }
                r3.f10502b = r4     // Catch:{ all -> 0x002f }
            L_0x002d:
                monitor-exit(r3)
                return
            L_0x002f:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p117t2.C2699g.C2706f.mo9956b(int):void");
        }

        public synchronized T get() {
            int i = this.f10503c;
            SoftReference<T>[] softReferenceArr = this.f10502b;
            while (i != 0) {
                i--;
                SoftReference<T> softReference = softReferenceArr[i];
                if (softReference != null) {
                    T t = softReference.get();
                    softReferenceArr[i] = null;
                    if (t != null) {
                        this.f10503c = i;
                        return t;
                    }
                }
            }
            return null;
        }

        public synchronized boolean put(T t) {
            int i = this.f10503c;
            SoftReference<T>[] softReferenceArr = this.f10502b;
            if (i >= this.f10504d) {
                int i2 = 0;
                while (i2 < i) {
                    SoftReference<T> softReference = softReferenceArr[i2];
                    if (softReference != null) {
                        if (softReference.get() != null) {
                            i2++;
                        }
                    }
                    softReferenceArr[i2] = new SoftReference<>(t);
                    return true;
                }
                return false;
            }
            softReferenceArr[i] = new SoftReference<>(t);
            this.f10503c = i + 1;
            return true;
        }
    }

    /* renamed from: t2.g$g */
    public static class C2707g<T> extends C2701b<T> {
        C2707g(C2704d<T> dVar, int i) {
            super(dVar, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo9943a(Object obj) {
            super.mo9943a(obj);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo9944b() {
            return super.mo9944b();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo9945c() {
            super.mo9945c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final C2703c<T> mo9946d(Class<T> cls, int i) {
            return C2699g.m11292e(cls, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final void mo9947e(C2703c<T> cVar, int i) {
            C2699g.m11291d((C2706f) cVar, i);
        }
    }

    /* renamed from: b */
    public static <T> C2707g<T> m11289b(C2704d<T> dVar, int i) {
        return new C2707g<>(dVar, i);
    }

    /* renamed from: c */
    public static C2705e<StringBuilder> m11290c() {
        return f10495c;
    }

    /* renamed from: d */
    static <T> void m11291d(C2706f<T> fVar, int i) {
        synchronized (f10494b) {
            fVar.mo9956b(-i);
        }
    }

    /* renamed from: e */
    static <T> C2706f<T> m11292e(Class<T> cls, int i) {
        C2706f<T> fVar;
        HashMap<Class<?>, C2706f<?>> hashMap = f10494b;
        synchronized (hashMap) {
            fVar = hashMap.get(cls);
            if (fVar == null) {
                fVar = new C2706f<>(cls, i);
                hashMap.put(cls, fVar);
            } else {
                fVar.mo9956b(i);
            }
        }
        return fVar;
    }
}
