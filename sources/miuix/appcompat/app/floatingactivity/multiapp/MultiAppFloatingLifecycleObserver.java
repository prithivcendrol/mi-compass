package miuix.appcompat.app.floatingactivity.multiapp;

import android.view.View;
import android.view.ViewGroup;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.C2118q;
import miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver;
import p030e2.C1531b;
import p030e2.C1532c;

public class MultiAppFloatingLifecycleObserver extends FloatingLifecycleObserver {

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingLifecycleObserver$a */
    class C2087a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C2118q f7692d;

        C2087a(C2118q qVar) {
            this.f7692d = qVar;
        }

        public void run() {
            C2095c B = C2095c.m8415B();
            if (B == null) {
                return;
            }
            if (B.mo7499z(MultiAppFloatingLifecycleObserver.this.mo7447i()) <= 1 && B.mo7484D(MultiAppFloatingLifecycleObserver.this.mo7447i()) <= 1) {
                return;
            }
            if (C1531b.m6615f()) {
                C2118q qVar = this.f7692d;
                C1531b.m6618i(qVar, qVar.mo7562G());
            } else if (this.f7692d.mo7562G()) {
                this.f7692d.mo5648I();
                B.mo7489R(MultiAppFloatingLifecycleObserver.this.mo7447i(), MultiAppFloatingLifecycleObserver.this.mo7446h());
            }
        }
    }

    /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingLifecycleObserver$b */
    class C2088b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f7694d;

        /* renamed from: e */
        final /* synthetic */ View f7695e;

        /* renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingLifecycleObserver$b$a */
        class C2089a extends TransitionListener {
            C2089a() {
            }

            public void onComplete(Object obj) {
                super.onComplete(obj);
                ((ViewGroup) C2088b.this.f7695e.getParent()).getOverlay().remove(C2088b.this.f7694d);
                C2095c B = C2095c.m8415B();
                if (B != null) {
                    B.mo7493b0((View) null);
                }
            }
        }

        C2088b(View view, View view2) {
            this.f7694d = view;
            this.f7695e = view2;
        }

        public void run() {
            View childAt = ((ViewGroup) this.f7694d).getChildAt(0);
            AnimConfig l = C1532c.m6632l(0, (Runnable) null);
            l.addListeners(new C2089a());
            C1532c.m6624d(childAt, l);
        }
    }

    public MultiAppFloatingLifecycleObserver(C2118q qVar) {
        super(qVar);
    }

    /* renamed from: n */
    private void m8403n(C2118q qVar) {
        int h = C1531b.m6617h(qVar);
        boolean z = h >= 0 && !qVar.mo7562G();
        C2095c B = C2095c.m8415B();
        if (B == null) {
            return;
        }
        if (z && h == 0) {
            B.mo7488Q(qVar.getTaskId(), qVar.mo7560E0());
            if (C1531b.m6615f()) {
                C1531b.m6618i(qVar, false);
            } else {
                C1531b.m6611b(qVar);
            }
        } else if (z) {
            B.mo7488Q(qVar.getTaskId(), qVar.mo7560E0());
        }
    }

    /* renamed from: o */
    private void m8404o(C2118q qVar) {
        View C;
        C2095c B = C2095c.m8415B();
        if (B != null && (C = B.mo7483C()) != null) {
            C.post(new C2088b(C, qVar.mo7563G0()));
        }
    }

    public void onCreate() {
        C2118q x;
        C2095c B = C2095c.m8415B();
        if (B != null && (x = B.mo7498x(mo7447i(), mo7446h())) != null) {
            B.mo7490W(mo7447i(), mo7446h(), new C2087a(x));
            m8403n(x);
        }
    }

    public void onDestroy() {
        C2095c B = C2095c.m8415B();
        if (B != null) {
            B.mo7491Y(mo7447i(), mo7446h());
            if (B.mo7499z(mo7447i()) <= 0) {
                B.mo7493b0((View) null);
            }
        }
    }

    public void onPause() {
        C2095c B = C2095c.m8415B();
        if (B != null) {
            B.mo7494h0(mo7447i(), mo7446h(), false);
        }
    }

    public void onResume() {
        C2118q x;
        C2095c B = C2095c.m8415B();
        if (B != null && (x = B.mo7498x(mo7447i(), mo7446h())) != null) {
            B.mo7494h0(mo7447i(), mo7446h(), true);
            B.mo7495r(mo7447i(), mo7446h());
            if (B.mo7485J(mo7447i(), mo7446h()) && !C1531b.m6615f()) {
                x.mo5649p();
                m8404o(x);
            }
        }
    }
}
