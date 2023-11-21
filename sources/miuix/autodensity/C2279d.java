package miuix.autodensity;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.IWindowManager;
import android.view.WindowManager;
import android.view.WindowManagerGlobal;
import miuix.core.util.SystemProperties;
import p073l3.C1877a;
import p117t2.C2693a;
import p133w3.C2890a;

/* renamed from: miuix.autodensity.d */
public class C2279d {

    /* renamed from: e */
    private static C2279d f8677e;

    /* renamed from: a */
    private C2278c f8678a;

    /* renamed from: b */
    private C2278c f8679b;

    /* renamed from: c */
    private Point f8680c = new Point();

    /* renamed from: d */
    private boolean f8681d = true;

    private C2279d() {
    }

    /* renamed from: a */
    private float m9630a(Context context) {
        boolean equals = "dagu".equals(Build.DEVICE);
        float i = (m9637i(context) / 9.3f) * 1.06f;
        return equals ? Math.max(1.0f, i) : Math.max(1.0f, Math.min(i, 1.15f));
    }

    /* renamed from: b */
    private float m9631b(Context context) {
        float j = m9638j(context);
        if (j < 2.7f) {
            return j / 2.8f;
        }
        return 1.0f;
    }

    /* renamed from: d */
    private float m9632d(Context context) {
        int i;
        int c = mo8626c(0);
        C2277b.m9629c("default dpi: " + c);
        if (c == -1) {
            return 1.0f;
        }
        try {
            i = C2890a.m11913a(context.getContentResolver(), "display_density_forced");
        } catch (Settings.SettingNotFoundException e) {
            C2277b.m9629c("Exception: " + e);
            i = c;
        }
        float f = (((float) i) * 1.0f) / ((float) c);
        C2277b.m9629c("accessibility dpi: " + i + ", delta: " + f);
        return f;
    }

    /* renamed from: e */
    private float m9633e() {
        if (C2286i.m9662b()) {
            return C2277b.m9627a();
        }
        return 0.0f;
    }

    /* renamed from: f */
    private int m9634f(int i) {
        try {
            return WindowManagerGlobal.getWindowManagerService().getInitialDisplayDensity(i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: g */
    private float m9635g(Context context) {
        float f;
        if (C2287j.m9664b()) {
            f = C2287j.m9663a(context);
        } else {
            if (C1877a.f7250c) {
                if ("cetus".contentEquals(Build.DEVICE)) {
                    f = 1.0f;
                }
            } else if (C1877a.f7249b) {
                f = m9630a(context);
            }
            f = m9631b(context);
        }
        C2277b.m9629c("getDeviceScale " + f);
        return f;
    }

    /* renamed from: h */
    public static C2279d m9636h() {
        if (f8677e == null) {
            f8677e = new C2279d();
        }
        return f8677e;
    }

    /* renamed from: i */
    private float m9637i(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float max = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float min = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.f8680c;
        Point point2 = this.f8680c;
        return Math.max(((float) Math.min(point2.x, point2.y)) / min, ((float) Math.max(point.x, point.y)) / max);
    }

    /* renamed from: j */
    private float m9638j(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float max = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float min = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.f8680c;
        Point point2 = this.f8680c;
        return Math.min(((float) Math.min(point2.x, point2.y)) / min, ((float) Math.max(point.x, point.y)) / max);
    }

    /* renamed from: m */
    private WindowManager m9639m(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    /* renamed from: q */
    private float m9640q(Context context) {
        float e = m9633e();
        int i = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i < 0) {
            this.f8681d = false;
            Log.d("AutoDensity", "disable auto density in debug mode");
        } else {
            this.f8681d = true;
        }
        if (i <= 0) {
            e = m9635g(context);
        }
        return e * m9632d(context);
    }

    /* renamed from: r */
    private int m9641r(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        C2277b.m9629c("physical size: " + this.f8680c + ", display xdpi: " + displayMetrics.xdpi + ", ydpi: " + displayMetrics.ydpi);
        float max = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float min = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.f8680c;
        float max2 = (float) Math.max(point.x, point.y);
        Point point2 = this.f8680c;
        float min2 = (float) Math.min(point2.x, point2.y);
        float f = max2 / max;
        float f2 = min2 / min;
        double sqrt = Math.sqrt(Math.pow((double) f, 2.0d) + Math.pow((double) f2, 2.0d));
        int sqrt2 = (int) (Math.sqrt(Math.pow((double) max2, 2.0d) + Math.pow((double) min2, 2.0d)) / sqrt);
        C2277b.m9629c("Screen inches : " + sqrt + ", ppi:" + sqrt2 + ",physicalX:" + f + ",physicalY:" + f2 + ",min size inches: " + (Math.min(f2, f) / 2.8f) + ", real point:" + this.f8680c);
        return sqrt2;
    }

    /* renamed from: s */
    private void m9642s(Context context) {
        m9639m(context).getDefaultDisplay().getRealSize(this.f8680c);
    }

    /* renamed from: c */
    public int mo8626c(int i) {
        try {
            String str = SystemProperties.get("persist.sys.miui_resolution", (String) null);
            if (TextUtils.isEmpty(str)) {
                return m9634f(i);
            }
            Point point = new Point();
            IWindowManager windowManagerService = WindowManagerGlobal.getWindowManagerService();
            windowManagerService.getInitialDisplaySize(0, point);
            return Math.round((((float) (windowManagerService.getInitialDisplayDensity(i) * Integer.valueOf(str.split(",")[0]).intValue())) * 1.0f) / ((float) point.x));
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: k */
    public C2278c mo8627k() {
        return this.f8678a;
    }

    /* renamed from: l */
    public C2278c mo8628l() {
        return this.f8679b;
    }

    /* renamed from: n */
    public void mo8629n(Context context) {
        this.f8679b = new C2278c(context.getResources().getConfiguration());
        mo8631p(context, context.getResources().getConfiguration());
    }

    /* renamed from: o */
    public boolean mo8630o() {
        return this.f8681d;
    }

    /* renamed from: p */
    public void mo8631p(Context context, Configuration configuration) {
        C2278c cVar = new C2278c(configuration);
        this.f8678a = cVar;
        C2693a.m11250s(cVar);
        m9642s(context);
        int r = (int) (((float) m9641r(context)) * 1.1398964f * m9640q(context));
        float f = (((float) r) * 1.0f) / ((float) configuration.densityDpi);
        C2278c cVar2 = this.f8679b;
        cVar2.f9351a = r;
        cVar2.f9352b = r;
        C2278c cVar3 = this.f8678a;
        cVar2.f9353c = cVar3.f9353c * f;
        cVar2.f9354d = cVar3.f9354d * f;
        cVar2.f9355e = cVar3.f9355e * f;
        C2277b.m9629c("Config changed. Raw config(" + this.f8678a + ") TargetConfig(" + this.f8679b + ")");
    }
}
