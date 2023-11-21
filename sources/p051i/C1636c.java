package p051i;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i.c */
public class C1636c extends C1638d {

    /* renamed from: a */
    private final Object f6492a = new Object();

    /* renamed from: b */
    private final ExecutorService f6493b = Executors.newFixedThreadPool(4, new C1637a());

    /* renamed from: c */
    private volatile Handler f6494c;

    /* renamed from: i.c$a */
    class C1637a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f6495a = new AtomicInteger(0);

        C1637a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f6495a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m6934d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo5811a(Runnable runnable) {
        this.f6493b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo5812b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo5813c(Runnable runnable) {
        if (this.f6494c == null) {
            synchronized (this.f6492a) {
                if (this.f6494c == null) {
                    this.f6494c = m6934d(Looper.getMainLooper());
                }
            }
        }
        this.f6494c.post(runnable);
    }
}
