package p063k;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: k.d */
abstract class C1771d<T> implements Iterator<T> {

    /* renamed from: d */
    private int f6822d;

    /* renamed from: e */
    private int f6823e;

    /* renamed from: f */
    private boolean f6824f;

    C1771d(int i) {
        this.f6822d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo6066a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6067b(int i);

    public final boolean hasNext() {
        return this.f6823e < this.f6822d;
    }

    public T next() {
        if (hasNext()) {
            T a = mo6066a(this.f6823e);
            this.f6823e++;
            this.f6824f = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.f6824f) {
            int i = this.f6823e - 1;
            this.f6823e = i;
            mo6067b(i);
            this.f6822d--;
            this.f6824f = false;
            return;
        }
        throw new IllegalStateException();
    }
}
