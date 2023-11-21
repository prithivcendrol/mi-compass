package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.c */
public class C0619c {

    /* renamed from: androidx.core.util.c$a */
    static class C0620a {
        /* renamed from: a */
        static boolean m2483a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m2484b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m2480a(Object obj, Object obj2) {
        return C0620a.m2483a(obj, obj2);
    }

    /* renamed from: b */
    public static int m2481b(Object... objArr) {
        return C0620a.m2484b(objArr);
    }

    /* renamed from: c */
    public static <T> T m2482c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
