package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0218i;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.view.menu.C0232n;
import androidx.appcompat.widget.C0364o0;

public class ActionMenuView extends C0364o0 implements C0214g.C0216b, C0232n {

    /* renamed from: A */
    private int f926A;

    /* renamed from: B */
    private int f927B;

    /* renamed from: C */
    private int f928C;

    /* renamed from: D */
    C0252e f929D;

    /* renamed from: s */
    private C0214g f930s;

    /* renamed from: t */
    private Context f931t;

    /* renamed from: u */
    private int f932u;

    /* renamed from: v */
    private boolean f933v;

    /* renamed from: w */
    private C0299c f934w;

    /* renamed from: x */
    private C0230m.C0231a f935x;

    /* renamed from: y */
    C0214g.C0215a f936y;

    /* renamed from: z */
    private boolean f937z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0248a {
        /* renamed from: b */
        boolean mo701b();

        /* renamed from: c */
        boolean mo702c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0249b implements C0230m.C0231a {
        C0249b() {
        }

        /* renamed from: a */
        public void mo527a(C0214g gVar, boolean z) {
        }

        /* renamed from: b */
        public boolean mo528b(C0214g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0250c extends C0364o0.C0365a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f938a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f939b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f940c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f941d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f942e;

        /* renamed from: f */
        boolean f943f;

        public C0250c(int i, int i2) {
            super(i, i2);
            this.f938a = false;
        }

        public C0250c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0250c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0250c(C0250c cVar) {
            super(cVar);
            this.f938a = cVar.f938a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0251d implements C0214g.C0215a {
        C0251d() {
        }

        /* renamed from: a */
        public boolean mo494a(C0214g gVar, MenuItem menuItem) {
            C0252e eVar = ActionMenuView.this.f929D;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo495b(C0214g gVar) {
            C0214g.C0215a aVar = ActionMenuView.this.f936y;
            if (aVar != null) {
                aVar.mo495b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0252e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f927B = (int) (56.0f * f);
        this.f928C = (int) (f * 4.0f);
        this.f931t = context;
        this.f932u = 0;
    }

    /* renamed from: H */
    static int m1090H(View view, int i, int i2, int i3, int i4) {
        C0250c cVar = (C0250c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo711r();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f938a || !z2) {
            z = false;
        }
        cVar.f941d = z;
        cVar.f939b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: I */
    private void m1091I(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f927B;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z6) {
                    int i20 = this.f928C;
                    i7 = i19;
                    z4 = false;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    z4 = false;
                }
                C0250c cVar = (C0250c) childAt.getLayoutParams();
                cVar.f943f = z4;
                cVar.f940c = z4 ? 1 : 0;
                cVar.f939b = z4;
                cVar.f941d = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f942e = z6 && ((ActionMenuItemView) childAt).mo711r();
                int H = m1090H(childAt, i12, cVar.f938a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, H);
                if (cVar.f941d) {
                    i17++;
                }
                if (cVar.f938a) {
                    z5 = true;
                }
                i10 -= H;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (H == 1) {
                    j |= (long) (1 << i14);
                    i13 = i13;
                } else {
                    int i21 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i22 = size2;
        boolean z7 = z5 && i15 == 2;
        boolean z8 = false;
        while (true) {
            if (i17 <= 0 || i10 <= 0) {
                i5 = mode;
                i3 = i8;
                z = z8;
                i4 = i13;
            } else {
                int i23 = Integer.MAX_VALUE;
                int i24 = 0;
                int i25 = 0;
                long j2 = 0;
                while (i25 < childCount) {
                    boolean z9 = z8;
                    C0250c cVar2 = (C0250c) getChildAt(i25).getLayoutParams();
                    int i26 = i13;
                    if (cVar2.f941d) {
                        int i27 = cVar2.f939b;
                        if (i27 < i23) {
                            j2 = 1 << i25;
                            i23 = i27;
                            i24 = 1;
                        } else if (i27 == i23) {
                            i24++;
                            j2 |= 1 << i25;
                        }
                    }
                    i25++;
                    i13 = i26;
                    z8 = z9;
                }
                z = z8;
                i4 = i13;
                j |= j2;
                if (i24 > i10) {
                    i5 = mode;
                    i3 = i8;
                    break;
                }
                int i28 = i23 + 1;
                int i29 = 0;
                while (i29 < childCount) {
                    View childAt2 = getChildAt(i29);
                    C0250c cVar3 = (C0250c) childAt2.getLayoutParams();
                    int i30 = i8;
                    int i31 = mode;
                    long j3 = (long) (1 << i29);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f939b == i28) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f942e || i10 != 1) {
                            z3 = z7;
                        } else {
                            int i32 = this.f928C;
                            z3 = z7;
                            childAt2.setPadding(i32 + i12, 0, i32, 0);
                        }
                        cVar3.f939b++;
                        cVar3.f943f = true;
                        i10--;
                    }
                    i29++;
                    mode = i31;
                    i8 = i30;
                    z7 = z3;
                }
                i13 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i15 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i15 - 1 && !z10 && i16 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0250c) getChildAt(0).getLayoutParams()).f942e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount - 1;
                if ((j & ((long) (1 << i33))) != 0 && !((C0250c) getChildAt(i33).getLayoutParams()).f942e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i34 = bitCount > 0.0f ? (int) (((float) (i10 * i12)) / bitCount) : i6;
            z2 = z;
            for (int i35 = i6; i35 < childCount; i35++) {
                if ((j & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    C0250c cVar4 = (C0250c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f940c = i34;
                        cVar4.f943f = true;
                        if (i35 == 0 && !cVar4.f942e) {
                            cVar4.leftMargin = (-i34) / 2;
                        }
                        z2 = true;
                    } else if (cVar4.f938a) {
                        cVar4.f940c = i34;
                        cVar4.f943f = true;
                        cVar4.rightMargin = (-i34) / 2;
                        z2 = true;
                    } else {
                        if (i35 != 0) {
                            cVar4.leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            cVar4.rightMargin = i34 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i36 = i6; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                C0250c cVar5 = (C0250c) childAt4.getLayoutParams();
                if (cVar5.f943f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f939b * i12) + cVar5.f940c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C0250c mo1253k(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo1251i();
        }
        C0250c cVar = layoutParams instanceof C0250c ? new C0250c((C0250c) layoutParams) : new C0250c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: B */
    public C0250c mo1233B() {
        C0250c y = mo1251i();
        y.f938a = true;
        return y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo1234C(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0248a)) {
            z = false | ((C0248a) childAt).mo701b();
        }
        return (i <= 0 || !(childAt2 instanceof C0248a)) ? z : z | ((C0248a) childAt2).mo702c();
    }

    /* renamed from: D */
    public boolean mo1235D() {
        C0299c cVar = this.f934w;
        return cVar != null && cVar.mo1765B();
    }

    /* renamed from: E */
    public boolean mo1236E() {
        C0299c cVar = this.f934w;
        return cVar != null && cVar.mo1767D();
    }

    /* renamed from: F */
    public boolean mo1237F() {
        C0299c cVar = this.f934w;
        return cVar != null && cVar.mo1768E();
    }

    /* renamed from: G */
    public boolean mo1238G() {
        return this.f933v;
    }

    /* renamed from: J */
    public C0214g mo1239J() {
        return this.f930s;
    }

    /* renamed from: K */
    public void mo1240K(C0230m.C0231a aVar, C0214g.C0215a aVar2) {
        this.f935x = aVar;
        this.f936y = aVar2;
    }

    /* renamed from: L */
    public boolean mo1241L() {
        C0299c cVar = this.f934w;
        return cVar != null && cVar.mo1774K();
    }

    /* renamed from: a */
    public boolean mo723a(C0218i iVar) {
        return this.f930s.mo870L(iVar, 0);
    }

    /* renamed from: b */
    public void mo724b(C0214g gVar) {
        this.f930s = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0250c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f930s == null) {
            Context context = getContext();
            C0214g gVar = new C0214g(context);
            this.f930s = gVar;
            gVar.mo875R(new C0251d());
            C0299c cVar = new C0299c(context);
            this.f934w = cVar;
            cVar.mo1773J(true);
            C0299c cVar2 = this.f934w;
            C0230m.C0231a aVar = this.f935x;
            if (aVar == null) {
                aVar = new C0249b();
            }
            cVar2.mo803h(aVar);
            this.f930s.mo895c(this.f934w, this.f931t);
            this.f934w.mo1771H(this);
        }
        return this.f930s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f934w.mo1764A();
    }

    public int getPopupTheme() {
        return this.f932u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0299c cVar = this.f934w;
        if (cVar != null) {
            cVar.mo798b(false);
            if (this.f934w.mo1768E()) {
                this.f934w.mo1765B();
                this.f934w.mo1774K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1264x();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f937z) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0385r1.m1722b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0250c cVar = (C0250c) childAt.getLayoutParams();
                if (cVar.f938a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1234C(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1234C(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0250c cVar2 = (C0250c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f938a) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0250c cVar3 = (C0250c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f938a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0214g gVar;
        boolean z = this.f937z;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f937z = z2;
        if (z != z2) {
            this.f926A = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f937z || (gVar = this.f930s) == null || size == this.f926A)) {
            this.f926A = size;
            gVar.mo869K(true);
        }
        int childCount = getChildCount();
        if (!this.f937z || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0250c cVar = (C0250c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1091I(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f934w.mo1770G(z);
    }

    public void setOnMenuItemClickListener(C0252e eVar) {
        this.f929D = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f934w.mo1772I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f933v = z;
    }

    public void setPopupTheme(int i) {
        if (this.f932u != i) {
            this.f932u = i;
            if (i == 0) {
                this.f931t = getContext();
            } else {
                this.f931t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0299c cVar) {
        this.f934w = cVar;
        cVar.mo1771H(this);
    }

    /* renamed from: x */
    public void mo1264x() {
        C0299c cVar = this.f934w;
        if (cVar != null) {
            cVar.mo1775y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C0250c mo1251i() {
        C0250c cVar = new C0250c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: z */
    public C0250c mo1252j(AttributeSet attributeSet) {
        return new C0250c(getContext(), attributeSet);
    }
}
