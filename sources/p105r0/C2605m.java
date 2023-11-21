package p105r0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import p115t0.C2672g;
import p140y0.C2920j;
import p140y0.C2933s;

/* renamed from: r0.m */
class C2605m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private int f10239a = 0;

    /* renamed from: b */
    private int f10240b;

    /* renamed from: c */
    private long f10241c;

    /* renamed from: d */
    private boolean f10242d;

    /* renamed from: e */
    private boolean f10243e;

    /* renamed from: f */
    final /* synthetic */ C2603k f10244f;

    C2605m(C2603k kVar) {
        this.f10244f = kVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f10244f.m11054c(activity.getClass().getName(), this.f10240b == System.identityHashCode(activity) ? SystemClock.elapsedRealtime() - this.f10241c : 0);
        if (C2933s.f11129a) {
            C2933s.m12141c("OneTrackImp", "onActivityPaused:" + activity.getLocalClassName());
        }
    }

    public void onActivityResumed(Activity activity) {
        this.f10244f.m11063o(this.f10243e);
        this.f10240b = System.identityHashCode(activity);
        this.f10241c = SystemClock.elapsedRealtime();
        this.f10244f.m11055f(activity.getClass().getName(), this.f10242d);
        if (C2933s.f11129a) {
            C2933s.m12141c("OneTrackImp", "onActivityResumed:" + activity.getLocalClassName() + " isAppStart:" + this.f10242d);
        }
        this.f10242d = false;
        this.f10244f.m11070v();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f10239a == 0) {
            this.f10244f.f10231a.mo9852c(1);
            this.f10242d = true;
            this.f10243e = false;
            C2920j.m12088c();
        } else {
            this.f10242d = false;
        }
        this.f10239a++;
        C2933s.m12141c("OneTrackImp", "onActivityStarted: " + activity.getLocalClassName());
    }

    public void onActivityStopped(Activity activity) {
        int i = this.f10239a - 1;
        this.f10239a = i;
        if (i == 0) {
            this.f10244f.f10231a.mo9852c(2);
            if (C2672g.m11175d()) {
                this.f10244f.m11050E();
            }
            this.f10243e = true;
            this.f10242d = false;
        } else {
            this.f10243e = false;
        }
        this.f10244f.m11063o(this.f10243e);
        C2933s.m12141c("OneTrackImp", "onActivityStopped: " + activity.getLocalClassName());
    }
}
