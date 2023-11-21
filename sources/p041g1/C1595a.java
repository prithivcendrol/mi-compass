package p041g1;

import java.io.Serializable;
import p017c1.C1336k;
import p017c1.C1339l;
import p017c1.C1344q;
import p029e1.C1518d;
import p083n1.C2422g;

/* renamed from: g1.a */
public abstract class C1595a implements C1518d<Object>, C1598d, Serializable {

    /* renamed from: d */
    private final C1518d<Object> f6376d;

    public C1595a(C1518d<Object> dVar) {
        this.f6376d = dVar;
    }

    /* renamed from: a */
    public C1518d<C1344q> mo3750a(Object obj, C1518d<?> dVar) {
        C2422g.m10285e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: e */
    public C1598d mo5744e() {
        C1518d<Object> dVar = this.f6376d;
        if (dVar instanceof C1598d) {
            return (C1598d) dVar;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo5630f(Object obj) {
        C1518d dVar = this;
        while (true) {
            C1601g.m6837b(dVar);
            C1595a aVar = (C1595a) dVar;
            C1518d dVar2 = aVar.f6376d;
            C2422g.m10282b(dVar2);
            try {
                Object k = aVar.mo3752k(obj);
                if (k != C1557d.m6676c()) {
                    obj = C1336k.m5985a(k);
                    aVar.mo5747l();
                    if (dVar2 instanceof C1595a) {
                        dVar = dVar2;
                    } else {
                        dVar2.mo5630f(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C1336k.C1337a aVar2 = C1336k.f4511d;
                obj = C1336k.m5985a(C1339l.m5989a(th));
            }
        }
    }

    /* renamed from: i */
    public final C1518d<Object> mo5745i() {
        return this.f6376d;
    }

    /* renamed from: j */
    public StackTraceElement mo5746j() {
        return C1600f.m6835d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Object mo3752k(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5747l() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object j = mo5746j();
        if (j == null) {
            j = getClass().getName();
        }
        sb.append(j);
        return sb.toString();
    }
}
