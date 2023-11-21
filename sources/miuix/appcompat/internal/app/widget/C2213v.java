package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import miuix.appcompat.internal.app.widget.ScrollingTabContainerView;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1354j;

/* renamed from: miuix.appcompat.internal.app.widget.v */
public class C2213v extends ScrollingTabContainerView {

    /* renamed from: t */
    private int[] f8343t;

    public C2213v(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
        int[] iArr = new int[3];
        this.f8343t = iArr;
        iArr[0] = context.getResources().getDimensionPixelSize(C1350f.f4649j);
        this.f8343t[1] = context.getResources().getDimensionPixelSize(C1350f.f4651k);
        this.f8343t[2] = context.getResources().getDimensionPixelSize(C1350f.f4653l);
    }

    /* renamed from: m */
    private void m9229m(int[] iArr, int i, int i2) {
        int i3 = iArr[0];
        int tabViewMarginHorizontal = getTabViewMarginHorizontal();
        for (int i4 = 0; i4 < iArr.length; i4++) {
            i3 = iArr[i4];
            TextPaint textPaint = null;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f8123i.getChildCount(); i6++) {
                TextView textView = ((ScrollingTabContainerView.TabView) this.f8123i.getChildAt(i6)).getTextView();
                if (textView != null) {
                    if (textPaint == null) {
                        textPaint = new TextPaint(textView.getPaint());
                        i5 += tabViewMarginHorizontal;
                    }
                    textPaint.setTextSize((float) i3);
                    i5 = (int) (((float) i5) + textPaint.measureText(textView.getText().toString()));
                }
            }
            if (i5 <= Math.max(getMeasuredWidth(), View.MeasureSpec.getSize(i))) {
                break;
            }
        }
        for (int i7 = 0; i7 < this.f8123i.getChildCount(); i7++) {
            TextView textView2 = ((ScrollingTabContainerView.TabView) this.f8123i.getChildAt(i7)).getTextView();
            if (textView2 != null) {
                textView2.setTextSize(0, (float) i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int getDefaultTabTextStyle() {
        return C1347c.f4577k;
    }

    /* access modifiers changed from: package-private */
    public int getTabBarLayoutRes() {
        return C1354j.f4766i;
    }

    /* access modifiers changed from: package-private */
    public int getTabContainerHeight() {
        return -2;
    }

    /* access modifiers changed from: package-private */
    public int getTabViewLayoutRes() {
        return C1354j.f4764g;
    }

    /* access modifiers changed from: package-private */
    public int getTabViewMarginHorizontal() {
        return getContext().getResources().getDimensionPixelOffset(C1350f.f4647i);
    }

    public void onMeasure(int i, int i2) {
        m9229m(this.f8343t, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        super.onMeasure(i, i2);
    }
}
