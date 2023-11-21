package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0727l0;
import androidx.fragment.app.C0972l0;
import androidx.lifecycle.C1039g0;
import p001a0.C0009b;
import p010b0.C1285d;

/* renamed from: androidx.fragment.app.d0 */
class C0938d0 {

    /* renamed from: a */
    private final C0990r f3213a;

    /* renamed from: b */
    private final C0947e0 f3214b;

    /* renamed from: c */
    private final Fragment f3215c;

    /* renamed from: d */
    private boolean f3216d = false;

    /* renamed from: e */
    private int f3217e = -1;

    /* renamed from: androidx.fragment.app.d0$a */
    class C0939a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        final /* synthetic */ View f3218d;

        C0939a(View view) {
            this.f3218d = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3218d.removeOnAttachStateChangeListener(this);
            C0727l0.m2872V(this.f3218d);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.d0$b */
    static /* synthetic */ class C0940b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3220a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.g$c[] r0 = androidx.lifecycle.C1035g.C1038c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3220a = r0
                androidx.lifecycle.g$c r1 = androidx.lifecycle.C1035g.C1038c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3220a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$c r1 = androidx.lifecycle.C1035g.C1038c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3220a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$c r1 = androidx.lifecycle.C1035g.C1038c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3220a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$c r1 = androidx.lifecycle.C1035g.C1038c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0938d0.C0940b.<clinit>():void");
        }
    }

    C0938d0(C0990r rVar, C0947e0 e0Var, Fragment fragment) {
        this.f3213a = rVar;
        this.f3214b = e0Var;
        this.f3215c = fragment;
    }

    C0938d0(C0990r rVar, C0947e0 e0Var, Fragment fragment, C0921c0 c0Var) {
        this.f3213a = rVar;
        this.f3214b = e0Var;
        this.f3215c = fragment;
        fragment.f3022f = null;
        fragment.f3023g = null;
        fragment.f3038v = 0;
        fragment.f3035s = false;
        fragment.f3031o = false;
        Fragment fragment2 = fragment.f3027k;
        fragment.f3028l = fragment2 != null ? fragment2.f3025i : null;
        fragment.f3027k = null;
        Bundle bundle = c0Var.f3166p;
        fragment.f3021e = bundle == null ? new Bundle() : bundle;
    }

    C0938d0(C0990r rVar, C0947e0 e0Var, ClassLoader classLoader, C0986o oVar, C0921c0 c0Var) {
        this.f3213a = rVar;
        this.f3214b = e0Var;
        Fragment a = c0Var.mo3460a(oVar, classLoader);
        this.f3215c = a;
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    /* renamed from: l */
    private boolean m3841l(View view) {
        if (view == this.f3215c.f3001L) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3215c.f3001L) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m3842q() {
        Bundle bundle = new Bundle();
        this.f3215c.mo3316w1(bundle);
        this.f3213a.mo3708j(this.f3215c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3215c.f3001L != null) {
            mo3509s();
        }
        if (this.f3215c.f3022f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3215c.f3022f);
        }
        if (this.f3215c.f3023g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3215c.f3023g);
        }
        if (!this.f3215c.f3003N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3215c.f3003N);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3493a() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3215c);
        }
        Fragment fragment = this.f3215c;
        fragment.mo3267c1(fragment.f3021e);
        C0990r rVar = this.f3213a;
        Fragment fragment2 = this.f3215c;
        rVar.mo3699a(fragment2, fragment2.f3021e, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3494b() {
        int j = this.f3214b.mo3540j(this.f3215c);
        Fragment fragment = this.f3215c;
        fragment.f3000K.addView(fragment.f3001L, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3495c() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3215c);
        }
        Fragment fragment = this.f3215c;
        Fragment fragment2 = fragment.f3027k;
        C0938d0 d0Var = null;
        if (fragment2 != null) {
            C0938d0 n = this.f3214b.mo3544n(fragment2.f3025i);
            if (n != null) {
                Fragment fragment3 = this.f3215c;
                fragment3.f3028l = fragment3.f3027k.f3025i;
                fragment3.f3027k = null;
                d0Var = n;
            } else {
                throw new IllegalStateException("Fragment " + this.f3215c + " declared target fragment " + this.f3215c.f3027k + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3028l;
            if (str != null && (d0Var = this.f3214b.mo3544n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3215c + " declared target fragment " + this.f3215c.f3028l + " that does not belong to this FragmentManager!");
            }
        }
        if (d0Var != null) {
            d0Var.mo3504m();
        }
        Fragment fragment4 = this.f3215c;
        fragment4.f3040x = fragment4.f3039w.mo3401u0();
        Fragment fragment5 = this.f3215c;
        fragment5.f3042z = fragment5.f3039w.mo3406x0();
        this.f3213a.mo3705g(this.f3215c, false);
        this.f3215c.mo3269d1();
        this.f3213a.mo3700b(this.f3215c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3496d() {
        Fragment fragment = this.f3215c;
        if (fragment.f3039w == null) {
            return fragment.f3019d;
        }
        int i = this.f3217e;
        int i2 = C0940b.f3220a[fragment.f3010U.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment2 = this.f3215c;
        if (fragment2.f3034r) {
            if (fragment2.f3035s) {
                i = Math.max(this.f3217e, 2);
                View view = this.f3215c.f3001L;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3217e < 4 ? Math.min(i, fragment2.f3019d) : Math.min(i, 1);
            }
        }
        if (!this.f3215c.f3031o) {
            i = Math.min(i, 1);
        }
        C0972l0.C0977e.C0979b bVar = null;
        Fragment fragment3 = this.f3215c;
        ViewGroup viewGroup = fragment3.f3000K;
        if (viewGroup != null) {
            bVar = C0972l0.m4042n(viewGroup, fragment3.mo3250U()).mo3640l(this);
        }
        if (bVar == C0972l0.C0977e.C0979b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C0972l0.C0977e.C0979b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f3215c;
            if (fragment4.f3032p) {
                i = fragment4.mo3296p0() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.f3215c;
        if (fragment5.f3002M && fragment5.f3019d < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f3215c);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3497e() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3215c);
        }
        Fragment fragment = this.f3215c;
        if (!fragment.f3008S) {
            this.f3213a.mo3706h(fragment, fragment.f3021e, false);
            Fragment fragment2 = this.f3215c;
            fragment2.mo3276g1(fragment2.f3021e);
            C0990r rVar = this.f3213a;
            Fragment fragment3 = this.f3215c;
            rVar.mo3701c(fragment3, fragment3.f3021e, false);
            return;
        }
        fragment.mo3212F1(fragment.f3021e);
        this.f3215c.f3019d = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3498f() {
        String str;
        if (!this.f3215c.f3034r) {
            if (FragmentManager.m3651H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3215c);
            }
            Fragment fragment = this.f3215c;
            LayoutInflater m1 = fragment.mo3286m1(fragment.f3021e);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3215c;
            ViewGroup viewGroup2 = fragment2.f3000K;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.f2991B;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.f3039w.mo3396q0().mo3330d(this.f3215c.f2991B);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3215c;
                            if (!fragment3.f3036t) {
                                try {
                                    str = fragment3.mo3262a0().getResourceName(this.f3215c.f2991B);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3215c.f2991B) + " (" + str + ") for fragment " + this.f3215c);
                            }
                        } else if (!(viewGroup instanceof C0981m)) {
                            C1285d.m5929l(this.f3215c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3215c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3215c;
            fragment4.f3000K = viewGroup;
            fragment4.mo3280i1(m1, viewGroup, fragment4.f3021e);
            View view = this.f3215c.f3001L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3215c;
                fragment5.f3001L.setTag(C0009b.f14a, fragment5);
                if (viewGroup != null) {
                    mo3494b();
                }
                Fragment fragment6 = this.f3215c;
                if (fragment6.f2993D) {
                    fragment6.f3001L.setVisibility(8);
                }
                if (C0727l0.m2859I(this.f3215c.f3001L)) {
                    C0727l0.m2872V(this.f3215c.f3001L);
                } else {
                    View view2 = this.f3215c.f3001L;
                    view2.addOnAttachStateChangeListener(new C0939a(view2));
                }
                this.f3215c.mo3325z1();
                C0990r rVar = this.f3213a;
                Fragment fragment7 = this.f3215c;
                rVar.mo3711m(fragment7, fragment7.f3001L, fragment7.f3021e, false);
                int visibility = this.f3215c.f3001L.getVisibility();
                this.f3215c.mo3235O1(this.f3215c.f3001L.getAlpha());
                Fragment fragment8 = this.f3215c;
                if (fragment8.f3000K != null && visibility == 0) {
                    View findFocus = fragment8.f3001L.findFocus();
                    if (findFocus != null) {
                        this.f3215c.mo3223K1(findFocus);
                        if (FragmentManager.m3651H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3215c);
                        }
                    }
                    this.f3215c.f3001L.setAlpha(0.0f);
                }
            }
            this.f3215c.f3019d = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3499g() {
        Fragment f;
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3215c);
        }
        Fragment fragment = this.f3215c;
        boolean z = true;
        boolean z2 = fragment.f3032p && !fragment.mo3296p0();
        if (z2) {
            Fragment fragment2 = this.f3215c;
            if (!fragment2.f3033q) {
                this.f3214b.mo3530B(fragment2.f3025i, (C0921c0) null);
            }
        }
        if (z2 || this.f3214b.mo3546p().mo3732q(this.f3215c)) {
            C0987p<?> pVar = this.f3215c.f3040x;
            if (pVar instanceof C1039g0) {
                z = this.f3214b.mo3546p().mo3729n();
            } else if (pVar.mo3692j() instanceof Activity) {
                z = true ^ ((Activity) pVar.mo3692j()).isChangingConfigurations();
            }
            if ((z2 && !this.f3215c.f3033q) || z) {
                this.f3214b.mo3546p().mo3722f(this.f3215c);
            }
            this.f3215c.mo3282j1();
            this.f3213a.mo3702d(this.f3215c, false);
            for (C0938d0 next : this.f3214b.mo3541k()) {
                if (next != null) {
                    Fragment k = next.mo3503k();
                    if (this.f3215c.f3025i.equals(k.f3028l)) {
                        k.f3027k = this.f3215c;
                        k.f3028l = null;
                    }
                }
            }
            Fragment fragment3 = this.f3215c;
            String str = fragment3.f3028l;
            if (str != null) {
                fragment3.f3027k = this.f3214b.mo3536f(str);
            }
            this.f3214b.mo3549s(this);
            return;
        }
        String str2 = this.f3215c.f3028l;
        if (!(str2 == null || (f = this.f3214b.mo3536f(str2)) == null || !f.f2995F)) {
            this.f3215c.f3027k = f;
        }
        this.f3215c.f3019d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3500h() {
        View view;
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3215c);
        }
        Fragment fragment = this.f3215c;
        ViewGroup viewGroup = fragment.f3000K;
        if (!(viewGroup == null || (view = fragment.f3001L) == null)) {
            viewGroup.removeView(view);
        }
        this.f3215c.mo3283k1();
        this.f3213a.mo3712n(this.f3215c, false);
        Fragment fragment2 = this.f3215c;
        fragment2.f3000K = null;
        fragment2.f3001L = null;
        fragment2.f3012W = null;
        fragment2.f3013X.mo3744i(null);
        this.f3215c.f3035s = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3501i() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3215c);
        }
        this.f3215c.mo3285l1();
        boolean z = false;
        this.f3213a.mo3703e(this.f3215c, false);
        Fragment fragment = this.f3215c;
        fragment.f3019d = -1;
        fragment.f3040x = null;
        fragment.f3042z = null;
        fragment.f3039w = null;
        if (fragment.f3032p && !fragment.mo3296p0()) {
            z = true;
        }
        if (z || this.f3214b.mo3546p().mo3732q(this.f3215c)) {
            if (FragmentManager.m3651H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3215c);
            }
            this.f3215c.mo3284l0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3502j() {
        Fragment fragment = this.f3215c;
        if (fragment.f3034r && fragment.f3035s && !fragment.f3037u) {
            if (FragmentManager.m3651H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3215c);
            }
            Fragment fragment2 = this.f3215c;
            fragment2.mo3280i1(fragment2.mo3286m1(fragment2.f3021e), (ViewGroup) null, this.f3215c.f3021e);
            View view = this.f3215c.f3001L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3215c;
                fragment3.f3001L.setTag(C0009b.f14a, fragment3);
                Fragment fragment4 = this.f3215c;
                if (fragment4.f2993D) {
                    fragment4.f3001L.setVisibility(8);
                }
                this.f3215c.mo3325z1();
                C0990r rVar = this.f3213a;
                Fragment fragment5 = this.f3215c;
                rVar.mo3711m(fragment5, fragment5.f3001L, fragment5.f3021e, false);
                this.f3215c.f3019d = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment mo3503k() {
        return this.f3215c;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3504m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3216d) {
            try {
                this.f3216d = true;
                boolean z = false;
                while (true) {
                    int d = mo3496d();
                    Fragment fragment = this.f3215c;
                    int i = fragment.f3019d;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo3501i();
                                    break;
                                case 0:
                                    if (fragment.f3033q && this.f3214b.mo3547q(fragment.f3025i) == null) {
                                        mo3508r();
                                    }
                                    mo3499g();
                                    break;
                                case 1:
                                    mo3500h();
                                    this.f3215c.f3019d = 1;
                                    break;
                                case 2:
                                    fragment.f3035s = false;
                                    fragment.f3019d = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m3651H0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3215c);
                                    }
                                    Fragment fragment2 = this.f3215c;
                                    if (fragment2.f3033q) {
                                        mo3508r();
                                    } else if (fragment2.f3001L != null && fragment2.f3022f == null) {
                                        mo3509s();
                                    }
                                    Fragment fragment3 = this.f3215c;
                                    if (!(fragment3.f3001L == null || (viewGroup2 = fragment3.f3000K) == null)) {
                                        C0972l0.m4042n(viewGroup2, fragment3.mo3250U()).mo3635d(this);
                                    }
                                    this.f3215c.f3019d = 3;
                                    break;
                                case 4:
                                    mo3512v();
                                    break;
                                case 5:
                                    fragment.f3019d = 5;
                                    break;
                                case 6:
                                    mo3505n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo3495c();
                                    break;
                                case 1:
                                    mo3497e();
                                    break;
                                case 2:
                                    mo3502j();
                                    mo3498f();
                                    break;
                                case 3:
                                    mo3493a();
                                    break;
                                case 4:
                                    if (!(fragment.f3001L == null || (viewGroup3 = fragment.f3000K) == null)) {
                                        C0972l0.m4042n(viewGroup3, fragment.mo3250U()).mo3633b(C0972l0.C0977e.C0980c.m4071b(this.f3215c.f3001L.getVisibility()), this);
                                    }
                                    this.f3215c.f3019d = 4;
                                    break;
                                case 5:
                                    mo3511u();
                                    break;
                                case 6:
                                    fragment.f3019d = 6;
                                    break;
                                case 7:
                                    mo3507p();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.f3032p && !fragment.mo3296p0() && !this.f3215c.f3033q) {
                            if (FragmentManager.m3651H0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3215c);
                            }
                            this.f3214b.mo3546p().mo3722f(this.f3215c);
                            this.f3214b.mo3549s(this);
                            if (FragmentManager.m3651H0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f3215c);
                            }
                            this.f3215c.mo3284l0();
                        }
                        Fragment fragment4 = this.f3215c;
                        if (fragment4.f3006Q) {
                            if (!(fragment4.f3001L == null || (viewGroup = fragment4.f3000K) == null)) {
                                C0972l0 n = C0972l0.m4042n(viewGroup, fragment4.mo3250U());
                                if (this.f3215c.f2993D) {
                                    n.mo3634c(this);
                                } else {
                                    n.mo3636e(this);
                                }
                            }
                            Fragment fragment5 = this.f3215c;
                            FragmentManager fragmentManager = fragment5.f3039w;
                            if (fragmentManager != null) {
                                fragmentManager.mo3342F0(fragment5);
                            }
                            Fragment fragment6 = this.f3215c;
                            fragment6.f3006Q = false;
                            fragment6.mo3225L0(fragment6.f2993D);
                            this.f3215c.f3041y.mo3347J();
                        }
                        this.f3216d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f3216d = false;
                throw th;
            }
        } else if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo3503k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3505n() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3215c);
        }
        this.f3215c.mo3302r1();
        this.f3213a.mo3704f(this.f3215c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3506o(ClassLoader classLoader) {
        Bundle bundle = this.f3215c.f3021e;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3215c;
            fragment.f3022f = fragment.f3021e.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3215c;
            fragment2.f3023g = fragment2.f3021e.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3215c;
            fragment3.f3028l = fragment3.f3021e.getString("android:target_state");
            Fragment fragment4 = this.f3215c;
            if (fragment4.f3028l != null) {
                fragment4.f3029m = fragment4.f3021e.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3215c;
            Boolean bool = fragment5.f3024h;
            if (bool != null) {
                fragment5.f3003N = bool.booleanValue();
                this.f3215c.f3024h = null;
            } else {
                fragment5.f3003N = fragment5.f3021e.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3215c;
            if (!fragment6.f3003N) {
                fragment6.f3002M = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3507p() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3215c);
        }
        View M = this.f3215c.mo3227M();
        if (M != null && m3841l(M)) {
            boolean requestFocus = M.requestFocus();
            if (FragmentManager.m3651H0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(M);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3215c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3215c.f3001L.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3215c.mo3223K1((View) null);
        this.f3215c.mo3313v1();
        this.f3213a.mo3707i(this.f3215c, false);
        Fragment fragment = this.f3215c;
        fragment.f3021e = null;
        fragment.f3022f = null;
        fragment.f3023g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3508r() {
        C0921c0 c0Var = new C0921c0(this.f3215c);
        Fragment fragment = this.f3215c;
        if (fragment.f3019d <= -1 || c0Var.f3166p != null) {
            c0Var.f3166p = fragment.f3021e;
        } else {
            Bundle q = m3842q();
            c0Var.f3166p = q;
            if (this.f3215c.f3028l != null) {
                if (q == null) {
                    c0Var.f3166p = new Bundle();
                }
                c0Var.f3166p.putString("android:target_state", this.f3215c.f3028l);
                int i = this.f3215c.f3029m;
                if (i != 0) {
                    c0Var.f3166p.putInt("android:target_req_state", i);
                }
            }
        }
        this.f3214b.mo3530B(this.f3215c.f3025i, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3509s() {
        if (this.f3215c.f3001L != null) {
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f3215c + " with view " + this.f3215c.f3001L);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3215c.f3001L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3215c.f3022f = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3215c.f3012W.mo3624h(bundle);
            if (!bundle.isEmpty()) {
                this.f3215c.f3023g = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3510t(int i) {
        this.f3217e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3511u() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3215c);
        }
        this.f3215c.mo3319x1();
        this.f3213a.mo3709k(this.f3215c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3512v() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3215c);
        }
        this.f3215c.mo3322y1();
        this.f3213a.mo3710l(this.f3215c, false);
    }
}
