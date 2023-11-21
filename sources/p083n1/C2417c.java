package p083n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p017c1.C1328c;
import p017c1.C1335j;
import p017c1.C1341n;
import p071l1.C1871a;
import p077m1.C1895a;
import p077m1.C1896b;
import p077m1.C1897c;
import p077m1.C1898d;
import p077m1.C1899e;
import p077m1.C1900f;
import p077m1.C1901g;
import p077m1.C1902h;
import p077m1.C1903i;
import p077m1.C1904j;
import p077m1.C1905k;
import p077m1.C1906l;
import p077m1.C1907m;
import p077m1.C1908n;
import p077m1.C1909o;
import p077m1.C1910p;
import p077m1.C1911q;
import p077m1.C1912r;
import p077m1.C1913s;
import p077m1.C1914t;
import p077m1.C1915u;
import p077m1.C1916v;
import p077m1.C1917w;
import p106r1.C2615b;

/* renamed from: n1.c */
public final class C2417c implements C2615b<Object>, C2416b {

    /* renamed from: b */
    public static final C2418a f9427b = new C2418a((C2420e) null);

    /* renamed from: c */
    private static final Map<Class<? extends C1328c<?>>, Integer> f9428c;

    /* renamed from: d */
    private static final HashMap<String, String> f9429d;

    /* renamed from: e */
    private static final HashMap<String, String> f9430e;

    /* renamed from: f */
    private static final HashMap<String, String> f9431f;

    /* renamed from: g */
    private static final Map<String, String> f9432g;

    /* renamed from: a */
    private final Class<?> f9433a;

    /* renamed from: n1.c$a */
    public static final class C2418a {
        private C2418a() {
        }

        public /* synthetic */ C2418a(C2420e eVar) {
            this();
        }
    }

    static {
        int i = 0;
        List c = C1479i.m6468c(C1895a.class, C1906l.class, C1910p.class, C1911q.class, C1912r.class, C1913s.class, C1914t.class, C1915u.class, C1916v.class, C1917w.class, C1896b.class, C1897c.class, C1898d.class, C1899e.class, C1900f.class, C1901g.class, C1902h.class, C1903i.class, C1904j.class, C1905k.class, C1907m.class, C1908n.class, C1909o.class);
        ArrayList arrayList = new ArrayList(C1480j.m6471f(c, 10));
        for (Object next : c) {
            int i2 = i + 1;
            if (i < 0) {
                C1479i.m6470e();
            }
            arrayList.add(C1341n.m5992a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f9428c = C1496z.m6507g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f9429d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f9430e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C2422g.m10284d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C2422g.m10284d(str, "kotlinName");
            sb.append(C2690m.m11226u(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C1335j a = C1341n.m5992a(sb2, str + ".Companion");
            hashMap3.put(a.mo5188c(), a.mo5189d());
        }
        for (Map.Entry next2 : f9428c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f9431f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C1495y.m6501a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C2690m.m11226u((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f9432g = linkedHashMap;
    }

    public C2417c(Class<?> cls) {
        C2422g.m10285e(cls, "jClass");
        this.f9433a = cls;
    }

    /* renamed from: a */
    public Class<?> mo9320a() {
        return this.f9433a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2417c) && C2422g.m10281a(C1871a.m7788b(this), C1871a.m7788b((C2615b) obj));
    }

    public int hashCode() {
        return C1871a.m7788b(this).hashCode();
    }

    public String toString() {
        return mo9320a().toString() + " (Kotlin reflection is not available)";
    }
}
