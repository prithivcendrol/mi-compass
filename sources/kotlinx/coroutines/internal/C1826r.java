package kotlinx.coroutines.internal;

import p017c1.C1329d;
import p029e1.C1523g;
import p083n1.C2422g;
import p121u1.C2769i0;
import p121u1.C2776k1;

/* renamed from: kotlinx.coroutines.internal.r */
final class C1826r extends C2776k1 implements C2769i0 {

    /* renamed from: e */
    private final Throwable f7086e;

    /* renamed from: f */
    private final String f7087f;

    public C1826r(Throwable th, String str) {
        this.f7086e = th;
        this.f7087f = str;
    }

    /* renamed from: t */
    private final Void m7564t() {
        String j;
        if (this.f7086e != null) {
            String str = this.f7087f;
            String str2 = "";
            if (!(str == null || (j = C2422g.m10290j(". ", str)) == null)) {
                str2 = j;
            }
            throw new IllegalStateException(C2422g.m10290j("Module with the Main dispatcher had failed to initialize", str2), this.f7086e);
        }
        C1825q.m7562d();
        throw new C1329d();
    }

    /* renamed from: e */
    public boolean mo6297e(C1523g gVar) {
        m7564t();
        throw new C1329d();
    }

    /* renamed from: h */
    public C2776k1 mo6298h() {
        return this;
    }

    /* renamed from: s */
    public Void mo6270c(C1523g gVar, Runnable runnable) {
        m7564t();
        throw new C1329d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f7086e;
        sb.append(th != null ? C2422g.m10290j(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
