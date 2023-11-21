package p121u1;

import kotlinx.coroutines.internal.C1799a0;
import kotlinx.coroutines.internal.C1807d;
import p017c1.C1336k;
import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1518d;
import p029e1.C1523g;

/* renamed from: u1.m0 */
public final class C2781m0 {
    /* renamed from: a */
    public static final <T> void m11595a(C2778l0<? super T> l0Var, int i) {
        C1518d<? super T> b = l0Var.mo6260b();
        boolean z = i == 4;
        if (z || !(b instanceof C1807d) || m11596b(i) != m11596b(l0Var.f10575f)) {
            m11598d(l0Var, b, z);
            return;
        }
        C2820x xVar = ((C1807d) b).f7048g;
        C1523g c = b.mo5629c();
        if (xVar.mo6297e(c)) {
            xVar.mo6270c(c, l0Var);
        } else {
            m11599e(l0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m11596b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m11597c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m11598d(C2778l0<? super T> l0Var, C1518d<? super T> dVar, boolean z) {
        Object obj;
        Object i = l0Var.mo6261i();
        Throwable d = l0Var.mo10037d(i);
        if (d != null) {
            C1336k.C1337a aVar = C1336k.f4511d;
            obj = C1339l.m5989a(d);
        } else {
            C1336k.C1337a aVar2 = C1336k.f4511d;
            obj = l0Var.mo10038g(i);
        }
        Object a = C1336k.m5985a(obj);
        if (z) {
            C1807d dVar2 = (C1807d) dVar;
            C1518d<T> dVar3 = dVar2.f7049h;
            Object obj2 = dVar2.f7051j;
            C1523g c = dVar3.mo5629c();
            Object c2 = C1799a0.m7467c(c, obj2);
            C2805t1<?> f = c2 != C1799a0.f7036a ? C2815w.m11681f(dVar3, c, c2) : null;
            try {
                dVar2.f7049h.mo5630f(a);
                C1344q qVar = C1344q.f4517a;
            } finally {
                if (f == null || f.mo10086v0()) {
                    C1799a0.m7465a(c, c2);
                }
            }
        } else {
            dVar.mo5630f(a);
        }
    }

    /* renamed from: e */
    private static final void m11599e(C2778l0<?> l0Var) {
        C2793q0 a = C2799r1.f10601a.mo10082a();
        if (a.mo10065w()) {
            a.mo10062s(l0Var);
            return;
        }
        a.mo10064u(true);
        try {
            m11598d(l0Var, l0Var.mo6260b(), true);
            do {
            } while (a.mo10067y());
        } catch (Throwable th) {
            a.mo10061h(true);
            throw th;
        }
        a.mo10061h(true);
    }
}
