package p121u1;

import p017c1.C1336k;
import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1518d;
import p077m1.C1906l;
import p083n1.C2420e;

/* renamed from: u1.u */
public final class C2806u {
    /* renamed from: a */
    public static final <T> Object m11666a(Object obj, C1518d<? super T> dVar) {
        if (obj instanceof C2792q) {
            C1336k.C1337a aVar = C1336k.f4511d;
            obj = C1339l.m5989a(((C2792q) obj).f10589a);
        }
        return C1336k.m5985a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m11667b(Object obj, C1906l<? super Throwable, C1344q> lVar) {
        Throwable b = C1336k.m5986b(obj);
        return b == null ? lVar != null ? new C2795r(obj, lVar) : obj : new C2792q(b, false, 2, (C2420e) null);
    }

    /* renamed from: c */
    public static final <T> Object m11668c(Object obj, C2768i<?> iVar) {
        Throwable b = C1336k.m5986b(obj);
        return b == null ? obj : new C2792q(b, false, 2, (C2420e) null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m11669d(Object obj, C1906l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m11667b(obj, lVar);
    }
}
