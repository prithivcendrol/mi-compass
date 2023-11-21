package p069l;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: l.i */
public class C1867i implements Comparable<C1867i> {

    /* renamed from: u */
    private static int f7205u = 1;

    /* renamed from: d */
    public boolean f7206d;

    /* renamed from: e */
    private String f7207e;

    /* renamed from: f */
    public int f7208f = -1;

    /* renamed from: g */
    int f7209g = -1;

    /* renamed from: h */
    public int f7210h = 0;

    /* renamed from: i */
    public float f7211i;

    /* renamed from: j */
    public boolean f7212j = false;

    /* renamed from: k */
    float[] f7213k = new float[9];

    /* renamed from: l */
    float[] f7214l = new float[9];

    /* renamed from: m */
    C1868a f7215m;

    /* renamed from: n */
    C1855b[] f7216n = new C1855b[16];

    /* renamed from: o */
    int f7217o = 0;

    /* renamed from: p */
    public int f7218p = 0;

    /* renamed from: q */
    boolean f7219q = false;

    /* renamed from: r */
    int f7220r = -1;

    /* renamed from: s */
    float f7221s = 0.0f;

    /* renamed from: t */
    HashSet<C1855b> f7222t = null;

    /* renamed from: l.i$a */
    public enum C1868a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C1867i(C1868a aVar, String str) {
        this.f7215m = aVar;
    }

    /* renamed from: c */
    static void m7761c() {
        f7205u++;
    }

    /* renamed from: a */
    public final void mo6423a(C1855b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f7217o;
            if (i >= i2) {
                C1855b[] bVarArr = this.f7216n;
                if (i2 >= bVarArr.length) {
                    this.f7216n = (C1855b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C1855b[] bVarArr2 = this.f7216n;
                int i3 = this.f7217o;
                bVarArr2[i3] = bVar;
                this.f7217o = i3 + 1;
                return;
            } else if (this.f7216n[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(C1867i iVar) {
        return this.f7208f - iVar.f7208f;
    }

    /* renamed from: d */
    public final void mo6426d(C1855b bVar) {
        int i = this.f7217o;
        int i2 = 0;
        while (i2 < i) {
            if (this.f7216n[i2] == bVar) {
                while (i2 < i - 1) {
                    C1855b[] bVarArr = this.f7216n;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f7217o--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: e */
    public void mo6427e() {
        this.f7207e = null;
        this.f7215m = C1868a.UNKNOWN;
        this.f7210h = 0;
        this.f7208f = -1;
        this.f7209g = -1;
        this.f7211i = 0.0f;
        this.f7212j = false;
        this.f7219q = false;
        this.f7220r = -1;
        this.f7221s = 0.0f;
        int i = this.f7217o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7216n[i2] = null;
        }
        this.f7217o = 0;
        this.f7218p = 0;
        this.f7206d = false;
        Arrays.fill(this.f7214l, 0.0f);
    }

    /* renamed from: f */
    public void mo6428f(C1858d dVar, float f) {
        this.f7211i = f;
        this.f7212j = true;
        this.f7219q = false;
        this.f7220r = -1;
        this.f7221s = 0.0f;
        int i = this.f7217o;
        this.f7209g = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7216n[i2].mo6359A(dVar, this, false);
        }
        this.f7217o = 0;
    }

    /* renamed from: g */
    public void mo6429g(C1868a aVar, String str) {
        this.f7215m = aVar;
    }

    /* renamed from: h */
    public final void mo6430h(C1858d dVar, C1855b bVar) {
        int i = this.f7217o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7216n[i2].mo6360B(dVar, bVar, false);
        }
        this.f7217o = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f7207e != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f7207e);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f7208f);
        }
        return sb.toString();
    }
}
