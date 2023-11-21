package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.a2 */
public final /* synthetic */ class C0629a2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0684e2 f2666a;

    /* renamed from: b */
    public final /* synthetic */ View f2667b;

    public /* synthetic */ C0629a2(C0684e2 e2Var, View view) {
        this.f2666a = e2Var;
        this.f2667b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2666a.mo612a(this.f2667b);
    }
}
