package miuix.view;

import android.app.Activity;
import android.os.Build;
import android.view.View;

/* renamed from: miuix.view.e */
public class C2400e {
    /* renamed from: a */
    public static void m10240a(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            boolean unused = activity.setTranslucent(z);
        }
    }

    /* renamed from: b */
    public static void m10241b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setForceDarkAllowed(z);
        }
    }
}
