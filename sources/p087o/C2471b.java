package p087o;

import java.util.ArrayList;
import p069l.C1858d;

/* renamed from: o.b */
public class C2471b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: l.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: l.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: l.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: l.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: l.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [l.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r7 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x025f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x039a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:329:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m10436a(p087o.C2479f r37, p069l.C1858d r38, int r39, int r40, p087o.C2472c r41) {
        /*
            r0 = r37
            r9 = r38
            r10 = r39
            r1 = r41
            o.e r11 = r1.f9505a
            o.e r12 = r1.f9507c
            o.e r13 = r1.f9506b
            o.e r14 = r1.f9508d
            o.e r2 = r1.f9509e
            float r3 = r1.f9515k
            o.e$b[] r4 = r0.f9583Z
            r4 = r4[r10]
            o.e$b r5 = p087o.C2476e.C2478b.WRAP_CONTENT
            r15 = 1
            if (r4 != r5) goto L_0x001f
            r4 = r15
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x0034
            int r7 = r2.f9635z0
            if (r7 != 0) goto L_0x0029
            r8 = r15
            goto L_0x002a
        L_0x0029:
            r8 = 0
        L_0x002a:
            if (r7 != r15) goto L_0x002f
            r16 = r15
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r7 != r5) goto L_0x0046
            goto L_0x0044
        L_0x0034:
            int r7 = r2.f9549A0
            if (r7 != 0) goto L_0x003a
            r8 = r15
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r7 != r15) goto L_0x0040
            r16 = r15
            goto L_0x0042
        L_0x0040:
            r16 = 0
        L_0x0042:
            if (r7 != r5) goto L_0x0046
        L_0x0044:
            r5 = r15
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r17 = r16
            r7 = 0
            r16 = r8
            r8 = r11
        L_0x004d:
            r21 = 0
            if (r7 != 0) goto L_0x012a
            o.d[] r6 = r8.f9580W
            r6 = r6[r40]
            if (r5 == 0) goto L_0x005a
            r19 = 1
            goto L_0x005c
        L_0x005a:
            r19 = 4
        L_0x005c:
            int r23 = r6.mo9449e()
            o.e$b[] r15 = r8.f9583Z
            r15 = r15[r10]
            r25 = r3
            o.e$b r3 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r15 != r3) goto L_0x0074
            int[] r15 = r8.f9632y
            r15 = r15[r10]
            if (r15 != 0) goto L_0x0074
            r26 = r7
            r15 = 1
            goto L_0x0077
        L_0x0074:
            r26 = r7
            r15 = 0
        L_0x0077:
            o.d r7 = r6.f9532f
            if (r7 == 0) goto L_0x0083
            if (r8 == r11) goto L_0x0083
            int r7 = r7.mo9449e()
            int r23 = r23 + r7
        L_0x0083:
            r7 = r23
            if (r5 == 0) goto L_0x0090
            if (r8 == r11) goto L_0x0090
            if (r8 == r13) goto L_0x0090
            r23 = r2
            r19 = 8
            goto L_0x0092
        L_0x0090:
            r23 = r2
        L_0x0092:
            o.d r2 = r6.f9532f
            r27 = r11
            if (r2 == 0) goto L_0x00c9
            if (r8 != r13) goto L_0x00a3
            l.i r11 = r6.f9535i
            l.i r2 = r2.f9535i
            r1 = 6
            r9.mo6399h(r11, r2, r7, r1)
            goto L_0x00ac
        L_0x00a3:
            l.i r1 = r6.f9535i
            l.i r2 = r2.f9535i
            r11 = 8
            r9.mo6399h(r1, r2, r7, r11)
        L_0x00ac:
            if (r15 == 0) goto L_0x00b2
            if (r5 != 0) goto L_0x00b2
            r19 = 5
        L_0x00b2:
            if (r8 != r13) goto L_0x00be
            if (r5 == 0) goto L_0x00be
            boolean r1 = r8.mo9526f0(r10)
            if (r1 == 0) goto L_0x00be
            r1 = 5
            goto L_0x00c0
        L_0x00be:
            r1 = r19
        L_0x00c0:
            l.i r2 = r6.f9535i
            o.d r6 = r6.f9532f
            l.i r6 = r6.f9535i
            r9.mo6396e(r2, r6, r7, r1)
        L_0x00c9:
            if (r4 == 0) goto L_0x00fd
            int r1 = r8.mo9501T()
            r2 = 8
            if (r1 == r2) goto L_0x00eb
            o.e$b[] r1 = r8.f9583Z
            r1 = r1[r10]
            if (r1 != r3) goto L_0x00eb
            o.d[] r1 = r8.f9580W
            int r2 = r40 + 1
            r2 = r1[r2]
            l.i r2 = r2.f9535i
            r1 = r1[r40]
            l.i r1 = r1.f9535i
            r3 = 5
            r6 = 0
            r9.mo6399h(r2, r1, r6, r3)
            goto L_0x00ec
        L_0x00eb:
            r6 = 0
        L_0x00ec:
            o.d[] r1 = r8.f9580W
            r1 = r1[r40]
            l.i r1 = r1.f9535i
            o.d[] r2 = r0.f9580W
            r2 = r2[r40]
            l.i r2 = r2.f9535i
            r3 = 8
            r9.mo6399h(r1, r2, r6, r3)
        L_0x00fd:
            o.d[] r1 = r8.f9580W
            int r2 = r40 + 1
            r1 = r1[r2]
            o.d r1 = r1.f9532f
            if (r1 == 0) goto L_0x0118
            o.e r1 = r1.f9530d
            o.d[] r2 = r1.f9580W
            r2 = r2[r40]
            o.d r2 = r2.f9532f
            if (r2 == 0) goto L_0x0118
            o.e r2 = r2.f9530d
            if (r2 == r8) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r21 = r1
        L_0x0118:
            if (r21 == 0) goto L_0x011f
            r8 = r21
            r7 = r26
            goto L_0x0120
        L_0x011f:
            r7 = 1
        L_0x0120:
            r1 = r41
            r2 = r23
            r3 = r25
            r11 = r27
            goto L_0x004d
        L_0x012a:
            r23 = r2
            r25 = r3
            r27 = r11
            if (r14 == 0) goto L_0x0193
            o.d[] r1 = r12.f9580W
            int r2 = r40 + 1
            r1 = r1[r2]
            o.d r1 = r1.f9532f
            if (r1 == 0) goto L_0x0193
            o.d[] r1 = r14.f9580W
            r1 = r1[r2]
            o.e$b[] r3 = r14.f9583Z
            r3 = r3[r10]
            o.e$b r6 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x0150
            int[] r3 = r14.f9632y
            r3 = r3[r10]
            if (r3 != 0) goto L_0x0150
            r3 = 1
            goto L_0x0151
        L_0x0150:
            r3 = 0
        L_0x0151:
            if (r3 == 0) goto L_0x0169
            if (r5 != 0) goto L_0x0169
            o.d r3 = r1.f9532f
            o.e r6 = r3.f9530d
            if (r6 != r0) goto L_0x0169
            l.i r6 = r1.f9535i
            l.i r3 = r3.f9535i
            int r7 = r1.mo9449e()
            int r7 = -r7
            r8 = 5
            r9.mo6396e(r6, r3, r7, r8)
            goto L_0x017f
        L_0x0169:
            r8 = 5
            if (r5 == 0) goto L_0x017f
            o.d r3 = r1.f9532f
            o.e r6 = r3.f9530d
            if (r6 != r0) goto L_0x017f
            l.i r6 = r1.f9535i
            l.i r3 = r3.f9535i
            int r7 = r1.mo9449e()
            int r7 = -r7
            r11 = 4
            r9.mo6396e(r6, r3, r7, r11)
        L_0x017f:
            l.i r3 = r1.f9535i
            o.d[] r6 = r12.f9580W
            r2 = r6[r2]
            o.d r2 = r2.f9532f
            l.i r2 = r2.f9535i
            int r1 = r1.mo9449e()
            int r1 = -r1
            r6 = 6
            r9.mo6401j(r3, r2, r1, r6)
            goto L_0x0194
        L_0x0193:
            r8 = 5
        L_0x0194:
            if (r4 == 0) goto L_0x01ad
            o.d[] r0 = r0.f9580W
            int r1 = r40 + 1
            r0 = r0[r1]
            l.i r0 = r0.f9535i
            o.d[] r2 = r12.f9580W
            r1 = r2[r1]
            l.i r2 = r1.f9535i
            int r1 = r1.mo9449e()
            r3 = 8
            r9.mo6399h(r0, r2, r1, r3)
        L_0x01ad:
            r0 = r41
            java.util.ArrayList<o.e> r1 = r0.f9512h
            if (r1 == 0) goto L_0x025d
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x025d
            boolean r3 = r0.f9522r
            if (r3 == 0) goto L_0x01c6
            boolean r3 = r0.f9524t
            if (r3 != 0) goto L_0x01c6
            int r3 = r0.f9514j
            float r3 = (float) r3
            goto L_0x01c8
        L_0x01c6:
            r3 = r25
        L_0x01c8:
            r4 = 0
            r29 = r4
            r7 = r21
            r6 = 0
        L_0x01ce:
            if (r6 >= r2) goto L_0x025d
            java.lang.Object r11 = r1.get(r6)
            o.e r11 = (p087o.C2476e) r11
            float[] r15 = r11.f9555D0
            r15 = r15[r10]
            int r20 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r20 >= 0) goto L_0x01fa
            boolean r15 = r0.f9524t
            if (r15 == 0) goto L_0x01f5
            o.d[] r11 = r11.f9580W
            int r15 = r40 + 1
            r15 = r11[r15]
            l.i r15 = r15.f9535i
            r11 = r11[r40]
            l.i r11 = r11.f9535i
            r4 = 0
            r8 = 4
            r9.mo6396e(r15, r11, r4, r8)
            r8 = r4
            goto L_0x0211
        L_0x01f5:
            r8 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            goto L_0x01fb
        L_0x01fa:
            r8 = 4
        L_0x01fb:
            int r19 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r19 != 0) goto L_0x0216
            o.d[] r11 = r11.f9580W
            int r15 = r40 + 1
            r15 = r11[r15]
            l.i r15 = r15.f9535i
            r11 = r11[r40]
            l.i r11 = r11.f9535i
            r4 = 8
            r8 = 0
            r9.mo6396e(r15, r11, r8, r4)
        L_0x0211:
            r25 = r1
            r18 = r2
            goto L_0x0253
        L_0x0216:
            r8 = 0
            if (r7 == 0) goto L_0x024c
            o.d[] r4 = r7.f9580W
            r7 = r4[r40]
            l.i r7 = r7.f9535i
            int r18 = r40 + 1
            r4 = r4[r18]
            l.i r4 = r4.f9535i
            o.d[] r8 = r11.f9580W
            r25 = r1
            r1 = r8[r40]
            l.i r1 = r1.f9535i
            r8 = r8[r18]
            l.i r8 = r8.f9535i
            r18 = r2
            l.b r2 = r38.mo6407r()
            r28 = r2
            r30 = r3
            r31 = r15
            r32 = r7
            r33 = r4
            r34 = r1
            r35 = r8
            r28.mo6377l(r29, r30, r31, r32, r33, r34, r35)
            r9.mo6395d(r2)
            goto L_0x0250
        L_0x024c:
            r25 = r1
            r18 = r2
        L_0x0250:
            r7 = r11
            r29 = r15
        L_0x0253:
            int r6 = r6 + 1
            r2 = r18
            r1 = r25
            r4 = 0
            r8 = 5
            goto L_0x01ce
        L_0x025d:
            if (r13 == 0) goto L_0x02b4
            if (r13 == r14) goto L_0x0263
            if (r5 == 0) goto L_0x02b4
        L_0x0263:
            r11 = r27
            o.d[] r0 = r11.f9580W
            r0 = r0[r40]
            o.d[] r1 = r12.f9580W
            int r2 = r40 + 1
            r1 = r1[r2]
            o.d r0 = r0.f9532f
            if (r0 == 0) goto L_0x0277
            l.i r0 = r0.f9535i
            r3 = r0
            goto L_0x0279
        L_0x0277:
            r3 = r21
        L_0x0279:
            o.d r0 = r1.f9532f
            if (r0 == 0) goto L_0x0281
            l.i r0 = r0.f9535i
            r5 = r0
            goto L_0x0283
        L_0x0281:
            r5 = r21
        L_0x0283:
            o.d[] r0 = r13.f9580W
            r0 = r0[r40]
            if (r14 == 0) goto L_0x028d
            o.d[] r1 = r14.f9580W
            r1 = r1[r2]
        L_0x028d:
            if (r3 == 0) goto L_0x04d4
            if (r5 == 0) goto L_0x04d4
            r2 = r23
            if (r10 != 0) goto L_0x0298
            float r2 = r2.f9613o0
            goto L_0x029a
        L_0x0298:
            float r2 = r2.f9615p0
        L_0x029a:
            r4 = r2
            int r6 = r0.mo9449e()
            int r7 = r1.mo9449e()
            l.i r2 = r0.f9535i
            l.i r8 = r1.f9535i
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo6394c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04d4
        L_0x02b4:
            r11 = r27
            if (r16 == 0) goto L_0x039f
            if (r13 == 0) goto L_0x039f
            int r1 = r0.f9514j
            if (r1 <= 0) goto L_0x02c5
            int r0 = r0.f9513i
            if (r0 != r1) goto L_0x02c5
            r24 = 1
            goto L_0x02c7
        L_0x02c5:
            r24 = 0
        L_0x02c7:
            r8 = r13
            r15 = r8
        L_0x02c9:
            if (r15 == 0) goto L_0x04d4
            o.e[] r0 = r15.f9559F0
            r0 = r0[r10]
            r7 = r0
        L_0x02d0:
            if (r7 == 0) goto L_0x02df
            int r0 = r7.mo9501T()
            r6 = 8
            if (r0 != r6) goto L_0x02e1
            o.e[] r0 = r7.f9559F0
            r7 = r0[r10]
            goto L_0x02d0
        L_0x02df:
            r6 = 8
        L_0x02e1:
            if (r7 != 0) goto L_0x02ec
            if (r15 != r14) goto L_0x02e6
            goto L_0x02ec
        L_0x02e6:
            r20 = r7
        L_0x02e8:
            r18 = r8
            goto L_0x038f
        L_0x02ec:
            o.d[] r0 = r15.f9580W
            r0 = r0[r40]
            l.i r1 = r0.f9535i
            o.d r2 = r0.f9532f
            if (r2 == 0) goto L_0x02f9
            l.i r2 = r2.f9535i
            goto L_0x02fb
        L_0x02f9:
            r2 = r21
        L_0x02fb:
            if (r8 == r15) goto L_0x0306
            o.d[] r2 = r8.f9580W
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x0303:
            l.i r2 = r2.f9535i
            goto L_0x0313
        L_0x0306:
            if (r15 != r13) goto L_0x0313
            o.d[] r2 = r11.f9580W
            r2 = r2[r40]
            o.d r2 = r2.f9532f
            if (r2 == 0) goto L_0x0311
            goto L_0x0303
        L_0x0311:
            r2 = r21
        L_0x0313:
            int r0 = r0.mo9449e()
            o.d[] r3 = r15.f9580W
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.mo9449e()
            if (r7 == 0) goto L_0x032c
            o.d[] r5 = r7.f9580W
            r5 = r5[r40]
        L_0x0327:
            l.i r6 = r5.f9535i
            r37 = r7
            goto L_0x0339
        L_0x032c:
            o.d[] r5 = r12.f9580W
            r5 = r5[r4]
            o.d r5 = r5.f9532f
            if (r5 == 0) goto L_0x0335
            goto L_0x0327
        L_0x0335:
            r37 = r7
            r6 = r21
        L_0x0339:
            o.d[] r7 = r15.f9580W
            r7 = r7[r4]
            l.i r7 = r7.f9535i
            if (r5 == 0) goto L_0x0346
            int r5 = r5.mo9449e()
            int r3 = r3 + r5
        L_0x0346:
            o.d[] r5 = r8.f9580W
            r5 = r5[r4]
            int r5 = r5.mo9449e()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x038b
            if (r2 == 0) goto L_0x038b
            if (r6 == 0) goto L_0x038b
            if (r7 == 0) goto L_0x038b
            if (r15 != r13) goto L_0x0361
            o.d[] r0 = r13.f9580W
            r0 = r0[r40]
            int r0 = r0.mo9449e()
        L_0x0361:
            r5 = r0
            if (r15 != r14) goto L_0x036f
            o.d[] r0 = r14.f9580W
            r0 = r0[r4]
            int r0 = r0.mo9449e()
            r18 = r0
            goto L_0x0371
        L_0x036f:
            r18 = r3
        L_0x0371:
            if (r24 == 0) goto L_0x0376
            r19 = 8
            goto L_0x0378
        L_0x0376:
            r19 = 5
        L_0x0378:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r6 = r7
            r20 = r37
            r7 = r18
            r18 = r8
            r8 = r19
            r0.mo6394c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x038f
        L_0x038b:
            r20 = r37
            goto L_0x02e8
        L_0x038f:
            int r0 = r15.mo9501T()
            r8 = 8
            if (r0 == r8) goto L_0x0398
            goto L_0x039a
        L_0x0398:
            r15 = r18
        L_0x039a:
            r8 = r15
            r15 = r20
            goto L_0x02c9
        L_0x039f:
            r8 = 8
            if (r17 == 0) goto L_0x04d4
            if (r13 == 0) goto L_0x04d4
            int r1 = r0.f9514j
            if (r1 <= 0) goto L_0x03b0
            int r0 = r0.f9513i
            if (r0 != r1) goto L_0x03b0
            r24 = 1
            goto L_0x03b2
        L_0x03b0:
            r24 = 0
        L_0x03b2:
            r7 = r13
            r15 = r7
        L_0x03b4:
            if (r15 == 0) goto L_0x0476
            o.e[] r0 = r15.f9559F0
            r0 = r0[r10]
        L_0x03ba:
            if (r0 == 0) goto L_0x03c7
            int r1 = r0.mo9501T()
            if (r1 != r8) goto L_0x03c7
            o.e[] r0 = r0.f9559F0
            r0 = r0[r10]
            goto L_0x03ba
        L_0x03c7:
            if (r15 == r13) goto L_0x0461
            if (r15 == r14) goto L_0x0461
            if (r0 == 0) goto L_0x0461
            if (r0 != r14) goto L_0x03d2
            r6 = r21
            goto L_0x03d3
        L_0x03d2:
            r6 = r0
        L_0x03d3:
            o.d[] r0 = r15.f9580W
            r0 = r0[r40]
            l.i r1 = r0.f9535i
            o.d r2 = r0.f9532f
            if (r2 == 0) goto L_0x03df
            l.i r2 = r2.f9535i
        L_0x03df:
            o.d[] r2 = r7.f9580W
            int r3 = r40 + 1
            r2 = r2[r3]
            l.i r2 = r2.f9535i
            int r0 = r0.mo9449e()
            o.d[] r4 = r15.f9580W
            r4 = r4[r3]
            int r4 = r4.mo9449e()
            if (r6 == 0) goto L_0x040c
            o.d[] r5 = r6.f9580W
            r5 = r5[r40]
            l.i r8 = r5.f9535i
            r37 = r6
            o.d r6 = r5.f9532f
            if (r6 == 0) goto L_0x0404
            l.i r6 = r6.f9535i
            goto L_0x0406
        L_0x0404:
            r6 = r21
        L_0x0406:
            r36 = r8
            r8 = r6
            r6 = r36
            goto L_0x041f
        L_0x040c:
            r37 = r6
            o.d[] r5 = r14.f9580W
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0417
            l.i r6 = r5.f9535i
            goto L_0x0419
        L_0x0417:
            r6 = r21
        L_0x0419:
            o.d[] r8 = r15.f9580W
            r8 = r8[r3]
            l.i r8 = r8.f9535i
        L_0x041f:
            if (r5 == 0) goto L_0x0426
            int r5 = r5.mo9449e()
            int r4 = r4 + r5
        L_0x0426:
            r18 = r4
            o.d[] r4 = r7.f9580W
            r3 = r4[r3]
            int r3 = r3.mo9449e()
            int r3 = r3 + r0
            if (r24 == 0) goto L_0x0436
            r20 = 8
            goto L_0x0438
        L_0x0436:
            r20 = 4
        L_0x0438:
            if (r1 == 0) goto L_0x0456
            if (r2 == 0) goto L_0x0456
            if (r6 == 0) goto L_0x0456
            if (r8 == 0) goto L_0x0456
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r19 = r37
            r22 = 4
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r20
            r0.mo6394c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x045e
        L_0x0456:
            r19 = r37
            r23 = r7
            r10 = 8
            r22 = 4
        L_0x045e:
            r0 = r19
            goto L_0x0466
        L_0x0461:
            r23 = r7
            r10 = r8
            r22 = 4
        L_0x0466:
            int r1 = r15.mo9501T()
            if (r1 == r10) goto L_0x046e
            r7 = r15
            goto L_0x0470
        L_0x046e:
            r7 = r23
        L_0x0470:
            r15 = r0
            r8 = r10
            r10 = r39
            goto L_0x03b4
        L_0x0476:
            o.d[] r0 = r13.f9580W
            r0 = r0[r40]
            o.d[] r1 = r11.f9580W
            r1 = r1[r40]
            o.d r1 = r1.f9532f
            o.d[] r2 = r14.f9580W
            int r3 = r40 + 1
            r10 = r2[r3]
            o.d[] r2 = r12.f9580W
            r2 = r2[r3]
            o.d r11 = r2.f9532f
            if (r1 == 0) goto L_0x04c3
            if (r13 == r14) goto L_0x049d
            l.i r2 = r0.f9535i
            l.i r1 = r1.f9535i
            int r0 = r0.mo9449e()
            r15 = 5
            r9.mo6396e(r2, r1, r0, r15)
            goto L_0x04c4
        L_0x049d:
            r15 = 5
            if (r11 == 0) goto L_0x04c4
            l.i r2 = r0.f9535i
            l.i r3 = r1.f9535i
            int r4 = r0.mo9449e()
            r5 = 1056964608(0x3f000000, float:0.5)
            l.i r6 = r10.f9535i
            l.i r7 = r11.f9535i
            int r8 = r10.mo9449e()
            r18 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r18
            r0.mo6394c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04c4
        L_0x04c3:
            r15 = 5
        L_0x04c4:
            if (r11 == 0) goto L_0x04d4
            if (r13 == r14) goto L_0x04d4
            l.i r0 = r10.f9535i
            l.i r1 = r11.f9535i
            int r2 = r10.mo9449e()
            int r2 = -r2
            r9.mo6396e(r0, r1, r2, r15)
        L_0x04d4:
            if (r16 != 0) goto L_0x04d8
            if (r17 == 0) goto L_0x0532
        L_0x04d8:
            if (r13 == 0) goto L_0x0532
            if (r13 == r14) goto L_0x0532
            o.d[] r0 = r13.f9580W
            r1 = r0[r40]
            if (r14 != 0) goto L_0x04e3
            r14 = r13
        L_0x04e3:
            o.d[] r2 = r14.f9580W
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            o.d r4 = r1.f9532f
            if (r4 == 0) goto L_0x04f1
            l.i r4 = r4.f9535i
            goto L_0x04f3
        L_0x04f1:
            r4 = r21
        L_0x04f3:
            o.d r5 = r2.f9532f
            if (r5 == 0) goto L_0x04fa
            l.i r5 = r5.f9535i
            goto L_0x04fc
        L_0x04fa:
            r5 = r21
        L_0x04fc:
            if (r12 == r14) goto L_0x050c
            o.d[] r5 = r12.f9580W
            r5 = r5[r3]
            o.d r5 = r5.f9532f
            if (r5 == 0) goto L_0x050a
            l.i r5 = r5.f9535i
            r21 = r5
        L_0x050a:
            r5 = r21
        L_0x050c:
            if (r13 != r14) goto L_0x0510
            r2 = r0[r3]
        L_0x0510:
            if (r4 == 0) goto L_0x0532
            if (r5 == 0) goto L_0x0532
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.mo9449e()
            o.d[] r0 = r14.f9580W
            r0 = r0[r3]
            int r8 = r0.mo9449e()
            l.i r1 = r1.f9535i
            l.i r10 = r2.f9535i
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.mo6394c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0532:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087o.C2471b.m10436a(o.f, l.d, int, int, o.c):void");
    }

    /* renamed from: b */
    public static void m10437b(C2479f fVar, C1858d dVar, ArrayList<C2476e> arrayList, int i) {
        C2472c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = fVar.f9653W0;
            cVarArr = fVar.f9656Z0;
            i2 = 0;
        } else {
            int i4 = fVar.f9654X0;
            cVarArr = fVar.f9655Y0;
            int i5 = i4;
            i2 = 2;
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            C2472c cVar = cVarArr[i6];
            cVar.mo9444a();
            if (arrayList == null || arrayList.contains(cVar.f9505a)) {
                m10436a(fVar, dVar, i, i2, cVar);
            }
        }
    }
}
