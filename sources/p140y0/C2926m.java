package p140y0;

import android.content.Context;
import android.os.UserManager;

/* renamed from: y0.m */
public class C2926m {
    /* renamed from: a */
    public static Context m12113a(Context context) {
        if (m12115c(context)) {
            C2933s.m12141c("FbeUtil", "getSafeContext return origin ctx");
            return context;
        }
        C2933s.m12141c("FbeUtil", "getSafeContext , create the safe ctx");
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: b */
    public static boolean m12114b(Context context) {
        return !m12115c(context);
    }

    /* renamed from: c */
    private static boolean m12115c(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.isUserUnlocked();
    }
}
