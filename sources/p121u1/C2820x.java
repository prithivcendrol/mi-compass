package p121u1;

import kotlinx.coroutines.internal.C1807d;
import kotlinx.coroutines.internal.C1812h;
import kotlinx.coroutines.internal.C1813i;
import p029e1.C1514a;
import p029e1.C1515b;
import p029e1.C1518d;
import p029e1.C1519e;
import p029e1.C1523g;
import p077m1.C1906l;
import p083n1.C2420e;
import p083n1.C2423h;

/* renamed from: u1.x */
public abstract class C2820x extends C1514a implements C1519e {

    /* renamed from: d */
    public static final C2821a f10617d = new C2821a((C2420e) null);

    /* renamed from: u1.x$a */
    public static final class C2821a extends C1515b<C1519e, C2820x> {

        /* renamed from: u1.x$a$a */
        static final class C2822a extends C2423h implements C1906l<C1523g.C1526b, C2820x> {

            /* renamed from: e */
            public static final C2822a f10618e = new C2822a();

            C2822a() {
                super(1);
            }

            /* renamed from: a */
            public final C2820x mo3838h(C1523g.C1526b bVar) {
                if (bVar instanceof C2820x) {
                    return (C2820x) bVar;
                }
                return null;
            }
        }

        private C2821a() {
            super(C1519e.f6167a, C2822a.f10618e);
        }

        public /* synthetic */ C2821a(C2420e eVar) {
            this();
        }
    }

    public C2820x() {
        super(C1519e.f6167a);
    }

    /* renamed from: c */
    public abstract void mo6270c(C1523g gVar, Runnable runnable);

    /* renamed from: e */
    public boolean mo6297e(C1523g gVar) {
        return true;
    }

    /* renamed from: f */
    public C2820x mo10095f(int i) {
        C1813i.m7520a(i);
        return new C1812h(this, i);
    }

    public <E extends C1523g.C1526b> E get(C1523g.C1528c<E> cVar) {
        return C1519e.C1520a.m6579a(this, cVar);
    }

    /* renamed from: k */
    public final <T> C1518d<T> mo5631k(C1518d<? super T> dVar) {
        return new C1807d(this, dVar);
    }

    public C1523g minusKey(C1523g.C1528c<?> cVar) {
        return C1519e.C1520a.m6580b(this, cVar);
    }

    /* renamed from: q */
    public final void mo5632q(C1518d<?> dVar) {
        ((C1807d) dVar).mo6264m();
    }

    public String toString() {
        return C2757f0.m11450a(this) + '@' + C2757f0.m11451b(this);
    }
}
