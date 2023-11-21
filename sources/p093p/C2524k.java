package p093p;

import p087o.C2470a;
import p087o.C2476e;
import p093p.C2518f;

/* renamed from: p.k */
class C2524k extends C2532p {
    public C2524k(C2476e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m10723q(C2518f fVar) {
        this.f9998h.f9948k.add(fVar);
        fVar.f9949l.add(this.f9998h);
    }

    /* renamed from: a */
    public void mo9675a(C2516d dVar) {
        C2470a aVar = (C2470a) this.f9992b;
        int s1 = aVar.mo9436s1();
        int i = 0;
        int i2 = -1;
        for (C2518f fVar : this.f9998h.f9949l) {
            int i3 = fVar.f9944g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (s1 == 0 || s1 == 2) {
            this.f9998h.mo9693d(i2 + aVar.mo9437t1());
        } else {
            this.f9998h.mo9693d(i + aVar.mo9437t1());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9676d() {
        C2532p pVar;
        C2476e eVar = this.f9992b;
        if (eVar instanceof C2470a) {
            this.f9998h.f9939b = true;
            C2470a aVar = (C2470a) eVar;
            int s1 = aVar.mo9436s1();
            boolean r1 = aVar.mo9435r1();
            int i = 0;
            if (s1 == 0) {
                this.f9998h.f9942e = C2518f.C2519a.LEFT;
                while (i < aVar.f9683M0) {
                    C2476e eVar2 = aVar.f9682L0[i];
                    if (r1 || eVar2.mo9501T() != 8) {
                        C2518f fVar = eVar2.f9592e.f9998h;
                        fVar.f9948k.add(this.f9998h);
                        this.f9998h.f9949l.add(fVar);
                    }
                    i++;
                }
            } else if (s1 != 1) {
                if (s1 == 2) {
                    this.f9998h.f9942e = C2518f.C2519a.TOP;
                    while (i < aVar.f9683M0) {
                        C2476e eVar3 = aVar.f9682L0[i];
                        if (r1 || eVar3.mo9501T() != 8) {
                            C2518f fVar2 = eVar3.f9594f.f9998h;
                            fVar2.f9948k.add(this.f9998h);
                            this.f9998h.f9949l.add(fVar2);
                        }
                        i++;
                    }
                } else if (s1 == 3) {
                    this.f9998h.f9942e = C2518f.C2519a.BOTTOM;
                    while (i < aVar.f9683M0) {
                        C2476e eVar4 = aVar.f9682L0[i];
                        if (r1 || eVar4.mo9501T() != 8) {
                            C2518f fVar3 = eVar4.f9594f.f9999i;
                            fVar3.f9948k.add(this.f9998h);
                            this.f9998h.f9949l.add(fVar3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                m10723q(this.f9992b.f9594f.f9998h);
                pVar = this.f9992b.f9594f;
                m10723q(pVar.f9999i);
            } else {
                this.f9998h.f9942e = C2518f.C2519a.RIGHT;
                while (i < aVar.f9683M0) {
                    C2476e eVar5 = aVar.f9682L0[i];
                    if (r1 || eVar5.mo9501T() != 8) {
                        C2518f fVar4 = eVar5.f9592e.f9999i;
                        fVar4.f9948k.add(this.f9998h);
                        this.f9998h.f9949l.add(fVar4);
                    }
                    i++;
                }
            }
            m10723q(this.f9992b.f9592e.f9998h);
            pVar = this.f9992b.f9592e;
            m10723q(pVar.f9999i);
        }
    }

    /* renamed from: e */
    public void mo9677e() {
        C2476e eVar = this.f9992b;
        if (eVar instanceof C2470a) {
            int s1 = ((C2470a) eVar).mo9436s1();
            if (s1 == 0 || s1 == 1) {
                this.f9992b.mo9536j1(this.f9998h.f9944g);
            } else {
                this.f9992b.mo9539k1(this.f9998h.f9944g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9678f() {
        this.f9993c = null;
        this.f9998h.mo9692c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9680m() {
        return false;
    }
}
