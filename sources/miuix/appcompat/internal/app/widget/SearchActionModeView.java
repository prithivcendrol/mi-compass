package miuix.appcompat.internal.app.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.utils.EaseManager;
import miuix.view.C2396a;
import miuix.view.C2400e;
import miuix.view.C2407k;
import p018c2.C1350f;
import p018c2.C1352h;
import p055i3.C1650d;
import p055i3.C1656j;
import p078m2.C1925e;
import p092o4.C2509a;
import p098p4.C2551a;
import p117t2.C2698f;
import p132w2.C2885a;
import p132w2.C2886b;

public class SearchActionModeView extends FrameLayout implements Animator.AnimatorListener, C2211t, TextWatcher, View.OnClickListener {

    /* renamed from: A */
    private int f8144A;

    /* renamed from: B */
    private int f8145B;

    /* renamed from: C */
    private boolean f8146C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f8147D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f8148E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f8149F;

    /* renamed from: G */
    private boolean f8150G;

    /* renamed from: H */
    private ObjectAnimator f8151H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public ActionBarContainer f8152I;

    /* renamed from: J */
    private ActionBarContainer f8153J;

    /* renamed from: K */
    private ActionBarView f8154K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public View f8155L;

    /* renamed from: M */
    private View f8156M;

    /* renamed from: N */
    private FrameLayout f8157N;

    /* renamed from: O */
    private List<C2396a> f8158O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C2407k.C2408a f8159P;

    /* renamed from: Q */
    private View.OnClickListener f8160Q;

    /* renamed from: R */
    private float f8161R;

    /* renamed from: S */
    private boolean f8162S;

    /* renamed from: T */
    private boolean f8163T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f8164U = Integer.MAX_VALUE;

    /* renamed from: V */
    private int f8165V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f8166W;

    /* renamed from: a0 */
    private int f8167a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f8168b0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public EditText f8169d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f8170e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ViewGroup f8171f;

    /* renamed from: g */
    private boolean f8172g = false;

    /* renamed from: h */
    private C1656j.C1657a f8173h = null;

    /* renamed from: i */
    private C1656j.C1657a f8174i = null;

    /* renamed from: j */
    private int f8175j;

    /* renamed from: k */
    private boolean f8176k;

    /* renamed from: l */
    private C1925e f8177l;

    /* renamed from: m */
    private int f8178m;

    /* renamed from: n */
    private WeakReference<View> f8179n;

    /* renamed from: o */
    private WeakReference<View> f8180o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public WeakReference<View> f8181p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public WeakReference<View> f8182q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public WeakReference<View> f8183r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public WeakReference<View> f8184s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int[] f8185t = new int[2];

    /* renamed from: u */
    private boolean f8186u = true;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f8187v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f8188w = -1;

    /* renamed from: x */
    private int f8189x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f8190y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f8191z;

    /* renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$a */
    class C2175a implements C2396a {
        C2175a() {
        }

        /* renamed from: d */
        public void mo6475d(boolean z, float f) {
        }

        /* renamed from: e */
        public void mo6476e(boolean z) {
            View tabContainer;
            if (z && (tabContainer = SearchActionModeView.this.f8152I.getTabContainer()) != null) {
                tabContainer.setVisibility(8);
            }
        }

        /* renamed from: f */
        public void mo6477f(boolean z) {
            ActionBarContainer actionBarContainer;
            int i;
            if (z) {
                actionBarContainer = SearchActionModeView.this.f8152I;
                i = SearchActionModeView.this.f8147D ? 4 : 8;
            } else {
                View tabContainer = SearchActionModeView.this.f8152I.getTabContainer();
                i = 0;
                if (tabContainer != null) {
                    tabContainer.setVisibility(0);
                }
                actionBarContainer = SearchActionModeView.this.f8152I;
            }
            actionBarContainer.setVisibility(i);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$b */
    class C2176b implements C2396a {

        /* renamed from: d */
        private int f8193d = 0;

        /* renamed from: e */
        private int f8194e = 0;

        /* renamed from: f */
        private int f8195f = 0;

        /* renamed from: g */
        private int f8196g;

        /* renamed from: h */
        private int f8197h;

        /* renamed from: i */
        private int f8198i;

        /* renamed from: j */
        private int f8199j;

        /* renamed from: k */
        private ActionBarView f8200k;

        /* renamed from: l */
        private View f8201l;

        /* renamed from: m */
        private C2886b f8202m;

        /* renamed from: n */
        private boolean f8203n;

        /* renamed from: o */
        private int f8204o;

        /* renamed from: p */
        private View f8205p;

        /* renamed from: q */
        private View f8206q;

        C2176b() {
        }

        /* renamed from: a */
        private void m9057a() {
            C2886b bVar = this.f8202m;
            if (bVar != null) {
                this.f8204o = bVar.mo10181b();
            }
            ActionBarView actionBarView = this.f8200k;
            if (actionBarView != null) {
                int top = actionBarView.getTop();
                int collapsedHeight = this.f8200k.getCollapsedHeight();
                int expandedHeight = this.f8200k.getExpandedHeight();
                if (this.f8200k.getExpandState() == 0) {
                    top += collapsedHeight;
                } else if (this.f8200k.getExpandState() == 1) {
                    top += expandedHeight;
                }
                this.f8196g = top;
                int i = -top;
                this.f8197h = i;
                this.f8199j = i + this.f8200k.getTop();
                if (this.f8202m != null && !this.f8203n && SearchActionModeView.this.f8147D) {
                    this.f8204o += -(expandedHeight - collapsedHeight);
                    return;
                }
                return;
            }
            this.f8201l.getLocationInWindow(SearchActionModeView.this.f8185t);
            int i2 = SearchActionModeView.this.f8185t[1];
            this.f8196g = i2;
            int k = i2 - SearchActionModeView.this.f8164U;
            this.f8196g = k;
            int i3 = -k;
            this.f8197h = i3;
            this.f8199j = i3;
        }

        /* renamed from: d */
        public void mo6475d(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            SearchActionModeView.this.setTranslationY(((float) this.f8196g) + (((float) this.f8197h) * f));
            SearchActionModeView.this.f8155L.setTranslationY(SearchActionModeView.this.getTranslationY() + ((float) SearchActionModeView.this.getHeight()));
            int i = this.f8204o;
            int max = Math.max(i, Math.round(((float) i) * f));
            if (!SearchActionModeView.this.f8147D) {
                if (z) {
                    if (this.f8202m != null) {
                        SearchActionModeView.this.setContentViewTranslation(((1.0f - f) * ((float) this.f8198i)) + (f * ((float) SearchActionModeView.this.getViewHeight())));
                    }
                    SearchActionModeView searchActionModeView = SearchActionModeView.this;
                    searchActionModeView.setContentViewTranslation(searchActionModeView.getTranslationY() - ((1.0f - f) * ((float) SearchActionModeView.this.f8188w)));
                } else {
                    if (this.f8202m != null) {
                        SearchActionModeView.this.setContentViewTranslation((float) ((int) (((float) (SearchActionModeView.this.getViewHeight() + SearchActionModeView.this.f8188w)) + ((1.0f - f) * ((float) ((this.f8196g - SearchActionModeView.this.getViewHeight()) - SearchActionModeView.this.f8188w))))));
                    }
                    SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                    searchActionModeView2.setContentViewTranslation(searchActionModeView2.getTranslationY() - ((1.0f - f) * ((float) SearchActionModeView.this.f8188w)));
                }
                this.f8202m.mo10180a(max, 0);
            }
            if (SearchActionModeView.this.f8159P != null) {
                SearchActionModeView.this.f8159P.mo7896a(max);
            }
        }

        /* renamed from: e */
        public void mo6476e(boolean z) {
            View view;
            int i;
            int i2;
            SearchActionModeView searchActionModeView;
            int i3;
            if (!z) {
                if (SearchActionModeView.this.f8159P != null) {
                    SearchActionModeView.this.f8159P.mo7896a(0);
                }
                if (!SearchActionModeView.this.f8147D) {
                    C2886b bVar = this.f8202m;
                    if (bVar != null) {
                        bVar.mo10180a(0, 0);
                    }
                    SearchActionModeView.this.setContentViewTranslation(0.0f);
                    SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                    searchActionModeView2.mo8067M(searchActionModeView2.f8148E, SearchActionModeView.this.f8149F);
                }
                if (this.f8206q != null && SearchActionModeView.this.f8147D) {
                    view = this.f8206q;
                    i2 = view.getPaddingLeft();
                    i = SearchActionModeView.this.f8190y;
                }
                SearchActionModeView.this.setTranslationY((float) (this.f8196g + this.f8197h));
                SearchActionModeView.this.f8155L.setTranslationY(SearchActionModeView.this.getTranslationY() + ((float) SearchActionModeView.this.getHeight()));
            }
            if (SearchActionModeView.this.f8159P != null) {
                SearchActionModeView.this.f8159P.mo7896a(this.f8204o);
                SearchActionModeView.this.f8159P.mo7897b(true);
            }
            if (!SearchActionModeView.this.f8147D) {
                SearchActionModeView.this.setContentViewTranslation(0.0f);
                C2886b bVar2 = this.f8202m;
                if (bVar2 != null) {
                    bVar2.mo10180a(this.f8204o, 0);
                    searchActionModeView = SearchActionModeView.this;
                    i3 = searchActionModeView.f8188w + SearchActionModeView.this.getViewHeight();
                } else {
                    searchActionModeView = SearchActionModeView.this;
                    i3 = searchActionModeView.f8188w;
                }
                searchActionModeView.mo8067M(i3, 0);
            }
            if (this.f8206q != null && SearchActionModeView.this.f8147D) {
                view = this.f8206q;
                i2 = view.getPaddingLeft();
                i = Math.max(SearchActionModeView.this.getViewHeight() + SearchActionModeView.this.f8188w, SearchActionModeView.this.f8190y);
            }
            SearchActionModeView.this.setTranslationY((float) (this.f8196g + this.f8197h));
            SearchActionModeView.this.f8155L.setTranslationY(SearchActionModeView.this.getTranslationY() + ((float) SearchActionModeView.this.getHeight()));
            view.setPadding(i2, i, this.f8206q.getPaddingRight(), SearchActionModeView.this.f8191z);
            SearchActionModeView.this.setTranslationY((float) (this.f8196g + this.f8197h));
            SearchActionModeView.this.f8155L.setTranslationY(SearchActionModeView.this.getTranslationY() + ((float) SearchActionModeView.this.getHeight()));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.view.View} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6477f(boolean r4) {
            /*
                r3 = this;
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                miuix.appcompat.internal.app.widget.ActionBarView r0 = r0.getActionBarView()
                r3.f8200k = r0
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8181p
                r1 = 0
                if (r0 == 0) goto L_0x001e
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8181p
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto L_0x001f
            L_0x001e:
                r0 = r1
            L_0x001f:
                r3.f8201l = r0
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8183r
                if (r0 == 0) goto L_0x0036
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8183r
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto L_0x0037
            L_0x0036:
                r0 = r1
            L_0x0037:
                r3.f8205p = r0
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8184s
                if (r0 == 0) goto L_0x004e
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8184s
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto L_0x004f
            L_0x004e:
                r0 = r1
            L_0x004f:
                r3.f8206q = r0
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8182q
                if (r0 == 0) goto L_0x0066
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                java.lang.ref.WeakReference r0 = r0.f8182q
                java.lang.Object r0 = r0.get()
                r1 = r0
                android.view.View r1 = (android.view.View) r1
            L_0x0066:
                boolean r0 = r1 instanceof p132w2.C2886b
                if (r0 == 0) goto L_0x006e
                w2.b r1 = (p132w2.C2886b) r1
                r3.f8202m = r1
            L_0x006e:
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int r0 = r0.f8164U
                r1 = 2147483647(0x7fffffff, float:NaN)
                r2 = 1
                if (r0 != r1) goto L_0x0096
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                miuix.appcompat.internal.app.widget.SearchActionModeView r1 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int[] r1 = r1.f8185t
                r0.getLocationInWindow(r1)
                miuix.appcompat.internal.app.widget.SearchActionModeView r0 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int[] r1 = r0.f8185t
                r1 = r1[r2]
                int unused = r0.f8164U = r1
            L_0x0096:
                android.view.View r0 = r3.f8201l
                if (r0 == 0) goto L_0x009e
                r1 = 0
                r0.setAlpha(r1)
            L_0x009e:
                r0 = 0
                if (r4 == 0) goto L_0x00b0
                miuix.appcompat.internal.app.widget.ActionBarView r1 = r3.f8200k
                if (r1 == 0) goto L_0x00b0
                int r1 = r1.getExpandState()
                if (r1 != 0) goto L_0x00ad
                r1 = r2
                goto L_0x00ae
            L_0x00ad:
                r1 = r0
            L_0x00ae:
                r3.f8203n = r1
            L_0x00b0:
                android.view.View r1 = r3.f8201l
                if (r1 == 0) goto L_0x00b7
                r3.m9057a()
            L_0x00b7:
                if (r4 == 0) goto L_0x0112
                android.view.View r4 = r3.f8201l
                r1 = 4
                if (r4 == 0) goto L_0x00c9
                int r4 = r4.getImportantForAccessibility()
                r3.f8193d = r4
                android.view.View r4 = r3.f8201l
                r4.setImportantForAccessibility(r1)
            L_0x00c9:
                android.view.View r4 = r3.f8205p
                if (r4 == 0) goto L_0x00d8
                int r4 = r4.getImportantForAccessibility()
                r3.f8194e = r4
                android.view.View r4 = r3.f8205p
                r4.setImportantForAccessibility(r1)
            L_0x00d8:
                android.view.View r4 = r3.f8206q
                if (r4 == 0) goto L_0x00e7
                int r4 = r4.getImportantForAccessibility()
                r3.f8195f = r4
                android.view.View r4 = r3.f8206q
                r4.setImportantForAccessibility(r2)
            L_0x00e7:
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int r1 = r3.f8196g
                float r1 = (float) r1
                r4.setTranslationY(r1)
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                boolean r4 = r4.f8147D
                if (r4 != 0) goto L_0x0166
                int r4 = r3.f8196g
                miuix.appcompat.internal.app.widget.SearchActionModeView r1 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int r1 = r1.f8188w
                int r4 = r4 - r1
                r3.f8198i = r4
                miuix.appcompat.internal.app.widget.SearchActionModeView r1 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                float r4 = (float) r4
                r1.setContentViewTranslation(r4)
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int r1 = r4.f8188w
                r4.mo8067M(r1, r0)
                goto L_0x0166
            L_0x0112:
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                miuix.view.k$a r4 = r4.f8159P
                if (r4 == 0) goto L_0x0123
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                miuix.view.k$a r4 = r4.f8159P
                r4.mo7897b(r0)
            L_0x0123:
                android.view.View r4 = r3.f8201l
                if (r4 == 0) goto L_0x012c
                int r1 = r3.f8193d
                r4.setImportantForAccessibility(r1)
            L_0x012c:
                android.view.View r4 = r3.f8205p
                if (r4 == 0) goto L_0x0135
                int r1 = r3.f8194e
                r4.setImportantForAccessibility(r1)
            L_0x0135:
                android.view.View r4 = r3.f8206q
                if (r4 == 0) goto L_0x013e
                int r1 = r3.f8195f
                r4.setImportantForAccessibility(r1)
            L_0x013e:
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                boolean r4 = r4.f8147D
                if (r4 != 0) goto L_0x0166
                w2.b r4 = r3.f8202m
                if (r4 == 0) goto L_0x0166
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int r1 = r4.getViewHeight()
                float r1 = (float) r1
                miuix.appcompat.internal.app.widget.SearchActionModeView r2 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                int r2 = r2.f8188w
                float r2 = (float) r2
                float r1 = r1 + r2
                r4.setContentViewTranslation(r1)
                w2.b r4 = r3.f8202m
                r4.mo10180a(r0, r0)
                miuix.appcompat.internal.app.widget.SearchActionModeView r4 = miuix.appcompat.internal.app.widget.SearchActionModeView.this
                r4.mo8067M(r0, r0)
            L_0x0166:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.SearchActionModeView.C2176b.mo6477f(boolean):void");
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$c */
    class C2177c implements C2396a {
        C2177c() {
        }

        /* renamed from: d */
        public void mo6475d(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            SearchActionModeView.this.f8155L.setAlpha(f);
        }

        /* renamed from: e */
        public void mo6476e(boolean z) {
            if (!z) {
                SearchActionModeView.this.f8155L.setVisibility(8);
                SearchActionModeView.this.f8155L.setAlpha(1.0f);
                SearchActionModeView.this.f8155L.setTranslationY(0.0f);
            } else if (SearchActionModeView.this.f8169d.getText().length() > 0) {
                SearchActionModeView.this.f8155L.setVisibility(8);
            }
        }

        /* renamed from: f */
        public void mo6477f(boolean z) {
            if (z) {
                SearchActionModeView.this.f8155L.setOnClickListener(SearchActionModeView.this);
                SearchActionModeView.this.f8155L.setVisibility(0);
                SearchActionModeView.this.f8155L.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$d */
    class C2178d implements C2396a {
        C2178d() {
        }

        /* renamed from: a */
        public void mo8099a(float f, int i) {
            float f2 = 1.0f - f;
            if (C1656j.m6983b(SearchActionModeView.this)) {
                f2 = f - 1.0f;
            }
            int measuredWidth = SearchActionModeView.this.f8170e.getMeasuredWidth();
            if (SearchActionModeView.this.f8170e.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) SearchActionModeView.this.f8170e.getLayoutParams();
                measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            }
            SearchActionModeView.this.f8170e.setTranslationX(((float) measuredWidth) * f2);
            if (SearchActionModeView.this.f8171f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) SearchActionModeView.this.f8171f.getLayoutParams();
                marginLayoutParams2.setMarginEnd(Math.max(SearchActionModeView.this.getPaddingStart(), (int) ((((float) (measuredWidth - i)) * f) + ((float) i))));
                SearchActionModeView.this.f8171f.setLayoutParams(marginLayoutParams2);
            }
        }

        /* renamed from: d */
        public void mo6475d(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            int s = SearchActionModeView.this.f8188w;
            SearchActionModeView searchActionModeView = SearchActionModeView.this;
            float f2 = ((float) s) * f;
            searchActionModeView.setPaddingRelative(searchActionModeView.getPaddingStart(), (int) (((float) SearchActionModeView.this.f8187v) + f2), SearchActionModeView.this.getPaddingEnd(), SearchActionModeView.this.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = SearchActionModeView.this.getLayoutParams();
            layoutParams.height = SearchActionModeView.this.f8166W + ((int) f2);
            mo8099a(f, SearchActionModeView.this.f8168b0);
            SearchActionModeView.this.setLayoutParams(layoutParams);
        }

        /* renamed from: e */
        public void mo6476e(boolean z) {
            if (!z) {
                SearchActionModeView.this.f8169d.removeTextChangedListener(SearchActionModeView.this);
                return;
            }
            int s = SearchActionModeView.this.f8188w;
            SearchActionModeView searchActionModeView = SearchActionModeView.this;
            searchActionModeView.setPaddingRelative(searchActionModeView.getPaddingStart(), SearchActionModeView.this.f8187v + s, SearchActionModeView.this.getPaddingEnd(), SearchActionModeView.this.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = SearchActionModeView.this.getLayoutParams();
            layoutParams.height = SearchActionModeView.this.f8166W + s;
            mo8099a(1.0f, SearchActionModeView.this.f8168b0);
            SearchActionModeView.this.setLayoutParams(layoutParams);
        }

        /* renamed from: f */
        public void mo6477f(boolean z) {
            mo8099a(z ? 0.0f : 1.0f, SearchActionModeView.this.f8168b0);
            if (z) {
                SearchActionModeView.this.f8169d.getText().clear();
                SearchActionModeView.this.f8169d.addTextChangedListener(SearchActionModeView.this);
                return;
            }
            SearchActionModeView.this.f8169d.removeTextChangedListener(SearchActionModeView.this);
            SearchActionModeView.this.f8169d.getText().clear();
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$e */
    class C2179e implements C2396a {
        C2179e() {
        }

        /* renamed from: d */
        public void mo6475d(boolean z, float f) {
            if (!z) {
                f = 1.0f - f;
            }
            ActionBarContainer splitActionBarContainer = SearchActionModeView.this.getSplitActionBarContainer();
            if (splitActionBarContainer != null) {
                splitActionBarContainer.setTranslationY(f * ((float) splitActionBarContainer.getHeight()));
            }
        }

        /* renamed from: e */
        public void mo6476e(boolean z) {
        }

        /* renamed from: f */
        public void mo6477f(boolean z) {
        }
    }

    public SearchActionModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAlpha(0.0f);
        this.f8166W = context.getResources().getDimensionPixelSize(C1350f.f4652k0);
        this.f8167a0 = context.getResources().getDimensionPixelSize(C1350f.f4650j0);
        Resources resources = context.getResources();
        int i = C1350f.f4648i0;
        this.f8168b0 = resources.getDimensionPixelSize(i);
        this.f8175j = C2698f.m11276d(context, i);
        this.f8178m = 0;
        this.f8176k = false;
    }

    /* renamed from: L */
    private void m9011L() {
        this.f8164U = Integer.MAX_VALUE;
    }

    /* renamed from: N */
    private boolean m9012N() {
        return this.f8181p != null;
    }

    /* renamed from: O */
    private void m9013O(float f) {
        WeakReference<View> weakReference = this.f8179n;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        boolean E = actionBarOverlayLayout != null ? actionBarOverlayLayout.mo7823E() : false;
        C1925e eVar = this.f8177l;
        if (eVar == null || !eVar.mo6503i() || (!E && !this.f8176k)) {
            this.f8178m = 0;
        } else {
            this.f8178m = (int) (((float) this.f8177l.mo6500f()) * f);
        }
    }

    /* renamed from: P */
    private void m9014P() {
        setPaddingRelative(getPaddingStart(), this.f8187v + this.f8188w, getPaddingEnd(), getPaddingBottom());
        getLayoutParams().height = this.f8166W + this.f8188w;
    }

    /* renamed from: Q */
    private void m9015Q(boolean z) {
        if (z) {
            WeakReference<View> weakReference = this.f8184s;
            View view = null;
            View view2 = weakReference != null ? weakReference.get() : null;
            WeakReference<View> weakReference2 = this.f8181p;
            if (weakReference2 != null) {
                view = weakReference2.get();
            }
            if (!((view == null || view2 == null || view.getParent() == view2.getParent()) ? false : true) && view2 != null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && !this.f8147D) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.topMargin = getViewHeight();
                marginLayoutParams.bottomMargin = 0;
                view2.setLayoutParams(marginLayoutParams);
                view2.requestLayout();
            }
        }
    }

    /* renamed from: R */
    private void m9016R(int i, float f) {
        setPaddingRelative(((int) (((float) this.f8175j) * f)) + i, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        TextView textView = this.f8170e;
        C1656j.C1657a aVar = this.f8174i;
        textView.setPaddingRelative(aVar.f6525b, aVar.f6526c, aVar.f6527d, aVar.f6528e);
        int measuredWidth = this.f8170e.getMeasuredWidth();
        if (this.f8170e.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8170e.getLayoutParams();
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(C1350f.f4646h0) + i);
            this.f8170e.setLayoutParams(marginLayoutParams);
            measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        if (this.f8171f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f8171f.getLayoutParams();
            marginLayoutParams2.setMarginEnd(Math.max(getPaddingStart(), measuredWidth));
            this.f8171f.setLayoutParams(marginLayoutParams2);
        }
    }

    private View getContentView() {
        WeakReference<View> weakReference = this.f8180o;
        if (weakReference != null && weakReference.get() != null) {
            return this.f8180o.get();
        }
        WeakReference<View> weakReference2 = this.f8179n;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup == null) {
            return null;
        }
        View findViewById = viewGroup.findViewById(16908290);
        this.f8180o = new WeakReference<>(findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo8057B() {
        if (this.f8158O == null) {
            this.f8158O = new ArrayList();
        }
        this.f8158O.add(new C2178d());
        if (m9012N()) {
            this.f8158O.add(new C2176b());
            this.f8158O.add(new C2175a());
            this.f8158O.add(new C2179e());
        }
        if (getDimView() != null) {
            this.f8158O.add(new C2177c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo8058C() {
        ObjectAnimator objectAnimator = this.f8151H;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f8151H = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public ObjectAnimator mo8059D() {
        ObjectAnimator objectAnimator = this.f8151H;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f8151H = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "AnimationProgress", new float[]{0.0f, 1.0f});
        ofFloat.addListener(this);
        ofFloat.setDuration(C1650d.m6967a() ? 400 : 0);
        ofFloat.setInterpolator(mo8063H());
        return ofFloat;
    }

    /* renamed from: E */
    public void mo8060E(boolean z) {
        List<C2396a> list = this.f8158O;
        if (list != null) {
            for (C2396a e : list) {
                e.mo6476e(z);
            }
        }
    }

    /* renamed from: F */
    public void mo8061F(boolean z) {
        List<C2396a> list = this.f8158O;
        if (list != null) {
            for (C2396a f : list) {
                f.mo6477f(z);
            }
        }
    }

    /* renamed from: G */
    public void mo8062G(boolean z, float f) {
        List<C2396a> list = this.f8158O;
        if (list != null) {
            for (C2396a d : list) {
                d.mo6475d(z, f);
            }
        }
    }

    /* renamed from: H */
    public TimeInterpolator mo8063H() {
        EaseManager.InterpolateEaseStyle interpolateEaseStyle = new EaseManager.InterpolateEaseStyle(0, new float[0]);
        interpolateEaseStyle.setFactors(0.98f, 0.75f);
        return EaseManager.getInterpolator(interpolateEaseStyle);
    }

    /* renamed from: I */
    public void mo8064I() {
        m9011L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo8065J() {
        getActionBarView();
        getActionBarContainer();
        getSplitActionBarContainer();
    }

    /* renamed from: K */
    public void mo8066K(Rect rect) {
        int i = this.f8188w;
        int i2 = rect.top;
        if (i != i2) {
            this.f8188w = i2;
            m9014P();
            if (!this.f8147D) {
                WeakReference<View> weakReference = this.f8182q;
                mo8067M((weakReference != null ? weakReference.get() : null) instanceof C2886b ? this.f8188w + getViewHeight() : this.f8188w, 0);
            }
            m9015Q(this.f8172g);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo8067M(int i, int i2) {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.setPaddingRelative(contentView.getPaddingStart(), i + this.f8148E, contentView.getPaddingEnd(), i2 + this.f8149F);
        }
    }

    /* renamed from: a */
    public void mo7722a() {
        mo8058C();
        this.f8172g = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.f8152I = null;
        this.f8154K = null;
        List<C2396a> list = this.f8158O;
        if (list != null) {
            list.clear();
            this.f8158O = null;
        }
        if (this.f8159P != null) {
            this.f8159P = null;
        }
        this.f8153J = null;
    }

    public void afterTextChanged(Editable editable) {
        View view;
        if ((editable == null ? 0 : editable.length()) == 0) {
            View view2 = this.f8155L;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C2509a.m10663a(getContext()).mo9670c(this.f8169d);
        } else if (this.f8189x == 0 && (view = this.f8155L) != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo7724b(C2396a aVar) {
        if (aVar != null) {
            if (this.f8158O == null) {
                this.f8158O = new ArrayList();
            }
            if (!this.f8158O.contains(aVar)) {
                this.f8158O.add(aVar);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f8189x = charSequence == null ? 0 : charSequence.length();
    }

    /* renamed from: c */
    public void mo7725c(ActionMode actionMode) {
        this.f8172g = true;
        m9015Q(true);
    }

    /* renamed from: g */
    public void mo7728g() {
        this.f8169d.setFocusable(false);
        this.f8169d.setFocusableInTouchMode(false);
        ObjectAnimator objectAnimator = this.f8151H;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        FrameLayout frameLayout = this.f8157N;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public ActionBarContainer getActionBarContainer() {
        if (this.f8152I == null) {
            WeakReference<View> weakReference = this.f8179n;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getId() == C1352h.f4711d && (childAt instanceof ActionBarContainer)) {
                        this.f8152I = (ActionBarContainer) childAt;
                        break;
                    }
                    i++;
                }
            }
            ActionBarContainer actionBarContainer = this.f8152I;
            if (actionBarContainer != null) {
                int i2 = ((ViewGroup.MarginLayoutParams) actionBarContainer.getLayoutParams()).topMargin;
                this.f8165V = i2;
                if (i2 > 0) {
                    setPaddingRelative(getPaddingStart(), this.f8187v + this.f8188w + this.f8165V, getPaddingEnd(), getPaddingBottom());
                }
            }
        }
        return this.f8152I;
    }

    /* access modifiers changed from: protected */
    public ActionBarView getActionBarView() {
        if (this.f8154K == null) {
            WeakReference<View> weakReference = this.f8179n;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                this.f8154K = (ActionBarView) viewGroup.findViewById(C1352h.f4705a);
            }
        }
        return this.f8154K;
    }

    public float getAnimationProgress() {
        return this.f8161R;
    }

    public View getCustomView() {
        return this.f8156M;
    }

    /* access modifiers changed from: protected */
    public View getDimView() {
        if (this.f8155L == null) {
            WeakReference<View> weakReference = this.f8179n;
            ViewStub viewStub = null;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount() - 1;
                while (true) {
                    if (childCount < 0) {
                        break;
                    } else if (viewGroup.getChildAt(childCount).getId() == C1352h.f4698T) {
                        viewStub = (ViewStub) viewGroup.getChildAt(childCount);
                        break;
                    } else {
                        childCount--;
                    }
                }
                this.f8155L = viewStub != null ? viewStub.inflate() : viewGroup.findViewById(C1352h.f4697S);
            }
        }
        FrameLayout frameLayout = this.f8157N;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        return this.f8155L;
    }

    public EditText getSearchInput() {
        return this.f8169d;
    }

    /* access modifiers changed from: protected */
    public ActionBarContainer getSplitActionBarContainer() {
        if (this.f8153J == null) {
            WeakReference<View> weakReference = this.f8179n;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getId() == C1352h.f4704Z && (childAt instanceof ActionBarContainer)) {
                        this.f8153J = (ActionBarContainer) childAt;
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f8153J;
    }

    public int getViewHeight() {
        return this.f8166W;
    }

    /* access modifiers changed from: protected */
    public C2551a getViewPager() {
        WeakReference<View> weakReference = this.f8179n;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        if (actionBarOverlayLayout == null || !((C2191h) actionBarOverlayLayout.getActionBar()).mo8171x0()) {
            return null;
        }
        return (C2551a) actionBarOverlayLayout.findViewById(C1352h.f4722i0);
    }

    /* renamed from: h */
    public void mo7744h(boolean z) {
        mo8065J();
        float f = getResources().getDisplayMetrics().density;
        m9013O(f);
        m9016R(this.f8178m, f);
        this.f8150G = z;
        this.f8151H = mo8059D();
        if (z) {
            mo8057B();
            WeakReference<View> weakReference = this.f8179n;
            ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
            if (actionBarOverlayLayout != null) {
                this.f8147D = actionBarOverlayLayout.mo7824F();
                actionBarOverlayLayout.setOverlayMode(true);
            }
        }
        mo8061F(z);
        this.f8151H.start();
        if (!this.f8150G) {
            this.f8169d.clearFocus();
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f8169d.getWindowToken(), 0);
        }
    }

    public void onAnimationCancel(Animator animator) {
        this.f8163T = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f8163T) {
            View view = null;
            this.f8151H = null;
            mo8060E(this.f8150G);
            if (this.f8150G) {
                this.f8169d.setFocusable(true);
                this.f8169d.setFocusableInTouchMode(true);
                C2509a.m10663a(getContext()).mo9670c(this.f8169d);
            } else {
                C2509a.m10663a(getContext()).mo9669b(this.f8169d);
            }
            if (!this.f8150G) {
                WeakReference<View> weakReference = this.f8179n;
                ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setOverlayMode(this.f8147D);
                    actionBarOverlayLayout.mo7829O();
                }
                WeakReference<View> weakReference2 = this.f8181p;
                if (weakReference2 != null) {
                    view = weakReference2.get();
                }
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                setAlpha(0.0f);
                mo7722a();
            }
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f8163T = false;
        if (this.f8150G) {
            setAlpha(1.0f);
        }
    }

    public void onClick(View view) {
        if (this.f8160Q == null) {
            return;
        }
        if (view.getId() == C1352h.f4700V || view.getId() == C1352h.f4697S) {
            this.f8160Q.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9011L();
        this.f8186u = true;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8173h = new C1656j.C1657a((View) this);
        TextView textView = (TextView) findViewById(C1352h.f4700V);
        this.f8170e = textView;
        textView.setOnClickListener(this);
        this.f8174i = new C1656j.C1657a((View) this.f8170e);
        ViewGroup viewGroup = (ViewGroup) findViewById(C1352h.f4696R);
        this.f8171f = viewGroup;
        C2400e.m10241b(viewGroup, false);
        this.f8169d = (EditText) findViewById(16908297);
        Folme.useAt(this.f8171f).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(this.f8169d, new AnimConfig[0]);
        this.f8187v = this.f8173h.f6526c;
        View contentView = getContentView();
        if (contentView != null) {
            this.f8148E = contentView.getPaddingTop();
            this.f8149F = contentView.getPaddingBottom();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f8155L;
        if (view != null) {
            view.setTranslationY((getTranslationY() + ((float) i4)) - ((float) i2));
        }
        ObjectAnimator objectAnimator = this.f8151H;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            float f = getResources().getDisplayMetrics().density;
            m9013O(f);
            m9016R(this.f8178m, f);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setAnchorApplyExtraPaddingByUser(boolean z) {
        if (this.f8176k != z) {
            this.f8176k = z;
            float f = getResources().getDisplayMetrics().density;
            m9013O(f);
            m9016R(this.f8178m, f);
        }
    }

    public void setAnchorView(View view) {
        if (view != null && view.findViewById(C1352h.f4699U) != null) {
            this.f8181p = new WeakReference<>(view);
            if (view.getParent() != null) {
                this.f8182q = new WeakReference<>((View) view.getParent());
            }
        }
    }

    public void setAnimateView(View view) {
        if (view != null) {
            this.f8183r = new WeakReference<>(view);
        }
    }

    public void setAnimatedViewListener(C2407k.C2408a aVar) {
        this.f8159P = aVar;
    }

    public void setAnimationProgress(float f) {
        this.f8161R = f;
        mo8062G(this.f8150G, f);
    }

    /* access modifiers changed from: protected */
    public void setContentViewTranslation(float f) {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.setTranslationY(f);
        }
    }

    public void setCustomView(View view) {
        if (view != null && !this.f8162S) {
            this.f8156M = view;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f8157N = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            this.f8157N.setId(C1352h.f4695Q);
            this.f8157N.addView(this.f8156M, layoutParams);
            this.f8157N.setPadding(0, 0, 0, 0);
            getDimView();
            ((ViewGroup) this.f8155L).addView(this.f8157N, layoutParams);
            this.f8162S = true;
        }
    }

    public void setExtraPaddingPolicy(C1925e eVar) {
        if (this.f8177l != eVar) {
            this.f8177l = eVar;
            float f = getResources().getDisplayMetrics().density;
            m9013O(f);
            m9016R(this.f8178m, f);
        }
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f8160Q = onClickListener;
    }

    public void setOverlayModeView(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f8179n = new WeakReference<>(actionBarOverlayLayout);
        this.f8147D = actionBarOverlayLayout.mo7824F();
    }

    public void setResultView(View view) {
        if (view != null && !(((View) view.getParent()) instanceof C2885a)) {
            this.f8184s = new WeakReference<>(view);
            this.f8190y = view.getPaddingTop();
            this.f8191z = view.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f8144A = marginLayoutParams.topMargin;
                this.f8145B = marginLayoutParams.bottomMargin;
            }
            this.f8146C = true;
        }
    }
}
