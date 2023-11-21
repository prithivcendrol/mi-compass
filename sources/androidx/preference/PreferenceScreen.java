package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.C0540j;
import androidx.preference.C1134k;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: b0 */
    private boolean f3619b0 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0540j.m2226a(context, C1142n.f3736g, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public boolean mo4002N0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
        C1134k.C1136b e;
        if (mo3959o() == null && mo3955m() == null && mo4001M0() != 0 && (e = mo3914A().mo4115e()) != null) {
            e.mo4077l(this);
        }
    }

    /* renamed from: U0 */
    public boolean mo4015U0() {
        return this.f3619b0;
    }
}
