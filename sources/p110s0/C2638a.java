package p110s0;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p130w0.C2874a;
import p135x0.C2897a;
import p135x0.C2898b;
import p140y0.C2920j;
import p140y0.C2925l;
import p140y0.C2933s;
import p140y0.C2934t;
import p140y0.C2940y;
import p145z0.C2964a;

/* renamed from: s0.a */
public class C2638a {

    /* renamed from: a */
    private static boolean f10306a = false;

    /* renamed from: a */
    private static JSONArray m11110a(JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        while (jSONArray2 != null) {
            try {
                if (i >= jSONArray2.length()) {
                    break;
                }
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                String optString = optJSONObject.optString("event");
                int i2 = 0;
                while (true) {
                    if (jSONArray == null || i2 >= jSONArray.length()) {
                        break;
                    } else if (TextUtils.equals(optString, jSONArray.optJSONObject(i2).optString("event"))) {
                        jSONArray.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!optJSONObject.has("status") || (optJSONObject.has("status") && !TextUtils.equals(optJSONObject.optString("status"), "deleted"))) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    jSONArray.put(optJSONObject);
                }
                i++;
            } catch (Exception e) {
                C2933s.m12144f("AppConfigUpdater", "mergeEventsElement error:" + e.toString());
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private static JSONObject m11111b(String str, JSONObject jSONObject) {
        try {
            C2646h l = C2642e.m11130c().mo9917l(str);
            jSONObject.put("events", m11110a(l != null ? l.f10320d.optJSONArray("events") : null, jSONObject.optJSONArray("events")));
            return jSONObject;
        } catch (Exception e) {
            C2933s.m12144f("AppConfigUpdater", "mergeConfig: " + e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static void m11112c(String str) {
        C2925l.m12112a(new C2639b(str));
    }

    /* renamed from: d */
    public static void m11113d(String str, List<String> list) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("code") == 0) {
                    m11117h(jSONObject.optJSONObject("data").optJSONArray("apps"), list);
                }
            } catch (Exception e) {
                C2933s.m12141c("AppConfigUpdater", "saveAppCloudData: " + e.toString());
            }
        }
    }

    /* renamed from: e */
    private static void m11114e(List<String> list) {
        if (!C2934t.m12159k("AppConfigUpdater") && !f10306a) {
            HashMap hashMap = new HashMap();
            try {
                f10306a = true;
                hashMap.put("oa", C2964a.m12260b().mo10279a(C2874a.m11876a()));
                hashMap.put("ov", C2934t.m12160l());
                hashMap.put("ob", C2934t.m12161m());
                hashMap.put("ii", C2934t.m12149a() ? "1" : "0");
                hashMap.put("sv", "1.1.6");
                hashMap.put("av", C2934t.m12166r());
                hashMap.put("ml", C2920j.m12094i());
                hashMap.put("re", C2934t.m12150b());
                hashMap.put("ail", m11119j(list));
                hashMap.put("sender", C2874a.m11880e());
                hashMap.put("platform", "Android");
                String f = C2940y.m12187c().mo10233f();
                C2933s.m12141c("AppConfigUpdater", "pullData:" + f);
                String e = C2897a.m11951e(f, hashMap, true);
                C2933s.m12141c("AppConfigUpdater", "response:" + e);
                m11113d(e, list);
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                f10306a = false;
                throw th;
            }
            f10306a = false;
        }
    }

    /* renamed from: f */
    private static void m11115f(List<String> list, long j) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C2646h hVar = new C2646h();
                hVar.f10317a = list.get(i);
                hVar.f10318b = j;
                arrayList.add(hVar);
            }
            C2642e.m11130c().mo9912d(arrayList);
        } catch (Exception e) {
            C2933s.m12144f("AppConfigUpdater", "handleError" + e.toString());
        }
    }

    /* renamed from: g */
    private static void m11116g(List<String> list, long j, List<String> list2) {
        try {
            if (list.size() != list2.size()) {
                list.removeAll(list2);
                m11115f(list, j);
            }
        } catch (Exception e) {
            C2933s.m12144f("AppConfigUpdater", "handleInvalidAppIds error:" + e.toString());
        }
    }

    /* renamed from: h */
    private static void m11117h(JSONArray jSONArray, List<String> list) {
        long currentTimeMillis = System.currentTimeMillis() + 86400000 + ((long) new Random().nextInt(86400000));
        if (jSONArray == null || jSONArray.length() <= 0) {
            m11115f(list, currentTimeMillis);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            int optInt = optJSONObject != null ? optJSONObject.optInt("type") : -1;
            String optString = optJSONObject != null ? optJSONObject.optString("appId") : "";
            if (optInt == 0 || optInt == 1) {
                m11118i(optJSONObject, currentTimeMillis);
            } else if (optInt == 2) {
                m11121l(optJSONObject, currentTimeMillis);
            } else {
                C2933s.m12141c("AppConfigUpdater", "updateDataToDb do nothing!");
            }
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        m11116g(list, currentTimeMillis, arrayList);
    }

    /* renamed from: i */
    private static void m11118i(JSONObject jSONObject, long j) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            C2646h hVar = new C2646h();
            hVar.f10319c = jSONObject.optString("hash");
            hVar.f10317a = jSONObject.optString("appId");
            hVar.f10318b = j;
            if (jSONObject.has("events")) {
                hVar.f10320d = jSONObject;
            }
            arrayList.add(hVar);
        }
        if (!arrayList.isEmpty()) {
            C2642e.m11130c().mo9912d(arrayList);
        } else {
            C2933s.m12141c("AppConfigUpdater", "handleFullOrNoNewData no configuration can be updated!");
        }
    }

    /* renamed from: j */
    private static String m11119j(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                jSONObject.put("appId", str);
                jSONObject.put("hash", C2642e.m11130c().mo9916k(str));
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONArray.toString();
    }

    /* renamed from: k */
    public static void m11120k(String str) {
        if (m11122m(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m11114e(arrayList);
            return;
        }
        C2933s.m12141c("AppConfigUpdater", "AppConfigUpdater Does not meet prerequisites for request");
    }

    /* renamed from: l */
    private static void m11121l(JSONObject jSONObject, long j) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || !jSONObject.has("events")) {
            C2933s.m12141c("AppConfigUpdater", "handleIncrementalUpdate config is not change!");
        } else {
            C2646h hVar = new C2646h();
            hVar.f10319c = jSONObject.optString("hash");
            String optString = jSONObject.optString("appId");
            hVar.f10317a = optString;
            hVar.f10318b = j;
            hVar.f10320d = m11111b(optString, jSONObject);
            arrayList.add(hVar);
        }
        if (!arrayList.isEmpty()) {
            C2642e.m11130c().mo9912d(arrayList);
        } else {
            C2933s.m12141c("AppConfigUpdater", "handleIncrementalUpdate no configuration can be updated!");
        }
    }

    /* renamed from: m */
    private static boolean m11122m(String str) {
        if (!C2898b.m11953b()) {
            C2933s.m12141c("AppConfigUpdater", "net is not connected!");
            return false;
        }
        C2646h l = C2642e.m11130c().mo9917l(str);
        if (l == null) {
            return true;
        }
        long j = l.f10318b;
        return j < System.currentTimeMillis() || j - System.currentTimeMillis() > 172800000;
    }
}
