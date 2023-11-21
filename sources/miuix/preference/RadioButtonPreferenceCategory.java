package miuix.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import p123u3.C2850k;

public class RadioButtonPreferenceCategory extends PreferenceCategory {

    /* renamed from: b0 */
    private C2369d f9138b0;

    /* renamed from: c0 */
    private int f9139c0;

    /* renamed from: d0 */
    private C2376a f9140d0;

    /* renamed from: miuix.preference.RadioButtonPreferenceCategory$a */
    class C2366a implements C2376a {
        C2366a() {
        }

        /* renamed from: a */
        public void mo9028a(Preference preference) {
            C2369d V0 = RadioButtonPreferenceCategory.this.m10004b1(preference);
            RadioButtonPreferenceCategory.this.m10007f1(V0);
            RadioButtonPreferenceCategory.this.m10006e1(V0);
        }

        /* renamed from: b */
        public boolean mo9029b(Preference preference, Object obj) {
            Checkable checkable = (Checkable) preference;
            Preference.C1096e s = RadioButtonPreferenceCategory.this.mo3966s();
            if (s != null) {
                RadioButtonPreferenceCategory.this.m10002Z0(preference, obj);
                s.mo3992d(RadioButtonPreferenceCategory.this);
            }
            return !checkable.isChecked();
        }
    }

    /* renamed from: miuix.preference.RadioButtonPreferenceCategory$b */
    class C2367b extends C2369d {

        /* renamed from: f */
        private RadioSetPreferenceCategory f9142f;

        C2367b(RadioSetPreferenceCategory radioSetPreferenceCategory) {
            super(radioSetPreferenceCategory);
            this.f9142f = radioSetPreferenceCategory;
        }

        /* renamed from: a */
        public Preference mo9030a() {
            return this.f9142f;
        }

        /* renamed from: b */
        public void mo9031b(C2376a aVar) {
            this.f9142f.mo9036W0(aVar);
        }

        public void setChecked(boolean z) {
            super.setChecked(z);
            if (this.f9142f.mo9035V0() != null) {
                this.f9142f.mo9035V0().setChecked(z);
            }
        }
    }

    /* renamed from: miuix.preference.RadioButtonPreferenceCategory$c */
    class C2368c extends C2369d {

        /* renamed from: f */
        RadioButtonPreference f9144f;

        C2368c(RadioButtonPreference radioButtonPreference) {
            super(radioButtonPreference);
            this.f9144f = radioButtonPreference;
        }

        /* renamed from: a */
        public Preference mo9030a() {
            return this.f9144f;
        }

        /* renamed from: b */
        public void mo9031b(C2376a aVar) {
            this.f9144f.mo9023O0(aVar);
        }
    }

    /* renamed from: miuix.preference.RadioButtonPreferenceCategory$d */
    abstract class C2369d implements Checkable {

        /* renamed from: d */
        Checkable f9146d;

        C2369d(Checkable checkable) {
            this.f9146d = checkable;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Preference mo9030a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo9031b(C2376a aVar);

        public boolean isChecked() {
            return this.f9146d.isChecked();
        }

        public void setChecked(boolean z) {
            this.f9146d.setChecked(z);
        }

        public void toggle() {
            setChecked(!isChecked());
        }
    }

    public RadioButtonPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2850k.f10723f);
    }

    public RadioButtonPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9138b0 = null;
        this.f9139c0 = -1;
        this.f9140d0 = new C2366a();
    }

    /* renamed from: Y0 */
    private boolean m10001Y0(Object obj, Preference preference) {
        return preference.mo3964r() == null || preference.mo3964r().mo3991a(preference, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public void m10002Z0(Preference preference, Object obj) {
        Preference u = preference.mo3971u() instanceof RadioSetPreferenceCategory ? preference.mo3971u() : preference;
        C2369d dVar = this.f9138b0;
        if ((dVar == null || u != dVar.mo9030a()) && m10001Y0(obj, u)) {
            mo9027c1(preference);
        }
    }

    /* renamed from: a1 */
    private void m10003a1() {
        C2369d dVar = this.f9138b0;
        if (dVar != null) {
            dVar.setChecked(false);
        }
        this.f9138b0 = null;
        this.f9139c0 = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public C2369d m10004b1(Preference preference) {
        if (preference instanceof RadioButtonPreference) {
            return preference.mo3971u() instanceof RadioSetPreferenceCategory ? new C2367b((RadioSetPreferenceCategory) preference.mo3971u()) : new C2368c((RadioButtonPreference) preference);
        }
        if (preference instanceof RadioSetPreferenceCategory) {
            return new C2367b((RadioSetPreferenceCategory) preference);
        }
        throw new IllegalArgumentException("Only RadioButtonPreference or RadioSetPreferenceCategory can be added to RadioButtonPreferenceCategory");
    }

    /* renamed from: d1 */
    private void m10005d1(C2369d dVar) {
        dVar.setChecked(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public void m10006e1(C2369d dVar) {
        if (dVar.isChecked()) {
            int M0 = mo4001M0();
            for (int i = 0; i < M0; i++) {
                if (mo4000L0(i) == dVar.mo9030a()) {
                    this.f9139c0 = i;
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public void m10007f1(C2369d dVar) {
        if (dVar.isChecked()) {
            C2369d dVar2 = this.f9138b0;
            if (!(dVar2 == null || dVar2.mo9030a() == dVar.mo9030a())) {
                this.f9138b0.setChecked(false);
            }
            this.f9138b0 = dVar;
        }
    }

    /* renamed from: H0 */
    public boolean mo3996H0(Preference preference) {
        C2369d b1 = m10004b1(preference);
        boolean H0 = super.mo3996H0(preference);
        if (H0) {
            b1.mo9031b(this.f9140d0);
        }
        if (b1.isChecked()) {
            if (this.f9138b0 == null) {
                this.f9138b0 = b1;
            } else {
                throw new IllegalStateException("Already has a checked item, please check state of new add preference");
            }
        }
        return H0;
    }

    /* renamed from: c1 */
    public void mo9027c1(Preference preference) {
        if (preference == null) {
            m10003a1();
            return;
        }
        C2369d b1 = m10004b1(preference);
        if (!b1.isChecked()) {
            m10005d1(b1);
            m10007f1(b1);
            m10006e1(b1);
        }
    }
}
