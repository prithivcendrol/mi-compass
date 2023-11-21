package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0941e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.C1134k;
import androidx.preference.DialogPreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.h */
public abstract class C1122h extends Fragment implements C1134k.C1137c, C1134k.C1135a, C1134k.C1136b, DialogPreference.C1080a {

    /* renamed from: f0 */
    private final C1125c f3674f0 = new C1125c();

    /* renamed from: g0 */
    private C1134k f3675g0;

    /* renamed from: h0 */
    RecyclerView f3676h0;

    /* renamed from: i0 */
    private boolean f3677i0;

    /* renamed from: j0 */
    private boolean f3678j0;

    /* renamed from: k0 */
    private int f3679k0 = C1145q.f3751c;

    /* renamed from: l0 */
    private Runnable f3680l0;

    /* renamed from: m0 */
    private final Handler f3681m0 = new C1123a(Looper.getMainLooper());

    /* renamed from: n0 */
    private final Runnable f3682n0 = new C1124b();

    /* renamed from: androidx.preference.h$a */
    class C1123a extends Handler {
        C1123a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C1122h.this.mo4062V1();
            }
        }
    }

    /* renamed from: androidx.preference.h$b */
    class C1124b implements Runnable {
        C1124b() {
        }

        public void run() {
            RecyclerView recyclerView = C1122h.this.f3676h0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.h$c */
    private class C1125c extends RecyclerView.C1182o {

        /* renamed from: a */
        private Drawable f3685a;

        /* renamed from: b */
        private int f3686b;

        /* renamed from: c */
        private boolean f3687c = true;

        C1125c() {
        }

        /* renamed from: m */
        private boolean m4611m(View view, RecyclerView recyclerView) {
            RecyclerView.C1168e0 e0 = recyclerView.mo4290e0(view);
            boolean z = false;
            if (!((e0 instanceof C1141m) && ((C1141m) e0).mo4132O())) {
                return false;
            }
            boolean z2 = this.f3687c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.C1168e0 e02 = recyclerView.mo4290e0(recyclerView.getChildAt(indexOfChild + 1));
            if ((e02 instanceof C1141m) && ((C1141m) e02).mo4131N()) {
                z = true;
            }
            return z;
        }

        /* renamed from: e */
        public void mo4081e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1162b0 b0Var) {
            if (m4611m(view, recyclerView)) {
                rect.bottom = this.f3686b;
            }
        }

        /* renamed from: i */
        public void mo4082i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1162b0 b0Var) {
            if (this.f3685a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (m4611m(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.f3685a.setBounds(0, y, width, this.f3686b + y);
                        this.f3685a.draw(canvas);
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo4083j(boolean z) {
            this.f3687c = z;
        }

        /* renamed from: k */
        public void mo4084k(Drawable drawable) {
            this.f3686b = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.f3685a = drawable;
            C1122h.this.f3676h0.mo4361s0();
        }

        /* renamed from: l */
        public void mo4085l(int i) {
            this.f3686b = i;
            C1122h.this.f3676h0.mo4361s0();
        }
    }

    /* renamed from: androidx.preference.h$d */
    public interface C1126d {
        /* renamed from: a */
        boolean mo4086a(C1122h hVar, Preference preference);
    }

    /* renamed from: androidx.preference.h$e */
    public interface C1127e {
        /* renamed from: a */
        boolean mo4087a(C1122h hVar, Preference preference);
    }

    /* renamed from: androidx.preference.h$f */
    public interface C1128f {
        /* renamed from: a */
        boolean mo4088a(C1122h hVar, PreferenceScreen preferenceScreen);
    }

    /* renamed from: f2 */
    private void m4582f2() {
        if (!this.f3681m0.hasMessages(1)) {
            this.f3681m0.obtainMessage(1).sendToTarget();
        }
    }

    /* renamed from: g2 */
    private void m4583g2() {
        if (this.f3675g0 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    /* renamed from: l2 */
    private void m4584l2() {
        mo4064X1().setAdapter((RecyclerView.C1171h) null);
        PreferenceScreen Y1 = mo4065Y1();
        if (Y1 != null) {
            Y1.mo3933V();
        }
        mo4071e2();
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        super.mo3200B0(bundle);
        TypedValue typedValue = new TypedValue();
        mo3207D1().getTheme().resolveAttribute(C1142n.f3738i, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C1147s.f3758a;
        }
        mo3207D1().getTheme().applyStyle(i, false);
        C1134k kVar = new C1134k(mo3207D1());
        this.f3675g0 = kVar;
        kVar.mo4123n(this);
        mo4069c2(bundle, mo3323z() != null ? mo3323z().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    /* renamed from: F0 */
    public View mo3211F0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = mo3207D1().obtainStyledAttributes((AttributeSet) null, C1148t.f3864v0, C1142n.f3735f, 0);
        this.f3679k0 = obtainStyledAttributes.getResourceId(C1148t.f3866w0, this.f3679k0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1148t.f3868x0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1148t.f3870y0, -1);
        boolean z = obtainStyledAttributes.getBoolean(C1148t.f3872z0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(mo3207D1());
        View inflate = cloneInContext.inflate(this.f3679k0, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView d2 = mo4070d2(cloneInContext, viewGroup2, bundle);
            if (d2 != null) {
                this.f3676h0 = d2;
                d2.mo4294g(this.f3674f0);
                mo4072h2(drawable);
                if (dimensionPixelSize != -1) {
                    mo4073i2(dimensionPixelSize);
                }
                this.f3674f0.mo4083j(z);
                if (this.f3676h0.getParent() == null) {
                    viewGroup2.addView(this.f3676h0);
                }
                this.f3681m0.post(this.f3682n0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    /* renamed from: I0 */
    public void mo3217I0() {
        this.f3681m0.removeCallbacks(this.f3682n0);
        this.f3681m0.removeMessages(1);
        if (this.f3677i0) {
            m4584l2();
        }
        this.f3676h0 = null;
        super.mo3217I0();
    }

    /* renamed from: U1 */
    public void mo4061U1(int i) {
        m4583g2();
        mo4075j2(this.f3675g0.mo4121k(mo3207D1(), i, mo4065Y1()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public void mo4062V1() {
        PreferenceScreen Y1 = mo4065Y1();
        if (Y1 != null) {
            mo4064X1().setAdapter(mo4067a2(Y1));
            Y1.mo3929P();
        }
        mo4066Z1();
    }

    /* renamed from: W1 */
    public Fragment mo4063W1() {
        return null;
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
        super.mo3257X0(bundle);
        PreferenceScreen Y1 = mo4065Y1();
        if (Y1 != null) {
            Bundle bundle2 = new Bundle();
            Y1.mo3958n0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* renamed from: X1 */
    public final RecyclerView mo4064X1() {
        return this.f3676h0;
    }

    /* renamed from: Y0 */
    public void mo3259Y0() {
        super.mo3259Y0();
        this.f3675g0.mo4124o(this);
        this.f3675g0.mo4122m(this);
    }

    /* renamed from: Y1 */
    public PreferenceScreen mo4065Y1() {
        return this.f3675g0.mo4119i();
    }

    /* renamed from: Z0 */
    public void mo3261Z0() {
        super.mo3261Z0();
        this.f3675g0.mo4124o((C1134k.C1137c) null);
        this.f3675g0.mo4122m((C1134k.C1135a) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public void mo4066Z1() {
    }

    /* renamed from: a1 */
    public void mo3263a1(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen Y1;
        super.mo3263a1(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (Y1 = mo4065Y1()) == null)) {
            Y1.mo3956m0(bundle2);
        }
        if (this.f3677i0) {
            mo4062V1();
            Runnable runnable = this.f3680l0;
            if (runnable != null) {
                runnable.run();
                this.f3680l0 = null;
            }
        }
        this.f3678j0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public RecyclerView.C1171h mo4067a2(PreferenceScreen preferenceScreen) {
        return new C1129i(preferenceScreen);
    }

    /* renamed from: b2 */
    public RecyclerView.C1183p mo4068b2() {
        return new LinearLayoutManager(mo3207D1());
    }

    /* renamed from: c2 */
    public abstract void mo4069c2(Bundle bundle, String str);

    /* renamed from: d2 */
    public RecyclerView mo4070d2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (mo3207D1().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C1144p.f3744b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C1145q.f3752d, viewGroup, false);
        recyclerView2.setLayoutManager(mo4068b2());
        recyclerView2.setAccessibilityDelegateCompat(new C1139l(recyclerView2));
        return recyclerView2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e2 */
    public void mo4071e2() {
    }

    /* renamed from: h */
    public <T extends Preference> T mo3871h(CharSequence charSequence) {
        C1134k kVar = this.f3675g0;
        if (kVar == null) {
            return null;
        }
        return kVar.mo4112a(charSequence);
    }

    /* renamed from: h2 */
    public void mo4072h2(Drawable drawable) {
        this.f3674f0.mo4084k(drawable);
    }

    /* renamed from: i2 */
    public void mo4073i2(int i) {
        this.f3674f0.mo4085l(i);
    }

    /* renamed from: j */
    public void mo4074j(Preference preference) {
        C0941e eVar;
        boolean a = mo4063W1() instanceof C1126d ? ((C1126d) mo4063W1()).mo4086a(this, preference) : false;
        Fragment fragment = this;
        while (!a && fragment != null) {
            if (fragment instanceof C1126d) {
                a = ((C1126d) fragment).mo4086a(this, preference);
            }
            fragment = fragment.mo3247T();
        }
        if (!a && (mo3199B() instanceof C1126d)) {
            a = ((C1126d) mo3199B()).mo4086a(this, preference);
        }
        if (!a && (mo3306t() instanceof C1126d)) {
            a = ((C1126d) mo3306t()).mo4086a(this, preference);
        }
        if (!a && mo3250U().mo3380i0("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                eVar = C1111a.m4544q2(preference.mo3960p());
            } else if (preference instanceof ListPreference) {
                eVar = C1114c.m4558p2(preference.mo3960p());
            } else if (preference instanceof MultiSelectListPreference) {
                eVar = C1116d.m4564p2(preference.mo3960p());
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            eVar.mo3241Q1(this, 0);
            eVar.mo3521f2(mo3250U(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: j2 */
    public void mo4075j2(PreferenceScreen preferenceScreen) {
        if (this.f3675g0.mo4125p(preferenceScreen) && preferenceScreen != null) {
            mo4071e2();
            this.f3677i0 = true;
            if (this.f3678j0) {
                m4582f2();
            }
        }
    }

    /* renamed from: k2 */
    public void mo4076k2(int i, String str) {
        m4583g2();
        PreferenceScreen k = this.f3675g0.mo4121k(mo3207D1(), i, (PreferenceScreen) null);
        Object obj = k;
        if (str != null) {
            Object I0 = k.mo3997I0(str);
            boolean z = I0 instanceof PreferenceScreen;
            obj = I0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        mo4075j2((PreferenceScreen) obj);
    }

    /* renamed from: l */
    public void mo4077l(PreferenceScreen preferenceScreen) {
        boolean a = mo4063W1() instanceof C1128f ? ((C1128f) mo4063W1()).mo4088a(this, preferenceScreen) : false;
        Fragment fragment = this;
        while (!a && fragment != null) {
            if (fragment instanceof C1128f) {
                a = ((C1128f) fragment).mo4088a(this, preferenceScreen);
            }
            fragment = fragment.mo3247T();
        }
        if (!a && (mo3199B() instanceof C1128f)) {
            a = ((C1128f) mo3199B()).mo4088a(this, preferenceScreen);
        }
        if (!a && (mo3306t() instanceof C1128f)) {
            ((C1128f) mo3306t()).mo4088a(this, preferenceScreen);
        }
    }

    /* renamed from: n */
    public boolean mo4078n(Preference preference) {
        if (preference.mo3955m() == null) {
            return false;
        }
        boolean a = mo4063W1() instanceof C1127e ? ((C1127e) mo4063W1()).mo4087a(this, preference) : false;
        Fragment fragment = this;
        while (!a && fragment != null) {
            if (fragment instanceof C1127e) {
                a = ((C1127e) fragment).mo4087a(this, preference);
            }
            fragment = fragment.mo3247T();
        }
        if (!a && (mo3199B() instanceof C1127e)) {
            a = ((C1127e) mo3199B()).mo4087a(this, preference);
        }
        if (!a && (mo3306t() instanceof C1127e)) {
            a = ((C1127e) mo3306t()).mo4087a(this, preference);
        }
        if (a) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager U = mo3250U();
        Bundle k = preference.mo3953k();
        Fragment a2 = U.mo3397s0().mo3412a(mo3201B1().getClassLoader(), preference.mo3955m());
        a2.mo3220J1(k);
        a2.mo3241Q1(this, 0);
        U.mo3392o().mo3563o(((View) mo3209E1().getParent()).getId(), a2).mo3561f((String) null).mo3429g();
        return true;
    }
}
