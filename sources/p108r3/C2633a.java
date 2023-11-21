package p108r3;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.ArrayMap;
import java.util.Map;

/* renamed from: r3.a */
public class C2633a {

    /* renamed from: a */
    private static final Map<String, C2634a> f10303a = new ArrayMap();

    /* renamed from: r3.a$a */
    private static class C2634a {

        /* renamed from: a */
        final HandlerThread f10304a;

        /* renamed from: b */
        int f10305b = 1;

        C2634a(String str) {
            HandlerThread handlerThread = new HandlerThread(str);
            this.f10304a = handlerThread;
            handlerThread.start();
        }
    }

    /* renamed from: a */
    public static synchronized Looper m11106a(String str) {
        Looper looper;
        synchronized (C2633a.class) {
            Map<String, C2634a> map = f10303a;
            C2634a aVar = map.get(str);
            if (aVar == null) {
                aVar = new C2634a(str);
                map.put(str, aVar);
            } else {
                aVar.f10305b++;
            }
            looper = aVar.f10304a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public static synchronized void m11107b(String str) {
        synchronized (C2633a.class) {
            Map<String, C2634a> map = f10303a;
            C2634a aVar = map.get(str);
            if (aVar != null) {
                int i = aVar.f10305b - 1;
                aVar.f10305b = i;
                if (i == 0) {
                    map.remove(str);
                    aVar.f10304a.quitSafely();
                }
            }
        }
    }
}
