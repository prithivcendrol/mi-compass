package miuix.pickerwidget.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p091o3.C2503e;

public class NumberPickerGroup extends LinearLayout {

    /* renamed from: d */
    private final Paint f8999d = new Paint();

    public NumberPickerGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m9911a(NumberPicker numberPicker) {
        return numberPicker.getId() == C2503e.f9753b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 0) {
            int childCount = getChildCount();
            int i3 = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt instanceof NumberPicker) {
                    NumberPicker numberPicker = (NumberPicker) childAt;
                    f4 += numberPicker.getDisplayedMaxTextWidth();
                    float originalLabelWidth = numberPicker.getOriginalLabelWidth();
                    if (originalLabelWidth > 0.0f) {
                        f2 += originalLabelWidth;
                        f3 += (float) numberPicker.getMarginLabelLeft();
                    }
                    f = Math.max(f, (float) numberPicker.getOriginTextSizeHighlight());
                } else {
                    i3 += childAt.getMeasuredWidth();
                }
            }
            this.f8999d.setTextSize(f);
            float measureText = this.f8999d.measureText("    ");
            float f5 = f4 + (f2 * 2.0f) + measureText;
            float measuredWidth = ((float) (getMeasuredWidth() - i3)) - (f3 * 2.0f);
            float f6 = measuredWidth / f5;
            float f7 = f6 < 1.0f ? f6 * f : f;
            if (f7 <= f) {
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 instanceof NumberPicker) {
                        NumberPicker numberPicker2 = (NumberPicker) childAt2;
                        numberPicker2.setTextSizeHighlight((int) f7);
                        numberPicker2.setTextSizeHint((int) ((((float) numberPicker2.getOriginTextSizeHint()) * f7) / f));
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) ((numberPicker2.getOriginalLabelWidth() > 0.0f ? (float) (numberPicker2.getMarginLabelLeft() * 2) : 0.0f) + ((((m9911a(numberPicker2) ? numberPicker2.getDisplayedMaxTextWidth() + measureText : numberPicker2.getDisplayedMaxTextWidth()) + (numberPicker2.getOriginalLabelWidth() * 2.0f)) * measuredWidth) / f5)), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                    }
                }
            }
        }
    }
}
