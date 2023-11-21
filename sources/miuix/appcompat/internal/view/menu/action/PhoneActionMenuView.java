package miuix.appcompat.internal.view.menu.action;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import p018c2.C1347c;
import p018c2.C1350f;
import p055i3.C1650d;
import p055i3.C1656j;
import p073l3.C1878b;
import p084n2.C2432a;
import p086n4.C2454f;
import p117t2.C2698f;

public class PhoneActionMenuView extends C2233c {

    /* renamed from: D */
    private static final int[] f8391D = {16842964, C1347c.f4591y, C1347c.f4543K};

    /* renamed from: A */
    private int f8392A = 0;

    /* renamed from: B */
    private final int f8393B;

    /* renamed from: C */
    private int f8394C = 0;

    /* renamed from: i */
    private Context f8395i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f8396j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public View f8397k;

    /* renamed from: l */
    private C2432a f8398l;

    /* renamed from: m */
    private C2220c f8399m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2219b f8400n = C2219b.Collapsed;

    /* renamed from: o */
    private Drawable f8401o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Drawable f8402p;

    /* renamed from: q */
    private int f8403q;

    /* renamed from: r */
    private int f8404r;

    /* renamed from: s */
    private Rect f8405s;

    /* renamed from: t */
    private int f8406t;

    /* renamed from: u */
    private int f8407u = 0;

    /* renamed from: v */
    private int f8408v = 0;

    /* renamed from: w */
    private int f8409w = 0;

    /* renamed from: x */
    private int f8410x = 0;

    /* renamed from: y */
    private int f8411y = 0;

    /* renamed from: z */
    private int f8412z = 0;

    /* renamed from: miuix.appcompat.internal.view.menu.action.PhoneActionMenuView$b */
    private enum C2219b {
        Collapsed,
        Expanding,
        Expanded,
        Collapsing
    }

    /* renamed from: miuix.appcompat.internal.view.menu.action.PhoneActionMenuView$c */
    private class C2220c implements Animator.AnimatorListener, View.OnClickListener {

        /* renamed from: d */
        private AnimatorSet f8418d;

        /* renamed from: e */
        private AnimatorSet f8419e;

        /* renamed from: f */
        private ActionBarOverlayLayout f8420f;

        private C2220c() {
        }

        /* renamed from: d */
        private void m9283d(boolean z) {
            View view;
            int i;
            if (z) {
                view = this.f8420f.getContentView();
                i = 0;
            } else {
                view = this.f8420f.getContentView();
                i = 4;
            }
            view.setImportantForAccessibility(i);
        }

        /* renamed from: a */
        public void mo8250a(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f8420f = actionBarOverlayLayout;
            if (this.f8418d == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(PhoneActionMenuView.this, "Value", new float[]{1.0f, 0.0f}), actionBarOverlayLayout.mo7884y(this).mo7890b()});
                animatorSet.setDuration((long) PhoneActionMenuView.this.getResources().getInteger(17694720));
                animatorSet.setInterpolator(new C2454f());
                animatorSet.addListener(this);
                this.f8418d = animatorSet;
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(PhoneActionMenuView.this, "Value", new float[]{0.0f, 1.0f}), actionBarOverlayLayout.mo7884y((View.OnClickListener) null).mo7889a()});
                animatorSet2.setDuration((long) PhoneActionMenuView.this.getResources().getInteger(17694720));
                animatorSet2.setInterpolator(new C2454f());
                animatorSet2.addListener(this);
                this.f8419e = animatorSet2;
                if (!C1650d.m6967a()) {
                    this.f8418d.setDuration(0);
                    this.f8419e.setDuration(0);
                }
            }
        }

        /* renamed from: b */
        public void mo8251b(ActionBarOverlayLayout actionBarOverlayLayout) {
            mo8250a(actionBarOverlayLayout);
            this.f8419e.cancel();
            this.f8418d.cancel();
            this.f8419e.start();
        }

        /* renamed from: c */
        public void mo8252c() {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    Method declaredMethod = Class.forName("android.animation.AnimatorSet").getDeclaredMethod("reverse", new Class[0]);
                    if (this.f8418d.isRunning()) {
                        declaredMethod.invoke(this.f8418d, new Object[0]);
                    }
                    if (this.f8419e.isRunning()) {
                        declaredMethod.invoke(this.f8419e, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.e("PhoneActionMenuView", "reverse: ", e);
                }
            } else {
                ArrayList<Animator> arrayList = null;
                if (this.f8418d.isRunning()) {
                    arrayList = this.f8418d.getChildAnimations();
                }
                if (this.f8419e.isRunning()) {
                    arrayList = this.f8419e.getChildAnimations();
                }
                if (arrayList != null) {
                    Iterator<Animator> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ValueAnimator) it.next()).reverse();
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo8253e(ActionBarOverlayLayout actionBarOverlayLayout) {
            mo8250a(actionBarOverlayLayout);
            this.f8419e.cancel();
            this.f8418d.cancel();
            this.f8418d.start();
        }

        public void onAnimationCancel(Animator animator) {
            boolean z;
            if (PhoneActionMenuView.this.f8400n == C2219b.Expanding || PhoneActionMenuView.this.f8400n == C2219b.Expanded) {
                PhoneActionMenuView.this.setValue(0.0f);
                z = false;
            } else {
                if (PhoneActionMenuView.this.f8400n == C2219b.Collapsing || PhoneActionMenuView.this.f8400n == C2219b.Collapsed) {
                    PhoneActionMenuView.this.setValue(1.0f);
                    z = true;
                }
                PhoneActionMenuView.this.postInvalidateOnAnimation();
            }
            m9283d(z);
            PhoneActionMenuView.this.postInvalidateOnAnimation();
        }

        public void onAnimationEnd(Animator animator) {
            if (PhoneActionMenuView.this.f8396j != null) {
                if (PhoneActionMenuView.this.f8396j.getTranslationY() == 0.0f) {
                    C2219b unused = PhoneActionMenuView.this.f8400n = C2219b.Expanded;
                    m9283d(false);
                } else if (PhoneActionMenuView.this.f8396j.getTranslationY() == ((float) PhoneActionMenuView.this.getMeasuredHeight())) {
                    C2219b unused2 = PhoneActionMenuView.this.f8400n = C2219b.Collapsed;
                    m9283d(true);
                    PhoneActionMenuView.this.f8397k.setBackground(PhoneActionMenuView.this.f8402p);
                }
            }
            PhoneActionMenuView.this.postInvalidateOnAnimation();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onClick(View view) {
            if (PhoneActionMenuView.this.f8400n == C2219b.Expanded) {
                PhoneActionMenuView.this.getPresenter().mo8284T(true);
            }
        }
    }

    public PhoneActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setBackground((Drawable) null);
        this.f8395i = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8391D);
        this.f8402p = obtainStyledAttributes.getDrawable(0);
        this.f8401o = obtainStyledAttributes.getDrawable(1);
        this.f8406t = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
        m9273t();
        View view = new View(context);
        this.f8397k = view;
        addView(view);
        setChildrenDrawingOrderEnabled(true);
        this.f8393B = C1878b.m7804a(context);
        m9275y(context);
    }

    private int getActionMenuItemCount() {
        int childCount = getChildCount();
        if (indexOfChild(this.f8396j) != -1) {
            childCount--;
        }
        return indexOfChild(this.f8397k) != -1 ? childCount - 1 : childCount;
    }

    private C2220c getOverflowMenuViewAnimator() {
        if (this.f8399m == null) {
            this.f8399m = new C2220c();
        }
        return this.f8399m;
    }

    /* renamed from: t */
    private void m9273t() {
        if (this.f8405s == null) {
            this.f8405s = new Rect();
        }
        Drawable drawable = this.f8396j == null ? this.f8402p : this.f8401o;
        if (drawable == null) {
            this.f8405s.setEmpty();
        } else {
            drawable.getPadding(this.f8405s);
        }
    }

    /* renamed from: v */
    private boolean m9274v(View view) {
        return view == this.f8396j || view == this.f8397k;
    }

    /* renamed from: y */
    private void m9275y(Context context) {
        this.f8407u = context.getResources().getDimensionPixelSize(C1350f.f4675y);
        this.f8408v = context.getResources().getDimensionPixelSize(C1350f.f4669t);
        if (this.f8393B != 1) {
            this.f8409w = context.getResources().getDimensionPixelSize(C1350f.f4674x);
            this.f8410x = context.getResources().getDimensionPixelSize(C1350f.f4673w);
            this.f8411y = context.getResources().getDimensionPixelSize(C1350f.f4672v);
            this.f8412z = context.getResources().getDimensionPixelSize(C1350f.f4671u);
        }
    }

    /* renamed from: z */
    private void m9276z(Context context, int i) {
        int i2;
        int i3 = this.f8393B;
        if (i3 == 3) {
            i2 = this.f8409w;
        } else if (i3 == 2) {
            int i4 = (int) ((((float) i) * 1.0f) / context.getResources().getDisplayMetrics().density);
            this.f8392A = (i4 < 700 || i4 >= 740) ? (i4 < 740 || i4 >= 1000) ? i4 >= 1000 ? this.f8412z : this.f8409w : this.f8411y : this.f8410x;
            return;
        } else {
            i2 = this.f8408v;
        }
        this.f8392A = i2;
    }

    /* renamed from: a */
    public boolean mo8193a() {
        return getChildAt(0) == this.f8397k || getChildAt(1) == this.f8397k;
    }

    /* renamed from: b */
    public void mo7648b(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r0 = (miuix.appcompat.internal.view.menu.action.C2233c.C2234a) r0.getLayoutParams();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8195d(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.getChildAt(r5)
            boolean r1 = r4.m9274v(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000e
        L_0x000c:
            r0 = r3
            goto L_0x001b
        L_0x000e:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            miuix.appcompat.internal.view.menu.action.c$a r0 = (miuix.appcompat.internal.view.menu.action.C2233c.C2234a) r0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.f8501a
            if (r0 != 0) goto L_0x000c
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 == 0) goto L_0x0024
            boolean r5 = super.mo8195d(r5)
            if (r5 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.action.PhoneActionMenuView.mo8195d(int):boolean");
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int indexOfChild = indexOfChild(this.f8396j);
        int indexOfChild2 = indexOfChild(this.f8397k);
        if (i2 == 0) {
            if (indexOfChild != -1) {
                return indexOfChild;
            }
            if (indexOfChild2 != -1) {
                return indexOfChild2;
            }
        } else if (!(i2 != 1 || indexOfChild == -1 || indexOfChild2 == -1)) {
            return indexOfChild2;
        }
        int i3 = 0;
        while (i3 < i) {
            if (!(i3 == indexOfChild || i3 == indexOfChild2)) {
                int i4 = i3 < indexOfChild ? i3 + 1 : i3;
                if (i3 < indexOfChild2) {
                    i4++;
                }
                if (i4 == i2) {
                    return i3;
                }
            }
            i3++;
        }
        return super.getChildDrawingOrder(i, i2);
    }

    public int getCollapsedHeight() {
        int i = this.f8404r;
        if (i == 0) {
            return 0;
        }
        return (i + this.f8405s.top) - this.f8406t;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9275y(this.f8395i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        View view = this.f8396j;
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            C1656j.m6986e(this, this.f8396j, 0, 0, i6, measuredHeight);
            i5 = measuredHeight - this.f8405s.top;
        } else {
            i5 = 0;
        }
        C1656j.m6986e(this, this.f8397k, 0, i5, i6, i7);
        int childCount = getChildCount();
        int i8 = (i6 - this.f8403q) >> 1;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!m9274v(childAt)) {
                C1656j.m6986e(this, childAt, i8, i5, i8 + childAt.getMeasuredWidth(), i7);
                i8 += childAt.getMeasuredWidth() + this.f8392A;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view;
        float f;
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        this.f8394C = actionMenuItemCount;
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.f8404r = 0;
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        this.f8407u = Math.min(size / this.f8394C, this.f8407u);
        m9276z(getContext(), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f8407u, Integer.MIN_VALUE);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!m9274v(childAt)) {
                measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                i3 += Math.min(childAt.getMeasuredWidth(), this.f8407u);
                i4 = Math.max(i4, childAt.getMeasuredHeight());
            }
        }
        int i6 = this.f8392A;
        int i7 = this.f8394C;
        if ((i6 * (i7 - 1)) + i3 > size) {
            this.f8392A = 0;
        }
        int i8 = i3 + (this.f8392A * (i7 - 1));
        this.f8403q = i8;
        this.f8404r = i4;
        View view2 = this.f8396j;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            marginLayoutParams.topMargin = C2698f.m11279g(this.f8395i);
            marginLayoutParams.bottomMargin = this.f8404r;
            measureChildWithMargins(this.f8396j, i, 0, i2, 0);
            Math.max(i8, this.f8396j.getMeasuredWidth());
            i4 += this.f8396j.getMeasuredHeight();
            C2219b bVar = this.f8400n;
            if (bVar == C2219b.Expanded) {
                view = this.f8396j;
                f = 0.0f;
            } else if (bVar == C2219b.Collapsed) {
                view = this.f8396j;
                f = (float) i4;
            }
            view.setTranslationY(f);
        }
        if (this.f8396j == null) {
            i4 += this.f8405s.top;
        }
        this.f8397k.setBackground(this.f8400n == C2219b.Collapsed ? this.f8402p : this.f8401o);
        setMeasuredDimension(size, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        View view = this.f8396j;
        return y > (view == null ? 0.0f : view.getTranslationY()) || super.onTouchEvent(motionEvent);
    }

    public void setBackground(Drawable drawable) {
        if (this.f8402p != drawable) {
            this.f8402p = drawable;
            m9273t();
        }
    }

    public void setEnableBlur(boolean z) {
    }

    public void setOverflowMenuView(View view) {
        C2432a aVar = this.f8398l;
        if (((aVar == null || aVar.getChildCount() <= 1) ? null : this.f8398l.getChildAt(1)) != view) {
            View view2 = this.f8396j;
            if (view2 != null) {
                if (view2.getAnimation() != null) {
                    this.f8396j.clearAnimation();
                }
                C2432a aVar2 = this.f8398l;
                if (aVar2 != null) {
                    aVar2.removeAllViews();
                    removeView(this.f8398l);
                    this.f8398l = null;
                }
            }
            if (view != null) {
                if (this.f8398l == null) {
                    this.f8398l = new C2432a(this.f8395i);
                }
                this.f8398l.addView(view);
                addView(this.f8398l);
            }
            this.f8396j = this.f8398l;
            m9273t();
        }
    }

    public void setSupportBlur(boolean z) {
    }

    public void setValue(float f) {
        View view = this.f8396j;
        if (view != null) {
            view.setTranslationY(f * ((float) getMeasuredHeight()));
        }
    }

    /* renamed from: u */
    public boolean mo8247u(ActionBarOverlayLayout actionBarOverlayLayout) {
        C2219b bVar = this.f8400n;
        C2219b bVar2 = C2219b.Collapsing;
        if (bVar == bVar2 || bVar == C2219b.Collapsed) {
            return false;
        }
        C2220c overflowMenuViewAnimator = getOverflowMenuViewAnimator();
        if (bVar == C2219b.Expanded) {
            this.f8400n = bVar2;
            overflowMenuViewAnimator.mo8251b(actionBarOverlayLayout);
            return true;
        } else if (bVar != C2219b.Expanding) {
            return true;
        } else {
            overflowMenuViewAnimator.mo8252c();
            return true;
        }
    }

    /* renamed from: w */
    public boolean mo8248w() {
        C2219b bVar = this.f8400n;
        return bVar == C2219b.Expanding || bVar == C2219b.Expanded;
    }

    /* renamed from: x */
    public boolean mo8249x(ActionBarOverlayLayout actionBarOverlayLayout) {
        C2219b bVar = this.f8400n;
        C2219b bVar2 = C2219b.Expanding;
        if (bVar == bVar2 || bVar == C2219b.Expanded || this.f8396j == null) {
            return false;
        }
        this.f8397k.setBackground(this.f8401o);
        C2220c overflowMenuViewAnimator = getOverflowMenuViewAnimator();
        if (bVar == C2219b.Collapsed) {
            this.f8400n = bVar2;
            overflowMenuViewAnimator.mo8253e(actionBarOverlayLayout);
        } else if (bVar == C2219b.Collapsing) {
            overflowMenuViewAnimator.mo8252c();
        }
        postInvalidateOnAnimation();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        return true;
    }
}
