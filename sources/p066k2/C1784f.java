package p066k2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1351g;
import p018c2.C1352h;
import p055i3.C1649c;
import p073l3.C1878b;
import p078m2.C1921c;
import p117t2.C2693a;
import p117t2.C2711k;

/* renamed from: k2.f */
public class C1784f {

    /* renamed from: a */
    private Context f6855a;

    /* renamed from: b */
    private LinearLayout f6856b;

    /* renamed from: c */
    private C1921c f6857c;

    /* renamed from: d */
    private C1921c f6858d;

    /* renamed from: e */
    private boolean f6859e = true;

    /* renamed from: f */
    private float f6860f = 0.0f;

    /* renamed from: g */
    private int f6861g;

    /* renamed from: h */
    private int f6862h;

    /* renamed from: i */
    private boolean f6863i = false;

    /* renamed from: j */
    private float f6864j = 0.0f;

    /* renamed from: k */
    private boolean f6865k = true;

    /* renamed from: l */
    private boolean f6866l = false;

    public C1784f(Context context, int i, int i2) {
        this.f6855a = context;
        this.f6861g = i;
        this.f6862h = i2;
    }

    /* renamed from: g */
    private LinearLayout.LayoutParams m7414g() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m7415o() {
        this.f6856b.setBackground(C1649c.m6963h(this.f6855a, 16843676));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m7416p() {
        this.f6858d.setBackgroundResource(C1351g.f4677a);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m7417q() {
        mo6213z(mo6202j());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m7418s() {
        Resources resources = this.f6855a.getResources();
        this.f6856b.setOrientation(0);
        this.f6858d.setTextAppearance(this.f6855a, this.f6861g);
        this.f6858d.setBackgroundResource(C1351g.f4677a);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6858d.getLayoutParams();
        layoutParams.setMarginStart(resources.getDimensionPixelOffset(C1350f.f4645h));
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        this.f6858d.setLayoutParams(layoutParams);
        this.f6865k = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m7419t() {
        Resources resources = this.f6855a.getResources();
        this.f6856b.setOrientation(1);
        this.f6858d.setTextAppearance(this.f6855a, this.f6862h);
        this.f6858d.setBackground((Drawable) null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6858d.getLayoutParams();
        layoutParams.setMarginStart(0);
        layoutParams.topMargin = resources.getDimensionPixelOffset(C1350f.f4633b);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(C1350f.f4631a);
        this.f6858d.setPadding(0, 0, 0, 0);
        this.f6858d.setLayoutParams(layoutParams);
        this.f6865k = true;
        mo6213z(mo6202j());
    }

    /* renamed from: A */
    public void mo6192A(int i) {
        if (this.f6858d.getVisibility() != i) {
            this.f6858d.setVisibility(i);
        }
    }

    /* renamed from: B */
    public void mo6193B(boolean z, int i) {
        if (this.f6866l != z) {
            if (!z) {
                this.f6857c.mo6493e(false, false);
            }
            this.f6866l = z;
            if (z && i == 0) {
                this.f6857c.mo6493e(true, false);
            }
        }
    }

    /* renamed from: C */
    public void mo6194C(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f6857c.getText())) {
            this.f6857c.setText(charSequence);
            mo6209v(!TextUtils.isEmpty(charSequence));
            this.f6863i = true;
        }
    }

    /* renamed from: D */
    public void mo6195D(int i) {
        if (this.f6857c.getVisibility() != i) {
            this.f6857c.setVisibility(i);
        }
    }

    /* renamed from: E */
    public void mo6196E(int i) {
        if (this.f6859e || i != 0) {
            this.f6856b.setVisibility(i);
        } else {
            this.f6856b.setVisibility(4);
        }
    }

    /* renamed from: F */
    public void mo6197F(boolean z) {
        if (this.f6859e != z) {
            this.f6859e = z;
            this.f6856b.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: G */
    public void mo6198G(boolean z) {
        ViewGroup k = mo6203k();
        int i = 1;
        if (k instanceof LinearLayout) {
            ((LinearLayout) k).setGravity((z ? 1 : 8388611) | 16);
        }
        this.f6857c.setGravity((z ? 1 : 8388611) | 16);
        this.f6857c.setEllipsize(TextUtils.TruncateAt.END);
        C1921c cVar = this.f6858d;
        if (!z) {
            i = 8388611;
        }
        cVar.setGravity(i | 16);
        this.f6858d.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: f */
    public boolean mo6199f(String str) {
        if (this.f6863i) {
            this.f6864j = this.f6857c.getPaint().measureText(str);
            this.f6863i = false;
        }
        if (this.f6857c.getMeasuredWidth() == 0) {
            return true;
        }
        return this.f6864j <= ((float) this.f6857c.getMeasuredWidth());
    }

    /* renamed from: h */
    public Rect mo6200h() {
        Rect rect = new Rect();
        this.f6856b.getHitRect(rect);
        return rect;
    }

    /* renamed from: i */
    public View mo6201i() {
        return this.f6856b;
    }

    /* renamed from: j */
    public float mo6202j() {
        float f = this.f6860f;
        Resources resources = this.f6855a.getResources();
        int measuredHeight = ((this.f6856b.getMeasuredHeight() - this.f6857c.getMeasuredHeight()) - this.f6858d.getPaddingTop()) - this.f6858d.getPaddingBottom();
        if (measuredHeight <= 0) {
            return f;
        }
        TextPaint textPaint = new TextPaint(this.f6858d.getPaint());
        textPaint.setTextSize(f);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int ceil = (int) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent));
        float f2 = f / 2.0f;
        float f3 = resources.getDisplayMetrics().scaledDensity;
        while (ceil > measuredHeight && f >= f2) {
            f -= f3;
            textPaint.setTextSize(f);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            ceil = (int) Math.ceil((double) (fontMetrics2.descent - fontMetrics2.ascent));
        }
        return f;
    }

    /* renamed from: k */
    public ViewGroup mo6203k() {
        return (ViewGroup) this.f6857c.getParent();
    }

    /* renamed from: l */
    public int mo6204l() {
        return this.f6857c.getVisibility();
    }

    /* renamed from: m */
    public int mo6205m() {
        return this.f6856b.getVisibility();
    }

    /* renamed from: n */
    public void mo6206n() {
        Resources resources = this.f6855a.getResources();
        Point point = C2693a.m11238g(this.f6855a).f10509c;
        boolean z = true;
        boolean z2 = point.x > point.y;
        if (C1878b.m7804a(this.f6855a) != 1 || !z2) {
            z = false;
        }
        int dimensionPixelOffset = this.f6855a.getResources().getDimensionPixelOffset(C1350f.f4665r);
        this.f6865k = !z;
        this.f6860f = (float) resources.getDimensionPixelSize(C1350f.f4660o0);
        LinearLayout linearLayout = new LinearLayout(this.f6855a);
        this.f6856b = linearLayout;
        linearLayout.setImportantForAccessibility(2);
        this.f6856b.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        Context context = this.f6855a;
        int i = C1347c.f4587u;
        C1921c cVar = new C1921c(context, (AttributeSet) null, i);
        this.f6857c = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f6857c.setHorizontalScrollBarEnabled(false);
        int i2 = C1347c.f4586t;
        if (!z) {
            i = i2;
        }
        C1921c cVar2 = new C1921c(this.f6855a, (AttributeSet) null, i);
        this.f6858d = cVar2;
        cVar2.setVerticalScrollBarEnabled(false);
        this.f6858d.setHorizontalScrollBarEnabled(false);
        this.f6856b.setOrientation(z ^ true ? 1 : 0);
        this.f6856b.post(new C1779a(this));
        this.f6857c.setId(C1352h.f4726m);
        this.f6856b.addView(this.f6857c, m7414g());
        this.f6858d.setId(C1352h.f4724k);
        this.f6858d.setVisibility(8);
        if (z) {
            this.f6858d.post(new C1780b(this));
        }
        this.f6856b.addView(this.f6858d, m7414g());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6858d.getLayoutParams();
        if (z) {
            layoutParams.setMarginStart(resources.getDimensionPixelOffset(C1350f.f4645h));
            return;
        }
        layoutParams.topMargin = resources.getDimensionPixelOffset(C1350f.f4633b);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(C1350f.f4631a);
    }

    /* renamed from: r */
    public void mo6207r(Configuration configuration) {
        C1921c cVar;
        Runnable runnable;
        C2711k h = C2693a.m11239h(this.f6855a, configuration);
        int i = 1;
        if (h.f10511e == 1) {
            Point point = h.f10510d;
            if (point.y < 650 && point.x > 670) {
                i = 0;
            }
        }
        if (i != this.f6856b.getOrientation()) {
            cVar = this.f6858d;
            runnable = i == 0 ? new C1781c(this) : new C1782d(this);
        } else {
            cVar = this.f6858d;
            runnable = new C1783e(this);
        }
        cVar.post(runnable);
    }

    /* renamed from: u */
    public void mo6208u(boolean z) {
        LinearLayout linearLayout = this.f6856b;
        if (linearLayout != null) {
            linearLayout.setClickable(z);
        }
        C1921c cVar = this.f6858d;
        if (cVar != null) {
            cVar.setClickable(z);
        }
    }

    /* renamed from: v */
    public void mo6209v(boolean z) {
        this.f6856b.setEnabled(z);
    }

    /* renamed from: w */
    public void mo6210w(View.OnClickListener onClickListener) {
        this.f6856b.setOnClickListener(onClickListener);
    }

    /* renamed from: x */
    public void mo6211x(CharSequence charSequence) {
        this.f6858d.setText(charSequence);
        mo6192A(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: y */
    public void mo6212y(View.OnClickListener onClickListener) {
        C1921c cVar = this.f6858d;
        if (cVar != null) {
            cVar.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: z */
    public void mo6213z(float f) {
        if (this.f6865k) {
            this.f6858d.setTextSize(0, f);
        }
    }
}
