package miuix.animation.font;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.widget.TextView;
import miuix.animation.internal.AnimTask;
import miuix.animation.utils.CommonUtils;
import p137x2.C2901a;

@TargetApi(26)
public class VarFontUtils {
    private static final int DEFAULT_WGHT = 50;
    private static final String FORMAT_WGHT = "'wght' ";
    private static final boolean IS_USING_VAR_FONT;
    private static final String KEY_FONT_WEIGHT = "key_miui_font_weight_scale";
    public static final int MIN_WGHT;
    private static final int[] MITYPE_WGHT;
    private static final int[] MIUI_WGHT;
    private static final int[][][] RULES;
    private static final String THEME_FONT_DIR = "/data/system/theme/fonts/";

    static {
        boolean z = !isUsingThemeFont() && Build.VERSION.SDK_INT >= 26 && C2901a.m11960A() > 6 && !isFontAnimDisabled() && C2901a.m11979j() > 0;
        IS_USING_VAR_FONT = z;
        if (z) {
            MIUI_WGHT = new int[]{AnimTask.MAX_PAGE_SIZE, 200, 250, 305, 340, 400, 480, 540, 630, 700};
            MITYPE_WGHT = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            MIN_WGHT = 10;
            int[][][] iArr = new int[3][][];
            RULES = iArr;
            iArr[0] = new int[][]{new int[]{0, 5}, new int[]{0, 5}, new int[]{1, 6}, new int[]{2, 6}, new int[]{2, 7}, new int[]{3, 8}, new int[]{4, 8}, new int[]{5, 9}, new int[]{6, 9}, new int[]{7, 9}};
            iArr[1] = new int[][]{new int[]{0, 2}, new int[]{0, 3}, new int[]{1, 4}, new int[]{1, 5}, new int[]{2, 6}, new int[]{2, 7}, new int[]{3, 8}, new int[]{4, 9}, new int[]{5, 9}, new int[]{6, 9}};
            iArr[2] = new int[][]{new int[]{0, 5}, new int[]{1, 5}, new int[]{2, 5}, new int[]{3, 6}, new int[]{3, 6}, new int[]{4, 7}, new int[]{5, 8}, new int[]{6, 8}, new int[]{7, 8}, new int[]{8, 9}};
            return;
        }
        MIN_WGHT = 0;
        int[] iArr2 = new int[0];
        MITYPE_WGHT = iArr2;
        MIUI_WGHT = iArr2;
        RULES = new int[0][][];
    }

    private VarFontUtils() {
    }

    static int getScaleWeight(int i, float f, int i2, int i3) {
        float f2;
        if (!IS_USING_VAR_FONT) {
            return i;
        }
        int[] weightRange = getWeightRange(i, f);
        int weightByType = getWeightByType(weightRange[0], i2);
        int weightByType2 = getWeightByType(i, i2);
        int weightByType3 = getWeightByType(weightRange[1], i2);
        if (i3 < 50) {
            float f3 = ((float) i3) / 50.0f;
            f2 = ((1.0f - f3) * ((float) weightByType)) + (f3 * ((float) weightByType2));
        } else if (i3 <= 50) {
            return weightByType2;
        } else {
            float f4 = ((float) (i3 - 50)) / 50.0f;
            f2 = ((1.0f - f4) * ((float) weightByType2)) + (f4 * ((float) weightByType3));
        }
        return (int) f2;
    }

    static int getSysFontScale(Context context) {
        return Settings.System.getInt(context.getContentResolver(), KEY_FONT_WEIGHT, 50);
    }

    private static int[] getWeightArray(int i) {
        return (i == 1 || i == 2) ? MITYPE_WGHT : MIUI_WGHT;
    }

    private static int getWeightByType(int i, int i2) {
        return getWeightArray(i2)[i];
    }

    private static int[] getWeightRange(int i, float f) {
        return RULES[f > 20.0f ? 1 : (f <= 0.0f || f >= 12.0f) ? (char) 0 : 2][i];
    }

    private static boolean isFontAnimDisabled() {
        try {
            return CommonUtils.readProp("ro.miui.ui.font.animation").equals("disable");
        } catch (Exception e) {
            Log.w(CommonUtils.TAG, "isFontAnimationEnabled failed", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r0.list();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isUsingThemeFont() {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/data/system/theme/fonts/"
            r0.<init>(r1)
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0019 }
            if (r2 == 0) goto L_0x0021
            java.lang.String[] r0 = r0.list()     // Catch:{ Exception -> 0x0019 }
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length     // Catch:{ Exception -> 0x0019 }
            if (r0 <= 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            return r1
        L_0x0019:
            r0 = move-exception
            java.lang.String r2 = "miuix_anim"
            java.lang.String r3 = "isUsingThemeFont, failed to check theme font directory"
            android.util.Log.w(r2, r3, r0)
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.animation.font.VarFontUtils.isUsingThemeFont():boolean");
    }

    static void setVariationFont(TextView textView, int i) {
        if (IS_USING_VAR_FONT) {
            boolean unused = textView.setFontVariationSettings(FORMAT_WGHT + i);
        }
    }
}
