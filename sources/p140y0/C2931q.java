package p140y0;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: y0.q */
public class C2931q {

    /* renamed from: a */
    private static Object f11117a;

    /* renamed from: b */
    private static Class<?> f11118b;

    /* renamed from: c */
    private static Method f11119c;

    /* renamed from: d */
    private static Method f11120d;

    /* renamed from: e */
    private static Method f11121e;

    /* renamed from: f */
    private static Method f11122f;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f11118b = cls;
            f11117a = cls.newInstance();
            f11119c = f11118b.getMethod("getUDID", new Class[]{Context.class});
            f11120d = f11118b.getMethod("getOAID", new Class[]{Context.class});
            f11121e = f11118b.getMethod("getVAID", new Class[]{Context.class});
            f11122f = f11118b.getMethod("getAAID", new Class[]{Context.class});
        } catch (Exception e) {
            C2933s.m12143e("IdentifierManager", "reflect exception!", e);
        }
    }

    /* renamed from: a */
    private static String m12130a(Context context, Method method) {
        Object obj = f11117a;
        if (obj == null || method == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(obj, new Object[]{context});
            return invoke != null ? (String) invoke : "";
        } catch (Exception e) {
            C2933s.m12143e("IdentifierManager", "invoke exception!", e);
            return "";
        }
    }

    /* renamed from: b */
    public static String m12131b(Context context) {
        return m12130a(context, f11120d);
    }
}
