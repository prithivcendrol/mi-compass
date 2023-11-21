package androidx.core.p008os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.i */
public final class C0586i {

    /* renamed from: a */
    private static long f2595a;

    /* renamed from: b */
    private static Method f2596b;

    /* renamed from: c */
    private static Method f2597c;

    /* renamed from: d */
    private static Method f2598d;

    /* renamed from: e */
    private static Method f2599e;

    /* renamed from: androidx.core.os.i$a */
    static class C0587a {
        /* renamed from: a */
        static void m2414a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m2415b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2595a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f2596b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f2597c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f2598d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f2599e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m2412a(String str) {
        C0587a.m2414a(str);
    }

    /* renamed from: b */
    public static void m2413b() {
        C0587a.m2415b();
    }
}
