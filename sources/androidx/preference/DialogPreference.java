package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.C0540j;

public abstract class DialogPreference extends Preference {

    /* renamed from: S */
    private CharSequence f3539S;

    /* renamed from: T */
    private CharSequence f3540T;

    /* renamed from: U */
    private Drawable f3541U;

    /* renamed from: V */
    private CharSequence f3542V;

    /* renamed from: W */
    private CharSequence f3543W;

    /* renamed from: X */
    private int f3544X;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface C1080a {
        /* renamed from: h */
        <T extends Preference> T mo3871h(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0540j.m2226a(context, C1142n.f3731b, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3838j, i, i2);
        String f = C0540j.m2231f(obtainStyledAttributes, C1148t.f3859t, C1148t.f3841k);
        this.f3539S = f;
        if (f == null) {
            this.f3539S = mo3919E();
        }
        this.f3540T = C0540j.m2231f(obtainStyledAttributes, C1148t.f3857s, C1148t.f3843l);
        this.f3541U = C0540j.m2228c(obtainStyledAttributes, C1148t.f3853q, C1148t.f3845m);
        this.f3542V = C0540j.m2231f(obtainStyledAttributes, C1148t.f3863v, C1148t.f3847n);
        this.f3543W = C0540j.m2231f(obtainStyledAttributes, C1148t.f3861u, C1148t.f3849o);
        this.f3544X = C0540j.m2230e(obtainStyledAttributes, C1148t.f3855r, C1148t.f3851p, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: G0 */
    public Drawable mo3864G0() {
        return this.f3541U;
    }

    /* renamed from: H0 */
    public int mo3865H0() {
        return this.f3544X;
    }

    /* renamed from: I0 */
    public CharSequence mo3866I0() {
        return this.f3540T;
    }

    /* renamed from: J0 */
    public CharSequence mo3867J0() {
        return this.f3539S;
    }

    /* renamed from: K0 */
    public CharSequence mo3868K0() {
        return this.f3543W;
    }

    /* renamed from: L0 */
    public CharSequence mo3869L0() {
        return this.f3542V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
        mo3914A().mo4128s(this);
    }
}
