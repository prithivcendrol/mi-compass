package miuix.stretchablewidget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class WidgetContainer extends LinearLayout {
    public WidgetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public float getWidgetHeight() {
        return (float) getHeight();
    }

    public void setWidgetHeight(float f) {
        if (f >= 0.0f) {
            getLayoutParams().height = (int) f;
            requestLayout();
        }
    }
}
