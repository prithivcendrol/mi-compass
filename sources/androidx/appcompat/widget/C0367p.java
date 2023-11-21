package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0825j;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.p */
class C0367p extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1416b = false;

    /* renamed from: a */
    private boolean f1417a;

    public C0367p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1671a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1671a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0326g1 u = C0326g1.m1455u(context, attributeSet, C1456j.f5966Y1, i, i2);
        int i3 = C1456j.f5975a2;
        if (u.mo1881r(i3)) {
            m1672b(u.mo1864a(i3, false));
        }
        setBackgroundDrawable(u.mo1869f(C1456j.f5970Z1));
        u.mo1882v();
    }

    /* renamed from: b */
    private void m1672b(boolean z) {
        if (f1416b) {
            this.f1417a = z;
        } else {
            C0825j.m3294a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1416b && this.f1417a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1416b && this.f1417a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1416b && this.f1417a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
