package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0521d;
import androidx.core.provider.C0602g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p063k.C1774g;

/* renamed from: androidx.core.graphics.f */
class C0565f extends C0569j {

    /* renamed from: b */
    private static final Class<?> f2572b;

    /* renamed from: c */
    private static final Constructor<?> f2573c;

    /* renamed from: d */
    private static final Method f2574d;

    /* renamed from: e */
    private static final Method f2575e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f2573c = constructor;
        f2572b = cls;
        f2574d = method;
        f2575e = method2;
    }

    C0565f() {
    }

    /* renamed from: h */
    private static boolean m2329h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2574d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static Typeface m2330i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2572b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2575e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m2331j() {
        Method method = f2574d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: k */
    private static Object m2332k() {
        try {
            return f2573c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo2619a(Context context, C0521d.C0524c cVar, Resources resources, int i) {
        Object k = m2332k();
        if (k == null) {
            return null;
        }
        for (C0521d.C0525d dVar : cVar.mo2577a()) {
            ByteBuffer b = C0572k.m2374b(context, resources, dVar.mo2579b());
            if (b == null || !m2329h(k, b, dVar.mo2580c(), dVar.mo2582e(), dVar.mo2583f())) {
                return null;
            }
        }
        return m2330i(k);
    }

    /* renamed from: b */
    public Typeface mo2620b(Context context, CancellationSignal cancellationSignal, C0602g.C0604b[] bVarArr, int i) {
        Object k = m2332k();
        if (k == null) {
            return null;
        }
        C1774g gVar = new C1774g();
        for (C0602g.C0604b bVar : bVarArr) {
            Uri d = bVar.mo2676d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C0572k.m2378f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m2329h(k, byteBuffer, bVar.mo2675c(), bVar.mo2677e(), bVar.mo2678f())) {
                return null;
            }
        }
        Typeface i2 = m2330i(k);
        if (i2 == null) {
            return null;
        }
        return Typeface.create(i2, i);
    }
}
