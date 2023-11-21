package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.f */
public class C0473f extends ViewGroup {

    /* renamed from: d */
    C0466e f1987d;

    /* renamed from: androidx.constraintlayout.widget.f$a */
    public static class C0474a extends ConstraintLayout.C0455b {

        /* renamed from: A0 */
        public float f1988A0;

        /* renamed from: B0 */
        public float f1989B0;

        /* renamed from: C0 */
        public float f1990C0;

        /* renamed from: D0 */
        public float f1991D0;

        /* renamed from: E0 */
        public float f1992E0;

        /* renamed from: F0 */
        public float f1993F0;

        /* renamed from: G0 */
        public float f1994G0;

        /* renamed from: H0 */
        public float f1995H0;

        /* renamed from: I0 */
        public float f1996I0;

        /* renamed from: J0 */
        public float f1997J0;

        /* renamed from: x0 */
        public float f1998x0;

        /* renamed from: y0 */
        public boolean f1999y0;

        /* renamed from: z0 */
        public float f2000z0;

        public C0474a(int i, int i2) {
            super(i, i2);
            this.f1998x0 = 1.0f;
            this.f1999y0 = false;
            this.f2000z0 = 0.0f;
            this.f1988A0 = 0.0f;
            this.f1989B0 = 0.0f;
            this.f1990C0 = 0.0f;
            this.f1991D0 = 1.0f;
            this.f1992E0 = 1.0f;
            this.f1993F0 = 0.0f;
            this.f1994G0 = 0.0f;
            this.f1995H0 = 0.0f;
            this.f1996I0 = 0.0f;
            this.f1997J0 = 0.0f;
        }

        public C0474a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1998x0 = 1.0f;
            this.f1999y0 = false;
            this.f2000z0 = 0.0f;
            this.f1988A0 = 0.0f;
            this.f1989B0 = 0.0f;
            this.f1990C0 = 0.0f;
            this.f1991D0 = 1.0f;
            this.f1992E0 = 1.0f;
            this.f1993F0 = 0.0f;
            this.f1994G0 = 0.0f;
            this.f1995H0 = 0.0f;
            this.f1996I0 = 0.0f;
            this.f1997J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0478j.f2319l4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2328m4) {
                    this.f1998x0 = obtainStyledAttributes.getFloat(index, this.f1998x0);
                } else if (index == C0478j.f2427x4) {
                    this.f2000z0 = obtainStyledAttributes.getFloat(index, this.f2000z0);
                    this.f1999y0 = true;
                } else if (index == C0478j.f2400u4) {
                    this.f1989B0 = obtainStyledAttributes.getFloat(index, this.f1989B0);
                } else if (index == C0478j.f2409v4) {
                    this.f1990C0 = obtainStyledAttributes.getFloat(index, this.f1990C0);
                } else if (index == C0478j.f2391t4) {
                    this.f1988A0 = obtainStyledAttributes.getFloat(index, this.f1988A0);
                } else if (index == C0478j.f2373r4) {
                    this.f1991D0 = obtainStyledAttributes.getFloat(index, this.f1991D0);
                } else if (index == C0478j.f2382s4) {
                    this.f1992E0 = obtainStyledAttributes.getFloat(index, this.f1992E0);
                } else if (index == C0478j.f2337n4) {
                    this.f1993F0 = obtainStyledAttributes.getFloat(index, this.f1993F0);
                } else if (index == C0478j.f2346o4) {
                    this.f1994G0 = obtainStyledAttributes.getFloat(index, this.f1994G0);
                } else if (index == C0478j.f2355p4) {
                    this.f1995H0 = obtainStyledAttributes.getFloat(index, this.f1995H0);
                } else if (index == C0478j.f2364q4) {
                    this.f1996I0 = obtainStyledAttributes.getFloat(index, this.f1996I0);
                } else if (index == C0478j.f2418w4) {
                    this.f1997J0 = obtainStyledAttributes.getFloat(index, this.f1997J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0474a generateDefaultLayoutParams() {
        return new C0474a(-2, -2);
    }

    /* renamed from: b */
    public C0474a generateLayoutParams(AttributeSet attributeSet) {
        return new C0474a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0455b(layoutParams);
    }

    public C0466e getConstraintSet() {
        if (this.f1987d == null) {
            this.f1987d = new C0466e();
        }
        this.f1987d.mo2503j(this);
        return this.f1987d;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
