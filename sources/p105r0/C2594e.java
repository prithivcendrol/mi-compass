package p105r0;

import java.util.Map;
import p140y0.C2933s;

/* renamed from: r0.e */
class C2594e implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C2593d f10210d;

    C2594e(C2593d dVar) {
        this.f10210d = dVar;
    }

    public void run() {
        try {
            synchronized (this.f10210d.f10207a) {
                if (this.f10210d.f10207a.size() > 0) {
                    for (Map.Entry entry : this.f10210d.f10207a.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        this.f10210d.f10209c.mo9860i(str2, str, this.f10210d.f10208b);
                        if (C2933s.f11129a) {
                            C2933s.m12141c("OneTrackSystemImp", "name:" + str2 + "data :" + str);
                        }
                    }
                    this.f10210d.f10207a.clear();
                }
            }
        } catch (Exception e) {
            C2933s.m12141c("OneTrackSystemImp", "trackCachedEvents: " + e.toString());
        }
    }
}
