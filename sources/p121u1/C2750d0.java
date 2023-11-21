package p121u1;

import p017c1.C1334i;
import p029e1.C1518d;
import p029e1.C1522f;
import p077m1.C1906l;
import p077m1.C1910p;
import p136x1.C2899a;
import p136x1.C2900b;

/* renamed from: u1.d0 */
public enum C2750d0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: u1.d0$a */
    public /* synthetic */ class C2751a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10544a = null;

        static {
            int[] iArr = new int[C2750d0.values().length];
            iArr[C2750d0.DEFAULT.ordinal()] = 1;
            iArr[C2750d0.ATOMIC.ordinal()] = 2;
            iArr[C2750d0.UNDISPATCHED.ordinal()] = 3;
            iArr[C2750d0.LAZY.ordinal()] = 4;
            f10544a = iArr;
        }
    }

    /* renamed from: b */
    public final <R, T> void mo9993b(C1910p<? super R, ? super C1518d<? super T>, ? extends Object> pVar, R r, C1518d<? super T> dVar) {
        int i = C2751a.f10544a[ordinal()];
        if (i == 1) {
            C2899a.m11957d(pVar, r, dVar, (C1906l) null, 4, (Object) null);
        } else if (i == 2) {
            C1522f.m6581a(pVar, r, dVar);
        } else if (i == 3) {
            C2900b.m11958a(pVar, r, dVar);
        } else if (i != 4) {
            throw new C1334i();
        }
    }

    /* renamed from: c */
    public final boolean mo9994c() {
        return this == LAZY;
    }
}
