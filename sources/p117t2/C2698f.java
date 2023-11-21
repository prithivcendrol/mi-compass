package p117t2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import p005a4.C0040b;

/* renamed from: t2.f */
public class C2698f {

    /* renamed from: a */
    private static TypedValue f10492a = new TypedValue();

    /* renamed from: a */
    private static boolean m11273a(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    /* renamed from: b */
    public static int m11274b(float f, float f2) {
        return (int) ((f2 * f) + 0.5f);
    }

    /* renamed from: c */
    public static int m11275c(Context context, float f) {
        return m11274b(((float) context.getResources().getConfiguration().densityDpi) / 160.0f, f);
    }

    /* renamed from: d */
    public static int m11276d(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return (int) TypedValue.complexToFloat(typedValue.data);
    }

    /* renamed from: e */
    public static int m11277e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier > 0) {
            return resources.getInteger(identifier);
        }
        return 0;
    }

    /* renamed from: f */
    private static Point m11278f(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        try {
            Object b = C0040b.m60b(defaultDisplay, C0040b.m61c(defaultDisplay.getClass(), "mDisplayInfo"));
            point.x = ((Integer) C0040b.m60b(b, C0040b.m62d(b.getClass(), "logicalWidth"))).intValue();
            point.y = ((Integer) C0040b.m60b(b, C0040b.m62d(b.getClass(), "logicalHeight"))).intValue();
        } catch (Exception e) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            Log.w("MiuixUtils", "catch error! failed to get physical size", e);
        }
        return point;
    }

    /* renamed from: g */
    public static int m11279g(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: h */
    public static boolean m11280h(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "hide_gesture_line", 0) == 0;
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m11281i(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        Point f = m11278f(context);
        return context.getResources().getConfiguration().toString().contains("mWindowingMode=freeform") && ((((float) point.x) + 0.0f) / ((float) f.x) <= 0.9f || (((float) point.y) + 0.0f) / ((float) f.y) <= 0.9f);
    }

    /* renamed from: j */
    public static boolean m11282j(Context context) {
        return m11277e(context) == 2;
    }

    /* renamed from: k */
    public static boolean m11283k(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return m11273a((Activity) context);
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m11284l(View view) {
        return (view.getWindowSystemUiVisibility() & 512) != 0;
    }

    /* renamed from: m */
    public static boolean m11285m(Context context) {
        return m11280h(context) && m11282j(context) && m11286n(context);
    }

    /* renamed from: n */
    public static boolean m11286n(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "use_gesture_version_three", 0) != 0;
    }

    /* renamed from: o */
    public static int m11287o(float f, float f2) {
        return (int) ((f2 / f) + 0.5f);
    }
}
