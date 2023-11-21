package p140y0;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: y0.e */
final class C2915e implements FilenameFilter {
    C2915e() {
    }

    public boolean accept(File file, String str) {
        return TextUtils.isDigitsOnly(str);
    }
}
