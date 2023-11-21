package p036f2;

import miuix.appcompat.app.C2118q;
import p030e2.C1531b;
import p117t2.C2693a;
import p117t2.C2709i;
import p117t2.C2711k;

/* renamed from: f2.d */
public class C1561d extends C1568k {
    public C1561d(C2118q qVar) {
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
        int i = g.f10512f;
        if (i == 0) {
            return true;
        }
        boolean b = C2709i.m11321b(i);
        int i2 = g.f10512f;
        return b ? i2 == 8195 : i2 == 4099;
    }
}
