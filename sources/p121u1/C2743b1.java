package p121u1;

import java.util.concurrent.CancellationException;
import p017c1.C1344q;
import p029e1.C1523g;
import p077m1.C1906l;
import p077m1.C1910p;

/* renamed from: u1.b1 */
public interface C2743b1 extends C1523g.C1526b {

    /* renamed from: c */
    public static final C2745b f10535c = C2745b.f10536d;

    /* renamed from: u1.b1$a */
    public static final class C2744a {
        /* renamed from: a */
        public static /* synthetic */ void m11432a(C2743b1 b1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                b1Var.mo9986p(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m11433b(C2743b1 b1Var, R r, C1910p<? super R, ? super C1523g.C1526b, ? extends R> pVar) {
            return C1523g.C1526b.C1527a.m6585a(b1Var, r, pVar);
        }

        /* renamed from: c */
        public static <E extends C1523g.C1526b> E m11434c(C2743b1 b1Var, C1523g.C1528c<E> cVar) {
            return C1523g.C1526b.C1527a.m6586b(b1Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C2787o0 m11435d(C2743b1 b1Var, boolean z, boolean z2, C1906l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return b1Var.mo9985n(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C1523g m11436e(C2743b1 b1Var, C1523g.C1528c<?> cVar) {
            return C1523g.C1526b.C1527a.m6587c(b1Var, cVar);
        }

        /* renamed from: f */
        public static C1523g m11437f(C2743b1 b1Var, C1523g gVar) {
            return C1523g.C1526b.C1527a.m6588d(b1Var, gVar);
        }
    }

    /* renamed from: u1.b1$b */
    public static final class C2745b implements C1523g.C1528c<C2743b1> {

        /* renamed from: d */
        static final /* synthetic */ C2745b f10536d = new C2745b();

        private C2745b() {
        }
    }

    /* renamed from: a */
    boolean mo9977a();

    /* renamed from: i */
    C2780m mo9983i(C2786o oVar);

    /* renamed from: m */
    CancellationException mo9984m();

    /* renamed from: n */
    C2787o0 mo9985n(boolean z, boolean z2, C1906l<? super Throwable, C1344q> lVar);

    /* renamed from: p */
    void mo9986p(CancellationException cancellationException);

    boolean start();
}
