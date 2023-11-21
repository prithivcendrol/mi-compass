package p140y0;

import android.content.Context;
import android.content.SharedPreferences;
import p130w0.C2874a;

/* renamed from: y0.a */
public class C2911a {

    /* renamed from: a */
    private static SharedPreferences f11086a;

    /* renamed from: b */
    private static SharedPreferences.Editor f11087b;

    /* renamed from: A */
    public static void m12019A(long j) {
        m12042l("next_update_common_conf_time", j);
    }

    /* renamed from: B */
    public static void m12020B(String str) {
        m12043m("last_app_version", str);
    }

    /* renamed from: C */
    public static void m12021C(long j) {
        m12042l("pref_instance_id_last_use_time", j);
    }

    /* renamed from: D */
    public static String m12022D() {
        return m12036f("common_cloud_data", "");
    }

    /* renamed from: E */
    public static String m12023E() {
        return m12036f("pref_instance_id", "");
    }

    /* renamed from: F */
    public static void m12024F(long j) {
        m12042l("dau_last_time", j);
    }

    /* renamed from: G */
    public static void m12025G(long j) {
        m12042l("first_launch_time", j);
    }

    /* renamed from: H */
    public static boolean m12026H() {
        return m12039i("onetrack_first_open", true);
    }

    /* renamed from: I */
    public static long m12027I() {
        return m12034d("dau_last_time", 0);
    }

    /* renamed from: J */
    public static String m12028J() {
        return m12036f("onetrack_user_id", "");
    }

    /* renamed from: K */
    public static String m12029K() {
        return m12036f("onetrack_user_type", "");
    }

    /* renamed from: L */
    public static String m12030L() {
        return m12036f("page_end", "");
    }

    /* renamed from: a */
    public static String m12031a() {
        return m12036f("last_app_version", "");
    }

    /* renamed from: b */
    public static long m12032b() {
        return m12034d("first_launch_time", 0);
    }

    /* renamed from: c */
    private static void m12033c() {
        if (f11087b == null) {
            synchronized (C2911a.class) {
                if (f11087b == null) {
                    SharedPreferences sharedPreferences = C2874a.m11876a().getSharedPreferences("one_track_pref", 0);
                    f11086a = sharedPreferences;
                    f11087b = sharedPreferences.edit();
                }
            }
        }
    }

    /* renamed from: d */
    private static long m12034d(String str, long j) {
        m12033c();
        return f11086a.getLong(str, j);
    }

    /* renamed from: e */
    public static String m12035e(Context context) {
        return m12036f("custom_id", "");
    }

    /* renamed from: f */
    private static String m12036f(String str, String str2) {
        m12033c();
        return f11086a.getString(str, str2);
    }

    /* renamed from: g */
    public static void m12037g(long j) {
        m12042l("last_upload_active_time", j);
    }

    /* renamed from: h */
    public static void m12038h(String str) {
        m12043m("secret_key_data", str);
    }

    /* renamed from: i */
    private static boolean m12039i(String str, boolean z) {
        m12033c();
        return f11086a.getBoolean(str, z);
    }

    /* renamed from: j */
    public static long m12040j() {
        return m12034d("last_collect_crash_time", 0);
    }

    /* renamed from: k */
    public static void m12041k(String str) {
        m12043m("region_rul", str);
    }

    /* renamed from: l */
    private static void m12042l(String str, long j) {
        m12033c();
        f11087b.putLong(str, j).apply();
    }

    /* renamed from: m */
    private static void m12043m(String str, String str2) {
        m12033c();
        f11087b.putString(str, str2).apply();
    }

    /* renamed from: n */
    private static void m12044n(String str, boolean z) {
        m12033c();
        f11087b.putBoolean(str, z).apply();
    }

    /* renamed from: o */
    public static long m12045o() {
        return m12034d("report_crash_ticket", 0);
    }

    /* renamed from: p */
    public static void m12046p(long j) {
        m12042l("last_collect_crash_time", j);
    }

    /* renamed from: q */
    public static void m12047q(String str) {
        m12043m("common_config_hash", str);
    }

    /* renamed from: r */
    public static void m12048r(boolean z) {
        m12044n("onetrack_first_open", z);
    }

    /* renamed from: s */
    public static void m12049s(long j) {
        m12042l("report_crash_ticket", j);
    }

    /* renamed from: t */
    public static void m12050t(String str) {
        m12043m("common_cloud_data", str);
    }

    /* renamed from: u */
    public static void m12051u(String str) {
        m12043m("pref_instance_id", str);
        m12021C(C2913c.m12059a());
    }

    /* renamed from: v */
    public static String m12052v() {
        return m12036f("secret_key_data", "");
    }

    /* renamed from: w */
    public static String m12053w() {
        return m12036f("region_rul", "");
    }

    /* renamed from: x */
    public static void m12054x(long j) {
        m12042l("last_secret_key_time", j);
    }

    /* renamed from: y */
    public static void m12055y(String str) {
        m12043m("page_end", str);
    }

    /* renamed from: z */
    public static long m12056z() {
        return m12034d("next_update_common_conf_time", 0);
    }
}
