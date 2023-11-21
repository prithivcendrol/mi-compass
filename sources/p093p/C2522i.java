package p093p;

import java.util.ArrayList;
import p087o.C2473d;
import p087o.C2476e;
import p087o.C2480g;
import p087o.C2483i;

/* renamed from: p.i */
public class C2522i {
    /* renamed from: a */
    public static C2530o m10713a(C2476e eVar, int i, ArrayList<C2530o> arrayList, C2530o oVar) {
        C2473d dVar;
        int p1;
        int i2 = i == 0 ? eVar.f9565I0 : eVar.f9567J0;
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f9978b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C2530o oVar2 = arrayList.get(i4);
                if (oVar2.mo9703c() == i2) {
                    if (oVar != null) {
                        oVar.mo9706g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof C2483i) && (p1 = ((C2483i) eVar).mo9608p1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C2530o oVar3 = arrayList.get(i5);
                    if (oVar3.mo9703c() == p1) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new C2530o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.mo9701a(eVar)) {
            if (eVar instanceof C2480g) {
                C2480g gVar = (C2480g) eVar;
                C2473d o1 = gVar.mo9594o1();
                if (gVar.mo9595p1() == 0) {
                    i3 = 1;
                }
                o1.mo9446b(i3, arrayList, oVar);
            }
            int c = oVar.mo9703c();
            if (i == 0) {
                eVar.f9565I0 = c;
                eVar.f9572O.mo9446b(i, arrayList, oVar);
                dVar = eVar.f9574Q;
            } else {
                eVar.f9567J0 = c;
                eVar.f9573P.mo9446b(i, arrayList, oVar);
                eVar.f9576S.mo9446b(i, arrayList, oVar);
                dVar = eVar.f9575R;
            }
            dVar.mo9446b(i, arrayList, oVar);
            eVar.f9579V.mo9446b(i, arrayList, oVar);
        }
        return oVar;
    }

    /* renamed from: b */
    private static C2530o m10714b(ArrayList<C2530o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2530o oVar = arrayList.get(i2);
            if (i == oVar.f9978b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x038d A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10715c(p087o.C2479f r16, p093p.C2512b.C2514b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo9613o1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            o.e r5 = (p087o.C2476e) r5
            o.e$b r6 = r16.mo9564y()
            o.e$b r7 = r16.mo9497R()
            o.e$b r8 = r5.mo9564y()
            o.e$b r5 = r5.mo9497R()
            boolean r5 = m10716d(r6, r7, r8, r5)
            if (r5 != 0) goto L_0x002b
            return r3
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x002e:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0035:
            if (r5 >= r2) goto L_0x010e
            java.lang.Object r13 = r1.get(r5)
            o.e r13 = (p087o.C2476e) r13
            o.e$b r14 = r16.mo9564y()
            o.e$b r15 = r16.mo9497R()
            o.e$b r4 = r13.mo9564y()
            o.e$b r12 = r13.mo9497R()
            boolean r4 = m10716d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x005d
            p.b$a r4 = r0.f9672p1
            int r12 = p093p.C2512b.C2513a.f9914k
            r14 = r17
            p087o.C2479f.m10575O1(r3, r13, r14, r4, r12)
            goto L_0x005f
        L_0x005d:
            r14 = r17
        L_0x005f:
            boolean r4 = r13 instanceof p087o.C2480g
            if (r4 == 0) goto L_0x0088
            r12 = r13
            o.g r12 = (p087o.C2480g) r12
            int r15 = r12.mo9595p1()
            if (r15 != 0) goto L_0x0076
            if (r8 != 0) goto L_0x0073
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0073:
            r8.add(r12)
        L_0x0076:
            int r15 = r12.mo9595p1()
            r3 = 1
            if (r15 != r3) goto L_0x0088
            if (r6 != 0) goto L_0x0085
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0085:
            r6.add(r12)
        L_0x0088:
            boolean r3 = r13 instanceof p087o.C2483i
            if (r3 == 0) goto L_0x00c9
            boolean r3 = r13 instanceof p087o.C2470a
            if (r3 == 0) goto L_0x00b2
            r3 = r13
            o.a r3 = (p087o.C2470a) r3
            int r12 = r3.mo9439u1()
            if (r12 != 0) goto L_0x00a3
            if (r7 != 0) goto L_0x00a0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a0:
            r7.add(r3)
        L_0x00a3:
            int r12 = r3.mo9439u1()
            r15 = 1
            if (r12 != r15) goto L_0x00c9
            if (r9 != 0) goto L_0x00c6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00c6
        L_0x00b2:
            r3 = r13
            o.i r3 = (p087o.C2483i) r3
            if (r7 != 0) goto L_0x00bc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00bc:
            r7.add(r3)
            if (r9 != 0) goto L_0x00c6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00c6:
            r9.add(r3)
        L_0x00c9:
            o.d r3 = r13.f9572O
            o.d r3 = r3.f9532f
            if (r3 != 0) goto L_0x00e6
            o.d r3 = r13.f9574Q
            o.d r3 = r3.f9532f
            if (r3 != 0) goto L_0x00e6
            if (r4 != 0) goto L_0x00e6
            boolean r3 = r13 instanceof p087o.C2470a
            if (r3 != 0) goto L_0x00e6
            if (r10 != 0) goto L_0x00e3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00e3:
            r10.add(r13)
        L_0x00e6:
            o.d r3 = r13.f9573P
            o.d r3 = r3.f9532f
            if (r3 != 0) goto L_0x0109
            o.d r3 = r13.f9575R
            o.d r3 = r3.f9532f
            if (r3 != 0) goto L_0x0109
            o.d r3 = r13.f9576S
            o.d r3 = r3.f9532f
            if (r3 != 0) goto L_0x0109
            if (r4 != 0) goto L_0x0109
            boolean r3 = r13 instanceof p087o.C2470a
            if (r3 != 0) goto L_0x0109
            if (r11 != 0) goto L_0x0106
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0106:
            r11.add(r13)
        L_0x0109:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0035
        L_0x010e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x012b
            java.util.Iterator r4 = r6.iterator()
        L_0x0119:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012b
            java.lang.Object r5 = r4.next()
            o.g r5 = (p087o.C2480g) r5
            r6 = 0
            r12 = 0
            m10713a(r5, r6, r3, r12)
            goto L_0x0119
        L_0x012b:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x014c
            java.util.Iterator r4 = r7.iterator()
        L_0x0133:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x014c
            java.lang.Object r5 = r4.next()
            o.i r5 = (p087o.C2483i) r5
            p.o r7 = m10713a(r5, r6, r3, r12)
            r5.mo9607o1(r3, r6, r7)
            r7.mo9702b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0133
        L_0x014c:
            o.d$b r4 = p087o.C2473d.C2475b.LEFT
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x0174
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0160:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0174
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 0
            r7 = 0
            m10713a(r5, r6, r3, r7)
            goto L_0x0160
        L_0x0174:
            o.d$b r4 = p087o.C2473d.C2475b.RIGHT
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x019c
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0188:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x019c
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 0
            r7 = 0
            m10713a(r5, r6, r3, r7)
            goto L_0x0188
        L_0x019c:
            o.d$b r4 = p087o.C2473d.C2475b.CENTER
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x01c4
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c4
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 0
            r7 = 0
            m10713a(r5, r6, r3, r7)
            goto L_0x01b0
        L_0x01c4:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01dc
            java.util.Iterator r4 = r10.iterator()
        L_0x01cc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01dc
            java.lang.Object r5 = r4.next()
            o.e r5 = (p087o.C2476e) r5
            m10713a(r5, r6, r3, r7)
            goto L_0x01cc
        L_0x01dc:
            if (r8 == 0) goto L_0x01f3
            java.util.Iterator r4 = r8.iterator()
        L_0x01e2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f3
            java.lang.Object r5 = r4.next()
            o.g r5 = (p087o.C2480g) r5
            r6 = 1
            m10713a(r5, r6, r3, r7)
            goto L_0x01e2
        L_0x01f3:
            r6 = 1
            if (r9 == 0) goto L_0x0213
            java.util.Iterator r4 = r9.iterator()
        L_0x01fa:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0213
            java.lang.Object r5 = r4.next()
            o.i r5 = (p087o.C2483i) r5
            p.o r8 = m10713a(r5, r6, r3, r7)
            r5.mo9607o1(r3, r6, r8)
            r8.mo9702b(r3)
            r6 = 1
            r7 = 0
            goto L_0x01fa
        L_0x0213:
            o.d$b r4 = p087o.C2473d.C2475b.TOP
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x023b
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0227:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023b
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 1
            r7 = 0
            m10713a(r5, r6, r3, r7)
            goto L_0x0227
        L_0x023b:
            o.d$b r4 = p087o.C2473d.C2475b.BASELINE
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x0263
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x024f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0263
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 1
            r7 = 0
            m10713a(r5, r6, r3, r7)
            goto L_0x024f
        L_0x0263:
            o.d$b r4 = p087o.C2473d.C2475b.BOTTOM
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x028b
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0277:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x028b
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 1
            r7 = 0
            m10713a(r5, r6, r3, r7)
            goto L_0x0277
        L_0x028b:
            o.d$b r4 = p087o.C2473d.C2475b.CENTER
            o.d r4 = r0.mo9542m(r4)
            java.util.HashSet r5 = r4.mo9447c()
            if (r5 == 0) goto L_0x02b3
            java.util.HashSet r4 = r4.mo9447c()
            java.util.Iterator r4 = r4.iterator()
        L_0x029f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b3
            java.lang.Object r5 = r4.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r5 = r5.f9530d
            r6 = 1
            r12 = 0
            m10713a(r5, r6, r3, r12)
            goto L_0x029f
        L_0x02b3:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02cb
            java.util.Iterator r4 = r11.iterator()
        L_0x02bb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02cb
            java.lang.Object r5 = r4.next()
            o.e r5 = (p087o.C2476e) r5
            m10713a(r5, r6, r3, r12)
            goto L_0x02bb
        L_0x02cb:
            r4 = 0
        L_0x02cc:
            if (r4 >= r2) goto L_0x02f8
            java.lang.Object r5 = r1.get(r4)
            o.e r5 = (p087o.C2476e) r5
            boolean r6 = r5.mo9552q0()
            if (r6 == 0) goto L_0x02f5
            int r6 = r5.f9565I0
            p.o r6 = m10714b(r3, r6)
            int r5 = r5.f9567J0
            p.o r5 = m10714b(r3, r5)
            if (r6 == 0) goto L_0x02f5
            if (r5 == 0) goto L_0x02f5
            r7 = 0
            r6.mo9706g(r7, r5)
            r7 = 2
            r5.mo9708i(r7)
            r3.remove(r6)
        L_0x02f5:
            int r4 = r4 + 1
            goto L_0x02cc
        L_0x02f8:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0301
            r1 = 0
            return r1
        L_0x0301:
            o.e$b r1 = r16.mo9564y()
            o.e$b r2 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0343
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x030f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0334
            java.lang.Object r4 = r1.next()
            p.o r4 = (p093p.C2530o) r4
            int r5 = r4.mo9704d()
            r7 = 1
            if (r5 != r7) goto L_0x0323
            goto L_0x030f
        L_0x0323:
            r5 = 0
            r4.mo9707h(r5)
            l.d r7 = r16.mo9575H1()
            int r7 = r4.mo9705f(r7, r5)
            if (r7 <= r6) goto L_0x030f
            r2 = r4
            r6 = r7
            goto L_0x030f
        L_0x0334:
            if (r2 == 0) goto L_0x0343
            o.e$b r1 = p087o.C2476e.C2478b.FIXED
            r0.mo9490M0(r1)
            r0.mo9531h1(r6)
            r1 = 1
            r2.mo9707h(r1)
            goto L_0x0344
        L_0x0343:
            r2 = r12
        L_0x0344:
            o.e$b r1 = r16.mo9497R()
            o.e$b r4 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r1 != r4) goto L_0x0388
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0352:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0377
            java.lang.Object r4 = r1.next()
            p.o r4 = (p093p.C2530o) r4
            int r5 = r4.mo9704d()
            if (r5 != 0) goto L_0x0365
            goto L_0x0352
        L_0x0365:
            r5 = 0
            r4.mo9707h(r5)
            l.d r7 = r16.mo9575H1()
            r8 = 1
            int r7 = r4.mo9705f(r7, r8)
            if (r7 <= r6) goto L_0x0352
            r3 = r4
            r6 = r7
            goto L_0x0352
        L_0x0377:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038a
            o.e$b r1 = p087o.C2476e.C2478b.FIXED
            r0.mo9521d1(r1)
            r0.mo9482I0(r6)
            r3.mo9707h(r8)
            r4 = r3
            goto L_0x038b
        L_0x0388:
            r5 = 0
            r8 = 1
        L_0x038a:
            r4 = r12
        L_0x038b:
            if (r2 != 0) goto L_0x0392
            if (r4 == 0) goto L_0x0390
            goto L_0x0392
        L_0x0390:
            r3 = r5
            goto L_0x0393
        L_0x0392:
            r3 = r8
        L_0x0393:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2522i.m10715c(o.f, p.b$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = p087o.C2476e.C2478b.WRAP_CONTENT;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10716d(p087o.C2476e.C2478b r5, p087o.C2476e.C2478b r6, p087o.C2476e.C2478b r7, p087o.C2476e.C2478b r8) {
        /*
            o.e$b r0 = p087o.C2476e.C2478b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            o.e$b r3 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            o.e$b r4 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            o.e$b r7 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2522i.m10716d(o.e$b, o.e$b, o.e$b, o.e$b):boolean");
    }
}
