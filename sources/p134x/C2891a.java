package p134x;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0624a;
import androidx.core.view.C0727l0;
import androidx.core.view.accessibility.C0631b;
import androidx.core.view.accessibility.C0637g;
import androidx.core.view.accessibility.C0641h;
import androidx.core.view.accessibility.C0645i;
import java.util.ArrayList;
import java.util.List;
import p063k.C1775h;

/* renamed from: x.a */
public abstract class C2891a extends C0624a {

    /* renamed from: n */
    private static final Rect f11015n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C2895b<C0637g> f11016o = new C2892a();

    /* renamed from: p */
    private static final C2896c<C1775h<C0637g>, C0637g> f11017p = new C2893b();

    /* renamed from: d */
    private final Rect f11018d = new Rect();

    /* renamed from: e */
    private final Rect f11019e = new Rect();

    /* renamed from: f */
    private final Rect f11020f = new Rect();

    /* renamed from: g */
    private final int[] f11021g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f11022h;

    /* renamed from: i */
    private final View f11023i;

    /* renamed from: j */
    private C2894c f11024j;

    /* renamed from: k */
    int f11025k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f11026l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f11027m = Integer.MIN_VALUE;

    /* renamed from: x.a$a */
    class C2892a implements C2895b<C0637g> {
        C2892a() {
        }
    }

    /* renamed from: x.a$b */
    class C2893b implements C2896c<C1775h<C0637g>, C0637g> {
        C2893b() {
        }
    }

    /* renamed from: x.a$c */
    private class C2894c extends C0641h {
        C2894c() {
        }

        /* renamed from: b */
        public C0637g mo2790b(int i) {
            return C0637g.m2524L(C2891a.this.mo10184A(i));
        }

        /* renamed from: d */
        public C0637g mo2792d(int i) {
            int i2 = i == 2 ? C2891a.this.f11025k : C2891a.this.f11026l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo2790b(i2);
        }

        /* renamed from: f */
        public boolean mo2794f(int i, int i2, Bundle bundle) {
            return C2891a.this.mo10186H(i, i2, bundle);
        }
    }

    public C2891a(View view) {
        if (view != null) {
            this.f11023i = view;
            this.f11022h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0727l0.m2913s(view) == 0) {
                C0727l0.m2892h0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: I */
    private boolean m11914I(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo6643B(i, i2, bundle) : m11918n(i) : m11916K(i) : mo10189o(i) : mo10187L(i);
    }

    /* renamed from: J */
    private boolean m11915J(int i, Bundle bundle) {
        return C0727l0.m2867Q(this.f11023i, i, bundle);
    }

    /* renamed from: K */
    private boolean m11916K(int i) {
        int i2;
        if (!this.f11022h.isEnabled() || !this.f11022h.isTouchExplorationEnabled() || (i2 = this.f11025k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m11918n(i2);
        }
        this.f11025k = i;
        this.f11023i.invalidate();
        mo10188M(i, 32768);
        return true;
    }

    /* renamed from: N */
    private void m11917N(int i) {
        int i2 = this.f11027m;
        if (i2 != i) {
            this.f11027m = i;
            mo10188M(i, 128);
            mo10188M(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m11918n(int i) {
        if (this.f11025k != i) {
            return false;
        }
        this.f11025k = Integer.MIN_VALUE;
        this.f11023i.invalidate();
        mo10188M(i, 65536);
        return true;
    }

    /* renamed from: p */
    private AccessibilityEvent m11919p(int i, int i2) {
        return i != -1 ? m11920q(i, i2) : m11921r(i2);
    }

    /* renamed from: q */
    private AccessibilityEvent m11920q(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0637g A = mo10184A(i);
        obtain.getText().add(A.mo2780u());
        obtain.setContentDescription(A.mo2776p());
        obtain.setScrollable(A.mo2738H());
        obtain.setPassword(A.mo2737G());
        obtain.setEnabled(A.mo2733C());
        obtain.setChecked(A.mo2731A());
        mo6645D(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(A.mo2775n());
            C0645i.m2600c(obtain, this.f11023i, i);
            obtain.setPackageName(this.f11023i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: r */
    private AccessibilityEvent m11921r(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f11023i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: s */
    private C0637g m11922s(int i) {
        C0637g J = C0637g.m2522J();
        J.mo2750Y(true);
        J.mo2751Z(true);
        J.mo2745T("android.view.View");
        Rect rect = f11015n;
        J.mo2743R(rect);
        J.mo2744S(rect);
        J.mo2760e0(this.f11023i);
        mo6647F(i, J);
        if (J.mo2780u() == null && J.mo2776p() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        J.mo2770k(this.f11019e);
        if (!this.f11019e.equals(rect)) {
            int j = J.mo2768j();
            if ((j & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j & 128) == 0) {
                J.mo2757c0(this.f11023i.getContext().getPackageName());
                J.mo2767i0(this.f11023i, i);
                if (this.f11025k == i) {
                    J.mo2742P(true);
                    J.mo2752a(128);
                } else {
                    J.mo2742P(false);
                    J.mo2752a(64);
                }
                boolean z = this.f11026l == i;
                if (z) {
                    J.mo2752a(2);
                } else if (J.mo2734D()) {
                    J.mo2752a(1);
                }
                J.mo2753a0(z);
                this.f11023i.getLocationOnScreen(this.f11021g);
                J.mo2772l(this.f11018d);
                if (this.f11018d.equals(rect)) {
                    J.mo2770k(this.f11018d);
                    if (J.f2673b != -1) {
                        C0637g J2 = C0637g.m2522J();
                        for (int i2 = J.f2673b; i2 != -1; i2 = J2.f2673b) {
                            J2.mo2762f0(this.f11023i, -1);
                            J2.mo2743R(f11015n);
                            mo6647F(i2, J2);
                            J2.mo2770k(this.f11019e);
                            Rect rect2 = this.f11018d;
                            Rect rect3 = this.f11019e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        J2.mo2741N();
                    }
                    this.f11018d.offset(this.f11021g[0] - this.f11023i.getScrollX(), this.f11021g[1] - this.f11023i.getScrollY());
                }
                if (this.f11023i.getLocalVisibleRect(this.f11020f)) {
                    this.f11020f.offset(this.f11021g[0] - this.f11023i.getScrollX(), this.f11021g[1] - this.f11023i.getScrollY());
                    if (this.f11018d.intersect(this.f11020f)) {
                        J.mo2744S(this.f11018d);
                        if (m11924z(this.f11018d)) {
                            J.mo2771k0(true);
                        }
                    }
                }
                return J;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: t */
    private C0637g m11923t() {
        C0637g K = C0637g.m2523K(this.f11023i);
        C0727l0.m2865O(this.f11023i, K);
        ArrayList arrayList = new ArrayList();
        mo6649w(arrayList);
        if (K.mo2774m() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                K.mo2756c(this.f11023i, ((Integer) arrayList.get(i)).intValue());
            }
            return K;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11924z(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f11023i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f11023i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p134x.C2891a.m11924z(android.graphics.Rect):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C0637g mo10184A(int i) {
        return i == -1 ? m11923t() : m11922s(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract boolean mo6643B(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6644C(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo6645D(int i, AccessibilityEvent accessibilityEvent);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6646E(C0637g gVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract void mo6647F(int i, C0637g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo10185G(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo10186H(int i, int i2, Bundle bundle) {
        return i != -1 ? m11914I(i, i2, bundle) : m11915J(i2, bundle);
    }

    /* renamed from: L */
    public final boolean mo10187L(int i) {
        int i2;
        if ((!this.f11023i.isFocused() && !this.f11023i.requestFocus()) || (i2 = this.f11026l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo10189o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f11026l = i;
        mo10185G(i, true);
        mo10188M(i, 8);
        return true;
    }

    /* renamed from: M */
    public final boolean mo10188M(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f11022h.isEnabled() || (parent = this.f11023i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f11023i, m11919p(i, i2));
    }

    /* renamed from: b */
    public C0641h mo2711b(View view) {
        if (this.f11024j == null) {
            this.f11024j = new C2894c();
        }
        return this.f11024j;
    }

    /* renamed from: f */
    public void mo2713f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2713f(view, accessibilityEvent);
        mo6644C(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2714g(View view, C0637g gVar) {
        super.mo2714g(view, gVar);
        mo6646E(gVar);
    }

    /* renamed from: o */
    public final boolean mo10189o(int i) {
        if (this.f11026l != i) {
            return false;
        }
        this.f11026l = Integer.MIN_VALUE;
        mo10185G(i, false);
        mo10188M(i, 8);
        return true;
    }

    /* renamed from: u */
    public final boolean mo10190u(MotionEvent motionEvent) {
        if (!this.f11022h.isEnabled() || !this.f11022h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int v = mo6648v(motionEvent.getX(), motionEvent.getY());
            m11917N(v);
            return v != Integer.MIN_VALUE;
        } else if (action != 10 || this.f11027m == Integer.MIN_VALUE) {
            return false;
        } else {
            m11917N(Integer.MIN_VALUE);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo6648v(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo6649w(List<Integer> list);

    /* renamed from: x */
    public final void mo10191x() {
        mo10192y(-1, 1);
    }

    /* renamed from: y */
    public final void mo10192y(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f11022h.isEnabled() && (parent = this.f11023i.getParent()) != null) {
            AccessibilityEvent p = m11919p(i, 2048);
            C0631b.m2515b(p, i2);
            parent.requestSendAccessibilityEvent(this.f11023i, p);
        }
    }
}
