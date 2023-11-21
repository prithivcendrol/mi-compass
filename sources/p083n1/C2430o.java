package p083n1;

import p106r1.C2615b;
import p106r1.C2616c;
import p106r1.C2617d;

/* renamed from: n1.o */
public class C2430o {
    /* renamed from: a */
    public C2615b mo9332a(Class cls) {
        return new C2417c(cls);
    }

    /* renamed from: b */
    public C2616c mo9333b(Class cls, String str) {
        return new C2424i(cls, str);
    }

    /* renamed from: c */
    public C2617d mo9334c(C2425j jVar) {
        return jVar;
    }

    /* renamed from: d */
    public String mo9335d(C2421f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: e */
    public String mo9336e(C2423h hVar) {
        return mo9335d(hVar);
    }
}
