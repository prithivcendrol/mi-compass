package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.k0 */
final class C0970k0 extends Writer {

    /* renamed from: d */
    private final String f3320d;

    /* renamed from: e */
    private StringBuilder f3321e = new StringBuilder(128);

    C0970k0(String str) {
        this.f3320d = str;
    }

    /* renamed from: a */
    private void m4035a() {
        if (this.f3321e.length() > 0) {
            Log.d(this.f3320d, this.f3321e.toString());
            StringBuilder sb = this.f3321e;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4035a();
    }

    public void flush() {
        m4035a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4035a();
            } else {
                this.f3321e.append(c);
            }
        }
    }
}
