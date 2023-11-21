package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C0727l0;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.o0 */
public class C0364o0 extends ViewGroup {

    /* renamed from: d */
    private boolean f1389d;

    /* renamed from: e */
    private int f1390e;

    /* renamed from: f */
    private int f1391f;

    /* renamed from: g */
    private int f1392g;

    /* renamed from: h */
    private int f1393h;

    /* renamed from: i */
    private int f1394i;

    /* renamed from: j */
    private float f1395j;

    /* renamed from: k */
    private boolean f1396k;

    /* renamed from: l */
    private int[] f1397l;

    /* renamed from: m */
    private int[] f1398m;

    /* renamed from: n */
    private Drawable f1399n;

    /* renamed from: o */
    private int f1400o;

    /* renamed from: p */
    private int f1401p;

    /* renamed from: q */
    private int f1402q;

    /* renamed from: r */
    private int f1403r;

    /* renamed from: androidx.appcompat.widget.o0$a */
    public static class C0365a extends LinearLayout.LayoutParams {
        public C0365a(int i, int i2) {
            super(i, i2);
        }

        public C0365a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0365a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0364o0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0364o0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0364o0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1389d = true;
        this.f1390e = -1;
        this.f1391f = 0;
        this.f1393h = 8388659;
        int[] iArr = C1456j.f5974a1;
        C0326g1 u = C0326g1.m1455u(context, attributeSet, iArr, i, 0);
        C0727l0.m2873W(this, context, iArr, attributeSet, u.mo1880q(), i, 0);
        int j = u.mo1873j(C1456j.f5984c1, -1);
        if (j >= 0) {
            setOrientation(j);
        }
        int j2 = u.mo1873j(C1456j.f5979b1, -1);
        if (j2 >= 0) {
            setGravity(j2);
        }
        boolean a = u.mo1864a(C1456j.f5989d1, true);
        if (!a) {
            setBaselineAligned(a);
        }
        this.f1395j = u.mo1871h(C1456j.f5999f1, -1.0f);
        this.f1390e = u.mo1873j(C1456j.f5994e1, -1);
        this.f1396k = u.mo1864a(C1456j.f6014i1, false);
        setDividerDrawable(u.mo1869f(C1456j.f6004g1));
        this.f1402q = u.mo1873j(C1456j.f6019j1, 0);
        this.f1403r = u.mo1868e(C1456j.f6009h1, 0);
        u.mo1882v();
    }

    /* renamed from: g */
    private void m1640g(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View o = mo2063o(i3);
            if (o.getVisibility() != 8) {
                C0365a aVar = (C0365a) o.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = o.getMeasuredWidth();
                    measureChildWithMargins(o, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: h */
    private void m1641h(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View o = mo2063o(i3);
            if (o.getVisibility() != 8) {
                C0365a aVar = (C0365a) o.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = o.getMeasuredHeight();
                    measureChildWithMargins(o, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: w */
    private void m1642w(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2046c(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean b = C0385r1.m1722b(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View o = mo2063o(i4);
            if (!(o == null || o.getVisibility() == 8 || !mo2067p(i4))) {
                C0365a aVar = (C0365a) o.getLayoutParams();
                mo2049f(canvas, b ? o.getRight() + aVar.rightMargin : (o.getLeft() - aVar.leftMargin) - this.f1400o);
            }
        }
        if (mo2067p(virtualChildCount)) {
            View o2 = mo2063o(virtualChildCount - 1);
            if (o2 != null) {
                C0365a aVar2 = (C0365a) o2.getLayoutParams();
                if (b) {
                    i3 = o2.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = o2.getRight() + aVar2.rightMargin;
                    mo2049f(canvas, i);
                }
            } else if (b) {
                i = getPaddingLeft();
                mo2049f(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f1400o;
            mo2049f(canvas, i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0365a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2047d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View o = mo2063o(i);
            if (!(o == null || o.getVisibility() == 8 || !mo2067p(i))) {
                mo2048e(canvas, (o.getTop() - ((C0365a) o.getLayoutParams()).topMargin) - this.f1401p);
            }
        }
        if (mo2067p(virtualChildCount)) {
            View o2 = mo2063o(virtualChildCount - 1);
            mo2048e(canvas, o2 == null ? (getHeight() - getPaddingBottom()) - this.f1401p : o2.getBottom() + ((C0365a) o2.getLayoutParams()).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2048e(Canvas canvas, int i) {
        this.f1399n.setBounds(getPaddingLeft() + this.f1403r, i, (getWidth() - getPaddingRight()) - this.f1403r, this.f1401p + i);
        this.f1399n.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2049f(Canvas canvas, int i) {
        this.f1399n.setBounds(i, getPaddingTop() + this.f1403r, this.f1400o + i, (getHeight() - getPaddingBottom()) - this.f1403r);
        this.f1399n.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.f1390e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1390e;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f1391f;
                if (this.f1392g == 1 && (i = this.f1393h & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1394i) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1394i;
                    }
                }
                return i3 + ((C0365a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1390e == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1390e;
    }

    public Drawable getDividerDrawable() {
        return this.f1399n;
    }

    public int getDividerPadding() {
        return this.f1403r;
    }

    public int getDividerWidth() {
        return this.f1400o;
    }

    public int getGravity() {
        return this.f1393h;
    }

    public int getOrientation() {
        return this.f1392g;
    }

    public int getShowDividers() {
        return this.f1402q;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1395j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0365a generateDefaultLayoutParams() {
        int i = this.f1392g;
        if (i == 0) {
            return new C0365a(-2, -2);
        }
        if (i == 1) {
            return new C0365a(-1, -2);
        }
        return null;
    }

    /* renamed from: j */
    public C0365a generateLayoutParams(AttributeSet attributeSet) {
        return new C0365a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0365a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0365a(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2060l(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo2061m(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo2062n(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public View mo2063o(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1399n != null) {
            if (this.f1392g == 1) {
                mo2047d(canvas);
            } else {
                mo2046c(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1392g == 1) {
            mo2069r(i, i2, i3, i4);
        } else {
            mo2068q(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1392g == 1) {
            mo2085v(i, i2);
        } else {
            mo2083t(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo2067p(int i) {
        if (i == 0) {
            return (this.f1402q & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1402q & 4) != 0;
        }
        if ((this.f1402q & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2068q(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0385r1.m1722b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f1393h
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f1389d
            int[] r13 = r6.f1397l
            int[] r14 = r6.f1398m
            int r1 = androidx.core.view.C0727l0.m2916u(r24)
            int r1 = androidx.core.view.C0681e.m2704a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f1394i
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f1394i
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = r2
            r17 = r5
        L_0x0064:
            r3 = r2
        L_0x0065:
            if (r3 >= r10) goto L_0x0149
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo2063o(r2)
            if (r0 != 0) goto L_0x0080
            int r0 = r6.mo2084u(r2)
            int r1 = r1 + r0
            r21 = r5
            r22 = r7
            r19 = r10
            r20 = r11
            goto L_0x013a
        L_0x0080:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0130
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.C0364o0.C0365a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a8
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00aa
            int r10 = r0.getBaseline()
            goto L_0x00ab
        L_0x00a8:
            r19 = r10
        L_0x00aa:
            r10 = -1
        L_0x00ab:
            int r3 = r4.gravity
            if (r3 >= 0) goto L_0x00b0
            r3 = r11
        L_0x00b0:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00eb
            r11 = 48
            if (r3 == r11) goto L_0x00d9
            r11 = 80
            if (r3 == r11) goto L_0x00c3
            r3 = r7
            r11 = -1
            goto L_0x00e8
        L_0x00c3:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00e8
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00e8
        L_0x00d9:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00e8
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00f9
        L_0x00e8:
            r21 = 1
            goto L_0x00f9
        L_0x00eb:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f9:
            boolean r10 = r6.mo2067p(r2)
            if (r10 == 0) goto L_0x0102
            int r10 = r6.f1400o
            int r1 = r1 + r10
        L_0x0102:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo2061m(r0)
            int r22 = r10 + r1
            r25 = r0
            r0 = r24
            r1 = r25
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m1642w(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo2062n(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo2060l(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x013c
        L_0x0130:
            r18 = r3
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
        L_0x013a:
            r23 = -1
        L_0x013c:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r5 = r21
            r7 = r22
            r15 = 2
            goto L_0x0065
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0364o0.mo2068q(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2069r(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1393h
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1394i
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1394i
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = r1
        L_0x0049:
            if (r12 >= r10) goto L_0x00c8
            android.view.View r13 = r6.mo2063o(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.mo2084u(r12)
            int r0 = r0 + r1
            goto L_0x00c5
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.C0364o0.C0365a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = androidx.core.view.C0727l0.m2916u(r17)
            int r1 = androidx.core.view.C0681e.m2704a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008b
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0096
        L_0x0088:
            int r1 = r8 - r4
            goto L_0x0093
        L_0x008b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L_0x0093:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L_0x0096:
            r2 = r1
            boolean r1 = r6.mo2067p(r12)
            if (r1 == 0) goto L_0x00a0
            int r1 = r6.f1401p
            int r0 = r0 + r1
        L_0x00a0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.mo2061m(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1642w(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.mo2062n(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.mo2060l(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto L_0x00c6
        L_0x00c5:
            r1 = r14
        L_0x00c6:
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0364o0.mo2069r(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2070s(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void setBaselineAligned(boolean z) {
        this.f1389d = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1390e = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1399n) {
            this.f1399n = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1400o = drawable.getIntrinsicWidth();
                this.f1401p = drawable.getIntrinsicHeight();
            } else {
                this.f1400o = 0;
                this.f1401p = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1403r = i;
    }

    public void setGravity(int i) {
        if (this.f1393h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1393h = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1393h;
        if ((8388615 & i3) != i2) {
            this.f1393h = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1396k = z;
    }

    public void setOrientation(int i) {
        if (this.f1392g != i) {
            this.f1392g = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1402q) {
            requestLayout();
        }
        this.f1402q = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1393h;
        if ((i3 & 112) != i2) {
            this.f1393h = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1395j = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a4, code lost:
        if (r8 > 0) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03af, code lost:
        if (r8 < 0) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b1, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b2, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r0 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d2  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2083t(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f1394i = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f1397l
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f1398m
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f1397l = r0
            int[] r0 = new int[r14]
            r7.f1398m = r0
        L_0x0026:
            int[] r15 = r7.f1397l
            int[] r6 = r7.f1398m
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f1389d
            boolean r3 = r7.f1396k
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = r18
            goto L_0x004e
        L_0x004c:
            r19 = r10
        L_0x004e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r27 = r25
            r26 = r18
            r0 = r20
        L_0x0062:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01fd
            android.view.View r6 = r7.mo2063o(r1)
            if (r6 != 0) goto L_0x0082
            int r5 = r7.f1394i
            int r6 = r7.mo2084u(r1)
            int r5 = r5 + r6
            r7.f1394i = r5
        L_0x0077:
            r32 = r3
            r36 = r4
            r37 = r2
            r2 = r1
            r1 = r37
            goto L_0x01ea
        L_0x0082:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008e
            int r5 = r7.mo2060l(r6, r1)
            int r1 = r1 + r5
            goto L_0x0077
        L_0x008e:
            boolean r5 = r7.mo2067p(r1)
            if (r5 == 0) goto L_0x009b
            int r5 = r7.f1394i
            int r10 = r7.f1400o
            int r5 = r5 + r10
            r7.f1394i = r5
        L_0x009b:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.o0$a r10 = (androidx.appcompat.widget.C0364o0.C0365a) r10
            float r5 = r10.weight
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00eb
            int r0 = r10.width
            if (r0 != 0) goto L_0x00eb
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            int r0 = r7.f1394i
            if (r19 == 0) goto L_0x00bb
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c5
        L_0x00bb:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c5:
            r7.f1394i = r0
            if (r4 == 0) goto L_0x00dc
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0163
        L_0x00dc:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r24 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r30 = -2
            goto L_0x0165
        L_0x00eb:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f8
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f8
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fb
        L_0x00f8:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fb:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            int r0 = r7.f1394i
            r29 = r0
            goto L_0x0106
        L_0x0104:
            r29 = 0
        L_0x0106:
            r33 = 0
            r0 = r38
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r39
            r36 = r4
            r4 = r29
            r29 = r5
            r9 = -1
            r5 = r40
            r30 = r29
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r6
            r6 = r33
            r0.mo2070s(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x012f
            r10.width = r0
        L_0x012f:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x0146
            int r1 = r7.f1394i
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.mo2062n(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x015b
        L_0x0146:
            r3 = r29
            int r1 = r7.f1394i
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo2062n(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x015b:
            r7.f1394i = r1
            if (r32 == 0) goto L_0x0163
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0163:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0165:
            if (r13 == r1) goto L_0x0171
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0171
            r0 = r18
            r27 = r0
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01af
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01af
            int r6 = r10.gravity
            if (r6 >= 0) goto L_0x0195
            int r6 = r7.f1393h
        L_0x0195:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01af:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01bf
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01bf
            r26 = r18
            goto L_0x01c1
        L_0x01bf:
            r26 = 0
        L_0x01c1:
            float r5 = r10.weight
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d2
            if (r0 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r2 = r4
        L_0x01cb:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e0
        L_0x01d2:
            r10 = r23
            if (r0 == 0) goto L_0x01d7
            goto L_0x01d8
        L_0x01d7:
            r2 = r4
        L_0x01d8:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L_0x01e0:
            r10 = r34
            int r0 = r7.mo2060l(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L_0x01ea:
            int r2 = r2 + 1
            r9 = r40
            r6 = r28
            r3 = r32
            r4 = r36
            r5 = -1
            r10 = 0
            r37 = r2
            r2 = r1
            r1 = r37
            goto L_0x0062
        L_0x01fd:
            r1 = r2
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.f1394i
            if (r3 <= 0) goto L_0x021f
            boolean r3 = r7.mo2067p(r11)
            if (r3 == 0) goto L_0x021f
            int r3 = r7.f1394i
            int r1 = r7.f1400o
            int r3 = r3 + r1
            r7.f1394i = r3
        L_0x021f:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x0237
            r21 = 0
            r5 = r15[r21]
            if (r5 != r3) goto L_0x0237
            r5 = r15[r17]
            if (r5 != r3) goto L_0x0237
            r5 = r15[r16]
            if (r5 == r3) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            r1 = r2
            r23 = r6
            goto L_0x0266
        L_0x0237:
            r3 = r15[r16]
            r5 = 0
            r9 = r15[r5]
            r5 = r15[r17]
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x0266:
            if (r32 == 0) goto L_0x02c7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x026e
            if (r12 != 0) goto L_0x02c7
        L_0x026e:
            r2 = 0
            r7.f1394i = r2
            r2 = 0
        L_0x0272:
            if (r2 >= r11) goto L_0x02c7
            android.view.View r3 = r7.mo2063o(r2)
            if (r3 != 0) goto L_0x0284
            int r3 = r7.f1394i
            int r5 = r7.mo2084u(r2)
            int r3 = r3 + r5
            r7.f1394i = r3
            goto L_0x0291
        L_0x0284:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0294
            int r3 = r7.mo2060l(r3, r2)
            int r2 = r2 + r3
        L_0x0291:
            r21 = r1
            goto L_0x02c2
        L_0x0294:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.C0364o0.C0365a) r5
            int r6 = r7.f1394i
            if (r19 == 0) goto L_0x02ad
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.mo2062n(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.f1394i = r6
            goto L_0x0291
        L_0x02ad:
            int r9 = r6 + r14
            r21 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo2062n(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f1394i = r1
        L_0x02c2:
            int r2 = r2 + 1
            r1 = r21
            goto L_0x0272
        L_0x02c7:
            r21 = r1
            int r1 = r7.f1394i
            int r2 = r38.getPaddingLeft()
            int r3 = r38.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f1394i = r1
            int r2 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.f1394i
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x0338
            if (r2 == 0) goto L_0x02f4
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f4
            goto L_0x0338
        L_0x02f4:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x0330
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0330
            r10 = 0
        L_0x02ff:
            if (r10 >= r11) goto L_0x0330
            android.view.View r2 = r7.mo2063o(r10)
            if (r2 == 0) goto L_0x032d
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0310
            goto L_0x032d
        L_0x0310:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.o0$a r4 = (androidx.appcompat.widget.C0364o0.C0365a) r4
            float r4 = r4.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x032d
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x032d:
            int r10 = r10 + 1
            goto L_0x02ff
        L_0x0330:
            r2 = r40
            r25 = r11
            r3 = r21
            goto L_0x04c6
        L_0x0338:
            float r5 = r7.f1395j
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x033f
            r0 = r5
        L_0x033f:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.f1394i = r6
            r6 = r4
            r4 = r5
            r9 = r23
            r10 = 0
        L_0x0358:
            if (r10 >= r11) goto L_0x046f
            android.view.View r14 = r7.mo2063o(r10)
            if (r14 == 0) goto L_0x0460
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x036a
            goto L_0x0460
        L_0x036a:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.o0$a r5 = (androidx.appcompat.widget.C0364o0.C0365a) r5
            float r3 = r5.weight
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03c9
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r40
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03a7
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            if (r8 <= 0) goto L_0x03b1
            goto L_0x03b2
        L_0x03a7:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03a9:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L_0x03b2
        L_0x03b1:
            r8 = 0
        L_0x03b2:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03cf
        L_0x03c9:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r40
        L_0x03cf:
            int r8 = r7.f1394i
            if (r19 == 0) goto L_0x03ec
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo2062n(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f1394i = r8
            r23 = r0
            goto L_0x0404
        L_0x03ec:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.mo2062n(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.f1394i = r0
        L_0x0404:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x0410
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x0410
            r0 = r18
            goto L_0x0411
        L_0x0410:
            r0 = 0
        L_0x0411:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x0422
            goto L_0x0423
        L_0x0422:
            r8 = r11
        L_0x0423:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x0431
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x0432
            r6 = r18
            goto L_0x0433
        L_0x0431:
            r8 = -1
        L_0x0432:
            r6 = 0
        L_0x0433:
            if (r36 == 0) goto L_0x045a
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x045a
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x0441
            int r5 = r7.f1393h
        L_0x0441:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x045a:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L_0x0465
        L_0x0460:
            r3 = r2
            r25 = r11
            r2 = r40
        L_0x0465:
            int r10 = r10 + 1
            r8 = r39
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x0358
        L_0x046f:
            r2 = r40
            r25 = r11
            int r0 = r7.f1394i
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.f1394i = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x0496
            r5 = 0
            r8 = r15[r5]
            if (r8 != r3) goto L_0x0496
            r5 = r15[r17]
            if (r5 != r3) goto L_0x0496
            r5 = r15[r16]
            if (r5 == r3) goto L_0x0494
            goto L_0x0496
        L_0x0494:
            r0 = r4
            goto L_0x04c2
        L_0x0496:
            r3 = r15[r16]
            r5 = 0
            r8 = r15[r5]
            r10 = r15[r17]
            int r0 = java.lang.Math.max(r0, r10)
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = java.lang.Math.max(r3, r0)
            r3 = r28[r16]
            r5 = r28[r5]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04c2:
            r3 = r0
            r0 = r6
            r23 = r9
        L_0x04c6:
            if (r26 != 0) goto L_0x04cd
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04cd
            goto L_0x04ce
        L_0x04cd:
            r0 = r3
        L_0x04ce:
            int r3 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x04f7
            r0 = r39
            r1 = r25
            r7.m1640g(r1, r0)
        L_0x04f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0364o0.mo2083t(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo2084u(int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cf, code lost:
        if (r15 > 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        if (r15 < 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dc, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02dd, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r0 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0329  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2085v(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f1394i = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f1390e
            boolean r15 = r7.f1396k
            r16 = 0
            r17 = 1
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r0 = r16
            r19 = r17
        L_0x002b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0199
            android.view.View r4 = r7.mo2063o(r6)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.f1394i
            int r10 = r7.mo2084u(r6)
            int r4 = r4 + r10
            r7.f1394i = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L_0x018d
        L_0x0048:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005f
            int r1 = r7.mo2060l(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L_0x018d
        L_0x005f:
            boolean r1 = r7.mo2067p(r6)
            if (r1 == 0) goto L_0x006c
            int r1 = r7.f1394i
            int r10 = r7.f1401p
            int r1 = r1 + r10
            r7.f1394i = r1
        L_0x006c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.o0$a r10 = (androidx.appcompat.widget.C0364o0.C0365a) r10
            float r1 = r10.weight
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.f1394i
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f1394i = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r18 = r17
            r8 = r24
            r29 = r26
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L_0x0114
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b5
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b7
        L_0x00b5:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b7:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            int r0 = r7.f1394i
            r23 = r0
            goto L_0x00c4
        L_0x00c2:
            r23 = 0
        L_0x00c4:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r28
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.mo2070s(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f1
            r10.height = r0
        L_0x00f1:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.f1394i
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.mo2062n(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1394i = r1
            if (r15 == 0) goto L_0x0113
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0114
        L_0x0113:
            r0 = r9
        L_0x0114:
            if (r14 < 0) goto L_0x011e
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011e
            int r1 = r7.f1394i
            r7.f1391f = r1
        L_0x011e:
            if (r11 >= r14) goto L_0x012f
            float r1 = r10.weight
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0127
            goto L_0x012f
        L_0x0127:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013d
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013d
            r1 = r17
            r20 = r1
            goto L_0x013e
        L_0x013d:
            r1 = 0
        L_0x013e:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0160
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0160
            r19 = r17
            goto L_0x0162
        L_0x0160:
            r19 = 0
        L_0x0162:
            float r8 = r10.weight
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0173
            if (r1 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r4
        L_0x016c:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L_0x017e
        L_0x0173:
            if (r1 == 0) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r2 = r4
        L_0x0177:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L_0x017e:
            int r2 = r7.mo2060l(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x018d:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L_0x002b
        L_0x0199:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.f1394i
            if (r2 <= 0) goto L_0x01b7
            r2 = r26
            boolean r3 = r7.mo2067p(r2)
            if (r3 == 0) goto L_0x01b9
            int r3 = r7.f1394i
            int r4 = r7.f1401p
            int r3 = r3 + r4
            r7.f1394i = r3
            goto L_0x01b9
        L_0x01b7:
            r2 = r26
        L_0x01b9:
            r3 = r24
            if (r15 == 0) goto L_0x0207
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c3
            if (r3 != 0) goto L_0x0207
        L_0x01c3:
            r4 = 0
            r7.f1394i = r4
            r4 = 0
        L_0x01c7:
            if (r4 >= r2) goto L_0x0207
            android.view.View r6 = r7.mo2063o(r4)
            if (r6 != 0) goto L_0x01d9
            int r6 = r7.f1394i
            int r11 = r7.mo2084u(r4)
            int r6 = r6 + r11
        L_0x01d6:
            r7.f1394i = r6
            goto L_0x0202
        L_0x01d9:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e5
            int r6 = r7.mo2060l(r6, r4)
            int r4 = r4 + r6
            goto L_0x0202
        L_0x01e5:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.o0$a r11 = (androidx.appcompat.widget.C0364o0.C0365a) r11
            int r14 = r7.f1394i
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo2062n(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01d6
        L_0x0202:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c7
        L_0x0207:
            int r4 = r7.f1394i
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f1394i = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f1394i
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0276
            if (r9 == 0) goto L_0x0235
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0235
            goto L_0x0276
        L_0x0235:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0271
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0271
            r1 = 0
        L_0x0240:
            if (r1 >= r2) goto L_0x0271
            android.view.View r3 = r7.mo2063o(r1)
            if (r3 == 0) goto L_0x026e
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0251
            goto L_0x026e
        L_0x0251:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.o0$a r9 = (androidx.appcompat.widget.C0364o0.C0365a) r9
            float r9 = r9.weight
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026e
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x026e:
            int r1 = r1 + 1
            goto L_0x0240
        L_0x0271:
            r11 = r34
            r1 = r8
            goto L_0x0361
        L_0x0276:
            float r10 = r7.f1395j
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x027d
            r0 = r10
        L_0x027d:
            r10 = 0
            r7.f1394i = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = r10
        L_0x0284:
            if (r8 >= r2) goto L_0x0350
            android.view.View r13 = r7.mo2063o(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0298
            r21 = r11
            r11 = r34
            goto L_0x0349
        L_0x0298:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.o0$a r14 = (androidx.appcompat.widget.C0364o0.C0365a) r14
            float r10 = r14.weight
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02f1
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02d2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02cf
            goto L_0x02d4
        L_0x02cf:
            if (r15 <= 0) goto L_0x02dc
            goto L_0x02dd
        L_0x02d2:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02d4:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02dd
        L_0x02dc:
            r15 = 0
        L_0x02dd:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x02f6
        L_0x02f1:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x02f6:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0314
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0317
            r0 = r17
            goto L_0x0318
        L_0x0314:
            r23 = r1
            r1 = -1
        L_0x0317:
            r0 = 0
        L_0x0318:
            if (r0 == 0) goto L_0x031b
            goto L_0x031c
        L_0x031b:
            r10 = r15
        L_0x031c:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x0329
            int r9 = r14.width
            if (r9 != r1) goto L_0x0329
            r9 = r17
            goto L_0x032a
        L_0x0329:
            r9 = 0
        L_0x032a:
            int r10 = r7.f1394i
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo2062n(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f1394i = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x0349:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0284
        L_0x0350:
            r11 = r34
            int r0 = r7.f1394i
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.f1394i = r0
            r0 = r9
        L_0x0361:
            if (r19 != 0) goto L_0x0368
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0368
            goto L_0x0369
        L_0x0368:
            r0 = r5
        L_0x0369:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0387
            r7.m1641h(r2, r6)
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0364o0.mo2085v(int, int):void");
    }
}
