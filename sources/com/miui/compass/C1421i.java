package com.miui.compass;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.miui.compass.i */
public class C1421i {
    /* renamed from: a */
    public static boolean m6349a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pref_allow_network", false);
    }

    /* renamed from: b */
    public static float m6350b(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getFloat("pref_slp_accuracy", -9999.0f);
    }

    /* renamed from: c */
    public static long m6351c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("pref_last_alt_calebration_time", 0);
    }

    /* renamed from: d */
    public static float m6352d(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getFloat("pref_last_sea_level_pressure", 1013.25f);
    }

    /* renamed from: e */
    public static boolean m6353e(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pref_show_permissions", true);
    }

    /* renamed from: f */
    public static boolean m6354f(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pref_show_mobiledata_alert", true);
    }

    /* renamed from: g */
    public static void m6355g(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("pref_show_permissions", z).apply();
    }

    /* renamed from: h */
    public static void m6356h(Context context, float f, float f2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putFloat("pref_last_sea_level_pressure", f);
        edit.putLong("pref_last_alt_calebration_time", System.currentTimeMillis());
        edit.putFloat("pref_slp_accuracy", f2);
        edit.apply();
    }

    /* renamed from: i */
    public static void m6357i(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("pref_show_mobiledata_alert", z).apply();
    }

    /* renamed from: j */
    public static void m6358j(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("pref_show_first_using_alert", z).apply();
    }

    /* renamed from: k */
    public static void m6359k(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("pref_allow_network", z).apply();
    }
}
