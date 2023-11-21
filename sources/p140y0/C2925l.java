package p140y0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: y0.l */
public class C2925l {

    /* renamed from: a */
    private static ThreadPoolExecutor f11113a;

    /* renamed from: b */
    private static int f11114b = (Runtime.getRuntime().availableProcessors() + 1);

    static {
        int i = f11114b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f11113a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static void m12112a(Runnable runnable) {
        try {
            f11113a.execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
