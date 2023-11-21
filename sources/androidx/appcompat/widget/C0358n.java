package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0727l0;
import androidx.core.widget.C0820g;
import p021d.C1456j;
import p027e.C1512a;

/* renamed from: androidx.appcompat.widget.n */
public class C0358n {

    /* renamed from: a */
    private final ImageView f1368a;

    /* renamed from: b */
    private C0320e1 f1369b;

    /* renamed from: c */
    private C0320e1 f1370c;

    /* renamed from: d */
    private C0320e1 f1371d;

    /* renamed from: e */
    private int f1372e = 0;

    public C0358n(ImageView imageView) {
        this.f1368a = imageView;
    }

    /* renamed from: a */
    private boolean m1617a(Drawable drawable) {
        if (this.f1371d == null) {
            this.f1371d = new C0320e1();
        }
        C0320e1 e1Var = this.f1371d;
        e1Var.mo1831a();
        ColorStateList a = C0820g.m3279a(this.f1368a);
        if (a != null) {
            e1Var.f1271d = true;
            e1Var.f1268a = a;
        }
        PorterDuff.Mode b = C0820g.m3280b(this.f1368a);
        if (b != null) {
            e1Var.f1270c = true;
            e1Var.f1269b = b;
        }
        if (!e1Var.f1271d && !e1Var.f1270c) {
            return false;
        }
        C0327h.m1479i(drawable, e1Var, this.f1368a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m1618l() {
        return this.f1369b != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2010b() {
        if (this.f1368a.getDrawable() != null) {
            this.f1368a.getDrawable().setLevel(this.f1372e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2011c() {
        Drawable drawable = this.f1368a.getDrawable();
        if (drawable != null) {
            C0336j0.m1539b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1618l() || !m1617a(drawable)) {
            C0320e1 e1Var = this.f1370c;
            if (e1Var != null) {
                C0327h.m1479i(drawable, e1Var, this.f1368a.getDrawableState());
                return;
            }
            C0320e1 e1Var2 = this.f1369b;
            if (e1Var2 != null) {
                C0327h.m1479i(drawable, e1Var2, this.f1368a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo2012d() {
        C0320e1 e1Var = this.f1370c;
        if (e1Var != null) {
            return e1Var.f1268a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public PorterDuff.Mode mo2013e() {
        C0320e1 e1Var = this.f1370c;
        if (e1Var != null) {
            return e1Var.f1269b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2014f() {
        return !(this.f1368a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void mo2015g(AttributeSet attributeSet, int i) {
        int m;
        Context context = this.f1368a.getContext();
        int[] iArr = C1456j.f5925P;
        C0326g1 u = C0326g1.m1455u(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1368a;
        C0727l0.m2873W(imageView, imageView.getContext(), iArr, attributeSet, u.mo1880q(), i, 0);
        try {
            Drawable drawable = this.f1368a.getDrawable();
            if (!(drawable != null || (m = u.mo1876m(C1456j.f5930Q, -1)) == -1 || (drawable = C1512a.m6567b(this.f1368a.getContext(), m)) == null)) {
                this.f1368a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0336j0.m1539b(drawable);
            }
            int i2 = C1456j.f5935R;
            if (u.mo1881r(i2)) {
                C0820g.m3281c(this.f1368a, u.mo1866c(i2));
            }
            int i3 = C1456j.f5940S;
            if (u.mo1881r(i3)) {
                C0820g.m3282d(this.f1368a, C0336j0.m1542e(u.mo1873j(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.mo1882v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2016h(Drawable drawable) {
        this.f1372e = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo2017i(int i) {
        if (i != 0) {
            Drawable b = C1512a.m6567b(this.f1368a.getContext(), i);
            if (b != null) {
                C0336j0.m1539b(b);
            }
            this.f1368a.setImageDrawable(b);
        } else {
            this.f1368a.setImageDrawable((Drawable) null);
        }
        mo2011c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2018j(ColorStateList colorStateList) {
        if (this.f1370c == null) {
            this.f1370c = new C0320e1();
        }
        C0320e1 e1Var = this.f1370c;
        e1Var.f1268a = colorStateList;
        e1Var.f1271d = true;
        mo2011c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2019k(PorterDuff.Mode mode) {
        if (this.f1370c == null) {
            this.f1370c = new C0320e1();
        }
        C0320e1 e1Var = this.f1370c;
        e1Var.f1269b = mode;
        e1Var.f1270c = true;
        mo2011c();
    }
}
