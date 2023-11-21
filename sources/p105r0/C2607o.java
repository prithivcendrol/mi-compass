package p105r0;

import p140y0.C2933s;

/* renamed from: r0.o */
class C2607o implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f10246d;

    /* renamed from: e */
    final /* synthetic */ boolean f10247e;

    /* renamed from: f */
    final /* synthetic */ C2603k f10248f;

    C2607o(C2603k kVar, String str, boolean z) {
        this.f10248f = kVar;
        this.f10246d = str;
        this.f10247e = z;
    }

    public void run() {
        try {
            if (!this.f10248f.f10234d.mo9806h()) {
                C2933s.m12141c("OneTrackImp", "config.autoTrackActivityAction is false, ignore onetrack_pa resume event");
                return;
            }
            this.f10248f.f10231a.mo9850a("onetrack_pa", C2600h.m11038d(this.f10246d, "onetrack_pa", this.f10248f.f10234d, this.f10248f.f10236f, this.f10248f.m11068t("onetrack_pa"), this.f10247e));
            C2933s.m12141c("OneTrackImp", "trackPageStartAuto");
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "auto trackPageStartAuto error: " + e.toString());
        }
    }
}
