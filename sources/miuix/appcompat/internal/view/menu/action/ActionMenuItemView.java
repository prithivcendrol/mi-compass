package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2247e;
import miuix.appcompat.internal.view.menu.C2252h;
import p090o2.C2496c;

public class ActionMenuItemView extends LinearLayout implements C2252h.C2253a {

    /* renamed from: d */
    private C2247e f8376d;

    /* renamed from: e */
    private C2242c.C2245c f8377e;

    /* renamed from: f */
    private boolean f8378f;

    /* renamed from: g */
    private C2496c f8379g;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8379g = new C2496c(this);
    }

    /* renamed from: a */
    public boolean mo8200a() {
        return false;
    }

    /* renamed from: b */
    public void mo8201b(C2247e eVar, int i) {
        C2496c cVar;
        CharSequence charSequence;
        this.f8376d = eVar;
        setSelected(false);
        setTitle(eVar.getTitle());
        setIcon(eVar.getIcon());
        setCheckable(eVar.isCheckable());
        setChecked(eVar.isChecked());
        setEnabled(eVar.isEnabled());
        setClickable(true);
        if (Build.VERSION.SDK_INT >= 26) {
            cVar = this.f8379g;
            charSequence = eVar.getContentDescription();
        } else {
            cVar = this.f8379g;
            charSequence = eVar.getTitle();
        }
        cVar.mo9663a(charSequence);
    }

    public C2247e getItemData() {
        return this.f8376d;
    }

    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        C2242c.C2245c cVar = this.f8377e;
        if (cVar == null || !cVar.mo8196e(this.f8376d, 0)) {
            return false;
        }
        playSoundEffect(0);
        return true;
    }

    public void setCheckable(boolean z) {
        this.f8378f = z;
    }

    public void setChecked(boolean z) {
        if (this.f8378f) {
            setSelected(z);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f8379g.mo9664b(z);
    }

    public void setIcon(Drawable drawable) {
        this.f8379g.mo9665c(drawable);
    }

    public void setItemInvoker(C2242c.C2245c cVar) {
        this.f8377e = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8379g.mo9666d(charSequence);
    }
}
