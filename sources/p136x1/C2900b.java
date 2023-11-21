package p136x1;

import kotlinx.coroutines.internal.C1799a0;
import kotlinx.coroutines.internal.C1830v;
import p017c1.C1336k;
import p017c1.C1339l;
import p029e1.C1518d;
import p029e1.C1523g;
import p041g1.C1601g;
import p077m1.C1910p;
import p083n1.C2420e;
import p083n1.C2431p;
import p121u1.C2770i1;
import p121u1.C2792q;

/* renamed from: x1.b */
public final class C2900b {
    /* renamed from: a */
    public static final <R, T> void m11958a(C1910p<? super R, ? super C1518d<? super T>, ? extends Object> pVar, R r, C1518d<? super T> dVar) {
        Object obj;
        C1523g c;
        Object c2;
        C1518d<? super T> a = C1601g.m6836a(dVar);
        try {
            c = dVar.mo5629c();
            c2 = C1799a0.m7467c(c, (Object) null);
            obj = ((C1910p) C2431p.m10310a(pVar, 2)).mo3751g(r, a);
            C1799a0.m7465a(c, c2);
            if (obj == C1557d.m6676c()) {
                return;
            }
        } catch (Throwable th) {
            C1336k.C1337a aVar = C1336k.f4511d;
            obj = C1339l.m5989a(th);
        }
        a.mo5630f(C1336k.m5985a(obj));
    }

    /* renamed from: b */
    public static final <T, R> Object m11959b(C1830v<? super T> vVar, R r, C1910p<? super R, ? super C1518d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object U;
        try {
            obj = ((C1910p) C2431p.m10310a(pVar, 2)).mo3751g(r, vVar);
        } catch (Throwable th) {
            obj = new C2792q(th, false, 2, (C2420e) null);
        }
        if (obj == C1557d.m6676c() || (U = vVar.mo10013U(obj)) == C2770i1.f10560b) {
            return C1557d.m6676c();
        }
        if (!(U instanceof C2792q)) {
            return C2770i1.m11555h(U);
        }
        throw ((C2792q) U).f10589a;
    }
}
