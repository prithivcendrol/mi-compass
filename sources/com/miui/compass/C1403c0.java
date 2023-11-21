package com.miui.compass;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Locale;
import miuix.animation.utils.DeviceUtils;
import miuix.appcompat.app.C2112p;
import p073l3.C1877a;
import p137x2.C2901a;

/* renamed from: com.miui.compass.c0 */
public class C1403c0 {

    /* renamed from: a */
    private static final HashMap<String, Typeface> f5340a = new HashMap<>();

    /* renamed from: b */
    private static final String[] f5341b = CompassApplication.m6126d().getResources().getStringArray(2130903049);

    /* renamed from: c */
    private static final boolean f5342c = DeviceUtils.isStockDevice();

    /* renamed from: d */
    private static Typeface f5343d;

    /* renamed from: e */
    private static Typeface f5344e;

    /* renamed from: a */
    public static double m6254a(double d, double d2) {
        return d2 / Math.pow(1.0d - (d / 44330.0d), 5.255d);
    }

    /* renamed from: b */
    public static String m6255b(Context context, int i, float f) {
        float round = (float) Math.round(f);
        if (round == 0.0f || round == 360.0f) {
            round = 0.0f;
        }
        return m6257d(context, i, round);
    }

    /* renamed from: c */
    public static void m6256c(C2112p pVar) {
        if (pVar != null) {
            pVar.dismiss();
        }
    }

    /* renamed from: d */
    public static String m6257d(Context context, int i, float f) {
        String[] strArr = f5341b;
        if (strArr != null && strArr.length > 0) {
            String language = Locale.getDefault().getLanguage();
            for (String equals : strArr) {
                if (TextUtils.equals(equals, language)) {
                    return context.getString(i, new Object[]{Float.valueOf(f)});
                }
            }
        }
        return String.format(Locale.US, context.getString(i), new Object[]{Float.valueOf(f)});
    }

    /* renamed from: e */
    public static int m6258e(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843499, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    /* renamed from: f */
    public static String m6259f(double d) {
        int i = (int) d;
        int i2 = (int) ((d - ((double) i)) * 3600.0d);
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        String[] strArr = f5341b;
        if (strArr != null && strArr.length > 0) {
            String language = Locale.getDefault().getLanguage();
            for (String equals : strArr) {
                if (TextUtils.equals(equals, language)) {
                    return CompassApplication.m6126d().getString(2131820577, new Object[]{Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4)});
                }
            }
        }
        return String.format(Locale.US, CompassApplication.m6126d().getString(2131820577), new Object[]{Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4)});
    }

    /* renamed from: g */
    public static final Typeface m6260g(AssetManager assetManager, String str) {
        HashMap<String, Typeface> hashMap = f5340a;
        Typeface typeface = hashMap.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(assetManager, str);
        hashMap.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: h */
    public static boolean m6261h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: i */
    public static boolean m6262i() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("ar");
    }

    /* renamed from: j */
    public static boolean m6263j() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("fa");
    }

    /* renamed from: k */
    public static boolean m6264k() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("iw");
    }

    /* renamed from: l */
    public static boolean m6265l() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("ur") && (Locale.getDefault().getCountry().equalsIgnoreCase("in") || Locale.getDefault().getCountry().equalsIgnoreCase("pk"));
    }

    /* renamed from: m */
    public static boolean m6266m() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("zh") && Locale.getDefault().getCountry().equalsIgnoreCase("CN");
    }

    /* renamed from: n */
    public static boolean m6267n() {
        return Settings.Secure.getInt(CompassApplication.m6126d().getContentResolver(), "key_invisible_mode_state", 0) == 1;
    }

    /* renamed from: o */
    public static boolean m6268o(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) == 3;
    }

    /* renamed from: p */
    public static boolean m6269p(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    /* renamed from: q */
    public static boolean m6270q() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* renamed from: r */
    public static boolean m6271r() {
        return false;
    }

    /* renamed from: s */
    public static boolean m6272s() {
        return C2901a.m11964E();
    }

    /* renamed from: t */
    public static String m6273t(Context context, int i, float f) {
        if (Math.round(f) == 0) {
            f = 0.0f;
        }
        return m6257d(context, i, f);
    }

    /* renamed from: u */
    public static float m6274u(float f) {
        return (f + 720.0f) % 360.0f;
    }

    /* renamed from: v */
    public static void m6275v(TextView textView) {
        if (C1877a.f7248a) {
            textView.setTypeface((Typeface) null, 0);
            return;
        }
        if (f5343d == null) {
            f5343d = Typeface.create("mipro-medium", 0);
        }
        textView.setTypeface(f5343d);
    }

    /* renamed from: w */
    public static void m6276w(TextView textView) {
        if (C1877a.f7248a) {
            textView.setTypeface((Typeface) null, 0);
            return;
        }
        if (f5344e == null) {
            f5344e = Typeface.create("mipro-regular", 0);
        }
        textView.setTypeface(f5344e);
    }
}
