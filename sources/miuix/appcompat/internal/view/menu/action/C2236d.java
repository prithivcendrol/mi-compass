package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.C2217a;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2247e;
import miuix.appcompat.internal.view.menu.C2248f;
import miuix.appcompat.internal.view.menu.C2254i;
import p018c2.C1347c;
import p018c2.C1352h;
import p018c2.C1353i;
import p018c2.C1354j;
import p018c2.C1355k;
import p090o2.C2497d;

/* renamed from: miuix.appcompat.internal.view.menu.action.d */
public class C2236d extends C2225b {

    /* renamed from: L */
    private C2247e f8504L;

    /* renamed from: miuix.appcompat.internal.view.menu.action.d$a */
    private class C2237a extends C2248f {
        public C2237a(Context context, C2242c cVar, View view, boolean z) {
            super(context, cVar, view, z);
            mo8488o(C2236d.this.f8473I);
            mo8492q(C1354j.f4742A);
        }

        /* renamed from: a */
        public void mo8299a(boolean z) {
            super.mo8299a(z);
            View view = C2236d.this.f8476n;
            if (view != null) {
                view.setSelected(false);
            }
        }

        public void onDismiss() {
            super.onDismiss();
            C2236d.this.f8368f.close();
        }
    }

    public C2236d(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, int i4) {
        super(context, actionBarOverlayLayout, i, i2, i3, i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ boolean m9395k0(MenuItem menuItem) {
        C2242c cVar = this.f8368f;
        if (cVar != null) {
            C2217a.m9243m(cVar, cVar.mo8339B(), mo8283S());
        }
        if (this.f8476n.isSelected()) {
            mo8284T(true);
        } else {
            mo8296g0();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public View mo8280N(Context context) {
        ViewGroup viewGroup = (ViewGroup) this.f8374l;
        if (viewGroup == null) {
            return null;
        }
        C2242c cVar = this.f8368f;
        int i = C1352h.f4691M;
        C2247e l = C2217a.m9242l(cVar, 0, i, 0, 0, context.getString(C1355k.f4788e), 2);
        this.f8368f.mo8362a0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C1347c.f4590x});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        l.setIcon(drawable);
        l.setOnMenuItemClickListener(new C2497d(this));
        this.f8368f.mo8359X(false);
        View n = mo8215n(l, (View) null, viewGroup);
        n.setId(i);
        this.f8504L = l;
        l.mo8483x(n);
        return n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public int mo8282Q() {
        Context context = this.f8367e;
        if (context != null) {
            return context.getResources().getInteger(C1353i.f4740a);
        }
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo8286V(View view) {
        if (view == null) {
            return false;
        }
        C2247e eVar = this.f8504L;
        return (view instanceof EndActionMenuItemView) && !(eVar != null && eVar.mo8441i() == view);
    }

    /* renamed from: e */
    public boolean mo8006e(C2254i iVar) {
        if (!iVar.hasVisibleItems()) {
            return false;
        }
        new C2237a(this.f8367e, iVar, this.f8476n, true).mo8486f();
        return true;
    }

    /* renamed from: l0 */
    public void mo8323l0() {
        C2247e eVar = this.f8504L;
        if (eVar != null) {
            eVar.mo8418B();
        }
    }
}
