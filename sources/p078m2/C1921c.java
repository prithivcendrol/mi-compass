package p078m2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import p018c2.C1349e;

/* renamed from: m2.c */
public class C1921c extends TextView {

    /* renamed from: d */
    private ColorStateList f7299d;

    /* renamed from: e */
    private boolean f7300e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f7301f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f7302g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f7303h;

    /* renamed from: i */
    private ValueAnimator f7304i;

    /* renamed from: m2.c$a */
    class C1922a implements ValueAnimator.AnimatorUpdateListener {
        C1922a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int unused = C1921c.this.f7303h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C1921c.this.invalidate();
        }
    }

    /* renamed from: m2.c$b */
    class C1923b extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ boolean f7306d;

        C1923b(boolean z) {
            this.f7306d = z;
        }

        public void onAnimationEnd(Animator animator) {
            C1921c cVar;
            int i;
            if (this.f7306d) {
                cVar = C1921c.this;
                i = cVar.f7302g;
            } else {
                cVar = C1921c.this;
                i = cVar.f7301f;
            }
            cVar.setTextColor(i);
        }
    }

    public C1921c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7856d();
    }

    /* renamed from: d */
    private void m7856d() {
        ColorStateList textColors = getTextColors();
        this.f7299d = textColors;
        int colorForState = textColors.getColorForState(TextView.ENABLED_STATE_SET, getResources().getColor(C1349e.f4599c));
        this.f7301f = colorForState;
        int colorForState2 = this.f7299d.getColorForState(TextView.ENABLED_SELECTED_STATE_SET, colorForState);
        this.f7302g = colorForState2;
        if (this.f7301f != colorForState2) {
            this.f7300e = true;
        }
    }

    /* renamed from: e */
    public void mo6493e(boolean z, boolean z2) {
        if (!z2) {
            setTextColor(z ? this.f7302g : this.f7301f);
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f7304i;
        if (valueAnimator == null) {
            this.f7304i = new ValueAnimator();
        } else {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f7304i;
        int[] iArr = new int[2];
        int currentTextColor = getCurrentTextColor();
        if (z) {
            iArr[0] = currentTextColor;
            iArr[1] = this.f7302g;
            valueAnimator2.setIntValues(iArr);
        } else {
            iArr[0] = currentTextColor;
            iArr[1] = this.f7301f;
            valueAnimator2.setIntValues(iArr);
        }
        this.f7304i.setDuration(50);
        this.f7304i.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f7304i.setEvaluator(new ArgbEvaluator());
        this.f7304i.addUpdateListener(new C1922a());
        this.f7304i.addListener(new C1923b(z));
        this.f7304i.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        if (!this.f7300e || (valueAnimator = this.f7304i) == null || !valueAnimator.isRunning()) {
            super.onDraw(canvas);
            return;
        }
        setTextColor(this.f7303h);
        super.onDraw(canvas);
    }

    public void setSelected(boolean z) {
        super.setSelected(false);
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m7856d();
    }
}
