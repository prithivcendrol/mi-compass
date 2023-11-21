package p120u0;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;
import p130w0.C2874a;
import p135x0.C2897a;
import p140y0.C2911a;
import p140y0.C2933s;
import p140y0.C2934t;
import p140y0.C2940y;

/* renamed from: u0.f */
public class C2735f {

    /* renamed from: d */
    public static final JSONObject f10528d = new JSONObject();

    /* renamed from: a */
    private Context f10529a;

    /* renamed from: b */
    private JSONObject f10530b;

    /* renamed from: c */
    private String[] f10531c;

    /* renamed from: u0.f$a */
    private static final class C2736a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2735f f10532a = new C2735f();
    }

    private C2735f() {
        this.f10530b = null;
        this.f10531c = new String[2];
        this.f10529a = C2874a.m11876a();
    }

    /* renamed from: a */
    public static C2735f m11403a() {
        return C2736a.f10532a;
    }

    /* renamed from: d */
    private void m11404d() {
        if (C2933s.f11129a) {
            C2933s.m12141c("SecretKeyManager", (TextUtils.isEmpty(this.f10531c[0]) || TextUtils.isEmpty(this.f10531c[1])) ? "key or sid is invalid!" : "key  and sid is valid! ");
        }
    }

    /* renamed from: e */
    private JSONObject m11405e() {
        JSONObject jSONObject = this.f10530b;
        if (jSONObject == null && (jSONObject = m11406f()) != null) {
            this.f10530b = jSONObject;
        }
        return jSONObject == null ? mo9973c() : jSONObject;
    }

    /* renamed from: f */
    private JSONObject m11406f() {
        try {
            String v = C2911a.m12052v();
            if (TextUtils.isEmpty(v)) {
                return null;
            }
            return new JSONObject(C2731b.m11386e(this.f10529a, v));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public synchronized String[] mo9972b() {
        JSONObject e = m11405e();
        this.f10531c[0] = e != null ? e.optString("key") : "";
        this.f10531c[1] = e != null ? e.optString("sid") : "";
        m11404d();
        return this.f10531c;
    }

    /* renamed from: c */
    public JSONObject mo9973c() {
        try {
            if (C2934t.m12159k("SecretKeyManager")) {
                return f10528d;
            }
            byte[] b = C2730a.m11379b();
            String a = C2732c.m11387a(C2734e.m11402b(b));
            HashMap hashMap = new HashMap();
            hashMap.put("secretKey", a);
            String e = C2897a.m11951e(C2940y.m12187c().mo10235h(), hashMap, true);
            if (!TextUtils.isEmpty(e)) {
                JSONObject jSONObject = new JSONObject(e);
                int optInt = jSONObject.optInt("code");
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optInt == 0 && optJSONObject != null) {
                    String optString = optJSONObject.optString("key");
                    String optString2 = optJSONObject.optString("sid");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        String a2 = C2732c.m11387a(C2730a.m11381d(C2732c.m11389c(optString), b));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("key", a2);
                        jSONObject2.put("sid", optString2);
                        this.f10530b = jSONObject2;
                        C2911a.m12038h(C2731b.m11382a(this.f10529a, jSONObject2.toString()));
                        C2911a.m12054x(System.currentTimeMillis());
                    }
                }
            }
            return this.f10530b;
        } catch (Exception e2) {
            C2933s.m12144f("SecretKeyManager", "requestSecretData: " + e2.toString());
        }
    }
}
