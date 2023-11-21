package p058j0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0727l0;

/* renamed from: j0.a0 */
class C1668a0 {

    /* renamed from: a */
    private static final C1719m0 f6560a = (Build.VERSION.SDK_INT >= 29 ? new C1717l0() : new C1709k0());

    /* renamed from: b */
    static final Property<View, Float> f6561b = new C1669a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f6562c = new C1670b(Rect.class, "clipBounds");

    /* renamed from: j0.a0$a */
    class C1669a extends Property<View, Float> {
        C1669a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1668a0.m7018c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C1668a0.m7022g(view, f.floatValue());
        }
    }

    /* renamed from: j0.a0$b */
    class C1670b extends Property<View, Rect> {
        C1670b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0727l0.m2907p(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C0727l0.m2886e0(view, rect);
        }
    }

    /* renamed from: a */
    static void m7016a(View view) {
        f6560a.mo5908a(view);
    }

    /* renamed from: b */
    static C1742z m7017b(View view) {
        return new C1741y(view);
    }

    /* renamed from: c */
    static float m7018c(View view) {
        return f6560a.mo5909b(view);
    }

    /* renamed from: d */
    static C1732p0 m7019d(View view) {
        return new C1728o0(view);
    }

    /* renamed from: e */
    static void m7020e(View view) {
        f6560a.mo5910c(view);
    }

    /* renamed from: f */
    static void m7021f(View view, int i, int i2, int i3, int i4) {
        f6560a.mo5917d(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    static void m7022g(View view, float f) {
        f6560a.mo5911e(view, f);
    }

    /* renamed from: h */
    static void m7023h(View view, int i) {
        f6560a.mo5921f(view, i);
    }

    /* renamed from: i */
    static void m7024i(View view, Matrix matrix) {
        f6560a.mo5915g(view, matrix);
    }

    /* renamed from: j */
    static void m7025j(View view, Matrix matrix) {
        f6560a.mo5916h(view, matrix);
    }
}
