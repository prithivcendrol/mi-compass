package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import p146z1.C2967c;

public class CheckedTextView extends C1982a {

    /* renamed from: l */
    private static final int[] f7427l = {16842912};

    /* renamed from: h */
    private Drawable f7428h;

    /* renamed from: i */
    private boolean f7429i;

    /* renamed from: j */
    private boolean f7430j;

    /* renamed from: k */
    private int f7431k;

    public CheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public CheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7429i = true;
        this.f7430j = false;
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
        this.f7431k = (int) getContext().getResources().getDimension(C2967c.f11210a);
    }

    /* renamed from: a */
    private void m8044a(Canvas canvas, boolean z) {
        Drawable checkMarkDrawable = getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            int intrinsicWidth = checkMarkDrawable.getCurrent().getIntrinsicWidth();
            int paddingLeft = (z ? getPaddingLeft() : (getWidth() - getPaddingRight()) - intrinsicWidth) + getScrollX();
            int paddingTop = getPaddingTop();
            int paddingTop2 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int intrinsicHeight = checkMarkDrawable.getIntrinsicHeight();
            if (checkMarkDrawable.getCurrent() instanceof NinePatchDrawable) {
                intrinsicHeight = (getHeight() - paddingTop) - getPaddingBottom();
            } else {
                int gravity = getGravity() & 112;
                if (gravity == 16) {
                    paddingTop = m8045b(getHeight(), intrinsicHeight, paddingTop2, paddingBottom);
                } else if (gravity == 80) {
                    paddingTop = getHeight() - intrinsicHeight;
                }
            }
            checkMarkDrawable.setBounds(paddingLeft, paddingTop, intrinsicWidth + paddingLeft, intrinsicHeight + paddingTop);
            checkMarkDrawable.draw(canvas);
        }
    }

    /* renamed from: b */
    public static int m8045b(int i, int i2, int i3, int i4) {
        return ((((i - i3) - i4) - i2) / 2) + i3;
    }

    private int getCheckWidth() {
        Drawable checkMarkDrawable = getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return 0;
        }
        return checkMarkDrawable.getCurrent().getIntrinsicWidth();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f7428h != null) {
            this.f7428h.setState(getDrawableState());
            invalidate();
        }
    }

    public Drawable getCheckMarkDrawable() {
        return this.f7428h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7428h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7431k = (int) getContext().getResources().getDimension(C2967c.f11210a);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7427l);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (this.f7429i) {
            m8044a(canvas, z);
        }
        if (getCheckMarkDrawable() != null) {
            this.f7430j = getCheckMarkDrawable().getClass().isAssignableFrom(StateListDrawable.class);
        } else {
            this.f7430j = false;
        }
        if (z && this.f7429i && this.f7430j) {
            canvas.save();
            canvas.translate((float) getCheckWidth(), 0.0f);
        }
        super.onDraw(canvas);
        if (z && this.f7429i && this.f7430j) {
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int checkWidth = getCheckWidth();
        if (checkWidth > 0) {
            if (TextUtils.isEmpty(getText())) {
                this.f7429i = true;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(checkWidth, View.MeasureSpec.getMode(i)), i2);
                setMeasuredDimension(checkWidth, getMeasuredHeight());
                return;
            } else if (size - getPaddingEnd() < checkWidth * 2) {
                this.f7429i = false;
                checkWidth = 0;
            } else {
                this.f7429i = true;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size - checkWidth, View.MeasureSpec.getMode(i)), i2);
        if (checkWidth != 0) {
            setMeasuredDimension(getMeasuredWidth() + checkWidth, getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        requestLayout();
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7428h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7428h);
        }
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setState(f7427l);
            setMinHeight(drawable.getIntrinsicHeight());
            drawable.setState(getDrawableState());
        }
        this.f7428h = drawable;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7428h;
    }
}
