package p105r0;

import android.content.Context;
import java.io.StringWriter;
import org.json.JSONObject;
import p100q0.C2561b;
import p100q0.C2568g;
import p130w0.C2874a;
import p130w0.C2875b;
import p140y0.C2911a;
import p140y0.C2920j;
import p140y0.C2934t;
import p140y0.C2935u;

/* renamed from: r0.h */
public class C2600h {
    /* renamed from: a */
    public static String m11035a(long j, String str, long j2, long j3, C2561b bVar, C2568g.C2570b bVar2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("H", C2875b.m11882a("onetrack_upgrade", bVar, bVar2));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("last_ver_code", j);
        jSONObject2.put("last_ver_name", str);
        jSONObject2.put("cur_ver_code", j2);
        jSONObject2.put("last_upgrade_time", j3);
        jSONObject.put("B", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static String m11036b(String str, String str2, long j, C2561b bVar, C2568g.C2570b bVar2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("H", C2875b.m11882a(str2, bVar, bVar2));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("class", str);
        jSONObject3.put("type", 2);
        jSONObject3.put("duration", j);
        jSONObject2.put("B", C2935u.m12172d(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* renamed from: c */
    public static String m11037c(String str, String str2, String str3, String str4, String str5, C2561b bVar, C2568g.C2570b bVar2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject a = C2875b.m11882a("onetrack_bug_report", bVar, bVar2);
        if (str5 != null) {
            a.put(C2875b.C2876a.f10989m, str5);
        }
        jSONObject2.put("H", a);
        JSONObject jSONObject3 = new JSONObject();
        new StringWriter().toString();
        jSONObject3.put("exception", str);
        jSONObject3.put("type", str3);
        jSONObject3.put("message", str2);
        jSONObject3.put("feature", str4);
        jSONObject2.put("B", C2935u.m12172d(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* renamed from: d */
    public static String m11038d(String str, String str2, C2561b bVar, C2568g.C2570b bVar2, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("H", C2875b.m11882a(str2, bVar, bVar2));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("class", str);
        jSONObject3.put("type", 1);
        jSONObject3.put("app_start", z);
        jSONObject2.put("B", C2935u.m12172d(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }

    /* renamed from: e */
    public static String m11039e(String str, JSONObject jSONObject, C2561b bVar, C2568g.C2570b bVar2, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("H", C2875b.m11882a(str, bVar, bVar2));
        jSONObject3.put("B", C2935u.m12172d(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }

    /* renamed from: f */
    public static String m11040f(C2561b bVar, C2568g.C2570b bVar2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("H", C2875b.m11882a("onetrack_dau", bVar, bVar2));
        JSONObject jSONObject3 = new JSONObject();
        Context a = C2874a.m11876a();
        boolean H = C2911a.m12026H();
        if (H) {
            C2911a.m12048r(false);
        }
        jSONObject3.put("first_open", H);
        if (!(C2934t.m12158j() ? C2934t.m12149a() : bVar.mo9811m())) {
            if (bVar.mo9809k()) {
                jSONObject3.put("imeis", C2920j.m12102q(a));
            }
            if (bVar.mo9810l()) {
                jSONObject3.put("imsis", C2920j.m12105t(a));
            }
        }
        jSONObject3.put("config_status", C2590a.m11003a(bVar));
        jSONObject2.put("B", C2935u.m12172d(jSONObject3, jSONObject));
        return jSONObject2.toString();
    }
}
