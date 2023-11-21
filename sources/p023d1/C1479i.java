package p023d1;

import java.util.List;
import p083n1.C2422g;

/* renamed from: d1.i */
class C1479i extends C1478h {
    /* renamed from: b */
    public static final <T> List<T> m6467b() {
        return C1489s.f6110d;
    }

    /* renamed from: c */
    public static <T> List<T> m6468c(T... tArr) {
        C2422g.m10285e(tArr, "elements");
        return tArr.length > 0 ? C1471d.m6446a(tArr) : m6467b();
    }

    /* renamed from: d */
    public static <T> List<T> m6469d(List<? extends T> list) {
        C2422g.m10285e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C1478h.m6466a(list.get(0)) : m6467b();
    }

    /* renamed from: e */
    public static void m6470e() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
