package p017c1;

import java.io.Serializable;
import p083n1.C2422g;

/* renamed from: c1.j */
public final class C1335j<A, B> implements Serializable {

    /* renamed from: d */
    private final A f4509d;

    /* renamed from: e */
    private final B f4510e;

    public C1335j(A a, B b) {
        this.f4509d = a;
        this.f4510e = b;
    }

    /* renamed from: a */
    public final A mo5186a() {
        return this.f4509d;
    }

    /* renamed from: b */
    public final B mo5187b() {
        return this.f4510e;
    }

    /* renamed from: c */
    public final A mo5188c() {
        return this.f4509d;
    }

    /* renamed from: d */
    public final B mo5189d() {
        return this.f4510e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1335j)) {
            return false;
        }
        C1335j jVar = (C1335j) obj;
        return C2422g.m10281a(this.f4509d, jVar.f4509d) && C2422g.m10281a(this.f4510e, jVar.f4510e);
    }

    public int hashCode() {
        A a = this.f4509d;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f4510e;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f4509d + ", " + this.f4510e + ')';
    }
}
