package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.a */
public class C1798a<T> {

    /* renamed from: a */
    private Object[] f7033a = new Object[16];

    /* renamed from: b */
    private int f7034b;

    /* renamed from: c */
    private int f7035c;

    /* renamed from: b */
    private final void m7461b() {
        Object[] objArr = this.f7033a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C1471d.m6448c(objArr, objArr3, 0, this.f7034b, 0, 10, (Object) null);
        Object[] objArr4 = this.f7033a;
        int length2 = objArr4.length;
        int i = this.f7034b;
        Object[] unused2 = C1471d.m6448c(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f7033a = objArr3;
        this.f7034b = 0;
        this.f7035c = length;
    }

    /* renamed from: a */
    public final void mo6235a(T t) {
        Object[] objArr = this.f7033a;
        int i = this.f7035c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f7035c = length;
        if (length == this.f7034b) {
            m7461b();
        }
    }

    /* renamed from: c */
    public final boolean mo6236c() {
        return this.f7034b == this.f7035c;
    }

    /* renamed from: d */
    public final T mo6237d() {
        int i = this.f7034b;
        if (i == this.f7035c) {
            return null;
        }
        T[] tArr = this.f7033a;
        T t = tArr[i];
        tArr[i] = null;
        this.f7034b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
