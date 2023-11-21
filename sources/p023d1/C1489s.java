package p023d1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p083n1.C2419d;
import p083n1.C2422g;

/* renamed from: d1.s */
public final class C1489s implements List, Serializable, RandomAccess {

    /* renamed from: d */
    public static final C1489s f6110d = new C1489s();

    private C1489s() {
    }

    /* renamed from: a */
    public boolean mo5495a(Void voidR) {
        C2422g.m10285e(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    /* renamed from: c */
    public int mo5501c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo5495a((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C2422g.m10285e(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public int mo5505d(Void voidR) {
        C2422g.m10285e(voidR, "element");
        return -1;
    }

    /* renamed from: e */
    public int mo5506e(Void voidR) {
        C2422g.m10285e(voidR, "element");
        return -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo5505d((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C1488r.f6109d;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo5506e((Void) obj);
    }

    public ListIterator listIterator() {
        return C1488r.f6109d;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C1488r.f6109d;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo5501c();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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
