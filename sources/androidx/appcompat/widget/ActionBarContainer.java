package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0727l0;
import p021d.C1452f;
import p021d.C1456j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: d */
    private boolean f867d;

    /* renamed from: e */
    private View f868e;

    /* renamed from: f */
    private View f869f;

    /* renamed from: g */
    private View f870g;

    /* renamed from: h */
    Drawable f871h;

    /* renamed from: i */
    Drawable f872i;

    /* renamed from: j */
    Drawable f873j;

    /* renamed from: k */
    boolean f874k;

    /* renamed from: l */
    boolean f875l;

    /* renamed from: m */
    private int f876m;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    private static class C0241a {
        /* renamed from: a */
        public static void m1048a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0727l0.m2880b0(this, new C0295b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1456j.f5972a);
        this.f871h = obtainStyledAttributes.getDrawable(C1456j.f5977b);
        this.f872i = obtainStyledAttributes.getDrawable(C1456j.f5987d);
        this.f876m = obtainStyledAttributes.getDimensionPixelSize(C1456j.f6017j, -1);
        boolean z = true;
        if (getId() == C1452f.f5777H) {
            this.f874k = true;
            this.f873j = obtainStyledAttributes.getDrawable(C1456j.f5982c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f874k ? !(this.f871h == null && this.f872i == null) : this.f873j != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1046a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1047b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f871h;
        if (drawable != null && drawable.isStateful()) {
            this.f871h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f872i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f872i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f873j;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f873j.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f868e;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f871h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f872i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f873j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f869f = findViewById(C1452f.f5786a);
        this.f870g = findViewById(C1452f.f5791f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f867d || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f868e
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f874k
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f873j
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f871h
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f869f
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0074
            android.graphics.drawable.Drawable r6 = r4.f871h
            android.view.View r7 = r4.f869f
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f869f
            int r8 = r8.getTop()
            android.view.View r0 = r4.f869f
            int r0 = r0.getRight()
            android.view.View r2 = r4.f869f
        L_0x006c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0074:
            android.view.View r6 = r4.f870g
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f871h
            android.view.View r7 = r4.f870g
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f870g
            int r8 = r8.getTop()
            android.view.View r0 = r4.f870g
            int r0 = r0.getRight()
            android.view.View r2 = r4.f870g
            goto L_0x006c
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f871h
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f875l = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f872i
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f869f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f876m
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f869f
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f868e
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f869f
            boolean r0 = r3.m1047b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f869f
        L_0x0042:
            int r0 = r3.m1046a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f870g
            boolean r0 = r3.m1047b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f870g
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f868e
            int r1 = r3.m1046a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f871h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f871h);
        }
        this.f871h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f869f;
            if (view != null) {
                this.f871h.setBounds(view.getLeft(), this.f869f.getTop(), this.f869f.getRight(), this.f869f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f874k ? !(this.f871h == null && this.f872i == null) : this.f873j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0241a.m1048a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f873j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f873j);
        }
        this.f873j = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f874k && (drawable2 = this.f873j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f874k ? this.f871h == null && this.f872i == null : this.f873j == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C0241a.m1048a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f872i;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f872i);
        }
        this.f872i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f875l && (drawable2 = this.f872i) != null) {
                drawable2.setBounds(this.f868e.getLeft(), this.f868e.getTop(), this.f868e.getRight(), this.f868e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f874k ? !(this.f871h == null && this.f872i == null) : this.f873j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0241a.m1048a(this);
    }

    public void setTabContainer(C0429y0 y0Var) {
        View view = this.f868e;
        if (view != null) {
            removeView(view);
        }
        this.f868e = y0Var;
        if (y0Var != null) {
            addView(y0Var);
            ViewGroup.LayoutParams layoutParams = y0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            y0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f867d = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f871h;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f872i;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f873j;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f871h && !this.f874k) || (drawable == this.f872i && this.f875l) || ((drawable == this.f873j && this.f874k) || super.verifyDrawable(drawable));
    }
}
