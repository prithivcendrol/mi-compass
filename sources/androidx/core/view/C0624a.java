package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0637g;
import androidx.core.view.accessibility.C0641h;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p104r.C2588b;

/* renamed from: androidx.core.view.a */
public class C0624a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f2662c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f2663a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f2664b;

    /* renamed from: androidx.core.view.a$a */
    static final class C0625a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0624a f2665a;

        C0625a(C0624a aVar) {
            this.f2665a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2665a.mo2710a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0641h b = this.f2665a.mo2711b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo2793e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2665a.mo2713f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0637g m0 = C0637g.m2531m0(accessibilityNodeInfo);
            m0.mo2763g0(C0727l0.m2861K(view));
            m0.mo2755b0(C0727l0.m2858H(view));
            m0.mo2758d0(C0727l0.m2901m(view));
            m0.mo2769j0(C0727l0.m2852B(view));
            this.f2665a.mo2714g(view, m0);
            m0.mo2759e(accessibilityNodeInfo.getText(), view);
            List<C0637g.C0638a> c = C0624a.m2498c(view);
            for (int i = 0; i < c.size(); i++) {
                m0.mo2754b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2665a.mo2715h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2665a.mo2716i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2665a.mo2717j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f2665a.mo2718l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2665a.mo2719m(view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.core.view.a$b */
    static class C0626b {
        /* renamed from: a */
        static AccessibilityNodeProvider m2511a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m2512b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C0624a() {
        this(f2662c);
    }

    public C0624a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2663a = accessibilityDelegate;
        this.f2664b = new C0625a(this);
    }

    /* renamed from: c */
    static List<C0637g.C0638a> m2498c(View view) {
        List<C0637g.C0638a> list = (List) view.getTag(C2588b.f10139H);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m2499e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] o = C0637g.m2532o(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (o != null && i < o.length) {
                if (clickableSpan.equals(o[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m2500k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C2588b.f10140I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m2499e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo2710a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2663a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0641h mo2711b(View view) {
        AccessibilityNodeProvider a = C0626b.m2511a(this.f2663a, view);
        if (a != null) {
            return new C0641h(a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo2712d() {
        return this.f2664b;
    }

    /* renamed from: f */
    public void mo2713f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2663a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2714g(View view, C0637g gVar) {
        this.f2663a.onInitializeAccessibilityNodeInfo(view, gVar.mo2773l0());
    }

    /* renamed from: h */
    public void mo2715h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2663a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo2716i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2663a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2717j(View view, int i, Bundle bundle) {
        List<C0637g.C0638a> c = m2498c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C0637g.C0638a aVar = c.get(i2);
            if (aVar.mo2784a() == i) {
                z = aVar.mo2786c(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C0626b.m2512b(this.f2663a, view, i, bundle);
        }
        return (z || i != C2588b.f10151a || bundle == null) ? z : m2500k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo2718l(View view, int i) {
        this.f2663a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo2719m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2663a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
