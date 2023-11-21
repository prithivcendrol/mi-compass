package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0202a;
import androidx.appcompat.view.menu.C0214g;
import androidx.appcompat.view.menu.C0230m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0662b2;
import androidx.core.view.C0680d2;
import androidx.core.view.C0727l0;
import p021d.C1447a;
import p021d.C1451e;
import p021d.C1452f;
import p021d.C1454h;
import p021d.C1456j;
import p027e.C1512a;

/* renamed from: androidx.appcompat.widget.j1 */
public class C0339j1 implements C0333i0 {

    /* renamed from: a */
    Toolbar f1320a;

    /* renamed from: b */
    private int f1321b;

    /* renamed from: c */
    private View f1322c;

    /* renamed from: d */
    private View f1323d;

    /* renamed from: e */
    private Drawable f1324e;

    /* renamed from: f */
    private Drawable f1325f;

    /* renamed from: g */
    private Drawable f1326g;

    /* renamed from: h */
    private boolean f1327h;

    /* renamed from: i */
    CharSequence f1328i;

    /* renamed from: j */
    private CharSequence f1329j;

    /* renamed from: k */
    private CharSequence f1330k;

    /* renamed from: l */
    Window.Callback f1331l;

    /* renamed from: m */
    boolean f1332m;

    /* renamed from: n */
    private C0299c f1333n;

    /* renamed from: o */
    private int f1334o;

    /* renamed from: p */
    private int f1335p;

    /* renamed from: q */
    private Drawable f1336q;

    /* renamed from: androidx.appcompat.widget.j1$a */
    class C0340a implements View.OnClickListener {

        /* renamed from: d */
        final C0202a f1337d;

        C0340a() {
            this.f1337d = new C0202a(C0339j1.this.f1320a.getContext(), 0, 16908332, 0, 0, C0339j1.this.f1328i);
        }

        public void onClick(View view) {
            C0339j1 j1Var = C0339j1.this;
            Window.Callback callback = j1Var.f1331l;
            if (callback != null && j1Var.f1332m) {
                callback.onMenuItemSelected(0, this.f1337d);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j1$b */
    class C0341b extends C0680d2 {

        /* renamed from: a */
        private boolean f1339a = false;

        /* renamed from: b */
        final /* synthetic */ int f1340b;

        C0341b(int i) {
            this.f1340b = i;
        }

        /* renamed from: a */
        public void mo1743a(View view) {
            this.f1339a = true;
        }

        /* renamed from: b */
        public void mo523b(View view) {
            if (!this.f1339a) {
                C0339j1.this.f1320a.setVisibility(this.f1340b);
            }
        }

        /* renamed from: c */
        public void mo524c(View view) {
            C0339j1.this.f1320a.setVisibility(0);
        }
    }

    public C0339j1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C1454h.f5832a, C1451e.f5757n);
    }

    public C0339j1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1334o = 0;
        this.f1335p = 0;
        this.f1320a = toolbar;
        this.f1328i = toolbar.getTitle();
        this.f1329j = toolbar.getSubtitle();
        this.f1327h = this.f1328i != null;
        this.f1326g = toolbar.getNavigationIcon();
        C0326g1 u = C0326g1.m1455u(toolbar.getContext(), (AttributeSet) null, C1456j.f5972a, C1447a.f5677c, 0);
        this.f1336q = u.mo1869f(C1456j.f6027l);
        if (z) {
            CharSequence o = u.mo1878o(C1456j.f6057r);
            if (!TextUtils.isEmpty(o)) {
                mo1957D(o);
            }
            CharSequence o2 = u.mo1878o(C1456j.f6047p);
            if (!TextUtils.isEmpty(o2)) {
                mo1956C(o2);
            }
            Drawable f = u.mo1869f(C1456j.f6037n);
            if (f != null) {
                mo1960y(f);
            }
            Drawable f2 = u.mo1869f(C1456j.f6032m);
            if (f2 != null) {
                setIcon(f2);
            }
            if (this.f1326g == null && (drawable = this.f1336q) != null) {
                mo1955B(drawable);
            }
            mo1936n(u.mo1873j(C1456j.f6007h, 0));
            int m = u.mo1876m(C1456j.f6002g, 0);
            if (m != 0) {
                mo1958w(LayoutInflater.from(this.f1320a.getContext()).inflate(m, this.f1320a, false));
                mo1936n(this.f1321b | 16);
            }
            int l = u.mo1875l(C1456j.f6017j, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1320a.getLayoutParams();
                layoutParams.height = l;
                this.f1320a.setLayoutParams(layoutParams);
            }
            int d = u.mo1867d(C1456j.f5997f, -1);
            int d2 = u.mo1867d(C1456j.f5992e, -1);
            if (d >= 0 || d2 >= 0) {
                this.f1320a.mo1624L(Math.max(d, 0), Math.max(d2, 0));
            }
            int m2 = u.mo1876m(C1456j.f6062s, 0);
            if (m2 != 0) {
                Toolbar toolbar2 = this.f1320a;
                toolbar2.mo1627O(toolbar2.getContext(), m2);
            }
            int m3 = u.mo1876m(C1456j.f6052q, 0);
            if (m3 != 0) {
                Toolbar toolbar3 = this.f1320a;
                toolbar3.mo1626N(toolbar3.getContext(), m3);
            }
            int m4 = u.mo1876m(C1456j.f6042o, 0);
            if (m4 != 0) {
                this.f1320a.setPopupTheme(m4);
            }
        } else {
            this.f1321b = m1549v();
        }
        u.mo1882v();
        mo1959x(i);
        this.f1330k = this.f1320a.getNavigationContentDescription();
        this.f1320a.setNavigationOnClickListener(new C0340a());
    }

    /* renamed from: E */
    private void m1545E(CharSequence charSequence) {
        this.f1328i = charSequence;
        if ((this.f1321b & 8) != 0) {
            this.f1320a.setTitle(charSequence);
            if (this.f1327h) {
                C0727l0.m2878a0(this.f1320a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: F */
    private void m1546F() {
        if ((this.f1321b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1330k)) {
            this.f1320a.setNavigationContentDescription(this.f1335p);
        } else {
            this.f1320a.setNavigationContentDescription(this.f1330k);
        }
    }

    /* renamed from: G */
    private void m1547G() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1321b & 4) != 0) {
            toolbar = this.f1320a;
            drawable = this.f1326g;
            if (drawable == null) {
                drawable = this.f1336q;
            }
        } else {
            toolbar = this.f1320a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: H */
    private void m1548H() {
        Drawable drawable;
        int i = this.f1321b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1325f) == null) {
            drawable = this.f1324e;
        }
        this.f1320a.setLogo(drawable);
    }

    /* renamed from: v */
    private int m1549v() {
        if (this.f1320a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1336q = this.f1320a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo1954A(CharSequence charSequence) {
        this.f1330k = charSequence;
        m1546F();
    }

    /* renamed from: B */
    public void mo1955B(Drawable drawable) {
        this.f1326g = drawable;
        m1547G();
    }

    /* renamed from: C */
    public void mo1956C(CharSequence charSequence) {
        this.f1329j = charSequence;
        if ((this.f1321b & 8) != 0) {
            this.f1320a.setSubtitle(charSequence);
        }
    }

    /* renamed from: D */
    public void mo1957D(CharSequence charSequence) {
        this.f1327h = true;
        m1545E(charSequence);
    }

    /* renamed from: a */
    public void mo1921a(Menu menu, C0230m.C0231a aVar) {
        if (this.f1333n == null) {
            C0299c cVar = new C0299c(this.f1320a.getContext());
            this.f1333n = cVar;
            cVar.mo811p(C1452f.f5792g);
        }
        this.f1333n.mo803h(aVar);
        this.f1320a.mo1625M((C0214g) menu, this.f1333n);
    }

    /* renamed from: b */
    public boolean mo1922b() {
        return this.f1320a.mo1622D();
    }

    /* renamed from: c */
    public Context mo1923c() {
        return this.f1320a.getContext();
    }

    public void collapseActionView() {
        this.f1320a.mo1633e();
    }

    /* renamed from: d */
    public void mo1925d() {
        this.f1332m = true;
    }

    /* renamed from: e */
    public boolean mo1926e() {
        return this.f1320a.mo1621C();
    }

    /* renamed from: f */
    public boolean mo1927f() {
        return this.f1320a.mo1715y();
    }

    /* renamed from: g */
    public boolean mo1928g() {
        return this.f1320a.mo1628R();
    }

    public CharSequence getTitle() {
        return this.f1320a.getTitle();
    }

    /* renamed from: h */
    public boolean mo1930h() {
        return this.f1320a.mo1632d();
    }

    /* renamed from: i */
    public void mo1931i() {
        this.f1320a.mo1634f();
    }

    /* renamed from: j */
    public void mo1932j(int i) {
        this.f1320a.setVisibility(i);
    }

    /* renamed from: k */
    public void mo1933k(C0429y0 y0Var) {
        Toolbar toolbar;
        View view = this.f1322c;
        if (view != null && view.getParent() == (toolbar = this.f1320a)) {
            toolbar.removeView(this.f1322c);
        }
        this.f1322c = y0Var;
        if (y0Var != null && this.f1334o == 2) {
            this.f1320a.addView(y0Var, 0);
            Toolbar.C0285g gVar = (Toolbar.C0285g) this.f1322c.getLayoutParams();
            gVar.width = -2;
            gVar.height = -2;
            gVar.f358a = 8388691;
            y0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: l */
    public void mo1934l(boolean z) {
    }

    /* renamed from: m */
    public boolean mo1935m() {
        return this.f1320a.mo1714w();
    }

    /* renamed from: n */
    public void mo1936n(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1321b ^ i;
        this.f1321b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1546F();
                }
                m1547G();
            }
            if ((i2 & 3) != 0) {
                m1548H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1320a.setTitle(this.f1328i);
                    toolbar = this.f1320a;
                    charSequence = this.f1329j;
                } else {
                    charSequence = null;
                    this.f1320a.setTitle((CharSequence) null);
                    toolbar = this.f1320a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1323d) != null) {
                if ((i & 16) != 0) {
                    this.f1320a.addView(view);
                } else {
                    this.f1320a.removeView(view);
                }
            }
        }
    }

    /* renamed from: o */
    public int mo1937o() {
        return this.f1321b;
    }

    /* renamed from: p */
    public void mo1938p(int i) {
        mo1960y(i != 0 ? C1512a.m6567b(mo1923c(), i) : null);
    }

    /* renamed from: q */
    public int mo1939q() {
        return this.f1334o;
    }

    /* renamed from: r */
    public C0662b2 mo1940r(int i, long j) {
        return C0727l0.m2881c(this.f1320a).mo2818b(i == 0 ? 1.0f : 0.0f).mo2821f(j).mo2823h(new C0341b(i));
    }

    /* renamed from: s */
    public void mo1941s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C1512a.m6567b(mo1923c(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1324e = drawable;
        m1548H();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1331l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1327h) {
            m1545E(charSequence);
        }
    }

    /* renamed from: t */
    public void mo1946t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: u */
    public void mo1947u(boolean z) {
        this.f1320a.setCollapsible(z);
    }

    /* renamed from: w */
    public void mo1958w(View view) {
        View view2 = this.f1323d;
        if (!(view2 == null || (this.f1321b & 16) == 0)) {
            this.f1320a.removeView(view2);
        }
        this.f1323d = view;
        if (view != null && (this.f1321b & 16) != 0) {
            this.f1320a.addView(view);
        }
    }

    /* renamed from: x */
    public void mo1959x(int i) {
        if (i != this.f1335p) {
            this.f1335p = i;
            if (TextUtils.isEmpty(this.f1320a.getNavigationContentDescription())) {
                mo1961z(this.f1335p);
            }
        }
    }

    /* renamed from: y */
    public void mo1960y(Drawable drawable) {
        this.f1325f = drawable;
        m1548H();
    }

    /* renamed from: z */
    public void mo1961z(int i) {
        mo1954A(i == 0 ? null : mo1923c().getString(i));
    }
}
