package p083n1;

import p017c1.C1328c;
import p077m1.C1895a;
import p077m1.C1896b;
import p077m1.C1897c;
import p077m1.C1898d;
import p077m1.C1899e;
import p077m1.C1900f;
import p077m1.C1901g;
import p077m1.C1902h;
import p077m1.C1903i;
import p077m1.C1904j;
import p077m1.C1905k;
import p077m1.C1906l;
import p077m1.C1907m;
import p077m1.C1908n;
import p077m1.C1909o;
import p077m1.C1910p;
import p077m1.C1911q;
import p077m1.C1912r;
import p077m1.C1913s;
import p077m1.C1914t;
import p077m1.C1915u;
import p077m1.C1916v;
import p077m1.C1917w;

/* renamed from: n1.p */
public class C2431p {
    /* renamed from: a */
    public static Object m10310a(Object obj, int i) {
        if (obj != null && !m10312c(obj, i)) {
            m10315f(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: b */
    public static int m10311b(Object obj) {
        if (obj instanceof C2421f) {
            return ((C2421f) obj).mo5757d();
        }
        if (obj instanceof C1895a) {
            return 0;
        }
        if (obj instanceof C1906l) {
            return 1;
        }
        if (obj instanceof C1910p) {
            return 2;
        }
        if (obj instanceof C1911q) {
            return 3;
        }
        if (obj instanceof C1912r) {
            return 4;
        }
        if (obj instanceof C1913s) {
            return 5;
        }
        if (obj instanceof C1914t) {
            return 6;
        }
        if (obj instanceof C1915u) {
            return 7;
        }
        if (obj instanceof C1916v) {
            return 8;
        }
        if (obj instanceof C1917w) {
            return 9;
        }
        if (obj instanceof C1896b) {
            return 10;
        }
        if (obj instanceof C1897c) {
            return 11;
        }
        if (obj instanceof C1898d) {
            return 12;
        }
        if (obj instanceof C1899e) {
            return 13;
        }
        if (obj instanceof C1900f) {
            return 14;
        }
        if (obj instanceof C1901g) {
            return 15;
        }
        if (obj instanceof C1902h) {
            return 16;
        }
        if (obj instanceof C1903i) {
            return 17;
        }
        if (obj instanceof C1904j) {
            return 18;
        }
        if (obj instanceof C1905k) {
            return 19;
        }
        if (obj instanceof C1907m) {
            return 20;
        }
        if (obj instanceof C1908n) {
            return 21;
        }
        return obj instanceof C1909o ? 22 : -1;
    }

    /* renamed from: c */
    public static boolean m10312c(Object obj, int i) {
        return (obj instanceof C1328c) && m10311b(obj) == i;
    }

    /* renamed from: d */
    private static <T extends Throwable> T m10313d(T t) {
        return C2422g.m10289i(t, C2431p.class.getName());
    }

    /* renamed from: e */
    public static ClassCastException m10314e(ClassCastException classCastException) {
        throw ((ClassCastException) m10313d(classCastException));
    }

    /* renamed from: f */
    public static void m10315f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m10316g(name + " cannot be cast to " + str);
    }

    /* renamed from: g */
    public static void m10316g(String str) {
        throw m10314e(new ClassCastException(str));
    }
}
