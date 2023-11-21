package p023d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import p083n1.C2422g;

/* renamed from: d1.e */
class C1473e extends C1471d {
    /* renamed from: d */
    public static <T> List<T> m6450d(T[] tArr) {
        C2422g.m10285e(tArr, "<this>");
        return (List) m6451e(tArr, new ArrayList());
    }

    /* renamed from: e */
    public static final <C extends Collection<? super T>, T> C m6451e(T[] tArr, C c) {
        C2422g.m10285e(tArr, "<this>");
        C2422g.m10285e(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: f */
    public static char m6452f(char[] cArr) {
        C2422g.m10285e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: g */
    public static <T> T m6453g(T[] tArr) {
        C2422g.m10285e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
