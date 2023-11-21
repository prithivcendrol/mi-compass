package p023d1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p017c1.C1335j;
import p083n1.C2422g;

/* renamed from: d1.z */
class C1496z extends C1495y {
    /* renamed from: d */
    public static <K, V> Map<K, V> m6504d() {
        C1490t tVar = C1490t.f6111d;
        C2422g.m10283c(tVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return tVar;
    }

    /* renamed from: e */
    public static final <K, V> Map<K, V> m6505e(Map<K, ? extends V> map) {
        C2422g.m10285e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C1495y.m6503c(map) : m6504d();
    }

    /* renamed from: f */
    public static final <K, V> void m6506f(Map<? super K, ? super V> map, Iterable<? extends C1335j<? extends K, ? extends V>> iterable) {
        C2422g.m10285e(map, "<this>");
        C2422g.m10285e(iterable, "pairs");
        for (C1335j jVar : iterable) {
            map.put(jVar.mo5186a(), jVar.mo5187b());
        }
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m6507g(Iterable<? extends C1335j<? extends K, ? extends V>> iterable) {
        C2422g.m10285e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m6505e(m6508h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m6504d();
        }
        if (size != 1) {
            return m6508h(iterable, new LinkedHashMap(C1495y.m6501a(collection.size())));
        }
        return C1495y.m6502b((C1335j) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m6508h(Iterable<? extends C1335j<? extends K, ? extends V>> iterable, M m) {
        C2422g.m10285e(iterable, "<this>");
        C2422g.m10285e(m, "destination");
        m6506f(m, iterable);
        return m;
    }

    /* renamed from: i */
    public static <K, V> Map<K, V> m6509i(Map<? extends K, ? extends V> map) {
        C2422g.m10285e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m6510j(map) : C1495y.m6503c(map) : m6504d();
    }

    /* renamed from: j */
    public static final <K, V> Map<K, V> m6510j(Map<? extends K, ? extends V> map) {
        C2422g.m10285e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
