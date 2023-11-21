package p101q1;

import p083n1.C2420e;

/* renamed from: q1.c */
public final class C2577c extends C2574a {

    /* renamed from: h */
    public static final C2578a f10119h = new C2578a((C2420e) null);

    /* renamed from: i */
    private static final C2577c f10120i = new C2577c(1, 0);

    /* renamed from: q1.c$a */
    public static final class C2578a {
        private C2578a() {
        }

        public /* synthetic */ C2578a(C2420e eVar) {
            this();
        }
    }

    public C2577c(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: e */
    public boolean mo9844e(int i) {
        return mo9833a() <= i && i <= mo9834b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2577c) {
            if (!isEmpty() || !((C2577c) obj).isEmpty()) {
                C2577c cVar = (C2577c) obj;
                if (!(mo9833a() == cVar.mo9833a() && mo9834b() == cVar.mo9834b())) {
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
        return (mo9833a() * 31) + mo9834b();
    }

    public boolean isEmpty() {
        return mo9833a() > mo9834b();
    }

    public String toString() {
        return mo9833a() + ".." + mo9834b();
    }
}
