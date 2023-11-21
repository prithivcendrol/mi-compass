package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p021d.C1447a;
import p027e.C1512a;

public class AppCompatCheckBox extends CheckBox {

    /* renamed from: d */
    private final C0324g f949d;

    /* renamed from: e */
    private final C0318e f950e;

    /* renamed from: f */
    private final C0420x f951f;

    /* renamed from: g */
    private C0342k f952g;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5692r);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0324g gVar = new C0324g(this);
        this.f949d = gVar;
        gVar.mo1844e(attributeSet, i);
        C0318e eVar = new C0318e(this);
        this.f950e = eVar;
        eVar.mo1825e(attributeSet, i);
        C0420x xVar = new C0420x(this);
        this.f951f = xVar;
        xVar.mo2290m(attributeSet, i);
        getEmojiTextViewHelper().mo1965c(attributeSet, i);
    }

    private C0342k getEmojiTextViewHelper() {
        if (this.f952g == null) {
            this.f952g = new C0342k(this);
        }
        return this.f952g;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f950e;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0420x xVar = this.f951f;
        if (xVar != null) {
            xVar.mo2280b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0324g gVar = this.f949d;
        return gVar != null ? gVar.mo1841b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f950e;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f950e;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0324g gVar = this.f949d;
        if (gVar != null) {
            return gVar.mo1842c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0324g gVar = this.f949d;
        if (gVar != null) {
            return gVar.mo1843d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f951f.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f951f.mo2288k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo1966d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f950e;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f950e;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1512a.m6567b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0324g gVar = this.f949d;
        if (gVar != null) {
            gVar.mo1845f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f951f;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f951f;
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
        C0318e eVar = this.f950e;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f950e;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0324g gVar = this.f949d;
        if (gVar != null) {
            gVar.mo1846g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0324g gVar = this.f949d;
        if (gVar != null) {
            gVar.mo1847h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f951f.mo2300w(colorStateList);
        this.f951f.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f951f.mo2301x(mode);
        this.f951f.mo2280b();
    }
}
