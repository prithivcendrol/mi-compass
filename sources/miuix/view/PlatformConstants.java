package miuix.view;

import android.util.Log;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import miui.util.HapticFeedbackUtil;

@Keep
public class PlatformConstants {
    public static final int VERSION;
    public static double romHapticVersion = 1.0d;

    static {
        int i;
        String str;
        try {
            Class<?> cls = Class.forName("miui.util.HapticFeedbackUtil");
            Class<?> cls2 = Class.forName("miui.view.MiuiHapticFeedbackConstants");
            if (cls.getMethod("isSupportLinearMotorVibrate", new Class[]{Integer.TYPE}) != null) {
                Field declaredField = cls2.getDeclaredField("FLAG_MIUI_HAPTIC_VERSION");
                i = declaredField != null ? declaredField.getInt((Object) null) : 0;
            } else {
                i = checkVersion();
            }
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodException e) {
            Log.w("HapticCompat", "MIUI Haptic Implementation not found.", e);
            i = -1;
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            Log.w("HapticCompat", "error when getting FLAG_MIUI_HAPTIC_VERSION.", e2);
            i = checkVersion();
        }
        VERSION = i;
        Log.i("HapticCompat", String.format("Platform version: %d.", new Object[]{Integer.valueOf(i)}));
        try {
            Class<?> cls3 = Class.forName("miui.util.HapticFeedbackUtil");
            romHapticVersion = ((Double) cls3.getDeclaredMethod("getCurVersion", new Class[0]).invoke(cls3, new Object[0])).doubleValue();
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.w("HapticCompat", "MIUI Haptic Implementation not found.", e3);
        } catch (InvocationTargetException unused) {
            str = "method getCurVersion() called using Reflection failed";
            Log.w("HapticCompat", str);
        } catch (IllegalAccessException unused2) {
            str = "have no access to the definition of getCurVersion()";
            Log.w("HapticCompat", str);
        }
        Log.i("HapticCompat", "Rom haptic version: " + romHapticVersion);
    }

    static int checkVersion() {
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435471)) {
            return 5;
        }
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435470)) {
            return 4;
        }
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435469)) {
            return 3;
        }
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435468)) {
            return 2;
        }
        return HapticFeedbackUtil.isSupportLinearMotorVibrate(268435465) ? 1 : 0;
    }
}
