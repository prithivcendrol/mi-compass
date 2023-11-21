package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0510a;
import androidx.core.graphics.drawable.C0553a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p039g.C1584b;
import p063k.C1772e;
import p063k.C1773f;
import p063k.C1774g;
import p063k.C1775h;
import p064k0.C1777b;

/* renamed from: androidx.appcompat.widget.v0 */
public final class C0413v0 {

    /* renamed from: h */
    private static final PorterDuff.Mode f1516h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0413v0 f1517i;

    /* renamed from: j */
    private static final C0414a f1518j = new C0414a(6);

    /* renamed from: a */
    private WeakHashMap<Context, C1775h<ColorStateList>> f1519a;

    /* renamed from: b */
    private C1774g<String, C0415b> f1520b;

    /* renamed from: c */
    private C1775h<String> f1521c;

    /* renamed from: d */
    private final WeakHashMap<Context, C1772e<WeakReference<Drawable.ConstantState>>> f1522d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1523e;

    /* renamed from: f */
    private boolean f1524f;

    /* renamed from: g */
    private C0416c f1525g;

    /* renamed from: androidx.appcompat.widget.v0$a */
    private static class C0414a extends C1773f<Integer, PorterDuffColorFilter> {
        public C0414a(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m1814h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public PorterDuffColorFilter mo2273i(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo6144c(Integer.valueOf(m1814h(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public PorterDuffColorFilter mo2274j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo6145d(Integer.valueOf(m1814h(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.v0$b */
    private interface C0415b {
        /* renamed from: a */
        Drawable mo2275a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.v0$c */
    public interface C0416c {
        /* renamed from: a */
        boolean mo1887a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo1888b(int i);

        /* renamed from: c */
        Drawable mo1889c(C0413v0 v0Var, Context context, int i);

        /* renamed from: d */
        ColorStateList mo1890d(Context context, int i);

        /* renamed from: e */
        boolean mo1891e(Context context, int i, Drawable drawable);
    }

    /* renamed from: a */
    private synchronized boolean m1791a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1772e eVar = this.f1522d.get(context);
            if (eVar == null) {
                eVar = new C1772e();
                this.f1522d.put(context, eVar);
            }
            eVar.mo6136h(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private void m1792b(Context context, int i, ColorStateList colorStateList) {
        if (this.f1519a == null) {
            this.f1519a = new WeakHashMap<>();
        }
        C1775h hVar = this.f1519a.get(context);
        if (hVar == null) {
            hVar = new C1775h();
            this.f1519a.put(context, hVar);
        }
        hVar.mo6175a(i, colorStateList);
    }

    /* renamed from: c */
    private void m1793c(Context context) {
        if (!this.f1524f) {
            this.f1524f = true;
            Drawable i = mo2265i(context, C1584b.f6362a);
            if (i == null || !m1802p(i)) {
                this.f1524f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: d */
    private static long m1794d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: e */
    private Drawable m1795e(Context context, int i) {
        if (this.f1523e == null) {
            this.f1523e = new TypedValue();
        }
        TypedValue typedValue = this.f1523e;
        context.getResources().getValue(i, typedValue, true);
        long d = m1794d(typedValue);
        Drawable h = m1798h(context, d);
        if (h != null) {
            return h;
        }
        C0416c cVar = this.f1525g;
        Drawable c = cVar == null ? null : cVar.mo1889c(this, context, i);
        if (c != null) {
            c.setChangingConfigurations(typedValue.changingConfigurations);
            m1791a(context, d, c);
        }
        return c;
    }

    /* renamed from: f */
    private static PorterDuffColorFilter m1796f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1799k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: g */
    public static synchronized C0413v0 m1797g() {
        C0413v0 v0Var;
        synchronized (C0413v0.class) {
            if (f1517i == null) {
                C0413v0 v0Var2 = new C0413v0();
                f1517i = v0Var2;
                m1801o(v0Var2);
            }
            v0Var = f1517i;
        }
        return v0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1798h(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, k.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1522d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            k.e r0 = (p063k.C1772e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo6132d(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo6137i(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0413v0.m1798h(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: k */
    public static synchronized PorterDuffColorFilter m1799k(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter i2;
        synchronized (C0413v0.class) {
            C0414a aVar = f1518j;
            i2 = aVar.mo2273i(i, mode);
            if (i2 == null) {
                i2 = new PorterDuffColorFilter(i, mode);
                aVar.mo2274j(i, mode, i2);
            }
        }
        return i2;
    }

    /* renamed from: m */
    private ColorStateList m1800m(Context context, int i) {
        C1775h hVar;
        WeakHashMap<Context, C1775h<ColorStateList>> weakHashMap = this.f1519a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo6179e(i);
    }

    /* renamed from: o */
    private static void m1801o(C0413v0 v0Var) {
    }

    /* renamed from: p */
    private static boolean m1802p(Drawable drawable) {
        return (drawable instanceof C1777b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1803q(android.content.Context r11, int r12) {
        /*
            r10 = this;
            k.g<java.lang.String, androidx.appcompat.widget.v0$b> r0 = r10.f1520b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            k.h<java.lang.String> r0 = r10.f1521c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo6179e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            k.g<java.lang.String, androidx.appcompat.widget.v0$b> r3 = r10.f1520b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            k.h r0 = new k.h
            r0.<init>()
            r10.f1521c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1523e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1523e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1523e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1794d(r0)
            android.graphics.drawable.Drawable r6 = r10.m1798h(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            k.h<java.lang.String> r8 = r10.f1521c     // Catch:{ Exception -> 0x00a2 }
            r8.mo6175a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            k.g<java.lang.String, androidx.appcompat.widget.v0$b> r8 = r10.f1520b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.v0$b r3 = (androidx.appcompat.widget.C0413v0.C0415b) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2275a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1791a(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            k.h<java.lang.String> r11 = r10.f1521c
            r11.mo6175a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0413v0.m1803q(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: u */
    private Drawable m1804u(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList l = mo2267l(context, i);
        if (l != null) {
            if (C0336j0.m1538a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable j = C0553a.m2297j(drawable);
            C0553a.m2294g(j, l);
            PorterDuff.Mode n = mo2268n(i);
            if (n == null) {
                return j;
            }
            C0553a.m2295h(j, n);
            return j;
        }
        C0416c cVar = this.f1525g;
        if ((cVar == null || !cVar.mo1891e(context, i, drawable)) && !mo2272w(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: v */
    static void m1805v(Drawable drawable, C0320e1 e1Var, int[] iArr) {
        int[] state = drawable.getState();
        if (C0336j0.m1538a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = e1Var.f1271d;
        if (z || e1Var.f1270c) {
            drawable.setColorFilter(m1796f(z ? e1Var.f1268a : null, e1Var.f1270c ? e1Var.f1269b : f1516h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: i */
    public synchronized Drawable mo2265i(Context context, int i) {
        return mo2266j(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized Drawable mo2266j(Context context, int i, boolean z) {
        Drawable q;
        m1793c(context);
        q = m1803q(context, i);
        if (q == null) {
            q = m1795e(context, i);
        }
        if (q == null) {
            q = C0510a.m2124e(context, i);
        }
        if (q != null) {
            q = m1804u(context, i, z, q);
        }
        if (q != null) {
            C0336j0.m1539b(q);
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized ColorStateList mo2267l(Context context, int i) {
        ColorStateList m;
        m = m1800m(context, i);
        if (m == null) {
            C0416c cVar = this.f1525g;
            m = cVar == null ? null : cVar.mo1890d(context, i);
            if (m != null) {
                m1792b(context, i, m);
            }
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public PorterDuff.Mode mo2268n(int i) {
        C0416c cVar = this.f1525g;
        if (cVar == null) {
            return null;
        }
        return cVar.mo1888b(i);
    }

    /* renamed from: r */
    public synchronized void mo2269r(Context context) {
        C1772e eVar = this.f1522d.get(context);
        if (eVar != null) {
            eVar.mo6129a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized Drawable mo2270s(Context context, C0382q1 q1Var, int i) {
        Drawable q = m1803q(context, i);
        if (q == null) {
            q = q1Var.mo2278a(i);
        }
        if (q == null) {
            return null;
        }
        return m1804u(context, i, false, q);
    }

    /* renamed from: t */
    public synchronized void mo2271t(C0416c cVar) {
        this.f1525g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo2272w(Context context, int i, Drawable drawable) {
        C0416c cVar = this.f1525g;
        return cVar != null && cVar.mo1887a(context, i, drawable);
    }
}
