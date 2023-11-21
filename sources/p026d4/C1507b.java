package p026d4;

/* renamed from: d4.b */
public class C1507b {

    /* renamed from: a */
    private volatile int f6135a;

    /* renamed from: b */
    private volatile int f6136b;
    @Deprecated

    /* renamed from: c */
    private volatile int f6137c;

    /* renamed from: d */
    private int f6138d;

    /* renamed from: e */
    private int f6139e;

    /* renamed from: f */
    private int f6140f;

    /* renamed from: g */
    private int f6141g;

    /* renamed from: d4.b$a */
    public static class C1508a {

        /* renamed from: a */
        public int f6142a;

        /* renamed from: b */
        public int f6143b;

        /* renamed from: c */
        public int f6144c;

        /* renamed from: d */
        public int f6145d;

        /* renamed from: e */
        public int f6146e;

        /* renamed from: f */
        public int f6147f;
        @Deprecated

        /* renamed from: g */
        public int f6148g;
    }

    public C1507b() {
        mo5604m(-1);
        mo5602k(4103);
        mo5601j(0);
        mo5605n(0);
        mo5606o(0);
        mo5600i(0);
        mo5599h(0);
    }

    /* renamed from: a */
    public int mo5591a() {
        return this.f6139e;
    }

    /* renamed from: b */
    public int mo5592b() {
        return this.f6138d;
    }

    @Deprecated
    /* renamed from: c */
    public int mo5593c() {
        return this.f6137c;
    }

    /* renamed from: d */
    public int mo5594d() {
        return this.f6135a;
    }

    /* renamed from: e */
    public int mo5595e() {
        return this.f6136b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1507b)) {
            return false;
        }
        C1507b bVar = (C1507b) obj;
        return this.f6137c == bVar.f6137c && this.f6135a == bVar.f6135a && this.f6138d == bVar.f6138d && this.f6139e == bVar.f6139e;
    }

    /* renamed from: f */
    public int mo5597f() {
        return this.f6141g;
    }

    /* renamed from: g */
    public int mo5598g() {
        return this.f6140f;
    }

    /* renamed from: h */
    public void mo5599h(int i) {
        this.f6139e = i;
    }

    /* renamed from: i */
    public void mo5600i(int i) {
        this.f6138d = i;
    }

    @Deprecated
    /* renamed from: j */
    public void mo5601j(int i) {
        this.f6137c = i;
    }

    /* renamed from: k */
    public void mo5602k(int i) {
        this.f6135a = i;
    }

    /* renamed from: l */
    public void mo5603l(C1507b bVar) {
        if (bVar != null) {
            this.f6136b = bVar.f6136b;
            this.f6135a = bVar.f6135a;
            this.f6140f = bVar.f6140f;
            this.f6141g = bVar.f6141g;
            this.f6138d = bVar.f6138d;
            this.f6139e = bVar.f6139e;
            this.f6137c = bVar.f6137c;
        }
    }

    /* renamed from: m */
    public void mo5604m(int i) {
        this.f6136b = i;
    }

    /* renamed from: n */
    public void mo5605n(int i) {
        this.f6141g = i;
    }

    /* renamed from: o */
    public void mo5606o(int i) {
        this.f6140f = i;
    }

    /* renamed from: p */
    public void mo5607p(C1511e eVar) {
        eVar.f6155a = mo5595e();
        eVar.f6156b = mo5593c();
        eVar.f6157c = mo5594d();
        eVar.f6158d = mo5598g();
        eVar.f6159e = mo5597f();
        eVar.f6160f = mo5592b();
        eVar.f6161g = mo5591a();
    }

    /* renamed from: q */
    public void mo5608q(C1508a aVar) {
        mo5604m(aVar.f6142a);
        mo5602k(aVar.f6143b);
        mo5606o(aVar.f6146e);
        mo5605n(aVar.f6147f);
        mo5600i(aVar.f6144c);
        mo5599h(aVar.f6145d);
        mo5601j(aVar.f6148g);
    }

    public String toString() {
        return "ResponsiveState@" + hashCode() + "( type = " + this.f6136b + ", mode = " + this.f6135a + ", wWidth " + this.f6138d + ", wHeight " + this.f6139e + " )";
    }
}
