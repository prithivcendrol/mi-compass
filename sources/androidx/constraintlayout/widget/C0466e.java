package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0436a;
import androidx.constraintlayout.widget.C0473f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p075m.C1885b;

/* renamed from: androidx.constraintlayout.widget.e */
public class C0466e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f1854f = {0, 4, 8};

    /* renamed from: g */
    private static SparseIntArray f1855g = new SparseIntArray();

    /* renamed from: h */
    private static SparseIntArray f1856h = new SparseIntArray();

    /* renamed from: a */
    public String f1857a = "";

    /* renamed from: b */
    public int f1858b = 0;

    /* renamed from: c */
    private HashMap<String, C0459b> f1859c = new HashMap<>();

    /* renamed from: d */
    private boolean f1860d = true;

    /* renamed from: e */
    private HashMap<Integer, C0467a> f1861e = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.e$a */
    public static class C0467a {

        /* renamed from: a */
        int f1862a;

        /* renamed from: b */
        String f1863b;

        /* renamed from: c */
        public final C0471d f1864c = new C0471d();

        /* renamed from: d */
        public final C0470c f1865d = new C0470c();

        /* renamed from: e */
        public final C0469b f1866e = new C0469b();

        /* renamed from: f */
        public final C0472e f1867f = new C0472e();

        /* renamed from: g */
        public HashMap<String, C0459b> f1868g = new HashMap<>();

        /* renamed from: h */
        C0468a f1869h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a */
        static class C0468a {

            /* renamed from: a */
            int[] f1870a = new int[10];

            /* renamed from: b */
            int[] f1871b = new int[10];

            /* renamed from: c */
            int f1872c = 0;

            /* renamed from: d */
            int[] f1873d = new int[10];

            /* renamed from: e */
            float[] f1874e = new float[10];

            /* renamed from: f */
            int f1875f = 0;

            /* renamed from: g */
            int[] f1876g = new int[5];

            /* renamed from: h */
            String[] f1877h = new String[5];

            /* renamed from: i */
            int f1878i = 0;

            /* renamed from: j */
            int[] f1879j = new int[4];

            /* renamed from: k */
            boolean[] f1880k = new boolean[4];

            /* renamed from: l */
            int f1881l = 0;

            C0468a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2514a(int i, float f) {
                int i2 = this.f1875f;
                int[] iArr = this.f1873d;
                if (i2 >= iArr.length) {
                    this.f1873d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1874e;
                    this.f1874e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1873d;
                int i3 = this.f1875f;
                iArr2[i3] = i;
                float[] fArr2 = this.f1874e;
                this.f1875f = i3 + 1;
                fArr2[i3] = f;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo2515b(int i, int i2) {
                int i3 = this.f1872c;
                int[] iArr = this.f1870a;
                if (i3 >= iArr.length) {
                    this.f1870a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1871b;
                    this.f1871b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1870a;
                int i4 = this.f1872c;
                iArr3[i4] = i;
                int[] iArr4 = this.f1871b;
                this.f1872c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo2516c(int i, String str) {
                int i2 = this.f1878i;
                int[] iArr = this.f1876g;
                if (i2 >= iArr.length) {
                    this.f1876g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1877h;
                    this.f1877h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1876g;
                int i3 = this.f1878i;
                iArr2[i3] = i;
                String[] strArr2 = this.f1877h;
                this.f1878i = i3 + 1;
                strArr2[i3] = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo2517d(int i, boolean z) {
                int i2 = this.f1881l;
                int[] iArr = this.f1879j;
                if (i2 >= iArr.length) {
                    this.f1879j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1880k;
                    this.f1880k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1879j;
                int i3 = this.f1881l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f1880k;
                this.f1881l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m2030f(int i, ConstraintLayout.C0455b bVar) {
            this.f1862a = i;
            C0469b bVar2 = this.f1866e;
            bVar2.f1927j = bVar.f1757e;
            bVar2.f1929k = bVar.f1759f;
            bVar2.f1931l = bVar.f1761g;
            bVar2.f1933m = bVar.f1763h;
            bVar2.f1935n = bVar.f1765i;
            bVar2.f1937o = bVar.f1767j;
            bVar2.f1939p = bVar.f1769k;
            bVar2.f1941q = bVar.f1771l;
            bVar2.f1943r = bVar.f1773m;
            bVar2.f1944s = bVar.f1775n;
            bVar2.f1945t = bVar.f1777o;
            bVar2.f1946u = bVar.f1785s;
            bVar2.f1947v = bVar.f1787t;
            bVar2.f1948w = bVar.f1789u;
            bVar2.f1949x = bVar.f1791v;
            bVar2.f1950y = bVar.f1729G;
            bVar2.f1951z = bVar.f1730H;
            bVar2.f1883A = bVar.f1731I;
            bVar2.f1884B = bVar.f1779p;
            bVar2.f1885C = bVar.f1781q;
            bVar2.f1886D = bVar.f1783r;
            bVar2.f1887E = bVar.f1746X;
            bVar2.f1888F = bVar.f1747Y;
            bVar2.f1889G = bVar.f1748Z;
            bVar2.f1923h = bVar.f1753c;
            bVar2.f1919f = bVar.f1749a;
            bVar2.f1921g = bVar.f1751b;
            bVar2.f1915d = bVar.width;
            bVar2.f1917e = bVar.height;
            bVar2.f1890H = bVar.leftMargin;
            bVar2.f1891I = bVar.rightMargin;
            bVar2.f1892J = bVar.topMargin;
            bVar2.f1893K = bVar.bottomMargin;
            bVar2.f1896N = bVar.f1726D;
            bVar2.f1904V = bVar.f1735M;
            bVar2.f1905W = bVar.f1734L;
            bVar2.f1907Y = bVar.f1737O;
            bVar2.f1906X = bVar.f1736N;
            bVar2.f1936n0 = bVar.f1750a0;
            bVar2.f1938o0 = bVar.f1752b0;
            bVar2.f1908Z = bVar.f1738P;
            bVar2.f1910a0 = bVar.f1739Q;
            bVar2.f1912b0 = bVar.f1742T;
            bVar2.f1914c0 = bVar.f1743U;
            bVar2.f1916d0 = bVar.f1740R;
            bVar2.f1918e0 = bVar.f1741S;
            bVar2.f1920f0 = bVar.f1744V;
            bVar2.f1922g0 = bVar.f1745W;
            bVar2.f1934m0 = bVar.f1754c0;
            bVar2.f1898P = bVar.f1795x;
            bVar2.f1900R = bVar.f1797z;
            bVar2.f1897O = bVar.f1793w;
            bVar2.f1899Q = bVar.f1796y;
            bVar2.f1902T = bVar.f1723A;
            bVar2.f1901S = bVar.f1724B;
            bVar2.f1903U = bVar.f1725C;
            bVar2.f1942q0 = bVar.f1756d0;
            bVar2.f1894L = bVar.getMarginEnd();
            this.f1866e.f1895M = bVar.getMarginStart();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m2031g(int i, C0473f.C0474a aVar) {
            m2030f(i, aVar);
            this.f1864c.f1970d = aVar.f1998x0;
            C0472e eVar = this.f1867f;
            eVar.f1974b = aVar.f1988A0;
            eVar.f1975c = aVar.f1989B0;
            eVar.f1976d = aVar.f1990C0;
            eVar.f1977e = aVar.f1991D0;
            eVar.f1978f = aVar.f1992E0;
            eVar.f1979g = aVar.f1993F0;
            eVar.f1980h = aVar.f1994G0;
            eVar.f1982j = aVar.f1995H0;
            eVar.f1983k = aVar.f1996I0;
            eVar.f1984l = aVar.f1997J0;
            eVar.f1986n = aVar.f2000z0;
            eVar.f1985m = aVar.f1999y0;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m2032h(C0462c cVar, int i, C0473f.C0474a aVar) {
            m2031g(i, aVar);
            if (cVar instanceof C0458a) {
                C0469b bVar = this.f1866e;
                bVar.f1928j0 = 1;
                C0458a aVar2 = (C0458a) cVar;
                bVar.f1924h0 = aVar2.getType();
                this.f1866e.f1930k0 = aVar2.getReferencedIds();
                this.f1866e.f1926i0 = aVar2.getMargin();
            }
        }

        /* renamed from: d */
        public void mo2512d(ConstraintLayout.C0455b bVar) {
            C0469b bVar2 = this.f1866e;
            bVar.f1757e = bVar2.f1927j;
            bVar.f1759f = bVar2.f1929k;
            bVar.f1761g = bVar2.f1931l;
            bVar.f1763h = bVar2.f1933m;
            bVar.f1765i = bVar2.f1935n;
            bVar.f1767j = bVar2.f1937o;
            bVar.f1769k = bVar2.f1939p;
            bVar.f1771l = bVar2.f1941q;
            bVar.f1773m = bVar2.f1943r;
            bVar.f1775n = bVar2.f1944s;
            bVar.f1777o = bVar2.f1945t;
            bVar.f1785s = bVar2.f1946u;
            bVar.f1787t = bVar2.f1947v;
            bVar.f1789u = bVar2.f1948w;
            bVar.f1791v = bVar2.f1949x;
            bVar.leftMargin = bVar2.f1890H;
            bVar.rightMargin = bVar2.f1891I;
            bVar.topMargin = bVar2.f1892J;
            bVar.bottomMargin = bVar2.f1893K;
            bVar.f1723A = bVar2.f1902T;
            bVar.f1724B = bVar2.f1901S;
            bVar.f1795x = bVar2.f1898P;
            bVar.f1797z = bVar2.f1900R;
            bVar.f1729G = bVar2.f1950y;
            bVar.f1730H = bVar2.f1951z;
            bVar.f1779p = bVar2.f1884B;
            bVar.f1781q = bVar2.f1885C;
            bVar.f1783r = bVar2.f1886D;
            bVar.f1731I = bVar2.f1883A;
            bVar.f1746X = bVar2.f1887E;
            bVar.f1747Y = bVar2.f1888F;
            bVar.f1735M = bVar2.f1904V;
            bVar.f1734L = bVar2.f1905W;
            bVar.f1737O = bVar2.f1907Y;
            bVar.f1736N = bVar2.f1906X;
            bVar.f1750a0 = bVar2.f1936n0;
            bVar.f1752b0 = bVar2.f1938o0;
            bVar.f1738P = bVar2.f1908Z;
            bVar.f1739Q = bVar2.f1910a0;
            bVar.f1742T = bVar2.f1912b0;
            bVar.f1743U = bVar2.f1914c0;
            bVar.f1740R = bVar2.f1916d0;
            bVar.f1741S = bVar2.f1918e0;
            bVar.f1744V = bVar2.f1920f0;
            bVar.f1745W = bVar2.f1922g0;
            bVar.f1748Z = bVar2.f1889G;
            bVar.f1753c = bVar2.f1923h;
            bVar.f1749a = bVar2.f1919f;
            bVar.f1751b = bVar2.f1921g;
            bVar.width = bVar2.f1915d;
            bVar.height = bVar2.f1917e;
            String str = bVar2.f1934m0;
            if (str != null) {
                bVar.f1754c0 = str;
            }
            bVar.f1756d0 = bVar2.f1942q0;
            bVar.setMarginStart(bVar2.f1895M);
            bVar.setMarginEnd(this.f1866e.f1894L);
            bVar.mo2451a();
        }

        /* renamed from: e */
        public C0467a clone() {
            C0467a aVar = new C0467a();
            aVar.f1866e.mo2518a(this.f1866e);
            aVar.f1865d.mo2520a(this.f1865d);
            aVar.f1864c.mo2522a(this.f1864c);
            aVar.f1867f.mo2524a(this.f1867f);
            aVar.f1862a = this.f1862a;
            aVar.f1869h = this.f1869h;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$b */
    public static class C0469b {

        /* renamed from: r0 */
        private static SparseIntArray f1882r0;

        /* renamed from: A */
        public String f1883A = null;

        /* renamed from: B */
        public int f1884B = -1;

        /* renamed from: C */
        public int f1885C = 0;

        /* renamed from: D */
        public float f1886D = 0.0f;

        /* renamed from: E */
        public int f1887E = -1;

        /* renamed from: F */
        public int f1888F = -1;

        /* renamed from: G */
        public int f1889G = -1;

        /* renamed from: H */
        public int f1890H = 0;

        /* renamed from: I */
        public int f1891I = 0;

        /* renamed from: J */
        public int f1892J = 0;

        /* renamed from: K */
        public int f1893K = 0;

        /* renamed from: L */
        public int f1894L = 0;

        /* renamed from: M */
        public int f1895M = 0;

        /* renamed from: N */
        public int f1896N = 0;

        /* renamed from: O */
        public int f1897O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f1898P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f1899Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f1900R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f1901S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f1902T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f1903U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f1904V = -1.0f;

        /* renamed from: W */
        public float f1905W = -1.0f;

        /* renamed from: X */
        public int f1906X = 0;

        /* renamed from: Y */
        public int f1907Y = 0;

        /* renamed from: Z */
        public int f1908Z = 0;

        /* renamed from: a */
        public boolean f1909a = false;

        /* renamed from: a0 */
        public int f1910a0 = 0;

        /* renamed from: b */
        public boolean f1911b = false;

        /* renamed from: b0 */
        public int f1912b0 = 0;

        /* renamed from: c */
        public boolean f1913c = false;

        /* renamed from: c0 */
        public int f1914c0 = 0;

        /* renamed from: d */
        public int f1915d;

        /* renamed from: d0 */
        public int f1916d0 = 0;

        /* renamed from: e */
        public int f1917e;

        /* renamed from: e0 */
        public int f1918e0 = 0;

        /* renamed from: f */
        public int f1919f = -1;

        /* renamed from: f0 */
        public float f1920f0 = 1.0f;

        /* renamed from: g */
        public int f1921g = -1;

        /* renamed from: g0 */
        public float f1922g0 = 1.0f;

        /* renamed from: h */
        public float f1923h = -1.0f;

        /* renamed from: h0 */
        public int f1924h0 = -1;

        /* renamed from: i */
        public boolean f1925i = true;

        /* renamed from: i0 */
        public int f1926i0 = 0;

        /* renamed from: j */
        public int f1927j = -1;

        /* renamed from: j0 */
        public int f1928j0 = -1;

        /* renamed from: k */
        public int f1929k = -1;

        /* renamed from: k0 */
        public int[] f1930k0;

        /* renamed from: l */
        public int f1931l = -1;

        /* renamed from: l0 */
        public String f1932l0;

        /* renamed from: m */
        public int f1933m = -1;

        /* renamed from: m0 */
        public String f1934m0;

        /* renamed from: n */
        public int f1935n = -1;

        /* renamed from: n0 */
        public boolean f1936n0 = false;

        /* renamed from: o */
        public int f1937o = -1;

        /* renamed from: o0 */
        public boolean f1938o0 = false;

        /* renamed from: p */
        public int f1939p = -1;

        /* renamed from: p0 */
        public boolean f1940p0 = true;

        /* renamed from: q */
        public int f1941q = -1;

        /* renamed from: q0 */
        public int f1942q0 = 0;

        /* renamed from: r */
        public int f1943r = -1;

        /* renamed from: s */
        public int f1944s = -1;

        /* renamed from: t */
        public int f1945t = -1;

        /* renamed from: u */
        public int f1946u = -1;

        /* renamed from: v */
        public int f1947v = -1;

        /* renamed from: w */
        public int f1948w = -1;

        /* renamed from: x */
        public int f1949x = -1;

        /* renamed from: y */
        public float f1950y = 0.5f;

        /* renamed from: z */
        public float f1951z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1882r0 = sparseIntArray;
            sparseIntArray.append(C0478j.f2093K5, 24);
            f1882r0.append(C0478j.f2101L5, 25);
            f1882r0.append(C0478j.f2117N5, 28);
            f1882r0.append(C0478j.f2125O5, 29);
            f1882r0.append(C0478j.f2165T5, 35);
            f1882r0.append(C0478j.f2157S5, 34);
            f1882r0.append(C0478j.f2401u5, 4);
            f1882r0.append(C0478j.f2392t5, 3);
            f1882r0.append(C0478j.f2374r5, 1);
            f1882r0.append(C0478j.f2213Z5, 6);
            f1882r0.append(C0478j.f2222a6, 7);
            f1882r0.append(C0478j.f2019B5, 17);
            f1882r0.append(C0478j.f2028C5, 18);
            f1882r0.append(C0478j.f2037D5, 19);
            f1882r0.append(C0478j.f2338n5, 90);
            f1882r0.append(C0478j.f2212Z4, 26);
            f1882r0.append(C0478j.f2133P5, 31);
            f1882r0.append(C0478j.f2141Q5, 32);
            f1882r0.append(C0478j.f2010A5, 10);
            f1882r0.append(C0478j.f2446z5, 9);
            f1882r0.append(C0478j.f2249d6, 13);
            f1882r0.append(C0478j.f2276g6, 16);
            f1882r0.append(C0478j.f2258e6, 14);
            f1882r0.append(C0478j.f2231b6, 11);
            f1882r0.append(C0478j.f2267f6, 15);
            f1882r0.append(C0478j.f2240c6, 12);
            f1882r0.append(C0478j.f2189W5, 38);
            f1882r0.append(C0478j.f2077I5, 37);
            f1882r0.append(C0478j.f2069H5, 39);
            f1882r0.append(C0478j.f2181V5, 40);
            f1882r0.append(C0478j.f2061G5, 20);
            f1882r0.append(C0478j.f2173U5, 36);
            f1882r0.append(C0478j.f2437y5, 5);
            f1882r0.append(C0478j.f2085J5, 91);
            f1882r0.append(C0478j.f2149R5, 91);
            f1882r0.append(C0478j.f2109M5, 91);
            f1882r0.append(C0478j.f2383s5, 91);
            f1882r0.append(C0478j.f2365q5, 91);
            f1882r0.append(C0478j.f2239c5, 23);
            f1882r0.append(C0478j.f2257e5, 27);
            f1882r0.append(C0478j.f2275g5, 30);
            f1882r0.append(C0478j.f2284h5, 8);
            f1882r0.append(C0478j.f2248d5, 33);
            f1882r0.append(C0478j.f2266f5, 2);
            f1882r0.append(C0478j.f2221a5, 22);
            f1882r0.append(C0478j.f2230b5, 21);
            f1882r0.append(C0478j.f2197X5, 41);
            f1882r0.append(C0478j.f2045E5, 42);
            f1882r0.append(C0478j.f2356p5, 41);
            f1882r0.append(C0478j.f2347o5, 42);
            f1882r0.append(C0478j.f2285h6, 76);
            f1882r0.append(C0478j.f2410v5, 61);
            f1882r0.append(C0478j.f2428x5, 62);
            f1882r0.append(C0478j.f2419w5, 63);
            f1882r0.append(C0478j.f2205Y5, 69);
            f1882r0.append(C0478j.f2053F5, 70);
            f1882r0.append(C0478j.f2320l5, 71);
            f1882r0.append(C0478j.f2302j5, 72);
            f1882r0.append(C0478j.f2311k5, 73);
            f1882r0.append(C0478j.f2329m5, 74);
            f1882r0.append(C0478j.f2293i5, 75);
        }

        /* renamed from: a */
        public void mo2518a(C0469b bVar) {
            this.f1909a = bVar.f1909a;
            this.f1915d = bVar.f1915d;
            this.f1911b = bVar.f1911b;
            this.f1917e = bVar.f1917e;
            this.f1919f = bVar.f1919f;
            this.f1921g = bVar.f1921g;
            this.f1923h = bVar.f1923h;
            this.f1925i = bVar.f1925i;
            this.f1927j = bVar.f1927j;
            this.f1929k = bVar.f1929k;
            this.f1931l = bVar.f1931l;
            this.f1933m = bVar.f1933m;
            this.f1935n = bVar.f1935n;
            this.f1937o = bVar.f1937o;
            this.f1939p = bVar.f1939p;
            this.f1941q = bVar.f1941q;
            this.f1943r = bVar.f1943r;
            this.f1944s = bVar.f1944s;
            this.f1945t = bVar.f1945t;
            this.f1946u = bVar.f1946u;
            this.f1947v = bVar.f1947v;
            this.f1948w = bVar.f1948w;
            this.f1949x = bVar.f1949x;
            this.f1950y = bVar.f1950y;
            this.f1951z = bVar.f1951z;
            this.f1883A = bVar.f1883A;
            this.f1884B = bVar.f1884B;
            this.f1885C = bVar.f1885C;
            this.f1886D = bVar.f1886D;
            this.f1887E = bVar.f1887E;
            this.f1888F = bVar.f1888F;
            this.f1889G = bVar.f1889G;
            this.f1890H = bVar.f1890H;
            this.f1891I = bVar.f1891I;
            this.f1892J = bVar.f1892J;
            this.f1893K = bVar.f1893K;
            this.f1894L = bVar.f1894L;
            this.f1895M = bVar.f1895M;
            this.f1896N = bVar.f1896N;
            this.f1897O = bVar.f1897O;
            this.f1898P = bVar.f1898P;
            this.f1899Q = bVar.f1899Q;
            this.f1900R = bVar.f1900R;
            this.f1901S = bVar.f1901S;
            this.f1902T = bVar.f1902T;
            this.f1903U = bVar.f1903U;
            this.f1904V = bVar.f1904V;
            this.f1905W = bVar.f1905W;
            this.f1906X = bVar.f1906X;
            this.f1907Y = bVar.f1907Y;
            this.f1908Z = bVar.f1908Z;
            this.f1910a0 = bVar.f1910a0;
            this.f1912b0 = bVar.f1912b0;
            this.f1914c0 = bVar.f1914c0;
            this.f1916d0 = bVar.f1916d0;
            this.f1918e0 = bVar.f1918e0;
            this.f1920f0 = bVar.f1920f0;
            this.f1922g0 = bVar.f1922g0;
            this.f1924h0 = bVar.f1924h0;
            this.f1926i0 = bVar.f1926i0;
            this.f1928j0 = bVar.f1928j0;
            this.f1934m0 = bVar.f1934m0;
            int[] iArr = bVar.f1930k0;
            if (iArr == null || bVar.f1932l0 != null) {
                this.f1930k0 = null;
            } else {
                this.f1930k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1932l0 = bVar.f1932l0;
            this.f1936n0 = bVar.f1936n0;
            this.f1938o0 = bVar.f1938o0;
            this.f1940p0 = bVar.f1940p0;
            this.f1942q0 = bVar.f1942q0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2519b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0478j.f2204Y4);
            this.f1911b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1882r0.get(index);
                switch (i2) {
                    case 1:
                        this.f1943r = C0466e.m2006t(obtainStyledAttributes, index, this.f1943r);
                        break;
                    case 2:
                        this.f1893K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1893K);
                        break;
                    case 3:
                        this.f1941q = C0466e.m2006t(obtainStyledAttributes, index, this.f1941q);
                        break;
                    case 4:
                        this.f1939p = C0466e.m2006t(obtainStyledAttributes, index, this.f1939p);
                        break;
                    case 5:
                        this.f1883A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f1887E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1887E);
                        break;
                    case 7:
                        this.f1888F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1888F);
                        break;
                    case 8:
                        this.f1894L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1894L);
                        break;
                    case 9:
                        this.f1949x = C0466e.m2006t(obtainStyledAttributes, index, this.f1949x);
                        break;
                    case 10:
                        this.f1948w = C0466e.m2006t(obtainStyledAttributes, index, this.f1948w);
                        break;
                    case 11:
                        this.f1900R = obtainStyledAttributes.getDimensionPixelSize(index, this.f1900R);
                        break;
                    case 12:
                        this.f1901S = obtainStyledAttributes.getDimensionPixelSize(index, this.f1901S);
                        break;
                    case 13:
                        this.f1897O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1897O);
                        break;
                    case 14:
                        this.f1899Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1899Q);
                        break;
                    case 15:
                        this.f1902T = obtainStyledAttributes.getDimensionPixelSize(index, this.f1902T);
                        break;
                    case 16:
                        this.f1898P = obtainStyledAttributes.getDimensionPixelSize(index, this.f1898P);
                        break;
                    case 17:
                        this.f1919f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1919f);
                        break;
                    case 18:
                        this.f1921g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1921g);
                        break;
                    case 19:
                        this.f1923h = obtainStyledAttributes.getFloat(index, this.f1923h);
                        break;
                    case 20:
                        this.f1950y = obtainStyledAttributes.getFloat(index, this.f1950y);
                        break;
                    case 21:
                        this.f1917e = obtainStyledAttributes.getLayoutDimension(index, this.f1917e);
                        break;
                    case 22:
                        this.f1915d = obtainStyledAttributes.getLayoutDimension(index, this.f1915d);
                        break;
                    case 23:
                        this.f1890H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1890H);
                        break;
                    case 24:
                        this.f1927j = C0466e.m2006t(obtainStyledAttributes, index, this.f1927j);
                        break;
                    case 25:
                        this.f1929k = C0466e.m2006t(obtainStyledAttributes, index, this.f1929k);
                        break;
                    case 26:
                        this.f1889G = obtainStyledAttributes.getInt(index, this.f1889G);
                        break;
                    case 27:
                        this.f1891I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1891I);
                        break;
                    case 28:
                        this.f1931l = C0466e.m2006t(obtainStyledAttributes, index, this.f1931l);
                        break;
                    case 29:
                        this.f1933m = C0466e.m2006t(obtainStyledAttributes, index, this.f1933m);
                        break;
                    case 30:
                        this.f1895M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1895M);
                        break;
                    case 31:
                        this.f1946u = C0466e.m2006t(obtainStyledAttributes, index, this.f1946u);
                        break;
                    case 32:
                        this.f1947v = C0466e.m2006t(obtainStyledAttributes, index, this.f1947v);
                        break;
                    case 33:
                        this.f1892J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1892J);
                        break;
                    case 34:
                        this.f1937o = C0466e.m2006t(obtainStyledAttributes, index, this.f1937o);
                        break;
                    case 35:
                        this.f1935n = C0466e.m2006t(obtainStyledAttributes, index, this.f1935n);
                        break;
                    case C0478j.f2006A1 /*36*/:
                        this.f1951z = obtainStyledAttributes.getFloat(index, this.f1951z);
                        break;
                    case 37:
                        this.f1905W = obtainStyledAttributes.getFloat(index, this.f1905W);
                        break;
                    case 38:
                        this.f1904V = obtainStyledAttributes.getFloat(index, this.f1904V);
                        break;
                    case 39:
                        this.f1906X = obtainStyledAttributes.getInt(index, this.f1906X);
                        break;
                    case 40:
                        this.f1907Y = obtainStyledAttributes.getInt(index, this.f1907Y);
                        break;
                    case C0478j.f2077I5 /*41*/:
                        C0466e.m2007u(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0466e.m2007u(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f1884B = C0466e.m2006t(obtainStyledAttributes, index, this.f1884B);
                                break;
                            case 62:
                                this.f1885C = obtainStyledAttributes.getDimensionPixelSize(index, this.f1885C);
                                break;
                            case 63:
                                this.f1886D = obtainStyledAttributes.getFloat(index, this.f1886D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f1920f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f1922g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1924h0 = obtainStyledAttributes.getInt(index, this.f1924h0);
                                        continue;
                                    case 73:
                                        this.f1926i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1926i0);
                                        continue;
                                    case 74:
                                        this.f1932l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1940p0 = obtainStyledAttributes.getBoolean(index, this.f1940p0);
                                        continue;
                                    case 76:
                                        this.f1942q0 = obtainStyledAttributes.getInt(index, this.f1942q0);
                                        continue;
                                    case 77:
                                        this.f1944s = C0466e.m2006t(obtainStyledAttributes, index, this.f1944s);
                                        continue;
                                    case 78:
                                        this.f1945t = C0466e.m2006t(obtainStyledAttributes, index, this.f1945t);
                                        continue;
                                    case 79:
                                        this.f1903U = obtainStyledAttributes.getDimensionPixelSize(index, this.f1903U);
                                        continue;
                                    case 80:
                                        this.f1896N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1896N);
                                        continue;
                                    case 81:
                                        this.f1908Z = obtainStyledAttributes.getInt(index, this.f1908Z);
                                        continue;
                                    case 82:
                                        this.f1910a0 = obtainStyledAttributes.getInt(index, this.f1910a0);
                                        continue;
                                    case 83:
                                        this.f1914c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1914c0);
                                        continue;
                                    case 84:
                                        this.f1912b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1912b0);
                                        continue;
                                    case 85:
                                        this.f1918e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1918e0);
                                        continue;
                                    case 86:
                                        this.f1916d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1916d0);
                                        continue;
                                    case 87:
                                        this.f1936n0 = obtainStyledAttributes.getBoolean(index, this.f1936n0);
                                        continue;
                                    case 88:
                                        this.f1938o0 = obtainStyledAttributes.getBoolean(index, this.f1938o0);
                                        continue;
                                    case 89:
                                        this.f1934m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1925i = obtainStyledAttributes.getBoolean(index, this.f1925i);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(f1882r0.get(index));
                                Log.w("ConstraintSet", sb.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$c */
    public static class C0470c {

        /* renamed from: o */
        private static SparseIntArray f1952o;

        /* renamed from: a */
        public boolean f1953a = false;

        /* renamed from: b */
        public int f1954b = -1;

        /* renamed from: c */
        public int f1955c = 0;

        /* renamed from: d */
        public String f1956d = null;

        /* renamed from: e */
        public int f1957e = -1;

        /* renamed from: f */
        public int f1958f = 0;

        /* renamed from: g */
        public float f1959g = Float.NaN;

        /* renamed from: h */
        public int f1960h = -1;

        /* renamed from: i */
        public float f1961i = Float.NaN;

        /* renamed from: j */
        public float f1962j = Float.NaN;

        /* renamed from: k */
        public int f1963k = -1;

        /* renamed from: l */
        public String f1964l = null;

        /* renamed from: m */
        public int f1965m = -3;

        /* renamed from: n */
        public int f1966n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1952o = sparseIntArray;
            sparseIntArray.append(C0478j.f2393t6, 1);
            f1952o.append(C0478j.f2411v6, 2);
            f1952o.append(C0478j.f2447z6, 3);
            f1952o.append(C0478j.f2384s6, 4);
            f1952o.append(C0478j.f2375r6, 5);
            f1952o.append(C0478j.f2366q6, 6);
            f1952o.append(C0478j.f2402u6, 7);
            f1952o.append(C0478j.f2438y6, 8);
            f1952o.append(C0478j.f2429x6, 9);
            f1952o.append(C0478j.f2420w6, 10);
        }

        /* renamed from: a */
        public void mo2520a(C0470c cVar) {
            this.f1953a = cVar.f1953a;
            this.f1954b = cVar.f1954b;
            this.f1956d = cVar.f1956d;
            this.f1957e = cVar.f1957e;
            this.f1958f = cVar.f1958f;
            this.f1961i = cVar.f1961i;
            this.f1959g = cVar.f1959g;
            this.f1960h = cVar.f1960h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2521b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0478j.f2357p6);
            this.f1953a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1952o.get(index)) {
                    case 1:
                        this.f1961i = obtainStyledAttributes.getFloat(index, this.f1961i);
                        break;
                    case 2:
                        this.f1957e = obtainStyledAttributes.getInt(index, this.f1957e);
                        break;
                    case 3:
                        this.f1956d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C1885b.f7265c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1958f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1954b = C0466e.m2006t(obtainStyledAttributes, index, this.f1954b);
                        break;
                    case 6:
                        this.f1955c = obtainStyledAttributes.getInteger(index, this.f1955c);
                        break;
                    case 7:
                        this.f1959g = obtainStyledAttributes.getFloat(index, this.f1959g);
                        break;
                    case 8:
                        this.f1963k = obtainStyledAttributes.getInteger(index, this.f1963k);
                        break;
                    case 9:
                        this.f1962j = obtainStyledAttributes.getFloat(index, this.f1962j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f1965m = obtainStyledAttributes.getInteger(index, this.f1966n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1964l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f1965m = -1;
                                    break;
                                } else {
                                    this.f1966n = obtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1966n = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                        }
                        this.f1965m = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$d */
    public static class C0471d {

        /* renamed from: a */
        public boolean f1967a = false;

        /* renamed from: b */
        public int f1968b = 0;

        /* renamed from: c */
        public int f1969c = 0;

        /* renamed from: d */
        public float f1970d = 1.0f;

        /* renamed from: e */
        public float f1971e = Float.NaN;

        /* renamed from: a */
        public void mo2522a(C0471d dVar) {
            this.f1967a = dVar.f1967a;
            this.f1968b = dVar.f1968b;
            this.f1970d = dVar.f1970d;
            this.f1971e = dVar.f1971e;
            this.f1969c = dVar.f1969c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2523b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0478j.f2110M6);
            this.f1967a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0478j.f2126O6) {
                    this.f1970d = obtainStyledAttributes.getFloat(index, this.f1970d);
                } else if (index == C0478j.f2118N6) {
                    this.f1968b = obtainStyledAttributes.getInt(index, this.f1968b);
                    this.f1968b = C0466e.f1854f[this.f1968b];
                } else if (index == C0478j.f2142Q6) {
                    this.f1969c = obtainStyledAttributes.getInt(index, this.f1969c);
                } else if (index == C0478j.f2134P6) {
                    this.f1971e = obtainStyledAttributes.getFloat(index, this.f1971e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e */
    public static class C0472e {

        /* renamed from: o */
        private static SparseIntArray f1972o;

        /* renamed from: a */
        public boolean f1973a = false;

        /* renamed from: b */
        public float f1974b = 0.0f;

        /* renamed from: c */
        public float f1975c = 0.0f;

        /* renamed from: d */
        public float f1976d = 0.0f;

        /* renamed from: e */
        public float f1977e = 1.0f;

        /* renamed from: f */
        public float f1978f = 1.0f;

        /* renamed from: g */
        public float f1979g = Float.NaN;

        /* renamed from: h */
        public float f1980h = Float.NaN;

        /* renamed from: i */
        public int f1981i = -1;

        /* renamed from: j */
        public float f1982j = 0.0f;

        /* renamed from: k */
        public float f1983k = 0.0f;

        /* renamed from: l */
        public float f1984l = 0.0f;

        /* renamed from: m */
        public boolean f1985m = false;

        /* renamed from: n */
        public float f1986n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1972o = sparseIntArray;
            sparseIntArray.append(C0478j.f2322l7, 1);
            f1972o.append(C0478j.f2331m7, 2);
            f1972o.append(C0478j.f2340n7, 3);
            f1972o.append(C0478j.f2304j7, 4);
            f1972o.append(C0478j.f2313k7, 5);
            f1972o.append(C0478j.f2268f7, 6);
            f1972o.append(C0478j.f2277g7, 7);
            f1972o.append(C0478j.f2286h7, 8);
            f1972o.append(C0478j.f2295i7, 9);
            f1972o.append(C0478j.f2349o7, 10);
            f1972o.append(C0478j.f2358p7, 11);
            f1972o.append(C0478j.f2367q7, 12);
        }

        /* renamed from: a */
        public void mo2524a(C0472e eVar) {
            this.f1973a = eVar.f1973a;
            this.f1974b = eVar.f1974b;
            this.f1975c = eVar.f1975c;
            this.f1976d = eVar.f1976d;
            this.f1977e = eVar.f1977e;
            this.f1978f = eVar.f1978f;
            this.f1979g = eVar.f1979g;
            this.f1980h = eVar.f1980h;
            this.f1981i = eVar.f1981i;
            this.f1982j = eVar.f1982j;
            this.f1983k = eVar.f1983k;
            this.f1984l = eVar.f1984l;
            this.f1985m = eVar.f1985m;
            this.f1986n = eVar.f1986n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2525b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0478j.f2259e7);
            this.f1973a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1972o.get(index)) {
                    case 1:
                        this.f1974b = obtainStyledAttributes.getFloat(index, this.f1974b);
                        break;
                    case 2:
                        this.f1975c = obtainStyledAttributes.getFloat(index, this.f1975c);
                        break;
                    case 3:
                        this.f1976d = obtainStyledAttributes.getFloat(index, this.f1976d);
                        break;
                    case 4:
                        this.f1977e = obtainStyledAttributes.getFloat(index, this.f1977e);
                        break;
                    case 5:
                        this.f1978f = obtainStyledAttributes.getFloat(index, this.f1978f);
                        break;
                    case 6:
                        this.f1979g = obtainStyledAttributes.getDimension(index, this.f1979g);
                        break;
                    case 7:
                        this.f1980h = obtainStyledAttributes.getDimension(index, this.f1980h);
                        break;
                    case 8:
                        this.f1982j = obtainStyledAttributes.getDimension(index, this.f1982j);
                        break;
                    case 9:
                        this.f1983k = obtainStyledAttributes.getDimension(index, this.f1983k);
                        break;
                    case 10:
                        this.f1984l = obtainStyledAttributes.getDimension(index, this.f1984l);
                        break;
                    case 11:
                        this.f1985m = true;
                        this.f1986n = obtainStyledAttributes.getDimension(index, this.f1986n);
                        break;
                    case 12:
                        this.f1981i = C0466e.m2006t(obtainStyledAttributes, index, this.f1981i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1855g.append(C0478j.f2005A0, 25);
        f1855g.append(C0478j.f2014B0, 26);
        f1855g.append(C0478j.f2032D0, 29);
        f1855g.append(C0478j.f2040E0, 30);
        f1855g.append(C0478j.f2088K0, 36);
        f1855g.append(C0478j.f2080J0, 35);
        f1855g.append(C0478j.f2279h0, 4);
        f1855g.append(C0478j.f2270g0, 3);
        f1855g.append(C0478j.f2234c0, 1);
        f1855g.append(C0478j.f2252e0, 91);
        f1855g.append(C0478j.f2243d0, 92);
        f1855g.append(C0478j.f2160T0, 6);
        f1855g.append(C0478j.f2168U0, 7);
        f1855g.append(C0478j.f2342o0, 17);
        f1855g.append(C0478j.f2351p0, 18);
        f1855g.append(C0478j.f2360q0, 19);
        f1855g.append(C0478j.f2199Y, 99);
        f1855g.append(C0478j.f2395u, 27);
        f1855g.append(C0478j.f2048F0, 32);
        f1855g.append(C0478j.f2056G0, 33);
        f1855g.append(C0478j.f2333n0, 10);
        f1855g.append(C0478j.f2324m0, 9);
        f1855g.append(C0478j.f2192X0, 13);
        f1855g.append(C0478j.f2217a1, 16);
        f1855g.append(C0478j.f2200Y0, 14);
        f1855g.append(C0478j.f2176V0, 11);
        f1855g.append(C0478j.f2208Z0, 15);
        f1855g.append(C0478j.f2184W0, 12);
        f1855g.append(C0478j.f2112N0, 40);
        f1855g.append(C0478j.f2432y0, 39);
        f1855g.append(C0478j.f2423x0, 41);
        f1855g.append(C0478j.f2104M0, 42);
        f1855g.append(C0478j.f2414w0, 20);
        f1855g.append(C0478j.f2096L0, 37);
        f1855g.append(C0478j.f2315l0, 5);
        f1855g.append(C0478j.f2441z0, 87);
        f1855g.append(C0478j.f2072I0, 87);
        f1855g.append(C0478j.f2023C0, 87);
        f1855g.append(C0478j.f2261f0, 87);
        f1855g.append(C0478j.f2225b0, 87);
        f1855g.append(C0478j.f2440z, 24);
        f1855g.append(C0478j.f2013B, 28);
        f1855g.append(C0478j.f2111N, 31);
        f1855g.append(C0478j.f2119O, 8);
        f1855g.append(C0478j.f2004A, 34);
        f1855g.append(C0478j.f2022C, 2);
        f1855g.append(C0478j.f2422x, 23);
        f1855g.append(C0478j.f2431y, 21);
        f1855g.append(C0478j.f2120O0, 95);
        f1855g.append(C0478j.f2369r0, 96);
        f1855g.append(C0478j.f2413w, 22);
        f1855g.append(C0478j.f2031D, 43);
        f1855g.append(C0478j.f2135Q, 44);
        f1855g.append(C0478j.f2095L, 45);
        f1855g.append(C0478j.f2103M, 46);
        f1855g.append(C0478j.f2087K, 60);
        f1855g.append(C0478j.f2071I, 47);
        f1855g.append(C0478j.f2079J, 48);
        f1855g.append(C0478j.f2039E, 49);
        f1855g.append(C0478j.f2047F, 50);
        f1855g.append(C0478j.f2055G, 51);
        f1855g.append(C0478j.f2063H, 52);
        f1855g.append(C0478j.f2127P, 53);
        f1855g.append(C0478j.f2128P0, 54);
        f1855g.append(C0478j.f2378s0, 55);
        f1855g.append(C0478j.f2136Q0, 56);
        f1855g.append(C0478j.f2387t0, 57);
        f1855g.append(C0478j.f2144R0, 58);
        f1855g.append(C0478j.f2396u0, 59);
        f1855g.append(C0478j.f2288i0, 61);
        f1855g.append(C0478j.f2306k0, 62);
        f1855g.append(C0478j.f2297j0, 63);
        f1855g.append(C0478j.f2143R, 64);
        f1855g.append(C0478j.f2307k1, 65);
        f1855g.append(C0478j.f2191X, 66);
        f1855g.append(C0478j.f2316l1, 67);
        f1855g.append(C0478j.f2244d1, 79);
        f1855g.append(C0478j.f2404v, 38);
        f1855g.append(C0478j.f2235c1, 68);
        f1855g.append(C0478j.f2152S0, 69);
        f1855g.append(C0478j.f2405v0, 70);
        f1855g.append(C0478j.f2226b1, 97);
        f1855g.append(C0478j.f2175V, 71);
        f1855g.append(C0478j.f2159T, 72);
        f1855g.append(C0478j.f2167U, 73);
        f1855g.append(C0478j.f2183W, 74);
        f1855g.append(C0478j.f2151S, 75);
        f1855g.append(C0478j.f2253e1, 76);
        f1855g.append(C0478j.f2064H0, 77);
        f1855g.append(C0478j.f2325m1, 78);
        f1855g.append(C0478j.f2216a0, 80);
        f1855g.append(C0478j.f2207Z, 81);
        f1855g.append(C0478j.f2262f1, 82);
        f1855g.append(C0478j.f2298j1, 83);
        f1855g.append(C0478j.f2289i1, 84);
        f1855g.append(C0478j.f2280h1, 85);
        f1855g.append(C0478j.f2271g1, 86);
        SparseIntArray sparseIntArray = f1856h;
        int i = C0478j.f2147R3;
        sparseIntArray.append(i, 6);
        f1856h.append(i, 7);
        f1856h.append(C0478j.f2106M2, 27);
        f1856h.append(C0478j.f2171U3, 13);
        f1856h.append(C0478j.f2195X3, 16);
        f1856h.append(C0478j.f2179V3, 14);
        f1856h.append(C0478j.f2155S3, 11);
        f1856h.append(C0478j.f2187W3, 15);
        f1856h.append(C0478j.f2163T3, 12);
        f1856h.append(C0478j.f2099L3, 40);
        f1856h.append(C0478j.f2043E3, 39);
        f1856h.append(C0478j.f2035D3, 41);
        f1856h.append(C0478j.f2091K3, 42);
        f1856h.append(C0478j.f2026C3, 20);
        f1856h.append(C0478j.f2083J3, 37);
        f1856h.append(C0478j.f2417w3, 5);
        f1856h.append(C0478j.f2051F3, 87);
        f1856h.append(C0478j.f2075I3, 87);
        f1856h.append(C0478j.f2059G3, 87);
        f1856h.append(C0478j.f2390t3, 87);
        f1856h.append(C0478j.f2381s3, 87);
        f1856h.append(C0478j.f2146R2, 24);
        f1856h.append(C0478j.f2162T2, 28);
        f1856h.append(C0478j.f2264f3, 31);
        f1856h.append(C0478j.f2273g3, 8);
        f1856h.append(C0478j.f2154S2, 34);
        f1856h.append(C0478j.f2170U2, 2);
        f1856h.append(C0478j.f2130P2, 23);
        f1856h.append(C0478j.f2138Q2, 21);
        f1856h.append(C0478j.f2107M3, 95);
        f1856h.append(C0478j.f2426x3, 96);
        f1856h.append(C0478j.f2122O2, 22);
        f1856h.append(C0478j.f2178V2, 43);
        f1856h.append(C0478j.f2291i3, 44);
        f1856h.append(C0478j.f2246d3, 45);
        f1856h.append(C0478j.f2255e3, 46);
        f1856h.append(C0478j.f2237c3, 60);
        f1856h.append(C0478j.f2219a3, 47);
        f1856h.append(C0478j.f2228b3, 48);
        f1856h.append(C0478j.f2186W2, 49);
        f1856h.append(C0478j.f2194X2, 50);
        f1856h.append(C0478j.f2202Y2, 51);
        f1856h.append(C0478j.f2210Z2, 52);
        f1856h.append(C0478j.f2282h3, 53);
        f1856h.append(C0478j.f2115N3, 54);
        f1856h.append(C0478j.f2435y3, 55);
        f1856h.append(C0478j.f2123O3, 56);
        f1856h.append(C0478j.f2444z3, 57);
        f1856h.append(C0478j.f2131P3, 58);
        f1856h.append(C0478j.f2008A3, 59);
        f1856h.append(C0478j.f2408v3, 62);
        f1856h.append(C0478j.f2399u3, 63);
        f1856h.append(C0478j.f2300j3, 64);
        f1856h.append(C0478j.f2292i4, 65);
        f1856h.append(C0478j.f2354p3, 66);
        f1856h.append(C0478j.f2301j4, 67);
        f1856h.append(C0478j.f2220a4, 79);
        f1856h.append(C0478j.f2114N2, 38);
        f1856h.append(C0478j.f2229b4, 98);
        f1856h.append(C0478j.f2211Z3, 68);
        f1856h.append(C0478j.f2139Q3, 69);
        f1856h.append(C0478j.f2017B3, 70);
        f1856h.append(C0478j.f2336n3, 71);
        f1856h.append(C0478j.f2318l3, 72);
        f1856h.append(C0478j.f2327m3, 73);
        f1856h.append(C0478j.f2345o3, 74);
        f1856h.append(C0478j.f2309k3, 75);
        f1856h.append(C0478j.f2238c4, 76);
        f1856h.append(C0478j.f2067H3, 77);
        f1856h.append(C0478j.f2310k4, 78);
        f1856h.append(C0478j.f2372r3, 80);
        f1856h.append(C0478j.f2363q3, 81);
        f1856h.append(C0478j.f2247d4, 82);
        f1856h.append(C0478j.f2283h4, 83);
        f1856h.append(C0478j.f2274g4, 84);
        f1856h.append(C0478j.f2265f4, 85);
        f1856h.append(C0478j.f2256e4, 86);
        f1856h.append(C0478j.f2203Y3, 97);
    }

    /* renamed from: A */
    private String m2000A(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: o */
    private int[] m2003o(View view, String str) {
        int i;
        Object g;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0477i.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g = ((ConstraintLayout) view.getParent()).mo2425g(0, trim)) != null && (g instanceof Integer)) {
                i = ((Integer) g).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: p */
    private C0467a m2004p(Context context, AttributeSet attributeSet, boolean z) {
        C0467a aVar = new C0467a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C0478j.f2098L2 : C0478j.f2386t);
        m2010x(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: q */
    private C0467a m2005q(int i) {
        if (!this.f1861e.containsKey(Integer.valueOf(i))) {
            this.f1861e.put(Integer.valueOf(i), new C0467a());
        }
        return this.f1861e.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static int m2006t(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: u */
    static void m2007u(Object obj, TypedArray typedArray, int i, int i2) {
        int i3;
        if (obj != null) {
            int i4 = typedArray.peekValue(i).type;
            if (i4 != 3) {
                int i5 = -2;
                boolean z = false;
                if (i4 != 5) {
                    int i6 = typedArray.getInt(i, 0);
                    if (i6 != -4) {
                        i5 = (i6 == -3 || !(i6 == -2 || i6 == -1)) ? 0 : i6;
                    } else {
                        z = true;
                    }
                } else {
                    i5 = typedArray.getDimensionPixelSize(i, 0);
                }
                if (obj instanceof ConstraintLayout.C0455b) {
                    ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) obj;
                    if (i2 == 0) {
                        bVar.width = i5;
                        bVar.f1750a0 = z;
                        return;
                    }
                    bVar.height = i5;
                    bVar.f1752b0 = z;
                } else if (obj instanceof C0469b) {
                    C0469b bVar2 = (C0469b) obj;
                    if (i2 == 0) {
                        bVar2.f1915d = i5;
                        bVar2.f1936n0 = z;
                        return;
                    }
                    bVar2.f1917e = i5;
                    bVar2.f1938o0 = z;
                } else if (obj instanceof C0467a.C0468a) {
                    C0467a.C0468a aVar = (C0467a.C0468a) obj;
                    if (i2 == 0) {
                        aVar.mo2515b(23, i5);
                        i3 = 80;
                    } else {
                        aVar.mo2515b(21, i5);
                        i3 = 81;
                    }
                    aVar.mo2517d(i3, z);
                }
            } else {
                m2008v(obj, typedArray.getString(i), i2);
            }
        }
    }

    /* renamed from: v */
    static void m2008v(Object obj, String str, int i) {
        int i2;
        int i3;
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.C0455b) {
                            ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) obj;
                            if (i == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            m2009w(bVar, trim2);
                        } else if (obj instanceof C0469b) {
                            ((C0469b) obj).f1883A = trim2;
                        } else if (obj instanceof C0467a.C0468a) {
                            ((C0467a.C0468a) obj).mo2516c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.C0455b) {
                                ConstraintLayout.C0455b bVar2 = (ConstraintLayout.C0455b) obj;
                                if (i == 0) {
                                    bVar2.width = 0;
                                    bVar2.f1734L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.f1735M = parseFloat;
                            } else if (obj instanceof C0469b) {
                                C0469b bVar3 = (C0469b) obj;
                                if (i == 0) {
                                    bVar3.f1915d = 0;
                                    bVar3.f1905W = parseFloat;
                                    return;
                                }
                                bVar3.f1917e = 0;
                                bVar3.f1904V = parseFloat;
                            } else if (obj instanceof C0467a.C0468a) {
                                C0467a.C0468a aVar = (C0467a.C0468a) obj;
                                if (i == 0) {
                                    aVar.mo2515b(23, 0);
                                    i3 = 39;
                                } else {
                                    aVar.mo2515b(21, 0);
                                    i3 = 40;
                                }
                                aVar.mo2514a(i3, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.C0455b) {
                            ConstraintLayout.C0455b bVar4 = (ConstraintLayout.C0455b) obj;
                            if (i == 0) {
                                bVar4.width = 0;
                                bVar4.f1744V = max;
                                bVar4.f1738P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.f1745W = max;
                            bVar4.f1739Q = 2;
                        } else if (obj instanceof C0469b) {
                            C0469b bVar5 = (C0469b) obj;
                            if (i == 0) {
                                bVar5.f1915d = 0;
                                bVar5.f1920f0 = max;
                                bVar5.f1908Z = 2;
                                return;
                            }
                            bVar5.f1917e = 0;
                            bVar5.f1922g0 = max;
                            bVar5.f1910a0 = 2;
                        } else if (obj instanceof C0467a.C0468a) {
                            C0467a.C0468a aVar2 = (C0467a.C0468a) obj;
                            if (i == 0) {
                                aVar2.mo2515b(23, 0);
                                i2 = 54;
                            } else {
                                aVar2.mo2515b(21, 0);
                                i2 = 55;
                            }
                            aVar2.mo2515b(i2, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w */
    static void m2009w(ConstraintLayout.C0455b bVar, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.f1731I = str;
        bVar.f1732J = f;
        bVar.f1733K = i;
    }

    /* renamed from: x */
    private void m2010x(Context context, C0467a aVar, TypedArray typedArray, boolean z) {
        C0470c cVar;
        String str;
        C0470c cVar2;
        String str2;
        StringBuilder sb;
        if (z) {
            m2011y(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0478j.f2404v || C0478j.f2111N == index || C0478j.f2119O == index)) {
                aVar.f1865d.f1953a = true;
                aVar.f1866e.f1911b = true;
                aVar.f1864c.f1967a = true;
                aVar.f1867f.f1973a = true;
            }
            switch (f1855g.get(index)) {
                case 1:
                    C0469b bVar = aVar.f1866e;
                    bVar.f1943r = m2006t(typedArray, index, bVar.f1943r);
                    continue;
                case 2:
                    C0469b bVar2 = aVar.f1866e;
                    bVar2.f1893K = typedArray.getDimensionPixelSize(index, bVar2.f1893K);
                    continue;
                case 3:
                    C0469b bVar3 = aVar.f1866e;
                    bVar3.f1941q = m2006t(typedArray, index, bVar3.f1941q);
                    continue;
                case 4:
                    C0469b bVar4 = aVar.f1866e;
                    bVar4.f1939p = m2006t(typedArray, index, bVar4.f1939p);
                    continue;
                case 5:
                    aVar.f1866e.f1883A = typedArray.getString(index);
                    continue;
                case 6:
                    C0469b bVar5 = aVar.f1866e;
                    bVar5.f1887E = typedArray.getDimensionPixelOffset(index, bVar5.f1887E);
                    continue;
                case 7:
                    C0469b bVar6 = aVar.f1866e;
                    bVar6.f1888F = typedArray.getDimensionPixelOffset(index, bVar6.f1888F);
                    continue;
                case 8:
                    C0469b bVar7 = aVar.f1866e;
                    bVar7.f1894L = typedArray.getDimensionPixelSize(index, bVar7.f1894L);
                    continue;
                case 9:
                    C0469b bVar8 = aVar.f1866e;
                    bVar8.f1949x = m2006t(typedArray, index, bVar8.f1949x);
                    continue;
                case 10:
                    C0469b bVar9 = aVar.f1866e;
                    bVar9.f1948w = m2006t(typedArray, index, bVar9.f1948w);
                    continue;
                case 11:
                    C0469b bVar10 = aVar.f1866e;
                    bVar10.f1900R = typedArray.getDimensionPixelSize(index, bVar10.f1900R);
                    continue;
                case 12:
                    C0469b bVar11 = aVar.f1866e;
                    bVar11.f1901S = typedArray.getDimensionPixelSize(index, bVar11.f1901S);
                    continue;
                case 13:
                    C0469b bVar12 = aVar.f1866e;
                    bVar12.f1897O = typedArray.getDimensionPixelSize(index, bVar12.f1897O);
                    continue;
                case 14:
                    C0469b bVar13 = aVar.f1866e;
                    bVar13.f1899Q = typedArray.getDimensionPixelSize(index, bVar13.f1899Q);
                    continue;
                case 15:
                    C0469b bVar14 = aVar.f1866e;
                    bVar14.f1902T = typedArray.getDimensionPixelSize(index, bVar14.f1902T);
                    continue;
                case 16:
                    C0469b bVar15 = aVar.f1866e;
                    bVar15.f1898P = typedArray.getDimensionPixelSize(index, bVar15.f1898P);
                    continue;
                case 17:
                    C0469b bVar16 = aVar.f1866e;
                    bVar16.f1919f = typedArray.getDimensionPixelOffset(index, bVar16.f1919f);
                    continue;
                case 18:
                    C0469b bVar17 = aVar.f1866e;
                    bVar17.f1921g = typedArray.getDimensionPixelOffset(index, bVar17.f1921g);
                    continue;
                case 19:
                    C0469b bVar18 = aVar.f1866e;
                    bVar18.f1923h = typedArray.getFloat(index, bVar18.f1923h);
                    continue;
                case 20:
                    C0469b bVar19 = aVar.f1866e;
                    bVar19.f1950y = typedArray.getFloat(index, bVar19.f1950y);
                    continue;
                case 21:
                    C0469b bVar20 = aVar.f1866e;
                    bVar20.f1917e = typedArray.getLayoutDimension(index, bVar20.f1917e);
                    continue;
                case 22:
                    C0471d dVar = aVar.f1864c;
                    dVar.f1968b = typedArray.getInt(index, dVar.f1968b);
                    C0471d dVar2 = aVar.f1864c;
                    dVar2.f1968b = f1854f[dVar2.f1968b];
                    continue;
                case 23:
                    C0469b bVar21 = aVar.f1866e;
                    bVar21.f1915d = typedArray.getLayoutDimension(index, bVar21.f1915d);
                    continue;
                case 24:
                    C0469b bVar22 = aVar.f1866e;
                    bVar22.f1890H = typedArray.getDimensionPixelSize(index, bVar22.f1890H);
                    continue;
                case 25:
                    C0469b bVar23 = aVar.f1866e;
                    bVar23.f1927j = m2006t(typedArray, index, bVar23.f1927j);
                    continue;
                case 26:
                    C0469b bVar24 = aVar.f1866e;
                    bVar24.f1929k = m2006t(typedArray, index, bVar24.f1929k);
                    continue;
                case 27:
                    C0469b bVar25 = aVar.f1866e;
                    bVar25.f1889G = typedArray.getInt(index, bVar25.f1889G);
                    continue;
                case 28:
                    C0469b bVar26 = aVar.f1866e;
                    bVar26.f1891I = typedArray.getDimensionPixelSize(index, bVar26.f1891I);
                    continue;
                case 29:
                    C0469b bVar27 = aVar.f1866e;
                    bVar27.f1931l = m2006t(typedArray, index, bVar27.f1931l);
                    continue;
                case 30:
                    C0469b bVar28 = aVar.f1866e;
                    bVar28.f1933m = m2006t(typedArray, index, bVar28.f1933m);
                    continue;
                case 31:
                    C0469b bVar29 = aVar.f1866e;
                    bVar29.f1895M = typedArray.getDimensionPixelSize(index, bVar29.f1895M);
                    continue;
                case 32:
                    C0469b bVar30 = aVar.f1866e;
                    bVar30.f1946u = m2006t(typedArray, index, bVar30.f1946u);
                    continue;
                case 33:
                    C0469b bVar31 = aVar.f1866e;
                    bVar31.f1947v = m2006t(typedArray, index, bVar31.f1947v);
                    continue;
                case 34:
                    C0469b bVar32 = aVar.f1866e;
                    bVar32.f1892J = typedArray.getDimensionPixelSize(index, bVar32.f1892J);
                    continue;
                case 35:
                    C0469b bVar33 = aVar.f1866e;
                    bVar33.f1937o = m2006t(typedArray, index, bVar33.f1937o);
                    continue;
                case C0478j.f2006A1 /*36*/:
                    C0469b bVar34 = aVar.f1866e;
                    bVar34.f1935n = m2006t(typedArray, index, bVar34.f1935n);
                    continue;
                case 37:
                    C0469b bVar35 = aVar.f1866e;
                    bVar35.f1951z = typedArray.getFloat(index, bVar35.f1951z);
                    continue;
                case 38:
                    aVar.f1862a = typedArray.getResourceId(index, aVar.f1862a);
                    continue;
                case 39:
                    C0469b bVar36 = aVar.f1866e;
                    bVar36.f1905W = typedArray.getFloat(index, bVar36.f1905W);
                    continue;
                case 40:
                    C0469b bVar37 = aVar.f1866e;
                    bVar37.f1904V = typedArray.getFloat(index, bVar37.f1904V);
                    continue;
                case C0478j.f2077I5 /*41*/:
                    C0469b bVar38 = aVar.f1866e;
                    bVar38.f1906X = typedArray.getInt(index, bVar38.f1906X);
                    continue;
                case 42:
                    C0469b bVar39 = aVar.f1866e;
                    bVar39.f1907Y = typedArray.getInt(index, bVar39.f1907Y);
                    continue;
                case C0478j.f2093K5 /*43*/:
                    C0471d dVar3 = aVar.f1864c;
                    dVar3.f1970d = typedArray.getFloat(index, dVar3.f1970d);
                    continue;
                case C0478j.f2101L5 /*44*/:
                    C0472e eVar = aVar.f1867f;
                    eVar.f1985m = true;
                    eVar.f1986n = typedArray.getDimension(index, eVar.f1986n);
                    continue;
                case 45:
                    C0472e eVar2 = aVar.f1867f;
                    eVar2.f1975c = typedArray.getFloat(index, eVar2.f1975c);
                    continue;
                case C0478j.f2117N5 /*46*/:
                    C0472e eVar3 = aVar.f1867f;
                    eVar3.f1976d = typedArray.getFloat(index, eVar3.f1976d);
                    continue;
                case C0478j.f2125O5 /*47*/:
                    C0472e eVar4 = aVar.f1867f;
                    eVar4.f1977e = typedArray.getFloat(index, eVar4.f1977e);
                    continue;
                case 48:
                    C0472e eVar5 = aVar.f1867f;
                    eVar5.f1978f = typedArray.getFloat(index, eVar5.f1978f);
                    continue;
                case 49:
                    C0472e eVar6 = aVar.f1867f;
                    eVar6.f1979g = typedArray.getDimension(index, eVar6.f1979g);
                    continue;
                case C0478j.f2149R5 /*50*/:
                    C0472e eVar7 = aVar.f1867f;
                    eVar7.f1980h = typedArray.getDimension(index, eVar7.f1980h);
                    continue;
                case C0478j.f2157S5 /*51*/:
                    C0472e eVar8 = aVar.f1867f;
                    eVar8.f1982j = typedArray.getDimension(index, eVar8.f1982j);
                    continue;
                case 52:
                    C0472e eVar9 = aVar.f1867f;
                    eVar9.f1983k = typedArray.getDimension(index, eVar9.f1983k);
                    continue;
                case 53:
                    C0472e eVar10 = aVar.f1867f;
                    eVar10.f1984l = typedArray.getDimension(index, eVar10.f1984l);
                    continue;
                case 54:
                    C0469b bVar40 = aVar.f1866e;
                    bVar40.f1908Z = typedArray.getInt(index, bVar40.f1908Z);
                    continue;
                case 55:
                    C0469b bVar41 = aVar.f1866e;
                    bVar41.f1910a0 = typedArray.getInt(index, bVar41.f1910a0);
                    continue;
                case 56:
                    C0469b bVar42 = aVar.f1866e;
                    bVar42.f1912b0 = typedArray.getDimensionPixelSize(index, bVar42.f1912b0);
                    continue;
                case 57:
                    C0469b bVar43 = aVar.f1866e;
                    bVar43.f1914c0 = typedArray.getDimensionPixelSize(index, bVar43.f1914c0);
                    continue;
                case 58:
                    C0469b bVar44 = aVar.f1866e;
                    bVar44.f1916d0 = typedArray.getDimensionPixelSize(index, bVar44.f1916d0);
                    continue;
                case 59:
                    C0469b bVar45 = aVar.f1866e;
                    bVar45.f1918e0 = typedArray.getDimensionPixelSize(index, bVar45.f1918e0);
                    continue;
                case 60:
                    C0472e eVar11 = aVar.f1867f;
                    eVar11.f1974b = typedArray.getFloat(index, eVar11.f1974b);
                    continue;
                case 61:
                    C0469b bVar46 = aVar.f1866e;
                    bVar46.f1884B = m2006t(typedArray, index, bVar46.f1884B);
                    continue;
                case 62:
                    C0469b bVar47 = aVar.f1866e;
                    bVar47.f1885C = typedArray.getDimensionPixelSize(index, bVar47.f1885C);
                    continue;
                case 63:
                    C0469b bVar48 = aVar.f1866e;
                    bVar48.f1886D = typedArray.getFloat(index, bVar48.f1886D);
                    continue;
                case 64:
                    C0470c cVar3 = aVar.f1865d;
                    cVar3.f1954b = m2006t(typedArray, index, cVar3.f1954b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1865d;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1865d;
                        str = C1885b.f7265c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1956d = str;
                    continue;
                case 66:
                    aVar.f1865d.f1958f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0470c cVar4 = aVar.f1865d;
                    cVar4.f1961i = typedArray.getFloat(index, cVar4.f1961i);
                    continue;
                case 68:
                    C0471d dVar4 = aVar.f1864c;
                    dVar4.f1971e = typedArray.getFloat(index, dVar4.f1971e);
                    continue;
                case 69:
                    aVar.f1866e.f1920f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1866e.f1922g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C0469b bVar49 = aVar.f1866e;
                    bVar49.f1924h0 = typedArray.getInt(index, bVar49.f1924h0);
                    continue;
                case 73:
                    C0469b bVar50 = aVar.f1866e;
                    bVar50.f1926i0 = typedArray.getDimensionPixelSize(index, bVar50.f1926i0);
                    continue;
                case 74:
                    aVar.f1866e.f1932l0 = typedArray.getString(index);
                    continue;
                case 75:
                    C0469b bVar51 = aVar.f1866e;
                    bVar51.f1940p0 = typedArray.getBoolean(index, bVar51.f1940p0);
                    continue;
                case 76:
                    C0470c cVar5 = aVar.f1865d;
                    cVar5.f1957e = typedArray.getInt(index, cVar5.f1957e);
                    continue;
                case 77:
                    aVar.f1866e.f1934m0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0471d dVar5 = aVar.f1864c;
                    dVar5.f1969c = typedArray.getInt(index, dVar5.f1969c);
                    continue;
                case 79:
                    C0470c cVar6 = aVar.f1865d;
                    cVar6.f1959g = typedArray.getFloat(index, cVar6.f1959g);
                    continue;
                case 80:
                    C0469b bVar52 = aVar.f1866e;
                    bVar52.f1936n0 = typedArray.getBoolean(index, bVar52.f1936n0);
                    continue;
                case 81:
                    C0469b bVar53 = aVar.f1866e;
                    bVar53.f1938o0 = typedArray.getBoolean(index, bVar53.f1938o0);
                    continue;
                case 82:
                    C0470c cVar7 = aVar.f1865d;
                    cVar7.f1955c = typedArray.getInteger(index, cVar7.f1955c);
                    continue;
                case 83:
                    C0472e eVar12 = aVar.f1867f;
                    eVar12.f1981i = m2006t(typedArray, index, eVar12.f1981i);
                    continue;
                case 84:
                    C0470c cVar8 = aVar.f1865d;
                    cVar8.f1963k = typedArray.getInteger(index, cVar8.f1963k);
                    continue;
                case 85:
                    C0470c cVar9 = aVar.f1865d;
                    cVar9.f1962j = typedArray.getFloat(index, cVar9.f1962j);
                    continue;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0470c cVar10 = aVar.f1865d;
                            cVar10.f1965m = typedArray.getInteger(index, cVar10.f1966n);
                            break;
                        } else {
                            aVar.f1865d.f1964l = typedArray.getString(index);
                            if (aVar.f1865d.f1964l.indexOf("/") <= 0) {
                                aVar.f1865d.f1965m = -1;
                                break;
                            } else {
                                aVar.f1865d.f1966n = typedArray.getResourceId(index, -1);
                                cVar2 = aVar.f1865d;
                            }
                        }
                    } else {
                        aVar.f1865d.f1966n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f1865d;
                        if (cVar2.f1966n == -1) {
                            continue;
                        }
                    }
                    cVar2.f1965m = -2;
                    break;
                case 87:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 91:
                    C0469b bVar54 = aVar.f1866e;
                    bVar54.f1944s = m2006t(typedArray, index, bVar54.f1944s);
                    continue;
                case 92:
                    C0469b bVar55 = aVar.f1866e;
                    bVar55.f1945t = m2006t(typedArray, index, bVar55.f1945t);
                    continue;
                case 93:
                    C0469b bVar56 = aVar.f1866e;
                    bVar56.f1896N = typedArray.getDimensionPixelSize(index, bVar56.f1896N);
                    continue;
                case 94:
                    C0469b bVar57 = aVar.f1866e;
                    bVar57.f1903U = typedArray.getDimensionPixelSize(index, bVar57.f1903U);
                    continue;
                case 95:
                    m2007u(aVar.f1866e, typedArray, index, 0);
                    continue;
                case 96:
                    m2007u(aVar.f1866e, typedArray, index, 1);
                    continue;
                case 97:
                    C0469b bVar58 = aVar.f1866e;
                    bVar58.f1942q0 = typedArray.getInt(index, bVar58.f1942q0);
                    continue;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1855g.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        C0469b bVar59 = aVar.f1866e;
        if (bVar59.f1932l0 != null) {
            bVar59.f1930k0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x031a, code lost:
        r3 = r13.getFloat(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x031e, code lost:
        r0.mo2514a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x036c, code lost:
        r3 = r13.getDimensionPixelOffset(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0372, code lost:
        r0.mo2516c(r4, r13.getString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037f, code lost:
        r3 = r13.getDimensionPixelSize(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0383, code lost:
        r0.mo2515b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0386, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        r3 = r13.getInteger(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017f, code lost:
        r0.mo2517d(r4, r13.getBoolean(r3, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        r4.append(r5);
        r4.append(java.lang.Integer.toHexString(r3));
        r4.append("   ");
        r4.append(f1855g.get(r3));
        android.util.Log.w("ConstraintSet", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e5, code lost:
        r3 = m2006t(r13, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0255, code lost:
        r3 = r13.getDimension(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02dc, code lost:
        r3 = r13.getInt(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0307, code lost:
        r3 = r13.getLayoutDimension(r3, r5);
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2011y(android.content.Context r11, androidx.constraintlayout.widget.C0466e.C0467a r12, android.content.res.TypedArray r13) {
        /*
            int r11 = r13.getIndexCount()
            androidx.constraintlayout.widget.e$a$a r0 = new androidx.constraintlayout.widget.e$a$a
            r0.<init>()
            r12.f1869h = r0
            androidx.constraintlayout.widget.e$c r1 = r12.f1865d
            r2 = 0
            r1.f1953a = r2
            androidx.constraintlayout.widget.e$b r1 = r12.f1866e
            r1.f1911b = r2
            androidx.constraintlayout.widget.e$d r1 = r12.f1864c
            r1.f1967a = r2
            androidx.constraintlayout.widget.e$e r1 = r12.f1867f
            r1.f1973a = r2
            r1 = r2
        L_0x001d:
            if (r1 >= r11) goto L_0x038a
            int r3 = r13.getIndex(r1)
            android.util.SparseIntArray r4 = f1856h
            int r4 = r4.get(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "   "
            r7 = 3
            java.lang.String r8 = "ConstraintSet"
            r9 = 1
            r10 = -1
            switch(r4) {
                case 2: goto L_0x037a;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x0371;
                case 6: goto L_0x0367;
                case 7: goto L_0x0361;
                case 8: goto L_0x035a;
                case 9: goto L_0x0035;
                case 10: goto L_0x0035;
                case 11: goto L_0x0353;
                case 12: goto L_0x034c;
                case 13: goto L_0x0345;
                case 14: goto L_0x033e;
                case 15: goto L_0x0337;
                case 16: goto L_0x0330;
                case 17: goto L_0x0329;
                case 18: goto L_0x0322;
                case 19: goto L_0x0314;
                case 20: goto L_0x030d;
                case 21: goto L_0x0301;
                case 22: goto L_0x02f1;
                case 23: goto L_0x02ea;
                case 24: goto L_0x02e2;
                case 25: goto L_0x0035;
                case 26: goto L_0x0035;
                case 27: goto L_0x02d6;
                case 28: goto L_0x02ce;
                case 29: goto L_0x0035;
                case 30: goto L_0x0035;
                case 31: goto L_0x02c6;
                case 32: goto L_0x0035;
                case 33: goto L_0x0035;
                case 34: goto L_0x02be;
                case 35: goto L_0x0035;
                case 36: goto L_0x0035;
                case 37: goto L_0x02b7;
                case 38: goto L_0x02ab;
                case 39: goto L_0x02a3;
                case 40: goto L_0x029b;
                case 41: goto L_0x0294;
                case 42: goto L_0x028d;
                case 43: goto L_0x0285;
                case 44: goto L_0x027b;
                case 45: goto L_0x0273;
                case 46: goto L_0x026b;
                case 47: goto L_0x0263;
                case 48: goto L_0x025b;
                case 49: goto L_0x024f;
                case 50: goto L_0x0248;
                case 51: goto L_0x0241;
                case 52: goto L_0x023a;
                case 53: goto L_0x0233;
                case 54: goto L_0x022b;
                case 55: goto L_0x0223;
                case 56: goto L_0x021b;
                case 57: goto L_0x0213;
                case 58: goto L_0x020b;
                case 59: goto L_0x0203;
                case 60: goto L_0x01fb;
                case 61: goto L_0x0035;
                case 62: goto L_0x01f3;
                case 63: goto L_0x01eb;
                case 64: goto L_0x01df;
                case 65: goto L_0x01c3;
                case 66: goto L_0x01bb;
                case 67: goto L_0x01b3;
                case 68: goto L_0x01ab;
                case 69: goto L_0x01a7;
                case 70: goto L_0x01a3;
                case 71: goto L_0x019c;
                case 72: goto L_0x0194;
                case 73: goto L_0x018c;
                case 74: goto L_0x0188;
                case 75: goto L_0x0179;
                case 76: goto L_0x0171;
                case 77: goto L_0x016d;
                case 78: goto L_0x0165;
                case 79: goto L_0x015d;
                case 80: goto L_0x0156;
                case 81: goto L_0x014f;
                case 82: goto L_0x0143;
                case 83: goto L_0x013b;
                case 84: goto L_0x0134;
                case 85: goto L_0x012c;
                case 86: goto L_0x00b6;
                case 87: goto L_0x00ae;
                case 88: goto L_0x0035;
                case 89: goto L_0x0035;
                case 90: goto L_0x0035;
                case 91: goto L_0x0035;
                case 92: goto L_0x0035;
                case 93: goto L_0x00a6;
                case 94: goto L_0x009e;
                case 95: goto L_0x0099;
                case 96: goto L_0x0094;
                case 97: goto L_0x008c;
                case 98: goto L_0x0063;
                case 99: goto L_0x005b;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown attribute 0x"
        L_0x003c:
            r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            r4.append(r6)
            android.util.SparseIntArray r5 = f1855g
            int r3 = r5.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r8, r3)
            goto L_0x0386
        L_0x005b:
            r4 = 99
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            boolean r5 = r5.f1925i
            goto L_0x017f
        L_0x0063:
            boolean r4 = androidx.constraintlayout.motion.widget.C0445j.f1617x0
            if (r4 == 0) goto L_0x0072
            int r4 = r12.f1862a
            int r4 = r13.getResourceId(r3, r4)
            r12.f1862a = r4
            if (r4 != r10) goto L_0x0386
            goto L_0x007a
        L_0x0072:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            if (r4 != r7) goto L_0x0082
        L_0x007a:
            java.lang.String r3 = r13.getString(r3)
            r12.f1863b = r3
            goto L_0x0386
        L_0x0082:
            int r4 = r12.f1862a
            int r3 = r13.getResourceId(r3, r4)
            r12.f1862a = r3
            goto L_0x0386
        L_0x008c:
            r4 = 97
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1942q0
            goto L_0x02dc
        L_0x0094:
            m2007u(r0, r13, r3, r9)
            goto L_0x0386
        L_0x0099:
            m2007u(r0, r13, r3, r2)
            goto L_0x0386
        L_0x009e:
            r4 = 94
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1903U
            goto L_0x037f
        L_0x00a6:
            r4 = 93
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1896N
            goto L_0x037f
        L_0x00ae:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unused attribute 0x"
            goto L_0x003c
        L_0x00b6:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = -2
            r6 = 89
            r8 = 88
            if (r4 != r9) goto L_0x00df
            androidx.constraintlayout.widget.e$c r4 = r12.f1865d
            int r3 = r13.getResourceId(r3, r10)
            r4.f1966n = r3
            androidx.constraintlayout.widget.e$c r3 = r12.f1865d
            int r3 = r3.f1966n
            r0.mo2515b(r6, r3)
            androidx.constraintlayout.widget.e$c r3 = r12.f1865d
            int r4 = r3.f1966n
            if (r4 == r10) goto L_0x0386
        L_0x00d8:
            r3.f1965m = r5
            r0.mo2515b(r8, r5)
            goto L_0x0386
        L_0x00df:
            if (r4 != r7) goto L_0x0119
            androidx.constraintlayout.widget.e$c r4 = r12.f1865d
            java.lang.String r7 = r13.getString(r3)
            r4.f1964l = r7
            r4 = 90
            androidx.constraintlayout.widget.e$c r7 = r12.f1865d
            java.lang.String r7 = r7.f1964l
            r0.mo2516c(r4, r7)
            androidx.constraintlayout.widget.e$c r4 = r12.f1865d
            java.lang.String r4 = r4.f1964l
            java.lang.String r7 = "/"
            int r4 = r4.indexOf(r7)
            if (r4 <= 0) goto L_0x0110
            androidx.constraintlayout.widget.e$c r4 = r12.f1865d
            int r3 = r13.getResourceId(r3, r10)
            r4.f1966n = r3
            androidx.constraintlayout.widget.e$c r3 = r12.f1865d
            int r3 = r3.f1966n
            r0.mo2515b(r6, r3)
            androidx.constraintlayout.widget.e$c r3 = r12.f1865d
            goto L_0x00d8
        L_0x0110:
            androidx.constraintlayout.widget.e$c r3 = r12.f1865d
            r3.f1965m = r10
            r0.mo2515b(r8, r10)
            goto L_0x0386
        L_0x0119:
            androidx.constraintlayout.widget.e$c r4 = r12.f1865d
            int r5 = r4.f1966n
            int r3 = r13.getInteger(r3, r5)
            r4.f1965m = r3
            androidx.constraintlayout.widget.e$c r3 = r12.f1865d
            int r3 = r3.f1965m
            r0.mo2515b(r8, r3)
            goto L_0x0386
        L_0x012c:
            r4 = 85
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            float r5 = r5.f1962j
            goto L_0x031a
        L_0x0134:
            r4 = 84
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            int r5 = r5.f1963k
            goto L_0x0149
        L_0x013b:
            r4 = 83
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            int r5 = r5.f1981i
            goto L_0x01e5
        L_0x0143:
            r4 = 82
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            int r5 = r5.f1955c
        L_0x0149:
            int r3 = r13.getInteger(r3, r5)
            goto L_0x0383
        L_0x014f:
            r4 = 81
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            boolean r5 = r5.f1938o0
            goto L_0x017f
        L_0x0156:
            r4 = 80
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            boolean r5 = r5.f1936n0
            goto L_0x017f
        L_0x015d:
            r4 = 79
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            float r5 = r5.f1959g
            goto L_0x031a
        L_0x0165:
            r4 = 78
            androidx.constraintlayout.widget.e$d r5 = r12.f1864c
            int r5 = r5.f1969c
            goto L_0x02dc
        L_0x016d:
            r4 = 77
            goto L_0x0372
        L_0x0171:
            r4 = 76
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            int r5 = r5.f1957e
            goto L_0x02dc
        L_0x0179:
            r4 = 75
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            boolean r5 = r5.f1940p0
        L_0x017f:
            boolean r3 = r13.getBoolean(r3, r5)
            r0.mo2517d(r4, r3)
            goto L_0x0386
        L_0x0188:
            r4 = 74
            goto L_0x0372
        L_0x018c:
            r4 = 73
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1926i0
            goto L_0x037f
        L_0x0194:
            r4 = 72
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1924h0
            goto L_0x02dc
        L_0x019c:
            java.lang.String r3 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r8, r3)
            goto L_0x0386
        L_0x01a3:
            r4 = 70
            goto L_0x031a
        L_0x01a7:
            r4 = 69
            goto L_0x031a
        L_0x01ab:
            r4 = 68
            androidx.constraintlayout.widget.e$d r5 = r12.f1864c
            float r5 = r5.f1971e
            goto L_0x031a
        L_0x01b3:
            r4 = 67
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            float r5 = r5.f1961i
            goto L_0x031a
        L_0x01bb:
            r4 = 66
            int r3 = r13.getInt(r3, r2)
            goto L_0x0383
        L_0x01c3:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = 65
            if (r4 != r7) goto L_0x01d2
            java.lang.String r3 = r13.getString(r3)
            goto L_0x01da
        L_0x01d2:
            java.lang.String[] r4 = p075m.C1885b.f7265c
            int r3 = r13.getInteger(r3, r2)
            r3 = r4[r3]
        L_0x01da:
            r0.mo2516c(r5, r3)
            goto L_0x0386
        L_0x01df:
            r4 = 64
            androidx.constraintlayout.widget.e$c r5 = r12.f1865d
            int r5 = r5.f1954b
        L_0x01e5:
            int r3 = m2006t(r13, r3, r5)
            goto L_0x0383
        L_0x01eb:
            r4 = 63
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            float r5 = r5.f1886D
            goto L_0x031a
        L_0x01f3:
            r4 = 62
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1885C
            goto L_0x037f
        L_0x01fb:
            r4 = 60
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1974b
            goto L_0x031a
        L_0x0203:
            r4 = 59
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1918e0
            goto L_0x037f
        L_0x020b:
            r4 = 58
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1916d0
            goto L_0x037f
        L_0x0213:
            r4 = 57
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1914c0
            goto L_0x037f
        L_0x021b:
            r4 = 56
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1912b0
            goto L_0x037f
        L_0x0223:
            r4 = 55
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1910a0
            goto L_0x02dc
        L_0x022b:
            r4 = 54
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1908Z
            goto L_0x02dc
        L_0x0233:
            r4 = 53
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1984l
            goto L_0x0255
        L_0x023a:
            r4 = 52
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1983k
            goto L_0x0255
        L_0x0241:
            r4 = 51
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1982j
            goto L_0x0255
        L_0x0248:
            r4 = 50
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1980h
            goto L_0x0255
        L_0x024f:
            r4 = 49
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1979g
        L_0x0255:
            float r3 = r13.getDimension(r3, r5)
            goto L_0x031e
        L_0x025b:
            r4 = 48
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1978f
            goto L_0x031a
        L_0x0263:
            r4 = 47
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1977e
            goto L_0x031a
        L_0x026b:
            r4 = 46
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1976d
            goto L_0x031a
        L_0x0273:
            r4 = 45
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1975c
            goto L_0x031a
        L_0x027b:
            r4 = 44
            r0.mo2517d(r4, r9)
            androidx.constraintlayout.widget.e$e r5 = r12.f1867f
            float r5 = r5.f1986n
            goto L_0x0255
        L_0x0285:
            r4 = 43
            androidx.constraintlayout.widget.e$d r5 = r12.f1864c
            float r5 = r5.f1970d
            goto L_0x031a
        L_0x028d:
            r4 = 42
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1907Y
            goto L_0x02dc
        L_0x0294:
            r4 = 41
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1906X
            goto L_0x02dc
        L_0x029b:
            r4 = 40
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            float r5 = r5.f1904V
            goto L_0x031a
        L_0x02a3:
            r4 = 39
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            float r5 = r5.f1905W
            goto L_0x031a
        L_0x02ab:
            int r4 = r12.f1862a
            int r3 = r13.getResourceId(r3, r4)
            r12.f1862a = r3
            r4 = 38
            goto L_0x0383
        L_0x02b7:
            r4 = 37
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            float r5 = r5.f1951z
            goto L_0x031a
        L_0x02be:
            r4 = 34
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1892J
            goto L_0x037f
        L_0x02c6:
            r4 = 31
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1895M
            goto L_0x037f
        L_0x02ce:
            r4 = 28
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1891I
            goto L_0x037f
        L_0x02d6:
            r4 = 27
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1889G
        L_0x02dc:
            int r3 = r13.getInt(r3, r5)
            goto L_0x0383
        L_0x02e2:
            r4 = 24
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1890H
            goto L_0x037f
        L_0x02ea:
            r4 = 23
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1915d
            goto L_0x0307
        L_0x02f1:
            r4 = 22
            int[] r5 = f1854f
            androidx.constraintlayout.widget.e$d r6 = r12.f1864c
            int r6 = r6.f1968b
            int r3 = r13.getInt(r3, r6)
            r3 = r5[r3]
            goto L_0x0383
        L_0x0301:
            r4 = 21
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1917e
        L_0x0307:
            int r3 = r13.getLayoutDimension(r3, r5)
            goto L_0x0383
        L_0x030d:
            r4 = 20
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            float r5 = r5.f1950y
            goto L_0x031a
        L_0x0314:
            r4 = 19
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            float r5 = r5.f1923h
        L_0x031a:
            float r3 = r13.getFloat(r3, r5)
        L_0x031e:
            r0.mo2514a(r4, r3)
            goto L_0x0386
        L_0x0322:
            r4 = 18
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1921g
            goto L_0x036c
        L_0x0329:
            r4 = 17
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1919f
            goto L_0x036c
        L_0x0330:
            r4 = 16
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1898P
            goto L_0x037f
        L_0x0337:
            r4 = 15
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1902T
            goto L_0x037f
        L_0x033e:
            r4 = 14
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1899Q
            goto L_0x037f
        L_0x0345:
            r4 = 13
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1897O
            goto L_0x037f
        L_0x034c:
            r4 = 12
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1901S
            goto L_0x037f
        L_0x0353:
            r4 = 11
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1900R
            goto L_0x037f
        L_0x035a:
            r4 = 8
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1894L
            goto L_0x037f
        L_0x0361:
            r4 = 7
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1888F
            goto L_0x036c
        L_0x0367:
            r4 = 6
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1887E
        L_0x036c:
            int r3 = r13.getDimensionPixelOffset(r3, r5)
            goto L_0x0383
        L_0x0371:
            r4 = 5
        L_0x0372:
            java.lang.String r3 = r13.getString(r3)
            r0.mo2516c(r4, r3)
            goto L_0x0386
        L_0x037a:
            r4 = 2
            androidx.constraintlayout.widget.e$b r5 = r12.f1866e
            int r5 = r5.f1893K
        L_0x037f:
            int r3 = r13.getDimensionPixelSize(r3, r5)
        L_0x0383:
            r0.mo2515b(r4, r3)
        L_0x0386:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x038a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0466e.m2011y(android.content.Context, androidx.constraintlayout.widget.e$a, android.content.res.TypedArray):void");
    }

    /* renamed from: c */
    public void mo2496c(ConstraintLayout constraintLayout) {
        mo2497d(constraintLayout, true);
        constraintLayout.setConstraintSet((C0466e) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2497d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1861e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f1861e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0436a.m1888b(childAt));
            } else if (this.f1860d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1861e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0467a aVar = this.f1861e.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof C0458a) {
                            aVar.f1866e.f1928j0 = 1;
                            C0458a aVar2 = (C0458a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f1866e.f1924h0);
                            aVar2.setMargin(aVar.f1866e.f1926i0);
                            aVar2.setAllowsGoneWidget(aVar.f1866e.f1940p0);
                            C0469b bVar = aVar.f1866e;
                            int[] iArr = bVar.f1930k0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1932l0;
                                if (str != null) {
                                    bVar.f1930k0 = m2003o(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f1866e.f1930k0);
                                }
                            }
                        }
                        ConstraintLayout.C0455b bVar2 = (ConstraintLayout.C0455b) childAt.getLayoutParams();
                        bVar2.mo2451a();
                        aVar.mo2512d(bVar2);
                        if (z) {
                            C0459b.m1972e(childAt, aVar.f1868g);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0471d dVar = aVar.f1864c;
                        if (dVar.f1969c == 0) {
                            childAt.setVisibility(dVar.f1968b);
                        }
                        childAt.setAlpha(aVar.f1864c.f1970d);
                        childAt.setRotation(aVar.f1867f.f1974b);
                        childAt.setRotationX(aVar.f1867f.f1975c);
                        childAt.setRotationY(aVar.f1867f.f1976d);
                        childAt.setScaleX(aVar.f1867f.f1977e);
                        childAt.setScaleY(aVar.f1867f.f1978f);
                        C0472e eVar = aVar.f1867f;
                        if (eVar.f1981i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1867f.f1981i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1979g)) {
                                childAt.setPivotX(aVar.f1867f.f1979g);
                            }
                            if (!Float.isNaN(aVar.f1867f.f1980h)) {
                                childAt.setPivotY(aVar.f1867f.f1980h);
                            }
                        }
                        childAt.setTranslationX(aVar.f1867f.f1982j);
                        childAt.setTranslationY(aVar.f1867f.f1983k);
                        childAt.setTranslationZ(aVar.f1867f.f1984l);
                        C0472e eVar2 = aVar.f1867f;
                        if (eVar2.f1985m) {
                            childAt.setElevation(eVar2.f1986n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0467a aVar3 = this.f1861e.get(num);
            if (aVar3 != null) {
                if (aVar3.f1866e.f1928j0 == 1) {
                    C0458a aVar4 = new C0458a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    C0469b bVar3 = aVar3.f1866e;
                    int[] iArr2 = bVar3.f1930k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1932l0;
                        if (str2 != null) {
                            bVar3.f1930k0 = m2003o(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f1866e.f1930k0);
                        }
                    }
                    aVar4.setType(aVar3.f1866e.f1924h0);
                    aVar4.setMargin(aVar3.f1866e.f1926i0);
                    ConstraintLayout.C0455b e = constraintLayout.generateDefaultLayoutParams();
                    aVar4.mo2486s();
                    aVar3.mo2512d(e);
                    constraintLayout.addView(aVar4, e);
                }
                if (aVar3.f1866e.f1909a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.C0455b e2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.mo2512d(e2);
                    constraintLayout.addView(guideline, e2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof C0462c) {
                ((C0462c) childAt2).mo2477i(constraintLayout);
            }
        }
    }

    /* renamed from: e */
    public void mo2498e(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        C0467a aVar;
        int i8 = i3;
        float f2 = f;
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            if (i8 == 1 || i8 == 2) {
                int i9 = i;
                mo2505l(i9, 1, i2, i3, i4);
                mo2505l(i9, 2, i5, i6, i7);
                aVar = this.f1861e.get(Integer.valueOf(i));
                if (aVar == null) {
                    return;
                }
            } else if (i8 == 6 || i8 == 7) {
                int i10 = i;
                mo2505l(i10, 6, i2, i3, i4);
                mo2505l(i10, 7, i5, i6, i7);
                aVar = this.f1861e.get(Integer.valueOf(i));
                if (aVar == null) {
                    return;
                }
            } else {
                int i11 = i;
                mo2505l(i11, 3, i2, i3, i4);
                mo2505l(i11, 4, i5, i6, i7);
                C0467a aVar2 = this.f1861e.get(Integer.valueOf(i));
                if (aVar2 != null) {
                    aVar2.f1866e.f1951z = f2;
                    return;
                }
                return;
            }
            aVar.f1866e.f1950y = f2;
        }
    }

    /* renamed from: f */
    public void mo2499f(int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0466e eVar;
        if (i2 == 0) {
            i8 = 0;
            i7 = 3;
            i6 = 0;
            i5 = 0;
            i4 = 4;
            i3 = 0;
            f = 0.5f;
            eVar = this;
            i9 = i;
        } else {
            i7 = 4;
            i6 = 0;
            i4 = 3;
            i3 = 0;
            f = 0.5f;
            eVar = this;
            i9 = i;
            i8 = i2;
            i5 = i2;
        }
        eVar.mo2498e(i9, i8, i7, i6, i5, i4, i3, f);
    }

    /* renamed from: g */
    public void mo2500g(int i, int i2) {
        C0467a aVar;
        if (this.f1861e.containsKey(Integer.valueOf(i)) && (aVar = this.f1861e.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    C0469b bVar = aVar.f1866e;
                    bVar.f1929k = -1;
                    bVar.f1927j = -1;
                    bVar.f1890H = -1;
                    bVar.f1897O = Integer.MIN_VALUE;
                    return;
                case 2:
                    C0469b bVar2 = aVar.f1866e;
                    bVar2.f1933m = -1;
                    bVar2.f1931l = -1;
                    bVar2.f1891I = -1;
                    bVar2.f1899Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    C0469b bVar3 = aVar.f1866e;
                    bVar3.f1937o = -1;
                    bVar3.f1935n = -1;
                    bVar3.f1892J = 0;
                    bVar3.f1898P = Integer.MIN_VALUE;
                    return;
                case 4:
                    C0469b bVar4 = aVar.f1866e;
                    bVar4.f1939p = -1;
                    bVar4.f1941q = -1;
                    bVar4.f1893K = 0;
                    bVar4.f1900R = Integer.MIN_VALUE;
                    return;
                case 5:
                    C0469b bVar5 = aVar.f1866e;
                    bVar5.f1943r = -1;
                    bVar5.f1944s = -1;
                    bVar5.f1945t = -1;
                    bVar5.f1896N = 0;
                    bVar5.f1903U = Integer.MIN_VALUE;
                    return;
                case 6:
                    C0469b bVar6 = aVar.f1866e;
                    bVar6.f1946u = -1;
                    bVar6.f1947v = -1;
                    bVar6.f1895M = 0;
                    bVar6.f1902T = Integer.MIN_VALUE;
                    return;
                case 7:
                    C0469b bVar7 = aVar.f1866e;
                    bVar7.f1948w = -1;
                    bVar7.f1949x = -1;
                    bVar7.f1894L = 0;
                    bVar7.f1901S = Integer.MIN_VALUE;
                    return;
                case 8:
                    C0469b bVar8 = aVar.f1866e;
                    bVar8.f1886D = -1.0f;
                    bVar8.f1885C = -1;
                    bVar8.f1884B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: h */
    public void mo2501h(Context context, int i) {
        mo2502i((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: i */
    public void mo2502i(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1861e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1860d || id != -1) {
                if (!this.f1861e.containsKey(Integer.valueOf(id))) {
                    this.f1861e.put(Integer.valueOf(id), new C0467a());
                }
                C0467a aVar = this.f1861e.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f1868g = C0459b.m1970a(this.f1859c, childAt);
                    aVar.m2030f(id, bVar);
                    aVar.f1864c.f1968b = childAt.getVisibility();
                    aVar.f1864c.f1970d = childAt.getAlpha();
                    aVar.f1867f.f1974b = childAt.getRotation();
                    aVar.f1867f.f1975c = childAt.getRotationX();
                    aVar.f1867f.f1976d = childAt.getRotationY();
                    aVar.f1867f.f1977e = childAt.getScaleX();
                    aVar.f1867f.f1978f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0472e eVar = aVar.f1867f;
                        eVar.f1979g = pivotX;
                        eVar.f1980h = pivotY;
                    }
                    aVar.f1867f.f1982j = childAt.getTranslationX();
                    aVar.f1867f.f1983k = childAt.getTranslationY();
                    aVar.f1867f.f1984l = childAt.getTranslationZ();
                    C0472e eVar2 = aVar.f1867f;
                    if (eVar2.f1985m) {
                        eVar2.f1986n = childAt.getElevation();
                    }
                    if (childAt instanceof C0458a) {
                        C0458a aVar2 = (C0458a) childAt;
                        aVar.f1866e.f1940p0 = aVar2.getAllowsGoneWidget();
                        aVar.f1866e.f1930k0 = aVar2.getReferencedIds();
                        aVar.f1866e.f1924h0 = aVar2.getType();
                        aVar.f1866e.f1926i0 = aVar2.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: j */
    public void mo2503j(C0473f fVar) {
        int childCount = fVar.getChildCount();
        this.f1861e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = fVar.getChildAt(i);
            C0473f.C0474a aVar = (C0473f.C0474a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1860d || id != -1) {
                if (!this.f1861e.containsKey(Integer.valueOf(id))) {
                    this.f1861e.put(Integer.valueOf(id), new C0467a());
                }
                C0467a aVar2 = this.f1861e.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof C0462c) {
                        aVar2.m2032h((C0462c) childAt, id, aVar);
                    }
                    aVar2.m2031g(id, aVar);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: k */
    public void mo2504k(int i, int i2, int i3, int i4) {
        C0469b bVar;
        C0469b bVar2;
        if (!this.f1861e.containsKey(Integer.valueOf(i))) {
            this.f1861e.put(Integer.valueOf(i), new C0467a());
        }
        C0467a aVar = this.f1861e.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0469b bVar3 = aVar.f1866e;
                        bVar3.f1927j = i3;
                        bVar3.f1929k = -1;
                        return;
                    } else if (i4 == 2) {
                        C0469b bVar4 = aVar.f1866e;
                        bVar4.f1929k = i3;
                        bVar4.f1927j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + m2000A(i4) + " undefined");
                    }
                case 2:
                    if (i4 == 1) {
                        C0469b bVar5 = aVar.f1866e;
                        bVar5.f1931l = i3;
                        bVar5.f1933m = -1;
                        return;
                    } else if (i4 == 2) {
                        C0469b bVar6 = aVar.f1866e;
                        bVar6.f1933m = i3;
                        bVar6.f1931l = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                case 3:
                    if (i4 == 3) {
                        bVar = aVar.f1866e;
                        bVar.f1935n = i3;
                        bVar.f1937o = -1;
                        break;
                    } else if (i4 == 4) {
                        bVar = aVar.f1866e;
                        bVar.f1937o = i3;
                        bVar.f1935n = -1;
                        break;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                case 4:
                    if (i4 == 4) {
                        bVar = aVar.f1866e;
                        bVar.f1941q = i3;
                        bVar.f1939p = -1;
                        break;
                    } else if (i4 == 3) {
                        bVar = aVar.f1866e;
                        bVar.f1939p = i3;
                        bVar.f1941q = -1;
                        break;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                case 5:
                    if (i4 == 5) {
                        bVar2 = aVar.f1866e;
                        bVar2.f1943r = i3;
                    } else if (i4 == 3) {
                        bVar2 = aVar.f1866e;
                        bVar2.f1944s = i3;
                    } else if (i4 == 4) {
                        bVar2 = aVar.f1866e;
                        bVar2.f1945t = i3;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    bVar2.f1941q = -1;
                    bVar2.f1939p = -1;
                    bVar2.f1935n = -1;
                    bVar2.f1937o = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        C0469b bVar7 = aVar.f1866e;
                        bVar7.f1947v = i3;
                        bVar7.f1946u = -1;
                        return;
                    } else if (i4 == 7) {
                        C0469b bVar8 = aVar.f1866e;
                        bVar8.f1946u = i3;
                        bVar8.f1947v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                case 7:
                    if (i4 == 7) {
                        C0469b bVar9 = aVar.f1866e;
                        bVar9.f1949x = i3;
                        bVar9.f1948w = -1;
                        return;
                    } else if (i4 == 6) {
                        C0469b bVar10 = aVar.f1866e;
                        bVar10.f1948w = i3;
                        bVar10.f1949x = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(m2000A(i2) + " to " + m2000A(i4) + " unknown");
            }
            bVar.f1943r = -1;
            bVar.f1944s = -1;
            bVar.f1945t = -1;
        }
    }

    /* renamed from: l */
    public void mo2505l(int i, int i2, int i3, int i4, int i5) {
        C0469b bVar;
        C0469b bVar2;
        C0469b bVar3;
        if (!this.f1861e.containsKey(Integer.valueOf(i))) {
            this.f1861e.put(Integer.valueOf(i), new C0467a());
        }
        C0467a aVar = this.f1861e.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0469b bVar4 = aVar.f1866e;
                        bVar4.f1927j = i3;
                        bVar4.f1929k = -1;
                    } else if (i4 == 2) {
                        C0469b bVar5 = aVar.f1866e;
                        bVar5.f1929k = i3;
                        bVar5.f1927j = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + m2000A(i4) + " undefined");
                    }
                    aVar.f1866e.f1890H = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        C0469b bVar6 = aVar.f1866e;
                        bVar6.f1931l = i3;
                        bVar6.f1933m = -1;
                    } else if (i4 == 2) {
                        C0469b bVar7 = aVar.f1866e;
                        bVar7.f1933m = i3;
                        bVar7.f1931l = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    aVar.f1866e.f1891I = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        bVar = aVar.f1866e;
                        bVar.f1935n = i3;
                        bVar.f1937o = -1;
                    } else if (i4 == 4) {
                        bVar = aVar.f1866e;
                        bVar.f1937o = i3;
                        bVar.f1935n = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    bVar.f1943r = -1;
                    bVar.f1944s = -1;
                    bVar.f1945t = -1;
                    aVar.f1866e.f1892J = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        bVar2 = aVar.f1866e;
                        bVar2.f1941q = i3;
                        bVar2.f1939p = -1;
                    } else if (i4 == 3) {
                        bVar2 = aVar.f1866e;
                        bVar2.f1939p = i3;
                        bVar2.f1941q = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    bVar2.f1943r = -1;
                    bVar2.f1944s = -1;
                    bVar2.f1945t = -1;
                    aVar.f1866e.f1893K = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        bVar3 = aVar.f1866e;
                        bVar3.f1943r = i3;
                    } else if (i4 == 3) {
                        bVar3 = aVar.f1866e;
                        bVar3.f1944s = i3;
                    } else if (i4 == 4) {
                        bVar3 = aVar.f1866e;
                        bVar3.f1945t = i3;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    bVar3.f1941q = -1;
                    bVar3.f1939p = -1;
                    bVar3.f1935n = -1;
                    bVar3.f1937o = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        C0469b bVar8 = aVar.f1866e;
                        bVar8.f1947v = i3;
                        bVar8.f1946u = -1;
                    } else if (i4 == 7) {
                        C0469b bVar9 = aVar.f1866e;
                        bVar9.f1946u = i3;
                        bVar9.f1947v = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    aVar.f1866e.f1895M = i5;
                    return;
                case 7:
                    if (i4 == 7) {
                        C0469b bVar10 = aVar.f1866e;
                        bVar10.f1949x = i3;
                        bVar10.f1948w = -1;
                    } else if (i4 == 6) {
                        C0469b bVar11 = aVar.f1866e;
                        bVar11.f1948w = i3;
                        bVar11.f1949x = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + m2000A(i4) + " undefined");
                    }
                    aVar.f1866e.f1894L = i5;
                    return;
                default:
                    throw new IllegalArgumentException(m2000A(i2) + " to " + m2000A(i4) + " unknown");
            }
        }
    }

    /* renamed from: m */
    public void mo2506m(int i, int i2) {
        m2005q(i).f1866e.f1917e = i2;
    }

    /* renamed from: n */
    public void mo2507n(int i, int i2) {
        m2005q(i).f1866e.f1915d = i2;
    }

    /* renamed from: r */
    public void mo2508r(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0467a p = m2004p(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        p.f1866e.f1909a = true;
                    }
                    this.f1861e.put(Integer.valueOf(p.f1862a), p);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2509s(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r7
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.e$a> r0 = r9.f1861e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f1862a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r7
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r5
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r3
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.b> r0 = r2.f1868g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.C0459b.m1971d(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.e$c r0 = r2.f1865d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2521b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.e$b r0 = r2.f1866e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2519b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.e$e r0 = r2.f1867f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2525b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.e$d r0 = r2.f1864c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo2523b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2004p(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$b r2 = r0.f1866e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1928j0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2004p(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$b r2 = r0.f1866e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1909a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1911b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2004p(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.e$a r0 = r9.m2004p(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0466e.mo2509s(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: z */
    public void mo2510z(int i, float f) {
        m2005q(i).f1866e.f1905W = f;
    }
}
