package miuix.autodensity;

import android.os.Build;
import java.io.File;

/* renamed from: miuix.autodensity.i */
public class C2286i {

    /* renamed from: a */
    private static boolean f8690a = m9661a();

    /* renamed from: a */
    private static boolean m9661a() {
        String str = Build.TAGS;
        int i = 0;
        boolean z = true;
        boolean z2 = str != null && str.contains("test-keys");
        if (!z2) {
            String[] strArr = {"/system/bin/su", "/system/xbin/su"};
            while (true) {
                if (i >= 2) {
                    break;
                } else if (new File(strArr[i]).exists()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z = z2;
        if (z) {
            C2277b.m9629c("Current device is rooted");
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m9662b() {
        return f8690a;
    }
}
