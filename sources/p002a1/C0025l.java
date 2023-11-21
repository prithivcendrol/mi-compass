package p002a1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import miuix.animation.internal.AnimTask;
import p011b1.C1300e;
import p140y0.C2933s;

/* renamed from: a1.l */
public class C0025l {

    /* renamed from: a */
    private String f59a;

    /* renamed from: b */
    C1300e f60b;

    /* renamed from: c */
    public final LinkedBlockingQueue<IBinder> f61c = new LinkedBlockingQueue<>(1);

    /* renamed from: d */
    ServiceConnection f62d = new C0026m(this);

    /* renamed from: b */
    private String m22b(String str, Context context) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (this.f59a == null) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e) {
                C2933s.m12141c("OnePlusDeviceIDHelper", e.getMessage());
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA1");
                    if (instance != null) {
                        byte[] digest = instance.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            sb.append(Integer.toHexString((b & 255) | AnimTask.OP_INVALID).substring(1, 3));
                        }
                        str2 = sb.toString();
                    }
                } catch (Exception e2) {
                    C2933s.m12141c("OnePlusDeviceIDHelper", e2.getMessage());
                }
            }
            this.f59a = str2;
        }
        return ((C1300e.C1301a.C1302a) this.f60b).mo5125x(packageName, this.f59a, str);
    }

    /* renamed from: a */
    public String mo30a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        String str = "";
        if (context.bindService(intent, this.f62d, 1)) {
            try {
                IBinder poll = this.f61c.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f62d);
                    } catch (Exception e) {
                        C2933s.m12141c("OnePlusDeviceIDHelper", e.getMessage());
                    }
                    return str;
                }
                C1300e x = C1300e.C1301a.m5942x(poll);
                this.f60b = x;
                if (x != null) {
                    str = m22b("OUID", context);
                }
                try {
                    context.unbindService(this.f62d);
                } catch (Exception e2) {
                    C2933s.m12141c("OnePlusDeviceIDHelper", e2.getMessage());
                }
            } catch (Exception e3) {
                C2933s.m12141c("OnePlusDeviceIDHelper", e3.getMessage());
                context.unbindService(this.f62d);
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f62d);
                } catch (Exception e4) {
                    C2933s.m12141c("OnePlusDeviceIDHelper", e4.getMessage());
                }
                throw th;
            }
        }
        return str;
    }
}
