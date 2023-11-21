package p121u1;

import p029e1.C1518d;
import p029e1.C1519e;
import p029e1.C1523g;
import p029e1.C1529h;
import p041g1.C1598d;
import p077m1.C1910p;
import p083n1.C2423h;
import p083n1.C2428m;

/* renamed from: u1.w */
public final class C2815w {

    /* renamed from: u1.w$a */
    static final class C2816a extends C2423h implements C1910p<C1523g, C1523g.C1526b, C1523g> {

        /* renamed from: e */
        public static final C2816a f10612e = new C2816a();

        C2816a() {
            super(2);
        }

        /* renamed from: a */
        public final C1523g mo3751g(C1523g gVar, C1523g.C1526b bVar) {
            return bVar instanceof C2809v ? gVar.plus(((C2809v) bVar).mo10088d()) : gVar.plus(bVar);
        }
    }

    /* renamed from: u1.w$b */
    static final class C2817b extends C2423h implements C1910p<C1523g, C1523g.C1526b, C1523g> {

        /* renamed from: e */
        final /* synthetic */ C2428m<C1523g> f10613e;

        /* renamed from: f */
        final /* synthetic */ boolean f10614f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2817b(C2428m<C1523g> mVar, boolean z) {
            super(2);
            this.f10613e = mVar;
            this.f10614f = z;
        }

        /* renamed from: a */
        public final C1523g mo3751g(C1523g gVar, C1523g.C1526b bVar) {
            if (!(bVar instanceof C2809v)) {
                return gVar.plus(bVar);
            }
            C1523g.C1526b bVar2 = ((C1523g) this.f10613e.f9438d).get(bVar.getKey());
            if (bVar2 == null) {
                C2809v vVar = (C2809v) bVar;
                if (this.f10614f) {
                    vVar = vVar.mo10088d();
                }
                return gVar.plus(vVar);
            }
            C2428m<C1523g> mVar = this.f10613e;
            mVar.f9438d = ((C1523g) mVar.f9438d).minusKey(bVar.getKey());
            return gVar.plus(((C2809v) bVar).mo10089j(bVar2));
        }
    }

    /* renamed from: u1.w$c */
    static final class C2818c extends C2423h implements C1910p<Boolean, C1523g.C1526b, Boolean> {

        /* renamed from: e */
        public static final C2818c f10615e = new C2818c();

        C2818c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo10093a(boolean z, C1523g.C1526b bVar) {
            return Boolean.valueOf(z || (bVar instanceof C2809v));
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ Object mo3751g(Object obj, Object obj2) {
            return mo10093a(((Boolean) obj).booleanValue(), (C1523g.C1526b) obj2);
        }
    }

    /* renamed from: a */
    private static final C1523g m11676a(C1523g gVar, C1523g gVar2, boolean z) {
        boolean c = m11678c(gVar);
        boolean c2 = m11678c(gVar2);
        if (!c && !c2) {
            return gVar.plus(gVar2);
        }
        C2428m mVar = new C2428m();
        mVar.f9438d = gVar2;
        C1529h hVar = C1529h.f6170d;
        C1523g gVar3 = (C1523g) gVar.fold(hVar, new C2817b(mVar, z));
        if (c2) {
            mVar.f9438d = ((C1523g) mVar.f9438d).fold(hVar, C2816a.f10612e);
        }
        return gVar3.plus((C1523g) mVar.f9438d);
    }

    /* renamed from: b */
    public static final String m11677b(C1523g gVar) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m11678c(C1523g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, C2818c.f10615e)).booleanValue();
    }

    /* renamed from: d */
    public static final C1523g m11679d(C2742b0 b0Var, C1523g gVar) {
        C1523g a = m11676a(b0Var.mo3736h(), gVar, true);
        return (a == C2784n0.m11605a() || a.get(C1519e.f6167a) != null) ? a : a.plus(C2784n0.m11605a());
    }

    /* renamed from: e */
    public static final C2805t1<?> m11680e(C1598d dVar) {
        while (!(dVar instanceof C2775k0) && (dVar = dVar.mo5744e()) != null) {
            if (dVar instanceof C2805t1) {
                return (C2805t1) dVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final C2805t1<?> m11681f(C1518d<?> dVar, C1523g gVar, Object obj) {
        if (!(dVar instanceof C1598d)) {
            return null;
        }
        if (!(gVar.get(C2808u1.f10607d) != null)) {
            return null;
        }
        C2805t1<?> e = m11680e((C1598d) dVar);
        if (e != null) {
            e.mo10087w0(gVar, obj);
        }
        return e;
    }
}
