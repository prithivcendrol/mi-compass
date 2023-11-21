package p030e2;

import android.view.View;
import miuix.appcompat.app.C2118q;
import miuix.appcompat.app.floatingactivity.SingleAppFloatingLifecycleObserver;

/* renamed from: e2.i */
public final /* synthetic */ class C1540i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SingleAppFloatingLifecycleObserver f6190d;

    /* renamed from: e */
    public final /* synthetic */ View f6191e;

    /* renamed from: f */
    public final /* synthetic */ C2118q f6192f;

    public /* synthetic */ C1540i(SingleAppFloatingLifecycleObserver singleAppFloatingLifecycleObserver, View view, C2118q qVar) {
        this.f6190d = singleAppFloatingLifecycleObserver;
        this.f6191e = view;
        this.f6192f = qVar;
    }

    public final void run() {
        this.f6190d.m8342m(this.f6191e, this.f6192f);
    }
}
