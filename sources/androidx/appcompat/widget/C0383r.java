package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p021d.C1447a;

/* renamed from: androidx.appcompat.widget.r */
public class C0383r extends RatingBar {

    /* renamed from: d */
    private final C0379q f1471d;

    public C0383r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5667G);
    }

    public C0383r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0298b1.m1339a(this, getContext());
        C0379q qVar = new C0379q(this);
        this.f1471d = qVar;
        qVar.mo2135c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1471d.mo2134b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
