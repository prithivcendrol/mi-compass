package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0230m;
import androidx.core.graphics.C0543b;
import androidx.core.view.C0673c0;
import androidx.core.view.C0678d0;
import androidx.core.view.C0682e0;
import androidx.core.view.C0689f2;
import androidx.core.view.C0727l0;
import p021d.C1447a;
import p021d.C1452f;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0329h0, C0673c0, C0678d0 {

    /* renamed from: I */
    static final int[] f891I = {C1447a.f5676b, 16842841};

    /* renamed from: A */
    private C0689f2 f892A;

    /* renamed from: B */
    private C0246d f893B;

    /* renamed from: C */
    private OverScroller f894C;

    /* renamed from: D */
    ViewPropertyAnimator f895D;

    /* renamed from: E */
    final AnimatorListenerAdapter f896E;

    /* renamed from: F */
    private final Runnable f897F;

    /* renamed from: G */
    private final Runnable f898G;

    /* renamed from: H */
    private final C0682e0 f899H;

    /* renamed from: d */
    private int f900d;

    /* renamed from: e */
    private int f901e = 0;

    /* renamed from: f */
    private ContentFrameLayout f902f;

    /* renamed from: g */
    ActionBarContainer f903g;

    /* renamed from: h */
    private C0333i0 f904h;

    /* renamed from: i */
    private Drawable f905i;

    /* renamed from: j */
    private boolean f906j;

    /* renamed from: k */
    private boolean f907k;

    /* renamed from: l */
    private boolean f908l;

    /* renamed from: m */
    private boolean f909m;

    /* renamed from: n */
    boolean f910n;

    /* renamed from: o */
    private int f911o;

    /* renamed from: p */
    private int f912p;

    /* renamed from: q */
    private final Rect f913q = new Rect();

    /* renamed from: r */
    private final Rect f914r = new Rect();

    /* renamed from: s */
    private final Rect f915s = new Rect();

    /* renamed from: t */
    private final Rect f916t = new Rect();

    /* renamed from: u */
    private final Rect f917u = new Rect();

    /* renamed from: v */
    private final Rect f918v = new Rect();

    /* renamed from: w */
    private final Rect f919w = new Rect();

    /* renamed from: x */
    private C0689f2 f920x;

    /* renamed from: y */
    private C0689f2 f921y;

    /* renamed from: z */
    private C0689f2 f922z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0243a extends AnimatorListenerAdapter {
        C0243a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f895D = null;
            actionBarOverlayLayout.f910n = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f895D = null;
            actionBarOverlayLayout.f910n = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0244b implements Runnable {
        C0244b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1225u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f895D = actionBarOverlayLayout.f903g.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f896E);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0245c implements Runnable {
        C0245c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1225u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f895D = actionBarOverlayLayout.f903g.animate().translationY((float) (-ActionBarOverlayLayout.this.f903g.getHeight())).setListener(ActionBarOverlayLayout.this.f896E);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0246d {
        /* renamed from: a */
        void mo606a();

        /* renamed from: b */
        void mo607b();

        /* renamed from: c */
        void mo608c(int i);

        /* renamed from: d */
        void mo609d();

        /* renamed from: e */
        void mo610e(boolean z);

        /* renamed from: f */
        void mo611f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0247e extends ViewGroup.MarginLayoutParams {
        public C0247e(int i, int i2) {
            super(i, i2);
        }

        public C0247e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0247e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0689f2 f2Var = C0689f2.f2763b;
        this.f920x = f2Var;
        this.f921y = f2Var;
        this.f922z = f2Var;
        this.f892A = f2Var;
        this.f896E = new C0243a();
        this.f897F = new C0244b();
        this.f898G = new C0245c();
        m1061v(context);
        this.f899H = new C0682e0(this);
    }

    /* renamed from: A */
    private void m1056A() {
        mo1225u();
        this.f897F.run();
    }

    /* renamed from: B */
    private boolean m1057B(float f) {
        this.f894C.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f894C.getFinalY() > this.f903g.getHeight();
    }

    /* renamed from: p */
    private void m1058p() {
        mo1225u();
        this.f898G.run();
    }

    /* renamed from: q */
    private boolean m1059q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0247e eVar = (C0247e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private C0333i0 m1060t(View view) {
        if (view instanceof C0333i0) {
            return (C0333i0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m1061v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f891I);
        boolean z = false;
        this.f900d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f905i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f906j = z;
        this.f894C = new OverScroller(context);
    }

    /* renamed from: x */
    private void m1062x() {
        mo1225u();
        postDelayed(this.f898G, 600);
    }

    /* renamed from: y */
    private void m1063y() {
        mo1225u();
        postDelayed(this.f897F, 600);
    }

    /* renamed from: a */
    public void mo1172a(Menu menu, C0230m.C0231a aVar) {
        mo1227z();
        this.f904h.mo1921a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo1173b() {
        mo1227z();
        return this.f904h.mo1922b();
    }

    /* renamed from: c */
    public void mo1174c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0247e;
    }

    /* renamed from: d */
    public void mo1176d() {
        mo1227z();
        this.f904h.mo1925d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f905i != null && !this.f906j) {
            int bottom = this.f903g.getVisibility() == 0 ? (int) (((float) this.f903g.getBottom()) + this.f903g.getTranslationY() + 0.5f) : 0;
            this.f905i.setBounds(0, bottom, getWidth(), this.f905i.getIntrinsicHeight() + bottom);
            this.f905i.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1178e() {
        mo1227z();
        return this.f904h.mo1926e();
    }

    /* renamed from: f */
    public boolean mo1179f() {
        mo1227z();
        return this.f904h.mo1927f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public boolean mo1181g() {
        mo1227z();
        return this.f904h.mo1928g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0247e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f903g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f899H.mo2857a();
    }

    public CharSequence getTitle() {
        mo1227z();
        return this.f904h.getTitle();
    }

    /* renamed from: h */
    public boolean mo1188h() {
        mo1227z();
        return this.f904h.mo1930h();
    }

    /* renamed from: i */
    public void mo1189i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public void mo1190j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: k */
    public void mo1191k(int i) {
        mo1227z();
        if (i == 2) {
            this.f904h.mo1941s();
        } else if (i == 5) {
            this.f904h.mo1946t();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo1192l() {
        mo1227z();
        this.f904h.mo1931i();
    }

    /* renamed from: m */
    public void mo1193m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1194n(view, i, i2, i3, i4, i5);
    }

    /* renamed from: n */
    public void mo1194n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public boolean mo1195o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1227z();
        C0689f2 v = C0689f2.m2722v(windowInsets, this);
        boolean q = m1059q(this.f903g, new Rect(v.mo2871i(), v.mo2873k(), v.mo2872j(), v.mo2869h()), true, true, false, true);
        C0727l0.m2883d(this, v, this.f913q);
        Rect rect = this.f913q;
        C0689f2 l = v.mo2874l(rect.left, rect.top, rect.right, rect.bottom);
        this.f920x = l;
        boolean z = true;
        if (!this.f921y.equals(l)) {
            this.f921y = this.f920x;
            q = true;
        }
        if (!this.f914r.equals(this.f913q)) {
            this.f914r.set(this.f913q);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return v.mo2861a().mo2863c().mo2862b().mo2881t();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1061v(getContext());
        C0727l0.m2872V(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1225u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0247e eVar = (C0247e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        C0689f2 f2Var;
        mo1227z();
        measureChildWithMargins(this.f903g, i, 0, i2, 0);
        C0247e eVar = (C0247e) this.f903g.getLayoutParams();
        int max = Math.max(0, this.f903g.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f903g.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f903g.getMeasuredState());
        boolean z = (C0727l0.m2854D(this) & 256) != 0;
        if (z) {
            i3 = this.f900d;
            if (this.f908l && this.f903g.getTabContainer() != null) {
                i3 += this.f900d;
            }
        } else {
            i3 = this.f903g.getVisibility() != 8 ? this.f903g.getMeasuredHeight() : 0;
        }
        this.f915s.set(this.f913q);
        C0689f2 f2Var2 = this.f920x;
        this.f922z = f2Var2;
        if (this.f907k || z) {
            f2Var = new C0689f2.C0691b(this.f922z).mo2884c(C0543b.m2252b(f2Var2.mo2871i(), this.f922z.mo2873k() + i3, this.f922z.mo2872j(), this.f922z.mo2869h() + 0)).mo2882a();
        } else {
            Rect rect = this.f915s;
            rect.top += i3;
            rect.bottom += 0;
            f2Var = f2Var2.mo2874l(0, i3, 0, 0);
        }
        this.f922z = f2Var;
        m1059q(this.f902f, this.f915s, true, true, true, true);
        if (!this.f892A.equals(this.f922z)) {
            C0689f2 f2Var3 = this.f922z;
            this.f892A = f2Var3;
            C0727l0.m2885e(this.f902f, f2Var3);
        }
        measureChildWithMargins(this.f902f, i, 0, i2, 0);
        C0247e eVar2 = (C0247e) this.f902f.getLayoutParams();
        int max3 = Math.max(max, this.f902f.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f902f.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f902f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f909m || !z) {
            return false;
        }
        if (m1057B(f2)) {
            m1058p();
        } else {
            m1056A();
        }
        this.f910n = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f911o + i2;
        this.f911o = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f899H.mo2858b(view, view2, i);
        this.f911o = getActionBarHideOffset();
        mo1225u();
        C0246d dVar = this.f893B;
        if (dVar != null) {
            dVar.mo607b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f903g.getVisibility() != 0) {
            return false;
        }
        return this.f909m;
    }

    public void onStopNestedScroll(View view) {
        if (this.f909m && !this.f910n) {
            if (this.f911o <= this.f903g.getHeight()) {
                m1063y();
            } else {
                m1062x();
            }
        }
        C0246d dVar = this.f893B;
        if (dVar != null) {
            dVar.mo609d();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo1227z();
        int i2 = this.f912p ^ i;
        this.f912p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0246d dVar = this.f893B;
        if (dVar != null) {
            dVar.mo610e(!z);
            if (z2 || !z) {
                this.f893B.mo606a();
            } else {
                this.f893B.mo611f();
            }
        }
        if ((i2 & 256) != 0 && this.f893B != null) {
            C0727l0.m2872V(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f901e = i;
        C0246d dVar = this.f893B;
        if (dVar != null) {
            dVar.mo608c(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0247e generateDefaultLayoutParams() {
        return new C0247e(-1, -1);
    }

    /* renamed from: s */
    public C0247e generateLayoutParams(AttributeSet attributeSet) {
        return new C0247e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo1225u();
        this.f903g.setTranslationY((float) (-Math.max(0, Math.min(i, this.f903g.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0246d dVar) {
        this.f893B = dVar;
        if (getWindowToken() != null) {
            this.f893B.mo608c(this.f901e);
            int i = this.f912p;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0727l0.m2872V(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f908l = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f909m) {
            this.f909m = z;
            if (!z) {
                mo1225u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1227z();
        this.f904h.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo1227z();
        this.f904h.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo1227z();
        this.f904h.mo1938p(i);
    }

    public void setOverlayMode(boolean z) {
        this.f907k = z;
        this.f906j = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1227z();
        this.f904h.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1227z();
        this.f904h.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1225u() {
        removeCallbacks(this.f897F);
        removeCallbacks(this.f898G);
        ViewPropertyAnimator viewPropertyAnimator = this.f895D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo1226w() {
        return this.f907k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1227z() {
        if (this.f902f == null) {
            this.f902f = (ContentFrameLayout) findViewById(C1452f.f5787b);
            this.f903g = (ActionBarContainer) findViewById(C1452f.f5788c);
            this.f904h = m1060t(findViewById(C1452f.f5786a));
        }
    }
}
