package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0122b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.preference.d */
public class C1116d extends C1120g {

    /* renamed from: D0 */
    Set<String> f3661D0 = new HashSet();

    /* renamed from: E0 */
    boolean f3662E0;

    /* renamed from: F0 */
    CharSequence[] f3663F0;

    /* renamed from: G0 */
    CharSequence[] f3664G0;

    /* renamed from: androidx.preference.d$a */
    class C1117a implements DialogInterface.OnMultiChoiceClickListener {
        C1117a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean z3;
            C1116d dVar = C1116d.this;
            if (z) {
                z2 = dVar.f3662E0;
                z3 = dVar.f3661D0.add(dVar.f3664G0[i].toString());
            } else {
                z2 = dVar.f3662E0;
                z3 = dVar.f3661D0.remove(dVar.f3664G0[i].toString());
            }
            dVar.f3662E0 = z3 | z2;
        }
    }

    /* renamed from: o2 */
    private MultiSelectListPreference m4563o2() {
        return (MultiSelectListPreference) mo4058g2();
    }

    /* renamed from: p2 */
    public static C1116d m4564p2(String str) {
        C1116d dVar = new C1116d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.mo3220J1(bundle);
        return dVar;
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        super.mo3200B0(bundle);
        if (bundle == null) {
            MultiSelectListPreference o2 = m4563o2();
            if (o2.mo3905M0() == null || o2.mo3906N0() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f3661D0.clear();
            this.f3661D0.addAll(o2.mo3907O0());
            this.f3662E0 = false;
            this.f3663F0 = o2.mo3905M0();
            this.f3664G0 = o2.mo3906N0();
            return;
        }
        this.f3661D0.clear();
        this.f3661D0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f3662E0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f3663F0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f3664G0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
        super.mo3257X0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f3661D0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f3662E0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f3663F0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f3664G0);
    }

    /* renamed from: k2 */
    public void mo4051k2(boolean z) {
        if (z && this.f3662E0) {
            MultiSelectListPreference o2 = m4563o2();
            if (o2.mo3938b(this.f3661D0)) {
                o2.mo3908P0(this.f3661D0);
            }
        }
        this.f3662E0 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public void mo4055l2(C0122b.C0123a aVar) {
        super.mo4055l2(aVar);
        int length = this.f3664G0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f3661D0.contains(this.f3664G0[i].toString());
        }
        aVar.mo410g(this.f3663F0, zArr, new C1117a());
    }
}
