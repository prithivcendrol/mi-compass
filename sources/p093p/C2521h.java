package p093p;

import java.util.ArrayList;
import p087o.C2470a;
import p087o.C2476e;
import p087o.C2479f;
import p087o.C2480g;
import p093p.C2512b;

/* renamed from: p.h */
public class C2521h {

    /* renamed from: a */
    private static C2512b.C2513a f9960a = new C2512b.C2513a();

    /* renamed from: b */
    private static int f9961b = 0;

    /* renamed from: c */
    private static int f9962c = 0;

    /* renamed from: a */
    private static boolean m10704a(int i, C2476e eVar) {
        C2476e.C2478b bVar;
        C2476e.C2478b bVar2;
        C2476e.C2478b y = eVar.mo9564y();
        C2476e.C2478b R = eVar.mo9497R();
        C2479f fVar = eVar.mo9481I() != null ? (C2479f) eVar.mo9481I() : null;
        if (fVar != null) {
            C2476e.C2478b y2 = fVar.mo9564y();
            C2476e.C2478b bVar3 = C2476e.C2478b.FIXED;
        }
        if (fVar != null) {
            C2476e.C2478b R2 = fVar.mo9497R();
            C2476e.C2478b bVar4 = C2476e.C2478b.FIXED;
        }
        C2476e.C2478b bVar5 = C2476e.C2478b.FIXED;
        boolean z = y == bVar5 || eVar.mo9432l0() || y == C2476e.C2478b.WRAP_CONTENT || (y == (bVar2 = C2476e.C2478b.MATCH_CONSTRAINT) && eVar.f9628w == 0 && eVar.f9591d0 == 0.0f && eVar.mo9511Y(0)) || (y == bVar2 && eVar.f9628w == 1 && eVar.mo9517b0(0, eVar.mo9503U()));
        boolean z2 = R == bVar5 || eVar.mo9433m0() || R == C2476e.C2478b.WRAP_CONTENT || (R == (bVar = C2476e.C2478b.MATCH_CONSTRAINT) && eVar.f9630x == 0 && eVar.f9591d0 == 0.0f && eVar.mo9511Y(1)) || (R == bVar && eVar.f9630x == 1 && eVar.mo9517b0(1, eVar.mo9560v()));
        if (eVar.f9591d0 <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r11 = r12.f9574Q.f9532f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r11 = r12.f9572O.f9532f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10705b(int r16, p087o.C2476e r17, p093p.C2512b.C2514b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.mo9523e0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f9961b
            r4 = 1
            int r3 = r3 + r4
            f9961b = r3
            boolean r3 = r0 instanceof p087o.C2479f
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.mo9538k0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = m10704a(r3, r0)
            if (r5 == 0) goto L_0x002f
            p.b$a r5 = new p.b$a
            r5.<init>()
            int r6 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r3, r0, r1, r5, r6)
        L_0x002f:
            o.d$b r3 = p087o.C2473d.C2475b.LEFT
            o.d r3 = r0.mo9542m(r3)
            o.d$b r5 = p087o.C2473d.C2475b.RIGHT
            o.d r5 = r0.mo9542m(r5)
            int r6 = r3.mo9448d()
            int r7 = r5.mo9448d()
            java.util.HashSet r8 = r3.mo9447c()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x012e
            boolean r8 = r3.mo9457m()
            if (r8 == 0) goto L_0x012e
            java.util.HashSet r3 = r3.mo9447c()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012e
            java.lang.Object r8 = r3.next()
            o.d r8 = (p087o.C2473d) r8
            o.e r12 = r8.f9530d
            int r13 = r16 + 1
            boolean r14 = m10704a(r13, r12)
            boolean r15 = r12.mo9538k0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            p.b$a r15 = new p.b$a
            r15.<init>()
            int r11 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r13, r12, r1, r15, r11)
        L_0x0080:
            o.d r11 = r12.f9572O
            if (r8 != r11) goto L_0x0090
            o.d r11 = r12.f9574Q
            o.d r11 = r11.f9532f
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.mo9457m()
            if (r11 != 0) goto L_0x00a0
        L_0x0090:
            o.d r11 = r12.f9574Q
            if (r8 != r11) goto L_0x00a2
            o.d r11 = r12.f9572O
            o.d r11 = r11.f9532f
            if (r11 == 0) goto L_0x00a2
            boolean r11 = r11.mo9457m()
            if (r11 == 0) goto L_0x00a2
        L_0x00a0:
            r11 = r4
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            o.e$b r15 = r12.mo9564y()
            o.e$b r4 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x00e6
            if (r14 == 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            o.e$b r8 = r12.mo9564y()
            if (r8 != r4) goto L_0x00ec
            int r4 = r12.f9548A
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.f9634z
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.mo9501T()
            if (r4 == r10) goto L_0x00ce
            int r4 = r12.f9628w
            if (r4 != 0) goto L_0x00ec
            float r4 = r12.mo9557t()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
        L_0x00ce:
            boolean r4 = r12.mo9528g0()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r12.mo9535j0()
            if (r4 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.mo9528g0()
            if (r4 != 0) goto L_0x00ec
            m10708e(r13, r0, r1, r12, r2)
            goto L_0x00ec
        L_0x00e6:
            boolean r4 = r12.mo9538k0()
            if (r4 == 0) goto L_0x00ef
        L_0x00ec:
            r4 = 1
            goto L_0x005a
        L_0x00ef:
            o.d r4 = r12.f9572O
            if (r8 != r4) goto L_0x010a
            o.d r14 = r12.f9574Q
            o.d r14 = r14.f9532f
            if (r14 != 0) goto L_0x010a
            int r4 = r4.mo9449e()
            int r4 = r4 + r6
            int r8 = r12.mo9503U()
            int r8 = r8 + r4
            r12.mo9470C0(r4, r8)
        L_0x0106:
            m10705b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x010a:
            o.d r14 = r12.f9574Q
            if (r8 != r14) goto L_0x0122
            o.d r4 = r4.f9532f
            if (r4 != 0) goto L_0x0122
            int r4 = r14.mo9449e()
            int r4 = r6 - r4
            int r8 = r12.mo9503U()
            int r8 = r4 - r8
            r12.mo9470C0(r8, r4)
            goto L_0x0106
        L_0x0122:
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.mo9528g0()
            if (r4 != 0) goto L_0x00ec
            m10707d(r13, r1, r12, r2)
            goto L_0x00ec
        L_0x012e:
            boolean r3 = r0 instanceof p087o.C2480g
            if (r3 == 0) goto L_0x0133
            return
        L_0x0133:
            java.util.HashSet r3 = r5.mo9447c()
            if (r3 == 0) goto L_0x021e
            boolean r3 = r5.mo9457m()
            if (r3 == 0) goto L_0x021e
            java.util.HashSet r3 = r5.mo9447c()
            java.util.Iterator r3 = r3.iterator()
        L_0x0147:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021e
            java.lang.Object r4 = r3.next()
            o.d r4 = (p087o.C2473d) r4
            o.e r5 = r4.f9530d
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = m10704a(r8, r5)
            boolean r12 = r5.mo9538k0()
            if (r12 == 0) goto L_0x016e
            if (r11 == 0) goto L_0x016e
            p.b$a r12 = new p.b$a
            r12.<init>()
            int r13 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r8, r5, r1, r12, r13)
        L_0x016e:
            o.d r12 = r5.f9572O
            if (r4 != r12) goto L_0x017e
            o.d r12 = r5.f9574Q
            o.d r12 = r12.f9532f
            if (r12 == 0) goto L_0x017e
            boolean r12 = r12.mo9457m()
            if (r12 != 0) goto L_0x018e
        L_0x017e:
            o.d r12 = r5.f9574Q
            if (r4 != r12) goto L_0x0190
            o.d r12 = r5.f9572O
            o.d r12 = r12.f9532f
            if (r12 == 0) goto L_0x0190
            boolean r12 = r12.mo9457m()
            if (r12 == 0) goto L_0x0190
        L_0x018e:
            r12 = r6
            goto L_0x0191
        L_0x0190:
            r12 = 0
        L_0x0191:
            o.e$b r13 = r5.mo9564y()
            o.e$b r14 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01d5
            if (r11 == 0) goto L_0x019c
            goto L_0x01d5
        L_0x019c:
            o.e$b r4 = r5.mo9564y()
            if (r4 != r14) goto L_0x0147
            int r4 = r5.f9548A
            if (r4 < 0) goto L_0x0147
            int r4 = r5.f9634z
            if (r4 < 0) goto L_0x0147
            int r4 = r5.mo9501T()
            if (r4 == r10) goto L_0x01bc
            int r4 = r5.f9628w
            if (r4 != 0) goto L_0x0147
            float r4 = r5.mo9557t()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0147
        L_0x01bc:
            boolean r4 = r5.mo9528g0()
            if (r4 != 0) goto L_0x0147
            boolean r4 = r5.mo9535j0()
            if (r4 != 0) goto L_0x0147
            if (r12 == 0) goto L_0x0147
            boolean r4 = r5.mo9528g0()
            if (r4 != 0) goto L_0x0147
            m10708e(r8, r0, r1, r5, r2)
            goto L_0x0147
        L_0x01d5:
            boolean r11 = r5.mo9538k0()
            if (r11 == 0) goto L_0x01dd
            goto L_0x0147
        L_0x01dd:
            o.d r11 = r5.f9572O
            if (r4 != r11) goto L_0x01f9
            o.d r13 = r5.f9574Q
            o.d r13 = r13.f9532f
            if (r13 != 0) goto L_0x01f9
            int r4 = r11.mo9449e()
            int r4 = r4 + r7
            int r11 = r5.mo9503U()
            int r11 = r11 + r4
            r5.mo9470C0(r4, r11)
        L_0x01f4:
            m10705b(r8, r5, r1, r2)
            goto L_0x0147
        L_0x01f9:
            o.d r13 = r5.f9574Q
            if (r4 != r13) goto L_0x0211
            o.d r4 = r11.f9532f
            if (r4 != 0) goto L_0x0211
            int r4 = r13.mo9449e()
            int r4 = r7 - r4
            int r11 = r5.mo9503U()
            int r11 = r4 - r11
            r5.mo9470C0(r11, r4)
            goto L_0x01f4
        L_0x0211:
            if (r12 == 0) goto L_0x0147
            boolean r4 = r5.mo9528g0()
            if (r4 != 0) goto L_0x0147
            m10707d(r8, r1, r5, r2)
            goto L_0x0147
        L_0x021e:
            r17.mo9548o0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2521h.m10705b(int, o.e, p.b$b, boolean):void");
    }

    /* renamed from: c */
    private static void m10706c(int i, C2470a aVar, C2512b.C2514b bVar, int i2, boolean z) {
        if (aVar.mo9434q1()) {
            int i3 = i + 1;
            if (i2 == 0) {
                m10705b(i3, aVar, bVar, z);
            } else {
                m10712i(i3, aVar, bVar);
            }
        }
    }

    /* renamed from: d */
    private static void m10707d(int i, C2512b.C2514b bVar, C2476e eVar, boolean z) {
        float w = eVar.mo9561w();
        int d = eVar.f9572O.f9532f.mo9448d();
        int d2 = eVar.f9574Q.f9532f.mo9448d();
        int e = eVar.f9572O.mo9449e() + d;
        int e2 = d2 - eVar.f9574Q.mo9449e();
        if (d == d2) {
            w = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int U = eVar.mo9503U();
        int i2 = (d2 - d) - U;
        if (d > d2) {
            i2 = (d - d2) - U;
        }
        int i3 = ((int) (i2 > 0 ? (w * ((float) i2)) + 0.5f : w * ((float) i2))) + d;
        int i4 = i3 + U;
        if (d > d2) {
            i4 = i3 - U;
        }
        eVar.mo9470C0(i3, i4);
        m10705b(i + 1, eVar, bVar, z);
    }

    /* renamed from: e */
    private static void m10708e(int i, C2476e eVar, C2512b.C2514b bVar, C2476e eVar2, boolean z) {
        float w = eVar2.mo9561w();
        int d = eVar2.f9572O.f9532f.mo9448d() + eVar2.f9572O.mo9449e();
        int d2 = eVar2.f9574Q.f9532f.mo9448d() - eVar2.f9574Q.mo9449e();
        if (d2 >= d) {
            int U = eVar2.mo9503U();
            if (eVar2.mo9501T() != 8) {
                int i2 = eVar2.f9628w;
                if (i2 == 2) {
                    if (!(eVar instanceof C2479f)) {
                        eVar = eVar.mo9481I();
                    }
                    U = (int) (eVar2.mo9561w() * 0.5f * ((float) eVar.mo9503U()));
                } else if (i2 == 0) {
                    U = d2 - d;
                }
                U = Math.max(eVar2.f9634z, U);
                int i3 = eVar2.f9548A;
                if (i3 > 0) {
                    U = Math.min(i3, U);
                }
            }
            int i4 = d + ((int) ((w * ((float) ((d2 - d) - U))) + 0.5f));
            eVar2.mo9470C0(i4, U + i4);
            m10705b(i + 1, eVar2, bVar, z);
        }
    }

    /* renamed from: f */
    private static void m10709f(int i, C2512b.C2514b bVar, C2476e eVar) {
        float P = eVar.mo9493P();
        int d = eVar.f9573P.f9532f.mo9448d();
        int d2 = eVar.f9575R.f9532f.mo9448d();
        int e = eVar.f9573P.mo9449e() + d;
        int e2 = d2 - eVar.f9575R.mo9449e();
        if (d == d2) {
            P = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int v = eVar.mo9560v();
        int i2 = (d2 - d) - v;
        if (d > d2) {
            i2 = (d - d2) - v;
        }
        int i3 = (int) (i2 > 0 ? (P * ((float) i2)) + 0.5f : P * ((float) i2));
        int i4 = d + i3;
        int i5 = i4 + v;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - v;
        }
        eVar.mo9476F0(i4, i5);
        m10712i(i + 1, eVar, bVar);
    }

    /* renamed from: g */
    private static void m10710g(int i, C2476e eVar, C2512b.C2514b bVar, C2476e eVar2) {
        float P = eVar2.mo9493P();
        int d = eVar2.f9573P.f9532f.mo9448d() + eVar2.f9573P.mo9449e();
        int d2 = eVar2.f9575R.f9532f.mo9448d() - eVar2.f9575R.mo9449e();
        if (d2 >= d) {
            int v = eVar2.mo9560v();
            if (eVar2.mo9501T() != 8) {
                int i2 = eVar2.f9630x;
                if (i2 == 2) {
                    if (!(eVar instanceof C2479f)) {
                        eVar = eVar.mo9481I();
                    }
                    v = (int) (P * 0.5f * ((float) eVar.mo9560v()));
                } else if (i2 == 0) {
                    v = d2 - d;
                }
                v = Math.max(eVar2.f9552C, v);
                int i3 = eVar2.f9554D;
                if (i3 > 0) {
                    v = Math.min(i3, v);
                }
            }
            int i4 = d + ((int) ((P * ((float) ((d2 - d) - v))) + 0.5f));
            eVar2.mo9476F0(i4, v + i4);
            m10712i(i + 1, eVar2, bVar);
        }
    }

    /* renamed from: h */
    public static void m10711h(C2479f fVar, C2512b.C2514b bVar) {
        int s1;
        int s12;
        C2476e.C2478b y = fVar.mo9564y();
        C2476e.C2478b R = fVar.mo9497R();
        f9961b = 0;
        f9962c = 0;
        fVar.mo9556s0();
        ArrayList<C2476e> o1 = fVar.mo9613o1();
        int size = o1.size();
        for (int i = 0; i < size; i++) {
            o1.get(i).mo9556s0();
        }
        boolean L1 = fVar.mo9579L1();
        if (y == C2476e.C2478b.FIXED) {
            fVar.mo9470C0(0, fVar.mo9503U());
        } else {
            fVar.mo9472D0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C2476e eVar = o1.get(i2);
            if (eVar instanceof C2480g) {
                C2480g gVar = (C2480g) eVar;
                if (gVar.mo9595p1() == 1) {
                    if (gVar.mo9596q1() != -1) {
                        s12 = gVar.mo9596q1();
                    } else if (gVar.mo9597r1() == -1 || !fVar.mo9432l0()) {
                        if (fVar.mo9432l0()) {
                            s12 = (int) ((gVar.mo9598s1() * ((float) fVar.mo9503U())) + 0.5f);
                        }
                        z = true;
                    } else {
                        s12 = fVar.mo9503U() - gVar.mo9597r1();
                    }
                    gVar.mo9599t1(s12);
                    z = true;
                }
            } else if ((eVar instanceof C2470a) && ((C2470a) eVar).mo9439u1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C2476e eVar2 = o1.get(i3);
                if (eVar2 instanceof C2480g) {
                    C2480g gVar2 = (C2480g) eVar2;
                    if (gVar2.mo9595p1() == 1) {
                        m10705b(0, gVar2, bVar, L1);
                    }
                }
            }
        }
        m10705b(0, fVar, bVar, L1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C2476e eVar3 = o1.get(i4);
                if (eVar3 instanceof C2470a) {
                    C2470a aVar = (C2470a) eVar3;
                    if (aVar.mo9439u1() == 0) {
                        m10706c(0, aVar, bVar, 0, L1);
                    }
                }
            }
        }
        if (R == C2476e.C2478b.FIXED) {
            fVar.mo9476F0(0, fVar.mo9560v());
        } else {
            fVar.mo9474E0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C2476e eVar4 = o1.get(i5);
            if (eVar4 instanceof C2480g) {
                C2480g gVar3 = (C2480g) eVar4;
                if (gVar3.mo9595p1() == 0) {
                    if (gVar3.mo9596q1() != -1) {
                        s1 = gVar3.mo9596q1();
                    } else if (gVar3.mo9597r1() == -1 || !fVar.mo9433m0()) {
                        if (fVar.mo9433m0()) {
                            s1 = (int) ((gVar3.mo9598s1() * ((float) fVar.mo9560v())) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        s1 = fVar.mo9560v() - gVar3.mo9597r1();
                    }
                    gVar3.mo9599t1(s1);
                    z3 = true;
                }
            } else if ((eVar4 instanceof C2470a) && ((C2470a) eVar4).mo9439u1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C2476e eVar5 = o1.get(i6);
                if (eVar5 instanceof C2480g) {
                    C2480g gVar4 = (C2480g) eVar5;
                    if (gVar4.mo9595p1() == 0) {
                        m10712i(1, gVar4, bVar);
                    }
                }
            }
        }
        m10712i(0, fVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C2476e eVar6 = o1.get(i7);
                if (eVar6 instanceof C2470a) {
                    C2470a aVar2 = (C2470a) eVar6;
                    if (aVar2.mo9439u1() == 1) {
                        m10706c(0, aVar2, bVar, 1, L1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C2476e eVar7 = o1.get(i8);
            if (eVar7.mo9538k0() && m10704a(0, eVar7)) {
                C2479f.m10575O1(0, eVar7, bVar, f9960a, C2512b.C2513a.f9914k);
                if (!(eVar7 instanceof C2480g)) {
                    m10705b(0, eVar7, bVar, L1);
                } else if (((C2480g) eVar7).mo9595p1() != 0) {
                    m10705b(0, eVar7, bVar, L1);
                }
                m10712i(0, eVar7, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.f9575R.f9532f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.f9573P.f9532f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10712i(int r16, p087o.C2476e r17, p093p.C2512b.C2514b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.mo9545n0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f9962c
            r3 = 1
            int r2 = r2 + r3
            f9962c = r2
            boolean r2 = r0 instanceof p087o.C2479f
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.mo9538k0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = m10704a(r2, r0)
            if (r4 == 0) goto L_0x002d
            p.b$a r4 = new p.b$a
            r4.<init>()
            int r5 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r2, r0, r1, r4, r5)
        L_0x002d:
            o.d$b r2 = p087o.C2473d.C2475b.TOP
            o.d r2 = r0.mo9542m(r2)
            o.d$b r4 = p087o.C2473d.C2475b.BOTTOM
            o.d r4 = r0.mo9542m(r4)
            int r5 = r2.mo9448d()
            int r6 = r4.mo9448d()
            java.util.HashSet r7 = r2.mo9447c()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x012e
            boolean r7 = r2.mo9457m()
            if (r7 == 0) goto L_0x012e
            java.util.HashSet r2 = r2.mo9447c()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x012e
            java.lang.Object r7 = r2.next()
            o.d r7 = (p087o.C2473d) r7
            o.e r11 = r7.f9530d
            int r12 = r16 + 1
            boolean r13 = m10704a(r12, r11)
            boolean r14 = r11.mo9538k0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            p.b$a r14 = new p.b$a
            r14.<init>()
            int r15 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r12, r11, r1, r14, r15)
        L_0x007e:
            o.d r14 = r11.f9573P
            if (r7 != r14) goto L_0x008e
            o.d r14 = r11.f9575R
            o.d r14 = r14.f9532f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.mo9457m()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            o.d r14 = r11.f9575R
            if (r7 != r14) goto L_0x00a0
            o.d r14 = r11.f9573P
            o.d r14 = r14.f9532f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.mo9457m()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = r3
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            o.e$b r15 = r11.mo9497R()
            o.e$b r10 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            o.e$b r7 = r11.mo9497R()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.f9554D
            if (r7 < 0) goto L_0x0058
            int r7 = r11.f9552C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.mo9501T()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f9630x
            if (r7 != 0) goto L_0x0058
            float r7 = r11.mo9557t()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.mo9532i0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.mo9535j0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo9532i0()
            if (r7 != 0) goto L_0x0058
            m10710g(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.mo9538k0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            o.d r10 = r11.f9573P
            if (r7 != r10) goto L_0x0109
            o.d r13 = r11.f9575R
            o.d r13 = r13.f9532f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.mo9449e()
            int r7 = r7 + r5
            int r10 = r11.mo9560v()
            int r10 = r10 + r7
            r11.mo9476F0(r7, r10)
        L_0x0104:
            m10712i(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            o.d r13 = r11.f9575R
            if (r7 != r13) goto L_0x0121
            o.d r7 = r10.f9532f
            if (r7 != 0) goto L_0x0121
            int r7 = r13.mo9449e()
            int r7 = r5 - r7
            int r10 = r11.mo9560v()
            int r10 = r7 - r10
            r11.mo9476F0(r10, r7)
            goto L_0x0104
        L_0x0121:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo9532i0()
            if (r7 != 0) goto L_0x0058
            m10709f(r12, r1, r11)
            goto L_0x0058
        L_0x012e:
            boolean r2 = r0 instanceof p087o.C2480g
            if (r2 == 0) goto L_0x0133
            return
        L_0x0133:
            java.util.HashSet r2 = r4.mo9447c()
            if (r2 == 0) goto L_0x021d
            boolean r2 = r4.mo9457m()
            if (r2 == 0) goto L_0x021d
            java.util.HashSet r2 = r4.mo9447c()
            java.util.Iterator r2 = r2.iterator()
        L_0x0147:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r2.next()
            o.d r4 = (p087o.C2473d) r4
            o.e r5 = r4.f9530d
            int r7 = r16 + 1
            boolean r10 = m10704a(r7, r5)
            boolean r11 = r5.mo9538k0()
            if (r11 == 0) goto L_0x016d
            if (r10 == 0) goto L_0x016d
            p.b$a r11 = new p.b$a
            r11.<init>()
            int r12 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r7, r5, r1, r11, r12)
        L_0x016d:
            o.d r11 = r5.f9573P
            if (r4 != r11) goto L_0x017d
            o.d r11 = r5.f9575R
            o.d r11 = r11.f9532f
            if (r11 == 0) goto L_0x017d
            boolean r11 = r11.mo9457m()
            if (r11 != 0) goto L_0x018d
        L_0x017d:
            o.d r11 = r5.f9575R
            if (r4 != r11) goto L_0x018f
            o.d r11 = r5.f9573P
            o.d r11 = r11.f9532f
            if (r11 == 0) goto L_0x018f
            boolean r11 = r11.mo9457m()
            if (r11 == 0) goto L_0x018f
        L_0x018d:
            r11 = r3
            goto L_0x0190
        L_0x018f:
            r11 = 0
        L_0x0190:
            o.e$b r12 = r5.mo9497R()
            o.e$b r13 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d4
            if (r10 == 0) goto L_0x019b
            goto L_0x01d4
        L_0x019b:
            o.e$b r4 = r5.mo9497R()
            if (r4 != r13) goto L_0x0147
            int r4 = r5.f9554D
            if (r4 < 0) goto L_0x0147
            int r4 = r5.f9552C
            if (r4 < 0) goto L_0x0147
            int r4 = r5.mo9501T()
            if (r4 == r9) goto L_0x01bb
            int r4 = r5.f9630x
            if (r4 != 0) goto L_0x0147
            float r4 = r5.mo9557t()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0147
        L_0x01bb:
            boolean r4 = r5.mo9532i0()
            if (r4 != 0) goto L_0x0147
            boolean r4 = r5.mo9535j0()
            if (r4 != 0) goto L_0x0147
            if (r11 == 0) goto L_0x0147
            boolean r4 = r5.mo9532i0()
            if (r4 != 0) goto L_0x0147
            m10710g(r7, r0, r1, r5)
            goto L_0x0147
        L_0x01d4:
            boolean r10 = r5.mo9538k0()
            if (r10 == 0) goto L_0x01dc
            goto L_0x0147
        L_0x01dc:
            o.d r10 = r5.f9573P
            if (r4 != r10) goto L_0x01f8
            o.d r12 = r5.f9575R
            o.d r12 = r12.f9532f
            if (r12 != 0) goto L_0x01f8
            int r4 = r10.mo9449e()
            int r4 = r4 + r6
            int r10 = r5.mo9560v()
            int r10 = r10 + r4
            r5.mo9476F0(r4, r10)
        L_0x01f3:
            m10712i(r7, r5, r1)
            goto L_0x0147
        L_0x01f8:
            o.d r12 = r5.f9575R
            if (r4 != r12) goto L_0x0210
            o.d r4 = r10.f9532f
            if (r4 != 0) goto L_0x0210
            int r4 = r12.mo9449e()
            int r4 = r6 - r4
            int r10 = r5.mo9560v()
            int r10 = r4 - r10
            r5.mo9476F0(r10, r4)
            goto L_0x01f3
        L_0x0210:
            if (r11 == 0) goto L_0x0147
            boolean r4 = r5.mo9532i0()
            if (r4 != 0) goto L_0x0147
            m10709f(r7, r1, r5)
            goto L_0x0147
        L_0x021d:
            o.d$b r2 = p087o.C2473d.C2475b.BASELINE
            o.d r2 = r0.mo9542m(r2)
            java.util.HashSet r4 = r2.mo9447c()
            if (r4 == 0) goto L_0x0282
            boolean r4 = r2.mo9457m()
            if (r4 == 0) goto L_0x0282
            int r4 = r2.mo9448d()
            java.util.HashSet r2 = r2.mo9447c()
            java.util.Iterator r2 = r2.iterator()
        L_0x023b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0282
            java.lang.Object r5 = r2.next()
            o.d r5 = (p087o.C2473d) r5
            o.e r6 = r5.f9530d
            int r7 = r16 + 1
            boolean r8 = m10704a(r7, r6)
            boolean r9 = r6.mo9538k0()
            if (r9 == 0) goto L_0x0261
            if (r8 == 0) goto L_0x0261
            p.b$a r9 = new p.b$a
            r9.<init>()
            int r10 = p093p.C2512b.C2513a.f9914k
            p087o.C2479f.m10575O1(r7, r6, r1, r9, r10)
        L_0x0261:
            o.e$b r9 = r6.mo9497R()
            o.e$b r10 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x026b
            if (r8 == 0) goto L_0x023b
        L_0x026b:
            boolean r8 = r6.mo9538k0()
            if (r8 == 0) goto L_0x0272
            goto L_0x023b
        L_0x0272:
            o.d r8 = r6.f9576S
            if (r5 != r8) goto L_0x023b
            int r5 = r5.mo9449e()
            int r5 = r5 + r4
            r6.mo9468B0(r5)
            m10712i(r7, r6, r1)
            goto L_0x023b
        L_0x0282:
            r17.mo9550p0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2521h.m10712i(int, o.e, p.b$b):void");
    }
}
