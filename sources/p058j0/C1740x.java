package p058j0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: j0.x */
class C1740x {

    /* renamed from: a */
    private static boolean f6721a = true;

    /* renamed from: a */
    static C1738v m7265a(ViewGroup viewGroup) {
        return new C1737u(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m7266b(ViewGroup viewGroup, boolean z) {
        if (f6721a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f6721a = false;
            }
        }
    }

    /* renamed from: c */
    static void m7267c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m7266b(viewGroup, z);
        }
    }
}
