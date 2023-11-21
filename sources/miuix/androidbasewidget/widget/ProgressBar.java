package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p005a4.C0040b;
import p146z1.C2965a;
import p146z1.C2970f;
import p146z1.C2971g;

public class ProgressBar extends android.widget.ProgressBar {

    /* renamed from: d */
    private Drawable f7442d;

    public ProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2965a.f11203c);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo6657a(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo6657a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2971g.f11241Y, i, C2970f.f11215b);
        Drawable drawable = this.f7442d;
        if (drawable != null && drawable.getClass().getName().equals("android.graphics.drawable.AnimatedRotateDrawable")) {
            int i2 = obtainStyledAttributes.getInt(C2971g.f11242Z, 48);
            Class<?> cls = drawable.getClass();
            Class cls2 = Integer.TYPE;
            C0040b.m64f(drawable, C0040b.m63e(cls, "setFramesCount", cls2), Integer.valueOf(i2));
            int i3 = obtainStyledAttributes.getInt(C2971g.f11244a0, 25);
            C0040b.m64f(drawable, C0040b.m63e(cls, "setFramesDuration", cls2), Integer.valueOf(i3));
        }
        obtainStyledAttributes.recycle();
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f7442d != drawable) {
            this.f7442d = drawable;
        }
    }
}
