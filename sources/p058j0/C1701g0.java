package p058j0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.g0 */
class C1701g0 extends C1689d0 {

    /* renamed from: d */
    private static boolean f6623d = true;

    /* renamed from: e */
    private static boolean f6624e = true;

    C1701g0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo5915g(View view, Matrix matrix) {
        if (f6623d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6623d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo5916h(View view, Matrix matrix) {
        if (f6624e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6624e = false;
            }
        }
    }
}
