package miuix.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextAlignLayout extends LinearLayout {
    public TextAlignLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        boolean z = true;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (z && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                z = textView.getLineCount() <= 1;
                if (z) {
                    textView.setGravity(1);
                }
            }
        }
    }
}
