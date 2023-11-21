package p105r0;

import p140y0.C2911a;
import p140y0.C2913c;
import p140y0.C2933s;

/* renamed from: r0.n */
class C2606n implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C2603k f10245d;

    C2606n(C2603k kVar) {
        this.f10245d = kVar;
    }

    public void run() {
        try {
            if (!C2913c.m12061c(C2911a.m12027I())) {
                C2911a.m12024F(System.currentTimeMillis());
                this.f10245d.f10231a.mo9850a("onetrack_dau", C2600h.m11040f(this.f10245d.f10234d, this.f10245d.f10236f, this.f10245d.m11068t("onetrack_dau")));
            }
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "trackDau error  e:" + e.toString());
        }
    }
}
