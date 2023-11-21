package p088o0;

import android.content.Context;
import android.util.Log;
import java.util.Map;
import p100q0.C2561b;
import p100q0.C2568g;

/* renamed from: o0.b */
public class C2488b implements C2487a {

    /* renamed from: a */
    private C2568g f9699a;

    /* renamed from: a */
    public void mo9616a(String str, String str2, Map<String, Object> map) {
        C2568g gVar = this.f9699a;
        if (gVar == null) {
            Log.e("Compass:OneTrackAnalyticsImpl", "recordCountEvent2 mOneTrack is null, return");
            return;
        }
        try {
            gVar.mo9827g(str2, map);
        } catch (Exception e) {
            Log.e("Compass:OneTrackAnalyticsImpl", "recordCountEvent2 error: " + e.toString());
        }
    }

    /* renamed from: b */
    public void mo9617b(Context context) {
        try {
            this.f9699a = C2568g.m10960a(context, new C2561b.C2562a().mo9815o("31000000402").mo9816p("miui").mo9818r(false).mo9819s(C2568g.C2571c.APP).mo9817q(true).mo9814c());
            C2568g.m10964f();
            C2568g.m10963d(false);
            Log.i("Compass:OneTrackAnalyticsImpl", "OneTrack has been initialized");
        } catch (Exception e) {
            Log.i("Compass:OneTrackAnalyticsImpl", "OneTrack init error: " + e);
        }
    }
}
