package p014b4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.util.Log;
import p026d4.C1507b;
import p026d4.C1509c;
import p117t2.C2711k;

/* renamed from: b4.a */
public class C1319a {
    /* renamed from: a */
    public static C1507b m5965a(Context context, C2711k kVar) {
        return C1509c.m6557a().mo5610b(context, m5970f(context, kVar));
    }

    /* renamed from: b */
    public static C1507b m5966b(Context context, C2711k kVar, Configuration configuration) {
        return C1509c.m6557a().mo5610b(context, m5971g(configuration, kVar));
    }

    /* renamed from: c */
    public static int m5967c(int i, int i2) {
        if (i <= 670) {
            return 1;
        }
        if (i >= 960) {
            return 3;
        }
        return i2 > 550 ? 2 : 1;
    }

    /* renamed from: d */
    private static int m5968d(int i) {
        if (i == 0) {
            return 4103;
        }
        switch (i) {
            case 4097:
                return 4097;
            case 4098:
                return 4098;
            case 4099:
                return 4100;
            default:
                switch (i) {
                    case 8192:
                        return 8192;
                    case 8193:
                        return 8193;
                    case 8194:
                        return 8194;
                    case 8195:
                        return 8195;
                    case 8196:
                        return 8196;
                    default:
                        Log.w("MiuixWarning", "Unknown window mode for : " + Integer.toHexString(i));
                        return 4103;
                }
        }
    }

    /* renamed from: e */
    private static C1507b.C1508a m5969e(C2711k kVar, float f) {
        C1507b.C1508a aVar = new C1507b.C1508a();
        Point point = kVar.f10509c;
        aVar.f6144c = point.x;
        aVar.f6145d = point.y;
        Point point2 = kVar.f10510d;
        aVar.f6146e = point2.x;
        aVar.f6147f = point2.y;
        aVar.f6142a = kVar.f10511e;
        aVar.f6143b = m5968d(kVar.f10512f);
        return aVar;
    }

    /* renamed from: f */
    private static C1507b.C1508a m5970f(Context context, C2711k kVar) {
        return m5969e(kVar, context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: g */
    private static C1507b.C1508a m5971g(Configuration configuration, C2711k kVar) {
        return m5969e(kVar, ((float) configuration.densityDpi) / 160.0f);
    }
}
