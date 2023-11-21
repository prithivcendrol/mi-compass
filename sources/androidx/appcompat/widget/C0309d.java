package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C0828k;
import p021d.C1447a;
import p027e.C1512a;

/* renamed from: androidx.appcompat.widget.d */
public class C0309d extends AutoCompleteTextView {

    /* renamed from: g */
    private static final int[] f1240g = {16843126};

    /* renamed from: d */
    private final C0318e f1241d;

    /* renamed from: e */
    private final C0420x f1242e;

    /* renamed from: f */
    private final C0335j f1243f;

    public C0309d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5690p);
    }

    public C0309d(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0326g1 u = C0326g1.m1455u(getContext(), attributeSet, f1240g, i, 0);
        if (u.mo1881r(0)) {
            setDropDownBackgroundDrawable(u.mo1869f(0));
        }
        u.mo1882v();
        C0318e eVar = new C0318e(this);
        this.f1241d = eVar;
        eVar.mo1825e(attributeSet, i);
        C0420x xVar = new C0420x(this);
        this.f1242e = xVar;
        xVar.mo2290m(attributeSet, i);
        xVar.mo2280b();
        C0335j jVar = new C0335j(this);
        this.f1243f = jVar;
        jVar.mo1951c(attributeSet, i);
        mo1782a(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1782a(C0335j jVar) {
        KeyListener keyListener = getKeyListener();
        if (jVar.mo1950b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = jVar.mo1949a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0420x xVar = this.f1242e;
        if (xVar != null) {
            xVar.mo2280b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0828k.m3315n(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1242e.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1242e.mo2288k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1243f.mo1952d(C0345l.m1590a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f1242e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420x xVar = this.f1242e;
        if (xVar != null) {
            xVar.mo2293p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0828k.m3316o(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1512a.m6567b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1243f.mo1953e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1243f.mo1949a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f1241d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1242e.mo2300w(colorStateList);
        this.f1242e.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1242e.mo2301x(mode);
        this.f1242e.mo2280b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0420x xVar = this.f1242e;
        if (xVar != null) {
            xVar.mo2294q(context, i);
        }
    }
}
