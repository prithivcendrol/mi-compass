package p105r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: r0.s */
class C2611s extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C2603k f10255a;

    C2611s(C2603k kVar) {
        this.f10255a = kVar;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.SCREEN_ON")) {
                    this.f10255a.m11050E();
                }
            }
        } catch (Exception unused) {
        }
    }
}
