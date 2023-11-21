package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: d0 */
    private final Context f3545d0;

    /* renamed from: e0 */
    private final ArrayAdapter f3546e0;

    /* renamed from: f0 */
    private Spinner f3547f0;

    /* renamed from: g0 */
    private final AdapterView.OnItemSelectedListener f3548g0;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C1081a implements AdapterView.OnItemSelectedListener {
        C1081a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo3896P0()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo3897Q0()) && DropDownPreference.this.mo3938b(charSequence)) {
                    DropDownPreference.this.mo3898S0(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1142n.f3732c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3548g0 = new C1081a();
        this.f3545d0 = context;
        this.f3546e0 = mo3873T0();
        m4336V0();
    }

    /* renamed from: U0 */
    private int m4335U0(String str) {
        CharSequence[] P0 = mo3896P0();
        if (str == null || P0 == null) {
            return -1;
        }
        for (int length = P0.length - 1; length >= 0; length--) {
            if (TextUtils.equals(P0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: V0 */
    private void m4336V0() {
        this.f3546e0.clear();
        if (mo3894N0() != null) {
            for (CharSequence charSequence : mo3894N0()) {
                this.f3546e0.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo3872M() {
        super.mo3872M();
        ArrayAdapter arrayAdapter = this.f3546e0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        Spinner spinner = (Spinner) mVar.f4049a.findViewById(C1144p.f3747e);
        this.f3547f0 = spinner;
        spinner.setAdapter(this.f3546e0);
        this.f3547f0.setOnItemSelectedListener(this.f3548g0);
        this.f3547f0.setSelection(m4335U0(mo3897Q0()));
        super.mo3861S(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo3870T() {
        this.f3547f0.performClick();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public ArrayAdapter mo3873T0() {
        return new ArrayAdapter(this.f3545d0, 17367049);
    }
}
