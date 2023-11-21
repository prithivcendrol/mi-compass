package miuix.pickerwidget.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p055i3.C1656j;
import p091o3.C2508j;

public class ProperPaddingViewGroup extends ViewGroup {

    /* renamed from: d */
    private final float f8840d;

    /* renamed from: e */
    private boolean f8841e;

    /* renamed from: f */
    private final int f8842f;

    /* renamed from: g */
    private final int f8843g;

    /* renamed from: h */
    private final int f8844h;

    /* renamed from: i */
    private final int f8845i;

    /* renamed from: j */
    private int f8846j;

    /* renamed from: k */
    private int f8847k;

    /* renamed from: l */
    private int f8848l;

    /* renamed from: m */
    private int f8849m;

    /* renamed from: n */
    private View f8850n;

    public ProperPaddingViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProperPaddingViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8841e = false;
        this.f8846j = Integer.MIN_VALUE;
        this.f8847k = Integer.MIN_VALUE;
        TypedArray typedArray = null;
        this.f8850n = null;
        this.f8840d = context.getResources().getDisplayMetrics().density;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, C2508j.f9880l0);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C2508j.f9882m0, 0);
            this.f8842f = typedArray.getDimensionPixelSize(C2508j.f9886o0, dimensionPixelSize);
            this.f8843g = typedArray.getDimensionPixelSize(C2508j.f9884n0, dimensionPixelSize);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C2508j.f9888p0, 0);
            this.f8844h = typedArray.getDimensionPixelSize(C2508j.f9892r0, dimensionPixelSize2);
            this.f8845i = typedArray.getDimensionPixelSize(C2508j.f9890q0, dimensionPixelSize2);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 1) {
            this.f8850n = getChildAt(0);
            return;
        }
        throw new IllegalStateException("Only one child view can be added into the ProperPaddingViewGroup!");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C1656j.m6983b(this) ? this.f8849m : this.f8848l;
        this.f8850n.layout(i5, 0, this.f8850n.getMeasuredWidth() + i5, this.f8850n.getMeasuredHeight() + 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        float f = (float) size;
        float f2 = this.f8840d;
        float f3 = f / f2;
        if (this.f8841e) {
            this.f8848l = this.f8846j;
            i3 = this.f8847k;
        } else if (f3 <= 340.0f) {
            int i4 = ((int) (f - (f2 * 290.0f))) / 2;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = i4 / 2;
            this.f8848l = this.f8844h + i5;
            this.f8849m = this.f8845i + i5;
            this.f8850n.measure(ViewGroup.getChildMeasureSpec(i, this.f8848l + this.f8849m, this.f8850n.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, this.f8850n.getLayoutParams().height));
            setMeasuredDimension(size, this.f8850n.getMeasuredHeight());
        } else {
            this.f8848l = this.f8842f;
            i3 = this.f8843g;
        }
        this.f8849m = i3;
        this.f8850n.measure(ViewGroup.getChildMeasureSpec(i, this.f8848l + this.f8849m, this.f8850n.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, this.f8850n.getLayoutParams().height));
        setMeasuredDimension(size, this.f8850n.getMeasuredHeight());
    }
}
