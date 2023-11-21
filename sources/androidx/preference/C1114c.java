package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0122b;

/* renamed from: androidx.preference.c */
public class C1114c extends C1120g {

    /* renamed from: D0 */
    int f3657D0;

    /* renamed from: E0 */
    private CharSequence[] f3658E0;

    /* renamed from: F0 */
    private CharSequence[] f3659F0;

    /* renamed from: androidx.preference.c$a */
    class C1115a implements DialogInterface.OnClickListener {
        C1115a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C1114c cVar = C1114c.this;
            cVar.f3657D0 = i;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: o2 */
    private ListPreference m4557o2() {
        return (ListPreference) mo4058g2();
    }

    /* renamed from: p2 */
    public static C1114c m4558p2(String str) {
        C1114c cVar = new C1114c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.mo3220J1(bundle);
        return cVar;
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        super.mo3200B0(bundle);
        if (bundle == null) {
            ListPreference o2 = m4557o2();
            if (o2.mo3894N0() == null || o2.mo3896P0() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f3657D0 = o2.mo3893M0(o2.mo3897Q0());
            this.f3658E0 = o2.mo3894N0();
            this.f3659F0 = o2.mo3896P0();
            return;
        }
        this.f3657D0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f3658E0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f3659F0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
        super.mo3257X0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3657D0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3658E0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3659F0);
    }

    /* renamed from: k2 */
    public void mo4051k2(boolean z) {
        int i;
        if (z && (i = this.f3657D0) >= 0) {
            String charSequence = this.f3659F0[i].toString();
            ListPreference o2 = m4557o2();
            if (o2.mo3938b(charSequence)) {
                o2.mo3898S0(charSequence);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public void mo4055l2(C0122b.C0123a aVar) {
        super.mo4055l2(aVar);
        aVar.mo415l(this.f3658E0, this.f3657D0, new C1115a());
        aVar.mo413j((CharSequence) null, (DialogInterface.OnClickListener) null);
    }
}
