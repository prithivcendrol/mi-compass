package p017c1;

import java.io.Serializable;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: c1.k */
public final class C1336k<T> implements Serializable {

    /* renamed from: d */
    public static final C1337a f4511d = new C1337a((C2420e) null);

    /* renamed from: c1.k$a */
    public static final class C1337a {
        private C1337a() {
        }

        public /* synthetic */ C1337a(C2420e eVar) {
            this();
        }
    }

    /* renamed from: c1.k$b */
    public static final class C1338b implements Serializable {

        /* renamed from: d */
        public final Throwable f4512d;

        public C1338b(Throwable th) {
            C2422g.m10285e(th, "exception");
            this.f4512d = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1338b) && C2422g.m10281a(this.f4512d, ((C1338b) obj).f4512d);
        }

        public int hashCode() {
            return this.f4512d.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f4512d + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m5985a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m5986b(Object obj) {
        if (obj instanceof C1338b) {
            return ((C1338b) obj).f4512d;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m5987c(Object obj) {
        return obj instanceof C1338b;
    }

    /* renamed from: d */
    public static final boolean m5988d(Object obj) {
        return !(obj instanceof C1338b);
    }
}
