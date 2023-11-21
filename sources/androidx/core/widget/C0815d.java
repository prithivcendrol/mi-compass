package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.d */
public final class C0815d {

    /* renamed from: androidx.core.widget.d$a */
    static class C0816a {
        /* renamed from: a */
        static void m3273a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    private static class C0817b {
        /* renamed from: a */
        public static EdgeEffect m3274a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m3275b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m3276c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m3269a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C0817b.m3274a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m3270b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0817b.m3275b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m3271c(EdgeEffect edgeEffect, float f, float f2) {
        C0816a.m3273a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m3272d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0817b.m3276c(edgeEffect, f, f2);
        }
        m3271c(edgeEffect, f, f2);
        return f;
    }
}
