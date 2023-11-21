package p093p;

import java.util.ArrayList;
import p087o.C2479f;

/* renamed from: p.m */
class C2527m {

    /* renamed from: h */
    public static int f9965h;

    /* renamed from: a */
    public int f9966a = 0;

    /* renamed from: b */
    public boolean f9967b = false;

    /* renamed from: c */
    C2532p f9968c = null;

    /* renamed from: d */
    C2532p f9969d = null;

    /* renamed from: e */
    ArrayList<C2532p> f9970e = new ArrayList<>();

    /* renamed from: f */
    int f9971f;

    /* renamed from: g */
    int f9972g;

    public C2527m(C2532p pVar, int i) {
        int i2 = f9965h;
        this.f9971f = i2;
        f9965h = i2 + 1;
        this.f9968c = pVar;
        this.f9969d = pVar;
        this.f9972g = i;
    }

    /* renamed from: c */
    private long m10736c(C2518f fVar, long j) {
        C2532p pVar = fVar.f9941d;
        if (pVar instanceof C2524k) {
            return j;
        }
        int size = fVar.f9948k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C2516d dVar = fVar.f9948k.get(i);
            if (dVar instanceof C2518f) {
                C2518f fVar2 = (C2518f) dVar;
                if (fVar2.f9941d != pVar) {
                    j2 = Math.min(j2, m10736c(fVar2, ((long) fVar2.f9943f) + j));
                }
            }
        }
        if (fVar != pVar.f9999i) {
            return j2;
        }
        long j3 = j - pVar.mo9679j();
        return Math.min(Math.min(j2, m10736c(pVar.f9998h, j3)), j3 - ((long) pVar.f9998h.f9943f));
    }

    /* renamed from: d */
    private long m10737d(C2518f fVar, long j) {
        C2532p pVar = fVar.f9941d;
        if (pVar instanceof C2524k) {
            return j;
        }
        int size = fVar.f9948k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C2516d dVar = fVar.f9948k.get(i);
            if (dVar instanceof C2518f) {
                C2518f fVar2 = (C2518f) dVar;
                if (fVar2.f9941d != pVar) {
                    j2 = Math.max(j2, m10737d(fVar2, ((long) fVar2.f9943f) + j));
                }
            }
        }
        if (fVar != pVar.f9998h) {
            return j2;
        }
        long j3 = j + pVar.mo9679j();
        return Math.max(Math.max(j2, m10737d(pVar.f9999i, j3)), j3 - ((long) pVar.f9999i.f9943f));
    }

    /* renamed from: a */
    public void mo9697a(C2532p pVar) {
        this.f9970e.add(pVar);
        this.f9969d = pVar;
    }

    /* renamed from: b */
    public long mo9698b(C2479f fVar, int i) {
        C2532p pVar;
        long j;
        long j2;
        long j3;
        C2532p pVar2 = this.f9968c;
        long j4 = 0;
        if (pVar2 instanceof C2515c) {
            if (((C2515c) pVar2).f9996f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(pVar2 instanceof C2525l)) {
                return 0;
            }
        } else if (!(pVar2 instanceof C2528n)) {
            return 0;
        }
        C2518f fVar2 = (i == 0 ? fVar.f9592e : fVar.f9594f).f9998h;
        C2518f fVar3 = (i == 0 ? fVar.f9592e : fVar.f9594f).f9999i;
        boolean contains = pVar2.f9998h.f9949l.contains(fVar2);
        boolean contains2 = this.f9968c.f9999i.f9949l.contains(fVar3);
        long j5 = this.f9968c.mo9679j();
        if (!contains || !contains2) {
            if (contains) {
                C2518f fVar4 = this.f9968c.f9998h;
                j3 = m10737d(fVar4, (long) fVar4.f9943f);
                j2 = ((long) this.f9968c.f9998h.f9943f) + j5;
            } else if (contains2) {
                C2518f fVar5 = this.f9968c.f9999i;
                long c = m10736c(fVar5, (long) fVar5.f9943f);
                j2 = ((long) (-this.f9968c.f9999i.f9943f)) + j5;
                j3 = -c;
            } else {
                C2532p pVar3 = this.f9968c;
                j = ((long) pVar3.f9998h.f9943f) + pVar3.mo9679j();
                pVar = this.f9968c;
            }
            return Math.max(j3, j2);
        }
        long d = m10737d(this.f9968c.f9998h, 0);
        long c2 = m10736c(this.f9968c.f9999i, 0);
        long j6 = d - j5;
        C2532p pVar4 = this.f9968c;
        int i2 = pVar4.f9999i.f9943f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = pVar4.f9998h.f9943f;
        long j7 = ((-c2) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float o = pVar4.f9992b.mo9547o(i);
        if (o > 0.0f) {
            j4 = (long) ((((float) j7) / o) + (((float) j6) / (1.0f - o)));
        }
        float f = (float) j4;
        long j8 = ((long) ((f * o) + 0.5f)) + j5 + ((long) ((f * (1.0f - o)) + 0.5f));
        pVar = this.f9968c;
        j = ((long) pVar.f9998h.f9943f) + j8;
        return j - ((long) pVar.f9999i.f9943f);
    }
}
