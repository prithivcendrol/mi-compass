package miuix.appcompat.internal.app.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import p018c2.C1349e;
import p055i3.C1656j;

/* renamed from: miuix.appcompat.internal.app.widget.w */
public class C2214w extends TextView {

    /* renamed from: d */
    private ColorStateList f8344d;

    /* renamed from: e */
    private int f8345e;

    /* renamed from: f */
    private int f8346f;

    /* renamed from: g */
    private ValueAnimator f8347g;

    /* renamed from: h */
    private int f8348h;

    /* renamed from: i */
    private boolean f8349i;

    public C2214w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9230a();
    }

    /* renamed from: a */
    private void m9230a() {
        ColorStateList textColors = getTextColors();
        this.f8344d = textColors;
        this.f8345e = textColors.getColorForState(TextView.ENABLED_STATE_SET, getResources().getColor(C1349e.f4597a));
        this.f8346f = this.f8344d.getColorForState(TextView.ENABLED_SELECTED_STATE_SET, getResources().getColor(C1349e.f4598b));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        ValueAnimator valueAnimator = this.f8347g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.onDraw(canvas);
            return;
        }
        int i2 = ((!this.f8349i || isSelected()) && (this.f8349i || !isSelected())) ? this.f8346f : this.f8345e;
        setTextColor(i2);
        boolean b = C1656j.m6983b(this);
        int i3 = this.f8348h;
        int height = getHeight();
        if (b) {
            i = getScrollX() + 0;
            i3 += getScrollX();
        } else {
            i = 0;
        }
        canvas.save();
        canvas.clipRect(i, 0, i3, height);
        super.onDraw(canvas);
        canvas.restore();
        int i4 = this.f8345e;
        if (i2 == i4) {
            i2 = this.f8346f;
        } else if (i2 == this.f8346f) {
            i2 = i4;
        }
        setTextColor(i2);
        int i5 = this.f8348h;
        int width = getWidth();
        if (b) {
            i5 += getScrollX();
            width += getScrollX();
        }
        canvas.save();
        canvas.clipRect(i5, 0, width, height);
        super.onDraw(canvas);
        canvas.restore();
        setTextColor(this.f8344d);
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m9230a();
    }
}
