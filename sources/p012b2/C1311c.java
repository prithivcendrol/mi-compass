package p012b2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p117t2.C2693a;
import p117t2.C2697e;

/* renamed from: b2.c */
public class C1311c extends Application {

    /* renamed from: d */
    private Object f4496d = new Object();

    /* renamed from: e */
    private Object f4497e = new Object();

    /* renamed from: f */
    private C1313b f4498f;

    /* renamed from: g */
    private C1312a f4499g;

    /* renamed from: b2.c$a */
    static class C1312a implements ComponentCallbacks {

        /* renamed from: d */
        private List<ComponentCallbacks> f4500d;

        /* renamed from: e */
        private final Context f4501e;

        public C1312a(Context context) {
            this.f4501e = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            if (r2 >= r0) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            r5.accept(r1[r2]);
            r2 = r2 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            r2 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m5952b(java.util.function.Consumer<android.content.ComponentCallbacks> r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                java.util.List<android.content.ComponentCallbacks> r0 = r4.f4500d     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x0026
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x000c
                goto L_0x0026
            L_0x000c:
                java.util.List<android.content.ComponentCallbacks> r0 = r4.f4500d     // Catch:{ all -> 0x0028 }
                int r0 = r0.size()     // Catch:{ all -> 0x0028 }
                android.content.ComponentCallbacks[] r1 = new android.content.ComponentCallbacks[r0]     // Catch:{ all -> 0x0028 }
                java.util.List<android.content.ComponentCallbacks> r2 = r4.f4500d     // Catch:{ all -> 0x0028 }
                r2.toArray(r1)     // Catch:{ all -> 0x0028 }
                monitor-exit(r4)     // Catch:{ all -> 0x0028 }
                r2 = 0
            L_0x001b:
                if (r2 >= r0) goto L_0x0025
                r3 = r1[r2]
                r5.accept(r3)
                int r2 = r2 + 1
                goto L_0x001b
            L_0x0025:
                return
            L_0x0026:
                monitor-exit(r4)     // Catch:{ all -> 0x0028 }
                return
            L_0x0028:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0028 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p012b2.C1311c.C1312a.m5952b(java.util.function.Consumer):void");
        }

        /* renamed from: d */
        public void mo5138d(ComponentCallbacks componentCallbacks) {
            if (this.f4500d == null) {
                this.f4500d = new ArrayList();
            }
            this.f4500d.add(componentCallbacks);
        }

        public void onConfigurationChanged(Configuration configuration) {
            m5952b(new C1309a(configuration));
        }

        public void onLowMemory() {
            m5952b(new C1310b());
        }
    }

    /* renamed from: b2.c$b */
    static class C1313b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private ArrayList<Application.ActivityLifecycleCallbacks> f4502a = new ArrayList<>();

        C1313b() {
        }

        /* renamed from: b */
        private Object[] m5955b() {
            Object[] array;
            synchronized (this.f4502a) {
                array = this.f4502a.size() > 0 ? this.f4502a.toArray() : null;
            }
            return array;
        }

        /* renamed from: a */
        public boolean mo5141a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            return this.f4502a.add(activityLifecycleCallbacks);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
                }
            }
        }

        public void onActivityDestroyed(Activity activity) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
                }
            }
        }

        public void onActivityPaused(Activity activity) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
                }
            }
        }

        public void onActivityResumed(Activity activity) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
                }
            }
        }

        public void onActivityStarted(Activity activity) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
                }
            }
        }

        public void onActivityStopped(Activity activity) {
            Object[] b = m5955b();
            if (b != null) {
                for (Object obj : b) {
                    ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5134b(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        synchronized (this.f4496d) {
            if (this.f4498f == null) {
                C1313b bVar = new C1313b();
                this.f4498f = bVar;
                registerActivityLifecycleCallbacks(bVar);
            }
            this.f4498f.mo5141a(activityLifecycleCallbacks);
        }
    }

    /* renamed from: c */
    public void mo5135c(ComponentCallbacks componentCallbacks) {
        synchronized (this.f4497e) {
            if (this.f4499g == null) {
                C1312a aVar = new C1312a(this);
                this.f4499g = aVar;
                registerComponentCallbacks(aVar);
            }
            this.f4499g.mo5138d(componentCallbacks);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C2697e.m11267d();
        C2693a.m11245n(this);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        C2693a.m11242k(this);
        super.onCreate();
    }
}
