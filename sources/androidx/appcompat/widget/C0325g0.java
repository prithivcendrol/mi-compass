package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: androidx.appcompat.widget.g0 */
public class C0325g0 extends ToggleButton {

    /* renamed from: d */
    private final C0318e f1285d;

    /* renamed from: e */
    private final C0420x f1286e;

    /* renamed from: f */
    private C0342k f1287f;

    public C0325g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public C0325g0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0318e eVar = new C0318e(this);
        this.f1285d = eVar;
        eVar.mo1825e(attributeSet, i);
        C0420x xVar = new C0420x(this);
        this.f1286e = xVar;
        xVar.mo2290m(attributeSet, i);
        getEmojiTextViewHelper().mo1965c(attributeSet, i);
    }

    private C0342k getEmojiTextViewHelper() {
        if (this.f1287f == null) {
            this.f1287f = new C0342k(this);
        }
        return this.f1287f;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0420x xVar = this.f1286e;
        if (xVar != null) {
            xVar.mo2280b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1286e.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1286e.mo2288k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo1966d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f1286e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f1286e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo1967e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo1963a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f1285d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1286e.mo2300w(colorStateList);
        this.f1286e.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1286e.mo2301x(mode);
        this.f1286e.mo2280b();
    }
}
