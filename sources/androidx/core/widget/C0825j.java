package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.core.widget.j */
public final class C0825j {

    /* renamed from: androidx.core.widget.j$a */
    static class C0826a {
        /* renamed from: a */
        static void m3297a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.j$b */
    static class C0827b {
        /* renamed from: a */
        static boolean m3298a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m3299b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m3300c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        static void m3301d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m3294a(PopupWindow popupWindow, boolean z) {
        C0827b.m3300c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m3295b(PopupWindow popupWindow, int i) {
        C0827b.m3301d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m3296c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C0826a.m3297a(popupWindow, view, i, i2, i3);
    }
}
