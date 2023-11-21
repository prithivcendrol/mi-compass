package kotlinx.coroutines.scheduling;

import p029e1.C1523g;
import p121u1.C2810v0;

/* renamed from: kotlinx.coroutines.scheduling.f */
public class C1844f extends C2810v0 {

    /* renamed from: f */
    private final int f7123f;

    /* renamed from: g */
    private final int f7124g;

    /* renamed from: h */
    private final long f7125h;

    /* renamed from: i */
    private final String f7126i;

    /* renamed from: j */
    private C1835a f7127j = m7635h();

    public C1844f(int i, int i2, long j, String str) {
        this.f7123f = i;
        this.f7124g = i2;
        this.f7125h = j;
        this.f7126i = str;
    }

    /* renamed from: h */
    private final C1835a m7635h() {
        return new C1835a(this.f7123f, this.f7124g, this.f7125h, this.f7126i);
    }

    /* renamed from: c */
    public void mo6270c(C1523g gVar, Runnable runnable) {
        C1835a.m7596f(this.f7127j, runnable, (C1847i) null, false, 6, (Object) null);
    }

    /* renamed from: r */
    public final void mo6334r(Runnable runnable, C1847i iVar, boolean z) {
        this.f7127j.mo6313e(runnable, iVar, z);
    }
}
