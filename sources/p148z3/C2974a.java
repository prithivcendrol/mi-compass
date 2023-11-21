package p148z3;

import android.view.View;
import androidx.recyclerview.widget.C1254o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;

/* renamed from: z3.a */
public abstract class C2974a extends C1254o {

    /* renamed from: s */
    private static final List<RecyclerView.C1168e0> f11300s = new ArrayList();

    /* renamed from: t */
    private static final List<C2978d> f11301t = new ArrayList();

    /* renamed from: u */
    private static final List<C2977c> f11302u = new ArrayList();

    /* renamed from: h */
    private ArrayList<RecyclerView.C1168e0> f11303h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C1168e0> f11304i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C2978d> f11305j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C2977c> f11306k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<ArrayList<RecyclerView.C1168e0>> f11307l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<ArrayList<C2978d>> f11308m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<ArrayList<C2977c>> f11309n = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<RecyclerView.C1168e0> f11310o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<RecyclerView.C1168e0> f11311p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<RecyclerView.C1168e0> f11312q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<RecyclerView.C1168e0> f11313r = new ArrayList<>();

    /* renamed from: z3.a$a */
    class C2975a implements Runnable {
        C2975a() {
        }

        public void run() {
            C2974a.this.m12275Y();
        }
    }

    /* renamed from: z3.a$b */
    class C2976b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ List f11315d;

        C2976b(List list) {
            this.f11315d = list;
        }

        public void run() {
            for (RecyclerView.C1168e0 R : this.f11315d) {
                C2974a.this.mo10281R(R);
            }
        }
    }

    /* renamed from: z3.a$c */
    static class C2977c {

        /* renamed from: a */
        RecyclerView.C1168e0 f11317a;

        /* renamed from: b */
        RecyclerView.C1168e0 f11318b;

        /* renamed from: c */
        int f11319c;

        /* renamed from: d */
        int f11320d;

        /* renamed from: e */
        int f11321e;

        /* renamed from: f */
        int f11322f;

        private C2977c(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2) {
            this.f11317a = e0Var;
            this.f11318b = e0Var2;
        }

        C2977c(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2, int i, int i2, int i3, int i4) {
            this(e0Var, e0Var2);
            this.f11319c = i;
            this.f11320d = i2;
            this.f11321e = i3;
            this.f11322f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f11317a + ", newHolder=" + this.f11318b + ", fromX=" + this.f11319c + ", fromY=" + this.f11320d + ", toX=" + this.f11321e + ", toY=" + this.f11322f + '}';
        }
    }

    /* renamed from: z3.a$d */
    static class C2978d {

        /* renamed from: a */
        RecyclerView.C1168e0 f11323a;

        /* renamed from: b */
        int f11324b;

        /* renamed from: c */
        int f11325c;

        /* renamed from: d */
        int f11326d;

        /* renamed from: e */
        int f11327e;

        C2978d(RecyclerView.C1168e0 e0Var, int i, int i2, int i3, int i4) {
            this.f11323a = e0Var;
            this.f11324b = i;
            this.f11325c = i2;
            this.f11326d = i3;
            this.f11327e = i4;
        }

        public String toString() {
            return "MoveInfo{holder=" + this.f11323a + ", fromX=" + this.f11324b + ", fromY=" + this.f11325c + ", toX=" + this.f11326d + ", toY=" + this.f11327e + '}';
        }
    }

    /* renamed from: V */
    private void m12272V(List<RecyclerView.C1168e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m12273W(list.get(size).f4049a);
        }
        list.clear();
    }

    /* renamed from: W */
    private void m12273W(View view) {
        Folme.end(view);
    }

    /* renamed from: X */
    private void m12274X() {
        if (!mo4531p()) {
            mo4524i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m12275Y() {
        List<C2978d> remove = this.f11308m.isEmpty() ? f11301t : this.f11308m.remove(0);
        List<C2977c> remove2 = this.f11309n.isEmpty() ? f11302u : this.f11309n.remove(0);
        List<RecyclerView.C1168e0> remove3 = this.f11307l.isEmpty() ? f11300s : this.f11307l.remove(0);
        for (C2978d T : remove) {
            mo10283T(T);
        }
        for (C2977c S : remove2) {
            mo10282S(S);
        }
        if (!remove3.isEmpty()) {
            C2976b bVar = new C2976b(remove3);
            if (!remove.isEmpty() || !remove2.isEmpty()) {
                remove3.get(0).f4049a.postDelayed(bVar, 50);
            } else {
                bVar.run();
            }
        }
    }

    /* renamed from: Z */
    private void m12276Z(List<C2977c> list, RecyclerView.C1168e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C2977c cVar = list.get(size);
            if (m12278b0(cVar, e0Var) && cVar.f11317a == null && cVar.f11318b == null) {
                list.remove(cVar);
            }
        }
    }

    /* renamed from: a0 */
    private void m12277a0(C2977c cVar) {
        RecyclerView.C1168e0 e0Var = cVar.f11317a;
        if (e0Var != null) {
            m12278b0(cVar, e0Var);
        }
        RecyclerView.C1168e0 e0Var2 = cVar.f11318b;
        if (e0Var2 != null) {
            m12278b0(cVar, e0Var2);
        }
    }

    /* renamed from: b0 */
    private boolean m12278b0(C2977c cVar, RecyclerView.C1168e0 e0Var) {
        boolean z = false;
        if (cVar.f11318b == e0Var) {
            cVar.f11318b = null;
        } else if (cVar.f11317a != e0Var) {
            return false;
        } else {
            cVar.f11317a = null;
            z = true;
        }
        e0Var.f4049a.setAlpha(1.0f);
        e0Var.f4049a.setTranslationX(0.0f);
        e0Var.f4049a.setTranslationY(0.0f);
        mo4946C(e0Var, z);
        return true;
    }

    /* renamed from: n0 */
    static void m12279n0(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public abstract void mo10281R(RecyclerView.C1168e0 e0Var);

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public abstract void mo10282S(C2977c cVar);

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract void mo10283T(C2978d dVar);

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public abstract void mo10284U(RecyclerView.C1168e0 e0Var);

    /* renamed from: a */
    public boolean mo4517a(RecyclerView.C1168e0 e0Var, RecyclerView.C1177m.C1180c cVar, RecyclerView.C1177m.C1180c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f4083a) == (i2 = cVar2.f4083a) && cVar.f4084b == cVar2.f4084b)) {
            return mo4865w(e0Var);
        }
        return mo4867y(e0Var, i, cVar.f4084b, i2, cVar2.f4084b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo10285c0(RecyclerView.C1168e0 e0Var) {
        mo4944A(e0Var);
        this.f11310o.remove(e0Var);
        m12274X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo10286d0(RecyclerView.C1168e0 e0Var) {
        this.f11310o.add(e0Var);
        mo4945B(e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo10287e0(RecyclerView.C1168e0 e0Var, boolean z) {
        mo4946C(e0Var, z);
        this.f11313r.remove(e0Var);
        m12274X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo10288f0(RecyclerView.C1168e0 e0Var, boolean z) {
        this.f11313r.add(e0Var);
        mo4947D(e0Var, z);
    }

    /* renamed from: g */
    public boolean mo4522g(RecyclerView.C1168e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4522g(e0Var, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo10289g0(RecyclerView.C1168e0 e0Var) {
        mo4948E(e0Var);
        this.f11311p.remove(e0Var);
        m12274X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo10290h0(RecyclerView.C1168e0 e0Var) {
        this.f11311p.add(e0Var);
        mo4949F(e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo10291i0(RecyclerView.C1168e0 e0Var) {
        mo4950G(e0Var);
        this.f11312q.remove(e0Var);
        m12274X();
    }

    /* renamed from: j */
    public void mo4525j(RecyclerView.C1168e0 e0Var) {
        View view = e0Var.f4049a;
        m12273W(view);
        int size = this.f11305j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f11305j.get(size).f11323a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4948E(e0Var);
                this.f11305j.remove(size);
            }
        }
        m12276Z(this.f11306k, e0Var);
        if (this.f11303h.remove(e0Var)) {
            view.setAlpha(1.0f);
            mo4950G(e0Var);
        }
        if (this.f11304i.remove(e0Var)) {
            view.setAlpha(1.0f);
            mo4944A(e0Var);
        }
        for (int size2 = this.f11309n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f11309n.get(size2);
            m12276Z(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.f11309n.remove(size2);
            }
        }
        for (int size3 = this.f11308m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f11308m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C2978d) arrayList2.get(size4)).f11323a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4948E(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f11308m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f11307l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f11307l.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                mo4944A(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f11307l.remove(size5);
                }
            }
        }
        this.f11312q.remove(e0Var);
        this.f11310o.remove(e0Var);
        this.f11313r.remove(e0Var);
        this.f11311p.remove(e0Var);
        m12274X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo10292j0(RecyclerView.C1168e0 e0Var) {
        this.f11312q.add(e0Var);
        mo4951H(e0Var);
    }

    /* renamed from: k */
    public void mo4526k() {
        int size = this.f11305j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C2978d dVar = this.f11305j.get(size);
            View view = dVar.f11323a.f4049a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4948E(dVar.f11323a);
            this.f11305j.remove(size);
        }
        for (int size2 = this.f11303h.size() - 1; size2 >= 0; size2--) {
            mo4950G(this.f11303h.get(size2));
            this.f11303h.remove(size2);
        }
        int size3 = this.f11304i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1168e0 e0Var = this.f11304i.get(size3);
            e0Var.f4049a.setAlpha(1.0f);
            mo4944A(e0Var);
            this.f11304i.remove(size3);
        }
        for (int size4 = this.f11306k.size() - 1; size4 >= 0; size4--) {
            m12277a0(this.f11306k.get(size4));
        }
        this.f11306k.clear();
        if (mo4531p()) {
            for (int size5 = this.f11308m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f11308m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C2978d dVar2 = (C2978d) arrayList.get(size6);
                    View view2 = dVar2.f11323a.f4049a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4948E(dVar2.f11323a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f11308m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f11307l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f11307l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1168e0 e0Var2 = (RecyclerView.C1168e0) arrayList2.get(size8);
                    e0Var2.f4049a.setAlpha(1.0f);
                    mo4944A(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f11307l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f11309n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f11309n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m12277a0((C2977c) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f11309n.remove(arrayList3);
                    }
                }
            }
            m12272V(this.f11312q);
            m12272V(this.f11311p);
            m12272V(this.f11310o);
            m12272V(this.f11313r);
            mo4524i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public abstract void mo10293k0(RecyclerView.C1168e0 e0Var);

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public abstract void mo10294l0(C2977c cVar);

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public abstract void mo10295m0(C2978d dVar);

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public abstract void mo10296o0(RecyclerView.C1168e0 e0Var);

    /* renamed from: p */
    public boolean mo4531p() {
        return !this.f11304i.isEmpty() || !this.f11306k.isEmpty() || !this.f11305j.isEmpty() || !this.f11303h.isEmpty() || !this.f11311p.isEmpty() || !this.f11312q.isEmpty() || !this.f11310o.isEmpty() || !this.f11313r.isEmpty() || !this.f11308m.isEmpty() || !this.f11307l.isEmpty() || !this.f11309n.isEmpty();
    }

    /* renamed from: u */
    public void mo4536u() {
        boolean z = !this.f11303h.isEmpty();
        boolean z2 = !this.f11305j.isEmpty();
        boolean z3 = !this.f11306k.isEmpty();
        boolean z4 = !this.f11304i.isEmpty();
        if (z || z2 || z3 || z4) {
            this.f11308m.add(new ArrayList(this.f11305j));
            this.f11305j.clear();
            this.f11309n.add(new ArrayList(this.f11306k));
            this.f11306k.clear();
            this.f11307l.add(new ArrayList(this.f11304i));
            this.f11304i.clear();
            C2975a aVar = new C2975a();
            if (z) {
                Iterator<RecyclerView.C1168e0> it = this.f11303h.iterator();
                while (it.hasNext()) {
                    mo10284U(it.next());
                }
                this.f11303h.get(0).f4049a.postDelayed(aVar, 100);
                this.f11303h.clear();
                return;
            }
            aVar.run();
        }
    }

    /* renamed from: w */
    public boolean mo4865w(RecyclerView.C1168e0 e0Var) {
        mo10293k0(e0Var);
        this.f11304i.add(e0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo4866x(RecyclerView.C1168e0 e0Var, RecyclerView.C1168e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            return mo4867y(e0Var2, i, i2, i3, i4);
        }
        C2977c cVar = new C2977c(e0Var, e0Var2, i, i2, i3, i4);
        mo10294l0(cVar);
        mo10282S(cVar);
        return true;
    }

    /* renamed from: y */
    public boolean mo4867y(RecyclerView.C1168e0 e0Var, int i, int i2, int i3, int i4) {
        mo10296o0(e0Var);
        int i5 = i4 - i2;
        if (i3 - i == 0 && i5 == 0) {
            mo4948E(e0Var);
            return false;
        }
        C2978d dVar = new C2978d(e0Var, i, i2, i3, i4);
        mo10295m0(dVar);
        this.f11305j.add(dVar);
        return true;
    }

    /* renamed from: z */
    public boolean mo4868z(RecyclerView.C1168e0 e0Var) {
        mo10296o0(e0Var);
        this.f11303h.add(e0Var);
        return true;
    }
}
