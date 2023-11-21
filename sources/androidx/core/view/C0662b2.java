package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.b2 */
public final class C0662b2 {

    /* renamed from: a */
    private final WeakReference<View> f2735a;

    /* renamed from: b */
    Runnable f2736b = null;

    /* renamed from: c */
    Runnable f2737c = null;

    /* renamed from: d */
    int f2738d = -1;

    /* renamed from: androidx.core.view.b2$a */
    class C0663a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C0675c2 f2739d;

        /* renamed from: e */
        final /* synthetic */ View f2740e;

        C0663a(C0675c2 c2Var, View view) {
            this.f2739d = c2Var;
            this.f2740e = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2739d.mo1743a(this.f2740e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2739d.mo523b(this.f2740e);
        }

        public void onAnimationStart(Animator animator) {
            this.f2739d.mo524c(this.f2740e);
        }
    }

    /* renamed from: androidx.core.view.b2$b */
    static class C0664b {
        /* renamed from: a */
        static ViewPropertyAnimator m2650a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    C0662b2(View view) {
        this.f2735a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m2639i(View view, C0675c2 c2Var) {
        if (c2Var != null) {
            view.animate().setListener(new C0663a(c2Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: b */
    public C0662b2 mo2818b(float f) {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void mo2819c() {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long mo2820d() {
        View view = this.f2735a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public C0662b2 mo2821f(long j) {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C0662b2 mo2822g(Interpolator interpolator) {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C0662b2 mo2823h(C0675c2 c2Var) {
        View view = this.f2735a.get();
        if (view != null) {
            m2639i(view, c2Var);
        }
        return this;
    }

    /* renamed from: j */
    public C0662b2 mo2824j(long j) {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C0662b2 mo2825k(C0684e2 e2Var) {
        View view = this.f2735a.get();
        if (view != null) {
            C0629a2 a2Var = null;
            if (e2Var != null) {
                a2Var = new C0629a2(e2Var, view);
            }
            C0664b.m2650a(view.animate(), a2Var);
        }
        return this;
    }

    /* renamed from: l */
    public void mo2826l() {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C0662b2 mo2827m(float f) {
        View view = this.f2735a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
