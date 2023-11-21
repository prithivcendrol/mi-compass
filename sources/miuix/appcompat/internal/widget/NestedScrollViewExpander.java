package miuix.appcompat.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class NestedScrollViewExpander extends ViewGroup {

    /* renamed from: d */
    private View f8633d;

    /* renamed from: e */
    private int f8634e;

    public NestedScrollViewExpander(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = (((((i3 - i) - measuredWidth) / 2) + i) + marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
            int i7 = marginLayoutParams.topMargin + i2;
            childAt.layout(i6, i7, measuredWidth + i6, i7 + measuredHeight);
            i2 = i2 + marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(this.f8634e);
        if (mode == 0) {
            mode = Integer.MIN_VALUE;
        }
        int i3 = mode;
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!(childAt.getVisibility() == 8 || this.f8633d == childAt)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i5 += childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        int size2 = View.MeasureSpec.getSize(this.f8634e) - i5;
        View view = this.f8633d;
        if (!(view == null || view.getVisibility() == 8)) {
            if (size2 < this.f8633d.getMinimumHeight()) {
                size2 = this.f8633d.getMinimumHeight();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f8633d.getLayoutParams();
            measureChildWithMargins(this.f8633d, i, 0, View.MeasureSpec.makeMeasureSpec(size2, i3), 0);
            i4 = this.f8633d.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
        }
        setMeasuredDimension(size, i4 + i5);
    }

    public void setExpandView(View view) {
        this.f8633d = view;
    }

    /* access modifiers changed from: package-private */
    public void setParentHeightMeasureSpec(int i) {
        this.f8634e = i;
    }
}
