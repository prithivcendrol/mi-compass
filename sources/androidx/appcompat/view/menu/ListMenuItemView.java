package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0232n;
import androidx.appcompat.widget.C0326g1;
import androidx.core.view.C0727l0;
import p021d.C1447a;
import p021d.C1452f;
import p021d.C1453g;
import p021d.C1456j;

public class ListMenuItemView extends LinearLayout implements C0232n.C0233a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d */
    private C0218i f648d;

    /* renamed from: e */
    private ImageView f649e;

    /* renamed from: f */
    private RadioButton f650f;

    /* renamed from: g */
    private TextView f651g;

    /* renamed from: h */
    private CheckBox f652h;

    /* renamed from: i */
    private TextView f653i;

    /* renamed from: j */
    private ImageView f654j;

    /* renamed from: k */
    private ImageView f655k;

    /* renamed from: l */
    private LinearLayout f656l;

    /* renamed from: m */
    private Drawable f657m;

    /* renamed from: n */
    private int f658n;

    /* renamed from: o */
    private Context f659o;

    /* renamed from: p */
    private boolean f660p;

    /* renamed from: q */
    private Drawable f661q;

    /* renamed from: r */
    private boolean f662r;

    /* renamed from: s */
    private LayoutInflater f663s;

    /* renamed from: t */
    private boolean f664t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1447a.f5664D);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0326g1 u = C0326g1.m1455u(getContext(), attributeSet, C1456j.f5946T1, i, 0);
        this.f657m = u.mo1869f(C1456j.f5954V1);
        this.f658n = u.mo1876m(C1456j.f5950U1, -1);
        this.f660p = u.mo1864a(C1456j.f5958W1, false);
        this.f659o = context;
        this.f661q = u.mo1869f(C1456j.f5962X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C1447a.f5661A, 0);
        this.f662r = obtainStyledAttributes.hasValue(0);
        u.mo1882v();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m795b(View view) {
        m796c(view, -1);
    }

    /* renamed from: c */
    private void m796c(View view, int i) {
        LinearLayout linearLayout = this.f656l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: e */
    private void m797e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1453g.f5819h, this, false);
        this.f652h = checkBox;
        m795b(checkBox);
    }

    /* renamed from: f */
    private void m798f() {
        ImageView imageView = (ImageView) getInflater().inflate(C1453g.f5820i, this, false);
        this.f649e = imageView;
        m796c(imageView, 0);
    }

    /* renamed from: g */
    private void m799g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1453g.f5822k, this, false);
        this.f650f = radioButton;
        m795b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f663s == null) {
            this.f663s = LayoutInflater.from(getContext());
        }
        return this.f663s;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f654j;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public boolean mo700a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f655k;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f655k.getLayoutParams();
            rect.top += this.f655k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public void mo703d(C0218i iVar, int i) {
        this.f648d = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo958i(this));
        setCheckable(iVar.isCheckable());
        mo729h(iVar.mo939A(), iVar.mo943g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public C0218i getItemData() {
        return this.f648d;
    }

    /* renamed from: h */
    public void mo729h(boolean z, char c) {
        int i = (!z || !this.f648d.mo939A()) ? 8 : 0;
        if (i == 0) {
            this.f653i.setText(this.f648d.mo956h());
        }
        if (this.f653i.getVisibility() != i) {
            this.f653i.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0727l0.m2880b0(this, this.f657m);
        TextView textView = (TextView) findViewById(C1452f.f5782M);
        this.f651g = textView;
        int i = this.f658n;
        if (i != -1) {
            textView.setTextAppearance(this.f659o, i);
        }
        this.f653i = (TextView) findViewById(C1452f.f5775F);
        ImageView imageView = (ImageView) findViewById(C1452f.f5778I);
        this.f654j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f661q);
        }
        this.f655k = (ImageView) findViewById(C1452f.f5803r);
        this.f656l = (LinearLayout) findViewById(C1452f.f5797l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f649e != null && this.f660p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f649e.getLayoutParams();
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
        if (z || this.f650f != null || this.f652h != null) {
            if (this.f648d.mo966m()) {
                if (this.f650f == null) {
                    m799g();
                }
                compoundButton = this.f650f;
                view = this.f652h;
            } else {
                if (this.f652h == null) {
                    m797e();
                }
                compoundButton = this.f652h;
                view = this.f650f;
            }
            if (z) {
                compoundButton.setChecked(this.f648d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f652h;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f650f;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f648d.mo966m()) {
            if (this.f650f == null) {
                m799g();
            }
            compoundButton = this.f650f;
        } else {
            if (this.f652h == null) {
                m797e();
            }
            compoundButton = this.f652h;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f664t = z;
        this.f660p = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f655k;
        if (imageView != null) {
            imageView.setVisibility((this.f662r || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f648d.mo996z() || this.f664t;
        if (z || this.f660p) {
            ImageView imageView = this.f649e;
            if (imageView != null || drawable != null || this.f660p) {
                if (imageView == null) {
                    m798f();
                }
                if (drawable != null || this.f660p) {
                    ImageView imageView2 = this.f649e;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f649e.getVisibility() != 0) {
                        this.f649e.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f649e.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f651g.setText(charSequence);
            if (this.f651g.getVisibility() != 0) {
                textView = this.f651g;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f651g.getVisibility() != 8) {
                textView = this.f651g;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
