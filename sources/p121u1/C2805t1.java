package p121u1;

import kotlinx.coroutines.internal.C1799a0;
import kotlinx.coroutines.internal.C1830v;
import p017c1.C1335j;
import p017c1.C1341n;
import p017c1.C1344q;
import p029e1.C1518d;
import p029e1.C1523g;

/* renamed from: u1.t1 */
public final class C2805t1<T> extends C1830v<T> {

    /* renamed from: g */
    private ThreadLocal<C1335j<C1523g, Object>> f10604g;

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo6308r0(Object obj) {
        C1335j jVar = this.f10604g.get();
        C2805t1<?> t1Var = null;
        if (jVar != null) {
            C1799a0.m7465a((C1523g) jVar.mo5186a(), jVar.mo5187b());
            this.f10604g.set(t1Var);
        }
        Object a = C2806u.m11666a(obj, this.f7089f);
        C1518d<T> dVar = this.f7089f;
        C1523g c = dVar.mo5629c();
        Object c2 = C1799a0.m7467c(c, t1Var);
        if (c2 != C1799a0.f7036a) {
            t1Var = C2815w.m11681f(dVar, c, c2);
        }
        try {
            this.f7089f.mo5630f(a);
            C1344q qVar = C1344q.f4517a;
        } finally {
            if (t1Var == null || t1Var.mo10086v0()) {
                C1799a0.m7465a(c, c2);
            }
        }
    }

    /* renamed from: v0 */
    public final boolean mo10086v0() {
        if (this.f10604g.get() == null) {
            return false;
        }
        this.f10604g.set((Object) null);
        return true;
    }

    /* renamed from: w0 */
    public final void mo10087w0(C1523g gVar, Object obj) {
        this.f10604g.set(C1341n.m5992a(gVar, obj));
    }
}
