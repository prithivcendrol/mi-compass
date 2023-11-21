package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import miuix.appcompat.internal.view.menu.action.C2233c;
import p018c2.C1350f;
import p055i3.C1656j;

public class EndActionMenuView extends C2233c {

    /* renamed from: i */
    private Context f8384i;

    /* renamed from: j */
    private int f8385j;

    /* renamed from: k */
    private int f8386k;

    /* renamed from: l */
    private int f8387l = 0;

    /* renamed from: m */
    private int f8388m = 0;

    /* renamed from: n */
    private int f8389n = 0;

    /* renamed from: o */
    private int f8390o = 0;

    public EndActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setBackground((Drawable) null);
        this.f8384i = context;
        this.f8388m = context.getResources().getDimensionPixelSize(C1350f.f4676z);
        this.f8389n = context.getResources().getDimensionPixelSize(C1350f.f4605A);
        this.f8387l = context.getResources().getDimensionPixelSize(C1350f.f4675y);
    }

    private int getActionMenuItemCount() {
        return getChildCount();
    }

    /* renamed from: o */
    private boolean m9263o(View view) {
        return false;
    }

    /* renamed from: a */
    public boolean mo8193a() {
        return false;
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
            boolean r1 = r4.m9263o(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.action.EndActionMenuView.mo8195d(int):boolean");
    }

    public int getCollapsedHeight() {
        return this.f8386k;
    }

    /* renamed from: j */
    public C2233c.C2234a mo8234j(View view) {
        C2233c.C2234a i = generateLayoutParams(view.getLayoutParams());
        i.f8501a = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int childCount = getChildCount();
        int i6 = this.f8389n;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!m9263o(childAt)) {
                C1656j.m6986e(this, childAt, i6, 0, i6 + childAt.getMeasuredWidth(), i5);
                i6 += childAt.getMeasuredWidth() + this.f8388m;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        this.f8390o = actionMenuItemCount;
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.f8386k = 0;
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int min = Math.min(size / this.f8390o, this.f8387l);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!m9263o(childAt)) {
                measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                i3 += Math.min(childAt.getMeasuredWidth(), min);
                i4 = Math.max(i4, childAt.getMeasuredHeight());
            }
        }
        int i6 = this.f8388m * (this.f8390o - 1);
        int i7 = this.f8389n;
        if (i7 + i3 + i6 > size) {
            this.f8388m = 0;
        }
        int i8 = i3 + i6 + i7;
        this.f8385j = i8;
        this.f8386k = i4;
        setMeasuredDimension(i8, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableBlur(boolean z) {
    }

    public void setSupportBlur(boolean z) {
    }
}
