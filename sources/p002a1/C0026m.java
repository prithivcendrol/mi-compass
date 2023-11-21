package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.m */
class C0026m implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0025l f63a;

    C0026m(C0025l lVar) {
        this.f63a = lVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f63a.f61c.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            C2933s.m12141c("OnePlusDeviceIDHelper", e.getMessage());
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f63a.f60b = null;
    }
}
