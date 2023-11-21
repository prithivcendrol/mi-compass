package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.h */
public class C2456h implements Interpolator {
    public float getInterpolation(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        float f2 = f * 2.0f;
        return ((float) (f2 < 1.0f ? Math.pow(2.0d, (double) ((f2 - 1.0f) * 10.0f)) : (-Math.pow(2.0d, (double) ((f2 - 1.0f) * -10.0f))) + 2.0d)) * 0.5f;
    }
}
