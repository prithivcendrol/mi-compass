package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.C1148t;

@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* renamed from: d */
    private int f3701d;

    /* renamed from: e */
    private int f3702e;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3701d = Integer.MAX_VALUE;
        this.f3702e = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148t.f3766D0, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(C1148t.f3770F0, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(C1148t.f3768E0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    public int getMaxHeight() {
        return this.f3702e;
    }

    public int getMaxWidth() {
        return this.f3701d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f3702e = i;
        super.setMaxHeight(i);
    }

    public void setMaxWidth(int i) {
        this.f3701d = i;
        super.setMaxWidth(i);
    }
}
