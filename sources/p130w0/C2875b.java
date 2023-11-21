package p130w0;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
import p100q0.C2561b;
import p100q0.C2568g;
import p135x0.C2898b;
import p140y0.C2911a;
import p140y0.C2913c;
import p140y0.C2920j;
import p140y0.C2932r;
import p140y0.C2933s;
import p140y0.C2934t;
import p145z0.C2964a;

/* renamed from: w0.b */
public class C2875b {

    /* renamed from: a */
    private String f10970a;

    /* renamed from: b */
    private String f10971b;

    /* renamed from: c */
    private String f10972c;

    /* renamed from: d */
    private int f10973d;

    /* renamed from: e */
    private JSONObject f10974e;

    /* renamed from: f */
    private long f10975f;

    /* renamed from: w0.b$a */
    public static class C2876a {

        /* renamed from: A */
        public static String f10976A = "ot_test_env";

        /* renamed from: a */
        public static String f10977a = "event";

        /* renamed from: b */
        public static String f10978b = "imei";

        /* renamed from: c */
        public static String f10979c = "oaid";

        /* renamed from: d */
        public static String f10980d = "gaid";

        /* renamed from: e */
        public static String f10981e = "instance_id";

        /* renamed from: f */
        public static String f10982f = "mfrs";

        /* renamed from: g */
        public static String f10983g = "model";

        /* renamed from: h */
        public static String f10984h = "platform";

        /* renamed from: i */
        public static String f10985i = "miui";

        /* renamed from: j */
        public static String f10986j = "build";

        /* renamed from: k */
        public static String f10987k = "os_ver";

        /* renamed from: l */
        public static String f10988l = "app_id";

        /* renamed from: m */
        public static String f10989m = "app_ver";

        /* renamed from: n */
        public static String f10990n = "pkg";

        /* renamed from: o */
        public static String f10991o = "channel";

        /* renamed from: p */
        public static String f10992p = "e_ts";

        /* renamed from: q */
        public static String f10993q = "tz";

        /* renamed from: r */
        public static String f10994r = "net";

        /* renamed from: s */
        public static String f10995s = "region";

        /* renamed from: t */
        public static String f10996t = "plugin_id";

        /* renamed from: u */
        public static String f10997u = "sdk_ver";

        /* renamed from: v */
        public static String f10998v = "uid";

        /* renamed from: w */
        public static String f10999w = "uid_type";

        /* renamed from: x */
        public static String f11000x = "sid";

        /* renamed from: y */
        public static String f11001y = "sdk_mode";

        /* renamed from: z */
        public static String f11002z = "ot_first_day";
    }

    /* renamed from: a */
    public static JSONObject m11882a(String str, C2561b bVar, C2568g.C2570b bVar2) {
        return m11883b(str, bVar, bVar2, "");
    }

    /* renamed from: b */
    public static JSONObject m11883b(String str, C2561b bVar, C2568g.C2570b bVar2, String str2) {
        JSONObject jSONObject = new JSONObject();
        Context a = C2874a.m11876a();
        jSONObject.put(C2876a.f10977a, str);
        if (!(C2934t.m12158j() ? C2934t.m12149a() : bVar.mo9811m())) {
            jSONObject.put(C2876a.f10978b, C2920j.m12091f(a));
            jSONObject.put(C2876a.f10979c, C2964a.m12260b().mo10279a(a));
        } else if (bVar2 != null && bVar2.mo9825a(str)) {
            String p = C2920j.m12101p(a);
            if (!TextUtils.isEmpty(p)) {
                jSONObject.put(C2876a.f10980d, p);
            }
        }
        jSONObject.put(C2876a.f10981e, C2932r.m12132a().mo10228d());
        jSONObject.put(C2876a.f10982f, C2920j.m12096k());
        jSONObject.put(C2876a.f10983g, C2920j.m12094i());
        jSONObject.put(C2876a.f10984h, "Android");
        jSONObject.put(C2876a.f10985i, C2934t.m12165q());
        jSONObject.put(C2876a.f10986j, C2934t.m12163o());
        jSONObject.put(C2876a.f10987k, C2934t.m12166r());
        jSONObject.put(C2876a.f10989m, C2874a.m11878c());
        jSONObject.put(C2876a.f10992p, System.currentTimeMillis());
        jSONObject.put(C2876a.f10993q, C2934t.m12162n());
        jSONObject.put(C2876a.f10994r, C2898b.m11952a(a).toString());
        jSONObject.put(C2876a.f10995s, C2934t.m12150b());
        jSONObject.put(C2876a.f10997u, "1.1.6");
        jSONObject.put(C2876a.f10988l, bVar.mo9800b());
        jSONObject.put(C2876a.f10990n, C2874a.m11880e());
        jSONObject.put(C2876a.f10991o, !TextUtils.isEmpty(bVar.mo9801c()) ? bVar.mo9801c() : "default");
        m11885g(jSONObject, bVar, str2);
        m11884f(jSONObject, a);
        jSONObject.put(C2876a.f11000x, C2934t.m12167s());
        jSONObject.put(C2876a.f11001y, (bVar.mo9803e() != null ? bVar.mo9803e() : C2568g.C2571c.APP).mo9829a());
        jSONObject.put(C2876a.f11002z, C2913c.m12061c(C2911a.m12032b()));
        if (C2933s.f11131c) {
            jSONObject.put(C2876a.f10976A, true);
        }
        return jSONObject;
    }

    /* renamed from: f */
    private static void m11884f(JSONObject jSONObject, Context context) {
        String J = C2911a.m12028J();
        String K = C2911a.m12029K();
        if (!TextUtils.isEmpty(J) && !TextUtils.isEmpty(K)) {
            jSONObject.put(C2876a.f10998v, J);
            jSONObject.put(C2876a.f10999w, K);
        }
    }

    /* renamed from: g */
    private static void m11885g(JSONObject jSONObject, C2561b bVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(C2876a.f10996t, str);
        } else {
            jSONObject.put(C2876a.f10996t, bVar.mo9804f());
        }
    }

    /* renamed from: c */
    public void mo10161c(int i) {
        this.f10973d = i;
    }

    /* renamed from: d */
    public void mo10162d(String str) {
        this.f10970a = str;
    }

    /* renamed from: e */
    public void mo10163e(JSONObject jSONObject) {
        this.f10974e = jSONObject;
    }

    /* renamed from: h */
    public String mo10164h() {
        return this.f10970a;
    }

    /* renamed from: i */
    public void mo10165i(long j) {
        this.f10975f = j;
    }

    /* renamed from: j */
    public void mo10166j(String str) {
        this.f10971b = str;
    }

    /* renamed from: k */
    public String mo10167k() {
        return this.f10971b;
    }

    /* renamed from: l */
    public void mo10168l(String str) {
        this.f10972c = str;
    }

    /* renamed from: m */
    public String mo10169m() {
        return this.f10972c;
    }

    /* renamed from: n */
    public int mo10170n() {
        return this.f10973d;
    }

    /* renamed from: o */
    public JSONObject mo10171o() {
        return this.f10974e;
    }

    /* renamed from: p */
    public boolean mo10172p() {
        try {
            JSONObject jSONObject = this.f10974e;
            return jSONObject != null && jSONObject.has("H") && this.f10974e.has("B") && !TextUtils.isEmpty(this.f10970a) && !TextUtils.isEmpty(this.f10971b);
        } catch (Exception e) {
            C2933s.m12145g("Event", "check event isValid error, ", e);
            return false;
        }
    }
}
