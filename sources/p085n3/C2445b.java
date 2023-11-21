package p085n3;

import android.util.Log;
import java.util.Locale;

/* renamed from: n3.b */
class C2445b {

    /* renamed from: a */
    private static final boolean f9473a = Log.isLoggable("OverScroll", 3);

    /* renamed from: b */
    private static final boolean f9474b = Log.isLoggable("OverScroll", 2);

    /* renamed from: a */
    public static void m10365a(String str) {
        if (f9473a) {
            Log.d("OverScroll", str);
        }
    }

    /* renamed from: b */
    public static void m10366b(String str, Object... objArr) {
        if (f9473a) {
            Log.d("OverScroll", String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: c */
    public static void m10367c(String str) {
        if (f9474b) {
            Log.v("OverScroll", str);
        }
    }

    /* renamed from: d */
    public static void m10368d(String str, Object... objArr) {
        if (f9474b) {
            Log.v("OverScroll", String.format(Locale.US, str, objArr));
        }
    }
}
