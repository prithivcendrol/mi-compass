package miuix.appcompat.internal.app.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.content.res.C0528f;
import androidx.core.view.C0676d;
import androidx.core.view.C0678d0;
import androidx.core.view.C0689f2;
import androidx.core.view.C0727l0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1048m;
import java.util.HashSet;
import miuix.appcompat.app.C2071a;
import miuix.appcompat.app.C2129u;
import miuix.appcompat.app.C2131w;
import miuix.appcompat.app.C2133y;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2246d;
import miuix.appcompat.internal.view.menu.C2250g;
import miuix.appcompat.internal.view.menu.action.C2233c;
import miuix.autodensity.AutoDensityConfig;
import miuix.view.C2407k;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1351g;
import p018c2.C1352h;
import p018c2.C1357m;
import p030e2.C1530a;
import p036f2.C1558a;
import p055i3.C1649c;
import p055i3.C1650d;
import p073l3.C1878b;
import p078m2.C1925e;
import p096p2.C2539b;
import p096p2.C2541d;
import p117t2.C2693a;
import p117t2.C2711k;

public class ActionBarOverlayLayout extends FrameLayout implements C0678d0 {

    /* renamed from: A */
    private Rect f7903A;

    /* renamed from: B */
    private Rect f7904B;

    /* renamed from: C */
    private Rect f7905C;

    /* renamed from: D */
    private final Rect f7906D;

    /* renamed from: E */
    private final Rect f7907E;

    /* renamed from: F */
    private final Rect f7908F;

    /* renamed from: G */
    private final Rect f7909G;

    /* renamed from: H */
    private final int[] f7910H;

    /* renamed from: I */
    private boolean f7911I;

    /* renamed from: J */
    private int f7912J;

    /* renamed from: K */
    private Rect f7913K;

    /* renamed from: L */
    private C2539b f7914L;

    /* renamed from: M */
    private C2246d f7915M;

    /* renamed from: N */
    private C2541d f7916N;

    /* renamed from: O */
    private C2151d f7917O;

    /* renamed from: P */
    private C2133y f7918P;

    /* renamed from: Q */
    private boolean f7919Q;

    /* renamed from: R */
    private C1530a f7920R;

    /* renamed from: S */
    private boolean f7921S;

    /* renamed from: T */
    private boolean f7922T;

    /* renamed from: U */
    private C1925e f7923U;

    /* renamed from: V */
    private int f7924V;

    /* renamed from: W */
    private boolean f7925W;

    /* renamed from: a0 */
    private boolean f7926a0;

    /* renamed from: b0 */
    private int f7927b0;

    /* renamed from: c0 */
    private int f7928c0;

    /* renamed from: d */
    protected ActionBarView f7929d;

    /* renamed from: d0 */
    private int f7930d0;

    /* renamed from: e */
    protected ActionBarContainer f7931e;

    /* renamed from: e0 */
    private int f7932e0;

    /* renamed from: f */
    protected View f7933f;

    /* renamed from: f0 */
    private int f7934f0;

    /* renamed from: g */
    protected final HashSet<View> f7935g;

    /* renamed from: g0 */
    private boolean f7936g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2071a f7937h;

    /* renamed from: h0 */
    private C2131w f7938h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ActionBarContainer f7939i;

    /* renamed from: i0 */
    private C2129u f7940i0;

    /* renamed from: j */
    private ActionBarContextView f7941j;

    /* renamed from: j0 */
    private boolean f7942j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public View f7943k;

    /* renamed from: k0 */
    private final int[] f7944k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ActionMode f7945l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Window.Callback f7946m;

    /* renamed from: n */
    private C2711k f7947n;

    /* renamed from: o */
    private C1048m f7948o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7949p;

    /* renamed from: q */
    private boolean f7950q;

    /* renamed from: r */
    private boolean f7951r;

    /* renamed from: s */
    private boolean f7952s;

    /* renamed from: t */
    private boolean f7953t;

    /* renamed from: u */
    private Drawable f7954u;

    /* renamed from: v */
    private int f7955v;

    /* renamed from: w */
    private Rect f7956w;

    /* renamed from: x */
    private Rect f7957x;

    /* renamed from: y */
    private Rect f7958y;

    /* renamed from: z */
    private Rect f7959z;

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$b */
    private class C2149b implements ActionMode.Callback {

        /* renamed from: a */
        private ActionMode.Callback f7960a;

        public C2149b(ActionMode.Callback callback) {
            this.f7960a = callback;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f7960a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f7960a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f7960a.onDestroyActionMode(actionMode);
            ActionBarView actionBarView = ActionBarOverlayLayout.this.f7929d;
            if (actionBarView != null && actionBarView.mo7906W0()) {
                ActionBarOverlayLayout.this.f7929d.mo7910g1(true);
            }
            if (ActionBarOverlayLayout.this.getCallback() != null) {
                ActionBarOverlayLayout.this.getCallback().onActionModeFinished(actionMode);
            }
            ActionMode unused = ActionBarOverlayLayout.this.f7945l = null;
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f7960a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$c */
    public class C2150c implements Animator.AnimatorListener {

        /* renamed from: d */
        private ObjectAnimator f7962d;

        /* renamed from: e */
        private ObjectAnimator f7963e;

        /* renamed from: f */
        private View.OnClickListener f7964f;

        private C2150c(View.OnClickListener onClickListener) {
            this.f7964f = onClickListener;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ActionBarOverlayLayout.this.f7943k, "alpha", new float[]{0.0f, 1.0f});
            this.f7962d = ofFloat;
            ofFloat.addListener(this);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ActionBarOverlayLayout.this.f7943k, "alpha", new float[]{1.0f, 0.0f});
            this.f7963e = ofFloat2;
            ofFloat2.addListener(this);
            if (!C1650d.m6967a()) {
                this.f7962d.setDuration(0);
                this.f7963e.setDuration(0);
            }
        }

        /* renamed from: a */
        public Animator mo7889a() {
            return this.f7963e;
        }

        /* renamed from: b */
        public Animator mo7890b() {
            return this.f7962d;
        }

        public void onAnimationCancel(Animator animator) {
            if (ActionBarOverlayLayout.this.f7943k != null && ActionBarOverlayLayout.this.f7939i != null && animator == this.f7963e) {
                ActionBarOverlayLayout.this.f7939i.bringToFront();
                ActionBarOverlayLayout.this.f7943k.setOnClickListener((View.OnClickListener) null);
            }
        }

        public void onAnimationEnd(Animator animator) {
            if (ActionBarOverlayLayout.this.f7943k != null && ActionBarOverlayLayout.this.f7939i != null && ActionBarOverlayLayout.this.f7943k.getAlpha() == 0.0f) {
                ActionBarOverlayLayout.this.f7939i.bringToFront();
                ActionBarOverlayLayout.this.f7943k.setOnClickListener((View.OnClickListener) null);
                ActionBarOverlayLayout.this.f7943k.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            if (ActionBarOverlayLayout.this.f7943k != null && ActionBarOverlayLayout.this.f7939i != null && animator == this.f7962d) {
                ActionBarOverlayLayout.this.f7943k.setVisibility(0);
                ActionBarOverlayLayout.this.f7943k.bringToFront();
                ActionBarOverlayLayout.this.f7939i.bringToFront();
                ActionBarOverlayLayout.this.f7943k.setOnClickListener(this.f7964f);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$d */
    private class C2151d implements C2242c.C2244b, C2250g.C2251a {

        /* renamed from: d */
        private C2246d f7966d;

        private C2151d() {
        }

        /* JADX WARNING: type inference failed for: r3v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
        /* renamed from: a */
        public void mo7895a(C2242c cVar) {
            if (ActionBarOverlayLayout.this.f7946m != null) {
                ActionBarOverlayLayout.this.f7946m.onPanelClosed(6, cVar.mo8339B());
            }
        }

        /* renamed from: c */
        public boolean mo6474c(C2242c cVar, MenuItem menuItem) {
            if (ActionBarOverlayLayout.this.f7946m != null) {
                return ActionBarOverlayLayout.this.f7946m.onMenuItemSelected(6, menuItem);
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7408d(miuix.appcompat.internal.view.menu.C2242c r2, boolean r3) {
            /*
                r1 = this;
                miuix.appcompat.internal.view.menu.c r0 = r2.mo8339B()
                if (r0 == r2) goto L_0x0009
                r1.mo7895a(r2)
            L_0x0009:
                if (r3 == 0) goto L_0x002c
                miuix.appcompat.internal.app.widget.ActionBarOverlayLayout r3 = miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.this
                android.view.Window$Callback r3 = r3.f7946m
                if (r3 == 0) goto L_0x001d
                miuix.appcompat.internal.app.widget.ActionBarOverlayLayout r3 = miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.this
                android.view.Window$Callback r3 = r3.f7946m
                r0 = 6
                r3.onPanelClosed(r0, r2)
            L_0x001d:
                miuix.appcompat.internal.app.widget.ActionBarOverlayLayout r2 = miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.this
                r2.m8813u()
                miuix.appcompat.internal.view.menu.d r2 = r1.f7966d
                if (r2 == 0) goto L_0x002c
                r2.mo8412a()
                r2 = 0
                r1.f7966d = r2
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.C2151d.mo7408d(miuix.appcompat.internal.view.menu.c, boolean):void");
        }

        /* renamed from: e */
        public boolean mo7409e(C2242c cVar) {
            if (cVar == null) {
                return false;
            }
            cVar.mo8350N(this);
            C2246d dVar = new C2246d(cVar);
            this.f7966d = dVar;
            dVar.mo8414c((IBinder) null);
            return true;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$e */
    private class C2152e extends C2149b implements C2407k.C2409b {

        /* renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$e$a */
        class C2153a implements C2407k.C2408a {
            C2153a() {
            }

            /* renamed from: a */
            public void mo7896a(int i) {
                ActionBarContainer actionBarContainer = ActionBarOverlayLayout.this.f7931e;
                if (actionBarContainer != null) {
                    actionBarContainer.setCoordinatedOffsetYInSearchModeAnimation(i);
                    ActionBarOverlayLayout.this.f7931e.requestLayout();
                }
            }

            /* renamed from: b */
            public void mo7897b(boolean z) {
                if (ActionBarOverlayLayout.this.f7949p != z) {
                    boolean unused = ActionBarOverlayLayout.this.f7949p = z;
                    if (ActionBarOverlayLayout.this.f7937h != null) {
                        ((C2191h) ActionBarOverlayLayout.this.f7937h).mo8154Q0();
                    }
                }
            }
        }

        public C2152e(ActionMode.Callback callback) {
            super(callback);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ((C2407k) actionMode).mo6518a(new C2153a());
            return super.onCreateActionMode(actionMode, menu);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7935g = new HashSet<>();
        this.f7948o = null;
        this.f7949p = false;
        this.f7951r = true;
        this.f7956w = new Rect();
        this.f7957x = new Rect();
        this.f7958y = new Rect();
        this.f7959z = new Rect();
        this.f7903A = new Rect();
        this.f7904B = new Rect();
        this.f7905C = new Rect();
        this.f7906D = new Rect();
        this.f7907E = new Rect();
        this.f7908F = new Rect();
        this.f7909G = new Rect();
        this.f7910H = new int[2];
        this.f7913K = null;
        this.f7917O = new C2151d();
        this.f7921S = false;
        this.f7922T = false;
        this.f7936g0 = true;
        this.f7942j0 = false;
        this.f7944k0 = new int[2];
        this.f7920R = new C1530a(context, attributeSet);
        this.f7934f0 = C1878b.m7804a(context);
        m8817z();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4899Z2, i, 0);
        this.f7921S = obtainStyledAttributes.getBoolean(C1357m.f4919d3, false);
        this.f7922T = C1558a.m6677h(context);
        boolean z = obtainStyledAttributes.getBoolean(C1357m.f4904a3, false);
        this.f7953t = z;
        if (z) {
            this.f7954u = obtainStyledAttributes.getDrawable(C1357m.f4909b3);
        }
        setExtraHorizontalPaddingEnable(obtainStyledAttributes.getBoolean(C1357m.f4944i3, this.f7925W));
        setExtraPaddingApplyToContentEnable(obtainStyledAttributes.getBoolean(C1357m.f4939h3, this.f7926a0));
        obtainStyledAttributes.recycle();
        this.f7930d0 = C1649c.m6965j(context, C1347c.f4585s, 0);
        this.f7942j0 = C1649c.m6959d(context, C1347c.f4544L, false);
    }

    /* renamed from: A */
    private boolean m8791A(View view, float f, float f2) {
        C2539b bVar = this.f7914L;
        if (bVar == null) {
            C2539b bVar2 = new C2539b(getContext());
            this.f7914L = bVar2;
            bVar2.mo8350N(this.f7917O);
        } else {
            bVar.clear();
        }
        C2541d f0 = this.f7914L.mo9723f0(view, view.getWindowToken(), f, f2);
        this.f7916N = f0;
        if (f0 == null) {
            return super.showContextMenuForChild(view);
        }
        f0.mo9735d(this.f7917O);
        return true;
    }

    /* renamed from: B */
    private boolean m8792B(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1;
    }

    /* renamed from: C */
    private boolean m8793C() {
        return this.f7919Q;
    }

    /* renamed from: D */
    private boolean m8794D() {
        C0689f2 A = C0727l0.m2851A(this);
        if (A == null) {
            return false;
        }
        C0676d e = A.mo2865e();
        if (e != null) {
            return e.mo2851b() > 0;
        }
        Activity w = m8815w(this);
        if (w == null) {
            return false;
        }
        DisplayCutout displayCutout = null;
        if (Build.VERSION.SDK_INT >= 29) {
            displayCutout = w.getWindowManager().getDefaultDisplay().getCutout();
        }
        return displayCutout != null && displayCutout.getSafeInsetLeft() > 0;
    }

    /* renamed from: G */
    private boolean m8795G() {
        return (getWindowSystemUiVisibility() & 512) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m8796J() {
        ActionBarContextView actionBarContextView = this.f7941j;
        if (actionBarContextView != null) {
            actionBarContextView.mo7779v();
        }
        ActionBarView actionBarView = this.f7929d;
        if (actionBarView != null) {
            actionBarView.mo7779v();
        }
        if (this.f7914L != null) {
            boolean z = true;
            C1048m mVar = this.f7948o;
            if (mVar != null) {
                z = mVar.mo252c().mo3791b().equals(C1035g.C1038c.RESUMED);
            }
            if (!z) {
                this.f7914L.close();
            }
        }
    }

    /* renamed from: K */
    private void m8797K() {
        if (this.f7950q) {
            C2071a aVar = this.f7937h;
            if (aVar != null) {
                ((C2191h) aVar).mo8153P0(this.f7907E);
            }
            C2131w wVar = this.f7938h0;
            if (wVar != null) {
                wVar.mo7407b(this.f7907E);
            }
        }
    }

    /* renamed from: N */
    private void m8798N() {
        if (this.f7933f == null) {
            this.f7933f = findViewById(16908290);
            ActionBarContainer actionBarContainer = (ActionBarContainer) findViewById(C1352h.f4711d);
            this.f7931e = actionBarContainer;
            boolean z = false;
            if (this.f7921S && this.f7922T && actionBarContainer != null && !C1649c.m6959d(getContext(), C1347c.f4553U, false)) {
                this.f7931e.setVisibility(8);
                this.f7931e = null;
            }
            ActionBarContainer actionBarContainer2 = this.f7931e;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setOverlayMode(this.f7950q);
                ActionBarView actionBarView = (ActionBarView) this.f7931e.findViewById(C1352h.f4705a);
                this.f7929d = actionBarView;
                actionBarView.setBottomMenuMode(this.f7932e0);
                if (this.f7921S && this.f7922T) {
                    z = true;
                }
                this.f7911I = z;
                if (z) {
                    this.f7912J = getResources().getDimensionPixelSize(C1350f.f4628X);
                }
                this.f7931e.setMiuixFloatingOnInit(this.f7911I);
            }
        }
    }

    /* renamed from: R */
    private void m8799R() {
        int i;
        int i2;
        ActionBarContainer actionBarContainer;
        this.f7906D.set(this.f7908F);
        int i3 = 0;
        if (!(this.f7937h == null || (actionBarContainer = this.f7931e) == null || actionBarContainer.getVisibility() == 8)) {
            int t0 = ((C2191h) this.f7937h).mo8167t0() + this.f7908F.top;
            if (this.f7911I) {
                i3 = this.f7912J;
            }
            i3 += t0;
        }
        int max = Math.max(Math.max(getBottomInset(), this.f7927b0), this.f7928c0);
        if (!mo7826I() || i3 >= (i2 = this.f7908F.top)) {
            this.f7906D.top = i3;
        } else {
            this.f7906D.top = i2;
        }
        if (!m8795G() || max >= (i = this.f7908F.bottom)) {
            this.f7906D.bottom = max;
        } else {
            this.f7906D.bottom = i;
        }
        Rect rect = this.f7906D;
        int i4 = rect.left;
        Rect rect2 = this.f7908F;
        int i5 = rect2.left;
        if (i4 < i5) {
            rect.left = i5;
        }
        int i6 = rect.right;
        int i7 = rect2.right;
        if (i6 < i7) {
            rect.right = i7;
        }
        m8814v(rect);
    }

    /* renamed from: p */
    private void m8809p(View view) {
        if (!this.f7950q || this.f7936g0) {
            view.offsetTopAndBottom(-this.f7944k0[1]);
            return;
        }
        C2131w wVar = this.f7938h0;
        if (wVar != null) {
            wVar.mo7413i(this.f7944k0);
        }
    }

    /* renamed from: r */
    private boolean m8810r(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z3 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z4 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r2 < 0) goto L_0x0022;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8811s(boolean r2, boolean r3, int r4, android.graphics.Rect r5, android.graphics.Rect r6) {
        /*
            r1 = this;
            boolean r0 = r1.mo7825H()
            r6.set(r5)
            r5 = 0
            if (r0 == 0) goto L_0x000c
            if (r2 == 0) goto L_0x0012
        L_0x000c:
            boolean r2 = r1.f7953t
            if (r2 != 0) goto L_0x0012
            r6.top = r5
        L_0x0012:
            boolean r2 = r1.f7922T
            if (r2 != 0) goto L_0x0022
            if (r3 == 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            int r2 = r6.bottom
            if (r2 == 0) goto L_0x0024
            int r2 = r2 - r4
            r6.bottom = r2
            if (r2 >= 0) goto L_0x0024
        L_0x0022:
            r6.bottom = r5
        L_0x0024:
            boolean r2 = r1.f7942j0
            if (r2 == 0) goto L_0x0030
            if (r4 <= 0) goto L_0x0030
            android.graphics.Rect r2 = r1.f7909G
            int r2 = r2.bottom
            r6.bottom = r2
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.m8811s(boolean, boolean, int, android.graphics.Rect, android.graphics.Rect):void");
    }

    /* renamed from: t */
    private C2149b m8812t(ActionMode.Callback callback) {
        return callback instanceof C2407k.C2409b ? new C2152e(callback) : new C2149b(callback);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m8813u() {
        C2246d dVar = this.f7915M;
        if (dVar != null) {
            dVar.mo8412a();
            this.f7914L = null;
        }
    }

    /* renamed from: v */
    private void m8814v(Rect rect) {
        if (!this.f7907E.equals(rect)) {
            this.f7907E.set(rect);
            m8797K();
        }
    }

    /* renamed from: w */
    private Activity m8815w(View view) {
        Context context = ((ViewGroup) view.getRootView()).getChildAt(0).getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: x */
    private View m8816x(View view) {
        return !this.f7935g.isEmpty() ? this.f7935g.contains(view) ? view : this.f7933f : this.f7933f;
    }

    /* renamed from: z */
    private void m8817z() {
        this.f7923U = new C1925e.C1926a().mo6507b(this.f7934f0);
    }

    /* renamed from: E */
    public boolean mo7823E() {
        return this.f7926a0;
    }

    /* renamed from: F */
    public boolean mo7824F() {
        return this.f7950q;
    }

    /* renamed from: H */
    public boolean mo7825H() {
        return this.f7951r;
    }

    /* renamed from: I */
    public boolean mo7826I() {
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = (windowSystemUiVisibility & 256) != 0;
        boolean z2 = (windowSystemUiVisibility & 1024) != 0;
        boolean z3 = this.f7955v != 0;
        return this.f7921S ? z2 || z3 : (z && z2) || z3;
    }

    /* renamed from: L */
    public void mo7827L(boolean z) {
        if (this.f7911I != (this.f7921S && z)) {
            this.f7922T = z;
            this.f7911I = z;
            if (z) {
                this.f7912J = getResources().getDimensionPixelSize(C1350f.f4628X);
            }
            this.f7920R.mo5641q(this.f7911I);
            C2071a aVar = this.f7937h;
            if (aVar != null) {
                ((C2191h) aVar).mo8142C0(this.f7911I);
            }
            requestFitSystemWindows();
            requestLayout();
        }
    }

    /* renamed from: M */
    public void mo7828M(int i, int i2) {
        int i3;
        int[] iArr = this.f7910H;
        iArr[i2] = i;
        int max = Math.max(iArr[0], iArr[1]);
        if (this.f7950q) {
            if (m8795G() && max <= (i3 = this.f7908F.bottom)) {
                max = i3;
            }
            this.f7906D.bottom = Math.max(Math.max(max, this.f7928c0), this.f7927b0);
            m8814v(this.f7906D);
            return;
        }
        mo7855q(max);
    }

    /* renamed from: O */
    public void mo7829O() {
        m8797K();
    }

    /* renamed from: P */
    public ActionMode mo7830P(View view, ActionMode.Callback callback) {
        if (!(view instanceof ActionBarOverlayLayout)) {
            return startActionMode(callback);
        }
        ActionMode actionMode = this.f7945l;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionMode startActionMode = view.startActionMode(m8812t(callback));
        this.f7945l = startActionMode;
        return startActionMode;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r0 > 670) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        if (r1 > 670) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7831Q() {
        /*
            r7 = this;
            int r0 = r7.f7930d0
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 3
            r3 = 670(0x29e, float:9.39E-43)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 2
            if (r0 != 0) goto L_0x003c
            int r0 = r7.getMeasuredWidth()
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 / r1
            int r0 = (int) r0
            android.content.Context r6 = r7.getContext()
            android.graphics.Point r6 = p117t2.C2693a.m11241j(r6)
            int r6 = r6.x
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 / r1
            int r1 = (int) r6
            int r4 = r7.f7934f0
            if (r4 != r5) goto L_0x003a
            r4 = 410(0x19a, float:5.75E-43)
            if (r0 <= r4) goto L_0x003a
            if (r1 <= r3) goto L_0x003a
        L_0x0038:
            r0 = r2
            goto L_0x0054
        L_0x003a:
            r0 = r5
            goto L_0x0054
        L_0x003c:
            r6 = 1
            if (r0 != r6) goto L_0x0054
            android.content.Context r0 = r7.getContext()
            android.graphics.Point r0 = p117t2.C2693a.m11241j(r0)
            int r0 = r0.x
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 / r1
            int r0 = (int) r0
            int r1 = r7.f7934f0
            if (r1 != r5) goto L_0x003a
            if (r0 <= r3) goto L_0x003a
            goto L_0x0038
        L_0x0054:
            int r1 = r7.f7932e0
            if (r0 == r1) goto L_0x0074
            r7.f7932e0 = r0
            miuix.appcompat.internal.app.widget.ActionBarContextView r1 = r7.f7941j
            if (r1 == 0) goto L_0x0066
            r1.setBottomMenuMode(r0)
            miuix.appcompat.internal.app.widget.ActionBarContextView r0 = r7.f7941j
            r0.mo7779v()
        L_0x0066:
            miuix.appcompat.internal.app.widget.ActionBarView r0 = r7.f7929d
            if (r0 == 0) goto L_0x0074
            int r1 = r7.f7932e0
            r0.setBottomMenuMode(r1)
            miuix.appcompat.internal.app.widget.ActionBarView r0 = r7.f7929d
            r0.mo7779v()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.mo7831Q():void");
    }

    /* renamed from: c */
    public void mo1174c(View view, View view2, int i, int i2) {
        ActionBarContainer actionBarContainer;
        if (m8816x(view2) != null && (actionBarContainer = this.f7931e) != null) {
            actionBarContainer.mo7698x(view, view2, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f7953t && (drawable = this.f7954u) != null) {
            drawable.setBounds(0, 0, getRight() - getLeft(), this.f7956w.top);
            this.f7954u.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (m8792B(keyEvent)) {
            if (this.f7945l != null) {
                ActionBarContextView actionBarContextView = this.f7941j;
                if (actionBarContextView != null && actionBarContextView.mo7747j()) {
                    return true;
                }
                this.f7945l.finish();
                this.f7945l = null;
                return true;
            }
            ActionBarView actionBarView = this.f7929d;
            if (actionBarView != null && actionBarView.mo7747j()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0099, code lost:
        r0 = r0.getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fitSystemWindows(android.graphics.Rect r11) {
        /*
            r10 = this;
            boolean r2 = r10.m8795G()
            boolean r6 = r10.mo7826I()
            android.graphics.Rect r1 = r10.f7909G
            r1.set(r11)
            android.graphics.Rect r1 = r10.f7908F
            r1.set(r11)
            android.graphics.Rect r1 = r10.f7959z
            r1.set(r11)
            androidx.core.view.f2 r1 = androidx.core.view.C0727l0.m2851A(r10)
            r7 = 0
            if (r1 == 0) goto L_0x005f
            int r3 = androidx.core.view.C0689f2.C0702m.m2813d()
            androidx.core.graphics.b r3 = r1.mo2867f(r3)
            int r3 = r3.f2549b
            int r3 = androidx.core.view.C0689f2.C0702m.m2813d()
            androidx.core.graphics.b r3 = r1.mo2867f(r3)
            int r3 = r3.f2551d
            int r4 = androidx.core.view.C0689f2.C0702m.m2810a()
            androidx.core.graphics.b r4 = r1.mo2867f(r4)
            int r4 = r4.f2551d
            android.graphics.Rect r5 = r10.f7908F
            int r8 = androidx.core.view.C0689f2.C0702m.m2812c()
            androidx.core.graphics.b r8 = r1.mo2867f(r8)
            int r8 = r8.f2551d
            r5.bottom = r8
            boolean r5 = r10.f7942j0
            if (r5 == 0) goto L_0x0061
            int r5 = androidx.core.view.C0689f2.C0702m.m2810a()
            androidx.core.graphics.b r1 = r1.mo2867f(r5)
            int r1 = r1.f2551d
            if (r1 <= 0) goto L_0x0061
            android.graphics.Rect r1 = r10.f7908F
            r1.bottom = r7
            goto L_0x0061
        L_0x005f:
            r3 = r7
            r4 = r3
        L_0x0061:
            if (r2 != 0) goto L_0x0067
            android.graphics.Rect r1 = r10.f7908F
            r1.bottom = r7
        L_0x0067:
            miuix.appcompat.app.y r1 = r10.f7918P
            if (r1 == 0) goto L_0x0070
            int r0 = r11.top
            r1.mo7642a(r0)
        L_0x0070:
            boolean r0 = r10.f7911I
            if (r0 == 0) goto L_0x008c
            android.graphics.Rect r0 = r10.f7959z
            int r1 = r10.f7912J
            r0.top = r1
            r0.left = r7
            r0.right = r7
            android.graphics.Rect r0 = r10.f7908F
            android.graphics.Rect r1 = r10.f7956w
            int r1 = r1.top
            r0.top = r1
            r0.bottom = r7
            r0.left = r7
            r0.right = r7
        L_0x008c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r8 = 1
            if (r0 < r1) goto L_0x00d3
            android.app.Activity r0 = r10.m8815w(r10)
            if (r0 == 0) goto L_0x00a9
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x00a9
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.layoutInDisplayCutoutMode
            if (r0 != r8) goto L_0x00a9
            r0 = r8
            goto L_0x00aa
        L_0x00a9:
            r0 = r7
        L_0x00aa:
            if (r0 != 0) goto L_0x00bc
            android.content.Context r0 = r10.getContext()
            r1 = 16844166(0x1010586, float:2.369752E-38)
            int r0 = p055i3.C1649c.m6965j(r0, r1, r7)
            if (r0 != r8) goto L_0x00bb
            r0 = r8
            goto L_0x00bc
        L_0x00bb:
            r0 = r7
        L_0x00bc:
            if (r0 == 0) goto L_0x00d3
            android.graphics.Rect r0 = r10.f7959z
            r0.left = r7
            r0.right = r7
            boolean r0 = r10.m8794D()
            if (r0 == 0) goto L_0x00cf
            android.graphics.Rect r0 = r10.f7908F
            r0.left = r7
            goto L_0x00d3
        L_0x00cf:
            android.graphics.Rect r0 = r10.f7908F
            r0.right = r7
        L_0x00d3:
            boolean r0 = r10.f7950q
            if (r0 == 0) goto L_0x00da
            r10.m8799R()
        L_0x00da:
            boolean r0 = r10.mo7825H()
            if (r0 != 0) goto L_0x00ec
            if (r2 == 0) goto L_0x00e8
            android.graphics.Rect r0 = r10.f7959z
            int r0 = r0.bottom
            if (r0 == r3) goto L_0x00ec
        L_0x00e8:
            android.graphics.Rect r0 = r10.f7959z
            r0.bottom = r7
        L_0x00ec:
            android.graphics.Rect r5 = r10.f7959z
            android.graphics.Rect r9 = r10.f7956w
            r0 = r10
            r1 = r6
            r3 = r4
            r4 = r5
            r5 = r9
            r0.m8811s(r1, r2, r3, r4, r5)
            miuix.appcompat.internal.app.widget.ActionBarContainer r0 = r10.f7931e
            if (r0 == 0) goto L_0x0129
            if (r6 == 0) goto L_0x0103
            android.graphics.Rect r1 = r10.f7959z
            r0.setPendingInsets(r1)
        L_0x0103:
            android.view.ActionMode r0 = r10.f7945l
            boolean r1 = r0 instanceof p078m2.C1929h
            if (r1 == 0) goto L_0x0110
            m2.h r0 = (p078m2.C1929h) r0
            android.graphics.Rect r1 = r10.f7959z
            r0.mo6519i(r1)
        L_0x0110:
            miuix.appcompat.internal.app.widget.ActionBarContainer r1 = r10.f7931e
            android.graphics.Rect r2 = r10.f7908F
            r3 = 1
            boolean r0 = r10.mo7825H()
            if (r0 == 0) goto L_0x011f
            if (r6 != 0) goto L_0x011f
            r4 = r8
            goto L_0x0120
        L_0x011f:
            r4 = r7
        L_0x0120:
            r5 = 1
            r6 = 0
            r0 = r10
            boolean r0 = r0.m8810r(r1, r2, r3, r4, r5, r6)
            r9 = r0
            goto L_0x012a
        L_0x0129:
            r9 = r7
        L_0x012a:
            miuix.appcompat.internal.app.widget.ActionBarContextView r0 = r10.f7941j
            if (r0 == 0) goto L_0x0133
            android.graphics.Rect r1 = r10.f7908F
            r0.setPendingInset(r1)
        L_0x0133:
            miuix.appcompat.internal.app.widget.ActionBarContainer r0 = r10.f7939i
            if (r0 == 0) goto L_0x0179
            android.graphics.Rect r1 = r10.f7908F
            r0.setPendingInsets(r1)
            android.graphics.Rect r0 = r10.f7905C
            android.graphics.Rect r1 = r10.f7959z
            r0.set(r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r10.f7956w
            r0.set(r1)
            boolean r1 = r10.f7922T
            if (r1 == 0) goto L_0x0153
            r0.bottom = r7
        L_0x0153:
            boolean r0 = r10.f7942j0
            if (r0 == 0) goto L_0x016b
            android.graphics.Rect r2 = new android.graphics.Rect
            android.graphics.Rect r0 = r10.f7908F
            r2.<init>(r0)
            android.graphics.Rect r0 = r10.f7956w
            int r0 = r0.bottom
            r2.bottom = r0
            miuix.appcompat.internal.app.widget.ActionBarContainer r1 = r10.f7939i
            r3 = 1
            r4 = 0
            r5 = 1
            r6 = 1
            goto L_0x0173
        L_0x016b:
            miuix.appcompat.internal.app.widget.ActionBarContainer r1 = r10.f7939i
            android.graphics.Rect r2 = r10.f7908F
            r3 = 1
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x0173:
            r0 = r10
            boolean r0 = r0.m8810r(r1, r2, r3, r4, r5, r6)
            r9 = r9 | r0
        L_0x0179:
            miuix.appcompat.internal.app.widget.ActionBarView r0 = r10.f7929d
            if (r0 == 0) goto L_0x0182
            android.graphics.Rect r1 = r10.f7908F
            r0.setPendingInset(r1)
        L_0x0182:
            android.graphics.Rect r0 = r10.f7957x
            android.graphics.Rect r1 = r10.f7956w
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0194
            android.graphics.Rect r0 = r10.f7957x
            android.graphics.Rect r1 = r10.f7956w
            r0.set(r1)
            r9 = r8
        L_0x0194:
            if (r9 == 0) goto L_0x0199
            r10.requestLayout()
        L_0x0199:
            miuix.appcompat.internal.app.widget.ActionBarContainer r0 = r10.f7931e
            if (r0 != 0) goto L_0x01a3
            miuix.appcompat.internal.app.widget.ActionBarContainer r0 = r10.f7939i
            if (r0 != 0) goto L_0x01a3
            r0 = r8
            goto L_0x01a4
        L_0x01a3:
            r0 = r7
        L_0x01a4:
            boolean r1 = r10.mo7825H()
            if (r1 == 0) goto L_0x01ad
            if (r0 != 0) goto L_0x01ad
            r7 = r8
        L_0x01ad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    public C2071a getActionBar() {
        return this.f7937h;
    }

    public ActionBarView getActionBarView() {
        return this.f7929d;
    }

    public Rect getBaseInnerInsets() {
        return this.f7959z;
    }

    /* access modifiers changed from: protected */
    public int getBottomInset() {
        ActionBarContainer actionBarContainer = this.f7939i;
        if (actionBarContainer != null) {
            return actionBarContainer.getInsetHeight();
        }
        return 0;
    }

    public int getBottomMenuCustomViewTranslationY() {
        ActionBarView actionBarView = this.f7929d;
        if (actionBarView != null) {
            return actionBarView.getBottomMenuCustomViewOffset();
        }
        return 0;
    }

    public int getBottomMenuMode() {
        return this.f7932e0;
    }

    public Window.Callback getCallback() {
        return this.f7946m;
    }

    public Rect getContentInset() {
        return this.f7906D;
    }

    public View getContentMask() {
        return this.f7943k;
    }

    public View getContentView() {
        return this.f7933f;
    }

    /* access modifiers changed from: package-private */
    public int getDeviceType() {
        return this.f7934f0;
    }

    public int getExtraHorizontalPadding() {
        return this.f7924V;
    }

    @Deprecated
    public int getExtraHorizontalPaddingLevel() {
        C1925e eVar = this.f7923U;
        if (eVar == null) {
            return 0;
        }
        return eVar.mo6502h();
    }

    public Rect getInnerInsets() {
        return this.f7904B;
    }

    /* renamed from: i */
    public void mo1189i(View view, int i) {
        ActionBarContainer actionBarContainer;
        if (m8816x(view) != null && (actionBarContainer = this.f7931e) != null) {
            actionBarContainer.mo7644B(view, i);
        }
    }

    /* renamed from: j */
    public void mo1190j(View view, int i, int i2, int[] iArr, int i3) {
        C2071a aVar;
        View x = m8816x(view);
        if (x != null) {
            int[] iArr2 = this.f7944k0;
            iArr2[1] = 0;
            ActionBarContainer actionBarContainer = this.f7931e;
            if (actionBarContainer != null && !this.f7949p) {
                actionBarContainer.mo7695v(view, i, i2, iArr, i3, iArr2);
            }
            if (i2 > 0) {
                int i4 = iArr[1];
                if (i2 - i4 > 0 && (aVar = this.f7937h) != null && (aVar instanceof C2191h)) {
                    int i5 = i2 - i4;
                    int s0 = ((C2191h) aVar).mo8166s0(view);
                    if (s0 != -1) {
                        iArr[1] = iArr[1] + ((C2191h) this.f7937h).mo8155R0(view, Math.max(0, s0 - i5));
                    }
                }
            }
            m8809p(x);
        }
    }

    /* renamed from: m */
    public void mo1193m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        ActionBarContainer actionBarContainer;
        C2071a aVar;
        View x = m8816x(view);
        if (x != null) {
            if (i4 < 0) {
                int i7 = iArr[1];
                if (i4 - i7 <= 0 && (aVar = this.f7937h) != null && (aVar instanceof C2191h)) {
                    View view2 = view;
                    int S0 = ((C2191h) aVar).mo8156S0(view, i4 - i7);
                    iArr[1] = iArr[1] + S0;
                    i6 = i4 - S0;
                    int[] iArr2 = this.f7944k0;
                    iArr2[1] = 0;
                    actionBarContainer = this.f7931e;
                    if (actionBarContainer != null && !this.f7949p) {
                        actionBarContainer.mo7697w(view, i, i2, i3, i6, i5, iArr, iArr2);
                    }
                    m8809p(x);
                }
            }
            View view3 = view;
            i6 = i4;
            int[] iArr22 = this.f7944k0;
            iArr22[1] = 0;
            actionBarContainer = this.f7931e;
            actionBarContainer.mo7697w(view, i, i2, i3, i6, i5, iArr, iArr22);
            m8809p(x);
        }
    }

    /* renamed from: n */
    public void mo1194n(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r2.f7937h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = r2.f7931e;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1195o(android.view.View r3, android.view.View r4, int r5, int r6) {
        /*
            r2 = this;
            android.view.View r0 = r2.m8816x(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            miuix.appcompat.app.a r0 = r2.f7937h
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.mo374n()
            if (r0 == 0) goto L_0x001d
            miuix.appcompat.internal.app.widget.ActionBarContainer r0 = r2.f7931e
            if (r0 == 0) goto L_0x001d
            boolean r3 = r0.mo7643A(r3, r4, r5, r6)
            if (r3 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.mo1195o(android.view.View, android.view.View, int, int):boolean");
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        return (Build.VERSION.SDK_INT < 28 || onApplyWindowInsets.isConsumed() || !mo7825H()) ? onApplyWindowInsets : windowInsets.consumeDisplayCutout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7947n = C2693a.m11238g(getContext());
        requestFitSystemWindows();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AutoDensityConfig.updateDensity(getContext());
        this.f7947n = C2693a.m11238g(getContext());
        int a = C1878b.m7804a(getContext());
        if (this.f7934f0 != a) {
            this.f7934f0 = a;
            m8817z();
        }
        this.f7920R.mo5640p();
        post(new C2202k(this));
        C2539b bVar = this.f7914L;
        if (bVar != null && bVar.mo9720c0()) {
            this.f7914L.mo9721d0();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentInsetStateCallback((C2131w) null);
        setExtraPaddingObserver((C2129u) null);
        this.f7947n = null;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m8798N();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7950q) {
            m8799R();
        }
        C1925e eVar = this.f7923U;
        if (eVar != null && eVar.mo6503i()) {
            int f = (int) (((float) this.f7923U.mo6500f()) * getResources().getDisplayMetrics().density);
            if (f != this.f7924V) {
                this.f7924V = f;
                C2129u uVar = this.f7940i0;
                if (uVar != null) {
                    uVar.mo7584m(f);
                }
            }
            if (this.f7926a0) {
                this.f7923U.mo6499e(this.f7933f);
            }
        }
        C2071a aVar = this.f7937h;
        if (aVar != null && !this.f7949p) {
            ((C2191h) aVar).mo8154Q0();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int m = this.f7920R.mo5638m(i);
        int e = this.f7920R.mo5636e(i2);
        View view = this.f7933f;
        View view2 = this.f7943k;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt == view || childAt == view2 || childAt.getVisibility() == 8)) {
                View view3 = childAt;
                measureChildWithMargins(childAt, m, 0, e, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                i4 = Math.max(i4, view3.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                i5 = Math.max(i5, view3.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
            }
        }
        ActionBarContainer actionBarContainer = this.f7931e;
        int measuredHeight = (actionBarContainer == null || actionBarContainer.getVisibility() == 8) ? 0 : this.f7931e.getMeasuredHeight();
        int bottomInset = getBottomInset();
        ActionBarView actionBarView = this.f7929d;
        int i8 = (actionBarView == null || !actionBarView.mo7906W0()) ? 0 : bottomInset;
        this.f7904B.set(this.f7959z);
        this.f7958y.set(this.f7956w);
        boolean G = m8795G();
        boolean I = mo7826I();
        if (I && measuredHeight > 0) {
            this.f7958y.top = 0;
        }
        if (!this.f7950q) {
            Rect rect = this.f7958y;
            rect.top += measuredHeight;
            rect.bottom += i8;
        } else {
            if (!I) {
                this.f7904B.top += measuredHeight;
            } else if (measuredHeight > 0) {
                this.f7904B.top = measuredHeight;
            }
            this.f7904B.bottom += i8;
        }
        if ((!this.f7921S || !this.f7922T) && G) {
            if (getResources().getConfiguration().orientation == 2) {
                Rect rect2 = this.f7958y;
                rect2.right = 0;
                rect2.left = 0;
            }
            if (bottomInset == 0) {
                this.f7958y.bottom = 0;
            }
        }
        if (!m8793C()) {
            m8810r(view, this.f7958y, true, true, true, true);
            this.f7913K = null;
        }
        if (!this.f7950q) {
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
        }
        if (!this.f7903A.equals(this.f7904B) || this.f7952s) {
            this.f7903A.set(this.f7904B);
            super.fitSystemWindows(this.f7959z);
            this.f7952s = false;
        }
        if (mo7826I() && this.f7953t) {
            Drawable drawable = this.f7954u;
            if (drawable != null) {
                drawable.setBounds(0, 0, getRight() - getLeft(), this.f7956w.top);
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
                if (viewGroup != null && viewGroup.getChildCount() == 1) {
                    View childAt2 = viewGroup.getChildAt(0);
                    childAt2.setPadding(childAt2.getPaddingLeft(), 0, childAt2.getPaddingRight(), childAt2.getPaddingBottom());
                }
            }
        }
        C1925e eVar = this.f7923U;
        if (eVar != null && eVar.mo6503i()) {
            float f = getResources().getDisplayMetrics().density;
            int size = View.MeasureSpec.getSize(m);
            int size2 = View.MeasureSpec.getSize(e);
            C2711k kVar = this.f7947n;
            if (kVar != null) {
                C1925e eVar2 = this.f7923U;
                Point point = kVar.f10510d;
                eVar2.mo6504j(point.x, point.y, size, size2, f, this.f7911I);
            }
            if (this.f7926a0) {
                i3 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) - ((((float) this.f7923U.mo6500f()) * f) * 2.0f)), View.MeasureSpec.getMode(m));
                measureChildWithMargins(view, i3, 0, e, 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                int max = Math.max(i4, view.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
                int max2 = Math.max(i5, view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
                int combineMeasuredStates = View.combineMeasuredStates(i6, view.getMeasuredState());
                if (view2 != null && view2.getVisibility() == 0) {
                    View view4 = view2;
                    m8810r(view4, this.f7905C, true, false, true, true);
                    measureChildWithMargins(view4, m, 0, e, 0);
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(max + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), m, combineMeasuredStates), View.resolveSizeAndState(Math.max(max2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), e, combineMeasuredStates << 16));
                post(new C2203l(this));
            }
        }
        i3 = m;
        measureChildWithMargins(view, i3, 0, e, 0);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) view.getLayoutParams();
        int max3 = Math.max(i4, view.getMeasuredWidth() + layoutParams22.leftMargin + layoutParams22.rightMargin);
        int max22 = Math.max(i5, view.getMeasuredHeight() + layoutParams22.topMargin + layoutParams22.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(i6, view.getMeasuredState());
        View view42 = view2;
        m8810r(view42, this.f7905C, true, false, true, true);
        measureChildWithMargins(view42, m, 0, e, 0);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), m, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max22 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), e, combineMeasuredStates2 << 16));
        post(new C2203l(this));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        return this.f7921S;
    }

    /* renamed from: q */
    public void mo7855q(int i) {
        if (this.f7913K == null) {
            this.f7913K = new Rect();
        }
        Rect rect = this.f7913K;
        Rect rect2 = this.f7958y;
        rect.top = rect2.top;
        rect.bottom = i;
        rect.right = rect2.right;
        rect.left = rect2.left;
        m8810r(this.f7933f, rect, true, true, true, true);
        this.f7933f.requestLayout();
    }

    public void requestFitSystemWindows() {
        super.requestFitSystemWindows();
        this.f7952s = true;
    }

    public void setActionBar(C2071a aVar) {
        this.f7937h = aVar;
        if (aVar != null) {
            ((C2191h) aVar).mo8147H0(this.f7923U);
        }
    }

    public void setActionBarContextView(ActionBarContextView actionBarContextView) {
        this.f7941j = actionBarContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionBarView(this.f7929d);
            this.f7941j.setBottomMenuMode(this.f7932e0);
            this.f7941j.setPendingInset(this.f7908F);
        }
    }

    public void setAnimating(boolean z) {
        this.f7919Q = z;
    }

    public void setBottomExtraInset(int i) {
        int i2;
        if (this.f7927b0 != i) {
            this.f7927b0 = i;
            int max = Math.max(getBottomInset(), this.f7928c0);
            if (m8795G() && max <= (i2 = this.f7908F.bottom)) {
                max = i2;
            }
            int max2 = Math.max(max, this.f7927b0);
            Rect rect = this.f7906D;
            if (rect.bottom != max2) {
                rect.bottom = max2;
                m8814v(rect);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        ActionBarView actionBarView = this.f7929d;
        if (actionBarView != null) {
            actionBarView.setBottomMenuCustomView(view);
        }
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        ActionBarView actionBarView = this.f7929d;
        if (actionBarView != null) {
            actionBarView.setBottomMenuCustomViewTranslationYWithPx(i);
        }
    }

    public void setBottomMenuExtraInset(int i) {
        this.f7928c0 = i;
    }

    public void setBottomMenuMode(int i) {
        if (this.f7930d0 != i) {
            this.f7930d0 = i;
            mo7831Q();
        }
    }

    public void setCallback(Window.Callback callback) {
        this.f7946m = callback;
    }

    public void setContentInsetStateCallback(C2131w wVar) {
        this.f7938h0 = wVar;
    }

    public void setContentMask(View view) {
        this.f7943k = view;
        if (C1650d.m6968b() && this.f7943k != null) {
            C0528f.m2201d(getContext().getResources(), C1351g.f4678b, getContext().getTheme());
        }
    }

    public void setContentView(View view) {
        this.f7933f = view;
    }

    public void setCorrectNestedScrollMotionEventEnabled(boolean z) {
        this.f7936g0 = z;
    }

    public void setExtraHorizontalPaddingEnable(boolean z) {
        if (this.f7925W != z) {
            this.f7925W = z;
            C1925e eVar = this.f7923U;
            if (eVar != null) {
                eVar.mo6505k(z);
                requestLayout();
            }
        }
    }

    @Deprecated
    public void setExtraHorizontalPaddingLevel(int i) {
    }

    public void setExtraPaddingApplyToContentEnable(boolean z) {
        if (this.f7926a0 != z) {
            this.f7926a0 = z;
            requestLayout();
        }
    }

    public void setExtraPaddingObserver(C2129u uVar) {
        this.f7940i0 = uVar;
    }

    public void setLifecycleOwner(C1048m mVar) {
        this.f7948o = mVar;
    }

    public void setOnStatusBarChangeListener(C2133y yVar) {
        this.f7918P = yVar;
    }

    public void setOverlayMode(boolean z) {
        this.f7950q = z;
        ActionBarContainer actionBarContainer = this.f7931e;
        if (actionBarContainer != null) {
            actionBarContainer.setOverlayMode(z);
        }
    }

    public void setRootSubDecor(boolean z) {
        this.f7951r = z;
    }

    public void setSplitActionBarView(ActionBarContainer actionBarContainer) {
        this.f7939i = actionBarContainer;
        actionBarContainer.setPendingInsets(this.f7908F);
    }

    public void setTranslucentStatus(int i) {
        if (this.f7955v != i) {
            this.f7955v = i;
            requestFitSystemWindows();
        }
    }

    public boolean showContextMenuForChild(View view) {
        C2539b bVar = this.f7914L;
        if (bVar == null) {
            C2539b bVar2 = new C2539b(getContext());
            this.f7914L = bVar2;
            bVar2.mo8350N(this.f7917O);
        } else {
            bVar.clear();
        }
        C2246d e0 = this.f7914L.mo9722e0(view, view.getWindowToken());
        this.f7915M = e0;
        if (e0 == null) {
            return super.showContextMenuForChild(view);
        }
        e0.mo8413b(this.f7917O);
        return true;
    }

    public boolean showContextMenuForChild(View view, float f, float f2) {
        if (m8791A(view, f, f2)) {
            return true;
        }
        return getParent() != null && getParent().showContextMenuForChild(view, f, f2);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionBarContextView actionBarContextView = this.f7941j;
        ActionMode actionMode = null;
        if (actionBarContextView != null && actionBarContextView.mo7717T()) {
            return null;
        }
        ActionMode actionMode2 = this.f7945l;
        if (actionMode2 != null) {
            actionMode2.finish();
        }
        this.f7945l = null;
        if (getCallback() != null) {
            actionMode = getCallback().onWindowStartingActionMode(m8812t(callback));
        }
        if (actionMode != null) {
            this.f7945l = actionMode;
        }
        if (!(this.f7945l == null || getCallback() == null)) {
            getCallback().onActionModeStarted(this.f7945l);
        }
        ActionBarView actionBarView = this.f7929d;
        if (actionBarView != null && actionBarView.mo7906W0()) {
            C2233c actionMenuView = this.f7929d.getActionMenuView();
            if (actionMenuView != null) {
                setBottomMenuExtraInset(actionMenuView.getCollapsedHeight());
            }
            this.f7929d.mo7910g1(false);
        }
        if ((this.f7945l instanceof C2407k) && this.f7950q) {
            m8799R();
        }
        return this.f7945l;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return mo7830P(view, callback);
    }

    /* renamed from: y */
    public C2150c mo7884y(View.OnClickListener onClickListener) {
        return new C2150c(onClickListener);
    }
}
