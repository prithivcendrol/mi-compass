package p117t2;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.concurrent.ConcurrentHashMap;
import miuix.view.C2402g;
import p014b4.C1319a;

/* renamed from: t2.a */
public class C2693a {

    /* renamed from: a */
    static final Point f10470a = new Point(-1, -1);

    /* renamed from: b */
    static C2402g f10471b;

    /* renamed from: c */
    static final ConcurrentHashMap<Integer, C2711k> f10472c = new ConcurrentHashMap<>();

    /* renamed from: d */
    static final Object f10473d = new Object();

    /* renamed from: e */
    static final Object f10474e = new Object();

    /* renamed from: f */
    static final Object f10475f = new Object();

    /* renamed from: g */
    static volatile Boolean f10476g = null;

    /* renamed from: h */
    static volatile int f10477h = -1;

    /* renamed from: i */
    static volatile int f10478i = -1;

    /* renamed from: j */
    static volatile int f10479j = -1;

    /* renamed from: k */
    static volatile int f10480k = -1;

    /* renamed from: a */
    private static void m11232a(Configuration configuration) {
        if (f10471b == null) {
            f10471b = new C2402g(configuration);
        }
    }

    /* renamed from: b */
    private static C2711k m11233b(Context context) {
        int hashCode = context.getResources().hashCode();
        ConcurrentHashMap<Integer, C2711k> concurrentHashMap = f10472c;
        C2711k kVar = concurrentHashMap.get(Integer.valueOf(hashCode));
        if (kVar != null) {
            return kVar;
        }
        C2711k kVar2 = new C2711k();
        concurrentHashMap.put(Integer.valueOf(hashCode), kVar2);
        return kVar2;
    }

    /* renamed from: c */
    public static int m11234c(Context context) {
        Point d = m11235d(context);
        return Math.min(d.x, d.y);
    }

    /* renamed from: d */
    public static Point m11235d(Context context) {
        Point point = f10470a;
        if (m11244m(point)) {
            m11251t(C2715o.m11334e(context), context);
        }
        return point;
    }

    /* renamed from: e */
    public static int m11236e(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        m11232a(configuration);
        return (int) (((float) configuration.smallestScreenWidthDp) * ((((float) f10471b.f9352b) * 1.0f) / ((float) configuration.densityDpi)));
    }

    /* renamed from: f */
    public static int m11237f(Context context, boolean z) {
        if (f10477h == -1) {
            synchronized (f10474e) {
                if (f10477h == -1) {
                    f10477h = C2698f.m11279g(context);
                    f10478i = (int) (((float) f10477h) / (((float) context.getResources().getConfiguration().densityDpi) / 160.0f));
                }
            }
        }
        return z ? f10478i : f10477h;
    }

    /* renamed from: g */
    public static C2711k m11238g(Context context) {
        return m11240i(context, (Configuration) null, false);
    }

    /* renamed from: h */
    public static C2711k m11239h(Context context, Configuration configuration) {
        return m11240i(context, configuration, false);
    }

    /* renamed from: i */
    public static C2711k m11240i(Context context, Configuration configuration, boolean z) {
        C2711k b = m11233b(context);
        m11252u(context, b, configuration, z);
        return b;
    }

    /* renamed from: j */
    public static Point m11241j(Context context) {
        C2711k b = m11233b(context);
        if (b.f10507a) {
            m11254w(context, b);
        }
        return b.f10509c;
    }

    /* renamed from: k */
    public static void m11242k(Application application) {
        f10471b = new C2402g(application.getResources().getConfiguration());
    }

    /* renamed from: l */
    public static boolean m11243l(Context context) {
        return C2709i.m11321b(m11233b(context).f10512f);
    }

    /* renamed from: m */
    private static boolean m11244m(Point point) {
        return point.x == -1 && point.y == -1;
    }

    /* renamed from: n */
    public static void m11245n(Context context) {
        Point point = f10470a;
        synchronized (point) {
            m11246o(point);
        }
        synchronized (f10473d) {
            f10476g = null;
        }
        synchronized (f10475f) {
            f10479j = -1;
            f10480k = -1;
        }
        synchronized (f10474e) {
            f10477h = -1;
            f10478i = -1;
        }
    }

    /* renamed from: o */
    public static void m11246o(Point point) {
        if (point.x != -1 || point.y != -1) {
            point.x = -1;
            point.y = -1;
        }
    }

    /* renamed from: p */
    public static synchronized void m11247p(Context context) {
        synchronized (C2693a.class) {
            m11248q(m11233b(context));
        }
    }

    /* renamed from: q */
    public static void m11248q(C2711k kVar) {
        kVar.f10508b = true;
        kVar.f10507a = true;
    }

    /* renamed from: r */
    public static void m11249r(Context context) {
        f10472c.remove(Integer.valueOf(context.getResources().hashCode()));
    }

    /* renamed from: s */
    public static void m11250s(C2402g gVar) {
        f10471b = gVar;
    }

    /* renamed from: t */
    public static void m11251t(WindowManager windowManager, Context context) {
        Point point = f10470a;
        synchronized (point) {
            C2715o.m11332c(windowManager, context, point);
        }
    }

    /* renamed from: u */
    public static void m11252u(Context context, C2711k kVar, Configuration configuration, boolean z) {
        if (kVar != null) {
            if (kVar.f10507a || z) {
                if (configuration != null) {
                    m11255x(configuration, kVar);
                } else {
                    m11254w(context, kVar);
                }
            }
            if (kVar.f10508b || z) {
                m11253v(context, kVar);
            }
        }
    }

    /* renamed from: v */
    public static void m11253v(Context context, C2711k kVar) {
        if (kVar.f10507a) {
            m11254w(context, kVar);
        }
        C2709i.m11320a(context, kVar, m11235d(context));
        kVar.f10508b = false;
    }

    /* renamed from: w */
    public static void m11254w(Context context, C2711k kVar) {
        C2715o.m11336g(context, kVar.f10509c);
        float f = ((float) context.getResources().getConfiguration().densityDpi) / 160.0f;
        kVar.f10510d.set(C2698f.m11287o(f, (float) kVar.f10509c.x), C2698f.m11287o(f, (float) kVar.f10509c.y));
        Point point = kVar.f10510d;
        kVar.f10511e = C1319a.m5967c(point.x, point.y);
        kVar.f10507a = false;
    }

    /* renamed from: x */
    public static void m11255x(Configuration configuration, C2711k kVar) {
        m11232a(configuration);
        int i = configuration.densityDpi;
        float f = (((float) f10471b.f9352b) * 1.0f) / ((float) i);
        float f2 = (((float) i) / 160.0f) * f;
        kVar.f10509c.set(C2698f.m11274b(f2, (float) configuration.screenWidthDp), C2698f.m11274b(f2, (float) configuration.screenHeightDp));
        kVar.f10510d.set((int) (((float) configuration.screenWidthDp) * f), (int) (((float) configuration.screenHeightDp) * f));
        Point point = kVar.f10510d;
        kVar.f10511e = C1319a.m5967c(point.x, point.y);
        kVar.f10507a = false;
    }
}
