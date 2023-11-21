package p121u1;

import kotlinx.coroutines.internal.C1798a;

/* renamed from: u1.q0 */
public abstract class C2793q0 extends C2820x {

    /* renamed from: e */
    private long f10590e;

    /* renamed from: f */
    private boolean f10591f;

    /* renamed from: g */
    private C1798a<C2778l0<?>> f10592g;

    /* renamed from: r */
    private final long m11620r(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: v */
    public static /* synthetic */ void m11621v(C2793q0 q0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            q0Var.mo10064u(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: h */
    public final void mo10061h(boolean z) {
        long r = this.f10590e - m11620r(z);
        this.f10590e = r;
        if (r <= 0 && this.f10591f) {
            shutdown();
        }
    }

    /* renamed from: s */
    public final void mo10062s(C2778l0<?> l0Var) {
        C1798a<C2778l0<?>> aVar = this.f10592g;
        if (aVar == null) {
            aVar = new C1798a<>();
            this.f10592g = aVar;
        }
        aVar.mo6235a(l0Var);
    }

    public void shutdown() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public long mo10063t() {
        C1798a<C2778l0<?>> aVar = this.f10592g;
        return (aVar != null && !aVar.mo6236c()) ? 0 : Long.MAX_VALUE;
    }

    /* renamed from: u */
    public final void mo10064u(boolean z) {
        this.f10590e += m11620r(z);
        if (!z) {
            this.f10591f = true;
        }
    }

    /* renamed from: w */
    public final boolean mo10065w() {
        return this.f10590e >= m11620r(true);
    }

    /* renamed from: x */
    public final boolean mo10066x() {
        C1798a<C2778l0<?>> aVar = this.f10592g;
        if (aVar == null) {
            return true;
        }
        return aVar.mo6236c();
    }

    /* renamed from: y */
    public final boolean mo10067y() {
        C2778l0 d;
        C1798a<C2778l0<?>> aVar = this.f10592g;
        if (aVar == null || (d = aVar.mo6237d()) == null) {
            return false;
        }
        d.run();
        return true;
    }
}
