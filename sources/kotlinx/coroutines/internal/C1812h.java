package kotlinx.coroutines.internal;

import p029e1.C1523g;
import p121u1.C2763h0;
import p121u1.C2769i0;
import p121u1.C2820x;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C1812h extends C2820x implements Runnable, C2769i0 {

    /* renamed from: e */
    private final C2820x f7060e;

    /* renamed from: f */
    private final int f7061f;

    /* renamed from: g */
    private final /* synthetic */ C2769i0 f7062g;

    /* renamed from: h */
    private final C1819m<Runnable> f7063h;

    /* renamed from: i */
    private final Object f7064i;
    private volatile int runningWorkers;

    public C1812h(C2820x xVar, int i) {
        this.f7060e = xVar;
        this.f7061f = i;
        C2769i0 i0Var = xVar instanceof C2769i0 ? (C2769i0) xVar : null;
        this.f7062g = i0Var == null ? C2763h0.m11470a() : i0Var;
        this.f7063h = new C1819m<>(false);
        this.f7064i = new Object();
    }

    /* renamed from: h */
    private final boolean m7517h(Runnable runnable) {
        this.f7063h.mo6283a(runnable);
        return this.runningWorkers >= this.f7061f;
    }

    /* renamed from: r */
    private final boolean m7518r() {
        synchronized (this.f7064i) {
            if (this.runningWorkers >= this.f7061f) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: c */
    public void mo6270c(C1523g gVar, Runnable runnable) {
        if (!m7517h(runnable) && m7518r()) {
            this.f7060e.mo6270c(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f7064i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f7063h.mo6285c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = p017c1.C1344q.f4517a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            kotlinx.coroutines.internal.m<java.lang.Runnable> r2 = r4.f7063h
            java.lang.Object r2 = r2.mo6286d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            e1.h r3 = p029e1.C1529h.f6170d
            p121u1.C2739a0.m11422a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            u1.x r2 = r4.f7060e
            boolean r2 = r2.mo6297e(r4)
            if (r2 == 0) goto L_0x0002
            u1.x r0 = r4.f7060e
            r0.mo6270c(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f7064i
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.m<java.lang.Runnable> r2 = r4.f7063h     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo6285c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            c1.q r2 = p017c1.C1344q.f4517a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C1812h.run():void");
    }
}
