package p012b2;

import android.content.ComponentCallbacks;
import java.util.function.Consumer;

/* renamed from: b2.b */
public final /* synthetic */ class C1310b implements Consumer {
    public final void accept(Object obj) {
        ((ComponentCallbacks) obj).onLowMemory();
    }
}
