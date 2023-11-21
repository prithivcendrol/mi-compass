package miuix.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.C1141m;
import miuix.view.C2403h;
import miuix.view.HapticCompat;

public class CheckBoxPreference extends androidx.preference.CheckBoxPreference {

    /* renamed from: Y */
    private View f9104Y;

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        this.f9104Y = mVar.f4049a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
        super.mo3870T();
        View view = this.f9104Y;
        if (view != null) {
            HapticCompat.m10233e(view, C2403h.f9356A, C2403h.f9367f);
        }
    }
}
