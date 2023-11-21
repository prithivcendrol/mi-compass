package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.core.widget.c */
public final class C0812c {

    /* renamed from: androidx.core.widget.c$a */
    static class C0813a {
        /* renamed from: a */
        static ColorStateList m3264a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m3265b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m3266c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m3267d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    static class C0814b {
        /* renamed from: a */
        static Drawable m3268a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m3261a(CompoundButton compoundButton) {
        return C0814b.m3268a(compoundButton);
    }

    /* renamed from: b */
    public static void m3262b(CompoundButton compoundButton, ColorStateList colorStateList) {
        C0813a.m3266c(compoundButton, colorStateList);
    }

    /* renamed from: c */
    public static void m3263c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C0813a.m3267d(compoundButton, mode);
    }
}
