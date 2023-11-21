package p105r0;

import android.text.TextUtils;
import org.json.JSONObject;
import p140y0.C2911a;
import p140y0.C2933s;

/* renamed from: r0.q */
class C2609q implements Runnable {

    /* renamed from: d */
    final /* synthetic */ boolean f10252d;

    /* renamed from: e */
    final /* synthetic */ C2603k f10253e;

    C2609q(C2603k kVar, boolean z) {
        this.f10253e = kVar;
        this.f10252d = z;
    }

    public void run() {
        try {
            String L = C2911a.m12030L();
            if (!TextUtils.isEmpty(L)) {
                JSONObject jSONObject = new JSONObject(L);
                this.f10253e.f10231a.mo9850a("onetrack_pa", jSONObject.put("B", jSONObject.optJSONObject("B").put("app_end", this.f10252d)).toString());
                if (C2933s.f11129a) {
                    C2933s.m12141c("OneTrackImp", "trackPageEndAuto");
                }
                C2911a.m12055y("");
            }
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "trackPageEndAuto error:" + e.toString());
        }
    }
}
