package p140y0;

import android.util.Log;

/* renamed from: y0.b */
public class C2912b {
    /* renamed from: a */
    public static String m12057a(String str) {
        return m12058b(str, "");
    }

    /* renamed from: b */
    public static String m12058b(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            Log.e(C2933s.m12139a("SystemProperties"), "get e", e);
            return str2;
        }
    }
}
