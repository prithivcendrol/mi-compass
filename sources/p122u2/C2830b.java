package p122u2;

import android.graphics.Point;

/* renamed from: u2.b */
public class C2830b {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11705a(p117t2.C2711k r4, android.graphics.Point r5) {
        /*
            boolean r0 = m11707c(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.graphics.Point r0 = r4.f10509c
            int r0 = r0.x
            float r0 = (float) r0
            int r5 = r5.x
        L_0x000e:
            float r5 = (float) r5
            float r5 = r5 + r1
            float r0 = r0 / r5
            goto L_0x002a
        L_0x0012:
            android.graphics.Point r0 = r4.f10509c
            int r2 = r0.x
            float r2 = (float) r2
            int r3 = r5.x
            float r3 = (float) r3
            float r3 = r3 + r1
            float r2 = r2 / r3
            r3 = 1064514355(0x3f733333, float:0.95)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0029
            int r0 = r0.y
            float r0 = (float) r0
            int r5 = r5.y
            goto L_0x000e
        L_0x0029:
            r0 = r2
        L_0x002a:
            r5 = 1053609165(0x3ecccccd, float:0.4)
            boolean r1 = m11706b(r0, r1, r5)
            if (r1 == 0) goto L_0x0038
            r5 = 4097(0x1001, float:5.741E-42)
        L_0x0035:
            r4.f10512f = r5
            goto L_0x0052
        L_0x0038:
            r1 = 1058642330(0x3f19999a, float:0.6)
            boolean r5 = m11706b(r0, r5, r1)
            if (r5 == 0) goto L_0x0044
            r5 = 4098(0x1002, float:5.743E-42)
            goto L_0x0035
        L_0x0044:
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            boolean r5 = m11706b(r0, r1, r5)
            if (r5 == 0) goto L_0x0050
            r5 = 4099(0x1003, float:5.744E-42)
            goto L_0x0035
        L_0x0050:
            r5 = 0
            goto L_0x0035
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p122u2.C2830b.m11705a(t2.k, android.graphics.Point):void");
    }

    /* renamed from: b */
    private static boolean m11706b(float f, float f2, float f3) {
        return f >= f2 && f < f3;
    }

    /* renamed from: c */
    private static boolean m11707c(Point point) {
        return point.x > point.y;
    }
}
