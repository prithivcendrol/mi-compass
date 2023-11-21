package p105r0;

import android.text.TextUtils;
import p100q0.C2573h;
import p115t0.C2672g;
import p140y0.C2911a;
import p140y0.C2916f;
import p140y0.C2932r;
import p140y0.C2933s;

/* renamed from: r0.l */
class C2604l implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C2603k f10238d;

    C2604l(C2603k kVar) {
        this.f10238d = kVar;
    }

    public void run() {
        if (C2911a.m12032b() == 0) {
            C2911a.m12025G(System.currentTimeMillis());
        }
        if (!TextUtils.isEmpty(this.f10238d.f10234d.mo9802d())) {
            C2932r.m12132a().mo10227c(this.f10238d.f10234d.mo9802d());
        }
        this.f10238d.m11051F();
        C2916f.m12076b();
        C2672g.m11178g(false);
        if (C2933s.f11129a) {
            C2573h.m10970a().mo9831b(this.f10238d.f10234d);
            C2573h.m10970a().mo9832c();
        }
    }
}
