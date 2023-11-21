package p076m0;

import android.content.Context;
import android.provider.Settings;

/* renamed from: m0.c */
class C1894c {
    C1894c() {
    }

    /* renamed from: a */
    public boolean mo6459a(Context context, String str) {
        return Settings.Global.getString(context.getContentResolver(), str) != null;
    }

    /* renamed from: b */
    public boolean mo6460b(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "isDialogNoNetworkInChina");
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo6461c(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "isGoMiuiPermSetting");
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo6462d(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "isShowCtaDialog");
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo6463e(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "isShowPermissionUse");
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo6464f(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "isTrackEvent");
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        return false;
    }
}
