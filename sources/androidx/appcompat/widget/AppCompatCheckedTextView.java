package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0828k;
import p021d.C1447a;
import p027e.C1512a;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: d */
    private final C0321f f953d;

    /* renamed from: e */
    private final C0318e f954e;

    /* renamed from: f */
    private final C0420x f955f;

    /* renamed from: g */
    private C0342k f956g;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5693s);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0420x xVar = new C0420x(this);
        this.f955f = xVar;
        xVar.mo2290m(attributeSet, i);
        xVar.mo2280b();
        C0318e eVar = new C0318e(this);
        this.f954e = eVar;
        eVar.mo1825e(attributeSet, i);
        C0321f fVar = new C0321f(this);
        this.f953d = fVar;
        fVar.mo1835d(attributeSet, i);
        getEmojiTextViewHelper().mo1965c(attributeSet, i);
    }

    private C0342k getEmojiTextViewHelper() {
        if (this.f956g == null) {
            this.f956g = new C0342k(this);
        }
        return this.f956g;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0420x xVar = this.f955f;
        if (xVar != null) {
            xVar.mo2280b();
        }
        C0318e eVar = this.f954e;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0321f fVar = this.f953d;
        if (fVar != null) {
            fVar.mo1832a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0828k.m3315n(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f954e;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f954e;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0321f fVar = this.f953d;
        if (fVar != null) {
            return fVar.mo1833b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0321f fVar = this.f953d;
        if (fVar != null) {
            return fVar.mo1834c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f955f.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f955f.mo2288k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0345l.m1590a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo1966d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f954e;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f954e;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1512a.m6567b(getContext(), i));
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0321f fVar = this.f953d;
        if (fVar != null) {
            fVar.mo1836e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f955f;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f955f;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0828k.m3316o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo1967e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f954e;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f954e;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0321f fVar = this.f953d;
        if (fVar != null) {
            fVar.mo1837f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0321f fVar = this.f953d;
        if (fVar != null) {
            fVar.mo1838g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f955f.mo2300w(colorStateList);
        this.f955f.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f955f.mo2301x(mode);
        this.f955f.mo2280b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0420x xVar = this.f955f;
        if (xVar != null) {
            xVar.mo2294q(context, i);
        }
    }
}
