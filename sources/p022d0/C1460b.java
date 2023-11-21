package p022d0;

import androidx.lifecycle.C1019c0;
import androidx.lifecycle.C1021d0;
import p083n1.C2422g;

/* renamed from: d0.b */
public final class C1460b implements C1021d0.C1025b {

    /* renamed from: b */
    private final C1464f<?>[] f6104b;

    public C1460b(C1464f<?>... fVarArr) {
        C2422g.m10285e(fVarArr, "initializers");
        this.f6104b = fVarArr;
    }

    /* renamed from: b */
    public <T extends C1019c0> T mo3783b(Class<T> cls, C1457a aVar) {
        C2422g.m10285e(cls, "modelClass");
        C2422g.m10285e(aVar, "extras");
        T t = null;
        for (C1464f<?> fVar : this.f6104b) {
            if (C2422g.m10281a(fVar.mo5482a(), cls)) {
                T h = fVar.mo5483b().mo3838h(aVar);
                t = h instanceof C1019c0 ? (C1019c0) h : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
