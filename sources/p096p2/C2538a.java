package p096p2;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import p061j3.C1755g;

/* renamed from: p2.a */
class C2538a extends C1755g {

    /* renamed from: g */
    private MenuItem f10009g;

    protected C2538a(Context context, Menu menu) {
        super(context, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6034b(MenuItem menuItem) {
        boolean b = super.mo6034b(menuItem);
        if (!b || menuItem.getOrder() != 131072) {
            return b;
        }
        if (this.f10009g == null) {
            this.f10009g = menuItem;
            return false;
        }
        throw new IllegalStateException("Only one menu item is allowed to have CATEGORY_SYSTEM order!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public MenuItem mo9719e() {
        return this.f10009g;
    }
}
