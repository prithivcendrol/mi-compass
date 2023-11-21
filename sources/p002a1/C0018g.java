package p002a1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p011b1.C1298c;

/* renamed from: a1.g */
public class C0018g {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f50a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    ServiceConnection f51b = new C0019h(this);

    /* renamed from: a */
    public String mo23a(Context context) {
        context.getPackageName();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        String str = "";
        if (context.bindService(intent, this.f51b, 1)) {
            try {
                IBinder poll = this.f50a.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f51b);
                    } catch (Exception unused) {
                    }
                    return str;
                }
                str = new C1298c(poll).mo5123b();
                try {
                    context.unbindService(this.f51b);
                } catch (Exception unused2) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f51b);
                } catch (Exception unused3) {
                }
                throw th;
            }
        }
        return str;
    }
}
