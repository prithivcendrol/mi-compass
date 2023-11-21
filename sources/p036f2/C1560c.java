package p036f2;

import miuix.appcompat.app.C2118q;
import p030e2.C1531b;
import p117t2.C2693a;
import p117t2.C2709i;
import p117t2.C2711k;

/* renamed from: f2.c */
public class C1560c extends C1568k {
    public C1560c(C2118q qVar) {
        super(qVar);
    }

    /* renamed from: K */
    public void mo5713K() {
        if (!C1531b.m6615f()) {
            if (mo5720V()) {
                C1531b.m6610a(this.f6241d);
            } else if (C1531b.m6617h(this.f6241d) >= 0) {
                C1531b.m6612c(this.f6241d);
            }
        }
    }

    /* renamed from: g */
    public boolean mo5705g() {
        C2711k g = C2693a.m11238g(this.f6241d);
        if (C2693a.m11236e(this.f6241d) >= 600) {
            return !C2709i.m11321b(g.f10512f) || g.f10512f == 8195;
        }
        return false;
    }
}
