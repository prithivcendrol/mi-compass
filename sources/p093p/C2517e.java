package p093p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p087o.C2476e;
import p087o.C2479f;
import p087o.C2480g;
import p087o.C2483i;
import p093p.C2512b;

/* renamed from: p.e */
public class C2517e {

    /* renamed from: a */
    private C2479f f9929a;

    /* renamed from: b */
    private boolean f9930b = true;

    /* renamed from: c */
    private boolean f9931c = true;

    /* renamed from: d */
    private C2479f f9932d;

    /* renamed from: e */
    private ArrayList<C2532p> f9933e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C2527m> f9934f = new ArrayList<>();

    /* renamed from: g */
    private C2512b.C2514b f9935g = null;

    /* renamed from: h */
    private C2512b.C2513a f9936h = new C2512b.C2513a();

    /* renamed from: i */
    ArrayList<C2527m> f9937i = new ArrayList<>();

    public C2517e(C2479f fVar) {
        this.f9929a = fVar;
        this.f9932d = fVar;
    }

    /* renamed from: a */
    private void m10685a(C2518f fVar, int i, int i2, C2518f fVar2, ArrayList<C2527m> arrayList, C2527m mVar) {
        C2532p pVar = fVar.f9941d;
        if (pVar.f9993c == null) {
            C2479f fVar3 = this.f9929a;
            if (pVar != fVar3.f9592e && pVar != fVar3.f9594f) {
                if (mVar == null) {
                    mVar = new C2527m(pVar, i2);
                    arrayList.add(mVar);
                }
                pVar.f9993c = mVar;
                mVar.mo9697a(pVar);
                for (C2516d next : pVar.f9998h.f9948k) {
                    if (next instanceof C2518f) {
                        m10685a((C2518f) next, i, 0, fVar2, arrayList, mVar);
                    }
                }
                for (C2516d next2 : pVar.f9999i.f9948k) {
                    if (next2 instanceof C2518f) {
                        m10685a((C2518f) next2, i, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i == 1 && (pVar instanceof C2528n)) {
                    for (C2516d next3 : ((C2528n) pVar).f9973k.f9948k) {
                        if (next3 instanceof C2518f) {
                            m10685a((C2518f) next3, i, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (C2518f next4 : pVar.f9998h.f9949l) {
                    if (next4 == fVar2) {
                        mVar.f9967b = true;
                    }
                    m10685a(next4, i, 0, fVar2, arrayList, mVar);
                }
                for (C2518f next5 : pVar.f9999i.f9949l) {
                    if (next5 == fVar2) {
                        mVar.f9967b = true;
                    }
                    m10685a(next5, i, 1, fVar2, arrayList, mVar);
                }
                if (i == 1 && (pVar instanceof C2528n)) {
                    for (C2518f a : ((C2528n) pVar).f9973k.f9949l) {
                        m10685a(a, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01cb, code lost:
        r4 = r0.f9583Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f9630x == 0) goto L_0x0065;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10686b(p087o.C2479f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<o.e> r1 = r0.f9698L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0258
            java.lang.Object r2 = r1.next()
            o.e r2 = (p087o.C2476e) r2
            o.e$b[] r4 = r2.f9583Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo9501T()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.f9584a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f9550B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f9628w = r7
        L_0x0036:
            float r6 = r2.f9556E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f9630x = r7
        L_0x0042:
            float r6 = r2.mo9557t()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0077
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            o.e$b r9 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            o.e$b r9 = p087o.C2476e.C2478b.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f9628w = r8
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            o.e$b r9 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            o.e$b r9 = p087o.C2476e.C2478b.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f9630x = r8
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.f9628w
            if (r6 != 0) goto L_0x0072
            r2.f9628w = r8
        L_0x0072:
            int r6 = r2.f9630x
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r9 = r2.f9628w
            if (r9 != r10) goto L_0x008d
            o.d r9 = r2.f9572O
            o.d r9 = r9.f9532f
            if (r9 == 0) goto L_0x008b
            o.d r9 = r2.f9574Q
            o.d r9 = r9.f9532f
            if (r9 != 0) goto L_0x008d
        L_0x008b:
            o.e$b r5 = p087o.C2476e.C2478b.WRAP_CONTENT
        L_0x008d:
            r9 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.f9630x
            if (r5 != r10) goto L_0x00a2
            o.d r5 = r2.f9573P
            o.d r5 = r5.f9532f
            if (r5 == 0) goto L_0x00a0
            o.d r5 = r2.f9575R
            o.d r5 = r5.f9532f
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            o.e$b r4 = p087o.C2476e.C2478b.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            p.l r4 = r2.f9592e
            r4.f9994d = r9
            int r5 = r2.f9628w
            r4.f9991a = r5
            p.n r4 = r2.f9594f
            r4.f9994d = r12
            int r13 = r2.f9630x
            r4.f9991a = r13
            o.e$b r4 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r9 == r4) goto L_0x00bf
            o.e$b r14 = p087o.C2476e.C2478b.FIXED
            if (r9 == r14) goto L_0x00bf
            o.e$b r14 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x0204
            o.e$b r14 = p087o.C2476e.C2478b.FIXED
            if (r12 == r14) goto L_0x0204
            o.e$b r14 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x0204
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0141
            o.e$b r15 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            o.e$b r11 = p087o.C2476e.C2478b.FIXED
            if (r12 != r11) goto L_0x0141
        L_0x00d7:
            if (r5 != r8) goto L_0x00f7
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.m10689l(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.mo9560v()
            float r3 = (float) r9
            float r4 = r2.f9591d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00ef:
            o.e$b r8 = p087o.C2476e.C2478b.FIXED
        L_0x00f1:
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x023d
        L_0x00f7:
            if (r5 != r10) goto L_0x010f
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m10689l(r5, r6, r7, r8, r9)
            p.l r3 = r2.f9592e
            p.g r3 = r3.f9995e
            int r2 = r2.mo9503U()
        L_0x010b:
            r3.f9959m = r2
            goto L_0x0008
        L_0x010f:
            if (r5 != r7) goto L_0x012a
            o.e$b[] r11 = r0.f9583Z
            r11 = r11[r3]
            o.e$b r15 = p087o.C2476e.C2478b.FIXED
            if (r11 == r15) goto L_0x011b
            if (r11 != r4) goto L_0x0141
        L_0x011b:
            float r3 = r2.f9550B
            int r4 = r17.mo9503U()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.mo9560v()
            goto L_0x013a
        L_0x012a:
            o.d[] r11 = r2.f9580W
            r7 = r11[r3]
            o.d r7 = r7.f9532f
            if (r7 == 0) goto L_0x0138
            r7 = r11[r10]
            o.d r7 = r7.f9532f
            if (r7 != 0) goto L_0x0141
        L_0x0138:
            r7 = 0
            r9 = 0
        L_0x013a:
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x013e:
            r8 = r12
            goto L_0x023d
        L_0x0141:
            if (r12 != r6) goto L_0x01bd
            o.e$b r11 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r9 == r11) goto L_0x014b
            o.e$b r7 = p087o.C2476e.C2478b.FIXED
            if (r9 != r7) goto L_0x01bd
        L_0x014b:
            if (r13 != r8) goto L_0x016f
            if (r9 != r11) goto L_0x0159
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.m10689l(r5, r6, r7, r8, r9)
        L_0x0159:
            int r7 = r2.mo9503U()
            float r3 = r2.f9591d0
            int r4 = r2.mo9559u()
            r5 = -1
            if (r4 != r5) goto L_0x016a
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x016a:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00ef
        L_0x016f:
            if (r13 != r10) goto L_0x0185
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.m10689l(r5, r6, r7, r8, r9)
        L_0x017c:
            p.n r3 = r2.f9594f
            p.g r3 = r3.f9995e
            int r2 = r2.mo9560v()
            goto L_0x010b
        L_0x0185:
            r7 = 2
            if (r13 != r7) goto L_0x01a7
            o.e$b[] r7 = r0.f9583Z
            r7 = r7[r10]
            o.e$b r8 = p087o.C2476e.C2478b.FIXED
            if (r7 == r8) goto L_0x0192
            if (r7 != r4) goto L_0x01bd
        L_0x0192:
            float r3 = r2.f9556E
            int r7 = r2.mo9503U()
            int r4 = r17.mo9560v()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            goto L_0x023d
        L_0x01a7:
            o.d[] r4 = r2.f9580W
            r7 = 2
            r15 = r4[r7]
            o.d r7 = r15.f9532f
            if (r7 == 0) goto L_0x01b6
            r4 = r4[r8]
            o.d r4 = r4.f9532f
            if (r4 != 0) goto L_0x01bd
        L_0x01b6:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x013e
        L_0x01bd:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x01ed
            if (r13 != r10) goto L_0x01c6
            goto L_0x01ed
        L_0x01c6:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            o.e$b[] r4 = r0.f9583Z
            r3 = r4[r3]
            o.e$b r8 = p087o.C2476e.C2478b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f9550B
            float r4 = r2.f9556E
            int r5 = r17.mo9503U()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo9560v()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f1
        L_0x01ed:
            o.e$b r8 = p087o.C2476e.C2478b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m10689l(r5, r6, r7, r8, r9)
            p.l r3 = r2.f9592e
            p.g r3 = r3.f9995e
            int r4 = r2.mo9503U()
            r3.f9959m = r4
            goto L_0x017c
        L_0x0204:
            int r3 = r2.mo9503U()
            if (r9 != r4) goto L_0x021d
            int r3 = r17.mo9503U()
            o.d r5 = r2.f9572O
            int r5 = r5.f9533g
            int r3 = r3 - r5
            o.d r5 = r2.f9574Q
            int r5 = r5.f9533g
            int r3 = r3 - r5
            o.e$b r5 = p087o.C2476e.C2478b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x021f
        L_0x021d:
            r7 = r3
            r6 = r9
        L_0x021f:
            int r3 = r2.mo9560v()
            if (r12 != r4) goto L_0x0238
            int r3 = r17.mo9560v()
            o.d r4 = r2.f9573P
            int r4 = r4.f9533g
            int r3 = r3 - r4
            o.d r4 = r2.f9575R
            int r4 = r4.f9533g
            int r3 = r3 - r4
            o.e$b r4 = p087o.C2476e.C2478b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x023a
        L_0x0238:
            r9 = r3
            r8 = r12
        L_0x023a:
            r4 = r16
            r5 = r2
        L_0x023d:
            r4.m10689l(r5, r6, r7, r8, r9)
            p.l r3 = r2.f9592e
            p.g r3 = r3.f9995e
            int r4 = r2.mo9503U()
            r3.mo9693d(r4)
            p.n r3 = r2.f9594f
            p.g r3 = r3.f9995e
            int r4 = r2.mo9560v()
            r3.mo9693d(r4)
            goto L_0x0024
        L_0x0258:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2517e.m10686b(o.f):boolean");
    }

    /* renamed from: e */
    private int m10687e(C2479f fVar, int i) {
        int size = this.f9937i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f9937i.get(i2).mo9698b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m10688i(C2532p pVar, int i, ArrayList<C2527m> arrayList) {
        for (C2516d next : pVar.f9998h.f9948k) {
            if (next instanceof C2518f) {
                m10685a((C2518f) next, i, 0, pVar.f9999i, arrayList, (C2527m) null);
            } else if (next instanceof C2532p) {
                m10685a(((C2532p) next).f9998h, i, 0, pVar.f9999i, arrayList, (C2527m) null);
            }
        }
        for (C2516d next2 : pVar.f9999i.f9948k) {
            if (next2 instanceof C2518f) {
                m10685a((C2518f) next2, i, 1, pVar.f9998h, arrayList, (C2527m) null);
            } else if (next2 instanceof C2532p) {
                m10685a(((C2532p) next2).f9999i, i, 1, pVar.f9998h, arrayList, (C2527m) null);
            }
        }
        if (i == 1) {
            for (C2516d next3 : ((C2528n) pVar).f9973k.f9948k) {
                if (next3 instanceof C2518f) {
                    m10685a((C2518f) next3, i, 2, (C2518f) null, arrayList, (C2527m) null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m10689l(C2476e eVar, C2476e.C2478b bVar, int i, C2476e.C2478b bVar2, int i2) {
        C2512b.C2513a aVar = this.f9936h;
        aVar.f9917a = bVar;
        aVar.f9918b = bVar2;
        aVar.f9919c = i;
        aVar.f9920d = i2;
        this.f9935g.mo2454b(eVar, aVar);
        eVar.mo9531h1(this.f9936h.f9921e);
        eVar.mo9482I0(this.f9936h.f9922f);
        eVar.mo9480H0(this.f9936h.f9924h);
        eVar.mo9563x0(this.f9936h.f9923g);
    }

    /* renamed from: c */
    public void mo9682c() {
        mo9683d(this.f9933e);
        this.f9937i.clear();
        C2527m.f9965h = 0;
        m10688i(this.f9929a.f9592e, 0, this.f9937i);
        m10688i(this.f9929a.f9594f, 1, this.f9937i);
        this.f9930b = false;
    }

    /* renamed from: d */
    public void mo9683d(ArrayList<C2532p> arrayList) {
        Object kVar;
        arrayList.clear();
        this.f9932d.f9592e.mo9678f();
        this.f9932d.f9594f.mo9678f();
        arrayList.add(this.f9932d.f9592e);
        arrayList.add(this.f9932d.f9594f);
        Iterator<C2476e> it = this.f9932d.f9698L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2476e next = it.next();
            if (next instanceof C2480g) {
                kVar = new C2523j(next);
            } else {
                if (next.mo9528g0()) {
                    if (next.f9588c == null) {
                        next.f9588c = new C2515c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f9588c);
                } else {
                    arrayList.add(next.f9592e);
                }
                if (next.mo9532i0()) {
                    if (next.f9590d == null) {
                        next.f9590d = new C2515c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f9590d);
                } else {
                    arrayList.add(next.f9594f);
                }
                if (next instanceof C2483i) {
                    kVar = new C2524k(next);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C2532p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo9678f();
        }
        Iterator<C2532p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C2532p next2 = it3.next();
            if (next2.f9992b != this.f9932d) {
                next2.mo9676d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo9684f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f9930b || this.f9931c) {
            Iterator<C2476e> it = this.f9929a.f9698L0.iterator();
            while (it.hasNext()) {
                C2476e next = it.next();
                next.mo9540l();
                next.f9584a = false;
                next.f9592e.mo9695r();
                next.f9594f.mo9699q();
            }
            this.f9929a.mo9540l();
            C2479f fVar = this.f9929a;
            fVar.f9584a = false;
            fVar.f9592e.mo9695r();
            this.f9929a.f9594f.mo9699q();
            this.f9931c = false;
        }
        if (m10686b(this.f9932d)) {
            return false;
        }
        this.f9929a.mo9536j1(0);
        this.f9929a.mo9539k1(0);
        C2476e.C2478b s = this.f9929a.mo9555s(0);
        C2476e.C2478b s2 = this.f9929a.mo9555s(1);
        if (this.f9930b) {
            mo9682c();
        }
        int V = this.f9929a.mo9505V();
        int W = this.f9929a.mo9507W();
        this.f9929a.f9592e.f9998h.mo9693d(V);
        this.f9929a.f9594f.f9998h.mo9693d(W);
        mo9689m();
        C2476e.C2478b bVar = C2476e.C2478b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator<C2532p> it2 = this.f9933e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo9680m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && s == C2476e.C2478b.WRAP_CONTENT) {
                this.f9929a.mo9490M0(C2476e.C2478b.FIXED);
                C2479f fVar2 = this.f9929a;
                fVar2.mo9531h1(m10687e(fVar2, 0));
                C2479f fVar3 = this.f9929a;
                fVar3.f9592e.f9995e.mo9693d(fVar3.mo9503U());
            }
            if (z4 && s2 == C2476e.C2478b.WRAP_CONTENT) {
                this.f9929a.mo9521d1(C2476e.C2478b.FIXED);
                C2479f fVar4 = this.f9929a;
                fVar4.mo9482I0(m10687e(fVar4, 1));
                C2479f fVar5 = this.f9929a;
                fVar5.f9594f.f9995e.mo9693d(fVar5.mo9560v());
            }
        }
        C2479f fVar6 = this.f9929a;
        C2476e.C2478b bVar2 = fVar6.f9583Z[0];
        C2476e.C2478b bVar3 = C2476e.C2478b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C2476e.C2478b.MATCH_PARENT) {
            int U = fVar6.mo9503U() + V;
            this.f9929a.f9592e.f9999i.mo9693d(U);
            this.f9929a.f9592e.f9995e.mo9693d(U - V);
            mo9689m();
            C2479f fVar7 = this.f9929a;
            C2476e.C2478b bVar4 = fVar7.f9583Z[1];
            if (bVar4 == bVar3 || bVar4 == C2476e.C2478b.MATCH_PARENT) {
                int v = fVar7.mo9560v() + W;
                this.f9929a.f9594f.f9999i.mo9693d(v);
                this.f9929a.f9594f.f9995e.mo9693d(v - W);
            }
            mo9689m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<C2532p> it3 = this.f9933e.iterator();
        while (it3.hasNext()) {
            C2532p next2 = it3.next();
            if (next2.f9992b != this.f9929a || next2.f9997g) {
                next2.mo9677e();
            }
        }
        Iterator<C2532p> it4 = this.f9933e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C2532p next3 = it4.next();
            if ((z2 || next3.f9992b != this.f9929a) && (!next3.f9998h.f9947j || ((!next3.f9999i.f9947j && !(next3 instanceof C2523j)) || (!next3.f9995e.f9947j && !(next3 instanceof C2515c) && !(next3 instanceof C2523j))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f9929a.mo9490M0(s);
        this.f9929a.mo9521d1(s2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo9685g(boolean z) {
        if (this.f9930b) {
            Iterator<C2476e> it = this.f9929a.f9698L0.iterator();
            while (it.hasNext()) {
                C2476e next = it.next();
                next.mo9540l();
                next.f9584a = false;
                C2525l lVar = next.f9592e;
                lVar.f9995e.f9947j = false;
                lVar.f9997g = false;
                lVar.mo9695r();
                C2528n nVar = next.f9594f;
                nVar.f9995e.f9947j = false;
                nVar.f9997g = false;
                nVar.mo9699q();
            }
            this.f9929a.mo9540l();
            C2479f fVar = this.f9929a;
            fVar.f9584a = false;
            C2525l lVar2 = fVar.f9592e;
            lVar2.f9995e.f9947j = false;
            lVar2.f9997g = false;
            lVar2.mo9695r();
            C2528n nVar2 = this.f9929a.f9594f;
            nVar2.f9995e.f9947j = false;
            nVar2.f9997g = false;
            nVar2.mo9699q();
            mo9682c();
        }
        if (m10686b(this.f9932d)) {
            return false;
        }
        this.f9929a.mo9536j1(0);
        this.f9929a.mo9539k1(0);
        this.f9929a.f9592e.f9998h.mo9693d(0);
        this.f9929a.f9594f.f9998h.mo9693d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013a A[EDGE_INSN: B:78:0x013a->B:64:0x013a ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9686h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            o.f r1 = r9.f9929a
            r2 = 0
            o.e$b r1 = r1.mo9555s(r2)
            o.f r3 = r9.f9929a
            o.e$b r3 = r3.mo9555s(r0)
            o.f r4 = r9.f9929a
            int r4 = r4.mo9505V()
            o.f r5 = r9.f9929a
            int r5 = r5.mo9507W()
            if (r10 == 0) goto L_0x0086
            o.e$b r6 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<p.p> r6 = r9.f9933e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            p.p r7 = (p093p.C2532p) r7
            int r8 = r7.f9996f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo9680m()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            o.e$b r10 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            o.f r10 = r9.f9929a
            o.e$b r6 = p087o.C2476e.C2478b.FIXED
            r10.mo9490M0(r6)
            o.f r10 = r9.f9929a
            int r6 = r9.m10687e(r10, r2)
            r10.mo9531h1(r6)
            o.f r10 = r9.f9929a
            p.l r6 = r10.f9592e
            p.g r6 = r6.f9995e
            int r10 = r10.mo9503U()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            o.e$b r10 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            o.f r10 = r9.f9929a
            o.e$b r6 = p087o.C2476e.C2478b.FIXED
            r10.mo9521d1(r6)
            o.f r10 = r9.f9929a
            int r6 = r9.m10687e(r10, r0)
            r10.mo9482I0(r6)
            o.f r10 = r9.f9929a
            p.n r6 = r10.f9594f
            p.g r6 = r6.f9995e
            int r10 = r10.mo9560v()
        L_0x0083:
            r6.mo9693d(r10)
        L_0x0086:
            o.f r10 = r9.f9929a
            if (r11 != 0) goto L_0x00af
            o.e$b[] r5 = r10.f9583Z
            r5 = r5[r2]
            o.e$b r6 = p087o.C2476e.C2478b.FIXED
            if (r5 == r6) goto L_0x0096
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r5 != r6) goto L_0x00bc
        L_0x0096:
            int r10 = r10.mo9503U()
            int r10 = r10 + r4
            o.f r5 = r9.f9929a
            p.l r5 = r5.f9592e
            p.f r5 = r5.f9999i
            r5.mo9693d(r10)
            o.f r5 = r9.f9929a
            p.l r5 = r5.f9592e
            p.g r5 = r5.f9995e
            int r10 = r10 - r4
            r5.mo9693d(r10)
            goto L_0x00d6
        L_0x00af:
            o.e$b[] r4 = r10.f9583Z
            r4 = r4[r0]
            o.e$b r6 = p087o.C2476e.C2478b.FIXED
            if (r4 == r6) goto L_0x00be
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r4 != r6) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r10 = r2
            goto L_0x00d7
        L_0x00be:
            int r10 = r10.mo9560v()
            int r10 = r10 + r5
            o.f r4 = r9.f9929a
            p.n r4 = r4.f9594f
            p.f r4 = r4.f9999i
            r4.mo9693d(r10)
            o.f r4 = r9.f9929a
            p.n r4 = r4.f9594f
            p.g r4 = r4.f9995e
            int r10 = r10 - r5
            r4.mo9693d(r10)
        L_0x00d6:
            r10 = r0
        L_0x00d7:
            r9.mo9689m()
            java.util.ArrayList<p.p> r4 = r9.f9933e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0100
            java.lang.Object r5 = r4.next()
            p.p r5 = (p093p.C2532p) r5
            int r6 = r5.f9996f
            if (r6 == r11) goto L_0x00f1
            goto L_0x00e0
        L_0x00f1:
            o.e r6 = r5.f9992b
            o.f r7 = r9.f9929a
            if (r6 != r7) goto L_0x00fc
            boolean r6 = r5.f9997g
            if (r6 != 0) goto L_0x00fc
            goto L_0x00e0
        L_0x00fc:
            r5.mo9677e()
            goto L_0x00e0
        L_0x0100:
            java.util.ArrayList<p.p> r4 = r9.f9933e
            java.util.Iterator r4 = r4.iterator()
        L_0x0106:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013a
            java.lang.Object r5 = r4.next()
            p.p r5 = (p093p.C2532p) r5
            int r6 = r5.f9996f
            if (r6 == r11) goto L_0x0117
            goto L_0x0106
        L_0x0117:
            if (r10 != 0) goto L_0x0120
            o.e r6 = r5.f9992b
            o.f r7 = r9.f9929a
            if (r6 != r7) goto L_0x0120
            goto L_0x0106
        L_0x0120:
            p.f r6 = r5.f9998h
            boolean r6 = r6.f9947j
            if (r6 != 0) goto L_0x0128
        L_0x0126:
            r0 = r2
            goto L_0x013a
        L_0x0128:
            p.f r6 = r5.f9999i
            boolean r6 = r6.f9947j
            if (r6 != 0) goto L_0x012f
            goto L_0x0126
        L_0x012f:
            boolean r6 = r5 instanceof p093p.C2515c
            if (r6 != 0) goto L_0x0106
            p.g r5 = r5.f9995e
            boolean r5 = r5.f9947j
            if (r5 != 0) goto L_0x0106
            goto L_0x0126
        L_0x013a:
            o.f r10 = r9.f9929a
            r10.mo9490M0(r1)
            o.f r10 = r9.f9929a
            r10.mo9521d1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2517e.mo9686h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo9687j() {
        this.f9930b = true;
    }

    /* renamed from: k */
    public void mo9688k() {
        this.f9931c = true;
    }

    /* renamed from: m */
    public void mo9689m() {
        C2520g gVar;
        C2520g gVar2;
        int U;
        C2520g gVar3;
        int U2;
        Iterator<C2476e> it = this.f9929a.f9698L0.iterator();
        while (it.hasNext()) {
            C2476e next = it.next();
            if (!next.f9584a) {
                C2476e.C2478b[] bVarArr = next.f9583Z;
                boolean z = false;
                C2476e.C2478b bVar = bVarArr[0];
                C2476e.C2478b bVar2 = bVarArr[1];
                int i = next.f9628w;
                int i2 = next.f9630x;
                C2476e.C2478b bVar3 = C2476e.C2478b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C2476e.C2478b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C2476e.C2478b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2520g gVar4 = next.f9592e.f9995e;
                boolean z3 = gVar4.f9947j;
                C2520g gVar5 = next.f9594f.f9995e;
                boolean z4 = gVar5.f9947j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            m10689l(next, bVar3, gVar4.f9944g, C2476e.C2478b.FIXED, gVar5.f9944g);
                            if (bVar == C2476e.C2478b.MATCH_CONSTRAINT) {
                                gVar3 = next.f9592e.f9995e;
                                U2 = next.mo9503U();
                            } else {
                                gVar2 = next.f9592e.f9995e;
                                U = next.mo9503U();
                                gVar2.mo9693d(U);
                            }
                        }
                        if (next.f9584a && (gVar = next.f9594f.f9974l) != null) {
                            gVar.mo9693d(next.mo9544n());
                        }
                    } else {
                        m10689l(next, C2476e.C2478b.FIXED, gVar4.f9944g, bVar3, gVar5.f9944g);
                        if (bVar2 == C2476e.C2478b.MATCH_CONSTRAINT) {
                            gVar3 = next.f9594f.f9995e;
                            U2 = next.mo9560v();
                        } else {
                            gVar2 = next.f9594f.f9995e;
                            U = next.mo9560v();
                            gVar2.mo9693d(U);
                        }
                    }
                    gVar3.f9959m = U2;
                    gVar.mo9693d(next.mo9544n());
                } else {
                    C2476e.C2478b bVar4 = C2476e.C2478b.FIXED;
                    m10689l(next, bVar4, gVar4.f9944g, bVar4, gVar5.f9944g);
                }
                next.f9584a = true;
                gVar.mo9693d(next.mo9544n());
            }
        }
    }

    /* renamed from: n */
    public void mo9690n(C2512b.C2514b bVar) {
        this.f9935g = bVar;
    }
}
