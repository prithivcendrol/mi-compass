package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p083n1.C2420e;
import p121u1.C2771j;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C1820n<E> {

    /* renamed from: e */
    public static final C1821a f7073e = new C1821a((C2420e) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7074f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f7075g;

    /* renamed from: h */
    public static final C1831w f7076h = new C1831w("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f7077a;

    /* renamed from: b */
    private final boolean f7078b;

    /* renamed from: c */
    private final int f7079c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f7080d;

    /* renamed from: kotlinx.coroutines.internal.n$a */
    public static final class C1821a {
        private C1821a() {
        }

        public /* synthetic */ C1821a(C2420e eVar) {
            this();
        }

        /* renamed from: a */
        public final int mo6293a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo6294b(long j, int i) {
            return mo6296d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo6295c(long j, int i) {
            return mo6296d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo6296d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.n$b */
    public static final class C1822b {

        /* renamed from: a */
        public final int f7081a;

        public C1822b(int i) {
            this.f7081a = i;
        }
    }

    static {
        Class<C1820n> cls = C1820n.class;
        f7074f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f7075g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C1820n(int i, boolean z) {
        this.f7077a = i;
        this.f7078b = z;
        int i2 = i - 1;
        this.f7079c = i2;
        this.f7080d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C1820n<E> m7543b(long j) {
        C1820n<E> nVar = new C1820n<>(this.f7077a * 2, this.f7078b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f7079c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f7080d.get(i3 & i);
                if (obj == null) {
                    obj = new C1822b(i);
                }
                nVar.f7080d.set(nVar.f7079c & i, obj);
                i++;
            } else {
                nVar._state = f7073e.mo6296d(j, 1152921504606846976L);
                return nVar;
            }
        }
    }

    /* renamed from: c */
    private final C1820n<E> m7544c(long j) {
        while (true) {
            C1820n<E> nVar = (C1820n) this._next;
            if (nVar != null) {
                return nVar;
            }
            C2771j.m11556a(f7074f, this, (Object) null, m7543b(j));
        }
    }

    /* renamed from: e */
    private final C1820n<E> m7545e(int i, E e) {
        Object obj = this.f7080d.get(this.f7079c & i);
        if (!(obj instanceof C1822b) || ((C1822b) obj).f7081a != i) {
            return null;
        }
        this.f7080d.set(i & this.f7079c, e);
        return this;
    }

    /* renamed from: h */
    private final long m7546h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f7075g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C1820n<E> m7547k(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return mo6291i();
            }
        } while (!f7075g.compareAndSet(this, j, f7073e.mo6294b(j, i2)));
        this.f7080d.set(i3 & this.f7079c, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x007a, LOOP_START, PHI: r0 
      PHI: (r0v13 kotlinx.coroutines.internal.n) = (r0v12 kotlinx.coroutines.internal.n), (r0v15 kotlinx.coroutines.internal.n) binds: [B:18:0x0060, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6287a(E r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            kotlinx.coroutines.internal.n$a r13 = f7073e
            int r13 = r13.mo6293a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f7079c
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r1 = r12.f7078b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f7080d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L_0x004d
            int r1 = r12.f7077a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L_0x004c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f7075g
            kotlinx.coroutines.internal.n$a r4 = f7073e
            long r4 = r4.mo6295c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f7080d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            kotlinx.coroutines.internal.n r0 = r0.mo6291i()
            kotlinx.coroutines.internal.n r0 = r0.m7545e(r9, r13)
            if (r0 != 0) goto L_0x0068
        L_0x007c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C1820n.mo6287a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo6288d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f7075g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo6289f() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean mo6290g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C1820n<E> mo6291i() {
        return m7544c(m7546h());
    }

    /* renamed from: j */
    public final Object mo6292j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f7076h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f7079c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f7080d.get(i2 & i);
            if (obj == null) {
                if (this.f7078b) {
                    return null;
                }
            } else if (obj instanceof C1822b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f7075g.compareAndSet(this, j, f7073e.mo6294b(j, i3))) {
                    this.f7080d.set(this.f7079c & i, (Object) null);
                    return obj;
                } else if (this.f7078b) {
                    C1820n nVar = this;
                    do {
                        nVar = nVar.m7547k(i, i3);
                    } while (nVar != null);
                    return obj;
                }
            }
        }
    }
}
