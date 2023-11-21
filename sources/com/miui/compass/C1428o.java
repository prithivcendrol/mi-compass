package com.miui.compass;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: com.miui.compass.o */
public class C1428o {
    /* renamed from: a */
    public static boolean m6371a(int i, int i2) {
        if (i != 2307 || i2 != 2308) {
            return false;
        }
        C1421i.m6355g(CompassApplication.m6126d(), false);
        return true;
    }

    /* renamed from: b */
    public static boolean m6372b(Activity activity) {
        if (!C1433t.m6380b("KR") || !C1421i.m6353e(activity)) {
            return true;
        }
        Intent intent = new Intent("miui.intent.action.APP_PERMISSION_USE");
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission-group.CAMERA@1");
        arrayList.add("android.permission-group.LOCATION@1");
        intent.putStringArrayListExtra("extra_main_permission_groups", arrayList);
        intent.putExtra("extra_pkgname", "com.miui.compass");
        try {
            activity.startActivityForResult(intent, 2307);
            return false;
        } catch (Exception e) {
            Log.d("KoreaRegionUtils", "korea authorize error：" + e.toString());
            return true;
        }
    }
}
