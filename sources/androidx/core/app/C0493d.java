package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.d */
public final class C0493d {

    /* renamed from: androidx.core.app.d$a */
    static class C0494a {
        /* renamed from: a */
        static <T> T m2081a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m2082b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m2083c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m2084d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.d$b */
    static class C0495b {
        /* renamed from: a */
        static int m2085a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m2086b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m2087c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m2078a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m2079b(context, str, str2);
        }
        AppOpsManager c = C0495b.m2087c(context);
        int a = C0495b.m2085a(c, str, Binder.getCallingUid(), str2);
        return a != 0 ? a : C0495b.m2085a(c, str, i, C0495b.m2086b(context));
    }

    /* renamed from: b */
    public static int m2079b(Context context, String str, String str2) {
        return C0494a.m2083c((AppOpsManager) C0494a.m2081a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m2080c(String str) {
        return C0494a.m2084d(str);
    }
}
