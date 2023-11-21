package p041g1;

import p029e1.C1518d;
import p029e1.C1519e;
import p029e1.C1523g;
import p083n1.C2422g;

/* renamed from: g1.c */
public abstract class C1597c extends C1595a {

    /* renamed from: e */
    private final C1523g f6378e;

    /* renamed from: f */
    private transient C1518d<Object> f6379f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1597c(C1518d<Object> dVar) {
        this(dVar, dVar != null ? dVar.mo5629c() : null);
    }

    public C1597c(C1518d<Object> dVar, C1523g gVar) {
        super(dVar);
        this.f6378e = gVar;
    }

    /* renamed from: c */
    public C1523g mo5629c() {
        C1523g gVar = this.f6378e;
        C2422g.m10282b(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5747l() {
        C1518d<Object> dVar = this.f6379f;
        if (!(dVar == null || dVar == this)) {
            C1523g.C1526b bVar = mo5629c().get(C1519e.f6167a);
            C2422g.m10282b(bVar);
            ((C1519e) bVar).mo5632q(dVar);
        }
        this.f6379f = C1596b.f6377d;
    }

    /* renamed from: m */
    public final C1518d<Object> mo5750m() {
        C1518d<Object> dVar = this.f6379f;
        if (dVar == null) {
            C1519e eVar = (C1519e) mo5629c().get(C1519e.f6167a);
            if (eVar == null || (dVar = eVar.mo5631k(this)) == null) {
                dVar = this;
            }
            this.f6379f = dVar;
        }
        return dVar;
    }
}
