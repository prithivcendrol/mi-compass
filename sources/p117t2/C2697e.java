package p117t2;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import miuix.core.util.SystemProperties;

/* renamed from: t2.e */
public class C2697e {

    /* renamed from: a */
    private static boolean f10484a = true;

    /* renamed from: b */
    private static Boolean f10485b = ((Build.VERSION.SDK_INT < 33 || !f10484a) ? Boolean.FALSE : Boolean.valueOf(SystemProperties.get("persist.sys.background_blur_supported", "false")));

    /* renamed from: c */
    private static Boolean f10486c;

    /* renamed from: d */
    public static Method f10487d;

    /* renamed from: e */
    public static Method f10488e;

    /* renamed from: f */
    public static Method f10489f;

    /* renamed from: g */
    public static Method f10490g;

    /* renamed from: h */
    public static Method f10491h;

    /* renamed from: a */
    public static boolean m11264a(View view, int i, int i2) {
        if (!f10485b.booleanValue() || !m11268e(view.getContext())) {
            return false;
        }
        try {
            if (f10489f == null) {
                Class cls = Integer.TYPE;
                f10489f = View.class.getMethod("addMiBackgroundBlendColor", new Class[]{cls, cls});
            }
            f10489f.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return true;
        } catch (Exception unused) {
            f10489f = null;
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m11265b(View view) {
        if (!f10485b.booleanValue()) {
            return false;
        }
        try {
            if (f10490g == null) {
                f10490g = View.class.getMethod("clearMiBackgroundBlendColor", new Class[0]);
            }
            f10490g.invoke(view, new Object[0]);
            return true;
        } catch (Exception unused) {
            f10490g = null;
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m11266c(View view) {
        if (m11271h(view, 0)) {
            return m11272i(view, 0);
        }
        return false;
    }

    /* renamed from: d */
    public static synchronized void m11267d() {
        synchronized (C2697e.class) {
            f10486c = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f10486c = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002b */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m11268e(android.content.Context r3) {
        /*
            java.lang.Class<t2.e> r0 = p117t2.C2697e.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f10485b     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0037 }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            if (r3 != 0) goto L_0x0012
            monitor-exit(r0)
            return r2
        L_0x0012:
            java.lang.Boolean r1 = f10486c     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002f
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x002b }
            java.lang.String r1 = "background_blur_enable"
            int r3 = android.provider.Settings.Secure.getInt(r3, r1)     // Catch:{ SettingNotFoundException -> 0x002b }
            r1 = 1
            if (r3 != r1) goto L_0x0024
            r2 = r1
        L_0x0024:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ SettingNotFoundException -> 0x002b }
            f10486c = r3     // Catch:{ SettingNotFoundException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            f10486c = r3     // Catch:{ all -> 0x0037 }
        L_0x002f:
            java.lang.Boolean r3 = f10486c     // Catch:{ all -> 0x0037 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)
            return r3
        L_0x0037:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t2.C2697e.m11268e(android.content.Context):boolean");
    }

    /* renamed from: f */
    public static boolean m11269f() {
        return f10485b.booleanValue();
    }

    /* renamed from: g */
    public static boolean m11270g(View view, int i, boolean z) {
        if (!f10485b.booleanValue() || !m11268e(view.getContext())) {
            return false;
        }
        try {
            int i2 = 1;
            if (f10487d == null) {
                f10487d = View.class.getMethod("setMiBackgroundBlurMode", new Class[]{Integer.TYPE});
            }
            if (f10488e == null) {
                f10488e = View.class.getMethod("setMiBackgroundBlurRadius", new Class[]{Integer.TYPE});
            }
            f10487d.invoke(view, new Object[]{1});
            f10488e.invoke(view, new Object[]{Integer.valueOf(i)});
            if (z) {
                i2 = 2;
            }
            return m11272i(view, i2);
        } catch (Exception unused) {
            f10487d = null;
            f10488e = null;
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m11271h(View view, int i) {
        if (!f10485b.booleanValue()) {
            return false;
        }
        try {
            if (f10487d == null) {
                f10487d = View.class.getMethod("setMiBackgroundBlurMode", new Class[]{Integer.TYPE});
            }
            f10487d.invoke(view, new Object[]{Integer.valueOf(i)});
            return true;
        } catch (Exception unused) {
            f10487d = null;
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m11272i(View view, int i) {
        if (!f10485b.booleanValue()) {
            return false;
        }
        try {
            if (f10491h == null) {
                f10491h = View.class.getMethod("setMiViewBlurMode", new Class[]{Integer.TYPE});
            }
            f10491h.invoke(view, new Object[]{Integer.valueOf(i)});
            return true;
        } catch (Exception unused) {
            f10491h = null;
            return false;
        }
    }
}
