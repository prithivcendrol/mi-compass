package com.miui.compass;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import miui.util.FeatureParser;

/* renamed from: com.miui.compass.h */
public class C1420h {

    /* renamed from: a */
    private static final String f5392a = Build.DEVICE;

    /* renamed from: b */
    public static String f5393b = "";

    /* renamed from: c */
    public static boolean f5394c = true;

    /* renamed from: d */
    private static final HashMap<String, Boolean> f5395d = new HashMap<>();

    /* renamed from: a */
    private static boolean m6346a(int i, String str) {
        Boolean bool = f5395d.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] stringArray = CompassApplication.m6126d().getResources().getStringArray(i);
        boolean z = false;
        if (stringArray != null) {
            int length = stringArray.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str2 = stringArray[i2];
                String str3 = f5392a;
                if (TextUtils.equals(str3, str2)) {
                    break;
                }
                if (TextUtils.equals(str3, str2 + "pro")) {
                    break;
                }
                if (TextUtils.equals(str3, str2 + "in")) {
                    break;
                }
                i2++;
            }
            f5395d.put(str, Boolean.TRUE);
            z = true;
        }
        f5395d.put(str, Boolean.valueOf(z));
        return z;
    }

    /* renamed from: b */
    public static boolean m6347b() {
        return m6346a(2130903060, "support_mi_nmea");
    }

    /* renamed from: c */
    public static boolean m6348c() {
        try {
            if (m6346a(2130903061, "support_rotate_calibrate")) {
                if (!f5394c) {
                    return true;
                }
                Log.d("Compass:CompassDeviceUtils", "isSupportRotateCalibration: in rotate calibrate white list");
                f5394c = false;
                return true;
            } else if (m6346a(2130903059, "support_eight_word_calibrate_devices")) {
                if (f5394c) {
                    Log.d("Compass:CompassDeviceUtils", "isSupportRotateCalibration: in eight word calibrate white list");
                    f5394c = false;
                }
                return false;
            } else {
                boolean z = FeatureParser.getBoolean("support_rotate_calibrate", false);
                if (f5394c) {
                    Log.d("Compass:CompassDeviceUtils", "isSupportRotateCalibration: calibrateValueBySensorConfiguration: " + z);
                    f5394c = false;
                }
                return z;
            }
        } catch (Exception e) {
            Log.e("Compass:CompassDeviceUtils", "isSupportRotateCalibration failed", e);
            return false;
        }
    }
}
