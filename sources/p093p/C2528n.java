package p093p;

import p087o.C2476e;
import p093p.C2518f;

/* renamed from: p.n */
public class C2528n extends C2532p {

    /* renamed from: k */
    public C2518f f9973k;

    /* renamed from: l */
    C2520g f9974l = null;

    /* renamed from: p.n$a */
    static /* synthetic */ class C2529a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9975a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                p.p$b[] r0 = p093p.C2532p.C2534b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9975a = r0
                p.p$b r1 = p093p.C2532p.C2534b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9975a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.p$b r1 = p093p.C2532p.C2534b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9975a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.p$b r1 = p093p.C2532p.C2534b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p093p.C2528n.C2529a.<clinit>():void");
        }
    }

    public C2528n(C2476e eVar) {
        super(eVar);
        C2518f fVar = new C2518f(this);
        this.f9973k = fVar;
        this.f9998h.f9942e = C2518f.C2519a.TOP;
        this.f9999i.f9942e = C2518f.C2519a.BOTTOM;
        fVar.f9942e = C2518f.C2519a.BASELINE;
        this.f9996f = 1;
    }

    /* renamed from: a */
    public void mo9675a(C2516d dVar) {
        int i;
        float f;
        int i2 = C2529a.f9975a[this.f10000j.ordinal()];
        if (i2 == 1) {
            mo9718p(dVar);
        } else if (i2 == 2) {
            mo9717o(dVar);
        } else if (i2 == 3) {
            C2476e eVar = this.f9992b;
            mo9716n(dVar, eVar.f9573P, eVar.f9575R, 1);
            return;
        }
        C2520g gVar = this.f9995e;
        if (gVar.f9940c && !gVar.f9947j && this.f9994d == C2476e.C2478b.MATCH_CONSTRAINT) {
            C2476e eVar2 = this.f9992b;
            int i3 = eVar2.f9630x;
            if (i3 == 2) {
                C2476e I = eVar2.mo9481I();
                if (I != null) {
                    C2520g gVar2 = I.f9594f.f9995e;
                    if (gVar2.f9947j) {
                        i = (int) ((((float) gVar2.f9944g) * this.f9992b.f9556E) + 0.5f);
                    }
                }
            } else if (i3 == 3 && eVar2.f9592e.f9995e.f9947j) {
                int u = eVar2.mo9559u();
                if (u != -1) {
                    if (u == 0) {
                        C2476e eVar3 = this.f9992b;
                        f = ((float) eVar3.f9592e.f9995e.f9944g) * eVar3.mo9557t();
                        i = (int) (f + 0.5f);
                    } else if (u != 1) {
                        i = 0;
                    }
                }
                C2476e eVar4 = this.f9992b;
                f = ((float) eVar4.f9592e.f9995e.f9944g) / eVar4.mo9557t();
                i = (int) (f + 0.5f);
            }
            this.f9995e.mo9693d(i);
        }
        C2518f fVar = this.f9998h;
        if (fVar.f9940c) {
            C2518f fVar2 = this.f9999i;
            if (fVar2.f9940c) {
                if (!fVar.f9947j || !fVar2.f9947j || !this.f9995e.f9947j) {
                    if (!this.f9995e.f9947j && this.f9994d == C2476e.C2478b.MATCH_CONSTRAINT) {
                        C2476e eVar5 = this.f9992b;
                        if (eVar5.f9628w == 0 && !eVar5.mo9532i0()) {
                            int i4 = this.f9998h.f9949l.get(0).f9944g;
                            C2518f fVar3 = this.f9998h;
                            int i5 = i4 + fVar3.f9943f;
                            int i6 = this.f9999i.f9949l.get(0).f9944g + this.f9999i.f9943f;
                            fVar3.mo9693d(i5);
                            this.f9999i.mo9693d(i6);
                            this.f9995e.mo9693d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f9995e.f9947j && this.f9994d == C2476e.C2478b.MATCH_CONSTRAINT && this.f9991a == 1 && this.f9998h.f9949l.size() > 0 && this.f9999i.f9949l.size() > 0) {
                        int i7 = (this.f9999i.f9949l.get(0).f9944g + this.f9999i.f9943f) - (this.f9998h.f9949l.get(0).f9944g + this.f9998h.f9943f);
                        C2520g gVar3 = this.f9995e;
                        int i8 = gVar3.f9959m;
                        if (i7 < i8) {
                            gVar3.mo9693d(i7);
                        } else {
                            gVar3.mo9693d(i8);
                        }
                    }
                    if (this.f9995e.f9947j && this.f9998h.f9949l.size() > 0 && this.f9999i.f9949l.size() > 0) {
                        C2518f fVar4 = this.f9998h.f9949l.get(0);
                        C2518f fVar5 = this.f9999i.f9949l.get(0);
                        int i9 = fVar4.f9944g + this.f9998h.f9943f;
                        int i10 = fVar5.f9944g + this.f9999i.f9943f;
                        float P = this.f9992b.mo9493P();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f9944g;
                            i10 = fVar5.f9944g;
                            P = 0.5f;
                        }
                        this.f9998h.mo9693d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f9995e.f9944g)) * P)));
                        this.f9999i.mo9693d(this.f9998h.f9944g + this.f9995e.f9944g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02dd, code lost:
        if (r10.f9992b.mo9509X() != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0332, code lost:
        if (r0.f9994d == r1) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0362, code lost:
        if (r10.f9992b.mo9509X() != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d7, code lost:
        if (r0.f9994d == r1) goto L_0x03d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9676d() {
        /*
            r10 = this;
            o.e r0 = r10.f9992b
            boolean r1 = r0.f9584a
            if (r1 == 0) goto L_0x000f
            p.g r1 = r10.f9995e
            int r0 = r0.mo9560v()
            r1.mo9693d(r0)
        L_0x000f:
            p.g r0 = r10.f9995e
            boolean r0 = r0.f9947j
            if (r0 != 0) goto L_0x0097
            o.e r0 = r10.f9992b
            o.e$b r0 = r0.mo9497R()
            r10.f9994d = r0
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x002c
            p.a r0 = new p.a
            r0.<init>(r10)
            r10.f9974l = r0
        L_0x002c:
            o.e$b r0 = r10.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            o.e r0 = r10.f9992b
            o.e r0 = r0.mo9481I()
            if (r0 == 0) goto L_0x0085
            o.e$b r1 = r0.mo9497R()
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.mo9560v()
            o.e r2 = r10.f9992b
            o.d r2 = r2.f9573P
            int r2 = r2.mo9449e()
            int r1 = r1 - r2
            o.e r2 = r10.f9992b
            o.d r2 = r2.f9575R
            int r2 = r2.mo9449e()
            int r1 = r1 - r2
            p.f r2 = r10.f9998h
            p.n r3 = r0.f9594f
            p.f r3 = r3.f9998h
            o.e r4 = r10.f9992b
            o.d r4 = r4.f9573P
            int r4 = r4.mo9449e()
            r10.mo9710b(r2, r3, r4)
            p.f r2 = r10.f9999i
            p.n r0 = r0.f9594f
            p.f r0 = r0.f9999i
            o.e r3 = r10.f9992b
            o.d r3 = r3.f9575R
            int r3 = r3.mo9449e()
            int r3 = -r3
            r10.mo9710b(r2, r0, r3)
            p.g r0 = r10.f9995e
            r0.mo9693d(r1)
            return
        L_0x0085:
            o.e$b r0 = r10.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.FIXED
            if (r0 != r1) goto L_0x00d1
            p.g r0 = r10.f9995e
            o.e r1 = r10.f9992b
            int r1 = r1.mo9560v()
            r0.mo9693d(r1)
            goto L_0x00d1
        L_0x0097:
            o.e$b r0 = r10.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            o.e r0 = r10.f9992b
            o.e r0 = r0.mo9481I()
            if (r0 == 0) goto L_0x00d1
            o.e$b r1 = r0.mo9497R()
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            if (r1 != r2) goto L_0x00d1
            p.f r1 = r10.f9998h
            p.n r2 = r0.f9594f
            p.f r2 = r2.f9998h
            o.e r3 = r10.f9992b
            o.d r3 = r3.f9573P
            int r3 = r3.mo9449e()
            r10.mo9710b(r1, r2, r3)
            p.f r1 = r10.f9999i
            p.n r0 = r0.f9594f
            p.f r0 = r0.f9999i
            o.e r2 = r10.f9992b
            o.d r2 = r2.f9575R
            int r2 = r2.mo9449e()
            int r2 = -r2
            r10.mo9710b(r1, r0, r2)
            return
        L_0x00d1:
            p.g r0 = r10.f9995e
            boolean r1 = r0.f9947j
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            if (r1 == 0) goto L_0x022f
            o.e r7 = r10.f9992b
            boolean r8 = r7.f9584a
            if (r8 == 0) goto L_0x022f
            o.d[] r0 = r7.f9580W
            r1 = r0[r4]
            o.d r8 = r1.f9532f
            if (r8 == 0) goto L_0x016a
            r9 = r0[r6]
            o.d r9 = r9.f9532f
            if (r9 == 0) goto L_0x016a
            boolean r0 = r7.mo9532i0()
            if (r0 == 0) goto L_0x0114
            p.f r0 = r10.f9998h
            o.e r1 = r10.f9992b
            o.d[] r1 = r1.f9580W
            r1 = r1[r4]
            int r1 = r1.mo9449e()
            r0.f9943f = r1
            p.f r0 = r10.f9999i
            o.e r1 = r10.f9992b
            o.d[] r1 = r1.f9580W
            r1 = r1[r6]
            int r1 = r1.mo9449e()
            int r1 = -r1
            r0.f9943f = r1
            goto L_0x0153
        L_0x0114:
            o.e r0 = r10.f9992b
            o.d[] r0 = r0.f9580W
            r0 = r0[r4]
            p.f r0 = r10.mo9713h(r0)
            if (r0 == 0) goto L_0x012f
            p.f r1 = r10.f9998h
            o.e r2 = r10.f9992b
            o.d[] r2 = r2.f9580W
            r2 = r2[r4]
            int r2 = r2.mo9449e()
            r10.mo9710b(r1, r0, r2)
        L_0x012f:
            o.e r0 = r10.f9992b
            o.d[] r0 = r0.f9580W
            r0 = r0[r6]
            p.f r0 = r10.mo9713h(r0)
            if (r0 == 0) goto L_0x014b
            p.f r1 = r10.f9999i
            o.e r2 = r10.f9992b
            o.d[] r2 = r2.f9580W
            r2 = r2[r6]
            int r2 = r2.mo9449e()
            int r2 = -r2
            r10.mo9710b(r1, r0, r2)
        L_0x014b:
            p.f r0 = r10.f9998h
            r0.f9939b = r5
            p.f r0 = r10.f9999i
            r0.f9939b = r5
        L_0x0153:
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x0401
        L_0x015b:
            p.f r0 = r10.f9973k
            p.f r1 = r10.f9998h
            o.e r2 = r10.f9992b
            int r2 = r2.mo9544n()
        L_0x0165:
            r10.mo9710b(r0, r1, r2)
            goto L_0x0401
        L_0x016a:
            if (r8 == 0) goto L_0x0195
            p.f r0 = r10.mo9713h(r1)
            if (r0 == 0) goto L_0x0401
            p.f r1 = r10.f9998h
            o.e r2 = r10.f9992b
            o.d[] r2 = r2.f9580W
            r2 = r2[r4]
            int r2 = r2.mo9449e()
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9999i
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9995e
            int r2 = r2.f9944g
            r10.mo9710b(r0, r1, r2)
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x0195:
            r1 = r0[r6]
            o.d r4 = r1.f9532f
            if (r4 == 0) goto L_0x01c6
            p.f r0 = r10.mo9713h(r1)
            if (r0 == 0) goto L_0x01bd
            p.f r1 = r10.f9999i
            o.e r2 = r10.f9992b
            o.d[] r2 = r2.f9580W
            r2 = r2[r6]
            int r2 = r2.mo9449e()
            int r2 = -r2
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9998h
            p.f r1 = r10.f9999i
            p.g r2 = r10.f9995e
            int r2 = r2.f9944g
            int r2 = -r2
            r10.mo9710b(r0, r1, r2)
        L_0x01bd:
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x01c6:
            r0 = r0[r3]
            o.d r1 = r0.f9532f
            if (r1 == 0) goto L_0x01ef
            p.f r0 = r10.mo9713h(r0)
            if (r0 == 0) goto L_0x0401
            p.f r1 = r10.f9973k
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9998h
            p.f r1 = r10.f9973k
            o.e r2 = r10.f9992b
            int r2 = r2.mo9544n()
            int r2 = -r2
            r10.mo9710b(r0, r1, r2)
            p.f r0 = r10.f9999i
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9995e
            int r2 = r2.f9944g
            goto L_0x0165
        L_0x01ef:
            boolean r0 = r7 instanceof p087o.C2482h
            if (r0 != 0) goto L_0x0401
            o.e r0 = r7.mo9481I()
            if (r0 == 0) goto L_0x0401
            o.e r0 = r10.f9992b
            o.d$b r1 = p087o.C2473d.C2475b.CENTER
            o.d r0 = r0.mo9542m(r1)
            o.d r0 = r0.f9532f
            if (r0 != 0) goto L_0x0401
            o.e r0 = r10.f9992b
            o.e r0 = r0.mo9481I()
            p.n r0 = r0.f9594f
            p.f r0 = r0.f9998h
            p.f r1 = r10.f9998h
            o.e r2 = r10.f9992b
            int r2 = r2.mo9507W()
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9999i
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9995e
            int r2 = r2.f9944g
            r10.mo9710b(r0, r1, r2)
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x022f:
            if (r1 != 0) goto L_0x027e
            o.e$b r1 = r10.f9994d
            o.e$b r7 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x027e
            o.e r0 = r10.f9992b
            int r1 = r0.f9630x
            if (r1 == r4) goto L_0x0250
            if (r1 == r6) goto L_0x0240
            goto L_0x0281
        L_0x0240:
            boolean r0 = r0.mo9532i0()
            if (r0 != 0) goto L_0x0281
            o.e r0 = r10.f9992b
            int r1 = r0.f9628w
            if (r1 != r6) goto L_0x024d
            goto L_0x0281
        L_0x024d:
            p.l r0 = r0.f9592e
            goto L_0x0259
        L_0x0250:
            o.e r0 = r0.mo9481I()
            if (r0 != 0) goto L_0x0257
            goto L_0x0281
        L_0x0257:
            p.n r0 = r0.f9594f
        L_0x0259:
            p.g r0 = r0.f9995e
            p.g r1 = r10.f9995e
            java.util.List<p.f> r1 = r1.f9949l
            r1.add(r0)
            java.util.List<p.d> r0 = r0.f9948k
            p.g r1 = r10.f9995e
            r0.add(r1)
            p.g r0 = r10.f9995e
            r0.f9939b = r5
            java.util.List<p.d> r0 = r0.f9948k
            p.f r1 = r10.f9998h
            r0.add(r1)
            p.g r0 = r10.f9995e
            java.util.List<p.d> r0 = r0.f9948k
            p.f r1 = r10.f9999i
            r0.add(r1)
            goto L_0x0281
        L_0x027e:
            r0.mo9691b(r10)
        L_0x0281:
            o.e r0 = r10.f9992b
            o.d[] r1 = r0.f9580W
            r7 = r1[r4]
            o.d r8 = r7.f9532f
            if (r8 == 0) goto L_0x02ea
            r9 = r1[r6]
            o.d r9 = r9.f9532f
            if (r9 == 0) goto L_0x02ea
            boolean r0 = r0.mo9532i0()
            if (r0 == 0) goto L_0x02b5
            p.f r0 = r10.f9998h
            o.e r1 = r10.f9992b
            o.d[] r1 = r1.f9580W
            r1 = r1[r4]
            int r1 = r1.mo9449e()
            r0.f9943f = r1
            p.f r0 = r10.f9999i
            o.e r1 = r10.f9992b
            o.d[] r1 = r1.f9580W
            r1 = r1[r6]
            int r1 = r1.mo9449e()
            int r1 = -r1
            r0.f9943f = r1
            goto L_0x02d7
        L_0x02b5:
            o.e r0 = r10.f9992b
            o.d[] r0 = r0.f9580W
            r0 = r0[r4]
            p.f r0 = r10.mo9713h(r0)
            o.e r1 = r10.f9992b
            o.d[] r1 = r1.f9580W
            r1 = r1[r6]
            p.f r1 = r10.mo9713h(r1)
            if (r0 == 0) goto L_0x02ce
            r0.mo9691b(r10)
        L_0x02ce:
            if (r1 == 0) goto L_0x02d3
            r1.mo9691b(r10)
        L_0x02d3:
            p.p$b r0 = p093p.C2532p.C2534b.CENTER
            r10.f10000j = r0
        L_0x02d7:
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x03f3
        L_0x02df:
            p.f r0 = r10.f9973k
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9974l
        L_0x02e5:
            r10.mo9711c(r0, r1, r5, r2)
            goto L_0x03f3
        L_0x02ea:
            r9 = 0
            if (r8 == 0) goto L_0x0336
            p.f r0 = r10.mo9713h(r7)
            if (r0 == 0) goto L_0x03f3
            p.f r1 = r10.f9998h
            o.e r2 = r10.f9992b
            o.d[] r2 = r2.f9580W
            r2 = r2[r4]
            int r2 = r2.mo9449e()
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9999i
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9995e
            r10.mo9711c(r0, r1, r5, r2)
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x031c
            p.f r0 = r10.f9973k
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9974l
            r10.mo9711c(r0, r1, r5, r2)
        L_0x031c:
            o.e$b r0 = r10.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f3
            o.e r0 = r10.f9992b
            float r0 = r0.mo9557t()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            o.e r0 = r10.f9992b
            p.l r0 = r0.f9592e
            o.e$b r2 = r0.f9994d
            if (r2 != r1) goto L_0x03f3
            goto L_0x03d9
        L_0x0336:
            r4 = r1[r6]
            o.d r7 = r4.f9532f
            r8 = -1
            if (r7 == 0) goto L_0x0366
            p.f r0 = r10.mo9713h(r4)
            if (r0 == 0) goto L_0x03f3
            p.f r1 = r10.f9999i
            o.e r2 = r10.f9992b
            o.d[] r2 = r2.f9580W
            r2 = r2[r6]
            int r2 = r2.mo9449e()
            int r2 = -r2
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9998h
            p.f r1 = r10.f9999i
            p.g r2 = r10.f9995e
            r10.mo9711c(r0, r1, r8, r2)
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x03f3
            goto L_0x02df
        L_0x0366:
            r1 = r1[r3]
            o.d r3 = r1.f9532f
            if (r3 == 0) goto L_0x0388
            p.f r0 = r10.mo9713h(r1)
            if (r0 == 0) goto L_0x03f3
            p.f r1 = r10.f9973k
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9998h
            p.f r1 = r10.f9973k
            p.g r2 = r10.f9974l
            r10.mo9711c(r0, r1, r8, r2)
            p.f r0 = r10.f9999i
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9995e
            goto L_0x02e5
        L_0x0388:
            boolean r1 = r0 instanceof p087o.C2482h
            if (r1 != 0) goto L_0x03f3
            o.e r0 = r0.mo9481I()
            if (r0 == 0) goto L_0x03f3
            o.e r0 = r10.f9992b
            o.e r0 = r0.mo9481I()
            p.n r0 = r0.f9594f
            p.f r0 = r0.f9998h
            p.f r1 = r10.f9998h
            o.e r2 = r10.f9992b
            int r2 = r2.mo9507W()
            r10.mo9710b(r1, r0, r2)
            p.f r0 = r10.f9999i
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9995e
            r10.mo9711c(r0, r1, r5, r2)
            o.e r0 = r10.f9992b
            boolean r0 = r0.mo9509X()
            if (r0 == 0) goto L_0x03c1
            p.f r0 = r10.f9973k
            p.f r1 = r10.f9998h
            p.g r2 = r10.f9974l
            r10.mo9711c(r0, r1, r5, r2)
        L_0x03c1:
            o.e$b r0 = r10.f9994d
            o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f3
            o.e r0 = r10.f9992b
            float r0 = r0.mo9557t()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            o.e r0 = r10.f9992b
            p.l r0 = r0.f9592e
            o.e$b r2 = r0.f9994d
            if (r2 != r1) goto L_0x03f3
        L_0x03d9:
            p.g r0 = r0.f9995e
            java.util.List<p.d> r0 = r0.f9948k
            p.g r1 = r10.f9995e
            r0.add(r1)
            p.g r0 = r10.f9995e
            java.util.List<p.f> r0 = r0.f9949l
            o.e r1 = r10.f9992b
            p.l r1 = r1.f9592e
            p.g r1 = r1.f9995e
            r0.add(r1)
            p.g r0 = r10.f9995e
            r0.f9938a = r10
        L_0x03f3:
            p.g r0 = r10.f9995e
            java.util.List<p.f> r0 = r0.f9949l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0401
            p.g r0 = r10.f9995e
            r0.f9940c = r5
        L_0x0401:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C2528n.mo9676d():void");
    }

    /* renamed from: e */
    public void mo9677e() {
        C2518f fVar = this.f9998h;
        if (fVar.f9947j) {
            this.f9992b.mo9539k1(fVar.f9944g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9678f() {
        this.f9993c = null;
        this.f9998h.mo9692c();
        this.f9999i.mo9692c();
        this.f9973k.mo9692c();
        this.f9995e.mo9692c();
        this.f9997g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9680m() {
        return this.f9994d != C2476e.C2478b.MATCH_CONSTRAINT || this.f9992b.f9630x == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo9699q() {
        this.f9997g = false;
        this.f9998h.mo9692c();
        this.f9998h.f9947j = false;
        this.f9999i.mo9692c();
        this.f9999i.f9947j = false;
        this.f9973k.mo9692c();
        this.f9973k.f9947j = false;
        this.f9995e.f9947j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f9992b.mo9553r();
    }
}
