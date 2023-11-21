package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.C0540j;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: X */
    private final C1108a f3641X;

    /* renamed from: Y */
    private CharSequence f3642Y;

    /* renamed from: Z */
    private CharSequence f3643Z;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C1108a implements CompoundButton.OnCheckedChangeListener {
        C1108a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo3938b(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.setChecked(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1142n.f3740k);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3641X = new C1108a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3810Z0, i, i2);
        mo4038I0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3834h1, C1148t.f3813a1));
        mo4037H0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3831g1, C1148t.f3816b1));
        mo4034M0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3840j1, C1148t.f3822d1));
        mo4033L0(C0540j.m2231f(obtainStyledAttributes, C1148t.f3837i1, C1148t.f3825e1));
        mo4036G0(C0540j.m2227b(obtainStyledAttributes, C1148t.f3828f1, C1148t.f3819c1, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N0 */
    private void m4523N0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3645S);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f3642Y);
            switchCompat.setTextOff(this.f3643Z);
            switchCompat.setOnCheckedChangeListener(this.f3641X);
        }
    }

    /* renamed from: O0 */
    private void m4524O0(View view) {
        if (((AccessibilityManager) mo3949i().getSystemService("accessibility")).isEnabled()) {
            m4523N0(view.findViewById(C1144p.f3748f));
            mo4039J0(view.findViewById(16908304));
        }
    }

    /* renamed from: L0 */
    public void mo4033L0(CharSequence charSequence) {
        this.f3643Z = charSequence;
        mo3872M();
    }

    /* renamed from: M0 */
    public void mo4034M0(CharSequence charSequence) {
        this.f3642Y = charSequence;
        mo3872M();
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        m4523N0(mVar.mo4130M(C1144p.f3748f));
        mo4040K0(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3862f0(View view) {
        super.mo3862f0(view);
        m4524O0(view);
    }
}
