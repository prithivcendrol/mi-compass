package p103q3;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p117t2.C2699g;

/* renamed from: q3.a */
public class C2586a {

    /* renamed from: a */
    private static Locale f10127a = Locale.getDefault();

    /* renamed from: b */
    private static char f10128b = new DecimalFormatSymbols(f10127a).getZeroDigit();

    /* renamed from: a */
    private static String m10998a(int i, int i2) {
        StringBuilder b = C2699g.m11290c().mo9944b();
        if (i2 < 0) {
            i2 = -i2;
            i--;
            b.append('-');
        }
        if (i2 >= 10000) {
            String num = Integer.toString(i2);
            for (int length = num.length(); length < i; length++) {
                b.append('0');
            }
            b.append(num);
        } else {
            for (int i3 = i2 >= 1000 ? 4 : i2 >= 100 ? 3 : i2 >= 10 ? 2 : 1; i3 < i; i3++) {
                b.append('0');
            }
            b.append(i2);
        }
        String sb = b.toString();
        C2699g.m11290c().mo9943a(b);
        return sb;
    }

    /* renamed from: b */
    public static String m10999b(int i) {
        return m11000c(-1, i);
    }

    /* renamed from: c */
    public static String m11000c(int i, int i2) {
        char d = m11001d(Locale.getDefault());
        String a = m10998a(i, i2);
        return d != '0' ? m11002e(d, a) : a;
    }

    /* renamed from: d */
    private static char m11001d(Locale locale) {
        if (locale != null) {
            if (!locale.equals(f10127a)) {
                f10128b = new DecimalFormatSymbols(locale).getZeroDigit();
                f10127a = locale;
            }
            return f10128b;
        }
        throw new NullPointerException("locale == null");
    }

    /* renamed from: e */
    private static String m11002e(char c, String str) {
        int length = str.length();
        int i = c - '0';
        StringBuilder b = C2699g.m11290c().mo9944b();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                charAt = (char) (charAt + i);
            }
            b.append(charAt);
        }
        String sb = b.toString();
        C2699g.m11290c().mo9943a(b);
        return sb;
    }
}
