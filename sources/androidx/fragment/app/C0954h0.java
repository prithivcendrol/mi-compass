package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p008os.C0578e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.h0 */
class C0954h0 extends C0962i0 {

    /* renamed from: androidx.fragment.app.h0$a */
    class C0955a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3280a;

        C0955a(Rect rect) {
            this.f3280a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3280a;
        }
    }

    /* renamed from: androidx.fragment.app.h0$b */
    class C0956b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3282a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3283b;

        C0956b(View view, ArrayList arrayList) {
            this.f3282a = view;
            this.f3283b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C0960f.m3958b(transition, this);
            this.f3282a.setVisibility(8);
            int size = this.f3283b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3283b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            C0960f.m3958b(transition, this);
            C0960f.m3957a(transition, this);
        }
    }

    /* renamed from: androidx.fragment.app.h0$c */
    class C0957c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3285a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3286b;

        /* renamed from: c */
        final /* synthetic */ Object f3287c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3288d;

        /* renamed from: e */
        final /* synthetic */ Object f3289e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3290f;

        C0957c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3285a = obj;
            this.f3286b = arrayList;
            this.f3287c = obj2;
            this.f3288d = arrayList2;
            this.f3289e = obj3;
            this.f3290f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C0960f.m3958b(transition, this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3285a;
            if (obj != null) {
                C0954h0.this.mo3581w(obj, this.f3286b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3287c;
            if (obj2 != null) {
                C0954h0.this.mo3581w(obj2, this.f3288d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3289e;
            if (obj3 != null) {
                C0954h0.this.mo3581w(obj3, this.f3290f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.h0$d */
    class C0958d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3292a;

        C0958d(Runnable runnable) {
            this.f3292a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3292a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.h0$e */
    class C0959e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3294a;

        C0959e(Rect rect) {
            this.f3294a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3294a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3294a;
        }
    }

    /* renamed from: androidx.fragment.app.h0$f */
    static class C0960f {
        /* renamed from: a */
        static void m3957a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        static void m3958b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    C0954h0() {
    }

    /* renamed from: v */
    private static boolean m3940v(Transition transition) {
        return !C0962i0.m3962i(transition.getTargetIds()) || !C0962i0.m3962i(transition.getTargetNames()) || !C0962i0.m3962i(transition.getTargetTypes());
    }

    /* renamed from: a */
    public void mo3566a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo3567b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3567b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3940v(transition) && C0962i0.m3962i(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3568c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo3569e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public Object mo3570f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo3571j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: k */
    public Object mo3572k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo3573m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0956b(view, arrayList));
    }

    /* renamed from: n */
    public void mo3574n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0957c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo3575o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0959e(rect));
        }
    }

    /* renamed from: p */
    public void mo3576p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3599h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0955a(rect));
        }
    }

    /* renamed from: q */
    public void mo3577q(Fragment fragment, Object obj, C0578e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0958d(runnable));
    }

    /* renamed from: s */
    public void mo3578s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0962i0.m3960d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3567b(transitionSet, arrayList);
    }

    /* renamed from: t */
    public void mo3579t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3581w(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo3580u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void mo3581w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3581w(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m3940v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
