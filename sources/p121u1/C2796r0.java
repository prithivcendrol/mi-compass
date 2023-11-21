package p121u1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C1804b0;
import kotlinx.coroutines.internal.C1806c0;
import kotlinx.coroutines.internal.C1820n;
import p029e1.C1523g;
import p083n1.C2422g;

/* renamed from: u1.r0 */
public abstract class C2796r0 extends C2801s0 implements C2769i0 {

    /* renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10595h;

    /* renamed from: i */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10596i;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: u1.r0$a */
    public static abstract class C2797a implements Runnable, Comparable<C2797a>, C2787o0, C1806c0 {

        /* renamed from: d */
        public long f10597d;

        /* renamed from: e */
        private Object f10598e;

        /* renamed from: f */
        private int f10599f;

        /* renamed from: a */
        public void mo6255a(C1804b0<?> b0Var) {
            if (this.f10598e != C2807u0.f10605a) {
                this.f10598e = b0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        public C1804b0<?> mo6256b() {
            Object obj = this.f10598e;
            if (obj instanceof C1804b0) {
                return (C1804b0) obj;
            }
            return null;
        }

        /* renamed from: c */
        public final synchronized void mo10000c() {
            Object obj = this.f10598e;
            if (obj != C2807u0.f10605a) {
                C2798b bVar = obj instanceof C2798b ? (C2798b) obj : null;
                if (bVar != null) {
                    bVar.mo6246g(this);
                }
                this.f10598e = C2807u0.f10605a;
            }
        }

        /* renamed from: d */
        public int compareTo(C2797a aVar) {
            int i = ((this.f10597d - aVar.f10597d) > 0 ? 1 : ((this.f10597d - aVar.f10597d) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo10079f(long r8, p121u1.C2796r0.C2798b r10, p121u1.C2796r0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f10598e     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.w r1 = p121u1.C2807u0.f10605a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.c0 r0 = r10.mo6242b()     // Catch:{ all -> 0x0048 }
                u1.r0$a r0 = (p121u1.C2796r0.C2797a) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.m11635H()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f10600b = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f10597d     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f10600b     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f10597d     // Catch:{ all -> 0x0048 }
                long r3 = r10.f10600b     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L_0x0042
                r7.f10597d = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.mo6241a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p121u1.C2796r0.C2797a.mo10079f(long, u1.r0$b, u1.r0):int");
        }

        /* renamed from: g */
        public final boolean mo10080g(long j) {
            return j - this.f10597d >= 0;
        }

        public int getIndex() {
            return this.f10599f;
        }

        public void setIndex(int i) {
            this.f10599f = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f10597d + ']';
        }
    }

    /* renamed from: u1.r0$b */
    public static final class C2798b extends C1804b0<C2797a> {

        /* renamed from: b */
        public long f10600b;

        public C2798b(long j) {
            this.f10600b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C2796r0> cls2 = C2796r0.class;
        f10595h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f10596i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: D */
    private final void m11632D() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C2771j.m11556a(f10595h, this, (Object) null, C2807u0.f10606b)) {
                    return;
                }
            } else if (obj instanceof C1820n) {
                ((C1820n) obj).mo6288d();
                return;
            } else if (obj != C2807u0.f10606b) {
                C1820n nVar = new C1820n(8, true);
                nVar.mo6287a((Runnable) obj);
                if (C2771j.m11556a(f10595h, this, obj, nVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    private final Runnable m11633E() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C1820n) {
                C1820n nVar = (C1820n) obj;
                Object j = nVar.mo6292j();
                if (j != C1820n.f7076h) {
                    return (Runnable) j;
                }
                C2771j.m11556a(f10595h, this, obj, nVar.mo6291i());
            } else if (obj == C2807u0.f10606b) {
                return null;
            } else {
                if (C2771j.m11556a(f10595h, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: G */
    private final boolean m11634G(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m11635H()) {
                return false;
            }
            if (obj == null) {
                if (C2771j.m11556a(f10595h, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C1820n) {
                C1820n nVar = (C1820n) obj;
                int a = nVar.mo6287a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C2771j.m11556a(f10595h, this, obj, nVar.mo6291i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C2807u0.f10606b) {
                return false;
            } else {
                C1820n nVar2 = new C1820n(8, true);
                nVar2.mo6287a((Runnable) obj);
                nVar2.mo6287a(runnable);
                if (C2771j.m11556a(f10595h, this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    /* renamed from: H */
    public final boolean m11635H() {
        return this._isCompleted;
    }

    /* renamed from: K */
    private final void m11636K() {
        C2746c.m11438a();
        long nanoTime = System.nanoTime();
        while (true) {
            C2798b bVar = (C2798b) this._delayed;
            C2797a aVar = bVar == null ? null : (C2797a) bVar.mo6248i();
            if (aVar != null) {
                mo9995A(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: N */
    private final int m11637N(long j, C2797a aVar) {
        if (m11635H()) {
            return 1;
        }
        C2798b bVar = (C2798b) this._delayed;
        if (bVar == null) {
            C2771j.m11556a(f10596i, this, (Object) null, new C2798b(j));
            Object obj = this._delayed;
            C2422g.m10282b(obj);
            bVar = (C2798b) obj;
        }
        return aVar.mo10079f(j, bVar, this);
    }

    /* renamed from: O */
    private final void m11638O(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: P */
    private final boolean m11639P(C2797a aVar) {
        C2798b bVar = (C2798b) this._delayed;
        return (bVar == null ? null : (C2797a) bVar.mo6245e()) == aVar;
    }

    /* renamed from: F */
    public void mo9996F(Runnable runnable) {
        if (m11634G(runnable)) {
            mo10085B();
        } else {
            C2760g0.f10545j.mo9996F(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo10073I() {
        if (!mo10066x()) {
            return false;
        }
        C2798b bVar = (C2798b) this._delayed;
        if (bVar != null && !bVar.mo6244d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C1820n) {
                return ((C1820n) obj).mo6290g();
            }
            if (obj != C2807u0.f10606b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo10074J() {
        /*
            r9 = this;
            boolean r0 = r9.mo10067y()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            u1.r0$b r0 = (p121u1.C2796r0.C2798b) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.mo6244d()
            if (r3 != 0) goto L_0x0045
            p121u1.C2746c.m11438a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.c0 r5 = r0.mo6242b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
        L_0x0024:
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            u1.r0$a r5 = (p121u1.C2796r0.C2797a) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.mo10080g(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.m11634G(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = r8
        L_0x0035:
            if (r5 == 0) goto L_0x0024
            kotlinx.coroutines.internal.c0 r5 = r0.mo6247h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
            goto L_0x0024
        L_0x003d:
            u1.r0$a r6 = (p121u1.C2796r0.C2797a) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.m11633E()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo10063t()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p121u1.C2796r0.mo10074J():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo10075L() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: M */
    public final void mo10076M(long j, C2797a aVar) {
        int N = m11637N(j, aVar);
        if (N != 0) {
            if (N == 1) {
                mo9995A(j, aVar);
            } else if (N != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m11639P(aVar)) {
            mo10085B();
        }
    }

    /* renamed from: c */
    public final void mo6270c(C1523g gVar, Runnable runnable) {
        mo9996F(runnable);
    }

    public void shutdown() {
        C2799r1.f10601a.mo10083b();
        m11638O(true);
        m11632D();
        do {
        } while (mo10074J() <= 0);
        m11636K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public long mo10063t() {
        if (super.mo10063t() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C1820n)) {
                return obj == C2807u0.f10606b ? Long.MAX_VALUE : 0;
            }
            if (!((C1820n) obj).mo6290g()) {
                return 0;
            }
        }
        C2798b bVar = (C2798b) this._delayed;
        C2797a aVar = bVar == null ? null : (C2797a) bVar.mo6245e();
        if (aVar == null) {
            return Long.MAX_VALUE;
        }
        long j = aVar.f10597d;
        C2746c.m11438a();
        return C2581f.m10985b(j - System.nanoTime(), 0);
    }
}
