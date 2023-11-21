package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p121u1.C2771j;

/* renamed from: kotlinx.coroutines.scheduling.o */
public final class C1853o {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7140b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7141c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7142d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7143e;

    /* renamed from: a */
    private final AtomicReferenceArray<C1846h> f7144a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C1853o> cls = C1853o.class;
        f7140b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f7141c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f7142d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f7143e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C1846h m7645b(C1853o oVar, C1846h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return oVar.mo6339a(hVar, z);
    }

    /* renamed from: c */
    private final C1846h m7646c(C1846h hVar) {
        boolean z = true;
        if (hVar.f7129e.mo6336b() != 1) {
            z = false;
        }
        if (z) {
            f7143e.incrementAndGet(this);
        }
        if (mo6340e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f7144a.get(i) != null) {
            Thread.yield();
        }
        this.f7144a.lazySet(i, hVar);
        f7141c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m7647d(C1846h hVar) {
        if (hVar != null) {
            boolean z = true;
            if (hVar.f7129e.mo6336b() != 1) {
                z = false;
            }
            if (z) {
                f7143e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final C1846h m7648i() {
        C1846h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f7142d.compareAndSet(this, i, i + 1) && (andSet = this.f7144a.getAndSet(i2, (Object) null)) != null) {
                m7647d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m7649j(C1842d dVar) {
        C1846h i = m7648i();
        if (i == null) {
            return false;
        }
        dVar.mo6283a(i);
        return true;
    }

    /* renamed from: m */
    private final long m7650m(C1853o oVar, boolean z) {
        C1846h hVar;
        do {
            hVar = (C1846h) oVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f7129e.mo6336b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C1850l.f7136e.mo6333a() - hVar.f7128d;
            long j = C1850l.f7132a;
            if (a < j) {
                return j - a;
            }
        } while (!C2771j.m11556a(f7140b, oVar, hVar, (Object) null));
        m7645b(this, hVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C1846h mo6339a(C1846h hVar, boolean z) {
        if (z) {
            return m7646c(hVar);
        }
        C1846h hVar2 = (C1846h) f7140b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m7646c(hVar2);
    }

    /* renamed from: e */
    public final int mo6340e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo6341f() {
        return this.lastScheduledTask != null ? mo6340e() + 1 : mo6340e();
    }

    /* renamed from: g */
    public final void mo6342g(C1842d dVar) {
        C1846h hVar = (C1846h) f7140b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo6283a(hVar);
        }
        do {
        } while (m7649j(dVar));
    }

    /* renamed from: h */
    public final C1846h mo6343h() {
        C1846h hVar = (C1846h) f7140b.getAndSet(this, (Object) null);
        return hVar == null ? m7648i() : hVar;
    }

    /* renamed from: k */
    public final long mo6344k(C1853o oVar) {
        int i = oVar.consumerIndex;
        int i2 = oVar.producerIndex;
        AtomicReferenceArray<C1846h> atomicReferenceArray = oVar.f7144a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (oVar.blockingTasksInBuffer == 0) {
                break;
            }
            C1846h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f7129e.mo6336b() != 1) {
                    z = false;
                }
                if (z && C1852n.m7644a(atomicReferenceArray, i3, hVar, (Object) null)) {
                    f7143e.decrementAndGet(oVar);
                    m7645b(this, hVar, false, 2, (Object) null);
                    return -1;
                }
            }
            i++;
        }
        return m7650m(oVar, true);
    }

    /* renamed from: l */
    public final long mo6345l(C1853o oVar) {
        C1846h i = oVar.m7648i();
        if (i == null) {
            return m7650m(oVar, false);
        }
        m7645b(this, i, false, 2, (Object) null);
        return -1;
    }
}
