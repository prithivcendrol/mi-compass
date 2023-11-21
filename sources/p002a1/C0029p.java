package p002a1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p011b1.C1306g;
import p140y0.C2933s;

/* renamed from: a1.p */
public class C0029p {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f69a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    ServiceConnection f70b = new C0030q(this);

    /* renamed from: a */
    public String mo36a(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        String str = "";
        if (context.bindService(intent, this.f70b, 1)) {
            try {
                IBinder poll = this.f69a.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f70b);
                    } catch (Exception e) {
                        C2933s.m12141c("SamsungDeviceIDHelper", e.getMessage());
                    }
                    return str;
                }
                str = new C1306g(poll).mo5129b();
                try {
                    context.unbindService(this.f70b);
                } catch (Exception e2) {
                    C2933s.m12141c("SamsungDeviceIDHelper", e2.getMessage());
                }
            } catch (Exception e3) {
                C2933s.m12141c("SamsungDeviceIDHelper", e3.getMessage());
                context.unbindService(this.f70b);
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f70b);
                } catch (Exception e4) {
                    C2933s.m12141c("SamsungDeviceIDHelper", e4.getMessage());
                }
                throw th;
            }
        }
        return str;
    }
}
