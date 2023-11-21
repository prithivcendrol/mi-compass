package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.b */
class C0846b {

    /* renamed from: androidx.emoji2.text.b$a */
    static class C0847a {
        /* renamed from: a */
        public static Handler m3370a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    static ThreadPoolExecutor m3367b(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C0845a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Thread m3368c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    static Handler m3369d() {
        return Build.VERSION.SDK_INT >= 28 ? C0847a.m3370a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
