package p140y0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import p130w0.C2874a;

/* renamed from: y0.f */
public class C2916f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f11089d = "f";

    /* renamed from: e */
    private static volatile C2916f f11090e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f11091a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Handler f11092b = new C2917g(this, Looper.getMainLooper());

    /* renamed from: c */
    private BroadcastReceiver f11093c = new C2918h(this);

    private C2916f() {
        Context a = C2874a.m11876a();
        this.f11091a = a;
        m12077c(a);
    }

    /* renamed from: b */
    public static C2916f m12076b() {
        if (f11090e == null) {
            synchronized (C2916f.class) {
                if (f11090e == null) {
                    f11090e = new C2916f();
                }
            }
        }
        return f11090e;
    }

    /* renamed from: c */
    private void m12077c(Context context) {
        if (context != null) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.xiaomi.onetrack.DEBUG");
                context.registerReceiver(this.f11093c, intentFilter, "com.xiaomi.onetrack.permissions.DEBUG_MODE", (Handler) null);
            } catch (Exception e) {
                String str = f11089d;
                C2933s.m12141c(str, "registerDebugModeReceiver: " + e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m12078d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("result");
            boolean optBoolean = jSONObject.optBoolean("success");
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            if (optInt != 0 || !optBoolean) {
                bundle.putString("hint", optString);
            } else {
                bundle.putString("hint", optString2);
            }
            obtain.setData(bundle);
            this.f11092b.sendMessage(obtain);
        } catch (JSONException e) {
            C2933s.m12144f(f11089d, e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m12079e(String str, String str2, String str3) {
        C2925l.m12112a(new C2919i(this, str, str2, str3));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m12084j(String str) {
        Toast.makeText(this.f11091a, str, 1).show();
    }
}
