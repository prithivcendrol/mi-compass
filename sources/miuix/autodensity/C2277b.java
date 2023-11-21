package miuix.autodensity;

import android.text.TextUtils;
import android.util.Log;
import miuix.core.util.SystemProperties;

/* renamed from: miuix.autodensity.b */
public class C2277b {

    /* renamed from: a */
    private static volatile float f8675a;

    /* renamed from: b */
    private static String f8676b;

    /* renamed from: a */
    public static float m9627a() {
        return f8675a;
    }

    /* renamed from: b */
    public static void m9628b() {
        String str;
        try {
            str = SystemProperties.get("log.tag.autodensity.debug.enable");
            f8676b = str;
            if (str == null) {
                str = "0";
            }
        } catch (Exception e) {
            Log.i("AutoDensity", "can not access property log.tag.autodensity.enable, undebugable", e);
            str = "";
        }
        Log.d("AutoDensity", "autodensity debugEnable = " + str);
        try {
            f8675a = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f8675a = 0.0f;
        }
    }

    /* renamed from: c */
    public static void m9629c(String str) {
        if (f8675a >= 0.0f && !TextUtils.isEmpty(f8676b)) {
            Log.d("AutoDensity", str);
        }
    }
}
