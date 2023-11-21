package p036f2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import p030e2.C1538g;
import p055i3.C1649c;
import p055i3.C1656j;

/* renamed from: f2.e */
public class C1562e extends C1558a {

    /* renamed from: d */
    private View f6233d;

    /* renamed from: e */
    private Drawable f6234e;

    public C1562e(Context context) {
        this.f6234e = C1649c.m6963h(context, 16842836);
    }

    /* renamed from: F */
    public void mo5647F() {
    }

    /* renamed from: I */
    public void mo5648I() {
    }

    /* renamed from: a */
    public boolean mo5699a() {
        return false;
    }

    /* renamed from: b */
    public View mo5700b() {
        return this.f6233d;
    }

    /* renamed from: c */
    public ViewGroup.LayoutParams mo5701c() {
        return this.f6233d.getLayoutParams();
    }

    /* renamed from: d */
    public void mo5702d() {
    }

    /* renamed from: e */
    public void mo5703e() {
    }

    /* renamed from: f */
    public void mo5704f(View view, boolean z) {
        Drawable drawable;
        View view2;
        View view3 = this.f6233d;
        if (view3 != null) {
            if (C1656j.m6984c(view3.getContext())) {
                view2 = this.f6233d;
                drawable = new ColorDrawable(-16777216);
            } else {
                view2 = this.f6233d;
                drawable = this.f6234e;
            }
            view2.setBackground(drawable);
        }
    }

    /* renamed from: g */
    public boolean mo5705g() {
        return false;
    }

    /* renamed from: i */
    public void mo5706i() {
    }

    /* renamed from: j */
    public ViewGroup mo5707j(View view, boolean z) {
        this.f6233d = view;
        return (ViewGroup) view;
    }

    /* renamed from: k */
    public void mo5708k(boolean z) {
    }

    /* renamed from: l */
    public void mo5709l(boolean z) {
    }

    /* renamed from: m */
    public void mo5710m(C1538g gVar) {
    }

    /* renamed from: n */
    public boolean mo5711n() {
        return false;
    }

    /* renamed from: o */
    public void mo5712o() {
    }

    /* renamed from: p */
    public void mo5649p() {
    }
}
