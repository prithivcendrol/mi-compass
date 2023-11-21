package p105r0;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p100q0.C2561b;
import p100q0.C2565e;
import p100q0.C2568g;
import p120u0.C2733d;
import p130w0.C2874a;
import p140y0.C2911a;
import p140y0.C2927n;
import p140y0.C2932r;
import p140y0.C2933s;
import p140y0.C2934t;
import p140y0.C2935u;

/* renamed from: r0.k */
public class C2603k {

    /* renamed from: h */
    private static ExecutorService f10230h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2601i f10231a;

    /* renamed from: b */
    private Context f10232b;

    /* renamed from: c */
    private C2602j f10233c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2561b f10234d;

    /* renamed from: e */
    private C2568g.C2569a f10235e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2568g.C2570b f10236f;

    /* renamed from: g */
    private BroadcastReceiver f10237g = new C2611s(this);

    public C2603k(Context context, C2561b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10232b = applicationContext;
        this.f10234d = bVar;
        m11061m(applicationContext);
        Log.d("OneTrackImp", "OneTrackImp init : " + bVar.toString());
    }

    /* renamed from: A */
    private boolean m11046A() {
        try {
            int componentEnabledSetting = C2874a.m11876a().getPackageManager().getComponentEnabledSetting(new ComponentName("com.miui.analytics", "com.miui.analytics.onetrack.OneTrackService"));
            return componentEnabledSetting == 1 || componentEnabledSetting == 0;
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "enable error:" + e.toString());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r1 = p130w0.C2874a.m11876a().getPackageManager().queryIntentServices(r1, 0);
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m11047B() {
        /*
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0033 }
            r1.<init>()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "com.miui.analytics"
            java.lang.String r3 = "com.miui.analytics.onetrack.OneTrackService"
            r1.setClassName(r2, r3)     // Catch:{ Exception -> 0x0033 }
            android.content.Context r2 = p130w0.C2874a.m11876a()     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x004e
            android.content.Context r2 = p130w0.C2874a.m11876a()     // Catch:{ Exception -> 0x0033 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x004e
            android.content.Context r2 = p130w0.C2874a.m11876a()     // Catch:{ Exception -> 0x0033 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x0033 }
            java.util.List r1 = r2.queryIntentServices(r1, r0)     // Catch:{ Exception -> 0x0033 }
            if (r1 == 0) goto L_0x004e
            int r1 = r1.size()     // Catch:{ Exception -> 0x0033 }
            if (r1 <= 0) goto L_0x004e
            r0 = 1
            return r0
        L_0x0033:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isServiceOnline: "
            r2.append(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "OneTrackImp"
            p140y0.C2933s.m12141c(r2, r1)
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p105r0.C2603k.m11047B():boolean");
    }

    /* renamed from: C */
    private static boolean m11048C() {
        try {
            int i = C2874a.m11876a().getPackageManager().getPackageInfo("com.miui.analytics", 0).versionCode;
            if (i >= 2020062900) {
                return true;
            }
            C2933s.m12141c("OneTrackImp", "system analytics version: " + i);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: D */
    private String m11049D() {
        StringBuilder sb = new StringBuilder();
        String b = this.f10234d.mo9800b();
        String f = this.f10234d.mo9804f();
        if (!TextUtils.isEmpty(b)) {
            sb.append(b);
        }
        if (!TextUtils.isEmpty(f)) {
            sb.append(f);
        }
        return C2733d.m11400j(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m11050E() {
        f10230h.execute(new C2610r(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m11051F() {
        try {
            if (this.f10234d.mo9803e() == C2568g.C2571c.APP) {
                long d = (long) C2874a.m11879d();
                String a = m11052a(d, C2874a.m11878c());
                String a2 = C2911a.m12031a();
                if (TextUtils.isEmpty(a2)) {
                    C2911a.m12020B(a);
                    return;
                }
                JSONObject jSONObject = new JSONObject(a2);
                long optLong = jSONObject.optLong("last_ver_code");
                String optString = jSONObject.optString("last_ver_name");
                if (optLong != d) {
                    C2911a.m12020B(a);
                    this.f10231a.mo9850a("onetrack_upgrade", C2600h.m11035a(optLong, optString, d, C2874a.m11881f(), this.f10234d, this.f10236f));
                }
            }
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "trackUpgradeEvent error: " + e.toString());
        }
    }

    /* renamed from: a */
    private String m11052a(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("last_ver_name", str);
        jSONObject.put("last_ver_code", j);
        return jSONObject.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11054c(String str, long j) {
        f10230h.execute(new C2608p(this, str, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11055f(String str, boolean z) {
        f10230h.execute(new C2607o(this, str, z));
    }

    /* renamed from: m */
    private void m11061m(Context context) {
        C2601i iVar;
        C2933s.m12140b();
        C2934t.m12157i(this.f10234d.mo9811m(), this.f10234d.mo9805g(), this.f10234d.mo9803e());
        if (f10230h == null) {
            f10230h = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        if (!C2934t.m12158j() || !m11073y() || !m11066r()) {
            C2932r.m12132a().mo10226b(Boolean.FALSE);
            iVar = new C2591b(context, this.f10234d);
        } else {
            C2932r.m12132a().mo10226b(Boolean.TRUE);
            iVar = new C2593d(context, this.f10234d);
        }
        this.f10231a = iVar;
        if (this.f10234d.mo9803e() == C2568g.C2571c.APP) {
            C2934t.m12156h(this.f10234d.mo9812n());
            m11065q(context);
            if (this.f10234d.mo9807i()) {
                C2565e.m10955q(context, this);
                if (!C2565e.m10954p()) {
                    C2602j jVar = new C2602j();
                    this.f10233c = jVar;
                    jVar.mo9864b();
                }
            }
        }
        m11071w(context);
        f10230h.execute(new C2604l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m11063o(boolean z) {
        f10230h.execute(new C2609q(this, z));
    }

    /* renamed from: q */
    private void m11065q(Context context) {
        ((Application) context).registerActivityLifecycleCallbacks(new C2605m(this));
    }

    /* renamed from: r */
    private boolean m11066r() {
        if (!this.f10234d.mo9812n()) {
            return true;
        }
        return TextUtils.equals(C2934t.m12151c(), this.f10234d.mo9805g());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public boolean m11067s(String str) {
        boolean g = C2935u.m12175g(str);
        if (!g) {
            C2933s.m12144f("OneTrackImp", String.format("Invalid eventname: %s. Eventname can only consist of numbers, letters, underscores ,and can not start with a number or \"onetrack_\" or \"ot_\"", new Object[]{str}));
        }
        return !g;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public JSONObject m11068t(String str) {
        try {
            C2568g.C2569a aVar = this.f10235e;
            JSONObject c = C2935u.m12171c(aVar != null ? aVar.mo9828a(str) : null, false);
            String b = C2927n.m12117b(m11049D());
            return C2935u.m12172d(c, !TextUtils.isEmpty(b) ? new JSONObject(b) : null);
        } catch (Exception e) {
            C2933s.m12144f("OneTrackImp", "getCommonProperty: " + e.toString());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m11070v() {
        f10230h.execute(new C2606n(this));
    }

    /* renamed from: w */
    private void m11071w(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(this.f10237g, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    private boolean m11073y() {
        if (C2933s.f11129a) {
            C2933s.m12141c("OneTrackImp", "enable:" + m11046A() + " isServiceOnline: " + m11047B());
        }
        return m11046A() && m11047B() && m11048C();
    }

    /* renamed from: d */
    public void mo9866d(String str, String str2, String str3, String str4, String str5) {
        f10230h.execute(new C2613u(this, str, str2, str3, str5, str4));
    }

    /* renamed from: e */
    public void mo9867e(String str, Map<String, Object> map) {
        f10230h.execute(new C2612t(this, str, map));
    }

    /* renamed from: g */
    public void mo9868g(C2568g.C2570b bVar) {
        this.f10236f = bVar;
    }
}
