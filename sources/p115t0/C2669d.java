package p115t0;

import p130w0.C2875b;
import p140y0.C2933s;

/* renamed from: t0.d */
class C2669d implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C2875b f10447d;

    /* renamed from: e */
    final /* synthetic */ C2666b f10448e;

    C2669d(C2666b bVar, C2875b bVar2) {
        this.f10448e = bVar;
        this.f10447d = bVar2;
    }

    public void run() {
        try {
            this.f10448e.m11165l(this.f10447d);
            C2933s.m12141c("EventManager", "addEvent: " + this.f10447d.mo10169m() + "data:" + this.f10447d.mo10171o().toString());
            C2677l.m11185a().mo9938b(this.f10447d.mo10170n(), false);
        } catch (Exception e) {
            C2933s.m12145g("EventManager", "EventManager.addEvent exception: ", e);
        }
    }
}
