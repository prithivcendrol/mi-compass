package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.l1 */
public class C0353l1 {

    /* renamed from: androidx.appcompat.widget.l1$a */
    static class C0354a {
        /* renamed from: a */
        static void m1615a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m1614a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0354a.m1615a(view, charSequence);
        } else {
            C0366o1.m1667h(view, charSequence);
        }
    }
}
