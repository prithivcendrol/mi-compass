package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.a */
final class C1011a {

    /* renamed from: c */
    static C1011a f3444c = new C1011a();

    /* renamed from: a */
    private final Map<Class<?>, C1012a> f3445a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3446b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a */
    static class C1012a {

        /* renamed from: a */
        final Map<C1035g.C1037b, List<C1013b>> f3447a = new HashMap();

        /* renamed from: b */
        final Map<C1013b, C1035g.C1037b> f3448b;

        C1012a(Map<C1013b, C1035g.C1037b> map) {
            this.f3448b = map;
            for (Map.Entry next : map.entrySet()) {
                C1035g.C1037b bVar = (C1035g.C1037b) next.getValue();
                List list = this.f3447a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3447a.put(bVar, list);
                }
                list.add((C1013b) next.getKey());
            }
        }

        /* renamed from: b */
        private static void m4187b(List<C1013b> list, C1048m mVar, C1035g.C1037b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3760a(mVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3759a(C1048m mVar, C1035g.C1037b bVar, Object obj) {
            m4187b(this.f3447a.get(bVar), mVar, bVar, obj);
            m4187b(this.f3447a.get(C1035g.C1037b.ON_ANY), mVar, bVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.a$b */
    static final class C1013b {

        /* renamed from: a */
        final int f3449a;

        /* renamed from: b */
        final Method f3450b;

        C1013b(int i, Method method) {
            this.f3449a = i;
            this.f3450b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3760a(C1048m mVar, C1035g.C1037b bVar, Object obj) {
            try {
                int i = this.f3449a;
                if (i == 0) {
                    this.f3450b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3450b.invoke(obj, new Object[]{mVar});
                } else if (i == 2) {
                    this.f3450b.invoke(obj, new Object[]{mVar, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1013b)) {
                return false;
            }
            C1013b bVar = (C1013b) obj;
            return this.f3449a == bVar.f3449a && this.f3450b.getName().equals(bVar.f3450b.getName());
        }

        public int hashCode() {
            return (this.f3449a * 31) + this.f3450b.getName().hashCode();
        }
    }

    C1011a() {
    }

    /* renamed from: a */
    private C1012a m4182a(Class<?> cls, Method[] methodArr) {
        int i;
        C1012a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo3757c(superclass)) == null)) {
            hashMap.putAll(c.f3448b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3757c(c2).f3448b.entrySet()) {
                m4184e(hashMap, (C1013b) next.getKey(), (C1035g.C1037b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4183b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1056t tVar = (C1056t) method.getAnnotation(C1056t.class);
            if (tVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1048m.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1035g.C1037b value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C1035g.C1037b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1035g.C1037b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4184e(hashMap, new C1013b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1012a aVar = new C1012a(hashMap);
        this.f3445a.put(cls, aVar);
        this.f3446b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m4183b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m4184e(Map<C1013b, C1035g.C1037b> map, C1013b bVar, C1035g.C1037b bVar2, Class<?> cls) {
        C1035g.C1037b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f3450b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1012a mo3757c(Class<?> cls) {
        C1012a aVar = this.f3445a.get(cls);
        return aVar != null ? aVar : m4182a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3758d(Class<?> cls) {
        Boolean bool = this.f3446b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m4183b(cls);
        for (Method annotation : b) {
            if (((C1056t) annotation.getAnnotation(C1056t.class)) != null) {
                m4182a(cls, b);
                return true;
            }
        }
        this.f3446b.put(cls, Boolean.FALSE);
        return false;
    }
}
