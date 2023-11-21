package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0828k;
import p021d.C1447a;

public class AppCompatButton extends Button {

    /* renamed from: d */
    private final C0318e f946d;

    /* renamed from: e */
    private final C0420x f947e;

    /* renamed from: f */
    private C0342k f948f;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5691q);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0317d1.m1423b(context), attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0318e eVar = new C0318e(this);
        this.f946d = eVar;
        eVar.mo1825e(attributeSet, i);
        C0420x xVar = new C0420x(this);
        this.f947e = xVar;
        xVar.mo2290m(attributeSet, i);
        xVar.mo2280b();
        getEmojiTextViewHelper().mo1965c(attributeSet, i);
    }

    private C0342k getEmojiTextViewHelper() {
        if (this.f948f == null) {
            this.f948f = new C0342k(this);
        }
        return this.f948f;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0318e eVar = this.f946d;
        if (eVar != null) {
            eVar.mo1822b();
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2280b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0385r1.f1473b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            return xVar.mo2282e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0385r1.f1473b) {
            return super.getAutoSizeMinTextSize();
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            return xVar.mo2283f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0385r1.f1473b) {
            return super.getAutoSizeStepGranularity();
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            return xVar.mo2284g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0385r1.f1473b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0420x xVar = this.f947e;
        return xVar != null ? xVar.mo2285h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0385r1.f1473b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            return xVar.mo2286i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0828k.m3315n(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0318e eVar = this.f946d;
        if (eVar != null) {
            return eVar.mo1823c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0318e eVar = this.f946d;
        if (eVar != null) {
            return eVar.mo1824d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f947e.mo2287j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f947e.mo2288k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2292o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0420x xVar = this.f947e;
        if (xVar != null && !C0385r1.f1473b && xVar.mo2289l()) {
            this.f947e.mo2281c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo1966d(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0385r1.f1473b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2297t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0385r1.f1473b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2298u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0385r1.f1473b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2299v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0318e eVar = this.f946d;
        if (eVar != null) {
            eVar.mo1826f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0318e eVar = this.f946d;
        if (eVar != null) {
            eVar.mo1827g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0828k.m3316o(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo1967e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo1963a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2296s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0318e eVar = this.f946d;
        if (eVar != null) {
            eVar.mo1829i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0318e eVar = this.f946d;
        if (eVar != null) {
            eVar.mo1830j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f947e.mo2300w(colorStateList);
        this.f947e.mo2280b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f947e.mo2301x(mode);
        this.f947e.mo2280b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2294q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0385r1.f1473b) {
            super.setTextSize(i, f);
            return;
        }
        C0420x xVar = this.f947e;
        if (xVar != null) {
            xVar.mo2279A(i, f);
        }
    }
}
