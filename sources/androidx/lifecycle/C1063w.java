package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1035g;

/* renamed from: androidx.lifecycle.w */
public class C1063w extends Fragment {

    /* renamed from: d */
    private C1064a f3506d;

    /* renamed from: androidx.lifecycle.w$a */
    interface C1064a {
        /* renamed from: a */
        void mo3808a();

        /* renamed from: b */
        void mo3809b();

        /* renamed from: c */
        void mo3810c();
    }

    /* renamed from: androidx.lifecycle.w$b */
    static class C1065b implements Application.ActivityLifecycleCallbacks {
        C1065b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1065b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C1063w.m4278a(activity, C1035g.C1037b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C1063w.m4278a(activity, C1035g.C1037b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C1063w.m4278a(activity, C1035g.C1037b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C1063w.m4278a(activity, C1035g.C1037b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C1063w.m4278a(activity, C1035g.C1037b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C1063w.m4278a(activity, C1035g.C1037b.ON_STOP);
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

    /* renamed from: a */
    static void m4278a(Activity activity, C1035g.C1037b bVar) {
        if (activity instanceof C1051o) {
            ((C1051o) activity).mo252c().mo3795h(bVar);
        } else if (activity instanceof C1048m) {
            C1035g c = ((C1048m) activity).mo252c();
            if (c instanceof C1049n) {
                ((C1049n) c).mo3795h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m4279b(C1035g.C1037b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4278a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m4280c(C1064a aVar) {
        if (aVar != null) {
            aVar.mo3808a();
        }
    }

    /* renamed from: d */
    private void m4281d(C1064a aVar) {
        if (aVar != null) {
            aVar.mo3809b();
        }
    }

    /* renamed from: e */
    private void m4282e(C1064a aVar) {
        if (aVar != null) {
            aVar.mo3810c();
        }
    }

    /* renamed from: f */
    static C1063w m4283f(Activity activity) {
        return (C1063w) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m4284g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1065b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C1063w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3814h(C1064a aVar) {
        this.f3506d = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4280c(this.f3506d);
        m4279b(C1035g.C1037b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m4279b(C1035g.C1037b.ON_DESTROY);
        this.f3506d = null;
    }

    public void onPause() {
        super.onPause();
        m4279b(C1035g.C1037b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m4281d(this.f3506d);
        m4279b(C1035g.C1037b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m4282e(this.f3506d);
        m4279b(C1035g.C1037b.ON_START);
    }

    public void onStop() {
        super.onStop();
        m4279b(C1035g.C1037b.ON_STOP);
    }
}
