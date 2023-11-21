package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.C0182b;
import androidx.core.view.C0662b2;
import androidx.core.view.C0727l0;
import p021d.C1447a;
import p021d.C1452f;
import p021d.C1453g;
import p021d.C1456j;

public class ActionBarContextView extends C0290a {

    /* renamed from: l */
    private CharSequence f877l;

    /* renamed from: m */
    private CharSequence f878m;

    /* renamed from: n */
    private View f879n;

    /* renamed from: o */
    private View f880o;

    /* renamed from: p */
    private View f881p;

    /* renamed from: q */
    private LinearLayout f882q;

    /* renamed from: r */
    private TextView f883r;

    /* renamed from: s */
    private TextView f884s;

    /* renamed from: t */
    private int f885t;

    /* renamed from: u */
    private int f886u;

    /* renamed from: v */
    private boolean f887v;

    /* renamed from: w */
    private int f888w;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0242a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C0182b f889d;

        C0242a(C0182b bVar) {
            this.f889d = bVar;
        }

        public void onClick(View view) {
            this.f889d.mo613c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5684j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0326g1 u = C0326g1.m1455u(context, attributeSet, C1456j.f6092y, i, 0);
        C0727l0.m2880b0(this, u.mo1869f(C1456j.f6097z));
        this.f885t = u.mo1876m(C1456j.f5865D, 0);
        this.f886u = u.mo1876m(C1456j.f5860C, 0);
        this.f1174h = u.mo1875l(C1456j.f5855B, 0);
        this.f888w = u.mo1876m(C1456j.f5850A, C1453g.f5815d);
        u.mo1882v();
    }

    /* renamed from: i */
    private void m1049i() {
        if (this.f882q == null) {
            LayoutInflater.from(getContext()).inflate(C1453g.f5812a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f882q = linearLayout;
            this.f883r = (TextView) linearLayout.findViewById(C1452f.f5790e);
            this.f884s = (TextView) this.f882q.findViewById(C1452f.f5789d);
            if (this.f885t != 0) {
                this.f883r.setTextAppearance(getContext(), this.f885t);
            }
            if (this.f886u != 0) {
                this.f884s.setTextAppearance(getContext(), this.f886u);
            }
        }
        this.f883r.setText(this.f877l);
        this.f884s.setText(this.f878m);
        boolean z = !TextUtils.isEmpty(this.f877l);
        boolean z2 = !TextUtils.isEmpty(this.f878m);
        int i = 0;
        this.f884s.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f882q;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f882q.getParent() == null) {
            addView(this.f882q);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0662b2 mo1147f(int i, long j) {
        return super.mo1147f(i, j);
    }

    /* renamed from: g */
    public void mo1148g() {
        if (this.f879n == null) {
            mo1157k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f878m;
    }

    public CharSequence getTitle() {
        return this.f877l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1155h(androidx.appcompat.view.C0182b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f879n
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f888w
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f879n = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f879n
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f879n
            int r1 = p021d.C1452f.f5794i
            android.view.View r0 = r0.findViewById(r1)
            r3.f880o = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo615e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0214g) r4
            androidx.appcompat.widget.c r0 = r3.f1173g
            if (r0 == 0) goto L_0x0041
            r0.mo1775y()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1173g = r0
            r1 = 1
            r0.mo1773J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1173g
            android.content.Context r2 = r3.f1171e
            r4.mo895c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1173g
            androidx.appcompat.view.menu.n r4 = r4.mo810o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1172f = r4
            r1 = 0
            androidx.core.view.C0727l0.m2880b0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1172f
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo1155h(androidx.appcompat.view.b):void");
    }

    /* renamed from: j */
    public boolean mo1156j() {
        return this.f887v;
    }

    /* renamed from: k */
    public void mo1157k() {
        removeAllViews();
        this.f881p = null;
        this.f1172f = null;
        this.f1173g = null;
        View view = this.f880o;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: l */
    public boolean mo1158l() {
        C0299c cVar = this.f1173g;
        if (cVar != null) {
            return cVar.mo1774K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0299c cVar = this.f1173g;
        if (cVar != null) {
            cVar.mo1765B();
            this.f1173g.mo1766C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0385r1.m1722b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f879n;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f879n.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0290a.m1306d(paddingRight, i5, b);
            paddingRight = C0290a.m1306d(d + mo1741e(this.f879n, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f882q;
        if (!(linearLayout == null || this.f881p != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1741e(this.f882q, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f881p;
        if (view2 != null) {
            mo1741e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1172f;
        if (actionMenuView != null) {
            mo1741e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1174h;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f879n;
            if (view != null) {
                int c = mo1740c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f879n.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1172f;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1740c(this.f1172f, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f882q;
            if (linearLayout != null && this.f881p == null) {
                if (this.f887v) {
                    this.f882q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f882q.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f882q.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1740c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f881p;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f881p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1174h <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f1174h = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f881p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f881p = view;
        if (!(view == null || (linearLayout = this.f882q) == null)) {
            removeView(linearLayout);
            this.f882q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f878m = charSequence;
        m1049i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f877l = charSequence;
        m1049i();
        C0727l0.m2878a0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f887v) {
            requestLayout();
        }
        this.f887v = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
