package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.q */
class C0030q implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0029p f71a;

    C0030q(C0029p pVar) {
        this.f71a = pVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f71a.f69a.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            C2933s.m12141c("SamsungDeviceIDHelper", e.getMessage());
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
