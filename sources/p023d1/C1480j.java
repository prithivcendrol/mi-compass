package p023d1;

import java.util.Collection;
import p083n1.C2422g;

/* renamed from: d1.j */
class C1480j extends C1479i {
    /* renamed from: f */
    public static <T> int m6471f(Iterable<? extends T> iterable, int i) {
        C2422g.m10285e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
