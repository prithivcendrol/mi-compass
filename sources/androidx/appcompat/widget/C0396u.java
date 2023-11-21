package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0553a;
import androidx.core.view.C0727l0;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.u */
class C0396u extends C0379q {

    /* renamed from: d */
    private final SeekBar f1481d;

    /* renamed from: e */
    private Drawable f1482e;

    /* renamed from: f */
    private ColorStateList f1483f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1484g = null;

    /* renamed from: h */
    private boolean f1485h = false;

    /* renamed from: i */
    private boolean f1486i = false;

    C0396u(SeekBar seekBar) {
        super(seekBar);
        this.f1481d = seekBar;
    }

    /* renamed from: f */
    private void m1745f() {
        Drawable drawable = this.f1482e;
        if (drawable == null) {
            return;
        }
        if (this.f1485h || this.f1486i) {
            Drawable j = C0553a.m2297j(drawable.mutate());
            this.f1482e = j;
            if (this.f1485h) {
                C0553a.m2294g(j, this.f1483f);
            }
            if (this.f1486i) {
                C0553a.m2295h(this.f1482e, this.f1484g);
            }
            if (this.f1482e.isStateful()) {
                this.f1482e.setState(this.f1481d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2135c(AttributeSet attributeSet, int i) {
        super.mo2135c(attributeSet, i);
        Context context = this.f1481d.getContext();
        int[] iArr = C1456j.f5944T;
        C0326g1 u = C0326g1.m1455u(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1481d;
        C0727l0.m2873W(seekBar, seekBar.getContext(), iArr, attributeSet, u.mo1880q(), i, 0);
        Drawable g = u.mo1870g(C1456j.f5948U);
        if (g != null) {
            this.f1481d.setThumb(g);
        }
        mo2195j(u.mo1869f(C1456j.f5952V));
        int i2 = C1456j.f5960X;
        if (u.mo1881r(i2)) {
            this.f1484g = C0336j0.m1542e(u.mo1873j(i2, -1), this.f1484g);
            this.f1486i = true;
        }
        int i3 = C1456j.f5956W;
        if (u.mo1881r(i3)) {
            this.f1483f = u.mo1866c(i3);
            this.f1485h = true;
        }
        u.mo1882v();
        m1745f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2192g(Canvas canvas) {
        if (this.f1482e != null) {
            int max = this.f1481d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1482e.getIntrinsicWidth();
                int intrinsicHeight = this.f1482e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1482e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1481d.getWidth() - this.f1481d.getPaddingLeft()) - this.f1481d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1481d.getPaddingLeft(), (float) (this.f1481d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1482e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2193h() {
        Drawable drawable = this.f1482e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1481d.getDrawableState())) {
            this.f1481d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2194i() {
        Drawable drawable = this.f1482e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2195j(Drawable drawable) {
        Drawable drawable2 = this.f1482e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1482e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1481d);
            C0553a.m2292e(drawable, C0727l0.m2916u(this.f1481d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1481d.getDrawableState());
            }
            m1745f();
        }
        this.f1481d.invalidate();
    }
}
