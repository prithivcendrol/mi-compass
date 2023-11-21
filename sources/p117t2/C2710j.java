package p117t2;

import java.lang.ref.SoftReference;

/* renamed from: t2.j */
public abstract class C2710j<T> {

    /* renamed from: a */
    private SoftReference<T> f10506a = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo9671a(Object obj);

    /* renamed from: b */
    public final T mo9957b(Object obj) {
        T t;
        synchronized (this) {
            SoftReference<T> softReference = this.f10506a;
            if (softReference != null) {
                t = softReference.get();
                if (t != null) {
                    mo9787c(t, obj);
                }
            }
            t = mo9671a(obj);
            this.f10506a = new SoftReference<>(t);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9787c(T t, Object obj) {
    }
}
