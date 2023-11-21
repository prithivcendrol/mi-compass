package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.b0 */
public class C0660b0 {

    /* renamed from: a */
    private ViewParent f2730a;

    /* renamed from: b */
    private ViewParent f2731b;

    /* renamed from: c */
    private final View f2732c;

    /* renamed from: d */
    private boolean f2733d;

    /* renamed from: e */
    private int[] f2734e;

    public C0660b0(View view) {
        this.f2732c = view;
    }

    /* renamed from: g */
    private boolean m2618g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo2812l() || (h = m2619h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f2732c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = m2620i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        C0799z1.m3153d(h, this.f2732c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f2732c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m2619h(int i) {
        if (i == 0) {
            return this.f2730a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2731b;
    }

    /* renamed from: i */
    private int[] m2620i() {
        if (this.f2734e == null) {
            this.f2734e = new int[2];
        }
        return this.f2734e;
    }

    /* renamed from: n */
    private void m2621n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2730a = viewParent;
        } else if (i == 1) {
            this.f2731b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo2804a(float f, float f2, boolean z) {
        ViewParent h;
        if (!mo2812l() || (h = m2619h(0)) == null) {
            return false;
        }
        return C0799z1.m3150a(h, this.f2732c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo2805b(float f, float f2) {
        ViewParent h;
        if (!mo2812l() || (h = m2619h(0)) == null) {
            return false;
        }
        return C0799z1.m3151b(h, this.f2732c, f, f2);
    }

    /* renamed from: c */
    public boolean mo2806c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2807d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo2807d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!mo2812l() || (h = m2619h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f2732c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m2620i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0799z1.m3152c(h, this.f2732c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f2732c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo2808e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m2618g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo2809f(int i, int i2, int i3, int i4, int[] iArr) {
        return m2618g(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: j */
    public boolean mo2810j() {
        return mo2811k(0);
    }

    /* renamed from: k */
    public boolean mo2811k(int i) {
        return m2619h(i) != null;
    }

    /* renamed from: l */
    public boolean mo2812l() {
        return this.f2733d;
    }

    /* renamed from: m */
    public void mo2813m(boolean z) {
        if (this.f2733d) {
            C0727l0.m2914s0(this.f2732c);
        }
        this.f2733d = z;
    }

    /* renamed from: o */
    public boolean mo2814o(int i) {
        return mo2815p(i, 0);
    }

    /* renamed from: p */
    public boolean mo2815p(int i, int i2) {
        if (mo2811k(i2)) {
            return true;
        }
        if (!mo2812l()) {
            return false;
        }
        View view = this.f2732c;
        for (ViewParent parent = this.f2732c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0799z1.m3155f(parent, view, this.f2732c, i, i2)) {
                m2621n(i2, parent);
                C0799z1.m3154e(parent, view, this.f2732c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo2816q() {
        mo2817r(0);
    }

    /* renamed from: r */
    public void mo2817r(int i) {
        ViewParent h = m2619h(i);
        if (h != null) {
            C0799z1.m3156g(h, this.f2732c, i);
            m2621n(i, (ViewParent) null);
        }
    }
}
