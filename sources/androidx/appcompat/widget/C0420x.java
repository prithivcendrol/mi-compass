package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0528f;
import androidx.core.view.C0727l0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p021d.C1456j;
import p119u.C2719b;

/* renamed from: androidx.appcompat.widget.x */
class C0420x {

    /* renamed from: a */
    private final TextView f1529a;

    /* renamed from: b */
    private C0320e1 f1530b;

    /* renamed from: c */
    private C0320e1 f1531c;

    /* renamed from: d */
    private C0320e1 f1532d;

    /* renamed from: e */
    private C0320e1 f1533e;

    /* renamed from: f */
    private C0320e1 f1534f;

    /* renamed from: g */
    private C0320e1 f1535g;

    /* renamed from: h */
    private C0320e1 f1536h;

    /* renamed from: i */
    private final C0310d0 f1537i;

    /* renamed from: j */
    private int f1538j = 0;

    /* renamed from: k */
    private int f1539k = -1;

    /* renamed from: l */
    private Typeface f1540l;

    /* renamed from: m */
    private boolean f1541m;

    /* renamed from: androidx.appcompat.widget.x$a */
    class C0421a extends C0528f.C0533e {

        /* renamed from: a */
        final /* synthetic */ int f1542a;

        /* renamed from: b */
        final /* synthetic */ int f1543b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1544c;

        C0421a(int i, int i2, WeakReference weakReference) {
            this.f1542a = i;
            this.f1543b = i2;
            this.f1544c = weakReference;
        }

        /* renamed from: h */
        public void mo2302h(int i) {
        }

        /* renamed from: i */
        public void mo2303i(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1542a) != -1) {
                typeface = C0426f.m1867a(typeface, i, (this.f1543b & 2) != 0);
            }
            C0420x.this.mo2291n(this.f1544c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$b */
    class C0422b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ TextView f1546d;

        /* renamed from: e */
        final /* synthetic */ Typeface f1547e;

        /* renamed from: f */
        final /* synthetic */ int f1548f;

        C0422b(TextView textView, Typeface typeface, int i) {
            this.f1546d = textView;
            this.f1547e = typeface;
            this.f1548f = i;
        }

        public void run() {
            this.f1546d.setTypeface(this.f1547e, this.f1548f);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$c */
    static class C0423c {
        /* renamed from: a */
        static Drawable[] m1858a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static void m1859b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        static void m1860c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$d */
    static class C0424d {
        /* renamed from: a */
        static LocaleList m1861a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        static void m1862b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$e */
    static class C0425e {
        /* renamed from: a */
        static int m1863a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        static void m1864b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        static void m1865c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        static boolean m1866d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$f */
    static class C0426f {
        /* renamed from: a */
        static Typeface m1867a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    C0420x(TextView textView) {
        this.f1529a = textView;
        this.f1537i = new C0310d0(textView);
    }

    /* renamed from: B */
    private void m1827B(int i, float f) {
        this.f1537i.mo1815t(i, f);
    }

    /* renamed from: C */
    private void m1828C(Context context, C0326g1 g1Var) {
        String n;
        Typeface typeface;
        Typeface typeface2;
        this.f1538j = g1Var.mo1873j(C1456j.f5955V2, this.f1538j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int j = g1Var.mo1873j(C1456j.f5967Y2, -1);
            this.f1539k = j;
            if (j != -1) {
                this.f1538j = (this.f1538j & 2) | 0;
            }
        }
        int i2 = C1456j.f5963X2;
        if (g1Var.mo1881r(i2) || g1Var.mo1881r(C1456j.f5971Z2)) {
            this.f1540l = null;
            int i3 = C1456j.f5971Z2;
            if (g1Var.mo1881r(i3)) {
                i2 = i3;
            }
            int i4 = this.f1539k;
            int i5 = this.f1538j;
            if (!context.isRestricted()) {
                try {
                    Typeface i6 = g1Var.mo1872i(i2, this.f1538j, new C0421a(i4, i5, new WeakReference(this.f1529a)));
                    if (i6 != null) {
                        if (i >= 28 && this.f1539k != -1) {
                            i6 = C0426f.m1867a(Typeface.create(i6, 0), this.f1539k, (this.f1538j & 2) != 0);
                        }
                        this.f1540l = i6;
                    }
                    this.f1541m = this.f1540l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1540l == null && (n = g1Var.mo1877n(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1539k == -1) {
                    typeface = Typeface.create(n, this.f1538j);
                } else {
                    Typeface create = Typeface.create(n, 0);
                    int i7 = this.f1539k;
                    if ((this.f1538j & 2) != 0) {
                        z = true;
                    }
                    typeface = C0426f.m1867a(create, i7, z);
                }
                this.f1540l = typeface;
                return;
            }
            return;
        }
        int i8 = C1456j.f5951U2;
        if (g1Var.mo1881r(i8)) {
            this.f1541m = false;
            int j2 = g1Var.mo1873j(i8, 1);
            if (j2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1540l = typeface2;
        }
    }

    /* renamed from: a */
    private void m1829a(Drawable drawable, C0320e1 e1Var) {
        if (drawable != null && e1Var != null) {
            C0327h.m1479i(drawable, e1Var, this.f1529a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0320e1 m1830d(Context context, C0327h hVar, int i) {
        ColorStateList f = hVar.mo1885f(context, i);
        if (f == null) {
            return null;
        }
        C0320e1 e1Var = new C0320e1();
        e1Var.f1271d = true;
        e1Var.f1268a = f;
        return e1Var;
    }

    /* renamed from: y */
    private void m1831y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a = C0423c.m1858a(this.f1529a);
            TextView textView = this.f1529a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C0423c.m1859b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a2 = C0423c.m1858a(this.f1529a);
            Drawable drawable7 = a2[0];
            if (drawable7 == null && a2[2] == null) {
                Drawable[] compoundDrawables = this.f1529a.getCompoundDrawables();
                TextView textView2 = this.f1529a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f1529a;
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            Drawable drawable8 = a2[2];
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            C0423c.m1859b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    /* renamed from: z */
    private void m1832z() {
        C0320e1 e1Var = this.f1536h;
        this.f1530b = e1Var;
        this.f1531c = e1Var;
        this.f1532d = e1Var;
        this.f1533e = e1Var;
        this.f1534f = e1Var;
        this.f1535g = e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2279A(int i, float f) {
        if (!C0385r1.f1473b && !mo2289l()) {
            m1827B(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2280b() {
        if (!(this.f1530b == null && this.f1531c == null && this.f1532d == null && this.f1533e == null)) {
            Drawable[] compoundDrawables = this.f1529a.getCompoundDrawables();
            m1829a(compoundDrawables[0], this.f1530b);
            m1829a(compoundDrawables[1], this.f1531c);
            m1829a(compoundDrawables[2], this.f1532d);
            m1829a(compoundDrawables[3], this.f1533e);
        }
        if (this.f1534f != null || this.f1535g != null) {
            Drawable[] a = C0423c.m1858a(this.f1529a);
            m1829a(a[0], this.f1534f);
            m1829a(a[2], this.f1535g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2281c() {
        this.f1537i.mo1802a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2282e() {
        return this.f1537i.mo1804f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2283f() {
        return this.f1537i.mo1805g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2284g() {
        return this.f1537i.mo1806h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo2285h() {
        return this.f1537i.mo1807i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2286i() {
        return this.f1537i.mo1808j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo2287j() {
        C0320e1 e1Var = this.f1536h;
        if (e1Var != null) {
            return e1Var.f1268a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo2288k() {
        C0320e1 e1Var = this.f1536h;
        if (e1Var != null) {
            return e1Var.f1269b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo2289l() {
        return this.f1537i.mo1810n();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fb  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2290m(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f1529a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.h r11 = androidx.appcompat.widget.C0327h.m1476b()
            int[] r2 = p021d.C1456j.f5964Y
            r12 = 0
            androidx.appcompat.widget.g1 r13 = androidx.appcompat.widget.C0326g1.m1455u(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1529a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo1880q()
            r6 = 0
            r3 = r20
            r5 = r21
            androidx.core.view.C0727l0.m2873W(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p021d.C1456j.f5968Z
            r14 = -1
            int r0 = r13.mo1876m(r0, r14)
            int r1 = p021d.C1456j.f5983c0
            boolean r2 = r13.mo1881r(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo1876m(r1, r12)
            androidx.appcompat.widget.e1 r1 = m1830d(r10, r11, r1)
            r7.f1530b = r1
        L_0x0042:
            int r1 = p021d.C1456j.f5973a0
            boolean r2 = r13.mo1881r(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo1876m(r1, r12)
            androidx.appcompat.widget.e1 r1 = m1830d(r10, r11, r1)
            r7.f1531c = r1
        L_0x0054:
            int r1 = p021d.C1456j.f5988d0
            boolean r2 = r13.mo1881r(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo1876m(r1, r12)
            androidx.appcompat.widget.e1 r1 = m1830d(r10, r11, r1)
            r7.f1532d = r1
        L_0x0066:
            int r1 = p021d.C1456j.f5978b0
            boolean r2 = r13.mo1881r(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo1876m(r1, r12)
            androidx.appcompat.widget.e1 r1 = m1830d(r10, r11, r1)
            r7.f1533e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = p021d.C1456j.f5993e0
            boolean r3 = r13.mo1881r(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.mo1876m(r2, r12)
            androidx.appcompat.widget.e1 r2 = m1830d(r10, r11, r2)
            r7.f1534f = r2
        L_0x008c:
            int r2 = p021d.C1456j.f5998f0
            boolean r3 = r13.mo1881r(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.mo1876m(r2, r12)
            androidx.appcompat.widget.e1 r2 = m1830d(r10, r11, r2)
            r7.f1535g = r2
        L_0x009e:
            r13.mo1882v()
            android.widget.TextView r2 = r7.f1529a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = p021d.C1456j.f5943S2
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.C0326g1.m1453s(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = p021d.C1456j.f5981b3
            boolean r6 = r0.mo1881r(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.mo1864a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.m1828C(r10, r0)
            int r15 = p021d.C1456j.f5986c3
            boolean r16 = r0.mo1881r(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.mo1877n(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = p021d.C1456j.f5976a3
            boolean r17 = r0.mo1881r(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.mo1877n(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.mo1882v()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = p021d.C1456j.f5943S2
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.C0326g1.m1455u(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = p021d.C1456j.f5981b3
            boolean r18 = r0.mo1881r(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.mo1864a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = p021d.C1456j.f5986c3
            boolean r13 = r0.mo1881r(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.mo1877n(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = p021d.C1456j.f5976a3
            boolean r6 = r0.mo1881r(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.mo1877n(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r1 = p021d.C1456j.f5947T2
            boolean r3 = r0.mo1881r(r1)
            if (r3 == 0) goto L_0x0139
            int r1 = r0.mo1868e(r1, r14)
            if (r1 != 0) goto L_0x0139
            android.widget.TextView r1 = r7.f1529a
            r3 = 0
            r1.setTextSize(r12, r3)
        L_0x0139:
            r7.m1828C(r10, r0)
            r0.mo1882v()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.mo2296s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f1540l
            if (r0 == 0) goto L_0x015b
            int r1 = r7.f1539k
            if (r1 != r14) goto L_0x0156
            android.widget.TextView r1 = r7.f1529a
            int r2 = r7.f1538j
            r1.setTypeface(r0, r2)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r1 = r7.f1529a
            r1.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f1529a
            androidx.appcompat.widget.C0420x.C0425e.m1866d(r0, r4)
        L_0x0162:
            if (r15 == 0) goto L_0x016d
            android.widget.TextView r0 = r7.f1529a
            android.os.LocaleList r1 = androidx.appcompat.widget.C0420x.C0424d.m1861a(r15)
            androidx.appcompat.widget.C0420x.C0424d.m1862b(r0, r1)
        L_0x016d:
            androidx.appcompat.widget.d0 r0 = r7.f1537i
            r0.mo1811o(r8, r9)
            boolean r0 = androidx.appcompat.widget.C0385r1.f1473b
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.d0 r0 = r7.f1537i
            int r0 = r0.mo1808j()
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.d0 r0 = r7.f1537i
            int[] r0 = r0.mo1807i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01b1
            android.widget.TextView r1 = r7.f1529a
            int r1 = androidx.appcompat.widget.C0420x.C0425e.m1863a(r1)
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01ac
            android.widget.TextView r0 = r7.f1529a
            androidx.appcompat.widget.d0 r1 = r7.f1537i
            int r1 = r1.mo1805g()
            androidx.appcompat.widget.d0 r2 = r7.f1537i
            int r2 = r2.mo1804f()
            androidx.appcompat.widget.d0 r3 = r7.f1537i
            int r3 = r3.mo1806h()
            androidx.appcompat.widget.C0420x.C0425e.m1864b(r0, r1, r2, r3, r12)
            goto L_0x01b1
        L_0x01ac:
            android.widget.TextView r1 = r7.f1529a
            androidx.appcompat.widget.C0420x.C0425e.m1865c(r1, r0, r12)
        L_0x01b1:
            int[] r0 = p021d.C1456j.f6003g0
            androidx.appcompat.widget.g1 r8 = androidx.appcompat.widget.C0326g1.m1454t(r10, r8, r0)
            int r0 = p021d.C1456j.f6043o0
            int r0 = r8.mo1876m(r0, r14)
            if (r0 == r14) goto L_0x01c5
            android.graphics.drawable.Drawable r0 = r11.mo1883c(r10, r0)
            r1 = r0
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            int r0 = p021d.C1456j.f6068t0
            int r0 = r8.mo1876m(r0, r14)
            if (r0 == r14) goto L_0x01d4
            android.graphics.drawable.Drawable r0 = r11.mo1883c(r10, r0)
            r2 = r0
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            int r0 = p021d.C1456j.f6048p0
            int r0 = r8.mo1876m(r0, r14)
            if (r0 == r14) goto L_0x01e3
            android.graphics.drawable.Drawable r0 = r11.mo1883c(r10, r0)
            r3 = r0
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            int r0 = p021d.C1456j.f6033m0
            int r0 = r8.mo1876m(r0, r14)
            if (r0 == r14) goto L_0x01f2
            android.graphics.drawable.Drawable r0 = r11.mo1883c(r10, r0)
            r4 = r0
            goto L_0x01f3
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            int r0 = p021d.C1456j.f6053q0
            int r0 = r8.mo1876m(r0, r14)
            if (r0 == r14) goto L_0x0201
            android.graphics.drawable.Drawable r0 = r11.mo1883c(r10, r0)
            r5 = r0
            goto L_0x0202
        L_0x0201:
            r5 = 0
        L_0x0202:
            int r0 = p021d.C1456j.f6038n0
            int r0 = r8.mo1876m(r0, r14)
            if (r0 == r14) goto L_0x0210
            android.graphics.drawable.Drawable r0 = r11.mo1883c(r10, r0)
            r6 = r0
            goto L_0x0211
        L_0x0210:
            r6 = 0
        L_0x0211:
            r0 = r19
            r0.m1831y(r1, r2, r3, r4, r5, r6)
            int r0 = p021d.C1456j.f6058r0
            boolean r1 = r8.mo1881r(r0)
            if (r1 == 0) goto L_0x0227
            android.content.res.ColorStateList r0 = r8.mo1866c(r0)
            android.widget.TextView r1 = r7.f1529a
            androidx.core.widget.C0828k.m3307f(r1, r0)
        L_0x0227:
            int r0 = p021d.C1456j.f6063s0
            boolean r1 = r8.mo1881r(r0)
            if (r1 == 0) goto L_0x023d
            int r0 = r8.mo1873j(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0336j0.m1542e(r0, r1)
            android.widget.TextView r1 = r7.f1529a
            androidx.core.widget.C0828k.m3308g(r1, r0)
        L_0x023d:
            int r0 = p021d.C1456j.f6078v0
            int r0 = r8.mo1868e(r0, r14)
            int r1 = p021d.C1456j.f6083w0
            int r1 = r8.mo1868e(r1, r14)
            int r2 = p021d.C1456j.f6088x0
            int r2 = r8.mo1868e(r2, r14)
            r8.mo1882v()
            if (r0 == r14) goto L_0x0259
            android.widget.TextView r3 = r7.f1529a
            androidx.core.widget.C0828k.m3309h(r3, r0)
        L_0x0259:
            if (r1 == r14) goto L_0x0260
            android.widget.TextView r0 = r7.f1529a
            androidx.core.widget.C0828k.m3310i(r0, r1)
        L_0x0260:
            if (r2 == r14) goto L_0x0267
            android.widget.TextView r0 = r7.f1529a
            androidx.core.widget.C0828k.m3311j(r0, r2)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0420x.mo2290m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2291n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1541m) {
            this.f1540l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (C0727l0.m2859I(textView)) {
                textView.post(new C0422b(textView, typeface, this.f1538j));
            } else {
                textView.setTypeface(typeface, this.f1538j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2292o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0385r1.f1473b) {
            mo2281c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2293p() {
        mo2280b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2294q(Context context, int i) {
        String n;
        C0326g1 s = C0326g1.m1453s(context, i, C1456j.f5943S2);
        int i2 = C1456j.f5981b3;
        if (s.mo1881r(i2)) {
            mo2296s(s.mo1864a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = C1456j.f5947T2;
        if (s.mo1881r(i4) && s.mo1868e(i4, -1) == 0) {
            this.f1529a.setTextSize(0, 0.0f);
        }
        m1828C(context, s);
        if (i3 >= 26) {
            int i5 = C1456j.f5976a3;
            if (s.mo1881r(i5) && (n = s.mo1877n(i5)) != null) {
                C0425e.m1866d(this.f1529a, n);
            }
        }
        s.mo1882v();
        Typeface typeface = this.f1540l;
        if (typeface != null) {
            this.f1529a.setTypeface(typeface, this.f1538j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2295r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C2719b.m11345f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2296s(boolean z) {
        this.f1529a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2297t(int i, int i2, int i3, int i4) {
        this.f1537i.mo1812p(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2298u(int[] iArr, int i) {
        this.f1537i.mo1813q(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2299v(int i) {
        this.f1537i.mo1814r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2300w(ColorStateList colorStateList) {
        if (this.f1536h == null) {
            this.f1536h = new C0320e1();
        }
        C0320e1 e1Var = this.f1536h;
        e1Var.f1268a = colorStateList;
        e1Var.f1271d = colorStateList != null;
        m1832z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2301x(PorterDuff.Mode mode) {
        if (this.f1536h == null) {
            this.f1536h = new C0320e1();
        }
        C0320e1 e1Var = this.f1536h;
        e1Var.f1269b = mode;
        e1Var.f1270c = mode != null;
        m1832z();
    }
}
