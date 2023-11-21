package miuix.appcompat.app;

import android.view.WindowInsets;
import miuix.appcompat.app.AlertController;

/* renamed from: miuix.appcompat.app.m */
public final /* synthetic */ class C2109m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AlertController.C20648 f7733d;

    /* renamed from: e */
    public final /* synthetic */ WindowInsets f7734e;

    public /* synthetic */ C2109m(AlertController.C20648 r1, WindowInsets windowInsets) {
        this.f7733d = r1;
        this.f7734e = windowInsets;
    }

    public final void run() {
        this.f7733d.lambda$onApplyWindowInsets$0(this.f7734e);
    }
}
