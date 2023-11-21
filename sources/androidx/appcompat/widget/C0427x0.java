package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.x0 */
class C0427x0 {

    /* renamed from: a */
    private int f1550a = 0;

    /* renamed from: b */
    private int f1551b = 0;

    /* renamed from: c */
    private int f1552c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1553d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1554e = 0;

    /* renamed from: f */
    private int f1555f = 0;

    /* renamed from: g */
    private boolean f1556g = false;

    /* renamed from: h */
    private boolean f1557h = false;

    C0427x0() {
    }

    /* renamed from: a */
    public int mo2305a() {
        return this.f1556g ? this.f1550a : this.f1551b;
    }

    /* renamed from: b */
    public int mo2306b() {
        return this.f1550a;
    }

    /* renamed from: c */
    public int mo2307c() {
        return this.f1551b;
    }

    /* renamed from: d */
    public int mo2308d() {
        return this.f1556g ? this.f1551b : this.f1550a;
    }

    /* renamed from: e */
    public void mo2309e(int i, int i2) {
        this.f1557h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1554e = i;
            this.f1550a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1555f = i2;
            this.f1551b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2310f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1556g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1556g = r2
            boolean r0 = r1.f1557h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1553d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1554e
        L_0x0016:
            r1.f1550a = r2
            int r2 = r1.f1552c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1552c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1554e
        L_0x0024:
            r1.f1550a = r2
            int r2 = r1.f1553d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1554e
            r1.f1550a = r2
        L_0x002f:
            int r2 = r1.f1555f
        L_0x0031:
            r1.f1551b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0427x0.mo2310f(boolean):void");
    }

    /* renamed from: g */
    public void mo2311g(int i, int i2) {
        this.f1552c = i;
        this.f1553d = i2;
        this.f1557h = true;
        if (this.f1556g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1550a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1551b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1550a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1551b = i2;
        }
    }
}
