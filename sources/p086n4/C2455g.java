package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.g */
public class C2455g implements Interpolator {
    public float getInterpolation(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return (float) Math.pow(2.0d, (double) ((f - 1.0f) * 10.0f));
    }
}
