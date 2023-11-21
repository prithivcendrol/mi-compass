package p121u1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C1807d;
import p017c1.C1329d;
import p017c1.C1344q;
import p029e1.C1518d;
import p029e1.C1523g;
import p041g1.C1598d;
import p077m1.C1906l;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: u1.k */
public class C2774k<T> extends C2778l0<T> implements C2768i<T>, C1598d {

    /* renamed from: j */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10568j = AtomicIntegerFieldUpdater.newUpdater(C2774k.class, "_decision");

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10569k = AtomicReferenceFieldUpdater.newUpdater(C2774k.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: g */
    private final C1518d<T> f10570g;

    /* renamed from: h */
    private final C1523g f10571h;

    /* renamed from: i */
    private C2787o0 f10572i;

    /* renamed from: j */
    private final Void m11558j(Object obj) {
        throw new IllegalStateException(C2422g.m10290j("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: n */
    private final void m11559n() {
        if (!m11562r()) {
            mo10041m();
        }
    }

    /* renamed from: o */
    private final void m11560o(int i) {
        if (!m11566w()) {
            C2781m0.m11595a(this, i);
        }
    }

    /* renamed from: q */
    private final String m11561q() {
        Object p = mo10042p();
        return p instanceof C2785n1 ? "Active" : p instanceof C2777l ? "Cancelled" : "Completed";
    }

    /* renamed from: r */
    private final boolean m11562r() {
        return C2781m0.m11597c(this.f10575f) && ((C1807d) this.f10570g).mo6263l();
    }

    /* renamed from: t */
    private final void m11563t(Object obj, int i, C1906l<? super Throwable, C1344q> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C2785n1) {
            } else {
                if (obj2 instanceof C2777l) {
                    C2777l lVar2 = (C2777l) obj2;
                    if (lVar2.mo10046c()) {
                        if (lVar != null) {
                            mo10040l(lVar, lVar2.f10589a);
                            return;
                        }
                        return;
                    }
                }
                m11558j(obj);
                throw new C1329d();
            }
        } while (!C2771j.m11556a(f10569k, this, obj2, m11565v((C2785n1) obj2, obj, i, lVar, (Object) null)));
        m11559n();
        m11560o(i);
    }

    /* renamed from: u */
    static /* synthetic */ void m11564u(C2774k kVar, Object obj, int i, C1906l lVar, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            kVar.m11563t(obj, i, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: v */
    private final Object m11565v(C2785n1 n1Var, Object obj, int i, C1906l<? super Throwable, C1344q> lVar, Object obj2) {
        if (obj instanceof C2792q) {
            return obj;
        }
        if (!C2781m0.m11596b(i) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(n1Var instanceof C2759g) && obj2 == null) {
            return obj;
        }
        return new C2789p(obj, n1Var instanceof C2759g ? (C2759g) n1Var : null, lVar, obj2, (Throwable) null, 16, (C2420e) null);
    }

    /* renamed from: w */
    private final boolean m11566w() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f10568j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: a */
    public void mo6259a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C2785n1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C2792q)) {
                if (obj2 instanceof C2789p) {
                    C2789p pVar = (C2789p) obj2;
                    if (!pVar.mo10052c()) {
                        if (C2771j.m11556a(f10569k, this, obj2, C2789p.m11611b(pVar, (Object) null, (C2759g) null, (C1906l) null, (Object) null, th, 15, (Object) null))) {
                            pVar.mo10053d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C2771j.m11556a(f10569k, this, obj2, new C2789p(obj2, (C2759g) null, (C1906l) null, (Object) null, th, 14, (C2420e) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final C1518d<T> mo6260b() {
        return this.f10570g;
    }

    /* renamed from: c */
    public C1523g mo5629c() {
        return this.f10571h;
    }

    /* renamed from: d */
    public Throwable mo10037d(Object obj) {
        Throwable d = super.mo10037d(obj);
        if (d == null) {
            return null;
        }
        mo6260b();
        return d;
    }

    /* renamed from: e */
    public C1598d mo5744e() {
        C1518d<T> dVar = this.f10570g;
        if (dVar instanceof C1598d) {
            return (C1598d) dVar;
        }
        return null;
    }

    /* renamed from: f */
    public void mo5630f(Object obj) {
        m11564u(this, C2806u.m11668c(obj, this), this.f10575f, (C1906l) null, 4, (Object) null);
    }

    /* renamed from: g */
    public <T> T mo10038g(Object obj) {
        return obj instanceof C2789p ? ((C2789p) obj).f10582a : obj;
    }

    /* renamed from: i */
    public Object mo6261i() {
        return mo10042p();
    }

    /* renamed from: k */
    public final void mo10039k(C2759g gVar, Throwable th) {
        try {
            gVar.mo10004a(th);
        } catch (Throwable th2) {
            C2739a0.m11422a(mo5629c(), new C2803t(C2422g.m10290j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: l */
    public final void mo10040l(C1906l<? super Throwable, C1344q> lVar, Throwable th) {
        try {
            lVar.mo3838h(th);
        } catch (Throwable th2) {
            C2739a0.m11422a(mo5629c(), new C2803t(C2422g.m10290j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: m */
    public final void mo10041m() {
        C2787o0 o0Var = this.f10572i;
        if (o0Var != null) {
            o0Var.mo10000c();
            this.f10572i = C2782m1.f10576d;
        }
    }

    /* renamed from: p */
    public final Object mo10042p() {
        return this._state;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public String mo10043s() {
        return "CancellableContinuation";
    }

    public String toString() {
        return mo10043s() + '(' + C2757f0.m11452c(this.f10570g) + "){" + m11561q() + "}@" + C2757f0.m11451b(this);
    }
}
