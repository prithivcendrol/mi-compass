package p110s0;

import java.util.ArrayList;
import p140y0.C2933s;

/* renamed from: s0.f */
class C2644f implements Runnable {

    /* renamed from: d */
    final /* synthetic */ ArrayList f10313d;

    /* renamed from: e */
    final /* synthetic */ C2642e f10314e;

    C2644f(C2642e eVar, ArrayList arrayList) {
        this.f10314e = eVar;
        this.f10313d = arrayList;
    }

    public void run() {
        if (C2933s.f11129a) {
            C2933s.m12141c("ConfigDbManager", "update: " + this.f10313d);
        }
        this.f10314e.m11133j(this.f10313d);
    }
}
