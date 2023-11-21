package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.f */
class C0017f implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0016e f49a;

    C0017f(C0016e eVar) {
        this.f49a = eVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f49a.f47a.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            C2933s.m12141c("HWDeviceIDHelper", e.getMessage());
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
