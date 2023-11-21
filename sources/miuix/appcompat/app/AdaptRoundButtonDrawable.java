package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import miuix.smooth.SmoothContainerDrawable2;
import org.xmlpull.v1.XmlPullParser;
import p018c2.C1357m;
import p117t2.C2708h;

public class AdaptRoundButtonDrawable extends SmoothContainerDrawable2 {

    /* renamed from: n */
    private float f7506n;

    /* renamed from: o */
    private float f7507o;

    /* renamed from: l */
    private void m8105l(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray d = SmoothContainerDrawable2.m10097d(resources, theme, attributeSet, C1357m.f4872T);
        this.f7506n = d.getDimension(C1357m.f4880V, 0.0f);
        this.f7507o = d.getDimension(C1357m.f4876U, 0.0f);
        d.recycle();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m8105l(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        mo9169g(C2708h.m11319c() ? this.f7506n : this.f7507o);
    }
}
