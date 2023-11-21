package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1265a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1265a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2453a = (IconCompat) aVar.mo5032v(remoteActionCompat.f2453a, 1);
        remoteActionCompat.f2454b = aVar.mo5022l(remoteActionCompat.f2454b, 2);
        remoteActionCompat.f2455c = aVar.mo5022l(remoteActionCompat.f2455c, 3);
        remoteActionCompat.f2456d = (PendingIntent) aVar.mo5028r(remoteActionCompat.f2456d, 4);
        remoteActionCompat.f2457e = aVar.mo5018h(remoteActionCompat.f2457e, 5);
        remoteActionCompat.f2458f = aVar.mo5018h(remoteActionCompat.f2458f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1265a aVar) {
        aVar.mo5034x(false, false);
        aVar.mo5013M(remoteActionCompat.f2453a, 1);
        aVar.mo5004D(remoteActionCompat.f2454b, 2);
        aVar.mo5004D(remoteActionCompat.f2455c, 3);
        aVar.mo5008H(remoteActionCompat.f2456d, 4);
        aVar.mo5036z(remoteActionCompat.f2457e, 5);
        aVar.mo5036z(remoteActionCompat.f2458f, 6);
    }
}
