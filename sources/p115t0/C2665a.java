package p115t0;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: t0.a */
public class C2665a {

    /* renamed from: a */
    private static String f10442a = "onetrack_db";

    /* renamed from: b */
    private static Handler f10443b;

    /* renamed from: a */
    private static void m11156a() {
        if (f10443b == null) {
            synchronized (C2665a.class) {
                if (f10443b == null) {
                    HandlerThread handlerThread = new HandlerThread(f10442a);
                    handlerThread.start();
                    f10443b = new Handler(handlerThread.getLooper());
                }
            }
        }
    }

    /* renamed from: b */
    public static void m11157b(Runnable runnable) {
        m11156a();
        f10443b.post(runnable);
    }
}
