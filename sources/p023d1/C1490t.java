package p023d1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p083n1.C2422g;

/* renamed from: d1.t */
final class C1490t implements Map, Serializable {

    /* renamed from: d */
    public static final C1490t f6111d = new C1490t();

    private C1490t() {
    }

    /* renamed from: a */
    public boolean mo5526a(Void voidR) {
        C2422g.m10285e(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> mo5528c() {
        return C1491u.f6112d;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo5526a((Void) obj);
    }

    /* renamed from: d */
    public Set<Object> mo5532d() {
        return C1491u.f6112d;
    }

    /* renamed from: e */
    public int mo5533e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo5528c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection mo5536f() {
        return C1489s.f6110d;
    }

    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo5532d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo5533e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo5536f();
    }
}
