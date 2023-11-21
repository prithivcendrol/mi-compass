package miuix.appcompat.internal.app.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.CollapsibleActionView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Scroller;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0116a;
import androidx.core.view.C0727l0;
import androidx.lifecycle.C1035g;
import androidx.lifecycle.C1048m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.C2080e;
import miuix.appcompat.internal.app.widget.C2182b;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2247e;
import miuix.appcompat.internal.view.menu.C2250g;
import miuix.appcompat.internal.view.menu.C2254i;
import miuix.appcompat.internal.view.menu.action.C2225b;
import miuix.appcompat.internal.view.menu.action.C2233c;
import miuix.appcompat.internal.view.menu.action.C2236d;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.view.C2396a;
import p018c2.C1347c;
import p018c2.C1348d;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1355k;
import p018c2.C1357m;
import p055i3.C1649c;
import p055i3.C1656j;
import p060j2.C1744a;
import p066k2.C1784f;
import p066k2.C1786h;
import p072l2.C1873b;
import p078m2.C1918a;
import p078m2.C1925e;
import p090o2.C2494a;
import p117t2.C2698f;

public class ActionBarView extends C2182b implements C2396a {

    /* renamed from: A0 */
    private C2233c f7970A0;

    /* renamed from: A1 */
    protected TransitionListener f7971A1;

    /* renamed from: B0 */
    private C2225b f7972B0;

    /* renamed from: B1 */
    protected TransitionListener f7973B1;

    /* renamed from: C0 */
    private AnimConfig f7974C0;

    /* renamed from: C1 */
    private final AdapterView.OnItemSelectedListener f7975C1;

    /* renamed from: D0 */
    private C1925e f7976D0;

    /* renamed from: D1 */
    private final View.OnClickListener f7977D1;

    /* renamed from: E0 */
    private boolean f7978E0 = true;

    /* renamed from: E1 */
    private final View.OnClickListener f7979E1;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public boolean f7980F0;

    /* renamed from: F1 */
    private final View.OnClickListener f7981F1;

    /* renamed from: G0 */
    private int f7982G0;

    /* renamed from: G1 */
    private final View.OnClickListener f7983G1;

    /* renamed from: H0 */
    private int f7984H0;

    /* renamed from: H1 */
    private final TextWatcher f7985H1;

    /* renamed from: I0 */
    private int f7986I0;

    /* renamed from: I1 */
    private boolean f7987I1;

    /* renamed from: J0 */
    private int f7988J0;

    /* renamed from: J1 */
    private int f7989J1;

    /* renamed from: K0 */
    private int f7990K0;
    /* access modifiers changed from: private */

    /* renamed from: K1 */
    public int f7991K1;

    /* renamed from: L */
    private float f7992L;

    /* renamed from: L0 */
    private int f7993L0;

    /* renamed from: L1 */
    int f7994L1;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f7995M;

    /* renamed from: M0 */
    private int f7996M0;

    /* renamed from: M1 */
    int f7997M1;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f7998N = -1;

    /* renamed from: N0 */
    private int f7999N0;
    /* access modifiers changed from: private */

    /* renamed from: N1 */
    public int f8000N1;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public CharSequence f8001O;

    /* renamed from: O0 */
    private int f8002O0;

    /* renamed from: O1 */
    private int f8003O1;

    /* renamed from: P */
    private CharSequence f8004P;

    /* renamed from: P0 */
    private int f8005P0;
    /* access modifiers changed from: private */

    /* renamed from: P1 */
    public C2182b.C2184b f8006P1;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public CharSequence f8007Q;

    /* renamed from: Q0 */
    private int f8008Q0;
    /* access modifiers changed from: private */

    /* renamed from: Q1 */
    public C2182b.C2184b f8009Q1;

    /* renamed from: R */
    private int f8010R;

    /* renamed from: R0 */
    private int f8011R0;

    /* renamed from: R1 */
    private boolean f8012R1;

    /* renamed from: S */
    private Drawable f8013S;

    /* renamed from: S0 */
    private final int f8014S0;

    /* renamed from: S1 */
    private boolean f8015S1;

    /* renamed from: T */
    private Drawable f8016T;

    /* renamed from: T0 */
    private boolean f8017T0 = false;
    /* access modifiers changed from: private */

    /* renamed from: T1 */
    public Scroller f8018T1;

    /* renamed from: U */
    private Context f8019U;

    /* renamed from: U0 */
    private boolean f8020U0;

    /* renamed from: U1 */
    private boolean f8021U1;

    /* renamed from: V */
    private C1048m f8022V = null;

    /* renamed from: V0 */
    private boolean f8023V0;

    /* renamed from: V1 */
    private boolean f8024V1;

    /* renamed from: W */
    private final int f8025W;

    /* renamed from: W0 */
    private boolean f8026W0;

    /* renamed from: W1 */
    private boolean f8027W1;

    /* renamed from: X0 */
    private boolean f8028X0 = true;

    /* renamed from: X1 */
    private IStateStyle f8029X1;

    /* renamed from: Y0 */
    private boolean f8030Y0 = true;

    /* renamed from: Y1 */
    private Runnable f8031Y1;

    /* renamed from: Z0 */
    private boolean f8032Z0;

    /* renamed from: a0 */
    private View f8033a0;

    /* renamed from: a1 */
    private int f8034a1;

    /* renamed from: b0 */
    private final int f8035b0;

    /* renamed from: b1 */
    private boolean f8036b1;

    /* renamed from: c0 */
    private Drawable f8037c0;

    /* renamed from: c1 */
    private boolean f8038c1 = false;

    /* renamed from: d0 */
    private int f8039d0;

    /* renamed from: d1 */
    private boolean f8040d1 = false;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public HomeView f8041e0;

    /* renamed from: e1 */
    private boolean f8042e1 = false;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public HomeView f8043f0;

    /* renamed from: f1 */
    private boolean f8044f1 = false;

    /* renamed from: g0 */
    private FrameLayout f8045g0;

    /* renamed from: g1 */
    private boolean f8046g1 = false;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public FrameLayout f8047h0;

    /* renamed from: h1 */
    private C2242c f8048h1;

    /* renamed from: i0 */
    private FrameLayout f8049i0;

    /* renamed from: i1 */
    private C2242c f8050i1;

    /* renamed from: j0 */
    private FrameLayout f8051j0;

    /* renamed from: j1 */
    private boolean f8052j1;

    /* renamed from: k0 */
    private FrameLayout f8053k0;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public C2494a f8054k1;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C1784f f8055l0;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public C2494a f8056l1;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C1786h f8057m0;

    /* renamed from: m1 */
    private SpinnerAdapter f8058m1;

    /* renamed from: n0 */
    private boolean f8059n0 = false;
    /* access modifiers changed from: private */

    /* renamed from: n1 */
    public C0116a.C0119c f8060n1;

    /* renamed from: o0 */
    private View f8061o0;
    /* access modifiers changed from: private */

    /* renamed from: o1 */
    public C2168o f8062o1;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public Spinner f8063p0;

    /* renamed from: p1 */
    View f8064p1;

    /* renamed from: q0 */
    private LinearLayout f8065q0;

    /* renamed from: q1 */
    Window.Callback f8066q1;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ScrollingTabContainerView f8067r0;

    /* renamed from: r1 */
    private Runnable f8068r1;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public ScrollingTabContainerView f8069s0;

    /* renamed from: s1 */
    private OnBackInvokedDispatcher f8070s1;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public SecondaryTabContainerView f8071t0;

    /* renamed from: t1 */
    private OnBackInvokedCallback f8072t1;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public SecondaryTabContainerView f8073u0;

    /* renamed from: u1 */
    private boolean f8074u1 = true;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public View f8075v0;

    /* renamed from: v1 */
    private TransitionListener f8076v1;

    /* renamed from: w0 */
    private ProgressBar f8077w0;

    /* renamed from: w1 */
    private float f8078w1;

    /* renamed from: x0 */
    private ProgressBar f8079x0;
    /* access modifiers changed from: private */

    /* renamed from: x1 */
    public boolean f8080x1;

    /* renamed from: y0 */
    private View f8081y0;

    /* renamed from: y1 */
    protected TransitionListener f8082y1;

    /* renamed from: z0 */
    private View f8083z0;

    /* renamed from: z1 */
    protected TransitionListener f8084z1;

    private static class HomeView extends FrameLayout {

        /* renamed from: d */
        private ImageView f8085d;

        /* renamed from: e */
        private ImageView f8086e;

        /* renamed from: f */
        private int f8087f;

        /* renamed from: g */
        private Drawable f8088g;

        public HomeView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo7981a() {
            return 0;
        }

        /* renamed from: b */
        public void mo7982b(Drawable drawable) {
            this.f8086e.setImageDrawable(drawable);
        }

        /* renamed from: c */
        public void mo7983c(boolean z) {
            this.f8085d.setVisibility(z ? 0 : 8);
        }

        /* renamed from: d */
        public void mo7984d(int i) {
            this.f8087f = i;
            this.f8085d.setImageDrawable(i != 0 ? getResources().getDrawable(i) : null);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            CharSequence contentDescription = getContentDescription();
            if (TextUtils.isEmpty(contentDescription)) {
                return true;
            }
            accessibilityEvent.getText().add(contentDescription);
            return true;
        }

        /* renamed from: e */
        public void mo7986e(Drawable drawable) {
            ImageView imageView = this.f8085d;
            if (drawable == null) {
                drawable = this.f8088g;
            }
            imageView.setImageDrawable(drawable);
            this.f8087f = 0;
        }

        /* access modifiers changed from: protected */
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            int i = this.f8087f;
            if (i != 0) {
                mo7984d(i);
            }
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            this.f8085d = (ImageView) findViewById(C1352h.f4720h0);
            this.f8086e = (ImageView) findViewById(C1352h.f4685G);
            ImageView imageView = this.f8085d;
            if (imageView != null) {
                this.f8088g = imageView.getDrawable();
                Folme.useAt(this.f8085d).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.f8085d).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f8085d, new AnimConfig[0]);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6 = (i4 - i2) / 2;
            boolean b = C1656j.m6983b(this);
            if (this.f8085d.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8085d.getLayoutParams();
                int measuredHeight = this.f8085d.getMeasuredHeight();
                int measuredWidth = this.f8085d.getMeasuredWidth();
                int i7 = i6 - (measuredHeight / 2);
                C1656j.m6986e(this, this.f8085d, 0, i7, measuredWidth, i7 + measuredHeight);
                i5 = layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin;
                if (b) {
                    i3 -= i5;
                } else {
                    i += i5;
                }
            } else {
                i5 = 0;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f8086e.getLayoutParams();
            int measuredHeight2 = this.f8086e.getMeasuredHeight();
            int measuredWidth2 = this.f8086e.getMeasuredWidth();
            int max = i5 + Math.max(layoutParams2.getMarginStart(), ((i3 - i) / 2) - (measuredWidth2 / 2));
            int max2 = Math.max(layoutParams2.topMargin, i6 - (measuredHeight2 / 2));
            C1656j.m6986e(this, this.f8086e, max, max2, max + measuredWidth2, max2 + measuredHeight2);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            int i3 = 0;
            measureChildWithMargins(this.f8085d, i, 0, i2, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8085d.getLayoutParams();
            int measuredWidth = layoutParams.leftMargin + this.f8085d.getMeasuredWidth() + layoutParams.rightMargin;
            if (this.f8085d.getVisibility() == 8) {
                measuredWidth = 0;
            }
            int measuredHeight = layoutParams.topMargin + this.f8085d.getMeasuredHeight() + layoutParams.bottomMargin;
            measureChildWithMargins(this.f8086e, i, measuredWidth, i2, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f8086e.getLayoutParams();
            int measuredWidth2 = layoutParams2.leftMargin + this.f8086e.getMeasuredWidth() + layoutParams2.rightMargin;
            if (this.f8086e.getVisibility() != 8) {
                i3 = measuredWidth2;
            }
            int i4 = measuredWidth + i3;
            int max = Math.max(measuredHeight, layoutParams2.topMargin + this.f8086e.getMeasuredHeight() + layoutParams2.bottomMargin);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                i4 = Math.min(i4, size);
            } else if (mode == 1073741824) {
                i4 = size;
            }
            if (mode2 == Integer.MIN_VALUE) {
                max = Math.min(max, size2);
            } else if (mode2 == 1073741824) {
                max = size2;
            }
            setMeasuredDimension(i4, max);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$a */
    class C2154a implements TextWatcher {
        C2154a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!charSequence.equals(ActionBarView.this.f8001O)) {
                CharSequence unused = ActionBarView.this.f8007Q = charSequence;
            }
            if (ActionBarView.this.f8057m0 != null) {
                ActionBarView.this.f8057m0.mo6226o(charSequence);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$b */
    class C2155b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f8090d;

        C2155b(boolean z) {
            this.f8090d = z;
        }

        public void run() {
            ActionBarView.this.mo7909f1(this.f8090d);
            C2233c cVar = ActionBarView.this.f8243l;
            if (cVar != null) {
                cVar.setVisibility(0);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$c */
    class C2156c extends TransitionListener {

        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f8092a;

        /* renamed from: b */
        final /* synthetic */ int f8093b;

        C2156c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
            this.f8092a = actionBarOverlayLayout;
            this.f8093b = i;
        }

        public void onBegin(Object obj) {
            if (!ActionBarView.this.f7980F0) {
                boolean unused = ActionBarView.this.f7980F0 = true;
            }
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            boolean unused = ActionBarView.this.f7980F0 = false;
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo findByName = UpdateInfo.findByName(collection, View.TRANSLATION_Y.getName());
            if (findByName != null) {
                this.f8092a.mo7828M((int) (((float) this.f8093b) - findByName.getFloatValue()), 0);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$d */
    class C2157d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f8095d;

        C2157d(boolean z) {
            this.f8095d = z;
        }

        public void run() {
            ActionBarView.this.mo7909f1(this.f8095d);
            C2233c cVar = ActionBarView.this.f8243l;
            if (cVar != null) {
                cVar.setVisibility(0);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$e */
    class C2158e implements Runnable {
        C2158e() {
        }

        public void run() {
            if (ActionBarView.this.f8018T1.computeScrollOffset()) {
                ActionBarView actionBarView = ActionBarView.this;
                int currY = actionBarView.f8018T1.getCurrY();
                ActionBarView actionBarView2 = ActionBarView.this;
                int unused = actionBarView.f7991K1 = (currY - actionBarView2.f7994L1) + actionBarView2.f8000N1;
                ActionBarView.this.requestLayout();
                if (!ActionBarView.this.f8018T1.isFinished()) {
                    ActionBarView.this.postOnAnimation(this);
                    return;
                }
                int currY2 = ActionBarView.this.f8018T1.getCurrY();
                ActionBarView actionBarView3 = ActionBarView.this;
                if (currY2 == actionBarView3.f7994L1) {
                    actionBarView3.setExpandState(0);
                    return;
                }
                int currY3 = actionBarView3.f8018T1.getCurrY();
                ActionBarView actionBarView4 = ActionBarView.this;
                if (currY3 == actionBarView4.f7994L1 + actionBarView4.f8047h0.getMeasuredHeight()) {
                    ActionBarView.this.setExpandState(1);
                }
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$f */
    class C2159f extends TransitionListener {
        C2159f() {
        }

        public void onBegin(Object obj) {
            super.onBegin(obj);
            if (ActionBarView.this.f8006P1 != null) {
                ActionBarView.this.f8006P1.mo8133g();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$g */
    class C2160g extends TransitionListener {
        C2160g() {
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.f8006P1 != null) {
                ActionBarView.this.f8006P1.mo8132f();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$h */
    class C2161h extends TransitionListener {
        C2161h() {
        }

        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
            if (ActionBarView.this.f8047h0 != null && ActionBarView.this.f8047h0.getVisibility() != 0) {
                ActionBarView.this.f8009Q1.mo8138l(0);
            }
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.f8080x1) {
                ActionBarView.this.requestLayout();
            }
            boolean unused = ActionBarView.this.f8080x1 = false;
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            if (ActionBarView.this.f8080x1) {
                ActionBarView.this.requestLayout();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$i */
    class C2162i extends TransitionListener {
        C2162i() {
        }

        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
        }

        public void onComplete(Object obj) {
            C2182b.C2184b bVar;
            int i;
            super.onComplete(obj);
            if (ActionBarView.this.f8047h0.getAlpha() == 0.0f) {
                ActionBarView actionBarView = ActionBarView.this;
                int i2 = actionBarView.f8254w;
                if (i2 == 0) {
                    i = 8;
                    if (actionBarView.f8047h0.getVisibility() == 8) {
                        return;
                    }
                } else if (i2 == 2) {
                    i = 4;
                    if (actionBarView.f8047h0.getVisibility() == 4) {
                        return;
                    }
                } else {
                    return;
                }
                bVar = ActionBarView.this.f8009Q1;
            } else if (ActionBarView.this.f8047h0.getVisibility() != 0) {
                bVar = ActionBarView.this.f8009Q1;
                i = 0;
            } else {
                return;
            }
            bVar.mo8138l(i);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$j */
    class C2163j implements AdapterView.OnItemSelectedListener {
        C2163j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (ActionBarView.this.f8060n1 != null) {
                ActionBarView.this.f8060n1.onNavigationItemSelected(i, j);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$k */
    class C2164k implements View.OnClickListener {
        C2164k() {
        }

        public void onClick(View view) {
            C2247e eVar = ActionBarView.this.f8062o1.f8108e;
            if (eVar != null) {
                eVar.collapseActionView();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$l */
    class C2165l implements View.OnClickListener {
        C2165l() {
        }

        public void onClick(View view) {
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.f8066q1.onMenuItemSelected(0, actionBarView.f8054k1);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$m */
    class C2166m implements View.OnClickListener {
        C2166m() {
        }

        public void onClick(View view) {
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.f8066q1.onMenuItemSelected(0, actionBarView.f8056l1);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$n */
    class C2167n implements View.OnClickListener {
        C2167n() {
        }

        public void onClick(View view) {
            View.OnClickListener onClickListener = ActionBarView.this.f8234K;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$o */
    private class C2168o implements C2250g {

        /* renamed from: d */
        C2242c f8107d;

        /* renamed from: e */
        C2247e f8108e;

        private C2168o() {
        }

        /* synthetic */ C2168o(ActionBarView actionBarView, C2159f fVar) {
            this();
        }

        /* renamed from: b */
        public void mo8003b(boolean z) {
            if (this.f8108e != null) {
                C2242c cVar = this.f8107d;
                boolean z2 = false;
                if (cVar != null) {
                    int size = cVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f8107d.getItem(i) == this.f8108e) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo8009i(this.f8107d, this.f8108e);
                }
            }
        }

        /* renamed from: c */
        public boolean mo8004c() {
            return false;
        }

        /* renamed from: d */
        public void mo8005d(C2242c cVar, boolean z) {
        }

        /* renamed from: e */
        public boolean mo8006e(C2254i iVar) {
            return false;
        }

        /* renamed from: g */
        public boolean mo8007g(C2242c cVar, C2247e eVar) {
            ActionBarView.this.f8064p1 = eVar.getActionView();
            ActionBarView.this.m8875M0();
            ActionBarView.this.f8043f0.mo7982b(ActionBarView.this.getIcon().getConstantState().newDrawable(ActionBarView.this.getResources()));
            this.f8108e = eVar;
            ViewParent parent = ActionBarView.this.f8064p1.getParent();
            ActionBarView actionBarView = ActionBarView.this;
            if (parent != actionBarView) {
                actionBarView.addView(actionBarView.f8064p1);
            }
            ViewParent parent2 = ActionBarView.this.f8043f0.getParent();
            ActionBarView actionBarView2 = ActionBarView.this;
            if (parent2 != actionBarView2) {
                actionBarView2.addView(actionBarView2.f8043f0);
            }
            if (ActionBarView.this.f8041e0 != null) {
                ActionBarView.this.f8041e0.setVisibility(8);
            }
            if (ActionBarView.this.f8055l0 != null) {
                ActionBarView.this.setTitleVisibility(false);
            }
            if (ActionBarView.this.f8067r0 != null) {
                ActionBarView.this.f8067r0.setVisibility(8);
            }
            if (ActionBarView.this.f8069s0 != null) {
                ActionBarView.this.f8069s0.setVisibility(8);
            }
            if (ActionBarView.this.f8071t0 != null) {
                ActionBarView.this.f8071t0.setVisibility(8);
            }
            if (ActionBarView.this.f8073u0 != null) {
                ActionBarView.this.f8073u0.setVisibility(8);
            }
            if (ActionBarView.this.f8063p0 != null) {
                ActionBarView.this.f8063p0.setVisibility(8);
            }
            if (ActionBarView.this.f8075v0 != null) {
                ActionBarView.this.f8075v0.setVisibility(8);
            }
            ActionBarView.this.requestLayout();
            eVar.mo8453p(true);
            View view = ActionBarView.this.f8064p1;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).onActionViewExpanded();
            }
            ActionBarView.this.m8865I1();
            return true;
        }

        /* renamed from: h */
        public void mo8008h(Context context, C2242c cVar) {
            C2247e eVar;
            C2242c cVar2 = this.f8107d;
            if (!(cVar2 == null || (eVar = this.f8108e) == null)) {
                cVar2.mo8380f(eVar);
            }
            this.f8107d = cVar;
        }

        /* renamed from: i */
        public boolean mo8009i(C2242c cVar, C2247e eVar) {
            View view = ActionBarView.this.f8064p1;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).onActionViewCollapsed();
            }
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.removeView(actionBarView.f8064p1);
            ActionBarView actionBarView2 = ActionBarView.this;
            actionBarView2.removeView(actionBarView2.f8043f0);
            ActionBarView actionBarView3 = ActionBarView.this;
            actionBarView3.f8064p1 = null;
            if ((actionBarView3.f7998N & 2) != 0) {
                ActionBarView.this.f8041e0.setVisibility(0);
            }
            if ((ActionBarView.this.f7998N & 8) != 0) {
                if (ActionBarView.this.f8055l0 == null) {
                    ActionBarView.this.m8883P0();
                } else {
                    ActionBarView.this.setTitleVisibility(true);
                }
            }
            if (ActionBarView.this.f8067r0 != null && ActionBarView.this.f7995M == 2) {
                ActionBarView.this.f8067r0.setVisibility(0);
            }
            if (ActionBarView.this.f8069s0 != null && ActionBarView.this.f7995M == 2) {
                ActionBarView.this.f8069s0.setVisibility(0);
            }
            if (ActionBarView.this.f8071t0 != null && ActionBarView.this.f7995M == 2) {
                ActionBarView.this.f8071t0.setVisibility(0);
            }
            if (ActionBarView.this.f8073u0 != null && ActionBarView.this.f7995M == 2) {
                ActionBarView.this.f8073u0.setVisibility(0);
            }
            if (ActionBarView.this.f8063p0 != null && ActionBarView.this.f7995M == 1) {
                ActionBarView.this.f8063p0.setVisibility(0);
            }
            if (!(ActionBarView.this.f8075v0 == null || (ActionBarView.this.f7998N & 16) == 0)) {
                ActionBarView.this.f8075v0.setVisibility(0);
            }
            ActionBarView.this.f8043f0.mo7982b((Drawable) null);
            this.f8108e = null;
            ActionBarView.this.requestLayout();
            eVar.mo8453p(false);
            ActionBarView.this.m8865I1();
            return true;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$p */
    private static class C2169p extends TransitionListener {

        /* renamed from: a */
        private WeakReference<ActionBarView> f8110a;

        public C2169p(ActionBarView actionBarView) {
            this.f8110a = new WeakReference<>(actionBarView);
        }

        public void onBegin(Object obj) {
            super.onBegin(obj);
        }

        public void onCancel(Object obj) {
            super.onCancel(obj);
            this.f8110a.clear();
        }

        public void onComplete(Object obj) {
            super.onComplete(obj);
            this.f8110a.clear();
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            ActionBarView actionBarView;
            super.onUpdate(obj, collection);
            UpdateInfo findByName = UpdateInfo.findByName(collection, "actionbar_state_change");
            if (findByName != null && (actionBarView = this.f8110a.get()) != null) {
                int unused = actionBarView.f7991K1 = findByName.getIntValue();
                actionBarView.requestLayout();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$q */
    static class C2170q extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<C2170q> CREATOR = new C2171a();

        /* renamed from: d */
        int f8111d;

        /* renamed from: e */
        boolean f8112e;

        /* renamed from: f */
        boolean f8113f;

        /* renamed from: g */
        int f8114g;

        /* renamed from: h */
        boolean f8115h;

        /* renamed from: i */
        int f8116i;

        /* renamed from: j */
        boolean f8117j;

        /* renamed from: miuix.appcompat.internal.app.widget.ActionBarView$q$a */
        class C2171a implements Parcelable.ClassLoaderCreator<C2170q> {
            C2171a() {
            }

            /* renamed from: a */
            public C2170q createFromParcel(Parcel parcel) {
                return new C2170q(parcel);
            }

            /* renamed from: b */
            public C2170q createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2170q(parcel, classLoader);
            }

            /* renamed from: c */
            public C2170q[] newArray(int i) {
                return new C2170q[i];
            }
        }

        C2170q(Parcel parcel) {
            super(parcel);
            this.f8111d = parcel.readInt();
            boolean z = true;
            this.f8112e = parcel.readInt() != 0;
            this.f8113f = parcel.readInt() != 0;
            this.f8114g = parcel.readInt();
            this.f8115h = parcel.readInt() != 0;
            this.f8116i = parcel.readInt();
            this.f8117j = parcel.readInt() == 0 ? false : z;
        }

        C2170q(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8111d = parcel.readInt();
            boolean z = true;
            this.f8112e = parcel.readInt() != 0;
            this.f8113f = parcel.readInt() != 0;
            this.f8114g = parcel.readInt();
            this.f8115h = parcel.readInt() != 0;
            this.f8116i = parcel.readInt();
            this.f8117j = parcel.readInt() == 0 ? false : z;
        }

        C2170q(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8111d);
            parcel.writeInt(this.f8112e ? 1 : 0);
            parcel.writeInt(this.f8113f ? 1 : 0);
            parcel.writeInt(this.f8114g);
            parcel.writeInt(this.f8115h ? 1 : 0);
            parcel.writeInt(this.f8116i);
            parcel.writeInt(this.f8117j ? 1 : 0);
        }
    }

    public ActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = 0.0f;
        this.f8078w1 = 0.0f;
        this.f8080x1 = false;
        this.f8082y1 = new C2159f();
        this.f8084z1 = new C2160g();
        this.f7971A1 = new C2161h();
        this.f7973B1 = new C2162i();
        this.f7975C1 = new C2163j();
        this.f7977D1 = new C2164k();
        this.f7979E1 = new C2165l();
        this.f7981F1 = new C2166m();
        this.f7983G1 = new C2167n();
        this.f7985H1 = new C2154a();
        this.f7987I1 = false;
        this.f7989J1 = 0;
        this.f8006P1 = new C2182b.C2184b();
        this.f8009Q1 = new C2182b.C2184b();
        this.f8012R1 = false;
        this.f8015S1 = false;
        this.f8021U1 = false;
        this.f8024V1 = false;
        this.f8027W1 = false;
        this.f8029X1 = null;
        this.f8031Y1 = new C2158e();
        this.f8019U = context;
        this.f8018T1 = new Scroller(context);
        this.f8021U1 = false;
        this.f8024V1 = false;
        this.f7992L = this.f8019U.getResources().getDisplayMetrics().density;
        this.f7988J0 = context.getResources().getDimensionPixelOffset(C1350f.f4659o);
        this.f7990K0 = context.getResources().getDimensionPixelOffset(C1350f.f4661p);
        this.f7993L0 = context.getResources().getDimensionPixelOffset(C1350f.f4663q);
        this.f7996M0 = context.getResources().getDimensionPixelOffset(C1350f.f4655m);
        this.f7999N0 = context.getResources().getDimensionPixelOffset(C1350f.f4641f);
        this.f8002O0 = context.getResources().getDimensionPixelOffset(C1350f.f4637d);
        this.f8005P0 = context.getResources().getDimensionPixelOffset(C1350f.f4667s);
        this.f8008Q0 = 0;
        this.f8239h.addListeners(this.f7971A1);
        this.f8240i.addListeners(this.f7973B1);
        this.f8235d.addListeners(this.f8082y1);
        this.f8236e.addListeners(this.f8084z1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8045g0 = frameLayout;
        frameLayout.setId(C1352h.f4707b);
        this.f8045g0.setForegroundGravity(17);
        this.f8045g0.setVisibility(0);
        this.f8045g0.setAlpha(this.f8254w == 0 ? 1.0f : 0.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f8047h0 = frameLayout2;
        frameLayout2.setId(C1352h.f4715f);
        FrameLayout frameLayout3 = this.f8047h0;
        int i = this.f7988J0;
        frameLayout3.setPaddingRelative(i, this.f7993L0, i, this.f7996M0);
        this.f8047h0.setVisibility(0);
        this.f8047h0.setAlpha(this.f8254w != 0 ? 1.0f : f);
        this.f8006P1.mo8128b(this.f8045g0);
        this.f8009Q1.mo8128b(this.f8047h0);
        setBackgroundResource(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4900a, 16843470, 0);
        this.f7995M = obtainStyledAttributes.getInt(C1357m.f4940i, 0);
        this.f8001O = obtainStyledAttributes.getText(C1357m.f4930g);
        this.f8004P = obtainStyledAttributes.getText(C1357m.f4950k);
        this.f8032Z0 = obtainStyledAttributes.getBoolean(C1357m.f4796A, false);
        this.f8016T = obtainStyledAttributes.getDrawable(C1357m.f4935h);
        this.f8013S = obtainStyledAttributes.getDrawable(C1357m.f4905b);
        LayoutInflater from = LayoutInflater.from(context);
        this.f8025W = obtainStyledAttributes.getResourceId(C1357m.f5010w, C1354j.f4762e);
        this.f8035b0 = obtainStyledAttributes.getResourceId(C1357m.f4975p, C1354j.f4760c);
        this.f8011R0 = obtainStyledAttributes.getResourceId(C1357m.f4960m, 0);
        this.f8014S0 = obtainStyledAttributes.getResourceId(C1357m.f4965n, 0);
        this.f7982G0 = obtainStyledAttributes.getDimensionPixelOffset(C1357m.f4970o, 0);
        this.f7984H0 = obtainStyledAttributes.getDimensionPixelOffset(C1357m.f4980q, 0);
        setDisplayOptions(obtainStyledAttributes.getInt(C1357m.f4945j, 0));
        int resourceId = obtainStyledAttributes.getResourceId(C1357m.f4955l, 0);
        if (resourceId != 0) {
            View inflate = from.inflate(resourceId, this, false);
            this.f8075v0 = inflate;
            inflate.setLayoutParams(new C0116a.C0117a(-1, -2, 8388627));
            this.f7995M = 0;
        }
        this.f8249r = obtainStyledAttributes.getLayoutDimension(C1357m.f4920e, 0);
        this.f8250s = obtainStyledAttributes.getLayoutDimension(C1357m.f4915d, 0);
        this.f8052j1 = obtainStyledAttributes.getBoolean(C1357m.f5020y, false);
        obtainStyledAttributes.recycle();
        Context context2 = context;
        this.f8054k1 = new C2494a(context2, 0, 16908332, 0, 0, this.f8001O);
        this.f8056l1 = new C2494a(context2, 0, 16908310, 0, 0, this.f8001O);
        m8930t1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8844A0(boolean r6) {
        /*
            r5 = this;
            k2.h r0 = r5.f8057m0
            if (r0 != 0) goto L_0x00ac
            android.content.Context r0 = r5.getContext()
            k2.h r0 = p072l2.C1873b.m7791c(r0)
            r5.f8057m0 = r0
            boolean r1 = r5.f8030Y0
            r0.mo6229r(r1)
            k2.h r0 = r5.f8057m0
            boolean r1 = r5.f8242k
            int r2 = r5.f8254w
            r0.mo6225n(r1, r2)
            k2.h r0 = r5.f8057m0
            boolean r1 = r5.f8225B
            r0.mo6219h(r1)
            java.lang.CharSequence r0 = r5.f8001O
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0052
            int r3 = r5.f7998N
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0031
            r3 = r1
            goto L_0x0032
        L_0x0031:
            r3 = r2
        L_0x0032:
            if (r3 == 0) goto L_0x0052
            android.view.View r3 = r5.f8075v0
            if (r3 == 0) goto L_0x0052
            int r4 = p018c2.C1352h.f4713e
            android.view.View r3 = r3.findViewById(r4)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            android.widget.TextView r3 = r5.m8862H0(r3)
            if (r3 == 0) goto L_0x0052
            java.lang.CharSequence r3 = r5.f8007Q
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0052
            java.lang.CharSequence r0 = r5.f8007Q
            r3 = r1
            goto L_0x0053
        L_0x0052:
            r3 = r2
        L_0x0053:
            k2.h r4 = r5.f8057m0
            r4.mo6226o(r0)
            k2.h r0 = r5.f8057m0
            android.view.View$OnClickListener r4 = r5.f7981F1
            r0.mo6221j(r4)
            k2.h r0 = r5.f8057m0
            android.view.View$OnClickListener r4 = r5.f7983G1
            r0.mo6223l(r4)
            k2.h r0 = r5.f8057m0
            if (r3 != 0) goto L_0x006d
            java.lang.CharSequence r3 = r5.f8004P
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            r0.mo6222k(r3)
            if (r6 != 0) goto L_0x007f
        L_0x0073:
            android.widget.FrameLayout r6 = r5.f8047h0
            k2.h r0 = r5.f8057m0
            android.view.View r0 = r0.mo6215c()
            r5.m8935x1(r6, r0)
            goto L_0x00ac
        L_0x007f:
            int r6 = r5.f7998N
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0087
            r6 = r1
            goto L_0x0088
        L_0x0087:
            r6 = r2
        L_0x0088:
            if (r6 == 0) goto L_0x00ac
            int r6 = r5.getNavigationMode()
            r0 = 2
            if (r6 != r0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r1 = r2
        L_0x0093:
            if (r1 == 0) goto L_0x009b
            boolean r6 = r5.mo7907X0()
            if (r6 != 0) goto L_0x00ac
        L_0x009b:
            android.widget.FrameLayout r6 = r5.f8047h0
            boolean r6 = r5.m8867J0(r6)
            if (r6 == 0) goto L_0x00a6
            r5.m8923n0()
        L_0x00a6:
            android.widget.FrameLayout r6 = r5.f8047h0
            r6.removeAllViews()
            goto L_0x0073
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.m8844A0(boolean):void");
    }

    /* renamed from: B1 */
    private void m8846B1(ScrollingTabContainerView scrollingTabContainerView, ScrollingTabContainerView scrollingTabContainerView2, SecondaryTabContainerView secondaryTabContainerView, SecondaryTabContainerView secondaryTabContainerView2) {
        this.f8067r0 = scrollingTabContainerView;
        this.f8069s0 = scrollingTabContainerView2;
        this.f8071t0 = secondaryTabContainerView;
        this.f8073u0 = secondaryTabContainerView2;
        if (secondaryTabContainerView != null) {
            secondaryTabContainerView.setParentApplyBlur(this.f8046g1);
        }
        SecondaryTabContainerView secondaryTabContainerView3 = this.f8073u0;
        if (secondaryTabContainerView3 != null) {
            secondaryTabContainerView3.setParentApplyBlur(this.f8046g1);
        }
    }

    /* renamed from: C0 */
    private FrameLayout m8848C0(int i) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(i);
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), this.f8002O0);
        frameLayout.setVisibility(0);
        return frameLayout;
    }

    /* renamed from: C1 */
    private boolean m8849C1() {
        FrameLayout frameLayout = this.f8051j0;
        return (frameLayout == null || frameLayout.getParent() != this || this.f8051j0.getChildCount() == 0) ? false : true;
    }

    /* renamed from: D0 */
    private Pair<C2242c, C2242c> m8851D0(Menu menu) {
        C2242c cVar = (C2242c) menu;
        C2242c cVar2 = new C2242c(this.f8019U);
        cVar2.mo8350N(cVar.mo8395r());
        ArrayList arrayList = new ArrayList();
        for (int size = menu.size() - 1; size >= 0; size--) {
            C2247e eVar = (C2247e) menu.getItem(size);
            if (eVar.getGroupId() == C1352h.f4687I) {
                ((C2242c) menu).mo8348K(size);
                SubMenu subMenu = eVar.getSubMenu();
                if (subMenu instanceof C2254i) {
                    ((C2254i) subMenu).mo8501d0(cVar2);
                }
                eVar.mo8478t(cVar2);
                arrayList.add(eVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            cVar2.mo8361a((C2247e) arrayList.get(size2));
        }
        return new Pair<>(cVar, cVar2);
    }

    /* renamed from: D1 */
    private boolean m8852D1() {
        FrameLayout frameLayout = this.f8053k0;
        return (frameLayout == null || frameLayout.getParent() != this || this.f8053k0.getChildCount() == 0) ? false : true;
    }

    /* renamed from: E0 */
    private ActionBarOverlayLayout m8854E0() {
        ViewParent parent = getParent();
        while (true) {
            View view = (View) parent;
            if (view instanceof ActionBarOverlayLayout) {
                return (ActionBarOverlayLayout) view;
            }
            if (view.getParent() instanceof View) {
                parent = view.getParent();
            } else {
                throw new IllegalStateException("ActionBarOverlayLayout not found");
            }
        }
    }

    /* renamed from: E1 */
    private boolean m8855E1() {
        return this.f8064p1 == null && (this.f7998N & 8) != 0 && !m8889R0();
    }

    /* renamed from: F0 */
    private void m8857F0() {
        View view = this.f8061o0;
        if (view != null && view.getVisibility() == 0) {
            if (this.f8038c1 || this.f8040d1) {
                if (!this.f8042e1) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8061o0.getLayoutParams();
                    layoutParams.setMarginStart(this.f8005P0);
                    layoutParams.setMarginEnd(this.f8008Q0);
                    this.f8061o0.setLayoutParams(layoutParams);
                    this.f8042e1 = true;
                    this.f8044f1 = false;
                }
            } else if (!this.f8044f1) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f8061o0.getLayoutParams();
                layoutParams2.setMarginStart(0);
                layoutParams2.setMarginEnd(0);
                this.f8061o0.setLayoutParams(layoutParams2);
                this.f8044f1 = true;
                this.f8042e1 = false;
            }
        }
    }

    /* renamed from: F1 */
    private void m8858F1() {
        C2182b.C2184b bVar;
        AnimConfig animConfig;
        if (getExpandState() == 0) {
            bVar = this.f8006P1;
            animConfig = this.f8240i;
        } else if (getExpandState() == 1) {
            this.f8006P1.mo8135i(0.0f);
            this.f8006P1.mo8138l(0);
            bVar = this.f8009Q1;
            animConfig = this.f8239h;
        } else {
            return;
        }
        bVar.mo8127a(1.0f, 0, 0, animConfig);
    }

    /* renamed from: G0 */
    private boolean m8860G0() {
        if (m8867J0(this.f8045g0)) {
            m8922m0();
        }
        if (m8867J0(this.f8047h0)) {
            m8923n0();
        }
        this.f8045g0.removeAllViews();
        this.f8047h0.removeAllViews();
        return true;
    }

    /* renamed from: H0 */
    private TextView m8862H0(View view) {
        if (view != null) {
            return (TextView) view.findViewById(16908310);
        }
        return null;
    }

    /* renamed from: H1 */
    private void m8863H1(ProgressBar progressBar, ProgressBar progressBar2) {
        if (progressBar2 != null && progressBar2.getVisibility() == 4) {
            progressBar2.setVisibility(0);
        }
        if (progressBar != null && progressBar.getProgress() < 10000) {
            progressBar.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public void m8865I1() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            boolean z = mo7901I0() && findOnBackInvokedDispatcher != null && C0727l0.m2859I(this);
            if (z && this.f8070s1 == null) {
                if (this.f8072t1 == null) {
                    this.f8072t1 = new C2206o(this);
                }
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(AnimState.VIEW_SIZE, this.f8072t1);
            } else if (!z && (onBackInvokedDispatcher = this.f8070s1) != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f8072t1);
                findOnBackInvokedDispatcher = null;
            } else {
                return;
            }
            this.f8070s1 = findOnBackInvokedDispatcher;
        }
    }

    /* renamed from: J0 */
    private boolean m8867J0(ViewGroup viewGroup) {
        return viewGroup != null && viewGroup.getChildCount() == 1 && (viewGroup.getChildAt(0) instanceof ScrollingTabContainerView);
    }

    /* renamed from: J1 */
    private void m8868J1() {
        C2225b bVar = this.f7972B0;
        if (bVar != null) {
            bVar.mo8297h0();
            C2225b bVar2 = this.f7972B0;
            if (bVar2 instanceof C2236d) {
                ((C2236d) bVar2).mo8323l0();
            }
        }
    }

    /* renamed from: K0 */
    private boolean m8870K0() {
        return ((this.f7998N & 8) != 0 && !TextUtils.isEmpty(this.f8001O)) || getNavigationMode() == 2;
    }

    /* renamed from: K1 */
    private void m8871K1() {
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            if (fVar.mo6204l() != 0) {
                this.f8055l0.mo6195D(0);
            }
            this.f8055l0.mo6194C(this.f8001O);
            this.f8055l0.mo6211x(this.f8004P);
            post(new C2205n(this));
        }
    }

    /* renamed from: L0 */
    private void m8873L0(ProgressBar progressBar, ProgressBar progressBar2) {
        if (progressBar2 != null && progressBar2.getVisibility() == 0) {
            progressBar2.setVisibility(4);
        }
        if (progressBar != null && progressBar.getVisibility() == 0) {
            progressBar.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void m8875M0() {
        if (this.f8043f0 == null) {
            HomeView homeView = (HomeView) LayoutInflater.from(this.f8019U).inflate(this.f8035b0, this, false);
            this.f8043f0 = homeView;
            homeView.mo7983c(true);
            this.f8043f0.setOnClickListener(this.f7977D1);
        }
    }

    /* renamed from: M1 */
    private void m8876M1() {
        if (this.f8057m0 != null) {
            boolean N1 = (!((this.f7998N & 16) != 0) || this.f8075v0 == null) ? false : m8879N1();
            this.f8057m0.mo6227p(0);
            if (!N1) {
                this.f8057m0.mo6226o(this.f8001O);
            }
            this.f8057m0.mo6222k(this.f8004P);
        }
    }

    /* renamed from: N0 */
    private void m8878N0() {
        if (this.f8041e0 == null) {
            HomeView homeView = (HomeView) LayoutInflater.from(this.f8019U).inflate(this.f8035b0, this, false);
            this.f8041e0 = homeView;
            homeView.setOnClickListener(this.f7979E1);
            this.f8041e0.setClickable(true);
            this.f8041e0.setFocusable(true);
            int i = this.f8039d0;
            if (i != 0) {
                this.f8041e0.mo7984d(i);
                this.f8039d0 = 0;
            }
            Drawable drawable = this.f8037c0;
            if (drawable != null) {
                this.f8041e0.mo7986e(drawable);
                this.f8037c0 = null;
            }
            addView(this.f8041e0);
        }
    }

    /* renamed from: N1 */
    private boolean m8879N1() {
        TextView H0 = m8862H0((FrameLayout) this.f8075v0.findViewById(C1352h.f4713e));
        if (H0 == null) {
            return false;
        }
        if (this.f8057m0 == null) {
            return true;
        }
        if (!TextUtils.isEmpty(this.f8007Q)) {
            if (!this.f8007Q.equals(H0.getText())) {
                H0.removeTextChangedListener(this.f7985H1);
                H0.setText(this.f8007Q);
                H0.addTextChangedListener(this.f7985H1);
            }
            this.f8057m0.mo6226o(this.f8007Q);
        } else {
            this.f8057m0.mo6226o(this.f8001O);
            H0.removeTextChangedListener(this.f7985H1);
            H0.setText(this.f8001O);
            H0.addTextChangedListener(this.f7985H1);
        }
        if (this.f8057m0.mo6216d() != 0) {
            this.f8057m0.mo6228q(0);
        }
        this.f8057m0.mo6224m(8);
        return true;
    }

    /* renamed from: O1 */
    private void m8881O1(int i) {
        ProgressBar circularProgressBar = getCircularProgressBar();
        ProgressBar horizontalProgressBar = getHorizontalProgressBar();
        if (i == -1) {
            if (horizontalProgressBar != null) {
                horizontalProgressBar.setVisibility((horizontalProgressBar.isIndeterminate() || horizontalProgressBar.getProgress() < 10000) ? 0 : 4);
            }
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(0);
            }
        } else if (i == -2) {
            if (horizontalProgressBar != null) {
                horizontalProgressBar.setVisibility(8);
            }
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(8);
            }
        } else if (i == -3) {
            horizontalProgressBar.setIndeterminate(true);
        } else if (i == -4) {
            horizontalProgressBar.setIndeterminate(false);
        } else if (i >= 0 && i <= 10000) {
            horizontalProgressBar.setProgress(i + 0);
            if (i < 10000) {
                m8863H1(horizontalProgressBar, circularProgressBar);
            } else {
                m8873L0(horizontalProgressBar, circularProgressBar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public void m8883P0() {
        this.f8017T0 = false;
        m8886Q0();
        if (this.f7995M == 2) {
            m8860G0();
        }
        int i = this.f8254w;
        if (i == 1) {
            if (this.f8057m0 == null) {
                m8844A0(false);
            }
            C2182b.C2184b bVar = this.f8006P1;
            if (bVar != null) {
                bVar.mo8132f();
            }
        } else if (i == 0 && this.f8055l0 == null) {
            m8937y0(false);
        }
        m8887Q1();
        post(new C2207p(this));
        if (this.f8064p1 != null || m8889R0()) {
            setTitleVisibility(false);
        }
        m8935x1(this, this.f8045g0);
        m8935x1(this, this.f8047h0);
    }

    /* renamed from: P1 */
    private void m8884P1() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ScrollingTabContainerView scrollingTabContainerView = this.f8067r0;
        if (!(scrollingTabContainerView == null || (layoutParams4 = scrollingTabContainerView.getLayoutParams()) == null)) {
            layoutParams4.width = -2;
            layoutParams4.height = -1;
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.f8069s0;
        if (!(scrollingTabContainerView2 == null || (layoutParams3 = scrollingTabContainerView2.getLayoutParams()) == null)) {
            layoutParams3.width = -2;
            layoutParams3.height = -2;
        }
        SecondaryTabContainerView secondaryTabContainerView = this.f8071t0;
        if (!(secondaryTabContainerView == null || (layoutParams2 = secondaryTabContainerView.getLayoutParams()) == null)) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.f8073u0;
        if (secondaryTabContainerView2 != null && (layoutParams = secondaryTabContainerView2.getLayoutParams()) != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
    }

    /* renamed from: Q0 */
    private void m8886Q0() {
        if (this.f8061o0 == null) {
            View d = C1873b.m7792d(getContext(), (ViewGroup) null);
            this.f8061o0 = d;
            d.setOnClickListener(this.f7979E1);
        }
        int i = this.f7998N;
        boolean z = true;
        int i2 = 0;
        boolean z2 = (i & 4) != 0;
        if ((i & 2) == 0) {
            z = false;
        }
        View view = this.f8061o0;
        if (z) {
            i2 = 8;
        } else if (!z2) {
            i2 = 4;
        }
        view.setVisibility(i2);
        this.f8061o0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        m8935x1(this, this.f8061o0);
        m8857F0();
    }

    /* renamed from: Q1 */
    private void m8887Q1() {
        int i = 0;
        boolean z = mo7907X0() && TextUtils.isEmpty(this.f8001O);
        int i2 = (z || !this.f8074u1) ? 8 : 0;
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            fVar.mo6195D(i2);
        }
        if (z || !this.f8074u1 || TextUtils.isEmpty(this.f8004P)) {
            i = 8;
        }
        C1784f fVar2 = this.f8055l0;
        if (fVar2 != null) {
            fVar2.mo6192A(i);
        }
    }

    /* renamed from: R0 */
    private boolean m8889R0() {
        return TextUtils.isEmpty(this.f8001O) && TextUtils.isEmpty(this.f8004P);
    }

    /* renamed from: R1 */
    private void m8890R1() {
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            fVar.mo6198G(m8900Y0());
        }
    }

    /* renamed from: U0 */
    private boolean m8894U0() {
        return this.f8045g0.getChildCount() > 0 || !(this.f8075v0 == null || this.f8049i0 == null);
    }

    /* renamed from: V0 */
    private boolean m8896V0() {
        View view = this.f8075v0;
        if (view == null || view.getVisibility() != 0) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = this.f8075v0.getLayoutParams();
        C0116a.C0117a aVar = layoutParams instanceof C0116a.C0117a ? (C0116a.C0117a) layoutParams : null;
        return aVar != null && m8915h1(aVar.f358a, C1656j.m6983b(this)) == 8388613;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.f8041e0;
     */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8900Y0() {
        /*
            r2 = this;
            boolean r0 = r2.f8032Z0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r2.m8896V0()
            if (r0 == 0) goto L_0x0018
            miuix.appcompat.internal.app.widget.ActionBarView$HomeView r0 = r2.f8041e0
            if (r0 == 0) goto L_0x0016
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0018
        L_0x0016:
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.m8900Y0():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m8903a1() {
        m8929s1();
        setTitleVisibility(m8855E1());
        m8887Q1();
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ void m8905b1() {
        C2225b bVar = this.f7972B0;
        if (bVar != null && bVar.mo8287W()) {
            boolean z = true;
            C1048m mVar = this.f8022V;
            if (mVar != null) {
                z = mVar.mo252c().mo3791b().equals(C1035g.C1038c.RESUMED);
            }
            if (!z) {
                this.f7972B0.mo8284T(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m8907c1() {
        int i = this.f8254w;
        if (i == 0) {
            this.f8006P1.mo8137k(1.0f, 0, 0, true);
            this.f8009Q1.mo8137k(0.0f, 0, 0, true);
        } else if (i == 1) {
            this.f8006P1.mo8137k(0.0f, 0, 20, true);
            this.f8009Q1.mo8137k(1.0f, 0, 0, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ void m8909d1() {
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            fVar.mo6213z(fVar.mo6202j());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ void m8911e1() {
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            fVar.mo6213z(fVar.mo6202j());
        }
    }

    private ProgressBar getCircularProgressBar() {
        ProgressBar progressBar = this.f8079x0;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        return progressBar;
    }

    private ProgressBar getHorizontalProgressBar() {
        ProgressBar progressBar = this.f8077w0;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        return progressBar;
    }

    /* access modifiers changed from: private */
    public Drawable getIcon() {
        if ((this.f8010R & 1) != 1) {
            Context context = this.f8019U;
            if (context instanceof Activity) {
                try {
                    this.f8013S = context.getPackageManager().getActivityIcon(((Activity) this.f8019U).getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("ActionBarView", "Activity component name not found!", e);
                }
            }
            if (this.f8013S == null) {
                this.f8013S = this.f8019U.getApplicationInfo().loadIcon(this.f8019U.getPackageManager());
            }
            this.f8010R |= 1;
        }
        return this.f8013S;
    }

    private Drawable getLogo() {
        if ((this.f8010R & 2) != 2) {
            Context context = this.f8019U;
            if (context instanceof Activity) {
                try {
                    this.f8016T = context.getPackageManager().getActivityLogo(((Activity) this.f8019U).getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("ActionBarView", "Activity component name not found!", e);
                }
            }
            if (this.f8016T == null) {
                this.f8016T = this.f8019U.getApplicationInfo().loadLogo(this.f8019U.getPackageManager());
            }
            this.f8010R |= 2;
        }
        return this.f8016T;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return 8388611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r5 != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r5 != false) goto L_0x0016;
     */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m8915h1(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r0
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r4
            if (r0 != 0) goto L_0x001e
            r0 = 3
            r1 = 8388613(0x800005, float:1.175495E-38)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r0) goto L_0x0018
            if (r5 == 0) goto L_0x0016
        L_0x0014:
            r4 = r1
            goto L_0x001e
        L_0x0016:
            r4 = r2
            goto L_0x001e
        L_0x0018:
            r0 = 5
            if (r4 != r0) goto L_0x001e
            if (r5 == 0) goto L_0x0014
            goto L_0x0016
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.m8915h1(int, boolean):int");
    }

    /* renamed from: i1 */
    private void m8917i1() {
        if (this.f8246o && this.f8243l != null) {
            ((ActionBarOverlayLayout) this.f8245n.getParent()).mo7828M((int) (((float) this.f8243l.getCollapsedHeight()) - this.f8243l.getTranslationY()), 0);
        }
    }

    /* renamed from: k0 */
    private void m8919k0() {
        FrameLayout frameLayout = (FrameLayout) this.f8075v0.findViewById(C1352h.f4713e);
        TextView H0 = m8862H0(frameLayout);
        if (H0 != null) {
            this.f8007Q = H0.getText();
            m8860G0();
            this.f8049i0 = frameLayout;
            this.f8006P1.mo8128b(frameLayout);
            C1786h hVar = this.f8057m0;
            if (hVar != null) {
                hVar.mo6226o(this.f8007Q);
                this.f8057m0.mo6227p(0);
                this.f8057m0.mo6228q(0);
                this.f8057m0.mo6224m(8);
                if (this.f8047h0 != this.f8057m0.mo6215c().getParent()) {
                    m8935x1(this.f8047h0, this.f8057m0.mo6215c());
                }
            }
            H0.addTextChangedListener(this.f7985H1);
        }
    }

    /* renamed from: l0 */
    private void m8920l0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        this.f7972B0.mo8291b0(getResources().getBoolean(C1348d.f4593a));
        this.f7972B0.mo8292c0(this.f8034a1);
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388613;
        C2233c cVar = (C2233c) this.f7972B0.mo8216o(this);
        ViewGroup viewGroup = (ViewGroup) cVar.getParent();
        if (!(viewGroup == null || viewGroup == this)) {
            viewGroup.removeView(cVar);
        }
        addView(cVar, layoutParams);
        this.f7970A0 = cVar;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f6, code lost:
        if (r3 == -1) goto L_0x01f8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ba  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8921l1(boolean r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            r20 = this;
            r7 = r20
            int r6 = r20.getPaddingStart()
            int r8 = r20.getPaddingTop()
            android.widget.FrameLayout r9 = r7.f8045g0
            android.widget.FrameLayout r10 = r7.f8051j0
            boolean r11 = p055i3.C1656j.m6983b(r20)
            int r0 = r20.getPaddingTop()
            int r0 = r25 - r0
            int r1 = r20.getPaddingBottom()
            int r12 = r0 - r1
            if (r12 > 0) goto L_0x0021
            return
        L_0x0021:
            int r0 = r24 - r22
            int r1 = r20.getPaddingEnd()
            int r0 = r0 - r1
            miuix.appcompat.internal.view.menu.action.c r1 = r7.f7970A0
            r13 = 8
            if (r1 == 0) goto L_0x0048
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != r7) goto L_0x0048
            miuix.appcompat.internal.view.menu.action.c r1 = r7.f7970A0
            int r1 = r1.getVisibility()
            if (r1 == r13) goto L_0x0048
            miuix.appcompat.internal.view.menu.action.c r1 = r7.f7970A0
            r7.mo8123s(r1, r0, r8, r12)
            miuix.appcompat.internal.view.menu.action.c r1 = r7.f7970A0
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 - r1
        L_0x0048:
            android.view.View r1 = r7.f8083z0
            if (r1 == 0) goto L_0x0056
            r7.mo8123s(r1, r0, r8, r12)
            android.view.View r1 = r7.f8083z0
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 - r1
        L_0x0056:
            android.widget.ProgressBar r1 = r7.f8079x0
            if (r1 == 0) goto L_0x0075
            int r1 = r1.getVisibility()
            if (r1 == r13) goto L_0x0075
            android.widget.ProgressBar r1 = r7.f8079x0
            int r2 = r7.f7982G0
            int r2 = r0 - r2
            r7.mo8123s(r1, r2, r8, r12)
            android.widget.ProgressBar r1 = r7.f8079x0
            int r1 = r1.getMeasuredWidth()
            int r2 = r7.f7982G0
            int r2 = r2 * 2
            int r1 = r1 - r2
            int r0 = r0 - r1
        L_0x0075:
            r14 = r0
            android.view.View r0 = r7.f8033a0
            if (r0 == 0) goto L_0x008f
            int r0 = r0.getVisibility()
            if (r0 == r13) goto L_0x008f
            android.view.View r1 = r7.f8033a0
            r5 = 0
            r0 = r20
            r2 = r6
            r3 = r8
            r4 = r12
            int r0 = r0.mo8122r(r1, r2, r3, r4, r5)
            r16 = r0
            goto L_0x0091
        L_0x008f:
            r16 = 0
        L_0x0091:
            android.view.View r0 = r7.f8064p1
            if (r0 == 0) goto L_0x0098
            miuix.appcompat.internal.app.widget.ActionBarView$HomeView r0 = r7.f8043f0
            goto L_0x009a
        L_0x0098:
            miuix.appcompat.internal.app.widget.ActionBarView$HomeView r0 = r7.f8041e0
        L_0x009a:
            r1 = r0
            if (r1 == 0) goto L_0x00b5
            int r0 = r1.getVisibility()
            if (r0 == r13) goto L_0x00b5
            int r17 = r1.mo7981a()
            int r2 = r6 + r17
            r5 = 0
            r0 = r20
            r3 = r8
            r4 = r12
            int r0 = r0.mo8122r(r1, r2, r3, r4, r5)
            int r0 = r0 + r17
            goto L_0x00c3
        L_0x00b5:
            android.view.View r1 = r7.f8081y0
            if (r1 == 0) goto L_0x00c4
            r5 = 0
            r0 = r20
            r2 = r6
            r3 = r8
            r4 = r12
            int r0 = r0.mo8122r(r1, r2, r3, r4, r5)
        L_0x00c3:
            int r6 = r6 + r0
        L_0x00c4:
            r17 = r6
            android.view.View r0 = r7.f8064p1
            r6 = 1
            if (r0 != 0) goto L_0x018e
            boolean r18 = r20.m8894U0()
            if (r18 != 0) goto L_0x00d9
            int r0 = r20.getDisplayOptions()
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0112
        L_0x00d9:
            android.view.View r0 = r7.f8061o0
            if (r0 == 0) goto L_0x0112
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0112
            boolean r0 = r7.f8038c1
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r7.f8040d1
            if (r0 == 0) goto L_0x00ec
            goto L_0x00fb
        L_0x00ec:
            android.view.View r1 = r7.f8061o0
            r5 = 0
            r0 = r20
            r2 = r17
            r3 = r8
            r4 = r12
            int r0 = r0.mo8122r(r1, r2, r3, r4, r5)
            r15 = r6
            goto L_0x010f
        L_0x00fb:
            android.view.View r1 = r7.f8061o0
            r5 = 0
            int r4 = r7.f8005P0
            r0 = r20
            r2 = r17
            r3 = r8
            r19 = r4
            r4 = r12
            r15 = r6
            r6 = r19
            int r0 = r0.mo8126t(r1, r2, r3, r4, r5, r6)
        L_0x010f:
            int r17 = r17 + r0
            goto L_0x0113
        L_0x0112:
            r15 = r6
        L_0x0113:
            if (r18 == 0) goto L_0x0173
            if (r9 == 0) goto L_0x0173
            int r6 = r17 + r16
            boolean r0 = r20.m8900Y0()
            if (r0 == 0) goto L_0x016c
            int r0 = r9.getVisibility()
            if (r0 == r13) goto L_0x012a
            int r0 = r7.m8933w0(r9)
            goto L_0x012b
        L_0x012a:
            r0 = r6
        L_0x012b:
            boolean r1 = r20.m8928s0()
            r7.f8074u1 = r1
            r20.m8887Q1()
            int r1 = r9.getMeasuredWidth()
            int r1 = r1 + r0
            int r2 = r9.getMeasuredWidth()
            int r2 = r2 + r6
            if (r2 <= r14) goto L_0x0143
            r2 = r6
        L_0x0141:
            r4 = r14
            goto L_0x0159
        L_0x0143:
            if (r1 <= r14) goto L_0x014d
            int r0 = r9.getMeasuredWidth()
            int r0 = r14 - r0
            r2 = r0
            goto L_0x0141
        L_0x014d:
            if (r0 >= r6) goto L_0x0157
            int r0 = r9.getMeasuredWidth()
            int r0 = r0 + r6
            r4 = r0
            r2 = r6
            goto L_0x0159
        L_0x0157:
            r2 = r0
            r4 = r1
        L_0x0159:
            int r0 = r9.getMeasuredHeight()
            int r1 = r12 - r0
            int r1 = r1 / 2
            int r3 = r8 + r1
            int r5 = r3 + r0
            r0 = r20
            r1 = r9
            p055i3.C1656j.m6986e(r0, r1, r2, r3, r4, r5)
            goto L_0x0171
        L_0x016c:
            int r0 = r7.mo8121q(r9, r6, r8, r12)
            int r6 = r6 + r0
        L_0x0171:
            r17 = r6
        L_0x0173:
            int r0 = r7.f7995M
            if (r0 == r15) goto L_0x0178
            goto L_0x018f
        L_0x0178:
            android.widget.LinearLayout r0 = r7.f8065q0
            if (r0 == 0) goto L_0x018f
            if (r18 == 0) goto L_0x0182
            int r1 = r7.f7984H0
            int r17 = r17 + r1
        L_0x0182:
            r1 = r17
            int r0 = r7.mo8121q(r0, r1, r8, r12)
            int r2 = r7.f7984H0
            int r0 = r0 + r2
            int r17 = r1 + r0
            goto L_0x018f
        L_0x018e:
            r15 = r6
        L_0x018f:
            android.view.View r0 = r7.f8064p1
            r1 = 0
            r2 = 16
            if (r0 == 0) goto L_0x0197
            goto L_0x01a2
        L_0x0197:
            int r0 = r7.f7998N
            r0 = r0 & r2
            if (r0 == 0) goto L_0x01a1
            android.view.View r0 = r7.f8075v0
            if (r0 == 0) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r0 = r1
        L_0x01a2:
            if (r0 == 0) goto L_0x0272
            int r3 = r0.getVisibility()
            if (r3 == r13) goto L_0x0272
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r3 instanceof androidx.appcompat.app.C0116a.C0117a
            if (r4 == 0) goto L_0x01b5
            r1 = r3
            androidx.appcompat.app.a$a r1 = (androidx.appcompat.app.C0116a.C0117a) r1
        L_0x01b5:
            if (r1 == 0) goto L_0x01ba
            int r3 = r1.f358a
            goto L_0x01bd
        L_0x01ba:
            r3 = 8388627(0x800013, float:1.175497E-38)
        L_0x01bd:
            int r4 = r0.getMeasuredWidth()
            if (r1 == 0) goto L_0x01d5
            int r5 = r1.getMarginStart()
            int r17 = r17 + r5
            int r5 = r1.getMarginEnd()
            int r14 = r14 - r5
            int r5 = r1.topMargin
            int r1 = r1.bottomMargin
            r6 = r17
            goto L_0x01d9
        L_0x01d5:
            r6 = r17
            r1 = 0
            r5 = 0
        L_0x01d9:
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r8 = r8 & r3
            r9 = 8388613(0x800005, float:1.175495E-38)
            r12 = -1
            r13 = 8388611(0x800003, float:1.1754948E-38)
            if (r8 != r15) goto L_0x01f6
            int r16 = r20.getWidth()
            int r16 = r16 - r4
            int r2 = r16 / 2
            if (r2 >= r6) goto L_0x01f1
            goto L_0x01f8
        L_0x01f1:
            int r2 = r2 + r4
            if (r2 <= r14) goto L_0x01f9
            r8 = r9
            goto L_0x01f9
        L_0x01f6:
            if (r3 != r12) goto L_0x01f9
        L_0x01f8:
            r8 = r13
        L_0x01f9:
            int r2 = r20.getPaddingStart()
            int r8 = r7.m8915h1(r8, r11)
            if (r8 == r15) goto L_0x020c
            if (r8 == r13) goto L_0x0213
            if (r8 == r9) goto L_0x0209
            r6 = r2
            goto L_0x0213
        L_0x0209:
            int r6 = r14 - r4
            goto L_0x0213
        L_0x020c:
            int r2 = r20.getWidth()
            int r2 = r2 - r4
            int r6 = r2 / 2
        L_0x0213:
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r3 != r12) goto L_0x0219
            r2 = 16
        L_0x0219:
            r3 = 16
            if (r2 == r3) goto L_0x023e
            r3 = 48
            if (r2 == r3) goto L_0x0238
            r3 = 80
            if (r2 == r3) goto L_0x0227
            r1 = 0
            goto L_0x0253
        L_0x0227:
            int r2 = r7.f7994L1
            int r2 = r2 - r26
            int r3 = r20.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.getMeasuredHeight()
            int r2 = r2 - r3
            int r1 = r2 - r1
            goto L_0x0253
        L_0x0238:
            int r1 = r20.getPaddingTop()
            int r1 = r1 + r5
            goto L_0x0253
        L_0x023e:
            int r1 = r20.getPaddingTop()
            int r2 = r7.f7994L1
            int r2 = r2 - r26
            int r3 = r20.getPaddingBottom()
            int r2 = r2 - r3
            int r2 = r2 - r1
            int r1 = r0.getMeasuredHeight()
            int r2 = r2 - r1
            int r1 = r2 / 2
        L_0x0253:
            int r2 = r0.getMeasuredWidth()
            if (r11 == 0) goto L_0x0260
            int r3 = r20.getWidth()
            int r3 = r3 - r6
            int r3 = r3 - r2
            goto L_0x0261
        L_0x0260:
            r3 = r6
        L_0x0261:
            if (r11 == 0) goto L_0x0269
            int r2 = r20.getWidth()
            int r2 = r2 - r6
            goto L_0x026a
        L_0x0269:
            int r2 = r2 + r6
        L_0x026a:
            int r4 = r0.getMeasuredHeight()
            int r4 = r4 + r1
            r0.layout(r3, r1, r2, r4)
        L_0x0272:
            android.widget.ProgressBar r0 = r7.f8077w0
            if (r0 == 0) goto L_0x028e
            r0.bringToFront()
            android.widget.ProgressBar r0 = r7.f8077w0
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 / 2
            android.widget.ProgressBar r1 = r7.f8077w0
            int r2 = r7.f7982G0
            int r3 = -r0
            int r4 = r1.getMeasuredWidth()
            int r4 = r4 + r2
            r1.layout(r2, r3, r4, r0)
        L_0x028e:
            if (r26 <= 0) goto L_0x02e2
            int r0 = r7.f7990K0
            int r1 = r7.f7986I0
            int r0 = java.lang.Math.max(r0, r1)
            int r6 = r22 + r0
            int r8 = r24 - r0
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r0 = r7.f8071t0
            int r9 = r0.getMeasuredWidth()
            int r5 = r25 + r26
            r0 = r20
            r1 = r10
            r2 = r6
            r3 = r25
            r4 = r8
            p055i3.C1656j.m6986e(r0, r1, r2, r3, r4, r5)
            int r8 = r8 - r6
            int r8 = r8 - r9
            int r8 = r8 / 2
            r0 = 0
            int r1 = java.lang.Math.max(r0, r8)
            float r0 = (float) r1
            boolean r1 = p055i3.C1656j.m6983b(r20)
            if (r1 == 0) goto L_0x02bf
            float r0 = -r0
        L_0x02bf:
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r1 = r7.f8071t0
            r1.setTranslationX(r0)
            boolean r0 = p055i3.C1656j.m6983b(r20)
            if (r0 == 0) goto L_0x02d7
            int r0 = r7.f7988J0
            int r1 = r0 * 2
            int r1 = r24 - r1
            int r1 = r1 - r9
            int r0 = r0 * 2
            int r9 = r24 - r0
            r0 = r1
            goto L_0x02d8
        L_0x02d7:
            r0 = 0
        L_0x02d8:
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r1 = r7.f8071t0
            int r2 = r1.getMeasuredHeight()
            r3 = 0
            r1.layout(r0, r3, r9, r2)
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.m8921l1(boolean, int, int, int, int, int):void");
    }

    /* renamed from: m0 */
    private void m8922m0() {
        if (this.f8071t0 != null) {
            FrameLayout frameLayout = this.f8051j0;
            if (frameLayout == null) {
                FrameLayout C0 = m8848C0(C1352h.f4709c);
                this.f8051j0 = C0;
                if (this.f8254w == 1) {
                    C0.setAlpha(0.0f);
                }
            } else {
                frameLayout.removeAllViews();
            }
            this.f8051j0.addView(this.f8071t0, new ViewGroup.LayoutParams(-1, -2));
            if (this.f8051j0.getParent() == null) {
                addView(this.f8051j0, new FrameLayout.LayoutParams(-1, -2));
                if (this.f8254w == 1) {
                    this.f8051j0.setVisibility(8);
                }
                this.f8006P1.mo8128b(this.f8051j0);
            }
        }
    }

    /* renamed from: n0 */
    private void m8923n0() {
        if (this.f8073u0 != null) {
            FrameLayout frameLayout = this.f8053k0;
            if (frameLayout == null) {
                FrameLayout C0 = m8848C0(C1352h.f4717g);
                this.f8053k0 = C0;
                if (this.f8254w == 0) {
                    C0.setAlpha(0.0f);
                }
            } else {
                frameLayout.removeAllViews();
            }
            this.f8053k0.addView(this.f8073u0, new ViewGroup.LayoutParams(-1, -2));
            if (this.f8053k0.getParent() == null) {
                addView(this.f8053k0, new FrameLayout.LayoutParams(-1, -2));
                if (this.f8254w == 0) {
                    this.f8053k0.setVisibility(8);
                }
                this.f8009Q1.mo8128b(this.f8053k0);
            }
        }
    }

    /* renamed from: o0 */
    private void m8924o0() {
        C2233c cVar = (C2233c) this.f8244m.mo8216o(this);
        this.f8243l = cVar;
        if (!(cVar == null || this.f8068r1 == null)) {
            cVar.setVisibility(4);
            this.f8243l.post(this.f8068r1);
            this.f8068r1 = null;
        }
        boolean z = this.f8229F == 3;
        this.f8244m.mo8291b0(false);
        this.f8244m.mo8294e0(getContext().getResources().getDisplayMetrics().widthPixels, true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        if (z) {
            layoutParams.bottomMargin = C2698f.m11275c(getContext(), 16.0f);
        }
        Rect rect = this.f8231H;
        if (rect != null) {
            if (z) {
                layoutParams.bottomMargin += rect.bottom;
                C1656j.m6987f(this.f8243l, 0);
            } else {
                C1656j.m6987f(this.f8243l, rect.bottom);
            }
        }
        if (this.f8245n != null) {
            m8932v1(this.f8243l);
            this.f8245n.mo7700z(this.f8243l);
            C2233c cVar2 = this.f8243l;
            if (cVar2 instanceof ResponsiveActionMenuView) {
                ResponsiveActionMenuView responsiveActionMenuView = (ResponsiveActionMenuView) cVar2;
                responsiveActionMenuView.setSuspendEnabled(z);
                responsiveActionMenuView.setHidden(!this.f7978E0);
            }
            this.f8245n.addView(this.f8243l, 0, layoutParams);
            this.f8245n.mo7699y(this.f8243l);
            View findViewById = this.f8243l.findViewById(C1352h.f4684F);
            if (findViewById != null) {
                findViewById.requestLayout();
            }
            requestLayout();
            return;
        }
        this.f8243l.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (m8867J0(r0) == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8925p0() {
        /*
            r6 = this;
            int r0 = r6.f8254w
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0011
            android.widget.FrameLayout r0 = r6.f8047h0
            k2.h r3 = r6.f8057m0
            if (r3 == 0) goto L_0x001b
            android.view.View r2 = r3.mo6215c()
            goto L_0x001b
        L_0x0011:
            android.widget.FrameLayout r0 = r6.f8045g0
            k2.f r3 = r6.f8055l0
            if (r3 == 0) goto L_0x001b
            android.view.View r2 = r3.mo6201i()
        L_0x001b:
            int r3 = r6.f7998N
            r3 = r3 & 16
            r4 = 0
            if (r3 == 0) goto L_0x0024
            r3 = r1
            goto L_0x0025
        L_0x0024:
            r3 = r4
        L_0x0025:
            if (r3 == 0) goto L_0x003b
            android.view.View r3 = r6.f8075v0
            if (r3 == 0) goto L_0x003b
            int r5 = p018c2.C1352h.f4713e
            android.view.View r3 = r3.findViewById(r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            android.widget.TextView r3 = r6.m8862H0(r3)
            if (r3 == 0) goto L_0x003b
            r3 = r1
            goto L_0x003c
        L_0x003b:
            r3 = r4
        L_0x003c:
            int r5 = r6.f7998N
            r5 = r5 & 8
            if (r5 == 0) goto L_0x004b
            java.lang.CharSequence r5 = r6.f8001O
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r1 = r4
        L_0x004c:
            int r4 = r0.getChildCount()
            if (r4 != 0) goto L_0x0054
            if (r3 == 0) goto L_0x0056
        L_0x0054:
            if (r1 != 0) goto L_0x005a
        L_0x0056:
            r6.m8926q0()
            goto L_0x007e
        L_0x005a:
            if (r3 == 0) goto L_0x0063
        L_0x005c:
            r6.m8922m0()
            r6.m8923n0()
            goto L_0x007e
        L_0x0063:
            if (r2 == 0) goto L_0x007e
            android.view.ViewParent r1 = r2.getParent()
            if (r1 != r0) goto L_0x007e
            android.content.Context r1 = r6.f8019U
            m2.a r1 = p078m2.C1918a.m7836b(r1)
            boolean r1 = r1.mo6470g()
            if (r1 != 0) goto L_0x0056
            boolean r0 = r6.m8867J0(r0)
            if (r0 == 0) goto L_0x005c
            goto L_0x0056
        L_0x007e:
            android.widget.FrameLayout r0 = r6.f8045g0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r6) goto L_0x008b
            android.widget.FrameLayout r0 = r6.f8045g0
            r6.m8935x1(r6, r0)
        L_0x008b:
            android.widget.FrameLayout r0 = r6.f8047h0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r6) goto L_0x0098
            android.widget.FrameLayout r0 = r6.f8047h0
            r6.m8935x1(r6, r0)
        L_0x0098:
            r6.m8884P1()
            r6.m8887Q1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.m8925p0():void");
    }

    /* renamed from: q0 */
    private void m8926q0() {
        FrameLayout frameLayout = this.f8051j0;
        if (frameLayout != null) {
            if (frameLayout.getParent() == this) {
                removeView(this.f8051j0);
                this.f8006P1.mo8129c(this.f8051j0);
            }
            this.f8051j0.removeAllViews();
            this.f8051j0 = null;
        }
        FrameLayout frameLayout2 = this.f8053k0;
        if (frameLayout2 != null) {
            if (frameLayout2.getParent() == this) {
                removeView(this.f8053k0);
                this.f8009Q1.mo8129c(this.f8053k0);
            }
            this.f8053k0.removeAllViews();
            this.f8053k0 = null;
        }
        this.f8045g0.removeAllViews();
        ScrollingTabContainerView scrollingTabContainerView = this.f8067r0;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.setVisibility(0);
            m8935x1(this.f8045g0, this.f8067r0);
        }
        this.f8047h0.removeAllViews();
        ScrollingTabContainerView scrollingTabContainerView2 = this.f8069s0;
        if (scrollingTabContainerView2 != null) {
            scrollingTabContainerView2.setVisibility(0);
            m8935x1(this.f8047h0, this.f8069s0);
        }
        if (this.f8254w == 2) {
            mo7780w(this.f8256y, false, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c5  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8927r0(float r13) {
        /*
            r12 = this;
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r13
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            float r0 = r1 - r0
            int r2 = r12.f8254w
            r3 = 20
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r2 != r5) goto L_0x00cf
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r2 = 3
            r9 = 1
            java.lang.String r11 = "target"
            if (r13 <= 0) goto L_0x0073
            boolean r13 = r12.f7987I1
            if (r13 == 0) goto L_0x00be
            r12.f7987I1 = r7
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8006P1
            miuix.animation.base.AnimConfig r1 = r12.f8236e
            r13.mo8127a(r4, r7, r3, r1)
            java.util.List<miuix.appcompat.app.e> r13 = r12.f8253v
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0070
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r7] = r11
            r13[r6] = r8
            miuix.animation.IStateStyle r13 = miuix.animation.Folme.useValue(r13)
            miuix.animation.IStateStyle r13 = r13.setFlags(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            miuix.animation.IStateStyle r13 = r13.setup(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r4 = "expand"
            r1[r7] = r4
            int r8 = r12.f7989J1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1[r6] = r8
            miuix.animation.IStateStyle r13 = r13.setTo((java.lang.Object[]) r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r7] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r6] = r2
            miuix.animation.base.AnimConfig r2 = r12.f8238g
            r1[r5] = r2
            r13.mo6816to((java.lang.Object[]) r1)
        L_0x0070:
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8009Q1
            goto L_0x00bb
        L_0x0073:
            boolean r13 = r12.f7987I1
            if (r13 != 0) goto L_0x00be
            r12.f7987I1 = r6
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8006P1
            miuix.animation.base.AnimConfig r3 = r12.f8235d
            r13.mo8127a(r1, r7, r7, r3)
            java.util.List<miuix.appcompat.app.e> r13 = r12.f8253v
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00b9
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r7] = r11
            r13[r6] = r8
            miuix.animation.IStateStyle r13 = miuix.animation.Folme.useValue(r13)
            miuix.animation.IStateStyle r13 = r13.setFlags(r9)
            miuix.animation.IStateStyle r13 = r13.setup(r8)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r3 = "collapse"
            r1[r7] = r3
            int r4 = r12.f7989J1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r6] = r4
            miuix.animation.IStateStyle r13 = r13.setTo((java.lang.Object[]) r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r7] = r3
            r1[r6] = r8
            miuix.animation.base.AnimConfig r2 = r12.f8237f
            r1[r5] = r2
            r13.mo6816to((java.lang.Object[]) r1)
        L_0x00b9:
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8006P1
        L_0x00bb:
            r13.mo8138l(r7)
        L_0x00be:
            float r13 = r12.f8078w1
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x00c5
            return
        L_0x00c5:
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8009Q1
            miuix.animation.base.AnimConfig r1 = r12.f8240i
            r13.mo8127a(r0, r7, r7, r1)
            r12.f8078w1 = r0
            goto L_0x0112
        L_0x00cf:
            if (r2 != r6) goto L_0x00f5
            float r0 = r12.f8078w1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r6 = r7
        L_0x00d9:
            r12.f8080x1 = r6
            r12.f7989J1 = r3
            r12.f8078w1 = r1
            float r0 = r12.f8228E
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00e6
            return
        L_0x00e6:
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8006P1
            miuix.animation.base.AnimConfig r0 = r12.f8236e
            r13.mo8127a(r4, r7, r3, r0)
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8009Q1
            miuix.animation.base.AnimConfig r0 = r12.f8239h
            r13.mo8127a(r1, r7, r7, r0)
            goto L_0x0112
        L_0x00f5:
            if (r2 != 0) goto L_0x0112
            r12.f8080x1 = r7
            r12.f7989J1 = r7
            r12.f8078w1 = r4
            float r0 = r12.f8228E
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0104
            return
        L_0x0104:
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8006P1
            miuix.animation.base.AnimConfig r0 = r12.f8235d
            r13.mo8127a(r1, r7, r7, r0)
            miuix.appcompat.internal.app.widget.b$b r13 = r12.f8009Q1
            miuix.animation.base.AnimConfig r0 = r12.f8240i
            r13.mo8127a(r4, r7, r7, r0)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.m8927r0(float):void");
    }

    /* renamed from: s0 */
    private boolean m8928s0() {
        if (this.f8055l0 == null || TextUtils.isEmpty(this.f8001O)) {
            return false;
        }
        boolean f = this.f8055l0.mo6199f(this.f8001O.toString());
        if (!C1918a.m7836b(this.f8019U).mo6471h() || f) {
            return f;
        }
        return true;
    }

    /* renamed from: s1 */
    private void m8929s1() {
        if (!this.f8017T0) {
            this.f8017T0 = true;
            if ((this.f7998N & 8) != 0) {
                if (this.f8057m0 == null) {
                    m8844A0(true);
                    m8876M1();
                }
                if (this.f8055l0 == null) {
                    m8937y0(true);
                }
                m8871K1();
            }
            C1784f fVar = this.f8055l0;
            if (fVar != null) {
                Rect h = fVar.mo6200h();
                h.left -= C1649c.m6962g(getContext(), C1347c.f4567e);
                setTouchDelegate(new TouchDelegate(h, this.f8055l0.mo6201i()));
            }
        }
    }

    private void setTitleImpl(CharSequence charSequence) {
        boolean E1 = m8855E1();
        this.f8001O = charSequence;
        boolean z = true;
        boolean z2 = false;
        if (!((!((this.f7998N & 16) != 0) || this.f8075v0 == null) ? false : m8879N1())) {
            m8871K1();
            m8876M1();
            boolean E12 = m8855E1();
            setTitleVisibility(E12);
            C2494a aVar = this.f8054k1;
            if (aVar != null) {
                aVar.setTitle(charSequence);
            }
            C2494a aVar2 = this.f8056l1;
            if (aVar2 != null) {
                aVar2.setTitle(charSequence);
            }
            if (E1 && !E12) {
                if (getNavigationMode() != 2) {
                    z = false;
                }
                if (z || mo7907X0()) {
                    m8926q0();
                }
            } else if (!E1 && E12) {
                if (!(getNavigationMode() == 2) || !mo7907X0()) {
                    C1784f fVar = this.f8055l0;
                    if (fVar != null && fVar.mo6201i().getParent() == null) {
                        z2 = true;
                    }
                    C1786h hVar = this.f8057m0;
                    if (hVar == null || z2 || hVar.mo6215c().getParent() != null) {
                        z = z2;
                    }
                    if (z) {
                        m8860G0();
                        C1784f fVar2 = this.f8055l0;
                        if (fVar2 != null) {
                            m8935x1(this.f8045g0, fVar2.mo6201i());
                        }
                        C1786h hVar2 = this.f8057m0;
                        if (hVar2 != null) {
                            m8935x1(this.f8047h0, hVar2.mo6215c());
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void setTitleVisibility(boolean z) {
        C1784f fVar = this.f8055l0;
        int i = 8;
        if (fVar != null) {
            fVar.mo6196E(z ? 0 : 8);
        }
        C1786h hVar = this.f8057m0;
        if (hVar != null) {
            hVar.mo6228q(z ? 0 : 4);
        }
        if (this.f8061o0 != null && (getDisplayOptions() & 32) == 0) {
            int i2 = this.f7998N;
            boolean z2 = true;
            boolean z3 = (i2 & 4) != 0;
            if ((i2 & 2) == 0) {
                z2 = false;
            }
            View view = this.f8061o0;
            if (!z2) {
                i = z3 ? 0 : 4;
            }
            view.setVisibility(i);
        }
        int i3 = TextUtils.isEmpty(this.f8004P) ? this.f7996M0 : this.f7999N0;
        FrameLayout frameLayout = this.f8047h0;
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.f8047h0.getPaddingTop(), this.f8047h0.getPaddingEnd(), i3);
    }

    /* renamed from: t1 */
    private void m8930t1() {
        post(new C2210s(this));
    }

    /* renamed from: u0 */
    private void m8931u0(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        rect.set(i, i2, i3, i4);
        view.setClipBounds(rect);
    }

    /* renamed from: v1 */
    private void m8932v1(View view) {
        ViewGroup viewGroup;
        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: w0 */
    private int m8933w0(View view) {
        int width = (getWidth() - view.getMeasuredWidth()) / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = 0;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            i = 0 + ((LinearLayout.LayoutParams) layoutParams).getMarginStart();
        }
        return width - i;
    }

    /* renamed from: w1 */
    private void m8934w1() {
        FrameLayout frameLayout = this.f8051j0;
        if (frameLayout != null) {
            if (frameLayout.getParent() != null) {
                removeView(this.f8051j0);
                this.f8006P1.mo8129c(this.f8051j0);
            }
            this.f8051j0.removeAllViews();
            this.f8051j0 = null;
        }
        FrameLayout frameLayout2 = this.f8053k0;
        if (frameLayout2 != null) {
            if (frameLayout2.getParent() != null) {
                removeView(this.f8053k0);
                this.f8009Q1.mo8129c(this.f8053k0);
            }
            this.f8053k0.removeAllViews();
            this.f8053k0 = null;
        }
        SecondaryTabContainerView secondaryTabContainerView = this.f8071t0;
        if (!(secondaryTabContainerView == null || secondaryTabContainerView.getParent() == null)) {
            removeView(this.f8071t0);
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.f8073u0;
        if (!(secondaryTabContainerView2 == null || secondaryTabContainerView2.getParent() == null)) {
            removeView(this.f8073u0);
        }
        if (!this.f8018T1.isFinished()) {
            this.f8018T1.forceFinished(true);
        }
        removeCallbacks(this.f8031Y1);
        setExpandState(this.f8256y);
    }

    /* renamed from: x1 */
    private void m8935x1(ViewGroup viewGroup, View view) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* renamed from: y0 */
    private void m8937y0(boolean z) {
        if (this.f8055l0 == null) {
            C1784f b = C1873b.m7790b(getContext(), this.f8011R0, this.f8014S0);
            this.f8055l0 = b;
            b.mo6197F(this.f8028X0);
            this.f8055l0.mo6193B(this.f8241j, this.f8254w);
            this.f8055l0.mo6208u(this.f8225B);
            this.f8055l0.mo6194C(this.f8001O);
            this.f8055l0.mo6210w(this.f7981F1);
            this.f8055l0.mo6212y(this.f7983G1);
            this.f8055l0.mo6211x(this.f8004P);
            if (z) {
                boolean z2 = true;
                if ((this.f7998N & 8) != 0) {
                    if (getNavigationMode() != 2) {
                        z2 = false;
                    }
                    if (!z2 || !mo7907X0()) {
                        if (m8867J0(this.f8045g0)) {
                            m8922m0();
                        }
                        this.f8045g0.removeAllViews();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            m8935x1(this.f8045g0, this.f8055l0.mo6201i());
        }
    }

    /* renamed from: y1 */
    private void m8938y1(Runnable runnable) {
        this.f8068r1 = runnable;
    }

    /* renamed from: A1 */
    public void mo7898A1(Menu menu, C2250g.C2251a aVar) {
        C2242c cVar;
        C2242c cVar2 = this.f8048h1;
        if (cVar2 != null) {
            cVar2.mo8349M(this.f8244m);
            this.f8048h1.mo8349M(this.f8062o1);
        }
        C2242c cVar3 = this.f8050i1;
        if (cVar3 != null) {
            cVar3.mo8349M(this.f7972B0);
        }
        m8932v1(this.f8243l);
        m8932v1(this.f7970A0);
        if (menu == null || (!this.f8246o && !this.f8247p)) {
            this.f8244m = null;
            this.f7972B0 = null;
            this.f8062o1 = null;
            return;
        }
        Pair<C2242c, C2242c> D0 = m8851D0(menu);
        this.f8048h1 = (C2242c) D0.first;
        this.f8050i1 = (C2242c) D0.second;
        if (this.f8246o) {
            if (this.f8244m == null) {
                this.f8244m = mo7978x0(aVar);
                this.f8062o1 = mo7899B0();
            }
            C2242c cVar4 = this.f8048h1;
            if (cVar4 != null) {
                cVar4.mo8374c(this.f8244m);
                this.f8048h1.mo8374c(this.f8062o1);
                this.f8048h1.mo8353Q(this.f8052j1);
            } else {
                this.f8244m.mo8008h(this.f8019U, (C2242c) null);
                this.f8062o1.mo8008h(this.f8019U, (C2242c) null);
            }
            this.f8244m.mo8003b(true);
            this.f8062o1.mo8003b(true);
            m8924o0();
        }
        if (this.f8247p && (cVar = this.f8050i1) != null && cVar.size() > 0) {
            if (this.f7972B0 == null) {
                this.f7972B0 = mo7979z0(aVar);
            }
            this.f8050i1.mo8374c(this.f7972B0);
            this.f8050i1.mo8353Q(this.f8052j1);
            this.f7972B0.mo8003b(true);
            m8920l0();
        }
        m8868J1();
        m8865I1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public C2168o mo7899B0() {
        return new C2168o(this, (C2159f) null);
    }

    /* renamed from: G1 */
    public boolean mo7900G1() {
        C2225b bVar;
        C1048m mVar = this.f8022V;
        return (mVar != null ? mVar.mo252c().mo3791b().equals(C1035g.C1038c.RESUMED) : true) && (bVar = this.f7972B0) != null && bVar.mo8296g0();
    }

    /* renamed from: I0 */
    public boolean mo7901I0() {
        C2168o oVar = this.f8062o1;
        return (oVar == null || oVar.f8108e == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public boolean mo7902L1() {
        if (this.f8254w != 2) {
            return false;
        }
        int i = this.f8257z;
        int i2 = this.f7991K1;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == this.f8047h0.getMeasuredHeight() + this.f8003O1) {
            i = 1;
        }
        if (this.f8257z == i) {
            return false;
        }
        this.f8257z = i;
        this.f8255x = i;
        return true;
    }

    /* renamed from: O0 */
    public void mo7903O0() {
        ProgressBar progressBar = new ProgressBar(this.f8019U, (AttributeSet) null, C1347c.f4561b);
        this.f8079x0 = progressBar;
        progressBar.setId(C1352h.f4693O);
        this.f8079x0.setVisibility(8);
        this.f8079x0.setIndeterminate(true);
        addView(this.f8079x0);
    }

    /* renamed from: S0 */
    public boolean mo7904S0() {
        return this.f8026W0;
    }

    /* renamed from: T0 */
    public boolean mo7905T0() {
        C2225b bVar = this.f7972B0;
        return bVar != null && bVar.mo8287W();
    }

    /* renamed from: W0 */
    public boolean mo7906W0() {
        return this.f8246o;
    }

    /* renamed from: X0 */
    public boolean mo7907X0() {
        return this.f8023V0 && C1918a.m7836b(this.f8019U).mo6470g();
    }

    /* renamed from: Z0 */
    public boolean mo7908Z0() {
        return this.f8036b1;
    }

    /* renamed from: d */
    public void mo6475d(boolean z, float f) {
        if (!this.f8059n0 && !z && f > 0.8f) {
            this.f8059n0 = true;
            m8858F1();
        }
    }

    /* renamed from: e */
    public void mo6476e(boolean z) {
        this.f8027W1 = false;
        if (z) {
            this.f8006P1.mo8138l(4);
            this.f8009Q1.mo8138l(4);
            return;
        }
        if (!this.f8059n0) {
            m8858F1();
        }
        this.f8059n0 = false;
    }

    /* renamed from: f */
    public void mo6477f(boolean z) {
        this.f8027W1 = true;
        if (z) {
            this.f8059n0 = false;
        } else if (getExpandState() == 0) {
            this.f8006P1.mo8138l(0);
            this.f8006P1.mo8135i(0.0f);
            this.f8009Q1.mo8138l(8);
        } else if (getExpandState() == 1) {
            this.f8006P1.mo8138l(4);
            this.f8009Q1.mo8138l(0);
            this.f8009Q1.mo8135i(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f1 */
    public void mo7909f1(boolean z) {
        if (!this.f8246o || z == this.f7978E0) {
            return;
        }
        if (this.f8243l == null) {
            m8938y1(new C2157d(z));
            return;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8245n.getParent();
        int collapsedHeight = this.f8243l.getCollapsedHeight();
        this.f8243l.setTranslationY(z ? 0.0f : (float) collapsedHeight);
        if (!z) {
            collapsedHeight = 0;
        }
        actionBarOverlayLayout.mo7855q(collapsedHeight);
        this.f7978E0 = z;
        C2233c cVar = this.f8243l;
        if (cVar instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) cVar).setHidden(!z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public void mo7910g1(boolean z) {
        int i;
        int i2;
        if (z != this.f7978E0) {
            C2233c cVar = this.f8243l;
            if (cVar == null) {
                m8938y1(new C2155b(z));
                return;
            }
            this.f7978E0 = z;
            this.f7980F0 = false;
            if (this.f8246o) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
                int collapsedHeight = cVar == null ? 0 : cVar.getCollapsedHeight();
                if (z) {
                    i2 = 0;
                    i = collapsedHeight;
                } else {
                    i = 0;
                    i2 = collapsedHeight;
                }
                if (cVar != null) {
                    if (this.f7974C0 == null) {
                        this.f7974C0 = new AnimConfig().setEase(-2, 0.95f, 0.25f);
                    }
                    TransitionListener transitionListener = this.f8076v1;
                    if (transitionListener != null) {
                        this.f7974C0.removeListeners(transitionListener);
                    }
                    AnimConfig animConfig = this.f7974C0;
                    C2156c cVar2 = new C2156c(actionBarOverlayLayout, collapsedHeight);
                    this.f8076v1 = cVar2;
                    animConfig.addListeners(cVar2);
                    cVar.setTranslationY((float) i);
                    Folme.useAt(cVar).state().mo6815to(new AnimState("menu_end_state").add(ViewProperty.TRANSLATION_Y, (double) i2), this.f7974C0);
                    if (cVar instanceof ResponsiveActionMenuView) {
                        ((ResponsiveActionMenuView) cVar).setHidden(!this.f7978E0);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0116a.C0117a(8388627);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0116a.C0117a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null ? generateDefaultLayoutParams() : layoutParams;
    }

    public /* bridge */ /* synthetic */ C2233c getActionMenuView() {
        return super.getActionMenuView();
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public int getBottomMenuCustomViewOffset() {
        C2233c cVar = this.f8243l;
        if (cVar instanceof ResponsiveActionMenuView) {
            return ((ResponsiveActionMenuView) cVar).getBottomMenuCustomViewOffset();
        }
        return 0;
    }

    public C1784f getCollapseTitle() {
        if (this.f8055l0 == null) {
            m8937y0(true);
        }
        return this.f8055l0;
    }

    public int getCollapsedHeight() {
        return this.f7994L1;
    }

    public View getCustomNavigationView() {
        return this.f8075v0;
    }

    public int getDisplayOptions() {
        return this.f7998N;
    }

    public SpinnerAdapter getDropdownAdapter() {
        return this.f8058m1;
    }

    public int getDropdownSelectedPosition() {
        return this.f8063p0.getSelectedItemPosition();
    }

    public int getEndActionMenuItemLimit() {
        return this.f8034a1;
    }

    public View getEndView() {
        return this.f8083z0;
    }

    public /* bridge */ /* synthetic */ int getExpandState() {
        return super.getExpandState();
    }

    public C1786h getExpandTitle() {
        if (this.f8057m0 == null) {
            m8844A0(true);
        }
        return this.f8057m0;
    }

    public int getExpandedHeight() {
        return this.f7997M1;
    }

    public /* bridge */ /* synthetic */ C2233c getMenuView() {
        return super.getMenuView();
    }

    public int getNavigationMode() {
        return this.f7995M;
    }

    public View getStartView() {
        return this.f8081y0;
    }

    public CharSequence getSubtitle() {
        return this.f8004P;
    }

    public CharSequence getTitle() {
        return this.f8001O;
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo7747j() {
        return super.mo7747j();
    }

    /* renamed from: j1 */
    public void mo7927j1(boolean z) {
        this.f8021U1 = false;
        if (!this.f8024V1) {
            setVisibility(0);
        }
        this.f8024V1 = false;
        if (getExpandState() == 0) {
            this.f8006P1.mo8138l(0);
            this.f8009Q1.mo8138l(8);
        } else if (getExpandState() == 1) {
            this.f8006P1.mo8138l(4);
            this.f8009Q1.mo8138l(0);
        }
        View view = this.f8081y0;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.f8083z0;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.f8061o0;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        View view4 = this.f8033a0;
        if (view4 != null) {
            C1744a aVar = (C1744a) view4.getTag(C1352h.f4690L);
            if (aVar != null) {
                aVar.mo5998a(false, 0.0f);
            } else {
                this.f8033a0.setAlpha(1.0f);
            }
        }
        if (z) {
            this.f8009Q1.mo8134h(true);
            this.f8006P1.mo8134h(true);
            m8930t1();
        }
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo7749k() {
        return super.mo7749k();
    }

    /* renamed from: k1 */
    public void mo7928k1(boolean z, boolean z2) {
        this.f8021U1 = true;
        this.f8024V1 = z;
        this.f8006P1.mo8138l(8);
        this.f8009Q1.mo8138l(8);
        if (!this.f8024V1) {
            setVisibility(8);
        }
        View view = this.f8081y0;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        View view2 = this.f8083z0;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        View view3 = this.f8061o0;
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        View view4 = this.f8033a0;
        if (view4 != null) {
            C1744a aVar = (C1744a) view4.getTag(C1352h.f4690L);
            if (aVar != null) {
                aVar.mo5998a(true, 0.0f);
            } else {
                this.f8033a0.setAlpha(0.0f);
            }
        }
        if (z2) {
            this.f8009Q1.mo8134h(false);
            this.f8006P1.mo8134h(false);
        }
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo7750l() {
        return super.mo7750l();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo7752m() {
        return super.mo7752m();
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7929m1(boolean r17, int r18, int r19, int r20, int r21, int r22, float r23) {
        /*
            r16 = this;
            r6 = r16
            r7 = r18
            r8 = r20
            r9 = r21
            boolean r0 = r16.m8870K0()
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            android.widget.FrameLayout r0 = r6.f8047h0
            android.widget.FrameLayout r10 = r6.f8053k0
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r23
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r2, r1)
            float r2 = r2 - r1
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r11 = 0
            if (r1 > 0) goto L_0x0027
            int r1 = r6.f8000N1
            goto L_0x0028
        L_0x0027:
            r1 = r11
        L_0x0028:
            if (r0 == 0) goto L_0x0036
            int r2 = r0.getVisibility()
            if (r2 != 0) goto L_0x0036
            int r2 = r0.getMeasuredHeight()
            r12 = r2
            goto L_0x0037
        L_0x0036:
            r12 = r11
        L_0x0037:
            int r13 = r6.f8003O1
            int r2 = r19 + r12
            int r2 = r2 + r13
            int r2 = r2 - r9
            int r14 = r2 + r1
            r15 = 0
            if (r0 == 0) goto L_0x0095
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0095
            int r1 = r6.f8254w
            if (r1 == 0) goto L_0x0095
            int r1 = r9 - r12
            r0.layout(r7, r1, r8, r9)
            android.widget.FrameLayout r0 = r6.f8047h0
            boolean r0 = r6.m8867J0(r0)
            if (r0 == 0) goto L_0x0062
            android.widget.FrameLayout r0 = r6.f8047h0
            android.view.View r0 = r0.getChildAt(r11)
            miuix.appcompat.internal.app.widget.ScrollingTabContainerView r0 = (miuix.appcompat.internal.app.widget.ScrollingTabContainerView) r0
            goto L_0x0063
        L_0x0062:
            r0 = r15
        L_0x0063:
            if (r0 == 0) goto L_0x0087
            int r1 = r6.f7988J0
            boolean r2 = p055i3.C1656j.m6983b(r16)
            if (r2 == 0) goto L_0x0076
            int r1 = r6.f7988J0
            int r1 = r8 - r1
            int r2 = r0.getMeasuredWidth()
            int r1 = r1 - r2
        L_0x0076:
            int r2 = r6.f7993L0
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r1
            int r4 = r0.getMeasuredHeight()
            int r5 = r6.f7993L0
            int r4 = r4 + r5
            r0.layout(r1, r2, r3, r4)
        L_0x0087:
            android.widget.FrameLayout r1 = r6.f8047h0
            int r5 = r12 + r13
            r0 = r16
            r2 = r18
            r3 = r14
            r4 = r20
            r0.m8931u0(r1, r2, r3, r4, r5)
        L_0x0095:
            if (r13 <= 0) goto L_0x00f6
            int r0 = r6.f8254w
            if (r0 == 0) goto L_0x00f6
            int r0 = r6.f7990K0
            int r1 = r6.f7986I0
            int r0 = r0 + r1
            int r2 = r7 + r0
            int r5 = r9 + r22
            int r3 = r5 - r13
            int r0 = r10.getMeasuredWidth()
            int r4 = r2 + r0
            r0 = r16
            r1 = r10
            p055i3.C1656j.m6986e(r0, r1, r2, r3, r4, r5)
            boolean r0 = r6.m8867J0(r10)
            if (r0 == 0) goto L_0x00bf
            android.view.View r0 = r10.getChildAt(r11)
            r15 = r0
            miuix.appcompat.internal.app.widget.ScrollingTabContainerView r15 = (miuix.appcompat.internal.app.widget.ScrollingTabContainerView) r15
        L_0x00bf:
            if (r15 == 0) goto L_0x00e6
            int r0 = r15.getMeasuredWidth()
            boolean r1 = p055i3.C1656j.m6983b(r16)
            if (r1 == 0) goto L_0x00dd
            int r0 = r6.f7990K0
            int r0 = r0 * 2
            int r0 = r8 - r0
            int r1 = r15.getMeasuredWidth()
            int r0 = r0 - r1
            int r1 = r6.f7990K0
            int r1 = r1 * 2
            int r1 = r8 - r1
            goto L_0x00df
        L_0x00dd:
            r1 = r0
            r0 = r11
        L_0x00df:
            int r2 = r15.getMeasuredHeight()
            r15.layout(r0, r11, r1, r2)
        L_0x00e6:
            int r0 = r12 - r13
            int r3 = r14 - r0
            int r5 = r12 + r13
            r0 = r16
            r1 = r10
            r2 = r18
            r4 = r20
            r0.m8931u0(r1, r2, r3, r4, r5)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.mo7929m1(boolean, int, int, int, int, int, float):void");
    }

    /* renamed from: n1 */
    public void mo7930n1(View view, int i, int i2, int[] iArr, int i3, int[] iArr2) {
        int i4;
        if (mo7750l()) {
            int height = getHeight();
            if (i2 > 0 && height > (i4 = this.f7994L1)) {
                int i5 = height - i2;
                int i6 = this.f7991K1;
                this.f7991K1 = i5 >= i4 ? i6 - i2 : 0;
                iArr[1] = iArr[1] + i2;
                if (this.f7991K1 != i6) {
                    iArr2[1] = i2;
                    requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7931o(int i, int i2) {
        IStateStyle iStateStyle = this.f8029X1;
        if (iStateStyle != null) {
            iStateStyle.cancel();
        }
        if (i == 1) {
            this.f7991K1 = this.f8047h0.getMeasuredHeight() + this.f8003O1;
        } else if (i == 0) {
            this.f7991K1 = 0;
        }
        AnimConfig addListeners = new AnimConfig().addListeners(new C2169p(this));
        int measuredHeight = i2 == 1 ? this.f8047h0.getMeasuredHeight() + this.f8003O1 : 0;
        if (i2 == 1) {
            this.f8006P1.mo8138l(4);
        } else if (i2 == 0) {
            this.f8006P1.mo8138l(0);
        }
        this.f8029X1 = Folme.useValue(new Object[0]).setFlags(1).setTo("actionbar_state_change", Integer.valueOf(this.f7991K1)).mo6816to("actionbar_state_change", Integer.valueOf(measuredHeight), addListeners);
    }

    /* renamed from: o1 */
    public void mo7932o1(View view, int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if (mo7750l()) {
            int measuredHeight = this.f8047h0.getMeasuredHeight() + this.f8003O1;
            int i6 = (this.f7994L1 - this.f8000N1) + measuredHeight;
            int height = getHeight();
            if (i4 < 0 && height < i6) {
                int i7 = this.f7991K1;
                if (height - i4 <= i6) {
                    this.f7991K1 = i7 - i4;
                    iArr[1] = iArr[1] + i4;
                } else {
                    this.f7991K1 = measuredHeight;
                    iArr[1] = iArr[1] + (-(i6 - height));
                }
                if (this.f7991K1 != i7) {
                    iArr2[1] = i4;
                    requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8006P1.mo8130d();
        this.f8009Q1.mo8130d();
        m8865I1();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1357m.f4900a, getActionBarStyle(), 0);
        this.f8249r = obtainStyledAttributes.getLayoutDimension(C1357m.f4920e, 0);
        this.f8250s = obtainStyledAttributes.getLayoutDimension(C1357m.f4915d, 0);
        obtainStyledAttributes.recycle();
        Configuration configuration2 = getResources().getConfiguration();
        this.f8074u1 = true;
        m8887Q1();
        if ((getDisplayOptions() & 8) != 0) {
            C1784f fVar = this.f8055l0;
            if (fVar != null) {
                fVar.mo6207r(configuration2);
            }
            C1786h hVar = this.f8057m0;
            if (hVar != null) {
                hVar.mo6218g(configuration2);
            }
        }
        float f = this.f8019U.getResources().getDisplayMetrics().density;
        if (f != this.f7992L) {
            this.f7992L = f;
            this.f7990K0 = this.f8019U.getResources().getDimensionPixelOffset(C1350f.f4661p);
            this.f7993L0 = this.f8019U.getResources().getDimensionPixelOffset(C1350f.f4663q);
            this.f7996M0 = this.f8019U.getResources().getDimensionPixelOffset(C1350f.f4655m);
            this.f7999N0 = this.f8019U.getResources().getDimensionPixelOffset(C1350f.f4641f);
            this.f8005P0 = this.f8019U.getResources().getDimensionPixelOffset(C1350f.f4667s);
            this.f8008Q0 = 0;
        }
        this.f7988J0 = getResources().getDimensionPixelOffset(C1350f.f4659o);
        this.f8047h0.setPaddingRelative(this.f7988J0, getResources().getDimensionPixelOffset(C1350f.f4663q), this.f7988J0, TextUtils.isEmpty(this.f8004P) ? this.f7996M0 : this.f7999N0);
        this.f8002O0 = getResources().getDimensionPixelOffset(C1350f.f4637d);
        FrameLayout frameLayout = this.f8051j0;
        if (frameLayout != null) {
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.f8051j0.getPaddingTop(), this.f8051j0.getPaddingEnd(), this.f8002O0);
        }
        FrameLayout frameLayout2 = this.f8053k0;
        if (frameLayout2 != null) {
            frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), this.f8053k0.getPaddingTop(), this.f8053k0.getPaddingEnd(), this.f8002O0);
        }
        setPaddingRelative(C1649c.m6962g(getContext(), C1347c.f4567e), getPaddingTop(), C1649c.m6962g(getContext(), C1347c.f4565d), getPaddingBottom());
        if (this.f8023V0) {
            m8884P1();
        }
        post(new C2204m(this));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2225b bVar = this.f8244m;
        if (bVar != null) {
            bVar.mo8284T(false);
            this.f8244m.mo8285U();
        }
        C2225b bVar2 = this.f7972B0;
        if (bVar2 != null) {
            bVar2.mo8284T(false);
            this.f7972B0.mo8285U();
        }
        this.f8006P1.mo8131e();
        this.f8009Q1.mo8131e();
        m8865I1();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(this.f8249r, this.f8045g0.getMeasuredHeight());
        View view = this.f8075v0;
        if (view != null && view.getParent() == this) {
            max = Math.max(max, this.f8075v0.getMeasuredHeight());
        }
        int i5 = max;
        int i6 = this.f8000N1;
        int measuredHeight = this.f8047h0.getMeasuredHeight();
        int i7 = this.f8003O1;
        int i8 = this.f8254w;
        int i9 = i8 == 2 ? this.f7991K1 : i8 == 1 ? measuredHeight + i7 : 0;
        int i10 = (i4 - i2) - i7;
        int i11 = i10 - i9;
        float min = Math.min(1.0f, ((float) ((measuredHeight + i7) - i9)) / ((float) measuredHeight));
        boolean z2 = z;
        int i12 = i;
        int i13 = i3;
        m8921l1(z2, i12, 0, i13, i5, i6);
        mo7929m1(z2, i12, i11, i13, i10, i7, min);
        m8917i1();
        if (!this.f8021U1 && !this.f8027W1) {
            m8927r0(min);
        }
        this.f8228E = min;
        m8868J1();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: android.view.ViewGroup$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: androidx.appcompat.app.a$a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r21.getChildCount()
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0009:
            r5 = 8
            if (r3 >= r1) goto L_0x0026
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 == r5) goto L_0x0023
            miuix.appcompat.internal.view.menu.action.c r5 = r0.f8243l
            if (r6 != r5) goto L_0x0021
            int r5 = r5.getChildCount()
            if (r5 == 0) goto L_0x0023
        L_0x0021:
            int r4 = r4 + 1
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0026:
            r1 = 1
            if (r4 != 0) goto L_0x002f
            r0.setMeasuredDimension(r2, r2)
        L_0x002c:
            r0.f8026W0 = r1
            return
        L_0x002f:
            r0.f8026W0 = r2
            int r3 = android.view.View.MeasureSpec.getSize(r22)
            int r4 = r0.f8250s
            int r6 = r0.f8249r
            int r7 = r21.getPaddingTop()
            int r8 = r21.getPaddingBottom()
            int r7 = r7 + r8
            int r8 = r21.getPaddingStart()
            int r9 = r21.getPaddingEnd()
            if (r4 <= 0) goto L_0x004e
            r10 = r4
            goto L_0x0052
        L_0x004e:
            int r10 = android.view.View.MeasureSpec.getSize(r23)
        L_0x0052:
            int r10 = r10 - r7
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r8 = r3 - r8
            int r8 = r8 - r9
            int r9 = r8 / 2
            boolean r13 = r21.m8870K0()
            android.view.View r14 = r0.f8081y0
            if (r14 == 0) goto L_0x0077
            int r8 = r0.mo8120n(r14, r8, r12, r2)
            android.view.View r14 = r0.f8081y0
            r14.getMeasuredWidth()
            android.view.View r14 = r0.f8081y0
            int r14 = r14.getMeasuredHeight()
            int r14 = r14 + r7
            goto L_0x0078
        L_0x0077:
            r14 = r2
        L_0x0078:
            android.view.View r15 = r0.f8083z0
            if (r15 == 0) goto L_0x0090
            int r8 = r0.mo8120n(r15, r8, r12, r2)
            android.view.View r15 = r0.f8083z0
            r15.getMeasuredWidth()
            android.view.View r15 = r0.f8083z0
            int r15 = r15.getMeasuredHeight()
            int r15 = r15 + r7
            int r14 = java.lang.Math.max(r14, r15)
        L_0x0090:
            android.view.View r15 = r0.f8033a0
            if (r15 == 0) goto L_0x00bd
            int r1 = p018c2.C1352h.f4690L
            java.lang.Object r1 = r15.getTag(r1)
            j2.a r1 = (p060j2.C1744a) r1
            r1.mo5999b(r2, r2)
            android.view.View r1 = r0.f8033a0
            int r1 = r1.getVisibility()
            if (r1 == r5) goto L_0x00bd
            android.view.View r1 = r0.f8033a0
            int r8 = r0.mo8120n(r1, r8, r12, r2)
            android.view.View r1 = r0.f8033a0
            r1.getMeasuredWidth()
            android.view.View r1 = r0.f8033a0
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r7
            int r14 = java.lang.Math.max(r14, r1)
        L_0x00bd:
            android.view.View r1 = r0.f8081y0
            if (r1 == 0) goto L_0x00c9
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x00c9
            r0.f8038c1 = r2
        L_0x00c9:
            android.view.View r1 = r0.f8033a0
            if (r1 == 0) goto L_0x00d5
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x00d5
            r0.f8040d1 = r2
        L_0x00d5:
            r21.m8857F0()
            android.view.View r1 = r0.f8064p1
            if (r1 == 0) goto L_0x00df
            miuix.appcompat.internal.app.widget.ActionBarView$HomeView r1 = r0.f8043f0
            goto L_0x00e1
        L_0x00df:
            miuix.appcompat.internal.app.widget.ActionBarView$HomeView r1 = r0.f8041e0
        L_0x00e1:
            android.view.View r15 = r0.f8081y0
            if (r15 == 0) goto L_0x00ea
            if (r1 == 0) goto L_0x00ea
            r1.setVisibility(r5)
        L_0x00ea:
            r15 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r2 = r1.getVisibility()
            if (r2 == r5) goto L_0x0128
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r2 = r2.width
            if (r2 >= 0) goto L_0x0101
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x0105
        L_0x0101:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
        L_0x0105:
            r1.measure(r2, r12)
            int r2 = r1.getMeasuredWidth()
            int r16 = r1.mo7981a()
            int r2 = r2 + r16
            int r8 = r8 - r2
            r15 = 0
            int r8 = java.lang.Math.max(r15, r8)
            int r2 = r8 - r2
            int r2 = java.lang.Math.max(r15, r2)
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r7
            int r14 = java.lang.Math.max(r14, r1)
            goto L_0x0129
        L_0x0128:
            r2 = r9
        L_0x0129:
            miuix.appcompat.internal.view.menu.action.c r1 = r0.f7970A0
            if (r1 == 0) goto L_0x015d
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != r0) goto L_0x015d
            miuix.appcompat.internal.view.menu.action.c r1 = r0.f7970A0
            int r1 = r1.getVisibility()
            if (r1 == r5) goto L_0x015d
            miuix.appcompat.internal.view.menu.action.c r1 = r0.f7970A0
            r15 = 0
            int r8 = r0.mo8120n(r1, r8, r12, r15)
            miuix.appcompat.internal.view.menu.action.c r1 = r0.f7970A0
            int r1 = r1.getMeasuredWidth()
            int r9 = r9 - r1
            int r9 = java.lang.Math.max(r15, r9)
            miuix.appcompat.internal.view.menu.action.c r1 = r0.f7970A0
            r1.getMeasuredWidth()
            miuix.appcompat.internal.view.menu.action.c r1 = r0.f7970A0
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r7
            int r14 = java.lang.Math.max(r14, r1)
        L_0x015d:
            android.widget.ProgressBar r1 = r0.f8079x0
            r15 = 2
            if (r1 == 0) goto L_0x0191
            int r1 = r1.getVisibility()
            if (r1 == r5) goto L_0x0191
            android.widget.ProgressBar r1 = r0.f8079x0
            int r11 = r0.f7982G0
            int r11 = r11 * r15
            int r8 = r0.mo8120n(r1, r8, r12, r11)
            android.widget.ProgressBar r1 = r0.f8079x0
            int r1 = r1.getMeasuredWidth()
            int r9 = r9 - r1
            int r1 = r0.f7982G0
            int r1 = r1 * r15
            int r9 = r9 - r1
            r1 = 0
            int r9 = java.lang.Math.max(r1, r9)
            android.widget.ProgressBar r1 = r0.f8079x0
            r1.getMeasuredWidth()
            android.widget.ProgressBar r1 = r0.f8079x0
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r7
            int r14 = java.lang.Math.max(r14, r1)
        L_0x0191:
            boolean r1 = r21.m8894U0()
            if (r1 == 0) goto L_0x019a
            r21.m8890R1()
        L_0x019a:
            android.view.View r11 = r0.f8064p1
            if (r11 != 0) goto L_0x01dd
            if (r1 != 0) goto L_0x01a8
            int r11 = r21.getDisplayOptions()
            r11 = r11 & 32
            if (r11 == 0) goto L_0x01dd
        L_0x01a8:
            android.view.View r11 = r0.f8061o0
            if (r11 == 0) goto L_0x01dd
            int r11 = r11.getVisibility()
            if (r11 == r5) goto L_0x01dd
            android.view.View r11 = r0.f8061o0
            boolean r15 = r0.f8038c1
            if (r15 != 0) goto L_0x01bf
            boolean r15 = r0.f8040d1
            if (r15 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r5 = 0
            goto L_0x01c4
        L_0x01bf:
            int r15 = r0.f8005P0
            int r5 = r0.f8008Q0
            int r5 = r5 + r15
        L_0x01c4:
            int r8 = r0.mo8120n(r11, r8, r12, r5)
            android.view.View r5 = r0.f8061o0
            r5.getMeasuredWidth()
            boolean r5 = r0.f8038c1
            if (r5 != 0) goto L_0x01d3
            boolean r5 = r0.f8040d1
        L_0x01d3:
            android.view.View r5 = r0.f8061o0
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r7
            java.lang.Math.max(r14, r5)
        L_0x01dd:
            android.view.View r5 = r0.f8064p1
            r7 = 0
            if (r5 == 0) goto L_0x01e3
            goto L_0x01ef
        L_0x01e3:
            int r5 = r0.f7998N
            r5 = r5 & 16
            if (r5 == 0) goto L_0x01ee
            android.view.View r5 = r0.f8075v0
            if (r5 == 0) goto L_0x01ee
            goto L_0x01ef
        L_0x01ee:
            r5 = r7
        L_0x01ef:
            android.view.View r11 = r0.f8081y0
            if (r11 != 0) goto L_0x01f7
            android.view.View r11 = r0.f8083z0
            if (r11 == 0) goto L_0x01ff
        L_0x01f7:
            if (r5 == 0) goto L_0x01ff
            r11 = 8
            r5.setVisibility(r11)
            goto L_0x0201
        L_0x01ff:
            r11 = 8
        L_0x0201:
            if (r5 == 0) goto L_0x02e7
            int r14 = r5.getVisibility()
            if (r14 == r11) goto L_0x02e7
            android.view.View r11 = r0.f8061o0
            if (r11 == 0) goto L_0x021d
            int r11 = r11.getVisibility()
            r14 = 4
            if (r11 != r14) goto L_0x021d
            android.view.View r11 = r0.f8061o0
            int r11 = r11.getMeasuredWidth()
            r14 = 0
            int r11 = r11 + r14
            goto L_0x021e
        L_0x021d:
            r11 = 0
        L_0x021e:
            android.view.ViewGroup$LayoutParams r14 = r5.getLayoutParams()
            android.view.ViewGroup$LayoutParams r14 = r0.generateLayoutParams((android.view.ViewGroup.LayoutParams) r14)
            boolean r15 = r14 instanceof androidx.appcompat.app.C0116a.C0117a
            if (r15 == 0) goto L_0x022d
            r7 = r14
            androidx.appcompat.app.a$a r7 = (androidx.appcompat.app.C0116a.C0117a) r7
        L_0x022d:
            if (r7 == 0) goto L_0x023e
            int r15 = r7.leftMargin
            r17 = r10
            int r10 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.topMargin
            r18 = r10
            int r10 = r7.bottomMargin
            int r10 = r10 + r15
            goto L_0x0243
        L_0x023e:
            r17 = r10
            r10 = 0
            r18 = 0
        L_0x0243:
            if (r4 > 0) goto L_0x024a
            r19 = r3
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0255
        L_0x024a:
            int r15 = r14.height
            if (r15 < 0) goto L_0x0251
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0253
        L_0x0251:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0253:
            r19 = r3
        L_0x0255:
            int r3 = r14.height
            r20 = r13
            r13 = -1
            if (r3 < 0) goto L_0x0263
            if (r4 <= 0) goto L_0x026d
            int r3 = java.lang.Math.min(r3, r4)
            goto L_0x026d
        L_0x0263:
            if (r3 != r13) goto L_0x026a
            int r3 = java.lang.Math.max(r6, r4)
            goto L_0x026c
        L_0x026a:
            r3 = r17
        L_0x026c:
            int r3 = r3 - r10
        L_0x026d:
            int r4 = r14.width
            r10 = -2
            if (r4 == r10) goto L_0x0275
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0277
        L_0x0275:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0277:
            if (r4 < 0) goto L_0x0280
            int r13 = r8 + r11
            int r4 = java.lang.Math.min(r4, r13)
            goto L_0x0282
        L_0x0280:
            int r4 = r8 + r11
        L_0x0282:
            int r4 = r4 - r18
            r13 = 0
            int r4 = java.lang.Math.max(r13, r4)
            if (r7 == 0) goto L_0x028e
            int r7 = r7.f358a
            goto L_0x0291
        L_0x028e:
            r7 = 8388627(0x800013, float:1.175497E-38)
        L_0x0291:
            r13 = 8388615(0x800007, float:1.1754953E-38)
            r7 = r7 & r13
            r13 = 1
            if (r7 != r13) goto L_0x02a4
            int r7 = r14.width
            r13 = -1
            if (r7 != r13) goto L_0x02a4
            int r2 = java.lang.Math.min(r2, r9)
            r4 = 2
            int r2 = r2 * r4
            r4 = r2
        L_0x02a4:
            android.view.View r2 = r0.f8033a0
            if (r2 == 0) goto L_0x02cd
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x02cd
            float r2 = (float) r4
            android.view.View r4 = r0.f8033a0
            int r4 = r4.getMeasuredWidth()
            float r4 = (float) r4
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.View r9 = r0.f8033a0
            float r9 = r9.getAlpha()
            float r7 = r7 - r9
            float r4 = r4 * r7
            int r7 = r0.f8005P0
            float r7 = (float) r7
            android.view.View r9 = r0.f8033a0
            float r9 = r9.getAlpha()
            float r7 = r7 * r9
            float r4 = r4 - r7
            float r2 = r2 + r4
            int r4 = (int) r2
        L_0x02cd:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r10)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r15)
            r5.measure(r2, r3)
            int r2 = r5.getMeasuredWidth()
            int r18 = r18 + r2
            int r18 = r18 - r11
            int r8 = r8 - r18
            int r2 = r5.getMeasuredHeight()
            goto L_0x02f9
        L_0x02e7:
            r19 = r3
            r20 = r13
            miuix.appcompat.internal.app.widget.ScrollingTabContainerView r2 = r0.f8067r0
            if (r2 == 0) goto L_0x02ff
            r3 = 0
            r0.mo8120n(r2, r8, r12, r3)
            miuix.appcompat.internal.app.widget.ScrollingTabContainerView r2 = r0.f8067r0
            int r2 = r2.getMeasuredHeight()
        L_0x02f9:
            int r2 = java.lang.Math.max(r6, r2)
        L_0x02fd:
            r15 = 0
            goto L_0x0310
        L_0x02ff:
            if (r5 == 0) goto L_0x030e
            int r2 = r5.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x030e
            if (r1 != 0) goto L_0x030e
            r2 = r6
            r15 = 1
            goto L_0x0310
        L_0x030e:
            r2 = r6
            goto L_0x02fd
        L_0x0310:
            android.view.View r3 = r0.f8064p1
            if (r3 != 0) goto L_0x0346
            if (r1 == 0) goto L_0x0346
            boolean r3 = r21.m8900Y0()
            if (r3 == 0) goto L_0x0334
            android.widget.FrameLayout r3 = r0.f8045g0
            r4 = 0
            int r5 = java.lang.Math.max(r4, r8)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r3.measure(r5, r12)
            android.widget.FrameLayout r3 = r0.f8045g0
            int r3 = r3.getMeasuredWidth()
            int r8 = r8 - r3
            goto L_0x033b
        L_0x0334:
            r4 = 0
            android.widget.FrameLayout r3 = r0.f8045g0
            int r8 = r0.mo8120n(r3, r8, r12, r4)
        L_0x033b:
            android.widget.FrameLayout r3 = r0.f8045g0
            int r3 = r3.getMeasuredHeight()
            int r3 = java.lang.Math.max(r6, r3)
            goto L_0x0347
        L_0x0346:
            r3 = r6
        L_0x0347:
            android.widget.FrameLayout r4 = r0.f8047h0
            int r4 = r4.getChildCount()
            if (r4 == 0) goto L_0x0368
            if (r20 == 0) goto L_0x0353
            r4 = 0
            goto L_0x0355
        L_0x0353:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x0355:
            android.widget.FrameLayout r5 = r0.f8047h0
            r7 = r19
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r9 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r4)
            r5.measure(r10, r4)
            goto L_0x036b
        L_0x0368:
            r7 = r19
            r9 = 0
        L_0x036b:
            boolean r4 = r21.m8849C1()
            boolean r5 = r21.m8852D1()
            r0.f8003O1 = r9
            android.content.res.Resources r9 = r21.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.densityDpi
            float r9 = (float) r9
            r10 = 1126170624(0x43200000, float:160.0)
            float r9 = r9 / r10
            m2.e r10 = r0.f7976D0
            if (r10 == 0) goto L_0x039a
            boolean r10 = r10.mo6503i()
            if (r10 == 0) goto L_0x039a
            m2.e r10 = r0.f7976D0
            int r10 = r10.mo6500f()
            float r10 = (float) r10
            float r10 = r10 * r9
            int r9 = (int) r10
            r0.f7986I0 = r9
            r9 = 0
            goto L_0x039d
        L_0x039a:
            r9 = 0
            r0.f7986I0 = r9
        L_0x039d:
            int r10 = r0.f7990K0
            int r11 = r0.f7986I0
            int r10 = r10 + r11
            r11 = 2
            int r10 = r10 * r11
            int r10 = r7 - r10
            int r10 = java.lang.Math.max(r9, r10)
            int r13 = r0.f7990K0
            int r14 = r0.f7986I0
            int r13 = r13 + r14
            int r13 = r13 * r11
            int r11 = r7 - r13
            if (r5 == 0) goto L_0x03cc
            android.widget.FrameLayout r5 = r0.f8053k0
            r13 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r13)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r9)
            r5.measure(r14, r13)
            android.widget.FrameLayout r5 = r0.f8053k0
            int r5 = r5.getMeasuredHeight()
            r0.f8003O1 = r5
            goto L_0x03cd
        L_0x03cc:
            r5 = r9
        L_0x03cd:
            r0.f8000N1 = r9
            if (r4 == 0) goto L_0x03e9
            android.widget.FrameLayout r4 = r0.f8051j0
            r13 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r13)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r9)
            r4.measure(r14, r13)
            android.widget.FrameLayout r4 = r0.f8051j0
            int r4 = r4.getMeasuredHeight()
            r0.f8000N1 = r4
            goto L_0x03ea
        L_0x03e9:
            r4 = 0
        L_0x03ea:
            android.view.View r9 = r0.f8064p1
            if (r9 != 0) goto L_0x044b
            int r9 = r0.f7995M
            r13 = 1
            if (r9 == r13) goto L_0x042d
            r13 = 2
            if (r9 == r13) goto L_0x03f7
            goto L_0x044b
        L_0x03f7:
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r1 = r0.f8071t0
            if (r1 == 0) goto L_0x0412
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x0412
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r1 = r0.f8071t0
            r8 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r8)
            r11 = 0
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r11)
            r1.measure(r9, r12)
            goto L_0x0415
        L_0x0412:
            r8 = 1073741824(0x40000000, float:2.0)
            r11 = 0
        L_0x0415:
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r1 = r0.f8073u0
            if (r1 == 0) goto L_0x044b
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x044b
            miuix.appcompat.internal.app.widget.SecondaryTabContainerView r1 = r0.f8073u0
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r11)
            r1.measure(r9, r8)
            goto L_0x044b
        L_0x042d:
            android.widget.LinearLayout r9 = r0.f8065q0
            if (r9 == 0) goto L_0x044b
            if (r1 == 0) goto L_0x0438
            int r1 = r0.f7984H0
            r9 = 2
            int r1 = r1 * r9
            goto L_0x043a
        L_0x0438:
            int r1 = r0.f7984H0
        L_0x043a:
            int r8 = r8 - r1
            r1 = 0
            int r8 = java.lang.Math.max(r1, r8)
            android.widget.LinearLayout r1 = r0.f8065q0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r1.measure(r8, r12)
        L_0x044b:
            if (r20 == 0) goto L_0x0454
            android.widget.FrameLayout r1 = r0.f8047h0
            int r1 = r1.getMeasuredHeight()
            goto L_0x0455
        L_0x0454:
            r1 = 0
        L_0x0455:
            int r4 = r4 + r3
            int r8 = java.lang.Math.max(r2, r4)
            r0.f7994L1 = r8
            int r6 = java.lang.Math.max(r6, r8)
            r0.f7994L1 = r6
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = r2 + r1
            int r2 = r2 + r5
            r0.f7997M1 = r2
            if (r15 == 0) goto L_0x0473
            r1 = 0
            r0.setMeasuredDimension(r7, r1)
            r1 = 1
            goto L_0x002c
        L_0x0473:
            r1 = 1
            int r5 = r0.f8254w
            r6 = 2
            if (r5 != r6) goto L_0x0484
            int r1 = r0.f7991K1
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r3, r4)
        L_0x0480:
            r0.setMeasuredDimension(r7, r1)
            goto L_0x048d
        L_0x0484:
            if (r5 != r1) goto L_0x048a
            r0.setMeasuredDimension(r7, r2)
            goto L_0x048d
        L_0x048a:
            int r1 = r0.f7994L1
            goto L_0x0480
        L_0x048d:
            android.widget.ProgressBar r1 = r0.f8077w0
            if (r1 == 0) goto L_0x04b4
            int r1 = r1.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x04b4
            android.widget.ProgressBar r1 = r0.f8077w0
            int r2 = r0.f7982G0
            r3 = 2
            int r2 = r2 * r3
            int r3 = r7 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            int r3 = r21.getMeasuredHeight()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r1.measure(r2, r3)
        L_0x04b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C2242c cVar;
        MenuItem findItem;
        C2170q qVar = (C2170q) parcelable;
        super.onRestoreInstanceState(qVar.getSuperState());
        int i = qVar.f8111d;
        if (!(i == 0 || this.f8062o1 == null || (cVar = this.f8048h1) == null || (findItem = cVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (qVar.f8112e) {
            mo7778u();
        }
        if (qVar.f8113f) {
            mo7976u1();
        }
        if (this.f8227D == -1) {
            this.f8226C = qVar.f8115h;
            this.f8227D = qVar.f8116i;
            mo7780w(mo7752m() ? this.f8227D : qVar.f8114g, false, false);
        }
        if (qVar.f8117j) {
            setApplyBgBlur(this.f8046g1);
        }
    }

    public Parcelable onSaveInstanceState() {
        C2247e eVar;
        C2170q qVar = new C2170q(super.onSaveInstanceState());
        C2168o oVar = this.f8062o1;
        if (oVar == null || (eVar = oVar.f8108e) == null) {
            qVar.f8111d = 0;
        } else {
            qVar.f8111d = eVar.getItemId();
        }
        qVar.f8112e = mo7749k();
        qVar.f8113f = mo7905T0();
        int i = this.f8254w;
        if (i == 2) {
            qVar.f8114g = 0;
        } else {
            qVar.f8114g = i;
        }
        qVar.f8115h = this.f8226C;
        qVar.f8116i = this.f8227D;
        qVar.f8117j = this.f8046g1;
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo7761p(int i, int i2) {
        C2182b.C2184b bVar;
        if (i == 2) {
            this.f7991K1 = 0;
            if (!this.f8018T1.isFinished()) {
                this.f8018T1.forceFinished(true);
            }
        }
        if (i2 == 2 && (bVar = this.f8009Q1) != null) {
            bVar.mo8138l(0);
        }
        if (i2 == 1) {
            if (this.f8047h0.getAlpha() > 0.0f) {
                C2182b.C2184b bVar2 = this.f8006P1;
                if (bVar2 != null) {
                    bVar2.mo8137k(0.0f, 0, 20, true);
                }
                C2182b.C2184b bVar3 = this.f8009Q1;
                if (bVar3 != null) {
                    bVar3.mo8137k(1.0f, 0, 0, true);
                }
            }
            C2182b.C2184b bVar4 = this.f8009Q1;
            if (bVar4 != null) {
                bVar4.mo8138l(0);
            }
        }
        if (i2 == 0) {
            C2182b.C2184b bVar5 = this.f8006P1;
            if (bVar5 != null && !this.f8021U1) {
                bVar5.mo8137k(1.0f, 0, 0, true);
                this.f8006P1.mo8138l(0);
                this.f8006P1.mo8133g();
            }
            C2182b.C2184b bVar6 = this.f8009Q1;
            if (bVar6 != null) {
                bVar6.mo8138l(8);
            }
        } else {
            this.f7991K1 = (getHeight() - this.f7994L1) + this.f8000N1;
        }
        if (this.f8253v.size() <= 0) {
            return;
        }
        if (this.f8255x != i2 || this.f8257z != i2) {
            for (C2080e next : this.f8253v) {
                if (i2 == 1) {
                    next.mo7432d(1);
                } else if (i2 == 0) {
                    next.mo7432d(0);
                }
            }
        }
    }

    /* renamed from: p1 */
    public void mo7939p1(View view, View view2, int i, int i2) {
        if (mo7750l()) {
            if (i2 == 0) {
                this.f8012R1 = true;
            } else {
                this.f8015S1 = true;
            }
            if (!this.f8018T1.isFinished()) {
                this.f8018T1.forceFinished(true);
            }
            setExpandState(2);
        }
    }

    /* renamed from: q1 */
    public boolean mo7940q1(View view, View view2, int i, int i2) {
        return (this.f8064p1 == null && m8894U0()) || this.f8075v0 != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r5.f8015S1 == false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7941r1(android.view.View r6, int r7) {
        /*
            r5 = this;
            boolean r6 = r5.mo7750l()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.FrameLayout r6 = r5.f8047h0
            int r6 = r6.getMeasuredHeight()
            int r7 = r5.getHeight()
            boolean r0 = r5.f8012R1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            r5.f8012R1 = r2
            boolean r0 = r5.f8015S1
            if (r0 != 0) goto L_0x0026
            goto L_0x0024
        L_0x001e:
            boolean r0 = r5.f8015S1
            if (r0 == 0) goto L_0x0026
            r5.f8015S1 = r2
        L_0x0024:
            r0 = r1
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 == 0) goto L_0x0056
            int r0 = r5.f7991K1
            if (r0 != 0) goto L_0x0031
            r5.setExpandState(r2)
            return
        L_0x0031:
            int r3 = r5.f8003O1
            int r4 = r6 + r3
            if (r0 < r4) goto L_0x003b
            r5.setExpandState(r1)
            return
        L_0x003b:
            int r0 = r5.f7994L1
            int r3 = r3 + r6
            int r3 = r3 / 2
            int r3 = r3 + r0
            if (r7 <= r3) goto L_0x004b
            android.widget.Scroller r1 = r5.f8018T1
            int r0 = r0 + r6
            int r0 = r0 - r7
            r1.startScroll(r2, r7, r2, r0)
            goto L_0x0051
        L_0x004b:
            android.widget.Scroller r6 = r5.f8018T1
            int r0 = r0 - r7
            r6.startScroll(r2, r7, r2, r0)
        L_0x0051:
            java.lang.Runnable r6 = r5.f8031Y1
            r5.postOnAnimation(r6)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.mo7941r1(android.view.View, int):void");
    }

    public void setApplyBgBlur(boolean z) {
        if (this.f8046g1 != z) {
            this.f8046g1 = z;
            SecondaryTabContainerView secondaryTabContainerView = this.f8071t0;
            if (secondaryTabContainerView != null) {
                secondaryTabContainerView.setParentApplyBlur(z);
            }
            SecondaryTabContainerView secondaryTabContainerView2 = this.f8073u0;
            if (secondaryTabContainerView2 != null) {
                secondaryTabContainerView2.setParentApplyBlur(z);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        C2225b bVar = this.f8244m;
        if (bVar != null) {
            bVar.mo8290a0(view);
        }
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        C2233c cVar = this.f8243l;
        if (cVar instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) cVar).setBottomMenuCustomViewTranslationYWithPx(i);
        }
    }

    public /* bridge */ /* synthetic */ void setBottomMenuMode(int i) {
        super.setBottomMenuMode(i);
    }

    public void setCallback(C0116a.C0119c cVar) {
        this.f8060n1 = cVar;
    }

    public void setCollapsable(boolean z) {
    }

    public void setCustomNavigationView(View view) {
        boolean z = (this.f7998N & 16) != 0;
        View view2 = this.f8075v0;
        if (view2 != null && z) {
            removeView(view2);
        }
        this.f8075v0 = view;
        if (view == null || !z) {
            this.f8006P1.mo8128b(this.f8045g0);
            return;
        }
        addView(view);
        m8919k0();
    }

    public void setDisplayOptions(int i) {
        HomeView homeView;
        int i2;
        Resources resources;
        View view;
        int i3 = this.f7998N;
        int i4 = -1;
        if (i3 != -1) {
            i4 = i ^ i3;
        }
        this.f7998N = i;
        if ((i4 & 8223) != 0) {
            boolean z = (i & 2) != 0;
            int i5 = 8;
            if (z) {
                m8878N0();
                this.f8041e0.setVisibility(this.f8064p1 == null ? 0 : 8);
                if ((i4 & 4) != 0) {
                    boolean z2 = (i & 4) != 0;
                    this.f8041e0.mo7983c(z2);
                    if (z2) {
                        setHomeButtonEnabled(true);
                    }
                }
                if ((i4 & 1) != 0) {
                    Drawable logo = getLogo();
                    boolean z3 = (logo == null || (i & 1) == 0) ? false : true;
                    HomeView homeView2 = this.f8041e0;
                    if (!z3) {
                        logo = getIcon();
                    }
                    homeView2.mo7982b(logo);
                }
            } else {
                HomeView homeView3 = this.f8041e0;
                if (homeView3 != null) {
                    removeView(homeView3);
                }
            }
            if ((i4 & 8) != 0) {
                if ((i & 8) != 0) {
                    if (getNavigationMode() == 2) {
                        m8860G0();
                    }
                    m8883P0();
                } else {
                    C1784f fVar = this.f8055l0;
                    if (fVar != null) {
                        this.f8045g0.removeView(fVar.mo6201i());
                    }
                    C1786h hVar = this.f8057m0;
                    if (hVar != null) {
                        this.f8047h0.removeView(hVar.mo6215c());
                    }
                    this.f8055l0 = null;
                    this.f8057m0 = null;
                    if ((getDisplayOptions() & 32) == 0) {
                        removeView(this.f8061o0);
                        this.f8061o0 = null;
                    }
                    if (getNavigationMode() == 2) {
                        m8926q0();
                    }
                }
            }
            if ((i4 & 6) != 0) {
                boolean z4 = (this.f7998N & 4) != 0;
                C1784f fVar2 = this.f8055l0;
                boolean z5 = fVar2 != null && fVar2.mo6205m() == 0;
                C1786h hVar2 = this.f8057m0;
                if (hVar2 != null && hVar2.mo6216d() == 0) {
                    z5 = true;
                }
                if (this.f8061o0 != null && (z5 || (getDisplayOptions() & 32) != 0)) {
                    View view2 = this.f8061o0;
                    if (!z) {
                        i5 = z4 ? 0 : 4;
                    }
                    view2.setVisibility(i5);
                }
            }
            if (!((i4 & 16) == 0 || (view = this.f8075v0) == null)) {
                if ((i & 16) != 0) {
                    m8935x1(this, view);
                    m8919k0();
                } else {
                    removeView(view);
                }
            }
            if ((i4 & 8192) != 0) {
                if ((i & 8192) != 0) {
                    View inflate = LayoutInflater.from(this.f8019U).inflate(this.f8025W, this, false);
                    this.f8033a0 = inflate;
                    inflate.setTag(C1352h.f4690L, new C1744a(inflate));
                    View findViewById = this.f8033a0.findViewById(C1352h.f4692N);
                    Folme.useAt(findViewById).hover().setFeedbackRadius(60.0f);
                    Folme.useAt(findViewById).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f8033a0, new AnimConfig[0]);
                    addView(this.f8033a0);
                    this.f8040d1 = true;
                } else {
                    removeView(this.f8033a0);
                    this.f8033a0 = null;
                    this.f8040d1 = false;
                }
                m8857F0();
            }
            requestLayout();
        } else {
            invalidate();
        }
        HomeView homeView4 = this.f8041e0;
        if (homeView4 == null) {
            return;
        }
        if (!homeView4.isEnabled()) {
            this.f8041e0.setContentDescription((CharSequence) null);
            return;
        }
        if ((i & 4) != 0) {
            homeView = this.f8041e0;
            resources = this.f8019U.getResources();
            i2 = C1355k.f4785b;
        } else {
            homeView = this.f8041e0;
            resources = this.f8019U.getResources();
            i2 = C1355k.f4784a;
        }
        homeView.setContentDescription(resources.getText(i2));
    }

    public void setDropdownAdapter(SpinnerAdapter spinnerAdapter) {
        this.f8058m1 = spinnerAdapter;
        Spinner spinner = this.f8063p0;
        if (spinner != null) {
            spinner.setAdapter(spinnerAdapter);
        }
    }

    public void setDropdownSelectedPosition(int i) {
        this.f8063p0.setSelection(i);
    }

    public void setEndActionMenuEnable(boolean z) {
        this.f8247p = z;
    }

    public void setEndActionMenuItemLimit(int i) {
        this.f8034a1 = i;
        C2225b bVar = this.f7972B0;
        if (bVar != null) {
            bVar.mo8292c0(i);
        }
    }

    public void setEndView(View view) {
        View view2 = this.f8083z0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8083z0 = view;
        if (view != null) {
            addView(view);
            Folme.useAt(this.f8083z0).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
            Folme.useAt(this.f8083z0).hover().setFeedbackRadius(60.0f);
            Folme.useAt(this.f8083z0).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f8083z0, new AnimConfig[0]);
        }
    }

    public /* bridge */ /* synthetic */ void setExpandState(int i) {
        super.setExpandState(i);
    }

    public void setExtraPaddingPolicy(C1925e eVar) {
        this.f7976D0 = eVar;
    }

    public void setHomeAsUpIndicator(int i) {
        HomeView homeView = this.f8041e0;
        if (homeView != null) {
            homeView.mo7984d(i);
            return;
        }
        this.f8037c0 = null;
        this.f8039d0 = i;
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        HomeView homeView = this.f8041e0;
        if (homeView != null) {
            homeView.mo7986e(drawable);
            return;
        }
        this.f8037c0 = drawable;
        this.f8039d0 = 0;
    }

    public void setHomeButtonEnabled(boolean z) {
        HomeView homeView;
        int i;
        Resources resources;
        CharSequence text;
        HomeView homeView2 = this.f8041e0;
        if (homeView2 != null) {
            homeView2.setEnabled(z);
            this.f8041e0.setFocusable(z);
            if (!z) {
                homeView = this.f8041e0;
                text = null;
            } else {
                if ((this.f7998N & 4) != 0) {
                    homeView = this.f8041e0;
                    resources = this.f8019U.getResources();
                    i = C1355k.f4785b;
                } else {
                    homeView = this.f8041e0;
                    resources = this.f8019U.getResources();
                    i = C1355k.f4784a;
                }
                text = resources.getText(i);
            }
            homeView.setContentDescription(text);
        }
    }

    public void setIcon(int i) {
        setIcon(this.f8019U.getResources().getDrawable(i));
    }

    public void setIcon(Drawable drawable) {
        HomeView homeView;
        this.f8013S = drawable;
        this.f8010R |= 1;
        if (drawable != null && (((this.f7998N & 1) == 0 || getLogo() == null) && (homeView = this.f8041e0) != null)) {
            homeView.mo7982b(drawable);
        }
        if (this.f8064p1 != null) {
            this.f8043f0.mo7982b(this.f8013S.getConstantState().newDrawable(getResources()));
        }
    }

    public void setLifecycleOwner(C1048m mVar) {
        this.f8022V = mVar;
    }

    public void setLogo(int i) {
        setLogo(this.f8019U.getResources().getDrawable(i));
    }

    public void setLogo(Drawable drawable) {
        HomeView homeView;
        this.f8016T = drawable;
        this.f8010R |= 2;
        if (drawable != null && (this.f7998N & 1) != 0 && (homeView = this.f8041e0) != null) {
            homeView.mo7982b(drawable);
        }
    }

    public void setNavigationMode(int i) {
        LinearLayout linearLayout;
        int i2 = this.f7995M;
        if (i != i2) {
            if (i2 == 1 && (linearLayout = this.f8065q0) != null) {
                removeView(linearLayout);
            }
            if (i != 0) {
                if (i == 1) {
                    throw new UnsupportedOperationException("MIUIX Deleted");
                } else if (i == 2 && this.f8023V0) {
                    m8925p0();
                }
            } else if (this.f8023V0) {
                m8934w1();
            }
            this.f7995M = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setPendingInset(Rect rect) {
        super.setPendingInset(rect);
    }

    public void setProgress(int i) {
        m8881O1(i + 0);
    }

    public void setProgressBarIndeterminate(boolean z) {
        m8881O1(z ? -3 : -4);
    }

    public void setProgressBarIndeterminateVisibility(boolean z) {
        m8881O1(z ? -1 : -2);
    }

    public void setProgressBarVisibility(boolean z) {
        m8881O1(z ? -1 : -2);
    }

    public /* bridge */ /* synthetic */ void setResizable(boolean z) {
        super.setResizable(z);
    }

    public void setSplitActionBar(boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (this.f8246o != z) {
            C2233c cVar = this.f8243l;
            if (cVar != null) {
                m8932v1(cVar);
                if (z) {
                    ActionBarContainer actionBarContainer = this.f8245n;
                    if (actionBarContainer != null) {
                        actionBarContainer.addView(this.f8243l);
                    }
                    layoutParams = this.f8243l.getLayoutParams();
                    i = -1;
                } else {
                    addView(this.f8243l);
                    layoutParams = this.f8243l.getLayoutParams();
                    i = -2;
                }
                layoutParams.width = i;
                this.f8243l.requestLayout();
            }
            ActionBarContainer actionBarContainer2 = this.f8245n;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setVisibility(z ? 0 : 8);
            }
            C2225b bVar = this.f8244m;
            if (bVar != null) {
                if (!z) {
                    bVar.mo8291b0(getResources().getBoolean(C1348d.f4593a));
                } else {
                    bVar.mo8291b0(false);
                    this.f8244m.mo8294e0(getContext().getResources().getDisplayMetrics().widthPixels, true);
                }
            }
            super.setSplitActionBar(z);
        }
    }

    public /* bridge */ /* synthetic */ void setSplitView(ActionBarContainer actionBarContainer) {
        super.setSplitView(actionBarContainer);
    }

    public /* bridge */ /* synthetic */ void setSplitWhenNarrow(boolean z) {
        super.setSplitWhenNarrow(z);
    }

    public void setStartView(View view) {
        View view2 = this.f8081y0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8081y0 = view;
        if (view != null) {
            addView(view);
            this.f8038c1 = true;
            m8857F0();
            Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
            Folme.useAt(this.f8081y0).hover().setFeedbackRadius(60.0f);
            Folme.useAt(this.f8081y0).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f8081y0, new AnimConfig[0]);
            return;
        }
        this.f8038c1 = false;
        m8857F0();
    }

    public /* bridge */ /* synthetic */ void setSubTitleClickListener(View.OnClickListener onClickListener) {
        super.setSubTitleClickListener(onClickListener);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8004P = charSequence;
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            fVar.mo6211x(charSequence);
        }
        C1786h hVar = this.f8057m0;
        if (hVar != null) {
            hVar.mo6222k(charSequence);
        }
        setTitleVisibility(m8855E1());
        post(new C2208q(this));
    }

    public void setTitle(CharSequence charSequence) {
        this.f8020U0 = true;
        setTitleImpl(charSequence);
    }

    public void setTitleClickable(boolean z) {
        super.setTitleClickable(z);
        C1784f fVar = this.f8055l0;
        if (fVar != null) {
            fVar.mo6208u(z);
        }
        C1786h hVar = this.f8057m0;
        if (hVar != null) {
            hVar.mo6219h(z);
        }
    }

    public void setUserSetEndActionMenuItemLimit(boolean z) {
        this.f8036b1 = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f8066q1 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f8020U0) {
            setTitleImpl(charSequence);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t0 */
    public void mo7975t0() {
        if (this.f8023V0 && this.f7995M == 2 && this.f8067r0.getParent() == null) {
            m8925p0();
        }
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo7778u() {
        super.mo7778u();
    }

    /* renamed from: u1 */
    public void mo7976u1() {
        post(new C2209r(this));
    }

    /* renamed from: v */
    public void mo7779v() {
        if (this.f8246o && this.f8244m != null) {
            m8924o0();
        }
    }

    /* renamed from: v0 */
    public void mo7977v0() {
        C2168o oVar = this.f8062o1;
        C2247e eVar = oVar == null ? null : oVar.f8108e;
        if (eVar != null) {
            eVar.collapseActionView();
        }
    }

    /* renamed from: w */
    public void mo7780w(int i, boolean z, boolean z2) {
        if (!z) {
            m8929s1();
        }
        super.mo7780w(i, z, z2);
    }

    /* renamed from: x */
    public /* bridge */ /* synthetic */ boolean mo7781x() {
        return super.mo7781x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public C2225b mo7978x0(C2250g.C2251a aVar) {
        C2225b bVar = new C2225b(this.f8019U, m8854E0(), C1354j.f4747F, C1354j.f4771n);
        bVar.mo8217q(aVar);
        bVar.mo8218r(C1352h.f4732s);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public C2236d mo7979z0(C2250g.C2251a aVar) {
        C2236d dVar = new C2236d(this.f8019U, m8854E0(), C1354j.f4769l, C1354j.f4768k, C1354j.f4758a, C1354j.f4761d);
        dVar.mo8217q(aVar);
        dVar.mo8218r(C1352h.f4688J);
        return dVar;
    }

    /* renamed from: z1 */
    public void mo7980z1(ScrollingTabContainerView scrollingTabContainerView, ScrollingTabContainerView scrollingTabContainerView2, SecondaryTabContainerView secondaryTabContainerView, SecondaryTabContainerView secondaryTabContainerView2) {
        boolean z = scrollingTabContainerView != null;
        this.f8023V0 = z;
        if (z) {
            m8846B1(scrollingTabContainerView, scrollingTabContainerView2, secondaryTabContainerView, secondaryTabContainerView2);
            if (this.f7995M == 2) {
                m8925p0();
            }
        }
    }
}
