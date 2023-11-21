package miuix.autodensity;

import android.app.ResourcesManager;
import android.content.Context;
import android.content.res.CompatibilityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.ResourcesImpl;
import android.content.res.ResourcesKey;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.ref.WeakReference;
import miuix.view.C2402g;
import p005a4.C0039a;

/* renamed from: miuix.autodensity.f */
public class C2283f {

    /* renamed from: a */
    private static ResourcesManager f8687a;

    /* renamed from: b */
    private static ArrayMap<ResourcesKey, WeakReference<ResourcesImpl>> f8688b;

    /* renamed from: c */
    private static Object f8689c;

    static {
        try {
            f8687a = (ResourcesManager) C0039a.m44e(ResourcesManager.class, new Class[0], new Object[0]);
            ResourcesManager instance = ResourcesManager.getInstance();
            f8687a = instance;
            f8688b = (ArrayMap) C0039a.m49j(ResourcesManager.class, instance, "mResourceImpls");
            f8689c = f8687a;
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                f8689c = C0039a.m49j(ResourcesManager.class, f8687a, "mLock");
            } catch (Exception unused2) {
                f8689c = null;
            }
        }
        if (f8687a == null || f8688b == null || f8689c == null) {
            Log.w("AutoDensity", "ResourcesManager reflection failed, this app do not have permission to disable AutoDensity for activity/application");
        }
    }

    /* renamed from: a */
    private static void m9652a(Resources resources) {
        C2278c l = C2279d.m9636h().mo8628l();
        if (l != null && resources.getDisplayMetrics().densityDpi != l.f9352b) {
            m9657f(resources, l);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            int i = l.f9352b;
            configuration.densityDpi = i;
            displayMetrics.densityDpi = i;
            displayMetrics.density = l.f9353c;
            displayMetrics.scaledDensity = l.f9354d;
            configuration.fontScale = l.f9355e;
            if (AutoDensityConfig.shouldUpdateSystemResource()) {
                m9656e(l);
            }
            C2277b.m9629c("after changeDensity " + displayMetrics + " " + configuration);
        }
    }

    /* renamed from: b */
    private static ResourcesImpl m9653b(ResourcesKey resourcesKey, C2402g gVar) {
        StringBuilder sb;
        ResourcesKey resourcesKey2 = resourcesKey;
        Class cls = String.class;
        Class cls2 = String[].class;
        try {
            Configuration configuration = new Configuration();
            configuration.setTo((Configuration) C0039a.m49j(ResourcesKey.class, resourcesKey2, "mOverrideConfiguration"));
            configuration.densityDpi = gVar.f9352b;
            int intValue = ((Integer) C0039a.m49j(ResourcesKey.class, resourcesKey2, "mDisplayId")).intValue();
            Object obj = (String[]) C0039a.m49j(ResourcesKey.class, resourcesKey2, "mLibDirs");
            Object obj2 = (CompatibilityInfo) C0039a.m49j(ResourcesKey.class, resourcesKey2, "mCompatInfo");
            int i = Build.VERSION.SDK_INT;
            Object obj3 = (String[]) (i <= 30 ? C0039a.m49j(ResourcesKey.class, resourcesKey2, "mOverlayDirs") : C0039a.m49j(ResourcesKey.class, resourcesKey2, "mOverlayPaths"));
            Object obj4 = (ResourcesKey) (i <= 29 ? C0039a.m44e(ResourcesKey.class, new Class[]{cls, cls2, cls2, cls2, Integer.TYPE, Configuration.class, CompatibilityInfo.class}, resourcesKey2.mResDir, resourcesKey2.mSplitResDirs, obj3, obj, Integer.valueOf(intValue), configuration, obj2) : C0039a.m44e(ResourcesKey.class, new Class[]{cls, cls2, cls2, cls2, Integer.TYPE, Configuration.class, CompatibilityInfo.class, ResourcesLoader[].class}, resourcesKey2.mResDir, resourcesKey2.mSplitResDirs, obj3, obj, Integer.valueOf(intValue), configuration, obj2, (ResourcesLoader[]) C0039a.m49j(ResourcesKey.class, resourcesKey2, "mLoaders")));
            C2277b.m9629c("newKey " + obj4);
            return (ResourcesImpl) C0039a.m54o(ResourcesManager.class, f8687a, "findOrCreateResourcesImplForKeyLocked", new Class[]{ResourcesKey.class}, obj4);
        } catch (Exception e) {
            e = e;
            sb = new StringBuilder();
            sb.append("findOrCreateResourcesImplForKeyLocked failed ");
            sb.append(e.toString());
            C2277b.m9629c(sb.toString());
            return null;
        } catch (Error e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("findOrCreateResourcesImplForKeyLocked failed ");
            sb.append(e.toString());
            C2277b.m9629c(sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    private static ResourcesKey m9654c(ResourcesImpl resourcesImpl) {
        int size = f8688b.size();
        int i = 0;
        while (true) {
            ResourcesImpl resourcesImpl2 = null;
            if (i >= size) {
                return null;
            }
            WeakReference valueAt = f8688b.valueAt(i);
            if (valueAt != null) {
                resourcesImpl2 = (ResourcesImpl) valueAt.get();
            }
            if (resourcesImpl == resourcesImpl2) {
                return f8688b.keyAt(i);
            }
            i++;
        }
    }

    /* renamed from: d */
    private static void m9655d(int i) {
        Class<Bitmap> cls = Bitmap.class;
        try {
            C0039a.m52m(cls, (Object) null, "setDefaultDensity", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            C2277b.m9629c("setDefaultBitmapDensity " + i);
        } catch (Exception e) {
            C2277b.m9629c("reflect exception: " + e.toString());
        }
    }

    /* renamed from: e */
    public static void m9656e(C2402g gVar) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = gVar.f9352b;
        configuration.densityDpi = i;
        displayMetrics.densityDpi = i;
        displayMetrics.scaledDensity = gVar.f9354d;
        displayMetrics.density = gVar.f9353c;
        configuration.fontScale = gVar.f9355e;
        m9655d(gVar.f9351a);
        C2277b.m9629c("setSystemResources " + displayMetrics + " " + configuration + " defaultBitmapDensity:" + gVar.f9351a);
    }

    /* renamed from: f */
    private static void m9657f(Resources resources, C2402g gVar) {
        Object obj;
        ResourcesImpl b;
        if (f8687a != null && f8688b != null && (obj = f8689c) != null) {
            try {
                synchronized (obj) {
                    ResourcesKey c = m9654c((ResourcesImpl) C0039a.m49j(Resources.class, resources, "mResourcesImpl"));
                    C2277b.m9629c("oldKey " + c);
                    if (!(c == null || (b = m9653b(c, gVar)) == null)) {
                        C0039a.m52m(Resources.class, resources, "setImpl", new Class[]{ResourcesImpl.class}, b);
                        C2277b.m9629c("set impl success " + b);
                    }
                }
            } catch (Exception e) {
                C2277b.m9629c("tryToCreateAndSetResourcesImpl failed " + e.toString());
            }
        }
    }

    /* renamed from: g */
    public static void m9658g(Context context) {
        if (context == null) {
            Log.w("AutoDensity", "context should not null");
        } else if (C2279d.m9636h().mo8630o()) {
            m9652a(context.getResources());
        }
    }
}
