package p116t1;

import p023d1.C1492v;
import p083n1.C2422g;
import p101q1.C2574a;
import p101q1.C2577c;

/* renamed from: t1.m */
class C2690m extends C2689l {
    /* renamed from: f */
    public static final int m11211f(CharSequence charSequence) {
        C2422g.m10285e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: g */
    public static final int m11212g(CharSequence charSequence, char c, int i, boolean z) {
        C2422g.m10285e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m11218m(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: h */
    public static final int m11213h(CharSequence charSequence, String str, int i, boolean z) {
        C2422g.m10285e(charSequence, "<this>");
        C2422g.m10285e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m11215j(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: i */
    private static final int m11214i(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C2574a cVar = !z2 ? new C2577c(C2581f.m10984a(i, 0), C2581f.m10986c(i2, charSequence.length())) : C2581f.m10988e(C2581f.m10986c(i, m11211f(charSequence)), C2581f.m10984a(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = cVar.mo9833a();
            int b = cVar.mo9834b();
            int c = cVar.mo9835c();
            if ((c <= 0 || a > b) && (c >= 0 || b > a)) {
                return -1;
            }
            while (true) {
                if (m11222q(charSequence2, 0, charSequence, a, charSequence2.length(), z)) {
                    return a;
                }
                if (a == b) {
                    return -1;
                }
                a += c;
            }
        } else {
            int a2 = cVar.mo9833a();
            int b2 = cVar.mo9834b();
            int c2 = cVar.mo9835c();
            if ((c2 <= 0 || a2 > b2) && (c2 >= 0 || b2 > a2)) {
                return -1;
            }
            while (true) {
                if (C2689l.m11208c((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), z)) {
                    return a2;
                }
                if (a2 == b2) {
                    return -1;
                }
                a2 += c2;
            }
        }
    }

    /* renamed from: j */
    static /* synthetic */ int m11215j(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m11214i(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: k */
    public static /* synthetic */ int m11216k(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11212g(charSequence, c, i, z);
    }

    /* renamed from: l */
    public static /* synthetic */ int m11217l(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11213h(charSequence, str, i, z);
    }

    /* renamed from: m */
    public static final int m11218m(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C2422g.m10285e(charSequence, "<this>");
        C2422g.m10285e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C1492v d = new C2577c(C2581f.m10984a(i, 0), m11211f(charSequence)).iterator();
            while (d.hasNext()) {
                int nextInt = d.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C2679b.m11197d(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C1473e.m6452f(cArr), i);
    }

    /* renamed from: n */
    public static final int m11219n(CharSequence charSequence, char c, int i, boolean z) {
        C2422g.m10285e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m11221p(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: o */
    public static /* synthetic */ int m11220o(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m11211f(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11219n(charSequence, c, i, z);
    }

    /* renamed from: p */
    public static final int m11221p(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C2422g.m10285e(charSequence, "<this>");
        C2422g.m10285e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c = C2581f.m10986c(i, m11211f(charSequence)); -1 < c; c--) {
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C2679b.m11197d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return c;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C1473e.m6452f(cArr), i);
    }

    /* renamed from: q */
    public static final boolean m11222q(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C2422g.m10285e(charSequence, "<this>");
        C2422g.m10285e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C2679b.m11197d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static final String m11223r(String str, String str2, String str3) {
        C2422g.m10285e(str, "<this>");
        C2422g.m10285e(str2, "delimiter");
        C2422g.m10285e(str3, "missingDelimiterValue");
        int l = m11217l(str, str2, 0, false, 6, (Object) null);
        if (l == -1) {
            return str3;
        }
        String substring = str.substring(l + str2.length(), str.length());
        C2422g.m10284d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: s */
    public static /* synthetic */ String m11224s(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m11223r(str, str2, str3);
    }

    /* renamed from: t */
    public static final String m11225t(String str, char c, String str2) {
        C2422g.m10285e(str, "<this>");
        C2422g.m10285e(str2, "missingDelimiterValue");
        int o = m11220o(str, c, 0, false, 6, (Object) null);
        if (o == -1) {
            return str2;
        }
        String substring = str.substring(o + 1, str.length());
        C2422g.m10284d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: u */
    public static /* synthetic */ String m11226u(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m11225t(str, c, str2);
    }

    /* renamed from: v */
    public static final String m11227v(String str, char c, String str2) {
        C2422g.m10285e(str, "<this>");
        C2422g.m10285e(str2, "missingDelimiterValue");
        int k = m11216k(str, c, 0, false, 6, (Object) null);
        if (k == -1) {
            return str2;
        }
        String substring = str.substring(0, k);
        C2422g.m10284d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: w */
    public static final String m11228w(String str, String str2, String str3) {
        C2422g.m10285e(str, "<this>");
        C2422g.m10285e(str2, "delimiter");
        C2422g.m10285e(str3, "missingDelimiterValue");
        int l = m11217l(str, str2, 0, false, 6, (Object) null);
        if (l == -1) {
            return str3;
        }
        String substring = str.substring(0, l);
        C2422g.m10284d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: x */
    public static /* synthetic */ String m11229x(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m11227v(str, c, str2);
    }

    /* renamed from: y */
    public static /* synthetic */ String m11230y(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m11228w(str, str2, str3);
    }

    /* renamed from: z */
    public static CharSequence m11231z(CharSequence charSequence) {
        C2422g.m10285e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C2678a.m11196c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
