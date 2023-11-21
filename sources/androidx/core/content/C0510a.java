package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.C0503j;
import androidx.core.content.res.C0528f;
import androidx.core.p008os.C0574a;
import androidx.core.util.C0619c;
import java.io.File;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
public class C0510a {

    /* renamed from: a */
    private static final Object f2493a = new Object();

    /* renamed from: b */
    private static final Object f2494b = new Object();

    /* renamed from: androidx.core.content.a$a */
    static class C0511a {
        /* renamed from: a */
        static void m2127a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m2128b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    static class C0512b {
        /* renamed from: a */
        static File m2129a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m2130b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m2131c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    static class C0513c {
        /* renamed from: a */
        static int m2132a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m2133b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m2134c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$d */
    static class C0514d {
        /* renamed from: a */
        static Context m2135a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m2136b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m2137c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: a */
    public static int m2120a(Context context, String str) {
        C0619c.m2482c(str, "permission must be non-null");
        return (C0574a.m2384c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C0503j.m2106b(context).mo2560a() ? 0 : -1;
    }

    /* renamed from: b */
    public static Context m2121b(Context context) {
        return C0514d.m2135a(context);
    }

    /* renamed from: c */
    public static int m2122c(Context context, int i) {
        return C0513c.m2132a(context, i);
    }

    /* renamed from: d */
    public static ColorStateList m2123d(Context context, int i) {
        return C0528f.m2200c(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m2124e(Context context, int i) {
        return C0512b.m2130b(context, i);
    }

    /* renamed from: f */
    public static boolean m2125f(Context context, Intent[] intentArr, Bundle bundle) {
        C0511a.m2127a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: g */
    public static void m2126g(Context context, Intent intent, Bundle bundle) {
        C0511a.m2128b(context, intent, bundle);
    }
}
