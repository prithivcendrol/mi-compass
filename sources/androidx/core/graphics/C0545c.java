package androidx.core.graphics;

import android.graphics.Paint;

/* renamed from: androidx.core.graphics.c */
public final class C0545c {

    /* renamed from: a */
    private static final ThreadLocal<Object> f2552a = new ThreadLocal<>();

    /* renamed from: androidx.core.graphics.c$a */
    static class C0546a {
        /* renamed from: a */
        static boolean m2258a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m2257a(Paint paint, String str) {
        return C0546a.m2258a(paint, str);
    }
}
