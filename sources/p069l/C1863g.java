package p069l;

/* renamed from: l.g */
class C1863g<T> implements C1862f<T> {

    /* renamed from: a */
    private final Object[] f7193a;

    /* renamed from: b */
    private int f7194b;

    C1863g(int i) {
        if (i > 0) {
            this.f7193a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo6412a(T t) {
        int i = this.f7194b;
        Object[] objArr = this.f7193a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f7194b = i + 1;
        return true;
    }

    /* renamed from: b */
    public T mo6413b() {
        int i = this.f7194b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f7193a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f7194b = i - 1;
        return t;
    }

    /* renamed from: c */
    public void mo6414c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f7194b;
            Object[] objArr = this.f7193a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f7194b = i3 + 1;
            }
        }
    }
}
