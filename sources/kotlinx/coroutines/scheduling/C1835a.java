package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.C1829u;
import kotlinx.coroutines.internal.C1831w;
import p017c1.C1344q;
import p083n1.C2420e;
import p083n1.C2422g;
import p089o1.C2492c;
import p121u1.C2746c;
import p121u1.C2757f0;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final class C1835a implements Executor, Closeable {

    /* renamed from: k */
    public static final C1836a f7092k = new C1836a((C2420e) null);

    /* renamed from: l */
    private static final /* synthetic */ AtomicLongFieldUpdater f7093l = AtomicLongFieldUpdater.newUpdater(C1835a.class, "parkedWorkersStack");

    /* renamed from: m */
    static final /* synthetic */ AtomicLongFieldUpdater f7094m = AtomicLongFieldUpdater.newUpdater(C1835a.class, "controlState");

    /* renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7095n = AtomicIntegerFieldUpdater.newUpdater(C1835a.class, "_isTerminated");

    /* renamed from: o */
    public static final C1831w f7096o = new C1831w("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f7097d;

    /* renamed from: e */
    public final int f7098e;

    /* renamed from: f */
    public final long f7099f;

    /* renamed from: g */
    public final String f7100g;

    /* renamed from: h */
    public final C1842d f7101h;

    /* renamed from: i */
    public final C1842d f7102i;

    /* renamed from: j */
    public final C1829u<C1838c> f7103j;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    public static final class C1836a {
        private C1836a() {
        }

        public /* synthetic */ C1836a(C2420e eVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    public /* synthetic */ class C1837b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7104a;

        static {
            int[] iArr = new int[C1839d.values().length];
            iArr[C1839d.PARKING.ordinal()] = 1;
            iArr[C1839d.BLOCKING.ordinal()] = 2;
            iArr[C1839d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C1839d.DORMANT.ordinal()] = 4;
            iArr[C1839d.TERMINATED.ordinal()] = 5;
            f7104a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    public final class C1838c extends Thread {

        /* renamed from: k */
        static final /* synthetic */ AtomicIntegerFieldUpdater f7105k = AtomicIntegerFieldUpdater.newUpdater(C1838c.class, "workerCtl");

        /* renamed from: d */
        public final C1853o f7106d;

        /* renamed from: e */
        public C1839d f7107e;

        /* renamed from: f */
        private long f7108f;

        /* renamed from: g */
        private long f7109g;

        /* renamed from: h */
        private int f7110h;

        /* renamed from: i */
        public boolean f7111i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private C1838c() {
            setDaemon(true);
            this.f7106d = new C1853o();
            this.f7107e = C1839d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C1835a.f7096o;
            this.f7110h = C2492c.f9701d.mo9618b();
        }

        public C1838c(int i) {
            this();
            mo6326o(i);
        }

        /* renamed from: b */
        private final void m7612b(int i) {
            if (i != 0) {
                C1835a.f7094m.addAndGet(C1835a.this, -2097152);
                if (this.f7107e != C1839d.TERMINATED) {
                    this.f7107e = C1839d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m7613c(int i) {
            if (i != 0 && mo6329s(C1839d.BLOCKING)) {
                C1835a.this.mo6320n();
            }
        }

        /* renamed from: d */
        private final void m7614d(C1846h hVar) {
            int b = hVar.f7129e.mo6336b();
            m7616i(b);
            m7613c(b);
            C1835a.this.mo6318k(hVar);
            m7612b(b);
        }

        /* renamed from: e */
        private final C1846h m7615e(boolean z) {
            C1846h m;
            C1846h m2;
            if (z) {
                boolean z2 = mo6325k(C1835a.this.f7097d * 2) == 0;
                if (z2 && (m2 = m7619m()) != null) {
                    return m2;
                }
                C1846h h = this.f7106d.mo6343h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m7619m()) != null) {
                    return m;
                }
            } else {
                C1846h m3 = m7619m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m7623t(false);
        }

        /* renamed from: i */
        private final void m7616i(int i) {
            this.f7108f = 0;
            if (this.f7107e == C1839d.PARKING) {
                this.f7107e = C1839d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m7617j() {
            return this.nextParkedWorker != C1835a.f7096o;
        }

        /* renamed from: l */
        private final void m7618l() {
            if (this.f7108f == 0) {
                this.f7108f = System.nanoTime() + C1835a.this.f7099f;
            }
            LockSupport.parkNanos(C1835a.this.f7099f);
            if (System.nanoTime() - this.f7108f >= 0) {
                this.f7108f = 0;
                m7624u();
            }
        }

        /* renamed from: m */
        private final C1846h m7619m() {
            C1842d dVar;
            if (mo6325k(2) == 0) {
                C1846h hVar = (C1846h) C1835a.this.f7101h.mo6286d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = C1835a.this.f7102i;
            } else {
                C1846h hVar2 = (C1846h) C1835a.this.f7102i.mo6286d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = C1835a.this.f7101h;
            }
            return (C1846h) dVar.mo6286d();
        }

        /* renamed from: n */
        private final void m7620n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C1835a.this.isTerminated() && this.f7107e != C1839d.TERMINATED) {
                    C1846h f = mo6322f(this.f7111i);
                    if (f != null) {
                        this.f7109g = 0;
                        m7614d(f);
                    } else {
                        this.f7111i = false;
                        if (this.f7109g == 0) {
                            m7622r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo6329s(C1839d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f7109g);
                            this.f7109g = 0;
                        }
                    }
                }
            }
            mo6329s(C1839d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m7621q() {
            boolean z;
            if (this.f7107e != C1839d.CPU_ACQUIRED) {
                C1835a aVar = C1835a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C1835a.f7094m.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f7107e = C1839d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m7622r() {
            if (!m7617j()) {
                C1835a.this.mo6315i(this);
                return;
            }
            this.workerCtl = -1;
            while (m7617j() && this.workerCtl == -1 && !C1835a.this.isTerminated() && this.f7107e != C1839d.TERMINATED) {
                mo6329s(C1839d.PARKING);
                Thread.interrupted();
                m7618l();
            }
        }

        /* renamed from: t */
        private final C1846h m7623t(boolean z) {
            int i = (int) (C1835a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo6325k(i);
            C1835a aVar = C1835a.this;
            int i2 = 0;
            long j = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                k++;
                if (k > i) {
                    k = 1;
                }
                C1838c b = aVar.f7103j.mo6305b(k);
                if (!(b == null || b == this)) {
                    C1853o oVar = this.f7106d;
                    C1853o oVar2 = b.f7106d;
                    long k2 = z ? oVar.mo6344k(oVar2) : oVar.mo6345l(oVar2);
                    if (k2 == -1) {
                        return this.f7106d.mo6343h();
                    }
                    if (k2 > 0) {
                        j = Math.min(j, k2);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f7109g = j;
            return null;
        }

        /* renamed from: u */
        private final void m7624u() {
            C1835a aVar = C1835a.this;
            synchronized (aVar.f7103j) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f7097d) {
                        if (f7105k.compareAndSet(this, -1, 1)) {
                            int g = mo6323g();
                            mo6326o(0);
                            aVar.mo6317j(this, g, 0);
                            int andDecrement = (int) (C1835a.f7094m.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != g) {
                                C1838c b = aVar.f7103j.mo6305b(andDecrement);
                                C2422g.m10282b(b);
                                C1838c cVar = b;
                                aVar.f7103j.mo6306c(g, cVar);
                                cVar.mo6326o(g);
                                aVar.mo6317j(cVar, andDecrement, g);
                            }
                            aVar.f7103j.mo6306c(andDecrement, null);
                            C1344q qVar = C1344q.f4517a;
                            this.f7107e = C1839d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final C1846h mo6322f(boolean z) {
            C1846h hVar;
            if (m7621q()) {
                return m7615e(z);
            }
            if (!z || (hVar = this.f7106d.mo6343h()) == null) {
                hVar = (C1846h) C1835a.this.f7102i.mo6286d();
            }
            return hVar == null ? m7623t(true) : hVar;
        }

        /* renamed from: g */
        public final int mo6323g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo6324h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int mo6325k(int i) {
            int i2 = this.f7110h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f7110h = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: o */
        public final void mo6326o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1835a.this.f7100g);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo6327p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m7620n();
        }

        /* renamed from: s */
        public final boolean mo6329s(C1839d dVar) {
            C1839d dVar2 = this.f7107e;
            boolean z = dVar2 == C1839d.CPU_ACQUIRED;
            if (z) {
                C1835a.f7094m.addAndGet(C1835a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f7107e = dVar;
            }
            return z;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    public enum C1839d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C1835a(int i, int i2, long j, String str) {
        this.f7097d = i;
        this.f7098e = i2;
        this.f7099f = j;
        this.f7100g = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f7101h = new C1842d();
                        this.f7102i = new C1842d();
                        this.parkedWorkersStack = 0;
                        this.f7103j = new C1829u<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: a */
    private final boolean m7593a(C1846h hVar) {
        boolean z = true;
        if (hVar.f7129e.mo6336b() != 1) {
            z = false;
        }
        return (z ? this.f7102i : this.f7101h).mo6283a(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m7594b() {
        /*
            r10 = this;
            kotlinx.coroutines.internal.u<kotlinx.coroutines.scheduling.a$c> r0 = r10.f7103j
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x007a }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r5 - r1
            r2 = 0
            int r1 = p101q1.C2581f.m10984a(r1, r2)     // Catch:{ all -> 0x007a }
            int r6 = r10.f7097d     // Catch:{ all -> 0x007a }
            if (r1 < r6) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r6 = r10.f7098e     // Catch:{ all -> 0x007a }
            if (r5 < r6) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x007a }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0043
            kotlinx.coroutines.internal.u<kotlinx.coroutines.scheduling.a$c> r7 = r10.f7103j     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.mo6305b(r5)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = r6
            goto L_0x0044
        L_0x0043:
            r7 = r2
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.scheduling.a$c r7 = new kotlinx.coroutines.scheduling.a$c     // Catch:{ all -> 0x007a }
            r7.<init>(r5)     // Catch:{ all -> 0x007a }
            kotlinx.coroutines.internal.u<kotlinx.coroutines.scheduling.a$c> r8 = r10.f7103j     // Catch:{ all -> 0x007a }
            r8.mo6306c(r5, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f7094m     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x007a }
            if (r5 != r3) goto L_0x005b
            r2 = r6
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r6
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.C1835a.m7594b():int");
    }

    /* renamed from: d */
    private final C1838c m7595d() {
        Thread currentThread = Thread.currentThread();
        C1838c cVar = currentThread instanceof C1838c ? (C1838c) currentThread : null;
        if (cVar != null && C2422g.m10281a(C1835a.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ void m7596f(C1835a aVar, Runnable runnable, C1847i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C1850l.f7137f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo6313e(runnable, iVar, z);
    }

    /* renamed from: g */
    private final int m7597g(C1838c cVar) {
        int g;
        do {
            Object h = cVar.mo6324h();
            if (h == f7096o) {
                return -1;
            }
            if (h == null) {
                return 0;
            }
            cVar = (C1838c) h;
            g = cVar.mo6323g();
        } while (g == 0);
        return g;
    }

    /* renamed from: h */
    private final C1838c m7598h() {
        while (true) {
            long j = this.parkedWorkersStack;
            C1838c b = this.f7103j.mo6305b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int g = m7597g(b);
            if (g >= 0) {
                if (f7093l.compareAndSet(this, j, ((long) g) | j2)) {
                    b.mo6327p(f7096o);
                    return b;
                }
            }
        }
    }

    /* renamed from: m */
    private final void m7599m(boolean z) {
        long addAndGet = f7094m.addAndGet(this, 2097152);
        if (!z && !m7603r() && !m7601p(addAndGet)) {
            m7603r();
        }
    }

    /* renamed from: o */
    private final C1846h m7600o(C1838c cVar, C1846h hVar, boolean z) {
        if (cVar == null || cVar.f7107e == C1839d.TERMINATED) {
            return hVar;
        }
        if (hVar.f7129e.mo6336b() == 0 && cVar.f7107e == C1839d.BLOCKING) {
            return hVar;
        }
        cVar.f7111i = true;
        return cVar.f7106d.mo6339a(hVar, z);
    }

    /* renamed from: p */
    private final boolean m7601p(long j) {
        if (C2581f.m10984a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f7097d) {
            int b = m7594b();
            if (b == 1 && this.f7097d > 1) {
                m7594b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    static /* synthetic */ boolean m7602q(C1835a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m7601p(j);
    }

    /* renamed from: r */
    private final boolean m7603r() {
        C1838c h;
        do {
            h = m7598h();
            if (h == null) {
                return false;
            }
        } while (!C1838c.f7105k.compareAndSet(h, -1, 0));
        LockSupport.unpark(h);
        return true;
    }

    /* renamed from: c */
    public final C1846h mo6311c(Runnable runnable, C1847i iVar) {
        long a = C1850l.f7136e.mo6333a();
        if (!(runnable instanceof C1846h)) {
            return new C1849k(runnable, a, iVar);
        }
        C1846h hVar = (C1846h) runnable;
        hVar.f7128d = a;
        hVar.f7129e = iVar;
        return hVar;
    }

    public void close() {
        mo6319l(10000);
    }

    /* renamed from: e */
    public final void mo6313e(Runnable runnable, C1847i iVar, boolean z) {
        C2746c.m11438a();
        C1846h c = mo6311c(runnable, iVar);
        C1838c d = m7595d();
        C1846h o = m7600o(d, c, z);
        if (o == null || m7593a(o)) {
            boolean z2 = z && d != null;
            if (c.f7129e.mo6336b() != 0) {
                m7599m(z2);
            } else if (!z2) {
                mo6320n();
            }
        } else {
            throw new RejectedExecutionException(C2422g.m10290j(this.f7100g, " was terminated"));
        }
    }

    public void execute(Runnable runnable) {
        m7596f(this, runnable, (C1847i) null, false, 6, (Object) null);
    }

    /* renamed from: i */
    public final boolean mo6315i(C1838c cVar) {
        long j;
        int g;
        if (cVar.mo6324h() != f7096o) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.mo6323g();
            cVar.mo6327p(this.f7103j.mo6305b((int) (2097151 & j)));
        } while (!f7093l.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) g)));
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: j */
    public final void mo6317j(C1838c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m7597g(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f7093l.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo6318k(C1846h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C2746c.m11438a();
            throw th;
        }
        C2746c.m11438a();
    }

    /* renamed from: l */
    public final void mo6319l(long j) {
        int i;
        if (f7095n.compareAndSet(this, 0, 1)) {
            C1838c d = m7595d();
            synchronized (this.f7103j) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C1838c b = this.f7103j.mo6305b(i2);
                    C2422g.m10282b(b);
                    C1838c cVar = b;
                    if (cVar != d) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f7106d.mo6342g(this.f7102i);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f7102i.mo6284b();
            this.f7101h.mo6284b();
            while (true) {
                C1846h f = d == null ? null : d.mo6322f(true);
                if (f == null && (f = (C1846h) this.f7101h.mo6286d()) == null && (f = (C1846h) this.f7102i.mo6286d()) == null) {
                    break;
                }
                mo6318k(f);
            }
            if (d != null) {
                d.mo6329s(C1839d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: n */
    public final void mo6320n() {
        if (!m7603r() && !m7602q(this, 0, 1, (Object) null)) {
            m7603r();
        }
    }

    public String toString() {
        char c;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a = this.f7103j.mo6304a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            C1838c b = this.f7103j.mo6305b(i6);
            if (b != null) {
                int f = b.f7106d.mo6341f();
                int i8 = C1837b.f7104a[b.f7107e.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'b';
                    } else if (i8 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'c';
                    } else if (i8 == 4) {
                        i4++;
                        if (f > 0) {
                            sb = new StringBuilder();
                            sb.append(f);
                            c = 'd';
                        }
                    } else if (i8 == 5) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f7100g + '@' + C2757f0.m11451b(this) + "[Pool Size {core = " + this.f7097d + ", max = " + this.f7098e + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f7101h.mo6285c() + ", global blocking queue size = " + this.f7102i.mo6285c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f7097d - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
