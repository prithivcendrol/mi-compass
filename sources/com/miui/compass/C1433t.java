package com.miui.compass;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import miuix.core.util.SystemProperties;

/* renamed from: com.miui.compass.t */
public class C1433t {

    /* renamed from: a */
    private static final Set<String> f5587a = new HashSet(Arrays.asList(new String[]{"AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"}));

    /* renamed from: a */
    public static String m6379a() {
        String str = SystemProperties.get("ro.miui.region");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = SystemProperties.get("ro.product.locale.region");
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = SystemProperties.get("persist.sys.country");
        return TextUtils.isEmpty(str3) ? Locale.getDefault().getCountry() : str3;
    }

    /* renamed from: b */
    public static boolean m6380b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m6379a().equals(str);
    }
}
