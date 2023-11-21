package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.t */
public class C2468t implements Interpolator {
    public float getInterpolation(float f) {
        return ((float) (Math.cos(((double) f) * 3.141592653589793d) - 1.0d)) * -0.5f;
    }
}
