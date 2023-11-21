package p121u1;

/* renamed from: u1.k1 */
public abstract class C2776k1 extends C2820x {
    /* renamed from: h */
    public abstract C2776k1 mo6298h();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final String mo10045r() {
        C2776k1 k1Var;
        C2776k1 c = C2784n0.m11607c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            k1Var = c.mo6298h();
        } catch (UnsupportedOperationException unused) {
            k1Var = null;
        }
        if (this == k1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String r = mo10045r();
        if (r != null) {
            return r;
        }
        return C2757f0.m11450a(this) + '@' + C2757f0.m11451b(this);
    }
}
