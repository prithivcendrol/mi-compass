package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.o */
class C0028o implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0027n f68a;

    C0028o(C0027n nVar) {
        this.f68a = nVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f68a.f66c.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            C2933s.m12141c("OppoDeviceIDHelper", e.getMessage());
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f68a.f65b = null;
    }
}
