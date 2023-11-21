package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p109s.C2637c;

/* renamed from: androidx.appcompat.view.menu.s */
class C0240s extends C0234o implements SubMenu {

    /* renamed from: e */
    private final C2637c f866e;

    C0240s(Context context, C2637c cVar) {
        super(context, cVar);
        this.f866e = cVar;
    }

    public void clearHeader() {
        this.f866e.clearHeader();
    }

    public MenuItem getItem() {
        return mo813c(this.f866e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f866e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f866e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f866e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f866e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f866e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f866e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f866e.setIcon(drawable);
        return this;
    }
}
