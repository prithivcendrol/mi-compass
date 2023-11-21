package p140y0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p130w0.C2874a;

/* renamed from: y0.w */
public class C2938w {

    /* renamed from: a */
    private static Set<String> f11145a;

    static {
        try {
            HashSet hashSet = new HashSet();
            f11145a = hashSet;
            hashSet.add("android");
            f11145a.add("com.miui.analytics");
            f11145a.add("com.miui.cit");
            f11145a.add("com.xiaomi.finddevice");
            f11145a.add("com.miui.securitycenter");
            f11145a.add("com.android.settings");
            f11145a.add("com.android.vending");
            f11145a.add("com.google.android.gms");
            f11145a.add("com.xiaomi.factory.mmi");
            f11145a.add("com.miui.qr");
            f11145a.add("com.android.contacts");
            f11145a.add("com.qualcomm.qti.autoregistration");
            f11145a.add("com.miui.tsmclient");
            f11145a.add("com.miui.sekeytool");
            f11145a.add("com.android.updater");
            if ("cn_chinamobile".equals(C2912b.m12057a("ro.miui.cust_variant")) || "cn_chinatelecom".equals(C2912b.m12057a("ro.miui.cust_variant"))) {
                f11145a.add("com.mobiletools.systemhelper");
                f11145a.add("com.miui.dmregservice");
            }
        } catch (Exception e) {
            Log.e("PermissionUtil", "static initializer: " + e.toString());
        }
    }

    /* renamed from: a */
    private static boolean m12180a() {
        try {
            return C2934t.m12158j() && !C2934t.m12149a() && "1".equals(C2912b.m12057a("ro.miui.restrict_imei"));
        } catch (Exception e) {
            C2933s.m12144f("PermissionUtil", "isRestrictIMEI " + e.toString());
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m12181b(Context context) {
        return Build.VERSION.SDK_INT < 29 ? m12182c(context, "android.permission.READ_PHONE_STATE") : m12180a() ? m12183d(C2874a.m11880e()) && m12182c(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") : m12182c(context, "android.permission.READ_PRIVILEGED_PHONE_STATE");
    }

    /* renamed from: c */
    private static boolean m12182c(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = f11145a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m12183d(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r0 = f11145a
            if (r0 == 0) goto L_0x0012
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p140y0.C2938w.m12183d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public static boolean m12184e(Context context) {
        return m12182c(context, Build.VERSION.SDK_INT < 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PRIVILEGED_PHONE_STATE");
    }
}
