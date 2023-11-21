package p111s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p083n1.C2422g;

/* renamed from: s1.h */
class C2656h extends C2655g {
    /* renamed from: c */
    public static final <T, C extends Collection<? super T>> C m11152c(C2649b<? extends T> bVar, C c) {
        C2422g.m10285e(bVar, "<this>");
        C2422g.m10285e(c, "destination");
        for (Object add : bVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: d */
    public static <T> List<T> m11153d(C2649b<? extends T> bVar) {
        C2422g.m10285e(bVar, "<this>");
        return C1479i.m6469d(m11154e(bVar));
    }

    /* renamed from: e */
    public static final <T> List<T> m11154e(C2649b<? extends T> bVar) {
        C2422g.m10285e(bVar, "<this>");
        return (List) m11152c(bVar, new ArrayList());
    }
}
