package p058j0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p008os.C0578e;
import androidx.fragment.app.C0962i0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p058j0.C1710l;

@SuppressLint({"RestrictedApi"})
/* renamed from: j0.e */
public class C1690e extends C0962i0 {

    /* renamed from: j0.e$a */
    class C1691a extends C1710l.C1715e {

        /* renamed from: a */
        final /* synthetic */ Rect f6605a;

        C1691a(Rect rect) {
            this.f6605a = rect;
        }
    }

    /* renamed from: j0.e$b */
    class C1692b implements C1710l.C1716f {

        /* renamed from: d */
        final /* synthetic */ View f6607d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f6608e;

        C1692b(View view, ArrayList arrayList) {
            this.f6607d = view;
            this.f6608e = arrayList;
        }

        /* renamed from: a */
        public void mo5913a(C1710l lVar) {
            lVar.mo5930P(this);
            lVar.mo5940a(this);
        }

        /* renamed from: b */
        public void mo5898b(C1710l lVar) {
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            lVar.mo5930P(this);
            this.f6607d.setVisibility(8);
            int size = this.f6608e.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f6608e.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo5900d(C1710l lVar) {
        }

        /* renamed from: e */
        public void mo5901e(C1710l lVar) {
        }
    }

    /* renamed from: j0.e$c */
    class C1693c extends C1718m {

        /* renamed from: d */
        final /* synthetic */ Object f6610d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f6611e;

        /* renamed from: f */
        final /* synthetic */ Object f6612f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f6613g;

        /* renamed from: h */
        final /* synthetic */ Object f6614h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f6615i;

        C1693c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6610d = obj;
            this.f6611e = arrayList;
            this.f6612f = obj2;
            this.f6613g = arrayList2;
            this.f6614h = obj3;
            this.f6615i = arrayList3;
        }

        /* renamed from: a */
        public void mo5913a(C1710l lVar) {
            Object obj = this.f6610d;
            if (obj != null) {
                C1690e.this.mo5912w(obj, this.f6611e, (ArrayList<View>) null);
            }
            Object obj2 = this.f6612f;
            if (obj2 != null) {
                C1690e.this.mo5912w(obj2, this.f6613g, (ArrayList<View>) null);
            }
            Object obj3 = this.f6614h;
            if (obj3 != null) {
                C1690e.this.mo5912w(obj3, this.f6615i, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            lVar.mo5930P(this);
        }
    }

    /* renamed from: j0.e$d */
    class C1694d implements C0578e.C0580b {

        /* renamed from: a */
        final /* synthetic */ C1710l f6617a;

        C1694d(C1710l lVar) {
            this.f6617a = lVar;
        }

        public void onCancel() {
            this.f6617a.mo5946f();
        }
    }

    /* renamed from: j0.e$e */
    class C1695e implements C1710l.C1716f {

        /* renamed from: d */
        final /* synthetic */ Runnable f6619d;

        C1695e(Runnable runnable) {
            this.f6619d = runnable;
        }

        /* renamed from: a */
        public void mo5913a(C1710l lVar) {
        }

        /* renamed from: b */
        public void mo5898b(C1710l lVar) {
        }

        /* renamed from: c */
        public void mo5899c(C1710l lVar) {
            this.f6619d.run();
        }

        /* renamed from: d */
        public void mo5900d(C1710l lVar) {
        }

        /* renamed from: e */
        public void mo5901e(C1710l lVar) {
        }
    }

    /* renamed from: j0.e$f */
    class C1696f extends C1710l.C1715e {

        /* renamed from: a */
        final /* synthetic */ Rect f6621a;

        C1696f(Rect rect) {
            this.f6621a = rect;
        }
    }

    /* renamed from: v */
    private static boolean m7068v(C1710l lVar) {
        return !C0962i0.m3962i(lVar.mo5962z()) || !C0962i0.m3962i(lVar.mo5922A()) || !C0962i0.m3962i(lVar.mo5923B());
    }

    /* renamed from: a */
    public void mo3566a(Object obj, View view) {
        if (obj != null) {
            ((C1710l) obj).mo5942b(view);
        }
    }

    /* renamed from: b */
    public void mo3567b(Object obj, ArrayList<View> arrayList) {
        C1710l lVar = (C1710l) obj;
        if (lVar != null) {
            int i = 0;
            if (lVar instanceof C1729p) {
                C1729p pVar = (C1729p) lVar;
                int h0 = pVar.mo5984h0();
                while (i < h0) {
                    mo3567b(pVar.mo5983g0(i), arrayList);
                    i++;
                }
            } else if (!m7068v(lVar) && C0962i0.m3962i(lVar.mo5924C())) {
                int size = arrayList.size();
                while (i < size) {
                    lVar.mo5942b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3568c(ViewGroup viewGroup, Object obj) {
        C1720n.m7190a(viewGroup, (C1710l) obj);
    }

    /* renamed from: e */
    public boolean mo3569e(Object obj) {
        return obj instanceof C1710l;
    }

    /* renamed from: f */
    public Object mo3570f(Object obj) {
        if (obj != null) {
            return ((C1710l) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo3571j(Object obj, Object obj2, Object obj3) {
        C1710l lVar = (C1710l) obj;
        C1710l lVar2 = (C1710l) obj2;
        C1710l lVar3 = (C1710l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new C1729p().mo5982e0(lVar).mo5982e0(lVar2).mo5989m0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        C1729p pVar = new C1729p();
        if (lVar != null) {
            pVar.mo5982e0(lVar);
        }
        pVar.mo5982e0(lVar3);
        return pVar;
    }

    /* renamed from: k */
    public Object mo3572k(Object obj, Object obj2, Object obj3) {
        C1729p pVar = new C1729p();
        if (obj != null) {
            pVar.mo5982e0((C1710l) obj);
        }
        if (obj2 != null) {
            pVar.mo5982e0((C1710l) obj2);
        }
        if (obj3 != null) {
            pVar.mo5982e0((C1710l) obj3);
        }
        return pVar;
    }

    /* renamed from: m */
    public void mo3573m(Object obj, View view, ArrayList<View> arrayList) {
        ((C1710l) obj).mo5940a(new C1692b(view, arrayList));
    }

    /* renamed from: n */
    public void mo3574n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C1710l) obj).mo5940a(new C1693c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo3575o(Object obj, Rect rect) {
        if (obj != null) {
            ((C1710l) obj).mo5935V(new C1696f(rect));
        }
    }

    /* renamed from: p */
    public void mo3576p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3599h(view, rect);
            ((C1710l) obj).mo5935V(new C1691a(rect));
        }
    }

    /* renamed from: q */
    public void mo3577q(Fragment fragment, Object obj, C0578e eVar, Runnable runnable) {
        C1710l lVar = (C1710l) obj;
        eVar.mo2637b(new C1694d(lVar));
        lVar.mo5940a(new C1695e(runnable));
    }

    /* renamed from: s */
    public void mo3578s(Object obj, View view, ArrayList<View> arrayList) {
        C1729p pVar = (C1729p) obj;
        List<View> C = pVar.mo5924C();
        C.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0962i0.m3960d(C, arrayList.get(i));
        }
        C.add(view);
        arrayList.add(view);
        mo3567b(pVar, arrayList);
    }

    /* renamed from: t */
    public void mo3579t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1729p pVar = (C1729p) obj;
        if (pVar != null) {
            pVar.mo5924C().clear();
            pVar.mo5924C().addAll(arrayList2);
            mo5912w(pVar, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo3580u(Object obj) {
        if (obj == null) {
            return null;
        }
        C1729p pVar = new C1729p();
        pVar.mo5982e0((C1710l) obj);
        return pVar;
    }

    /* renamed from: w */
    public void mo5912w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1710l lVar = (C1710l) obj;
        int i = 0;
        if (lVar instanceof C1729p) {
            C1729p pVar = (C1729p) lVar;
            int h0 = pVar.mo5984h0();
            while (i < h0) {
                mo5912w(pVar.mo5983g0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m7068v(lVar)) {
            List<View> C = lVar.mo5924C();
            if (C.size() == arrayList.size() && C.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    lVar.mo5942b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    lVar.mo5931Q(arrayList.get(size2));
                }
            }
        }
    }
}
