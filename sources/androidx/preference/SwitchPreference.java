package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.C0540j;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: X */
    private final C1107a f3637X;

    /* renamed from: Y */
    private CharSequence f3638Y;

    /* renamed from: Z */
    private CharSequence f3639Z;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C1107a implements CompoundButton.OnCheckedChangeListener {
        C1107a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo3938b(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.setChecked(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3741l, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3637X = new C1107a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3788O0, i, i2);
        mo4038I0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3804W0, C1148t.f3790P0));
        mo4037H0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3802V0, C1148t.f3792Q0));
        mo4031M0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3808Y0, C1148t.f3796S0));
        mo4030L0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3806X0, C1148t.f3798T0));
        mo4036G0(C0540j.m2227b(obtainStyledAttributes, C1148t.f3800U0, C1148t.f3794R0, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N0 */
    private void m4517N0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3645S);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f3638Y);
            switchR.setTextOff(this.f3639Z);
            switchR.setOnCheckedChangeListener(this.f3637X);
        }
    }

    /* renamed from: O0 */
    private void m4518O0(View view) {
        if (((AccessibilityManager) mo3949i().getSystemService("accessibility")).isEnabled()) {
            m4517N0(view.findViewById(16908352));
            mo4039J0(view.findViewById(16908304));
        }
    }

    /* renamed from: L0 */
    public void mo4030L0(CharSequence charSequence) {
        this.f3639Z = charSequence;
        mo3872M();
    }

    /* renamed from: M0 */
    public void mo4031M0(CharSequence charSequence) {
        this.f3638Y = charSequence;
        mo3872M();
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        m4517N0(mVar.mo4130M(16908352));
        mo4040K0(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3862f0(View view) {
        super.mo3862f0(view);
        m4518O0(view);
    }
}
