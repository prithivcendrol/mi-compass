package kotlinx.coroutines.internal;

import p029e1.C1523g;
import p077m1.C1910p;
import p083n1.C2422g;
import p083n1.C2423h;
import p121u1.C2794q1;

/* renamed from: kotlinx.coroutines.internal.a0 */
public final class C1799a0 {

    /* renamed from: a */
    public static final C1831w f7036a = new C1831w("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C1910p<Object, C1523g.C1526b, Object> f7037b = C1800a.f7040e;

    /* renamed from: c */
    private static final C1910p<C2794q1<?>, C1523g.C1526b, C2794q1<?>> f7038c = C1801b.f7041e;

    /* renamed from: d */
    private static final C1910p<C1808d0, C1523g.C1526b, C1808d0> f7039d = C1802c.f7042e;

    /* renamed from: kotlinx.coroutines.internal.a0$a */
    static final class C1800a extends C2423h implements C1910p<Object, C1523g.C1526b, Object> {

        /* renamed from: e */
        public static final C1800a f7040e = new C1800a();

        C1800a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo3751g(Object obj, C1523g.C1526b bVar) {
            if (!(bVar instanceof C2794q1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.a0$b */
    static final class C1801b extends C2423h implements C1910p<C2794q1<?>, C1523g.C1526b, C2794q1<?>> {

        /* renamed from: e */
        public static final C1801b f7041e = new C1801b();

        C1801b() {
            super(2);
        }

        /* renamed from: a */
        public final C2794q1<?> mo3751g(C2794q1<?> q1Var, C1523g.C1526b bVar) {
            if (q1Var != null) {
                return q1Var;
            }
            if (bVar instanceof C2794q1) {
                return (C2794q1) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.a0$c */
    static final class C1802c extends C2423h implements C1910p<C1808d0, C1523g.C1526b, C1808d0> {

        /* renamed from: e */
        public static final C1802c f7042e = new C1802c();

        C1802c() {
            super(2);
        }

        /* renamed from: a */
        public final C1808d0 mo3751g(C1808d0 d0Var, C1523g.C1526b bVar) {
            if (bVar instanceof C2794q1) {
                C2794q1 q1Var = (C2794q1) bVar;
                d0Var.mo6266a(q1Var, q1Var.mo10068b(d0Var.f7052a));
            }
            return d0Var;
        }
    }

    /* renamed from: a */
    public static final void m7465a(C1523g gVar, Object obj) {
        if (obj != f7036a) {
            if (obj instanceof C1808d0) {
                ((C1808d0) obj).mo6267b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f7038c);
            if (fold != null) {
                ((C2794q1) fold).mo10069g(gVar, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m7466b(C1523g gVar) {
        Object fold = gVar.fold(0, f7037b);
        C2422g.m10282b(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m7467c(C1523g gVar, Object obj) {
        if (obj == null) {
            obj = m7466b(gVar);
        }
        return obj == 0 ? f7036a : obj instanceof Integer ? gVar.fold(new C1808d0(gVar, ((Number) obj).intValue()), f7039d) : ((C2794q1) obj).mo10068b(gVar);
    }
}
