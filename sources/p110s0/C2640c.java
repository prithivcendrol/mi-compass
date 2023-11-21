package p110s0;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p130w0.C2874a;
import p135x0.C2897a;
import p135x0.C2898b;
import p140y0.C2911a;
import p140y0.C2920j;
import p140y0.C2933s;
import p140y0.C2934t;
import p140y0.C2940y;
import p145z0.C2964a;

/* renamed from: s0.c */
public class C2640c {

    /* renamed from: a */
    private static ConcurrentHashMap<Integer, Integer> f10308a = new ConcurrentHashMap<>();

    /* renamed from: a */
    private static void m11123a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("code") == 0) {
                    String optString = jSONObject.optString("hash");
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("regionUrl");
                        if (optJSONObject2 != null) {
                            C2940y.m12187c().mo10231d(optJSONObject2);
                        }
                        C2911a.m12050t(optJSONObject.toString());
                        C2911a.m12047q(optString);
                    }
                    C2911a.m12019A(System.currentTimeMillis() + 86400000 + ((long) new Random().nextInt(86400000)));
                }
            } catch (JSONException e) {
                C2933s.m12141c("CommonConfigUpdater", "saveCommonCloudData: " + e.toString());
            }
        }
    }

    /* renamed from: b */
    public static void m11124b() {
        if (m11126d()) {
            m11127e();
        } else {
            C2933s.m12141c("CommonConfigUpdater", "CommonConfigUpdater Does not meet prerequisites for request");
        }
    }

    /* renamed from: c */
    public static Map<Integer, Integer> m11125c() {
        try {
            if (!f10308a.isEmpty()) {
                return f10308a;
            }
            String D = C2911a.m12022D();
            if (!TextUtils.isEmpty(D)) {
                JSONArray optJSONArray = new JSONObject(D).optJSONArray("levels");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("l");
                    int optInt2 = jSONObject.optInt("t");
                    if (optInt > 0 && optInt2 > 0) {
                        f10308a.put(Integer.valueOf(optInt), Integer.valueOf(optInt2));
                    }
                }
            }
            return f10308a.isEmpty() ? m11128f() : f10308a;
        } catch (Exception e) {
            C2933s.m12141c("CommonConfigUpdater", "getLevelIntervalConfig: " + e.toString());
        }
    }

    /* renamed from: d */
    private static boolean m11126d() {
        if (!C2898b.m11953b()) {
            C2933s.m12144f("CommonConfigUpdater", "net is not connected!");
            return false;
        } else if (TextUtils.isEmpty(C2911a.m12022D())) {
            return true;
        } else {
            long z = C2911a.m12056z();
            return z < System.currentTimeMillis() || z - System.currentTimeMillis() > 172800000;
        }
    }

    /* renamed from: e */
    private static void m11127e() {
        if (!C2934t.m12159k("CommonConfigUpdater")) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("oa", C2964a.m12260b().mo10279a(C2874a.m11876a()));
                hashMap.put("ov", C2934t.m12160l());
                hashMap.put("ob", C2934t.m12161m());
                hashMap.put("ii", C2934t.m12149a() ? "1" : "0");
                hashMap.put("sv", "1.1.6");
                hashMap.put("av", C2934t.m12166r());
                hashMap.put("ml", C2920j.m12094i());
                hashMap.put("re", C2934t.m12150b());
                hashMap.put("platform", "Android");
                String g = C2940y.m12187c().mo10234g();
                String e = C2897a.m11951e(g, hashMap, true);
                C2933s.m12141c("CommonConfigUpdater", "url:" + g + " response:" + e);
                m11123a(e);
            } catch (IOException e2) {
                C2933s.m12141c("CommonConfigUpdater", "requestCloudData: " + e2.toString());
            }
        }
    }

    /* renamed from: f */
    private static HashMap<Integer, Integer> m11128f() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 5000);
        hashMap.put(2, 15000);
        hashMap.put(3, 900000);
        return hashMap;
    }
}
