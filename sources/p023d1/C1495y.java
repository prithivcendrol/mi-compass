package p023d1;

import java.util.Collections;
import java.util.Map;
import p017c1.C1335j;
import p083n1.C2422g;

/* renamed from: d1.y */
class C1495y extends C1494x {
    /* renamed from: a */
    public static int m6501a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m6502b(C1335j<? extends K, ? extends V> jVar) {
        C2422g.m10285e(jVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jVar.mo5188c(), jVar.mo5189d());
        C2422g.m10284d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m6503c(Map<? extends K, ? extends V> map) {
        C2422g.m10285e(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C2422g.m10284d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
