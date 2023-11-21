package p127v2;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Method;
import p005a4.C0040b;

/* renamed from: v2.a */
public class C2869a {

    /* renamed from: a */
    protected static Method f10948a;

    static {
        Class<Window> cls = Window.class;
        try {
            Class cls2 = Integer.TYPE;
            f10948a = C0040b.m63e(cls, "setExtraFlags", cls2, cls2);
        } catch (Exception unused) {
            f10948a = null;
        }
    }

    /* renamed from: a */
    public static boolean m11866a(Window window, int i) {
        if (f10948a == null) {
            return false;
        }
        if (i == 0) {
            window.clearFlags(Integer.MIN_VALUE);
        } else {
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i == 1 ? 8208 : decorView.getSystemUiVisibility() & -8193 & -17);
        }
        if (i == 0) {
            window.clearFlags(67108864);
        } else {
            window.setFlags(67108864, 67108864);
        }
        if (i == 0) {
            try {
                f10948a.invoke(window, new Object[]{0, 17});
            } catch (Exception unused) {
                return false;
            }
        } else {
            f10948a.invoke(window, new Object[]{Integer.valueOf(i == 1 ? 17 : 1), 17});
        }
        return true;
    }
}
