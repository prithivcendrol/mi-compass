package p105r0;

import p140y0.C2911a;
import p140y0.C2933s;

/* renamed from: r0.p */
class C2608p implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f10249d;

    /* renamed from: e */
    final /* synthetic */ long f10250e;

    /* renamed from: f */
    final /* synthetic */ C2603k f10251f;

    C2608p(C2603k kVar, String str, long j) {
        this.f10251f = kVar;
        this.f10249d = str;
        this.f10250e = j;
    }

    public void run() {
        try {
            if (!this.f10251f.f10234d.mo9806h()) {
                C2933s.m12141c("OneTrackImp", "config.autoTrackActivityAction is false, ignore onetrack_pa pause event");
                return;
            }
            C2911a.m12055y(C2600h.m11036b(this.f10249d, "onetrack_pa", this.f10250e, this.f10251f.f10234d, this.f10251f.f10236f, this.f10251f.m11068t("onetrack_pa")));
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "savePageEndData error:" + e.toString());
        }
    }
}
