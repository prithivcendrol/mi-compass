package p052i0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i0.b */
public final class C1640b {

    /* renamed from: a */
    private static long f6497a;

    /* renamed from: b */
    private static Method f6498b;

    /* renamed from: a */
    public static void m6942a(String str) {
        C1641c.m6947a(str);
    }

    /* renamed from: b */
    public static void m6943b() {
        C1641c.m6948b();
    }

    /* renamed from: c */
    private static void m6944c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m6945d() {
        try {
            if (f6498b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m6946e();
    }

    /* renamed from: e */
    private static boolean m6946e() {
        try {
            if (f6498b == null) {
                f6497a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f6498b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f6498b.invoke((Object) null, new Object[]{Long.valueOf(f6497a)})).booleanValue();
        } catch (Exception e) {
            m6944c("isTagEnabled", e);
            return false;
        }
    }
}
