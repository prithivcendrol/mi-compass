package p069l;

import java.util.Arrays;
import p069l.C1855b;

/* renamed from: l.a */
public class C1854a implements C1855b.C1856a {

    /* renamed from: l */
    private static float f7145l = 0.001f;

    /* renamed from: a */
    int f7146a = 0;

    /* renamed from: b */
    private final C1855b f7147b;

    /* renamed from: c */
    protected final C1857c f7148c;

    /* renamed from: d */
    private int f7149d = 8;

    /* renamed from: e */
    private C1867i f7150e = null;

    /* renamed from: f */
    private int[] f7151f = new int[8];

    /* renamed from: g */
    private int[] f7152g = new int[8];

    /* renamed from: h */
    private float[] f7153h = new float[8];

    /* renamed from: i */
    private int f7154i = -1;

    /* renamed from: j */
    private int f7155j = -1;

    /* renamed from: k */
    private boolean f7156k = false;

    C1854a(C1855b bVar, C1857c cVar) {
        this.f7147b = bVar;
        this.f7148c = cVar;
    }

    /* renamed from: a */
    public float mo6346a(int i) {
        int i2 = this.f7154i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f7146a) {
            if (i3 == i) {
                return this.f7153h[i2];
            }
            i2 = this.f7152g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public float mo6347b(C1855b bVar, boolean z) {
        float g = mo6353g(bVar.f7157a);
        mo6354h(bVar.f7157a, z);
        C1855b.C1856a aVar = bVar.f7161e;
        int d = aVar.mo6350d();
        for (int i = 0; i < d; i++) {
            C1867i f = aVar.mo6352f(i);
            mo6351e(f, aVar.mo6353g(f) * g, z);
        }
        return g;
    }

    /* renamed from: c */
    public final void mo6348c(C1867i iVar, float f) {
        if (f == 0.0f) {
            mo6354h(iVar, true);
            return;
        }
        int i = this.f7154i;
        if (i == -1) {
            this.f7154i = 0;
            this.f7153h[0] = f;
            this.f7151f[0] = iVar.f7208f;
            this.f7152g[0] = -1;
            iVar.f7218p++;
            iVar.mo6423a(this.f7147b);
            this.f7146a++;
            if (!this.f7156k) {
                int i2 = this.f7155j + 1;
                this.f7155j = i2;
                int[] iArr = this.f7151f;
                if (i2 >= iArr.length) {
                    this.f7156k = true;
                    this.f7155j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f7146a) {
            int i5 = this.f7151f[i];
            int i6 = iVar.f7208f;
            if (i5 == i6) {
                this.f7153h[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f7152g[i];
            i3++;
        }
        int i7 = this.f7155j;
        int i8 = i7 + 1;
        if (this.f7156k) {
            int[] iArr2 = this.f7151f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f7151f;
        if (i7 >= iArr3.length && this.f7146a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f7151f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f7151f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f7149d * 2;
            this.f7149d = i10;
            this.f7156k = false;
            this.f7155j = i7 - 1;
            this.f7153h = Arrays.copyOf(this.f7153h, i10);
            this.f7151f = Arrays.copyOf(this.f7151f, this.f7149d);
            this.f7152g = Arrays.copyOf(this.f7152g, this.f7149d);
        }
        this.f7151f[i7] = iVar.f7208f;
        this.f7153h[i7] = f;
        int[] iArr6 = this.f7152g;
        if (i4 != -1) {
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            iArr6[i7] = this.f7154i;
            this.f7154i = i7;
        }
        iVar.f7218p++;
        iVar.mo6423a(this.f7147b);
        int i11 = this.f7146a + 1;
        this.f7146a = i11;
        if (!this.f7156k) {
            this.f7155j++;
        }
        int[] iArr7 = this.f7151f;
        if (i11 >= iArr7.length) {
            this.f7156k = true;
        }
        if (this.f7155j >= iArr7.length) {
            this.f7156k = true;
            this.f7155j = iArr7.length - 1;
        }
    }

    public final void clear() {
        int i = this.f7154i;
        int i2 = 0;
        while (i != -1 && i2 < this.f7146a) {
            C1867i iVar = this.f7148c.f7166d[this.f7151f[i]];
            if (iVar != null) {
                iVar.mo6426d(this.f7147b);
            }
            i = this.f7152g[i];
            i2++;
        }
        this.f7154i = -1;
        this.f7155j = -1;
        this.f7156k = false;
        this.f7146a = 0;
    }

    /* renamed from: d */
    public int mo6350d() {
        return this.f7146a;
    }

    /* renamed from: e */
    public void mo6351e(C1867i iVar, float f, boolean z) {
        float f2 = f7145l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f7154i;
            if (i == -1) {
                this.f7154i = 0;
                this.f7153h[0] = f;
                this.f7151f[0] = iVar.f7208f;
                this.f7152g[0] = -1;
                iVar.f7218p++;
                iVar.mo6423a(this.f7147b);
                this.f7146a++;
                if (!this.f7156k) {
                    int i2 = this.f7155j + 1;
                    this.f7155j = i2;
                    int[] iArr = this.f7151f;
                    if (i2 >= iArr.length) {
                        this.f7156k = true;
                        this.f7155j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f7146a) {
                int i5 = this.f7151f[i];
                int i6 = iVar.f7208f;
                if (i5 == i6) {
                    float[] fArr = this.f7153h;
                    float f3 = fArr[i] + f;
                    float f4 = f7145l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f7154i) {
                            this.f7154i = this.f7152g[i];
                        } else {
                            int[] iArr2 = this.f7152g;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            iVar.mo6426d(this.f7147b);
                        }
                        if (this.f7156k) {
                            this.f7155j = i;
                        }
                        iVar.f7218p--;
                        this.f7146a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f7152g[i];
                i3++;
            }
            int i7 = this.f7155j;
            int i8 = i7 + 1;
            if (this.f7156k) {
                int[] iArr3 = this.f7151f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f7151f;
            if (i7 >= iArr4.length && this.f7146a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f7151f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f7151f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f7149d * 2;
                this.f7149d = i10;
                this.f7156k = false;
                this.f7155j = i7 - 1;
                this.f7153h = Arrays.copyOf(this.f7153h, i10);
                this.f7151f = Arrays.copyOf(this.f7151f, this.f7149d);
                this.f7152g = Arrays.copyOf(this.f7152g, this.f7149d);
            }
            this.f7151f[i7] = iVar.f7208f;
            this.f7153h[i7] = f;
            int[] iArr7 = this.f7152g;
            if (i4 != -1) {
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                iArr7[i7] = this.f7154i;
                this.f7154i = i7;
            }
            iVar.f7218p++;
            iVar.mo6423a(this.f7147b);
            this.f7146a++;
            if (!this.f7156k) {
                this.f7155j++;
            }
            int i11 = this.f7155j;
            int[] iArr8 = this.f7151f;
            if (i11 >= iArr8.length) {
                this.f7156k = true;
                this.f7155j = iArr8.length - 1;
            }
        }
    }

    /* renamed from: f */
    public C1867i mo6352f(int i) {
        int i2 = this.f7154i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f7146a) {
            if (i3 == i) {
                return this.f7148c.f7166d[this.f7151f[i2]];
            }
            i2 = this.f7152g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: g */
    public final float mo6353g(C1867i iVar) {
        int i = this.f7154i;
        int i2 = 0;
        while (i != -1 && i2 < this.f7146a) {
            if (this.f7151f[i] == iVar.f7208f) {
                return this.f7153h[i];
            }
            i = this.f7152g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float mo6354h(C1867i iVar, boolean z) {
        if (this.f7150e == iVar) {
            this.f7150e = null;
        }
        int i = this.f7154i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f7146a) {
            if (this.f7151f[i] == iVar.f7208f) {
                if (i == this.f7154i) {
                    this.f7154i = this.f7152g[i];
                } else {
                    int[] iArr = this.f7152g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo6426d(this.f7147b);
                }
                iVar.f7218p--;
                this.f7146a--;
                this.f7151f[i] = -1;
                if (this.f7156k) {
                    this.f7155j = i;
                }
                return this.f7153h[i];
            }
            i2++;
            i3 = i;
            i = this.f7152g[i];
        }
        return 0.0f;
    }

    /* renamed from: i */
    public boolean mo6355i(C1867i iVar) {
        int i = this.f7154i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f7146a) {
            if (this.f7151f[i] == iVar.f7208f) {
                return true;
            }
            i = this.f7152g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: j */
    public void mo6356j(float f) {
        int i = this.f7154i;
        int i2 = 0;
        while (i != -1 && i2 < this.f7146a) {
            float[] fArr = this.f7153h;
            fArr[i] = fArr[i] / f;
            i = this.f7152g[i];
            i2++;
        }
    }

    /* renamed from: k */
    public void mo6357k() {
        int i = this.f7154i;
        int i2 = 0;
        while (i != -1 && i2 < this.f7146a) {
            float[] fArr = this.f7153h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f7152g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f7154i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f7146a) {
            str = ((str + " -> ") + this.f7153h[i] + " : ") + this.f7148c.f7166d[this.f7151f[i]];
            i = this.f7152g[i];
            i2++;
        }
        return str;
    }
}
