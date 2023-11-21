package p117t2;

import android.content.Context;
import android.graphics.Point;
import p122u2.C2829a;
import p122u2.C2830b;

/* renamed from: t2.i */
public class C2709i {
    /* renamed from: a */
    public static void m11320a(Context context, C2711k kVar, Point point) {
        C2829a.m11703b(kVar, context, point);
        if (!m11321b(kVar.f10512f)) {
            C2830b.m11705a(kVar, point);
        }
    }

    /* renamed from: b */
    public static boolean m11321b(int i) {
        return (i & 8192) != 0;
    }

    /* renamed from: c */
    public static boolean m11322c(int i) {
        return (i & 4096) != 0;
    }
}
