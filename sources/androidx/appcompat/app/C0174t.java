package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0517d;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.t */
class C0174t {

    /* renamed from: d */
    private static C0174t f514d;

    /* renamed from: a */
    private final Context f515a;

    /* renamed from: b */
    private final LocationManager f516b;

    /* renamed from: c */
    private final C0175a f517c = new C0175a();

    /* renamed from: androidx.appcompat.app.t$a */
    private static class C0175a {

        /* renamed from: a */
        boolean f518a;

        /* renamed from: b */
        long f519b;

        C0175a() {
        }
    }

    C0174t(Context context, LocationManager locationManager) {
        this.f515a = context;
        this.f516b = locationManager;
    }

    /* renamed from: a */
    static C0174t m636a(Context context) {
        if (f514d == null) {
            Context applicationContext = context.getApplicationContext();
            f514d = new C0174t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f514d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m637b() {
        Location location = null;
        Location c = C0517d.m2143b(this.f515a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m638c("network") : null;
        if (C0517d.m2143b(this.f515a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m638c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m638c(String str) {
        try {
            if (this.f516b.isProviderEnabled(str)) {
                return this.f516b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m639e() {
        return this.f517c.f519b > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m640f(Location location) {
        long j;
        C0175a aVar = this.f517c;
        long currentTimeMillis = System.currentTimeMillis();
        C0173s b = C0173s.m634b();
        C0173s sVar = b;
        sVar.mo594a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        sVar.mo594a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.f513c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j2 = b.f512b;
        long j3 = b.f511a;
        long j4 = j2;
        b.mo594a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j5 = b.f512b;
        if (j4 == -1 || j3 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j3 ? j5 + 0 : currentTimeMillis > j4 ? j3 + 0 : j4 + 0) + 60000;
        }
        aVar.f518a = z2;
        aVar.f519b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo595d() {
        C0175a aVar = this.f517c;
        if (m639e()) {
            return aVar.f518a;
        }
        Location b = m637b();
        if (b != null) {
            m640f(b);
            return aVar.f518a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
