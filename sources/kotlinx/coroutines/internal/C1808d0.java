package kotlinx.coroutines.internal;

import p029e1.C1523g;
import p083n1.C2422g;
import p121u1.C2794q1;

/* renamed from: kotlinx.coroutines.internal.d0 */
final class C1808d0 {

    /* renamed from: a */
    public final C1523g f7052a;

    /* renamed from: b */
    private final Object[] f7053b;

    /* renamed from: c */
    private final C2794q1<Object>[] f7054c;

    /* renamed from: d */
    private int f7055d;

    public C1808d0(C1523g gVar, int i) {
        this.f7052a = gVar;
        this.f7053b = new Object[i];
        this.f7054c = new C2794q1[i];
    }

    /* renamed from: a */
    public final void mo6266a(C2794q1<?> q1Var, Object obj) {
        Object[] objArr = this.f7053b;
        int i = this.f7055d;
        objArr[i] = obj;
        C2794q1<Object>[] q1VarArr = this.f7054c;
        this.f7055d = i + 1;
        q1VarArr[i] = q1Var;
    }

    /* renamed from: b */
    public final void mo6267b(C1523g gVar) {
        int length = this.f7054c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C2794q1<Object> q1Var = this.f7054c[length];
                C2422g.m10282b(q1Var);
                q1Var.mo10069g(gVar, this.f7053b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
