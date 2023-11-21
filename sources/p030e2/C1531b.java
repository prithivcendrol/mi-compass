package p030e2;

import android.content.Context;
import android.util.Log;
import miuix.appcompat.app.C2118q;
import miuix.autodensity.C2284g;
import p018c2.C1345a;
import p018c2.C1352h;

/* renamed from: e2.b */
public class C1531b {

    /* renamed from: a */
    private static boolean f6185a = true;

    static {
        try {
            Class.forName("android.view.animation.TranslateWithClipAnimation");
        } catch (ClassNotFoundException e) {
            Log.w("FloatingAnimHelper", "Failed to get isSupportTransWithClipAnim attributes", e);
        }
    }

    /* renamed from: a */
    public static void m6610a(C2118q qVar) {
    }

    /* renamed from: b */
    public static void m6611b(C2118q qVar) {
        qVar.overridePendingTransition(C1345a.f4524g, C1345a.f4525h);
    }

    /* renamed from: c */
    public static void m6612c(C2118q qVar) {
        qVar.overridePendingTransition(C1345a.f4530m, C1345a.f4531n);
    }

    /* renamed from: d */
    public static boolean m6613d(C2118q qVar) {
        boolean z = qVar instanceof C2284g;
        Context context = qVar;
        if (!z) {
            if (!(qVar.getApplication() instanceof C2284g)) {
                return false;
            }
            context = qVar.getApplication();
        }
        return ((C2284g) context).mo5258a();
    }

    /* renamed from: e */
    private static boolean m6614e(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: f */
    public static boolean m6615f() {
        return f6185a;
    }

    /* renamed from: g */
    public static void m6616g(C2118q qVar, int i) {
        qVar.getWindow().getDecorView().setTag(C1352h.f4689K, Integer.valueOf(i));
    }

    /* renamed from: h */
    public static int m6617h(C2118q qVar) {
        Object tag = qVar.getWindow().getDecorView().getTag(C1352h.f4689K);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: i */
    public static void m6618i(C2118q qVar, boolean z) {
        int i;
        int i2;
        if (f6185a) {
            if (!z) {
                i = C1345a.f4518a;
                i2 = C1345a.f4519b;
            } else if (m6613d(qVar)) {
                if (m6614e(qVar)) {
                    i = C1345a.f4521d;
                    i2 = C1345a.f4527j;
                } else {
                    i = C1345a.f4522e;
                    i2 = C1345a.f4528k;
                }
            } else if (m6614e(qVar)) {
                i = C1345a.f4520c;
                i2 = C1345a.f4526i;
            } else {
                i = C1345a.f4523f;
                i2 = C1345a.f4529l;
            }
            qVar.overridePendingTransition(i, i2);
        }
    }

    /* renamed from: j */
    public static void m6619j(C2118q qVar) {
        if (f6185a) {
            m6618i(qVar, qVar.mo7562G());
        } else {
            qVar.mo5648I();
        }
    }

    /* renamed from: k */
    public static void m6620k(C2118q qVar) {
        int i;
        int i2;
        if (f6185a) {
            if (!qVar.mo7562G()) {
                i2 = C1345a.f4518a;
                i = C1345a.f4519b;
            } else if (m6613d(qVar)) {
                if (m6614e(qVar)) {
                    i2 = C1345a.f4521d;
                    i = C1345a.f4527j;
                } else {
                    i2 = C1345a.f4522e;
                    i = C1345a.f4528k;
                }
            } else if (m6614e(qVar)) {
                i2 = C1345a.f4520c;
                i = C1345a.f4526i;
            } else {
                i2 = C1345a.f4523f;
                i = C1345a.f4529l;
            }
            qVar.overridePendingTransition(i2, i);
        }
    }
}
