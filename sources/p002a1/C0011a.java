package p002a1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p011b1.C1296a;
import p140y0.C2933s;

/* renamed from: a1.a */
public class C0011a {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f24a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    ServiceConnection f25b = new C0012b(this);

    /* renamed from: a */
    public String mo13a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        String str = "";
        if (context.bindService(intent, this.f25b, 1)) {
            try {
                IBinder poll = this.f24a.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f25b);
                    } catch (Exception e) {
                        C2933s.m12141c("ASUSDeviceIDHelper", e.getMessage());
                    }
                    return str;
                }
                str = new C1296a(poll).mo5119b();
                try {
                    context.unbindService(this.f25b);
                } catch (Exception e2) {
                    C2933s.m12141c("ASUSDeviceIDHelper", e2.getMessage());
                }
            } catch (Exception e3) {
                C2933s.m12141c("ASUSDeviceIDHelper", e3.getMessage());
                context.unbindService(this.f25b);
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f25b);
                } catch (Exception e4) {
                    C2933s.m12141c("ASUSDeviceIDHelper", e4.getMessage());
                }
                throw th;
            }
        }
        return str;
    }
}
