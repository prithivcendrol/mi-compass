package kotlinx.coroutines.internal;

import p017c1.C1336k;
import p017c1.C1339l;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C1811g {

    /* renamed from: a */
    private static final boolean f7059a;

    static {
        Object obj;
        try {
            C1336k.C1337a aVar = C1336k.f4511d;
            obj = C1336k.m5985a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C1336k.C1337a aVar2 = C1336k.f4511d;
            obj = C1336k.m5985a(C1339l.m5989a(th));
        }
        f7059a = C1336k.m5988d(obj);
    }

    /* renamed from: a */
    public static final boolean m7516a() {
        return f7059a;
    }
}
