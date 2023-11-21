package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.C0619c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.f */
public final class C0528f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2520a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0532d, SparseArray<C0531c>> f2521b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2522c = new Object();

    /* renamed from: androidx.core.content.res.f$a */
    static class C0529a {
        /* renamed from: a */
        static Drawable m2209a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m2210b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: androidx.core.content.res.f$b */
    static class C0530b {
        /* renamed from: a */
        static int m2211a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m2212b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.f$c */
    private static class C0531c {

        /* renamed from: a */
        final ColorStateList f2523a;

        /* renamed from: b */
        final Configuration f2524b;

        /* renamed from: c */
        final int f2525c;

        C0531c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f2523a = colorStateList;
            this.f2524b = configuration;
            this.f2525c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: androidx.core.content.res.f$d */
    private static final class C0532d {

        /* renamed from: a */
        final Resources f2526a;

        /* renamed from: b */
        final Resources.Theme f2527b;

        C0532d(Resources resources, Resources.Theme theme) {
            this.f2526a = resources;
            this.f2527b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0532d.class != obj.getClass()) {
                return false;
            }
            C0532d dVar = (C0532d) obj;
            return this.f2526a.equals(dVar.f2526a) && C0619c.m2480a(this.f2527b, dVar.f2527b);
        }

        public int hashCode() {
            return C0619c.m2481b(this.f2526a, this.f2527b);
        }
    }

    /* renamed from: androidx.core.content.res.f$e */
    public static abstract class C0533e {
        /* renamed from: e */
        public static Handler m2215e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void mo2590c(int i, Handler handler) {
            m2215e(handler).post(new C0538h(this, i));
        }

        /* renamed from: d */
        public final void mo2591d(Typeface typeface, Handler handler) {
            m2215e(handler).post(new C0537g(this, typeface));
        }

        /* renamed from: h */
        public abstract void m2216f(int i);

        /* renamed from: i */
        public abstract void m2217g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.f$f */
    public static final class C0534f {

        /* renamed from: androidx.core.content.res.f$f$a */
        static class C0535a {

            /* renamed from: a */
            private static final Object f2528a = new Object();

            /* renamed from: b */
            private static Method f2529b;

            /* renamed from: c */
            private static boolean f2530c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            static void m2223a(Resources.Theme theme) {
                synchronized (f2528a) {
                    if (!f2530c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2529b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f2530c = true;
                    }
                    Method method = f2529b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f2529b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.f$f$b */
        static class C0536b {
            /* renamed from: a */
            static void m2224a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m2222a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0536b.m2224a(theme);
            } else {
                C0535a.m2223a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m2198a(C0532d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2522c) {
            WeakHashMap<C0532d, SparseArray<C0531c>> weakHashMap = f2521b;
            SparseArray sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i, new C0531c(colorStateList, dVar.f2526a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2199b(androidx.core.content.res.C0528f.C0532d r5, int r6) {
        /*
            java.lang.Object r0 = f2522c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.f$d, android.util.SparseArray<androidx.core.content.res.f$c>> r1 = f2521b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.f$c r2 = (androidx.core.content.res.C0528f.C0531c) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f2524b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f2526a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f2527b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f2525c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f2525c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f2523a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0528f.m2199b(androidx.core.content.res.f$d, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m2200c(Resources resources, int i, Resources.Theme theme) {
        C0532d dVar = new C0532d(resources, theme);
        ColorStateList b = m2199b(dVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList h = m2205h(resources, i, theme);
        if (h == null) {
            return C0530b.m2212b(resources, i, theme);
        }
        m2198a(dVar, i, h, theme);
        return h;
    }

    /* renamed from: d */
    public static Drawable m2201d(Resources resources, int i, Resources.Theme theme) {
        return C0529a.m2209a(resources, i, theme);
    }

    /* renamed from: e */
    public static Drawable m2202e(Resources resources, int i, int i2, Resources.Theme theme) {
        return C0529a.m2210b(resources, i, i2, theme);
    }

    /* renamed from: f */
    public static Typeface m2203f(Context context, int i, TypedValue typedValue, int i2, C0533e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m2207j(context, i, typedValue, i2, eVar, (Handler) null, true, false);
    }

    /* renamed from: g */
    private static TypedValue m2204g() {
        ThreadLocal<TypedValue> threadLocal = f2520a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: h */
    private static ColorStateList m2205h(Resources resources, int i, Resources.Theme theme) {
        if (m2206i(resources, i)) {
            return null;
        }
        try {
            return C0520c.m2168a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m2206i(Resources resources, int i) {
        TypedValue g = m2204g();
        resources.getValue(i, g, true);
        int i2 = g.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: j */
    private static Typeface m2207j(Context context, int i, TypedValue typedValue, int i2, C0533e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface k = m2208k(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (k != null || eVar != null || z2) {
            return k;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m2208k(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0528f.C0533e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00ae
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.mo2590c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0547d.m2264f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.mo2591d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            androidx.core.content.res.d$b r2 = androidx.core.content.res.C0521d.m2176b(r2, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.mo2590c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0547d.m2261c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0547d.m2262d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.mo2591d(r0, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.mo2590c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x009b
        L_0x0093:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x009b:
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            if (r11 == 0) goto L_0x00ad
            r11.mo2590c(r15, r12)
        L_0x00ad:
            return r16
        L_0x00ae:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0528f.m2208k(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.f$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
