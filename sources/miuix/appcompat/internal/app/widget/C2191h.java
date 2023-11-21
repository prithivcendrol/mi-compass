package miuix.appcompat.internal.app.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.C0116a;
import androidx.fragment.app.C0949f0;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.C2071a;
import miuix.appcompat.app.C2118q;
import miuix.appcompat.app.strategy.CommonActionBarStrategy;
import miuix.appcompat.internal.view.menu.action.PhoneActionMenuView;
import miuix.view.C2407k;
import p018c2.C1347c;
import p018c2.C1352h;
import p018c2.C1354j;
import p048h2.C1627a;
import p048h2.C1628b;
import p048h2.C1629c;
import p055i3.C1649c;
import p055i3.C1652f;
import p078m2.C1918a;
import p078m2.C1919b;
import p078m2.C1924d;
import p078m2.C1925e;
import p078m2.C1929h;
import p117t2.C2693a;
import p117t2.C2697e;
import p117t2.C2698f;
import p132w2.C2885a;
import p132w2.C2886b;

/* renamed from: miuix.appcompat.internal.app.widget.h */
public class C2191h extends C2071a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static C0116a.C0121e f8268U = new C2192a();

    /* renamed from: A */
    private int f8269A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f8270B;

    /* renamed from: C */
    private boolean f8271C;

    /* renamed from: D */
    private boolean f8272D;

    /* renamed from: E */
    private boolean f8273E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f8274F = true;

    /* renamed from: G */
    private boolean f8275G;

    /* renamed from: H */
    private C1925e f8276H;

    /* renamed from: I */
    private SearchActionModeView f8277I;

    /* renamed from: J */
    private C1919b.C1920a f8278J = new C2193b();

    /* renamed from: K */
    private IStateStyle f8279K;

    /* renamed from: L */
    private int f8280L;

    /* renamed from: M */
    private boolean f8281M;

    /* renamed from: N */
    private int f8282N;

    /* renamed from: O */
    private C1629c f8283O;

    /* renamed from: P */
    private int f8284P = -1;

    /* renamed from: Q */
    private Rect f8285Q;

    /* renamed from: R */
    private int f8286R = 0;

    /* renamed from: S */
    private int f8287S = 0;

    /* renamed from: T */
    private int f8288T = 0;

    /* renamed from: a */
    ActionMode f8289a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f8290b;

    /* renamed from: c */
    private Context f8291c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ActionBarOverlayLayout f8292d;

    /* renamed from: e */
    private ActionBarContainer f8293e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ActionBarView f8294f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ActionBarContextView f8295g;

    /* renamed from: h */
    private ActionBarContainer f8296h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public PhoneActionMenuView f8297i;

    /* renamed from: j */
    private View f8298j;

    /* renamed from: k */
    private View.OnClickListener f8299k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ScrollingTabContainerView f8300l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ScrollingTabContainerView f8301m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public SecondaryTabContainerView f8302n;

    /* renamed from: o */
    private SecondaryTabContainerView f8303o;

    /* renamed from: p */
    private C2211t f8304p;

    /* renamed from: q */
    private final HashMap<View, Integer> f8305q = new HashMap<>();

    /* renamed from: r */
    private final HashSet<C2885a> f8306r = new HashSet<>();

    /* renamed from: s */
    private ArrayList<C2198g> f8307s = new ArrayList<>();

    /* renamed from: t */
    private C2198g f8308t;

    /* renamed from: u */
    private boolean f8309u = false;

    /* renamed from: v */
    private FragmentManager f8310v;

    /* renamed from: w */
    private int f8311w = -1;

    /* renamed from: x */
    private boolean f8312x;

    /* renamed from: y */
    private ArrayList<C0116a.C0118b> f8313y = new ArrayList<>();

    /* renamed from: z */
    private int f8314z;

    /* renamed from: miuix.appcompat.internal.app.widget.h$a */
    class C2192a implements C0116a.C0121e {
        C2192a() {
        }

        /* renamed from: A */
        public void mo397A(C0116a.C0120d dVar, C0949f0 f0Var) {
            C2198g gVar = (C2198g) dVar;
            if (gVar.f8323b != null) {
                gVar.f8323b.mo397A(dVar, f0Var);
            }
            if (gVar.f8322a != null) {
                gVar.f8322a.mo397A(dVar, f0Var);
            }
        }

        /* renamed from: o */
        public void mo398o(C0116a.C0120d dVar, C0949f0 f0Var) {
            C2198g gVar = (C2198g) dVar;
            if (gVar.f8323b != null) {
                gVar.f8323b.mo398o(dVar, f0Var);
            }
            if (gVar.f8322a != null) {
                gVar.f8322a.mo398o(dVar, f0Var);
            }
        }

        /* renamed from: y */
        public void mo399y(C0116a.C0120d dVar, C0949f0 f0Var) {
            C2198g gVar = (C2198g) dVar;
            if (gVar.f8323b != null) {
                gVar.f8323b.mo399y(dVar, f0Var);
            }
            if (gVar.f8322a != null) {
                gVar.f8322a.mo399y(dVar, f0Var);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$b */
    class C2193b implements C1919b.C1920a {
        C2193b() {
        }

        /* renamed from: a */
        public void mo6492a(ActionMode actionMode) {
            C2191h.this.mo8158Y(false);
            C2191h.this.f8289a = null;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$c */
    class C2194c implements View.OnClickListener {
        C2194c() {
        }

        public void onClick(View view) {
            if (C2191h.this.f8297i != null && C2191h.this.f8297i.mo8248w()) {
                C2191h.this.f8297i.getPresenter().mo8284T(true);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$d */
    class C2195d implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        int f8317d = 0;

        C2195d() {
        }

        public boolean onPreDraw() {
            int measuredWidth = C2191h.this.f8292d.getMeasuredWidth();
            if (this.f8317d == measuredWidth && !C2191h.this.f8270B) {
                return true;
            }
            boolean unused = C2191h.this.f8270B = false;
            this.f8317d = measuredWidth;
            C2191h hVar = C2191h.this;
            hVar.m9140Z(hVar.f8294f, C2191h.this.f8295g);
            C2191h.this.f8292d.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$e */
    class C2196e implements View.OnLayoutChangeListener {

        /* renamed from: a */
        int f8319a = 0;

        C2196e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m9208b() {
            C2191h hVar = C2191h.this;
            hVar.m9140Z(hVar.f8294f, C2191h.this.f8295g);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            if (this.f8319a != i9 || C2191h.this.f8270B) {
                boolean unused = C2191h.this.f8270B = false;
                this.f8319a = i9;
                C2191h.this.f8294f.post(new C2200i(this));
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$f */
    class C2197f implements View.OnClickListener {
        C2197f() {
        }

        public void onClick(View view) {
            ActionMode actionMode = C2191h.this.f8289a;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$g */
    public class C2198g extends C0116a.C0120d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C0116a.C0121e f8322a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C0116a.C0121e f8323b;

        /* renamed from: c */
        private Drawable f8324c;

        /* renamed from: d */
        private CharSequence f8325d;

        /* renamed from: e */
        private CharSequence f8326e;

        /* renamed from: f */
        private int f8327f = -1;

        /* renamed from: g */
        private View f8328g;

        /* renamed from: h */
        public boolean f8329h = true;

        public C2198g() {
        }

        /* renamed from: a */
        public CharSequence mo389a() {
            return this.f8326e;
        }

        /* renamed from: b */
        public View mo390b() {
            return this.f8328g;
        }

        /* renamed from: c */
        public Drawable mo391c() {
            return this.f8324c;
        }

        /* renamed from: d */
        public int mo392d() {
            return this.f8327f;
        }

        /* renamed from: e */
        public CharSequence mo393e() {
            return this.f8325d;
        }

        /* renamed from: f */
        public void mo394f() {
            C2191h.this.mo8143D0(this);
        }

        /* renamed from: g */
        public C0116a.C0120d mo395g(C0116a.C0121e eVar) {
            this.f8322a = eVar;
            return this;
        }

        /* renamed from: h */
        public C0116a.C0120d mo396h(int i) {
            return mo8180m(C2191h.this.f8290b.getResources().getText(i));
        }

        /* renamed from: k */
        public C0116a.C0121e mo8178k() {
            return C2191h.f8268U;
        }

        /* renamed from: l */
        public void mo8179l(int i) {
            this.f8327f = i;
        }

        /* renamed from: m */
        public C0116a.C0120d mo8180m(CharSequence charSequence) {
            this.f8325d = charSequence;
            if (this.f8327f >= 0) {
                C2191h.this.f8300l.mo8032k(this.f8327f);
                C2191h.this.f8301m.mo8032k(this.f8327f);
                C2191h.this.f8302n.mo8108p(this.f8327f);
                C2191h.this.f8302n.mo8108p(this.f8327f);
            }
            return this;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.h$h */
    private static class C2199h extends TransitionListener {

        /* renamed from: a */
        private WeakReference<View> f8331a;

        /* renamed from: b */
        private WeakReference<C2191h> f8332b;

        public C2199h(View view, C2191h hVar) {
            this.f8331a = new WeakReference<>(view);
            this.f8332b = new WeakReference<>(hVar);
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            C2191h hVar = this.f8332b.get();
            View view = this.f8331a.get();
            if (view != null && hVar != null && !hVar.f8274F) {
                view.setVisibility(8);
            }
        }
    }

    public C2191h(C2118q qVar, ViewGroup viewGroup) {
        this.f8290b = qVar;
        this.f8310v = qVar.mo3605g0();
        mo8169v0(viewGroup);
        this.f8294f.setWindowTitle(qVar.getTitle());
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m9120A0(int i, float f, int i2, int i3) {
        this.f8287S = i2;
        this.f8288T = i3;
    }

    /* renamed from: B0 */
    private void m9121B0() {
        this.f8277I.measure(ViewGroup.getChildMeasureSpec(this.f8292d.getMeasuredWidth(), 0, this.f8277I.getLayoutParams().width), ViewGroup.getChildMeasureSpec(this.f8292d.getMeasuredHeight(), 0, this.f8277I.getLayoutParams().height));
    }

    /* renamed from: I0 */
    private void m9122I0(boolean z) {
        this.f8293e.setTabContainer((ScrollingTabContainerView) null);
        this.f8294f.mo7980z1(this.f8300l, this.f8301m, this.f8302n, this.f8303o);
        boolean z2 = mo8164q0() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f8300l;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.f8300l.setEmbeded(true);
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.f8301m;
        if (scrollingTabContainerView2 != null) {
            if (z2) {
                scrollingTabContainerView2.setVisibility(0);
            } else {
                scrollingTabContainerView2.setVisibility(8);
            }
            this.f8301m.setEmbeded(true);
        }
        SecondaryTabContainerView secondaryTabContainerView = this.f8302n;
        if (secondaryTabContainerView != null) {
            if (z2) {
                secondaryTabContainerView.setVisibility(0);
            } else {
                secondaryTabContainerView.setVisibility(8);
            }
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.f8303o;
        if (secondaryTabContainerView2 != null) {
            if (z2) {
                secondaryTabContainerView2.setVisibility(0);
            } else {
                secondaryTabContainerView2.setVisibility(8);
            }
        }
        this.f8294f.setCollapsable(false);
    }

    /* renamed from: O0 */
    private IStateStyle m9129O0(boolean z, String str, AnimState animState, AnimState animState2) {
        int height = this.f8293e.getHeight();
        if (z) {
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.25f));
            if (animState2 == null) {
                animState2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d);
            }
            IStateStyle state = Folme.useAt(this.f8293e).state();
            if (animState != null) {
                animState.setTag(str);
                state = state.setTo((Object) animState);
            }
            return state.mo6815to(animState2, animConfig);
        }
        AnimConfig animConfig2 = new AnimConfig();
        animConfig2.setEase(EaseManager.getStyle(-2, 1.0f, 0.35f));
        animConfig2.addListeners(new C2199h(this.f8293e, this));
        if (animState2 == null) {
            animState2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, (double) ((-height) - 100)).add(ViewProperty.ALPHA, 0.0d);
        }
        IStateStyle state2 = Folme.useAt(this.f8293e).state();
        if (animState != null) {
            animState.setTag(str);
            state2 = state2.setTo((Object) animState);
        }
        return state2.mo6815to(animState2, animConfig2);
    }

    /* renamed from: T0 */
    private void m9135T0(boolean z) {
        m9137U0(z, true, (AnimState) null);
    }

    /* renamed from: U0 */
    private void m9137U0(boolean z, boolean z2, AnimState animState) {
        if (m9141a0(this.f8271C, this.f8272D, this.f8273E)) {
            if (!this.f8274F) {
                this.f8274F = true;
                m9147j0(z, z2, animState);
            }
        } else if (this.f8274F) {
            this.f8274F = false;
            m9145h0(z, z2, animState);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m9140Z(ActionBarView actionBarView, ActionBarContextView actionBarContextView) {
        C1629c cVar = this.f8283O;
        if (cVar != null) {
            C1627a config = cVar.config(this, m9150m0(this.f8293e, this.f8294f));
            if (!(actionBarView == null || config == null)) {
                if (!actionBarView.mo7752m() || config.f6456a) {
                    if (!actionBarView.mo7750l() || !config.f6458c) {
                        actionBarView.mo7780w(config.f6457b, false, true);
                    }
                    actionBarView.setResizable(config.f6458c);
                }
                if (!actionBarView.mo7908Z0() || config.f6459d) {
                    actionBarView.setEndActionMenuItemLimit(config.f6460e);
                }
            }
            if (!(actionBarContextView == null || config == null || (actionBarContextView.mo7752m() && !config.f6456a))) {
                if (!actionBarContextView.mo7750l() || !config.f6458c) {
                    actionBarContextView.mo7780w(config.f6457b, false, true);
                }
                actionBarContextView.setResizable(config.f6458c);
            }
            this.f8280L = mo8163p0();
            this.f8281M = mo8172y0();
        }
    }

    /* renamed from: a0 */
    private static boolean m9141a0(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b0 */
    private void m9142b0(C0116a.C0120d dVar, int i) {
        C2198g gVar = (C2198g) dVar;
        if (gVar.mo8178k() != null) {
            gVar.mo8179l(i);
            this.f8307s.add(i, gVar);
            int size = this.f8307s.size();
            while (true) {
                i++;
                if (i < size) {
                    this.f8307s.get(i).mo8179l(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    /* renamed from: d0 */
    private ActionMode m9143d0(ActionMode.Callback callback) {
        return callback instanceof C2407k.C2409b ? new C1929h(this.f8290b, callback) : new C1924d(this.f8290b, callback);
    }

    /* renamed from: g0 */
    private void m9144g0(boolean z) {
        m9145h0(z, true, (AnimState) null);
    }

    /* renamed from: h0 */
    private void m9145h0(boolean z, boolean z2, AnimState animState) {
        AnimState animState2;
        IStateStyle iStateStyle = this.f8279K;
        if (iStateStyle != null) {
            animState2 = iStateStyle.getCurrentState();
            this.f8279K.cancel();
        } else {
            animState2 = null;
        }
        if ((mo8173z0() || z) && z2) {
            this.f8279K = m9129O0(false, "HideActionBar", animState2, animState);
            return;
        }
        ActionBarContainer actionBarContainer = this.f8293e;
        actionBarContainer.setTranslationY((float) (-actionBarContainer.getHeight()));
        this.f8293e.setAlpha(0.0f);
        this.f8293e.setVisibility(8);
    }

    /* renamed from: i0 */
    private void m9146i0(boolean z) {
        m9147j0(z, true, (AnimState) null);
    }

    /* renamed from: j0 */
    private void m9147j0(boolean z, boolean z2, AnimState animState) {
        AnimState animState2;
        IStateStyle iStateStyle = this.f8279K;
        if (iStateStyle != null) {
            animState2 = iStateStyle.getCurrentState();
            this.f8279K.cancel();
        } else {
            animState2 = null;
        }
        boolean z3 = (mo8173z0() || z) && z2;
        if (this.f8289a instanceof C2407k) {
            this.f8293e.setVisibility(this.f8292d.mo7824F() ? 4 : 8);
        } else {
            this.f8293e.setVisibility(0);
        }
        if (z3) {
            this.f8279K = m9129O0(true, "ShowActionBar", animState2, animState);
            return;
        }
        this.f8293e.setTranslationY(0.0f);
        this.f8293e.setAlpha(1.0f);
    }

    /* renamed from: k0 */
    private void m9148k0(View view, int i) {
        int top = view.getTop();
        int i2 = this.f8287S;
        if (top != i2 + i) {
            view.offsetTopAndBottom((Math.max(0, i2) + i) - top);
        }
    }

    /* renamed from: l0 */
    private void m9149l0() {
        if (this.f8300l != null) {
            this.f8294f.mo7975t0();
            return;
        }
        C2212u uVar = new C2212u(this.f8290b);
        C2213v vVar = new C2213v(this.f8290b);
        C2215x xVar = new C2215x(this.f8290b);
        C2216y yVar = new C2216y(this.f8290b);
        uVar.setVisibility(0);
        vVar.setVisibility(0);
        xVar.setVisibility(0);
        yVar.setVisibility(0);
        this.f8294f.mo7980z1(uVar, vVar, xVar, yVar);
        uVar.setEmbeded(true);
        this.f8300l = uVar;
        this.f8301m = vVar;
        this.f8302n = xVar;
        this.f8303o = yVar;
    }

    /* renamed from: m0 */
    private C1628b m9150m0(ActionBarContainer actionBarContainer, ActionBarView actionBarView) {
        C1628b bVar = new C1628b();
        bVar.f6461a = this.f8292d.getDeviceType();
        bVar.f6462b = C2693a.m11238g(this.f8290b).f10512f;
        if (!(actionBarContainer == null || actionBarView == null)) {
            float f = actionBarView.getContext().getResources().getDisplayMetrics().density;
            Point j = C2693a.m11241j(actionBarView.getContext());
            int i = j.x;
            bVar.f6463c = i;
            bVar.f6465e = j.y;
            bVar.f6464d = C2698f.m11287o(f, (float) i);
            bVar.f6466f = C2698f.m11287o(f, (float) bVar.f6465e);
            int width = actionBarContainer.getWidth();
            bVar.f6467g = width;
            bVar.f6469i = C2698f.m11287o(f, (float) width);
            int measuredHeight = actionBarView.getMeasuredHeight();
            bVar.f6468h = measuredHeight;
            bVar.f6470j = C2698f.m11287o(f, (float) measuredHeight);
            bVar.f6471k = actionBarView.mo7752m();
            bVar.f6472l = actionBarView.getExpandState();
            bVar.f6473m = actionBarView.mo7750l();
            bVar.f6474n = actionBarView.mo7908Z0();
            bVar.f6475o = actionBarView.getEndActionMenuItemLimit();
        }
        return bVar;
    }

    /* renamed from: n0 */
    private int m9151n0() {
        int i = 32768;
        boolean z = true;
        int i2 = 0;
        boolean z2 = (mo371k() & 32768) != 0;
        if ((mo371k() & 16384) == 0) {
            z = false;
        }
        if (!z2) {
            i = 0;
        }
        if (z) {
            i2 = 16384;
        }
        return i | i2;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: A */
    public void mo363A(boolean z) {
        this.f8275G = z;
        if (z) {
            return;
        }
        if (mo374n()) {
            m9146i0(false);
        } else {
            m9144g0(false);
        }
    }

    /* renamed from: C */
    public void mo365C() {
        mo8149K0((AnimState) null);
    }

    /* renamed from: C0 */
    public void mo8142C0(boolean z) {
        this.f8293e.setIsMiuixFloating(z);
        SearchActionModeView searchActionModeView = this.f8277I;
        if (searchActionModeView != null) {
            searchActionModeView.mo8064I();
        }
    }

    /* renamed from: D0 */
    public void mo8143D0(C0116a.C0120d dVar) {
        mo8144E0(dVar, true);
    }

    /* renamed from: E */
    public void mo7357E(View view) {
        if (view == null) {
            Log.w("miuix-appcompat", "warning!! the view is null on registerCoordinateScrollView!!");
            return;
        }
        if (view instanceof C2885a) {
            C2885a aVar = (C2885a) view;
            this.f8306r.add(aVar);
            Rect rect = this.f8285Q;
            if (rect != null) {
                aVar.mo10179b(rect);
            }
        } else {
            HashMap<View, Integer> hashMap = this.f8305q;
            Rect rect2 = this.f8285Q;
            hashMap.put(view, Integer.valueOf(rect2 != null ? rect2.top : 0));
            Rect rect3 = this.f8285Q;
            if (rect3 != null) {
                this.f8305q.put(view, Integer.valueOf(rect3.top));
                m9148k0(view, this.f8285Q.top);
            }
        }
        if (this.f8293e.getActionBarCoordinateListener() == null) {
            this.f8293e.setActionBarCoordinateListener(mo8159c0());
        }
    }

    /* renamed from: E0 */
    public void mo8144E0(C0116a.C0120d dVar, boolean z) {
        if (this.f8309u) {
            this.f8309u = false;
            return;
        }
        this.f8309u = true;
        Context context = this.f8290b;
        if (!(context instanceof Activity) || (!((Activity) context).isDestroyed() && !((Activity) this.f8290b).isFinishing())) {
            int i = -1;
            if (mo8164q0() != 2) {
                if (dVar != null) {
                    i = dVar.mo392d();
                }
                this.f8311w = i;
                return;
            }
            C0949f0 k = this.f8310v.mo3392o().mo3562k();
            C2198g gVar = this.f8308t;
            if (gVar != dVar) {
                this.f8300l.mo8030i(dVar != null ? dVar.mo392d() : -1, z);
                this.f8301m.mo8030i(dVar != null ? dVar.mo392d() : -1, z);
                this.f8302n.setTabSelected(dVar != null ? dVar.mo392d() : -1);
                SecondaryTabContainerView secondaryTabContainerView = this.f8303o;
                if (dVar != null) {
                    i = dVar.mo392d();
                }
                secondaryTabContainerView.setTabSelected(i);
                C2198g gVar2 = this.f8308t;
                if (gVar2 != null) {
                    gVar2.mo8178k().mo398o(this.f8308t, k);
                }
                C2198g gVar3 = (C2198g) dVar;
                this.f8308t = gVar3;
                if (gVar3 != null) {
                    gVar3.f8329h = z;
                    gVar3.mo8178k().mo397A(this.f8308t, k);
                }
            } else if (gVar != null) {
                gVar.mo8178k().mo399y(this.f8308t, k);
                this.f8300l.mo8019c(dVar.mo392d());
                this.f8301m.mo8019c(dVar.mo392d());
                this.f8302n.mo8104l(dVar.mo392d());
                this.f8303o.mo8104l(dVar.mo392d());
            }
            if (!k.mo3434m()) {
                k.mo3429g();
            }
            this.f8309u = false;
        }
    }

    /* renamed from: F */
    public void mo7358F(View view) {
        this.f8294f.setEndView(view);
    }

    /* renamed from: F0 */
    public void mo8145F0(int i) {
        boolean z = true;
        if ((i & 4) != 0) {
            this.f8312x = true;
        }
        this.f8294f.setDisplayOptions(i);
        int displayOptions = this.f8294f.getDisplayOptions();
        if (this.f8293e != null && C2697e.m11268e(this.f8290b)) {
            this.f8293e.setEnableBlur((displayOptions & 32768) != 0);
        }
        if (this.f8296h != null && C2697e.m11268e(this.f8290b)) {
            ActionBarContainer actionBarContainer = this.f8296h;
            if ((i & 16384) == 0) {
                z = false;
            }
            actionBarContainer.setEnableBlur(z);
        }
    }

    /* renamed from: G */
    public void mo7359G(int i) {
        this.f8294f.setExpandStateByUser(i);
        this.f8294f.setExpandState(i);
        ActionBarContextView actionBarContextView = this.f8295g;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i);
            this.f8295g.setExpandState(i);
        }
    }

    /* renamed from: G0 */
    public void mo8146G0(int i, int i2) {
        int displayOptions = this.f8294f.getDisplayOptions();
        boolean z = true;
        if ((i2 & 4) != 0) {
            this.f8312x = true;
        }
        this.f8294f.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
        int displayOptions2 = this.f8294f.getDisplayOptions();
        if (this.f8293e != null && C2697e.m11268e(this.f8290b)) {
            this.f8293e.setEnableBlur((32768 & displayOptions2) != 0);
        }
        if (this.f8296h != null && C2697e.m11268e(this.f8290b)) {
            ActionBarContainer actionBarContainer = this.f8296h;
            if ((displayOptions2 & 16384) == 0) {
                z = false;
            }
            actionBarContainer.setEnableBlur(z);
        }
    }

    /* renamed from: H */
    public void mo7360H(boolean z) {
        this.f8294f.setResizable(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo8147H0(C1925e eVar) {
        if (this.f8276H != eVar) {
            this.f8276H = eVar;
            ActionBarView actionBarView = this.f8294f;
            if (actionBarView != null) {
                actionBarView.setExtraPaddingPolicy(eVar);
            }
            SearchActionModeView searchActionModeView = this.f8277I;
            if (searchActionModeView != null) {
                searchActionModeView.setExtraPaddingPolicy(this.f8276H);
            }
        }
    }

    /* renamed from: I */
    public void mo7361I(View view) {
        if (view instanceof C2885a) {
            this.f8306r.remove((C2885a) view);
        } else {
            this.f8305q.remove(view);
        }
        if (this.f8305q.size() == 0 && this.f8306r.size() == 0) {
            this.f8293e.setActionBarCoordinateListener((C2189f) null);
        }
    }

    /* renamed from: J0 */
    public void mo8148J0(boolean z) {
        this.f8294f.setHomeButtonEnabled(z);
    }

    /* renamed from: K0 */
    public void mo8149K0(AnimState animState) {
        mo8150L0(true, animState);
    }

    /* renamed from: L0 */
    public void mo8150L0(boolean z, AnimState animState) {
        if (this.f8271C) {
            this.f8271C = false;
            m9137U0(false, z, animState);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo8151M0() {
        if (!this.f8273E) {
            boolean z = true;
            this.f8273E = true;
            m9135T0(false);
            this.f8280L = mo8163p0();
            this.f8281M = mo8172y0();
            if (this.f8304p instanceof SearchActionModeView) {
                mo7360H(false);
            } else {
                this.f8293e.mo7646F();
                ((ActionBarContextView) this.f8304p).setExpandState(this.f8280L);
                ((ActionBarContextView) this.f8304p).setResizable(this.f8281M);
            }
            this.f8282N = this.f8294f.getImportantForAccessibility();
            this.f8294f.setImportantForAccessibility(4);
            ActionBarView actionBarView = this.f8294f;
            boolean z2 = this.f8304p instanceof SearchActionModeView;
            if ((mo371k() & 32768) == 0) {
                z = false;
            }
            actionBarView.mo7928k1(z2, z);
        }
    }

    /* renamed from: N0 */
    public ActionMode mo8152N0(ActionMode.Callback callback) {
        Rect baseInnerInsets;
        ActionMode actionMode = this.f8289a;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionMode d0 = m9143d0(callback);
        C2211t tVar = this.f8304p;
        if (((tVar instanceof SearchActionModeView) && (d0 instanceof C1929h)) || ((tVar instanceof ActionBarContextView) && (d0 instanceof C1924d))) {
            tVar.mo7728g();
            this.f8304p.mo7722a();
        }
        C2211t e0 = mo8160e0(callback);
        this.f8304p = e0;
        if (e0 == null) {
            throw new IllegalStateException("not set windowSplitActionBar true in activity style!");
        } else if (!(d0 instanceof C1919b)) {
            return null;
        } else {
            C1919b bVar = (C1919b) d0;
            bVar.mo6485h(e0);
            if ((bVar instanceof C1929h) && (baseInnerInsets = this.f8292d.getBaseInnerInsets()) != null) {
                ((C1929h) bVar).mo6519i(baseInnerInsets);
            }
            bVar.mo6479g(this.f8278J);
            if (!bVar.mo6473b()) {
                return null;
            }
            d0.invalidate();
            this.f8304p.mo7725c(d0);
            mo8158Y(true);
            ActionBarContainer actionBarContainer = this.f8296h;
            if (!(actionBarContainer == null || this.f8314z != 1 || actionBarContainer.getVisibility() == 0)) {
                this.f8296h.setVisibility(0);
            }
            C2211t tVar2 = this.f8304p;
            if (tVar2 instanceof ActionBarContextView) {
                ((ActionBarContextView) tVar2).sendAccessibilityEvent(32);
            }
            this.f8289a = d0;
            return d0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo8153P0(Rect rect) {
        this.f8285Q = rect;
        int i = rect.top;
        int i2 = i - this.f8286R;
        this.f8286R = i;
        Iterator<C2885a> it = this.f8306r.iterator();
        while (it.hasNext()) {
            it.next().mo10179b(rect);
        }
        for (View next : this.f8305q.keySet()) {
            Integer num = this.f8305q.get(next);
            if (i2 != 0) {
                int max = Math.max(0, num.intValue() + i2);
                this.f8305q.put(next, Integer.valueOf(max));
                m9148k0(next, max);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo8154Q0() {
        if (this.f8305q.size() == 0 && this.f8306r.size() == 0) {
            this.f8293e.setActionBarCoordinateListener((C2189f) null);
            return;
        }
        for (View next : this.f8305q.keySet()) {
            m9148k0(next, this.f8305q.get(next).intValue());
        }
        Iterator<C2885a> it = this.f8306r.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof C2886b) {
                ((C2886b) view).mo10180a(this.f8287S, this.f8288T);
            }
            m9148k0(view, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public int mo8155R0(View view, int i) {
        if (this.f8305q.containsKey(view)) {
            Integer num = this.f8305q.get(view);
            if (num.intValue() > i) {
                this.f8305q.put(view, Integer.valueOf(i));
                m9148k0(view, i);
                return num.intValue() - i;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public int mo8156S0(View view, int i) {
        int i2 = 0;
        for (View next : this.f8305q.keySet()) {
            int intValue = this.f8305q.get(next).intValue();
            int i3 = intValue - i;
            Rect rect = this.f8285Q;
            int min = Math.min(i3, rect == null ? 0 : rect.top);
            if (intValue < min) {
                this.f8305q.put(next, Integer.valueOf(min));
                m9148k0(next, min);
                if (view == next) {
                    i2 = intValue - min;
                }
            }
        }
        return i2;
    }

    /* renamed from: X */
    public void mo8157X(C0116a.C0120d dVar, boolean z) {
        if (!mo8171x0()) {
            mo8170w0(dVar, z);
            return;
        }
        throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo8158Y(boolean z) {
        if (z) {
            mo8151M0();
        } else {
            mo8168u0();
        }
        this.f8304p.mo7744h(z);
        if (this.f8300l != null && !this.f8294f.mo7907X0() && this.f8294f.mo7904S0()) {
            this.f8300l.setEnabled(!z);
            this.f8301m.setEnabled(!z);
            this.f8302n.setEnabled(!z);
            this.f8303o.setEnabled(!z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C2189f mo8159c0() {
        return new C2190g(this);
    }

    /* renamed from: e0 */
    public C2211t mo8160e0(ActionMode.Callback callback) {
        C2211t tVar;
        int i;
        if (callback instanceof C2407k.C2409b) {
            if (this.f8277I == null) {
                SearchActionModeView f0 = mo8161f0();
                this.f8277I = f0;
                f0.setExtraPaddingPolicy(this.f8276H);
            }
            if (this.f8292d != this.f8277I.getParent()) {
                this.f8292d.addView(this.f8277I);
            }
            m9121B0();
            this.f8277I.mo7724b(this.f8294f);
            tVar = this.f8277I;
        } else {
            tVar = this.f8295g;
            if (tVar == null) {
                throw new IllegalStateException("not set windowSplitActionBar true in activity style!");
            }
        }
        if ((tVar instanceof ActionBarContextView) && (i = this.f8284P) != -1) {
            ((ActionBarContextView) tVar).setActionMenuItemLimit(i);
        }
        return tVar;
    }

    /* renamed from: f0 */
    public SearchActionModeView mo8161f0() {
        SearchActionModeView searchActionModeView = (SearchActionModeView) LayoutInflater.from(mo372l()).inflate(C1354j.f4752K, this.f8292d, false);
        searchActionModeView.setOverlayModeView(this.f8292d);
        searchActionModeView.setOnBackClickListener(new C2197f());
        return searchActionModeView;
    }

    /* renamed from: g */
    public void mo367g(C0116a.C0120d dVar) {
        mo8157X(dVar, this.f8307s.isEmpty());
    }

    /* renamed from: k */
    public int mo371k() {
        return this.f8294f.getDisplayOptions();
    }

    /* renamed from: l */
    public Context mo372l() {
        if (this.f8291c == null) {
            TypedValue typedValue = new TypedValue();
            this.f8290b.getTheme().resolveAttribute(16843671, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f8291c = new ContextThemeWrapper(this.f8290b, i);
            } else {
                this.f8291c = this.f8290b;
            }
        }
        return this.f8291c;
    }

    /* renamed from: n */
    public boolean mo374n() {
        return this.f8274F;
    }

    /* renamed from: o */
    public C0116a.C0120d mo375o() {
        return new C2198g();
    }

    /* renamed from: o0 */
    public View mo8162o0() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8292d;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.findViewById(16908290);
        }
        return null;
    }

    /* renamed from: p */
    public void mo376p(Configuration configuration) {
        this.f8270B = true;
        m9122I0(C1918a.m7836b(this.f8290b).mo6469f());
        SearchActionModeView searchActionModeView = this.f8277I;
        if (searchActionModeView != null && !searchActionModeView.isAttachedToWindow()) {
            this.f8277I.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: p0 */
    public int mo8163p0() {
        return this.f8294f.getExpandState();
    }

    /* renamed from: q */
    public void mo377q() {
    }

    /* renamed from: q0 */
    public int mo8164q0() {
        return this.f8294f.getNavigationMode();
    }

    /* renamed from: r0 */
    public int mo8165r0() {
        C2198g gVar;
        int navigationMode = this.f8294f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f8294f.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (gVar = this.f8308t) != null) {
            return gVar.mo392d();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public int mo8166s0(View view) {
        if (this.f8305q.containsKey(view)) {
            return this.f8305q.get(view).intValue();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public int mo8167t0() {
        C2211t tVar;
        if (this.f8289a != null && (tVar = this.f8304p) != null) {
            return tVar.getViewHeight();
        }
        if (this.f8294f.mo7904S0()) {
            return 0;
        }
        return this.f8294f.getCollapsedHeight();
    }

    /* renamed from: u */
    public void mo381u(Drawable drawable) {
        this.f8293e.setPrimaryBackground(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo8168u0() {
        if (this.f8273E) {
            this.f8273E = false;
            this.f8294f.mo7927j1((mo371k() & 32768) != 0);
            m9135T0(false);
            if (this.f8304p instanceof SearchActionModeView) {
                mo7360H(this.f8281M);
            } else {
                this.f8293e.mo7659m();
                this.f8281M = ((ActionBarContextView) this.f8304p).mo7750l();
                this.f8280L = ((ActionBarContextView) this.f8304p).getExpandState();
                mo7360H(this.f8281M);
                this.f8294f.setExpandState(this.f8280L);
            }
            this.f8294f.setImportantForAccessibility(this.f8282N);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo8169v0(ViewGroup viewGroup) {
        int j;
        C1925e eVar;
        if (viewGroup != null) {
            TypedValue k = C1649c.m6966k(this.f8290b, C1347c.f4571g);
            if (k != null) {
                try {
                    this.f8283O = (C1629c) Class.forName(k.string.toString()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                }
            }
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup;
            this.f8292d = actionBarOverlayLayout;
            actionBarOverlayLayout.setActionBar(this);
            ActionBarView actionBarView = (ActionBarView) viewGroup.findViewById(C1352h.f4705a);
            this.f8294f = actionBarView;
            if (!(actionBarView == null || (eVar = this.f8276H) == null)) {
                actionBarView.setExtraPaddingPolicy(eVar);
            }
            this.f8295g = (ActionBarContextView) viewGroup.findViewById(C1352h.f4728o);
            this.f8293e = (ActionBarContainer) viewGroup.findViewById(C1352h.f4711d);
            this.f8296h = (ActionBarContainer) viewGroup.findViewById(C1352h.f4704Z);
            View findViewById = viewGroup.findViewById(C1352h.f4679A);
            this.f8298j = findViewById;
            if (findViewById != null) {
                this.f8299k = new C2194c();
            }
            ActionBarView actionBarView2 = this.f8294f;
            if (actionBarView2 == null && this.f8295g == null && this.f8293e == null) {
                throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
            }
            this.f8314z = actionBarView2.mo7906W0() ? 1 : 0;
            boolean z = true;
            boolean z2 = (this.f8294f.getDisplayOptions() & 4) != 0;
            if (z2) {
                this.f8312x = true;
            }
            C1918a b = C1918a.m7836b(this.f8290b);
            mo8148J0(b.mo6465a() || z2);
            m9122I0(b.mo6469f());
            if (!C2697e.m11269f() || C1652f.m6973a()) {
                z = false;
            }
            ActionBarContainer actionBarContainer = this.f8293e;
            if (actionBarContainer != null) {
                actionBarContainer.setSupportBlur(z);
            }
            ActionBarContainer actionBarContainer2 = this.f8296h;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setSupportBlur(z);
            }
            if (z && (j = C1649c.m6965j(this.f8290b, C1347c.f4584r, 0)) != 0) {
                int k2 = mo371k();
                if ((j & 1) != 0) {
                    k2 |= 32768;
                }
                if ((j & 2) != 0) {
                    k2 |= 16384;
                }
                mo8145F0(k2);
            }
            if (this.f8283O == null) {
                this.f8283O = new CommonActionBarStrategy();
            }
            this.f8292d.getViewTreeObserver().addOnPreDrawListener(new C2195d());
            this.f8292d.addOnLayoutChangeListener(new C2196e());
        }
    }

    /* renamed from: w */
    public void mo383w(boolean z) {
        int n0 = m9151n0();
        mo8146G0((z ? 16 : 0) | n0, n0 | 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo8170w0(C0116a.C0120d dVar, boolean z) {
        m9149l0();
        this.f8300l.mo8018b(dVar, z);
        this.f8301m.mo8018b(dVar, z);
        this.f8302n.mo8103k(dVar, z);
        this.f8303o.mo8103k(dVar, z);
        m9142b0(dVar, this.f8307s.size());
        if (z) {
            mo8143D0(dVar);
        }
    }

    /* renamed from: x */
    public void mo384x(boolean z) {
        int n0 = m9151n0();
        mo8146G0((z ? 8 : 0) | n0, n0 | 8);
    }

    /* renamed from: x0 */
    public boolean mo8171x0() {
        return false;
    }

    /* renamed from: y */
    public void mo385y(int i) {
        if (this.f8294f.getNavigationMode() == 2) {
            this.f8311w = mo8165r0();
            mo8143D0((C0116a.C0120d) null);
            this.f8300l.setVisibility(8);
            this.f8301m.setVisibility(8);
            this.f8302n.setVisibility(8);
            this.f8303o.setVisibility(8);
        }
        this.f8294f.setNavigationMode(i);
        if (i == 2) {
            m9149l0();
            this.f8300l.setVisibility(0);
            this.f8301m.setVisibility(0);
            this.f8302n.setVisibility(0);
            this.f8303o.setVisibility(0);
            int i2 = this.f8311w;
            if (i2 != -1) {
                mo386z(i2);
                this.f8311w = -1;
            }
        }
        this.f8294f.setCollapsable(false);
    }

    /* renamed from: y0 */
    public boolean mo8172y0() {
        return this.f8294f.mo7750l();
    }

    /* renamed from: z */
    public void mo386z(int i) {
        int navigationMode = this.f8294f.getNavigationMode();
        if (navigationMode == 1) {
            this.f8294f.setDropdownSelectedPosition(i);
        } else if (navigationMode == 2) {
            mo8143D0(this.f8307s.get(i));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public boolean mo8173z0() {
        return this.f8275G;
    }
}
