package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.p008os.C0578e;
import androidx.core.util.C0623f;
import androidx.core.view.C0714i0;
import androidx.core.view.C0727l0;
import androidx.core.view.C0795y1;
import androidx.fragment.app.C0967k;
import androidx.fragment.app.C0972l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p063k.C1761a;

/* renamed from: androidx.fragment.app.d */
class C0923d extends C0972l0 {

    /* renamed from: androidx.fragment.app.d$a */
    static /* synthetic */ class C0924a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.l0$e$c[] r0 = androidx.fragment.app.C0972l0.C0977e.C0980c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3167a = r0
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0972l0.C0977e.C0980c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3167a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0972l0.C0977e.C0980c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3167a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0972l0.C0977e.C0980c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3167a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0972l0.C0977e.C0980c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0923d.C0924a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class C0925b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ List f3168d;

        /* renamed from: e */
        final /* synthetic */ C0972l0.C0977e f3169e;

        C0925b(List list, C0972l0.C0977e eVar) {
            this.f3168d = list;
            this.f3169e = eVar;
        }

        public void run() {
            if (this.f3168d.contains(this.f3169e)) {
                this.f3168d.remove(this.f3169e);
                C0923d.this.mo3469s(this.f3169e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class C0926c extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ ViewGroup f3171d;

        /* renamed from: e */
        final /* synthetic */ View f3172e;

        /* renamed from: f */
        final /* synthetic */ boolean f3173f;

        /* renamed from: g */
        final /* synthetic */ C0972l0.C0977e f3174g;

        /* renamed from: h */
        final /* synthetic */ C0935k f3175h;

        C0926c(ViewGroup viewGroup, View view, boolean z, C0972l0.C0977e eVar, C0935k kVar) {
            this.f3171d = viewGroup;
            this.f3172e = view;
            this.f3173f = z;
            this.f3174g = eVar;
            this.f3175h = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3171d.endViewTransition(this.f3172e);
            if (this.f3173f) {
                this.f3174g.mo3651e().mo3659a(this.f3172e);
            }
            this.f3175h.mo3484a();
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3174g + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    class C0927d implements C0578e.C0580b {

        /* renamed from: a */
        final /* synthetic */ Animator f3177a;

        /* renamed from: b */
        final /* synthetic */ C0972l0.C0977e f3178b;

        C0927d(Animator animator, C0972l0.C0977e eVar) {
            this.f3177a = animator;
            this.f3178b = eVar;
        }

        public void onCancel() {
            this.f3177a.end();
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3178b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class C0928e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C0972l0.C0977e f3180a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3181b;

        /* renamed from: c */
        final /* synthetic */ View f3182c;

        /* renamed from: d */
        final /* synthetic */ C0935k f3183d;

        /* renamed from: androidx.fragment.app.d$e$a */
        class C0929a implements Runnable {
            C0929a() {
            }

            public void run() {
                C0928e eVar = C0928e.this;
                eVar.f3181b.endViewTransition(eVar.f3182c);
                C0928e.this.f3183d.mo3484a();
            }
        }

        C0928e(C0972l0.C0977e eVar, ViewGroup viewGroup, View view, C0935k kVar) {
            this.f3180a = eVar;
            this.f3181b = viewGroup;
            this.f3182c = view;
            this.f3183d = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3181b.post(new C0929a());
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3180a + " has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3180a + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    class C0930f implements C0578e.C0580b {

        /* renamed from: a */
        final /* synthetic */ View f3186a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3187b;

        /* renamed from: c */
        final /* synthetic */ C0935k f3188c;

        /* renamed from: d */
        final /* synthetic */ C0972l0.C0977e f3189d;

        C0930f(View view, ViewGroup viewGroup, C0935k kVar, C0972l0.C0977e eVar) {
            this.f3186a = view;
            this.f3187b = viewGroup;
            this.f3188c = kVar;
            this.f3189d = eVar;
        }

        public void onCancel() {
            this.f3186a.clearAnimation();
            this.f3187b.endViewTransition(this.f3186a);
            this.f3188c.mo3484a();
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3189d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    class C0931g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0972l0.C0977e f3191d;

        /* renamed from: e */
        final /* synthetic */ C0972l0.C0977e f3192e;

        /* renamed from: f */
        final /* synthetic */ boolean f3193f;

        /* renamed from: g */
        final /* synthetic */ C1761a f3194g;

        C0931g(C0972l0.C0977e eVar, C0972l0.C0977e eVar2, boolean z, C1761a aVar) {
            this.f3191d = eVar;
            this.f3192e = eVar2;
            this.f3193f = z;
            this.f3194g = aVar;
        }

        public void run() {
            C0952g0.m3936a(this.f3191d.mo3652f(), this.f3192e.mo3652f(), this.f3193f, this.f3194g, false);
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    class C0932h implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0962i0 f3196d;

        /* renamed from: e */
        final /* synthetic */ View f3197e;

        /* renamed from: f */
        final /* synthetic */ Rect f3198f;

        C0932h(C0962i0 i0Var, View view, Rect rect) {
            this.f3196d = i0Var;
            this.f3197e = view;
            this.f3198f = rect;
        }

        public void run() {
            this.f3196d.mo3599h(this.f3197e, this.f3198f);
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    class C0933i implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f3200d;

        C0933i(ArrayList arrayList) {
            this.f3200d = arrayList;
        }

        public void run() {
            C0952g0.m3939d(this.f3200d, 4);
        }
    }

    /* renamed from: androidx.fragment.app.d$j */
    class C0934j implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0937m f3202d;

        /* renamed from: e */
        final /* synthetic */ C0972l0.C0977e f3203e;

        C0934j(C0937m mVar, C0972l0.C0977e eVar) {
            this.f3202d = mVar;
            this.f3203e = eVar;
        }

        public void run() {
            this.f3202d.mo3484a();
            if (FragmentManager.m3651H0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f3203e + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$k */
    private static class C0935k extends C0936l {

        /* renamed from: c */
        private boolean f3205c;

        /* renamed from: d */
        private boolean f3206d = false;

        /* renamed from: e */
        private C0967k.C0968a f3207e;

        C0935k(C0972l0.C0977e eVar, C0578e eVar2, boolean z) {
            super(eVar, eVar2);
            this.f3205c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0967k.C0968a mo3483e(Context context) {
            if (this.f3206d) {
                return this.f3207e;
            }
            C0967k.C0968a b = C0967k.m4032b(context, mo3485b().mo3652f(), mo3485b().mo3651e() == C0972l0.C0977e.C0980c.VISIBLE, this.f3205c);
            this.f3207e = b;
            this.f3206d = true;
            return b;
        }
    }

    /* renamed from: androidx.fragment.app.d$l */
    private static class C0936l {

        /* renamed from: a */
        private final C0972l0.C0977e f3208a;

        /* renamed from: b */
        private final C0578e f3209b;

        C0936l(C0972l0.C0977e eVar, C0578e eVar2) {
            this.f3208a = eVar;
            this.f3209b = eVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3484a() {
            this.f3208a.mo3650d(this.f3209b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0972l0.C0977e mo3485b() {
            return this.f3208a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0578e mo3486c() {
            return this.f3209b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.C0972l0.C0977e.C0980c.VISIBLE;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3487d() {
            /*
                r3 = this;
                androidx.fragment.app.l0$e r0 = r3.f3208a
                androidx.fragment.app.Fragment r0 = r0.mo3652f()
                android.view.View r0 = r0.f3001L
                androidx.fragment.app.l0$e$c r0 = androidx.fragment.app.C0972l0.C0977e.C0980c.m4072c(r0)
                androidx.fragment.app.l0$e r1 = r3.f3208a
                androidx.fragment.app.l0$e$c r1 = r1.mo3651e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.l0$e$c r2 = androidx.fragment.app.C0972l0.C0977e.C0980c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0923d.C0936l.mo3487d():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.d$m */
    private static class C0937m extends C0936l {

        /* renamed from: c */
        private final Object f3210c;

        /* renamed from: d */
        private final boolean f3211d;

        /* renamed from: e */
        private final Object f3212e;

        C0937m(C0972l0.C0977e eVar, C0578e eVar2, boolean z, boolean z2) {
            super(eVar, eVar2);
            boolean z3;
            Object obj;
            if (eVar.mo3651e() == C0972l0.C0977e.C0980c.VISIBLE) {
                Fragment f = eVar.mo3652f();
                this.f3210c = z ? f.mo3260Z() : f.mo3205D();
                Fragment f2 = eVar.mo3652f();
                z3 = z ? f2.mo3317x() : f2.mo3314w();
            } else {
                Fragment f3 = eVar.mo3652f();
                this.f3210c = z ? f3.mo3264b0() : f3.mo3221K();
                z3 = true;
            }
            this.f3211d = z3;
            if (z2) {
                Fragment f4 = eVar.mo3652f();
                obj = z ? f4.mo3268d0() : f4.mo3266c0();
            } else {
                obj = null;
            }
            this.f3212e = obj;
        }

        /* renamed from: f */
        private C0962i0 m3835f(Object obj) {
            if (obj == null) {
                return null;
            }
            C0962i0 i0Var = C0952g0.f3277a;
            if (i0Var != null && i0Var.mo3569e(obj)) {
                return i0Var;
            }
            C0962i0 i0Var2 = C0952g0.f3278b;
            if (i0Var2 != null && i0Var2.mo3569e(obj)) {
                return i0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo3485b().mo3652f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0962i0 mo3488e() {
            C0962i0 f = m3835f(this.f3210c);
            C0962i0 f2 = m3835f(this.f3212e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo3485b().mo3652f() + " returned Transition " + this.f3210c + " which uses a different Transition  type than its shared element transition " + this.f3212e);
        }

        /* renamed from: g */
        public Object mo3489g() {
            return this.f3212e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object mo3490h() {
            return this.f3210c;
        }

        /* renamed from: i */
        public boolean mo3491i() {
            return this.f3212e != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3492j() {
            return this.f3211d;
        }
    }

    C0923d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m3822w(List<C0935k> list, List<C0972l0.C0977e> list2, boolean z, Map<C0972l0.C0977e, Boolean> map) {
        int i;
        boolean z2;
        int i2;
        StringBuilder sb;
        String str;
        C0967k.C0968a e;
        C0972l0.C0977e eVar;
        ViewGroup m = mo3641m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<C0935k> it = list.iterator();
        boolean z3 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C0935k next = it.next();
            if (!next.mo3487d() && (e = next.mo3483e(context)) != null) {
                Animator animator = e.f3314b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    C0972l0.C0977e b = next.mo3485b();
                    Fragment f = b.mo3652f();
                    if (Boolean.TRUE.equals(map.get(b))) {
                        if (FragmentManager.m3651H0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                        }
                        next.mo3484a();
                    } else {
                        boolean z4 = b.mo3651e() == C0972l0.C0977e.C0980c.GONE;
                        List<C0972l0.C0977e> list3 = list2;
                        if (z4) {
                            list3.remove(b);
                        }
                        View view = f.f3001L;
                        m.startViewTransition(view);
                        C0926c cVar = r0;
                        View view2 = view;
                        C0972l0.C0977e eVar2 = b;
                        Animator animator2 = animator;
                        C0935k kVar = next;
                        C0926c cVar2 = new C0926c(m, view2, z4, eVar2, kVar);
                        animator2.addListener(cVar2);
                        animator2.setTarget(view2);
                        animator2.start();
                        if (FragmentManager.m3651H0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Animator from operation ");
                            eVar = eVar2;
                            sb2.append(eVar);
                            sb2.append(" has started.");
                            Log.v("FragmentManager", sb2.toString());
                        } else {
                            eVar = eVar2;
                        }
                        kVar.mo3486c().mo2637b(new C0927d(animator2, eVar));
                        z3 = true;
                    }
                }
            } else {
                next.mo3484a();
            }
            Map<C0972l0.C0977e, Boolean> map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0935k kVar2 = (C0935k) it2.next();
            C0972l0.C0977e b2 = kVar2.mo3485b();
            Fragment f2 = b2.mo3652f();
            if (z) {
                if (FragmentManager.m3651H0(i)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar2.mo3484a();
            } else if (z3) {
                if (FragmentManager.m3651H0(i)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar2.mo3484a();
            } else {
                View view3 = f2.f3001L;
                Animation animation = (Animation) C0623f.m2495f(((C0967k.C0968a) C0623f.m2495f(kVar2.mo3483e(context))).f3313a);
                if (b2.mo3651e() != C0972l0.C0977e.C0980c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.mo3484a();
                    z2 = z3;
                    i2 = i;
                } else {
                    m.startViewTransition(view3);
                    C0928e eVar3 = r0;
                    z2 = z3;
                    C0967k.C0969b bVar = new C0967k.C0969b(animation, m, view3);
                    C0928e eVar4 = new C0928e(b2, m, view3, kVar2);
                    bVar.setAnimationListener(eVar3);
                    view3.startAnimation(bVar);
                    i2 = 2;
                    if (FragmentManager.m3651H0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b2 + " has started.");
                    }
                }
                C0578e c = kVar2.mo3486c();
                C0935k kVar3 = kVar2;
                C0930f fVar = r0;
                C0930f fVar2 = new C0930f(view3, m, kVar3, b2);
                c.mo2637b(fVar);
                i = i2;
                z3 = z2;
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar2.mo3484a();
        }
    }

    /* renamed from: x */
    private Map<C0972l0.C0977e, Boolean> m3823x(List<C0937m> list, List<C0972l0.C0977e> list2, boolean z, C0972l0.C0977e eVar, C0972l0.C0977e eVar2) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        String str3;
        View view2;
        Object obj;
        HashMap hashMap;
        Object obj2;
        Object obj3;
        C1761a aVar;
        HashMap hashMap2;
        C0972l0.C0977e eVar3;
        C0962i0 i0Var;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        C0972l0.C0977e eVar4;
        ArrayList arrayList4;
        View view4;
        boolean z2 = z;
        C0972l0.C0977e eVar5 = eVar;
        C0972l0.C0977e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        C0962i0 i0Var2 = null;
        for (C0937m next : list) {
            if (!next.mo3487d()) {
                C0962i0 e = next.mo3488e();
                if (i0Var2 == null) {
                    i0Var2 = e;
                } else if (!(e == null || i0Var2 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo3485b().mo3652f() + " returned Transition " + next.mo3490h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (i0Var2 == null) {
            for (C0937m next2 : list) {
                hashMap3.put(next2.mo3485b(), Boolean.FALSE);
                next2.mo3484a();
            }
            return hashMap3;
        }
        View view5 = new View(mo3641m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1761a aVar2 = new C1761a();
        Iterator<C0937m> it = list.iterator();
        Object obj4 = null;
        View view6 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C0937m next3 = it.next();
            if (!next3.mo3491i() || eVar5 == null || eVar6 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar4 = eVar5;
                arrayList3 = arrayList5;
                rect = rect2;
                i0Var = i0Var2;
                hashMap2 = hashMap3;
                View view7 = view5;
                eVar3 = eVar6;
                view3 = view7;
                view6 = view6;
            } else {
                Object u = i0Var2.mo3580u(i0Var2.mo3570f(next3.mo3489g()));
                ArrayList<String> e0 = eVar2.mo3652f().mo3270e0();
                ArrayList<String> e02 = eVar.mo3652f().mo3270e0();
                Object obj5 = u;
                ArrayList<String> f0 = eVar.mo3652f().mo3273f0();
                View view8 = view6;
                int i = 0;
                while (i < f0.size()) {
                    int indexOf = e0.indexOf(f0.get(i));
                    ArrayList<String> arrayList7 = f0;
                    if (indexOf != -1) {
                        e0.set(indexOf, e02.get(i));
                    }
                    i++;
                    f0 = arrayList7;
                }
                ArrayList<String> f02 = eVar2.mo3652f().mo3273f0();
                Fragment f = eVar.mo3652f();
                if (!z2) {
                    f.mo3224L();
                    eVar2.mo3652f().mo3210F();
                } else {
                    f.mo3210F();
                    eVar2.mo3652f().mo3224L();
                }
                int i2 = 0;
                for (int size = e0.size(); i2 < size; size = size) {
                    aVar2.put(e0.get(i2), f02.get(i2));
                    i2++;
                }
                if (FragmentManager.m3651H0(2)) {
                    Log.v(str, ">>> entering view names <<<");
                    Iterator<String> it2 = f02.iterator();
                    while (it2.hasNext()) {
                        Iterator<String> it3 = it2;
                        Log.v(str, "Name: " + it2.next());
                        it2 = it3;
                    }
                    Log.v(str, ">>> exiting view names <<<");
                    Iterator<String> it4 = e0.iterator();
                    while (it4.hasNext()) {
                        Iterator<String> it5 = it4;
                        Log.v(str, "Name: " + it4.next());
                        it4 = it5;
                    }
                }
                C1761a aVar3 = new C1761a();
                mo3471u(aVar3, eVar.mo3652f().f3001L);
                aVar3.mo6061q(e0);
                aVar2.mo6061q(aVar3.keySet());
                C1761a aVar4 = new C1761a();
                mo3471u(aVar4, eVar2.mo3652f().f3001L);
                aVar4.mo6061q(f02);
                aVar4.mo6061q(aVar2.values());
                C0952g0.m3938c(aVar2, aVar4);
                mo3472v(aVar3, aVar2.keySet());
                mo3472v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar4 = eVar5;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    i0Var = i0Var2;
                    view6 = view8;
                    obj4 = null;
                    eVar3 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    C0952g0.m3936a(eVar2.mo3652f(), eVar.mo3652f(), z2, aVar3, true);
                    ArrayList<String> arrayList8 = e0;
                    C0931g gVar = r0;
                    Object obj6 = obj5;
                    HashMap hashMap4 = hashMap3;
                    View view9 = view8;
                    ViewGroup m = mo3641m();
                    C1761a aVar5 = aVar4;
                    View view10 = view5;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    C0931g gVar2 = new C0931g(eVar2, eVar, z, aVar5);
                    C0714i0.m2834a(m, gVar);
                    arrayList5.addAll(aVar3.values());
                    if (!arrayList8.isEmpty()) {
                        View view11 = (View) aVar3.get(arrayList8.get(0));
                        i0Var2.mo3576p(obj6, view11);
                        view6 = view11;
                    } else {
                        view6 = view9;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!f02.isEmpty()) {
                        View view12 = (View) aVar5.get(f02.get(0));
                        if (view12 != null) {
                            C0714i0.m2834a(mo3641m(), new C0932h(i0Var2, view12, rect2));
                            view4 = view10;
                            z3 = true;
                            i0Var2.mo3578s(obj6, view4, arrayList5);
                            arrayList3 = arrayList5;
                            rect = rect2;
                            view3 = view4;
                            i0Var = i0Var2;
                            i0Var2.mo3574n(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                            Boolean bool = Boolean.TRUE;
                            eVar4 = eVar;
                            hashMap2 = hashMap4;
                            hashMap2.put(eVar4, bool);
                            eVar3 = eVar2;
                            hashMap2.put(eVar3, bool);
                            obj4 = obj6;
                        }
                    }
                    view4 = view10;
                    i0Var2.mo3578s(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    i0Var = i0Var2;
                    i0Var2.mo3574n(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool2 = Boolean.TRUE;
                    eVar4 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar4, bool2);
                    eVar3 = eVar2;
                    hashMap2.put(eVar3, bool2);
                    obj4 = obj6;
                }
            }
            eVar5 = eVar4;
            arrayList5 = arrayList3;
            rect2 = rect;
            hashMap3 = hashMap2;
            aVar2 = aVar;
            z2 = z;
            arrayList6 = arrayList4;
            i0Var2 = i0Var;
            C0972l0.C0977e eVar7 = eVar3;
            view5 = view3;
            eVar6 = eVar7;
        }
        View view13 = view6;
        C1761a aVar6 = aVar2;
        ArrayList arrayList10 = arrayList6;
        C0972l0.C0977e eVar8 = eVar5;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        C0962i0 i0Var3 = i0Var2;
        HashMap hashMap5 = hashMap3;
        View view14 = view5;
        C0972l0.C0977e eVar9 = eVar6;
        View view15 = view14;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (C0937m next4 : list) {
            if (next4.mo3487d()) {
                hashMap5.put(next4.mo3485b(), Boolean.FALSE);
                next4.mo3484a();
            } else {
                Object f2 = i0Var3.mo3570f(next4.mo3490h());
                C0972l0.C0977e b = next4.mo3485b();
                boolean z4 = obj4 != null && (b == eVar8 || b == eVar9);
                if (f2 == null) {
                    if (!z4) {
                        hashMap5.put(b, Boolean.FALSE);
                        next4.mo3484a();
                    }
                    arrayList = arrayList10;
                    str3 = str;
                    arrayList2 = arrayList11;
                    view = view15;
                    obj = obj7;
                    hashMap = hashMap5;
                    view2 = view13;
                    List<C0972l0.C0977e> list3 = list2;
                } else {
                    str3 = str;
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    mo3470t(arrayList13, b.mo3652f().f3001L);
                    if (z4) {
                        if (b == eVar8) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        i0Var3.mo3566a(f2, view15);
                        List<C0972l0.C0977e> list4 = list2;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view15;
                        obj3 = obj8;
                        hashMap = hashMap5;
                        obj2 = obj9;
                    } else {
                        i0Var3.mo3567b(f2, arrayList13);
                        view = view15;
                        obj2 = obj9;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        C0972l0.C0977e eVar10 = eVar9;
                        hashMap = hashMap5;
                        i0Var3.mo3574n(f2, f2, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (b.mo3651e() == C0972l0.C0977e.C0980c.GONE) {
                            list2.remove(b);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(b.mo3652f().f3001L);
                            i0Var3.mo3573m(f2, b.mo3652f().f3001L, arrayList14);
                            C0714i0.m2834a(mo3641m(), new C0933i(arrayList13));
                        } else {
                            List<C0972l0.C0977e> list5 = list2;
                        }
                    }
                    if (b.mo3651e() == C0972l0.C0977e.C0980c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z3) {
                            i0Var3.mo3575o(f2, rect3);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        i0Var3.mo3576p(f2, view2);
                    }
                    hashMap.put(b, Boolean.TRUE);
                    if (next4.mo3492j()) {
                        obj8 = i0Var3.mo3572k(obj3, f2, (Object) null);
                        obj = obj2;
                    } else {
                        obj = i0Var3.mo3572k(obj2, f2, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj7 = obj;
                view13 = view2;
                str = str3;
                view15 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        String str4 = str;
        ArrayList arrayList16 = arrayList11;
        HashMap hashMap6 = hashMap5;
        Object j = i0Var3.mo3571j(obj8, obj7, obj4);
        if (j == null) {
            return hashMap6;
        }
        for (C0937m next5 : list) {
            if (!next5.mo3487d()) {
                Object h = next5.mo3490h();
                C0972l0.C0977e b2 = next5.mo3485b();
                HashMap hashMap7 = hashMap6;
                boolean z5 = obj4 != null && (b2 == eVar8 || b2 == eVar2);
                if (h == null && !z5) {
                    str2 = str4;
                } else if (!C0727l0.m2860J(mo3641m())) {
                    if (FragmentManager.m3651H0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + mo3641m() + " has not been laid out. Completing operation " + b2);
                    } else {
                        str2 = str4;
                    }
                    next5.mo3484a();
                } else {
                    str2 = str4;
                    i0Var3.mo3577q(next5.mo3485b().mo3652f(), j, next5.mo3486c(), new C0934j(next5, b2));
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (!C0727l0.m2860J(mo3641m())) {
            return hashMap8;
        }
        C0952g0.m3939d(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> l = i0Var3.mo3600l(arrayList17);
        if (FragmentManager.m3651H0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it6 = arrayList16.iterator();
            while (it6.hasNext()) {
                View view16 = (View) it6.next();
                Log.v(str5, "View: " + view16 + " Name: " + C0727l0.m2853C(view16));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it7 = arrayList17.iterator();
            while (it7.hasNext()) {
                View view17 = (View) it7.next();
                Log.v(str5, "View: " + view17 + " Name: " + C0727l0.m2853C(view17));
            }
        }
        i0Var3.mo3568c(mo3641m(), j);
        i0Var3.mo3601r(mo3641m(), arrayList16, arrayList17, l, aVar6);
        C0952g0.m3939d(arrayList12, 0);
        i0Var3.mo3579t(obj4, arrayList16, arrayList17);
        return hashMap8;
    }

    /* renamed from: y */
    private void m3824y(List<C0972l0.C0977e> list) {
        Fragment f = list.get(list.size() - 1).mo3652f();
        for (C0972l0.C0977e next : list) {
            next.mo3652f().f3004O.f3052c = f.f3004O.f3052c;
            next.mo3652f().f3004O.f3053d = f.f3004O.f3053d;
            next.mo3652f().f3004O.f3054e = f.f3004O.f3054e;
            next.mo3652f().f3004O.f3055f = f.f3004O.f3055f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3468f(List<C0972l0.C0977e> list, boolean z) {
        C0972l0.C0977e eVar = null;
        C0972l0.C0977e eVar2 = null;
        for (C0972l0.C0977e next : list) {
            C0972l0.C0977e.C0980c c = C0972l0.C0977e.C0980c.m4072c(next.mo3652f().f3001L);
            int i = C0924a.f3167a[next.mo3651e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == C0972l0.C0977e.C0980c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i == 4 && c != C0972l0.C0977e.C0980c.VISIBLE) {
                eVar2 = next;
            }
        }
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0972l0.C0977e> arrayList3 = new ArrayList<>(list);
        m3824y(list);
        for (C0972l0.C0977e next2 : list) {
            C0578e eVar3 = new C0578e();
            next2.mo3656j(eVar3);
            arrayList.add(new C0935k(next2, eVar3, z));
            C0578e eVar4 = new C0578e();
            next2.mo3656j(eVar4);
            boolean z2 = false;
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new C0937m(next2, eVar4, z, z2));
                    next2.mo3648a(new C0925b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new C0937m(next2, eVar4, z, z2));
                next2.mo3648a(new C0925b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C0937m(next2, eVar4, z, z2));
            next2.mo3648a(new C0925b(arrayList3, next2));
        }
        Map<C0972l0.C0977e, Boolean> x = m3823x(arrayList2, arrayList3, z, eVar, eVar2);
        m3822w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C0972l0.C0977e s : arrayList3) {
            mo3469s(s);
        }
        arrayList3.clear();
        if (FragmentManager.m3651H0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3469s(C0972l0.C0977e eVar) {
        eVar.mo3651e().mo3659a(eVar.mo3652f().f3001L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3470t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C0795y1.m3144a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo3470t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3471u(Map<String, View> map, View view) {
        String C = C0727l0.m2853C(view);
        if (C != null) {
            map.put(C, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo3471u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3472v(C1761a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0727l0.m2853C((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
