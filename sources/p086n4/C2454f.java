package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.f */
public class C2454f implements Interpolator {
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2) + 1.0f;
    }
}
