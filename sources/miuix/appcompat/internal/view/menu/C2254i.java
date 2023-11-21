package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import miuix.appcompat.internal.view.menu.C2242c;

/* renamed from: miuix.appcompat.internal.view.menu.i */
public class C2254i extends C2242c implements SubMenu {

    /* renamed from: A */
    private C2247e f8597A;

    /* renamed from: z */
    private C2242c f8598z;

    public C2254i(Context context, C2242c cVar, C2247e eVar) {
        super(context);
        this.f8598z = cVar;
        this.f8597A = eVar;
    }

    /* renamed from: B */
    public C2242c mo8339B() {
        return this.f8598z;
    }

    /* renamed from: D */
    public boolean mo8341D() {
        return this.f8598z.mo8341D();
    }

    /* renamed from: E */
    public boolean mo8342E() {
        return this.f8598z.mo8342E();
    }

    /* renamed from: N */
    public void mo8350N(C2242c.C2244b bVar) {
        this.f8598z.mo8350N(bVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.Menu, miuix.appcompat.internal.view.menu.c] */
    /* renamed from: c0 */
    public Menu mo8500c0() {
        return this.f8598z;
    }

    public void clearHeader() {
    }

    /* renamed from: d0 */
    public void mo8501d0(C2242c cVar) {
        this.f8598z = cVar;
    }

    /* renamed from: f */
    public boolean mo8380f(C2247e eVar) {
        return this.f8598z.mo8380f(eVar);
    }

    /* renamed from: g */
    public boolean mo8382g(C2242c cVar, MenuItem menuItem) {
        return super.mo8382g(cVar, menuItem) || this.f8598z.mo8382g(cVar, menuItem);
    }

    public MenuItem getItem() {
        return this.f8597A;
    }

    /* renamed from: j */
    public boolean mo8386j(C2247e eVar) {
        return this.f8598z.mo8386j(eVar);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo8355S(mo8398s().getResources().getDrawable(i));
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo8355S(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo8357V(mo8398s().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo8357V(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo8358W(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f8597A.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f8597A.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f8598z.setQwertyMode(z);
    }
}
