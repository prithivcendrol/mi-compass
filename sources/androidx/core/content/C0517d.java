package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0493d;
import androidx.core.util.C0619c;

/* renamed from: androidx.core.content.d */
public final class C0517d {
    /* renamed from: a */
    public static int m2142a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C0493d.m2080c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i2 && C0619c.m2480a(context.getPackageName(), str2) ? C0493d.m2078a(context, i2, c, str2) : C0493d.m2079b(context, c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m2143b(Context context, String str) {
        return m2142a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
