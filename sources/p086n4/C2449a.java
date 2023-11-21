package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.a */
public class C2449a implements Interpolator {
    public float getInterpolation(float f) {
        return 1.0f - new C2451c().getInterpolation(1.0f - f);
    }
}
