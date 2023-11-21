package androidx.lifecycle;

import androidx.lifecycle.C1035g;
import java.util.concurrent.CancellationException;
import p017c1.C1336k;
import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1518d;
import p029e1.C1523g;
import p041g1.C1599e;
import p041g1.C1605j;
import p077m1.C1910p;
import p083n1.C2422g;
import p083n1.C2428m;
import p121u1.C2742b0;
import p121u1.C2743b1;
import p121u1.C2747c0;
import p121u1.C2750d0;
import p121u1.C2768i;
import p141y1.C2943a;

final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C1046k {

    /* renamed from: d */
    final /* synthetic */ C1035g.C1037b f3420d;

    /* renamed from: e */
    final /* synthetic */ C2428m<C2743b1> f3421e;

    /* renamed from: f */
    final /* synthetic */ C2742b0 f3422f;

    /* renamed from: g */
    final /* synthetic */ C1035g.C1037b f3423g;

    /* renamed from: h */
    final /* synthetic */ C2768i<C1344q> f3424h;

    /* renamed from: i */
    final /* synthetic */ C2943a f3425i;

    /* renamed from: j */
    final /* synthetic */ C1910p<C2742b0, C1518d<? super C1344q>, Object> f3426j;

    @C1599e(mo5751c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo5752f = "RepeatOnLifecycle.kt", mo5753l = {171, 110}, mo5754m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a */
    static final class C1008a extends C1605j implements C1910p<C2742b0, C1518d<? super C1344q>, Object> {

        /* renamed from: h */
        Object f3427h;

        /* renamed from: i */
        Object f3428i;

        /* renamed from: j */
        int f3429j;

        /* renamed from: k */
        final /* synthetic */ C2943a f3430k;

        /* renamed from: l */
        final /* synthetic */ C1910p<C2742b0, C1518d<? super C1344q>, Object> f3431l;

        @C1599e(mo5751c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", mo5752f = "RepeatOnLifecycle.kt", mo5753l = {111}, mo5754m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
        static final class C1009a extends C1605j implements C1910p<C2742b0, C1518d<? super C1344q>, Object> {

            /* renamed from: h */
            int f3432h;

            /* renamed from: i */
            private /* synthetic */ Object f3433i;

            /* renamed from: j */
            final /* synthetic */ C1910p<C2742b0, C1518d<? super C1344q>, Object> f3434j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1009a(C1910p<? super C2742b0, ? super C1518d<? super C1344q>, ? extends Object> pVar, C1518d<? super C1009a> dVar) {
                super(2, dVar);
                this.f3434j = pVar;
            }

            /* renamed from: a */
            public final C1518d<C1344q> mo3750a(Object obj, C1518d<?> dVar) {
                C1009a aVar = new C1009a(this.f3434j, dVar);
                aVar.f3433i = obj;
                return aVar;
            }

            /* renamed from: k */
            public final Object mo3752k(Object obj) {
                Object c = C1557d.m6676c();
                int i = this.f3432h;
                if (i == 0) {
                    C1339l.m5990b(obj);
                    C1910p<C2742b0, C1518d<? super C1344q>, Object> pVar = this.f3434j;
                    this.f3432h = 1;
                    if (pVar.mo3751g((C2742b0) this.f3433i, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C1339l.m5990b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C1344q.f4517a;
            }

            /* renamed from: n */
            public final Object mo3751g(C2742b0 b0Var, C1518d<? super C1344q> dVar) {
                return ((C1009a) mo3750a(b0Var, dVar)).mo3752k(C1344q.f4517a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1008a(C2943a aVar, C1910p<? super C2742b0, ? super C1518d<? super C1344q>, ? extends Object> pVar, C1518d<? super C1008a> dVar) {
            super(2, dVar);
            this.f3430k = aVar;
            this.f3431l = pVar;
        }

        /* renamed from: a */
        public final C1518d<C1344q> mo3750a(Object obj, C1518d<?> dVar) {
            return new C1008a(this.f3430k, this.f3431l, dVar);
        }

        /* renamed from: k */
        public final Object mo3752k(Object obj) {
            Throwable th;
            C2943a aVar;
            C2943a aVar2;
            C1910p<C2742b0, C1518d<? super C1344q>, Object> pVar;
            Object c = C1557d.m6676c();
            int i = this.f3429j;
            if (i == 0) {
                C1339l.m5990b(obj);
                aVar2 = this.f3430k;
                pVar = this.f3431l;
                this.f3427h = aVar2;
                this.f3428i = pVar;
                this.f3429j = 1;
                if (aVar2.mo10237b((Object) null, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                pVar = (C1910p) this.f3428i;
                C1339l.m5990b(obj);
                aVar2 = (C2943a) this.f3427h;
            } else if (i == 2) {
                aVar = (C2943a) this.f3427h;
                try {
                    C1339l.m5990b(obj);
                    C1344q qVar = C1344q.f4517a;
                    aVar.mo10236a((Object) null);
                    return C1344q.f4517a;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C1009a aVar3 = new C1009a(pVar, (C1518d<? super C1009a>) null);
                this.f3427h = aVar2;
                this.f3428i = null;
                this.f3429j = 2;
                if (C2747c0.m11439a(aVar3, this) == c) {
                    return c;
                }
                aVar = aVar2;
                C1344q qVar2 = C1344q.f4517a;
                aVar.mo10236a((Object) null);
                return C1344q.f4517a;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                aVar = aVar2;
                th = th4;
                aVar.mo10236a((Object) null);
                throw th;
            }
        }

        /* renamed from: n */
        public final Object mo3751g(C2742b0 b0Var, C1518d<? super C1344q> dVar) {
            return ((C1008a) mo3750a(b0Var, dVar)).mo3752k(C1344q.f4517a);
        }
    }

    /* renamed from: g */
    public final void mo289g(C1048m mVar, C1035g.C1037b bVar) {
        C2422g.m10285e(mVar, "<anonymous parameter 0>");
        C2422g.m10285e(bVar, "event");
        if (bVar == this.f3420d) {
            this.f3421e.f9438d = C2756f.m11449b(this.f3422f, (C1523g) null, (C2750d0) null, new C1008a(this.f3425i, this.f3426j, (C1518d<? super C1008a>) null), 3, (Object) null);
            return;
        }
        if (bVar == this.f3423g) {
            C2743b1 b1Var = (C2743b1) this.f3421e.f9438d;
            if (b1Var != null) {
                C2743b1.C2744a.m11432a(b1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f3421e.f9438d = null;
        }
        if (bVar == C1035g.C1037b.ON_DESTROY) {
            C2768i<C1344q> iVar = this.f3424h;
            C1336k.C1337a aVar = C1336k.f4511d;
            iVar.mo5630f(C1336k.m5985a(C1344q.f4517a));
        }
    }
}
