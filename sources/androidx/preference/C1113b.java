package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.preference.b */
final class C1113b extends Preference {

    /* renamed from: S */
    private long f3656S;

    C1113b(Context context, List<Preference> list, long j) {
        super(context);
        m4553G0();
        m4554H0(list);
        this.f3656S = j + 1000000;
    }

    /* renamed from: G0 */
    private void m4553G0() {
        mo3967s0(C1145q.f3749a);
        mo3961p0(C1143o.f3742a);
        mo3980y0(C1146r.f3754b);
        mo3974v0(999);
    }

    /* renamed from: H0 */
    private void m4554H0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference next : list) {
            CharSequence E = next.mo3919E();
            boolean z = next instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(E)) {
                arrayList.add((PreferenceGroup) next);
            }
            if (arrayList.contains(next.mo3971u())) {
                if (z) {
                    arrayList.add((PreferenceGroup) next);
                }
            } else if (!TextUtils.isEmpty(E)) {
                if (charSequence == null) {
                    charSequence = E;
                } else {
                    charSequence = mo3949i().getString(C1146r.f3757e, new Object[]{charSequence, E});
                }
            }
        }
        mo3976w0(charSequence);
    }

    /* renamed from: S */
    public void mo3861S(C1141m mVar) {
        super.mo3861S(mVar);
        mVar.mo4134Q(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public long mo3957n() {
        return this.f3656S;
    }
}
