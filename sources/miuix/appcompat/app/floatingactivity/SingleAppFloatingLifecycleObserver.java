package miuix.appcompat.app.floatingactivity;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.C2118q;
import p030e2.C1531b;
import p030e2.C1532c;
import p030e2.C1540i;

public class SingleAppFloatingLifecycleObserver extends FloatingLifecycleObserver {

    /* renamed from: miuix.appcompat.app.floatingactivity.SingleAppFloatingLifecycleObserver$a */
    class C2082a extends TransitionListener {

        /* renamed from: a */
        WeakReference<C2118q> f7675a;

        C2082a(C2118q qVar) {
            this.f7675a = new WeakReference<>(qVar);
        }

        public void onComplete(Object obj) {
            C2083a o;
            View p;
            super.onComplete(obj);
            C2118q qVar = this.f7675a.get();
            if (qVar != null && !qVar.isDestroyed() && (o = C2083a.m8357o()) != null && (p = o.mo7460p()) != null) {
                ((ViewGroup) qVar.mo7563G0().getParent()).getOverlay().remove(p);
            }
        }
    }

    public SingleAppFloatingLifecycleObserver(C2118q qVar) {
        super(qVar);
    }

    /* renamed from: k */
    private void m8340k(C2118q qVar) {
        C2083a o = C2083a.m8357o();
        if (C1531b.m6617h(qVar) >= 0 && !qVar.mo7562G() && o != null) {
            o.mo7452A(qVar);
            C1531b.m6618i(qVar, false);
        }
    }

    /* renamed from: l */
    private void m8341l(C2118q qVar) {
        C2083a o;
        View p;
        if (!C1531b.m6615f() && (o = C2083a.m8357o()) != null && (p = o.mo7460p()) != null) {
            p.post(new C1540i(this, p, qVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m8342m(View view, C2118q qVar) {
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt != null) {
            AnimConfig l = C1532c.m6632l(0, (Runnable) null);
            l.addListeners(new C2082a(qVar));
            C1532c.m6624d(childAt, l);
        }
    }

    /* renamed from: n */
    private void m8343n(C2118q qVar) {
        ArrayList<C2118q> n;
        int m;
        C2118q qVar2;
        C2083a o = C2083a.m8357o();
        if (o != null && (n = o.mo7459n(qVar.getTaskId())) != null && (m = o.mo7458m(qVar) + 1) < n.size() && (qVar2 = n.get(m)) != null && qVar2.isFinishing()) {
            m8341l(qVar);
        }
    }

    public void onCreate() {
        C2118q l;
        C2083a o = C2083a.m8357o();
        if (o != null && (l = o.mo7457l(mo7446h(), mo7447i())) != null) {
            if (o.mo7461r(l) == null) {
                m8340k(l);
            } else if (!l.mo7562G()) {
                o.mo7452A(l);
                C1531b.m6618i(l, false);
            } else if (!o.mo7462y(l)) {
                o.mo7452A(l);
                C1531b.m6619j(l);
            }
        }
    }

    public void onDestroy() {
        C2083a o = C2083a.m8357o();
        if (o != null) {
            o.mo7453D(mo7446h(), mo7447i());
        }
    }

    public void onResume() {
        C2118q l;
        C2083a o = C2083a.m8357o();
        if (o != null && (l = o.mo7457l(mo7446h(), mo7447i())) != null && l.mo7562G()) {
            if (o.mo7461r(l) != null) {
                l.mo7568K0();
            }
            m8343n(l);
        }
    }
}
