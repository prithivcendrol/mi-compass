package p093p;

import p087o.C2473d;
import p087o.C2476e;

/* renamed from: p.p */
public abstract class C2532p implements C2516d {

    /* renamed from: a */
    public int f9991a;

    /* renamed from: b */
    C2476e f9992b;

    /* renamed from: c */
    C2527m f9993c;

    /* renamed from: d */
    protected C2476e.C2478b f9994d;

    /* renamed from: e */
    C2520g f9995e = new C2520g(this);

    /* renamed from: f */
    public int f9996f = 0;

    /* renamed from: g */
    boolean f9997g = false;

    /* renamed from: h */
    public C2518f f9998h = new C2518f(this);

    /* renamed from: i */
    public C2518f f9999i = new C2518f(this);

    /* renamed from: j */
    protected C2534b f10000j = C2534b.NONE;

    /* renamed from: p.p$a */
    static /* synthetic */ class C2533a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10001a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.d$b[] r0 = p087o.C2473d.C2475b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10001a = r0
                o.d$b r1 = p087o.C2473d.C2475b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10001a     // Catch:{ NoSuchFieldError -> 0x001d }
                o.d$b r1 = p087o.C2473d.C2475b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10001a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.d$b r1 = p087o.C2473d.C2475b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10001a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.d$b r1 = p087o.C2473d.C2475b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10001a     // Catch:{ NoSuchFieldError -> 0x003e }
                o.d$b r1 = p087o.C2473d.C2475b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p093p.C2532p.C2533a.<clinit>():void");
        }
    }

    /* renamed from: p.p$b */
    enum C2534b {
        NONE,
        START,
        END,
        CENTER
    }

    public C2532p(C2476e eVar) {
        this.f9992b = eVar;
    }

    /* renamed from: l */
    private void m10756l(int i, int i2) {
        int i3;
        C2520g gVar;
        int i4 = this.f9991a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g = mo9712g(this.f9995e.f9959m, i);
                gVar = this.f9995e;
                i3 = Math.min(g, i2);
                gVar.mo9693d(i3);
            } else if (i4 == 2) {
                C2476e I = this.f9992b.mo9481I();
                if (I != null) {
                    C2520g gVar2 = (i == 0 ? I.f9592e : I.f9594f).f9995e;
                    if (gVar2.f9947j) {
                        C2476e eVar = this.f9992b;
                        i2 = (int) ((((float) gVar2.f9944g) * (i == 0 ? eVar.f9550B : eVar.f9556E)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                C2476e eVar2 = this.f9992b;
                C2532p pVar = eVar2.f9592e;
                C2476e.C2478b bVar = pVar.f9994d;
                C2476e.C2478b bVar2 = C2476e.C2478b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f9991a == 3) {
                    C2528n nVar = eVar2.f9594f;
                    if (nVar.f9994d == bVar2 && nVar.f9991a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    pVar = eVar2.f9594f;
                }
                if (pVar.f9995e.f9947j) {
                    float t = eVar2.mo9557t();
                    this.f9995e.mo9693d(i == 1 ? (int) ((((float) pVar.f9995e.f9944g) / t) + 0.5f) : (int) ((t * ((float) pVar.f9995e.f9944g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f9995e;
        i3 = mo9712g(i2, i);
        gVar.mo9693d(i3);
    }

    /* renamed from: a */
    public void mo9675a(C2516d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9710b(C2518f fVar, C2518f fVar2, int i) {
        fVar.f9949l.add(fVar2);
        fVar.f9943f = i;
        fVar2.f9948k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo9711c(C2518f fVar, C2518f fVar2, int i, C2520g gVar) {
        fVar.f9949l.add(fVar2);
        fVar.f9949l.add(this.f9995e);
        fVar.f9945h = i;
        fVar.f9946i = gVar;
        fVar2.f9948k.add(fVar);
        gVar.f9948k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo9676d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo9677e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo9678f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo9712g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C2476e eVar = this.f9992b;
            int i4 = eVar.f9548A;
            i3 = Math.max(eVar.f9634z, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C2476e eVar2 = this.f9992b;
            int i5 = eVar2.f9554D;
            int max = Math.max(eVar2.f9552C, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C2518f mo9713h(C2473d dVar) {
        C2532p pVar;
        C2532p pVar2;
        C2473d dVar2 = dVar.f9532f;
        if (dVar2 == null) {
            return null;
        }
        C2476e eVar = dVar2.f9530d;
        int i = C2533a.f10001a[dVar2.f9531e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pVar2 = eVar.f9592e;
            } else if (i == 3) {
                pVar = eVar.f9594f;
            } else if (i == 4) {
                return eVar.f9594f.f9973k;
            } else {
                if (i != 5) {
                    return null;
                }
                pVar2 = eVar.f9594f;
            }
            return pVar2.f9999i;
        }
        pVar = eVar.f9592e;
        return pVar.f9998h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C2518f mo9714i(C2473d dVar, int i) {
        C2473d dVar2 = dVar.f9532f;
        if (dVar2 == null) {
            return null;
        }
        C2476e eVar = dVar2.f9530d;
        C2532p pVar = i == 0 ? eVar.f9592e : eVar.f9594f;
        int i2 = C2533a.f10001a[dVar2.f9531e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f9999i;
        }
        return pVar.f9998h;
    }

    /* renamed from: j */
    public long mo9679j() {
        C2520g gVar = this.f9995e;
        if (gVar.f9947j) {
            return (long) gVar.f9944g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo9715k() {
        return this.f9997g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo9680m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo9716n(C2516d dVar, C2473d dVar2, C2473d dVar3, int i) {
        C2518f fVar;
        C2518f h = mo9713h(dVar2);
        C2518f h2 = mo9713h(dVar3);
        if (h.f9947j && h2.f9947j) {
            int e = h.f9944g + dVar2.mo9449e();
            int e2 = h2.f9944g - dVar3.mo9449e();
            int i2 = e2 - e;
            if (!this.f9995e.f9947j && this.f9994d == C2476e.C2478b.MATCH_CONSTRAINT) {
                m10756l(i, i2);
            }
            C2520g gVar = this.f9995e;
            if (gVar.f9947j) {
                if (gVar.f9944g == i2) {
                    this.f9998h.mo9693d(e);
                    fVar = this.f9999i;
                } else {
                    C2476e eVar = this.f9992b;
                    float w = i == 0 ? eVar.mo9561w() : eVar.mo9493P();
                    if (h == h2) {
                        e = h.f9944g;
                        e2 = h2.f9944g;
                        w = 0.5f;
                    }
                    this.f9998h.mo9693d((int) (((float) e) + 0.5f + (((float) ((e2 - e) - this.f9995e.f9944g)) * w)));
                    fVar = this.f9999i;
                    e2 = this.f9998h.f9944g + this.f9995e.f9944g;
                }
                fVar.mo9693d(e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo9717o(C2516d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo9718p(C2516d dVar) {
    }
}
