package com.miui.compass;

import android.os.SystemClock;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import miuix.view.C2403h;
import miuix.view.HapticCompat;
import p080m4.C1963a;

/* renamed from: com.miui.compass.l */
public class C1424l {

    /* renamed from: e */
    private static C1424l f5405e;

    /* renamed from: a */
    private long f5406a;

    /* renamed from: b */
    private C1963a f5407b = new C1963a(CompassApplication.m6126d());

    /* renamed from: c */
    private Vibrator f5408c = ((Vibrator) CompassApplication.m6126d().getSystemService("vibrator"));

    /* renamed from: d */
    private WeakReference<CompassScreenView> f5409d;

    private C1424l() {
    }

    /* renamed from: a */
    public static C1424l m6361a() {
        if (f5405e == null) {
            f5405e = new C1424l();
        }
        return f5405e;
    }

    /* renamed from: b */
    private boolean m6362b() {
        return this.f5407b.mo6602c();
    }

    /* renamed from: c */
    public void mo5399c() {
        this.f5408c.vibrate(1000);
        this.f5406a = SystemClock.elapsedRealtime();
        Log.v("Compass:HapticFeedbackTool", "completed calibration and vibrated");
    }

    /* renamed from: d */
    public void mo5400d(View view) {
        WeakReference<CompassScreenView> weakReference;
        if (SystemClock.elapsedRealtime() <= this.f5406a + 1000 || (weakReference = this.f5409d) == null) {
            return;
        }
        if (weakReference.get() != null && this.f5409d.get().getCurrentScreenIndex() != 0) {
            return;
        }
        if (HapticCompat.m10231c("2.0")) {
            HapticCompat.performHapticFeedback(view, C2403h.f9358C);
        } else {
            view.performHapticFeedback((!m6362b() || !this.f5407b.mo6602c()) ? 0 : C2403h.f9371j);
        }
    }

    /* renamed from: e */
    public void mo5401e(View view) {
        WeakReference<CompassScreenView> weakReference = this.f5409d;
        if (weakReference == null) {
            return;
        }
        if (weakReference.get() != null && this.f5409d.get().getCurrentScreenIndex() != 1) {
            return;
        }
        if (HapticCompat.m10231c("2.0")) {
            HapticCompat.performHapticFeedback(view, C2403h.f9358C);
        } else {
            view.performHapticFeedback((!m6362b() || !this.f5407b.mo6602c()) ? 0 : C2403h.f9371j);
        }
    }

    /* renamed from: f */
    public void mo5402f() {
        this.f5407b.mo6601b();
    }

    /* renamed from: g */
    public void mo5403g(CompassScreenView compassScreenView) {
        this.f5409d = new WeakReference<>(compassScreenView);
    }
}
