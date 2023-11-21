package p140y0;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p110s0.C2640c;

/* renamed from: y0.y */
public class C2940y {

    /* renamed from: a */
    private static ConcurrentHashMap<String, String> f11146a = new ConcurrentHashMap<>();

    /* renamed from: y0.y$a */
    private static class C2941a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2940y f11147a = new C2940y();
    }

    private C2940y() {
        f11146a.put("IN", "tracking.india.miui.com");
        f11146a.put("RU", "tracking.rus.miui.com");
        m12188i();
    }

    /* renamed from: b */
    private String m12186b(boolean z, String str) {
        if (!z) {
            return "tracking.miui.com";
        }
        String str2 = f11146a.get(str);
        return TextUtils.isEmpty(str2) ? "tracking.intl.miui.com" : str2;
    }

    /* renamed from: c */
    public static C2940y m12187c() {
        return C2941a.f11147a;
    }

    /* renamed from: i */
    private void m12188i() {
        try {
            String w = C2911a.m12053w();
            if (!TextUtils.isEmpty(w)) {
                mo10231d(new JSONObject(w));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private String m12189j() {
        return "https://";
    }

    /* renamed from: k */
    private String m12190k() {
        return m12186b(C2934t.m12149a(), C2934t.m12150b());
    }

    /* renamed from: l */
    private String m12191l() {
        boolean a = C2934t.m12149a();
        String b = C2934t.m12150b();
        return !a ? "sdkconfig.ad.xiaomi.com" : TextUtils.equals(b, "IN") ? "sdkconfig.ad.india.xiaomi.com" : TextUtils.equals(b, "RU") ? "sdkconfig.ad.rus.xiaomi.com" : "sdkconfig.ad.intl.xiaomi.com";
    }

    /* renamed from: a */
    public String mo10230a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: d */
    public synchronized void mo10231d(JSONObject jSONObject) {
        C2933s.m12141c("RegionDomainManager", "updateHostMap:" + jSONObject.toString());
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    f11146a.put(next, optString);
                }
            }
            C2911a.m12041k(new JSONObject(f11146a).toString());
        } catch (Exception e) {
            C2933s.m12141c("RegionDomainManager", "updateHostMap: " + e.toString());
        }
        C2933s.m12141c("RegionDomainManager", "merge config:" + new JSONObject(f11146a).toString());
    }

    /* renamed from: e */
    public String mo10232e() {
        try {
            if (TextUtils.isEmpty(C2911a.m12022D())) {
                C2640c.m11124b();
            }
        } catch (Exception e) {
            C2933s.m12141c("RegionDomainManager", "getTrackingUrl: " + e.toString());
        }
        return mo10230a(m12189j(), m12190k(), "/track/v4");
    }

    /* renamed from: f */
    public String mo10233f() {
        return mo10230a(m12189j(), m12191l(), "/api/v4/detail/config");
    }

    /* renamed from: g */
    public String mo10234g() {
        return mo10230a(m12189j(), m12191l(), "/api/v4/detail/config_common");
    }

    /* renamed from: h */
    public String mo10235h() {
        return mo10230a(m12189j(), m12190k(), "/track/key_get");
    }
}
