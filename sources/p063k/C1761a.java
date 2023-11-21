package p063k;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: k.a */
public class C1761a<K, V> extends C1774g<K, V> implements Map<K, V> {

    /* renamed from: k */
    C1761a<K, V>.a f6797k;

    /* renamed from: l */
    C1761a<K, V>.c f6798l;

    /* renamed from: m */
    C1761a<K, V>.e f6799m;

    /* renamed from: k.a$a */
    final class C1762a extends AbstractSet<Map.Entry<K, V>> {
        C1762a() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1765d();
        }

        public int size() {
            return C1761a.this.f6844f;
        }
    }

    /* renamed from: k.a$b */
    final class C1763b extends C1771d<K> {
        C1763b() {
            super(C1761a.this.f6844f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public K mo6066a(int i) {
            return C1761a.this.mo6161i(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6067b(int i) {
            C1761a.this.mo6164k(i);
        }
    }

    /* renamed from: k.a$c */
    final class C1764c implements Set<K> {
        C1764c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1761a.this.clear();
        }

        public boolean contains(Object obj) {
            return C1761a.this.containsKey(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return C1761a.this.mo6058n(collection);
        }

        public boolean equals(Object obj) {
            return C1761a.m7337o(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int i2 = C1761a.this.f6844f - 1; i2 >= 0; i2--) {
                Object i3 = C1761a.this.mo6161i(i2);
                i += i3 == null ? 0 : i3.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C1761a.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new C1763b();
        }

        public boolean remove(Object obj) {
            int f = C1761a.this.mo6155f(obj);
            if (f < 0) {
                return false;
            }
            C1761a.this.mo6164k(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C1761a.this.mo6059p(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C1761a.this.mo6061q(collection);
        }

        public int size() {
            return C1761a.this.f6844f;
        }

        public Object[] toArray() {
            int i = C1761a.this.f6844f;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C1761a.this.mo6161i(i2);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return C1761a.this.mo6062r(tArr, 0);
        }
    }

    /* renamed from: k.a$d */
    final class C1765d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: d */
        int f6803d;

        /* renamed from: e */
        int f6804e = -1;

        /* renamed from: f */
        boolean f6805f;

        C1765d() {
            this.f6803d = C1761a.this.f6844f - 1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f6804e++;
                this.f6805f = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f6805f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C1770c.m7359c(entry.getKey(), C1761a.this.mo6161i(this.f6804e)) && C1770c.m7359c(entry.getValue(), C1761a.this.mo6166m(this.f6804e));
            }
        }

        public K getKey() {
            if (this.f6805f) {
                return C1761a.this.mo6161i(this.f6804e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f6805f) {
                return C1761a.this.mo6166m(this.f6804e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f6804e < this.f6803d;
        }

        public int hashCode() {
            if (this.f6805f) {
                Object i = C1761a.this.mo6161i(this.f6804e);
                Object m = C1761a.this.mo6166m(this.f6804e);
                int i2 = 0;
                int hashCode = i == null ? 0 : i.hashCode();
                if (m != null) {
                    i2 = m.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f6805f) {
                C1761a.this.mo6164k(this.f6804e);
                this.f6804e--;
                this.f6803d--;
                this.f6805f = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f6805f) {
                return C1761a.this.mo6165l(this.f6804e, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: k.a$e */
    final class C1766e implements Collection<V> {
        C1766e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1761a.this.clear();
        }

        public boolean contains(Object obj) {
            return C1761a.this.mo6159h(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1761a.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C1767f();
        }

        public boolean remove(Object obj) {
            int h = C1761a.this.mo6159h(obj);
            if (h < 0) {
                return false;
            }
            C1761a.this.mo6164k(h);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = C1761a.this.f6844f;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(C1761a.this.mo6166m(i2))) {
                    C1761a.this.mo6164k(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = C1761a.this.f6844f;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(C1761a.this.mo6166m(i2))) {
                    C1761a.this.mo6164k(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public int size() {
            return C1761a.this.f6844f;
        }

        public Object[] toArray() {
            int i = C1761a.this.f6844f;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C1761a.this.mo6166m(i2);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return C1761a.this.mo6062r(tArr, 1);
        }
    }

    /* renamed from: k.a$f */
    final class C1767f extends C1771d<V> {
        C1767f() {
            super(C1761a.this.f6844f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo6066a(int i) {
            return C1761a.this.mo6166m(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6067b(int i) {
            C1761a.this.mo6164k(i);
        }
    }

    public C1761a() {
    }

    public C1761a(C1774g gVar) {
        super(gVar);
    }

    /* renamed from: o */
    static <T> boolean m7337o(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C1761a<K, V>.a aVar = this.f6797k;
        if (aVar != null) {
            return aVar;
        }
        C1761a<K, V>.a aVar2 = new C1762a();
        this.f6797k = aVar2;
        return aVar2;
    }

    public Set<K> keySet() {
        C1761a<K, V>.c cVar = this.f6798l;
        if (cVar != null) {
            return cVar;
        }
        C1761a<K, V>.c cVar2 = new C1764c();
        this.f6798l = cVar2;
        return cVar2;
    }

    /* renamed from: n */
    public boolean mo6058n(Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo6059p(Collection<?> collection) {
        int i = this.f6844f;
        for (Object remove : collection) {
            remove(remove);
        }
        return i != this.f6844f;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo6149c(this.f6844f + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: q */
    public boolean mo6061q(Collection<?> collection) {
        int i = this.f6844f;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(mo6161i(i2))) {
                mo6164k(i2);
            }
        }
        return i != this.f6844f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <T> T[] mo6062r(T[] tArr, int i) {
        int i2 = this.f6844f;
        if (tArr.length < i2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.f6843e[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public Collection<V> values() {
        C1761a<K, V>.e eVar = this.f6799m;
        if (eVar != null) {
            return eVar;
        }
        C1761a<K, V>.e eVar2 = new C1766e();
        this.f6799m = eVar2;
        return eVar2;
    }
}
