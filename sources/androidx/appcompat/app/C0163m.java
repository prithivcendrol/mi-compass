package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* renamed from: androidx.appcompat.app.m */
public final class C0163m extends Service {

    /* renamed from: androidx.appcompat.app.m$a */
    private static class C0164a {
        /* renamed from: a */
        static int m617a() {
            return 512;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m616a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, C0163m.class), C0164a.m617a() | 128);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
