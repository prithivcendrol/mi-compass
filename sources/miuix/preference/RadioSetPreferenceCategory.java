package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import p123u3.C2850k;
import p123u3.C2856q;

public class RadioSetPreferenceCategory extends PreferenceCategory implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public C2376a f9148b0;

    /* renamed from: c0 */
    private C2376a f9149c0;

    /* renamed from: d0 */
    private boolean f9150d0;

    /* renamed from: e0 */
    private boolean f9151e0;

    /* renamed from: f0 */
    private String f9152f0;

    /* renamed from: g0 */
    private RadioButtonPreference f9153g0;

    /* renamed from: miuix.preference.RadioSetPreferenceCategory$a */
    class C2370a implements C2376a {
        C2370a() {
        }

        /* renamed from: a */
        public void mo9028a(Preference preference) {
            if (preference instanceof RadioButtonPreference) {
                RadioSetPreferenceCategory.this.setChecked(((RadioButtonPreference) preference).isChecked());
            }
            if (RadioSetPreferenceCategory.this.f9148b0 != null) {
                RadioSetPreferenceCategory.this.f9148b0.mo9028a(preference);
            }
        }

        /* renamed from: b */
        public boolean mo9029b(Preference preference, Object obj) {
            if (RadioSetPreferenceCategory.this.f9148b0 != null) {
                return RadioSetPreferenceCategory.this.f9148b0.mo9029b(preference, obj);
            }
            return true;
        }
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10722e);
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9149c0 = new C2370a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2856q.f10901q1, i, i2);
        this.f9152f0 = obtainStyledAttributes.getString(C2856q.f10904r1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H0 */
    public boolean mo3996H0(Preference preference) {
        String str = this.f9152f0;
        if (str == null) {
            if (mo4001M0() == 0) {
                if (!(preference instanceof RadioButtonPreference)) {
                    throw new IllegalArgumentException("The first preference must be RadioButtonPreference, if primary key is empty");
                }
            }
            return super.mo3996H0(preference);
        }
        if (str.equals(preference.mo3960p())) {
            RadioButtonPreference radioButtonPreference = this.f9153g0;
            if (radioButtonPreference != null && radioButtonPreference != preference) {
                throw new IllegalArgumentException("must not have two primary preference");
            } else if (!(preference instanceof RadioButtonPreference)) {
                throw new IllegalArgumentException("Primary preference must be RadioButtonPreference");
            }
        }
        return super.mo3996H0(preference);
        RadioButtonPreference radioButtonPreference2 = (RadioButtonPreference) preference;
        this.f9153g0 = radioButtonPreference2;
        radioButtonPreference2.mo9023O0(this.f9149c0);
        return super.mo3996H0(preference);
    }

    /* renamed from: V0 */
    public RadioButtonPreference mo9035V0() {
        return this.f9153g0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo9036W0(C2376a aVar) {
        this.f9148b0 = aVar;
    }

    public boolean isChecked() {
        return this.f9150d0;
    }

    public void setChecked(boolean z) {
        if ((this.f9150d0 != z) || !this.f9151e0) {
            this.f9150d0 = z;
            this.f9151e0 = true;
        }
    }

    public void toggle() {
        setChecked(!isChecked());
    }
}
