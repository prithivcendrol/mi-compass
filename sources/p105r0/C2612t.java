package p105r0;

import java.util.Map;
import p140y0.C2933s;
import p140y0.C2935u;

/* renamed from: r0.t */
class C2612t implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f10256d;

    /* renamed from: e */
    final /* synthetic */ Map f10257e;

    /* renamed from: f */
    final /* synthetic */ C2603k f10258f;

    C2612t(C2603k kVar, String str, Map map) {
        this.f10258f = kVar;
        this.f10256d = str;
        this.f10257e = map;
    }

    public void run() {
        try {
            if (!this.f10258f.m11067s(this.f10256d)) {
                this.f10258f.f10231a.mo9850a(this.f10256d, C2600h.m11039e(this.f10256d, C2935u.m12171c(this.f10257e, true), this.f10258f.f10234d, this.f10258f.f10236f, this.f10258f.m11068t(this.f10256d)));
            }
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "track map error: " + e.toString());
        }
    }
}
