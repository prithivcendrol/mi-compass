package miuix.appcompat.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;

public class NestedScrollViewExpandContainer extends NestedScrollView {
    public NestedScrollViewExpandContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        ((NestedScrollViewExpander) view).setParentHeightMeasureSpec(i2);
        view.forceLayout();
        super.measureChild(view, i, i2);
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ((NestedScrollViewExpander) view).setParentHeightMeasureSpec(i3);
        view.forceLayout();
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }
}
