package p137x2;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: x2.a */
public class C2901a {

    /* renamed from: A */
    private static Context f11030A;

    /* renamed from: B */
    public static int f11031B = 1;

    /* renamed from: C */
    private static int f11032C = 1;

    /* renamed from: D */
    private static boolean f11033D = false;

    /* renamed from: E */
    public static int f11034E = 1;

    /* renamed from: F */
    public static int f11035F = 2;

    /* renamed from: G */
    public static int f11036G = 3;

    /* renamed from: H */
    private static int f11037H;

    /* renamed from: I */
    private static int f11038I;

    /* renamed from: J */
    private static int f11039J;

    /* renamed from: K */
    private static int f11040K;

    /* renamed from: a */
    static final Pattern f11041a = Pattern.compile("Inc ([A-Z]+)([\\d]+)");

    /* renamed from: b */
    static final Pattern f11042b = Pattern.compile("MT([\\d]{2})([\\d]+)");

    /* renamed from: c */
    static Boolean f11043c = null;

    /* renamed from: d */
    static int f11044d = -2;

    /* renamed from: e */
    static int f11045e = -2;

    /* renamed from: f */
    static Boolean f11046f = null;

    /* renamed from: g */
    private static int f11047g = -1;

    /* renamed from: h */
    private static Boolean f11048h = null;

    /* renamed from: i */
    private static Boolean f11049i = null;

    /* renamed from: j */
    private static Boolean f11050j = null;

    /* renamed from: k */
    static int f11051k = -1;

    /* renamed from: l */
    static int f11052l = -1;

    /* renamed from: m */
    static int f11053m = -1;

    /* renamed from: n */
    static int f11054n = -1;

    /* renamed from: o */
    static int f11055o = Integer.MAX_VALUE;

    /* renamed from: p */
    private static final String[] f11056p = {"cactus", "cereus", "pine", "olive", "ginkgo", "olivelite", "olivewood", "willow", "wayne", "dandelion", "angelica", "angelicain", "whyred", "tulip", "onc", "onclite", "lavender", "lotus", "laurus", "merlinnfc", "merlin", "lancelot", "citrus", "pomelo", "lemon", "shiva", "lime", "cannon", "curtana", "durandal", "excalibur", "joyeuse", "gram", "sunny", "mojito", "rainbow", "cattail", "angelican", "camellia"};

    /* renamed from: q */
    private static Class f11057q;

    /* renamed from: r */
    private static PathClassLoader f11058r;

    /* renamed from: s */
    private static Constructor<Class> f11059s;

    /* renamed from: t */
    private static Object f11060t = null;

    /* renamed from: u */
    private static Method f11061u = null;

    /* renamed from: v */
    private static Method f11062v = null;

    /* renamed from: w */
    private static Method f11063w = null;

    /* renamed from: x */
    private static Method f11064x;

    /* renamed from: y */
    private static Method f11065y;

    /* renamed from: z */
    private static Application f11066z;

    /* renamed from: x2.a$a */
    public static class C2902a {

        /* renamed from: a */
        int f11067a;

        /* renamed from: b */
        int f11068b;

        /* renamed from: c */
        int f11069c;

        /* renamed from: d */
        int f11070d;

        /* renamed from: e */
        int f11071e;

        public String toString() {
            return "CpuInfo{id=" + this.f11067a + ", implementor=" + Integer.toHexString(this.f11068b) + ", architecture=" + this.f11069c + ", part=" + Integer.toHexString(this.f11070d) + ", maxFreq=" + this.f11071e + '}';
        }
    }

    /* renamed from: x2.a$b */
    public static class C2903b {

        /* renamed from: a */
        int f11072a = -1;

        /* renamed from: b */
        int f11073b;

        /* renamed from: c */
        int f11074c;

        /* renamed from: d */
        int f11075d;

        public String toString() {
            return "CpuStats{level=" + this.f11072a + ", maxFreq=" + this.f11073b + ", bigCoreCount=" + this.f11074c + ", smallCoreCount=" + this.f11075d + '}';
        }
    }

    static {
        Class<?> loadClass;
        f11059s = null;
        f11064x = null;
        f11065y = null;
        try {
            if (Build.VERSION.SDK_INT > 33) {
                PathClassLoader pathClassLoader = new PathClassLoader("/system_ext/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
                f11058r = pathClassLoader;
                loadClass = pathClassLoader.loadClass("com.miui.performance.DeviceLevelUtils");
            } else {
                PathClassLoader pathClassLoader2 = new PathClassLoader("/system/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
                f11058r = pathClassLoader2;
                loadClass = pathClassLoader2.loadClass("com.miui.performance.DeviceLevelUtils");
            }
            f11057q = loadClass;
            f11059s = f11057q.getConstructor(new Class[]{Context.class});
            f11064x = f11057q.getDeclaredMethod("getMiuiLiteVersion", new Class[0]);
        } catch (Exception e) {
            Log.e("DeviceUtils", "static init(): Load Class Exception:" + e);
        }
        try {
            f11065y = f11057q.getDeclaredMethod("getMiuiMiddleVersion", new Class[0]);
        } catch (Exception e2) {
            Log.e("DeviceUtils", "static init(): Load MiuiMiddle Class Exception:" + e2);
        }
        if (f11057q == null) {
            Log.e("DeviceUtils", "static init(): MiuiBooster is not in this rom");
        }
    }

    /* renamed from: A */
    public static int m11960A() {
        if (f11055o == Integer.MAX_VALUE) {
            try {
                f11055o = (int) (((((Long) Class.forName("miui.util.HardwareInfo").getMethod("getTotalPhysicalMemory", new Class[0]).invoke((Object) null, new Object[0])).longValue() / 1024) / 1024) / 1024);
            } catch (Throwable th) {
                Log.e("DeviceUtils", th.getMessage());
                f11055o = 0;
            }
        }
        return f11055o;
    }

    /* renamed from: B */
    private static boolean m11961B() {
        boolean z = f11033D;
        if (z) {
            return z;
        }
        try {
            Class x = m11993x();
            if (x == null) {
                return f11033D;
            }
            Class cls = Integer.TYPE;
            f11061u = x.getDeclaredMethod("getDeviceLevel", new Class[]{cls, cls});
            f11062v = x.getDeclaredMethod("getDeviceLevel", new Class[]{cls});
            f11034E = ((Integer) m11995z(x, "DEVICE_LEVEL_FOR_RAM", cls)).intValue();
            f11035F = ((Integer) m11995z(x, "DEVICE_LEVEL_FOR_CPU", cls)).intValue();
            f11036G = ((Integer) m11995z(x, "DEVICE_LEVEL_FOR_GPU", cls)).intValue();
            f11037H = ((Integer) m11995z(x, "LOW_DEVICE", cls)).intValue();
            f11038I = ((Integer) m11995z(x, "MIDDLE_DEVICE", cls)).intValue();
            f11039J = ((Integer) m11995z(x, "HIGH_DEVICE", cls)).intValue();
            f11040K = ((Integer) m11995z(x, "DEVICE_LEVEL_UNKNOWN", cls)).intValue();
            f11033D = true;
            return f11033D;
        } catch (Exception e) {
            Log.e("DeviceUtils", "initDeviceLevelInfo Fail: Exception:" + e);
        }
    }

    /* renamed from: C */
    public static boolean m11962C() {
        if (f11046f == null) {
            f11046f = Boolean.valueOf("true".contentEquals(C2904b.m11996a("ro.config.low_ram.support_miuilite_plus", "false")));
        }
        return f11046f.booleanValue();
    }

    /* renamed from: D */
    public static boolean m11963D() {
        if (f11043c == null) {
            try {
                f11043c = Boolean.valueOf(((Boolean) Class.forName("miui.os.Build").getDeclaredField("IS_MIUI_LITE_VERSION").get((Object) null)).booleanValue());
            } catch (Throwable th) {
                Log.i("DeviceUtils", "isMiuiLiteRom failed", th);
                f11043c = null;
            }
        }
        return Boolean.TRUE.equals(f11043c);
    }

    /* renamed from: E */
    public static boolean m11964E() {
        return m11963D() && m11988s() >= 2;
    }

    /* renamed from: F */
    public static boolean m11965F() {
        return m11990u() >= 1;
    }

    /* renamed from: G */
    private static C2902a m11966G(String[] strArr, List<C2902a> list, C2902a aVar) {
        String trim = strArr[1].trim();
        if (strArr[0].contains("processor") && TextUtils.isDigitsOnly(trim)) {
            C2902a a = m11970a(trim);
            list.add(a);
            return a;
        } else if (aVar == null) {
            return aVar;
        } else {
            m11975f(strArr[0], trim, aVar);
            return aVar;
        }
    }

    /* renamed from: H */
    private static int m11967H(int i, int i2, int i3) {
        f11032C = i;
        if (i3 == f11035F) {
            f11052l = i2;
            return i2;
        } else if (i3 == f11036G) {
            f11053m = i2;
            return i2;
        } else if (i3 != f11034E) {
            return -1;
        } else {
            f11054n = i2;
            return i2;
        }
    }

    /* renamed from: I */
    private static int m11968I(String str) {
        return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
    }

    /* renamed from: J */
    private static int m11969J(int i) {
        if (i == f11037H) {
            return 0;
        }
        if (i == f11038I) {
            return 1;
        }
        return i == f11039J ? 2 : -1;
    }

    /* renamed from: a */
    private static C2902a m11970a(String str) {
        C2902a aVar = new C2902a();
        int parseInt = Integer.parseInt(str);
        aVar.f11067a = parseInt;
        String e = m11974e(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", new Object[]{Integer.valueOf(parseInt)}));
        if (e != null) {
            aVar.f11071e = Integer.parseInt(e);
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r5.f11073b > 2300000) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r5.f11072a = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 > 2300000) goto L_0x0022;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11971b(p137x2.C2901a.C2903b r5) {
        /*
            int r0 = r5.f11072a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return
        L_0x0006:
            int r0 = r5.f11074c
            r1 = 4
            r2 = 1
            r3 = 0
            r4 = 2300000(0x231860, float:3.222986E-39)
            if (r0 < r1) goto L_0x001e
            int r0 = r5.f11073b
            r1 = 2700000(0x2932e0, float:3.783506E-39)
            if (r0 <= r1) goto L_0x001b
            r0 = 2
            r5.f11072a = r0
            goto L_0x0027
        L_0x001b:
            if (r0 <= r4) goto L_0x0025
            goto L_0x0022
        L_0x001e:
            int r0 = r5.f11073b
            if (r0 <= r4) goto L_0x0025
        L_0x0022:
            r5.f11072a = r2
            goto L_0x0027
        L_0x0025:
            r5.f11072a = r3
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p137x2.C2901a.m11971b(x2.a$b):void");
    }

    /* renamed from: c */
    private static void m11972c(C2903b bVar, List<C2902a> list) {
        for (C2902a next : list) {
            if (next.f11069c < 8) {
                bVar.f11072a = 0;
            }
            int i = next.f11071e;
            if (i > bVar.f11073b) {
                bVar.f11073b = i;
            }
            if (i >= 2000000) {
                bVar.f11074c++;
            } else {
                bVar.f11075d++;
            }
        }
        m11971b(bVar);
    }

    /* renamed from: d */
    private static Context m11973d() {
        if (f11030A == null) {
            try {
                Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
                f11066z = application;
                if (application != null) {
                    f11030A = application.getApplicationContext();
                }
            } catch (Exception e) {
                Log.e("DeviceUtils", "android.app.ActivityThread Exception:" + e);
            }
        }
        if (f11030A == null) {
            try {
                Application application2 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke((Object) null, (Object[]) null);
                f11066z = application2;
                if (application2 != null) {
                    f11030A = application2.getApplicationContext();
                }
            } catch (Exception e2) {
                Log.e("DeviceUtils", "android.app.AppGlobals Exception:" + e2);
            }
        }
        return f11030A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[SYNTHETIC, Splitter:B:13:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0028 A[SYNTHETIC, Splitter:B:21:0x0028] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11974e(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025, all -> 0x001e }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0025, all -> 0x001e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r3.close()     // Catch:{ IOException -> 0x0026, all -> 0x001b }
            r1.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            return r2
        L_0x001b:
            r3 = move-exception
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r3 = move-exception
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            throw r3
        L_0x0025:
            r1 = r0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p137x2.C2901a.m11974e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static void m11975f(String str, String str2, C2902a aVar) {
        if (str.contains("CPU implementer")) {
            aVar.f11068b = m11968I(str2);
        } else if (str.contains("CPU architecture")) {
            aVar.f11069c = m11968I(str2);
        } else if (str.contains("CPU part")) {
            aVar.f11070d = m11968I(str2);
        }
    }

    /* renamed from: g */
    public static List<C2902a> m11976g() {
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            C2902a aVar = null;
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(": ");
                if (split.length > 1) {
                    aVar = m11966G(split, arrayList, aVar);
                }
            }
        } catch (Exception e) {
            Log.e("DeviceUtils", "getChipSetFromCpuInfo failed", e);
        }
        return arrayList;
    }

    /* renamed from: h */
    private static int m11977h() {
        String q = m11986q();
        int y = q.length() > 0 ? q.contains("Qualcomm") ? m11994y(q) : m11991v(q) : -1;
        return y == -1 ? m11978i().f11072a : y;
    }

    /* renamed from: i */
    public static C2903b m11978i() {
        List<C2902a> g = m11976g();
        C2903b bVar = new C2903b();
        if (g.size() < 8) {
            bVar.f11072a = 0;
        }
        m11972c(bVar, g);
        return bVar;
    }

    /* renamed from: j */
    public static int m11979j() {
        return m11980k(f11031B);
    }

    /* renamed from: k */
    public static int m11980k(int i) {
        int i2;
        if (f11032C == i && (i2 = f11051k) != -1) {
            return i2;
        }
        f11032C = i;
        int o = m11984o(i);
        f11051k = o;
        return o != -1 ? o : m11982m();
    }

    /* renamed from: l */
    public static int m11981l(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 == f11035F) {
            if (f11032C == i && (i5 = f11052l) != -1) {
                return i5;
            }
        } else if (i2 == f11036G) {
            if (f11032C == i && (i4 = f11053m) != -1) {
                return i4;
            }
        } else if (i2 == f11034E && f11032C == i && (i3 = f11054n) != -1) {
            return i3;
        }
        int p = m11985p(i, i2);
        return p != -1 ? m11967H(i, p, i2) : m11967H(i, m11983n(i2), i2);
    }

    /* renamed from: m */
    private static int m11982m() {
        int i = f11051k;
        if (i != -1) {
            return i;
        }
        if (m11963D()) {
            f11051k = 0;
        } else {
            f11051k = m11987r(m11983n(f11035F), m11983n(f11034E), m11981l(f11031B, f11036G));
        }
        return f11051k;
    }

    /* renamed from: n */
    private static int m11983n(int i) {
        if (i == f11034E) {
            int A = m11960A();
            if (A > 6) {
                return 2;
            }
            if (A > 4) {
                return 1;
            }
            return A > 0 ? 0 : -1;
        } else if (i == f11035F) {
            return m11977h();
        } else {
            return -1;
        }
    }

    /* renamed from: o */
    private static int m11984o(int i) {
        int i2 = -1;
        if (!m11961B()) {
            return -1;
        }
        try {
            Object w = m11992w();
            if (w != null) {
                i2 = ((Integer) f11062v.invoke(w, new Object[]{Integer.valueOf(i)})).intValue();
                return m11969J(i2);
            }
            throw new Exception("perf is null!");
        } catch (Exception e) {
            Log.e("DeviceUtils", "getDeviceLevel failed , e:" + e.toString());
        }
    }

    /* renamed from: p */
    private static int m11985p(int i, int i2) {
        int i3 = -1;
        if (!m11961B()) {
            return -1;
        }
        try {
            Object w = m11992w();
            if (w != null) {
                i3 = ((Integer) f11061u.invoke(w, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).intValue();
                return m11969J(i3);
            }
            throw new Exception("perf is null!");
        } catch (Exception e) {
            Log.e("DeviceUtils", "getDeviceLevel failed , e:" + e.toString());
        }
    }

    /* renamed from: q */
    private static String m11986q() {
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (!scanner.hasNextLine()) {
                    String[] split = nextLine.split(": ");
                    if (split.length > 1) {
                        return split[1];
                    }
                }
            }
            return "";
        } catch (Exception e) {
            Log.e("DeviceUtils", "getChipSetFromCpuInfo failed", e);
            return "";
        }
    }

    /* renamed from: r */
    private static int m11987r(int... iArr) {
        if (iArr.length == 0) {
            return -1;
        }
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > -1 && i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m11988s() {
        if (!m11963D()) {
            f11044d = 0;
            return 0;
        }
        int i = f11044d;
        if (i != -2) {
            return i;
        }
        int i2 = -1;
        try {
            Object w = m11992w();
            if (w != null) {
                i2 = ((Integer) m11989t().invoke(w, new Object[0])).intValue();
                if (i2 < 2) {
                    i2 = 1;
                }
                f11044d = i2;
                return f11044d;
            }
            throw new Exception("perf is null!");
        } catch (Exception e) {
            Log.e("DeviceUtils", "getMiuiLiteVersion failed , e:" + e.toString());
        }
    }

    /* renamed from: t */
    private static Method m11989t() {
        if (f11064x == null) {
            f11064x = m11993x().getDeclaredMethod("getMiuiLiteVersion", new Class[0]);
        }
        return f11064x;
    }

    /* renamed from: u */
    public static int m11990u() {
        if (f11045e == -2) {
            try {
                Object invoke = f11065y.invoke(m11992w(), new Object[0]);
                if (invoke != null) {
                    f11045e = ((Integer) invoke).intValue();
                } else {
                    f11045e = -1;
                }
            } catch (Exception e) {
                f11045e = -1;
                Log.e("DeviceUtils", "getMiuiMiddleVersion failed , e:" + e.toString());
            }
        }
        return f11045e;
    }

    /* renamed from: v */
    private static int m11991v(String str) {
        String group;
        String group2;
        Matcher matcher = f11042b.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null || (group2 = matcher.group(2)) == null) {
            return -1;
        }
        return (Integer.parseInt(group) != 68 || Integer.parseInt(group2) < 73) ? 0 : 1;
    }

    /* renamed from: w */
    private static Object m11992w() {
        Constructor<Class> constructor;
        if (f11060t == null) {
            try {
                Context d = m11973d();
                if (d == null || (constructor = f11059s) == null) {
                    throw new Exception("getAppContext fail");
                }
                f11060t = constructor.newInstance(new Object[]{d});
            } catch (Exception e) {
                Log.e("DeviceUtils", "getPerf DeviceUtils(): newInstance Exception:" + e);
                e.printStackTrace();
            }
        }
        return f11060t;
    }

    /* renamed from: x */
    private static Class m11993x() {
        return f11057q;
    }

    /* renamed from: y */
    public static int m11994y(String str) {
        String group;
        String group2;
        Matcher matcher = f11041a.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null || (group2 = matcher.group(2)) == null) {
            return -1;
        }
        String lowerCase = group.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.equals("sm")) {
            return lowerCase.equals("sdm") ? Integer.parseInt(group2.substring(0, 1)) >= 7 ? 1 : 0 : lowerCase.equals("msm") ? 0 : -1;
        }
        int parseInt = Integer.parseInt(group2.substring(0, 1));
        if (parseInt >= 8) {
            return 2;
        }
        return parseInt >= 7 ? 1 : 0;
    }

    /* renamed from: z */
    private static <T> T m11995z(Class<?> cls, String str, Class<T> cls2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get((Object) null);
    }
}
