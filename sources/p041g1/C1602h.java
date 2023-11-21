package p041g1;

import java.lang.reflect.Method;
import p083n1.C2422g;

/* renamed from: g1.h */
final class C1602h {

    /* renamed from: a */
    public static final C1602h f6380a = new C1602h();

    /* renamed from: b */
    private static final C1603a f6381b = new C1603a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C1603a f6382c;

    /* renamed from: g1.h$a */
    private static final class C1603a {

        /* renamed from: a */
        public final Method f6383a;

        /* renamed from: b */
        public final Method f6384b;

        /* renamed from: c */
        public final Method f6385c;

        public C1603a(Method method, Method method2, Method method3) {
            this.f6383a = method;
            this.f6384b = method2;
            this.f6385c = method3;
        }
    }

    private C1602h() {
    }

    /* renamed from: a */
    private final C1603a m6839a(C1595a aVar) {
        try {
            C1603a aVar2 = new C1603a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f6382c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C1603a aVar3 = f6381b;
            f6382c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo5756b(C1595a aVar) {
        C2422g.m10285e(aVar, "continuation");
        C1603a aVar2 = f6382c;
        if (aVar2 == null) {
            aVar2 = m6839a(aVar);
        }
        if (aVar2 == f6381b) {
            return null;
        }
        Method method = aVar2.f6383a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f6384b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f6385c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
