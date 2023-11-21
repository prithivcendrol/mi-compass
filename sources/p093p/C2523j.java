package p093p;

import p087o.C2476e;
import p087o.C2480g;

/* renamed from: p.j */
class C2523j extends C2532p {
    public C2523j(C2476e eVar) {
        super(eVar);
        eVar.f9592e.mo9678f();
        eVar.f9594f.mo9678f();
        this.f9996f = ((C2480g) eVar).mo9595p1();
    }

    /* renamed from: q */
    private void m10717q(C2518f fVar) {
        this.f9998h.f9948k.add(fVar);
        fVar.f9949l.add(this.f9998h);
    }

    /* renamed from: a */
    public void mo9675a(C2516d dVar) {
        C2518f fVar = this.f9998h;
        if (fVar.f9940c && !fVar.f9947j) {
            this.f9998h.mo9693d((int) ((((float) fVar.f9949l.get(0).f9944g) * ((C2480g) this.f9992b).mo9598s1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9676d() {
        C2532p pVar;
        C2518f fVar;
        C2518f fVar2;
        C2480g gVar = (C2480g) this.f9992b;
        int q1 = gVar.mo9596q1();
        int r1 = gVar.mo9597r1();
        gVar.mo9598s1();
        if (gVar.mo9595p1() == 1) {
            C2518f fVar3 = this.f9998h;
            if (q1 != -1) {
                fVar3.f9949l.add(this.f9992b.f9585a0.f9592e.f9998h);
                this.f9992b.f9585a0.f9592e.f9998h.f9948k.add(this.f9998h);
                fVar2 = this.f9998h;
            } else if (r1 != -1) {
                fVar3.f9949l.add(this.f9992b.f9585a0.f9592e.f9999i);
                this.f9992b.f9585a0.f9592e.f9999i.f9948k.add(this.f9998h);
                fVar2 = this.f9998h;
                q1 = -r1;
            } else {
                fVar3.f9939b = true;
                fVar3.f9949l.add(this.f9992b.f9585a0.f9592e.f9999i);
                this.f9992b.f9585a0.f9592e.f9999i.f9948k.add(this.f9998h);
                m10717q(this.f9992b.f9592e.f9998h);
                pVar = this.f9992b.f9592e;
            }
            fVar2.f9943f = q1;
            m10717q(this.f9992b.f9592e.f9998h);
            pVar = this.f9992b.f9592e;
        } else {
            C2518f fVar4 = this.f9998h;
            if (q1 != -1) {
                fVar4.f9949l.add(this.f9992b.f9585a0.f9594f.f9998h);
                this.f9992b.f9585a0.f9594f.f9998h.f9948k.add(this.f9998h);
                fVar = this.f9998h;
            } else if (r1 != -1) {
                fVar4.f9949l.add(this.f9992b.f9585a0.f9594f.f9999i);
                this.f9992b.f9585a0.f9594f.f9999i.f9948k.add(this.f9998h);
                fVar = this.f9998h;
                q1 = -r1;
            } else {
                fVar4.f9939b = true;
                fVar4.f9949l.add(this.f9992b.f9585a0.f9594f.f9999i);
                this.f9992b.f9585a0.f9594f.f9999i.f9948k.add(this.f9998h);
                m10717q(this.f9992b.f9594f.f9998h);
                pVar = this.f9992b.f9594f;
            }
            fVar.f9943f = q1;
            m10717q(this.f9992b.f9594f.f9998h);
            pVar = this.f9992b.f9594f;
        }
        m10717q(pVar.f9999i);
    }

    /* renamed from: e */
    public void mo9677e() {
        if (((C2480g) this.f9992b).mo9595p1() == 1) {
            this.f9992b.mo9536j1(this.f9998h.f9944g);
        } else {
            this.f9992b.mo9539k1(this.f9998h.f9944g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9678f() {
        this.f9998h.mo9692c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9680m() {
        return false;
    }
}
