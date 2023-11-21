package p023d1;

import java.util.Iterator;

/* renamed from: d1.v */
public abstract class C1492v implements Iterator<Integer> {
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
