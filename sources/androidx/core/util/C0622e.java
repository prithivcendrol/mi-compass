package androidx.core.util;

/* renamed from: androidx.core.util.e */
public class C0622e<T> implements C0621d<T> {

    /* renamed from: a */
    private final Object[] f2660a;

    /* renamed from: b */
    private int f2661b;

    public C0622e(int i) {
        if (i > 0) {
            this.f2660a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m2487c(T t) {
        for (int i = 0; i < this.f2661b; i++) {
            if (this.f2660a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2708a(T t) {
        if (!m2487c(t)) {
            int i = this.f2661b;
            Object[] objArr = this.f2660a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2661b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo2709b() {
        int i = this.f2661b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2660a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2661b = i - 1;
        return t;
    }
}
