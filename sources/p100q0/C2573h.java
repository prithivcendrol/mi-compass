package p100q0;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import p130w0.C2874a;

/* renamed from: q0.h */
public class C2573h {

    /* renamed from: b */
    private static volatile C2573h f10108b = null;

    /* renamed from: c */
    private static String f10109c = "com.xiaomi.onetrack.otdebugger.FloatWindowService";

    /* renamed from: a */
    private ConcurrentHashMap<Long, C2561b> f10110a = new ConcurrentHashMap<>();

    private C2573h() {
    }

    /* renamed from: a */
    public static C2573h m10970a() {
        if (f10108b == null) {
            synchronized (C2573h.class) {
                if (f10108b == null) {
                    f10108b = new C2573h();
                }
            }
        }
        return f10108b;
    }

    /* renamed from: b */
    public void mo9831b(C2561b bVar) {
        this.f10110a.put(Long.valueOf(System.currentTimeMillis()), bVar);
    }

    /* renamed from: c */
    public void mo9832c() {
        try {
            C2874a.m11876a().startService(new Intent(C2874a.m11876a(), Class.forName(f10109c)));
        } catch (Exception e) {
            Log.d("startDebugger", e.getMessage());
        }
    }
}
