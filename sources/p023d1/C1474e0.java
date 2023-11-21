package p023d1;

import java.util.Set;
import p083n1.C2422g;

/* renamed from: d1.e0 */
class C1474e0 extends C1472d0 {
    /* renamed from: b */
    public static <T> Set<T> m6454b() {
        return C1491u.f6112d;
    }

    /* renamed from: c */
    public static final <T> Set<T> m6455c(Set<? extends T> set) {
        C2422g.m10285e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C1472d0.m6449a(set.iterator().next()) : m6454b();
    }
}
