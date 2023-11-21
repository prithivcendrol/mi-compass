package p058j0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: j0.u */
class C1737u implements C1738v {

    /* renamed from: a */
    private final ViewGroupOverlay f6720a;

    C1737u(ViewGroup viewGroup) {
        this.f6720a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo5994a(View view) {
        this.f6720a.add(view);
    }

    /* renamed from: b */
    public void mo5995b(Drawable drawable) {
        this.f6720a.add(drawable);
    }

    /* renamed from: c */
    public void mo5996c(View view) {
        this.f6720a.remove(view);
    }

    /* renamed from: d */
    public void mo5997d(Drawable drawable) {
        this.f6720a.remove(drawable);
    }
}
