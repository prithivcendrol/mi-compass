package p093p;

import java.util.List;
import p087o.C2473d;
import p087o.C2476e;
import p087o.C2482h;
import p093p.C2518f;
import p093p.C2532p;

/* renamed from: p.l */
public class C2525l extends C2532p {

    /* renamed from: k */
    private static int[] f9963k = new int[2];

    /* renamed from: p.l$a */
    static /* synthetic */ class C2526a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9964a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                p.p$b[] r0 = p093p.C2532p.C2534b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9964a = r0
                p.p$b r1 = p093p.C2532p.C2534b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9964a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.p$b r1 = p093p.C2532p.C2534b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9964a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.p$b r1 = p093p.C2532p.C2534b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p093p.C2525l.C2526a.<clinit>():void");
        }
    }

    public C2525l(C2476e eVar) {
        super(eVar);
        this.f9998h.f9942e = C2518f.C2519a.LEFT;
        this.f9999i.f9942e = C2518f.C2519a.RIGHT;
        this.f9996f = 0;
    }

    /* renamed from: q */
    private void m10729q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0296, code lost:
        if (r14 != 1) goto L_0x02e8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9675a(p093p.C2516d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p093p.C2525l.C2526a.f9964a
            p.p$b r1 = r8.f10000j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            o.e r0 = r8.f9992b
            o.d r1 = r0.f9572O
            o.d r0 = r0.f9574Q
            r3 = r17
            r8.mo9716n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo9717o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo9718p(r17)
        L_0x002e:
            p.g r0 = r8.f9995e
            boolean r0 = r0.f9947j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02e8
            o.e$b r0 = r8.f9994d
            o.e$b r3 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02e8
            o.e r0 = r8.f9992b
            int r3 = r0.f9628w
            if (r3 == r1) goto L_0x02ce
            if (r3 == r2) goto L_0x0046
            goto L_0x02e8
        L_0x0046:
            int r1 = r0.f9630x
            r3 = -1
            if (r1 == 0) goto L_0x0080
            if (r1 != r2) goto L_0x004e
            goto L_0x0080
        L_0x004e:
            int r0 = r0.mo9559u()
            if (r0 == r3) goto L_0x0069
            if (r0 == 0) goto L_0x005a
            if (r0 == r9) goto L_0x0069
            r0 = r10
            goto L_0x0079
        L_0x005a:
            o.e r0 = r8.f9992b
            p.n r1 = r0.f9594f
            p.g r1 = r1.f9995e
            int r1 = r1.f9944g
            float r1 = (float) r1
            float r0 = r0.mo9557t()
            float r1 = r1 / r0
            goto L_0x0077
        L_0x0069:
            o.e r0 = r8.f9992b
            p.n r1 = r0.f9594f
            p.g r1 = r1.f9995e
            int r1 = r1.f9944g
            float r1 = (float) r1
            float r0 = r0.mo9557t()
            float r1 = r1 * r0
        L_0x0077:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0079:
            p.g r1 = r8.f9995e
            r1.mo9693d(r0)
            goto L_0x02e8
        L_0x0080:
            p.n r1 = r0.f9594f
            p.f r12 = r1.f9998h
            p.f r13 = r1.f9999i
            o.d r1 = r0.f9572O
            o.d r1 = r1.f9532f
            if (r1 == 0) goto L_0x008e
            r1 = r9
            goto L_0x008f
        L_0x008e:
            r1 = r10
        L_0x008f:
            o.d r2 = r0.f9573P
            o.d r2 = r2.f9532f
            if (r2 == 0) goto L_0x0097
            r2 = r9
            goto L_0x0098
        L_0x0097:
            r2 = r10
        L_0x0098:
            o.d r4 = r0.f9574Q
            o.d r4 = r4.f9532f
            if (r4 == 0) goto L_0x00a0
            r4 = r9
            goto L_0x00a1
        L_0x00a0:
            r4 = r10
        L_0x00a1:
            o.d r5 = r0.f9575R
            o.d r5 = r5.f9532f
            if (r5 == 0) goto L_0x00a9
            r5 = r9
            goto L_0x00aa
        L_0x00a9:
            r5 = r10
        L_0x00aa:
            int r14 = r0.mo9559u()
            if (r1 == 0) goto L_0x01ee
            if (r2 == 0) goto L_0x01ee
            if (r4 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x01ee
            o.e r0 = r8.f9992b
            float r15 = r0.mo9557t()
            boolean r0 = r12.f9947j
            if (r0 == 0) goto L_0x011f
            boolean r0 = r13.f9947j
            if (r0 == 0) goto L_0x011f
            p.f r0 = r8.f9998h
            boolean r1 = r0.f9940c
            if (r1 == 0) goto L_0x011e
            p.f r1 = r8.f9999i
            boolean r1 = r1.f9940c
            if (r1 != 0) goto L_0x00d1
            goto L_0x011e
        L_0x00d1:
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            p.f r1 = r8.f9998h
            int r1 = r1.f9943f
            int r2 = r0 + r1
            p.f r0 = r8.f9999i
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            p.f r1 = r8.f9999i
            int r1 = r1.f9943f
            int r3 = r0 - r1
            int r0 = r12.f9944g
            int r1 = r12.f9943f
            int r4 = r0 + r1
            int r0 = r13.f9944g
            int r1 = r13.f9943f
            int r5 = r0 - r1
            int[] r1 = f9963k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m10729q(r1, r2, r3, r4, r5, r6, r7)
            p.g r0 = r8.f9995e
            int[] r1 = f9963k
            r1 = r1[r10]
            r0.mo9693d(r1)
            o.e r0 = r8.f9992b
            p.n r0 = r0.f9594f
            p.g r0 = r0.f9995e
            int[] r1 = f9963k
            r1 = r1[r9]
            r0.mo9693d(r1)
        L_0x011e:
            return
        L_0x011f:
            p.f r0 = r8.f9998h
            boolean r1 = r0.f9947j
            if (r1 == 0) goto L_0x017c
            p.f r1 = r8.f9999i
            boolean r2 = r1.f9947j
            if (r2 == 0) goto L_0x017c
            boolean r2 = r12.f9940c
            if (r2 == 0) goto L_0x017b
            boolean r2 = r13.f9940c
            if (r2 != 0) goto L_0x0134
            goto L_0x017b
        L_0x0134:
            int r2 = r0.f9944g
            int r0 = r0.f9943f
            int r2 = r2 + r0
            int r0 = r1.f9944g
            int r1 = r1.f9943f
            int r3 = r0 - r1
            java.util.List<p.f> r0 = r12.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            int r1 = r12.f9943f
            int r4 = r0 + r1
            java.util.List<p.f> r0 = r13.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            int r1 = r13.f9943f
            int r5 = r0 - r1
            int[] r1 = f9963k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m10729q(r1, r2, r3, r4, r5, r6, r7)
            p.g r0 = r8.f9995e
            int[] r1 = f9963k
            r1 = r1[r10]
            r0.mo9693d(r1)
            o.e r0 = r8.f9992b
            p.n r0 = r0.f9594f
            p.g r0 = r0.f9995e
            int[] r1 = f9963k
            r1 = r1[r9]
            r0.mo9693d(r1)
            goto L_0x017c
        L_0x017b:
            return
        L_0x017c:
            p.f r0 = r8.f9998h
            boolean r1 = r0.f9940c
            if (r1 == 0) goto L_0x01ed
            p.f r1 = r8.f9999i
            boolean r1 = r1.f9940c
            if (r1 == 0) goto L_0x01ed
            boolean r1 = r12.f9940c
            if (r1 == 0) goto L_0x01ed
            boolean r1 = r13.f9940c
            if (r1 != 0) goto L_0x0191
            goto L_0x01ed
        L_0x0191:
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            p.f r1 = r8.f9998h
            int r1 = r1.f9943f
            int r2 = r0 + r1
            p.f r0 = r8.f9999i
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            p.f r1 = r8.f9999i
            int r1 = r1.f9943f
            int r3 = r0 - r1
            java.util.List<p.f> r0 = r12.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            int r1 = r12.f9943f
            int r4 = r0 + r1
            java.util.List<p.f> r0 = r13.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            int r0 = r0.f9944g
            int r1 = r13.f9943f
            int r5 = r0 - r1
            int[] r1 = f9963k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m10729q(r1, r2, r3, r4, r5, r6, r7)
            p.g r0 = r8.f9995e
            int[] r1 = f9963k
            r1 = r1[r10]
            r0.mo9693d(r1)
            o.e r0 = r8.f9992b
            p.n r0 = r0.f9594f
            p.g r0 = r0.f9995e
            int[] r1 = f9963k
            r1 = r1[r9]
            goto L_0x02c9
        L_0x01ed:
            return
        L_0x01ee:
            if (r1 == 0) goto L_0x0265
            if (r4 == 0) goto L_0x0265
            p.f r0 = r8.f9998h
            boolean r0 = r0.f9940c
            if (r0 == 0) goto L_0x0264
            p.f r0 = r8.f9999i
            boolean r0 = r0.f9940c
            if (r0 != 0) goto L_0x01ff
            goto L_0x0264
        L_0x01ff:
            o.e r0 = r8.f9992b
            float r0 = r0.mo9557t()
            p.f r1 = r8.f9998h
            java.util.List<p.f> r1 = r1.f9949l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p093p.C2518f) r1
            int r1 = r1.f9944g
            p.f r2 = r8.f9998h
            int r2 = r2.f9943f
            int r1 = r1 + r2
            p.f r2 = r8.f9999i
            java.util.List<p.f> r2 = r2.f9949l
            java.lang.Object r2 = r2.get(r10)
            p.f r2 = (p093p.C2518f) r2
            int r2 = r2.f9944g
            p.f r4 = r8.f9999i
            int r4 = r4.f9943f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0241
            if (r14 == 0) goto L_0x0241
            if (r14 == r9) goto L_0x022f
            goto L_0x02e8
        L_0x022f:
            int r2 = r2 - r1
            int r1 = r8.mo9712g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo9712g(r2, r9)
            if (r2 == r3) goto L_0x0254
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x0252
        L_0x0241:
            int r2 = r2 - r1
            int r1 = r8.mo9712g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo9712g(r2, r9)
            if (r2 == r3) goto L_0x0254
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x0252:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0254:
            p.g r0 = r8.f9995e
            r0.mo9693d(r1)
            o.e r0 = r8.f9992b
            p.n r0 = r0.f9594f
            p.g r0 = r0.f9995e
            r0.mo9693d(r3)
            goto L_0x02e8
        L_0x0264:
            return
        L_0x0265:
            if (r2 == 0) goto L_0x02e8
            if (r5 == 0) goto L_0x02e8
            boolean r0 = r12.f9940c
            if (r0 == 0) goto L_0x02cd
            boolean r0 = r13.f9940c
            if (r0 != 0) goto L_0x0272
            goto L_0x02cd
        L_0x0272:
            o.e r0 = r8.f9992b
            float r0 = r0.mo9557t()
            java.util.List<p.f> r1 = r12.f9949l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p093p.C2518f) r1
            int r1 = r1.f9944g
            int r2 = r12.f9943f
            int r1 = r1 + r2
            java.util.List<p.f> r2 = r13.f9949l
            java.lang.Object r2 = r2.get(r10)
            p.f r2 = (p093p.C2518f) r2
            int r2 = r2.f9944g
            int r4 = r13.f9943f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02ab
            if (r14 == 0) goto L_0x0299
            if (r14 == r9) goto L_0x02ab
            goto L_0x02e8
        L_0x0299:
            int r2 = r2 - r1
            int r1 = r8.mo9712g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo9712g(r2, r10)
            if (r2 == r3) goto L_0x02be
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02bc
        L_0x02ab:
            int r2 = r2 - r1
            int r1 = r8.mo9712g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo9712g(r2, r10)
            if (r2 == r3) goto L_0x02be
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02bc:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02be:
            p.g r0 = r8.f9995e
            r0.mo9693d(r3)
            o.e r0 = r8.f9992b
            p.n r0 = r0.f9594f
            p.g r0 = r0.f9995e
        L_0x02c9:
            r0.mo9693d(r1)
            goto L_0x02e8
        L_0x02cd:
            return
        L_0x02ce:
            o.e r0 = r0.mo9481I()
            if (r0 == 0) goto L_0x02e8
            p.l r0 = r0.f9592e
            p.g r0 = r0.f9995e
            boolean r1 = r0.f9947j
            if (r1 == 0) goto L_0x02e8
            o.e r1 = r8.f9992b
            float r1 = r1.f9550B
            int r0 = r0.f9944g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            goto L_0x0079
        L_0x02e8:
            p.f r0 = r8.f9998h
            boolean r1 = r0.f9940c
            if (r1 == 0) goto L_0x0408
            p.f r1 = r8.f9999i
            boolean r2 = r1.f9940c
            if (r2 != 0) goto L_0x02f6
            goto L_0x0408
        L_0x02f6:
            boolean r0 = r0.f9947j
            if (r0 == 0) goto L_0x0305
            boolean r0 = r1.f9947j
            if (r0 == 0) goto L_0x0305
            p.g r0 = r8.f9995e
            boolean r0 = r0.f9947j
            if (r0 == 0) goto L_0x0305
            return
        L_0x0305:
            p.g r0 = r8.f9995e
            boolean r0 = r0.f9947j
            if (r0 != 0) goto L_0x034f
            o.e$b r0 = r8.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x034f
            o.e r0 = r8.f9992b
            int r1 = r0.f9628w
            if (r1 != 0) goto L_0x034f
            boolean r0 = r0.mo9528g0()
            if (r0 != 0) goto L_0x034f
            p.f r0 = r8.f9998h
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            p.f r1 = r8.f9999i
            java.util.List<p.f> r1 = r1.f9949l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p093p.C2518f) r1
            int r0 = r0.f9944g
            p.f r2 = r8.f9998h
            int r3 = r2.f9943f
            int r0 = r0 + r3
            int r1 = r1.f9944g
            p.f r3 = r8.f9999i
            int r3 = r3.f9943f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo9693d(r0)
            p.f r0 = r8.f9999i
            r0.mo9693d(r1)
            p.g r0 = r8.f9995e
            r0.mo9693d(r3)
            return
        L_0x034f:
            p.g r0 = r8.f9995e
            boolean r0 = r0.f9947j
            if (r0 != 0) goto L_0x03b3
            o.e$b r0 = r8.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b3
            int r0 = r8.f9991a
            if (r0 != r9) goto L_0x03b3
            p.f r0 = r8.f9998h
            java.util.List<p.f> r0 = r0.f9949l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b3
            p.f r0 = r8.f9999i
            java.util.List<p.f> r0 = r0.f9949l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b3
            p.f r0 = r8.f9998h
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            p.f r1 = r8.f9999i
            java.util.List<p.f> r1 = r1.f9949l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p093p.C2518f) r1
            int r0 = r0.f9944g
            p.f r2 = r8.f9998h
            int r2 = r2.f9943f
            int r0 = r0 + r2
            int r1 = r1.f9944g
            p.f r2 = r8.f9999i
            int r2 = r2.f9943f
            int r1 = r1 + r2
            int r1 = r1 - r0
            p.g r0 = r8.f9995e
            int r0 = r0.f9959m
            int r0 = java.lang.Math.min(r1, r0)
            o.e r1 = r8.f9992b
            int r2 = r1.f9548A
            int r1 = r1.f9634z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ae
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ae:
            p.g r1 = r8.f9995e
            r1.mo9693d(r0)
        L_0x03b3:
            p.g r0 = r8.f9995e
            boolean r0 = r0.f9947j
            if (r0 != 0) goto L_0x03ba
            return
        L_0x03ba:
            p.f r0 = r8.f9998h
            java.util.List<p.f> r0 = r0.f9949l
            java.lang.Object r0 = r0.get(r10)
            p.f r0 = (p093p.C2518f) r0
            p.f r1 = r8.f9999i
            java.util.List<p.f> r1 = r1.f9949l
            java.lang.Object r1 = r1.get(r10)
            p.f r1 = (p093p.C2518f) r1
            int r2 = r0.f9944g
            p.f r3 = r8.f9998h
            int r3 = r3.f9943f
            int r2 = r2 + r3
            int r3 = r1.f9944g
            p.f r4 = r8.f9999i
            int r4 = r4.f9943f
            int r3 = r3 + r4
            o.e r4 = r8.f9992b
            float r4 = r4.mo9561w()
            if (r0 != r1) goto L_0x03e9
            int r2 = r0.f9944g
            int r3 = r1.f9944g
            r4 = r11
        L_0x03e9:
            int r3 = r3 - r2
            p.g r0 = r8.f9995e
            int r0 = r0.f9944g
            int r3 = r3 - r0
            p.f r0 = r8.f9998h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo9693d(r1)
            p.f r0 = r8.f9999i
            p.f r1 = r8.f9998h
            int r1 = r1.f9944g
            p.g r2 = r8.f9995e
            int r2 = r2.f9944g
            int r1 = r1 + r2
            r0.mo9693d(r1)
        L_0x0408:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2525l.mo9675a(p.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9676d() {
        C2473d dVar;
        C2518f fVar;
        int i;
        C2518f fVar2;
        C2518f fVar3;
        Object obj;
        List list;
        C2518f fVar4;
        int i2;
        C2518f fVar5;
        C2518f fVar6;
        int i3;
        C2518f fVar7;
        C2518f fVar8;
        C2476e I;
        C2476e I2;
        C2476e eVar = this.f9992b;
        if (eVar.f9584a) {
            this.f9995e.mo9693d(eVar.mo9503U());
        }
        if (!this.f9995e.f9947j) {
            C2476e.C2478b y = this.f9992b.mo9564y();
            this.f9994d = y;
            if (y != C2476e.C2478b.MATCH_CONSTRAINT) {
                C2476e.C2478b bVar = C2476e.C2478b.MATCH_PARENT;
                if (y == bVar && (I2 = this.f9992b.mo9481I()) != null && (I2.mo9564y() == C2476e.C2478b.FIXED || I2.mo9564y() == bVar)) {
                    int U = (I2.mo9503U() - this.f9992b.f9572O.mo9449e()) - this.f9992b.f9574Q.mo9449e();
                    mo9710b(this.f9998h, I2.f9592e.f9998h, this.f9992b.f9572O.mo9449e());
                    mo9710b(this.f9999i, I2.f9592e.f9999i, -this.f9992b.f9574Q.mo9449e());
                    this.f9995e.mo9693d(U);
                    return;
                } else if (this.f9994d == C2476e.C2478b.FIXED) {
                    this.f9995e.mo9693d(this.f9992b.mo9503U());
                }
            }
        } else {
            C2476e.C2478b bVar2 = this.f9994d;
            C2476e.C2478b bVar3 = C2476e.C2478b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f9992b.mo9481I()) != null && (I.mo9564y() == C2476e.C2478b.FIXED || I.mo9564y() == bVar3)) {
                mo9710b(this.f9998h, I.f9592e.f9998h, this.f9992b.f9572O.mo9449e());
                mo9710b(this.f9999i, I.f9592e.f9999i, -this.f9992b.f9574Q.mo9449e());
                return;
            }
        }
        C2520g gVar = this.f9995e;
        if (gVar.f9947j) {
            C2476e eVar2 = this.f9992b;
            if (eVar2.f9584a) {
                C2473d[] dVarArr = eVar2.f9580W;
                C2473d dVar2 = dVarArr[0];
                C2473d dVar3 = dVar2.f9532f;
                if (dVar3 == null || dVarArr[1].f9532f == null) {
                    if (dVar3 != null) {
                        fVar8 = mo9713h(dVar2);
                        if (fVar8 != null) {
                            fVar7 = this.f9998h;
                            i3 = this.f9992b.f9580W[0].mo9449e();
                        } else {
                            return;
                        }
                    } else {
                        C2473d dVar4 = dVarArr[1];
                        if (dVar4.f9532f != null) {
                            C2518f h = mo9713h(dVar4);
                            if (h != null) {
                                mo9710b(this.f9999i, h, -this.f9992b.f9580W[1].mo9449e());
                                fVar6 = this.f9998h;
                                fVar5 = this.f9999i;
                                i2 = -this.f9995e.f9944g;
                                mo9710b(fVar6, fVar5, i2);
                                return;
                            }
                            return;
                        } else if (!(eVar2 instanceof C2482h) && eVar2.mo9481I() != null && this.f9992b.mo9542m(C2473d.C2475b.CENTER).f9532f == null) {
                            fVar8 = this.f9992b.mo9481I().f9592e.f9998h;
                            fVar7 = this.f9998h;
                            i3 = this.f9992b.mo9505V();
                        } else {
                            return;
                        }
                    }
                    mo9710b(fVar7, fVar8, i3);
                    fVar6 = this.f9999i;
                    fVar5 = this.f9998h;
                    i2 = this.f9995e.f9944g;
                    mo9710b(fVar6, fVar5, i2);
                    return;
                } else if (eVar2.mo9528g0()) {
                    this.f9998h.f9943f = this.f9992b.f9580W[0].mo9449e();
                    fVar = this.f9999i;
                    dVar = this.f9992b.f9580W[1];
                    fVar.f9943f = -dVar.mo9449e();
                } else {
                    C2518f h2 = mo9713h(this.f9992b.f9580W[0]);
                    if (h2 != null) {
                        mo9710b(this.f9998h, h2, this.f9992b.f9580W[0].mo9449e());
                    }
                    C2518f h3 = mo9713h(this.f9992b.f9580W[1]);
                    if (h3 != null) {
                        mo9710b(this.f9999i, h3, -this.f9992b.f9580W[1].mo9449e());
                    }
                    this.f9998h.f9939b = true;
                    this.f9999i.f9939b = true;
                    return;
                }
            }
        }
        if (this.f9994d == C2476e.C2478b.MATCH_CONSTRAINT) {
            C2476e eVar3 = this.f9992b;
            int i4 = eVar3.f9628w;
            if (i4 == 2) {
                C2476e I3 = eVar3.mo9481I();
                if (I3 != null) {
                    C2520g gVar2 = I3.f9594f.f9995e;
                    this.f9995e.f9949l.add(gVar2);
                    gVar2.f9948k.add(this.f9995e);
                    C2520g gVar3 = this.f9995e;
                    gVar3.f9939b = true;
                    gVar3.f9948k.add(this.f9998h);
                    list = this.f9995e.f9948k;
                    obj = this.f9999i;
                }
            } else if (i4 == 3) {
                if (eVar3.f9630x == 3) {
                    this.f9998h.f9938a = this;
                    this.f9999i.f9938a = this;
                    C2528n nVar = eVar3.f9594f;
                    nVar.f9998h.f9938a = this;
                    nVar.f9999i.f9938a = this;
                    gVar.f9938a = this;
                    if (eVar3.mo9532i0()) {
                        this.f9995e.f9949l.add(this.f9992b.f9594f.f9995e);
                        this.f9992b.f9594f.f9995e.f9948k.add(this.f9995e);
                        C2528n nVar2 = this.f9992b.f9594f;
                        nVar2.f9995e.f9938a = this;
                        this.f9995e.f9949l.add(nVar2.f9998h);
                        this.f9995e.f9949l.add(this.f9992b.f9594f.f9999i);
                        this.f9992b.f9594f.f9998h.f9948k.add(this.f9995e);
                        list = this.f9992b.f9594f.f9999i.f9948k;
                        obj = this.f9995e;
                    } else if (this.f9992b.mo9528g0()) {
                        this.f9992b.f9594f.f9995e.f9949l.add(this.f9995e);
                        list = this.f9995e.f9948k;
                        obj = this.f9992b.f9594f.f9995e;
                    } else {
                        fVar4 = this.f9992b.f9594f.f9995e;
                    }
                } else {
                    C2520g gVar4 = eVar3.f9594f.f9995e;
                    gVar.f9949l.add(gVar4);
                    gVar4.f9948k.add(this.f9995e);
                    this.f9992b.f9594f.f9998h.f9948k.add(this.f9995e);
                    this.f9992b.f9594f.f9999i.f9948k.add(this.f9995e);
                    C2520g gVar5 = this.f9995e;
                    gVar5.f9939b = true;
                    gVar5.f9948k.add(this.f9998h);
                    this.f9995e.f9948k.add(this.f9999i);
                    this.f9998h.f9949l.add(this.f9995e);
                    fVar4 = this.f9999i;
                }
                list = fVar4.f9949l;
                obj = this.f9995e;
            }
            list.add(obj);
        }
        C2476e eVar4 = this.f9992b;
        C2473d[] dVarArr2 = eVar4.f9580W;
        C2473d dVar5 = dVarArr2[0];
        C2473d dVar6 = dVar5.f9532f;
        if (dVar6 == null || dVarArr2[1].f9532f == null) {
            if (dVar6 != null) {
                fVar3 = mo9713h(dVar5);
                if (fVar3 != null) {
                    fVar2 = this.f9998h;
                    i = this.f9992b.f9580W[0].mo9449e();
                } else {
                    return;
                }
            } else {
                C2473d dVar7 = dVarArr2[1];
                if (dVar7.f9532f != null) {
                    C2518f h4 = mo9713h(dVar7);
                    if (h4 != null) {
                        mo9710b(this.f9999i, h4, -this.f9992b.f9580W[1].mo9449e());
                        mo9711c(this.f9998h, this.f9999i, -1, this.f9995e);
                        return;
                    }
                    return;
                } else if (!(eVar4 instanceof C2482h) && eVar4.mo9481I() != null) {
                    fVar3 = this.f9992b.mo9481I().f9592e.f9998h;
                    fVar2 = this.f9998h;
                    i = this.f9992b.mo9505V();
                } else {
                    return;
                }
            }
            mo9710b(fVar2, fVar3, i);
            mo9711c(this.f9999i, this.f9998h, 1, this.f9995e);
        } else if (eVar4.mo9528g0()) {
            this.f9998h.f9943f = this.f9992b.f9580W[0].mo9449e();
            fVar = this.f9999i;
            dVar = this.f9992b.f9580W[1];
            fVar.f9943f = -dVar.mo9449e();
        } else {
            C2518f h5 = mo9713h(this.f9992b.f9580W[0]);
            C2518f h6 = mo9713h(this.f9992b.f9580W[1]);
            if (h5 != null) {
                h5.mo9691b(this);
            }
            if (h6 != null) {
                h6.mo9691b(this);
            }
            this.f10000j = C2532p.C2534b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo9677e() {
        C2518f fVar = this.f9998h;
        if (fVar.f9947j) {
            this.f9992b.mo9536j1(fVar.f9944g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9678f() {
        this.f9993c = null;
        this.f9998h.mo9692c();
        this.f9999i.mo9692c();
        this.f9995e.mo9692c();
        this.f9997g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9680m() {
        return this.f9994d != C2476e.C2478b.MATCH_CONSTRAINT || this.f9992b.f9628w == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo9695r() {
        this.f9997g = false;
        this.f9998h.mo9692c();
        this.f9998h.f9947j = false;
        this.f9999i.mo9692c();
        this.f9999i.f9947j = false;
        this.f9995e.f9947j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f9992b.mo9553r();
    }
}
