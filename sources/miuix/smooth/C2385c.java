package miuix.smooth;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import miuix.core.util.SystemProperties;
import p005a4.C0039a;

/* renamed from: miuix.smooth.c */
public class C2385c {

    /* renamed from: a */
    public static Boolean f9267a;

    /* renamed from: b */
    public static boolean f9268b;

    /* renamed from: c */
    private static Boolean f9269c;

    static {
        boolean parseBoolean = Boolean.parseBoolean(SystemProperties.get("persist.sys.support_view_smoothcorner", "false"));
        f9268b = parseBoolean;
        if (!parseBoolean) {
            Log.d("SmoothCornerHelper", "this device is not support system smooth corner");
        }
    }

    /* renamed from: a */
    public static boolean m10110a() {
        if (f9269c == null) {
            try {
                Boolean bool = (Boolean) C0039a.m49j(View.class, (Object) null, "sAppSmoothCornerEnabled");
                f9269c = bool;
                if (bool == null) {
                    f9269c = Boolean.FALSE;
                }
            } catch (Exception e) {
                f9269c = Boolean.FALSE;
                Log.d("SmoothCornerHelper", "isEnableAppSmoothCorner fail " + e);
            }
        }
        return f9269c.booleanValue();
    }

    /* renamed from: b */
    public static void m10111b(Drawable drawable, boolean z) {
        if (f9268b && !m10110a()) {
            Class<Drawable> cls = Drawable.class;
            try {
                C0039a.m52m(cls, drawable, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
            } catch (Exception e) {
                Log.d("SmoothCornerHelper", "setDrawableSmoothCornerEnable fail " + e);
            }
        }
    }

    /* renamed from: c */
    public static void m10112c(View view, boolean z) {
        if (f9268b && !m10110a()) {
            Class<View> cls = View.class;
            try {
                C0039a.m52m(cls, view, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
            } catch (Exception e) {
                Log.d("SmoothCornerHelper", "setViewSmoothCornerEnable fail " + e);
            }
        }
    }
}
