package miuix.autodensity;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p117t2.C2693a;
import p117t2.C2711k;

/* renamed from: miuix.autodensity.e */
public abstract class C2280e {
    protected DisplayManager mDisplayManager = null;
    protected HashMap<Integer, C2281a> mModifier;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());

    /* renamed from: miuix.autodensity.e$a */
    class C2281a implements DisplayManager.DisplayListener, ComponentCallbacks {

        /* renamed from: d */
        private WeakReference<Activity> f8682d = null;

        /* renamed from: e */
        private WeakReference<View.OnAttachStateChangeListener> f8683e = null;

        /* renamed from: f */
        private final C2280e f8684f;

        public C2281a(Activity activity, C2280e eVar) {
            this.f8682d = new WeakReference<>(activity);
            this.f8684f = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8637a(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f8683e = new WeakReference<>(onAttachStateChangeListener);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8638b() {
            WeakReference<Activity> weakReference = this.f8682d;
            if (weakReference != null) {
                weakReference.clear();
            }
            WeakReference<View.OnAttachStateChangeListener> weakReference2 = this.f8683e;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8639c(Activity activity) {
            View.OnAttachStateChangeListener onAttachStateChangeListener;
            WeakReference<View.OnAttachStateChangeListener> weakReference = this.f8683e;
            if (weakReference != null && (onAttachStateChangeListener = weakReference.get()) != null) {
                activity.getWindow().getDecorView().removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
        }

        public void onConfigurationChanged(Configuration configuration) {
            WeakReference<Activity> weakReference = this.f8682d;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                this.f8684f.processBeforeActivityConfigChanged(activity, configuration);
            } else {
                C2280e.this.unregisterDisplayListener(this);
            }
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            WeakReference<Activity> weakReference = this.f8682d;
            Activity activity = weakReference == null ? null : weakReference.get();
            if (activity != null) {
                this.f8684f.processOnActivityDisplayChanged(i, activity);
            } else {
                C2280e.this.unregisterDisplayListener(this);
            }
        }

        public void onDisplayRemoved(int i) {
        }

        public void onLowMemory() {
        }
    }

    /* renamed from: miuix.autodensity.e$b */
    static class C2282b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final C2280e f8686a;

        public C2282b(C2280e eVar) {
            this.f8686a = eVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            this.f8686a.processOnActivityCreated(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            this.f8686a.processOnActivityDestroyed(activity);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public abstract boolean isEnableProcessInActivity(Activity activity);

    /* access modifiers changed from: protected */
    public void onDensityChangedBeforeActivityConfigChanged(Activity activity, Configuration configuration, C2711k kVar) {
        C2693a.m11255x(configuration, kVar);
        C2693a.m11253v(activity, kVar);
        C2693a.m11245n(activity);
        C2693a.m11248q(kVar);
    }

    /* access modifiers changed from: protected */
    public void onDensityChangedOnActivityCreated(Activity activity) {
        registerCallback(activity);
    }

    /* access modifiers changed from: protected */
    public void onDensityChangedOnActivityDisplayChanged(int i, Activity activity) {
    }

    /* access modifiers changed from: protected */
    public void onDensityChangedOnAppConfigChanged(Application application) {
    }

    /* access modifiers changed from: protected */
    public void onRegisterDensityCallback(Object obj) {
    }

    /* access modifiers changed from: protected */
    public abstract void prepareInApplication(Application application);

    /* access modifiers changed from: protected */
    public abstract void processBeforeActivityConfigChanged(Activity activity, Configuration configuration);

    /* access modifiers changed from: protected */
    public abstract void processOnActivityCreated(Activity activity);

    /* access modifiers changed from: protected */
    public abstract void processOnActivityDestroyed(Activity activity);

    /* access modifiers changed from: protected */
    public abstract void processOnActivityDisplayChanged(int i, Activity activity);

    /* access modifiers changed from: protected */
    public abstract void processOnAppConfigChanged(Application application, Configuration configuration);

    /* access modifiers changed from: protected */
    public void registerCallback(Activity activity) {
        if (this.mDisplayManager == null) {
            this.mDisplayManager = (DisplayManager) activity.getApplication().getSystemService("display");
        }
        if (this.mModifier == null) {
            this.mModifier = new HashMap<>();
        }
        int hashCode = activity.hashCode();
        if (this.mModifier.get(Integer.valueOf(hashCode)) == null) {
            C2281a aVar = new C2281a(activity, this);
            this.mModifier.put(Integer.valueOf(hashCode), aVar);
            this.mDisplayManager.registerDisplayListener(aVar, this.mUiHandler);
            activity.getApplication().registerComponentCallbacks(aVar);
            activity.registerComponentCallbacks(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void unregisterCallback(Activity activity) {
        if (this.mModifier != null) {
            int hashCode = activity.hashCode();
            C2281a aVar = this.mModifier.get(Integer.valueOf(hashCode));
            C2277b.m9629c("unregisterCallback obj: " + aVar);
            if (aVar != null) {
                unregisterDisplayListener(aVar);
                activity.getApplication().unregisterComponentCallbacks(aVar);
                activity.unregisterComponentCallbacks(aVar);
                aVar.mo8639c(activity);
                aVar.mo8638b();
            }
            this.mModifier.remove(Integer.valueOf(hashCode));
        }
    }

    /* access modifiers changed from: protected */
    public void unregisterDisplayListener(C2281a aVar) {
        DisplayManager displayManager = this.mDisplayManager;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(aVar);
        }
    }
}
