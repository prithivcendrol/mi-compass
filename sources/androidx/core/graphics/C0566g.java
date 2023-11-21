package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0521d;
import androidx.core.provider.C0602g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.g */
public class C0566g extends C0564e {

    /* renamed from: g */
    protected final Class<?> f2576g;

    /* renamed from: h */
    protected final Constructor<?> f2577h;

    /* renamed from: i */
    protected final Method f2578i;

    /* renamed from: j */
    protected final Method f2579j;

    /* renamed from: k */
    protected final Method f2580k;

    /* renamed from: l */
    protected final Method f2581l;

    /* renamed from: m */
    protected final Method f2582m;

    public C0566g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> v = mo2627v();
            constructor = mo2628w(v);
            method4 = mo2624s(v);
            method3 = mo2625t(v);
            method2 = mo2629x(v);
            method = mo2623r(v);
            Class<?> cls2 = v;
            method5 = mo2626u(v);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2576g = cls;
        this.f2577h = constructor;
        this.f2578i = method4;
        this.f2579j = method3;
        this.f2580k = method2;
        this.f2581l = method;
        this.f2582m = method5;
    }

    /* renamed from: l */
    private Object m2335l() {
        try {
            return this.f2577h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m2336m(Object obj) {
        try {
            this.f2581l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    private boolean m2337n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2578i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m2338o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2579j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m2339p(Object obj) {
        try {
            return ((Boolean) this.f2580k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m2340q() {
        if (this.f2578i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2578i != null;
    }

    /* renamed from: a */
    public Typeface mo2619a(Context context, C0521d.C0524c cVar, Resources resources, int i) {
        if (!m2340q()) {
            return super.mo2619a(context, cVar, resources, i);
        }
        Object l = m2335l();
        if (l == null) {
            return null;
        }
        for (C0521d.C0525d dVar : cVar.mo2577a()) {
            if (!m2337n(context, l, dVar.mo2578a(), dVar.mo2580c(), dVar.mo2582e(), dVar.mo2583f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.mo2581d()))) {
                m2336m(l);
                return null;
            }
        }
        if (!m2339p(l)) {
            return null;
        }
        return mo2622i(l);
    }

    /* renamed from: b */
    public Typeface mo2620b(Context context, CancellationSignal cancellationSignal, C0602g.C0604b[] bVarArr, int i) {
        Typeface i2;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m2340q()) {
            C0602g.C0604b g = mo2630g(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(g.mo2676d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(g.mo2677e()).setItalic(g.mo2678f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h = C0572k.m2380h(context, bVarArr, cancellationSignal);
            Object l = m2335l();
            if (l == null) {
                return null;
            }
            boolean z = false;
            for (C0602g.C0604b bVar : bVarArr) {
                ByteBuffer byteBuffer = h.get(bVar.mo2676d());
                if (byteBuffer != null) {
                    if (!m2338o(l, byteBuffer, bVar.mo2675c(), bVar.mo2677e(), bVar.mo2678f() ? 1 : 0)) {
                        m2336m(l);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m2336m(l);
                return null;
            } else if (m2339p(l) && (i2 = mo2622i(l)) != null) {
                return Typeface.create(i2, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: d */
    public Typeface mo2621d(Context context, Resources resources, int i, String str, int i2) {
        if (!m2340q()) {
            return super.mo2621d(context, resources, i, str, i2);
        }
        Object l = m2335l();
        if (l == null) {
            return null;
        }
        if (!m2337n(context, l, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m2336m(l);
            return null;
        } else if (!m2339p(l)) {
            return null;
        } else {
            return mo2622i(l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Typeface mo2622i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2576g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2582m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Method mo2623r(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Method mo2624s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Method mo2625t(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo2626u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Class<?> mo2627v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Constructor<?> mo2628w(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo2629x(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
