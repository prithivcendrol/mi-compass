package p073l3;

import miuix.core.util.SystemProperties;

/* renamed from: l3.a */
public class C1877a {

    /* renamed from: a */
    public static final boolean f7248a = SystemProperties.get("ro.product.mod_device", "").contains("_global");

    /* renamed from: b */
    public static final boolean f7249b = m7803b();

    /* renamed from: c */
    public static final boolean f7250c = m7802a();

    /* renamed from: d */
    public static final boolean f7251d;

    static {
        boolean z = false;
        if (SystemProperties.getInt("ro.debuggable", 0) == 1) {
            z = true;
        }
        f7251d = z;
    }

    /* renamed from: a */
    private static boolean m7802a() {
        return SystemProperties.getInt("persist.sys.muiltdisplay_type", 1) == 2;
    }

    /* renamed from: b */
    private static boolean m7803b() {
        return SystemProperties.get("ro.build.characteristics").contains("tablet");
    }
}
