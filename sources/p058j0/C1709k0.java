package p058j0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: j0.k0 */
class C1709k0 extends C1705i0 {

    /* renamed from: g */
    private static boolean f6631g = true;

    C1709k0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo5921f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo5921f(view, i);
        } else if (f6631g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f6631g = false;
            }
        }
    }
}
