package p140y0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import p130w0.C2874a;

/* renamed from: y0.h */
class C2918h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C2916f f11095a;

    C2918h(C2916f fVar) {
        this.f11095a = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("host");
            String stringExtra2 = intent.getStringExtra("packagename");
            String stringExtra3 = intent.getStringExtra("projectId");
            String stringExtra4 = intent.getStringExtra("user");
            boolean booleanExtra = intent.getBooleanExtra("logon", false);
            boolean booleanExtra2 = intent.getBooleanExtra("quickuploadon", false);
            String e = C2874a.m11880e();
            if (!TextUtils.isEmpty(stringExtra2) && !"".equals(stringExtra2)) {
                if (e.equals(stringExtra2)) {
                    C2933s.f11129a = booleanExtra;
                    C2933s.f11130b = booleanExtra2;
                    if (booleanExtra2) {
                        this.f11095a.m12079e(stringExtra, stringExtra3, stringExtra4);
                    }
                }
            }
        } catch (Exception e2) {
            C2933s.m12144f(C2916f.f11089d, e2.getMessage());
        }
    }
}
