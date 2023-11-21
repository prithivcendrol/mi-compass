package p094p0;

import android.content.Context;
import android.util.Log;
import miui.os.Build;
import miuix.core.util.SystemProperties;
import p076m0.C1892a;

/* renamed from: p0.a */
public class C2535a extends C1892a {
    /* renamed from: a */
    public boolean mo6449a(Context context) {
        try {
            return !Build.IS_INTERNATIONAL_BUILD;
        } catch (Throwable th) {
            Log.d("Compass:DecoupleConfigImpl", "isShowCtaDialog error" + th);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo6450b(Context context) {
        try {
            return !Build.IS_INTERNATIONAL_BUILD;
        } catch (Throwable th) {
            Log.d("Compass:DecoupleConfigImpl", "isShowCtaDialog error" + th);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo6451c(Context context) {
        try {
            return !Build.IS_INTERNATIONAL_BUILD;
        } catch (Throwable th) {
            Log.d("Compass:DecoupleConfigImpl", "isShowCtaDialog error" + th);
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo6452d(Context context) {
        try {
            return SystemProperties.getInt("ro.mi.os.version.code", 0) >= 1 ? !Build.IS_INTERNATIONAL_BUILD : !Build.IS_INTERNATIONAL_BUILD && SystemProperties.getInt("ro.miui.ui.version.code", 0) >= 9;
        } catch (Throwable th) {
            Log.d("Compass:DecoupleConfigImpl", "isShowCtaDialog error" + th);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo6453e(Context context) {
        try {
            return Build.checkRegion("CN") && !Build.IS_INTERNATIONAL_BUILD;
        } catch (Throwable th) {
            Log.d("Compass:DecoupleConfigImpl", "isShowCtaDialog error" + th);
            return false;
        }
    }
}
