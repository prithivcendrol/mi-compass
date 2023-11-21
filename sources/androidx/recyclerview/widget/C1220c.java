package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0727l0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
public class C1220c extends C1254o {

    /* renamed from: s */
    private static TimeInterpolator f4218s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C1168e0> f4219h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C1168e0> f4220i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1230j> f4221j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1229i> f4222k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C1168e0>> f4223l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1230j>> f4224m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1229i>> f4225n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C1168e0> f4226o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C1168e0> f4227p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C1168e0> f4228q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C1168e0> f4229r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    class C1221a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f4230d;

        C1221a(ArrayList arrayList) {
            this.f4230d = arrayList;
        }

        public void run() {
            Iterator it = this.f4230d.iterator();
            while (it.hasNext()) {
                C1230j jVar = (C1230j) it.next();
                C1220c.this.mo4862S(jVar.f4264a, jVar.f4265b, jVar.f4266c, jVar.f4267d, jVar.f4268e);
            }
            this.f4230d.clear();
            C1220c.this.f4224m.remove(this.f4230d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    class C1222b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f4232d;

        C1222b(ArrayList arrayList) {
            this.f4232d = arrayList;
        }

        public void run() {
            Iterator it = this.f4232d.iterator();
            while (it.hasNext()) {
                C1220c.this.mo4861R((C1229i) it.next());
            }
            this.f4232d.clear();
            C1220c.this.f4225n.remove(this.f4232d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    class C1223c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f4234d;

        C1223c(ArrayList arrayList) {
            this.f4234d = arrayList;
        }

        public void run() {
            Iterator it = this.f4234d.iterator();
            while (it.hasNext()) {
                C1220c.this.mo4860Q((RecyclerView.C1168e0) it.next());
            }
            this.f4234d.clear();
            C1220c.this.f4223l.remove(this.f4234d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    class C1224d extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1168e0 f4236d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4237e;

        /* renamed from: f */
        final /* synthetic */ View f4238f;

        C1224d(RecyclerView.C1168e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4236d = e0Var;
            this.f4237e = viewPropertyAnimator;
            this.f4238f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4237e.setListener((Animator.AnimatorListener) null);
            this.f4238f.setAlpha(1.0f);
            C1220c.this.mo4950G(this.f4236d);
            C1220c.this.f4228q.remove(this.f4236d);
            C1220c.this.mo4864V();
        }

        public void onAnimationStart(Animator animator) {
            C1220c.this.mo4951H(this.f4236d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    class C1225e extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1168e0 f4240d;

        /* renamed from: e */
        final /* synthetic */ View f4241e;

        /* renamed from: f */
        final /* synthetic */ ViewPropertyAnimator f4242f;

        C1225e(RecyclerView.C1168e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4240d = e0Var;
            this.f4241e = view;
            this.f4242f = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4241e.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4242f.setListener((Animator.AnimatorListener) null);
            C1220c.this.mo4944A(this.f4240d);
            C1220c.this.f4226o.remove(this.f4240d);
            C1220c.this.mo4864V();
        }

        public void onAnimationStart(Animator animator) {
            C1220c.this.mo4945B(this.f4240d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    class C1226f extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1168e0 f4244d;

        /* renamed from: e */
        final /* synthetic */ int f4245e;

        /* renamed from: f */
        final /* synthetic */ View f4246f;

        /* renamed from: g */
        final /* synthetic */ int f4247g;

        /* renamed from: h */
        final /* synthetic */ ViewPropertyAnimator f4248h;

        C1226f(RecyclerView.C1168e0 e0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4244d = e0Var;
            this.f4245e = i;
            this.f4246f = view;
            this.f4247g = i2;
            this.f4248h = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4245e != 0) {
                this.f4246f.setTranslationX(0.0f);
            }
            if (this.f4247g != 0) {
                this.f4246f.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f4248h.setListener((Animator.AnimatorListener) null);
            C1220c.this.mo4948E(this.f4244d);
            C1220c.this.f4227p.remove(this.f4244d);
            C1220c.this.mo4864V();
        }

        public void onAnimationStart(Animator animator) {
            C1220c.this.mo4949F(this.f4244d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    class C1227g extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1229i f4250d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4251e;

        /* renamed from: f */
        final /* synthetic */ View f4252f;

        C1227g(C1229i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4250d = iVar;
            this.f4251e = viewPropertyAnimator;
            this.f4252f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4251e.setListener((Animator.AnimatorListener) null);
            this.f4252f.setAlpha(1.0f);
            this.f4252f.setTranslationX(0.0f);
            this.f4252f.setTranslationY(0.0f);
            C1220c.this.mo4946C(this.f4250d.f4258a, true);
            C1220c.this.f4229r.remove(this.f4250d.f4258a);
            C1220c.this.mo4864V();
        }

        public void onAnimationStart(Animator animator) {
            C1220c.this.mo4947D(this.f4250d.f4258a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    class C1228h extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1229i f4254d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4255e;

        /* renamed from: f */
        final /* synthetic */ View f4256f;

        C1228h(C1229i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4254d = iVar;
            this.f4255e = viewPropertyAnimator;
            this.f4256f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4255e.setListener((Animator.AnimatorListener) null);
            this.f4256f.setAlpha(1.0f);
            this.f4256f.setTranslationX(0.0f);
            this.f4256f.setTranslationY(0.0f);
            C1220c.this.mo4946C(this.f4254d.f4259b, false);
            C1220c.this.f4229r.remove(this.f4254d.f4259b);
            C1220c.this.mo4864V();
        }

        public void onAnimationStart(Animator animator) {
            C1220c.this.mo4947D(this.f4254d.f4259b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    private static class C1229i {

        /* renamed from: a */
        public RecyclerView.C1168e0 f4258a;

        /* renamed from: b */
        public RecyclerView.C1168e0 f4259b;

        /* renamed from: c */
        public int f4260c;

        /* renamed from: d */
        public int f4261d;

        /* renamed from: e */
        public int f4262e;

        /* renamed from: f */
        public int f4263f;

        private C1229i(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2) {
            this.f4258a = e0Var;
            this.f4259b = e0Var2;
        }

        C1229i(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2, int i, int i2, int i3, int i4) {
            this(e0Var, e0Var2);
            this.f4260c = i;
            this.f4261d = i2;
            this.f4262e = i3;
            this.f4263f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4258a + ", newHolder=" + this.f4259b + ", fromX=" + this.f4260c + ", fromY=" + this.f4261d + ", toX=" + this.f4262e + ", toY=" + this.f4263f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    private static class C1230j {

        /* renamed from: a */
        public RecyclerView.C1168e0 f4264a;

        /* renamed from: b */
        public int f4265b;

        /* renamed from: c */
        public int f4266c;

        /* renamed from: d */
        public int f4267d;

        /* renamed from: e */
        public int f4268e;

        C1230j(RecyclerView.C1168e0 e0Var, int i, int i2, int i3, int i4) {
            this.f4264a = e0Var;
            this.f4265b = i;
            this.f4266c = i2;
            this.f4267d = i3;
            this.f4268e = i4;
        }
    }

    /* renamed from: T */
    private void m5573T(RecyclerView.C1168e0 e0Var) {
        View view = e0Var.f4049a;
        ViewPropertyAnimator animate = view.animate();
        this.f4228q.add(e0Var);
        animate.setDuration(mo4530o()).alpha(0.0f).setListener(new C1224d(e0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m5574W(List<C1229i> list, RecyclerView.C1168e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1229i iVar = list.get(size);
            if (m5576Y(iVar, e0Var) && iVar.f4258a == null && iVar.f4259b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m5575X(C1229i iVar) {
        RecyclerView.C1168e0 e0Var = iVar.f4258a;
        if (e0Var != null) {
            m5576Y(iVar, e0Var);
        }
        RecyclerView.C1168e0 e0Var2 = iVar.f4259b;
        if (e0Var2 != null) {
            m5576Y(iVar, e0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m5576Y(C1229i iVar, RecyclerView.C1168e0 e0Var) {
        boolean z = false;
        if (iVar.f4259b == e0Var) {
            iVar.f4259b = null;
        } else if (iVar.f4258a != e0Var) {
            return false;
        } else {
            iVar.f4258a = null;
            z = true;
        }
        e0Var.f4049a.setAlpha(1.0f);
        e0Var.f4049a.setTranslationX(0.0f);
        e0Var.f4049a.setTranslationY(0.0f);
        mo4946C(e0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m5577Z(RecyclerView.C1168e0 e0Var) {
        if (f4218s == null) {
            f4218s = new ValueAnimator().getInterpolator();
        }
        e0Var.f4049a.animate().setInterpolator(f4218s);
        mo4525j(e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo4860Q(RecyclerView.C1168e0 e0Var) {
        View view = e0Var.f4049a;
        ViewPropertyAnimator animate = view.animate();
        this.f4226o.add(e0Var);
        animate.alpha(1.0f).setDuration(mo4527l()).setListener(new C1225e(e0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4861R(C1229i iVar) {
        RecyclerView.C1168e0 e0Var = iVar.f4258a;
        View view = null;
        View view2 = e0Var == null ? null : e0Var.f4049a;
        RecyclerView.C1168e0 e0Var2 = iVar.f4259b;
        if (e0Var2 != null) {
            view = e0Var2.f4049a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo4528m());
            this.f4229r.add(iVar.f4258a);
            duration.translationX((float) (iVar.f4262e - iVar.f4260c));
            duration.translationY((float) (iVar.f4263f - iVar.f4261d));
            duration.alpha(0.0f).setListener(new C1227g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f4229r.add(iVar.f4259b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4528m()).alpha(1.0f).setListener(new C1228h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo4862S(RecyclerView.C1168e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.f4049a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4227p.add(e0Var);
        animate.setDuration(mo4529n()).setListener(new C1226f(e0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo4863U(List<RecyclerView.C1168e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4049a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo4864V() {
        if (!mo4531p()) {
            mo4524i();
        }
    }

    /* renamed from: g */
    public boolean mo4522g(RecyclerView.C1168e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4522g(e0Var, list);
    }

    /* renamed from: j */
    public void mo4525j(RecyclerView.C1168e0 e0Var) {
        View view = e0Var.f4049a;
        view.animate().cancel();
        int size = this.f4221j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4221j.get(size).f4264a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4948E(e0Var);
                this.f4221j.remove(size);
            }
        }
        m5574W(this.f4222k, e0Var);
        if (this.f4219h.remove(e0Var)) {
            view.setAlpha(1.0f);
            mo4950G(e0Var);
        }
        if (this.f4220i.remove(e0Var)) {
            view.setAlpha(1.0f);
            mo4944A(e0Var);
        }
        for (int size2 = this.f4225n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f4225n.get(size2);
            m5574W(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.f4225n.remove(size2);
            }
        }
        for (int size3 = this.f4224m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f4224m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1230j) arrayList2.get(size4)).f4264a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4948E(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4224m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4223l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f4223l.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                mo4944A(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f4223l.remove(size5);
                }
            }
        }
        this.f4228q.remove(e0Var);
        this.f4226o.remove(e0Var);
        this.f4229r.remove(e0Var);
        this.f4227p.remove(e0Var);
        mo4864V();
    }

    /* renamed from: k */
    public void mo4526k() {
        int size = this.f4221j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1230j jVar = this.f4221j.get(size);
            View view = jVar.f4264a.f4049a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4948E(jVar.f4264a);
            this.f4221j.remove(size);
        }
        for (int size2 = this.f4219h.size() - 1; size2 >= 0; size2--) {
            mo4950G(this.f4219h.get(size2));
            this.f4219h.remove(size2);
        }
        int size3 = this.f4220i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1168e0 e0Var = this.f4220i.get(size3);
            e0Var.f4049a.setAlpha(1.0f);
            mo4944A(e0Var);
            this.f4220i.remove(size3);
        }
        for (int size4 = this.f4222k.size() - 1; size4 >= 0; size4--) {
            m5575X(this.f4222k.get(size4));
        }
        this.f4222k.clear();
        if (mo4531p()) {
            for (int size5 = this.f4224m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f4224m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1230j jVar2 = (C1230j) arrayList.get(size6);
                    View view2 = jVar2.f4264a.f4049a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4948E(jVar2.f4264a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4224m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4223l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f4223l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1168e0 e0Var2 = (RecyclerView.C1168e0) arrayList2.get(size8);
                    e0Var2.f4049a.setAlpha(1.0f);
                    mo4944A(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4223l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4225n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f4225n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5575X((C1229i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4225n.remove(arrayList3);
                    }
                }
            }
            mo4863U(this.f4228q);
            mo4863U(this.f4227p);
            mo4863U(this.f4226o);
            mo4863U(this.f4229r);
            mo4524i();
        }
    }

    /* renamed from: p */
    public boolean mo4531p() {
        return !this.f4220i.isEmpty() || !this.f4222k.isEmpty() || !this.f4221j.isEmpty() || !this.f4219h.isEmpty() || !this.f4227p.isEmpty() || !this.f4228q.isEmpty() || !this.f4226o.isEmpty() || !this.f4229r.isEmpty() || !this.f4224m.isEmpty() || !this.f4223l.isEmpty() || !this.f4225n.isEmpty();
    }

    /* renamed from: u */
    public void mo4536u() {
        boolean z = !this.f4219h.isEmpty();
        boolean z2 = !this.f4221j.isEmpty();
        boolean z3 = !this.f4222k.isEmpty();
        boolean z4 = !this.f4220i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1168e0> it = this.f4219h.iterator();
            while (it.hasNext()) {
                m5573T(it.next());
            }
            this.f4219h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4221j);
                this.f4224m.add(arrayList);
                this.f4221j.clear();
                C1221a aVar = new C1221a(arrayList);
                if (z) {
                    C0727l0.m2871U(((C1230j) arrayList.get(0)).f4264a.f4049a, aVar, mo4530o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4222k);
                this.f4225n.add(arrayList2);
                this.f4222k.clear();
                C1222b bVar = new C1222b(arrayList2);
                if (z) {
                    C0727l0.m2871U(((C1229i) arrayList2.get(0)).f4258a.f4049a, bVar, mo4530o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4220i);
                this.f4223l.add(arrayList3);
                this.f4220i.clear();
                C1223c cVar = new C1223c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4530o() : 0;
                    long n = z2 ? mo4529n() : 0;
                    if (z3) {
                        j = mo4528m();
                    }
                    C0727l0.m2871U(((RecyclerView.C1168e0) arrayList3.get(0)).f4049a, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo4865w(RecyclerView.C1168e0 e0Var) {
        m5577Z(e0Var);
        e0Var.f4049a.setAlpha(0.0f);
        this.f4220i.add(e0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo4866x(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            return mo4867y(e0Var, i, i2, i3, i4);
        }
        float translationX = e0Var.f4049a.getTranslationX();
        float translationY = e0Var.f4049a.getTranslationY();
        float alpha = e0Var.f4049a.getAlpha();
        m5577Z(e0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        e0Var.f4049a.setTranslationX(translationX);
        e0Var.f4049a.setTranslationY(translationY);
        e0Var.f4049a.setAlpha(alpha);
        if (e0Var2 != null) {
            m5577Z(e0Var2);
            e0Var2.f4049a.setTranslationX((float) (-i5));
            e0Var2.f4049a.setTranslationY((float) (-i6));
            e0Var2.f4049a.setAlpha(0.0f);
        }
        this.f4222k.add(new C1229i(e0Var, e0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo4867y(RecyclerView.C1168e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.f4049a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.f4049a.getTranslationY());
        m5577Z(e0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4948E(e0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f4221j.add(new C1230j(e0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo4868z(RecyclerView.C1168e0 e0Var) {
        m5577Z(e0Var);
        this.f4219h.add(e0Var);
        return true;
    }
}
