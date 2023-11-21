package p105r0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import p082n0.C2411a;
import p140y0.C2933s;

/* renamed from: r0.g */
class C2599g implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C2595f f10222a;

    C2599g(C2595f fVar) {
        this.f10222a = fVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        synchronized (this.f10222a.f10214d) {
            i = 0;
            this.f10222a.f10212b.set(false);
            this.f10222a.f10213c.set(true);
            C2411a unused = this.f10222a.f10211a = C2411a.C2412a.m10267x(iBinder);
        }
        this.f10222a.m11027p();
        StringBuilder sb = new StringBuilder();
        sb.append("onServiceConnected  mConnecting ");
        sb.append(this.f10222a.f10212b);
        sb.append(" mIOneTrackService ");
        if (this.f10222a.f10211a != null) {
            i = 1;
        }
        sb.append(i);
        sb.append(" pid:");
        sb.append(Process.myPid());
        sb.append(" tid:");
        sb.append(Process.myTid());
        C2933s.m12141c("ServiceConnectManager", sb.toString());
    }

    public void onServiceDisconnected(ComponentName componentName) {
        int i;
        synchronized (this.f10222a.f10214d) {
            C2411a unused = this.f10222a.f10211a = null;
            i = 0;
            this.f10222a.f10212b.set(false);
            this.f10222a.f10213c.set(false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onServiceDisconnected:  mConnecting ");
        sb.append(this.f10222a.f10212b);
        sb.append(" mIOneTrackService ");
        if (this.f10222a.f10211a != null) {
            i = 1;
        }
        sb.append(i);
        C2933s.m12141c("ServiceConnectManager", sb.toString());
    }
}
