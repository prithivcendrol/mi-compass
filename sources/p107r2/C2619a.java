package p107r2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: r2.a */
public class C2619a {
    /* renamed from: a */
    public static void m11078a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.3f, 0.0f});
        ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat.setDuration(250);
        ofFloat.start();
    }

    /* renamed from: b */
    public static void m11079b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 0.3f});
        ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat.setDuration(300);
        ofFloat.start();
    }
}
