package p116t1;

import p101q1.C2577c;

/* renamed from: t1.a */
class C2678a {
    /* renamed from: a */
    public static final int m11194a(int i) {
        if (new C2577c(2, 36).mo9844e(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C2577c(2, 36));
    }

    /* renamed from: b */
    public static final int m11195b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m11196c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
