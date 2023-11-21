package p135x0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p100q0.C2568g;
import p130w0.C2874a;
import p140y0.C2933s;

/* renamed from: x0.b */
public class C2898b {
    /* renamed from: a */
    public static C2568g.C2572d m11952a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return C2568g.C2572d.WIFI;
                    }
                    if (activeNetworkInfo.getType() == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                return C2568g.C2572d.MOBILE_2G;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                return C2568g.C2572d.MOBILE_3G;
                            case 13:
                            case 18:
                            case 19:
                                return C2568g.C2572d.MOBILE_4G;
                            case 20:
                                return C2568g.C2572d.MOBILE_5G;
                            default:
                                return C2568g.C2572d.UNKNOWN;
                        }
                    } else {
                        if (activeNetworkInfo.getType() == 9) {
                            return C2568g.C2572d.ETHERNET;
                        }
                        return C2568g.C2572d.UNKNOWN;
                    }
                }
            }
            return C2568g.C2572d.NOT_CONNECTED;
        } catch (Exception e) {
            C2933s.m12145g("NetworkUtil", "getNetworkState error", e);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public static boolean m11953b() {
        Context a = C2874a.m11876a();
        if (a == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (Exception unused) {
            C2933s.m12141c("NetworkUtil", "isNetworkConnected exception");
            return false;
        }
    }
}
