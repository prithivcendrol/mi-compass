package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p008os.C0578e;
import androidx.core.view.C0727l0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p001a0.C0009b;

/* renamed from: androidx.fragment.app.l0 */
abstract class C0972l0 {

    /* renamed from: a */
    private final ViewGroup f3322a;

    /* renamed from: b */
    final ArrayList<C0977e> f3323b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C0977e> f3324c = new ArrayList<>();

    /* renamed from: d */
    boolean f3325d = false;

    /* renamed from: e */
    boolean f3326e = false;

    /* renamed from: androidx.fragment.app.l0$a */
    class C0973a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0976d f3327d;

        C0973a(C0976d dVar) {
            this.f3327d = dVar;
        }

        public void run() {
            if (C0972l0.this.f3323b.contains(this.f3327d)) {
                this.f3327d.mo3651e().mo3659a(this.f3327d.mo3652f().f3001L);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l0$b */
    class C0974b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0976d f3329d;

        C0974b(C0976d dVar) {
            this.f3329d = dVar;
        }

        public void run() {
            C0972l0.this.f3323b.remove(this.f3329d);
            C0972l0.this.f3324c.remove(this.f3329d);
        }
    }

    /* renamed from: androidx.fragment.app.l0$c */
    static /* synthetic */ class C0975c {

        /* renamed from: a */
        static final /* synthetic */ int[] f3331a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3332b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.l0$e$b[] r0 = androidx.fragment.app.C0972l0.C0977e.C0979b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3332b = r0
                r1 = 1
                androidx.fragment.app.l0$e$b r2 = androidx.fragment.app.C0972l0.C0977e.C0979b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3332b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.l0$e$b r3 = androidx.fragment.app.C0972l0.C0977e.C0979b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3332b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.l0$e$b r4 = androidx.fragment.app.C0972l0.C0977e.C0979b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.l0$e$c[] r3 = androidx.fragment.app.C0972l0.C0977e.C0980c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3331a = r3
                androidx.fragment.app.l0$e$c r4 = androidx.fragment.app.C0972l0.C0977e.C0980c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3331a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.l0$e$c r3 = androidx.fragment.app.C0972l0.C0977e.C0980c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3331a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0972l0.C0977e.C0980c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3331a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0972l0.C0977e.C0980c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0972l0.C0975c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.l0$d */
    private static class C0976d extends C0977e {

        /* renamed from: h */
        private final C0938d0 f3333h;

        C0976d(C0977e.C0980c cVar, C0977e.C0979b bVar, C0938d0 d0Var, C0578e eVar) {
            super(cVar, bVar, d0Var.mo3503k(), eVar);
            this.f3333h = d0Var;
        }

        /* renamed from: c */
        public void mo3646c() {
            super.mo3646c();
            this.f3333h.mo3504m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3647l() {
            if (mo3653g() == C0977e.C0979b.ADDING) {
                Fragment k = this.f3333h.mo3503k();
                View findFocus = k.f3001L.findFocus();
                if (findFocus != null) {
                    k.mo3223K1(findFocus);
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View E1 = mo3652f().mo3209E1();
                if (E1.getParent() == null) {
                    this.f3333h.mo3494b();
                    E1.setAlpha(0.0f);
                }
                if (E1.getAlpha() == 0.0f && E1.getVisibility() == 0) {
                    E1.setVisibility(4);
                }
                E1.setAlpha(k.mo3258Y());
            } else if (mo3653g() == C0977e.C0979b.REMOVING) {
                Fragment k2 = this.f3333h.mo3503k();
                View E12 = k2.mo3209E1();
                if (FragmentManager.m3651H0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + E12.findFocus() + " on view " + E12 + " for Fragment " + k2);
                }
                E12.clearFocus();
            }
        }
    }

    /* renamed from: androidx.fragment.app.l0$e */
    static class C0977e {

        /* renamed from: a */
        private C0980c f3334a;

        /* renamed from: b */
        private C0979b f3335b;

        /* renamed from: c */
        private final Fragment f3336c;

        /* renamed from: d */
        private final List<Runnable> f3337d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0578e> f3338e = new HashSet<>();

        /* renamed from: f */
        private boolean f3339f = false;

        /* renamed from: g */
        private boolean f3340g = false;

        /* renamed from: androidx.fragment.app.l0$e$a */
        class C0978a implements C0578e.C0580b {
            C0978a() {
            }

            public void onCancel() {
                C0977e.this.mo3649b();
            }
        }

        /* renamed from: androidx.fragment.app.l0$e$b */
        enum C0979b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.l0$e$c */
        enum C0980c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static C0980c m4071b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            static C0980c m4072c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m4071b(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo3659a(View view) {
                int i;
                int i2 = C0975c.f3331a[ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (FragmentManager.m3651H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i = 0;
                    } else if (i2 == 3) {
                        if (FragmentManager.m3651H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i = 8;
                    } else if (i2 == 4) {
                        if (FragmentManager.m3651H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        C0977e(C0980c cVar, C0979b bVar, Fragment fragment, C0578e eVar) {
            this.f3334a = cVar;
            this.f3335b = bVar;
            this.f3336c = fragment;
            eVar.mo2637b(new C0978a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3648a(Runnable runnable) {
            this.f3337d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo3649b() {
            if (!mo3654h()) {
                this.f3339f = true;
                if (this.f3338e.isEmpty()) {
                    mo3646c();
                    return;
                }
                Iterator it = new ArrayList(this.f3338e).iterator();
                while (it.hasNext()) {
                    ((C0578e) it.next()).mo2636a();
                }
            }
        }

        /* renamed from: c */
        public void mo3646c() {
            if (!this.f3340g) {
                if (FragmentManager.m3651H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f3340g = true;
                for (Runnable run : this.f3337d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo3650d(C0578e eVar) {
            if (this.f3338e.remove(eVar) && this.f3338e.isEmpty()) {
                mo3646c();
            }
        }

        /* renamed from: e */
        public C0980c mo3651e() {
            return this.f3334a;
        }

        /* renamed from: f */
        public final Fragment mo3652f() {
            return this.f3336c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0979b mo3653g() {
            return this.f3335b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final boolean mo3654h() {
            return this.f3339f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final boolean mo3655i() {
            return this.f3340g;
        }

        /* renamed from: j */
        public final void mo3656j(C0578e eVar) {
            mo3647l();
            this.f3338e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final void mo3657k(C0980c cVar, C0979b bVar) {
            C0979b bVar2;
            int i = C0975c.f3332b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3336c + " mFinalState = " + this.f3334a + " -> REMOVED. mLifecycleImpact  = " + this.f3335b + " to REMOVING.");
                    }
                    this.f3334a = C0980c.REMOVED;
                    bVar2 = C0979b.REMOVING;
                } else if (i == 3 && this.f3334a != C0980c.REMOVED) {
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3336c + " mFinalState = " + this.f3334a + " -> " + cVar + ". ");
                    }
                    this.f3334a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f3334a == C0980c.REMOVED) {
                if (FragmentManager.m3651H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3336c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3335b + " to ADDING.");
                }
                this.f3334a = C0980c.VISIBLE;
                bVar2 = C0979b.ADDING;
            } else {
                return;
            }
            this.f3335b = bVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3647l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f3334a + "} " + "{" + "mLifecycleImpact = " + this.f3335b + "} " + "{" + "mFragment = " + this.f3336c + "}";
        }
    }

    C0972l0(ViewGroup viewGroup) {
        this.f3322a = viewGroup;
    }

    /* renamed from: a */
    private void m4039a(C0977e.C0980c cVar, C0977e.C0979b bVar, C0938d0 d0Var) {
        synchronized (this.f3323b) {
            C0578e eVar = new C0578e();
            C0977e h = m4040h(d0Var.mo3503k());
            if (h != null) {
                h.mo3657k(cVar, bVar);
                return;
            }
            C0976d dVar = new C0976d(cVar, bVar, d0Var, eVar);
            this.f3323b.add(dVar);
            dVar.mo3648a(new C0973a(dVar));
            dVar.mo3648a(new C0974b(dVar));
        }
    }

    /* renamed from: h */
    private C0977e m4040h(Fragment fragment) {
        Iterator<C0977e> it = this.f3323b.iterator();
        while (it.hasNext()) {
            C0977e next = it.next();
            if (next.mo3652f().equals(fragment) && !next.mo3654h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C0977e m4041i(Fragment fragment) {
        Iterator<C0977e> it = this.f3324c.iterator();
        while (it.hasNext()) {
            C0977e next = it.next();
            if (next.mo3652f().equals(fragment) && !next.mo3654h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    static C0972l0 m4042n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m4043o(viewGroup, fragmentManager.mo3410z0());
    }

    /* renamed from: o */
    static C0972l0 m4043o(ViewGroup viewGroup, C0983m0 m0Var) {
        int i = C0009b.f15b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C0972l0) {
            return (C0972l0) tag;
        }
        C0972l0 a = m0Var.mo3413a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m4044q() {
        Iterator<C0977e> it = this.f3323b.iterator();
        while (it.hasNext()) {
            C0977e next = it.next();
            if (next.mo3653g() == C0977e.C0979b.ADDING) {
                next.mo3657k(C0977e.C0980c.m4071b(next.mo3652f().mo3209E1().getVisibility()), C0977e.C0979b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3633b(C0977e.C0980c cVar, C0938d0 d0Var) {
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + d0Var.mo3503k());
        }
        m4039a(cVar, C0977e.C0979b.ADDING, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3634c(C0938d0 d0Var) {
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + d0Var.mo3503k());
        }
        m4039a(C0977e.C0980c.GONE, C0977e.C0979b.NONE, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3635d(C0938d0 d0Var) {
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + d0Var.mo3503k());
        }
        m4039a(C0977e.C0980c.REMOVED, C0977e.C0979b.REMOVING, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3636e(C0938d0 d0Var) {
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + d0Var.mo3503k());
        }
        m4039a(C0977e.C0980c.VISIBLE, C0977e.C0979b.NONE, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo3468f(List<C0977e> list, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3637g() {
        if (!this.f3326e) {
            if (!C0727l0.m2859I(this.f3322a)) {
                mo3638j();
                this.f3325d = false;
                return;
            }
            synchronized (this.f3323b) {
                if (!this.f3323b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3324c);
                    this.f3324c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0977e eVar = (C0977e) it.next();
                        if (FragmentManager.m3651H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.mo3649b();
                        if (!eVar.mo3655i()) {
                            this.f3324c.add(eVar);
                        }
                    }
                    m4044q();
                    ArrayList arrayList2 = new ArrayList(this.f3323b);
                    this.f3323b.clear();
                    this.f3324c.addAll(arrayList2);
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0977e) it2.next()).mo3647l();
                    }
                    mo3468f(arrayList2, this.f3325d);
                    this.f3325d = false;
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3638j() {
        String str;
        String str2;
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean I = C0727l0.m2859I(this.f3322a);
        synchronized (this.f3323b) {
            m4044q();
            Iterator<C0977e> it = this.f3323b.iterator();
            while (it.hasNext()) {
                it.next().mo3647l();
            }
            Iterator it2 = new ArrayList(this.f3324c).iterator();
            while (it2.hasNext()) {
                C0977e eVar = (C0977e) it2.next();
                if (FragmentManager.m3651H0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (I) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3322a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.mo3649b();
            }
            Iterator it3 = new ArrayList(this.f3323b).iterator();
            while (it3.hasNext()) {
                C0977e eVar2 = (C0977e) it3.next();
                if (FragmentManager.m3651H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (I) {
                        str = "";
                    } else {
                        str = "Container " + this.f3322a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.mo3649b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3639k() {
        if (this.f3326e) {
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f3326e = false;
            mo3637g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0977e.C0979b mo3640l(C0938d0 d0Var) {
        C0977e h = m4040h(d0Var.mo3503k());
        C0977e.C0979b g = h != null ? h.mo3653g() : null;
        C0977e i = m4041i(d0Var.mo3503k());
        return (i == null || !(g == null || g == C0977e.C0979b.NONE)) ? g : i.mo3653g();
    }

    /* renamed from: m */
    public ViewGroup mo3641m() {
        return this.f3322a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3642p() {
        synchronized (this.f3323b) {
            m4044q();
            this.f3326e = false;
            int size = this.f3323b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0977e eVar = this.f3323b.get(size);
                C0977e.C0980c c = C0977e.C0980c.m4072c(eVar.mo3652f().f3001L);
                C0977e.C0980c e = eVar.mo3651e();
                C0977e.C0980c cVar = C0977e.C0980c.VISIBLE;
                if (e == cVar && c != cVar) {
                    this.f3326e = eVar.mo3652f().mo3301r0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3643r(boolean z) {
        this.f3325d = z;
    }
}
