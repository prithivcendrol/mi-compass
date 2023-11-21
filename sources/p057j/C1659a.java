package p057j;

import java.util.HashMap;
import java.util.Map;
import p057j.C1660b;

/* renamed from: j.a */
public class C1659a<K, V> extends C1660b<K, V> {

    /* renamed from: h */
    private HashMap<K, C1660b.C1663c<K, V>> f6546h = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1660b.C1663c<K, V> mo5829b(K k) {
        return this.f6546h.get(k);
    }

    public boolean contains(K k) {
        return this.f6546h.containsKey(k);
    }

    /* renamed from: f */
    public V mo5831f(K k, V v) {
        C1660b.C1663c b = mo5829b(k);
        if (b != null) {
            return b.f6552e;
        }
        this.f6546h.put(k, mo5838e(k, v));
        return null;
    }

    /* renamed from: g */
    public V mo5832g(K k) {
        V g = super.mo5832g(k);
        this.f6546h.remove(k);
        return g;
    }

    /* renamed from: h */
    public Map.Entry<K, V> mo5833h(K k) {
        if (contains(k)) {
            return this.f6546h.get(k).f6554g;
        }
        return null;
    }
}
