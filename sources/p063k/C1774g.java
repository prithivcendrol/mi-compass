package p063k;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: k.g */
public class C1774g<K, V> {

    /* renamed from: g */
    static Object[] f6838g;

    /* renamed from: h */
    static int f6839h;

    /* renamed from: i */
    static Object[] f6840i;

    /* renamed from: j */
    static int f6841j;

    /* renamed from: d */
    int[] f6842d;

    /* renamed from: e */
    Object[] f6843e;

    /* renamed from: f */
    int f6844f;

    public C1774g() {
        this.f6842d = C1770c.f6819a;
        this.f6843e = C1770c.f6821c;
        this.f6844f = 0;
    }

    public C1774g(C1774g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo6163j(gVar);
        }
    }

    /* renamed from: a */
    private void m7384a(int i) {
        Class<C1774g> cls = C1774g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f6840i;
                if (objArr != null) {
                    this.f6843e = objArr;
                    f6840i = (Object[]) objArr[0];
                    this.f6842d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f6841j--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f6838g;
                if (objArr2 != null) {
                    this.f6843e = objArr2;
                    f6838g = (Object[]) objArr2[0];
                    this.f6842d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f6839h--;
                    return;
                }
            }
        }
        this.f6842d = new int[i];
        this.f6843e = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m7385b(int[] iArr, int i, int i2) {
        try {
            return C1770c.m7357a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m7386d(int[] iArr, Object[] objArr, int i) {
        Class<C1774g> cls = C1774g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f6841j < 10) {
                    objArr[0] = f6840i;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f6840i = objArr;
                    f6841j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f6839h < 10) {
                    objArr[0] = f6838g;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f6838g = objArr;
                    f6839h++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6149c(int i) {
        int i2 = this.f6844f;
        int[] iArr = this.f6842d;
        if (iArr.length < i) {
            Object[] objArr = this.f6843e;
            m7384a(i);
            if (this.f6844f > 0) {
                System.arraycopy(iArr, 0, this.f6842d, 0, i2);
                System.arraycopy(objArr, 0, this.f6843e, 0, i2 << 1);
            }
            m7386d(iArr, objArr, i2);
        }
        if (this.f6844f != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f6844f;
        if (i > 0) {
            int[] iArr = this.f6842d;
            Object[] objArr = this.f6843e;
            this.f6842d = C1770c.f6819a;
            this.f6843e = C1770c.f6821c;
            this.f6844f = 0;
            m7386d(iArr, objArr, i);
        }
        if (this.f6844f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo6155f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo6159h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo6153e(Object obj, int i) {
        int i2 = this.f6844f;
        if (i2 == 0) {
            return -1;
        }
        int b = m7385b(this.f6842d, i2, i);
        if (b < 0 || obj.equals(this.f6843e[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f6842d[i3] == i) {
            if (obj.equals(this.f6843e[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f6842d[i4] == i) {
            if (obj.equals(this.f6843e[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1774g) {
                C1774g gVar = (C1774g) obj;
                if (size() != gVar.size()) {
                    return false;
                }
                for (int i = 0; i < this.f6844f; i++) {
                    Object i2 = mo6161i(i);
                    Object m = mo6166m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() != map.size()) {
                    return false;
                }
                for (int i3 = 0; i3 < this.f6844f; i3++) {
                    Object i4 = mo6161i(i3);
                    Object m2 = mo6166m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    /* renamed from: f */
    public int mo6155f(Object obj) {
        return obj == null ? mo6156g() : mo6153e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo6156g() {
        int i = this.f6844f;
        if (i == 0) {
            return -1;
        }
        int b = m7385b(this.f6842d, i, 0);
        if (b < 0 || this.f6843e[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f6842d[i2] == 0) {
            if (this.f6843e[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f6842d[i3] == 0) {
            if (this.f6843e[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo6155f(obj);
        return f >= 0 ? this.f6843e[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo6159h(Object obj) {
        int i = this.f6844f * 2;
        Object[] objArr = this.f6843e;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f6842d;
        Object[] objArr = this.f6843e;
        int i = this.f6844f;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo6161i(int i) {
        return this.f6843e[i << 1];
    }

    public boolean isEmpty() {
        return this.f6844f <= 0;
    }

    /* renamed from: j */
    public void mo6163j(C1774g<? extends K, ? extends V> gVar) {
        int i = gVar.f6844f;
        mo6149c(this.f6844f + i);
        if (this.f6844f != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo6161i(i2), gVar.mo6166m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f6842d, 0, this.f6842d, 0, i);
            System.arraycopy(gVar.f6843e, 0, this.f6843e, 0, i << 1);
            this.f6844f = i;
        }
    }

    /* renamed from: k */
    public V mo6164k(int i) {
        V[] vArr = this.f6843e;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f6844f;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f6842d;
            int i5 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr = this.f6843e;
                    System.arraycopy(objArr, i6 << 1, objArr, i2, i7 << 1);
                }
                Object[] objArr2 = this.f6843e;
                int i8 = i4 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                m7384a(i5);
                if (i3 == this.f6844f) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f6842d, 0, i);
                        System.arraycopy(vArr, 0, this.f6843e, 0, i2);
                    }
                    if (i < i4) {
                        int i9 = i + 1;
                        int i10 = i4 - i;
                        System.arraycopy(iArr, i9, this.f6842d, i, i10);
                        System.arraycopy(vArr, i9 << 1, this.f6843e, i2, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i3 == this.f6844f) {
                this.f6844f = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    /* renamed from: l */
    public V mo6165l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f6843e;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo6166m(int i) {
        return this.f6843e[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f6844f;
        if (k == null) {
            i2 = mo6156g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo6153e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f6843e;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f6842d;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f6843e;
            m7384a(i6);
            if (i3 == this.f6844f) {
                int[] iArr2 = this.f6842d;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f6843e, 0, objArr.length);
                }
                m7386d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f6842d;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f6843e;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f6844f - i5) << 1);
        }
        int i8 = this.f6844f;
        if (i3 == i8) {
            int[] iArr4 = this.f6842d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f6843e;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f6844f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo6155f(obj);
        if (f >= 0) {
            return mo6164k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo6155f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo6166m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo6164k(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo6155f(k);
        if (f >= 0) {
            return mo6165l(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo6155f(k);
        if (f < 0) {
            return false;
        }
        V m = mo6166m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo6165l(f, v2);
        return true;
    }

    public int size() {
        return this.f6844f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6844f * 28);
        sb.append('{');
        for (int i = 0; i < this.f6844f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo6161i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo6166m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
