package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.f */
public final class C0497f {

    /* renamed from: androidx.core.app.f$a */
    static class C0498a {
        /* renamed from: a */
        static IBinder m2090a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m2091b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m2089a(Bundle bundle, String str) {
        return C0498a.m2090a(bundle, str);
    }
}
