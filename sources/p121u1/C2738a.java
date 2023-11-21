package p121u1;

import p029e1.C1518d;
import p029e1.C1523g;
import p077m1.C1906l;
import p077m1.C1910p;
import p083n1.C2422g;

/* renamed from: u1.a */
public abstract class C2738a<T> extends C2764h1 implements C1518d<T>, C2742b0 {

    /* renamed from: e */
    private final C1523g f10533e;

    public C2738a(C1523g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo10011Q((C2743b1) gVar.get(C2743b1.f10535c));
        }
        this.f10533e = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo9974A() {
        return C2422g.m10290j(C2757f0.m11450a(this), " was cancelled");
    }

    /* renamed from: P */
    public final void mo9975P(Throwable th) {
        C2739a0.m11422a(this.f10533e, th);
    }

    /* renamed from: W */
    public String mo9976W() {
        String b = C2815w.m11677b(this.f10533e);
        if (b == null) {
            return super.mo9976W();
        }
        return '\"' + b + "\":" + super.mo9976W();
    }

    /* renamed from: a */
    public boolean mo9977a() {
        return super.mo9977a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void mo9978b0(Object obj) {
        if (obj instanceof C2792q) {
            C2792q qVar = (C2792q) obj;
            mo9979s0(qVar.f10589a, qVar.mo10058a());
            return;
        }
        mo9980t0(obj);
    }

    /* renamed from: c */
    public final C1523g mo5629c() {
        return this.f10533e;
    }

    /* renamed from: f */
    public final void mo5630f(Object obj) {
        Object U = mo10013U(C2806u.m11669d(obj, (C1906l) null, 1, (Object) null));
        if (U != C2770i1.f10560b) {
            mo6308r0(U);
        }
    }

    /* renamed from: h */
    public C1523g mo3736h() {
        return this.f10533e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo6308r0(Object obj) {
        mo6309v(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo9979s0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public void mo9980t0(T t) {
    }

    /* renamed from: u0 */
    public final <R> void mo9981u0(C2750d0 d0Var, R r, C1910p<? super R, ? super C1518d<? super T>, ? extends Object> pVar) {
        d0Var.mo9993b(pVar, r, this);
    }
}
