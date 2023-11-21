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
import p011b1.C1303f;
import p140y0.C2933s;

/* renamed from: a1.n */
public class C0027n {

    /* renamed from: a */
    private String f64a;

    /* renamed from: b */
    C1303f f65b;

    /* renamed from: c */
    public final LinkedBlockingQueue<IBinder> f66c = new LinkedBlockingQueue<>(1);

    /* renamed from: d */
    ServiceConnection f67d = new C0028o(this);

    /* renamed from: b */
    private String m24b(String str, Context context) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (this.f64a == null) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e) {
                e.printStackTrace();
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
                    e2.printStackTrace();
                }
            }
            this.f64a = str2;
        }
        return ((C1303f.C1304a.C1305a) this.f65b).mo5127x(packageName, this.f64a, str);
    }

    /* renamed from: a */
    public String mo33a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        String str = "";
        if (context.bindService(intent, this.f67d, 1)) {
            try {
                IBinder poll = this.f66c.poll(1, TimeUnit.SECONDS);
                if (poll == null) {
                    try {
                        context.unbindService(this.f67d);
                    } catch (Exception e) {
                        C2933s.m12141c("OppoDeviceIDHelper", e.getMessage());
                    }
                    return str;
                }
                C1303f x = C1303f.C1304a.m5944x(poll);
                this.f65b = x;
                if (x != null) {
                    str = m24b("OUID", context);
                }
                try {
                    context.unbindService(this.f67d);
                } catch (Exception e2) {
                    C2933s.m12141c("OppoDeviceIDHelper", e2.getMessage());
                }
            } catch (Exception e3) {
                C2933s.m12141c("OppoDeviceIDHelper", e3.getMessage());
                context.unbindService(this.f67d);
            } catch (Throwable th) {
                try {
                    context.unbindService(this.f67d);
                } catch (Exception e4) {
                    C2933s.m12141c("OppoDeviceIDHelper", e4.getMessage());
                }
                throw th;
            }
        }
        return str;
    }
}
