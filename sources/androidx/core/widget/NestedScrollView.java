package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0624a;
import androidx.core.view.C0627a0;
import androidx.core.view.C0660b0;
import androidx.core.view.C0678d0;
import androidx.core.view.C0682e0;
import androidx.core.view.C0719j0;
import androidx.core.view.C0727l0;
import androidx.core.view.accessibility.C0637g;
import androidx.core.view.accessibility.C0645i;
import java.util.ArrayList;
import p104r.C2587a;

public class NestedScrollView extends FrameLayout implements C0678d0, C0627a0, C0719j0 {

    /* renamed from: E */
    private static final float f2826E = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: F */
    private static final C0801a f2827F = new C0801a();

    /* renamed from: G */
    private static final int[] f2828G = {16843130};

    /* renamed from: A */
    private final C0682e0 f2829A;

    /* renamed from: B */
    private final C0660b0 f2830B;

    /* renamed from: C */
    private float f2831C;

    /* renamed from: D */
    private C0803c f2832D;

    /* renamed from: d */
    private final float f2833d;

    /* renamed from: e */
    private long f2834e;

    /* renamed from: f */
    private final Rect f2835f;

    /* renamed from: g */
    private OverScroller f2836g;

    /* renamed from: h */
    public EdgeEffect f2837h;

    /* renamed from: i */
    public EdgeEffect f2838i;

    /* renamed from: j */
    private int f2839j;

    /* renamed from: k */
    private boolean f2840k;

    /* renamed from: l */
    private boolean f2841l;

    /* renamed from: m */
    private View f2842m;

    /* renamed from: n */
    private boolean f2843n;

    /* renamed from: o */
    private VelocityTracker f2844o;

    /* renamed from: p */
    private boolean f2845p;

    /* renamed from: q */
    private boolean f2846q;

    /* renamed from: r */
    private int f2847r;

    /* renamed from: s */
    private int f2848s;

    /* renamed from: t */
    private int f2849t;

    /* renamed from: u */
    private int f2850u;

    /* renamed from: v */
    private final int[] f2851v;

    /* renamed from: w */
    private final int[] f2852w;

    /* renamed from: x */
    private int f2853x;

    /* renamed from: y */
    private int f2854y;

    /* renamed from: z */
    private C0804d f2855z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0801a extends C0624a {
        C0801a() {
        }

        /* renamed from: f */
        public void mo2713f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2713f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0645i.m2598a(accessibilityEvent, nestedScrollView.getScrollX());
            C0645i.m2599b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo2714g(View view, C0637g gVar) {
            int scrollRange;
            super.mo2714g(view, gVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            gVar.mo2745T(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                gVar.mo2765h0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    gVar.mo2754b(C0637g.C0638a.f2709r);
                    gVar.mo2754b(C0637g.C0638a.f2677C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    gVar.mo2754b(C0637g.C0638a.f2708q);
                    gVar.mo2754b(C0637g.C0638a.f2679E);
                }
            }
        }

        /* renamed from: j */
        public boolean mo2717j(View view, int i, Bundle bundle) {
            if (super.mo2717j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2963T(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2963T(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    static class C0802b {
        /* renamed from: a */
        static boolean m3216a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C0803c {
        /* renamed from: a */
        void mo3032a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    static class C0804d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0804d> CREATOR = new C0805a();

        /* renamed from: d */
        public int f2856d;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        class C0805a implements Parcelable.Creator<C0804d> {
            C0805a() {
            }

            /* renamed from: a */
            public C0804d createFromParcel(Parcel parcel) {
                return new C0804d(parcel);
            }

            /* renamed from: b */
            public C0804d[] newArray(int i) {
                return new C0804d[i];
            }
        }

        C0804d(Parcel parcel) {
            super(parcel);
            this.f2856d = parcel.readInt();
        }

        C0804d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2856d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2856d);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2587a.f10131c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2835f = new Rect();
        this.f2840k = true;
        this.f2841l = false;
        this.f2842m = null;
        this.f2843n = false;
        this.f2846q = true;
        this.f2850u = -1;
        this.f2851v = new int[2];
        this.f2852w = new int[2];
        this.f2837h = C0815d.m3269a(context, attributeSet);
        this.f2838i = C0815d.m3269a(context, attributeSet);
        this.f2833d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m3164A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2828G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2829A = new C0682e0(this);
        this.f2830B = new C0660b0(this);
        setNestedScrollingEnabled(true);
        C0727l0.m2875Y(this, f2827F);
    }

    /* renamed from: A */
    private void m3164A() {
        this.f2836g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2847r = viewConfiguration.getScaledTouchSlop();
        this.f2848s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2849t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: B */
    private void m3165B() {
        if (this.f2844o == null) {
            this.f2844o = VelocityTracker.obtain();
        }
    }

    /* renamed from: C */
    private boolean m3166C(View view) {
        return !m3168E(view, 0, getHeight());
    }

    /* renamed from: D */
    private static boolean m3167D(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m3167D((View) parent, view2);
    }

    /* renamed from: E */
    private boolean m3168E(View view, int i, int i2) {
        view.getDrawingRect(this.f2835f);
        offsetDescendantRectToMyCoords(view, this.f2835f);
        return this.f2835f.bottom + i >= getScrollY() && this.f2835f.top - i <= getScrollY() + i2;
    }

    /* renamed from: F */
    private void m3169F(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2830B.mo2808e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: G */
    private void m3170G(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2850u) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2839j = (int) motionEvent.getY(i);
            this.f2850u = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2844o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: J */
    private void m3171J() {
        VelocityTracker velocityTracker = this.f2844o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2844o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3172K(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2837h
            float r0 = androidx.core.widget.C0815d.m3270b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f2837h
            float r4 = -r4
            float r4 = androidx.core.widget.C0815d.m3272d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2837h
            float r5 = androidx.core.widget.C0815d.m3270b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2837h
        L_0x002c:
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0051
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f2838i
            float r0 = androidx.core.widget.C0815d.m3270b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            android.widget.EdgeEffect r0 = r3.f2838i
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C0815d.m3272d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2838i
            float r5 = androidx.core.widget.C0815d.m3270b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2838i
            goto L_0x002c
        L_0x0051:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0060
            r3.invalidate()
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m3172K(int, float):int");
    }

    /* renamed from: L */
    private void m3173L(boolean z) {
        if (z) {
            mo2964U(2, 1);
        } else {
            mo2965W(1);
        }
        this.f2854y = getScrollY();
        C0727l0.m2869S(this);
    }

    /* renamed from: M */
    private boolean m3174M(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View t = m3187t(z2, i2, i3);
        if (t == null) {
            t = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3184p(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (t != findFocus()) {
            t.requestFocus(i);
        }
        return z;
    }

    /* renamed from: N */
    private void m3175N(View view) {
        view.getDrawingRect(this.f2835f);
        offsetDescendantRectToMyCoords(view, this.f2835f);
        int g = mo2984g(this.f2835f);
        if (g != 0) {
            scrollBy(0, g);
        }
    }

    /* renamed from: O */
    private boolean m3176O(Rect rect, boolean z) {
        int g = mo2984g(rect);
        boolean z2 = g != 0;
        if (z2) {
            if (z) {
                scrollBy(0, g);
            } else {
                mo2961Q(0, g);
            }
        }
        return z2;
    }

    /* renamed from: P */
    private boolean m3177P(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return m3188w(-i) < C0815d.m3270b(edgeEffect) * ((float) getHeight());
    }

    /* renamed from: R */
    private void m3178R(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2834e > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2836g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m3173L(z);
            } else {
                if (!this.f2836g.isFinished()) {
                    m3180a();
                }
                scrollBy(i, i2);
            }
            this.f2834e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: V */
    private boolean m3179V(MotionEvent motionEvent) {
        boolean z;
        if (C0815d.m3270b(this.f2837h) != 0.0f) {
            C0815d.m3272d(this.f2837h, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (C0815d.m3270b(this.f2838i) == 0.0f) {
            return z;
        }
        C0815d.m3272d(this.f2838i, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: a */
    private void m3180a() {
        this.f2836g.abortAnimation();
        mo2965W(1);
    }

    /* renamed from: d */
    private boolean m3181d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m3182e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: f */
    private static int m3183f(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2831C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2831C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2831C;
    }

    /* renamed from: p */
    private void m3184p(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2846q) {
            mo2961Q(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: q */
    private boolean m3185q(int i) {
        EdgeEffect edgeEffect;
        if (C0815d.m3270b(this.f2837h) != 0.0f) {
            if (m3177P(this.f2837h, i)) {
                edgeEffect = this.f2837h;
            } else {
                i = -i;
                mo3029u(i);
                return true;
            }
        } else if (C0815d.m3270b(this.f2838i) == 0.0f) {
            return false;
        } else {
            i = -i;
            if (m3177P(this.f2838i, i)) {
                edgeEffect = this.f2838i;
            }
            mo3029u(i);
            return true;
        }
        edgeEffect.onAbsorb(i);
        return true;
    }

    /* renamed from: r */
    private void m3186r() {
        this.f2843n = false;
        m3171J();
        mo2965W(0);
        this.f2837h.onRelease();
        this.f2838i.onRelease();
    }

    /* renamed from: t */
    private View m3187t(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: w */
    private float m3188w(int i) {
        double log = Math.log((double) ((((float) Math.abs(i)) * 0.35f) / (this.f2833d * 0.015f)));
        float f = f2826E;
        return (float) (((double) (this.f2833d * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * log));
    }

    /* renamed from: y */
    private boolean m3189y(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: z */
    private void m3190z() {
        VelocityTracker velocityTracker = this.f2844o;
        if (velocityTracker == null) {
            this.f2844o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo2959H(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !mo3031x(1)) {
            this.f2836g.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    /* renamed from: I */
    public boolean mo2960I(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2835f.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2835f;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2835f.top = getScrollY() - height;
            Rect rect2 = this.f2835f;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2835f;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m3174M(i, i2, i3);
    }

    /* renamed from: Q */
    public final void mo2961Q(int i, int i2) {
        m3178R(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo2962S(int i, int i2, int i3, boolean z) {
        m3178R(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo2963T(int i, int i2, boolean z) {
        mo2962S(i, i2, 250, z);
    }

    /* renamed from: U */
    public boolean mo2964U(int i, int i2) {
        return this.f2830B.mo2815p(i, i2);
    }

    /* renamed from: W */
    public void mo2965W(int i) {
        this.f2830B.mo2817r(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo2970b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3168E(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3184p(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2835f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2835f);
            m3184p(mo2984g(this.f2835f));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m3166C(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: c */
    public void mo1174c(View view, View view2, int i, int i2) {
        this.f2829A.mo2859c(view, view2, i, i2);
        mo2964U(2, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f2836g.isFinished()) {
            this.f2836g.computeScrollOffset();
            int currY = this.f2836g.getCurrY();
            int h = mo2990h(currY - this.f2854y);
            this.f2854y = currY;
            int[] iArr = this.f2852w;
            boolean z = false;
            iArr[1] = 0;
            mo2993k(0, h, iArr, (int[]) null, 1);
            int i = h - this.f2852w[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                mo2959H(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i2 = i - scrollY2;
                int[] iArr2 = this.f2852w;
                iArr2[1] = 0;
                mo2994l(0, scrollY2, 0, i2, this.f2851v, 1, iArr2);
                i = i2 - this.f2852w[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i < 0) {
                        if (this.f2837h.isFinished()) {
                            edgeEffect = this.f2837h;
                        }
                    } else if (this.f2838i.isFinished()) {
                        edgeEffect = this.f2838i;
                    }
                    edgeEffect.onAbsorb((int) this.f2836g.getCurrVelocity());
                }
                m3180a();
            }
            if (!this.f2836g.isFinished()) {
                C0727l0.m2869S(this);
            } else {
                mo2965W(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3020s(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2830B.mo2804a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2830B.mo2805b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2993k(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2830B.mo2809f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f2837h.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C0802b.m3216a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C0802b.m3216a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f2837h.setSize(width, height);
            if (this.f2837h.draw(canvas)) {
                C0727l0.m2869S(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2838i.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C0802b.m3216a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C0802b.m3216a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f2838i.setSize(width2, height2);
            if (this.f2838i.draw(canvas)) {
                C0727l0.m2869S(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo2984g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2829A.mo2857a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo2990h(int i) {
        int height = getHeight();
        if (i > 0 && C0815d.m3270b(this.f2837h) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * C0815d.m3272d(this.f2837h, (((float) (-i)) * 4.0f) / ((float) height), 0.5f));
            if (round != i) {
                this.f2837h.finish();
            }
            return i - round;
        } else if (i >= 0 || C0815d.m3270b(this.f2838i) == 0.0f) {
            return i;
        } else {
            float f = (float) height;
            int round2 = Math.round((f / 4.0f) * C0815d.m3272d(this.f2838i, (((float) i) * 4.0f) / f, 0.5f));
            if (round2 != i) {
                this.f2838i.finish();
            }
            return i - round2;
        }
    }

    public boolean hasNestedScrollingParent() {
        return mo3031x(0);
    }

    /* renamed from: i */
    public void mo1189i(View view, int i) {
        this.f2829A.mo2860d(view, i);
        mo2965W(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2830B.mo2812l();
    }

    /* renamed from: j */
    public void mo1190j(View view, int i, int i2, int[] iArr, int i3) {
        mo2993k(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: k */
    public boolean mo2993k(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2830B.mo2807d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: l */
    public void mo2994l(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2830B.mo2808e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: m */
    public void mo1193m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3169F(i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo1194n(View view, int i, int i2, int i3, int i4, int i5) {
        m3169F(i4, i5, (int[]) null);
    }

    /* renamed from: o */
    public boolean mo1195o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2841l = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a6
            boolean r0 = r8.f2843n
            if (r0 != 0) goto L_0x00a6
            r0 = 2
            boolean r0 = androidx.core.view.C0797z.m3148a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
        L_0x0017:
            float r0 = r9.getAxisValue(r0)
            goto L_0x0028
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.C0797z.m3148a(r9, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 26
            goto L_0x0017
        L_0x0027:
            r0 = r2
        L_0x0028:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a6
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x006d
            boolean r2 = r8.m3181d()
            if (r2 == 0) goto L_0x0051
            boolean r9 = androidx.core.view.C0797z.m3148a(r9, r5)
            if (r9 != 0) goto L_0x0051
            r9 = r6
            goto L_0x0052
        L_0x0051:
            r9 = r1
        L_0x0052:
            if (r9 == 0) goto L_0x006b
            android.widget.EdgeEffect r9 = r8.f2837h
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.C0815d.m3272d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2837h
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L_0x009b
        L_0x006b:
            r9 = r1
            goto L_0x009b
        L_0x006d:
            if (r0 <= r2) goto L_0x0099
            boolean r7 = r8.m3181d()
            if (r7 == 0) goto L_0x007d
            boolean r9 = androidx.core.view.C0797z.m3148a(r9, r5)
            if (r9 != 0) goto L_0x007d
            r9 = r6
            goto L_0x007e
        L_0x007d:
            r9 = r1
        L_0x007e:
            if (r9 == 0) goto L_0x0096
            android.widget.EdgeEffect r9 = r8.f2838i
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.C0815d.m3272d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2838i
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        L_0x0096:
            r9 = r1
            r1 = r2
            goto L_0x009b
        L_0x0099:
            r9 = r1
            r1 = r0
        L_0x009b:
            if (r1 == r3) goto L_0x00a5
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a5:
            return r9
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f2843n) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2850u;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2839j) > this.f2847r && (2 & getNestedScrollAxes()) == 0) {
                                this.f2843n = true;
                                this.f2839j = y;
                                m3165B();
                                this.f2844o.addMovement(motionEvent);
                                this.f2853x = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m3170G(motionEvent);
                    }
                }
            }
            this.f2843n = false;
            this.f2850u = -1;
            m3171J();
            if (this.f2836g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0727l0.m2869S(this);
            }
            mo2965W(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m3189y((int) motionEvent.getX(), y2)) {
                if (!m3179V(motionEvent) && this.f2836g.isFinished()) {
                    z = false;
                }
                this.f2843n = z;
                m3171J();
            } else {
                this.f2839j = y2;
                this.f2850u = motionEvent.getPointerId(0);
                m3190z();
                this.f2844o.addMovement(motionEvent);
                this.f2836g.computeScrollOffset();
                if (!m3179V(motionEvent) && this.f2836g.isFinished()) {
                    z = false;
                }
                this.f2843n = z;
                mo2964U(2, 0);
            }
        }
        return this.f2843n;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2840k = false;
        View view = this.f2842m;
        if (view != null && m3167D(view, this)) {
            m3175N(this.f2842m);
        }
        this.f2842m = null;
        if (!this.f2841l) {
            if (this.f2855z != null) {
                scrollTo(getScrollX(), this.f2855z.f2856d);
                this.f2855z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f = m3183f(scrollY, paddingTop, i5);
            if (f != scrollY) {
                scrollTo(getScrollX(), f);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2841l = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2845p && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3029u((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1190j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3169F(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1174c(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m3166C(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0804d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0804d dVar = (C0804d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2855z = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0804d dVar = new C0804d(super.onSaveInstanceState());
        dVar.f2856d = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0803c cVar = this.f2832D;
        if (cVar != null) {
            cVar.mo3032a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m3168E(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2835f);
            offsetDescendantRectToMyCoords(findFocus, this.f2835f);
            m3184p(mo2984g(this.f2835f));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1195o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1189i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f2836g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0220, code lost:
        if (r10.f2836g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m3165B()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f2853x = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f2853x
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0224
            r3 = -1
            if (r0 == r14) goto L_0x01d9
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0253
        L_0x002f:
            r23.m3170G(r24)
            int r0 = r10.f2850u
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f2839j = r0
            goto L_0x0253
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f2839j = r1
            int r0 = r11.getPointerId(r0)
            r10.f2850u = r0
            goto L_0x0253
        L_0x0054:
            boolean r0 = r10.f2843n
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f2836g
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            androidx.core.view.C0727l0.m2869S(r23)
        L_0x007b:
            r10.f2850u = r3
            r23.m3186r()
            goto L_0x0253
        L_0x0082:
            int r0 = r10.f2850u
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f2850u
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0253
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f2839j
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.m3172K(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f2843n
            if (r1 != 0) goto L_0x00d8
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f2847r
            if (r1 <= r2) goto L_0x00d8
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00cf
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00cf:
            r10.f2843n = r14
            int r1 = r10.f2847r
            if (r0 <= 0) goto L_0x00d7
            int r0 = r0 - r1
            goto L_0x00d8
        L_0x00d7:
            int r0 = r0 + r1
        L_0x00d8:
            r7 = r0
            boolean r0 = r10.f2843n
            if (r0 == 0) goto L_0x0253
            r1 = 0
            int[] r3 = r10.f2852w
            int[] r4 = r10.f2851v
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo2993k(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00fa
            int[] r0 = r10.f2852w
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f2853x
            int[] r1 = r10.f2851v
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2853x = r0
        L_0x00fa:
            r16 = r7
            int[] r0 = r10.f2851v
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f2839j = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0119
            if (r0 != r14) goto L_0x0116
            if (r9 <= 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r18 = r12
            goto L_0x011b
        L_0x0119:
            r18 = r14
        L_0x011b:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo2959H(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r10.mo3031x(r12)
            if (r0 != 0) goto L_0x013d
            r8 = r14
            goto L_0x013e
        L_0x013d:
            r8 = r12
        L_0x013e:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f2852w
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2851v
            r6 = 0
            r0 = r23
            r0.mo2994l(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f2839j
            int[] r1 = r10.f2851v
            r1 = r1[r14]
            int r0 = r0 - r1
            r10.f2839j = r0
            int r0 = r10.f2853x
            int r0 = r0 + r1
            r10.f2853x = r0
            if (r18 == 0) goto L_0x01cf
            int[] r0 = r10.f2852w
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0193
            android.widget.EdgeEffect r1 = r10.f2837h
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0815d.m3272d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2838i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bb
            android.widget.EdgeEffect r0 = r10.f2838i
        L_0x018f:
            r0.onRelease()
            goto L_0x01bb
        L_0x0193:
            r2 = r22
            if (r1 <= r2) goto L_0x01bb
            android.widget.EdgeEffect r1 = r10.f2838i
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C0815d.m3272d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2837h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bb
            android.widget.EdgeEffect r0 = r10.f2837h
            goto L_0x018f
        L_0x01bb:
            android.widget.EdgeEffect r0 = r10.f2837h
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01cb
            android.widget.EdgeEffect r0 = r10.f2838i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01cf
        L_0x01cb:
            androidx.core.view.C0727l0.m2869S(r23)
            goto L_0x01d0
        L_0x01cf:
            r12 = r8
        L_0x01d0:
            if (r12 == 0) goto L_0x0253
            android.view.VelocityTracker r0 = r10.f2844o
            r0.clear()
            goto L_0x0253
        L_0x01d9:
            android.view.VelocityTracker r0 = r10.f2844o
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f2849t
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f2850u
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f2848s
            if (r1 < r4) goto L_0x0208
            boolean r1 = r10.m3185q(r0)
            if (r1 != 0) goto L_0x007b
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo3029u(r0)
            goto L_0x007b
        L_0x0208:
            android.widget.OverScroller r15 = r10.f2836g
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0224:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x022b
            return r12
        L_0x022b:
            boolean r0 = r10.f2843n
            if (r0 == 0) goto L_0x0238
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0238
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0238:
            android.widget.OverScroller r0 = r10.f2836g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0243
            r23.m3180a()
        L_0x0243:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f2839j = r0
            int r0 = r11.getPointerId(r12)
            r10.f2850u = r0
            r10.mo2964U(r1, r12)
        L_0x0253:
            android.view.VelocityTracker r0 = r10.f2844o
            if (r0 == 0) goto L_0x025a
            r0.addMovement(r13)
        L_0x025a:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2840k) {
            m3175N(view2);
        } else {
            this.f2842m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3176O(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3171J();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2840k = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public boolean mo3020s(KeyEvent keyEvent) {
        this.f2835f.setEmpty();
        int i = 130;
        if (!m3182e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo2970b(33) : mo3030v(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo2970b(130) : mo3030v(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo2960I(i);
            return false;
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int f = m3183f(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int f2 = m3183f(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (f != getScrollX() || f2 != getScrollY()) {
                super.scrollTo(f, f2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2845p) {
            this.f2845p = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2830B.mo2813m(z);
    }

    public void setOnScrollChangeListener(C0803c cVar) {
        this.f2832D = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2846q = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2964U(i, 0);
    }

    public void stopNestedScroll() {
        mo2965W(0);
    }

    /* renamed from: u */
    public void mo3029u(int i) {
        if (getChildCount() > 0) {
            this.f2836g.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3173L(true);
        }
    }

    /* renamed from: v */
    public boolean mo3030v(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2835f;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2835f.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2835f;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2835f;
        return m3174M(i, rect3.top, rect3.bottom);
    }

    /* renamed from: x */
    public boolean mo3031x(int i) {
        return this.f2830B.mo2811k(i);
    }
}
