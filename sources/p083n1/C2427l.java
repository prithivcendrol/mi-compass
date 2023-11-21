package p083n1;

import p106r1.C2614a;
import p106r1.C2618e;

/* renamed from: n1.l */
public abstract class C2427l extends C2414a implements C2618e {
    public C2427l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2427l(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2427l) {
            C2427l lVar = (C2427l) obj;
            return mo9318i().equals(lVar.mo9318i()) && mo9317f().equals(lVar.mo9317f()) && mo9319j().equals(lVar.mo9319j()) && C2422g.m10281a(mo9316e(), lVar.mo9316e());
        } else if (obj instanceof C2618e) {
            return obj.equals(mo9314a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo9318i().hashCode() * 31) + mo9317f().hashCode()) * 31) + mo9319j().hashCode();
    }

    public String toString() {
        C2614a a = mo9314a();
        if (a != this) {
            return a.toString();
        }
        return "property " + mo9317f() + " (Kotlin reflection is not available)";
    }
}
