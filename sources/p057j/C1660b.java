package p057j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j.b */
public class C1660b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: d */
    C1663c<K, V> f6547d;

    /* renamed from: e */
    private C1663c<K, V> f6548e;

    /* renamed from: f */
    private WeakHashMap<C1666f<K, V>, Boolean> f6549f = new WeakHashMap<>();

    /* renamed from: g */
    private int f6550g = 0;

    /* renamed from: j.b$a */
    static class C1661a<K, V> extends C1665e<K, V> {
        C1661a(C1663c<K, V> cVar, C1663c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1663c<K, V> mo5844b(C1663c<K, V> cVar) {
            return cVar.f6554g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1663c<K, V> mo5845c(C1663c<K, V> cVar) {
            return cVar.f6553f;
        }
    }

    /* renamed from: j.b$b */
    private static class C1662b<K, V> extends C1665e<K, V> {
        C1662b(C1663c<K, V> cVar, C1663c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1663c<K, V> mo5844b(C1663c<K, V> cVar) {
            return cVar.f6553f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1663c<K, V> mo5845c(C1663c<K, V> cVar) {
            return cVar.f6554g;
        }
    }

    /* renamed from: j.b$c */
    static class C1663c<K, V> implements Map.Entry<K, V> {

        /* renamed from: d */
        final K f6551d;

        /* renamed from: e */
        final V f6552e;

        /* renamed from: f */
        C1663c<K, V> f6553f;

        /* renamed from: g */
        C1663c<K, V> f6554g;

        C1663c(K k, V v) {
            this.f6551d = k;
            this.f6552e = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1663c)) {
                return false;
            }
            C1663c cVar = (C1663c) obj;
            return this.f6551d.equals(cVar.f6551d) && this.f6552e.equals(cVar.f6552e);
        }

        public K getKey() {
            return this.f6551d;
        }

        public V getValue() {
            return this.f6552e;
        }

        public int hashCode() {
            return this.f6551d.hashCode() ^ this.f6552e.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f6551d + "=" + this.f6552e;
        }
    }

    /* renamed from: j.b$d */
    private class C1664d implements Iterator<Map.Entry<K, V>>, C1666f<K, V> {

        /* renamed from: d */
        private C1663c<K, V> f6555d;

        /* renamed from: e */
        private boolean f6556e = true;

        C1664d() {
        }

        /* renamed from: a */
        public void mo5852a(C1663c<K, V> cVar) {
            C1663c<K, V> cVar2 = this.f6555d;
            if (cVar == cVar2) {
                C1663c<K, V> cVar3 = cVar2.f6554g;
                this.f6555d = cVar3;
                this.f6556e = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C1663c<K, V> cVar;
            if (this.f6556e) {
                this.f6556e = false;
                cVar = C1660b.this.f6547d;
            } else {
                C1663c<K, V> cVar2 = this.f6555d;
                cVar = cVar2 != null ? cVar2.f6553f : null;
            }
            this.f6555d = cVar;
            return this.f6555d;
        }

        public boolean hasNext() {
            if (this.f6556e) {
                return C1660b.this.f6547d != null;
            }
            C1663c<K, V> cVar = this.f6555d;
            return (cVar == null || cVar.f6553f == null) ? false : true;
        }
    }

    /* renamed from: j.b$e */
    private static abstract class C1665e<K, V> implements Iterator<Map.Entry<K, V>>, C1666f<K, V> {

        /* renamed from: d */
        C1663c<K, V> f6558d;

        /* renamed from: e */
        C1663c<K, V> f6559e;

        C1665e(C1663c<K, V> cVar, C1663c<K, V> cVar2) {
            this.f6558d = cVar2;
            this.f6559e = cVar;
        }

        /* renamed from: e */
        private C1663c<K, V> m7007e() {
            C1663c<K, V> cVar = this.f6559e;
            C1663c<K, V> cVar2 = this.f6558d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo5845c(cVar);
        }

        /* renamed from: a */
        public void mo5852a(C1663c<K, V> cVar) {
            if (this.f6558d == cVar && cVar == this.f6559e) {
                this.f6559e = null;
                this.f6558d = null;
            }
            C1663c<K, V> cVar2 = this.f6558d;
            if (cVar2 == cVar) {
                this.f6558d = mo5844b(cVar2);
            }
            if (this.f6559e == cVar) {
                this.f6559e = m7007e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1663c<K, V> mo5844b(C1663c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C1663c<K, V> mo5845c(C1663c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C1663c<K, V> cVar = this.f6559e;
            this.f6559e = m7007e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f6559e != null;
        }
    }

    /* renamed from: j.b$f */
    interface C1666f<K, V> {
        /* renamed from: a */
        void mo5852a(C1663c<K, V> cVar);
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo5834a() {
        return this.f6547d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1663c<K, V> mo5829b(K k) {
        C1663c<K, V> cVar = this.f6547d;
        while (cVar != null && !cVar.f6551d.equals(k)) {
            cVar = cVar.f6553f;
        }
        return cVar;
    }

    /* renamed from: c */
    public C1660b<K, V>.d mo5835c() {
        C1660b<K, V>.d dVar = new C1664d();
        this.f6549f.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo5836d() {
        return this.f6548e;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C1662b bVar = new C1662b(this.f6548e, this.f6547d);
        this.f6549f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1663c<K, V> mo5838e(K k, V v) {
        C1663c<K, V> cVar = new C1663c<>(k, v);
        this.f6550g++;
        C1663c<K, V> cVar2 = this.f6548e;
        if (cVar2 == null) {
            this.f6547d = cVar;
        } else {
            cVar2.f6553f = cVar;
            cVar.f6554g = cVar2;
        }
        this.f6548e = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1660b)) {
            return false;
        }
        C1660b bVar = (C1660b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* renamed from: f */
    public V mo5831f(K k, V v) {
        C1663c b = mo5829b(k);
        if (b != null) {
            return b.f6552e;
        }
        mo5838e(k, v);
        return null;
    }

    /* renamed from: g */
    public V mo5832g(K k) {
        C1663c b = mo5829b(k);
        if (b == null) {
            return null;
        }
        this.f6550g--;
        if (!this.f6549f.isEmpty()) {
            for (C1666f<K, V> a : this.f6549f.keySet()) {
                a.mo5852a(b);
            }
        }
        C1663c<K, V> cVar = b.f6554g;
        C1663c<K, V> cVar2 = b.f6553f;
        if (cVar != null) {
            cVar.f6553f = cVar2;
        } else {
            this.f6547d = cVar2;
        }
        C1663c<K, V> cVar3 = b.f6553f;
        if (cVar3 != null) {
            cVar3.f6554g = cVar;
        } else {
            this.f6548e = cVar;
        }
        b.f6553f = null;
        b.f6554g = null;
        return b.f6552e;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C1661a aVar = new C1661a(this.f6547d, this.f6548e);
        this.f6549f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f6550g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
