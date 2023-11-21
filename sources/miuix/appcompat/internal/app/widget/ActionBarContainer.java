package miuix.appcompat.internal.app.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.appcompat.app.C2080e;
import miuix.appcompat.internal.view.menu.action.C2233c;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.view.C2397b;
import miuix.view.C2405j;
import p018c2.C1347c;
import p018c2.C1352h;
import p018c2.C1357m;
import p055i3.C1649c;
import p055i3.C1650d;
import p074l4.C1880a;
import p074l4.C1881b;
import p074l4.C1882c;
import p074l4.C1883d;
import p117t2.C2697e;
import p117t2.C2715o;

public class ActionBarContainer extends FrameLayout implements C2397b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C2233c f7775A = null;

    /* renamed from: B */
    private C2233c f7776B = null;

    /* renamed from: C */
    private boolean f7777C;

    /* renamed from: D */
    private boolean f7778D;

    /* renamed from: E */
    private Rect f7779E;

    /* renamed from: F */
    private int f7780F;

    /* renamed from: G */
    private boolean f7781G = false;

    /* renamed from: H */
    private boolean f7782H;

    /* renamed from: I */
    private boolean f7783I;

    /* renamed from: J */
    private int f7784J;

    /* renamed from: K */
    private int f7785K = -1;

    /* renamed from: L */
    private float f7786L = 0.0f;

    /* renamed from: M */
    private int f7787M = 0;

    /* renamed from: N */
    private int f7788N = 0;

    /* renamed from: O */
    private int f7789O = 0;

    /* renamed from: P */
    protected C2189f f7790P = null;

    /* renamed from: Q */
    List<C2080e> f7791Q = new CopyOnWriteArrayList();

    /* renamed from: R */
    private AnimatorListenerAdapter f7792R = new C2135a();

    /* renamed from: S */
    private AnimatorListenerAdapter f7793S = new C2136b();

    /* renamed from: d */
    private boolean f7794d;

    /* renamed from: e */
    private View f7795e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ActionBarView f7796f;

    /* renamed from: g */
    private int f7797g;

    /* renamed from: h */
    private boolean f7798h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ActionBarContextView f7799i;

    /* renamed from: j */
    private int f7800j;

    /* renamed from: k */
    private boolean f7801k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Animator f7802l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Drawable f7803m;

    /* renamed from: n */
    private Drawable[] f7804n;

    /* renamed from: o */
    private Drawable f7805o;

    /* renamed from: p */
    private Drawable f7806p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f7807q;

    /* renamed from: r */
    private boolean f7808r;

    /* renamed from: s */
    private boolean f7809s;

    /* renamed from: t */
    private boolean f7810t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f7811u;

    /* renamed from: v */
    private final C2405j f7812v;

    /* renamed from: w */
    private boolean f7813w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f7814x = false;

    /* renamed from: y */
    private Boolean f7815y = null;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Boolean f7816z = null;

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$a */
    class C2135a extends AnimatorListenerAdapter {
        C2135a() {
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarContainer.this.setVisibility(8);
            Animator unused = ActionBarContainer.this.f7802l = null;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$b */
    class C2136b extends AnimatorListenerAdapter {
        C2136b() {
        }

        public void onAnimationEnd(Animator animator) {
            Animator unused = ActionBarContainer.this.f7802l = null;
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$c */
    class C2137c implements C2405j.C2406a {
        C2137c() {
        }

        /* renamed from: a */
        public void mo7703a(C2405j jVar) {
            boolean d = C1649c.m6959d(ActionBarContainer.this.getContext(), C1347c.f4535C, true);
            jVar.mo9309i(C2405j.m10249a(ActionBarContainer.this.getContext(), ActionBarContainer.this.f7803m, d ? C1881b.f7257a : C1880a.f7252a), d ? C1883d.f7263a : C1882c.f7262a, 66);
        }

        /* renamed from: b */
        public void mo7704b(boolean z) {
            if (ActionBarContainer.this.f7807q) {
                boolean unused = ActionBarContainer.this.f7814x = z;
                if (ActionBarContainer.this.f7775A != null) {
                    boolean booleanValue = ActionBarContainer.this.f7816z != null ? ActionBarContainer.this.f7816z.booleanValue() : ActionBarContainer.this.f7814x;
                    if (z) {
                        ActionBarContainer.this.f7775A.setSupportBlur(true);
                        ActionBarContainer.this.f7775A.setEnableBlur(true);
                    }
                    ActionBarContainer.this.f7775A.mo7648b(booleanValue);
                }
            }
        }

        /* renamed from: c */
        public void mo7705c(boolean z) {
            boolean unused = ActionBarContainer.this.f7811u = !z;
            if (ActionBarContainer.this.f7796f != null) {
                ActionBarContainer.this.f7796f.setApplyBgBlur(z);
            }
            if (ActionBarContainer.this.f7799i != null) {
                ActionBarContainer.this.f7799i.mo7753n0(z);
            }
            ActionBarContainer.this.invalidate();
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$d */
    class C2138d implements Runnable {
        C2138d() {
        }

        public void run() {
            ActionBarContainer.this.mo7645E(true);
        }
    }

    /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$e */
    static class C2139e extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<C2139e> CREATOR = new C2140a();

        /* renamed from: d */
        int f7821d;

        /* renamed from: e */
        int f7822e;

        /* renamed from: f */
        boolean f7823f;

        /* renamed from: g */
        boolean f7824g;

        /* renamed from: h */
        boolean f7825h;

        /* renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$e$a */
        class C2140a implements Parcelable.ClassLoaderCreator<C2139e> {
            C2140a() {
            }

            /* renamed from: a */
            public C2139e createFromParcel(Parcel parcel) {
                return new C2139e(parcel);
            }

            /* renamed from: b */
            public C2139e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2139e(parcel, classLoader);
            }

            /* renamed from: c */
            public C2139e[] newArray(int i) {
                return new C2139e[i];
            }
        }

        C2139e(Parcel parcel) {
            super(parcel);
            this.f7821d = parcel.readInt();
            this.f7822e = parcel.readInt();
            boolean z = true;
            this.f7823f = parcel.readInt() != 0;
            this.f7824g = parcel.readInt() != 0;
            this.f7825h = parcel.readInt() == 0 ? false : z;
        }

        C2139e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7821d = parcel.readInt();
            this.f7822e = parcel.readInt();
            boolean z = true;
            this.f7823f = parcel.readInt() != 0;
            this.f7824g = parcel.readInt() != 0;
            this.f7825h = parcel.readInt() == 0 ? false : z;
        }

        C2139e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7821d);
            parcel.writeInt(this.f7822e);
            parcel.writeInt(this.f7823f ? 1 : 0);
            parcel.writeInt(this.f7824g ? 1 : 0);
            parcel.writeInt(this.f7825h ? 1 : 0);
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground((Drawable) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f4900a);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1357m.f4910c);
        this.f7803m = drawable;
        this.f7804n = new Drawable[]{drawable, obtainStyledAttributes.getDrawable(C1357m.f4990s), obtainStyledAttributes.getDrawable(C1357m.f4995t)};
        this.f7778D = obtainStyledAttributes.getBoolean(C1357m.f5000u, false);
        if (getId() == C1352h.f4704Z) {
            this.f7807q = true;
            this.f7806p = obtainStyledAttributes.getDrawable(C1357m.f4985r);
        }
        obtainStyledAttributes.recycle();
        if (!this.f7807q) {
            setPadding(0, 0, 0, 0);
        }
        m8675C();
        setWillNotDraw(!this.f7807q ? this.f7803m == null && this.f7805o == null : this.f7806p == null);
        this.f7811u = true;
        this.f7812v = new C2405j(context, this, false, new C2137c());
    }

    /* renamed from: C */
    private void m8675C() {
        TypedValue k;
        if (this.f7807q && (k = C1649c.m6966k(getContext(), C1347c.f4569f)) != null && k.type == 6) {
            float d = (float) C2715o.m11333d(getContext());
            this.f7785K = View.MeasureSpec.makeMeasureSpec((int) k.getFraction(d, d), Integer.MIN_VALUE);
        }
    }

    /* renamed from: D */
    private void m8676D() {
        ActionBarView actionBarView;
        Drawable[] drawableArr;
        if (!this.f7781G && !this.f7807q && (actionBarView = this.f7796f) != null && this.f7803m != null && (drawableArr = this.f7804n) != null && drawableArr.length >= 3) {
            char c = 0;
            if (actionBarView.mo7907X0()) {
                c = 1;
                int displayOptions = this.f7796f.getDisplayOptions();
                if (!((displayOptions & 2) == 0 && (displayOptions & 4) == 0 && (displayOptions & 16) == 0)) {
                    c = 2;
                }
            }
            Drawable drawable = this.f7804n[c];
            if (drawable != null) {
                this.f7803m = drawable;
            }
        }
    }

    /* renamed from: l */
    private void m8687l(View view) {
        if (view != null && view.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            Rect rect = this.f7779E;
            marginLayoutParams.topMargin = rect != null ? rect.top : 0;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: n */
    private int m8688n(C2233c cVar) {
        if (cVar == null || cVar.getVisibility() != 0 || cVar.getAlpha() == 0.0f || cVar.getCollapsedHeight() <= 0) {
            return 0;
        }
        return Math.max(0, cVar.getCollapsedHeight());
    }

    /* renamed from: o */
    private int m8689o(C2233c cVar) {
        if (cVar == null || cVar.getVisibility() != 0 || cVar.getAlpha() == 0.0f || cVar.getCollapsedHeight() <= 0) {
            return 0;
        }
        return Math.max(0, (int) (((float) cVar.getCollapsedHeight()) - cVar.getTranslationY()));
    }

    private void setActionBarBlurByNestedScrolled(boolean z) {
        this.f7813w = z;
        if (this.f7815y == null) {
            mo7648b(z);
        }
    }

    @SuppressLint({"WrongCall", "WrongConstant"})
    /* renamed from: u */
    private void m8690u(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        int i3 = this.f7785K;
        if (i3 != -1) {
            i2 = i3;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            i4 = Math.max(i4, getChildAt(i5).getMeasuredHeight());
        }
        if (i4 == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        C2233c cVar = this.f7775A;
        if (cVar != null && cVar.mo8263k()) {
            C2233c cVar2 = this.f7775A;
            if ((cVar2 instanceof ResponsiveActionMenuView) && !((ResponsiveActionMenuView) cVar2).mo8259A()) {
                setMeasuredDimension(getMeasuredWidth(), i4);
            }
        }
    }

    /* renamed from: A */
    public boolean mo7643A(View view, View view2, int i, int i2) {
        ActionBarContextView actionBarContextView = this.f7799i;
        return (actionBarContextView == null || actionBarContextView.getVisibility() != 0) ? this.f7796f.mo7940q1(view, view2, i, i2) : this.f7799i.mo7746i0(view, view2, i, i2);
    }

    /* renamed from: B */
    public void mo7644B(View view, int i) {
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView == null || actionBarContextView.getVisibility() != 0) {
            this.f7796f.mo7941r1(view, i);
        } else {
            this.f7799i.mo7748j0(view, i);
        }
    }

    /* renamed from: E */
    public void mo7645E(boolean z) {
        Animator animator = this.f7802l;
        if (animator != null) {
            animator.cancel();
        }
        setVisibility(0);
        if (!z) {
            setTranslationY(0.0f);
        } else if (this.f7807q) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "TranslationY", new float[]{(float) getHeight(), 0.0f});
            this.f7802l = ofFloat;
            ofFloat.setDuration(C1650d.m6967a() ? (long) getContext().getResources().getInteger(17694720) : 0);
            this.f7802l.addListener(this.f7793S);
            this.f7802l.start();
            C2233c cVar = this.f7775A;
            if (cVar != null) {
                cVar.startLayoutAnimation();
            }
        }
    }

    /* renamed from: F */
    public void mo7646F() {
        this.f7810t = true;
    }

    /* renamed from: G */
    public void mo7647G(boolean z) {
        this.f7811u = !z;
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView != null) {
            actionBarContextView.mo7753n0(z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void mo7648b(boolean z) {
        if (!this.f7807q) {
            this.f7812v.mo7648b(z);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f7777C) {
            post(new C2138d());
            this.f7777C = false;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7803m;
        if (drawable != null && drawable.isStateful()) {
            this.f7803m.setState(getDrawableState());
        }
        Drawable drawable2 = this.f7805o;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f7805o.setState(getDrawableState());
        }
        Drawable drawable3 = this.f7806p;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f7806p.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public C2189f getActionBarCoordinateListener() {
        return this.f7790P;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int collapsedHeight;
        ActionBarContextView actionBarContextView = this.f7799i;
        if ((actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f7799i.getMeasuredHeight() <= 0) ? false : true) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7799i.getLayoutParams();
            collapsedHeight = this.f7799i.getCollapsedHeight();
        } else {
            ActionBarView actionBarView = this.f7796f;
            if (actionBarView == null) {
                return 0;
            }
            marginLayoutParams = (ViewGroup.MarginLayoutParams) actionBarView.getLayoutParams();
            collapsedHeight = this.f7796f.getCollapsedHeight();
        }
        return collapsedHeight + marginLayoutParams.topMargin;
    }

    /* access modifiers changed from: package-private */
    public int getExpandedHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int expandedHeight;
        ActionBarContextView actionBarContextView = this.f7799i;
        if ((actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f7799i.getMeasuredHeight() <= 0) ? false : true) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7799i.getLayoutParams();
            expandedHeight = this.f7799i.getExpandedHeight();
        } else {
            ActionBarView actionBarView = this.f7796f;
            if (actionBarView == null) {
                return 0;
            }
            marginLayoutParams = (ViewGroup.MarginLayoutParams) actionBarView.getLayoutParams();
            expandedHeight = this.f7796f.getExpandedHeight();
        }
        return expandedHeight + marginLayoutParams.topMargin;
    }

    /* access modifiers changed from: package-private */
    public int getInsetHeight() {
        if (!this.f7807q) {
            return 0;
        }
        return Math.max(Math.max(0, m8689o(this.f7776B)), m8689o(this.f7775A));
    }

    public Rect getPendingInsets() {
        return this.f7779E;
    }

    public Drawable getPrimaryBackground() {
        return this.f7803m;
    }

    /* access modifiers changed from: package-private */
    public int getSplitCollapsedHeight() {
        if (!this.f7807q) {
            return 0;
        }
        return Math.max(Math.max(0, m8688n(this.f7776B)), m8688n(this.f7775A));
    }

    public View getTabContainer() {
        return this.f7795e;
    }

    /* renamed from: m */
    public void mo7659m() {
        this.f7810t = false;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8675C();
        C2405j jVar = this.f7812v;
        if (jVar != null) {
            jVar.mo9306f();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setActionBarCoordinateListener((C2189f) null);
        this.f7791Q.clear();
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (getWidth() != 0 && getHeight() != 0 && !this.f7807q && (drawable = this.f7803m) != null && this.f7811u) {
            drawable.draw(canvas);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7796f = (ActionBarView) findViewById(C1352h.f4705a);
        this.f7799i = (ActionBarContextView) findViewById(C1352h.f4728o);
        ActionBarView actionBarView = this.f7796f;
        if (actionBarView != null) {
            actionBarView.mo8119i(this.f7791Q);
            this.f7797g = this.f7796f.getExpandState();
            this.f7798h = this.f7796f.mo7750l();
        }
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView != null) {
            this.f7800j = actionBarContextView.getExpandState();
            this.f7801k = this.f7799i.mo7750l();
            this.f7799i.setActionBarView(this.f7796f);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !this.f7807q;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7794d || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            int r7 = r6.getMeasuredHeight()
            int r9 = r6.getMeasuredWidth()
            float r9 = (float) r9
            android.content.Context r11 = r6.getContext()
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r9 = r9 / r11
            int r9 = (int) r9
            android.view.View r11 = r6.f7795e
            r0 = 0
            if (r11 == 0) goto L_0x0079
            int r11 = r11.getVisibility()
            r1 = 8
            if (r11 == r1) goto L_0x0079
            android.view.View r11 = r6.f7795e
            int r11 = r11.getMeasuredHeight()
            miuix.appcompat.internal.app.widget.ActionBarView r1 = r6.f7796f
            if (r1 == 0) goto L_0x0059
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0059
            miuix.appcompat.internal.app.widget.ActionBarView r1 = r6.f7796f
            int r1 = r1.getMeasuredHeight()
            if (r1 <= 0) goto L_0x0059
            android.view.View r1 = r6.f7795e
            int r2 = r1.getPaddingLeft()
        L_0x0047:
            int r3 = r6.f7780F
        L_0x0049:
            android.view.View r4 = r6.f7795e
            int r4 = r4.getPaddingRight()
            android.view.View r5 = r6.f7795e
            int r5 = r5.getPaddingBottom()
            r1.setPadding(r2, r3, r4, r5)
            goto L_0x0072
        L_0x0059:
            android.graphics.Rect r1 = r6.f7779E
            if (r1 == 0) goto L_0x0060
            int r1 = r1.top
            goto L_0x0061
        L_0x0060:
            r1 = r0
        L_0x0061:
            int r11 = r11 + r1
            android.view.View r1 = r6.f7795e
            int r2 = r1.getPaddingLeft()
            android.graphics.Rect r3 = r6.f7779E
            if (r3 == 0) goto L_0x0047
            int r3 = r3.top
            int r4 = r6.f7780F
            int r3 = r3 + r4
            goto L_0x0049
        L_0x0072:
            android.view.View r1 = r6.f7795e
            int r11 = r7 - r11
            r1.layout(r8, r11, r10, r7)
        L_0x0079:
            boolean r11 = r6.f7807q
            r1 = 1
            if (r11 == 0) goto L_0x008e
            android.graphics.drawable.Drawable r7 = r6.f7806p
            if (r7 == 0) goto L_0x009b
            int r8 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            r7.setBounds(r0, r0, r8, r10)
            goto L_0x0099
        L_0x008e:
            r6.m8676D()
            android.graphics.drawable.Drawable r11 = r6.f7803m
            if (r11 == 0) goto L_0x009b
            int r10 = r10 - r8
            r11.setBounds(r0, r0, r10, r7)
        L_0x0099:
            r7 = r1
            goto L_0x009c
        L_0x009b:
            r7 = r0
        L_0x009c:
            r8 = 670(0x29e, float:9.39E-43)
            if (r9 <= r8) goto L_0x00a2
            r8 = r1
            goto L_0x00a3
        L_0x00a2:
            r8 = r0
        L_0x00a3:
            r6.f7808r = r8
            miuix.appcompat.internal.app.widget.ActionBarContextView r8 = r6.f7799i
            if (r8 == 0) goto L_0x00c7
            boolean r9 = r6.f7810t
            if (r9 == 0) goto L_0x00c7
            int r8 = r8.getMeasuredHeight()
            miuix.appcompat.internal.app.widget.ActionBarContextView r9 = r6.f7799i
            int r9 = r9.getCollapsedHeight()
            int r8 = r8 - r9
            r6.f7789O = r8
            miuix.appcompat.internal.app.widget.ActionBarContextView r8 = r6.f7799i
            int r8 = r8.getExpandedHeight()
            miuix.appcompat.internal.app.widget.ActionBarContextView r9 = r6.f7799i
            int r9 = r9.getCollapsedHeight()
            goto L_0x00e4
        L_0x00c7:
            miuix.appcompat.internal.app.widget.ActionBarView r8 = r6.f7796f
            if (r8 == 0) goto L_0x00e6
            int r8 = r8.getMeasuredHeight()
            miuix.appcompat.internal.app.widget.ActionBarView r9 = r6.f7796f
            int r9 = r9.getCollapsedHeight()
            int r8 = r8 - r9
            r6.f7789O = r8
            miuix.appcompat.internal.app.widget.ActionBarView r8 = r6.f7796f
            int r8 = r8.getExpandedHeight()
            miuix.appcompat.internal.app.widget.ActionBarView r9 = r6.f7796f
            int r9 = r9.getCollapsedHeight()
        L_0x00e4:
            int r8 = r8 - r9
            goto L_0x00e7
        L_0x00e6:
            r8 = r0
        L_0x00e7:
            int r9 = r6.f7789O
            int r9 = java.lang.Math.max(r0, r9)
            r6.f7789O = r9
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r8 != 0) goto L_0x00f5
            r9 = r10
            goto L_0x00fb
        L_0x00f5:
            int r9 = r8 - r9
            float r9 = (float) r9
            float r9 = r9 * r10
            float r11 = (float) r8
            float r9 = r9 / r11
        L_0x00fb:
            r6.f7788N = r8
            float r8 = java.lang.Math.min(r10, r9)
            float r9 = r6.f7786L
            float r9 = r9 - r8
            r10 = 0
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r1 = r0
        L_0x010b:
            r6.f7787M = r1
            boolean r10 = r6.f7783I
            if (r10 == 0) goto L_0x011f
            miuix.appcompat.internal.app.widget.f r10 = r6.f7790P
            if (r10 == 0) goto L_0x011f
            int r11 = r6.f7789O
            int r2 = r6.f7784J
            int r11 = r11 + r2
            int r2 = r6.f7788N
            r10.mo8141a(r1, r8, r11, r2)
        L_0x011f:
            miuix.appcompat.internal.app.widget.ActionBarView r10 = r6.f7796f
            if (r10 == 0) goto L_0x0127
            boolean r0 = r10.mo7902L1()
        L_0x0127:
            java.util.List<miuix.appcompat.app.e> r10 = r6.f7791Q
            java.util.Iterator r10 = r10.iterator()
        L_0x012d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x014d
            java.lang.Object r11 = r10.next()
            miuix.appcompat.app.e r11 = (miuix.appcompat.app.C2080e) r11
            r11.mo7430b(r9, r8)
            int r1 = r6.f7787M
            int r2 = r6.f7789O
            r11.mo7431c(r1, r8, r2)
            if (r0 == 0) goto L_0x012d
            miuix.appcompat.internal.app.widget.ActionBarView r1 = r6.f7796f
            int r1 = r1.f8257z
            r11.mo7432d(r1)
            goto L_0x012d
        L_0x014d:
            r6.f7786L = r8
            if (r7 == 0) goto L_0x0154
            r6.invalidate()
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Rect rect;
        if (this.f7807q) {
            m8690u(i, i2);
            return;
        }
        View view = this.f7795e;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), this.f7780F, this.f7795e.getPaddingRight(), this.f7795e.getPaddingBottom());
        }
        m8687l(this.f7796f);
        m8687l(this.f7799i);
        super.onMeasure(i, i2);
        ActionBarView actionBarView = this.f7796f;
        boolean z = true;
        boolean z2 = (actionBarView == null || actionBarView.getVisibility() == 8 || this.f7796f.getMeasuredHeight() <= 0) ? false : true;
        if (z2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7796f.getLayoutParams();
            i3 = this.f7796f.mo7904S0() ? layoutParams.topMargin : layoutParams.bottomMargin + this.f7796f.getMeasuredHeight() + layoutParams.topMargin;
        } else {
            i3 = 0;
        }
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f7799i.getMeasuredHeight() <= 0) {
            z = false;
        }
        if (z) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f7799i.getLayoutParams();
            i4 = this.f7799i.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
        } else {
            i4 = 0;
        }
        if (i3 > 0 || i4 > 0) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(i3, i4));
        }
        View view2 = this.f7795e;
        if (!(view2 == null || view2.getVisibility() == 8 || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE)) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + this.f7795e.getMeasuredHeight(), View.MeasureSpec.getSize(i2)) + ((z2 || (rect = this.f7779E) == null) ? 0 : rect.top));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && childAt.getMeasuredHeight() > 0 && childAt.getMeasuredWidth() > 0) {
                i5++;
            }
        }
        if (i5 == 0) {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Boolean bool;
        Boolean bool2;
        super.onRestoreInstanceState(parcelable);
        C2139e eVar = (C2139e) parcelable;
        int i = eVar.f7821d;
        if (i == -1) {
            this.f7815y = null;
        } else {
            if (i == 0) {
                bool2 = Boolean.FALSE;
            } else if (i == 1) {
                bool2 = Boolean.TRUE;
            }
            this.f7815y = bool2;
        }
        int i2 = eVar.f7822e;
        if (i2 == -1) {
            this.f7816z = null;
        } else {
            if (i2 == 0) {
                bool = Boolean.FALSE;
            } else if (i2 == 1) {
                bool = Boolean.TRUE;
            }
            this.f7816z = bool;
        }
        if (eVar.f7823f) {
            setSupportBlur(true);
        }
        if (eVar.f7824g && C2697e.m11268e(getContext())) {
            setEnableBlur(true);
        }
        if (eVar.f7825h && mo7672q()) {
            mo7648b(true);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2139e eVar = new C2139e(super.onSaveInstanceState());
        Boolean bool = this.f7815y;
        int i = 1;
        eVar.f7821d = bool == null ? -1 : bool.booleanValue() ? 1 : 0;
        Boolean bool2 = this.f7816z;
        if (bool2 == null) {
            i = -1;
        } else if (!bool2.booleanValue()) {
            i = 0;
        }
        eVar.f7822e = i;
        eVar.f7823f = mo7673r();
        eVar.f7824g = mo7672q();
        eVar.f7825h = mo7671p();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f7807q && super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public boolean mo7671p() {
        return this.f7812v.mo9303c();
    }

    /* renamed from: q */
    public boolean mo7672q() {
        return this.f7812v.mo9304d();
    }

    /* renamed from: r */
    public boolean mo7673r() {
        return this.f7812v.mo9305e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7674s(C2233c cVar) {
        this.f7776B = cVar;
        if (cVar != null && mo7673r()) {
            Boolean bool = this.f7816z;
            cVar.mo7648b(bool != null ? bool.booleanValue() : mo7672q());
        }
    }

    /* access modifiers changed from: package-private */
    public void setActionBarBlur(Boolean bool) {
        if (mo7672q()) {
            if (bool == null) {
                this.f7815y = null;
                mo7648b(this.f7813w);
                return;
            }
            Boolean bool2 = this.f7815y;
            if (bool2 == null || bool2.booleanValue() != bool.booleanValue()) {
                this.f7815y = bool;
                mo7648b(bool.booleanValue());
            }
        }
    }

    public void setActionBarContextView(ActionBarContextView actionBarContextView) {
        this.f7799i = actionBarContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionBarView(this.f7796f);
            this.f7800j = this.f7799i.getExpandState();
            this.f7801k = this.f7799i.mo7750l();
        }
    }

    /* access modifiers changed from: package-private */
    public void setActionBarCoordinateListener(C2189f fVar) {
        this.f7790P = fVar;
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setCoordinatedOffsetYInSearchModeAnimation(int i) {
        this.f7784J = i;
        C2189f fVar = this.f7790P;
        if (fVar != null) {
            fVar.mo8141a(this.f7787M, this.f7786L, this.f7789O + i, this.f7788N);
        }
    }

    public void setEnableBlur(boolean z) {
        this.f7812v.mo9310j(z);
    }

    public void setIsMiuixFloating(boolean z) {
        this.f7782H = z;
        ActionBarView actionBarView = this.f7796f;
        if (actionBarView != null) {
            if (z) {
                this.f7797g = actionBarView.getExpandState();
                this.f7798h = this.f7796f.mo7750l();
                this.f7796f.setExpandState(0);
                this.f7796f.setResizable(false);
            } else {
                actionBarView.setResizable(this.f7798h);
                this.f7796f.setExpandState(this.f7797g);
            }
        }
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView == null) {
            return;
        }
        if (z) {
            this.f7800j = actionBarContextView.getExpandState();
            this.f7801k = this.f7799i.mo7750l();
            this.f7799i.setExpandState(0);
            this.f7799i.setResizable(false);
            return;
        }
        actionBarContextView.setResizable(this.f7801k);
        this.f7799i.setExpandState(this.f7800j);
    }

    public void setMiuixFloatingOnInit(boolean z) {
        this.f7782H = z;
        ActionBarView actionBarView = this.f7796f;
        if (actionBarView != null && z) {
            this.f7798h = actionBarView.mo7750l();
            this.f7796f.setExpandState(0);
            this.f7796f.setResizable(false);
            this.f7797g = this.f7796f.getExpandState();
        }
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView != null && z) {
            this.f7801k = actionBarContextView.mo7750l();
            this.f7799i.setExpandState(0);
            this.f7799i.setResizable(false);
            this.f7800j = this.f7799i.getExpandState();
        }
    }

    public void setOverlayMode(boolean z) {
        this.f7783I = z;
    }

    public void setPendingInsets(Rect rect) {
        if (!this.f7807q) {
            if (this.f7779E == null) {
                this.f7779E = new Rect();
            }
            if (!Objects.equals(this.f7779E, rect)) {
                this.f7779E.set(rect);
                m8687l(this.f7796f);
                m8687l(this.f7799i);
            }
        }
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f7803m;
        Rect rect = null;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            this.f7803m.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7803m);
            rect = bounds;
        }
        this.f7803m = drawable;
        boolean z = true;
        if (drawable != null) {
            drawable.setCallback(this);
            if (rect == null) {
                requestLayout();
            } else {
                this.f7803m.setBounds(rect);
            }
            this.f7781G = true;
        } else {
            this.f7781G = false;
        }
        if (!this.f7807q ? !(this.f7803m == null && this.f7805o == null) : this.f7806p != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setSplitActionBarBlur(Boolean bool) {
        if (this.f7807q) {
            this.f7816z = bool;
            C2233c cVar = this.f7776B;
            if (cVar != null) {
                cVar.mo7648b(bool != null ? bool.booleanValue() : this.f7814x);
            }
            C2233c cVar2 = this.f7775A;
            if (cVar2 != null) {
                cVar2.mo7648b(bool != null ? bool.booleanValue() : this.f7814x);
            }
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f7806p;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7806p);
        }
        this.f7806p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        boolean z = true;
        if (!this.f7807q ? !(this.f7803m == null && this.f7805o == null) : this.f7806p != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f7805o;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7805o);
        }
        this.f7805o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        boolean z = true;
        if (!this.f7807q ? !(this.f7803m == null && this.f7805o == null) : this.f7806p != null) {
            z = false;
        }
        setWillNotDraw(z);
        View view = this.f7795e;
        if (view != null) {
            view.setBackground(this.f7805o);
        }
    }

    public void setSupportBlur(boolean z) {
        this.f7812v.mo9311k(z);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f7795e;
        if (view != null) {
            removeView(view);
        }
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
            this.f7780F = scrollingTabContainerView.getPaddingTop();
        } else {
            View view2 = this.f7795e;
            if (view2 != null) {
                view2.setBackground((Drawable) null);
            }
        }
        this.f7795e = scrollingTabContainerView;
    }

    public void setTransitioning(boolean z) {
        this.f7794d = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f7803m;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f7805o;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f7806p;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7694t(C2233c cVar) {
        if (this.f7776B == cVar) {
            this.f7776B = null;
        }
    }

    /* renamed from: v */
    public void mo7695v(View view, int i, int i2, int[] iArr, int i3, int[] iArr2) {
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView == null || actionBarContextView.getVisibility() != 0) {
            this.f7796f.mo7930n1(view, i, i2, iArr, i3, iArr2);
        } else {
            this.f7799i.mo7727f0(view, i, i2, iArr, i3, iArr2);
        }
        if (this.f7783I && i2 > 0 && i2 - iArr[1] > 0) {
            setActionBarBlurByNestedScrolled(true);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f7803m && !this.f7807q) || (drawable == this.f7805o && this.f7809s) || ((drawable == this.f7806p && this.f7807q) || super.verifyDrawable(drawable));
    }

    /* renamed from: w */
    public void mo7697w(View view, int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        int i6 = iArr[1];
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView == null || actionBarContextView.getVisibility() != 0) {
            this.f7796f.mo7932o1(view, i, i2, i3, i4, i5, iArr, iArr2);
        } else {
            this.f7799i.mo7729g0(view, i, i2, i3, i4, i5, iArr, iArr2);
        }
        int i7 = iArr[1] - i6;
        if (this.f7783I && i4 < 0 && i7 <= 0) {
            setActionBarBlurByNestedScrolled(false);
        }
    }

    /* renamed from: x */
    public void mo7698x(View view, View view2, int i, int i2) {
        ActionBarContextView actionBarContextView = this.f7799i;
        if (actionBarContextView == null || actionBarContextView.getVisibility() != 0) {
            this.f7796f.mo7939p1(view, view2, i, i2);
        } else {
            this.f7799i.mo7745h0(view, view2, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo7699y(C2233c cVar) {
        this.f7775A = cVar;
        if (cVar != null && mo7673r()) {
            cVar.setSupportBlur(mo7673r());
            cVar.setEnableBlur(mo7672q());
            Boolean bool = this.f7816z;
            cVar.mo7648b(bool != null ? bool.booleanValue() : mo7672q());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo7700z(C2233c cVar) {
        if (this.f7775A == cVar) {
            this.f7775A = null;
        }
    }
}
