package p063k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: k.b */
public final class C1768b<E> implements Collection<E>, Set<E> {

    /* renamed from: g */
    private static Object[] f6809g;

    /* renamed from: h */
    private static int f6810h;

    /* renamed from: i */
    private static Object[] f6811i;

    /* renamed from: j */
    private static int f6812j;

    /* renamed from: k */
    private static final Object f6813k = new Object();

    /* renamed from: l */
    private static final Object f6814l = new Object();

    /* renamed from: d */
    private int[] f6815d;

    /* renamed from: e */
    Object[] f6816e;

    /* renamed from: f */
    int f6817f;

    /* renamed from: k.b$a */
    private class C1769a extends C1771d<E> {
        C1769a() {
            super(C1768b.this.f6817f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo6066a(int i) {
            return C1768b.this.mo6114h(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6067b(int i) {
            C1768b.this.mo6113g(i);
        }
    }

    public C1768b() {
        this(0);
    }

    public C1768b(int i) {
        if (i == 0) {
            this.f6815d = C1770c.f6819a;
            this.f6816e = C1770c.f6821c;
        } else {
            m7347a(i);
        }
        this.f6817f = 0;
    }

    /* renamed from: a */
    private void m7347a(int i) {
        if (i == 8) {
            synchronized (f6814l) {
                Object[] objArr = f6811i;
                if (objArr != null) {
                    try {
                        this.f6816e = objArr;
                        f6811i = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f6815d = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f6812j--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f6811i = null;
                    f6812j = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f6813k) {
                Object[] objArr2 = f6809g;
                if (objArr2 != null) {
                    try {
                        this.f6816e = objArr2;
                        f6809g = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f6815d = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f6810h--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f6809g = null;
                    f6810h = 0;
                }
            }
        }
        this.f6815d = new int[i];
        this.f6816e = new Object[i];
    }

    /* renamed from: b */
    private int m7348b(int i) {
        try {
            return C1770c.m7357a(this.f6815d, this.f6817f, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m7349d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f6814l) {
                if (f6812j < 10) {
                    objArr[0] = f6811i;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f6811i = objArr;
                    f6812j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f6813k) {
                if (f6810h < 10) {
                    objArr[0] = f6809g;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f6809g = objArr;
                    f6810h++;
                }
            }
        }
    }

    /* renamed from: e */
    private int m7350e(Object obj, int i) {
        int i2 = this.f6817f;
        if (i2 == 0) {
            return -1;
        }
        int b = m7348b(i);
        if (b < 0 || obj.equals(this.f6816e[b])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f6815d[i3] == i) {
            if (obj.equals(this.f6816e[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f6815d[i4] == i) {
            if (obj.equals(this.f6816e[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: f */
    private int m7351f() {
        int i = this.f6817f;
        if (i == 0) {
            return -1;
        }
        int b = m7348b(0);
        if (b < 0 || this.f6816e[b] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f6815d[i2] == 0) {
            if (this.f6816e[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f6815d[i3] == 0) {
            if (this.f6816e[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean add(E e) {
        int i;
        int i2;
        int i3 = this.f6817f;
        if (e == null) {
            i2 = m7351f();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m7350e(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        int[] iArr = this.f6815d;
        if (i3 >= iArr.length) {
            int i5 = 4;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f6816e;
            m7347a(i5);
            if (i3 == this.f6817f) {
                int[] iArr2 = this.f6815d;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f6816e, 0, objArr.length);
                }
                m7349d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f6815d;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.f6816e;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.f6817f;
        if (i3 == i8) {
            int[] iArr4 = this.f6815d;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.f6816e[i4] = e;
                this.f6817f = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo6108c(this.f6817f + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public void mo6108c(int i) {
        int i2 = this.f6817f;
        int[] iArr = this.f6815d;
        if (iArr.length < i) {
            Object[] objArr = this.f6816e;
            m7347a(i);
            int i3 = this.f6817f;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f6815d, 0, i3);
                System.arraycopy(objArr, 0, this.f6816e, 0, this.f6817f);
            }
            m7349d(iArr, objArr, this.f6817f);
        }
        if (this.f6817f != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f6817f;
        if (i != 0) {
            int[] iArr = this.f6815d;
            Object[] objArr = this.f6816e;
            this.f6815d = C1770c.f6819a;
            this.f6816e = C1770c.f6821c;
            this.f6817f = 0;
            m7349d(iArr, objArr, i);
        }
        if (this.f6817f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f6817f) {
                try {
                    if (!set.contains(mo6114h(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public E mo6113g(int i) {
        int i2 = this.f6817f;
        E[] eArr = this.f6816e;
        E e = eArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f6815d;
            int i4 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i5 = i + 1;
                    int i6 = i3 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr = this.f6816e;
                    System.arraycopy(objArr, i5, objArr, i, i6);
                }
                this.f6816e[i3] = null;
            } else {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                m7347a(i4);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f6815d, 0, i);
                    System.arraycopy(eArr, 0, this.f6816e, 0, i);
                }
                if (i < i3) {
                    int i7 = i + 1;
                    int i8 = i3 - i;
                    System.arraycopy(iArr, i7, this.f6815d, i, i8);
                    System.arraycopy(eArr, i7, this.f6816e, i, i8);
                }
            }
            if (i2 == this.f6817f) {
                this.f6817f = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    /* renamed from: h */
    public E mo6114h(int i) {
        return this.f6816e[i];
    }

    public int hashCode() {
        int[] iArr = this.f6815d;
        int i = this.f6817f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m7351f() : m7350e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f6817f <= 0;
    }

    public Iterator<E> iterator() {
        return new C1769a();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo6113g(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f6817f - 1; i >= 0; i--) {
            if (!collection.contains(this.f6816e[i])) {
                mo6113g(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f6817f;
    }

    public Object[] toArray() {
        int i = this.f6817f;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6816e, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f6817f) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f6817f);
        }
        System.arraycopy(this.f6816e, 0, tArr, 0, this.f6817f);
        int length = tArr.length;
        int i = this.f6817f;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6817f * 14);
        sb.append('{');
        for (int i = 0; i < this.f6817f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h = mo6114h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
