package com.miui.compass;

import android.app.ActivityManager;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p088o0.C2487a;
import p088o0.C2488b;
import p094p0.C2536b;

/* renamed from: com.miui.compass.z */
public class C1445z {

    /* renamed from: a */
    private static boolean f5655a = false;

    /* renamed from: b */
    private static boolean f5656b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f5657c = new AtomicBoolean(false);

    /* renamed from: d */
    private static List<C2487a> f5658d = new ArrayList();

    /* renamed from: e */
    private static boolean f5659e = false;

    /* renamed from: com.miui.compass.z$a */
    class C1446a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f5660d;

        C1446a(boolean z) {
            this.f5660d = z;
        }

        public void run() {
            C1445z.f5657c.set(this.f5660d);
        }
    }

    /* renamed from: b */
    public static void m6431b(Context context) {
        f5656b = ActivityManager.isUserAMonkey();
        boolean e = C2536b.m10781e(context);
        f5655a = e;
        if (e && !f5656b) {
            f5658d.clear();
            f5658d.add(new C2488b());
            f5659e = false;
            for (C2487a b : f5658d) {
                b.mo9617b(context);
            }
            f5659e = true;
        }
    }

    /* renamed from: c */
    public static void m6432c(boolean z) {
        if (!f5659e) {
            Log.e("Compass:StatUtils", "setNetworkAccessEnabled: sdk not init, return");
        } else if (!f5657c.get() && z) {
            try {
                AsyncTask.execute(new C1446a(z));
            } catch (Exception e) {
                Log.e("Compass:StatUtils", Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: d */
    public static void m6433d(String str, String str2, Map<String, Object> map) {
        if (f5655a && !f5656b) {
            for (C2487a a : f5658d) {
                a.mo9616a(str2, str, map);
            }
        }
    }
}
