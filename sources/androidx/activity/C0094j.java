package androidx.activity;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.activity.j */
public final /* synthetic */ class C0094j implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f232a;

    public /* synthetic */ C0094j(Runnable runnable) {
        this.f232a = runnable;
    }

    public final void onBackInvoked() {
        this.f232a.run();
    }
}
