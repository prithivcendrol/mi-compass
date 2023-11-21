package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p018c2.C1357m;
import p117t2.C2708h;

public class ButtonForegroundDrawable extends AlphaBlendingDrawable {
    /* renamed from: a */
    private void m8241a(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, C1357m.f4872T, 0, 0) : resources.obtainAttributes(attributeSet, C1357m.f4872T);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1357m.f4880V, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C1357m.f4876U, 0);
        obtainStyledAttributes.recycle();
        if (C2708h.m11319c()) {
            mo7344c(dimensionPixelSize);
        } else {
            mo7344c(dimensionPixelSize2);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        m8241a(resources, attributeSet, theme);
    }
}
