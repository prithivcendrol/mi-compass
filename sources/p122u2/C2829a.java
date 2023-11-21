package p122u2;

import android.content.Context;
import android.graphics.Point;
import p117t2.C2711k;
import p117t2.C2715o;

/* renamed from: u2.a */
public class C2829a {
    /* renamed from: a */
    private static C2711k m11702a(C2711k kVar, Context context, Point point) {
        if (!C2715o.m11338i(context.getResources().getConfiguration(), point, kVar.f10509c)) {
            kVar.f10512f &= -8193;
            return kVar;
        }
        float f = 0.0f;
        Point point2 = kVar.f10509c;
        int i = point2.x;
        int i2 = point2.y;
        if (i != 0) {
            f = (((float) i2) * 1.0f) / ((float) i);
        }
        return m11704c(kVar, f);
    }

    /* renamed from: b */
    public static C2711k m11703b(C2711k kVar, Context context, Point point) {
        return m11702a(kVar, context, point);
    }

    /* renamed from: c */
    private static C2711k m11704c(C2711k kVar, float f) {
        kVar.f10512f = f <= 0.0f ? 0 : (f < 0.74f || f >= 0.76f) ? (f < 1.32f || f >= 1.34f) ? (f < 1.76f || f >= 1.79f) ? 8196 : 8193 : 8194 : 8195;
        return kVar;
    }
}
