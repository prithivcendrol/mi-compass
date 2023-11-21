package miuix.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.C0091g;
import androidx.appcompat.view.C0195i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1048m;
import java.util.List;
import miuix.appcompat.app.floatingactivity.C2083a;
import miuix.appcompat.app.floatingactivity.multiapp.C2095c;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.appcompat.internal.app.widget.C2191h;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.responsive.page.manager.BaseResponseStateManager;
import miuix.view.C2407k;
import p018c2.C1347c;
import p018c2.C1348d;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1357m;
import p020c4.C1361a;
import p026d4.C1511e;
import p030e2.C1538g;
import p030e2.C1539h;
import p036f2.C1558a;
import p036f2.C1559b;
import p055i3.C1649c;
import p072l2.C1874c;
import p073l3.C1877a;
import p117t2.C2693a;
import p127v2.C2869a;

/* renamed from: miuix.appcompat.app.t */
class C2124t extends C2078d implements C1361a<Activity> {

    /* renamed from: A */
    private ViewGroup f7751A;

    /* renamed from: B */
    private LayoutInflater f7752B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2081f f7753C;

    /* renamed from: D */
    private C1539h f7754D;

    /* renamed from: E */
    private boolean f7755E = false;

    /* renamed from: F */
    private boolean f7756F = false;

    /* renamed from: G */
    private boolean f7757G = false;

    /* renamed from: H */
    private int f7758H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1558a f7759I;

    /* renamed from: J */
    private ViewGroup f7760J = null;

    /* renamed from: K */
    private final String f7761K = String.valueOf(SystemClock.elapsedRealtimeNanos());

    /* renamed from: L */
    private boolean f7762L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f7763M;

    /* renamed from: N */
    private BaseResponseStateManager f7764N;

    /* renamed from: O */
    private CharSequence f7765O;

    /* renamed from: P */
    Window f7766P;

    /* renamed from: Q */
    private C2128d f7767Q;

    /* renamed from: R */
    private final Runnable f7768R = new C2127c();

    /* renamed from: y */
    private ActionBarOverlayLayout f7769y;

    /* renamed from: z */
    private ActionBarContainer f7770z;

    /* renamed from: miuix.appcompat.app.t$a */
    class C2125a extends BaseResponseStateManager {
        C2125a(C1361a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Context mo7636c() {
            return C2124t.this.f7651d;
        }
    }

    /* renamed from: miuix.appcompat.app.t$b */
    class C2126b extends C0091g {
        C2126b(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo311b() {
            C2124t.this.f7759I.mo5706i();
        }
    }

    /* renamed from: miuix.appcompat.app.t$c */
    class C2127c implements Runnable {
        C2127c() {
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
        public void run() {
            ? l = C2124t.this.mo7416l();
            if ((C2124t.this.mo7424u() || C2124t.this.f7763M) && C2124t.this.f7753C.onCreatePanelMenu(0, l) && C2124t.this.f7753C.onPreparePanel(0, (View) null, l)) {
                C2124t.this.mo7402Q(l);
            } else {
                C2124t.this.mo7402Q((C2242c) null);
            }
        }
    }

    /* renamed from: miuix.appcompat.app.t$d */
    class C2128d extends C0195i {
        public C2128d(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            if (C2076b0.m8273g(C2124t.this.f7651d.mo3605g0(), motionEvent)) {
                return true;
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (C2076b0.m8276l(C2124t.this.f7651d.mo3605g0(), keyEvent)) {
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (C2076b0.m8270a(C2124t.this.f7651d.mo3605g0(), keyEvent)) {
                return true;
            }
            return super.dispatchKeyShortcutEvent(keyEvent);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (C2076b0.m8279o(C2124t.this.f7651d.mo3605g0(), motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            if (C2076b0.m8271b(C2124t.this.f7651d.mo3605g0(), motionEvent)) {
                return true;
            }
            return super.dispatchTrackballEvent(motionEvent);
        }

        public void onContentChanged() {
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C2076b0.m8277m(C2124t.this.f7651d.mo3605g0(), list, menu, i);
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    C2124t(C2118q qVar, C2081f fVar, C1539h hVar) {
        super(qVar);
        this.f7753C = fVar;
        this.f7754D = hVar;
    }

    /* renamed from: M0 */
    private void m8596M0(boolean z, int i, boolean z2, boolean z3) {
        if (!this.f7756F) {
            return;
        }
        if (!z3 && !C1877a.f7249b) {
            return;
        }
        if (this.f7757G != z && this.f7754D.mo5659a(z)) {
            this.f7757G = z;
            this.f7759I.mo5709l(z);
            m8598U0(this.f7757G);
            ViewGroup.LayoutParams c = this.f7759I.mo5701c();
            if (c != null) {
                int i2 = z ? -2 : -1;
                c.height = i2;
                c.width = i2;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f7769y;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.requestLayout();
                this.f7769y.mo7827L(z);
            }
            if (z2) {
                m8611v0(z);
            }
        } else if (i != this.f7758H) {
            this.f7758H = i;
            this.f7759I.mo5709l(z);
        }
    }

    /* renamed from: R0 */
    private boolean m8597R0() {
        C1558a aVar = this.f7759I;
        return aVar != null && aVar.mo5705g();
    }

    /* renamed from: U0 */
    private void m8598U0(boolean z) {
        Window window = this.f7651d.getWindow();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z2 = ((systemUiVisibility & 1024) != 0) || (mo7422s() != 0);
        if (!z) {
            systemUiVisibility = z2 ? systemUiVisibility | 1024 : systemUiVisibility & -1025;
            if (Build.VERSION.SDK_INT >= 30) {
                if (z2) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    window.setDecorFitsSystemWindows(true);
                }
            }
        } else {
            window.addFlags(201326592);
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
            }
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* renamed from: c0 */
    private void m8603c0(Window window) {
        if (this.f7766P == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C2128d)) {
                C2128d dVar = new C2128d(callback);
                this.f7767Q = dVar;
                window.setCallback(dVar);
                this.f7766P = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: e0 */
    private void m8604e0() {
        C2118q qVar;
        Window window = this.f7766P;
        if (window == null) {
            if (window == null && (qVar = this.f7651d) != null) {
                m8603c0(qVar.getWindow());
            }
            if (this.f7766P == null) {
                throw new IllegalStateException("We have not been given a Window");
            }
        }
    }

    /* renamed from: j0 */
    private int m8605j0(Window window) {
        Context context = window.getContext();
        int i = C1649c.m6959d(context, C1347c.f4553U, false) ? C1649c.m6959d(context, C1347c.f4554V, false) ? C1354j.f4749H : C1354j.f4748G : C1354j.f4751J;
        int c = C1649c.m6958c(context, C1347c.f4545M);
        if (c > 0 && m8608s0() && m8609t0(context)) {
            i = c;
        }
        if (!window.isFloating() && (window.getCallback() instanceof Dialog)) {
            C2869a.m11866a(window, C1649c.m6965j(context, C1347c.f4574h0, 0));
        }
        return i;
    }

    /* renamed from: p0 */
    private void m8606p0() {
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (!this.f7655h) {
            m8604e0();
            this.f7655h = true;
            Window window = this.f7651d.getWindow();
            this.f7752B = window.getLayoutInflater();
            TypedArray obtainStyledAttributes = this.f7651d.obtainStyledAttributes(C1357m.f4899Z2);
            if (obtainStyledAttributes.getBoolean(C1357m.f4924e3, this.f7755E)) {
                this.f7764N = new C2125a(this);
            }
            if (obtainStyledAttributes.getInt(C1357m.f4974o3, 0) == 1) {
                this.f7651d.getWindow().setGravity(80);
            }
            int i = C1357m.f4929f3;
            if (obtainStyledAttributes.hasValue(i)) {
                if (obtainStyledAttributes.getBoolean(i, false)) {
                    mo7399N(8);
                }
                if (obtainStyledAttributes.getBoolean(C1357m.f4934g3, false)) {
                    mo7399N(9);
                }
                this.f7756F = obtainStyledAttributes.getBoolean(C1357m.f4919d3, false);
                this.f7757G = obtainStyledAttributes.getBoolean(C1357m.f4969n3, false);
                mo7403R(obtainStyledAttributes.getInt(C1357m.f5004u3, 0));
                this.f7758H = this.f7651d.getResources().getConfiguration().uiMode;
                m8607q0(window);
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7769y;
                if (actionBarOverlayLayout2 != null) {
                    actionBarOverlayLayout2.setCallback(this.f7651d);
                    this.f7769y.setContentInsetStateCallback(this.f7651d);
                    this.f7769y.setExtraPaddingObserver(this.f7651d);
                    this.f7769y.setTranslucentStatus(mo7422s());
                }
                if (this.f7658k && (actionBarOverlayLayout = this.f7769y) != null) {
                    this.f7770z = (ActionBarContainer) actionBarOverlayLayout.findViewById(C1352h.f4711d);
                    this.f7769y.setOverlayMode(this.f7659l);
                    ActionBarView actionBarView = (ActionBarView) this.f7769y.findViewById(C1352h.f4705a);
                    this.f7652e = actionBarView;
                    actionBarView.setLifecycleOwner(mo7420q());
                    this.f7652e.setWindowCallback(this.f7651d);
                    if (this.f7657j) {
                        this.f7652e.mo7903O0();
                    }
                    if (mo7424u()) {
                        this.f7652e.setEndActionMenuEnable(true);
                    }
                    if (this.f7652e.getCustomNavigationView() != null) {
                        ActionBarView actionBarView2 = this.f7652e;
                        actionBarView2.setDisplayOptions(actionBarView2.getDisplayOptions() | 16);
                    }
                    boolean equals = "splitActionBarWhenNarrow".equals(mo7423t());
                    this.f7763M = equals ? this.f7651d.getResources().getBoolean(C1348d.f4595c) : obtainStyledAttributes.getBoolean(C1357m.f4999t3, false);
                    if (this.f7763M) {
                        mo7412h(true, equals, this.f7769y);
                    }
                    if (obtainStyledAttributes.getBoolean(C1357m.f4914c3, false)) {
                        mo7400O(true, false);
                    } else {
                        this.f7651d.getWindow().getDecorView().post(this.f7768R);
                    }
                }
                obtainStyledAttributes.recycle();
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a miui theme (or descendant) with this activity.");
        }
    }

    /* renamed from: q0 */
    private void m8607q0(Window window) {
        this.f7759I = this.f7756F ? C1559b.m6692a(this.f7651d) : null;
        this.f7760J = null;
        View inflate = View.inflate(this.f7651d, m8605j0(window), (ViewGroup) null);
        ViewGroup viewGroup = inflate;
        if (this.f7759I != null) {
            boolean R0 = m8597R0();
            this.f7757G = R0;
            this.f7759I.mo5709l(R0);
            ViewGroup j = this.f7759I.mo5707j(inflate, this.f7757G);
            this.f7760J = j;
            m8598U0(this.f7757G);
            viewGroup = j;
            if (this.f7759I.mo5711n()) {
                this.f7651d.mo253e().mo291b(this.f7651d, new C2126b(true));
                viewGroup = j;
            }
        }
        View findViewById = viewGroup.findViewById(C1352h.f4723j);
        if (findViewById instanceof ActionBarOverlayLayout) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) findViewById;
            this.f7769y = actionBarOverlayLayout;
            actionBarOverlayLayout.setLifecycleOwner(mo7420q());
            ViewGroup viewGroup2 = (ViewGroup) this.f7769y.findViewById(16908290);
            ViewGroup viewGroup3 = (ViewGroup) window.findViewById(16908290);
            if (viewGroup3 != null) {
                while (viewGroup3.getChildCount() > 0) {
                    View childAt = viewGroup3.getChildAt(0);
                    viewGroup3.removeViewAt(0);
                    viewGroup2.addView(childAt);
                }
                viewGroup3.setId(-1);
                viewGroup2.setId(16908290);
                if (viewGroup3 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup3).setForeground((Drawable) null);
                }
            }
        }
        window.setContentView(viewGroup);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7769y;
        if (actionBarOverlayLayout2 != null) {
            this.f7751A = (ViewGroup) actionBarOverlayLayout2.findViewById(16908290);
        }
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5704f(this.f7760J, m8597R0());
        }
    }

    /* renamed from: s0 */
    private boolean m8608s0() {
        return "android".equals(mo7419p().getApplicationContext().getApplicationInfo().packageName);
    }

    /* renamed from: t0 */
    private static boolean m8609t0(Context context) {
        return C1649c.m6959d(context, C1347c.f4553U, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m8610u0() {
        C2118q qVar = this.f7651d;
        C2693a.m11252u(qVar, qVar.mo7565I0(), (Configuration) null, true);
    }

    /* renamed from: v0 */
    private void m8611v0(boolean z) {
        this.f7754D.mo5660b(z);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7390A(miuix.appcompat.internal.view.menu.C2242c r2) {
        /*
            r1 = this;
            miuix.appcompat.app.q r0 = r1.f7651d
            boolean r2 = r0.onCreateOptionsMenu(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.C2124t.mo7390A(miuix.appcompat.internal.view.menu.c):boolean");
    }

    /* renamed from: A0 */
    public void mo7600A0() {
        this.f7753C.mo7436b();
        C2191h hVar = (C2191h) mo7411g();
        if (hVar != null) {
            hVar.mo363A(true);
        }
    }

    /* renamed from: B0 */
    public boolean mo7601B0(int i, View view, Menu menu) {
        return i != 0 && this.f7753C.onPreparePanel(i, view, menu);
    }

    /* renamed from: C */
    public boolean mo7392C(int i, MenuItem menuItem) {
        if (this.f7753C.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0 && menuItem.getItemId() == 16908332 && mo7411g() != null && (mo7411g().mo371k() & 4) != 0) {
            if (!(this.f7651d.getParent() == null ? this.f7651d.onNavigateUp() : this.f7651d.getParent().onNavigateUpFromChild(this.f7651d))) {
                this.f7651d.finish();
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public void mo7602C0(Bundle bundle) {
        SparseArray sparseParcelableArray;
        this.f7753C.mo7437c(bundle);
        if (this.f7770z != null && (sparseParcelableArray = bundle.getSparseParcelableArray("miuix:ActionBar")) != null) {
            this.f7770z.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: D */
    public void mo5203D(Configuration configuration, C1511e eVar, boolean z) {
        mo5205a(configuration, eVar, z);
    }

    /* renamed from: D0 */
    public void mo7603D0(Bundle bundle) {
        this.f7753C.mo7438d(bundle);
        if (!(bundle == null || this.f7759I == null)) {
            C2083a.m8344B(this.f7651d, bundle);
            C2095c.m8428V(this.f7651d.getTaskId(), this.f7651d.mo7560E0(), bundle);
        }
        if (this.f7770z != null) {
            SparseArray sparseArray = new SparseArray();
            this.f7770z.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("miuix:ActionBar", sparseArray);
        }
    }

    /* renamed from: E0 */
    public void mo7604E0() {
        this.f7753C.mo7435a();
        mo7417n(false);
        C2191h hVar = (C2191h) mo7411g();
        if (hVar != null) {
            hVar.mo363A(false);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7394F(miuix.appcompat.internal.view.menu.C2242c r2) {
        /*
            r1 = this;
            miuix.appcompat.app.q r0 = r1.f7651d
            boolean r2 = r0.onPrepareOptionsMenu(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.C2124t.mo7394F(miuix.appcompat.internal.view.menu.c):boolean");
    }

    /* renamed from: F0 */
    public void mo7605F0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7769y;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuCustomView(view);
        }
    }

    /* renamed from: G */
    public boolean mo7606G() {
        return m8597R0();
    }

    /* renamed from: G0 */
    public void mo7607G0(int i) {
        if (!this.f7655h) {
            m8606p0();
        }
        ViewGroup viewGroup = this.f7751A;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f7752B.inflate(i, this.f7751A);
        }
        this.f7767Q.mo685a().onContentChanged();
    }

    /* renamed from: H0 */
    public void mo7608H0(View view) {
        mo7609I0(view, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: I */
    public ActionMode mo7396I(ActionMode.Callback callback) {
        return mo7411g() != null ? ((C2191h) mo7411g()).mo8152N0(callback) : super.mo7396I(callback);
    }

    /* renamed from: I0 */
    public void mo7609I0(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f7655h) {
            m8606p0();
        }
        ViewGroup viewGroup = this.f7751A;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f7751A.addView(view, layoutParams);
        }
        this.f7767Q.mo685a().onContentChanged();
    }

    /* renamed from: J */
    public Rect mo7566J() {
        return this.f7668u;
    }

    /* renamed from: J0 */
    public void mo7610J0(boolean z) {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5708k(z);
        }
    }

    /* renamed from: K0 */
    public void mo7611K0(boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7769y;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraHorizontalPaddingEnable(z);
        }
    }

    /* renamed from: L0 */
    public void mo7612L0(boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7769y;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraPaddingApplyToContentEnable(z);
        }
    }

    /* renamed from: N0 */
    public void mo7613N0(C1538g gVar) {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5710m(gVar);
        }
    }

    /* renamed from: O0 */
    public void mo7614O0(boolean z) {
        this.f7755E = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo7615P0(CharSequence charSequence) {
        this.f7765O = charSequence;
        ActionBarView actionBarView = this.f7652e;
        if (actionBarView != null) {
            actionBarView.setWindowTitle(charSequence);
        }
    }

    /* renamed from: Q0 */
    public boolean mo7616Q0() {
        C1558a aVar = this.f7759I;
        if (aVar == null) {
            return false;
        }
        boolean a = aVar.mo5699a();
        if (a) {
            this.f7762L = true;
        }
        return a;
    }

    /* renamed from: S0 */
    public void mo7617S0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5712o();
        }
    }

    /* renamed from: T0 */
    public ActionMode mo7618T0(ActionMode.Callback callback) {
        if (callback instanceof C2407k.C2409b) {
            mo7410f(this.f7769y);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7769y;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.startActionMode(callback);
        }
        return null;
    }

    /* renamed from: a */
    public void mo5205a(Configuration configuration, C1511e eVar, boolean z) {
        C2118q qVar = this.f7651d;
        if (qVar instanceof C1361a) {
            qVar.mo5205a(configuration, eVar, z);
        }
    }

    /* renamed from: a0 */
    public void mo7619a0(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f7655h) {
            m8606p0();
        }
        ViewGroup viewGroup = this.f7751A;
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        this.f7767Q.mo685a().onContentChanged();
    }

    /* renamed from: b */
    public void mo7407b(Rect rect) {
        super.mo7407b(rect);
        List<Fragment> t0 = this.f7651d.mo3605g0().mo3399t0();
        int size = t0.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = t0.get(i);
            if (fragment instanceof C2132x) {
                C2132x xVar = (C2132x) fragment;
                if (!xVar.mo7639E()) {
                    xVar.mo7407b(rect);
                }
            }
        }
    }

    /* renamed from: b0 */
    public void mo7620b0(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.f7764N;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.mo9054i(configuration);
        }
    }

    /* renamed from: c */
    public boolean mo6474c(C2242c cVar, MenuItem menuItem) {
        return this.f7651d.onMenuItemSelected(0, menuItem);
    }

    /* renamed from: d0 */
    public void mo7621d0(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.f7764N;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.mo9055j(configuration);
        }
    }

    /* renamed from: f0 */
    public void mo7622f0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5649p();
        }
    }

    /* renamed from: g0 */
    public void mo7623g0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5648I();
        }
    }

    /* renamed from: h0 */
    public void mo7624h0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5647F();
        }
    }

    /* renamed from: i0 */
    public String mo7625i0() {
        return this.f7761K;
    }

    public void invalidateOptionsMenu() {
        if (!this.f7651d.isFinishing()) {
            this.f7768R.run();
        }
    }

    /* renamed from: k */
    public Context mo7415k() {
        return this.f7651d;
    }

    /* renamed from: k0 */
    public View mo7626k0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            return aVar.mo5700b();
        }
        return null;
    }

    /* renamed from: l0 */
    public Activity mo5204L() {
        return this.f7651d;
    }

    /* renamed from: m */
    public void mo7584m(int i) {
    }

    /* renamed from: m0 */
    public void mo7628m0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5702d();
        }
    }

    /* renamed from: n0 */
    public void mo7629n0() {
        C1558a aVar = this.f7759I;
        if (aVar != null) {
            aVar.mo5703e();
        }
    }

    /* renamed from: o0 */
    public void mo7630o0(boolean z, Bundle bundle) {
        if (z) {
            Intent intent = this.f7651d.getIntent();
            if (intent == null || !C2095c.m8423N(intent)) {
                C2083a.m8363w(this.f7651d, bundle);
            } else {
                C2095c.m8419H(this.f7651d, intent, bundle);
            }
        }
    }

    /* renamed from: q */
    public C1048m mo7420q() {
        return this.f7651d;
    }

    /* renamed from: r0 */
    public boolean mo7631r0() {
        return this.f7762L;
    }

    /* renamed from: v */
    public C2071a mo7378v() {
        if (!this.f7655h) {
            m8606p0();
        }
        if (this.f7769y == null) {
            return null;
        }
        return new C2191h(this.f7651d, this.f7769y);
    }

    /* renamed from: w0 */
    public void mo7632w0(Bundle bundle) {
        this.f7651d.mo7559D0();
        boolean z = true;
        if (!C1874c.f7245a) {
            C1874c.f7245a = true;
            C1874c.m7795b(mo7415k().getApplicationContext());
        }
        this.f7753C.mo7439e(bundle);
        m8606p0();
        mo7630o0(this.f7756F, bundle);
        if (C1649c.m6965j(this.f7651d, C1347c.f4556X, 0) == 0) {
            z = false;
        }
        boolean d = C1649c.m6959d(this.f7651d, C1347c.f4557Y, z);
        boolean d2 = C1649c.m6959d(this.f7651d, C1347c.f4555W, d);
        mo7611K0(d);
        mo7612L0(d2);
    }

    /* renamed from: x0 */
    public boolean mo7633x0(int i, Menu menu) {
        return i != 0 && this.f7753C.onCreatePanelMenu(i, menu);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [miuix.appcompat.internal.view.menu.c] */
    /* JADX WARNING: type inference failed for: r5v4, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* JADX WARNING: type inference failed for: r5v5, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r5 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r2 = false;
        r5 = r5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo7634y0(int r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0009
            miuix.appcompat.app.f r0 = r4.f7753C
            android.view.View r5 = r0.onCreatePanelView(r5)
            return r5
        L_0x0009:
            boolean r5 = r4.mo7424u()
            r0 = 0
            if (r5 != 0) goto L_0x0014
            boolean r5 = r4.f7763M
            if (r5 == 0) goto L_0x0047
        L_0x0014:
            miuix.appcompat.internal.view.menu.c r5 = r4.f7653f
            android.view.ActionMode r1 = r4.f7654g
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x003a
            if (r5 != 0) goto L_0x002e
            miuix.appcompat.internal.view.menu.c r5 = r4.mo7416l()
            r4.mo7402Q(r5)
            r5.mo8362a0()
            miuix.appcompat.app.f r1 = r4.f7753C
            boolean r2 = r1.onCreatePanelMenu(r3, r5)
        L_0x002e:
            if (r2 == 0) goto L_0x003e
            r5.mo8362a0()
            miuix.appcompat.app.f r1 = r4.f7753C
            boolean r2 = r1.onPreparePanel(r3, r0, r5)
            goto L_0x003e
        L_0x003a:
            if (r5 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            if (r2 == 0) goto L_0x0044
            r5.mo8360Z()
            goto L_0x0047
        L_0x0044:
            r4.mo7402Q(r0)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.C2124t.mo7634y0(int):android.view.View");
    }

    /* renamed from: z */
    public void mo7428z(Configuration configuration) {
        C2118q qVar = this.f7651d;
        C2693a.m11252u(qVar, qVar.mo7565I0(), configuration, false);
        this.f7651d.getWindow().getDecorView().post(new C2123s(this));
        super.mo7428z(configuration);
        m8596M0(mo7606G(), configuration.uiMode, true, C1877a.f7250c);
        this.f7753C.onConfigurationChanged(configuration);
        if (mo7425w()) {
            mo7404S();
        }
    }

    /* renamed from: z0 */
    public void mo7635z0(int i, Menu menu) {
        this.f7753C.onPanelClosed(i, menu);
    }
}
