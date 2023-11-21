package p047h1;

/* renamed from: h1.c */
public final class C1626c {
    /* renamed from: a */
    private static final int m6913a(int i, int i2, int i3) {
        return m6915c(m6915c(i, i3) - m6915c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m6914b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m6913a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m6913a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m6915c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
