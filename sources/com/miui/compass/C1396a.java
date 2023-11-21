package com.miui.compass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0483b;
import androidx.core.content.C0510a;
import java.util.Locale;
import p094p0.C2536b;

/* renamed from: com.miui.compass.a */
public class C1396a {
    /* renamed from: a */
    public static boolean m6221a(Context context) {
        return C0510a.m2120a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0510a.m2120a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* renamed from: b */
    public static boolean m6222b(Context context) {
        return C0510a.m2120a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* renamed from: c */
    public static boolean m6223c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.lbe.security.miui", 128).metaData.getBoolean("miui.supportGetPermissionState", false);
        } catch (Exception e) {
            Log.e("Compass:AppPermsUtils", "getMeta error=" + e);
            return false;
        }
    }

    /* renamed from: d */
    public static int m6224d(Context context, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("permissionName", str);
            return context.getContentResolver().call(Uri.parse("content://com.lbe.security.miui.autostartmgr"), "getPermissionState", (String) null, bundle).getInt("flag");
        } catch (Exception e) {
            Log.d("Compass:AppPermsUtils", "getPermissionStatus error" + e);
            return -2;
        }
    }

    /* renamed from: e */
    public static boolean m6225e(String str) {
        return str == null || C0510a.m2120a(CompassApplication.m6126d(), str) == 0;
    }

    /* renamed from: f */
    public static boolean m6226f(Context context) {
        return C2536b.m10780d(context);
    }

    /* renamed from: g */
    public static void m6227g(Activity activity) {
        if (!m6225e("android.permission.ACCESS_FINE_LOCATION")) {
            Log.d("Compass:AppPermsUtils", "start to request loc perm");
            String[] strArr = new String[2];
            strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
            strArr[1] = activity.getString(C1407g.f5348s ? 2131820998 : 2131820999);
            C0483b.m2060l(activity, strArr, 0);
        }
    }

    /* renamed from: h */
    public static void m6228h(Activity activity, boolean z) {
        if (!m6225e("android.permission.CAMERA") && !z) {
            Log.d("Compass:AppPermsUtils", "start to request camera perm");
            C0483b.m2060l(activity, new String[]{"android.permission.CAMERA", activity.getString(2131820883)}, 1);
        }
    }

    /* renamed from: i */
    public static boolean m6229i(Activity activity, int i) {
        try {
            Intent intent = new Intent();
            intent.setAction(activity.getPackageManager().queryIntentActivities(intent, 0).size() > 0 ? "miui.intent.action.SYSTEM_PERMISSION_DECLARE_NEW" : "miui.intent.action.SYSTEM_PERMISSION_DECLARE");
            intent.setPackage("com.miui.securitycenter");
            if (!m6232l() || activity.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
                return false;
            }
            intent.putExtra("mandatory_permission", false);
            intent.putExtra("main_purpose", activity.getString(2131820879));
            intent.putExtra("all_purpose", C1407g.f5348s ? activity.getString(2131820880) : activity.getString(2131820881));
            intent.putExtra("use_network", false);
            intent.putExtra("show_lock", false);
            intent.putExtra("no_privacy_declare", true);
            String language = Locale.getDefault().getLanguage();
            String country = Locale.getDefault().getCountry();
            intent.putExtra("privacy_policy", "https://privacy.mi.com/Compass/" + language + "_" + country);
            activity.startActivityForResult(intent, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static void m6230j(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), (String) null));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: k */
    public static void m6231k(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.putExtra("extra_pkgname", context.getPackageName());
        context.startActivity(intent);
    }

    /* renamed from: l */
    public static boolean m6232l() {
        try {
            return CompassApplication.m6126d().getPackageManager().getPackageInfo("com.lbe.security.miui", 0).versionCode >= 111;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
