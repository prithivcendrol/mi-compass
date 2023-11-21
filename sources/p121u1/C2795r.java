package p121u1;

import p017c1.C1344q;
import p077m1.C1906l;
import p083n1.C2422g;

/* renamed from: u1.r */
public final class C2795r {

    /* renamed from: a */
    public final Object f10593a;

    /* renamed from: b */
    public final C1906l<Throwable, C1344q> f10594b;

    public C2795r(Object obj, C1906l<? super Throwable, C1344q> lVar) {
        this.f10593a = obj;
        this.f10594b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2795r)) {
            return false;
        }
        C2795r rVar = (C2795r) obj;
        return C2422g.m10281a(this.f10593a, rVar.f10593a) && C2422g.m10281a(this.f10594b, rVar.f10594b);
    }

    public int hashCode() {
        Object obj = this.f10593a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f10594b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f10593a + ", onCancellation=" + this.f10594b + ')';
    }
}
