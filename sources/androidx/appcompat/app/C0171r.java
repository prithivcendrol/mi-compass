package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.r */
class C0171r {

    /* renamed from: a */
    private static Field f502a;

    /* renamed from: b */
    private static boolean f503b;

    /* renamed from: c */
    private static Class<?> f504c;

    /* renamed from: d */
    private static boolean f505d;

    /* renamed from: e */
    private static Field f506e;

    /* renamed from: f */
    private static boolean f507f;

    /* renamed from: g */
    private static Field f508g;

    /* renamed from: h */
    private static boolean f509h;

    /* renamed from: androidx.appcompat.app.r$a */
    static class C0172a {
        /* renamed from: a */
        static void m633a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    static void m630a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            m631b(resources);
        }
    }

    /* renamed from: b */
    private static void m631b(Resources resources) {
        Object obj;
        if (!f509h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f508g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f509h = true;
        }
        Field field = f508g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f503b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f502a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f503b = true;
                }
                Field field2 = f502a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m632c(obj2);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m632c(Object obj) {
        if (!f505d) {
            try {
                f504c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f505d = true;
        }
        Class<?> cls = f504c;
        if (cls != null) {
            if (!f507f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f506e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f507f = true;
            }
            Field field = f506e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    C0172a.m633a(longSparseArray);
                }
            }
        }
    }
}
