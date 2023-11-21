package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.p */
public class C1052p {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3492a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C1031e>>> f3493b = new HashMap();

    /* renamed from: a */
    private static C1031e m4255a(Constructor<? extends C1031e> constructor, Object obj) {
        try {
            return (C1031e) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C1031e> m4256b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m4257c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m4257c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m4258d(Class<?> cls) {
        Integer num = f3492a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m4261g(cls);
        f3492a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m4259e(Class<?> cls) {
        return cls != null && C1047l.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C1046k m4260f(Object obj) {
        boolean z = obj instanceof C1046k;
        boolean z2 = obj instanceof C1020d;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C1020d) obj, (C1046k) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C1020d) obj, (C1046k) null);
        }
        if (z) {
            return (C1046k) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4258d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3493b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4255a((Constructor) list.get(0), obj));
        }
        C1031e[] eVarArr = new C1031e[list.size()];
        for (int i = 0; i < list.size(); i++) {
            eVarArr[i] = m4255a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    /* renamed from: g */
    private static int m4261g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C1031e> b = m4256b(cls);
        if (b != null) {
            f3493b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C1011a.f3444c.mo3758d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4259e(superclass)) {
                if (m4258d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3493b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m4259e(cls2)) {
                    if (m4258d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3493b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3493b.put(cls, arrayList);
            return 2;
        }
    }
}
