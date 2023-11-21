package p121u1;

import p017c1.C1344q;
import p077m1.C1906l;
import p083n1.C2420e;
import p083n1.C2422g;

/* renamed from: u1.p */
final class C2789p {

    /* renamed from: a */
    public final Object f10582a;

    /* renamed from: b */
    public final C2759g f10583b;

    /* renamed from: c */
    public final C1906l<Throwable, C1344q> f10584c;

    /* renamed from: d */
    public final Object f10585d;

    /* renamed from: e */
    public final Throwable f10586e;

    public C2789p(Object obj, C2759g gVar, C1906l<? super Throwable, C1344q> lVar, Object obj2, Throwable th) {
        this.f10582a = obj;
        this.f10583b = gVar;
        this.f10584c = lVar;
        this.f10585d = obj2;
        this.f10586e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2789p(Object obj, C2759g gVar, C1906l lVar, Object obj2, Throwable th, int i, C2420e eVar) {
        this(obj, (i & 2) != 0 ? null : gVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* renamed from: b */
    public static /* synthetic */ C2789p m11611b(C2789p pVar, Object obj, C2759g gVar, C1906l<Throwable, C1344q> lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pVar.f10582a;
        }
        if ((i & 2) != 0) {
            gVar = pVar.f10583b;
        }
        C2759g gVar2 = gVar;
        if ((i & 4) != 0) {
            lVar = pVar.f10584c;
        }
        C1906l<Throwable, C1344q> lVar2 = lVar;
        if ((i & 8) != 0) {
            obj2 = pVar.f10585d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = pVar.f10586e;
        }
        return pVar.mo10051a(obj, gVar2, lVar2, obj4, th);
    }

    /* renamed from: a */
    public final C2789p mo10051a(Object obj, C2759g gVar, C1906l<? super Throwable, C1344q> lVar, Object obj2, Throwable th) {
        return new C2789p(obj, gVar, lVar, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo10052c() {
        return this.f10586e != null;
    }

    /* renamed from: d */
    public final void mo10053d(C2774k<?> kVar, Throwable th) {
        C2759g gVar = this.f10583b;
        if (gVar != null) {
            kVar.mo10039k(gVar, th);
        }
        C1906l<Throwable, C1344q> lVar = this.f10584c;
        if (lVar != null) {
            kVar.mo10040l(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2789p)) {
            return false;
        }
        C2789p pVar = (C2789p) obj;
        return C2422g.m10281a(this.f10582a, pVar.f10582a) && C2422g.m10281a(this.f10583b, pVar.f10583b) && C2422g.m10281a(this.f10584c, pVar.f10584c) && C2422g.m10281a(this.f10585d, pVar.f10585d) && C2422g.m10281a(this.f10586e, pVar.f10586e);
    }

    public int hashCode() {
        Object obj = this.f10582a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C2759g gVar = this.f10583b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        C1906l<Throwable, C1344q> lVar = this.f10584c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f10585d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10586e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f10582a + ", cancelHandler=" + this.f10583b + ", onCancellation=" + this.f10584c + ", idempotentResume=" + this.f10585d + ", cancelCause=" + this.f10586e + ')';
    }
}
