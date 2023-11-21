package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.y */
final /* synthetic */ class C1833y {

    /* renamed from: a */
    private static final int f7091a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m7586a() {
        return f7091a;
    }

    /* renamed from: b */
    public static final String m7587b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
