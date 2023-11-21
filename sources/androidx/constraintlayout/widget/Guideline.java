package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: d */
    private boolean f1807d = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f1807d = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) getLayoutParams();
        if (!this.f1807d || bVar.f1749a != i) {
            bVar.f1749a = i;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) getLayoutParams();
        if (!this.f1807d || bVar.f1751b != i) {
            bVar.f1751b = i;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) getLayoutParams();
        if (!this.f1807d || bVar.f1753c != f) {
            bVar.f1753c = f;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i) {
    }
}
