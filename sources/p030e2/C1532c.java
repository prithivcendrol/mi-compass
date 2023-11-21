package p030e2;

import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;

/* renamed from: e2.c */
public class C1532c {

    /* renamed from: e2.c$a */
    class C1533a extends TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f6186a;

        /* renamed from: b */
        final /* synthetic */ AnimConfig f6187b;

        C1533a(Runnable runnable, AnimConfig animConfig) {
            this.f6186a = runnable;
            this.f6187b = animConfig;
        }

        public void onCancel(Object obj) {
            super.onCancel(obj);
            Runnable runnable = this.f6186a;
            if (runnable != null) {
                runnable.run();
            }
            this.f6187b.removeListeners(this);
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            Runnable runnable = this.f6186a;
            if (runnable != null) {
                runnable.run();
            }
            this.f6187b.removeListeners(this);
        }
    }

    /* renamed from: e2.c$b */
    class C1534b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f6188d;

        /* renamed from: e */
        final /* synthetic */ AnimConfig f6189e;

        C1534b(View view, AnimConfig animConfig) {
            this.f6188d = view;
            this.f6189e = animConfig;
        }

        public void run() {
            C1532c.m6629i(this.f6188d, this.f6189e);
        }
    }

    /* renamed from: b */
    public static void m6622b(View view) {
        m6623c(view, (AnimConfig) null);
    }

    /* renamed from: c */
    public static void m6623c(View view, AnimConfig animConfig) {
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState add = animState.add(viewProperty, (double) 0);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, -200);
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = m6632l(0, (Runnable) null);
        }
        animConfigArr[0] = animConfig;
        to.mo6815to(add, animConfigArr);
    }

    /* renamed from: d */
    public static void m6624d(View view, AnimConfig animConfig) {
        int width = view.getWidth();
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState add = animState.add(viewProperty, (double) width);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, 0);
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = m6630j();
        }
        animConfigArr[0] = animConfig;
        to.mo6815to(add, animConfigArr);
    }

    /* renamed from: e */
    public static void m6625e(View view) {
        m6626f(view, (AnimConfig) null);
    }

    /* renamed from: f */
    public static void m6626f(View view, AnimConfig animConfig) {
        if (view.isAttachedToWindow()) {
            m6629i(view, animConfig);
        } else {
            view.post(new C1534b(view, animConfig));
        }
    }

    /* renamed from: g */
    public static void m6627g(View view) {
        m6628h(view, (AnimConfig) null);
    }

    /* renamed from: h */
    public static void m6628h(View view, AnimConfig animConfig) {
        AnimState add = new AnimState().add(ViewProperty.TRANSLATION_X, -200.0d);
        IStateStyle state = Folme.useAt(view).state();
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = m6632l(0, (Runnable) null);
        }
        animConfigArr[0] = animConfig;
        state.mo6815to(add, animConfigArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m6629i(View view, AnimConfig animConfig) {
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState add = animState.add(viewProperty, 0.0d);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, Integer.valueOf(view.getWidth()));
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = m6630j();
        }
        animConfigArr[0] = animConfig;
        to.mo6815to(add, animConfigArr);
    }

    /* renamed from: j */
    public static AnimConfig m6630j() {
        return m6632l(0, (Runnable) null);
    }

    /* renamed from: k */
    private static AnimConfig m6631k(int i) {
        AnimConfig animConfig = new AnimConfig();
        animConfig.setEase(i != 1 ? i != 2 ? EaseManager.getStyle(-2, 1.0f, 0.46f) : EaseManager.getStyle(-2, 0.95f, 0.3f) : EaseManager.getStyle(-2, 0.85f, 0.3f));
        return animConfig;
    }

    /* renamed from: l */
    public static AnimConfig m6632l(int i, Runnable runnable) {
        AnimConfig k = m6631k(i);
        if (runnable != null) {
            k.addListeners(new C1533a(runnable, k));
        }
        return k;
    }
}
