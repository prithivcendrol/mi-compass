package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0624a;
import androidx.core.view.C0727l0;
import androidx.core.view.accessibility.C0637g;
import androidx.core.view.accessibility.C0641h;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.j */
public class C1247j extends C0624a {

    /* renamed from: d */
    final RecyclerView f4339d;

    /* renamed from: e */
    private final C1248a f4340e;

    /* renamed from: androidx.recyclerview.widget.j$a */
    public static class C1248a extends C0624a {

        /* renamed from: d */
        final C1247j f4341d;

        /* renamed from: e */
        private Map<View, C0624a> f4342e = new WeakHashMap();

        public C1248a(C1247j jVar) {
            this.f4341d = jVar;
        }

        /* renamed from: a */
        public boolean mo2710a(View view, AccessibilityEvent accessibilityEvent) {
            C0624a aVar = this.f4342e.get(view);
            return aVar != null ? aVar.mo2710a(view, accessibilityEvent) : super.mo2710a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C0641h mo2711b(View view) {
            C0624a aVar = this.f4342e.get(view);
            return aVar != null ? aVar.mo2711b(view) : super.mo2711b(view);
        }

        /* renamed from: f */
        public void mo2713f(View view, AccessibilityEvent accessibilityEvent) {
            C0624a aVar = this.f4342e.get(view);
            if (aVar != null) {
                aVar.mo2713f(view, accessibilityEvent);
            } else {
                super.mo2713f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo2714g(View view, C0637g gVar) {
            if (!this.f4341d.mo4940o() && this.f4341d.f4339d.getLayoutManager() != null) {
                this.f4341d.f4339d.getLayoutManager().mo4568N0(view, gVar);
                C0624a aVar = this.f4342e.get(view);
                if (aVar != null) {
                    aVar.mo2714g(view, gVar);
                    return;
                }
            }
            super.mo2714g(view, gVar);
        }

        /* renamed from: h */
        public void mo2715h(View view, AccessibilityEvent accessibilityEvent) {
            C0624a aVar = this.f4342e.get(view);
            if (aVar != null) {
                aVar.mo2715h(view, accessibilityEvent);
            } else {
                super.mo2715h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo2716i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0624a aVar = this.f4342e.get(viewGroup);
            return aVar != null ? aVar.mo2716i(viewGroup, view, accessibilityEvent) : super.mo2716i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo2717j(View view, int i, Bundle bundle) {
            if (this.f4341d.mo4940o() || this.f4341d.f4339d.getLayoutManager() == null) {
                return super.mo2717j(view, i, bundle);
            }
            C0624a aVar = this.f4342e.get(view);
            if (aVar != null) {
                if (aVar.mo2717j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2717j(view, i, bundle)) {
                return true;
            }
            return this.f4341d.f4339d.getLayoutManager().mo4602h1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo2718l(View view, int i) {
            C0624a aVar = this.f4342e.get(view);
            if (aVar != null) {
                aVar.mo2718l(view, i);
            } else {
                super.mo2718l(view, i);
            }
        }

        /* renamed from: m */
        public void mo2719m(View view, AccessibilityEvent accessibilityEvent) {
            C0624a aVar = this.f4342e.get(view);
            if (aVar != null) {
                aVar.mo2719m(view, accessibilityEvent);
            } else {
                super.mo2719m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C0624a mo4941n(View view) {
            return this.f4342e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo4942o(View view) {
            C0624a i = C0727l0.m2893i(view);
            if (i != null && i != this) {
                this.f4342e.put(view, i);
            }
        }
    }

    public C1247j(RecyclerView recyclerView) {
        this.f4339d = recyclerView;
        C0624a n = mo4129n();
        this.f4340e = (n == null || !(n instanceof C1248a)) ? new C1248a(this) : (C1248a) n;
    }

    /* renamed from: f */
    public void mo2713f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2713f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo4940o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4179J0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo2714g(View view, C0637g gVar) {
        super.mo2714g(view, gVar);
        if (!mo4940o() && this.f4339d.getLayoutManager() != null) {
            this.f4339d.getLayoutManager().mo4565L0(gVar);
        }
    }

    /* renamed from: j */
    public boolean mo2717j(View view, int i, Bundle bundle) {
        if (super.mo2717j(view, i, bundle)) {
            return true;
        }
        if (mo4940o() || this.f4339d.getLayoutManager() == null) {
            return false;
        }
        return this.f4339d.getLayoutManager().mo4598f1(i, bundle);
    }

    /* renamed from: n */
    public C0624a mo4129n() {
        return this.f4340e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4940o() {
        return this.f4339d.mo4328l0();
    }
}
