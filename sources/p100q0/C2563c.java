package p100q0;

import android.content.Context;
import p105r0.C2603k;
import p140y0.C2933s;

/* renamed from: q0.c */
final class C2563c implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Context f10080d;

    /* renamed from: e */
    final /* synthetic */ C2603k f10081e;

    C2563c(Context context, C2603k kVar) {
        this.f10080d = context;
        this.f10081e = kVar;
    }

    public void run() {
        try {
            C2565e eVar = new C2565e(this.f10080d, this.f10081e, (C2563c) null);
            C2933s.m12141c("CrashAnalysis", "CrashAnalysis create success");
            if (eVar.m10952n()) {
                eVar.m10953o();
            } else {
                C2933s.m12141c("CrashAnalysis", "no crash file found");
            }
        } catch (Throwable th) {
            C2933s.m12144f("CrashAnalysis", "processCrash error: " + th.toString());
        }
    }
}
