package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.b */
class C0012b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0011a f26a;

    C0012b(C0011a aVar) {
        this.f26a = aVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f26a.f24a.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            C2933s.m12141c("ASUSDeviceIDHelper", e.getMessage());
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
