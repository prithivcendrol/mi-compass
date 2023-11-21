package p140y0;

import android.text.TextUtils;
import android.util.Log;
import p130w0.C2874a;

/* renamed from: y0.s */
public class C2933s {

    /* renamed from: a */
    public static boolean f11129a = false;

    /* renamed from: b */
    public static boolean f11130b = false;

    /* renamed from: c */
    public static boolean f11131c;

    /* renamed from: a */
    public static String m12139a(String str) {
        return "OneTrack-Api-" + str;
    }

    /* renamed from: b */
    public static void m12140b() {
        try {
            String e = C2874a.m11880e();
            String a = C2912b.m12057a("debug.onetrack.log");
            boolean z = true;
            f11129a = !TextUtils.isEmpty(a) && !TextUtils.isEmpty(e) && TextUtils.equals(e, a);
            String a2 = C2912b.m12057a("debug.onetrack.upload");
            f11130b = !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(e) && TextUtils.equals(e, a2);
            String a3 = C2912b.m12057a("debug.onetrack.test");
            if (TextUtils.isEmpty(a3) || TextUtils.isEmpty(e) || !TextUtils.equals(e, a3)) {
                z = false;
            }
            f11131c = z;
        } catch (Exception e2) {
            Log.e("OneTrackSdk", "LogUtil static initializer: " + e2.toString());
        }
        Log.d("OneTrackSdk", "log on: " + f11129a + ", quick upload on: " + f11130b);
    }

    /* renamed from: c */
    public static void m12141c(String str, String str2) {
        if (f11129a) {
            m12142d(m12139a(str), str2, 3);
        }
    }

    /* renamed from: d */
    private static void m12142d(String str, String str2, int i) {
        if (str2 != null) {
            int i2 = 0;
            while (i2 <= str2.length() / 3000) {
                int i3 = i2 * 3000;
                i2++;
                int min = Math.min(str2.length(), i2 * 3000);
                if (i3 < min) {
                    String substring = str2.substring(i3, min);
                    if (i == 0) {
                        Log.e(str, substring);
                    } else if (i == 1) {
                        Log.w(str, substring);
                    } else if (i == 2) {
                        Log.i(str, substring);
                    } else if (i == 3) {
                        Log.d(str, substring);
                    } else if (i == 4) {
                        Log.v(str, substring);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m12143e(String str, String str2, Throwable th) {
        if (f11129a) {
            Log.d(m12139a(str), str2, th);
        }
    }

    /* renamed from: f */
    public static void m12144f(String str, String str2) {
        if (f11129a) {
            m12142d(m12139a(str), str2, 0);
        }
    }

    /* renamed from: g */
    public static void m12145g(String str, String str2, Throwable th) {
        if (f11129a) {
            Log.e(m12139a(str), str2, th);
        }
    }

    /* renamed from: h */
    public static void m12146h(String str, String str2) {
        if (f11129a) {
            m12142d(m12139a(str), str2, 1);
        }
    }

    /* renamed from: i */
    public static void m12147i(String str, String str2, Throwable th) {
        if (f11129a) {
            Log.w(m12139a(str), str2, th);
        }
    }

    /* renamed from: j */
    public static void m12148j(String str, String str2) {
        if (f11129a) {
            m12142d(m12139a(str), str2, 2);
        }
    }
}
