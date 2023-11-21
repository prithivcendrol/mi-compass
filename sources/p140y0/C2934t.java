package p140y0;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import p100q0.C2568g;
import p115t0.C2672g;
import p130w0.C2874a;

/* renamed from: y0.t */
public class C2934t {

    /* renamed from: a */
    private static Class f11132a;

    /* renamed from: b */
    private static Method f11133b;

    /* renamed from: c */
    private static Boolean f11134c;

    /* renamed from: d */
    private static final DecimalFormat f11135d = new DecimalFormat("#0");

    /* renamed from: e */
    private static final DecimalFormat f11136e = new DecimalFormat("#0.#");

    /* renamed from: f */
    private static volatile long f11137f = 0;

    /* renamed from: g */
    private static Method f11138g;

    /* renamed from: h */
    private static boolean f11139h;

    /* renamed from: i */
    private static String f11140i;

    /* renamed from: j */
    private static boolean f11141j = false;

    /* renamed from: k */
    private static int f11142k;

    /* renamed from: l */
    private static final Set<String> f11143l = new HashSet(Arrays.asList(new String[]{"AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"}));

    static {
        try {
            f11138g = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
        } catch (Exception unused) {
        }
        try {
            f11132a = Class.forName("miui.os.Build");
        } catch (Exception unused2) {
        }
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Secure").getDeclaredMethod("isUserExperienceProgramEnable", new Class[]{ContentResolver.class});
            f11133b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    public static boolean m12149a() {
        return (!m12158j() || f11141j) ? f11139h : m12153e();
    }

    /* renamed from: b */
    public static String m12150b() {
        return (!m12158j() || f11141j) ? !TextUtils.isEmpty(f11140i) ? f11140i : m12152d() : m12152d();
    }

    /* renamed from: c */
    public static String m12151c() {
        return m12152d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m12152d() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ro.miui.region"
            java.lang.String r1 = p140y0.C2912b.m12058b(r1, r0)     // Catch:{ Exception -> 0x009d }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x0014
            java.lang.String r1 = "ro.product.locale.region"
            java.lang.String r1 = p140y0.C2912b.m12058b(r1, r0)     // Catch:{ Exception -> 0x009d }
        L_0x0014:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x0084
            java.lang.String r2 = "android.os.LocaleList"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = "getDefault"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x009d }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x009d }
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x009d }
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch:{ Exception -> 0x009d }
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = "size"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x009d }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch:{ Exception -> 0x009d }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x009d }
            java.lang.Object r3 = r3.invoke(r2, r5)     // Catch:{ Exception -> 0x009d }
            boolean r5 = r3 instanceof java.lang.Integer     // Catch:{ Exception -> 0x009d }
            if (r5 == 0) goto L_0x0084
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x009d }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x009d }
            if (r3 <= 0) goto L_0x0084
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = "get"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x009d }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009d }
            r7[r4] = r8     // Catch:{ Exception -> 0x009d }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r7)     // Catch:{ Exception -> 0x009d }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x009d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x009d }
            r5[r4] = r6     // Catch:{ Exception -> 0x009d }
            java.lang.Object r2 = r3.invoke(r2, r5)     // Catch:{ Exception -> 0x009d }
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = "getCountry"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x009d }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch:{ Exception -> 0x009d }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x009d }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ Exception -> 0x009d }
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x009d }
            if (r3 == 0) goto L_0x0084
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x009d }
        L_0x0084:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x0092
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x009d }
            java.lang.String r1 = r1.getCountry()     // Catch:{ Exception -> 0x009d }
        L_0x0092:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x009d }
            if (r2 != 0) goto L_0x00a5
            java.lang.String r0 = r1.trim()     // Catch:{ Exception -> 0x009d }
            return r0
        L_0x009d:
            r1 = move-exception
            java.lang.String r2 = "OsUtil"
            java.lang.String r3 = "getRegion Exception: "
            p140y0.C2933s.m12145g(r2, r3, r1)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p140y0.C2934t.m12152d():java.lang.String");
    }

    /* renamed from: e */
    private static boolean m12153e() {
        Class cls = f11132a;
        if (cls != null) {
            try {
                return ((Boolean) cls.getField("IS_INTERNATIONAL_BUILD").get((Object) null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        String d = m12152d();
        if (!TextUtils.isEmpty(d)) {
            return !TextUtils.equals("CN", d.toUpperCase());
        }
        return false;
    }

    /* renamed from: f */
    public static String m12154f(int i) {
        try {
            int i2 = i / 60000;
            char c = '+';
            if (i2 < 0) {
                c = '-';
                i2 = -i2;
            }
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(c);
            m12155g(sb, i2 / 60);
            sb.append(':');
            m12155g(sb, i2 % 60);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static void m12155g(StringBuilder sb, int i) {
        String num = Integer.toString(i);
        for (int i2 = 0; i2 < 2 - num.length(); i2++) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* renamed from: h */
    public static void m12156h(boolean z) {
        f11141j = z;
    }

    /* renamed from: i */
    public static void m12157i(boolean z, String str, C2568g.C2571c cVar) {
        int i = cVar == C2568g.C2571c.APP ? 3 : cVar == C2568g.C2571c.PLUGIN ? 2 : cVar == C2568g.C2571c.SDK ? 1 : 0;
        if (f11142k <= i) {
            f11139h = z;
            f11140i = str;
            f11142k = i;
        }
    }

    /* renamed from: j */
    public static boolean m12158j() {
        Boolean bool = f11134c;
        if (bool != null) {
            return bool.booleanValue();
        }
        f11134c = !TextUtils.isEmpty(m12164p("ro.miui.ui.version.code")) ? Boolean.TRUE : Boolean.FALSE;
        return f11134c.booleanValue();
    }

    /* renamed from: k */
    public static boolean m12159k(String str) {
        if (C2568g.m10961b() || C2568g.m10962c()) {
            C2933s.m12146h(str, "should not access network or location, cta");
            return true;
        } else if (!m12168t()) {
            C2933s.m12146h(str, "should not access network or location, not provisioned");
            return true;
        } else if (C2672g.m11175d()) {
            return false;
        } else {
            C2933s.m12146h(str, "should not access network or location, cta");
            return true;
        }
    }

    /* renamed from: l */
    public static String m12160l() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: m */
    public static String m12161m() {
        return Build.VERSION.INCREMENTAL;
    }

    /* renamed from: n */
    public static String m12162n() {
        return m12154f(TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: o */
    public static String m12163o() {
        Class cls = f11132a;
        if (cls == null) {
            return "";
        }
        try {
            return ((Boolean) cls.getField("IS_ALPHA_BUILD").get((Object) null)).booleanValue() ? "A" : ((Boolean) f11132a.getField("IS_DEVELOPMENT_VERSION").get((Object) null)).booleanValue() ? "D" : ((Boolean) f11132a.getField("IS_STABLE_VERSION").get((Object) null)).booleanValue() ? "S" : "";
        } catch (Exception e) {
            Log.e("OsUtil", "getRomBuildCode failed: " + e.toString());
            return "";
        }
    }

    /* renamed from: p */
    private static String m12164p(String str) {
        try {
            Method method = f11138g;
            if (method != null) {
                return String.valueOf(method.invoke((Object) null, new Object[]{str}));
            }
        } catch (Exception e) {
            C2933s.m12141c("OsUtil", "getProp failed ex: " + e.getMessage());
        }
        return null;
    }

    /* renamed from: q */
    public static String m12165q() {
        return Build.VERSION.INCREMENTAL;
    }

    /* renamed from: r */
    public static String m12166r() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12167s() {
        /*
            java.lang.String r0 = "OsUtil"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.os.UserHandle"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r4 = "getUserId"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0043 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0043 }
            r6[r2] = r7     // Catch:{ Exception -> 0x0043 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r6)     // Catch:{ Exception -> 0x0043 }
            r3.setAccessible(r5)     // Catch:{ Exception -> 0x0043 }
            int r4 = android.os.Process.myUid()     // Catch:{ Exception -> 0x0043 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0043 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0043 }
            r6[r2] = r7     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r3 = r3.invoke(r1, r6)     // Catch:{ Exception -> 0x0043 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = "getUserId, uid:%d, userId:%d"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0041 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0041 }
            r6[r2] = r4     // Catch:{ Exception -> 0x0041 }
            r6[r5] = r3     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = java.lang.String.format(r1, r6)     // Catch:{ Exception -> 0x0041 }
            p140y0.C2933s.m12141c(r0, r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0050
        L_0x0041:
            r1 = move-exception
            goto L_0x0047
        L_0x0043:
            r3 = move-exception
            r8 = r3
            r3 = r1
            r1 = r8
        L_0x0047:
            java.lang.String r0 = p140y0.C2933s.m12139a(r0)
            java.lang.String r4 = "getUserId exception: "
            android.util.Log.e(r0, r4, r1)
        L_0x0050:
            if (r3 != 0) goto L_0x0056
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x0056:
            int r0 = r3.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p140y0.C2934t.m12167s():int");
    }

    @TargetApi(17)
    /* renamed from: t */
    public static boolean m12168t() {
        try {
            boolean z = false;
            if (Settings.Global.getInt(C2874a.m11876a().getContentResolver(), "device_provisioned", 0) != 0) {
                z = true;
            }
            if (!z) {
                C2933s.m12146h("OsUtil", "Provisioned: " + z);
            }
            return z;
        } catch (Exception e) {
            C2933s.m12145g("OsUtil", "isDeviceProvisioned exception", e);
            return true;
        }
    }
}
