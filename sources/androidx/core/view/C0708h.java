package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.h */
public final class C0708h {

    /* renamed from: androidx.core.view.h$a */
    static class C0709a {
        /* renamed from: a */
        static int m2821a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m2822b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m2823c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m2824d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m2825e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        static void m2826f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        static void m2827g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        static void m2828h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m2819a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0709a.m2822b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m2820b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0709a.m2823c(marginLayoutParams);
    }
}
