package p083n1;

import java.util.Arrays;
import p017c1.C1343p;

/* renamed from: n1.g */
public class C2422g {
    private C2422g() {
    }

    /* renamed from: a */
    public static boolean m10281a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m10282b(Object obj) {
        if (obj == null) {
            m10291k();
        }
    }

    /* renamed from: c */
    public static void m10283c(Object obj, String str) {
        if (obj == null) {
            m10292l(str);
        }
    }

    /* renamed from: d */
    public static void m10284d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m10288h(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: e */
    public static void m10285e(Object obj, String str) {
        if (obj == null) {
            m10293m(str);
        }
    }

    /* renamed from: f */
    public static int m10286f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: g */
    private static String m10287g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m10288h(T t) {
        return m10289i(t, C2422g.class.getName());
    }

    /* renamed from: i */
    static <T extends Throwable> T m10289i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: j */
    public static String m10290j(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: k */
    public static void m10291k() {
        throw ((NullPointerException) m10288h(new NullPointerException()));
    }

    /* renamed from: l */
    public static void m10292l(String str) {
        throw ((NullPointerException) m10288h(new NullPointerException(str)));
    }

    /* renamed from: m */
    private static void m10293m(String str) {
        throw ((NullPointerException) m10288h(new NullPointerException(m10287g(str))));
    }

    /* renamed from: n */
    public static void m10294n(String str) {
        throw ((C1343p) m10288h(new C1343p(str)));
    }

    /* renamed from: o */
    public static void m10295o(String str) {
        m10294n("lateinit property " + str + " has not been initialized");
    }
}
