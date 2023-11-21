package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.C0540j;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: X */
    private final C1079a f3537X;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C1079a implements CompoundButton.OnCheckedChangeListener {
        C1079a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo3938b(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.setChecked(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3730a, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3537X = new C1079a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3817c, i, i2);
        mo4038I0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3835i, C1148t.f3820d));
        mo4037H0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3832h, C1148t.f3823e));
        mo4036G0(C0540j.m2227b(obtainStyledAttributes, C1148t.f3829g, C1148t.f3826f, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: L0 */
    private void m4323L0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3645S);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f3537X);
        }
    }

    /* renamed from: M0 */
    private void m4324M0(View view) {
        if (((AccessibilityManager) mo3949i().getSystemService("accessibility")).isEnabled()) {
            m4323L0(view.findViewById(16908289));
            mo4039J0(view.findViewById(16908304));
        }
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        m4323L0(mVar.mo4130M(16908289));
        mo4040K0(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3862f0(View view) {
        super.mo3862f0(view);
        m4324M0(view);
    }
}
