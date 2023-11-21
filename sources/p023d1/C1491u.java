package p023d1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p083n1.C2419d;
import p083n1.C2422g;

/* renamed from: d1.u */
public final class C1491u implements Set, Serializable {

    /* renamed from: d */
    public static final C1491u f6112d = new C1491u();

    private C1491u() {
    }

    /* renamed from: a */
    public boolean mo5548a(Void voidR) {
        C2422g.m10285e(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo5551b() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo5548a((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C2422g.m10285e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C1488r.f6109d;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo5551b();
    }

    public Object[] toArray() {
        return C2419d.m10278a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C2422g.m10285e(tArr, "array");
        return C2419d.m10279b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
