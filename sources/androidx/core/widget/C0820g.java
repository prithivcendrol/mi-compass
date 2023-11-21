package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.g */
public class C0820g {

    /* renamed from: androidx.core.widget.g$a */
    static class C0821a {
        /* renamed from: a */
        static ColorStateList m3283a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m3284b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m3285c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m3286d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m3279a(ImageView imageView) {
        return C0821a.m3283a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m3280b(ImageView imageView) {
        return C0821a.m3284b(imageView);
    }

    /* renamed from: c */
    public static void m3281c(ImageView imageView, ColorStateList colorStateList) {
        C0821a.m3285c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m3282d(ImageView imageView, PorterDuff.Mode mode) {
        C0821a.m3286d(imageView, mode);
    }
}
