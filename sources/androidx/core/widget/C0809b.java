package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.core.widget.b */
public final class C0809b {

    /* renamed from: androidx.core.widget.b$a */
    private static class C0810a {
        /* renamed from: a */
        static Drawable m3258a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.b$b */
    private static class C0811b {
        /* renamed from: a */
        static void m3259a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m3260b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m3255a(CheckedTextView checkedTextView) {
        return C0810a.m3258a(checkedTextView);
    }

    /* renamed from: b */
    public static void m3256b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C0811b.m3259a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m3257c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C0811b.m3260b(checkedTextView, mode);
    }
}
