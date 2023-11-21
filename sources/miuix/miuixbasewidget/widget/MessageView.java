package miuix.miuixbasewidget.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import p027e.C1512a;
import p067k3.C1788b;
import p067k3.C1789c;
import p067k3.C1790d;
import p067k3.C1791e;
import p067k3.C1793g;
import p067k3.C1794h;
import p067k3.C1795i;

public class MessageView extends LinearLayout {

    /* renamed from: d */
    private TextView f8819d;

    /* renamed from: e */
    private Drawable f8820e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2308b f8821f;

    /* renamed from: miuix.miuixbasewidget.widget.MessageView$a */
    class C2307a implements View.OnClickListener {
        C2307a() {
        }

        public void onClick(View view) {
            Folme.useAt(view).visible().setFlags(1).hide(new AnimConfig[0]);
            MessageView.this.setVisibility(8);
            if (MessageView.this.f8821f != null) {
                MessageView.this.f8821f.mo5348a();
            }
        }
    }

    /* renamed from: miuix.miuixbasewidget.widget.MessageView$b */
    public interface C2308b {
        /* renamed from: a */
        void mo5348a();
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9763c(context, attributeSet, i);
    }

    /* renamed from: b */
    private void m9762b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(C1789c.f6883e));
        imageView.setId(C1791e.f6889b);
        imageView.setBackground(this.f8820e);
        imageView.setContentDescription(getContext().getResources().getString(C1793g.f6893a));
        imageView.setOnClickListener(new C2307a());
        addView(imageView, layoutParams);
        Folme.useAt(imageView).touch().handleTouchOf(imageView, new AnimConfig[0]);
    }

    /* renamed from: c */
    private void m9763c(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1795i.f7029z0, i, C1794h.f6897d);
        String string = obtainStyledAttributes.getString(C1795i.f6902B0);
        ColorStateList a = C1512a.m6566a(context, obtainStyledAttributes.getResourceId(C1795i.f6899A0, C1788b.f6878a));
        this.f8820e = C1512a.m6567b(context, obtainStyledAttributes.getResourceId(C1795i.f6908D0, C1790d.f6887b));
        boolean z = obtainStyledAttributes.getBoolean(C1795i.f6905C0, true);
        obtainStyledAttributes.recycle();
        this.f8819d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        this.f8819d.setId(16908308);
        this.f8819d.setPaddingRelative(getResources().getDimensionPixelSize(C1789c.f6884f), 0, 0, 0);
        this.f8819d.setText(string);
        this.f8819d.setTextColor(a);
        this.f8819d.setTextSize(0, (float) getResources().getDimensionPixelSize(C1789c.f6885g));
        this.f8819d.setTextDirection(5);
        addView(this.f8819d, layoutParams);
        setClosable(z);
        setGravity(16);
        Folme.useAt(this).touch().setTintMode(0).setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED).handleHoverOf(this, new AnimConfig[0]);
    }

    public void setClosable(boolean z) {
        View findViewById = findViewById(C1791e.f6889b);
        if (z) {
            if (findViewById == null) {
                m9762b();
            }
        } else if (findViewById != null) {
            removeView(findViewById);
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f8819d.setText(charSequence);
    }

    public void setOnMessageViewCloseListener(C2308b bVar) {
        this.f8821f = bVar;
    }
}
