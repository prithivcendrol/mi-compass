package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0214g;

/* renamed from: androidx.appcompat.view.menu.r */
public class C0239r extends C0214g implements SubMenu {

    /* renamed from: B */
    private C0214g f864B;

    /* renamed from: C */
    private C0218i f865C;

    public C0239r(Context context, C0214g gVar, C0218i iVar) {
        super(context);
        this.f864B = gVar;
        this.f865C = iVar;
    }

    /* renamed from: D */
    public C0214g mo862D() {
        return this.f864B.mo862D();
    }

    /* renamed from: F */
    public boolean mo864F() {
        return this.f864B.mo864F();
    }

    /* renamed from: G */
    public boolean mo865G() {
        return this.f864B.mo865G();
    }

    /* renamed from: H */
    public boolean mo866H() {
        return this.f864B.mo866H();
    }

    /* renamed from: R */
    public void mo875R(C0214g.C0215a aVar) {
        this.f864B.mo875R(aVar);
    }

    /* renamed from: e0 */
    public Menu mo1111e0() {
        return this.f864B;
    }

    /* renamed from: f */
    public boolean mo903f(C0218i iVar) {
        return this.f864B.mo903f(iVar);
    }

    public MenuItem getItem() {
        return this.f865C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo906h(C0214g gVar, MenuItem menuItem) {
        return super.mo906h(gVar, menuItem) || this.f864B.mo906h(gVar, menuItem);
    }

    /* renamed from: k */
    public boolean mo909k(C0218i iVar) {
        return this.f864B.mo909k(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f864B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo878U(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo879V(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo880X(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo881Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo882Z(view);
    }

    public SubMenu setIcon(int i) {
        this.f865C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f865C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f864B.setQwertyMode(z);
    }

    /* renamed from: t */
    public String mo927t() {
        C0218i iVar = this.f865C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo927t() + ":" + itemId;
    }
}
