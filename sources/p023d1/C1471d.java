package p023d1;

import java.util.List;
import p083n1.C2422g;

/* renamed from: d1.d */
class C1471d extends C1469c {
    /* renamed from: a */
    public static final <T> List<T> m6446a(T[] tArr) {
        C2422g.m10285e(tArr, "<this>");
        List<T> a = C1475f.m6456a(tArr);
        C2422g.m10284d(a, "asList(this)");
        return a;
    }

    /* renamed from: b */
    public static final <T> T[] m6447b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C2422g.m10285e(tArr, "<this>");
        C2422g.m10285e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: c */
    public static /* synthetic */ Object[] m6448c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m6447b(objArr, objArr2, i, i2, i3);
    }
}
