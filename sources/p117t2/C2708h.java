package p117t2;

import miuix.core.util.SystemProperties;

/* renamed from: t2.h */
public class C2708h {

    /* renamed from: a */
    private static int f10505a = -1;

    /* renamed from: a */
    public static int m11317a() {
        if (f10505a == -1) {
            f10505a = m11318b();
        }
        return f10505a;
    }

    /* renamed from: b */
    public static int m11318b() {
        return SystemProperties.getInt("ro.miui.ui.version.code", 0);
    }

    /* renamed from: c */
    public static boolean m11319c() {
        return m11317a() >= 15;
    }
}
