package miuix.autodensity;

import android.app.Activity;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import p005a4.C0039a;

/* renamed from: miuix.autodensity.a */
public class C2276a extends Fragment {

    /* renamed from: d */
    private boolean f8673d = false;

    /* renamed from: e */
    private AutoDensityConfig f8674e;

    /* renamed from: a */
    public void mo8623a() {
        this.f8673d = true;
    }

    /* renamed from: b */
    public void mo8624b(AutoDensityConfig autoDensityConfig) {
        this.f8674e = autoDensityConfig;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C2277b.m9629c("ConfigChangeFragment activity: " + getActivity());
        Activity activity = getActivity();
        this.f8674e.updateApplicationDensity(activity.getApplication());
        C2283f.m9658g(activity);
        super.onConfigurationChanged(configuration);
        try {
            if (this.f8673d) {
                ((ActivityInfo) C0039a.m49j(Activity.class, activity, "mActivityInfo")).configChanges &= -4097;
                this.f8673d = false;
            }
        } catch (Exception unused) {
        }
    }
}
