package miuix.appcompat.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import miuix.view.C2401f;
import p018c2.C1350f;
import p055i3.C1656j;

public class DialogButtonPanel extends LinearLayout {

    /* renamed from: d */
    private int f8599d;

    /* renamed from: e */
    private int f8600e;

    /* renamed from: f */
    private int f8601f;

    /* renamed from: g */
    private int f8602g;

    /* renamed from: h */
    private int f8603h;

    /* renamed from: i */
    private int f8604i;

    /* renamed from: j */
    private boolean f8605j;

    /* renamed from: k */
    private float f8606k;

    public DialogButtonPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogButtonPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8606k = 17.0f;
        Resources resources = getResources();
        this.f8601f = resources.getDimensionPixelOffset(C1350f.f4613I);
        this.f8602g = resources.getDimensionPixelOffset(C1350f.f4611G);
        this.f8603h = resources.getDimensionPixelOffset(C1350f.f4612H);
        this.f8604i = resources.getDimensionPixelOffset(C1350f.f4606B);
        int i2 = resources.getConfiguration().densityDpi;
        this.f8600e = i2;
        this.f8599d = i2;
    }

    /* renamed from: a */
    private void m9548a(int i) {
        boolean c = m9550c((i - getPaddingStart()) - getPaddingEnd());
        int childCount = getChildCount();
        if (c) {
            setOrientation(1);
            setPadding(this.f8601f, getPaddingTop(), this.f8601f, getPaddingBottom());
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                boolean z = childAt.getVisibility() == 0;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = this.f8604i;
                layoutParams.weight = 0.0f;
                layoutParams.topMargin = z ? i2 : 0;
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
                if (z) {
                    i2 = this.f8603h;
                }
            }
            return;
        }
        setOrientation(0);
        setPadding(this.f8601f, getPaddingTop(), this.f8601f, getPaddingBottom());
        boolean b = C1656j.m6983b(this);
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            boolean z2 = childAt2.getVisibility() == 0;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.height = this.f8604i;
            layoutParams2.weight = 1.0f;
            layoutParams2.topMargin = 0;
            if (!z2) {
                layoutParams2.rightMargin = 0;
                layoutParams2.leftMargin = 0;
            } else if (b) {
                layoutParams2.rightMargin = i4;
            } else {
                layoutParams2.leftMargin = i4;
            }
            if (z2) {
                i4 = this.f8602g;
            }
        }
    }

    /* renamed from: b */
    private boolean m9549b(TextView textView, int i) {
        return ((int) textView.getPaint().measureText(textView.getText().toString())) > (i - textView.getPaddingStart()) - textView.getPaddingEnd();
    }

    /* renamed from: c */
    private boolean m9550c(int i) {
        if (this.f8605j) {
            return true;
        }
        int childCount = getChildCount();
        int i2 = childCount;
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() == 8) {
                i2--;
            }
        }
        if (i2 < 2) {
            return false;
        }
        if (i2 >= 3) {
            return true;
        }
        int i4 = (i - this.f8602g) / 2;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((childAt instanceof TextView) && childAt.getVisibility() == 0 && m9549b((TextView) childAt, i4)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f8600e;
        this.f8599d = i;
        int i2 = configuration.densityDpi;
        if (i != i2) {
            this.f8600e = i2;
            float f = (((float) i2) * 1.0f) / ((float) i);
            this.f8601f = (int) (((float) this.f8601f) * f);
            this.f8602g = (int) (((float) this.f8602g) * f);
            this.f8603h = (int) (((float) this.f8603h) * f);
            this.f8604i = (int) (((float) this.f8604i) * f);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof TextView) {
                    C2401f.m10243b((TextView) childAt, this.f8606k);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m9548a(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    public void setForceVertical(boolean z) {
        this.f8605j = z;
    }
}
