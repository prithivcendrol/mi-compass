package p115t0;

import java.util.List;
import org.json.JSONObject;
import p105r0.C2601i;
import p140y0.C2933s;

/* renamed from: t0.i */
final class C2674i implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C2601i f10461d;

    C2674i(C2601i iVar) {
        this.f10461d = iVar;
    }

    public void run() {
        try {
            List<JSONObject> e = C2672g.m11176e();
            if (e != null && e.size() > 0) {
                for (JSONObject next : e) {
                    this.f10461d.mo9850a(next.optString("eventName"), next.optString("data"));
                }
            }
            C2672g.m11178g(true);
        } catch (Exception e2) {
            C2933s.m12144f("NetworkAccessManager", "cta event error: " + e2.toString());
        }
        boolean unused = C2672g.f10458e = false;
    }
}
