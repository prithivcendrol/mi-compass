package miuix.autodensity;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.ICompatCameraControlCallback;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewRootImpl;
import miuix.autodensity.C2280e;
import p005a4.C0039a;
import p012b2.C1311c;
import p117t2.C2693a;
import p117t2.C2709i;
import p117t2.C2711k;

public class AutoDensityConfig extends C2280e {
    private static final String TAG_CONFIG_CHANGE_FRAGMENT = "ConfigurationChangeFragment";
    private static AutoDensityConfig sInstance = null;
    private static boolean sUpdateSystemResources = true;
    private boolean sCanAccessHiddenAPI = false;

    private AutoDensityConfig(final Application application) {
        prepareInApplication(application);
        if (application instanceof C1311c) {
            C1311c cVar = (C1311c) application;
            cVar.mo5134b(new C2280e.C2282b(this));
            cVar.mo5135c(new ComponentCallbacks() {
                public void onConfigurationChanged(Configuration configuration) {
                    AutoDensityConfig.this.processOnAppConfigChanged(application, configuration);
                }

                public void onLowMemory() {
                }
            });
            return;
        }
        application.registerActivityLifecycleCallbacks(new C2280e.C2282b(this));
        application.registerComponentCallbacks(new ComponentCallbacks() {
            public void onConfigurationChanged(Configuration configuration) {
                AutoDensityConfig.this.processOnAppConfigChanged(application, configuration);
            }

            public void onLowMemory() {
            }
        });
    }

    private void addForOnConfigurationChange(Activity activity) {
        Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
        if (configurationChangeFragment == null) {
            C2276a aVar = new C2276a();
            aVar.mo8624b(this);
            activity.getFragmentManager().beginTransaction().add(aVar, TAG_CONFIG_CHANGE_FRAGMENT).commitAllowingStateLoss();
            return;
        }
        ((C2276a) configurationChangeFragment).mo8624b(this);
        Log.d("AutoDensity", "ConfigurationChangeFragment has already added");
    }

    private void changeCurrentConfig(Activity activity) {
        Class cls = Activity.class;
        try {
            ((Configuration) C0039a.m49j(cls, activity, "mCurrentConfig")).densityDpi = C2279d.m9636h().mo8628l().f9352b;
            ActivityInfo activityInfo = (ActivityInfo) C0039a.m49j(cls, activity, "mActivityInfo");
            int i = activityInfo.configChanges;
            if ((i & 4096) == 0) {
                activityInfo.configChanges = i | 4096;
                Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
                if (configurationChangeFragment != null) {
                    ((C2276a) configurationChangeFragment).mo8623a();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void forceUpdateDensity(Context context) {
        if (sInstance != null) {
            C2283f.m9658g(context);
        }
    }

    private Fragment getConfigurationChangeFragment(Activity activity) {
        return activity.getFragmentManager().findFragmentByTag(TAG_CONFIG_CHANGE_FRAGMENT);
    }

    public static AutoDensityConfig init(Application application) {
        if (sInstance == null) {
            sInstance = init(application, true);
        }
        return sInstance;
    }

    public static AutoDensityConfig init(Application application, boolean z) {
        if (sInstance == null) {
            sUpdateSystemResources = z;
            sInstance = new AutoDensityConfig(application);
        }
        return sInstance;
    }

    private boolean isShouldAdaptAutoDensity(Application application) {
        if (application instanceof C2284g) {
            return ((C2284g) application).mo5258a();
        }
        return true;
    }

    private void removeCurrentConfig(Activity activity) {
        try {
            C0039a.m57r(Activity.class, activity, "mCurrentConfig", (Object) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setUpdateSystemRes(boolean z) {
        C2283f.m9656e(z ? C2279d.m9636h().mo8628l() : C2279d.m9636h().mo8627k());
    }

    public static boolean shouldUpdateSystemResource() {
        return sUpdateSystemResources;
    }

    private void tryToAddActivityConfigCallback(final Activity activity) {
        if (this.sCanAccessHiddenAPI && Build.VERSION.SDK_INT >= 26) {
            View decorView = activity.getWindow().getDecorView();
            C22743 r1 = new View.OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(View view) {
                    try {
                        Object o = C0039a.m54o(View.class, view, "getViewRootImpl", new Class[0], new Object[0]);
                        final Object j = C0039a.m49j(ViewRootImpl.class, o, "mActivityConfigCallback");
                        C0039a.m54o(ViewRootImpl.class, o, "setActivityConfigCallback", new Class[]{ViewRootImpl.ActivityConfigCallback.class}, new ViewRootImpl.ActivityConfigCallback() {
                            public void onConfigurationChanged(Configuration configuration, int i) {
                                Class<ViewRootImpl.ActivityConfigCallback> cls = ViewRootImpl.ActivityConfigCallback.class;
                                try {
                                    C0039a.m54o(cls, j, "onConfigurationChanged", new Class[]{Configuration.class, Integer.TYPE}, configuration, Integer.valueOf(i));
                                    C2283f.m9658g(activity);
                                } catch (Exception unused) {
                                }
                            }

                            public void requestCompatCameraControl(boolean z, boolean z2, ICompatCameraControlCallback iCompatCameraControlCallback) {
                            }
                        });
                    } catch (Exception unused) {
                    }
                    view.removeOnAttachStateChangeListener(this);
                }

                public void onViewDetachedFromWindow(View view) {
                }
            };
            decorView.addOnAttachStateChangeListener(r1);
            this.mModifier.get(Integer.valueOf(activity.hashCode())).mo8637a(r1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void updateDensity(android.content.Context r1) {
        /*
            miuix.autodensity.AutoDensityConfig r0 = sInstance
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            boolean r0 = r1 instanceof miuix.autodensity.C2284g
            if (r0 == 0) goto L_0x0011
            r0 = r1
            miuix.autodensity.g r0 = (miuix.autodensity.C2284g) r0
            goto L_0x001f
        L_0x0011:
            android.content.Context r0 = r1.getApplicationContext()
            boolean r0 = r0 instanceof miuix.autodensity.C2284g
            if (r0 == 0) goto L_0x0024
            android.content.Context r0 = r1.getApplicationContext()
            miuix.autodensity.g r0 = (miuix.autodensity.C2284g) r0
        L_0x001f:
            boolean r0 = r0.mo5258a()
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            forceUpdateDensity(r1)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.autodensity.AutoDensityConfig.updateDensity(android.content.Context):void");
    }

    public boolean isEnableProcessInActivity(Activity activity) {
        C2284g gVar;
        try {
            if (activity instanceof C2284g) {
                gVar = (C2284g) activity;
            } else if (!(activity.getApplication() instanceof C2284g)) {
                return false;
            } else {
                gVar = (C2284g) activity.getApplication();
            }
            return gVar.mo5258a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDensityChangedOnActivityCreated(Activity activity) {
        super.onDensityChangedOnActivityCreated(activity);
        addForOnConfigurationChange(activity);
    }

    /* access modifiers changed from: protected */
    public void onRegisterDensityCallback(Object obj) {
        C2277b.m9629c("registerCallback obj: " + obj);
    }

    public void prepareInApplication(Application application) {
        try {
            this.sCanAccessHiddenAPI = ((Boolean) C0039a.m54o(ApplicationInfo.class, application.getApplicationInfo(), "isAllowedToUseHiddenApis", new Class[0], new Object[0])).booleanValue();
        } catch (Exception unused) {
        }
        C2277b.m9628b();
        C2279d.m9636h().mo8629n(application);
        if (isShouldAdaptAutoDensity(application)) {
            C2283f.m9658g(application);
        }
    }

    /* access modifiers changed from: protected */
    public void processBeforeActivityConfigChanged(Activity activity, Configuration configuration) {
        C2283f.m9658g(activity);
        C2711k g = C2693a.m11238g(activity);
        onDensityChangedBeforeActivityConfigChanged(activity, configuration, g);
        if (C2709i.m11322c(g.f10512f) || C2709i.m11321b(g.f10512f) || Build.VERSION.SDK_INT > 24) {
            if (Build.VERSION.SDK_INT <= 31) {
                removeCurrentConfig(activity);
            } else {
                changeCurrentConfig(activity);
            }
        }
        Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
        if (configurationChangeFragment != null) {
            ((C2276a) configurationChangeFragment).mo8624b(this);
        }
    }

    public void processOnActivityCreated(Activity activity) {
        boolean a = activity instanceof C2284g ? ((C2284g) activity).mo5258a() : isShouldAdaptAutoDensity(activity.getApplication());
        updateApplicationDensity(activity.getApplication());
        if (a) {
            C2283f.m9658g(activity);
            onDensityChangedOnActivityCreated(activity);
        }
    }

    public void processOnActivityDestroyed(Activity activity) {
        unregisterCallback(activity);
    }

    public void processOnActivityDisplayChanged(int i, Activity activity) {
        C2277b.m9629c("onDisplayChanged activity: " + activity);
        C2283f.m9658g(activity);
        onDensityChangedOnActivityDisplayChanged(i, activity);
    }

    public void processOnAppConfigChanged(Application application, Configuration configuration) {
        C2279d.m9636h().mo8631p(application, configuration);
        if (isShouldAdaptAutoDensity(application)) {
            C2283f.m9658g(application);
            onDensityChangedOnAppConfigChanged(application);
            if (Build.VERSION.SDK_INT > 24) {
                configuration.densityDpi = C2279d.m9636h().mo8628l().f9352b;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void registerCallback(Activity activity) {
        super.registerCallback(activity);
        tryToAddActivityConfigCallback(activity);
    }

    /* access modifiers changed from: package-private */
    public void updateApplicationDensity(Application application) {
        if (Build.VERSION.SDK_INT == 29 && isShouldAdaptAutoDensity(application)) {
            C2283f.m9658g(application);
        }
    }
}
