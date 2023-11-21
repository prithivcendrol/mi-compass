package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import p146z1.C2971g;

/* renamed from: miuix.androidbasewidget.widget.a */
public class C1982a extends AppCompatCheckedTextView {
    public C1982a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1982a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2971g.f11281t, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C2971g.f11283u, 0);
        if (resourceId != 0) {
            setCheckMarkDrawable(resourceId);
        }
        obtainStyledAttributes.recycle();
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}
