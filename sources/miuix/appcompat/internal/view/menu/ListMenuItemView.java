package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import miuix.appcompat.internal.view.menu.C2242c;
import miuix.appcompat.internal.view.menu.C2252h;
import p018c2.C1352h;
import p018c2.C1354j;
import p018c2.C1357m;

public class ListMenuItemView extends LinearLayout implements C2252h.C2253a {

    /* renamed from: d */
    private C2247e f8352d;

    /* renamed from: e */
    private AppCompatImageView f8353e;

    /* renamed from: f */
    private AppCompatRadioButton f8354f;

    /* renamed from: g */
    private TextView f8355g;

    /* renamed from: h */
    private AppCompatCheckBox f8356h;

    /* renamed from: i */
    private TextView f8357i;

    /* renamed from: j */
    private View f8358j;

    /* renamed from: k */
    private Drawable f8359k;

    /* renamed from: l */
    private int f8360l;

    /* renamed from: m */
    private Context f8361m;

    /* renamed from: n */
    private boolean f8362n;

    /* renamed from: o */
    private Context f8363o;

    /* renamed from: p */
    private LayoutInflater f8364p;

    /* renamed from: q */
    private boolean f8365q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f8363o = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1357m.f5007v1, i, 0);
        this.f8359k = obtainStyledAttributes.getDrawable(C1357m.f5017x1);
        this.f8360l = obtainStyledAttributes.getResourceId(C1357m.f5012w1, -1);
        this.f8362n = obtainStyledAttributes.getBoolean(C1357m.f5022y1, false);
        this.f8361m = context;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private void m9235c() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) getInflater().inflate(C1354j.f4779v, this, false);
        this.f8356h = appCompatCheckBox;
        addView(appCompatCheckBox);
    }

    /* renamed from: d */
    private void m9236d() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) getInflater().inflate(C1354j.f4780w, this, false);
        this.f8353e = appCompatImageView;
        addView(appCompatImageView, 0);
    }

    /* renamed from: e */
    private void m9237e() {
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) getInflater().inflate(C1354j.f4782y, this, false);
        this.f8354f = appCompatRadioButton;
        addView(appCompatRadioButton, 0);
    }

    private LayoutInflater getInflater() {
        if (this.f8364p == null) {
            this.f8364p = LayoutInflater.from(this.f8363o);
        }
        return this.f8364p;
    }

    /* renamed from: a */
    public boolean mo8200a() {
        return false;
    }

    /* renamed from: b */
    public void mo8201b(C2247e eVar, int i) {
        this.f8352d = eVar;
        setVisibility(eVar.isVisible() ? 0 : 8);
        setTitle(eVar.mo8439h(this));
        setCheckable(eVar.isCheckable());
        mo8202f(eVar.mo8417A(), eVar.mo8421e());
        setIcon(eVar.getIcon());
        setEnabled(eVar.isEnabled());
    }

    /* renamed from: f */
    public void mo8202f(boolean z, char c) {
        int i = (!z || !this.f8352d.mo8417A()) ? 8 : 0;
        if (i == 0) {
            this.f8357i.setText(this.f8352d.mo8423f());
        }
        if (this.f8357i.getVisibility() != i) {
            this.f8357i.setVisibility(i);
        }
    }

    public C2247e getItemData() {
        return this.f8352d;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f8359k);
        TextView textView = (TextView) findViewById(C1352h.f4714e0);
        this.f8355g = textView;
        int i = this.f8360l;
        if (i != -1) {
            textView.setTextAppearance(this.f8361m, i);
        }
        this.f8357i = (TextView) findViewById(C1352h.f4701W);
        this.f8358j = getChildAt(0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f8353e != null && this.f8362n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8353e.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f8354f != null || this.f8356h != null) {
            if (this.f8352d.mo8450m()) {
                if (this.f8354f == null) {
                    m9237e();
                }
                compoundButton = this.f8354f;
                view = this.f8356h;
            } else {
                if (this.f8356h == null) {
                    m9235c();
                }
                compoundButton = this.f8356h;
                view = this.f8354f;
            }
            if (z) {
                compoundButton.setChecked(this.f8352d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            AppCompatCheckBox appCompatCheckBox = this.f8356h;
            if (appCompatCheckBox != null) {
                appCompatCheckBox.setVisibility(8);
            }
            AppCompatRadioButton appCompatRadioButton = this.f8354f;
            if (appCompatRadioButton != null) {
                appCompatRadioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f8352d.mo8450m()) {
            if (this.f8354f == null) {
                m9237e();
            }
            compoundButton = this.f8354f;
        } else {
            if (this.f8356h == null) {
                m9235c();
            }
            compoundButton = this.f8356h;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f8365q = z;
        this.f8362n = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f8352d.mo8485z() || this.f8365q;
        if (z || this.f8362n) {
            AppCompatImageView appCompatImageView = this.f8353e;
            if (appCompatImageView != null || drawable != null || this.f8362n) {
                if (appCompatImageView == null) {
                    m9236d();
                }
                if (drawable != null || this.f8362n) {
                    AppCompatImageView appCompatImageView2 = this.f8353e;
                    if (!z) {
                        drawable = null;
                    }
                    appCompatImageView2.setImageDrawable(drawable);
                    if (this.f8353e.getVisibility() != 0) {
                        this.f8353e.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f8353e.setVisibility(8);
            }
        }
    }

    public void setItemInvoker(C2242c.C2245c cVar) {
        throw new UnsupportedOperationException();
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f8355g.setText(charSequence);
            if (this.f8355g.getVisibility() != 0) {
                textView = this.f8355g;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f8355g.getVisibility() != 8) {
                textView = this.f8355g;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
