package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p109s.C2636b;

/* renamed from: androidx.core.view.x */
public final class C0789x {

    /* renamed from: androidx.core.view.x$a */
    static class C0790a {
        /* renamed from: a */
        static int m3124a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m3125b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m3126c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m3127d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m3128e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m3129f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m3130g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        static MenuItem m3131h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m3132i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m3133j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m3134k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        static MenuItem m3135l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        static MenuItem m3136m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m3117a(MenuItem menuItem, C0657b bVar) {
        if (menuItem instanceof C2636b) {
            return ((C2636b) menuItem).mo738a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m3118b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C2636b) {
            ((C2636b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0790a.m3130g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m3119c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C2636b) {
            ((C2636b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0790a.m3131h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m3120d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C2636b) {
            ((C2636b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0790a.m3132i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m3121e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C2636b) {
            ((C2636b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0790a.m3133j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m3122f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C2636b) {
            ((C2636b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0790a.m3134k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m3123g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C2636b) {
            ((C2636b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0790a.m3136m(menuItem, charSequence);
        }
    }
}
