package p023d1;

import java.util.Collection;
import p083n1.C2422g;

/* renamed from: d1.n */
class C1484n extends C1483m {
    /* renamed from: g */
    public static <T> boolean m6472g(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C2422g.m10285e(collection, "<this>");
        C2422g.m10285e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
