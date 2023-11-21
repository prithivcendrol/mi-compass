package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0507n;
import androidx.core.view.C0704g;
import androidx.lifecycle.C1021d0;
import androidx.lifecycle.C1033f;
import androidx.lifecycle.C1034f0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1039g0;
import androidx.lifecycle.C1041h0;
import androidx.lifecycle.C1043i0;
import androidx.lifecycle.C1046k;
import androidx.lifecycle.C1048m;
import androidx.lifecycle.C1049n;
import androidx.lifecycle.C1054r;
import androidx.lifecycle.C1069z;
import androidx.lifecycle.LiveData;
import androidx.loader.app.C1074a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p010b0.C1285d;
import p022d0.C1457a;
import p022d0.C1462d;
import p040g0.C1587c;
import p040g0.C1591d;
import p040g0.C1593e;
import p040g0.C1594f;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1048m, C1039g0, C1033f, C1593e {

    /* renamed from: e0 */
    static final Object f2989e0 = new Object();

    /* renamed from: A */
    int f2990A;

    /* renamed from: B */
    int f2991B;

    /* renamed from: C */
    String f2992C;

    /* renamed from: D */
    boolean f2993D;

    /* renamed from: E */
    boolean f2994E;

    /* renamed from: F */
    boolean f2995F;

    /* renamed from: G */
    boolean f2996G;

    /* renamed from: H */
    boolean f2997H;

    /* renamed from: I */
    boolean f2998I = true;

    /* renamed from: J */
    private boolean f2999J;

    /* renamed from: K */
    ViewGroup f3000K;

    /* renamed from: L */
    View f3001L;

    /* renamed from: M */
    boolean f3002M;

    /* renamed from: N */
    boolean f3003N = true;

    /* renamed from: O */
    C0894f f3004O;

    /* renamed from: P */
    Runnable f3005P = new C0889a();

    /* renamed from: Q */
    boolean f3006Q;

    /* renamed from: R */
    LayoutInflater f3007R;

    /* renamed from: S */
    boolean f3008S;

    /* renamed from: T */
    public String f3009T;

    /* renamed from: U */
    C1035g.C1038c f3010U = C1035g.C1038c.RESUMED;

    /* renamed from: V */
    C1049n f3011V;

    /* renamed from: W */
    C0966j0 f3012W;

    /* renamed from: X */
    C1054r<C1048m> f3013X = new C1054r<>();

    /* renamed from: Y */
    C1021d0.C1025b f3014Y;

    /* renamed from: Z */
    C1591d f3015Z;

    /* renamed from: a0 */
    private int f3016a0;

    /* renamed from: b0 */
    private final AtomicInteger f3017b0 = new AtomicInteger();

    /* renamed from: c0 */
    private final ArrayList<C0897i> f3018c0 = new ArrayList<>();

    /* renamed from: d */
    int f3019d = -1;

    /* renamed from: d0 */
    private final C0897i f3020d0 = new C0890b();

    /* renamed from: e */
    Bundle f3021e;

    /* renamed from: f */
    SparseArray<Parcelable> f3022f;

    /* renamed from: g */
    Bundle f3023g;

    /* renamed from: h */
    Boolean f3024h;

    /* renamed from: i */
    String f3025i = UUID.randomUUID().toString();

    /* renamed from: j */
    Bundle f3026j;

    /* renamed from: k */
    Fragment f3027k;

    /* renamed from: l */
    String f3028l = null;

    /* renamed from: m */
    int f3029m;

    /* renamed from: n */
    private Boolean f3030n = null;

    /* renamed from: o */
    boolean f3031o;

    /* renamed from: p */
    boolean f3032p;

    /* renamed from: q */
    boolean f3033q;

    /* renamed from: r */
    boolean f3034r;

    /* renamed from: s */
    boolean f3035s;

    /* renamed from: t */
    boolean f3036t;

    /* renamed from: u */
    boolean f3037u;

    /* renamed from: v */
    int f3038v;

    /* renamed from: w */
    FragmentManager f3039w;

    /* renamed from: x */
    C0987p<?> f3040x;

    /* renamed from: y */
    FragmentManager f3041y = new C0997x();

    /* renamed from: z */
    Fragment f3042z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0889a implements Runnable {
        C0889a() {
        }

        public void run() {
            Fragment.this.mo3249T1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0890b extends C0897i {
        C0890b() {
            super((C0889a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3327a() {
            Fragment.this.f3015Z.mo5740c();
            C1069z.m4296a(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0891c implements Runnable {
        C0891c() {
        }

        public void run() {
            Fragment.this.mo3289o(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0892d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0972l0 f3047d;

        C0892d(C0972l0 l0Var) {
            this.f3047d = l0Var;
        }

        public void run() {
            this.f3047d.mo3637g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    class C0893e extends C0971l {
        C0893e() {
        }

        /* renamed from: d */
        public View mo3330d(int i) {
            View view = Fragment.this.f3001L;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: g */
        public boolean mo3331g() {
            return Fragment.this.f3001L != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    static class C0894f {

        /* renamed from: a */
        View f3050a;

        /* renamed from: b */
        boolean f3051b;

        /* renamed from: c */
        int f3052c;

        /* renamed from: d */
        int f3053d;

        /* renamed from: e */
        int f3054e;

        /* renamed from: f */
        int f3055f;

        /* renamed from: g */
        int f3056g;

        /* renamed from: h */
        ArrayList<String> f3057h;

        /* renamed from: i */
        ArrayList<String> f3058i;

        /* renamed from: j */
        Object f3059j = null;

        /* renamed from: k */
        Object f3060k;

        /* renamed from: l */
        Object f3061l;

        /* renamed from: m */
        Object f3062m;

        /* renamed from: n */
        Object f3063n;

        /* renamed from: o */
        Object f3064o;

        /* renamed from: p */
        Boolean f3065p;

        /* renamed from: q */
        Boolean f3066q;

        /* renamed from: r */
        float f3067r;

        /* renamed from: s */
        View f3068s;

        /* renamed from: t */
        boolean f3069t;

        C0894f() {
            Object obj = Fragment.f2989e0;
            this.f3060k = obj;
            this.f3061l = null;
            this.f3062m = obj;
            this.f3063n = null;
            this.f3064o = obj;
            this.f3067r = 1.0f;
            this.f3068s = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    static class C0895g {
        /* renamed from: a */
        static void m3648a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public static class C0896h extends RuntimeException {
        public C0896h(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    private static abstract class C0897i {
        private C0897i() {
        }

        /* synthetic */ C0897i(C0889a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3327a();
    }

    public Fragment() {
        m3514k0();
    }

    /* renamed from: A1 */
    private void m3510A1(C0897i iVar) {
        if (this.f3019d >= 0) {
            iVar.mo3327a();
        } else {
            this.f3018c0.add(iVar);
        }
    }

    /* renamed from: G1 */
    private void m3511G1() {
        if (FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3001L != null) {
            mo3215H1(this.f3021e);
        }
        this.f3021e = null;
    }

    /* renamed from: R */
    private int m3512R() {
        C1035g.C1038c cVar = this.f3010U;
        return (cVar == C1035g.C1038c.INITIALIZED || this.f3042z == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f3042z.m3512R());
    }

    /* renamed from: h0 */
    private Fragment m3513h0(boolean z) {
        String str;
        if (z) {
            C1285d.m5927j(this);
        }
        Fragment fragment = this.f3027k;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f3039w;
        if (fragmentManager == null || (str = this.f3028l) == null) {
            return null;
        }
        return fragmentManager.mo3376f0(str);
    }

    /* renamed from: k0 */
    private void m3514k0() {
        this.f3011V = new C1049n(this);
        this.f3015Z = C1591d.m6806a(this);
        this.f3014Y = null;
        if (!this.f3018c0.contains(this.f3020d0)) {
            m3510A1(this.f3020d0);
        }
    }

    @Deprecated
    /* renamed from: m0 */
    public static Fragment m3515m0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0986o.m4093d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3220J1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0896h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0896h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0896h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0896h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: r */
    private C0894f m3516r() {
        if (this.f3004O == null) {
            this.f3004O = new C0894f();
        }
        return this.f3004O;
    }

    /* renamed from: A */
    public final FragmentManager mo3197A() {
        if (this.f3040x != null) {
            return this.f3041y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: A0 */
    public boolean mo3198A0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: B */
    public Context mo3199B() {
        C0987p<?> pVar = this.f3040x;
        if (pVar == null) {
            return null;
        }
        return pVar.mo3692j();
    }

    /* renamed from: B0 */
    public void mo3200B0(Bundle bundle) {
        this.f2999J = true;
        mo3212F1(bundle);
        if (!this.f3041y.mo3354N0(1)) {
            this.f3041y.mo3335C();
        }
    }

    /* renamed from: B1 */
    public final C0964j mo3201B1() {
        C0964j t = mo3306t();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo3202C() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3052c;
    }

    /* renamed from: C0 */
    public Animation mo3203C0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: C1 */
    public final Bundle mo3204C1() {
        Bundle z = mo3323z();
        if (z != null) {
            return z;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    /* renamed from: D */
    public Object mo3205D() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3059j;
    }

    /* renamed from: D0 */
    public Animator mo3206D0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: D1 */
    public final Context mo3207D1() {
        Context B = mo3199B();
        if (B != null) {
            return B;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    /* renamed from: E0 */
    public void mo3208E0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: E1 */
    public final View mo3209E1() {
        View i0 = mo3279i0();
        if (i0 != null) {
            return i0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public C0507n mo3210F() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        return null;
    }

    /* renamed from: F0 */
    public View mo3211F0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f3016a0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public void mo3212F1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3041y.mo3377g1(parcelable);
            this.f3041y.mo3335C();
        }
    }

    /* renamed from: G0 */
    public void mo3213G0() {
        this.f2999J = true;
    }

    /* renamed from: H */
    public C1034f0 mo243H() {
        if (this.f3039w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (m3512R() != C1035g.C1038c.INITIALIZED.ordinal()) {
            return this.f3039w.mo3336C0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @Deprecated
    /* renamed from: H0 */
    public void mo3214H0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final void mo3215H1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3022f;
        if (sparseArray != null) {
            this.f3001L.restoreHierarchyState(sparseArray);
            this.f3022f = null;
        }
        if (this.f3001L != null) {
            this.f3012W.mo3623g(this.f3023g);
            this.f3023g = null;
        }
        this.f2999J = false;
        mo3265b1(bundle);
        if (!this.f2999J) {
            throw new C0985n0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f3001L != null) {
            this.f3012W.mo3620a(C1035g.C1037b.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo3216I() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3053d;
    }

    /* renamed from: I0 */
    public void mo3217I0() {
        this.f2999J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public void mo3218I1(int i, int i2, int i3, int i4) {
        if (this.f3004O != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            m3516r().f3052c = i;
            m3516r().f3053d = i2;
            m3516r().f3054e = i3;
            m3516r().f3055f = i4;
        }
    }

    /* renamed from: J0 */
    public void mo3219J0() {
        this.f2999J = true;
    }

    /* renamed from: J1 */
    public void mo3220J1(Bundle bundle) {
        if (this.f3039w == null || !mo3307t0()) {
            this.f3026j = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* renamed from: K */
    public Object mo3221K() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3061l;
    }

    /* renamed from: K0 */
    public LayoutInflater mo3222K0(Bundle bundle) {
        return mo3239Q(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public void mo3223K1(View view) {
        m3516r().f3068s = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C0507n mo3224L() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        return null;
    }

    /* renamed from: L0 */
    public void mo3225L0(boolean z) {
    }

    @Deprecated
    /* renamed from: L1 */
    public void mo3226L1(boolean z) {
        if (this.f2997H != z) {
            this.f2997H = z;
            if (mo3287n0() && !mo3290o0()) {
                this.f3040x.mo3617q();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public View mo3227M() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3068s;
    }

    @Deprecated
    /* renamed from: M0 */
    public void mo3228M0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2999J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public void mo3229M1(int i) {
        if (this.f3004O != null || i != 0) {
            m3516r();
            this.f3004O.f3056g = i;
        }
    }

    @Deprecated
    /* renamed from: N */
    public final FragmentManager mo3230N() {
        return this.f3039w;
    }

    /* renamed from: N0 */
    public void mo3231N0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2999J = true;
        C0987p<?> pVar = this.f3040x;
        Activity i = pVar == null ? null : pVar.mo3691i();
        if (i != null) {
            this.f2999J = false;
            mo3228M0(i, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo3232N1(boolean z) {
        if (this.f3004O != null) {
            m3516r().f3051b = z;
        }
    }

    /* renamed from: O */
    public final Object mo3233O() {
        C0987p<?> pVar = this.f3040x;
        if (pVar == null) {
            return null;
        }
        return pVar.mo3615n();
    }

    /* renamed from: O0 */
    public void mo3234O0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void mo3235O1(float f) {
        m3516r().f3067r = f;
    }

    /* renamed from: P */
    public final LayoutInflater mo3236P() {
        LayoutInflater layoutInflater = this.f3007R;
        return layoutInflater == null ? mo3286m1((Bundle) null) : layoutInflater;
    }

    @Deprecated
    /* renamed from: P0 */
    public boolean mo3237P0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public void mo3238P1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m3516r();
        C0894f fVar = this.f3004O;
        fVar.f3057h = arrayList;
        fVar.f3058i = arrayList2;
    }

    @Deprecated
    /* renamed from: Q */
    public LayoutInflater mo3239Q(Bundle bundle) {
        C0987p<?> pVar = this.f3040x;
        if (pVar != null) {
            LayoutInflater o = pVar.mo3616o();
            C0704g.m2815a(o, this.f3041y.mo3402v0());
            return o;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    /* renamed from: Q0 */
    public void mo3240Q0(Menu menu) {
    }

    @Deprecated
    /* renamed from: Q1 */
    public void mo3241Q1(Fragment fragment, int i) {
        if (fragment != null) {
            C1285d.m5928k(this, fragment, i);
        }
        FragmentManager fragmentManager = this.f3039w;
        FragmentManager fragmentManager2 = fragment != null ? fragment.f3039w : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.m3513h0(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.f3028l = null;
            } else if (this.f3039w == null || fragment.f3039w == null) {
                this.f3028l = null;
                this.f3027k = fragment;
                this.f3029m = i;
                return;
            } else {
                this.f3028l = fragment.f3025i;
            }
            this.f3027k = null;
            this.f3029m = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    /* renamed from: R0 */
    public void mo3242R0() {
        this.f2999J = true;
    }

    /* renamed from: R1 */
    public void mo3243R1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo3246S1(intent, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public int mo3244S() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3056g;
    }

    /* renamed from: S0 */
    public void mo3245S0(boolean z) {
    }

    /* renamed from: S1 */
    public void mo3246S1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0987p<?> pVar = this.f3040x;
        if (pVar != null) {
            pVar.mo3694p(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: T */
    public final Fragment mo3247T() {
        return this.f3042z;
    }

    @Deprecated
    /* renamed from: T0 */
    public void mo3248T0(Menu menu) {
    }

    /* renamed from: T1 */
    public void mo3249T1() {
        if (this.f3004O != null && m3516r().f3069t) {
            if (this.f3040x == null) {
                m3516r().f3069t = false;
            } else if (Looper.myLooper() != this.f3040x.mo3693k().getLooper()) {
                this.f3040x.mo3693k().postAtFrontOfQueue(new C0891c());
            } else {
                mo3289o(true);
            }
        }
    }

    /* renamed from: U */
    public final FragmentManager mo3250U() {
        FragmentManager fragmentManager = this.f3039w;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: U0 */
    public void mo3251U0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo3252V() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return false;
        }
        return fVar.f3051b;
    }

    @Deprecated
    /* renamed from: V0 */
    public void mo3253V0(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public int mo3254W() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3054e;
    }

    /* renamed from: W0 */
    public void mo3255W0() {
        this.f2999J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public int mo3256X() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3055f;
    }

    /* renamed from: X0 */
    public void mo3257X0(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public float mo3258Y() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return 1.0f;
        }
        return fVar.f3067r;
    }

    /* renamed from: Y0 */
    public void mo3259Y0() {
        this.f2999J = true;
    }

    /* renamed from: Z */
    public Object mo3260Z() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f3062m;
        return obj == f2989e0 ? mo3221K() : obj;
    }

    /* renamed from: Z0 */
    public void mo3261Z0() {
        this.f2999J = true;
    }

    /* renamed from: a0 */
    public final Resources mo3262a0() {
        return mo3207D1().getResources();
    }

    /* renamed from: a1 */
    public void mo3263a1(View view, Bundle bundle) {
    }

    /* renamed from: b0 */
    public Object mo3264b0() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f3060k;
        return obj == f2989e0 ? mo3205D() : obj;
    }

    /* renamed from: b1 */
    public void mo3265b1(Bundle bundle) {
        this.f2999J = true;
    }

    /* renamed from: c */
    public C1035g mo252c() {
        return this.f3011V;
    }

    /* renamed from: c0 */
    public Object mo3266c0() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3063n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3267c1(Bundle bundle) {
        this.f3041y.mo3364V0();
        this.f3019d = 3;
        this.f2999J = false;
        mo3312v0(bundle);
        if (this.f2999J) {
            m3511G1();
            this.f3041y.mo3407y();
            return;
        }
        throw new C0985n0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: d0 */
    public Object mo3268d0() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f3064o;
        return obj == f2989e0 ? mo3266c0() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3269d1() {
        Iterator<C0897i> it = this.f3018c0.iterator();
        while (it.hasNext()) {
            it.next().mo3327a();
        }
        this.f3018c0.clear();
        this.f3041y.mo3389m(this.f3040x, mo3295p(), this);
        this.f3019d = 0;
        this.f2999J = false;
        mo3321y0(this.f3040x.mo3692j());
        if (this.f2999J) {
            this.f3039w.mo3346I(this);
            this.f3041y.mo3409z();
            return;
        }
        throw new C0985n0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3057h;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo3270e0() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$f r0 = r1.f3004O
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f3057h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3270e0():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo3271e1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C1587c mo254f() {
        return this.f3015Z.mo5739b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3058i;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo3273f0() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$f r0 = r1.f3004O
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f3058i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3273f0():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public boolean mo3274f1(MenuItem menuItem) {
        if (this.f2993D) {
            return false;
        }
        if (mo3198A0(menuItem)) {
            return true;
        }
        return this.f3041y.mo3334B(menuItem);
    }

    @Deprecated
    /* renamed from: g0 */
    public final Fragment mo3275g0() {
        return m3513h0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3276g1(Bundle bundle) {
        this.f3041y.mo3364V0();
        this.f3019d = 1;
        this.f2999J = false;
        this.f3011V.mo3790a(new C1046k() {
            /* renamed from: g */
            public void mo289g(C1048m mVar, C1035g.C1037b bVar) {
                View view;
                if (bVar == C1035g.C1037b.ON_STOP && (view = Fragment.this.f3001L) != null) {
                    C0895g.m3648a(view);
                }
            }
        });
        this.f3015Z.mo5741d(bundle);
        mo3200B0(bundle);
        this.f3008S = true;
        if (this.f2999J) {
            this.f3011V.mo3795h(C1035g.C1037b.ON_CREATE);
            return;
        }
        throw new C0985n0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public boolean mo3277h1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2993D) {
            return false;
        }
        if (this.f2997H && this.f2998I) {
            z = true;
            mo3208E0(menu, menuInflater);
        }
        return z | this.f3041y.mo3337D(menu, menuInflater);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public View mo3279i0() {
        return this.f3001L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo3280i1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3041y.mo3364V0();
        this.f3037u = true;
        this.f3012W = new C0966j0(this, mo243H());
        View F0 = mo3211F0(layoutInflater, viewGroup, bundle);
        this.f3001L = F0;
        if (F0 != null) {
            this.f3012W.mo3621b();
            C1041h0.m4232a(this.f3001L, this.f3012W);
            C1043i0.m4233a(this.f3001L, this.f3012W);
            C1594f.m6813a(this.f3001L, this.f3012W);
            this.f3013X.mo3744i(this.f3012W);
        } else if (!this.f3012W.mo3622d()) {
            this.f3012W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: j0 */
    public LiveData<C1048m> mo3281j0() {
        return this.f3013X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3282j1() {
        this.f3041y.mo3339E();
        this.f3011V.mo3795h(C1035g.C1037b.ON_DESTROY);
        this.f3019d = 0;
        this.f2999J = false;
        this.f3008S = false;
        mo3213G0();
        if (!this.f2999J) {
            throw new C0985n0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo3283k1() {
        this.f3041y.mo3341F();
        if (this.f3001L != null && this.f3012W.mo252c().mo3791b().mo3794a(C1035g.C1038c.CREATED)) {
            this.f3012W.mo3620a(C1035g.C1037b.ON_DESTROY);
        }
        this.f3019d = 1;
        this.f2999J = false;
        mo3217I0();
        if (this.f2999J) {
            C1074a.m4300b(this).mo3840c();
            this.f3037u = false;
            return;
        }
        throw new C0985n0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo3284l0() {
        m3514k0();
        this.f3009T = this.f3025i;
        this.f3025i = UUID.randomUUID().toString();
        this.f3031o = false;
        this.f3032p = false;
        this.f3034r = false;
        this.f3035s = false;
        this.f3036t = false;
        this.f3038v = 0;
        this.f3039w = null;
        this.f3041y = new C0997x();
        this.f3040x = null;
        this.f2990A = 0;
        this.f2991B = 0;
        this.f2992C = null;
        this.f2993D = false;
        this.f2994E = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3285l1() {
        this.f3019d = -1;
        this.f2999J = false;
        mo3219J0();
        this.f3007R = null;
        if (!this.f2999J) {
            throw new C0985n0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f3041y.mo3344G0()) {
            this.f3041y.mo3339E();
            this.f3041y = new C0997x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public LayoutInflater mo3286m1(Bundle bundle) {
        LayoutInflater K0 = mo3222K0(bundle);
        this.f3007R = K0;
        return K0;
    }

    /* renamed from: n0 */
    public final boolean mo3287n0() {
        return this.f3040x != null && this.f3031o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo3288n1() {
        onLowMemory();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3289o(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0894f fVar = this.f3004O;
        if (fVar != null) {
            fVar.f3069t = false;
        }
        if (this.f3001L != null && (viewGroup = this.f3000K) != null && (fragmentManager = this.f3039w) != null) {
            C0972l0 n = C0972l0.m4042n(viewGroup, fragmentManager);
            n.mo3642p();
            if (z) {
                this.f3040x.mo3693k().post(new C0892d(n));
            } else {
                n.mo3637g();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f3039w;
     */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3290o0() {
        /*
            r2 = this;
            boolean r0 = r2.f2993D
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.FragmentManager r0 = r2.f3039w
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.Fragment r1 = r2.f3042z
            boolean r0 = r0.mo3349K0(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3290o0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo3291o1(boolean z) {
        mo3234O0(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2999J = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3201B1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2999J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0971l mo3295p() {
        return new C0893e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final boolean mo3296p0() {
        return this.f3038v > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public boolean mo3297p1(MenuItem menuItem) {
        if (this.f2993D) {
            return false;
        }
        if (!this.f2997H || !this.f2998I || !mo3237P0(menuItem)) {
            return this.f3041y.mo3348K(menuItem);
        }
        return true;
    }

    /* renamed from: q */
    public void mo3298q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2990A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2991B));
        printWriter.print(" mTag=");
        printWriter.println(this.f2992C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3019d);
        printWriter.print(" mWho=");
        printWriter.print(this.f3025i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3038v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3031o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3032p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3034r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3035s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2993D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2994E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2998I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2997H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2995F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3003N);
        if (this.f3039w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3039w);
        }
        if (this.f3040x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3040x);
        }
        if (this.f3042z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3042z);
        }
        if (this.f3026j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3026j);
        }
        if (this.f3021e != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3021e);
        }
        if (this.f3022f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3022f);
        }
        if (this.f3023g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3023g);
        }
        Fragment h0 = m3513h0(false);
        if (h0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(h0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3029m);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(mo3252V());
        if (mo3202C() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(mo3202C());
        }
        if (mo3216I() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(mo3216I());
        }
        if (mo3254W() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(mo3254W());
        }
        if (mo3256X() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(mo3256X());
        }
        if (this.f3000K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3000K);
        }
        if (this.f3001L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3001L);
        }
        if (mo3320y() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3320y());
        }
        if (mo3199B() != null) {
            C1074a.m4300b(this).mo3839a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3041y + ":");
        FragmentManager fragmentManager = this.f3041y;
        fragmentManager.mo3366X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f3039w;
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3299q0() {
        /*
            r2 = this;
            boolean r0 = r2.f2998I
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.f3039w
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f3042z
            boolean r0 = r0.mo3351L0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3299q0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo3300q1(Menu menu) {
        if (!this.f2993D) {
            if (this.f2997H && this.f2998I) {
                mo3240Q0(menu);
            }
            this.f3041y.mo3350L(menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo3301r0() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return false;
        }
        return fVar.f3069t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo3302r1() {
        this.f3041y.mo3353N();
        if (this.f3001L != null) {
            this.f3012W.mo3620a(C1035g.C1037b.ON_PAUSE);
        }
        this.f3011V.mo3795h(C1035g.C1037b.ON_PAUSE);
        this.f3019d = 6;
        this.f2999J = false;
        mo3242R0();
        if (!this.f2999J) {
            throw new C0985n0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Fragment mo3303s(String str) {
        return str.equals(this.f3025i) ? this : this.f3041y.mo3383j0(str);
    }

    /* renamed from: s0 */
    public final boolean mo3304s0() {
        return this.f3019d >= 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo3305s1(boolean z) {
        mo3245S0(z);
    }

    /* renamed from: t */
    public final C0964j mo3306t() {
        C0987p<?> pVar = this.f3040x;
        if (pVar == null) {
            return null;
        }
        return (C0964j) pVar.mo3691i();
    }

    /* renamed from: t0 */
    public final boolean mo3307t0() {
        FragmentManager fragmentManager = this.f3039w;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo3356O0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public boolean mo3308t1(Menu menu) {
        boolean z = false;
        if (this.f2993D) {
            return false;
        }
        if (this.f2997H && this.f2998I) {
            z = true;
            mo3248T0(menu);
        }
        return z | this.f3041y.mo3357P(menu);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3025i);
        if (this.f2990A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2990A));
        }
        if (this.f2992C != null) {
            sb.append(" tag=");
            sb.append(this.f2992C);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public C1457a mo285u() {
        Application application;
        Context applicationContext = mo3207D1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.m3651H0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + mo3207D1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C1462d dVar = new C1462d();
        if (application != null) {
            dVar.mo5481b(C1021d0.C1022a.f3464e, application);
        }
        dVar.mo5481b(C1069z.f3515a, this);
        dVar.mo5481b(C1069z.f3516b, this);
        if (mo3323z() != null) {
            dVar.mo5481b(C1069z.f3517c, mo3323z());
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo3310u0() {
        this.f3041y.mo3364V0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo3311u1() {
        boolean M0 = this.f3039w.mo3352M0(this);
        Boolean bool = this.f3030n;
        if (bool == null || bool.booleanValue() != M0) {
            this.f3030n = Boolean.valueOf(M0);
            mo3251U0(M0);
            this.f3041y.mo3358Q();
        }
    }

    @Deprecated
    /* renamed from: v0 */
    public void mo3312v0(Bundle bundle) {
        this.f2999J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo3313v1() {
        this.f3041y.mo3364V0();
        this.f3041y.mo3372b0(true);
        this.f3019d = 7;
        this.f2999J = false;
        mo3255W0();
        if (this.f2999J) {
            C1049n nVar = this.f3011V;
            C1035g.C1037b bVar = C1035g.C1037b.ON_RESUME;
            nVar.mo3795h(bVar);
            if (this.f3001L != null) {
                this.f3012W.mo3620a(bVar);
            }
            this.f3041y.mo3359R();
            return;
        }
        throw new C0985n0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: w */
    public boolean mo3314w() {
        Boolean bool;
        C0894f fVar = this.f3004O;
        if (fVar == null || (bool = fVar.f3066q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    /* renamed from: w0 */
    public void mo3315w0(int i, int i2, Intent intent) {
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void mo3316w1(Bundle bundle) {
        mo3257X0(bundle);
        this.f3015Z.mo5742e(bundle);
        Bundle i1 = this.f3041y.m3655P0();
        if (i1 != null) {
            bundle.putParcelable("android:support:fragments", i1);
        }
    }

    /* renamed from: x */
    public boolean mo3317x() {
        Boolean bool;
        C0894f fVar = this.f3004O;
        if (fVar == null || (bool = fVar.f3065p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    /* renamed from: x0 */
    public void mo3318x0(Activity activity) {
        this.f2999J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo3319x1() {
        this.f3041y.mo3364V0();
        this.f3041y.mo3372b0(true);
        this.f3019d = 5;
        this.f2999J = false;
        mo3259Y0();
        if (this.f2999J) {
            C1049n nVar = this.f3011V;
            C1035g.C1037b bVar = C1035g.C1037b.ON_START;
            nVar.mo3795h(bVar);
            if (this.f3001L != null) {
                this.f3012W.mo3620a(bVar);
            }
            this.f3041y.mo3360S();
            return;
        }
        throw new C0985n0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public View mo3320y() {
        C0894f fVar = this.f3004O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3050a;
    }

    /* renamed from: y0 */
    public void mo3321y0(Context context) {
        this.f2999J = true;
        C0987p<?> pVar = this.f3040x;
        Activity i = pVar == null ? null : pVar.mo3691i();
        if (i != null) {
            this.f2999J = false;
            mo3318x0(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo3322y1() {
        this.f3041y.mo3361U();
        if (this.f3001L != null) {
            this.f3012W.mo3620a(C1035g.C1037b.ON_STOP);
        }
        this.f3011V.mo3795h(C1035g.C1037b.ON_STOP);
        this.f3019d = 4;
        this.f2999J = false;
        mo3261Z0();
        if (!this.f2999J) {
            throw new C0985n0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: z */
    public final Bundle mo3323z() {
        return this.f3026j;
    }

    @Deprecated
    /* renamed from: z0 */
    public void mo3324z0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo3325z1() {
        mo3263a1(this.f3001L, this.f3021e);
        this.f3041y.mo3363V();
    }
}
