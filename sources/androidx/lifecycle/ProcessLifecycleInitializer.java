package androidx.lifecycle;

import android.content.Context;
import androidx.startup.C1263a;
import java.util.Collections;
import java.util.List;
import p046h0.C1620a;

public final class ProcessLifecycleInitializer implements C1620a<C1048m> {
    /* renamed from: a */
    public List<Class<? extends C1620a<?>>> mo3072a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C1048m mo3073b(Context context) {
        if (C1263a.m5807e(context).mo4994g(ProcessLifecycleInitializer.class)) {
            C1044j.m4234a(context);
            C1057u.m4265l(context);
            return C1057u.m4264k();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
