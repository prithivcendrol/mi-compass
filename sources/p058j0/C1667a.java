package p058j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: j0.a */
class C1667a {
    /* renamed from: a */
    static void m7013a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m7014b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    static void m7015c(Animator animator) {
        animator.resume();
    }
}
