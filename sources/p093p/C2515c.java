package p093p;

import java.util.ArrayList;
import java.util.Iterator;
import p087o.C2476e;
import p087o.C2479f;

/* renamed from: p.c */
public class C2515c extends C2532p {

    /* renamed from: k */
    ArrayList<C2532p> f9927k = new ArrayList<>();

    /* renamed from: l */
    private int f9928l;

    public C2515c(C2476e eVar, int i) {
        super(eVar);
        this.f9996f = i;
        m10675q();
    }

    /* renamed from: q */
    private void m10675q() {
        C2476e eVar;
        C2476e eVar2 = this.f9992b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.mo9483J(this.f9996f);
        } while (eVar2 != null);
        this.f9992b = eVar;
        this.f9927k.add(eVar.mo9487L(this.f9996f));
        C2476e H = eVar.mo9479H(this.f9996f);
        while (H != null) {
            this.f9927k.add(H.mo9487L(this.f9996f));
            H = H.mo9479H(this.f9996f);
        }
        Iterator<C2532p> it = this.f9927k.iterator();
        while (it.hasNext()) {
            C2532p next = it.next();
            int i = this.f9996f;
            if (i == 0) {
                next.f9992b.f9588c = this;
            } else if (i == 1) {
                next.f9992b.f9590d = this;
            }
        }
        if ((this.f9996f == 0 && ((C2479f) this.f9992b.mo9481I()).mo9579L1()) && this.f9927k.size() > 1) {
            ArrayList<C2532p> arrayList = this.f9927k;
            this.f9992b = arrayList.get(arrayList.size() - 1).f9992b;
        }
        this.f9928l = this.f9996f == 0 ? this.f9992b.mo9562x() : this.f9992b.mo9495Q();
    }

    /* renamed from: r */
    private C2476e m10676r() {
        for (int i = 0; i < this.f9927k.size(); i++) {
            C2532p pVar = this.f9927k.get(i);
            if (pVar.f9992b.mo9501T() != 8) {
                return pVar.f9992b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C2476e m10677s() {
        for (int size = this.f9927k.size() - 1; size >= 0; size--) {
            C2532p pVar = this.f9927k.get(size);
            if (pVar.f9992b.mo9501T() != 8) {
                return pVar.f9992b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9675a(p093p.C2516d r27) {
        /*
            r26 = this;
            r0 = r26
            p.f r1 = r0.f9998h
            boolean r1 = r1.f9947j
            if (r1 == 0) goto L_0x03ef
            p.f r1 = r0.f9999i
            boolean r1 = r1.f9947j
            if (r1 != 0) goto L_0x0010
            goto L_0x03ef
        L_0x0010:
            o.e r1 = r0.f9992b
            o.e r1 = r1.mo9481I()
            boolean r2 = r1 instanceof p087o.C2479f
            if (r2 == 0) goto L_0x0021
            o.f r1 = (p087o.C2479f) r1
            boolean r1 = r1.mo9579L1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            p.f r2 = r0.f9999i
            int r2 = r2.f9944g
            p.f r4 = r0.f9998h
            int r4 = r4.f9944g
            int r2 = r2 - r4
            java.util.ArrayList<p.p> r4 = r0.f9927k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<p.p> r8 = r0.f9927k
            java.lang.Object r8 = r8.get(r5)
            p.p r8 = (p093p.C2532p) r8
            o.e r8 = r8.f9992b
            int r8 = r8.mo9501T()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<p.p> r10 = r0.f9927k
            java.lang.Object r10 = r10.get(r9)
            p.p r10 = (p093p.C2532p) r10
            o.e r10 = r10.f9992b
            int r10 = r10.mo9501T()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<p.p> r3 = r0.f9927k
            java.lang.Object r3 = r3.get(r13)
            p.p r3 = (p093p.C2532p) r3
            o.e r11 = r3.f9992b
            int r11 = r11.mo9501T()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            p.f r11 = r3.f9998h
            int r11 = r11.f9943f
            int r14 = r14 + r11
        L_0x008e:
            p.g r11 = r3.f9995e
            int r7 = r11.f9944g
            o.e$b r10 = r3.f9994d
            o.e$b r12 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f9996f
            if (r11 != 0) goto L_0x00ac
            o.e r12 = r3.f9992b
            p.l r12 = r12.f9592e
            p.g r12 = r12.f9995e
            boolean r12 = r12.f9947j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            o.e r11 = r3.f9992b
            p.n r11 = r11.f9594f
            p.g r11 = r11.f9995e
            boolean r11 = r11.f9947j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f9991a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f9959m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.f9947j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            o.e r7 = r3.f9992b
            float[] r7 = r7.f9555D0
            int r10 = r0.f9996f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            p.f r3 = r3.f9999i
            int r3 = r3.f9943f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            p.f r7 = r0.f9998h
            int r7 = r7.f9944g
            if (r1 == 0) goto L_0x0118
            p.f r7 = r0.f9999i
            int r7 = r7.f9944g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x0129
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0128
            int r7 = r7 + r10
            goto L_0x0129
        L_0x0128:
            int r7 = r7 - r10
        L_0x0129:
            if (r15 <= 0) goto L_0x0220
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0135:
            if (r12 >= r4) goto L_0x01d2
            java.util.ArrayList<p.p> r9 = r0.f9927k
            java.lang.Object r9 = r9.get(r12)
            p.p r9 = (p093p.C2532p) r9
            r19 = r11
            o.e r11 = r9.f9992b
            int r11 = r11.mo9501T()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x014f
            goto L_0x01b8
        L_0x014f:
            o.e$b r11 = r9.f9994d
            o.e$b r14 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01b8
            p.g r11 = r9.f9995e
            boolean r14 = r11.f9947j
            if (r14 != 0) goto L_0x01b8
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0172
            o.e r14 = r9.f9992b
            float[] r14 = r14.f9555D0
            r21 = r7
            int r7 = r0.f9996f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0176
        L_0x0172:
            r21 = r7
            r7 = r19
        L_0x0176:
            int r14 = r0.f9996f
            if (r14 != 0) goto L_0x0185
            o.e r14 = r9.f9992b
            r22 = r10
            int r10 = r14.f9548A
            int r14 = r14.f9634z
            r23 = r1
            goto L_0x0194
        L_0x0185:
            r22 = r10
            o.e r10 = r9.f9992b
            int r14 = r10.f9554D
            int r10 = r10.f9552C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x0194:
            int r1 = r9.f9991a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a2
            int r1 = r11.f9959m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01a3
        L_0x01a2:
            r1 = r7
        L_0x01a3:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01ad
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01ad:
            if (r1 == r7) goto L_0x01b2
            int r13 = r13 + 1
            r7 = r1
        L_0x01b2:
            p.g r1 = r9.f9995e
            r1.mo9693d(r7)
            goto L_0x01c0
        L_0x01b8:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c0:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0135
        L_0x01d2:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0211
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01df:
            if (r1 >= r4) goto L_0x020f
            java.util.ArrayList<p.p> r7 = r0.f9927k
            java.lang.Object r7 = r7.get(r1)
            p.p r7 = (p093p.C2532p) r7
            o.e r9 = r7.f9992b
            int r9 = r9.mo9501T()
            r10 = 8
            if (r9 != r10) goto L_0x01f4
            goto L_0x020c
        L_0x01f4:
            if (r1 <= 0) goto L_0x01fd
            if (r1 < r5) goto L_0x01fd
            p.f r9 = r7.f9998h
            int r9 = r9.f9943f
            int r3 = r3 + r9
        L_0x01fd:
            p.g r9 = r7.f9995e
            int r9 = r9.f9944g
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x020c
            if (r1 >= r6) goto L_0x020c
            p.f r7 = r7.f9999i
            int r7 = r7.f9943f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x020c:
            int r1 = r1 + 1
            goto L_0x01df
        L_0x020f:
            r14 = r3
            goto L_0x0213
        L_0x0211:
            r14 = r20
        L_0x0213:
            int r1 = r0.f9928l
            r3 = 2
            if (r1 != r3) goto L_0x021e
            if (r13 != 0) goto L_0x021e
            r1 = 0
            r0.f9928l = r1
            goto L_0x022a
        L_0x021e:
            r1 = 0
            goto L_0x022a
        L_0x0220:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x022a:
            if (r14 <= r2) goto L_0x022e
            r0.f9928l = r3
        L_0x022e:
            if (r24 <= 0) goto L_0x0236
            if (r15 != 0) goto L_0x0236
            if (r5 != r6) goto L_0x0236
            r0.f9928l = r3
        L_0x0236:
            int r3 = r0.f9928l
            r7 = 1
            r9 = r24
            if (r3 != r7) goto L_0x02ca
            if (r9 <= r7) goto L_0x0244
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x024b
        L_0x0244:
            if (r9 != r7) goto L_0x024a
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x024b
        L_0x024a:
            r2 = r1
        L_0x024b:
            if (r15 <= 0) goto L_0x024e
            r2 = r1
        L_0x024e:
            r3 = r1
            r7 = r21
        L_0x0251:
            if (r3 >= r4) goto L_0x03ef
            if (r23 == 0) goto L_0x025a
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x025b
        L_0x025a:
            r1 = r3
        L_0x025b:
            java.util.ArrayList<p.p> r9 = r0.f9927k
            java.lang.Object r1 = r9.get(r1)
            p.p r1 = (p093p.C2532p) r1
            o.e r9 = r1.f9992b
            int r9 = r9.mo9501T()
            r10 = 8
            if (r9 != r10) goto L_0x0278
            p.f r9 = r1.f9998h
            r9.mo9693d(r7)
            p.f r1 = r1.f9999i
            r1.mo9693d(r7)
            goto L_0x02c7
        L_0x0278:
            if (r3 <= 0) goto L_0x027f
            if (r23 == 0) goto L_0x027e
            int r7 = r7 - r2
            goto L_0x027f
        L_0x027e:
            int r7 = r7 + r2
        L_0x027f:
            if (r3 <= 0) goto L_0x028c
            if (r3 < r5) goto L_0x028c
            p.f r9 = r1.f9998h
            int r9 = r9.f9943f
            if (r23 == 0) goto L_0x028b
            int r7 = r7 - r9
            goto L_0x028c
        L_0x028b:
            int r7 = r7 + r9
        L_0x028c:
            if (r23 == 0) goto L_0x0291
            p.f r9 = r1.f9999i
            goto L_0x0293
        L_0x0291:
            p.f r9 = r1.f9998h
        L_0x0293:
            r9.mo9693d(r7)
            p.g r9 = r1.f9995e
            int r10 = r9.f9944g
            o.e$b r11 = r1.f9994d
            o.e$b r12 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02a7
            int r11 = r1.f9991a
            r12 = 1
            if (r11 != r12) goto L_0x02a7
            int r10 = r9.f9959m
        L_0x02a7:
            if (r23 == 0) goto L_0x02ab
            int r7 = r7 - r10
            goto L_0x02ac
        L_0x02ab:
            int r7 = r7 + r10
        L_0x02ac:
            if (r23 == 0) goto L_0x02b1
            p.f r9 = r1.f9998h
            goto L_0x02b3
        L_0x02b1:
            p.f r9 = r1.f9999i
        L_0x02b3:
            r9.mo9693d(r7)
            r9 = 1
            r1.f9997g = r9
            if (r3 >= r8) goto L_0x02c7
            if (r3 >= r6) goto L_0x02c7
            p.f r1 = r1.f9999i
            int r1 = r1.f9943f
            int r1 = -r1
            if (r23 == 0) goto L_0x02c6
            int r7 = r7 - r1
            goto L_0x02c7
        L_0x02c6:
            int r7 = r7 + r1
        L_0x02c7:
            int r3 = r3 + 1
            goto L_0x0251
        L_0x02ca:
            if (r3 != 0) goto L_0x034f
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02d4
            r2 = r1
        L_0x02d4:
            r3 = r1
            r7 = r21
        L_0x02d7:
            if (r3 >= r4) goto L_0x03ef
            if (r23 == 0) goto L_0x02e0
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02e1
        L_0x02e0:
            r1 = r3
        L_0x02e1:
            java.util.ArrayList<p.p> r9 = r0.f9927k
            java.lang.Object r1 = r9.get(r1)
            p.p r1 = (p093p.C2532p) r1
            o.e r9 = r1.f9992b
            int r9 = r9.mo9501T()
            r10 = 8
            if (r9 != r10) goto L_0x02fe
            p.f r9 = r1.f9998h
            r9.mo9693d(r7)
            p.f r1 = r1.f9999i
            r1.mo9693d(r7)
            goto L_0x034c
        L_0x02fe:
            if (r23 == 0) goto L_0x0302
            int r7 = r7 - r2
            goto L_0x0303
        L_0x0302:
            int r7 = r7 + r2
        L_0x0303:
            if (r3 <= 0) goto L_0x0310
            if (r3 < r5) goto L_0x0310
            p.f r9 = r1.f9998h
            int r9 = r9.f9943f
            if (r23 == 0) goto L_0x030f
            int r7 = r7 - r9
            goto L_0x0310
        L_0x030f:
            int r7 = r7 + r9
        L_0x0310:
            if (r23 == 0) goto L_0x0315
            p.f r9 = r1.f9999i
            goto L_0x0317
        L_0x0315:
            p.f r9 = r1.f9998h
        L_0x0317:
            r9.mo9693d(r7)
            p.g r9 = r1.f9995e
            int r10 = r9.f9944g
            o.e$b r11 = r1.f9994d
            o.e$b r12 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x032f
            int r11 = r1.f9991a
            r12 = 1
            if (r11 != r12) goto L_0x032f
            int r9 = r9.f9959m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x032f:
            if (r23 == 0) goto L_0x0333
            int r7 = r7 - r10
            goto L_0x0334
        L_0x0333:
            int r7 = r7 + r10
        L_0x0334:
            if (r23 == 0) goto L_0x0339
            p.f r9 = r1.f9998h
            goto L_0x033b
        L_0x0339:
            p.f r9 = r1.f9999i
        L_0x033b:
            r9.mo9693d(r7)
            if (r3 >= r8) goto L_0x034c
            if (r3 >= r6) goto L_0x034c
            p.f r1 = r1.f9999i
            int r1 = r1.f9943f
            int r1 = -r1
            if (r23 == 0) goto L_0x034b
            int r7 = r7 - r1
            goto L_0x034c
        L_0x034b:
            int r7 = r7 + r1
        L_0x034c:
            int r3 = r3 + 1
            goto L_0x02d7
        L_0x034f:
            r7 = 2
            if (r3 != r7) goto L_0x03ef
            int r3 = r0.f9996f
            if (r3 != 0) goto L_0x035d
            o.e r3 = r0.f9992b
            float r3 = r3.mo9561w()
            goto L_0x0363
        L_0x035d:
            o.e r3 = r0.f9992b
            float r3 = r3.mo9493P()
        L_0x0363:
            if (r23 == 0) goto L_0x0369
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0369:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0374
            if (r15 <= 0) goto L_0x0375
        L_0x0374:
            r2 = r1
        L_0x0375:
            if (r23 == 0) goto L_0x037a
            int r7 = r21 - r2
            goto L_0x037c
        L_0x037a:
            int r7 = r21 + r2
        L_0x037c:
            r3 = r1
        L_0x037d:
            if (r3 >= r4) goto L_0x03ef
            if (r23 == 0) goto L_0x0386
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0387
        L_0x0386:
            r1 = r3
        L_0x0387:
            java.util.ArrayList<p.p> r2 = r0.f9927k
            java.lang.Object r1 = r2.get(r1)
            p.p r1 = (p093p.C2532p) r1
            o.e r2 = r1.f9992b
            int r2 = r2.mo9501T()
            r9 = 8
            if (r2 != r9) goto L_0x03a5
            p.f r2 = r1.f9998h
            r2.mo9693d(r7)
            p.f r1 = r1.f9999i
            r1.mo9693d(r7)
            r12 = 1
            goto L_0x03ec
        L_0x03a5:
            if (r3 <= 0) goto L_0x03b2
            if (r3 < r5) goto L_0x03b2
            p.f r2 = r1.f9998h
            int r2 = r2.f9943f
            if (r23 == 0) goto L_0x03b1
            int r7 = r7 - r2
            goto L_0x03b2
        L_0x03b1:
            int r7 = r7 + r2
        L_0x03b2:
            if (r23 == 0) goto L_0x03b7
            p.f r2 = r1.f9999i
            goto L_0x03b9
        L_0x03b7:
            p.f r2 = r1.f9998h
        L_0x03b9:
            r2.mo9693d(r7)
            p.g r2 = r1.f9995e
            int r10 = r2.f9944g
            o.e$b r11 = r1.f9994d
            o.e$b r12 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03ce
            int r11 = r1.f9991a
            r12 = 1
            if (r11 != r12) goto L_0x03cf
            int r10 = r2.f9959m
            goto L_0x03cf
        L_0x03ce:
            r12 = 1
        L_0x03cf:
            if (r23 == 0) goto L_0x03d3
            int r7 = r7 - r10
            goto L_0x03d4
        L_0x03d3:
            int r7 = r7 + r10
        L_0x03d4:
            if (r23 == 0) goto L_0x03d9
            p.f r2 = r1.f9998h
            goto L_0x03db
        L_0x03d9:
            p.f r2 = r1.f9999i
        L_0x03db:
            r2.mo9693d(r7)
            if (r3 >= r8) goto L_0x03ec
            if (r3 >= r6) goto L_0x03ec
            p.f r1 = r1.f9999i
            int r1 = r1.f9943f
            int r1 = -r1
            if (r23 == 0) goto L_0x03eb
            int r7 = r7 - r1
            goto L_0x03ec
        L_0x03eb:
            int r7 = r7 + r1
        L_0x03ec:
            int r3 = r3 + 1
            goto L_0x037d
        L_0x03ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2515c.mo9675a(p.d):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9676d() {
        /*
            r5 = this;
            java.util.ArrayList<p.p> r0 = r5.f9927k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            p.p r1 = (p093p.C2532p) r1
            r1.mo9676d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<p.p> r0 = r5.f9927k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<p.p> r2 = r5.f9927k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            p.p r2 = (p093p.C2532p) r2
            o.e r2 = r2.f9992b
            java.util.ArrayList<p.p> r4 = r5.f9927k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            p.p r0 = (p093p.C2532p) r0
            o.e r0 = r0.f9992b
            int r4 = r5.f9996f
            if (r4 != 0) goto L_0x0070
            o.d r1 = r2.f9572O
            o.d r0 = r0.f9574Q
            p.f r2 = r5.mo9714i(r1, r3)
            int r1 = r1.mo9449e()
            o.e r4 = r5.m10676r()
            if (r4 == 0) goto L_0x0052
            o.d r1 = r4.f9572O
            int r1 = r1.mo9449e()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            p.f r4 = r5.f9998h
            r5.mo9710b(r4, r2, r1)
        L_0x0059:
            p.f r1 = r5.mo9714i(r0, r3)
            int r0 = r0.mo9449e()
            o.e r2 = r5.m10677s()
            if (r2 == 0) goto L_0x006d
            o.d r0 = r2.f9574Q
            int r0 = r0.mo9449e()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            o.d r2 = r2.f9573P
            o.d r0 = r0.f9575R
            p.f r3 = r5.mo9714i(r2, r1)
            int r2 = r2.mo9449e()
            o.e r4 = r5.m10676r()
            if (r4 == 0) goto L_0x0088
            o.d r2 = r4.f9573P
            int r2 = r2.mo9449e()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            p.f r4 = r5.f9998h
            r5.mo9710b(r4, r3, r2)
        L_0x008f:
            p.f r1 = r5.mo9714i(r0, r1)
            int r0 = r0.mo9449e()
            o.e r2 = r5.m10677s()
            if (r2 == 0) goto L_0x00a3
            o.d r0 = r2.f9575R
            int r0 = r0.mo9449e()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            p.f r2 = r5.f9999i
            int r0 = -r0
            r5.mo9710b(r2, r1, r0)
        L_0x00ab:
            p.f r0 = r5.f9998h
            r0.f9938a = r5
            p.f r0 = r5.f9999i
            r0.f9938a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2515c.mo9676d():void");
    }

    /* renamed from: e */
    public void mo9677e() {
        for (int i = 0; i < this.f9927k.size(); i++) {
            this.f9927k.get(i).mo9677e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9678f() {
        this.f9993c = null;
        Iterator<C2532p> it = this.f9927k.iterator();
        while (it.hasNext()) {
            it.next().mo9678f();
        }
    }

    /* renamed from: j */
    public long mo9679j() {
        int size = this.f9927k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C2532p pVar = this.f9927k.get(i);
            j = j + ((long) pVar.f9998h.f9943f) + pVar.mo9679j() + ((long) pVar.f9999i.f9943f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9680m() {
        int size = this.f9927k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f9927k.get(i).mo9680m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f9996f == 0 ? "horizontal : " : "vertical : ");
        Iterator<C2532p> it = this.f9927k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
