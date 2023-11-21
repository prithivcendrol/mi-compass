package p002a1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

/* renamed from: a1.h */
class C0019h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0018g f52a;

    C0019h(C0018g gVar) {
        this.f52a = gVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f52a.f50a.offer(iBinder, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
