package androidx.core.p008os;

import android.os.Build;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
public class C0574a {
    /* renamed from: a */
    protected static boolean m2382a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m2383b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m2384c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && m2382a("Tiramisu", Build.VERSION.CODENAME));
    }
}
