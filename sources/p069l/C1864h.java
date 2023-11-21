package p069l;

import java.util.Arrays;
import java.util.Comparator;
import p069l.C1855b;

/* renamed from: l.h */
public class C1864h extends C1855b {

    /* renamed from: g */
    private int f7195g = 128;

    /* renamed from: h */
    private C1867i[] f7196h = new C1867i[128];

    /* renamed from: i */
    private C1867i[] f7197i = new C1867i[128];

    /* renamed from: j */
    private int f7198j = 0;

    /* renamed from: k */
    C1866b f7199k = new C1866b(this);

    /* renamed from: l */
    C1857c f7200l;

    /* renamed from: l.h$a */
    class C1865a implements Comparator<C1867i> {
        C1865a() {
        }

        /* renamed from: a */
        public int compare(C1867i iVar, C1867i iVar2) {
            return iVar.f7208f - iVar2.f7208f;
        }
    }

    /* renamed from: l.h$b */
    class C1866b {

        /* renamed from: a */
        C1867i f7202a;

        /* renamed from: b */
        C1864h f7203b;

        public C1866b(C1864h hVar) {
            this.f7203b = hVar;
        }

        /* renamed from: a */
        public boolean mo6417a(C1867i iVar, float f) {
            boolean z = true;
            if (this.f7202a.f7206d) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f7202a.f7214l;
                    float f2 = fArr[i] + (iVar.f7214l[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f7202a.f7214l[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C1864h.this.m7751G(this.f7202a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = iVar.f7214l[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f7202a.f7214l[i2] = f4;
                } else {
                    this.f7202a.f7214l[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo6418b(C1867i iVar) {
            this.f7202a = iVar;
        }

        /* renamed from: c */
        public final boolean mo6419c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f7202a.f7214l[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo6420d(C1867i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f7214l[i];
                float f2 = this.f7202a.f7214l[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo6421e() {
            Arrays.fill(this.f7202a.f7214l, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f7202a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f7202a.f7214l[i] + " ";
                }
            }
            return str + "] " + this.f7202a;
        }
    }

    public C1864h(C1857c cVar) {
        super(cVar);
        this.f7200l = cVar;
    }

    /* renamed from: F */
    private final void m7750F(C1867i iVar) {
        int i;
        int i2 = this.f7198j + 1;
        C1867i[] iVarArr = this.f7196h;
        if (i2 > iVarArr.length) {
            C1867i[] iVarArr2 = (C1867i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f7196h = iVarArr2;
            this.f7197i = (C1867i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C1867i[] iVarArr3 = this.f7196h;
        int i3 = this.f7198j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f7198j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f7208f > iVar.f7208f) {
            int i5 = 0;
            while (true) {
                i = this.f7198j;
                if (i5 >= i) {
                    break;
                }
                this.f7197i[i5] = this.f7196h[i5];
                i5++;
            }
            Arrays.sort(this.f7197i, 0, i, new C1865a());
            for (int i6 = 0; i6 < this.f7198j; i6++) {
                this.f7196h[i6] = this.f7197i[i6];
            }
        }
        iVar.f7206d = true;
        iVar.mo6423a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m7751G(C1867i iVar) {
        int i = 0;
        while (i < this.f7198j) {
            if (this.f7196h[i] == iVar) {
                while (true) {
                    int i2 = this.f7198j;
                    if (i < i2 - 1) {
                        C1867i[] iVarArr = this.f7196h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f7198j = i2 - 1;
                        iVar.f7206d = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: B */
    public void mo6360B(C1858d dVar, C1855b bVar, boolean z) {
        C1867i iVar = bVar.f7157a;
        if (iVar != null) {
            C1855b.C1856a aVar = bVar.f7161e;
            int d = aVar.mo6350d();
            for (int i = 0; i < d; i++) {
                C1867i f = aVar.mo6352f(i);
                float a = aVar.mo6346a(i);
                this.f7199k.mo6418b(f);
                if (this.f7199k.mo6417a(iVar, a)) {
                    m7750F(f);
                }
                this.f7158b += bVar.f7158b * a;
            }
            m7751G(iVar);
        }
    }

    /* renamed from: a */
    public C1867i mo6363a(C1858d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f7198j; i2++) {
            C1867i iVar = this.f7196h[i2];
            if (!zArr[iVar.f7208f]) {
                this.f7199k.mo6418b(iVar);
                C1866b bVar = this.f7199k;
                if (i == -1) {
                    if (!bVar.mo6419c()) {
                    }
                } else if (!bVar.mo6420d(this.f7196h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f7196h[i];
    }

    /* renamed from: c */
    public void mo6365c(C1867i iVar) {
        this.f7199k.mo6418b(iVar);
        this.f7199k.mo6421e();
        iVar.f7214l[iVar.f7210h] = 1.0f;
        m7750F(iVar);
    }

    public void clear() {
        this.f7198j = 0;
        this.f7158b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f7198j == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f7158b + ") : ";
        for (int i = 0; i < this.f7198j; i++) {
            this.f7199k.mo6418b(this.f7196h[i]);
            str = str + this.f7199k + " ";
        }
        return str;
    }
}
