package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.internal.app.widget.C2182b;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.action.C2225b;
import miuix.appcompat.internal.view.menu.action.C2233c;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.view.C2396a;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1355k;
import p018c2.C1357m;
import p055i3.C1649c;
import p055i3.C1656j;
import p066k2.C1784f;
import p066k2.C1786h;
import p078m2.C1924d;
import p090o2.C2494a;
import p117t2.C2698f;

public class ActionBarContextView extends C2182b implements C2211t {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public Scroller f7826A0;

    /* renamed from: B0 */
    private Runnable f7827B0;

    /* renamed from: L */
    private CharSequence f7828L;

    /* renamed from: M */
    private LinearLayout f7829M;

    /* renamed from: N */
    private Button f7830N;

    /* renamed from: O */
    private Button f7831O;

    /* renamed from: P */
    private TextView f7832P;

    /* renamed from: Q */
    private int f7833Q;

    /* renamed from: R */
    private Drawable f7834R;

    /* renamed from: S */
    private Drawable f7835S;

    /* renamed from: T */
    private boolean f7836T;

    /* renamed from: U */
    private boolean f7837U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C2494a f7838V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C2494a f7839W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public WeakReference<ActionMode> f7840a0;

    /* renamed from: b0 */
    private SpringAnimation f7841b0;

    /* renamed from: c0 */
    private boolean f7842c0;

    /* renamed from: d0 */
    private int f7843d0;

    /* renamed from: e0 */
    private int f7844e0;

    /* renamed from: f0 */
    private List<C2396a> f7845f0;

    /* renamed from: g0 */
    private float f7846g0;

    /* renamed from: h0 */
    private boolean f7847h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public boolean f7848i0;

    /* renamed from: j0 */
    private boolean f7849j0;

    /* renamed from: k0 */
    private View.OnClickListener f7850k0;

    /* renamed from: l0 */
    private int f7851l0;

    /* renamed from: m0 */
    private TextView f7852m0;

    /* renamed from: n0 */
    private C2182b.C2184b f7853n0;

    /* renamed from: o0 */
    private C2182b.C2184b f7854o0;

    /* renamed from: p0 */
    private View f7855p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public FrameLayout f7856q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public int f7857r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public int f7858s0;

    /* renamed from: t0 */
    private int f7859t0;

    /* renamed from: u0 */
    private ActionBarView f7860u0;

    /* renamed from: v0 */
    private AnimConfig f7861v0;

    /* renamed from: w0 */
    private TransitionListener f7862w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public boolean f7863x0;

    /* renamed from: y0 */
    private boolean f7864y0;

    /* renamed from: z0 */
    private boolean f7865z0;

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$a */
    class C2141a implements View.OnClickListener {
        C2141a() {
        }

        public void onClick(View view) {
            C1924d dVar;
            C2494a B = view.getId() == 16908313 ? ActionBarContextView.this.f7838V : ActionBarContextView.this.f7839W;
            if (ActionBarContextView.this.f7840a0 != null && (dVar = (C1924d) ActionBarContextView.this.f7840a0.get()) != null) {
                dVar.mo6474c((C2242c) dVar.getMenu(), B);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$b */
    class C2142b extends TransitionListener {

        /* renamed from: a */
        final /* synthetic */ boolean f7867a;

        /* renamed from: b */
        final /* synthetic */ ActionBarOverlayLayout f7868b;

        /* renamed from: c */
        final /* synthetic */ int f7869c;

        /* renamed from: d */
        final /* synthetic */ int f7870d;

        /* renamed from: e */
        final /* synthetic */ int f7871e;

        /* renamed from: f */
        final /* synthetic */ C2144d f7872f;

        C2142b(boolean z, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, C2144d dVar) {
            this.f7867a = z;
            this.f7868b = actionBarOverlayLayout;
            this.f7869c = i;
            this.f7870d = i2;
            this.f7871e = i3;
            this.f7872f = dVar;
        }

        public void onBegin(Object obj) {
            if (!ActionBarContextView.this.f7848i0) {
                ActionBarContextView.this.mo7721Z(this.f7867a);
                boolean unused = ActionBarContextView.this.f7848i0 = true;
                boolean unused2 = ActionBarContextView.this.f7863x0 = true;
            }
        }

        public void onComplete(Object obj) {
            boolean unused = ActionBarContextView.this.f7863x0 = false;
            this.f7872f.mo7784a();
        }

        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo findByName = UpdateInfo.findByName(collection, View.TRANSLATION_Y.getName());
            if (findByName != null) {
                float floatValue = findByName.getFloatValue();
                this.f7868b.mo7828M((int) (((float) this.f7869c) - floatValue), 1);
                int i = this.f7870d;
                int i2 = this.f7871e;
                ActionBarContextView.this.mo7723a0(this.f7867a, i == i2 ? 1.0f : (floatValue - ((float) i2)) / ((float) (i - i2)));
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$c */
    class C2143c implements Runnable {
        C2143c() {
        }

        public void run() {
            ActionBarContextView actionBarContextView;
            int i;
            if (ActionBarContextView.this.f7826A0.computeScrollOffset()) {
                ActionBarContextView actionBarContextView2 = ActionBarContextView.this;
                int unused = actionBarContextView2.f7857r0 = actionBarContextView2.f7826A0.getCurrY() - ActionBarContextView.this.f7858s0;
                ActionBarContextView.this.requestLayout();
                if (!ActionBarContextView.this.f7826A0.isFinished()) {
                    ActionBarContextView.this.postOnAnimation(this);
                    return;
                }
                if (ActionBarContextView.this.f7826A0.getCurrY() == ActionBarContextView.this.f7858s0) {
                    actionBarContextView = ActionBarContextView.this;
                    i = 0;
                } else if (ActionBarContextView.this.f7826A0.getCurrY() == ActionBarContextView.this.f7858s0 + ActionBarContextView.this.f7856q0.getMeasuredHeight()) {
                    actionBarContextView = ActionBarContextView.this;
                    i = 1;
                } else {
                    return;
                }
                actionBarContextView.setExpandState(i);
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$d */
    private static class C2144d {

        /* renamed from: a */
        private int f7875a;

        /* renamed from: b */
        private C2145a f7876b;

        /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$d$a */
        interface C2145a {
            /* renamed from: a */
            void mo7785a();
        }

        public C2144d(int i, C2145a aVar) {
            this.f7875a = i;
            this.f7876b = aVar;
        }

        /* renamed from: a */
        public void mo7784a() {
            int i = this.f7875a - 1;
            this.f7875a = i;
            if (i == 0) {
                this.f7876b.mo7785a();
            }
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$e */
    private static class C2146e extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<C2146e> CREATOR = new C2147a();

        /* renamed from: d */
        public CharSequence f7877d;

        /* renamed from: e */
        public CharSequence f7878e;

        /* renamed from: f */
        public boolean f7879f;

        /* renamed from: g */
        public int f7880g;

        /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$e$a */
        class C2147a implements Parcelable.ClassLoaderCreator<C2146e> {
            C2147a() {
            }

            /* renamed from: a */
            public C2146e createFromParcel(Parcel parcel) {
                return new C2146e(parcel, (C2141a) null);
            }

            /* renamed from: b */
            public C2146e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2146e(parcel, classLoader, (C2141a) null);
            }

            /* renamed from: c */
            public C2146e[] newArray(int i) {
                return new C2146e[i];
            }
        }

        private C2146e(Parcel parcel) {
            super(parcel);
            this.f7879f = parcel.readInt() != 0;
            this.f7877d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7878e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7880g = parcel.readInt();
        }

        private C2146e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7879f = parcel.readInt() != 0;
            this.f7877d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7878e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7880g = parcel.readInt();
        }

        /* synthetic */ C2146e(Parcel parcel, ClassLoader classLoader, C2141a aVar) {
            this(parcel, classLoader);
        }

        /* synthetic */ C2146e(Parcel parcel, C2141a aVar) {
            this(parcel);
        }

        C2146e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7879f ? 1 : 0);
            TextUtils.writeToParcel(this.f7877d, parcel, 0);
            TextUtils.writeToParcel(this.f7878e, parcel, 0);
            parcel.writeInt(this.f7880g);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843668);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7837U = true;
        this.f7849j0 = false;
        this.f7850k0 = new C2141a();
        this.f7853n0 = new C2182b.C2184b();
        this.f7854o0 = new C2182b.C2184b();
        this.f7864y0 = false;
        this.f7865z0 = false;
        this.f7827B0 = new C2143c();
        this.f7826A0 = new Scroller(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7856q0 = frameLayout;
        frameLayout.setId(C1352h.f4715f);
        FrameLayout frameLayout2 = this.f7856q0;
        Resources resources = context.getResources();
        int i2 = C1350f.f4659o;
        frameLayout2.setPaddingRelative(resources.getDimensionPixelOffset(i2), context.getResources().getDimensionPixelOffset(C1350f.f4663q), context.getResources().getDimensionPixelOffset(i2), context.getResources().getDimensionPixelOffset(C1350f.f4655m));
        this.f7856q0.setVisibility(0);
        this.f7854o0.mo8128b(this.f7856q0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4840L, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1357m.f4844M);
        this.f7835S = drawable;
        setBackground(drawable);
        this.f7833Q = obtainStyledAttributes.getResourceId(C1357m.f4852O, 0);
        this.f7851l0 = obtainStyledAttributes.getResourceId(C1357m.f4864R, 0);
        this.f8249r = obtainStyledAttributes.getLayoutDimension(C1357m.f4848N, 0);
        this.f7834R = obtainStyledAttributes.getDrawable(C1357m.f4856P);
        Context context2 = context;
        this.f7838V = new C2494a(context2, 0, 16908313, 0, 0, context.getString(17039360));
        this.f7839W = new C2494a(context2, 0, 16908314, 0, 0, context.getString(C1355k.f4787d));
        this.f7837U = obtainStyledAttributes.getBoolean(C1357m.f4860Q, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: L */
    private void m8725L() {
        this.f8244m.mo8294e0(getContext().getResources().getDisplayMetrics().widthPixels, true);
        C2233c cVar = (C2233c) this.f8244m.mo8216o(this);
        this.f8243l = cVar;
        ViewGroup viewGroup = (ViewGroup) cVar.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f8243l);
            this.f8245n.mo7694t(this.f8243l);
        }
        C2233c cVar2 = this.f8243l;
        if (cVar2 != null) {
            cVar2.setSupportBlur(this.f8245n.mo7673r());
            this.f8243l.setEnableBlur(this.f8245n.mo7672q());
            this.f8243l.mo7648b(this.f8245n.mo7672q());
            this.f8243l.mo8316n(this.f7849j0);
        }
        boolean z = this.f8229F == 3;
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
        C2233c cVar3 = this.f8243l;
        if (cVar3 instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) cVar3).setSuspendEnabled(z);
        }
        this.f8245n.addView(this.f8243l, layoutParams);
        this.f8245n.mo7674s(this.f8243l);
        requestLayout();
    }

    /* renamed from: M */
    private void m8726M(float f) {
        float min = 1.0f - Math.min(1.0f, f * 3.0f);
        int i = this.f8254w;
        if (i == 2) {
            if (min > 0.0f) {
                this.f7853n0.mo8127a(0.0f, 0, 20, this.f8236e);
            } else {
                this.f7853n0.mo8127a(1.0f, 0, 0, this.f8235d);
            }
            this.f7854o0.mo8127a(min, 0, 0, this.f8240i);
        } else if (i == 1) {
            this.f7853n0.mo8127a(0.0f, 0, 20, this.f8236e);
            this.f7854o0.mo8127a(1.0f, 0, 0, this.f8240i);
        } else if (i == 0) {
            this.f7853n0.mo8127a(1.0f, 0, 0, this.f8235d);
            this.f7854o0.mo8127a(0.0f, 0, 0, this.f8240i);
        }
    }

    /* renamed from: N */
    private boolean m8727N() {
        return (!mo7750l() && getExpandState() == 0) || this.f7832P.getPaint().measureText(this.f7828L.toString()) <= ((float) this.f7832P.getMeasuredWidth());
    }

    /* renamed from: P */
    private void m8728P() {
        ActionBarContainer actionBarContainer;
        setBackground((Drawable) null);
        if (this.f8246o && (actionBarContainer = this.f8245n) != null) {
            actionBarContainer.mo7647G(true);
        }
    }

    /* renamed from: R */
    private SpringAnimation m8729R(View view, float f, float f2, float f3) {
        SpringAnimation springAnimation = new SpringAnimation(view, ViewProperty.ALPHA, f3);
        springAnimation.setStartValue(f2);
        springAnimation.getSpring().setStiffness(f);
        springAnimation.getSpring().setDampingRatio(0.9f);
        springAnimation.setMinimumVisibleChange(0.00390625f);
        return springAnimation;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m8732b0() {
        C2233c cVar;
        setSplitAnimating(false);
        this.f7848i0 = false;
        mo7720Y(this.f7847h0);
        if (this.f7843d0 == 2) {
            mo7722a();
        }
        this.f7843d0 = 0;
        this.f7841b0 = null;
        int i = 8;
        setVisibility(this.f7847h0 ? 0 : 8);
        if (!(this.f8245n == null || (cVar = this.f8243l) == null)) {
            if (this.f7847h0) {
                i = 0;
            }
            cVar.setVisibility(i);
        }
        Folme.clean(this.f8243l);
    }

    /* renamed from: c0 */
    private void m8733c0(boolean z) {
        C2233c cVar;
        mo7720Y(z);
        int i = 0;
        setVisibility(z ? 0 : 8);
        if (this.f8245n != null && (cVar = this.f8243l) != null) {
            if (!z) {
                i = 8;
            }
            cVar.setVisibility(i);
        }
    }

    /* renamed from: d0 */
    private void m8734d0(int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int measuredHeight = this.f7855p0.getMeasuredHeight();
        int i5 = ((i4 - i2) - measuredHeight) / 2;
        if (this.f7855p0.getVisibility() != 8) {
            View view = this.f7855p0;
            C1656j.m6986e(this, view, paddingStart, i5, paddingStart + view.getMeasuredWidth(), i5 + this.f7855p0.getMeasuredHeight());
        }
        int paddingEnd = (i3 - i) - getPaddingEnd();
        C2233c cVar = this.f8243l;
        if (cVar != null && cVar.getParent() == this) {
            mo8123s(this.f8243l, paddingEnd, i5, measuredHeight);
        }
        if (this.f7842c0) {
            this.f7843d0 = 1;
            mo7719X(true);
            this.f7842c0 = false;
        } else if (this.f8243l != null) {
            ((ActionBarOverlayLayout) getParent().getParent()).mo7828M(this.f8243l.getCollapsedHeight(), 1);
        }
    }

    /* renamed from: k0 */
    private void m8735k0() {
        ActionBarContainer actionBarContainer;
        setBackground(this.f7835S);
        if (this.f8246o && (actionBarContainer = this.f8245n) != null) {
            actionBarContainer.mo7647G(false);
        }
    }

    /* renamed from: m0 */
    private void m8736m0() {
        C2233c cVar = this.f8243l;
        if (cVar != null) {
            Folme.useAt(this.f8243l).state().setTo((Object) new AnimState().add(ViewProperty.TRANSLATION_Y, (double) (this.f7847h0 ? 0 : cVar.getCollapsedHeight())));
        }
    }

    private void setSplitAnimating(boolean z) {
        ActionBarContainer actionBarContainer = this.f8245n;
        if (actionBarContainer != null) {
            ((ActionBarOverlayLayout) actionBarContainer.getParent()).setAnimating(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo7714O() {
        SpringAnimation springAnimation = this.f7841b0;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.f7841b0 = null;
        }
        m8736m0();
        setSplitAnimating(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo7715Q() {
        SpringAnimation springAnimation = this.f7841b0;
        if (springAnimation != null) {
            springAnimation.skipToEnd();
            this.f7841b0 = null;
        }
        m8736m0();
        setSplitAnimating(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo7716S() {
        if (this.f7829M == null) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C1354j.f4773p, this, false);
            this.f7829M = linearLayout;
            this.f7830N = (Button) linearLayout.findViewById(16908313);
            this.f7831O = (Button) this.f7829M.findViewById(16908314);
            Button button = this.f7830N;
            if (button != null) {
                button.setOnClickListener(this.f7850k0);
                Folme.useAt(this.f7830N).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(this.f7830N, new AnimConfig[0]);
                Folme.useAt(this.f7830N).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f7830N, new AnimConfig[0]);
            }
            Button button2 = this.f7831O;
            if (button2 != null) {
                button2.setOnClickListener(this.f7850k0);
                Folme.useAt(this.f7831O).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(this.f7831O, new AnimConfig[0]);
                Folme.useAt(this.f7831O).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f7831O, new AnimConfig[0]);
            }
            TextView textView = (TextView) this.f7829M.findViewById(16908310);
            this.f7832P = textView;
            if (this.f7833Q != 0) {
                textView.setTextAppearance(getContext(), this.f7833Q);
            }
            if (this.f7832P.getEllipsize() == TextUtils.TruncateAt.MARQUEE) {
                this.f7832P.requestFocus();
            }
            TextView textView2 = new TextView(getContext());
            this.f7852m0 = textView2;
            if (this.f7851l0 != 0) {
                textView2.setTextAppearance(getContext(), this.f7851l0);
            }
        }
        this.f7832P.setText(this.f7828L);
        this.f7852m0.setText(this.f7828L);
        this.f7855p0 = this.f7829M;
        this.f7853n0.mo8128b(this.f7832P);
        boolean z = !TextUtils.isEmpty(this.f7828L);
        int i = 8;
        this.f7829M.setVisibility(z ? 0 : 8);
        TextView textView3 = this.f7852m0;
        if (z) {
            i = 0;
        }
        textView3.setVisibility(i);
        if (this.f7829M.getParent() == null) {
            addView(this.f7829M);
        }
        if (this.f7852m0.getParent() == null) {
            this.f7856q0.addView(this.f7852m0);
        }
        if (this.f7856q0.getParent() == null) {
            addView(this.f7856q0);
        }
        int i2 = this.f8254w;
        if (i2 == 0) {
            this.f7853n0.mo8136j(1.0f, 0, 0);
            this.f7854o0.mo8136j(0.0f, 0, 0);
        } else if (i2 == 1) {
            this.f7853n0.mo8136j(0.0f, 0, 20);
            this.f7854o0.mo8136j(1.0f, 0, 0);
        }
    }

    /* renamed from: T */
    public boolean mo7717T() {
        return this.f7863x0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo7718W(boolean z) {
        float f = 1.0f;
        setAlpha(z ? 1.0f : 0.0f);
        if (!this.f8246o) {
            m8733c0(z);
            return;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8245n.getParent();
        int collapsedHeight = this.f8243l.getCollapsedHeight();
        this.f8243l.setTranslationY(z ? 0.0f : (float) collapsedHeight);
        if (!z) {
            collapsedHeight = 0;
        }
        actionBarOverlayLayout.mo7855q(collapsedHeight);
        C2233c cVar = this.f8243l;
        if (!z) {
            f = 0.0f;
        }
        cVar.setAlpha(f);
        m8733c0(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo7719X(boolean z) {
        int i;
        int i2;
        boolean z2 = z;
        if (z2 != this.f7847h0 || this.f7841b0 == null) {
            this.f7847h0 = z2;
            this.f7848i0 = false;
            float f = 0.0f;
            float f2 = 1.0f;
            if (!z2) {
                f2 = 0.0f;
                f = 1.0f;
            }
            SpringAnimation R = m8729R(this, z2 ? 322.27f : 986.96f, f, f2);
            R.setStartDelay(z2 ? 50 : 0);
            setAlpha(f);
            this.f7841b0 = R;
            if (!this.f8246o) {
                R.addEndListener(new C2187d(new C2144d(1, new C2186c(this))));
                R.start();
                return;
            }
            C2144d dVar = new C2144d(2, new C2186c(this));
            R.addEndListener(new C2188e(dVar));
            R.start();
            C2233c cVar = this.f8243l;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
            int collapsedHeight = cVar == null ? 0 : cVar.getCollapsedHeight();
            if (z2) {
                i2 = collapsedHeight;
                i = 0;
            } else {
                i = collapsedHeight;
                i2 = 0;
            }
            if (cVar != null) {
                if (this.f7861v0 == null) {
                    this.f7861v0 = new AnimConfig().setEase(-2, 0.95f, 0.25f);
                }
                TransitionListener transitionListener = this.f7862w0;
                if (transitionListener != null) {
                    this.f7861v0.removeListeners(transitionListener);
                }
                AnimConfig animConfig = this.f7861v0;
                C2142b bVar = r0;
                C2142b bVar2 = new C2142b(z, actionBarOverlayLayout, collapsedHeight, i, i2, dVar);
                this.f7862w0 = bVar;
                animConfig.addListeners(bVar);
                cVar.setTranslationY((float) i2);
                Folme.useAt(cVar).state().mo6815to(new AnimState("menu_end_state").add(ViewProperty.TRANSLATION_Y, (double) i), this.f7861v0);
                actionBarOverlayLayout.mo7828M(0, 1);
            }
        }
    }

    /* renamed from: Y */
    public void mo7720Y(boolean z) {
        List<C2396a> list = this.f7845f0;
        if (list != null) {
            for (C2396a e : list) {
                e.mo6476e(z);
            }
        }
    }

    /* renamed from: Z */
    public void mo7721Z(boolean z) {
        List<C2396a> list = this.f7845f0;
        if (list != null) {
            for (C2396a f : list) {
                f.mo6477f(z);
            }
        }
    }

    /* renamed from: a */
    public void mo7722a() {
        removeAllViews();
        List<C2396a> list = this.f7845f0;
        if (list != null) {
            list.clear();
            this.f7845f0 = null;
        }
        if (this.f8245n != null) {
            C2233c cVar = this.f8243l;
            if (cVar != null) {
                cVar.mo8264l();
            }
            this.f8245n.removeView(this.f8243l);
            this.f8245n.mo7694t(this.f8243l);
        }
        this.f8243l = null;
        this.f7840a0 = null;
    }

    /* renamed from: a0 */
    public void mo7723a0(boolean z, float f) {
        List<C2396a> list = this.f7845f0;
        if (list != null) {
            for (C2396a d : list) {
                d.mo6475d(z, f);
            }
        }
    }

    /* renamed from: b */
    public void mo7724b(C2396a aVar) {
        if (aVar != null) {
            if (this.f7845f0 == null) {
                this.f7845f0 = new ArrayList();
            }
            this.f7845f0.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo7725c(ActionMode actionMode) {
        if (this.f7840a0 != null) {
            mo7714O();
            mo7722a();
        }
        mo7716S();
        this.f7840a0 = new WeakReference<>(actionMode);
        C2242c cVar = (C2242c) actionMode.getMenu();
        C2225b bVar = this.f8244m;
        if (bVar != null) {
            bVar.mo8281O(false);
        }
        ViewParent parent = getParent();
        while (true) {
            View view = (View) parent;
            if (view instanceof ActionBarOverlayLayout) {
                C2225b bVar2 = new C2225b(getContext(), (ActionBarOverlayLayout) view, C1354j.f4747F, C1354j.f4772o);
                this.f8244m = bVar2;
                bVar2.mo8293d0(true);
                this.f8244m.mo8289Z(true);
                int i = this.f8230G;
                if (i != Integer.MIN_VALUE) {
                    this.f8244m.mo8292c0(i);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                cVar.mo8374c(this.f8244m);
                if (!this.f8246o) {
                    C2233c cVar2 = (C2233c) this.f8244m.mo8216o(this);
                    this.f8243l = cVar2;
                    cVar2.setBackground((Drawable) null);
                    addView(this.f8243l, layoutParams);
                    return;
                }
                m8725L();
                return;
            } else if (view.getParent() instanceof View) {
                parent = view.getParent();
            } else {
                throw new IllegalStateException("ActionBarOverlayLayout not found");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo7726e0(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout = this.f7856q0;
        if (frameLayout != null && frameLayout.getVisibility() == 0 && this.f8254w != 0) {
            FrameLayout frameLayout2 = this.f7856q0;
            frameLayout2.layout(i, i4 - frameLayout2.getMeasuredHeight(), i3, i4);
            if (C1656j.m6983b(this)) {
                i = i3 - this.f7856q0.getMeasuredWidth();
            }
            Rect rect = new Rect();
            rect.set(i, this.f7856q0.getMeasuredHeight() - (i4 - i2), this.f7856q0.getMeasuredWidth() + i, this.f7856q0.getMeasuredHeight());
            this.f7856q0.setClipBounds(rect);
        }
    }

    /* renamed from: f0 */
    public void mo7727f0(View view, int i, int i2, int[] iArr, int i3, int[] iArr2) {
        int i4;
        if (mo7750l()) {
            int height = getHeight();
            if (i2 > 0 && height > (i4 = this.f7858s0)) {
                int i5 = height - i2;
                int i6 = this.f7857r0;
                this.f7857r0 = i5 >= i4 ? i6 - i2 : 0;
                iArr[1] = iArr[1] + i2;
                if (this.f7857r0 != i6) {
                    iArr2[1] = i2;
                    requestLayout();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo7728g() {
        mo7715Q();
        this.f7843d0 = 2;
    }

    /* renamed from: g0 */
    public void mo7729g0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if (mo7750l()) {
            int measuredHeight = this.f7856q0.getMeasuredHeight();
            int i6 = this.f7858s0 + measuredHeight;
            int height = getHeight();
            if (i4 < 0 && height < i6) {
                int i7 = this.f7857r0;
                if (height - i4 <= i6) {
                    this.f7857r0 = i7 - i4;
                    iArr[1] = iArr[1] + i4;
                } else {
                    this.f7857r0 = measuredHeight;
                    iArr[1] = iArr[1] + (-(i6 - height));
                }
                if (this.f7857r0 != i7) {
                    iArr2[1] = i4;
                    requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public int getActionBarStyle() {
        return 16843668;
    }

    public /* bridge */ /* synthetic */ C2233c getActionMenuView() {
        return super.getActionMenuView();
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public float getAnimationProgress() {
        return this.f7846g0;
    }

    public C1784f getCollapseTitle() {
        return null;
    }

    public int getCollapsedHeight() {
        return this.f7858s0;
    }

    public /* bridge */ /* synthetic */ int getExpandState() {
        return super.getExpandState();
    }

    public C1786h getExpandTitle() {
        return null;
    }

    public int getExpandedHeight() {
        return this.f7859t0;
    }

    public /* bridge */ /* synthetic */ C2233c getMenuView() {
        return super.getMenuView();
    }

    public CharSequence getTitle() {
        return this.f7828L;
    }

    public int getViewHeight() {
        return getCollapsedHeight();
    }

    /* renamed from: h */
    public void mo7744h(boolean z) {
        mo7714O();
        setSplitAnimating(this.f7837U);
        if (z) {
            if (this.f7837U) {
                setVisibility(0);
                this.f7842c0 = true;
                return;
            }
            mo7718W(true);
        } else if (this.f7837U) {
            mo7719X(false);
        } else {
            mo7718W(false);
        }
    }

    /* renamed from: h0 */
    public void mo7745h0(View view, View view2, int i, int i2) {
        if (mo7750l()) {
            if (i2 == 0) {
                this.f7864y0 = true;
            } else {
                this.f7865z0 = true;
            }
            if (!this.f7826A0.isFinished()) {
                this.f7826A0.forceFinished(true);
            }
            setExpandState(2);
        }
    }

    /* renamed from: i0 */
    public boolean mo7746i0(View view, View view2, int i, int i2) {
        return true;
    }

    /* renamed from: j */
    public boolean mo7747j() {
        C2225b bVar = this.f8244m;
        return bVar != null && bVar.mo8284T(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r3.f7865z0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7748j0(android.view.View r4, int r5) {
        /*
            r3 = this;
            boolean r4 = r3.mo7750l()
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.FrameLayout r4 = r3.f7856q0
            int r4 = r4.getMeasuredHeight()
            int r5 = r3.getHeight()
            boolean r0 = r3.f7864y0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            r3.f7864y0 = r2
            boolean r0 = r3.f7865z0
            if (r0 != 0) goto L_0x0026
            goto L_0x0024
        L_0x001e:
            boolean r0 = r3.f7865z0
            if (r0 == 0) goto L_0x0026
            r3.f7865z0 = r2
        L_0x0024:
            r0 = r1
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 == 0) goto L_0x0051
            int r0 = r3.f7857r0
            if (r0 != 0) goto L_0x0031
            r3.setExpandState(r2)
            return
        L_0x0031:
            if (r0 != r4) goto L_0x0037
            r3.setExpandState(r1)
            return
        L_0x0037:
            int r0 = r3.f7858s0
            int r1 = r4 / 2
            int r1 = r1 + r0
            if (r5 <= r1) goto L_0x0046
            android.widget.Scroller r1 = r3.f7826A0
            int r0 = r0 + r4
            int r0 = r0 - r5
            r1.startScroll(r2, r5, r2, r0)
            goto L_0x004c
        L_0x0046:
            android.widget.Scroller r4 = r3.f7826A0
            int r0 = r0 - r5
            r4.startScroll(r2, r5, r2, r0)
        L_0x004c:
            java.lang.Runnable r4 = r3.f7827B0
            r3.postOnAnimation(r4)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarContextView.mo7748j0(android.view.View, int):void");
    }

    /* renamed from: k */
    public boolean mo7749k() {
        C2225b bVar = this.f8244m;
        return bVar != null && bVar.mo8287W();
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo7750l() {
        return super.mo7750l();
    }

    /* renamed from: l0 */
    public void mo7751l0(int i, CharSequence charSequence) {
        C2494a aVar;
        mo7716S();
        int i2 = 8;
        if (i == 16908313) {
            Button button = this.f7830N;
            if (button != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i2 = 0;
                }
                button.setVisibility(i2);
                this.f7830N.setText(charSequence);
            }
            aVar = this.f7838V;
        } else if (i == 16908314) {
            Button button2 = this.f7831O;
            if (button2 != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i2 = 0;
                }
                button2.setVisibility(i2);
                this.f7831O.setText(charSequence);
            }
            aVar = this.f7839W;
        } else {
            return;
        }
        aVar.setTitle(charSequence);
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo7752m() {
        return super.mo7752m();
    }

    /* renamed from: n0 */
    public void mo7753n0(boolean z) {
        this.f7849j0 = z;
        if (z) {
            m8728P();
        } else {
            m8735k0();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        TextView textView;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1357m.f4900a, getActionBarStyle(), 0);
        this.f8249r = obtainStyledAttributes.getLayoutDimension(C1357m.f4848N, 0);
        obtainStyledAttributes.recycle();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C1350f.f4659o);
        this.f7856q0.setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(C1350f.f4663q), dimensionPixelOffset, getResources().getDimensionPixelOffset(C1350f.f4655m));
        setPaddingRelative(C1649c.m6962g(getContext(), C1347c.f4567e), getPaddingTop(), C1649c.m6962g(getContext(), C1347c.f4565d), getPaddingBottom());
        if (this.f7833Q != 0 && (textView = this.f7832P) != null) {
            textView.setTextAppearance(getContext(), this.f7833Q);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2225b bVar = this.f8244m;
        if (bVar != null) {
            bVar.mo8284T(false);
            this.f8244m.mo8285U();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = (int) (((float) (i3 - i)) / getContext().getResources().getDisplayMetrics().density);
        int i6 = this.f8254w;
        boolean z2 = false;
        int measuredHeight = i6 == 2 ? this.f7857r0 : i6 == 1 ? this.f7856q0.getMeasuredHeight() : 0;
        int i7 = i4 - i2;
        m8734d0(i, i2, i3, i4 - measuredHeight);
        mo7726e0(z, i, i7 - measuredHeight, i3, i7);
        float min = Math.min(1.0f, ((float) (this.f7856q0.getMeasuredHeight() - measuredHeight)) / ((float) this.f7856q0.getMeasuredHeight()));
        m8726M(min);
        this.f8228E = min;
        if (i5 > 670) {
            z2 = true;
        }
        this.f8232I = z2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.f8250s;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i4 > 0 ? i4 : View.MeasureSpec.getSize(i2)) - paddingTop, Integer.MIN_VALUE);
        C2233c cVar = this.f8243l;
        int i5 = 0;
        if (cVar == null || cVar.getParent() != this) {
            i3 = 0;
        } else {
            paddingLeft = mo8120n(this.f8243l, paddingLeft, makeMeasureSpec, 0);
            i3 = this.f8243l.getMeasuredHeight() + 0;
        }
        if (this.f7855p0.getVisibility() != 8) {
            this.f7855p0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), makeMeasureSpec);
            i3 = Math.max(i3, this.f7855p0.getMeasuredHeight());
            TextView textView = this.f7832P;
            if (textView != null) {
                textView.setVisibility(m8727N() ? 0 : 4);
            }
        }
        if (this.f7856q0.getVisibility() != 8) {
            this.f7856q0.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (i4 <= 0) {
            if (i3 > 0) {
                i5 = Math.max(i3, this.f8249r) + this.f7844e0;
            }
            this.f7858s0 = i5;
        } else if (i3 >= i4) {
            this.f7858s0 = i4 + this.f7844e0;
        }
        int measuredHeight = this.f7858s0 + this.f7856q0.getMeasuredHeight();
        this.f7859t0 = measuredHeight;
        int i6 = this.f8254w;
        if (i6 == 2) {
            measuredHeight = this.f7858s0 + this.f7857r0;
        } else if (i6 != 1) {
            measuredHeight = this.f7858s0;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C2146e eVar = (C2146e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        setTitle(eVar.f7877d);
        mo7751l0(16908314, eVar.f7878e);
        if (eVar.f7879f) {
            mo7778u();
        }
        setExpandState(eVar.f7880g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2146e eVar = new C2146e(super.onSaveInstanceState());
        eVar.f7879f = mo7749k();
        eVar.f7877d = getTitle();
        Button button = this.f7831O;
        if (button != null) {
            eVar.f7878e = button.getText();
        }
        int i = this.f8254w;
        if (i == 2) {
            i = 0;
        }
        eVar.f7880g = i;
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo7761p(int i, int i2) {
        C2182b.C2184b bVar;
        if (i == 2) {
            this.f7857r0 = 0;
            if (!this.f7826A0.isFinished()) {
                this.f7826A0.forceFinished(true);
            }
        }
        if (i2 == 2 && (bVar = this.f7854o0) != null) {
            bVar.mo8138l(0);
        }
        if (i2 == 1) {
            if (this.f7856q0.getAlpha() > 0.0f) {
                C2182b.C2184b bVar2 = this.f7853n0;
                if (bVar2 != null) {
                    bVar2.mo8137k(0.0f, 0, 20, true);
                }
                C2182b.C2184b bVar3 = this.f7854o0;
                if (bVar3 != null) {
                    bVar3.mo8137k(1.0f, 0, 0, true);
                }
            }
            C2182b.C2184b bVar4 = this.f7854o0;
            if (bVar4 != null) {
                bVar4.mo8138l(0);
            }
        }
        if (i2 == 0) {
            C2182b.C2184b bVar5 = this.f7853n0;
            if (bVar5 != null) {
                bVar5.mo8137k(1.0f, 0, 0, true);
                this.f7853n0.mo8138l(0);
                this.f7853n0.mo8133g();
            }
            C2182b.C2184b bVar6 = this.f7854o0;
            if (bVar6 != null) {
                bVar6.mo8137k(0.0f, 0, 0, true);
                this.f7854o0.mo8138l(8);
                return;
            }
            return;
        }
        this.f7857r0 = getHeight() - this.f7858s0;
    }

    public void setActionBarView(ActionBarView actionBarView) {
        this.f7860u0 = actionBarView;
    }

    public void setActionModeAnim(boolean z) {
        this.f7837U = z;
    }

    public void setAnimationProgress(float f) {
        this.f7846g0 = f;
        mo7723a0(this.f7847h0, f);
    }

    public /* bridge */ /* synthetic */ void setBottomMenuMode(int i) {
        super.setBottomMenuMode(i);
    }

    public void setContentInset(int i) {
        this.f7844e0 = i;
    }

    public /* bridge */ /* synthetic */ void setExpandState(int i) {
        super.setExpandState(i);
    }

    public /* bridge */ /* synthetic */ void setPendingInset(Rect rect) {
        super.setPendingInset(rect);
    }

    public /* bridge */ /* synthetic */ void setResizable(boolean z) {
        super.setResizable(z);
    }

    public void setSplitActionBar(boolean z) {
        if (this.f8246o != z) {
            if (this.f8244m != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                if (!z) {
                    C2233c cVar = (C2233c) this.f8244m.mo8216o(this);
                    this.f8243l = cVar;
                    cVar.setBackground((Drawable) null);
                    ViewGroup viewGroup = (ViewGroup) this.f8243l.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f8243l);
                    }
                    addView(this.f8243l, layoutParams);
                } else {
                    this.f8244m.mo8294e0(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.gravity = this.f8232I ? 17 : 80;
                    C2233c cVar2 = (C2233c) this.f8244m.mo8216o(this);
                    this.f8243l = cVar2;
                    cVar2.setBackground(this.f7834R);
                    ViewGroup viewGroup2 = (ViewGroup) this.f8243l.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.f8243l);
                        this.f8245n.mo7694t(this.f8243l);
                    }
                    this.f8245n.addView(this.f8243l, layoutParams);
                    this.f8245n.mo7674s(this.f8243l);
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

    public /* bridge */ /* synthetic */ void setSubTitleClickListener(View.OnClickListener onClickListener) {
        super.setSubTitleClickListener(onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7828L = charSequence;
        mo7716S();
    }

    public /* bridge */ /* synthetic */ void setTitleClickable(boolean z) {
        super.setTitleClickable(z);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f7836T) {
            requestLayout();
        }
        this.f7836T = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo7778u() {
        super.mo7778u();
    }

    /* renamed from: v */
    public void mo7779v() {
        if (this.f8246o && this.f8244m != null && this.f7840a0 != null) {
            m8725L();
        }
    }

    /* renamed from: w */
    public /* bridge */ /* synthetic */ void mo7780w(int i, boolean z, boolean z2) {
        super.mo7780w(i, z, z2);
    }

    /* renamed from: x */
    public boolean mo7781x() {
        C2225b bVar = this.f8244m;
        return bVar != null && bVar.mo8296g0();
    }
}
