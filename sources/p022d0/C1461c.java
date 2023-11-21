package p022d0;

import androidx.lifecycle.C1019c0;
import androidx.lifecycle.C1021d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p071l1.C1871a;
import p077m1.C1906l;
import p083n1.C2422g;
import p106r1.C2615b;

/* renamed from: d0.c */
public final class C1461c {

    /* renamed from: a */
    private final List<C1464f<?>> f6105a = new ArrayList();

    /* renamed from: a */
    public final <T extends C1019c0> void mo5479a(C2615b<T> bVar, C1906l<? super C1457a, ? extends T> lVar) {
        C2422g.m10285e(bVar, "clazz");
        C2422g.m10285e(lVar, "initializer");
        this.f6105a.add(new C1464f(C1871a.m7787a(bVar), lVar));
    }

    /* renamed from: b */
    public final C1021d0.C1025b mo5480b() {
        Object[] array = this.f6105a.toArray(new C1464f[0]);
        if (array != null) {
            C1464f[] fVarArr = (C1464f[]) array;
            return new C1460b((C1464f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
