package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.k */
public class C2459k implements Interpolator {
    public float getInterpolation(float f) {
        float f2 = f * 2.0f;
        if (f2 < 1.0f) {
            return 0.5f * f2 * f2;
        }
        float f3 = f2 - 1.0f;
        return ((f3 * (f3 - 2.0f)) - 1.0f) * -0.5f;
    }
}
