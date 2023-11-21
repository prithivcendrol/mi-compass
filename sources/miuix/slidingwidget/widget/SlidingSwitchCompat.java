package miuix.slidingwidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p038f4.C1578a;
import p038f4.C1581d;
import p038f4.C1582e;
import p044g4.C1613b;

public class SlidingSwitchCompat extends SwitchCompat {

    /* renamed from: a0 */
    private C1613b f9201a0;

    public SlidingSwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1578a.f6283a);
    }

    public SlidingSwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1613b bVar = new C1613b(this);
        this.f9201a0 = bVar;
        bVar.mo5783t();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1582e.f6320Y, i, C1581d.f6295a);
        this.f9201a0.mo5784v(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1613b bVar = this.f9201a0;
        if (bVar != null) {
            bVar.mo5775Q();
        }
    }

    public float getAlpha() {
        C1613b bVar = this.f9201a0;
        return bVar != null ? bVar.mo5778o() : super.getAlpha();
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C1613b bVar = this.f9201a0;
        if (bVar != null) {
            bVar.mo5785w();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C1613b bVar = this.f9201a0;
        if (bVar == null) {
            super.onDraw(canvas);
        } else {
            bVar.mo5767A(canvas);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        C1613b bVar = this.f9201a0;
        if (bVar != null) {
            bVar.mo5768C(motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f9201a0.mo5780q(), this.f9201a0.mo5779p());
        this.f9201a0.mo5774P();
    }

    /* access modifiers changed from: protected */
    public boolean onSetAlpha(int i) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        C1613b bVar = this.f9201a0;
        if (bVar == null) {
            return true;
        }
        bVar.mo5769E(motionEvent);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        C1613b bVar = this.f9201a0;
        if (bVar == null) {
            return true;
        }
        bVar.mo5786z();
        return true;
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        C1613b bVar = this.f9201a0;
        if (bVar != null) {
            bVar.mo5770K(f);
        }
        invalidate();
    }

    public void setButtonDrawable(Drawable drawable) {
    }

    public void setChecked(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            boolean isChecked = isChecked();
            C1613b bVar = this.f9201a0;
            if (bVar != null) {
                bVar.mo5771L(isChecked);
            }
        }
    }

    public void setLayerType(int i, Paint paint) {
        super.setLayerType(i, paint);
        C1613b bVar = this.f9201a0;
        if (bVar != null) {
            bVar.mo5772N(i);
        }
    }

    public void setOnPerformCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        C1613b bVar = this.f9201a0;
        if (bVar != null) {
            bVar.mo5773O(onCheckedChangeListener);
        }
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f9201a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
        /*
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L_0x0013
            g4.b r0 = r1.f9201a0
            if (r0 == 0) goto L_0x0011
            boolean r2 = r0.mo5777T(r2)
            if (r2 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.slidingwidget.widget.SlidingSwitchCompat.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
