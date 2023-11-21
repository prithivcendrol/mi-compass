package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
public final class C0553a {

    /* renamed from: androidx.core.graphics.drawable.a$a */
    static class C0554a {
        /* renamed from: a */
        static int m2298a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m2299b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m2300c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m2301d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m2302e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    static class C0555b {
        /* renamed from: a */
        static void m2303a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m2304b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m2305c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m2306d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m2307e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m2308f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m2309g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m2310h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m2311i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    static class C0556c {
        /* renamed from: a */
        static int m2312a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m2313b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static boolean m2288a(Drawable drawable) {
        return C0554a.m2301d(drawable);
    }

    /* renamed from: b */
    public static void m2289b(Drawable drawable, boolean z) {
        C0554a.m2302e(drawable, z);
    }

    /* renamed from: c */
    public static void m2290c(Drawable drawable, float f, float f2) {
        C0555b.m2307e(drawable, f, f2);
    }

    /* renamed from: d */
    public static void m2291d(Drawable drawable, int i, int i2, int i3, int i4) {
        C0555b.m2308f(drawable, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static boolean m2292e(Drawable drawable, int i) {
        return C0556c.m2313b(drawable, i);
    }

    /* renamed from: f */
    public static void m2293f(Drawable drawable, int i) {
        C0555b.m2309g(drawable, i);
    }

    /* renamed from: g */
    public static void m2294g(Drawable drawable, ColorStateList colorStateList) {
        C0555b.m2310h(drawable, colorStateList);
    }

    /* renamed from: h */
    public static void m2295h(Drawable drawable, PorterDuff.Mode mode) {
        C0555b.m2311i(drawable, mode);
    }

    /* renamed from: i */
    public static <T extends Drawable> T m2296i(Drawable drawable) {
        return drawable instanceof C0563h ? ((C0563h) drawable).mo2618b() : drawable;
    }

    /* renamed from: j */
    public static Drawable m2297j(Drawable drawable) {
        return drawable;
    }
}
