package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.i0 */
public final class C0714i0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d */
    private final View f2796d;

    /* renamed from: e */
    private ViewTreeObserver f2797e;

    /* renamed from: f */
    private final Runnable f2798f;

    private C0714i0(View view, Runnable runnable) {
        this.f2796d = view;
        this.f2797e = view.getViewTreeObserver();
        this.f2798f = runnable;
    }

    /* renamed from: a */
    public static C0714i0 m2834a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C0714i0 i0Var = new C0714i0(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(i0Var);
            view.addOnAttachStateChangeListener(i0Var);
            return i0Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo2915b() {
        (this.f2797e.isAlive() ? this.f2797e : this.f2796d.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2796d.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo2915b();
        this.f2798f.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2797e = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo2915b();
    }
}
