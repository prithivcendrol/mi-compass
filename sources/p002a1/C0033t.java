package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.t */
class C0033t implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0032s f75a;

    C0033t(C0032s sVar) {
        this.f75a = sVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f75a.f73b.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            C2933s.m12141c("ZTEDeviceIDHelper", e.getMessage());
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
