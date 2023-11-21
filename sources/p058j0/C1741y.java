package p058j0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: j0.y */
class C1741y implements C1742z {

    /* renamed from: a */
    private final ViewOverlay f6722a;

    C1741y(View view) {
        this.f6722a = view.getOverlay();
    }

    /* renamed from: b */
    public void mo5995b(Drawable drawable) {
        this.f6722a.add(drawable);
    }

    /* renamed from: d */
    public void mo5997d(Drawable drawable) {
        this.f6722a.remove(drawable);
    }
}
