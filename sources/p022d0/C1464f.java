package p022d0;

import androidx.lifecycle.C1019c0;
import p077m1.C1906l;
import p083n1.C2422g;

/* renamed from: d0.f */
public final class C1464f<T extends C1019c0> {

    /* renamed from: a */
    private final Class<T> f6107a;

    /* renamed from: b */
    private final C1906l<C1457a, T> f6108b;

    public C1464f(Class<T> cls, C1906l<? super C1457a, ? extends T> lVar) {
        C2422g.m10285e(cls, "clazz");
        C2422g.m10285e(lVar, "initializer");
        this.f6107a = cls;
        this.f6108b = lVar;
    }

    /* renamed from: a */
    public final Class<T> mo5482a() {
        return this.f6107a;
    }

    /* renamed from: b */
    public final C1906l<C1457a, T> mo5483b() {
        return this.f6108b;
    }
}
