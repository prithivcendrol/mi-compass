package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.C1806c0;
import p083n1.C2422g;

/* renamed from: kotlinx.coroutines.internal.b0 */
public class C1804b0<T extends C1806c0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f7045a;

    /* renamed from: f */
    private final T[] m7474f() {
        T[] tArr = this.f7045a;
        if (tArr == null) {
            T[] tArr2 = new C1806c0[4];
            this.f7045a = tArr2;
            return tArr2;
        } else if (mo6243c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo6243c() * 2);
            C2422g.m10284d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C1806c0[]) copyOf;
            this.f7045a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m7475j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m7476k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo6243c()) {
                T[] tArr = this.f7045a;
                C2422g.m10282b(tArr);
                int i3 = i2 + 1;
                if (i3 < mo6243c()) {
                    T t = tArr[i3];
                    C2422g.m10282b(t);
                    T t2 = tArr[i2];
                    C2422g.m10282b(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C2422g.m10282b(t3);
                T t4 = tArr[i2];
                C2422g.m10282b(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m7478m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m7477l(int i) {
        while (i > 0) {
            T[] tArr = this.f7045a;
            C2422g.m10282b(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C2422g.m10282b(t);
            T t2 = tArr[i];
            C2422g.m10282b(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m7478m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m7478m(int i, int i2) {
        T[] tArr = this.f7045a;
        C2422g.m10282b(tArr);
        T t = tArr[i2];
        C2422g.m10282b(t);
        T t2 = tArr[i];
        C2422g.m10282b(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    /* renamed from: a */
    public final void mo6241a(T t) {
        t.mo6255a(this);
        C1806c0[] f = m7474f();
        int c = mo6243c();
        m7475j(c + 1);
        f[c] = t;
        t.setIndex(c);
        m7477l(c);
    }

    /* renamed from: b */
    public final T mo6242b() {
        T[] tArr = this.f7045a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int mo6243c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo6244d() {
        return mo6243c() == 0;
    }

    /* renamed from: e */
    public final T mo6245e() {
        T b;
        synchronized (this) {
            b = mo6242b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo6246g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo6256b() == null) {
                z = false;
            } else {
                mo6247h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo6247h(int i) {
        T[] tArr = this.f7045a;
        C2422g.m10282b(tArr);
        m7475j(mo6243c() - 1);
        if (i < mo6243c()) {
            m7478m(i, mo6243c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C2422g.m10282b(t);
                T t2 = tArr[i2];
                C2422g.m10282b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m7478m(i, i2);
                    m7477l(i2);
                }
            }
            m7476k(i);
        }
        T t3 = tArr[mo6243c()];
        C2422g.m10282b(t3);
        t3.mo6255a((C1804b0<?>) null);
        t3.setIndex(-1);
        tArr[mo6243c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo6248i() {
        T h;
        synchronized (this) {
            h = mo6243c() > 0 ? mo6247h(0) : null;
        }
        return h;
    }
}
