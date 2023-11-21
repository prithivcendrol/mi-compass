package p090o2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import p018c2.C1352h;
import p018c2.C1354j;

/* renamed from: o2.c */
public class C2496c {

    /* renamed from: a */
    private ImageView f9716a;

    /* renamed from: b */
    private TextView f9717b;

    /* renamed from: c */
    private LinearLayout f9718c;

    public C2496c(LinearLayout linearLayout) {
        this.f9718c = linearLayout;
        Context context = linearLayout.getContext();
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        View.inflate(context, C1354j.f4770m, linearLayout);
        this.f9716a = (ImageView) linearLayout.findViewById(C1352h.f4730q);
        this.f9717b = (TextView) linearLayout.findViewById(C1352h.f4731r);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9716a.setForceDarkAllowed(false);
        }
        Folme.useAt(linearLayout).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, ITouchStyle.TouchType.DOWN).setAlpha(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(linearLayout, new AnimConfig[0]);
        Folme.useAt(linearLayout).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(linearLayout, new AnimConfig[0]);
    }

    /* renamed from: a */
    public void mo9663a(CharSequence charSequence) {
        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            this.f9718c.setContentDescription(this.f9717b.getText());
        } else {
            this.f9718c.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public void mo9664b(boolean z) {
        this.f9716a.setEnabled(z);
        this.f9717b.setEnabled(z);
    }

    /* renamed from: c */
    public void mo9665c(Drawable drawable) {
        if (this.f9716a.getDrawable() != drawable) {
            this.f9716a.setImageDrawable(drawable);
        }
    }

    /* renamed from: d */
    public void mo9666d(CharSequence charSequence) {
        this.f9717b.setText(charSequence);
    }
}
