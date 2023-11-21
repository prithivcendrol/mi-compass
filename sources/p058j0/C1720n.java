package p058j0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0727l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p063k.C1761a;

/* renamed from: j0.n */
public class C1720n {

    /* renamed from: a */
    private static C1710l f6676a = new C1671b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C1761a<ViewGroup, ArrayList<C1710l>>>> f6677b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f6678c = new ArrayList<>();

    /* renamed from: j0.n$a */
    private static class C1721a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: d */
        C1710l f6679d;

        /* renamed from: e */
        ViewGroup f6680e;

        /* renamed from: j0.n$a$a */
        class C1722a extends C1718m {

            /* renamed from: d */
            final /* synthetic */ C1761a f6681d;

            C1722a(C1761a aVar) {
                this.f6681d = aVar;
            }

            /* renamed from: c */
            public void mo5899c(C1710l lVar) {
                ((ArrayList) this.f6681d.get(C1721a.this.f6680e)).remove(lVar);
                lVar.mo5930P(this);
            }
        }

        C1721a(C1710l lVar, ViewGroup viewGroup) {
            this.f6679d = lVar;
            this.f6680e = viewGroup;
        }

        /* renamed from: a */
        private void m7194a() {
            this.f6680e.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6680e.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m7194a();
            if (!C1720n.f6678c.remove(this.f6680e)) {
                return true;
            }
            C1761a<ViewGroup, ArrayList<C1710l>> b = C1720n.m7191b();
            ArrayList arrayList = b.get(this.f6680e);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f6680e, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6679d);
            this.f6679d.mo5940a(new C1722a(b));
            this.f6679d.mo5948k(this.f6680e, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C1710l) it.next()).mo5932R(this.f6680e);
                }
            }
            this.f6679d.mo5929O(this.f6680e);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m7194a();
            C1720n.f6678c.remove(this.f6680e);
            ArrayList arrayList = C1720n.m7191b().get(this.f6680e);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1710l) it.next()).mo5932R(this.f6680e);
                }
            }
            this.f6679d.mo5949l(true);
        }
    }

    /* renamed from: a */
    public static void m7190a(ViewGroup viewGroup, C1710l lVar) {
        if (!f6678c.contains(viewGroup) && C0727l0.m2860J(viewGroup)) {
            f6678c.add(viewGroup);
            if (lVar == null) {
                lVar = f6676a;
            }
            C1710l m = lVar.clone();
            m7193d(viewGroup, m);
            C1708k.m7109c(viewGroup, (C1708k) null);
            m7192c(viewGroup, m);
        }
    }

    /* renamed from: b */
    static C1761a<ViewGroup, ArrayList<C1710l>> m7191b() {
        C1761a<ViewGroup, ArrayList<C1710l>> aVar;
        WeakReference weakReference = f6677b.get();
        if (weakReference != null && (aVar = (C1761a) weakReference.get()) != null) {
            return aVar;
        }
        C1761a<ViewGroup, ArrayList<C1710l>> aVar2 = new C1761a<>();
        f6677b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m7192c(ViewGroup viewGroup, C1710l lVar) {
        if (lVar != null && viewGroup != null) {
            C1721a aVar = new C1721a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m7193d(ViewGroup viewGroup, C1710l lVar) {
        ArrayList arrayList = m7191b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1710l) it.next()).mo5928N(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.mo5948k(viewGroup, true);
        }
        C1708k b = C1708k.m7108b(viewGroup);
        if (b != null) {
            b.mo5920a();
        }
    }
}
