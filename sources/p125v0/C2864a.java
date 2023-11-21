package p125v0;

import org.json.JSONObject;
import p110s0.C2642e;
import p130w0.C2875b;
import p140y0.C2933s;

/* renamed from: v0.a */
public class C2864a extends C2875b {
    public C2864a(String str, String str2, String str3, String str4) {
        try {
            mo10162d(str);
            mo10168l(str3);
            mo10166j(str2);
            mo10165i(System.currentTimeMillis());
            mo10163e(new JSONObject(str4));
            mo10161c(C2642e.m11130c().mo9911a(str, str3, "level", 1));
        } catch (Exception e) {
            C2933s.m12144f("CustomEvent", "CustomEvent error:" + e.toString());
        }
    }
}
