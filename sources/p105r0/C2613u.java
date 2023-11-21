package p105r0;

import p140y0.C2933s;

/* renamed from: r0.u */
class C2613u implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f10259d;

    /* renamed from: e */
    final /* synthetic */ String f10260e;

    /* renamed from: f */
    final /* synthetic */ String f10261f;

    /* renamed from: g */
    final /* synthetic */ String f10262g;

    /* renamed from: h */
    final /* synthetic */ String f10263h;

    /* renamed from: i */
    final /* synthetic */ C2603k f10264i;

    C2613u(C2603k kVar, String str, String str2, String str3, String str4, String str5) {
        this.f10264i = kVar;
        this.f10259d = str;
        this.f10260e = str2;
        this.f10261f = str3;
        this.f10262g = str4;
        this.f10263h = str5;
    }

    public void run() {
        try {
            this.f10264i.f10231a.mo9850a("onetrack_bug_report", C2600h.m11037c(this.f10259d, this.f10260e, this.f10261f, this.f10262g, this.f10263h, this.f10264i.f10234d, this.f10264i.f10236f, this.f10264i.m11068t("onetrack_bug_report")));
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "trackException error: " + e.toString());
        }
    }
}
