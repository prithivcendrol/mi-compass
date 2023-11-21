package com.miui.compass;

import android.os.SystemClock;
import android.util.Log;
import android.view.Window;

/* renamed from: com.miui.compass.v */
public class C1435v {

    /* renamed from: a */
    private boolean f5593a = false;

    /* renamed from: b */
    private long f5594b = 0;

    /* renamed from: c */
    private int f5595c = 0;

    /* renamed from: d */
    private int f5596d;

    /* renamed from: e */
    private int f5597e;

    /* renamed from: f */
    private Window f5598f;

    public C1435v(Window window) {
        this.f5598f = window;
    }

    /* renamed from: a */
    public void mo5412a() {
        Window window = this.f5598f;
        if (window == null) {
            Log.d("Compass:ScreenOnDetector", "Window is null return ");
        } else if (this.f5593a) {
            window.clearFlags(128);
            this.f5593a = false;
            Log.d("Compass:ScreenOnDetector", "Screen off");
        }
    }

    /* renamed from: b */
    public void mo5413b() {
        Window window = this.f5598f;
        if (window == null) {
            Log.d("Compass:ScreenOnDetector", "Window is null return ");
        } else if (!this.f5593a) {
            window.addFlags(128);
            this.f5593a = true;
            Log.d("Compass:ScreenOnDetector", "keep Screen On");
        }
    }

    /* renamed from: c */
    public void mo5414c(float f, float f2, boolean z) {
        if (!z) {
            int round = Math.round(f);
            int round2 = Math.round(f2);
            if (SystemClock.elapsedRealtime() - this.f5594b > 1000) {
                this.f5595c = (round == this.f5596d && round2 == this.f5597e) ? this.f5595c + 1 : 0;
                this.f5596d = round;
                this.f5597e = round2;
                this.f5594b = SystemClock.elapsedRealtime();
            }
            if (this.f5595c >= 15) {
                mo5412a();
            } else {
                mo5413b();
            }
        }
    }
}
