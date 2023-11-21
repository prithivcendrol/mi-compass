package p058j0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: j0.m0 */
class C1719m0 {

    /* renamed from: a */
    private static Field f6674a;

    /* renamed from: b */
    private static boolean f6675b;

    C1719m0() {
    }

    /* renamed from: a */
    public void mo5908a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo5909b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo5910c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo5917d(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: e */
    public void mo5911e(View view, float f) {
        throw null;
    }

    /* renamed from: f */
    public void mo5921f(View view, int i) {
        if (!f6675b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6674a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f6675b = true;
        }
        Field field = f6674a;
        if (field != null) {
            try {
                f6674a.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo5915g(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: h */
    public void mo5916h(View view, Matrix matrix) {
        throw null;
    }
}
