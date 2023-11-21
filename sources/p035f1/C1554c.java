package p035f1;

import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1518d;
import p029e1.C1523g;
import p029e1.C1529h;
import p041g1.C1595a;
import p041g1.C1597c;
import p041g1.C1601g;
import p041g1.C1604i;
import p077m1.C1910p;
import p083n1.C2422g;
import p083n1.C2431p;

/* renamed from: f1.c */
class C1554c {

    /* renamed from: f1.c$a */
    public static final class C1555a extends C1604i {

        /* renamed from: e */
        private int f6227e;

        /* renamed from: f */
        final /* synthetic */ C1910p f6228f;

        /* renamed from: g */
        final /* synthetic */ Object f6229g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1555a(C1518d dVar, C1910p pVar, Object obj) {
            super(dVar);
            this.f6228f = pVar;
            this.f6229g = obj;
            C2422g.m10283c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public Object mo3752k(Object obj) {
            int i = this.f6227e;
            if (i == 0) {
                this.f6227e = 1;
                C1339l.m5990b(obj);
                C2422g.m10283c(this.f6228f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((C1910p) C2431p.m10310a(this.f6228f, 2)).mo3751g(this.f6229g, this);
            } else if (i == 1) {
                this.f6227e = 2;
                C1339l.m5990b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: f1.c$b */
    public static final class C1556b extends C1597c {

        /* renamed from: g */
        private int f6230g;

        /* renamed from: h */
        final /* synthetic */ C1910p f6231h;

        /* renamed from: i */
        final /* synthetic */ Object f6232i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1556b(C1518d dVar, C1523g gVar, C1910p pVar, Object obj) {
            super(dVar, gVar);
            this.f6231h = pVar;
            this.f6232i = obj;
            C2422g.m10283c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public Object mo3752k(Object obj) {
            int i = this.f6230g;
            if (i == 0) {
                this.f6230g = 1;
                C1339l.m5990b(obj);
                C2422g.m10283c(this.f6231h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((C1910p) C2431p.m10310a(this.f6231h, 2)).mo3751g(this.f6232i, this);
            } else if (i == 1) {
                this.f6230g = 2;
                C1339l.m5990b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C1518d<C1344q> m6672a(C1910p<? super R, ? super C1518d<? super T>, ? extends Object> pVar, R r, C1518d<? super T> dVar) {
        C2422g.m10285e(pVar, "<this>");
        C2422g.m10285e(dVar, "completion");
        C1518d<? super T> a = C1601g.m6836a(dVar);
        if (pVar instanceof C1595a) {
            return ((C1595a) pVar).mo3750a(r, a);
        }
        C1523g c = a.mo5629c();
        return c == C1529h.f6170d ? new C1555a(a, pVar, r) : new C1556b(a, c, pVar, r);
    }

    /* renamed from: b */
    public static <T> C1518d<T> m6673b(C1518d<? super T> dVar) {
        C1518d<Object> m;
        C2422g.m10285e(dVar, "<this>");
        C1597c cVar = dVar instanceof C1597c ? (C1597c) dVar : null;
        return (cVar == null || (m = cVar.mo5750m()) == null) ? dVar : m;
    }
}
