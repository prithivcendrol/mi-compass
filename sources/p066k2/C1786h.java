package p066k2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1352h;
import p018c2.C1356l;
import p055i3.C1649c;
import p078m2.C1921c;

/* renamed from: k2.h */
public class C1786h {

    /* renamed from: a */
    private Context f6868a;

    /* renamed from: b */
    private LinearLayout f6869b;

    /* renamed from: c */
    private C1921c f6870c;

    /* renamed from: d */
    private C1921c f6871d;

    /* renamed from: e */
    private boolean f6872e = true;

    /* renamed from: f */
    private int f6873f;

    /* renamed from: g */
    private int f6874g;

    /* renamed from: h */
    private boolean f6875h = false;

    public C1786h(Context context) {
        this.f6868a = context;
        this.f6873f = C1356l.f4794f;
        this.f6874g = C1356l.f4795g;
    }

    /* renamed from: b */
    private LinearLayout.LayoutParams m7443b() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m7444f() {
        this.f6869b.setBackground(C1649c.m6963h(this.f6868a, 16843676));
    }

    /* renamed from: c */
    public View mo6215c() {
        return this.f6869b;
    }

    /* renamed from: d */
    public int mo6216d() {
        return this.f6869b.getVisibility();
    }

    /* renamed from: e */
    public void mo6217e() {
        LinearLayout linearLayout = new LinearLayout(this.f6868a);
        this.f6869b = linearLayout;
        linearLayout.setImportantForAccessibility(2);
        this.f6869b.setOrientation(1);
        this.f6869b.post(new C1785g(this));
        C1921c cVar = new C1921c(this.f6868a, (AttributeSet) null, C1347c.f4533A);
        this.f6870c = cVar;
        cVar.setId(C1352h.f4727n);
        this.f6870c.setVerticalScrollBarEnabled(false);
        this.f6870c.setHorizontalScrollBarEnabled(false);
        this.f6869b.addView(this.f6870c, m7443b());
        C1921c cVar2 = new C1921c(this.f6868a, (AttributeSet) null, C1347c.f4592z);
        this.f6871d = cVar2;
        cVar2.setId(C1352h.f4725l);
        this.f6871d.setVisibility(8);
        this.f6871d.setVerticalScrollBarEnabled(false);
        this.f6871d.setHorizontalScrollBarEnabled(false);
        this.f6869b.addView(this.f6871d, m7443b());
        Resources resources = this.f6868a.getResources();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6871d.getLayoutParams();
        layoutParams.topMargin = resources.getDimensionPixelOffset(C1350f.f4633b);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(C1350f.f4631a);
    }

    /* renamed from: g */
    public void mo6218g(Configuration configuration) {
        this.f6870c.setTextAppearance(this.f6873f);
        this.f6871d.setTextAppearance(this.f6874g);
    }

    /* renamed from: h */
    public void mo6219h(boolean z) {
        LinearLayout linearLayout = this.f6869b;
        if (linearLayout != null) {
            linearLayout.setClickable(z);
        }
        C1921c cVar = this.f6871d;
        if (cVar != null) {
            cVar.setClickable(z);
        }
    }

    /* renamed from: i */
    public void mo6220i(boolean z) {
        this.f6869b.setEnabled(z);
    }

    /* renamed from: j */
    public void mo6221j(View.OnClickListener onClickListener) {
        this.f6869b.setOnClickListener(onClickListener);
    }

    /* renamed from: k */
    public void mo6222k(CharSequence charSequence) {
        this.f6871d.setText(charSequence);
        mo6224m(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: l */
    public void mo6223l(View.OnClickListener onClickListener) {
        C1921c cVar = this.f6871d;
        if (cVar != null) {
            cVar.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: m */
    public void mo6224m(int i) {
        this.f6871d.setVisibility(i);
    }

    /* renamed from: n */
    public void mo6225n(boolean z, int i) {
        if (this.f6875h != z) {
            if (!z) {
                this.f6870c.mo6493e(false, false);
            }
            this.f6875h = z;
            if (z && i == 1) {
                this.f6870c.mo6493e(true, false);
            }
        }
    }

    /* renamed from: o */
    public void mo6226o(CharSequence charSequence) {
        if (charSequence != null) {
            this.f6870c.setText(charSequence);
            mo6220i(!TextUtils.isEmpty(charSequence));
        }
    }

    /* renamed from: p */
    public void mo6227p(int i) {
        this.f6870c.setVisibility(i);
    }

    /* renamed from: q */
    public void mo6228q(int i) {
        if (this.f6872e || i != 0) {
            this.f6869b.setVisibility(i);
        } else {
            this.f6869b.setVisibility(4);
        }
    }

    /* renamed from: r */
    public void mo6229r(boolean z) {
        if (this.f6872e != z) {
            this.f6872e = z;
            this.f6869b.setVisibility(z ? 0 : 4);
        }
    }
}
