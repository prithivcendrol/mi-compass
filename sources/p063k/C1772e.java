package p063k;

/* renamed from: k.e */
public class C1772e<E> implements Cloneable {

    /* renamed from: h */
    private static final Object f6825h = new Object();

    /* renamed from: d */
    private boolean f6826d;

    /* renamed from: e */
    private long[] f6827e;

    /* renamed from: f */
    private Object[] f6828f;

    /* renamed from: g */
    private int f6829g;

    public C1772e() {
        this(10);
    }

    public C1772e(int i) {
        this.f6826d = false;
        if (i == 0) {
            this.f6827e = C1770c.f6820b;
            this.f6828f = C1770c.f6821c;
            return;
        }
        int f = C1770c.m7362f(i);
        this.f6827e = new long[f];
        this.f6828f = new Object[f];
    }

    /* renamed from: c */
    private void m7365c() {
        int i = this.f6829g;
        long[] jArr = this.f6827e;
        Object[] objArr = this.f6828f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f6825h) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f6826d = false;
        this.f6829g = i2;
    }

    /* renamed from: a */
    public void mo6129a() {
        int i = this.f6829g;
        Object[] objArr = this.f6828f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f6829g = 0;
        this.f6826d = false;
    }

    /* renamed from: b */
    public C1772e<E> clone() {
        try {
            C1772e<E> eVar = (C1772e) super.clone();
            eVar.f6827e = (long[]) this.f6827e.clone();
            eVar.f6828f = (Object[]) this.f6828f.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public E mo6132d(long j) {
        return mo6133e(j, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f6828f[r3];
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E mo6133e(long r3, E r5) {
        /*
            r2 = this;
            long[] r0 = r2.f6827e
            int r1 = r2.f6829g
            int r3 = p063k.C1770c.m7358b(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f6828f
            r3 = r4[r3]
            java.lang.Object r4 = f6825h
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p063k.C1772e.mo6133e(long, java.lang.Object):java.lang.Object");
    }

    /* renamed from: f */
    public int mo6134f(long j) {
        if (this.f6826d) {
            m7365c();
        }
        return C1770c.m7358b(this.f6827e, this.f6829g, j);
    }

    /* renamed from: g */
    public long mo6135g(int i) {
        if (this.f6826d) {
            m7365c();
        }
        return this.f6827e[i];
    }

    /* renamed from: h */
    public void mo6136h(long j, E e) {
        int b = C1770c.m7358b(this.f6827e, this.f6829g, j);
        if (b >= 0) {
            this.f6828f[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f6829g;
        if (i < i2) {
            Object[] objArr = this.f6828f;
            if (objArr[i] == f6825h) {
                this.f6827e[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f6826d && i2 >= this.f6827e.length) {
            m7365c();
            i = ~C1770c.m7358b(this.f6827e, this.f6829g, j);
        }
        int i3 = this.f6829g;
        if (i3 >= this.f6827e.length) {
            int f = C1770c.m7362f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f6827e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f6828f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6827e = jArr;
            this.f6828f = objArr2;
        }
        int i4 = this.f6829g;
        if (i4 - i != 0) {
            long[] jArr3 = this.f6827e;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f6828f;
            System.arraycopy(objArr4, i, objArr4, i5, this.f6829g - i);
        }
        this.f6827e[i] = j;
        this.f6828f[i] = e;
        this.f6829g++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f6828f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6137i(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f6827e
            int r1 = r2.f6829g
            int r3 = p063k.C1770c.m7358b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f6828f
            r0 = r4[r3]
            java.lang.Object r1 = f6825h
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f6826d = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p063k.C1772e.mo6137i(long):void");
    }

    /* renamed from: j */
    public void mo6138j(int i) {
        Object[] objArr = this.f6828f;
        Object obj = objArr[i];
        Object obj2 = f6825h;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f6826d = true;
        }
    }

    /* renamed from: k */
    public int mo6139k() {
        if (this.f6826d) {
            m7365c();
        }
        return this.f6829g;
    }

    /* renamed from: l */
    public E mo6140l(int i) {
        if (this.f6826d) {
            m7365c();
        }
        return this.f6828f[i];
    }

    public String toString() {
        if (mo6139k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6829g * 28);
        sb.append('{');
        for (int i = 0; i < this.f6829g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6135g(i));
            sb.append('=');
            Object l = mo6140l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
