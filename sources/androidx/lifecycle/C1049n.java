package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C1035g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p051i.C1632a;
import p057j.C1659a;
import p057j.C1660b;

/* renamed from: androidx.lifecycle.n */
public class C1049n extends C1035g {

    /* renamed from: b */
    private C1659a<C1047l, C1050a> f3482b;

    /* renamed from: c */
    private C1035g.C1038c f3483c;

    /* renamed from: d */
    private final WeakReference<C1048m> f3484d;

    /* renamed from: e */
    private int f3485e;

    /* renamed from: f */
    private boolean f3486f;

    /* renamed from: g */
    private boolean f3487g;

    /* renamed from: h */
    private ArrayList<C1035g.C1038c> f3488h;

    /* renamed from: i */
    private final boolean f3489i;

    /* renamed from: androidx.lifecycle.n$a */
    static class C1050a {

        /* renamed from: a */
        C1035g.C1038c f3490a;

        /* renamed from: b */
        C1046k f3491b;

        C1050a(C1047l lVar, C1035g.C1038c cVar) {
            this.f3491b = C1052p.m4260f(lVar);
            this.f3490a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3798a(C1048m mVar, C1035g.C1037b bVar) {
            C1035g.C1038c b = bVar.mo3793b();
            this.f3490a = C1049n.m4242k(this.f3490a, b);
            this.f3491b.mo289g(mVar, bVar);
            this.f3490a = b;
        }
    }

    public C1049n(C1048m mVar) {
        this(mVar, true);
    }

    private C1049n(C1048m mVar, boolean z) {
        this.f3482b = new C1659a<>();
        this.f3485e = 0;
        this.f3486f = false;
        this.f3487g = false;
        this.f3488h = new ArrayList<>();
        this.f3484d = new WeakReference<>(mVar);
        this.f3483c = C1035g.C1038c.INITIALIZED;
        this.f3489i = z;
    }

    /* renamed from: d */
    private void m4237d(C1048m mVar) {
        Iterator<Map.Entry<C1047l, C1050a>> descendingIterator = this.f3482b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3487g) {
            Map.Entry next = descendingIterator.next();
            C1050a aVar = (C1050a) next.getValue();
            while (aVar.f3490a.compareTo(this.f3483c) > 0 && !this.f3487g && this.f3482b.contains((C1047l) next.getKey())) {
                C1035g.C1037b a = C1035g.C1037b.m4226a(aVar.f3490a);
                if (a != null) {
                    m4245n(a.mo3793b());
                    aVar.mo3798a(mVar, a);
                    m4244m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f3490a);
                }
            }
        }
    }

    /* renamed from: e */
    private C1035g.C1038c m4238e(C1047l lVar) {
        Map.Entry<C1047l, C1050a> h = this.f3482b.mo5833h(lVar);
        C1035g.C1038c cVar = null;
        C1035g.C1038c cVar2 = h != null ? h.getValue().f3490a : null;
        if (!this.f3488h.isEmpty()) {
            ArrayList<C1035g.C1038c> arrayList = this.f3488h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m4242k(m4242k(this.f3483c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m4239f(String str) {
        if (this.f3489i && !C1632a.m6928d().mo5812b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m4240g(C1048m mVar) {
        C1660b<K, V>.d c = this.f3482b.mo5835c();
        while (c.hasNext() && !this.f3487g) {
            Map.Entry entry = (Map.Entry) c.next();
            C1050a aVar = (C1050a) entry.getValue();
            while (aVar.f3490a.compareTo(this.f3483c) < 0 && !this.f3487g && this.f3482b.contains((C1047l) entry.getKey())) {
                m4245n(aVar.f3490a);
                C1035g.C1037b c2 = C1035g.C1037b.m4227c(aVar.f3490a);
                if (c2 != null) {
                    aVar.mo3798a(mVar, c2);
                    m4244m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3490a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m4241i() {
        if (this.f3482b.size() == 0) {
            return true;
        }
        C1035g.C1038c cVar = this.f3482b.mo5834a().getValue().f3490a;
        C1035g.C1038c cVar2 = this.f3482b.mo5836d().getValue().f3490a;
        return cVar == cVar2 && this.f3483c == cVar2;
    }

    /* renamed from: k */
    static C1035g.C1038c m4242k(C1035g.C1038c cVar, C1035g.C1038c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m4243l(C1035g.C1038c cVar) {
        C1035g.C1038c cVar2 = this.f3483c;
        if (cVar2 != cVar) {
            if (cVar2 == C1035g.C1038c.INITIALIZED && cVar == C1035g.C1038c.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f3483c);
            }
            this.f3483c = cVar;
            if (this.f3486f || this.f3485e != 0) {
                this.f3487g = true;
                return;
            }
            this.f3486f = true;
            m4246p();
            this.f3486f = false;
            if (this.f3483c == C1035g.C1038c.DESTROYED) {
                this.f3482b = new C1659a<>();
            }
        }
    }

    /* renamed from: m */
    private void m4244m() {
        ArrayList<C1035g.C1038c> arrayList = this.f3488h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m4245n(C1035g.C1038c cVar) {
        this.f3488h.add(cVar);
    }

    /* renamed from: p */
    private void m4246p() {
        C1048m mVar = this.f3484d.get();
        if (mVar != null) {
            while (true) {
                boolean i = m4241i();
                this.f3487g = false;
                if (!i) {
                    if (this.f3483c.compareTo(this.f3482b.mo5834a().getValue().f3490a) < 0) {
                        m4237d(mVar);
                    }
                    Map.Entry<C1047l, C1050a> d = this.f3482b.mo5836d();
                    if (!this.f3487g && d != null && this.f3483c.compareTo(d.getValue().f3490a) > 0) {
                        m4240g(mVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: a */
    public void mo3790a(C1047l lVar) {
        C1048m mVar;
        m4239f("addObserver");
        C1035g.C1038c cVar = this.f3483c;
        C1035g.C1038c cVar2 = C1035g.C1038c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C1035g.C1038c.INITIALIZED;
        }
        C1050a aVar = new C1050a(lVar, cVar2);
        if (this.f3482b.mo5831f(lVar, aVar) == null && (mVar = this.f3484d.get()) != null) {
            boolean z = this.f3485e != 0 || this.f3486f;
            C1035g.C1038c e = m4238e(lVar);
            this.f3485e++;
            while (aVar.f3490a.compareTo(e) < 0 && this.f3482b.contains(lVar)) {
                m4245n(aVar.f3490a);
                C1035g.C1037b c = C1035g.C1037b.m4227c(aVar.f3490a);
                if (c != null) {
                    aVar.mo3798a(mVar, c);
                    m4244m();
                    e = m4238e(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3490a);
                }
            }
            if (!z) {
                m4246p();
            }
            this.f3485e--;
        }
    }

    /* renamed from: b */
    public C1035g.C1038c mo3791b() {
        return this.f3483c;
    }

    /* renamed from: c */
    public void mo3792c(C1047l lVar) {
        m4239f("removeObserver");
        this.f3482b.mo5832g(lVar);
    }

    /* renamed from: h */
    public void mo3795h(C1035g.C1037b bVar) {
        m4239f("handleLifecycleEvent");
        m4243l(bVar.mo3793b());
    }

    @Deprecated
    /* renamed from: j */
    public void mo3796j(C1035g.C1038c cVar) {
        m4239f("markState");
        mo3797o(cVar);
    }

    /* renamed from: o */
    public void mo3797o(C1035g.C1038c cVar) {
        m4239f("setCurrentState");
        m4243l(cVar);
    }
}
