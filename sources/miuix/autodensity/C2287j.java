package miuix.autodensity;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import miuix.core.util.SystemProperties;
import p073l3.C1877a;
import p117t2.C2693a;

/* renamed from: miuix.autodensity.j */
public class C2287j {

    /* renamed from: a */
    private static final String f8691a;

    /* renamed from: b */
    private static final String f8692b;

    /* renamed from: c */
    private static float f8693c;

    /* renamed from: d */
    private static float f8694d;

    static {
        String str = SystemProperties.get("ro.miui.density.primaryscale", (String) null);
        f8691a = str;
        String str2 = SystemProperties.get("ro.miui.density.secondaryscale", (String) null);
        f8692b = str2;
        f8693c = 0.0f;
        f8694d = 0.0f;
        if (!TextUtils.isEmpty(str)) {
            f8693c = m9665c(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            f8694d = m9665c(str2);
        }
        if (f8694d == 0.0f) {
            f8694d = f8693c;
        }
    }

    /* renamed from: a */
    static float m9663a(Context context) {
        float f = f8693c;
        return (!C1877a.f7250c || C2693a.m11234c(context) <= 670) ? f : f8694d;
    }

    /* renamed from: b */
    static boolean m9664b() {
        return f8693c != 0.0f;
    }

    /* renamed from: c */
    private static float m9665c(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.w("AutoDensity", "catch error: sku scale is not a number", e);
            return 0.0f;
        }
    }
}
