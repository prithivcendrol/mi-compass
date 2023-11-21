package p116t1;

import p083n1.C2422g;

/* renamed from: t1.l */
class C2689l extends C2688k {
    /* renamed from: c */
    public static final boolean m11208c(String str, int i, String str2, int i2, int i3, boolean z) {
        C2422g.m10285e(str, "<this>");
        C2422g.m10285e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: d */
    public static final boolean m11209d(String str, String str2, boolean z) {
        C2422g.m10285e(str, "<this>");
        C2422g.m10285e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m11208c(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m11210e(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m11209d(str, str2, z);
    }
}
