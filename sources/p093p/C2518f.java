package p093p;

import java.util.ArrayList;
import java.util.List;

/* renamed from: p.f */
public class C2518f implements C2516d {

    /* renamed from: a */
    public C2516d f9938a = null;

    /* renamed from: b */
    public boolean f9939b = false;

    /* renamed from: c */
    public boolean f9940c = false;

    /* renamed from: d */
    C2532p f9941d;

    /* renamed from: e */
    C2519a f9942e = C2519a.UNKNOWN;

    /* renamed from: f */
    int f9943f;

    /* renamed from: g */
    public int f9944g;

    /* renamed from: h */
    int f9945h = 1;

    /* renamed from: i */
    C2520g f9946i = null;

    /* renamed from: j */
    public boolean f9947j = false;

    /* renamed from: k */
    List<C2516d> f9948k = new ArrayList();

    /* renamed from: l */
    List<C2518f> f9949l = new ArrayList();

    /* renamed from: p.f$a */
    enum C2519a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C2518f(C2532p pVar) {
        this.f9941d = pVar;
    }

    /* renamed from: a */
    public void mo9675a(C2516d dVar) {
        for (C2518f fVar : this.f9949l) {
            if (!fVar.f9947j) {
                return;
            }
        }
        this.f9940c = true;
        C2516d dVar2 = this.f9938a;
        if (dVar2 != null) {
            dVar2.mo9675a(this);
        }
        if (this.f9939b) {
            this.f9941d.mo9675a(this);
            return;
        }
        C2518f fVar2 = null;
        int i = 0;
        for (C2518f next : this.f9949l) {
            if (!(next instanceof C2520g)) {
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f9947j) {
            C2520g gVar = this.f9946i;
            if (gVar != null) {
                if (gVar.f9947j) {
                    this.f9943f = this.f9945h * gVar.f9944g;
                } else {
                    return;
                }
            }
            mo9693d(fVar2.f9944g + this.f9943f);
        }
        C2516d dVar3 = this.f9938a;
        if (dVar3 != null) {
            dVar3.mo9675a(this);
        }
    }

    /* renamed from: b */
    public void mo9691b(C2516d dVar) {
        this.f9948k.add(dVar);
        if (this.f9947j) {
            dVar.mo9675a(dVar);
        }
    }

    /* renamed from: c */
    public void mo9692c() {
        this.f9949l.clear();
        this.f9948k.clear();
        this.f9947j = false;
        this.f9944g = 0;
        this.f9940c = false;
        this.f9939b = false;
    }

    /* renamed from: d */
    public void mo9693d(int i) {
        if (!this.f9947j) {
            this.f9947j = true;
            this.f9944g = i;
            for (C2516d next : this.f9948k) {
                next.mo9675a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9941d.f9992b.mo9553r());
        sb.append(":");
        sb.append(this.f9942e);
        sb.append("(");
        sb.append(this.f9947j ? Integer.valueOf(this.f9944g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9949l.size());
        sb.append(":d=");
        sb.append(this.f9948k.size());
        sb.append(">");
        return sb.toString();
    }
}
