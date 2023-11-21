package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.y1 */
public final class C0795y1 {

    /* renamed from: androidx.core.view.y1$a */
    static class C0796a {
        /* renamed from: a */
        static int m3145a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m3146b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m3147c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m3144a(ViewGroup viewGroup) {
        return C0796a.m3146b(viewGroup);
    }
}
