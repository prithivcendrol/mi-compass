package androidx.core.p008os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.e */
public final class C0578e {

    /* renamed from: a */
    private boolean f2587a;

    /* renamed from: b */
    private C0580b f2588b;

    /* renamed from: c */
    private Object f2589c;

    /* renamed from: d */
    private boolean f2590d;

    /* renamed from: androidx.core.os.e$a */
    static class C0579a {
        /* renamed from: a */
        static void m2392a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m2393b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.e$b */
    public interface C0580b {
        void onCancel();
    }

    /* renamed from: c */
    private void m2389c() {
        while (this.f2590d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        androidx.core.p008os.C0578e.C0579a.m2392a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.f2590d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.f2590d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2636a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2587a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            r0 = 1
            r3.f2587a = r0     // Catch:{ all -> 0x0036 }
            r3.f2590d = r0     // Catch:{ all -> 0x0036 }
            androidx.core.os.e$b r0 = r3.f2588b     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r3.f2589c     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0020
        L_0x001a:
            if (r1 == 0) goto L_0x002b
            androidx.core.p008os.C0578e.C0579a.m2392a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x002b
        L_0x0020:
            monitor-enter(r3)
            r3.f2590d = r2     // Catch:{ all -> 0x0028 }
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            monitor-enter(r3)
            r3.f2590d = r2     // Catch:{ all -> 0x0033 }
            r3.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p008os.C0578e.mo2636a():void");
    }

    /* renamed from: b */
    public void mo2637b(C0580b bVar) {
        synchronized (this) {
            m2389c();
            if (this.f2588b != bVar) {
                this.f2588b = bVar;
                if (this.f2587a) {
                    if (bVar != null) {
                        bVar.onCancel();
                    }
                }
            }
        }
    }
}
