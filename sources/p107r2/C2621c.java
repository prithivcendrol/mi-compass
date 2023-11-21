package p107r2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.C2112p;
import p055i3.C1648b;
import p102q2.C2583b;

/* renamed from: r2.c */
public class C2621c implements C2620b {

    /* renamed from: r2.c$a */
    class C2622a implements Animator.AnimatorListener {

        /* renamed from: d */
        WeakReference<C2583b.C2584a> f10265d;

        /* renamed from: e */
        WeakReference<View> f10266e;

        C2622a(C2583b.C2584a aVar, View view) {
            this.f10265d = new WeakReference<>(aVar);
            this.f10266e = new WeakReference<>(view);
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f10266e.get();
            if (view != null) {
                view.setTag((Object) null);
            }
            C2583b.C2584a aVar = this.f10265d.get();
            if (aVar != null) {
                aVar.end();
            } else {
                Log.d("PhoneDialogAnim", "weak dismiss onCancel mOnDismiss get null");
            }
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f10266e.get();
            if (view != null) {
                view.setTag((Object) null);
            }
            C2583b.C2584a aVar = this.f10265d.get();
            if (aVar != null) {
                aVar.end();
            } else {
                Log.d("PhoneDialogAnim", "weak dismiss onComplete mOnDismiss get null");
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f10266e.get();
            if (view != null) {
                view.setTag("hide");
            }
        }
    }

    /* renamed from: r2.c$b */
    class C2623b extends TransitionListener {

        /* renamed from: a */
        WeakReference<C2112p.C2116d> f10268a;

        /* renamed from: b */
        WeakReference<View> f10269b;

        C2623b(C2112p.C2116d dVar, View view) {
            this.f10268a = new WeakReference<>(dVar);
            this.f10269b = new WeakReference<>(view);
        }

        public void onBegin(Object obj) {
            super.onBegin(obj);
            View view = this.f10269b.get();
            if (view != null) {
                view.setTag("show");
            }
            C2112p.C2116d dVar = this.f10268a.get();
            if (dVar != null) {
                dVar.onShowAnimStart();
            } else {
                Log.d("PhoneDialogAnim", "weak show onCancel mOnDismiss get null");
            }
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            C2112p.C2116d dVar = this.f10268a.get();
            if (dVar != null) {
                dVar.onShowAnimComplete();
            } else {
                Log.d("PhoneDialogAnim", "weak show onComplete mOnDismiss get null");
            }
        }
    }

    /* renamed from: r2.c$c */
    private class C2624c extends AnimatorListenerAdapter {

        /* renamed from: d */
        WeakReference<C2112p.C2116d> f10271d;

        /* renamed from: e */
        WeakReference<View> f10272e;

        C2624c(C2112p.C2116d dVar, View view) {
            this.f10271d = new WeakReference<>(dVar);
            this.f10272e = new WeakReference<>(view);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f10272e.get();
            if (view != null) {
                view.setTag((Object) null);
            }
            C2112p.C2116d dVar = this.f10271d.get();
            if (dVar != null) {
                dVar.onShowAnimComplete();
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            View view = this.f10272e.get();
            if (view != null) {
                view.setTag("show");
            }
            C2112p.C2116d dVar = this.f10271d.get();
            if (dVar != null) {
                dVar.onShowAnimStart();
            }
        }
    }

    /* renamed from: d */
    private void m11083d(View view, C2622a aVar) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ViewProperty.ALPHA, new float[]{1.0f, 0.0f});
        float f = m11085f(view);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{ofFloat, PropertyValuesHolder.ofFloat(ViewProperty.SCALE_X, new float[]{1.0f, f}), PropertyValuesHolder.ofFloat(ViewProperty.SCALE_Y, new float[]{1.0f, f})});
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setDuration(200);
        ofPropertyValuesHolder.start();
    }

    /* renamed from: e */
    private void m11084e(View view, C2112p.C2116d dVar) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ViewProperty.ALPHA, new float[]{0.0f, 1.0f});
        float f = m11085f(view);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{ofFloat, PropertyValuesHolder.ofFloat(ViewProperty.SCALE_X, new float[]{f, 1.0f}), PropertyValuesHolder.ofFloat(ViewProperty.SCALE_Y, new float[]{f, 1.0f})});
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        ofPropertyValuesHolder.addListener(new C2624c(dVar, view));
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.start();
    }

    /* renamed from: f */
    private float m11085f(View view) {
        return Math.max(0.8f, 1.0f - (60.0f / ((float) Math.max(view.getWidth(), view.getHeight()))));
    }

    /* renamed from: g */
    private AnimState m11086g(boolean z, boolean z2, View view) {
        AnimState animState = new AnimState();
        float f = 1.0f;
        if (!z ? !z2 : z2) {
            f = m11085f(view);
        }
        if (z) {
            z2 = !z2;
        }
        double d = (double) f;
        animState.add(ViewProperty.SCALE_X, d);
        animState.add(ViewProperty.SCALE_Y, d);
        animState.add(ViewProperty.ALPHA, z2 ? 1.0d : 0.0d);
        return animState;
    }

    /* renamed from: a */
    public void mo9885a() {
    }

    /* renamed from: b */
    public void mo9886b(View view, View view2, boolean z, C2112p.C2116d dVar) {
        if (!"show".equals(view.getTag())) {
            if (view.getScaleX() != 1.0f) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
            if (C1648b.m6955d()) {
                m11084e(view, dVar);
            } else {
                AnimConfig animConfig = new AnimConfig();
                animConfig.setEase(EaseManager.getStyle(-2, 0.8f, 0.3f));
                animConfig.addListeners(new C2623b(dVar, view));
                Folme.useAt(view).state().setFlags(1).fromTo(m11086g(true, true, view), m11086g(true, false, view), animConfig);
            }
            C2619a.m11079b(view2);
        }
    }

    /* renamed from: c */
    public void mo9887c(View view, View view2, C2583b.C2584a aVar) {
        if (!"hide".equals(view.getTag())) {
            m11083d(view, new C2622a(aVar, view));
            C2619a.m11078a(view2);
        }
    }
}
