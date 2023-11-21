package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p017c1.C1344q;
import p029e1.C1518d;
import p029e1.C1523g;
import p041g1.C1598d;
import p077m1.C1906l;
import p121u1.C2757f0;
import p121u1.C2774k;
import p121u1.C2778l0;
import p121u1.C2793q0;
import p121u1.C2795r;
import p121u1.C2799r1;
import p121u1.C2806u;
import p121u1.C2820x;

/* renamed from: kotlinx.coroutines.internal.d */
public final class C1807d<T> extends C2778l0<T> implements C1598d, C1518d<T> {

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7047k = AtomicReferenceFieldUpdater.newUpdater(C1807d.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g */
    public final C2820x f7048g;

    /* renamed from: h */
    public final C1518d<T> f7049h;

    /* renamed from: i */
    public Object f7050i = C1809e.f7056a;

    /* renamed from: j */
    public final Object f7051j = C1799a0.m7466b(mo5629c());

    public C1807d(C2820x xVar, C1518d<? super T> dVar) {
        super(-1);
        this.f7048g = xVar;
        this.f7049h = dVar;
    }

    /* renamed from: k */
    private final C2774k<?> m7495k() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C2774k) {
            return (C2774k) obj;
        }
        return null;
    }

    /* renamed from: a */
    public void mo6259a(Object obj, Throwable th) {
        if (obj instanceof C2795r) {
            ((C2795r) obj).f10594b.mo3838h(th);
        }
    }

    /* renamed from: b */
    public C1518d<T> mo6260b() {
        return this;
    }

    /* renamed from: c */
    public C1523g mo5629c() {
        return this.f7049h.mo5629c();
    }

    /* renamed from: e */
    public C1598d mo5744e() {
        C1518d<T> dVar = this.f7049h;
        if (dVar instanceof C1598d) {
            return (C1598d) dVar;
        }
        return null;
    }

    /* renamed from: f */
    public void mo5630f(Object obj) {
        C1523g c;
        Object c2;
        C1523g c3 = this.f7049h.mo5629c();
        Object d = C2806u.m11669d(obj, (C1906l) null, 1, (Object) null);
        if (this.f7048g.mo6297e(c3)) {
            this.f7050i = d;
            this.f10575f = 0;
            this.f7048g.mo6270c(c3, this);
            return;
        }
        C2793q0 a = C2799r1.f10601a.mo10082a();
        if (a.mo10065w()) {
            this.f7050i = d;
            this.f10575f = 0;
            a.mo10062s(this);
            return;
        }
        a.mo10064u(true);
        try {
            c = mo5629c();
            c2 = C1799a0.m7467c(c, this.f7051j);
            this.f7049h.mo5630f(obj);
            C1344q qVar = C1344q.f4517a;
            C1799a0.m7465a(c, c2);
            do {
            } while (a.mo10067y());
        } catch (Throwable th) {
            try {
                mo10047h(th, (Throwable) null);
            } catch (Throwable th2) {
                a.mo10061h(true);
                throw th2;
            }
        }
        a.mo10061h(true);
    }

    /* renamed from: i */
    public Object mo6261i() {
        Object obj = this.f7050i;
        this.f7050i = C1809e.f7056a;
        return obj;
    }

    /* renamed from: j */
    public final void mo6262j() {
        do {
        } while (this._reusableCancellableContinuation == C1809e.f7057b);
    }

    /* renamed from: l */
    public final boolean mo6263l() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: m */
    public final void mo6264m() {
        mo6262j();
        C2774k<?> k = m7495k();
        if (k != null) {
            k.mo10041m();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f7048g + ", " + C2757f0.m11452c(this.f7049h) + ']';
    }
}
