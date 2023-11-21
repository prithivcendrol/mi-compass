package p002a1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p011b1.C1297b;
import p140y0.C2933s;

/* renamed from: a1.e */
public class C0016e {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f47a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    ServiceConnection f48b = new C0017f(this);

    /* renamed from: a */
    public String mo20a(Context context) {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        String str = "";
        if (context.bindService(intent, this.f48b, 1)) {
            try {
                IBinder poll = this.f47a.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f48b);
                    } catch (Exception e) {
                        C2933s.m12141c("HWDeviceIDHelper", e.getMessage());
                    }
                    return str;
                }
                str = new C1297b(poll).mo5121b();
                try {
                    context.unbindService(this.f48b);
                } catch (Exception e2) {
                    C2933s.m12141c("HWDeviceIDHelper", e2.getMessage());
                }
            } catch (Exception e3) {
                C2933s.m12141c("HWDeviceIDHelper", e3.getMessage());
                context.unbindService(this.f48b);
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f48b);
                } catch (Exception e4) {
                    C2933s.m12141c("HWDeviceIDHelper", e4.getMessage());
                }
                throw th;
            }
        }
        return str;
    }
}
