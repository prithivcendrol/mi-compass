package p130w0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p140y0.C2933s;

/* renamed from: w0.i */
final class C2883i extends BroadcastReceiver {
    C2883i() {
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.SCREEN_ON")) {
            C2933s.m12141c("OneTrackApp", action.equals("android.intent.action.SCREEN_ON") ? "屏幕亮" : "屏幕灭");
        }
    }
}
