package p058j0;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: j0.i0 */
class C1705i0 extends C1701g0 {

    /* renamed from: f */
    private static boolean f6627f = true;

    C1705i0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo5917d(View view, int i, int i2, int i3, int i4) {
        if (f6627f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f6627f = false;
            }
        }
    }
}
