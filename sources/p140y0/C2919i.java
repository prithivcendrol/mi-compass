package p140y0;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import java.util.HashMap;
import p135x0.C2897a;
import p145z0.C2964a;

/* renamed from: y0.i */
class C2919i implements Runnable {

    /* renamed from: d */
    final /* synthetic */ String f11096d;

    /* renamed from: e */
    final /* synthetic */ String f11097e;

    /* renamed from: f */
    final /* synthetic */ String f11098f;

    /* renamed from: g */
    final /* synthetic */ C2916f f11099g;

    C2919i(C2916f fVar, String str, String str2, String str3) {
        this.f11099g = fVar;
        this.f11096d = str;
        this.f11097e = str2;
        this.f11098f = str3;
    }

    public void run() {
        String str;
        try {
            if (this.f11096d.contains("http://")) {
                str = this.f11096d + "/api/open/device/writeBack";
            } else {
                str = "http://" + this.f11096d + "/api/open/device/writeBack";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("instanceId", C2932r.m12132a().mo10228d());
            hashMap.put("imei", C2920j.m12091f(this.f11099g.f11091a));
            hashMap.put("oaid", C2964a.m12260b().mo10279a(this.f11099g.f11091a));
            hashMap.put("projectId", this.f11097e);
            hashMap.put("user", this.f11098f);
            String e = C2897a.m11951e(str, hashMap, false);
            if (!TextUtils.isEmpty(e)) {
                if (!"".equals(e)) {
                    this.f11099g.m12078d(e);
                    return;
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("hint", "注册信息失败，请检查是网络环境是否在内网");
            obtain.setData(bundle);
            this.f11099g.f11092b.sendMessage(obtain);
        } catch (Exception e2) {
            C2933s.m12144f(C2916f.f11089d, e2.getMessage());
        }
    }
}
