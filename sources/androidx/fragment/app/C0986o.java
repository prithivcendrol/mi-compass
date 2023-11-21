package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p063k.C1774g;

/* renamed from: androidx.fragment.app.o */
public class C0986o {

    /* renamed from: a */
    private static final C1774g<ClassLoader, C1774g<String, Class<?>>> f3357a = new C1774g<>();

    /* renamed from: b */
    static boolean m4091b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4092c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m4092c(ClassLoader classLoader, String str) {
        C1774g<ClassLoader, C1774g<String, Class<?>>> gVar = f3357a;
        C1774g gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new C1774g();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4093d(ClassLoader classLoader, String str) {
        try {
            return m4092c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0896h("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0896h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3412a(ClassLoader classLoader, String str) {
        throw null;
    }
}
