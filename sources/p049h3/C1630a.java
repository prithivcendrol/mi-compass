package p049h3;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p073l3.C1879c;

/* renamed from: h3.a */
public class C1630a {

    /* renamed from: a */
    public static String f6476a = C1879c.m7806a(Process.myPid());

    /* renamed from: a */
    private static String m6916a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath() + "/debug_log/";
        }
        Log.e("Config", "Fail to getCacheDir");
        return null;
    }

    /* renamed from: b */
    public static String m6917b(Context context) {
        return m6916a(context);
    }
}
