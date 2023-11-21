package p097p3;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.TimeZone;
import p091o3.C2506h;
import p117t2.C2699g;

/* renamed from: p3.c */
public class C2549c {

    /* renamed from: a */
    private static final C2699g.C2705e<C2546a> f10051a = C2699g.m11289b(new C2550a(), 1);

    /* renamed from: p3.c$a */
    class C2550a extends C2699g.C2704d<C2546a> {
        C2550a() {
        }

        /* renamed from: e */
        public C2546a mo9790a() {
            return new C2546a();
        }
    }

    /* renamed from: a */
    public static String m10885a(Context context, long j, int i) {
        StringBuilder b = C2699g.m11290c().mo9944b();
        String sb = m10886b(context, b, j, i, (TimeZone) null).toString();
        C2699g.m11290c().mo9943a(b);
        return sb;
    }

    /* renamed from: b */
    public static StringBuilder m10886b(Context context, StringBuilder sb, long j, int i, TimeZone timeZone) {
        int i2;
        if ((i & 16) == 0 && (i & 32) == 0) {
            i |= DateFormat.is24HourFormat(context) ? 32 : 16;
        }
        String string = context.getString(m10888d(i));
        StringBuilder b = C2699g.m11290c().mo9944b();
        C2546a b2 = f10051a.mo9944b();
        b2.mo9754T(timeZone);
        b2.mo9753S(j);
        int length = string.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = string.charAt(i3);
            if (charAt == 'D') {
                i2 = m10887c(i);
            } else if (charAt == 'T') {
                i2 = m10889e(b2, i);
            } else if (charAt != 'W') {
                b.append(charAt);
            } else {
                i2 = m10890f(i);
            }
            b.append(context.getString(i2));
        }
        b2.mo9766x(context, sb, b);
        C2699g.m11290c().mo9943a(b);
        f10051a.mo9943a(b2);
        return sb;
    }

    /* renamed from: c */
    private static int m10887c(int i) {
        if ((i & 32768) != 32768) {
            if ((i & 4096) == 4096) {
                if ((i & 512) != 512) {
                    int i2 = i & 256;
                    int i3 = i & 128;
                    if (i2 == 256) {
                        return i3 == 128 ? C2506h.f9818t : C2506h.f9817s;
                    }
                    if (i3 != 128) {
                        throw new IllegalArgumentException("no any time date");
                    }
                    return C2506h.f9806h;
                } else if ((i & 256) == 256) {
                    return (i & 128) == 128 ? C2506h.f9820v : C2506h.f9819u;
                }
            } else if ((i & 512) != 512) {
                int i4 = i & 256;
                int i5 = i & 128;
                if (i4 == 256) {
                    return i5 == 128 ? C2506h.f9808j : C2506h.f9807i;
                }
                if (i5 != 128) {
                    throw new IllegalArgumentException("no any time date");
                }
                return C2506h.f9806h;
            } else if ((i & 256) == 256) {
                return (i & 128) == 128 ? C2506h.f9810l : C2506h.f9809k;
            }
            return C2506h.f9824z;
        } else if ((i & 512) == 512) {
            return (i & 256) == 256 ? (i & 128) == 128 ? C2506h.f9816r : C2506h.f9815q : C2506h.f9814p;
        } else {
            int i6 = i & 256;
            int i7 = i & 128;
            if (i6 == 256) {
                return i7 == 128 ? C2506h.f9813o : C2506h.f9812n;
            }
            if (i7 == 128) {
                return C2506h.f9811m;
            }
            throw new IllegalArgumentException("no any time date");
        }
    }

    /* renamed from: d */
    private static int m10888d(int i) {
        if ((i & 1024) == 1024) {
            if ((i & 896) != 0) {
                int i2 = i & 15;
                int i3 = i & 2048;
                return i2 != 0 ? i3 == 2048 ? C2506h.f9791Y : C2506h.f9790X : i3 == 2048 ? C2506h.f9792Z : C2506h.f9789W;
            }
            int i4 = i & 15;
            int i5 = i & 2048;
            return i4 != 0 ? i5 == 2048 ? C2506h.f9800d0 : C2506h.f9798c0 : i5 == 2048 ? C2506h.f9802e0 : C2506h.f9788V;
        } else if ((i & 896) != 0) {
            int i6 = i & 15;
            int i7 = i & 2048;
            return i6 != 0 ? i7 == 2048 ? C2506h.f9822x : C2506h.f9821w : i7 == 2048 ? C2506h.f9823y : C2506h.f9805g;
        } else {
            int i8 = i & 15;
            int i9 = i & 2048;
            return i8 != 0 ? i9 == 2048 ? C2506h.f9786T : C2506h.f9767A : i9 == 2048 ? C2506h.f9787U : C2506h.f9801e;
        }
    }

    /* renamed from: e */
    private static int m10889e(C2546a aVar, int i) {
        if ((i & 16384) == 16384 && (((i & 1) != 1 || aVar.mo9768z(22) == 0) && (i & 14) != 0)) {
            i &= -2;
            if (((i & 2) != 2 || aVar.mo9768z(21) == 0) && (i & 12) != 0) {
                i &= -3;
                if (aVar.mo9768z(20) == 0 && (i & 8) != 0) {
                    i &= -5;
                }
            }
        }
        if ((i & 8) == 8) {
            return (i & 16) == 16 ? (i & 64) == 64 ? (i & 4) == 4 ? (i & 2) == 2 ? (i & 1) == 1 ? C2506h.f9772F : C2506h.f9771E : C2506h.f9769C : C2506h.f9768B : (i & 4) == 4 ? (i & 2) == 2 ? (i & 1) == 1 ? C2506h.f9773G : C2506h.f9774H : C2506h.f9770D : C2506h.f9775I : (i & 4) == 4 ? (i & 2) == 2 ? (i & 1) == 1 ? C2506h.f9779M : C2506h.f9778L : C2506h.f9777K : C2506h.f9776J;
        }
        if ((i & 4) == 4) {
            return (i & 2) == 2 ? (i & 1) == 1 ? C2506h.f9783Q : C2506h.f9782P : C2506h.f9781O;
        }
        if ((i & 2) == 2) {
            return (i & 1) == 1 ? C2506h.f9785S : C2506h.f9784R;
        }
        if ((i & 1) == 1) {
            return C2506h.f9780N;
        }
        throw new IllegalArgumentException("no any time date");
    }

    /* renamed from: f */
    private static int m10890f(int i) {
        return (i & 8192) == 8192 ? C2506h.f9796b0 : C2506h.f9794a0;
    }
}
