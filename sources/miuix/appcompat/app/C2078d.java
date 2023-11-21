package miuix.appcompat.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.activity.C0091g;
import androidx.core.view.C0719j0;
import androidx.core.view.C0727l0;
import androidx.lifecycle.C1048m;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarContextView;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.appcompat.internal.app.widget.C2191h;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2250g;
import p018c2.C1352h;
import p018c2.C1353i;
import p055i3.C1656j;
import p084n2.C2436c;
import p084n2.C2437d;
import p127v2.C2869a;

/* renamed from: miuix.appcompat.app.d */
public abstract class C2078d implements C2075b, C2129u, C2250g.C2251a, C2242c.C2244b {

    /* renamed from: d */
    final C2118q f7651d;

    /* renamed from: e */
    protected ActionBarView f7652e;

    /* renamed from: f */
    protected C2242c f7653f;

    /* renamed from: g */
    protected ActionMode f7654g;

    /* renamed from: h */
    protected boolean f7655h;

    /* renamed from: i */
    protected boolean f7656i;

    /* renamed from: j */
    protected boolean f7657j;

    /* renamed from: k */
    protected boolean f7658k;

    /* renamed from: l */
    protected boolean f7659l;

    /* renamed from: m */
    protected C2071a f7660m;

    /* renamed from: n */
    private MenuInflater f7661n;

    /* renamed from: o */
    private int f7662o = 0;

    /* renamed from: p */
    private C2436c f7663p;

    /* renamed from: q */
    private boolean f7664q;

    /* renamed from: r */
    private boolean f7665r;

    /* renamed from: s */
    private C2242c f7666s;

    /* renamed from: t */
    protected boolean f7667t = false;

    /* renamed from: u */
    protected Rect f7668u;

    /* renamed from: v */
    protected View f7669v;

    /* renamed from: w */
    protected C1656j.C1657a f7670w;

    /* renamed from: x */
    private C0091g f7671x;

    /* renamed from: miuix.appcompat.app.d$a */
    class C2079a extends C0091g {
        C2079a(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo311b() {
            ActionMode actionMode = C2078d.this.f7654g;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    C2078d(C2118q qVar) {
        this.f7651d = qVar;
    }

    /* renamed from: V */
    private void m8285V(boolean z) {
        C0091g gVar = this.f7671x;
        if (gVar == null) {
            this.f7671x = new C2079a(z);
            this.f7651d.mo253e().mo291b(mo7420q(), this.f7671x);
            return;
        }
        gVar.mo315f(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract boolean mo7390A(C2242c cVar);

    /* renamed from: B */
    public void mo7391B() {
        C2191h hVar;
        ActionMode actionMode = this.f7654g;
        if (actionMode != null) {
            actionMode.finish();
        }
        if (this.f7658k && this.f7655h && (hVar = (C2191h) mo7411g()) != null) {
            hVar.mo377q();
        }
    }

    /* renamed from: C */
    public abstract /* synthetic */ boolean mo7392C(int i, MenuItem menuItem);

    /* renamed from: E */
    public boolean mo7393E() {
        return this.f7658k || this.f7659l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract boolean mo7394F(C2242c cVar);

    /* renamed from: H */
    public void mo7395H(Rect rect) {
        if (this.f7669v != null) {
            C1656j.C1657a aVar = new C1656j.C1657a(this.f7670w);
            boolean b = C1656j.m6983b(this.f7669v);
            aVar.f6525b += b ? rect.right : rect.left;
            aVar.f6526c += rect.top;
            aVar.f6527d += b ? rect.left : rect.right;
            View view = this.f7669v;
            if (!(view instanceof ViewGroup) || !(view instanceof C0719j0)) {
                aVar.mo5828b(view);
            } else {
                aVar.mo5827a((ViewGroup) view);
            }
        }
    }

    /* renamed from: I */
    public ActionMode mo7396I(ActionMode.Callback callback) {
        return null;
    }

    /* renamed from: K */
    public ActionMode mo7397K(ActionMode.Callback callback, int i) {
        if (i == 0) {
            return mo7396I(callback);
        }
        return null;
    }

    /* renamed from: M */
    public void mo7398M(View view) {
        C2071a g = mo7411g();
        if (g != null) {
            g.mo7357E(view);
        }
    }

    /* renamed from: N */
    public boolean mo7399N(int i) {
        if (i == 2) {
            this.f7656i = true;
            return true;
        } else if (i == 5) {
            this.f7657j = true;
            return true;
        } else if (i == 8) {
            this.f7658k = true;
            return true;
        } else if (i != 9) {
            return this.f7651d.requestWindowFeature(i);
        } else {
            this.f7659l = true;
            return true;
        }
    }

    /* renamed from: O */
    public void mo7400O(boolean z, boolean z2) {
        this.f7665r = z;
        if (this.f7655h && this.f7658k) {
            this.f7652e.setEndActionMenuEnable(z);
            if (z2) {
                invalidateOptionsMenu();
            } else {
                this.f7651d.getWindow().getDecorView().post(new C2077c(this));
            }
        }
    }

    @Deprecated
    /* renamed from: P */
    public void mo7401P(boolean z) {
        this.f7664q = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7402Q(miuix.appcompat.internal.view.menu.C2242c r2) {
        /*
            r1 = this;
            miuix.appcompat.internal.view.menu.c r0 = r1.f7653f
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f7653f = r2
            miuix.appcompat.internal.app.widget.ActionBarView r0 = r1.f7652e
            if (r0 == 0) goto L_0x000e
            r0.mo7898A1(r2, r1)
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.C2078d.mo7402Q(miuix.appcompat.internal.view.menu.c):void");
    }

    /* renamed from: R */
    public void mo7403R(int i) {
        int integer = this.f7651d.getResources().getInteger(C1353i.f4741b);
        if (integer >= 0 && integer <= 2) {
            i = integer;
        }
        if (this.f7662o != i && C2869a.m11866a(this.f7651d.getWindow(), i)) {
            this.f7662o = i;
        }
    }

    @Deprecated
    /* renamed from: S */
    public void mo7404S() {
        View findViewById;
        C2436c cVar = this.f7663p;
        if (cVar instanceof C2437d) {
            View b0 = ((C2437d) cVar).mo9348b0();
            ViewGroup c0 = ((C2437d) this.f7663p).mo9349c0();
            if (b0 != null) {
                mo7405T(b0, c0);
                return;
            }
        }
        ActionBarView actionBarView = this.f7652e;
        if (actionBarView == null || (findViewById = actionBarView.findViewById(C1352h.f4691M)) == null) {
            throw new IllegalStateException("Can't find anchor view in actionbar or any other anchor view used before. Do you use default actionbar and immersion menu is enabled?");
        }
        mo7405T(findViewById, this.f7652e);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    @Deprecated
    /* renamed from: T */
    public void mo7405T(View view, ViewGroup viewGroup) {
        if (!this.f7664q) {
            Log.w("ActionBarDelegate", "Try to show immersion menu when immersion menu disabled");
        } else if (view != null) {
            if (this.f7666s == null) {
                C2242c l = mo7416l();
                this.f7666s = l;
                mo7390A(l);
            }
            if (mo7394F(this.f7666s) && this.f7666s.hasVisibleItems()) {
                C2436c cVar = this.f7663p;
                if (cVar == null) {
                    this.f7663p = new C2437d(this, this.f7666s);
                } else {
                    cVar.mo9347m(this.f7666s);
                }
                if (!this.f7663p.isShowing()) {
                    this.f7663p.mo9346l(view, viewGroup);
                }
            }
        } else {
            throw new IllegalArgumentException("You must specify a valid anchor view");
        }
    }

    /* renamed from: U */
    public void mo7406U(View view) {
        C2071a g = mo7411g();
        if (g != null) {
            g.mo7361I(view);
        }
    }

    /* renamed from: b */
    public void mo7407b(Rect rect) {
        this.f7668u = rect;
    }

    /* renamed from: d */
    public void mo7408d(C2242c cVar, boolean z) {
        this.f7651d.closeOptionsMenu();
    }

    /* renamed from: e */
    public boolean mo7409e(C2242c cVar) {
        return false;
    }

    /* renamed from: f */
    public void mo7410f(ActionBarOverlayLayout actionBarOverlayLayout) {
        if (actionBarOverlayLayout != null) {
            ViewStub viewStub = (ViewStub) actionBarOverlayLayout.findViewById(C1352h.f4680B);
            actionBarOverlayLayout.setContentMask(viewStub != null ? viewStub.inflate() : actionBarOverlayLayout.findViewById(C1352h.f4679A));
        }
    }

    /* renamed from: g */
    public C2071a mo7411g() {
        C2071a aVar;
        if (mo7393E()) {
            if (this.f7660m == null) {
                aVar = mo7378v();
            }
            return this.f7660m;
        }
        aVar = null;
        this.f7660m = aVar;
        return this.f7660m;
    }

    /* renamed from: h */
    public void mo7412h(boolean z, boolean z2, ActionBarOverlayLayout actionBarOverlayLayout) {
        if (!this.f7667t) {
            this.f7667t = true;
            ViewStub viewStub = (ViewStub) actionBarOverlayLayout.findViewById(C1352h.f4706a0);
            ActionBarContainer actionBarContainer = (ActionBarContainer) (viewStub != null ? viewStub.inflate() : actionBarOverlayLayout.findViewById(C1352h.f4704Z));
            if (actionBarContainer != null) {
                this.f7652e.setSplitView(actionBarContainer);
                this.f7652e.setSplitActionBar(z);
                this.f7652e.setSplitWhenNarrow(z2);
                actionBarOverlayLayout.setSplitActionBarView(actionBarContainer);
                mo7410f(actionBarOverlayLayout);
            }
            ActionBarContainer actionBarContainer2 = (ActionBarContainer) actionBarOverlayLayout.findViewById(C1352h.f4711d);
            ViewStub viewStub2 = (ViewStub) actionBarOverlayLayout.findViewById(C1352h.f4729p);
            ActionBarContextView actionBarContextView = (ActionBarContextView) (viewStub2 != null ? viewStub2.inflate() : actionBarOverlayLayout.findViewById(C1352h.f4728o));
            if (actionBarContextView != null) {
                actionBarContainer2.setActionBarContextView(actionBarContextView);
                actionBarOverlayLayout.setActionBarContextView(actionBarContextView);
                if (actionBarContainer != null) {
                    actionBarContextView.setSplitView(actionBarContainer);
                    actionBarContextView.setSplitActionBar(z);
                    actionBarContextView.setSplitWhenNarrow(z2);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo7413i(int[] iArr) {
    }

    /* renamed from: j */
    public void mo7414j(View view) {
        this.f7669v = view;
        C1656j.C1657a aVar = new C1656j.C1657a(C0727l0.m2921z(view), this.f7669v.getPaddingTop(), C0727l0.m2920y(this.f7669v), this.f7669v.getPaddingBottom());
        this.f7670w = aVar;
        if (view instanceof ViewGroup) {
            aVar.f6524a = ((ViewGroup) view).getClipToPadding();
        }
    }

    /* renamed from: k */
    public abstract Context mo7415k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C2242c mo7416l() {
        C2242c cVar = new C2242c(mo7418o());
        cVar.mo8350N(this);
        return cVar;
    }

    @Deprecated
    /* renamed from: n */
    public void mo7417n(boolean z) {
        C2436c cVar = this.f7663p;
        if (cVar != null) {
            cVar.mo9344a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Context mo7418o() {
        C2118q qVar = this.f7651d;
        C2071a g = mo7411g();
        return g != null ? g.mo372l() : qVar;
    }

    /* renamed from: p */
    public C2118q mo7419p() {
        return this.f7651d;
    }

    /* renamed from: q */
    public abstract C1048m mo7420q();

    /* renamed from: r */
    public MenuInflater mo7421r() {
        if (this.f7661n == null) {
            C2071a g = mo7411g();
            if (g != null) {
                this.f7661n = new MenuInflater(g.mo372l());
            } else {
                this.f7661n = new MenuInflater(this.f7651d);
            }
        }
        return this.f7661n;
    }

    /* renamed from: s */
    public int mo7422s() {
        return this.f7662o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String mo7423t() {
        try {
            Bundle bundle = this.f7651d.getPackageManager().getActivityInfo(this.f7651d.getComponentName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString("android.support.UI_OPTIONS");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("ActionBarDelegate", "getUiOptionsFromMetadata: Activity '" + this.f7651d.getClass().getSimpleName() + "' not in manifest");
            return null;
        }
    }

    /* renamed from: u */
    public boolean mo7424u() {
        return this.f7665r;
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo7425w() {
        C2436c cVar = this.f7663p;
        if (!(cVar instanceof C2437d)) {
            return false;
        }
        return cVar.isShowing();
    }

    /* renamed from: x */
    public void mo7426x(ActionMode actionMode) {
        this.f7654g = null;
        m8285V(false);
    }

    /* renamed from: y */
    public void mo7427y(ActionMode actionMode) {
        this.f7654g = actionMode;
        m8285V(true);
    }

    /* renamed from: z */
    public void mo7428z(Configuration configuration) {
        C2191h hVar;
        if (this.f7658k && this.f7655h && (hVar = (C2191h) mo7411g()) != null) {
            hVar.mo376p(configuration);
        }
    }
}
