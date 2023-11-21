package androidx.core.p008os;

import android.os.Bundle;
import android.os.IBinder;
import p083n1.C2422g;

/* renamed from: androidx.core.os.b */
final class C0575b {

    /* renamed from: a */
    public static final C0575b f2585a = new C0575b();

    private C0575b() {
    }

    /* renamed from: a */
    public static final void m2385a(Bundle bundle, String str, IBinder iBinder) {
        C2422g.m10285e(bundle, "bundle");
        C2422g.m10285e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
