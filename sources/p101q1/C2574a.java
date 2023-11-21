package p101q1;

import p023d1.C1492v;
import p047h1.C1626c;
import p083n1.C2420e;

/* renamed from: q1.a */
public class C2574a implements Iterable<Integer> {

    /* renamed from: g */
    public static final C2575a f10111g = new C2575a((C2420e) null);

    /* renamed from: d */
    private final int f10112d;

    /* renamed from: e */
    private final int f10113e;

    /* renamed from: f */
    private final int f10114f;

    /* renamed from: q1.a$a */
    public static final class C2575a {
        private C2575a() {
        }

        public /* synthetic */ C2575a(C2420e eVar) {
            this();
        }

        /* renamed from: a */
        public final C2574a mo9842a(int i, int i2, int i3) {
            return new C2574a(i, i2, i3);
        }
    }

    public C2574a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f10112d = i;
            this.f10113e = C1626c.m6914b(i, i2, i3);
            this.f10114f = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo9833a() {
        return this.f10112d;
    }

    /* renamed from: b */
    public final int mo9834b() {
        return this.f10113e;
    }

    /* renamed from: c */
    public final int mo9835c() {
        return this.f10114f;
    }

    /* renamed from: d */
    public C1492v iterator() {
        return new C2576b(this.f10112d, this.f10113e, this.f10114f);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2574a) {
            if (!isEmpty() || !((C2574a) obj).isEmpty()) {
                C2574a aVar = (C2574a) obj;
                if (!(this.f10112d == aVar.f10112d && this.f10113e == aVar.f10113e && this.f10114f == aVar.f10114f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f10112d * 31) + this.f10113e) * 31) + this.f10114f;
    }

    public boolean isEmpty() {
        if (this.f10114f > 0) {
            if (this.f10112d > this.f10113e) {
                return true;
            }
        } else if (this.f10112d < this.f10113e) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f10114f > 0) {
            sb = new StringBuilder();
            sb.append(this.f10112d);
            sb.append("..");
            sb.append(this.f10113e);
            sb.append(" step ");
            i = this.f10114f;
        } else {
            sb = new StringBuilder();
            sb.append(this.f10112d);
            sb.append(" downTo ");
            sb.append(this.f10113e);
            sb.append(" step ");
            i = -this.f10114f;
        }
        sb.append(i);
        return sb.toString();
    }
}
