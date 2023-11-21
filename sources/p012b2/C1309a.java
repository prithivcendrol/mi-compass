package p012b2;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.function.Consumer;

/* renamed from: b2.a */
public final /* synthetic */ class C1309a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Configuration f4495a;

    public /* synthetic */ C1309a(Configuration configuration) {
        this.f4495a = configuration;
    }

    public final void accept(Object obj) {
        ((ComponentCallbacks) obj).onConfigurationChanged(this.f4495a);
    }
}
