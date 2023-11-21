package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0727l0;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.e */
class C0318e {

    /* renamed from: a */
    private final View f1262a;

    /* renamed from: b */
    private final C0327h f1263b;

    /* renamed from: c */
    private int f1264c = -1;

    /* renamed from: d */
    private C0320e1 f1265d;

    /* renamed from: e */
    private C0320e1 f1266e;

    /* renamed from: f */
    private C0320e1 f1267f;

    C0318e(View view) {
        this.f1262a = view;
        this.f1263b = C0327h.m1476b();
    }

    /* renamed from: a */
    private boolean m1424a(Drawable drawable) {
        if (this.f1267f == null) {
            this.f1267f = new C0320e1();
        }
        C0320e1 e1Var = this.f1267f;
        e1Var.mo1831a();
        ColorStateList n = C0727l0.m2903n(this.f1262a);
        if (n != null) {
            e1Var.f1271d = true;
            e1Var.f1268a = n;
        }
        PorterDuff.Mode o = C0727l0.m2905o(this.f1262a);
        if (o != null) {
            e1Var.f1270c = true;
            e1Var.f1269b = o;
        }
        if (!e1Var.f1271d && !e1Var.f1270c) {
            return false;
        }
        C0327h.m1479i(drawable, e1Var, this.f1262a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1425k() {
        return this.f1265d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1822b() {
        Drawable background = this.f1262a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1425k() || !m1424a(background)) {
            C0320e1 e1Var = this.f1266e;
            if (e1Var != null) {
                C0327h.m1479i(background, e1Var, this.f1262a.getDrawableState());
                return;
            }
            C0320e1 e1Var2 = this.f1265d;
            if (e1Var2 != null) {
                C0327h.m1479i(background, e1Var2, this.f1262a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1823c() {
        C0320e1 e1Var = this.f1266e;
        if (e1Var != null) {
            return e1Var.f1268a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1824d() {
        C0320e1 e1Var = this.f1266e;
        if (e1Var != null) {
            return e1Var.f1269b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1825e(AttributeSet attributeSet, int i) {
        Context context = this.f1262a.getContext();
        int[] iArr = C1456j.f5904K3;
        C0326g1 u = C0326g1.m1455u(context, attributeSet, iArr, i, 0);
        View view = this.f1262a;
        C0727l0.m2873W(view, view.getContext(), iArr, attributeSet, u.mo1880q(), i, 0);
        try {
            int i2 = C1456j.f5909L3;
            if (u.mo1881r(i2)) {
                this.f1264c = u.mo1876m(i2, -1);
                ColorStateList f = this.f1263b.mo1885f(this.f1262a.getContext(), this.f1264c);
                if (f != null) {
                    mo1828h(f);
                }
            }
            int i3 = C1456j.f5914M3;
            if (u.mo1881r(i3)) {
                C0727l0.m2882c0(this.f1262a, u.mo1866c(i3));
            }
            int i4 = C1456j.f5919N3;
            if (u.mo1881r(i4)) {
                C0727l0.m2884d0(this.f1262a, C0336j0.m1542e(u.mo1873j(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.mo1882v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1826f(Drawable drawable) {
        this.f1264c = -1;
        mo1828h((ColorStateList) null);
        mo1822b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1827g(int i) {
        this.f1264c = i;
        C0327h hVar = this.f1263b;
        mo1828h(hVar != null ? hVar.mo1885f(this.f1262a.getContext(), i) : null);
        mo1822b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1828h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1265d == null) {
                this.f1265d = new C0320e1();
            }
            C0320e1 e1Var = this.f1265d;
            e1Var.f1268a = colorStateList;
            e1Var.f1271d = true;
        } else {
            this.f1265d = null;
        }
        mo1822b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1829i(ColorStateList colorStateList) {
        if (this.f1266e == null) {
            this.f1266e = new C0320e1();
        }
        C0320e1 e1Var = this.f1266e;
        e1Var.f1268a = colorStateList;
        e1Var.f1271d = true;
        mo1822b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1830j(PorterDuff.Mode mode) {
        if (this.f1266e == null) {
            this.f1266e = new C0320e1();
        }
        C0320e1 e1Var = this.f1266e;
        e1Var.f1269b = mode;
        e1Var.f1270c = true;
        mo1822b();
    }
}
