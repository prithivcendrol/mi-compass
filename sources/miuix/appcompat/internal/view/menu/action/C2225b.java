package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.C2217a;
import miuix.appcompat.internal.view.menu.C2240b;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2246d;
import miuix.appcompat.internal.view.menu.C2247e;
import miuix.appcompat.internal.view.menu.C2248f;
import miuix.appcompat.internal.view.menu.C2250g;
import miuix.appcompat.internal.view.menu.C2252h;
import miuix.appcompat.internal.view.menu.C2254i;
import p018c2.C1347c;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1355k;
import p055i3.C1649c;
import p078m2.C1918a;

/* renamed from: miuix.appcompat.internal.view.menu.action.b */
public class C2225b extends C2217a {

    /* renamed from: A */
    private final SparseBooleanArray f8465A;

    /* renamed from: B */
    private View f8466B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2230e f8467C;

    /* renamed from: D */
    private C2230e f8468D;

    /* renamed from: E */
    private C2247e f8469E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C2227b f8470F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C2229d f8471G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ActionBarOverlayLayout f8472H;

    /* renamed from: I */
    final C2232g f8473I;

    /* renamed from: J */
    int f8474J;

    /* renamed from: K */
    private View f8475K;

    /* renamed from: n */
    protected View f8476n;

    /* renamed from: o */
    private boolean f8477o;

    /* renamed from: p */
    private boolean f8478p;

    /* renamed from: q */
    private int f8479q;

    /* renamed from: r */
    private int f8480r;

    /* renamed from: s */
    private int f8481s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f8482t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f8483u;

    /* renamed from: v */
    private boolean f8484v;

    /* renamed from: w */
    private boolean f8485w;

    /* renamed from: x */
    private boolean f8486x;

    /* renamed from: y */
    private boolean f8487y;

    /* renamed from: z */
    private int f8488z;

    /* renamed from: miuix.appcompat.internal.view.menu.action.b$b */
    private class C2227b extends C2246d {
        public C2227b(C2254i iVar) {
            super(iVar);
            C2225b.this.mo8217q(C2225b.this.f8473I);
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C2227b unused = C2225b.this.f8470F = null;
            C2225b.this.f8474J = 0;
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.b$c */
    private class C2228c implements C2230e {

        /* renamed from: d */
        private C2240b f8490d;

        private C2228c() {
        }

        /* renamed from: b */
        private C2240b m9368b(C2242c cVar) {
            if (this.f8490d == null) {
                this.f8490d = new C2240b(C2225b.this.f8367e, C2225b.this.f8483u, C2225b.this.f8482t);
            }
            cVar.mo8374c(this.f8490d);
            return this.f8490d;
        }

        /* renamed from: a */
        public void mo8299a(boolean z) {
            if (C2225b.this.f8374l instanceof PhoneActionMenuView) {
                ((PhoneActionMenuView) C2225b.this.f8374l).mo8247u(C2225b.this.f8472H);
            }
        }

        /* renamed from: c */
        public View mo8300c(C2242c cVar) {
            if (cVar == null || cVar.mo8408x().size() <= 0) {
                return null;
            }
            return (View) m9368b(cVar).mo8328j((ViewGroup) C2225b.this.f8374l);
        }

        /* renamed from: f */
        public boolean mo8301f() {
            if (C2225b.this.f8374l instanceof PhoneActionMenuView) {
                return ((PhoneActionMenuView) C2225b.this.f8374l).mo8249x(C2225b.this.f8472H);
            }
            return false;
        }

        public boolean isShowing() {
            if (C2225b.this.f8374l instanceof PhoneActionMenuView) {
                return ((PhoneActionMenuView) C2225b.this.f8374l).mo8248w();
            }
            return false;
        }

        /* renamed from: j */
        public void mo8303j(C2242c cVar) {
            if (C2225b.this.f8374l instanceof PhoneActionMenuView) {
                ((PhoneActionMenuView) C2225b.this.f8374l).setOverflowMenuView(mo8300c(cVar));
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.b$d */
    private class C2229d implements Runnable {

        /* renamed from: d */
        private C2230e f8492d;

        public C2229d(C2230e eVar) {
            this.f8492d = eVar;
        }

        public void run() {
            View view = (View) C2225b.this.f8374l;
            if (!(view == null || view.getWindowToken() == null || !this.f8492d.mo8301f())) {
                C2230e unused = C2225b.this.f8467C = this.f8492d;
            }
            C2229d unused2 = C2225b.this.f8471G = null;
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.b$e */
    private interface C2230e {
        /* renamed from: a */
        void mo8299a(boolean z);

        /* renamed from: f */
        boolean mo8301f();

        boolean isShowing();

        /* renamed from: j */
        void mo8303j(C2242c cVar);
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.b$f */
    private class C2231f extends C2248f implements C2230e {
        public C2231f(Context context, C2242c cVar, View view, boolean z) {
            super(context, cVar, view, z);
            mo8488o(C2225b.this.f8473I);
            mo8492q(C1354j.f4742A);
        }

        /* renamed from: a */
        public void mo8299a(boolean z) {
            super.mo8299a(z);
            View view = C2225b.this.f8476n;
            if (view != null) {
                view.setSelected(false);
            }
        }

        /* renamed from: j */
        public void mo8303j(C2242c cVar) {
        }

        public void onDismiss() {
            super.onDismiss();
            C2225b.this.f8368f.close();
            C2230e unused = C2225b.this.f8467C = null;
        }
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.b$g */
    private class C2232g implements C2250g.C2251a {
        private C2232g() {
        }

        /* renamed from: d */
        public void mo7408d(C2242c cVar, boolean z) {
            if (cVar instanceof C2254i) {
                C2217a.m9241j(cVar.mo8339B(), false);
            }
        }

        /* renamed from: e */
        public boolean mo7409e(C2242c cVar) {
            if (cVar == null) {
                return false;
            }
            C2225b.this.f8474J = ((C2254i) cVar).getItem().getItemId();
            return false;
        }
    }

    public C2225b(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2) {
        this(context, actionBarOverlayLayout, i, i2, 0, 0);
    }

    public C2225b(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, int i4) {
        super(context, i, i2);
        this.f8488z = 16843510;
        this.f8465A = new SparseBooleanArray();
        this.f8473I = new C2232g();
        this.f8483u = i3;
        this.f8482t = i4;
        this.f8472H = actionBarOverlayLayout;
    }

    /* renamed from: P */
    private View m9331P(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f8374l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C2252h.C2253a) && ((C2252h.C2253a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: R */
    private C2230e m9332R() {
        if (mo8295f0()) {
            return new C2231f(this.f8367e, this.f8368f, this.f8476n, true);
        }
        if (this.f8468D == null) {
            this.f8468D = new C2228c();
        }
        return this.f8468D;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m9333X() {
        C2242c cVar = this.f8368f;
        if (cVar != null) {
            C2217a.m9243m(cVar, cVar.mo8339B(), mo8283S());
        }
        if (this.f8476n.isSelected()) {
            mo8284T(true);
        } else {
            mo8296g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public View mo8280N(Context context) {
        C2238e eVar = new C2238e(context, (AttributeSet) null, this.f8488z);
        eVar.mo8324b(new C2224a(this));
        return eVar;
    }

    /* renamed from: O */
    public boolean mo8281O(boolean z) {
        return mo8284T(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public int mo8282Q() {
        Context context = this.f8367e;
        if (context != null) {
            return C1649c.m6965j(context, C1347c.f4582p, 5);
        }
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C2247e mo8283S() {
        if (this.f8469E == null) {
            this.f8469E = C2217a.m9242l(this.f8368f, 0, C1352h.f4691M, 0, 0, this.f8367e.getString(C1355k.f4788e), 0);
        }
        return this.f8469E;
    }

    /* renamed from: T */
    public boolean mo8284T(boolean z) {
        if (this.f8471G == null || this.f8374l == null) {
            C2230e eVar = this.f8467C;
            if (eVar == null) {
                return false;
            }
            boolean isShowing = eVar.isShowing();
            if (isShowing) {
                this.f8476n.setSelected(false);
            }
            this.f8467C.mo8299a(z);
            return isShowing;
        }
        this.f8476n.setSelected(false);
        ((View) this.f8374l).removeCallbacks(this.f8471G);
        this.f8471G = null;
        return true;
    }

    /* renamed from: U */
    public boolean mo8285U() {
        C2227b bVar = this.f8470F;
        if (bVar == null) {
            return false;
        }
        bVar.mo8412a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo8286V(View view) {
        return view instanceof ActionMenuItemView;
    }

    /* renamed from: W */
    public boolean mo8287W() {
        C2230e eVar = this.f8467C;
        return eVar != null && eVar.isShowing();
    }

    /* renamed from: Y */
    public void mo8288Y(Configuration configuration) {
        if (!this.f8484v && this.f8367e != null) {
            this.f8481s = mo8282Q();
        }
        C2242c cVar = this.f8368f;
        if (cVar != null) {
            C2217a.m9244p(cVar, true);
        }
    }

    /* renamed from: Z */
    public void mo8289Z(boolean z) {
        if (z) {
            this.f8488z = C1347c.f4583q;
        }
    }

    /* renamed from: a0 */
    public void mo8290a0(View view) {
        ViewGroup viewGroup;
        View view2 = this.f8475K;
        if (!(view2 == null || view2 == view || (viewGroup = (ViewGroup) view2.getParent()) == null)) {
            viewGroup.removeView(this.f8475K);
        }
        this.f8475K = view;
        if (view.getParent() == null) {
            C2252h hVar = this.f8374l;
            if (hVar instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) hVar).mo8275v(view);
            }
        }
    }

    /* renamed from: b */
    public void mo8003b(boolean z) {
        C2252h hVar;
        super.mo8003b(z);
        if (this.f8374l != null) {
            C2242c cVar = this.f8368f;
            ArrayList<C2247e> x = cVar != null ? cVar.mo8408x() : null;
            boolean z2 = false;
            if (this.f8477o && x != null) {
                int size = x.size();
                if (size == 1) {
                    z2 = !x.get(0).isActionViewExpanded();
                } else if (size > 0) {
                    z2 = true;
                }
            }
            View view = this.f8476n;
            if (z2) {
                if (view == null) {
                    this.f8476n = mo8280N(this.f8366d);
                } else {
                    view.setTranslationY(0.0f);
                }
                ViewGroup viewGroup = (ViewGroup) this.f8476n.getParent();
                if (viewGroup != this.f8374l) {
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f8476n);
                    }
                    C2233c cVar2 = (C2233c) this.f8374l;
                    View view2 = this.f8476n;
                    cVar2.addView(view2, cVar2.mo8234j(view2));
                }
            } else if (view != null && view.getParent() == (hVar = this.f8374l)) {
                ((ViewGroup) hVar).removeView(this.f8476n);
            }
            ((C2233c) this.f8374l).setOverflowReserved(this.f8477o);
            if (!mo8295f0()) {
                m9332R().mo8303j(this.f8368f);
            }
        }
    }

    /* renamed from: b0 */
    public void mo8291b0(boolean z) {
        this.f8487y = z;
    }

    /* renamed from: c */
    public boolean mo8004c() {
        ArrayList<C2247e> C = this.f8368f.mo8340C();
        int size = C.size();
        int i = this.f8481s;
        if (i < size) {
            i--;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size && i > 0) {
                C2247e eVar = C.get(i2);
                if (!eVar.mo8451n() && !eVar.mo8452o()) {
                    z = false;
                }
                eVar.mo8456s(z);
                if (z) {
                    i--;
                }
                i2++;
            }
        }
        while (i2 < size) {
            C.get(i2).mo8456s(false);
            i2++;
        }
        return true;
    }

    /* renamed from: c0 */
    public void mo8292c0(int i) {
        this.f8484v = true;
        int i2 = this.f8481s;
        this.f8481s = i;
        C2242c cVar = this.f8368f;
        if (cVar != null && i2 != i) {
            cVar.mo8373b0();
        }
    }

    /* renamed from: d */
    public void mo8005d(C2242c cVar, boolean z) {
        mo8281O(true);
        super.mo8005d(cVar, z);
    }

    /* renamed from: d0 */
    public void mo8293d0(boolean z) {
        this.f8477o = z;
        this.f8478p = true;
    }

    /* renamed from: e */
    public boolean mo8006e(C2254i iVar) {
        if (!iVar.hasVisibleItems()) {
            return false;
        }
        C2254i iVar2 = iVar;
        while (iVar2.mo8500c0() != this.f8368f) {
            iVar2 = (C2254i) iVar2.mo8500c0();
        }
        if (m9331P(iVar2.getItem()) == null && this.f8476n == null) {
            return false;
        }
        this.f8474J = iVar.getItem().getItemId();
        C2227b bVar = new C2227b(iVar);
        this.f8470F = bVar;
        bVar.mo8414c((IBinder) null);
        super.mo8006e(iVar);
        return true;
    }

    /* renamed from: e0 */
    public void mo8294e0(int i, boolean z) {
        this.f8479q = i;
        this.f8485w = z;
        this.f8486x = true;
    }

    /* renamed from: f */
    public void mo8213f(C2247e eVar, C2252h.C2253a aVar) {
        aVar.mo8201b(eVar, 0);
        aVar.setItemInvoker((C2242c.C2245c) this.f8374l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public boolean mo8295f0() {
        View view = this.f8476n;
        return (view == null || view.getParent() == null) ? false : true;
    }

    /* renamed from: g0 */
    public boolean mo8296g0() {
        if (!this.f8477o || mo8287W() || this.f8368f == null || this.f8374l == null || this.f8471G != null) {
            return false;
        }
        C2229d dVar = new C2229d(m9332R());
        this.f8471G = dVar;
        ((View) this.f8374l).post(dVar);
        super.mo8006e((C2254i) null);
        this.f8476n.setSelected(true);
        return true;
    }

    /* renamed from: h */
    public void mo8008h(Context context, C2242c cVar) {
        super.mo8008h(context, cVar);
        context.getResources();
        C1918a b = C1918a.m7836b(context);
        if (!this.f8478p) {
            this.f8477o = b.mo6472i();
        }
        if (!this.f8486x) {
            this.f8479q = b.mo6466c();
        }
        if (!this.f8484v) {
            this.f8481s = mo8282Q();
        }
        int i = this.f8479q;
        if (this.f8477o) {
            if (this.f8476n == null) {
                this.f8476n = mo8280N(this.f8366d);
            }
            if (this.f8476n != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8476n.measure(makeMeasureSpec, makeMeasureSpec);
                i -= this.f8476n.getMeasuredWidth();
            }
        } else {
            this.f8476n = null;
        }
        this.f8480r = i;
        this.f8466B = null;
    }

    /* renamed from: h0 */
    public void mo8297h0() {
        for (int i = 0; i < this.f8368f.size(); i++) {
            MenuItem item = this.f8368f.getItem(i);
            if (item instanceof C2247e) {
                ((C2247e) item).mo8418B();
            }
        }
    }

    /* renamed from: n */
    public View mo8215n(C2247e eVar, View view, ViewGroup viewGroup) {
        View actionView = eVar.getActionView();
        if (actionView == null || eVar.mo8447j()) {
            if (!mo8286V(view)) {
                view = null;
            }
            actionView = super.mo8215n(eVar, view, viewGroup);
        }
        actionView.setVisibility(eVar.isActionViewExpanded() ? 8 : 0);
        C2233c cVar = (C2233c) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!cVar.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(cVar.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: o */
    public C2252h mo8216o(ViewGroup viewGroup) {
        C2252h o = super.mo8216o(viewGroup);
        ((C2233c) o).setPresenter(this);
        View view = this.f8475K;
        if (view != null && view.getParent() == null && (o instanceof ResponsiveActionMenuView)) {
            ((ResponsiveActionMenuView) o).mo8275v(this.f8475K);
        }
        return o;
    }

    /* renamed from: s */
    public boolean mo8219s(int i, C2247e eVar) {
        return eVar.mo8449l();
    }
}
