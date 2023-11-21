package p073l3;

import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import p117t2.C2694b;

/* renamed from: l3.c */
public class C1879c {
    /* renamed from: a */
    public static String m7806a(int i) {
        String format = String.format(Locale.US, "/proc/%d/cmdline", new Object[]{Integer.valueOf(i)});
        try {
            String b = C2694b.m11257b(format);
            if (b == null) {
                return null;
            }
            int indexOf = b.indexOf(0);
            return indexOf >= 0 ? b.substring(0, indexOf) : b;
        } catch (IOException e) {
            Log.e("ProcessUtils", "Fail to read cmdline: " + format, e);
            return null;
        }
    }
}
