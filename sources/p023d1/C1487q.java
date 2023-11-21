package p023d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p017c1.C1335j;
import p017c1.C1341n;
import p083n1.C2422g;

/* renamed from: d1.q */
class C1487q extends C1486p {
    /* renamed from: h */
    public static <T> boolean m6473h(Iterable<? extends T> iterable, T t) {
        C2422g.m10285e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : m6474i(iterable, t) >= 0;
    }

    /* renamed from: i */
    public static final <T> int m6474i(Iterable<? extends T> iterable, T t) {
        C2422g.m10285e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C1479i.m6470e();
            }
            if (C2422g.m10281a(t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: j */
    public static final <T, C extends Collection<? super T>> C m6475j(Iterable<? extends T> iterable, C c) {
        C2422g.m10285e(iterable, "<this>");
        C2422g.m10285e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: k */
    public static <T> List<T> m6476k(Iterable<? extends T> iterable) {
        C2422g.m10285e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C1479i.m6469d(m6477l(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1479i.m6467b();
        }
        if (size != 1) {
            return m6478m(collection);
        }
        return C1478h.m6466a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: l */
    public static final <T> List<T> m6477l(Iterable<? extends T> iterable) {
        C2422g.m10285e(iterable, "<this>");
        return iterable instanceof Collection ? m6478m((Collection) iterable) : (List) m6475j(iterable, new ArrayList());
    }

    /* renamed from: m */
    public static final <T> List<T> m6478m(Collection<? extends T> collection) {
        C2422g.m10285e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: n */
    public static <T> Set<T> m6479n(Iterable<? extends T> iterable) {
        C2422g.m10285e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C1474e0.m6455c((Set) m6475j(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1474e0.m6454b();
        }
        if (size != 1) {
            return (Set) m6475j(iterable, new LinkedHashSet(C1495y.m6501a(collection.size())));
        }
        return C1472d0.m6449a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: o */
    public static <T, R> List<C1335j<T, R>> m6480o(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C2422g.m10285e(iterable, "<this>");
        C2422g.m10285e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C1480j.m6471f(iterable, 10), C1480j.m6471f(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C1341n.m5992a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
