package p002a1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p011b1.C1307h;
import p140y0.C2933s;

/* renamed from: a1.s */
public class C0032s {

    /* renamed from: a */
    String f72a = "com.mdid.msa";

    /* renamed from: b */
    public final LinkedBlockingQueue<IBinder> f73b = new LinkedBlockingQueue<>(1);

    /* renamed from: c */
    ServiceConnection f74c = new C0033t(this);

    /* renamed from: b */
    private void m28b(String str, Context context) {
        Intent intent = new Intent();
        intent.setClassName(this.f72a, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Exception e) {
            C2933s.m12141c("ZTEDeviceIDHelper", e.getMessage());
        }
    }

    /* renamed from: a */
    public String mo40a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(this.f72a, 0);
        } catch (Exception e) {
            C2933s.m12141c("ZTEDeviceIDHelper", e.getMessage());
        }
        String packageName = context.getPackageName();
        m28b(packageName, context);
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", packageName);
        String str = "";
        if (context.bindService(intent, this.f74c, 1)) {
            try {
                IBinder poll = this.f73b.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f74c);
                    } catch (Exception e2) {
                        C2933s.m12141c("ZTEDeviceIDHelper", e2.getMessage());
                    }
                    return str;
                }
                str = new C1307h(poll).mo5131l();
                try {
                    context.unbindService(this.f74c);
                } catch (Exception e3) {
                    C2933s.m12141c("ZTEDeviceIDHelper", e3.getMessage());
                }
            } catch (Exception e4) {
                C2933s.m12141c("ZTEDeviceIDHelper", e4.getMessage());
                context.unbindService(this.f74c);
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f74c);
                } catch (Exception e5) {
                    C2933s.m12141c("ZTEDeviceIDHelper", e5.getMessage());
                }
                throw th;
            }
        }
        return str;
    }
}
