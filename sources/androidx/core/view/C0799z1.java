package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.z1 */
public final class C0799z1 {

    /* renamed from: androidx.core.view.z1$a */
    static class C0800a {
        /* renamed from: a */
        static boolean m3157a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        /* renamed from: b */
        static boolean m3158b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        /* renamed from: c */
        static void m3159c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        /* renamed from: d */
        static void m3160d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        /* renamed from: e */
        static void m3161e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        /* renamed from: f */
        static boolean m3162f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        /* renamed from: g */
        static void m3163g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m3150a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return C0800a.m3157a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m3151b(ViewParent viewParent, View view, float f, float f2) {
        try {
            return C0800a.m3158b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: c */
    public static void m3152c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0673c0) {
            ((C0673c0) viewParent).mo1190j(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                C0800a.m3159c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: d */
    public static void m3153d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C0678d0) {
            ((C0678d0) viewParent2).mo1193m(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C0673c0) {
            ((C0673c0) viewParent2).mo1194n(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                C0800a.m3160d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                AbstractMethodError abstractMethodError = e;
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    /* renamed from: e */
    public static void m3154e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0673c0) {
            ((C0673c0) viewParent).mo1174c(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                C0800a.m3161e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: f */
    public static boolean m3155f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0673c0) {
            return ((C0673c0) viewParent).mo1195o(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C0800a.m3162f(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    /* renamed from: g */
    public static void m3156g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0673c0) {
            ((C0673c0) viewParent).mo1189i(view, i);
        } else if (i == 0) {
            try {
                C0800a.m3163g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }
}
