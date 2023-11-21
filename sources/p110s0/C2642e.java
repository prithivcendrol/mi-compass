package p110s0;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p115t0.C2665a;
import p130w0.C2874a;
import p140y0.C2933s;

/* renamed from: s0.e */
public class C2642e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2641d f10309a;

    /* renamed from: b */
    private ConcurrentHashMap<String, C2646h> f10310b;

    /* renamed from: c */
    private AtomicBoolean f10311c;

    /* renamed from: s0.e$a */
    private static class C2643a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2642e f10312a = new C2642e((C2644f) null);
    }

    private C2642e() {
        this.f10310b = new ConcurrentHashMap<>();
        this.f10311c = new AtomicBoolean(false);
        this.f10309a = new C2641d(C2874a.m11876a());
    }

    /* synthetic */ C2642e(C2644f fVar) {
        this();
    }

    /* renamed from: c */
    public static C2642e m11130c() {
        return C2643a.f10312a;
    }

    /* renamed from: h */
    private JSONObject m11132h(String str, String str2) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (this.f10310b.get(str) == null || this.f10311c.get()) {
                    mo9915i(str);
                }
                C2646h hVar = this.f10310b.get(str);
                if (!(hVar == null || (jSONObject = hVar.f10320d) == null || (optJSONArray = jSONObject.optJSONArray("events")) == null)) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (TextUtils.equals(str2, jSONObject2.optString("event"))) {
                            if (C2933s.f11129a) {
                                C2933s.m12141c("ConfigDbManager", "getEventConfig:" + jSONObject2.toString());
                            }
                            return jSONObject2;
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("ConfigDbManager", "getEventConfig error: " + e.toString());
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090 A[SYNTHETIC, Splitter:B:30:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa A[SYNTHETIC, Splitter:B:36:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11133j(java.util.ArrayList<p110s0.C2646h> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "events_cloud"
            java.lang.String r1 = "Exception while endTransaction:"
            java.lang.String r2 = "ConfigDbManager"
            r3 = 0
            s0.d r4 = r14.f10309a     // Catch:{ Exception -> 0x0088 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x0088 }
            r4.beginTransaction()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            java.lang.String r5 = "app_id=?"
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
        L_0x0016:
            boolean r6 = r15.hasNext()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            if (r6 == 0) goto L_0x0072
            java.lang.Object r6 = r15.next()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            s0.h r6 = (p110s0.C2646h) r6     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r7.<init>()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            java.lang.String r8 = "app_id"
            java.lang.String r9 = r6.f10317a     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            java.lang.String r8 = "timestamp"
            long r9 = r6.f10318b     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            org.json.JSONObject r8 = r6.f10320d     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            if (r8 == 0) goto L_0x0046
            java.lang.String r9 = "cloud_data"
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r7.put(r9, r8)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
        L_0x0046:
            java.lang.String r8 = "data_hash"
            java.lang.String r9 = r6.f10319c     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            java.lang.String r10 = r6.f10317a     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r11 = 0
            r9[r11] = r10     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            long r9 = android.database.DatabaseUtils.queryNumEntries(r4, r0, r5, r9)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0069
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            java.lang.String r6 = r6.f10317a     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r9[r11] = r6     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r4.update(r0, r7, r5, r9)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            goto L_0x006c
        L_0x0069:
            r4.insert(r0, r3, r7)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r6 = r14.f10311c     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r6.set(r8)     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            goto L_0x0016
        L_0x0072:
            r4.setTransactionSuccessful()     // Catch:{ Exception -> 0x0083, all -> 0x0080 }
            r4.endTransaction()     // Catch:{ Exception -> 0x0079 }
            goto L_0x00a7
        L_0x0079:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x009a
        L_0x0080:
            r15 = move-exception
            r3 = r4
            goto L_0x00a8
        L_0x0083:
            r15 = move-exception
            r3 = r4
            goto L_0x0089
        L_0x0086:
            r15 = move-exception
            goto L_0x00a8
        L_0x0088:
            r15 = move-exception
        L_0x0089:
            java.lang.String r0 = "updateToDb error: "
            p140y0.C2933s.m12145g(r2, r0, r15)     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x00a7
            r3.endTransaction()     // Catch:{ Exception -> 0x0094 }
            goto L_0x00a7
        L_0x0094:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x009a:
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            p140y0.C2933s.m12144f(r2, r15)
        L_0x00a7:
            return
        L_0x00a8:
            if (r3 == 0) goto L_0x00c1
            r3.endTransaction()     // Catch:{ Exception -> 0x00ae }
            goto L_0x00c1
        L_0x00ae:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p140y0.C2933s.m12144f(r2, r0)
        L_0x00c1:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p110s0.C2642e.m11133j(java.util.ArrayList):void");
    }

    /* renamed from: a */
    public int mo9911a(String str, String str2, String str3, int i) {
        try {
            JSONObject h = m11132h(str, str2);
            if (h != null) {
                return h.getInt(str3);
            }
            C2933s.m12141c("ConfigDbManager", "config not available, use default value");
            return i;
        } catch (Exception e) {
            C2933s.m12144f("ConfigDbManager", "getInt: " + e.toString());
            return i;
        }
    }

    /* renamed from: d */
    public void mo9912d(ArrayList<C2646h> arrayList) {
        C2665a.m11157b(new C2644f(this, arrayList));
    }

    /* renamed from: f */
    public boolean mo9913f(String str, String str2) {
        JSONObject jSONObject;
        try {
            C2646h l = mo9917l(str);
            if (l == null || (jSONObject = l.f10320d) == null || !jSONObject.has(str2)) {
                return false;
            }
            return l.f10320d.optBoolean(str2);
        } catch (Exception e) {
            C2933s.m12144f("ConfigDbManager", "getAppLevelBoolean" + e.toString());
            return false;
        }
    }

    /* renamed from: g */
    public boolean mo9914g(String str, String str2, String str3, boolean z) {
        try {
            JSONObject h = m11132h(str, str2);
            if (h != null) {
                return h.getBoolean(str3);
            }
            C2933s.m12141c("ConfigDbManager", "config not available, use default value");
            return z;
        } catch (Exception e) {
            C2933s.m12144f("ConfigDbManager", "getBoolean: " + e.toString());
            return z;
        }
    }

    /* renamed from: i */
    public void mo9915i(String str) {
        FutureTask futureTask = new FutureTask(new C2645g(this, str));
        C2665a.m11157b(futureTask);
        try {
            C2646h hVar = (C2646h) futureTask.get();
            if (hVar != null) {
                this.f10310b.put(str, hVar);
                this.f10311c.set(false);
                if (C2933s.f11129a) {
                    C2933s.m12141c("ConfigDbManager", "getConfig   appId :" + str + " config: " + hVar.toString());
                }
            }
        } catch (Exception e) {
            C2933s.m12144f("ConfigDbManager", "getConfig error: " + e.toString());
        }
    }

    /* renamed from: k */
    public String mo9916k(String str) {
        C2646h l = mo9917l(str);
        return l != null ? l.f10319c : "";
    }

    /* renamed from: l */
    public C2646h mo9917l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f10310b.get(str) == null || this.f10311c.get()) {
            mo9915i(str);
        }
        return this.f10310b.get(str);
    }
}
