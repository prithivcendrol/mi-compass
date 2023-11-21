package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0727l0;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p027e.C1512a;

/* renamed from: androidx.preference.i */
public class C1129i extends RecyclerView.C1171h<C1141m> implements Preference.C1094c {

    /* renamed from: d */
    private final PreferenceGroup f3689d;

    /* renamed from: e */
    private List<Preference> f3690e;

    /* renamed from: f */
    private List<Preference> f3691f;

    /* renamed from: g */
    private final List<C1132c> f3692g;

    /* renamed from: h */
    private final Handler f3693h;

    /* renamed from: i */
    private final Runnable f3694i = new C1130a();

    /* renamed from: androidx.preference.i$a */
    class C1130a implements Runnable {
        C1130a() {
        }

        public void run() {
            C1129i.this.mo4093H();
        }
    }

    /* renamed from: androidx.preference.i$b */
    class C1131b implements Preference.C1096e {

        /* renamed from: d */
        final /* synthetic */ PreferenceGroup f3696d;

        C1131b(PreferenceGroup preferenceGroup) {
            this.f3696d = preferenceGroup;
        }

        /* renamed from: d */
        public boolean mo3992d(Preference preference) {
            this.f3696d.mo4005R0(Integer.MAX_VALUE);
            C1129i.this.mo3988a(preference);
            PreferenceGroup.C1100b K0 = this.f3696d.mo3999K0();
            if (K0 == null) {
                return true;
            }
            K0.mo4009a();
            return true;
        }
    }

    /* renamed from: androidx.preference.i$c */
    private static class C1132c {

        /* renamed from: a */
        int f3698a;

        /* renamed from: b */
        int f3699b;

        /* renamed from: c */
        String f3700c;

        C1132c(Preference preference) {
            this.f3700c = preference.getClass().getName();
            this.f3698a = preference.mo3962q();
            this.f3699b = preference.mo3920F();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1132c)) {
                return false;
            }
            C1132c cVar = (C1132c) obj;
            return this.f3698a == cVar.f3698a && this.f3699b == cVar.f3699b && TextUtils.equals(this.f3700c, cVar.f3700c);
        }

        public int hashCode() {
            return ((((527 + this.f3698a) * 31) + this.f3699b) * 31) + this.f3700c.hashCode();
        }
    }

    public C1129i(PreferenceGroup preferenceGroup) {
        this.f3689d = preferenceGroup;
        this.f3693h = new Handler(Looper.getMainLooper());
        preferenceGroup.mo3969t0(this);
        this.f3690e = new ArrayList();
        this.f3691f = new ArrayList();
        this.f3692g = new ArrayList();
        mo4507x(preferenceGroup instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup).mo4015U0() : true);
        mo4093H();
    }

    /* renamed from: A */
    private List<Preference> m4620A(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int M0 = preferenceGroup.mo4001M0();
        int i = 0;
        for (int i2 = 0; i2 < M0; i2++) {
            Preference L0 = preferenceGroup.mo4000L0(i2);
            if (L0.mo3926L()) {
                if (!m4622E(preferenceGroup) || i < preferenceGroup.mo3998J0()) {
                    arrayList.add(L0);
                } else {
                    arrayList2.add(L0);
                }
                if (!(L0 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) L0;
                    if (!preferenceGroup2.mo4002N0()) {
                        continue;
                    } else if (!m4622E(preferenceGroup) || !m4622E(preferenceGroup2)) {
                        for (Preference next : m4620A(preferenceGroup2)) {
                            if (!m4622E(preferenceGroup) || i < preferenceGroup.mo3998J0()) {
                                arrayList.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (m4622E(preferenceGroup) && i > preferenceGroup.mo3998J0()) {
            arrayList.add(m4623z(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    /* renamed from: B */
    private void m4621B(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.mo4007T0();
        int M0 = preferenceGroup.mo4001M0();
        for (int i = 0; i < M0; i++) {
            Preference L0 = preferenceGroup.mo4000L0(i);
            list.add(L0);
            C1132c cVar = new C1132c(L0);
            if (!this.f3692g.contains(cVar)) {
                this.f3692g.add(cVar);
            }
            if (L0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) L0;
                if (preferenceGroup2.mo4002N0()) {
                    m4621B(list, preferenceGroup2);
                }
            }
            L0.mo3969t0(this);
        }
    }

    /* renamed from: E */
    private boolean m4622E(PreferenceGroup preferenceGroup) {
        return preferenceGroup.mo3998J0() != Integer.MAX_VALUE;
    }

    /* renamed from: z */
    private C1113b m4623z(PreferenceGroup preferenceGroup, List<Preference> list) {
        C1113b bVar = new C1113b(preferenceGroup.mo3949i(), list, preferenceGroup.mo3957n());
        bVar.mo3972u0(new C1131b(preferenceGroup));
        return bVar;
    }

    /* renamed from: C */
    public Preference mo4089C(int i) {
        if (i < 0 || i >= mo4094g()) {
            return null;
        }
        return this.f3691f.get(i);
    }

    /* renamed from: D */
    public int mo4090D(Preference preference) {
        int size = this.f3691f.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = this.f3691f.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public void mo4097o(C1141m mVar, int i) {
        Preference C = mo4089C(i);
        mVar.mo4133P();
        C.mo3861S(mVar);
    }

    /* renamed from: G */
    public C1141m mo4098q(ViewGroup viewGroup, int i) {
        C1132c cVar = this.f3692g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C1148t.f3811a);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1148t.f3814b);
        if (drawable == null) {
            drawable = C1512a.m6567b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(cVar.f3698a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C0727l0.m2880b0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = cVar.f3699b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C1141m(inflate);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4093H() {
        for (Preference t0 : this.f3690e) {
            t0.mo3969t0((Preference.C1094c) null);
        }
        ArrayList arrayList = new ArrayList(this.f3690e.size());
        this.f3690e = arrayList;
        m4621B(arrayList, this.f3689d);
        this.f3691f = m4620A(this.f3689d);
        C1134k A = this.f3689d.mo3914A();
        if (A != null) {
            A.mo4117g();
        }
        mo4497l();
        for (Preference c : this.f3690e) {
            c.mo3939c();
        }
    }

    /* renamed from: a */
    public void mo3988a(Preference preference) {
        this.f3693h.removeCallbacks(this.f3694i);
        this.f3693h.post(this.f3694i);
    }

    /* renamed from: b */
    public void mo3989b(Preference preference) {
        int indexOf = this.f3691f.indexOf(preference);
        if (indexOf != -1) {
            mo4498m(indexOf, preference);
        }
    }

    /* renamed from: c */
    public void mo3990c(Preference preference) {
        mo3988a(preference);
    }

    /* renamed from: g */
    public int mo4094g() {
        return this.f3691f.size();
    }

    /* renamed from: h */
    public long mo4095h(int i) {
        if (!mo4496k()) {
            return -1;
        }
        return mo4089C(i).mo3957n();
    }

    /* renamed from: i */
    public int mo4096i(int i) {
        C1132c cVar = new C1132c(mo4089C(i));
        int indexOf = this.f3692g.indexOf(cVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f3692g.size();
        this.f3692g.add(cVar);
        return size;
    }
}
