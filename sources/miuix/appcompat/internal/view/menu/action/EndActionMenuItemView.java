package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2247e;
import miuix.appcompat.internal.view.menu.C2252h;
import p018c2.C1352h;
import p018c2.C1354j;

public class EndActionMenuItemView extends LinearLayout implements C2252h.C2253a {

    /* renamed from: d */
    private C2247e f8380d;

    /* renamed from: e */
    private C2242c.C2245c f8381e;

    /* renamed from: f */
    private ImageView f8382f;

    /* renamed from: g */
    private boolean f8383g;

    public EndActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EndActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setGravity(17);
        View.inflate(context, C1354j.f4767j, this);
        ImageView imageView = (ImageView) findViewById(C1352h.f4730q);
        this.f8382f = imageView;
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.setForceDarkAllowed(false);
        }
        Folme.useAt(this).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, ITouchStyle.TouchType.DOWN).setAlpha(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
    }

    /* renamed from: a */
    public boolean mo8200a() {
        return false;
    }

    /* renamed from: b */
    public void mo8201b(C2247e eVar, int i) {
        this.f8380d = eVar;
        setSelected(false);
        setTitle(eVar.getTitle());
        setIcon(eVar.getIcon());
        setCheckable(eVar.isCheckable());
        setChecked(eVar.isChecked());
        setEnabled(eVar.isEnabled());
        setClickable(true);
        setContentDescription(!TextUtils.isEmpty(eVar.getContentDescription()) ? eVar.getContentDescription() : eVar.getTitle());
    }

    public C2247e getItemData() {
        return this.f8380d;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        int i = this.f8380d.getItemId() == C1352h.f4691M ? 1 : 0;
        C2242c.C2245c cVar = this.f8381e;
        if (cVar == null || !cVar.mo8196e(this.f8380d, i)) {
            return false;
        }
        playSoundEffect(0);
        return true;
    }

    public void setCheckable(boolean z) {
        this.f8383g = z;
    }

    public void setChecked(boolean z) {
        if (this.f8383g) {
            setSelected(z);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f8382f.setEnabled(z);
    }

    public void setIcon(Drawable drawable) {
        if (this.f8382f.getDrawable() != drawable) {
            this.f8382f.setImageDrawable(drawable);
        }
    }

    public void setItemInvoker(C2242c.C2245c cVar) {
        this.f8381e = cVar;
    }

    public void setTitle(CharSequence charSequence) {
    }
}
