package p117t2;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import miuix.core.util.SystemProperties;

/* renamed from: t2.d */
public class C2696d {

    /* renamed from: a */
    public static final boolean f10482a;

    /* renamed from: b */
    private static Method f10483b;

    static {
        boolean parseBoolean = Boolean.parseBoolean(SystemProperties.get("persist.sys.mi_shadow_supported", "false"));
        f10482a = parseBoolean;
        if (!parseBoolean) {
            Log.d("MiShadowHelper", "This device does not support mi shadow!");
        }
    }

    /* renamed from: a */
    private static Object m11260a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            if (f10483b == null) {
                f10483b = obj.getClass().getMethod(str, clsArr);
            }
            return f10483b.invoke(obj, objArr);
        } catch (Exception e) {
            Log.e("MiShadowHelper", "Failed to call method:" + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m11261b(View view) {
        m11262c(view, 0, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: c */
    public static void m11262c(View view, int i, float f, float f2, float f3) {
        m11263d(view, i, f, f2, f3, 1.0f);
    }

    /* renamed from: d */
    public static void m11263d(View view, int i, float f, float f2, float f3, float f4) {
        if (f10482a) {
            Class cls = Float.TYPE;
            m11260a(view, "setMiShadow", new Class[]{Integer.TYPE, cls, cls, cls, cls}, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
        }
    }
}
