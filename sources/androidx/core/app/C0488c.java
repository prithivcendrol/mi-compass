package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
final class C0488c {

    /* renamed from: a */
    protected static final Class<?> f2461a;

    /* renamed from: b */
    protected static final Field f2462b = m2070b();

    /* renamed from: c */
    protected static final Field f2463c = m2074f();

    /* renamed from: d */
    protected static final Method f2464d;

    /* renamed from: e */
    protected static final Method f2465e;

    /* renamed from: f */
    protected static final Method f2466f;

    /* renamed from: g */
    private static final Handler f2467g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    class C0489a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0492d f2468d;

        /* renamed from: e */
        final /* synthetic */ Object f2469e;

        C0489a(C0492d dVar, Object obj) {
            this.f2468d = dVar;
            this.f2469e = obj;
        }

        public void run() {
            this.f2468d.f2474a = this.f2469e;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    class C0490b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Application f2470d;

        /* renamed from: e */
        final /* synthetic */ C0492d f2471e;

        C0490b(Application application, C0492d dVar) {
            this.f2470d = application;
            this.f2471e = dVar;
        }

        public void run() {
            this.f2470d.unregisterActivityLifecycleCallbacks(this.f2471e);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    class C0491c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Object f2472d;

        /* renamed from: e */
        final /* synthetic */ Object f2473e;

        C0491c(Object obj, Object obj2) {
            this.f2472d = obj;
            this.f2473e = obj2;
        }

        public void run() {
            try {
                Method method = C0488c.f2464d;
                if (method != null) {
                    method.invoke(this.f2472d, new Object[]{this.f2473e, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0488c.f2465e.invoke(this.f2472d, new Object[]{this.f2473e, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    private static final class C0492d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f2474a;

        /* renamed from: b */
        private Activity f2475b;

        /* renamed from: c */
        private final int f2476c;

        /* renamed from: d */
        private boolean f2477d = false;

        /* renamed from: e */
        private boolean f2478e = false;

        /* renamed from: f */
        private boolean f2479f = false;

        C0492d(Activity activity) {
            this.f2475b = activity;
            this.f2476c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2475b == activity) {
                this.f2475b = null;
                this.f2478e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2478e && !this.f2479f && !this.f2477d && C0488c.m2076h(this.f2474a, this.f2476c, activity)) {
                this.f2479f = true;
                this.f2474a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2475b == activity) {
                this.f2477d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m2069a();
        f2461a = a;
        f2464d = m2072d(a);
        f2465e = m2071c(a);
        f2466f = m2073e(a);
    }

    /* renamed from: a */
    private static Class<?> m2069a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2070b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2071c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2072d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2073e(Class<?> cls) {
        if (m2075g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2074f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2075g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m2076h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f2463c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f2467g.postAtFrontOfQueue(new C0491c(f2462b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m2077i(Activity activity) {
        Object obj;
        Application application;
        C0492d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2075g() && f2466f == null) {
            return false;
        } else {
            if (f2465e == null && f2464d == null) {
                return false;
            }
            try {
                Object obj2 = f2463c.get(activity);
                if (obj2 == null || (obj = f2462b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0492d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2467g;
                handler.post(new C0489a(dVar, obj2));
                if (m2075g()) {
                    Method method = f2466f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0490b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
