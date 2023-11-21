package p115t0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p110s0.C2647i;
import p135x0.C2898b;
import p140y0.C2933s;

/* renamed from: t0.k */
class C2676k extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C2675j f10467a;

    C2676k(C2675j jVar) {
        this.f10467a = jVar;
    }

    public void onReceive(Context context, Intent intent) {
        boolean b = C2898b.m11953b();
        C2933s.m12141c("UploadTimer", "UploadTimer netReceiver, 网络是否可用=" + b);
        if (b) {
            int[] iArr = {0, 1, 2};
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                int a = C2647i.m11143a(i2);
                if (!this.f10467a.hasMessages(i2)) {
                    this.f10467a.sendEmptyMessageDelayed(i2, (long) a);
                }
            }
        }
    }
}
