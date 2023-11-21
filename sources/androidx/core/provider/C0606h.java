package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.C0617a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
class C0606h {

    /* renamed from: androidx.core.provider.h$a */
    private static class C0607a implements ThreadFactory {

        /* renamed from: a */
        private String f2638a;

        /* renamed from: b */
        private int f2639b;

        /* renamed from: androidx.core.provider.h$a$a */
        private static class C0608a extends Thread {

            /* renamed from: d */
            private final int f2640d;

            C0608a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f2640d = i;
            }

            public void run() {
                Process.setThreadPriority(this.f2640d);
                super.run();
            }
        }

        C0607a(String str, int i) {
            this.f2638a = str;
            this.f2639b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C0608a(runnable, this.f2638a, this.f2639b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    private static class C0609b<T> implements Runnable {

        /* renamed from: d */
        private Callable<T> f2641d;

        /* renamed from: e */
        private C0617a<T> f2642e;

        /* renamed from: f */
        private Handler f2643f;

        /* renamed from: androidx.core.provider.h$b$a */
        class C0610a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C0617a f2644d;

            /* renamed from: e */
            final /* synthetic */ Object f2645e;

            C0610a(C0617a aVar, Object obj) {
                this.f2644d = aVar;
                this.f2645e = obj;
            }

            public void run() {
                this.f2644d.accept(this.f2645e);
            }
        }

        C0609b(Handler handler, Callable<T> callable, C0617a<T> aVar) {
            this.f2641d = callable;
            this.f2642e = aVar;
            this.f2643f = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f2641d.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f2643f.post(new C0610a(this.f2642e, t));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m2460a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0607a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m2461b(Executor executor, Callable<T> callable, C0617a<T> aVar) {
        executor.execute(new C0609b(C0591b.m2419a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m2462c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
