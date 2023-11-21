package p130w0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p140y0.C2926m;

/* renamed from: w0.a */
public class C2874a {

    /* renamed from: a */
    private static Context f10963a = null;

    /* renamed from: b */
    private static Context f10964b = null;

    /* renamed from: c */
    private static int f10965c = 0;

    /* renamed from: d */
    private static String f10966d = null;

    /* renamed from: e */
    private static String f10967e = null;

    /* renamed from: f */
    private static long f10968f = 0;

    /* renamed from: g */
    private static volatile boolean f10969g = false;

    /* renamed from: a */
    public static Context m11876a() {
        if (!C2926m.m12114b(f10963a)) {
            return f10963a;
        }
        Context context = f10964b;
        if (context != null) {
            return context;
        }
        synchronized (C2874a.class) {
            if (f10964b == null) {
                f10964b = C2926m.m12113a(f10963a);
            }
        }
        return f10964b;
    }

    /* renamed from: b */
    public static void m11877b(Context context) {
        if (!f10969g) {
            synchronized (C2874a.class) {
                if (!f10969g) {
                    f10963a = context;
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f10963a.getPackageName(), 0);
                        f10965c = packageInfo.versionCode;
                        f10966d = packageInfo.versionName;
                        f10968f = packageInfo.lastUpdateTime;
                        f10967e = f10963a.getPackageName();
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    f10969g = true;
                }
            }
        }
    }

    /* renamed from: c */
    public static String m11878c() {
        return f10966d;
    }

    /* renamed from: d */
    public static int m11879d() {
        return f10965c;
    }

    /* renamed from: e */
    public static String m11880e() {
        return f10967e;
    }

    /* renamed from: f */
    public static long m11881f() {
        return f10968f;
    }
}
