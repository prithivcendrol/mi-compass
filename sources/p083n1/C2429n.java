package p083n1;

import p106r1.C2615b;
import p106r1.C2616c;
import p106r1.C2617d;

/* renamed from: n1.n */
public class C2429n {

    /* renamed from: a */
    private static final C2430o f9439a;

    /* renamed from: b */
    private static final C2615b[] f9440b = new C2615b[0];

    static {
        C2430o oVar = null;
        try {
            oVar = (C2430o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oVar == null) {
            oVar = new C2430o();
        }
        f9439a = oVar;
    }

    /* renamed from: a */
    public static C2615b m10300a(Class cls) {
        return f9439a.mo9332a(cls);
    }

    /* renamed from: b */
    public static C2616c m10301b(Class cls) {
        return f9439a.mo9333b(cls, "");
    }

    /* renamed from: c */
    public static C2617d m10302c(C2425j jVar) {
        return f9439a.mo9334c(jVar);
    }

    /* renamed from: d */
    public static String m10303d(C2421f fVar) {
        return f9439a.mo9335d(fVar);
    }

    /* renamed from: e */
    public static String m10304e(C2423h hVar) {
        return f9439a.mo9336e(hVar);
    }
}
