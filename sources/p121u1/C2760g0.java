package p121u1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p121u1.C2796r0;

/* renamed from: u1.g0 */
public final class C2760g0 extends C2796r0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j */
    public static final C2760g0 f10545j;

    /* renamed from: k */
    private static final long f10546k;

    static {
        Long l;
        C2760g0 g0Var = new C2760g0();
        f10545j = g0Var;
        C2793q0.m11621v(g0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f10546k = timeUnit.toNanos(l.longValue());
    }

    private C2760g0() {
    }

    /* renamed from: Q */
    private final synchronized void m11455Q() {
        if (m11458T()) {
            debugStatus = 3;
            mo10075L();
            notifyAll();
        }
    }

    /* renamed from: R */
    private final synchronized Thread m11456R() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: S */
    private final boolean m11457S() {
        return debugStatus == 4;
    }

    /* renamed from: T */
    private final boolean m11458T() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: U */
    private final synchronized boolean m11459U() {
        if (m11458T()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: V */
    private final void m11460V() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo9995A(long j, C2796r0.C2797a aVar) {
        m11460V();
    }

    /* renamed from: F */
    public void mo9996F(Runnable runnable) {
        if (m11457S()) {
            m11460V();
        }
        super.mo9996F(runnable);
    }

    public void run() {
        C2799r1.f10601a.mo10084c(this);
        C2746c.m11438a();
        try {
            if (m11459U()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long J = mo10074J();
                    if (J == Long.MAX_VALUE) {
                        C2746c.m11438a();
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f10546k + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m11455Q();
                            C2746c.m11438a();
                            if (!mo10073I()) {
                                mo9992z();
                                return;
                            }
                            return;
                        }
                        J = C2581f.m10987d(J, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (J > 0) {
                        if (m11458T()) {
                            _thread = null;
                            m11455Q();
                            C2746c.m11438a();
                            if (!mo10073I()) {
                                mo9992z();
                                return;
                            }
                            return;
                        }
                        C2746c.m11438a();
                        LockSupport.parkNanos(this, J);
                    }
                }
            }
        } finally {
            _thread = null;
            m11455Q();
            C2746c.m11438a();
            if (!mo10073I()) {
                mo9992z();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Thread mo9992z() {
        Thread thread = _thread;
        return thread == null ? m11456R() : thread;
    }
}
