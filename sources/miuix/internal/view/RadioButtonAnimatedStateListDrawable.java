package miuix.internal.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import miuix.internal.view.C2290a;
import p018c2.C1350f;
import p018c2.C1356l;

public class RadioButtonAnimatedStateListDrawable extends CheckBoxAnimatedStateListDrawable {

    /* renamed from: l */
    private int f8701l = 19;

    /* renamed from: miuix.internal.view.RadioButtonAnimatedStateListDrawable$a */
    protected static class C2289a extends C2290a.C2291a {
        protected C2289a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable mo8669a(Resources resources, Resources.Theme theme, C2290a.C2291a aVar) {
            return new RadioButtonAnimatedStateListDrawable(resources, theme, aVar);
        }
    }

    public RadioButtonAnimatedStateListDrawable() {
    }

    public RadioButtonAnimatedStateListDrawable(Resources resources, Resources.Theme theme, C2290a.C2291a aVar) {
        super(resources, theme, aVar);
        if (resources != null) {
            this.f8701l = resources.getDimensionPixelSize(C1350f.f4644g0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2290a.C2291a mo8652a() {
        return new C2289a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo8654b() {
        return C1356l.f4793e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8658e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8659i(int i, int i2, int i3, int i4) {
        int i5 = this.f8701l;
        super.mo8659i(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo8660j(Rect rect) {
        int i = this.f8701l;
        rect.inset(i, i);
        super.mo8660j(rect);
    }
}
