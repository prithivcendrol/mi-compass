package p115t0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p140y0.C2933s;

/* renamed from: t0.c */
final class C2668c extends BroadcastReceiver {
    C2668c() {
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.SCREEN_ON")) {
            C2933s.m12141c("EventManager", "screen on/off");
            int i = action.equals("android.intent.action.SCREEN_ON") ? 0 : 2;
            C2933s.m12141c("EventManager", "screenReceiver will post prio=" + i);
            C2677l.m11185a().mo9938b(i, false);
        }
    }
}
