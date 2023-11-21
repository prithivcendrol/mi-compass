package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.j */
class C1044j {

    /* renamed from: a */
    private static AtomicBoolean f3481a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    static class C1045a extends C1018c {
        C1045a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1063w.m4284g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4234a(Context context) {
        if (!f3481a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1045a());
        }
    }
}
