package p110s0;

import android.text.TextUtils;
import p120u0.C2735f;
import p135x0.C2898b;
import p140y0.C2933s;
import p140y0.C2934t;

/* renamed from: s0.i */
public class C2647i {

    /* renamed from: a */
    private static String f10321a = "ConfigProvider";

    /* renamed from: b */
    private static volatile boolean f10322b = false;

    /* renamed from: a */
    public static int m11143a(int i) {
        int i2;
        if (C2933s.f11130b) {
            C2933s.m12141c(f10321a, "debug upload mode, send events immediately");
            return 0;
        }
        try {
            i2 = C2640c.m11125c().get(Integer.valueOf(i + 1)).intValue();
        } catch (Exception unused) {
            i2 = 60000;
        }
        String str = f10321a;
        C2933s.m12141c(str, "getUploadInterval " + i2);
        return i2;
    }

    /* renamed from: b */
    public static synchronized void m11144b(boolean z) {
        synchronized (C2647i.class) {
            f10322b = z;
        }
    }

    /* renamed from: c */
    public static boolean m11145c() {
        try {
            String[] b = C2735f.m11403a().mo9972b();
            return (!TextUtils.isEmpty(b[0]) && !TextUtils.isEmpty(b[1])) && !C2934t.m12159k(f10321a);
        } catch (Exception e) {
            C2933s.m12143e(f10321a, "ConfigProvider.available", e);
            return false;
        }
    }

    /* renamed from: d */
    public static synchronized boolean m11146d() {
        boolean z;
        synchronized (C2647i.class) {
            z = f10322b;
        }
        return z;
    }

    /* renamed from: e */
    public static boolean m11147e() {
        return C2898b.m11953b();
    }
}
