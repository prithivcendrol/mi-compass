package p117t2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: t2.o */
public class C2715o {
    /* renamed from: a */
    public static Display m11330a(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w("WindowUtils", "This context is not associated with a display. You should use createDisplayContext() to create a display context to work with windows.");
            }
        }
        return m11334e(context).getDefaultDisplay();
    }

    /* renamed from: b */
    public static void m11331b(Context context, Point point) {
        m11332c(m11334e(context), context, point);
    }

    /* renamed from: c */
    public static void m11332c(WindowManager windowManager, Context context, Point point) {
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            point.x = bounds.width();
            point.y = bounds.height();
            return;
        }
        m11330a(context).getRealSize(point);
    }

    @Deprecated
    /* renamed from: d */
    public static int m11333d(Context context) {
        return m11335f(context).y;
    }

    /* renamed from: e */
    public static WindowManager m11334e(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* renamed from: f */
    public static Point m11335f(Context context) {
        Point point = new Point();
        m11336g(context, point);
        return point;
    }

    /* renamed from: g */
    public static void m11336g(Context context, Point point) {
        m11337h(m11334e(context), context, point);
    }

    /* renamed from: h */
    public static void m11337h(WindowManager windowManager, Context context, Point point) {
        WindowMetrics a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = windowManager.getCurrentWindowMetrics();
        } else if (i == 30) {
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            a = context instanceof Activity ? windowManager.getCurrentWindowMetrics() : windowManager.getMaximumWindowMetrics();
        } else if (C2698f.m11283k(context)) {
            m11330a(context).getSize(point);
            return;
        } else {
            m11330a(context).getRealSize(point);
            return;
        }
        Rect bounds = a.getBounds();
        point.x = bounds.width();
        point.y = bounds.height();
    }

    /* renamed from: i */
    public static boolean m11338i(Configuration configuration, Point point, Point point2) {
        return configuration.toString().contains("mWindowingMode=freeform") && ((((float) point2.x) + 0.0f) / ((float) point.x) <= 0.9f || (((float) point2.y) + 0.0f) / ((float) point.y) <= 0.9f);
    }
}
