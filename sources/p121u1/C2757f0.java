package p121u1;

import kotlinx.coroutines.internal.C1807d;
import p017c1.C1336k;
import p017c1.C1339l;
import p029e1.C1518d;

/* renamed from: u1.f0 */
public final class C2757f0 {
    /* renamed from: a */
    public static final String m11450a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m11451b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m11452c(C1518d<?> dVar) {
        Object obj;
        if (dVar instanceof C1807d) {
            return dVar.toString();
        }
        try {
            C1336k.C1337a aVar = C1336k.f4511d;
            obj = C1336k.m5985a(dVar + '@' + m11451b(dVar));
        } catch (Throwable th) {
            C1336k.C1337a aVar2 = C1336k.f4511d;
            obj = C1336k.m5985a(C1339l.m5989a(th));
        }
        Throwable b = C1336k.m5986b(obj);
        String str = obj;
        if (b != null) {
            str = dVar.getClass().getName() + '@' + m11451b(dVar);
        }
        return (String) str;
    }
}
