package p105r0;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p082n0.C2411a;
import p100q0.C2561b;
import p130w0.C2874a;
import p140y0.C2933s;

/* renamed from: r0.f */
public class C2595f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2411a f10211a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AtomicBoolean f10212b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AtomicBoolean f10213c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f10214d;

    /* renamed from: e */
    private boolean f10215e;

    /* renamed from: f */
    private Context f10216f;

    /* renamed from: g */
    private C2598c f10217g;

    /* renamed from: h */
    private ServiceConnection f10218h;

    /* renamed from: i */
    private CopyOnWriteArrayList<C2597b> f10219i;

    /* renamed from: r0.f$a */
    private static class C2596a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C2595f f10220a = new C2595f((C2599g) null);
    }

    /* renamed from: r0.f$b */
    public interface C2597b {
        /* renamed from: b */
        void mo9855b();
    }

    /* renamed from: r0.f$c */
    private class C2598c extends Handler {
        public C2598c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                C2595f.this.m11023l();
            }
        }
    }

    private C2595f() {
        this.f10212b = new AtomicBoolean(false);
        this.f10213c = new AtomicBoolean(false);
        this.f10214d = new Object();
        this.f10215e = false;
        this.f10218h = new C2599g(this);
        this.f10219i = new CopyOnWriteArrayList<>();
        this.f10216f = C2874a.m11876a();
        this.f10217g = new C2598c(Looper.getMainLooper());
        this.f10215e = m11026o();
        m11020h();
    }

    /* synthetic */ C2595f(C2599g gVar) {
        this();
    }

    /* renamed from: c */
    public static C2595f m11018c() {
        return C2596a.f10220a;
    }

    /* renamed from: h */
    private void m11020h() {
        if (this.f10212b.get() || (this.f10213c.get() && this.f10211a != null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ensureService mConnecting: ");
            sb.append(this.f10212b.get());
            sb.append(" mIsBindSuccess:");
            sb.append(this.f10213c.get());
            sb.append(" mAnalytics: ");
            sb.append(this.f10211a == null ? 0 : 1);
            C2933s.m12141c("ServiceConnectManager", sb.toString());
            return;
        }
        m11022k();
    }

    /* renamed from: k */
    private void m11022k() {
        if (this.f10215e) {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.miui.analytics", "com.miui.analytics.onetrack.OneTrackService");
                this.f10216f.bindService(intent, this.f10218h, 1);
                this.f10212b.set(true);
                C2933s.m12141c("ServiceConnectManager", "bindService:  mConnecting: " + this.f10212b);
            } catch (Exception e) {
                C2933s.m12144f("ServiceConnectManager", "bindService: " + e.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11023l() {
        try {
            if (this.f10215e && this.f10213c.get()) {
                this.f10216f.unbindService(this.f10218h);
                this.f10213c.set(false);
                C2933s.m12141c("ServiceConnectManager", "unBindService  mIsBindSuccess:" + this.f10213c.get());
            }
        } catch (Exception e) {
            C2933s.m12141c("ServiceConnectManager", "unBindService: " + e.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = r4.f10216f.getPackageManager().queryIntentServices(r1, 0);
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11026o() {
        /*
            r4 = this;
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x002b }
            r1.<init>()     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.miui.analytics"
            java.lang.String r3 = "com.miui.analytics.onetrack.OneTrackService"
            r1.setClassName(r2, r3)     // Catch:{ Exception -> 0x002b }
            android.content.Context r2 = r4.f10216f     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0046
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0046
            android.content.Context r2 = r4.f10216f     // Catch:{ Exception -> 0x002b }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x002b }
            java.util.List r1 = r2.queryIntentServices(r1, r0)     // Catch:{ Exception -> 0x002b }
            if (r1 == 0) goto L_0x0046
            int r1 = r1.size()     // Catch:{ Exception -> 0x002b }
            if (r1 <= 0) goto L_0x0046
            r0 = 1
            return r0
        L_0x002b:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isServiceOnline: "
            r2.append(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ServiceConnectManager"
            android.util.Log.d(r2, r1)
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p105r0.C2595f.m11026o():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m11027p() {
        Iterator<C2597b> it = this.f10219i.iterator();
        while (it.hasNext()) {
            it.next().mo9855b();
        }
    }

    /* renamed from: d */
    public void mo9857d(int i) {
        if (i == 2) {
            this.f10217g.sendEmptyMessageDelayed(1, 5000);
        } else if (this.f10217g.hasMessages(1)) {
            this.f10217g.removeMessages(1);
        }
    }

    /* renamed from: e */
    public void mo9858e(C2597b bVar) {
        if (!this.f10219i.contains(bVar)) {
            this.f10219i.add(bVar);
        }
    }

    /* renamed from: f */
    public boolean mo9859f(String str, String str2, C2561b bVar) {
        boolean z;
        synchronized (this.f10214d) {
            m11020h();
            C2411a aVar = this.f10211a;
            z = false;
            if (aVar != null) {
                try {
                    aVar.mo9312k(bVar.mo9800b(), C2874a.m11880e(), str, str2);
                    z = true;
                } catch (RemoteException e) {
                    m11023l();
                    this.f10212b.set(false);
                    this.f10213c.set(false);
                    this.f10211a = null;
                    C2933s.m12141c("ServiceConnectManager", "track: " + e.toString());
                } catch (NullPointerException unused) {
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    public void mo9860i(String str, String str2, C2561b bVar) {
        try {
            synchronized (this.f10214d) {
                this.f10211a.mo9312k(bVar.mo9800b(), C2874a.m11880e(), str, str2);
            }
        } catch (Exception e) {
            C2933s.m12144f("ServiceConnectManager", "trackCacheData error:" + e.toString());
        }
    }
}
