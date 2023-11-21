package p063k;

/* renamed from: k.h */
public class C1775h<E> implements Cloneable {

    /* renamed from: h */
    private static final Object f6845h = new Object();

    /* renamed from: d */
    private boolean f6846d;

    /* renamed from: e */
    private int[] f6847e;

    /* renamed from: f */
    private Object[] f6848f;

    /* renamed from: g */
    private int f6849g;

    public C1775h() {
        this(10);
    }

    public C1775h(int i) {
        this.f6846d = false;
        if (i == 0) {
            this.f6847e = C1770c.f6819a;
            this.f6848f = C1770c.f6821c;
            return;
        }
        int e = C1770c.m7361e(i);
        this.f6847e = new int[e];
        this.f6848f = new Object[e];
    }

    /* renamed from: d */
    private void m7397d() {
        int i = this.f6849g;
        int[] iArr = this.f6847e;
        Object[] objArr = this.f6848f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f6845h) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f6846d = false;
        this.f6849g = i2;
    }

    /* renamed from: a */
    public void mo6175a(int i, E e) {
        int i2 = this.f6849g;
        if (i2 == 0 || i > this.f6847e[i2 - 1]) {
            if (this.f6846d && i2 >= this.f6847e.length) {
                m7397d();
            }
            int i3 = this.f6849g;
            if (i3 >= this.f6847e.length) {
                int e2 = C1770c.m7361e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f6847e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f6848f;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f6847e = iArr;
                this.f6848f = objArr;
            }
            this.f6847e[i3] = i;
            this.f6848f[i3] = e;
            this.f6849g = i3 + 1;
            return;
        }
        mo6183i(i, e);
    }

    /* renamed from: b */
    public void mo6176b() {
        int i = this.f6849g;
        Object[] objArr = this.f6848f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f6849g = 0;
        this.f6846d = false;
    }

    /* renamed from: c */
    public C1775h<E> clone() {
        try {
            C1775h<E> hVar = (C1775h) super.clone();
            hVar.f6847e = (int[]) this.f6847e.clone();
            hVar.f6848f = (Object[]) this.f6848f.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo6179e(int i) {
        return mo6180f(i, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f6848f[r3];
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E mo6180f(int r3, E r4) {
        /*
            r2 = this;
            int[] r0 = r2.f6847e
            int r1 = r2.f6849g
            int r3 = p063k.C1770c.m7357a(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f6848f
            r3 = r0[r3]
            java.lang.Object r0 = f6845h
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p063k.C1775h.mo6180f(int, java.lang.Object):java.lang.Object");
    }

    /* renamed from: g */
    public int mo6181g(int i) {
        if (this.f6846d) {
            m7397d();
        }
        return C1770c.m7357a(this.f6847e, this.f6849g, i);
    }

    /* renamed from: h */
    public int mo6182h(int i) {
        if (this.f6846d) {
            m7397d();
        }
        return this.f6847e[i];
    }

    /* renamed from: i */
    public void mo6183i(int i, E e) {
        int a = C1770c.m7357a(this.f6847e, this.f6849g, i);
        if (a >= 0) {
            this.f6848f[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f6849g;
        if (i2 < i3) {
            Object[] objArr = this.f6848f;
            if (objArr[i2] == f6845h) {
                this.f6847e[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f6846d && i3 >= this.f6847e.length) {
            m7397d();
            i2 = ~C1770c.m7357a(this.f6847e, this.f6849g, i);
        }
        int i4 = this.f6849g;
        if (i4 >= this.f6847e.length) {
            int e2 = C1770c.m7361e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f6847e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f6848f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6847e = iArr;
            this.f6848f = objArr2;
        }
        int i5 = this.f6849g;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f6847e;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f6848f;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f6849g - i2);
        }
        this.f6847e[i2] = i;
        this.f6848f[i2] = e;
        this.f6849g++;
    }

    /* renamed from: j */
    public int mo6184j() {
        if (this.f6846d) {
            m7397d();
        }
        return this.f6849g;
    }

    /* renamed from: k */
    public E mo6185k(int i) {
        if (this.f6846d) {
            m7397d();
        }
        return this.f6848f[i];
    }

    public String toString() {
        if (mo6184j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6849g * 28);
        sb.append('{');
        for (int i = 0; i < this.f6849g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6182h(i));
            sb.append('=');
            Object k = mo6185k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
