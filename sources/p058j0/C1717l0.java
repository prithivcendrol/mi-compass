package p058j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.l0 */
class C1717l0 extends C1709k0 {
    C1717l0() {
    }

    /* renamed from: b */
    public float mo5909b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: d */
    public void mo5917d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: e */
    public void mo5911e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: f */
    public void mo5921f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: g */
    public void mo5915g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: h */
    public void mo5916h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
