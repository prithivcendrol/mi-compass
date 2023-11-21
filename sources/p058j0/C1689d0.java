package p058j0;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: j0.d0 */
class C1689d0 extends C1719m0 {

    /* renamed from: c */
    private static boolean f6604c = true;

    C1689d0() {
    }

    /* renamed from: a */
    public void mo5908a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo5909b(View view) {
        if (f6604c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6604c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo5910c(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo5911e(View view, float f) {
        if (f6604c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f6604c = false;
            }
        }
        view.setAlpha(f);
    }
}
