package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.i */
public class C2457i implements Interpolator {
    public float getInterpolation(float f) {
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((-Math.pow(2.0d, (double) (f * -10.0f))) + 1.0d);
    }
}
