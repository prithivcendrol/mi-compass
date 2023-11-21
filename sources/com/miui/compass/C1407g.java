package com.miui.compass;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.GnssStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miuix.appcompat.app.C2118q;

/* renamed from: com.miui.compass.g */
public class C1407g {

    /* renamed from: s */
    public static boolean f5348s = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f5349a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<C2118q> f5350b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LocationManager f5351c;

    /* renamed from: d */
    private C1431r f5352d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ConnectivityManager f5353e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SensorManager f5354f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Sensor f5355g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Location f5356h;

    /* renamed from: i */
    private C1417j f5357i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1413f f5358j;

    /* renamed from: k */
    private boolean f5359k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f5360l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1412e f5361m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1414g f5362n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1415h f5363o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C1416i f5364p;

    /* renamed from: q */
    private Executor f5365q = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public SensorEventListener f5366r = new C1409b();

    /* renamed from: com.miui.compass.g$a */
    class C1408a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private long f5367a;

        C1408a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            this.f5367a = System.currentTimeMillis();
            C1407g gVar = C1407g.this;
            Location unused = gVar.f5356h = gVar.m6306z();
            if (C1407g.this.f5356h == null) {
                C1407g gVar2 = C1407g.this;
                Location unused2 = gVar2.f5356h = gVar2.m6278A();
            }
            if (C1407g.this.f5356h == null) {
                Log.d("Compass:CompassDataManager", " can't get Location information from gps and network");
            }
            Log.i("Compass:CompassDataManager", " startMonitor() doBack time = " + (System.currentTimeMillis() - this.f5367a));
            return Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                C1407g gVar = C1407g.this;
                gVar.m6281L(gVar.f5356h);
            } catch (Exception e) {
                Log.e("Compass:CompassDataManager", " updateLocation() error = " + e.toString());
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            C1407g.this.f5362n.mo5378a(C1407g.this.f5351c, C1407g.this);
            if (C1420h.m6347b()) {
                C1407g.this.f5364p.mo5387a(C1407g.this.f5351c, C1407g.this);
            } else {
                C1407g.this.f5363o.mo5384a(C1407g.this.f5351c, C1407g.this);
            }
            if (C1407g.this.mo5354E()) {
                C1407g.this.f5354f.registerListener(C1407g.this.f5366r, C1407g.this.f5355g, 3);
            }
        }
    }

    /* renamed from: com.miui.compass.g$b */
    class C1409b implements SensorEventListener {
        C1409b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            if (i != 2 && i != 3) {
                float unused = C1407g.this.f5361m.f5380c = -404.0f;
                C1407g.this.m6280G();
            }
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1412e h;
            C1410c cVar;
            float f = sensorEvent.values[0];
            float unused = C1407g.this.f5361m.f5380c = f;
            if (C1407g.this.m6279F()) {
                h = C1407g.this.f5361m;
                cVar = C1410c.RELIABLE;
            } else if (!C1421i.m6349a(C1407g.this.f5349a)) {
                h = C1407g.this.f5361m;
                cVar = C1410c.GRANT;
            } else if (C1403c0.m6269p(C1407g.this.f5353e)) {
                h = C1407g.this.f5361m;
                cVar = C1410c.AUTOMATIC_CALIBRATION;
            } else {
                h = C1407g.this.f5361m;
                cVar = C1410c.REFERENTIAL;
            }
            C1410c unused2 = h.f5382e = cVar;
            float unused3 = C1407g.this.f5361m.f5381d = SensorManager.getAltitude(C1407g.this.f5360l, f);
            C1407g.this.m6280G();
        }
    }

    /* renamed from: com.miui.compass.g$c */
    public enum C1410c {
        RELIABLE,
        IMPRECISE,
        REFERENTIAL,
        AUTOMATIC_CALIBRATION,
        GRANT
    }

    /* renamed from: com.miui.compass.g$d */
    private class C1411d extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private boolean f5376a;

        public C1411d(boolean z) {
            this.f5376a = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            return Integer.valueOf(C1407g.this.m6305x());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            if (C1407g.this.f5358j != null) {
                C1407g.this.f5358j.mo5239c(num.intValue(), this.f5376a);
            }
            C1407g gVar = C1407g.this;
            gVar.m6281L(gVar.f5356h);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (C1407g.this.f5358j != null) {
                C1407g.this.f5358j.mo5238b(this.f5376a);
            }
        }
    }

    /* renamed from: com.miui.compass.g$e */
    public static class C1412e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public double f5378a = -404.0d;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public double f5379b = -404.0d;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f5380c = -404.0f;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f5381d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C1410c f5382e;

        /* renamed from: g */
        public float mo5373g() {
            return this.f5381d;
        }

        /* renamed from: h */
        public C1410c mo5374h() {
            return this.f5382e;
        }

        /* renamed from: i */
        public double mo5375i() {
            return this.f5379b;
        }

        /* renamed from: j */
        public double mo5376j() {
            return this.f5378a;
        }

        /* renamed from: k */
        public float mo5377k() {
            return this.f5380c;
        }
    }

    /* renamed from: com.miui.compass.g$f */
    public interface C1413f {
        /* renamed from: a */
        void mo5237a(C1412e eVar);

        /* renamed from: b */
        void mo5238b(boolean z);

        /* renamed from: c */
        void mo5239c(int i, boolean z);
    }

    /* renamed from: com.miui.compass.g$g */
    private static class C1414g implements LocationListener {

        /* renamed from: a */
        private static C1407g f5383a;

        private C1414g() {
        }

        /* synthetic */ C1414g(C1408a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5378a(LocationManager locationManager, C1407g gVar) {
            float f;
            long j;
            String str;
            f5383a = gVar;
            if (!C1396a.m6221a(gVar.f5349a)) {
                Log.e("Compass:CompassDataManager", "CompassLocationListener register: PERMISSION_DENIED, return");
                return;
            }
            if (C1421i.m6349a(f5383a.f5349a) && C1403c0.m6269p(f5383a.f5353e) && f5383a.mo5353D()) {
                Log.d("Compass:CompassDataManager", "requestLocationUpdates from network");
                j = 2000;
                f = 10.0f;
                str = "network";
            } else if (f5383a.mo5351B()) {
                Log.d("Compass:CompassDataManager", "requestLocationUpdates from GPS");
                j = 2000;
                f = 10.0f;
                str = "gps";
            } else {
                Log.w("Compass:CompassDataManager", "register location listener failed,neither nlp nor gps are enable ");
                return;
            }
            locationManager.requestLocationUpdates(str, j, f, this);
        }

        /* renamed from: b */
        public void mo5379b(LocationManager locationManager) {
            locationManager.removeUpdates(this);
            f5383a = null;
        }

        public void onLocationChanged(Location location) {
            C1407g gVar = f5383a;
            if (gVar != null) {
                gVar.m6281L(location);
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.miui.compass.g$h */
    private static class C1415h extends GnssStatus.Callback {

        /* renamed from: a */
        private static C1407g f5384a;

        private C1415h() {
        }

        /* synthetic */ C1415h(C1408a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5384a(LocationManager locationManager, C1407g gVar) {
            f5384a = gVar;
            if (!C1396a.m6222b(gVar.f5349a)) {
                Log.e("Compass:CompassDataManager", "GpsStatusListener register: PERMISSION_DENIED, return");
            } else {
                locationManager.registerGnssStatusCallback(this);
            }
        }

        /* renamed from: b */
        public void mo5385b(LocationManager locationManager) {
            locationManager.unregisterGnssStatusCallback(this);
            f5384a = null;
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            super.onSatelliteStatusChanged(gnssStatus);
            C1407g gVar = f5384a;
            if (gVar == null) {
                return;
            }
            if (!C1396a.m6222b(gVar.f5349a)) {
                Log.e("Compass:CompassDataManager", "GpsStatusListener onGpsStatusChanged: PERMISSION_DENIED, return");
                return;
            }
            int satelliteCount = gnssStatus.getSatelliteCount();
            Location c = f5384a.m6306z();
            if (!f5384a.m6279F() && c != null && c.hasAltitude()) {
                C1407g.m6282M(f5384a, (float) c.getAltitude(), (float) satelliteCount);
            }
        }
    }

    /* renamed from: com.miui.compass.g$i */
    private static class C1416i implements OnNmeaMessageListener {

        /* renamed from: a */
        private static C1407g f5385a;

        private C1416i() {
        }

        /* synthetic */ C1416i(C1408a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5387a(LocationManager locationManager, C1407g gVar) {
            f5385a = gVar;
            if (!C1396a.m6222b(gVar.f5349a)) {
                Log.e("Compass:CompassDataManager", "GpsStatusNmeaListener register: PERMISSION_DENIED, return");
            } else {
                locationManager.addNmeaListener(this);
            }
        }

        /* renamed from: b */
        public void mo5388b(LocationManager locationManager) {
            locationManager.removeNmeaListener(this);
            f5385a = null;
        }

        public void onNmeaMessage(String str, long j) {
            C1407g gVar = f5385a;
            if (gVar != null && !gVar.m6279F() && !TextUtils.isEmpty(str) && str.contains("GPAAA")) {
                String[] split = str.split("\\*")[0].split(",");
                C1407g.m6282M(f5385a, Float.valueOf(split[6]).floatValue(), Float.valueOf(split[8]).floatValue() * -1.0f);
            }
        }
    }

    /* renamed from: com.miui.compass.g$j */
    private class C1417j extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f5386d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public LocationManager f5387e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public LocationListener f5388f;

        /* renamed from: com.miui.compass.g$j$a */
        class C1418a implements LocationListener {
            C1418a() {
            }

            public void onLocationChanged(Location location) {
            }

            public void onProviderDisabled(String str) {
            }

            public void onProviderEnabled(String str) {
            }

            public void onStatusChanged(String str, int i, Bundle bundle) {
            }
        }

        /* renamed from: com.miui.compass.g$j$b */
        class C1419b implements Runnable {
            C1419b() {
            }

            public void run() {
                try {
                    if (!C1396a.m6221a(C1407g.this.f5349a)) {
                        Log.e("Compass:CompassDataManager", "LocationGetter run: PERMISSION_DENIED, return");
                    } else {
                        C1417j.this.f5387e.requestLocationUpdates("network", 2000, 10.0f, C1417j.this.f5388f);
                    }
                } catch (Exception unused) {
                    Log.e("Compass:CompassDataManager", "No network location provider found");
                    boolean unused2 = C1417j.this.f5386d = false;
                }
            }
        }

        private C1417j() {
            this.f5386d = true;
            this.f5388f = new C1418a();
        }

        /* synthetic */ C1417j(C1407g gVar, C1408a aVar) {
            this();
        }

        /* renamed from: d */
        public void mo5390d() {
            this.f5386d = false;
        }

        /* renamed from: e */
        public void mo5391e() {
            mo5390d();
            join();
        }

        public void run() {
            if (C1407g.this.f5356h == null) {
                this.f5387e = (LocationManager) C1407g.this.f5349a.getSystemService("location");
                if (C1407g.this.f5350b != null && C1407g.this.f5350b.get() != null) {
                    ((C2118q) C1407g.this.f5350b.get()).runOnUiThread(new C1419b());
                    while (C1407g.this.f5356h == null && this.f5386d) {
                        C1407g gVar = C1407g.this;
                        Location unused = gVar.f5356h = gVar.m6278A();
                    }
                    if (C1407g.this.f5356h == null) {
                        Log.w("Compass:CompassDataManager", "doCalibrateAltitude get network location fail");
                        C1407g gVar2 = C1407g.this;
                        Location unused2 = gVar2.f5356h = gVar2.m6306z();
                    }
                    if (C1407g.this.f5356h == null) {
                        Log.w("Compass:CompassDataManager", "doCalibrateAltitude can't get available location");
                    }
                    this.f5387e.removeUpdates(this.f5388f);
                }
            }
        }
    }

    public C1407g(C2118q qVar) {
        this.f5349a = qVar.getApplicationContext();
        this.f5350b = new WeakReference<>(qVar);
        this.f5351c = (LocationManager) this.f5349a.getSystemService("location");
        this.f5352d = new C1431r(this.f5349a);
        this.f5353e = (ConnectivityManager) this.f5349a.getSystemService("connectivity");
        SensorManager sensorManager = (SensorManager) this.f5349a.getSystemService("sensor");
        this.f5354f = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(6);
        this.f5355g = defaultSensor;
        if (defaultSensor == null) {
            Log.e("Compass:CompassDataManager", "PressureSensor is null");
        } else {
            f5348s = true;
        }
        this.f5360l = C1421i.m6352d(this.f5349a);
        this.f5361m = new C1412e();
        this.f5362n = new C1414g((C1408a) null);
        this.f5363o = new C1415h((C1408a) null);
        this.f5364p = new C1416i((C1408a) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public Location m6278A() {
        if (!C1421i.m6349a(this.f5349a)) {
            Log.d("Compass:CompassDataManager", "getNetworkLocation: using network is not grant, return");
            return null;
        }
        try {
            if (C1396a.m6221a(this.f5349a)) {
                return this.f5351c.getLastKnownLocation("network");
            }
            Log.e("Compass:CompassDataManager", "getNetworkLocation: PERMISSION_DENIED, return");
            return null;
        } catch (IllegalArgumentException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public boolean m6279F() {
        return C1421i.m6350b(this.f5349a) == 9999.0f && System.currentTimeMillis() - C1421i.m6351c(this.f5349a) <= 900000;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m6280G() {
        C1413f fVar = this.f5358j;
        if (fVar != null) {
            fVar.mo5237a(this.f5361m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m6281L(Location location) {
        String str;
        this.f5356h = location;
        if (location != null) {
            double unused = this.f5361m.f5378a = location.getLongitude();
            double unused2 = this.f5361m.f5379b = location.getLatitude();
            str = "updateLocation success";
        } else {
            double unused3 = this.f5361m.f5378a = -404.0d;
            double unused4 = this.f5361m.f5379b = -404.0d;
            str = "updateLocation fail";
        }
        Log.d("Compass:CompassDataManager", str);
        m6280G();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static void m6282M(C1407g gVar, float f, float f2) {
        long currentTimeMillis = System.currentTimeMillis() - C1421i.m6351c(gVar.f5349a);
        if (f2 > C1421i.m6350b(gVar.f5349a) || currentTimeMillis > 3600000) {
            float a = (float) C1403c0.m6254a((double) f, (double) gVar.f5361m.f5380c);
            gVar.f5360l = a;
            C1421i.m6356h(gVar.f5349a, a, f2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public int m6305x() {
        int i;
        Log.i("Compass:CompassDataManager", "doCalibrateAltitude begin");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f5356h == null) {
            C1417j jVar = new C1417j(this, (C1408a) null);
            this.f5357i = jVar;
            jVar.start();
            try {
                this.f5357i.join(20000);
                this.f5357i.mo5391e();
            } catch (InterruptedException e) {
                Log.e("Compass:CompassDataManager", "LocationGetter thread is interrupted mLocation", e);
            }
            Log.i("Compass:CompassDataManager", "doCalibrateAltitude get location complete");
        }
        int i2 = 3;
        if (this.f5359k) {
            return 3;
        }
        Location location = this.f5356h;
        if (location != null) {
            i = C1421i.m6349a(this.f5349a) ? this.f5352d.mo5409c(currentTimeMillis, location.getLongitude(), location.getLatitude()) : 3;
            this.f5360l = C1421i.m6352d(this.f5349a);
        } else {
            i = 1;
            Log.i("Compass:CompassDataManager", "doCalibrateAltitude mLocation is null");
        }
        if (!this.f5359k) {
            i2 = i;
        }
        Log.i("Compass:CompassDataManager", "doCalibrateAltitude complete result:" + i2);
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public Location m6306z() {
        try {
            if (C1396a.m6221a(this.f5349a)) {
                return this.f5351c.getLastKnownLocation("gps");
            }
            Log.e("Compass:CompassDataManager", "getGpsLocation: PERMISSION_DENIED, return");
            return null;
        } catch (IllegalArgumentException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: B */
    public boolean mo5351B() {
        return this.f5351c.isProviderEnabled("gps");
    }

    /* renamed from: C */
    public boolean mo5352C() {
        return this.f5351c.isProviderEnabled("network") || this.f5351c.isProviderEnabled("gps");
    }

    /* renamed from: D */
    public boolean mo5353D() {
        return this.f5351c.isProviderEnabled("network");
    }

    /* renamed from: E */
    public boolean mo5354E() {
        return this.f5355g != null;
    }

    /* renamed from: H */
    public void mo5355H(C1413f fVar) {
        this.f5358j = fVar;
    }

    /* renamed from: I */
    public void mo5356I(boolean z) {
        Log.i("Compass:CompassDataManager", "startCalibrateAltitude");
        this.f5359k = false;
        new C1411d(z).execute(new Void[0]);
    }

    /* renamed from: J */
    public void mo5357J() {
        new C1408a().executeOnExecutor(this.f5365q, new Void[0]);
    }

    /* renamed from: K */
    public void mo5358K() {
        this.f5362n.mo5379b(this.f5351c);
        if (C1420h.m6347b()) {
            this.f5364p.mo5388b(this.f5351c);
        } else {
            this.f5363o.mo5385b(this.f5351c);
        }
        if (mo5354E()) {
            this.f5354f.unregisterListener(this.f5366r);
        }
    }

    /* renamed from: w */
    public void mo5359w() {
        C1417j jVar = this.f5357i;
        if (jVar != null) {
            jVar.mo5390d();
        }
        this.f5359k = true;
    }

    /* renamed from: y */
    public void mo5360y() {
        Settings.Secure.putInt(this.f5349a.getContentResolver(), "location_mode", 3);
    }
}
