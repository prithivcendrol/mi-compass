package p043g3;

import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* renamed from: g3.c */
public class C1610c {

    /* renamed from: a */
    private static HashMap<Class<?>, C1611a<?>> f6390a = new HashMap<>();

    /* renamed from: g3.c$a */
    private static class C1611a<T extends C1609b> {

        /* renamed from: a */
        private Constructor<T> f6391a;

        /* renamed from: b */
        private T[] f6392b;

        /* renamed from: c */
        private int f6393c = 0;

        private C1611a(Constructor<T> constructor, T[] tArr) {
            this.f6391a = constructor;
            this.f6392b = tArr;
        }

        /* renamed from: a */
        private T m6852a() {
            try {
                return (C1609b) this.f6391a.newInstance(new Object[0]);
            } catch (Exception e) {
                Log.e("MessageFactory", "Fail to construct new instance of class: " + this.f6391a.getDeclaringClass().getName(), e);
                return null;
            }
        }

        /* renamed from: b */
        public static <T extends C1609b> C1611a<T> m6853b(Class<T> cls, int i) {
            try {
                return new C1611a<>(cls.getConstructor(new Class[0]), (C1609b[]) Array.newInstance(cls, i));
            } catch (NoSuchMethodException unused) {
                throw new IllegalArgumentException("Class " + cls.getName() + " must have a public empty constructor");
            }
        }

        /* renamed from: c */
        public synchronized T mo5765c() {
            int i = this.f6393c;
            if (i > 0) {
                int i2 = i - 1;
                this.f6393c = i2;
                T t = this.f6392b[i2];
                t.mo5760b();
                return t;
            }
            return m6852a();
        }

        /* renamed from: d */
        public synchronized void mo5766d(T t) {
            int i = this.f6393c;
            T[] tArr = this.f6392b;
            if (i < tArr.length) {
                tArr[i] = t;
                this.f6393c = i + 1;
            }
        }
    }

    /* renamed from: a */
    public static <T extends C1609b> T m6850a(Class<T> cls) {
        C1611a<T> aVar = f6390a.get(cls);
        if (aVar == null) {
            aVar = C1611a.m6853b(cls, 10);
            f6390a.put(cls, aVar);
        }
        return aVar.mo5765c();
    }

    /* renamed from: b */
    static <T extends C1609b> void m6851b(T t) {
        C1611a aVar = f6390a.get(t.getClass());
        if (aVar != null) {
            aVar.mo5766d(t);
        }
    }
}
