package miuix.miuixbasewidget.widget.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import p055i3.C1656j;
import p067k3.C1789c;
import p117t2.C2698f;

/* renamed from: miuix.miuixbasewidget.widget.internal.a */
public class C2313a extends FrameLayout {

    /* renamed from: d */
    private int f8829d;

    /* renamed from: e */
    private int f8830e;

    /* renamed from: f */
    private int f8831f;

    /* renamed from: g */
    private int f8832g;

    /* renamed from: h */
    private int f8833h;

    /* renamed from: i */
    private int f8834i;

    /* renamed from: j */
    private boolean f8835j;

    /* renamed from: k */
    private int f8836k;

    /* renamed from: l */
    private int f8837l;

    /* renamed from: m */
    private final List<View> f8838m;

    /* renamed from: n */
    private final List<View> f8839n;

    public C2313a(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2313a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2313a(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C2313a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f8835j = false;
        this.f8837l = 0;
        this.f8838m = new ArrayList();
        this.f8839n = new ArrayList();
        m9766b();
    }

    /* renamed from: a */
    private boolean m9765a(View view) {
        return view.getVisibility() == 8;
    }

    /* renamed from: b */
    private void m9766b() {
        Context context = getContext();
        Resources resources = getResources();
        this.f8829d = resources.getDimensionPixelSize(C1789c.f6881c);
        this.f8830e = resources.getDimensionPixelSize(C1789c.f6882d);
        this.f8832g = C2698f.m11275c(context, 220.0f);
        this.f8833h = C2698f.m11275c(context, 180.0f);
        this.f8834i = C2698f.m11275c(context, 150.0f);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.densityDpi;
        if (i != this.f8831f) {
            this.f8831f = i;
            m9766b();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = this.f8830e;
        int paddingStart = this.f8835j ? getPaddingStart() + ((getMeasuredWidth() - this.f8836k) / 2) : getPaddingStart();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!m9765a(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth() + paddingStart;
                C1656j.m6986e(this, childAt, paddingStart, i5, measuredWidth, i5 + childAt.getMeasuredHeight());
                paddingStart = measuredWidth + this.f8829d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f8835j = false;
        this.f8836k = 0;
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            if (!m9765a(getChildAt(i4))) {
                i3++;
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (this.f8837l == 1) {
                childAt.setMinimumWidth(i3 <= 2 ? this.f8832g : i3 == 3 ? this.f8833h : this.f8834i);
            } else {
                childAt.setMinimumWidth(0);
            }
        }
        super.onMeasure(i, i2);
        if (i3 > 0) {
            this.f8838m.clear();
            this.f8839n.clear();
            int size = View.MeasureSpec.getSize(i);
            int paddingStart = getPaddingStart() + getPaddingEnd();
            int i6 = i3 > 1 ? (i3 - 1) * this.f8829d : 0;
            int i7 = (size - paddingStart) - i6;
            int i8 = i7 / i3;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = getChildAt(i11);
                if (!m9765a(childAt2)) {
                    int measuredWidth = childAt2.getMeasuredWidth();
                    i6 += measuredWidth;
                    if (measuredWidth > i8) {
                        this.f8838m.add(childAt2);
                        i10 += measuredWidth;
                    } else {
                        this.f8839n.add(childAt2);
                        i9 += measuredWidth;
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                }
            }
            int measuredHeight = getMeasuredHeight() + (this.f8830e * 2);
            if (i6 > i7) {
                setMeasuredDimension(i6 + paddingStart, measuredHeight);
                return;
            }
            int i12 = this.f8837l;
            if (i12 == 0) {
                if (this.f8838m.isEmpty()) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt3 = getChildAt(i13);
                        if (!m9765a(childAt3)) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824));
                        }
                    }
                } else if (i9 > 0) {
                    int size2 = this.f8839n.size();
                    int i14 = i7 - i10;
                    for (int i15 = 0; i15 < size2; i15++) {
                        View view = this.f8839n.get(i15);
                        int measuredWidth2 = (int) (((((float) view.getMeasuredWidth()) * 1.0f) / ((float) i9)) * ((float) i14));
                        if (!m9765a(view)) {
                            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
            } else if (i12 == 1) {
                this.f8835j = true;
                this.f8836k = i6;
            } else {
                throw new IllegalStateException("Illegal layout mode: " + this.f8837l);
            }
            setMeasuredDimension(size, measuredHeight);
        }
    }

    public void setTabViewLayoutMode(int i) {
        if (this.f8837l != i) {
            this.f8837l = i;
            requestLayout();
        }
    }
}
