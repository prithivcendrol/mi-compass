package p136x1;

import kotlinx.coroutines.internal.C1809e;
import p017c1.C1336k;
import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1518d;
import p077m1.C1906l;
import p077m1.C1910p;

/* renamed from: x1.a */
public final class C2899a {
    /* renamed from: a */
    private static final void m11954a(C1518d<?> dVar, Throwable th) {
        C1336k.C1337a aVar = C1336k.f4511d;
        dVar.mo5630f(C1336k.m5985a(C1339l.m5989a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m11955b(C1518d<? super C1344q> dVar, C1518d<?> dVar2) {
        try {
            C1518d b = C1554c.m6673b(dVar);
            C1336k.C1337a aVar = C1336k.f4511d;
            C1809e.m7509c(b, C1336k.m5985a(C1344q.f4517a), (C1906l) null, 2, (Object) null);
        } catch (Throwable th) {
            m11954a(dVar2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m11956c(C1910p<? super R, ? super C1518d<? super T>, ? extends Object> pVar, R r, C1518d<? super T> dVar, C1906l<? super Throwable, C1344q> lVar) {
        try {
            C1518d b = C1554c.m6673b(C1554c.m6672a(pVar, r, dVar));
            C1336k.C1337a aVar = C1336k.f4511d;
            C1809e.m7508b(b, C1336k.m5985a(C1344q.f4517a), lVar);
        } catch (Throwable th) {
            m11954a(dVar, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m11957d(C1910p pVar, Object obj, C1518d dVar, C1906l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m11956c(pVar, obj, dVar, lVar);
    }
}
