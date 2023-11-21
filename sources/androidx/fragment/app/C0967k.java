package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.C0714i0;
import p001a0.C0008a;
import p001a0.C0009b;

/* renamed from: androidx.fragment.app.k */
class C0967k {

    /* renamed from: androidx.fragment.app.k$a */
    static class C0968a {

        /* renamed from: a */
        public final Animation f3313a;

        /* renamed from: b */
        public final Animator f3314b;

        C0968a(Animator animator) {
            this.f3313a = null;
            this.f3314b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0968a(Animation animation) {
            this.f3313a = animation;
            this.f3314b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    static class C0969b extends AnimationSet implements Runnable {

        /* renamed from: d */
        private final ViewGroup f3315d;

        /* renamed from: e */
        private final View f3316e;

        /* renamed from: f */
        private boolean f3317f;

        /* renamed from: g */
        private boolean f3318g;

        /* renamed from: h */
        private boolean f3319h = true;

        C0969b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3315d = viewGroup;
            this.f3316e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3319h = true;
            if (this.f3317f) {
                return !this.f3318g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3317f = true;
                C0714i0.m2834a(this.f3315d, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3319h = true;
            if (this.f3317f) {
                return !this.f3318g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3317f = true;
                C0714i0.m2834a(this.f3315d, this);
            }
            return true;
        }

        public void run() {
            if (this.f3317f || !this.f3319h) {
                this.f3315d.endViewTransition(this.f3316e);
                this.f3318g = true;
                return;
            }
            this.f3319h = false;
            this.f3315d.post(this);
        }
    }

    /* renamed from: a */
    private static int m4031a(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.mo3254W() : fragment.mo3256X() : z ? fragment.mo3202C() : fragment.mo3216I();
    }

    /* renamed from: b */
    static C0968a m4032b(Context context, Fragment fragment, boolean z, boolean z2) {
        int S = fragment.mo3244S();
        int a = m4031a(fragment, z, z2);
        boolean z3 = false;
        fragment.mo3218I1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f3000K;
        if (viewGroup != null) {
            int i = C0009b.f16c;
            if (viewGroup.getTag(i) != null) {
                fragment.f3000K.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.f3000K;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation C0 = fragment.mo3203C0(S, z, a);
        if (C0 != null) {
            return new C0968a(C0);
        }
        Animator D0 = fragment.mo3206D0(S, z, a);
        if (D0 != null) {
            return new C0968a(D0);
        }
        if (a == 0 && S != 0) {
            a = m4034d(context, S, z);
        }
        if (a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a);
                    if (loadAnimation != null) {
                        return new C0968a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a);
                    if (loadAnimator != null) {
                        return new C0968a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a);
                        if (loadAnimation2 != null) {
                            return new C0968a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m4033c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    private static int m4034d(Context context, int i, boolean z) {
        int i2;
        if (i == 4097) {
            return z ? C0008a.f12e : C0008a.f13f;
        }
        if (i == 8194) {
            return z ? C0008a.f8a : C0008a.f9b;
        }
        if (i == 8197) {
            i2 = z ? 16842938 : 16842939;
        } else if (i == 4099) {
            return z ? C0008a.f10c : C0008a.f11d;
        } else {
            if (i != 4100) {
                return -1;
            }
            i2 = z ? 16842936 : 16842937;
        }
        return m4033c(context, i2);
    }
}
