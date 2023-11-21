package p005a4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a4.a */
public class C0039a {

    /* renamed from: a */
    static HashMap<String, Class<?>> f96a;

    /* renamed from: b */
    private static Map<String, Method> f97b = new HashMap();

    /* renamed from: c */
    private static Map<String, Field> f98c = new HashMap();

    /* renamed from: d */
    private static Map<String, Constructor> f99d = new HashMap();

    /* renamed from: e */
    private static Method f100e = null;

    /* renamed from: f */
    private static Method f101f = null;

    /* renamed from: g */
    private static Method f102g = null;

    /* renamed from: h */
    private static Method f103h = null;

    /* renamed from: i */
    private static Method f104i = null;

    /* renamed from: j */
    private static Method f105j = null;

    /* renamed from: k */
    private static Method f106k = null;

    /* renamed from: l */
    private static Method f107l = null;

    /* renamed from: m */
    private static Method f108m = null;

    static {
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f96a = hashMap;
        hashMap.put("byte", Byte.TYPE);
        f96a.put("short", Short.TYPE);
        f96a.put("int", Integer.TYPE);
        f96a.put("long", Long.TYPE);
        f96a.put("char", Character.TYPE);
        f96a.put("boolean", Boolean.TYPE);
        f96a.put("float", Float.TYPE);
        f96a.put("double", Double.TYPE);
        f96a.put("byte[]", byte[].class);
        f96a.put("short[]", short[].class);
        f96a.put("int[]", int[].class);
        f96a.put("long[]", long[].class);
        f96a.put("char[]", char[].class);
        f96a.put("boolean[]", boolean[].class);
        f96a.put("float[]", float[].class);
        f96a.put("double[]", double[].class);
    }

    /* renamed from: a */
    private static String m40a(Class<?> cls, Class<?>... clsArr) {
        return cls.toString() + "/" + Arrays.toString(clsArr);
    }

    /* renamed from: b */
    private static String m41b(Class<?> cls, String str) {
        return cls.toString() + "/" + str;
    }

    /* renamed from: c */
    private static String m42c(Class<?> cls, String str, Class<?>[] clsArr) {
        return cls.toString() + "/" + str + "/" + Arrays.toString(clsArr);
    }

    /* renamed from: d */
    public static Constructor m43d(Class<?> cls, Class<?>... clsArr) {
        String a = m40a(cls, clsArr);
        Constructor constructor = f99d.get(a);
        if (constructor != null) {
            return constructor;
        }
        Constructor f = m45f(cls, clsArr);
        m56q(f, true);
        f99d.put(a, f);
        return f;
    }

    /* renamed from: e */
    public static <T> T m44e(Class<?> cls, Class<?>[] clsArr, Object... objArr) {
        Constructor d = m43d(cls, clsArr);
        if (d == null) {
            return null;
        }
        return m55p(d, objArr);
    }

    /* renamed from: f */
    private static Constructor m45f(Object obj, Class<?>... clsArr) {
        if (f104i == null) {
            f104i = Class.class.getMethod("getDeclaredConstructor", new Class[]{Class[].class});
        }
        return (Constructor) f104i.invoke(obj, new Object[]{clsArr});
    }

    /* renamed from: g */
    private static Field m46g(Object obj, String str) {
        if (f101f == null) {
            f101f = Class.class.getMethod("getDeclaredField", new Class[]{String.class});
        }
        return (Field) f101f.invoke(obj, new Object[]{str});
    }

    /* renamed from: h */
    private static Method m47h(Object obj, String str, Class<?>... clsArr) {
        if (f102g == null) {
            f102g = Class.class.getMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
        }
        return (Method) f102g.invoke(obj, new Object[]{str, clsArr});
    }

    /* renamed from: i */
    public static Field m48i(Class<?> cls, String str) {
        String b = m41b(cls, str);
        Field field = f98c.get(b);
        if (field != null) {
            return field;
        }
        Field g = m46g(cls, str);
        m56q(g, true);
        f98c.put(b, g);
        return g;
    }

    /* renamed from: j */
    public static <T> T m49j(Class<?> cls, Object obj, String str) {
        Field i = m48i(cls, str);
        if (i == null) {
            return null;
        }
        return m50k(i, obj);
    }

    /* renamed from: k */
    private static Object m50k(Object obj, Object obj2) {
        if (f108m == null) {
            f108m = Field.class.getMethod("get", new Class[]{Object.class});
        }
        return f108m.invoke(obj, new Object[]{obj2});
    }

    /* renamed from: l */
    public static Method m51l(Class<?> cls, String str, Class<?>... clsArr) {
        String c = m42c(cls, str, clsArr);
        Method method = f97b.get(c);
        if (method != null) {
            return method;
        }
        Method h = m47h(cls, str, clsArr);
        m56q(h, true);
        f97b.put(c, h);
        return h;
    }

    /* renamed from: m */
    public static void m52m(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        Method l = m51l(cls, str, clsArr);
        if (l != null) {
            m53n(l, obj, objArr);
        }
    }

    /* renamed from: n */
    private static Object m53n(Object obj, Object... objArr) {
        if (f100e == null) {
            f100e = Method.class.getMethod("invoke", new Class[]{Object.class, Object[].class});
        }
        return f100e.invoke(obj, objArr);
    }

    /* renamed from: o */
    public static <T> T m54o(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        Method l = m51l(cls, str, clsArr);
        if (l == null) {
            return null;
        }
        return m53n(l, obj, objArr);
    }

    /* renamed from: p */
    private static <T> T m55p(Object obj, Object... objArr) {
        if (f105j == null) {
            f105j = Constructor.class.getMethod("newInstance", new Class[]{Object[].class});
        }
        return f105j.invoke(obj, new Object[]{objArr});
    }

    /* renamed from: q */
    private static void m56q(Object obj, boolean z) {
        if (f103h == null) {
            f103h = AccessibleObject.class.getMethod("setAccessible", new Class[]{Boolean.TYPE});
        }
        f103h.invoke(obj, new Object[]{Boolean.valueOf(z)});
    }

    /* renamed from: r */
    public static void m57r(Class<?> cls, Object obj, String str, Object obj2) {
        Field i = m48i(cls, str);
        if (i != null) {
            m58s(i, obj, obj2);
        }
    }

    /* renamed from: s */
    private static void m58s(Object obj, Object obj2, Object obj3) {
        Class<Object> cls = Object.class;
        if (f107l == null) {
            f107l = Field.class.getMethod("set", new Class[]{cls, cls});
        }
        f107l.invoke(obj, new Object[]{obj2, obj3});
    }
}
