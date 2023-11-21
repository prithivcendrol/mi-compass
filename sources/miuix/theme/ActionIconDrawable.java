package miuix.theme;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;

public class ActionIconDrawable extends VectorDrawable {
    private static final int[] STATE_DISABLED = {-16842910};
    private static final int[] STATE_PRESSED = {16842910, 16842919};
    private int mActionIconHeight;
    private int mActionIconWidth;
    private float mDisabledAlpha = 0.3f;
    private float mNormalAlpha = 0.8f;
    private float mPressedAlpha = 0.5f;

    private void init(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, C2394a.f9340a, 0, 0) : resources.obtainAttributes(attributeSet, C2394a.f9340a);
        this.mNormalAlpha = obtainStyledAttributes.getFloat(C2394a.f9343d, 0.0f);
        this.mPressedAlpha = obtainStyledAttributes.getFloat(C2394a.f9344e, 0.0f);
        this.mDisabledAlpha = obtainStyledAttributes.getFloat(C2394a.f9341b, 0.0f);
        this.mActionIconWidth = obtainStyledAttributes.getDimensionPixelSize(C2394a.f9345f, 0);
        this.mActionIconHeight = obtainStyledAttributes.getDimensionPixelSize(C2394a.f9342c, 0);
        obtainStyledAttributes.recycle();
        setAlphaF(this.mNormalAlpha);
    }

    private void setAlphaF(float f) {
        setAlpha((int) (f * 255.0f));
    }

    private boolean toDisabledState() {
        setAlphaF(this.mDisabledAlpha);
        return true;
    }

    private boolean toNormalState() {
        setAlphaF(this.mNormalAlpha);
        return true;
    }

    private boolean toPressedState() {
        setAlphaF(this.mPressedAlpha);
        return true;
    }

    public void draw(Canvas canvas) {
        int i = this.mActionIconWidth;
        if (!(i == 0 || this.mActionIconHeight == 0)) {
            canvas.translate((float) ((i - super.getIntrinsicWidth()) >> 1), (float) ((this.mActionIconHeight - super.getIntrinsicHeight()) >> 1));
            canvas.scale(((float) super.getIntrinsicWidth()) / ((float) this.mActionIconWidth), ((float) super.getIntrinsicHeight()) / ((float) this.mActionIconHeight), 0.5f, 0.5f);
        }
        super.draw(canvas);
    }

    public Drawable.ConstantState getConstantState() {
        return null;
    }

    public int getIntrinsicHeight() {
        int i = this.mActionIconHeight;
        return i == 0 ? super.getIntrinsicHeight() : i;
    }

    public int getIntrinsicWidth() {
        int i = this.mActionIconWidth;
        return i == 0 ? super.getIntrinsicWidth() : i;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        init(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        super.onStateChange(iArr);
        return StateSet.stateSetMatches(STATE_DISABLED, iArr) ? toDisabledState() : StateSet.stateSetMatches(STATE_PRESSED, iArr) ? toPressedState() : toNormalState();
    }
}
