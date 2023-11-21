package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.f1 */
class C0323f1 extends C0419w0 {

    /* renamed from: b */
    private final WeakReference<Context> f1278b;

    public C0323f1(Context context, Resources resources) {
        super(resources);
        this.f1278b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable a = mo2278a(i);
        Context context = this.f1278b.get();
        if (!(a == null || context == null)) {
            C0413v0.m1797g().mo2272w(context, i, a);
        }
        return a;
    }
}
