package com.miui.compass;

import android.content.Context;
import android.os.AsyncTask;
import miuix.autodensity.C2285h;

public class CompassApplication extends C2285h {

    /* renamed from: h */
    private static volatile Context f5161h;

    /* renamed from: com.miui.compass.CompassApplication$a */
    class C1385a implements Runnable {
        C1385a() {
        }

        public void run() {
            C1445z.m6431b(CompassApplication.this);
        }
    }

    /* renamed from: d */
    public static Context m6126d() {
        return f5161h;
    }

    /* renamed from: a */
    public boolean mo5258a() {
        return true;
    }

    public void onCreate() {
        super.onCreate();
        f5161h = this;
        AsyncTask.execute(new C1385a());
    }
}
