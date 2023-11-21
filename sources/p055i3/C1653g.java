package p055i3;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: i3.g */
public class C1653g {
    /* renamed from: a */
    public static Object m6974a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e) {
            Log.e("ReflectUtil", "Failed to call method:" + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public static <T> T m6975b(Class<?> cls, Class<T> cls2, String str, Class<?>[] clsArr, Object... objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, objArr);
        } catch (Exception e) {
            Log.e("ReflectUtil", "Failed to call static method:" + str, e);
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m6976c(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            Log.e("ReflectUtil", "Cant find class " + str, e);
            return null;
        }
    }
}
