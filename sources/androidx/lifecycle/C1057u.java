package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1063w;

/* renamed from: androidx.lifecycle.u */
public class C1057u implements C1048m {

    /* renamed from: l */
    private static final C1057u f3495l = new C1057u();

    /* renamed from: d */
    private int f3496d = 0;

    /* renamed from: e */
    private int f3497e = 0;

    /* renamed from: f */
    private boolean f3498f = true;

    /* renamed from: g */
    private boolean f3499g = true;

    /* renamed from: h */
    private Handler f3500h;

    /* renamed from: i */
    private final C1049n f3501i = new C1049n(this);

    /* renamed from: j */
    private Runnable f3502j = new C1058a();

    /* renamed from: k */
    C1063w.C1064a f3503k = new C1059b();

    /* renamed from: androidx.lifecycle.u$a */
    class C1058a implements Runnable {
        C1058a() {
        }

        public void run() {
            C1057u.this.mo3805i();
            C1057u.this.mo3806j();
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    class C1059b implements C1063w.C1064a {
        C1059b() {
        }

        /* renamed from: a */
        public void mo3808a() {
        }

        /* renamed from: b */
        public void mo3809b() {
            C1057u.this.mo3801b();
        }

        /* renamed from: c */
        public void mo3810c() {
            C1057u.this.mo3802d();
        }
    }

    /* renamed from: androidx.lifecycle.u$c */
    class C1060c extends C1018c {

        /* renamed from: androidx.lifecycle.u$c$a */
        class C1061a extends C1018c {
            C1061a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C1057u.this.mo3801b();
            }

            public void onActivityPostStarted(Activity activity) {
                C1057u.this.mo3802d();
            }
        }

        C1060c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C1063w.m4283f(activity).mo3814h(C1057u.this.f3503k);
            }
        }

        public void onActivityPaused(Activity activity) {
            C1057u.this.mo3800a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1061a());
        }

        public void onActivityStopped(Activity activity) {
            C1057u.this.mo3803g();
        }
    }

    private C1057u() {
    }

    /* renamed from: k */
    public static C1048m m4264k() {
        return f3495l;
    }

    /* renamed from: l */
    static void m4265l(Context context) {
        f3495l.mo3804h(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3800a() {
        int i = this.f3497e - 1;
        this.f3497e = i;
        if (i == 0) {
            this.f3500h.postDelayed(this.f3502j, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3801b() {
        int i = this.f3497e + 1;
        this.f3497e = i;
        if (i != 1) {
            return;
        }
        if (this.f3498f) {
            this.f3501i.mo3795h(C1035g.C1037b.ON_RESUME);
            this.f3498f = false;
            return;
        }
        this.f3500h.removeCallbacks(this.f3502j);
    }

    /* renamed from: c */
    public C1035g mo252c() {
        return this.f3501i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3802d() {
        int i = this.f3496d + 1;
        this.f3496d = i;
        if (i == 1 && this.f3499g) {
            this.f3501i.mo3795h(C1035g.C1037b.ON_START);
            this.f3499g = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3803g() {
        this.f3496d--;
        mo3806j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3804h(Context context) {
        this.f3500h = new Handler();
        this.f3501i.mo3795h(C1035g.C1037b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1060c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3805i() {
        if (this.f3497e == 0) {
            this.f3498f = true;
            this.f3501i.mo3795h(C1035g.C1037b.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3806j() {
        if (this.f3496d == 0 && this.f3498f) {
            this.f3501i.mo3795h(C1035g.C1037b.ON_STOP);
            this.f3499g = true;
        }
    }
}
