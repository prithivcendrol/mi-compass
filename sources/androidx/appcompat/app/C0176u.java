package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0116a;
import androidx.appcompat.view.C0181a;
import androidx.appcompat.view.C0182b;
import androidx.appcompat.view.C0190g;
import androidx.appcompat.view.C0193h;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0333i0;
import androidx.appcompat.widget.C0429y0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0662b2;
import androidx.core.view.C0675c2;
import androidx.core.view.C0680d2;
import androidx.core.view.C0684e2;
import androidx.core.view.C0727l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p021d.C1447a;
import p021d.C1452f;
import p021d.C1456j;

/* renamed from: androidx.appcompat.app.u */
public class C0176u extends C0116a implements ActionBarOverlayLayout.C0246d {

    /* renamed from: E */
    private static final Interpolator f520E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f521F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f522A;

    /* renamed from: B */
    final C0675c2 f523B = new C0177a();

    /* renamed from: C */
    final C0675c2 f524C = new C0178b();

    /* renamed from: D */
    final C0684e2 f525D = new C0179c();

    /* renamed from: a */
    Context f526a;

    /* renamed from: b */
    private Context f527b;

    /* renamed from: c */
    private Activity f528c;

    /* renamed from: d */
    ActionBarOverlayLayout f529d;

    /* renamed from: e */
    ActionBarContainer f530e;

    /* renamed from: f */
    C0333i0 f531f;

    /* renamed from: g */
    ActionBarContextView f532g;

    /* renamed from: h */
    View f533h;

    /* renamed from: i */
    C0429y0 f534i;

    /* renamed from: j */
    private ArrayList<Object> f535j = new ArrayList<>();

    /* renamed from: k */
    private int f536k = -1;

    /* renamed from: l */
    private boolean f537l;

    /* renamed from: m */
    C0180d f538m;

    /* renamed from: n */
    C0182b f539n;

    /* renamed from: o */
    C0182b.C0183a f540o;

    /* renamed from: p */
    private boolean f541p;

    /* renamed from: q */
    private ArrayList<C0116a.C0118b> f542q = new ArrayList<>();

    /* renamed from: r */
    private boolean f543r;

    /* renamed from: s */
    private int f544s = 0;

    /* renamed from: t */
    boolean f545t = true;

    /* renamed from: u */
    boolean f546u;

    /* renamed from: v */
    boolean f547v;

    /* renamed from: w */
    private boolean f548w;

    /* renamed from: x */
    private boolean f549x = true;

    /* renamed from: y */
    C0193h f550y;

    /* renamed from: z */
    private boolean f551z;

    /* renamed from: androidx.appcompat.app.u$a */
    class C0177a extends C0680d2 {
        C0177a() {
        }

        /* renamed from: b */
        public void mo523b(View view) {
            View view2;
            C0176u uVar = C0176u.this;
            if (uVar.f545t && (view2 = uVar.f533h) != null) {
                view2.setTranslationY(0.0f);
                C0176u.this.f530e.setTranslationY(0.0f);
            }
            C0176u.this.f530e.setVisibility(8);
            C0176u.this.f530e.setTransitioning(false);
            C0176u uVar2 = C0176u.this;
            uVar2.f550y = null;
            uVar2.mo597G();
            ActionBarOverlayLayout actionBarOverlayLayout = C0176u.this.f529d;
            if (actionBarOverlayLayout != null) {
                C0727l0.m2872V(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.u$b */
    class C0178b extends C0680d2 {
        C0178b() {
        }

        /* renamed from: b */
        public void mo523b(View view) {
            C0176u uVar = C0176u.this;
            uVar.f550y = null;
            uVar.f530e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.u$c */
    class C0179c implements C0684e2 {
        C0179c() {
        }

        /* renamed from: a */
        public void mo612a(View view) {
            ((View) C0176u.this.f530e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.u$d */
    public class C0180d extends C0182b implements C0214g.C0215a {

        /* renamed from: f */
        private final Context f555f;

        /* renamed from: g */
        private final C0214g f556g;

        /* renamed from: h */
        private C0182b.C0183a f557h;

        /* renamed from: i */
        private WeakReference<View> f558i;

        public C0180d(Context context, C0182b.C0183a aVar) {
            this.f555f = context;
            this.f557h = aVar;
            C0214g S = new C0214g(context).mo876S(1);
            this.f556g = S;
            S.mo875R(this);
        }

        /* renamed from: a */
        public boolean mo494a(C0214g gVar, MenuItem menuItem) {
            C0182b.C0183a aVar = this.f557h;
            if (aVar != null) {
                return aVar.mo531c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo495b(C0214g gVar) {
            if (this.f557h != null) {
                mo619k();
                C0176u.this.f532g.mo1158l();
            }
        }

        /* renamed from: c */
        public void mo613c() {
            C0176u uVar = C0176u.this;
            if (uVar.f538m == this) {
                if (!C0176u.m642F(uVar.f546u, uVar.f547v, false)) {
                    C0176u uVar2 = C0176u.this;
                    uVar2.f539n = this;
                    uVar2.f540o = this.f557h;
                } else {
                    this.f557h.mo530b(this);
                }
                this.f557h = null;
                C0176u.this.mo596E(false);
                C0176u.this.f532g.mo1148g();
                C0176u uVar3 = C0176u.this;
                uVar3.f529d.setHideOnContentScrollEnabled(uVar3.f522A);
                C0176u.this.f538m = null;
            }
        }

        /* renamed from: d */
        public View mo614d() {
            WeakReference<View> weakReference = this.f558i;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo615e() {
            return this.f556g;
        }

        /* renamed from: f */
        public MenuInflater mo616f() {
            return new C0190g(this.f555f);
        }

        /* renamed from: g */
        public CharSequence mo617g() {
            return C0176u.this.f532g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo618i() {
            return C0176u.this.f532g.getTitle();
        }

        /* renamed from: k */
        public void mo619k() {
            if (C0176u.this.f538m == this) {
                this.f556g.mo901d0();
                try {
                    this.f557h.mo529a(this, this.f556g);
                } finally {
                    this.f556g.mo896c0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo620l() {
            return C0176u.this.f532g.mo1156j();
        }

        /* renamed from: m */
        public void mo621m(View view) {
            C0176u.this.f532g.setCustomView(view);
            this.f558i = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo622n(int i) {
            mo623o(C0176u.this.f526a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo623o(CharSequence charSequence) {
            C0176u.this.f532g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo624q(int i) {
            mo625r(C0176u.this.f526a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo625r(CharSequence charSequence) {
            C0176u.this.f532g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo626s(boolean z) {
            super.mo626s(z);
            C0176u.this.f532g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo627t() {
            this.f556g.mo901d0();
            try {
                return this.f557h.mo532d(this, this.f556g);
            } finally {
                this.f556g.mo896c0();
            }
        }
    }

    public C0176u(Activity activity, boolean z) {
        this.f528c = activity;
        View decorView = activity.getWindow().getDecorView();
        m645M(decorView);
        if (!z) {
            this.f533h = decorView.findViewById(16908290);
        }
    }

    public C0176u(Dialog dialog) {
        m645M(dialog.getWindow().getDecorView());
    }

    /* renamed from: F */
    static boolean m642F(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: J */
    private C0333i0 m643J(View view) {
        if (view instanceof C0333i0) {
            return (C0333i0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: L */
    private void m644L() {
        if (this.f548w) {
            this.f548w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f529d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m649V(false);
        }
    }

    /* renamed from: M */
    private void m645M(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C1452f.f5801p);
        this.f529d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f531f = m643J(view.findViewById(C1452f.f5786a));
        this.f532g = (ActionBarContextView) view.findViewById(C1452f.f5791f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C1452f.f5788c);
        this.f530e = actionBarContainer;
        C0333i0 i0Var = this.f531f;
        if (i0Var == null || this.f532g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f526a = i0Var.mo1923c();
        boolean z = (this.f531f.mo1937o() & 4) != 0;
        if (z) {
            this.f537l = true;
        }
        C0181a b = C0181a.m696b(this.f526a);
        mo605S(b.mo628a() || z);
        m646Q(b.mo633g());
        TypedArray obtainStyledAttributes = this.f526a.obtainStyledAttributes((AttributeSet) null, C1456j.f5972a, C1447a.f5677c, 0);
        if (obtainStyledAttributes.getBoolean(C1456j.f6022k, false)) {
            mo604R(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1456j.f6012i, 0);
        if (dimensionPixelSize != 0) {
            mo603P((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Q */
    private void m646Q(boolean z) {
        this.f543r = z;
        if (!z) {
            this.f531f.mo1933k((C0429y0) null);
            this.f530e.setTabContainer(this.f534i);
        } else {
            this.f530e.setTabContainer((C0429y0) null);
            this.f531f.mo1933k(this.f534i);
        }
        boolean z2 = true;
        boolean z3 = mo600K() == 2;
        C0429y0 y0Var = this.f534i;
        if (y0Var != null) {
            if (z3) {
                y0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f529d;
                if (actionBarOverlayLayout != null) {
                    C0727l0.m2872V(actionBarOverlayLayout);
                }
            } else {
                y0Var.setVisibility(8);
            }
        }
        this.f531f.mo1947u(!this.f543r && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f529d;
        if (this.f543r || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: T */
    private boolean m647T() {
        return C0727l0.m2860J(this.f530e);
    }

    /* renamed from: U */
    private void m648U() {
        if (!this.f548w) {
            this.f548w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f529d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m649V(false);
        }
    }

    /* renamed from: V */
    private void m649V(boolean z) {
        if (m642F(this.f546u, this.f547v, this.f548w)) {
            if (!this.f549x) {
                this.f549x = true;
                mo599I(z);
            }
        } else if (this.f549x) {
            this.f549x = false;
            mo598H(z);
        }
    }

    /* renamed from: A */
    public void mo363A(boolean z) {
        C0193h hVar;
        this.f551z = z;
        if (!z && (hVar = this.f550y) != null) {
            hVar.mo676a();
        }
    }

    /* renamed from: B */
    public void mo364B(CharSequence charSequence) {
        this.f531f.setWindowTitle(charSequence);
    }

    /* renamed from: D */
    public C0182b mo366D(C0182b.C0183a aVar) {
        C0180d dVar = this.f538m;
        if (dVar != null) {
            dVar.mo613c();
        }
        this.f529d.setHideOnContentScrollEnabled(false);
        this.f532g.mo1157k();
        C0180d dVar2 = new C0180d(this.f532g.getContext(), aVar);
        if (!dVar2.mo627t()) {
            return null;
        }
        this.f538m = dVar2;
        dVar2.mo619k();
        this.f532g.mo1155h(dVar2);
        mo596E(true);
        return dVar2;
    }

    /* renamed from: E */
    public void mo596E(boolean z) {
        C0662b2 b2Var;
        C0662b2 b2Var2;
        if (z) {
            m648U();
        } else {
            m644L();
        }
        if (m647T()) {
            if (z) {
                b2Var = this.f531f.mo1940r(4, 100);
                b2Var2 = this.f532g.mo1147f(0, 200);
            } else {
                b2Var2 = this.f531f.mo1940r(0, 200);
                b2Var = this.f532g.mo1147f(8, 100);
            }
            C0193h hVar = new C0193h();
            hVar.mo679d(b2Var, b2Var2);
            hVar.mo683h();
        } else if (z) {
            this.f531f.mo1932j(4);
            this.f532g.setVisibility(0);
        } else {
            this.f531f.mo1932j(0);
            this.f532g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo597G() {
        C0182b.C0183a aVar = this.f540o;
        if (aVar != null) {
            aVar.mo530b(this.f539n);
            this.f539n = null;
            this.f540o = null;
        }
    }

    /* renamed from: H */
    public void mo598H(boolean z) {
        View view;
        C0193h hVar = this.f550y;
        if (hVar != null) {
            hVar.mo676a();
        }
        if (this.f544s != 0 || (!this.f551z && !z)) {
            this.f523B.mo523b((View) null);
            return;
        }
        this.f530e.setAlpha(1.0f);
        this.f530e.setTransitioning(true);
        C0193h hVar2 = new C0193h();
        float f = (float) (-this.f530e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f530e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0662b2 m = C0727l0.m2881c(this.f530e).mo2827m(f);
        m.mo2825k(this.f525D);
        hVar2.mo678c(m);
        if (this.f545t && (view = this.f533h) != null) {
            hVar2.mo678c(C0727l0.m2881c(view).mo2827m(f));
        }
        hVar2.mo681f(f520E);
        hVar2.mo680e(250);
        hVar2.mo682g(this.f523B);
        this.f550y = hVar2;
        hVar2.mo683h();
    }

    /* renamed from: I */
    public void mo599I(boolean z) {
        View view;
        View view2;
        C0193h hVar = this.f550y;
        if (hVar != null) {
            hVar.mo676a();
        }
        this.f530e.setVisibility(0);
        if (this.f544s != 0 || (!this.f551z && !z)) {
            this.f530e.setAlpha(1.0f);
            this.f530e.setTranslationY(0.0f);
            if (this.f545t && (view = this.f533h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f524C.mo523b((View) null);
        } else {
            this.f530e.setTranslationY(0.0f);
            float f = (float) (-this.f530e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f530e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f530e.setTranslationY(f);
            C0193h hVar2 = new C0193h();
            C0662b2 m = C0727l0.m2881c(this.f530e).mo2827m(0.0f);
            m.mo2825k(this.f525D);
            hVar2.mo678c(m);
            if (this.f545t && (view2 = this.f533h) != null) {
                view2.setTranslationY(f);
                hVar2.mo678c(C0727l0.m2881c(this.f533h).mo2827m(0.0f));
            }
            hVar2.mo681f(f521F);
            hVar2.mo680e(250);
            hVar2.mo682g(this.f524C);
            this.f550y = hVar2;
            hVar2.mo683h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f529d;
        if (actionBarOverlayLayout != null) {
            C0727l0.m2872V(actionBarOverlayLayout);
        }
    }

    /* renamed from: K */
    public int mo600K() {
        return this.f531f.mo1939q();
    }

    /* renamed from: N */
    public void mo601N(boolean z) {
        mo602O(z ? 4 : 0, 4);
    }

    /* renamed from: O */
    public void mo602O(int i, int i2) {
        int o = this.f531f.mo1937o();
        if ((i2 & 4) != 0) {
            this.f537l = true;
        }
        this.f531f.mo1936n((i & i2) | ((~i2) & o));
    }

    /* renamed from: P */
    public void mo603P(float f) {
        C0727l0.m2888f0(this.f530e, f);
    }

    /* renamed from: R */
    public void mo604R(boolean z) {
        if (!z || this.f529d.mo1226w()) {
            this.f522A = z;
            this.f529d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: S */
    public void mo605S(boolean z) {
        this.f531f.mo1934l(z);
    }

    /* renamed from: a */
    public void mo606a() {
        if (this.f547v) {
            this.f547v = false;
            m649V(true);
        }
    }

    /* renamed from: b */
    public void mo607b() {
        C0193h hVar = this.f550y;
        if (hVar != null) {
            hVar.mo676a();
            this.f550y = null;
        }
    }

    /* renamed from: c */
    public void mo608c(int i) {
        this.f544s = i;
    }

    /* renamed from: d */
    public void mo609d() {
    }

    /* renamed from: e */
    public void mo610e(boolean z) {
        this.f545t = z;
    }

    /* renamed from: f */
    public void mo611f() {
        if (!this.f547v) {
            this.f547v = true;
            m649V(true);
        }
    }

    /* renamed from: i */
    public boolean mo369i() {
        C0333i0 i0Var = this.f531f;
        if (i0Var == null || !i0Var.mo1935m()) {
            return false;
        }
        this.f531f.collapseActionView();
        return true;
    }

    /* renamed from: j */
    public void mo370j(boolean z) {
        if (z != this.f541p) {
            this.f541p = z;
            int size = this.f542q.size();
            for (int i = 0; i < size; i++) {
                this.f542q.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: k */
    public int mo371k() {
        return this.f531f.mo1937o();
    }

    /* renamed from: l */
    public Context mo372l() {
        if (this.f527b == null) {
            TypedValue typedValue = new TypedValue();
            this.f526a.getTheme().resolveAttribute(C1447a.f5681g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f527b = new ContextThemeWrapper(this.f526a, i);
            } else {
                this.f527b = this.f526a;
            }
        }
        return this.f527b;
    }

    /* renamed from: p */
    public void mo376p(Configuration configuration) {
        m646Q(C0181a.m696b(this.f526a).mo633g());
    }

    /* renamed from: r */
    public boolean mo378r(int i, KeyEvent keyEvent) {
        Menu e;
        C0180d dVar = this.f538m;
        if (dVar == null || (e = dVar.mo615e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: v */
    public void mo382v(boolean z) {
        if (!this.f537l) {
            mo601N(z);
        }
    }
}
