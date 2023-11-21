package p130w0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;
import p110s0.C2640c;
import p140y0.C2925l;
import p140y0.C2933s;

/* renamed from: w0.e */
public class C2879e {

    /* renamed from: c */
    private static C2879e f11007c;

    /* renamed from: d */
    private static BroadcastReceiver f11008d = new C2883i();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AtomicBoolean f11009a = new AtomicBoolean(false);

    /* renamed from: b */
    private BroadcastReceiver f11010b = new C2881g(this);

    private C2879e(Context context) {
        C2925l.m12112a(new C2880f(this, context.getApplicationContext()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11900b() {
        C2640c.m11124b();
    }

    /* renamed from: c */
    public static void m11901c(Context context) {
        if (f11007c == null) {
            f11007c = new C2879e(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m11905g(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(f11008d, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11906h(Context context) {
        if (context != null) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(this.f11010b, intentFilter);
            } catch (Exception e) {
                C2933s.m12141c("OneTrackApp", "registerNetReceiver: " + e);
            }
        }
    }
}
