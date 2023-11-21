package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0521d;
import androidx.core.provider.C0602g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.e */
class C0564e extends C0569j {

    /* renamed from: b */
    private static Class<?> f2567b = null;

    /* renamed from: c */
    private static Constructor<?> f2568c = null;

    /* renamed from: d */
    private static Method f2569d = null;

    /* renamed from: e */
    private static Method f2570e = null;

    /* renamed from: f */
    private static boolean f2571f = false;

    C0564e() {
    }

    /* renamed from: h */
    private static boolean m2322h(Object obj, String str, int i, boolean z) {
        m2325k();
        try {
            return ((Boolean) f2569d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    private static Typeface mo2622i(Object obj) {
        m2325k();
        try {
            Object newInstance = Array.newInstance(f2567b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2570e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    private File m2324j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: k */
    private static void m2325k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f2571f) {
            f2571f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f2568c = constructor;
            f2567b = cls;
            f2569d = method;
            f2570e = method2;
        }
    }

    /* renamed from: l */
    private static Object m2326l() {
        m2325k();
        try {
            return f2568c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo2619a(Context context, C0521d.C0524c cVar, Resources resources, int i) {
        Object l = m2326l();
        C0521d.C0525d[] a = cVar.mo2577a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0521d.C0525d dVar = a[i2];
            File e = C0572k.m2377e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C0572k.m2375c(e, resources, dVar.mo2579b())) {
                    e.delete();
                    return null;
                } else if (!m2322h(l, e.getPath(), dVar.mo2582e(), dVar.mo2583f())) {
                    return null;
                } else {
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo2622i(l);
    }

    /* renamed from: b */
    public Typeface mo2620b(Context context, CancellationSignal cancellationSignal, C0602g.C0604b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C0602g.C0604b g = mo2630g(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g.mo2676d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j = m2324j(openFileDescriptor);
                if (j != null) {
                    if (j.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(j);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c = super.mo2631c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
