package p086n4;

import android.view.animation.Interpolator;

/* renamed from: n4.b */
public class C2450b implements Interpolator {
    public float getInterpolation(float f) {
        return f < 0.5f ? new C2449a().getInterpolation(f * 2.0f) * 0.5f : (new C2451c().getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
    }
}
