package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p087o.C2473d;
import p087o.C2476e;
import p087o.C2479f;
import p087o.C2480g;
import p093p.C2512b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: A */
    private static C0479k f1698A;

    /* renamed from: d */
    SparseArray<View> f1699d = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<C0462c> f1700e = new ArrayList<>(4);

    /* renamed from: f */
    protected C2479f f1701f = new C2479f();

    /* renamed from: g */
    private int f1702g = 0;

    /* renamed from: h */
    private int f1703h = 0;

    /* renamed from: i */
    private int f1704i = Integer.MAX_VALUE;

    /* renamed from: j */
    private int f1705j = Integer.MAX_VALUE;

    /* renamed from: k */
    protected boolean f1706k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1707l = 257;

    /* renamed from: m */
    private C0466e f1708m = null;

    /* renamed from: n */
    protected C0463d f1709n = null;

    /* renamed from: o */
    private int f1710o = -1;

    /* renamed from: p */
    private HashMap<String, Integer> f1711p = new HashMap<>();

    /* renamed from: q */
    private int f1712q = -1;

    /* renamed from: r */
    private int f1713r = -1;

    /* renamed from: s */
    int f1714s = -1;

    /* renamed from: t */
    int f1715t = -1;

    /* renamed from: u */
    int f1716u = 0;

    /* renamed from: v */
    int f1717v = 0;

    /* renamed from: w */
    private SparseArray<C2476e> f1718w = new SparseArray<>();

    /* renamed from: x */
    C0457c f1719x = new C0457c(this);

    /* renamed from: y */
    private int f1720y = 0;

    /* renamed from: z */
    private int f1721z = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0454a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1722a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.e$b[] r0 = p087o.C2476e.C2478b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1722a = r0
                o.e$b r1 = p087o.C2476e.C2478b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1722a     // Catch:{ NoSuchFieldError -> 0x001d }
                o.e$b r1 = p087o.C2476e.C2478b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1722a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.e$b r1 = p087o.C2476e.C2478b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1722a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.e$b r1 = p087o.C2476e.C2478b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0454a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0455b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f1723A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f1724B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f1725C = Integer.MIN_VALUE;

        /* renamed from: D */
        public int f1726D = 0;

        /* renamed from: E */
        boolean f1727E = true;

        /* renamed from: F */
        boolean f1728F = true;

        /* renamed from: G */
        public float f1729G = 0.5f;

        /* renamed from: H */
        public float f1730H = 0.5f;

        /* renamed from: I */
        public String f1731I = null;

        /* renamed from: J */
        float f1732J = 0.0f;

        /* renamed from: K */
        int f1733K = 1;

        /* renamed from: L */
        public float f1734L = -1.0f;

        /* renamed from: M */
        public float f1735M = -1.0f;

        /* renamed from: N */
        public int f1736N = 0;

        /* renamed from: O */
        public int f1737O = 0;

        /* renamed from: P */
        public int f1738P = 0;

        /* renamed from: Q */
        public int f1739Q = 0;

        /* renamed from: R */
        public int f1740R = 0;

        /* renamed from: S */
        public int f1741S = 0;

        /* renamed from: T */
        public int f1742T = 0;

        /* renamed from: U */
        public int f1743U = 0;

        /* renamed from: V */
        public float f1744V = 1.0f;

        /* renamed from: W */
        public float f1745W = 1.0f;

        /* renamed from: X */
        public int f1746X = -1;

        /* renamed from: Y */
        public int f1747Y = -1;

        /* renamed from: Z */
        public int f1748Z = -1;

        /* renamed from: a */
        public int f1749a = -1;

        /* renamed from: a0 */
        public boolean f1750a0 = false;

        /* renamed from: b */
        public int f1751b = -1;

        /* renamed from: b0 */
        public boolean f1752b0 = false;

        /* renamed from: c */
        public float f1753c = -1.0f;

        /* renamed from: c0 */
        public String f1754c0 = null;

        /* renamed from: d */
        public boolean f1755d = true;

        /* renamed from: d0 */
        public int f1756d0 = 0;

        /* renamed from: e */
        public int f1757e = -1;

        /* renamed from: e0 */
        boolean f1758e0 = true;

        /* renamed from: f */
        public int f1759f = -1;

        /* renamed from: f0 */
        boolean f1760f0 = true;

        /* renamed from: g */
        public int f1761g = -1;

        /* renamed from: g0 */
        boolean f1762g0 = false;

        /* renamed from: h */
        public int f1763h = -1;

        /* renamed from: h0 */
        boolean f1764h0 = false;

        /* renamed from: i */
        public int f1765i = -1;

        /* renamed from: i0 */
        boolean f1766i0 = false;

        /* renamed from: j */
        public int f1767j = -1;

        /* renamed from: j0 */
        boolean f1768j0 = false;

        /* renamed from: k */
        public int f1769k = -1;

        /* renamed from: k0 */
        boolean f1770k0 = false;

        /* renamed from: l */
        public int f1771l = -1;

        /* renamed from: l0 */
        int f1772l0 = -1;

        /* renamed from: m */
        public int f1773m = -1;

        /* renamed from: m0 */
        int f1774m0 = -1;

        /* renamed from: n */
        public int f1775n = -1;

        /* renamed from: n0 */
        int f1776n0 = -1;

        /* renamed from: o */
        public int f1777o = -1;

        /* renamed from: o0 */
        int f1778o0 = -1;

        /* renamed from: p */
        public int f1779p = -1;

        /* renamed from: p0 */
        int f1780p0 = Integer.MIN_VALUE;

        /* renamed from: q */
        public int f1781q = 0;

        /* renamed from: q0 */
        int f1782q0 = Integer.MIN_VALUE;

        /* renamed from: r */
        public float f1783r = 0.0f;

        /* renamed from: r0 */
        float f1784r0 = 0.5f;

        /* renamed from: s */
        public int f1785s = -1;

        /* renamed from: s0 */
        int f1786s0;

        /* renamed from: t */
        public int f1787t = -1;

        /* renamed from: t0 */
        int f1788t0;

        /* renamed from: u */
        public int f1789u = -1;

        /* renamed from: u0 */
        float f1790u0;

        /* renamed from: v */
        public int f1791v = -1;

        /* renamed from: v0 */
        C2476e f1792v0 = new C2476e();

        /* renamed from: w */
        public int f1793w = Integer.MIN_VALUE;

        /* renamed from: w0 */
        public boolean f1794w0 = false;

        /* renamed from: x */
        public int f1795x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f1796y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f1797z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0456a {

            /* renamed from: a */
            public static final SparseIntArray f1798a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1798a = sparseIntArray;
                sparseIntArray.append(C0478j.f2380s2, 64);
                sparseIntArray.append(C0478j.f2177V1, 65);
                sparseIntArray.append(C0478j.f2254e2, 8);
                sparseIntArray.append(C0478j.f2263f2, 9);
                sparseIntArray.append(C0478j.f2281h2, 10);
                sparseIntArray.append(C0478j.f2290i2, 11);
                sparseIntArray.append(C0478j.f2344o2, 12);
                sparseIntArray.append(C0478j.f2335n2, 13);
                sparseIntArray.append(C0478j.f2097L1, 14);
                sparseIntArray.append(C0478j.f2089K1, 15);
                sparseIntArray.append(C0478j.f2057G1, 16);
                sparseIntArray.append(C0478j.f2073I1, 52);
                sparseIntArray.append(C0478j.f2065H1, 53);
                sparseIntArray.append(C0478j.f2105M1, 2);
                sparseIntArray.append(C0478j.f2121O1, 3);
                sparseIntArray.append(C0478j.f2113N1, 4);
                sparseIntArray.append(C0478j.f2425x2, 49);
                sparseIntArray.append(C0478j.f2434y2, 50);
                sparseIntArray.append(C0478j.f2153S1, 5);
                sparseIntArray.append(C0478j.f2161T1, 6);
                sparseIntArray.append(C0478j.f2169U1, 7);
                sparseIntArray.append(C0478j.f2015B1, 67);
                sparseIntArray.append(C0478j.f2343o1, 1);
                sparseIntArray.append(C0478j.f2299j2, 17);
                sparseIntArray.append(C0478j.f2308k2, 18);
                sparseIntArray.append(C0478j.f2145R1, 19);
                sparseIntArray.append(C0478j.f2137Q1, 20);
                sparseIntArray.append(C0478j.f2025C2, 21);
                sparseIntArray.append(C0478j.f2050F2, 22);
                sparseIntArray.append(C0478j.f2034D2, 23);
                sparseIntArray.append(C0478j.f2007A2, 24);
                sparseIntArray.append(C0478j.f2042E2, 25);
                sparseIntArray.append(C0478j.f2016B2, 26);
                sparseIntArray.append(C0478j.f2443z2, 55);
                sparseIntArray.append(C0478j.f2058G2, 54);
                sparseIntArray.append(C0478j.f2218a2, 29);
                sparseIntArray.append(C0478j.f2353p2, 30);
                sparseIntArray.append(C0478j.f2129P1, 44);
                sparseIntArray.append(C0478j.f2236c2, 45);
                sparseIntArray.append(C0478j.f2371r2, 46);
                sparseIntArray.append(C0478j.f2227b2, 47);
                sparseIntArray.append(C0478j.f2362q2, 48);
                sparseIntArray.append(C0478j.f2041E1, 27);
                sparseIntArray.append(C0478j.f2033D1, 28);
                sparseIntArray.append(C0478j.f2389t2, 31);
                sparseIntArray.append(C0478j.f2185W1, 32);
                sparseIntArray.append(C0478j.f2407v2, 33);
                sparseIntArray.append(C0478j.f2398u2, 34);
                sparseIntArray.append(C0478j.f2416w2, 35);
                sparseIntArray.append(C0478j.f2201Y1, 36);
                sparseIntArray.append(C0478j.f2193X1, 37);
                sparseIntArray.append(C0478j.f2209Z1, 38);
                sparseIntArray.append(C0478j.f2245d2, 39);
                sparseIntArray.append(C0478j.f2326m2, 40);
                sparseIntArray.append(C0478j.f2272g2, 41);
                sparseIntArray.append(C0478j.f2081J1, 42);
                sparseIntArray.append(C0478j.f2049F1, 43);
                sparseIntArray.append(C0478j.f2317l2, 51);
                sparseIntArray.append(C0478j.f2074I2, 66);
            }
        }

        public C0455b(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01fb, code lost:
            android.util.Log.e("ConstraintLayout", r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0455b(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f1749a = r0
                r10.f1751b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f1753c = r1
                r2 = 1
                r10.f1755d = r2
                r10.f1757e = r0
                r10.f1759f = r0
                r10.f1761g = r0
                r10.f1763h = r0
                r10.f1765i = r0
                r10.f1767j = r0
                r10.f1769k = r0
                r10.f1771l = r0
                r10.f1773m = r0
                r10.f1775n = r0
                r10.f1777o = r0
                r10.f1779p = r0
                r3 = 0
                r10.f1781q = r3
                r4 = 0
                r10.f1783r = r4
                r10.f1785s = r0
                r10.f1787t = r0
                r10.f1789u = r0
                r10.f1791v = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r10.f1793w = r5
                r10.f1795x = r5
                r10.f1796y = r5
                r10.f1797z = r5
                r10.f1723A = r5
                r10.f1724B = r5
                r10.f1725C = r5
                r10.f1726D = r3
                r10.f1727E = r2
                r10.f1728F = r2
                r6 = 1056964608(0x3f000000, float:0.5)
                r10.f1729G = r6
                r10.f1730H = r6
                r7 = 0
                r10.f1731I = r7
                r10.f1732J = r4
                r10.f1733K = r2
                r10.f1734L = r1
                r10.f1735M = r1
                r10.f1736N = r3
                r10.f1737O = r3
                r10.f1738P = r3
                r10.f1739Q = r3
                r10.f1740R = r3
                r10.f1741S = r3
                r10.f1742T = r3
                r10.f1743U = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.f1744V = r1
                r10.f1745W = r1
                r10.f1746X = r0
                r10.f1747Y = r0
                r10.f1748Z = r0
                r10.f1750a0 = r3
                r10.f1752b0 = r3
                r10.f1754c0 = r7
                r10.f1756d0 = r3
                r10.f1758e0 = r2
                r10.f1760f0 = r2
                r10.f1762g0 = r3
                r10.f1764h0 = r3
                r10.f1766i0 = r3
                r10.f1768j0 = r3
                r10.f1770k0 = r3
                r10.f1772l0 = r0
                r10.f1774m0 = r0
                r10.f1776n0 = r0
                r10.f1778o0 = r0
                r10.f1780p0 = r5
                r10.f1782q0 = r5
                r10.f1784r0 = r6
                o.e r1 = new o.e
                r1.<init>()
                r10.f1792v0 = r1
                r10.f1794w0 = r3
                int[] r1 = androidx.constraintlayout.widget.C0478j.f2334n1
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r3
            L_0x00b0:
                if (r1 >= r12) goto L_0x03a2
                int r5 = r11.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.C0455b.C0456a.f1798a
                int r6 = r6.get(r5)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r6) {
                    case 1: goto L_0x0396;
                    case 2: goto L_0x0385;
                    case 3: goto L_0x037c;
                    case 4: goto L_0x0367;
                    case 5: goto L_0x035e;
                    case 6: goto L_0x0355;
                    case 7: goto L_0x034c;
                    case 8: goto L_0x033b;
                    case 9: goto L_0x032a;
                    case 10: goto L_0x0318;
                    case 11: goto L_0x0306;
                    case 12: goto L_0x02f4;
                    case 13: goto L_0x02e2;
                    case 14: goto L_0x02d0;
                    case 15: goto L_0x02be;
                    case 16: goto L_0x02ac;
                    case 17: goto L_0x029a;
                    case 18: goto L_0x0288;
                    case 19: goto L_0x0276;
                    case 20: goto L_0x0264;
                    case 21: goto L_0x025a;
                    case 22: goto L_0x0250;
                    case 23: goto L_0x0246;
                    case 24: goto L_0x023c;
                    case 25: goto L_0x0232;
                    case 26: goto L_0x0228;
                    case 27: goto L_0x021e;
                    case 28: goto L_0x0214;
                    case 29: goto L_0x020a;
                    case 30: goto L_0x0200;
                    case 31: goto L_0x01f1;
                    case 32: goto L_0x01e6;
                    case 33: goto L_0x01d0;
                    case 34: goto L_0x01ba;
                    case 35: goto L_0x01aa;
                    case 36: goto L_0x0194;
                    case 37: goto L_0x017e;
                    case 38: goto L_0x016e;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                switch(r6) {
                    case 44: goto L_0x0165;
                    case 45: goto L_0x015b;
                    case 46: goto L_0x0151;
                    case 47: goto L_0x0149;
                    case 48: goto L_0x0141;
                    case 49: goto L_0x0137;
                    case 50: goto L_0x012d;
                    case 51: goto L_0x0125;
                    case 52: goto L_0x0113;
                    case 53: goto L_0x0101;
                    case 54: goto L_0x00f7;
                    case 55: goto L_0x00ed;
                    default: goto L_0x00c6;
                }
            L_0x00c6:
                switch(r6) {
                    case 64: goto L_0x00e6;
                    case 65: goto L_0x00df;
                    case 66: goto L_0x00d5;
                    case 67: goto L_0x00cb;
                    default: goto L_0x00c9;
                }
            L_0x00c9:
                goto L_0x039e
            L_0x00cb:
                boolean r6 = r10.f1755d
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f1755d = r5
                goto L_0x039e
            L_0x00d5:
                int r6 = r10.f1756d0
                int r5 = r11.getInt(r5, r6)
                r10.f1756d0 = r5
                goto L_0x039e
            L_0x00df:
                androidx.constraintlayout.widget.C0466e.m2007u(r10, r11, r5, r2)
                r10.f1728F = r2
                goto L_0x039e
            L_0x00e6:
                androidx.constraintlayout.widget.C0466e.m2007u(r10, r11, r5, r3)
                r10.f1727E = r2
                goto L_0x039e
            L_0x00ed:
                int r6 = r10.f1725C
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1725C = r5
                goto L_0x039e
            L_0x00f7:
                int r6 = r10.f1726D
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1726D = r5
                goto L_0x039e
            L_0x0101:
                int r6 = r10.f1777o
                int r6 = r11.getResourceId(r5, r6)
                r10.f1777o = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1777o = r5
                goto L_0x039e
            L_0x0113:
                int r6 = r10.f1775n
                int r6 = r11.getResourceId(r5, r6)
                r10.f1775n = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1775n = r5
                goto L_0x039e
            L_0x0125:
                java.lang.String r5 = r11.getString(r5)
                r10.f1754c0 = r5
                goto L_0x039e
            L_0x012d:
                int r6 = r10.f1747Y
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f1747Y = r5
                goto L_0x039e
            L_0x0137:
                int r6 = r10.f1746X
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f1746X = r5
                goto L_0x039e
            L_0x0141:
                int r5 = r11.getInt(r5, r3)
                r10.f1737O = r5
                goto L_0x039e
            L_0x0149:
                int r5 = r11.getInt(r5, r3)
                r10.f1736N = r5
                goto L_0x039e
            L_0x0151:
                float r6 = r10.f1735M
                float r5 = r11.getFloat(r5, r6)
                r10.f1735M = r5
                goto L_0x039e
            L_0x015b:
                float r6 = r10.f1734L
                float r5 = r11.getFloat(r5, r6)
                r10.f1734L = r5
                goto L_0x039e
            L_0x0165:
                java.lang.String r5 = r11.getString(r5)
                androidx.constraintlayout.widget.C0466e.m2009w(r10, r5)
                goto L_0x039e
            L_0x016e:
                float r6 = r10.f1745W
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.f1745W = r5
                r10.f1739Q = r8
                goto L_0x039e
            L_0x017e:
                int r6 = r10.f1743U     // Catch:{ Exception -> 0x0188 }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0188 }
                r10.f1743U = r6     // Catch:{ Exception -> 0x0188 }
                goto L_0x039e
            L_0x0188:
                int r6 = r10.f1743U
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.f1743U = r9
                goto L_0x039e
            L_0x0194:
                int r6 = r10.f1741S     // Catch:{ Exception -> 0x019e }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x019e }
                r10.f1741S = r6     // Catch:{ Exception -> 0x019e }
                goto L_0x039e
            L_0x019e:
                int r6 = r10.f1741S
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.f1741S = r9
                goto L_0x039e
            L_0x01aa:
                float r6 = r10.f1744V
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.f1744V = r5
                r10.f1738P = r8
                goto L_0x039e
            L_0x01ba:
                int r6 = r10.f1742T     // Catch:{ Exception -> 0x01c4 }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x01c4 }
                r10.f1742T = r6     // Catch:{ Exception -> 0x01c4 }
                goto L_0x039e
            L_0x01c4:
                int r6 = r10.f1742T
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.f1742T = r9
                goto L_0x039e
            L_0x01d0:
                int r6 = r10.f1740R     // Catch:{ Exception -> 0x01da }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x01da }
                r10.f1740R = r6     // Catch:{ Exception -> 0x01da }
                goto L_0x039e
            L_0x01da:
                int r6 = r10.f1740R
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.f1740R = r9
                goto L_0x039e
            L_0x01e6:
                int r5 = r11.getInt(r5, r3)
                r10.f1739Q = r5
                if (r5 != r2) goto L_0x039e
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x01fb
            L_0x01f1:
                int r5 = r11.getInt(r5, r3)
                r10.f1738P = r5
                if (r5 != r2) goto L_0x039e
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x01fb:
                android.util.Log.e(r7, r5)
                goto L_0x039e
            L_0x0200:
                float r6 = r10.f1730H
                float r5 = r11.getFloat(r5, r6)
                r10.f1730H = r5
                goto L_0x039e
            L_0x020a:
                float r6 = r10.f1729G
                float r5 = r11.getFloat(r5, r6)
                r10.f1729G = r5
                goto L_0x039e
            L_0x0214:
                boolean r6 = r10.f1752b0
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f1752b0 = r5
                goto L_0x039e
            L_0x021e:
                boolean r6 = r10.f1750a0
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f1750a0 = r5
                goto L_0x039e
            L_0x0228:
                int r6 = r10.f1724B
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1724B = r5
                goto L_0x039e
            L_0x0232:
                int r6 = r10.f1723A
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1723A = r5
                goto L_0x039e
            L_0x023c:
                int r6 = r10.f1797z
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1797z = r5
                goto L_0x039e
            L_0x0246:
                int r6 = r10.f1796y
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1796y = r5
                goto L_0x039e
            L_0x0250:
                int r6 = r10.f1795x
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1795x = r5
                goto L_0x039e
            L_0x025a:
                int r6 = r10.f1793w
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1793w = r5
                goto L_0x039e
            L_0x0264:
                int r6 = r10.f1791v
                int r6 = r11.getResourceId(r5, r6)
                r10.f1791v = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1791v = r5
                goto L_0x039e
            L_0x0276:
                int r6 = r10.f1789u
                int r6 = r11.getResourceId(r5, r6)
                r10.f1789u = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1789u = r5
                goto L_0x039e
            L_0x0288:
                int r6 = r10.f1787t
                int r6 = r11.getResourceId(r5, r6)
                r10.f1787t = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1787t = r5
                goto L_0x039e
            L_0x029a:
                int r6 = r10.f1785s
                int r6 = r11.getResourceId(r5, r6)
                r10.f1785s = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1785s = r5
                goto L_0x039e
            L_0x02ac:
                int r6 = r10.f1773m
                int r6 = r11.getResourceId(r5, r6)
                r10.f1773m = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1773m = r5
                goto L_0x039e
            L_0x02be:
                int r6 = r10.f1771l
                int r6 = r11.getResourceId(r5, r6)
                r10.f1771l = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1771l = r5
                goto L_0x039e
            L_0x02d0:
                int r6 = r10.f1769k
                int r6 = r11.getResourceId(r5, r6)
                r10.f1769k = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1769k = r5
                goto L_0x039e
            L_0x02e2:
                int r6 = r10.f1767j
                int r6 = r11.getResourceId(r5, r6)
                r10.f1767j = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1767j = r5
                goto L_0x039e
            L_0x02f4:
                int r6 = r10.f1765i
                int r6 = r11.getResourceId(r5, r6)
                r10.f1765i = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1765i = r5
                goto L_0x039e
            L_0x0306:
                int r6 = r10.f1763h
                int r6 = r11.getResourceId(r5, r6)
                r10.f1763h = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1763h = r5
                goto L_0x039e
            L_0x0318:
                int r6 = r10.f1761g
                int r6 = r11.getResourceId(r5, r6)
                r10.f1761g = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1761g = r5
                goto L_0x039e
            L_0x032a:
                int r6 = r10.f1759f
                int r6 = r11.getResourceId(r5, r6)
                r10.f1759f = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1759f = r5
                goto L_0x039e
            L_0x033b:
                int r6 = r10.f1757e
                int r6 = r11.getResourceId(r5, r6)
                r10.f1757e = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1757e = r5
                goto L_0x039e
            L_0x034c:
                float r6 = r10.f1753c
                float r5 = r11.getFloat(r5, r6)
                r10.f1753c = r5
                goto L_0x039e
            L_0x0355:
                int r6 = r10.f1751b
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f1751b = r5
                goto L_0x039e
            L_0x035e:
                int r6 = r10.f1749a
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f1749a = r5
                goto L_0x039e
            L_0x0367:
                float r6 = r10.f1783r
                float r5 = r11.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r10.f1783r = r5
                int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r7 >= 0) goto L_0x039e
                float r5 = r6 - r5
                float r5 = r5 % r6
                r10.f1783r = r5
                goto L_0x039e
            L_0x037c:
                int r6 = r10.f1781q
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1781q = r5
                goto L_0x039e
            L_0x0385:
                int r6 = r10.f1779p
                int r6 = r11.getResourceId(r5, r6)
                r10.f1779p = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1779p = r5
                goto L_0x039e
            L_0x0396:
                int r6 = r10.f1748Z
                int r5 = r11.getInt(r5, r6)
                r10.f1748Z = r5
            L_0x039e:
                int r1 = r1 + 1
                goto L_0x00b0
            L_0x03a2:
                r11.recycle()
                r10.mo2451a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0455b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0455b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo2451a() {
            this.f1764h0 = false;
            this.f1758e0 = true;
            this.f1760f0 = true;
            int i = this.width;
            if (i == -2 && this.f1750a0) {
                this.f1758e0 = false;
                if (this.f1738P == 0) {
                    this.f1738P = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f1752b0) {
                this.f1760f0 = false;
                if (this.f1739Q == 0) {
                    this.f1739Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1758e0 = false;
                if (i == 0 && this.f1738P == 1) {
                    this.width = -2;
                    this.f1750a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1760f0 = false;
                if (i2 == 0 && this.f1739Q == 1) {
                    this.height = -2;
                    this.f1752b0 = true;
                }
            }
            if (this.f1753c != -1.0f || this.f1749a != -1 || this.f1751b != -1) {
                this.f1764h0 = true;
                this.f1758e0 = true;
                this.f1760f0 = true;
                if (!(this.f1792v0 instanceof C2480g)) {
                    this.f1792v0 = new C2480g();
                }
                ((C2480g) this.f1792v0).mo9603x1(this.f1748Z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00df, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1776n0 = r4
                r10.f1778o0 = r4
                r10.f1772l0 = r4
                r10.f1774m0 = r4
                int r5 = r10.f1793w
                r10.f1780p0 = r5
                int r5 = r10.f1796y
                r10.f1782q0 = r5
                float r5 = r10.f1729G
                r10.f1784r0 = r5
                int r6 = r10.f1749a
                r10.f1786s0 = r6
                int r7 = r10.f1751b
                r10.f1788t0 = r7
                float r8 = r10.f1753c
                r10.f1790u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0092
                int r11 = r10.f1785s
                if (r11 == r4) goto L_0x003f
                r10.f1776n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f1787t
                if (r11 == r4) goto L_0x0046
                r10.f1778o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f1789u
                if (r11 == r4) goto L_0x004d
                r10.f1774m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f1791v
                if (r11 == r4) goto L_0x0054
                r10.f1772l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f1723A
                if (r11 == r9) goto L_0x005a
                r10.f1782q0 = r11
            L_0x005a:
                int r11 = r10.f1724B
                if (r11 == r9) goto L_0x0060
                r10.f1780p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f1784r0 = r2
            L_0x0068:
                boolean r2 = r10.f1764h0
                if (r2 == 0) goto L_0x00b6
                int r2 = r10.f1748Z
                if (r2 != r3) goto L_0x00b6
                boolean r2 = r10.f1755d
                if (r2 == 0) goto L_0x00b6
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f1790u0 = r11
                r10.f1786s0 = r4
                r10.f1788t0 = r4
                goto L_0x00b6
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1788t0 = r6
                r10.f1786s0 = r4
            L_0x0088:
                r10.f1790u0 = r2
                goto L_0x00b6
            L_0x008b:
                if (r7 == r4) goto L_0x00b6
                r10.f1786s0 = r7
                r10.f1788t0 = r4
                goto L_0x0088
            L_0x0092:
                int r11 = r10.f1785s
                if (r11 == r4) goto L_0x0098
                r10.f1774m0 = r11
            L_0x0098:
                int r11 = r10.f1787t
                if (r11 == r4) goto L_0x009e
                r10.f1772l0 = r11
            L_0x009e:
                int r11 = r10.f1789u
                if (r11 == r4) goto L_0x00a4
                r10.f1776n0 = r11
            L_0x00a4:
                int r11 = r10.f1791v
                if (r11 == r4) goto L_0x00aa
                r10.f1778o0 = r11
            L_0x00aa:
                int r11 = r10.f1723A
                if (r11 == r9) goto L_0x00b0
                r10.f1780p0 = r11
            L_0x00b0:
                int r11 = r10.f1724B
                if (r11 == r9) goto L_0x00b6
                r10.f1782q0 = r11
            L_0x00b6:
                int r11 = r10.f1789u
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1791v
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1787t
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1785s
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1761g
                if (r11 == r4) goto L_0x00d5
                r10.f1776n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
            L_0x00d2:
                r10.rightMargin = r1
                goto L_0x00e2
            L_0x00d5:
                int r11 = r10.f1763h
                if (r11 == r4) goto L_0x00e2
                r10.f1778o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r11 = r10.f1757e
                if (r11 == r4) goto L_0x00f1
                r10.f1772l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
            L_0x00ee:
                r10.leftMargin = r0
                goto L_0x00fe
            L_0x00f1:
                int r11 = r10.f1759f
                if (r11 == r4) goto L_0x00fe
                r10.f1774m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                goto L_0x00ee
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0455b.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0457c implements C2512b.C2514b {

        /* renamed from: a */
        ConstraintLayout f1799a;

        /* renamed from: b */
        int f1800b;

        /* renamed from: c */
        int f1801c;

        /* renamed from: d */
        int f1802d;

        /* renamed from: e */
        int f1803e;

        /* renamed from: f */
        int f1804f;

        /* renamed from: g */
        int f1805g;

        public C0457c(ConstraintLayout constraintLayout) {
            this.f1799a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m1963d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo2453a() {
            int childCount = this.f1799a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1799a.getChildAt(i);
                if (childAt instanceof C0476h) {
                    ((C0476h) childAt).mo2533a(this.f1799a);
                }
            }
            int size = this.f1799a.f1700e.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0462c) this.f1799a.f1700e.get(i2)).mo2483p(this.f1799a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2454b(p087o.C2476e r18, p093p.C2512b.C2513a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.mo9501T()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r18.mo9530h0()
                if (r3 != 0) goto L_0x001f
                r2.f9921e = r5
                r2.f9922f = r5
                r2.f9923g = r5
                return
            L_0x001f:
                o.e r3 = r18.mo9481I()
                if (r3 != 0) goto L_0x0026
                return
            L_0x0026:
                o.e$b r3 = r2.f9917a
                o.e$b r4 = r2.f9918b
                int r6 = r2.f9919c
                int r7 = r2.f9920d
                int r8 = r0.f1800b
                int r9 = r0.f1801c
                int r8 = r8 + r9
                int r9 = r0.f1802d
                java.lang.Object r10 = r18.mo9551q()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0454a.f1722a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto L_0x00a8
                if (r12 == r15) goto L_0x00a0
                if (r12 == r14) goto L_0x0097
                if (r12 == r13) goto L_0x0051
                r6 = 0
                goto L_0x00ae
            L_0x0051:
                int r6 = r0.f1804f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f9628w
                if (r9 != r5) goto L_0x005e
                r9 = r5
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                int r12 = r2.f9926j
                int r13 = p093p.C2512b.C2513a.f9915l
                if (r12 == r13) goto L_0x0069
                int r13 = p093p.C2512b.C2513a.f9916m
                if (r12 != r13) goto L_0x00ae
            L_0x0069:
                int r12 = r10.getMeasuredHeight()
                int r13 = r18.mo9560v()
                if (r12 != r13) goto L_0x0075
                r12 = r5
                goto L_0x0076
            L_0x0075:
                r12 = 0
            L_0x0076:
                int r13 = r2.f9926j
                int r14 = p093p.C2512b.C2513a.f9916m
                if (r13 == r14) goto L_0x008f
                if (r9 == 0) goto L_0x008f
                if (r9 == 0) goto L_0x0082
                if (r12 != 0) goto L_0x008f
            L_0x0082:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.C0476h
                if (r9 != 0) goto L_0x008f
                boolean r9 = r18.mo9432l0()
                if (r9 == 0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                r9 = 0
                goto L_0x0090
            L_0x008f:
                r9 = r5
            L_0x0090:
                if (r9 == 0) goto L_0x00ae
                int r6 = r18.mo9503U()
                goto L_0x00a8
            L_0x0097:
                int r6 = r0.f1804f
                int r12 = r18.mo9566z()
                int r9 = r9 + r12
                r12 = -1
                goto L_0x00a3
            L_0x00a0:
                int r6 = r0.f1804f
                r12 = -2
            L_0x00a3:
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00ae
            L_0x00a8:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            L_0x00ae:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x0117
                if (r9 == r15) goto L_0x010f
                r7 = 3
                if (r9 == r7) goto L_0x0106
                r7 = 4
                if (r9 == r7) goto L_0x00c0
                r7 = 0
                goto L_0x011d
            L_0x00c0:
                int r7 = r0.f1805g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f9630x
                if (r8 != r5) goto L_0x00cd
                r8 = r5
                goto L_0x00ce
            L_0x00cd:
                r8 = 0
            L_0x00ce:
                int r9 = r2.f9926j
                int r11 = p093p.C2512b.C2513a.f9915l
                if (r9 == r11) goto L_0x00d8
                int r11 = p093p.C2512b.C2513a.f9916m
                if (r9 != r11) goto L_0x011d
            L_0x00d8:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo9503U()
                if (r9 != r11) goto L_0x00e4
                r9 = r5
                goto L_0x00e5
            L_0x00e4:
                r9 = 0
            L_0x00e5:
                int r11 = r2.f9926j
                int r12 = p093p.C2512b.C2513a.f9916m
                if (r11 == r12) goto L_0x00fe
                if (r8 == 0) goto L_0x00fe
                if (r8 == 0) goto L_0x00f1
                if (r9 != 0) goto L_0x00fe
            L_0x00f1:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.C0476h
                if (r8 != 0) goto L_0x00fe
                boolean r8 = r18.mo9433m0()
                if (r8 == 0) goto L_0x00fc
                goto L_0x00fe
            L_0x00fc:
                r8 = 0
                goto L_0x00ff
            L_0x00fe:
                r8 = r5
            L_0x00ff:
                if (r8 == 0) goto L_0x011d
                int r7 = r18.mo9560v()
                goto L_0x0117
            L_0x0106:
                int r7 = r0.f1805g
                int r9 = r18.mo9499S()
                int r8 = r8 + r9
                r9 = -1
                goto L_0x0112
            L_0x010f:
                int r7 = r0.f1805g
                r9 = -2
            L_0x0112:
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x011d
            L_0x0117:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x011d:
                o.e r8 = r18.mo9481I()
                o.f r8 = (p087o.C2479f) r8
                if (r8 == 0) goto L_0x019f
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.f1707l
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = p087o.C2484j.m10635b(r9, r11)
                if (r9 == 0) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo9503U()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.mo9503U()
                if (r9 >= r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.mo9560v()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.mo9560v()
                if (r9 >= r8) goto L_0x019f
                int r8 = r10.getBaseline()
                int r9 = r18.mo9544n()
                if (r8 != r9) goto L_0x019f
                boolean r8 = r18.mo9538k0()
                if (r8 != 0) goto L_0x019f
                int r8 = r18.mo9465A()
                int r9 = r18.mo9503U()
                boolean r8 = r0.m1963d(r8, r6, r9)
                if (r8 == 0) goto L_0x0189
                int r8 = r18.mo9467B()
                int r9 = r18.mo9560v()
                boolean r8 = r0.m1963d(r8, r7, r9)
                if (r8 == 0) goto L_0x0189
                r8 = r5
                goto L_0x018a
            L_0x0189:
                r8 = 0
            L_0x018a:
                if (r8 == 0) goto L_0x019f
                int r3 = r18.mo9503U()
                r2.f9921e = r3
                int r3 = r18.mo9560v()
                r2.f9922f = r3
                int r1 = r18.mo9544n()
                r2.f9923g = r1
                return
            L_0x019f:
                o.e$b r8 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x01a5
                r9 = r5
                goto L_0x01a6
            L_0x01a5:
                r9 = 0
            L_0x01a6:
                if (r4 != r8) goto L_0x01aa
                r8 = r5
                goto L_0x01ab
            L_0x01aa:
                r8 = 0
            L_0x01ab:
                o.e$b r11 = p087o.C2476e.C2478b.MATCH_PARENT
                if (r4 == r11) goto L_0x01b6
                o.e$b r12 = p087o.C2476e.C2478b.FIXED
                if (r4 != r12) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                r4 = 0
                goto L_0x01b7
            L_0x01b6:
                r4 = r5
            L_0x01b7:
                if (r3 == r11) goto L_0x01c0
                o.e$b r11 = p087o.C2476e.C2478b.FIXED
                if (r3 != r11) goto L_0x01be
                goto L_0x01c0
            L_0x01be:
                r3 = 0
                goto L_0x01c1
            L_0x01c0:
                r3 = r5
            L_0x01c1:
                r11 = 0
                if (r9 == 0) goto L_0x01cc
                float r12 = r1.f9591d0
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x01cc
                r12 = r5
                goto L_0x01cd
            L_0x01cc:
                r12 = 0
            L_0x01cd:
                if (r8 == 0) goto L_0x01d7
                float r13 = r1.f9591d0
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L_0x01d7
                r11 = r5
                goto L_0x01d8
            L_0x01d7:
                r11 = 0
            L_0x01d8:
                if (r10 != 0) goto L_0x01db
                return
            L_0x01db:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$b r13 = (androidx.constraintlayout.widget.ConstraintLayout.C0455b) r13
                int r14 = r2.f9926j
                int r15 = p093p.C2512b.C2513a.f9915l
                if (r14 == r15) goto L_0x01fe
                int r15 = p093p.C2512b.C2513a.f9916m
                if (r14 == r15) goto L_0x01fe
                if (r9 == 0) goto L_0x01fe
                int r9 = r1.f9628w
                if (r9 != 0) goto L_0x01fe
                if (r8 == 0) goto L_0x01fe
                int r8 = r1.f9630x
                if (r8 == 0) goto L_0x01f8
                goto L_0x01fe
            L_0x01f8:
                r0 = -1
                r5 = 0
                r14 = 0
                r15 = 0
                goto L_0x0299
            L_0x01fe:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.C0480l
                if (r8 == 0) goto L_0x0210
                boolean r8 = r1 instanceof p087o.C2485k
                if (r8 == 0) goto L_0x0210
                r8 = r1
                o.k r8 = (p087o.C2485k) r8
                r9 = r10
                androidx.constraintlayout.widget.l r9 = (androidx.constraintlayout.widget.C0480l) r9
                r9.mo2542t(r8, r6, r7)
                goto L_0x0213
            L_0x0210:
                r10.measure(r6, r7)
            L_0x0213:
                r1.mo9500S0(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                int r15 = r1.f9634z
                if (r15 <= 0) goto L_0x022b
                int r15 = java.lang.Math.max(r15, r8)
                goto L_0x022c
            L_0x022b:
                r15 = r8
            L_0x022c:
                int r5 = r1.f9548A
                if (r5 <= 0) goto L_0x0234
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0234:
                int r5 = r1.f9552C
                if (r5 <= 0) goto L_0x023f
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0242
            L_0x023f:
                r16 = r6
                r5 = r9
            L_0x0242:
                int r6 = r1.f9554D
                if (r6 <= 0) goto L_0x024a
                int r5 = java.lang.Math.min(r6, r5)
            L_0x024a:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.f1707l
                r0 = 1
                boolean r6 = p087o.C2484j.m10635b(r6, r0)
                if (r6 != 0) goto L_0x026e
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r12 == 0) goto L_0x0264
                if (r4 == 0) goto L_0x0264
                float r3 = r1.f9591d0
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r15 = (int) r4
                goto L_0x026e
            L_0x0264:
                if (r11 == 0) goto L_0x026e
                if (r3 == 0) goto L_0x026e
                float r3 = r1.f9591d0
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r5 = (int) r4
            L_0x026e:
                if (r8 != r15) goto L_0x0275
                if (r9 == r5) goto L_0x0273
                goto L_0x0275
            L_0x0273:
                r0 = -1
                goto L_0x0299
            L_0x0275:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r15) goto L_0x027e
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x0280
            L_0x027e:
                r6 = r16
            L_0x0280:
                if (r9 == r5) goto L_0x0286
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x0286:
                r10.measure(r6, r7)
                r1.mo9500S0(r6, r7)
                int r15 = r10.getMeasuredWidth()
                int r5 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                goto L_0x0273
            L_0x0299:
                if (r14 == r0) goto L_0x029d
                r0 = 1
                goto L_0x029e
            L_0x029d:
                r0 = 0
            L_0x029e:
                int r3 = r2.f9919c
                if (r15 != r3) goto L_0x02a9
                int r3 = r2.f9920d
                if (r5 == r3) goto L_0x02a7
                goto L_0x02a9
            L_0x02a7:
                r3 = 0
                goto L_0x02aa
            L_0x02a9:
                r3 = 1
            L_0x02aa:
                r2.f9925i = r3
                boolean r3 = r13.f1762g0
                if (r3 == 0) goto L_0x02b1
                r0 = 1
            L_0x02b1:
                if (r0 == 0) goto L_0x02bf
                r3 = -1
                if (r14 == r3) goto L_0x02bf
                int r1 = r18.mo9544n()
                if (r1 == r14) goto L_0x02bf
                r1 = 1
                r2.f9925i = r1
            L_0x02bf:
                r2.f9921e = r15
                r2.f9922f = r5
                r2.f9924h = r0
                r2.f9923g = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0457c.mo2454b(o.e, p.b$a):void");
        }

        /* renamed from: c */
        public void mo2455c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1800b = i3;
            this.f1801c = i4;
            this.f1802d = i5;
            this.f1803e = i6;
            this.f1804f = i;
            this.f1805g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1945p(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static C0479k getSharedValues() {
        if (f1698A == null) {
            f1698A = new C0479k();
        }
        return f1698A;
    }

    /* renamed from: h */
    private final C2476e m1944h(int i) {
        if (i == 0) {
            return this.f1701f;
        }
        View view = this.f1699d.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1701f;
        }
        if (view == null) {
            return null;
        }
        return ((C0455b) view.getLayoutParams()).f1792v0;
    }

    /* renamed from: p */
    private void m1945p(AttributeSet attributeSet, int i, int i2) {
        this.f1701f.mo9565y0(this);
        this.f1701f.mo9583R1(this.f1719x);
        this.f1699d.put(getId(), this);
        this.f1708m = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0478j.f2334n1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0478j.f2379s1) {
                    this.f1702g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1702g);
                } else if (index == C0478j.f2388t1) {
                    this.f1703h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1703h);
                } else if (index == C0478j.f2361q1) {
                    this.f1704i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1704i);
                } else if (index == C0478j.f2370r1) {
                    this.f1705j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1705j);
                } else if (index == C0478j.f2066H2) {
                    this.f1707l = obtainStyledAttributes.getInt(index, this.f1707l);
                } else if (index == C0478j.f2024C1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2390s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1709n = null;
                        }
                    }
                } else if (index == C0478j.f2433y1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0466e eVar = new C0466e();
                        this.f1708m = eVar;
                        eVar.mo2508r(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1708m = null;
                    }
                    this.f1710o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1701f.mo9584S1(this.f1707l);
    }

    /* renamed from: r */
    private void m1946r() {
        this.f1706k = true;
        this.f1712q = -1;
        this.f1713r = -1;
        this.f1714s = -1;
        this.f1715t = -1;
        this.f1716u = 0;
        this.f1717v = 0;
    }

    /* renamed from: v */
    private void m1947v() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2476e l = mo2436l(getChildAt(i));
            if (l != null) {
                l.mo9554r0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2449w(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1944h(childAt.getId()).mo9567z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1710o != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f1710o && (childAt2 instanceof C0473f)) {
                    this.f1708m = ((C0473f) childAt2).getConstraintSet();
                }
            }
        }
        C0466e eVar = this.f1708m;
        if (eVar != null) {
            eVar.mo2497d(this, true);
        }
        this.f1701f.mo9615r1();
        int size = this.f1700e.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f1700e.get(i4).mo2485r(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0476h) {
                ((C0476h) childAt3).mo2534b(this);
            }
        }
        this.f1718w.clear();
        this.f1718w.put(0, this.f1701f);
        this.f1718w.put(getId(), this.f1701f);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f1718w.put(childAt4.getId(), mo2436l(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C2476e l2 = mo2436l(childAt5);
            if (l2 != null) {
                this.f1701f.mo9612b(l2);
                mo2421d(isInEditMode, childAt5, l2, (C0455b) childAt5.getLayoutParams(), this.f1718w);
            }
        }
    }

    /* renamed from: y */
    private void m1948y(C2476e eVar, C0455b bVar, SparseArray<C2476e> sparseArray, int i, C2473d.C2475b bVar2) {
        View view = this.f1699d.get(i);
        C2476e eVar2 = sparseArray.get(i);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof C0455b)) {
            bVar.f1762g0 = true;
            C2473d.C2475b bVar3 = C2473d.C2475b.BASELINE;
            if (bVar2 == bVar3) {
                C0455b bVar4 = (C0455b) view.getLayoutParams();
                bVar4.f1762g0 = true;
                bVar4.f1792v0.mo9480H0(true);
            }
            eVar.mo9542m(bVar3).mo9445a(eVar2.mo9542m(bVar2), bVar.f1726D, bVar.f1725C, true);
            eVar.mo9480H0(true);
            eVar.mo9542m(C2473d.C2475b.TOP).mo9460p();
            eVar.mo9542m(C2473d.C2475b.BOTTOM).mo9460p();
        }
    }

    /* renamed from: z */
    private boolean m1949z() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m1947v();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0455b;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0166  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2421d(boolean r17, android.view.View r18, p087o.C2476e r19, androidx.constraintlayout.widget.ConstraintLayout.C0455b r20, android.util.SparseArray<p087o.C2476e> r21) {
        /*
            r16 = this;
            r0 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r20.mo2451a()
            r9 = 0
            r7.f1794w0 = r9
            int r1 = r18.getVisibility()
            r6.mo9529g1(r1)
            boolean r1 = r7.f1768j0
            if (r1 == 0) goto L_0x0022
            r1 = 1
            r6.mo9496Q0(r1)
            r1 = 8
            r6.mo9529g1(r1)
        L_0x0022:
            r6.mo9565y0(r0)
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.C0462c
            if (r1 == 0) goto L_0x0037
            androidx.constraintlayout.widget.c r0 = (androidx.constraintlayout.widget.C0462c) r0
            r10 = r16
            o.f r1 = r10.f1701f
            boolean r1 = r1.mo9579L1()
            r0.mo2466n(r6, r1)
            goto L_0x0039
        L_0x0037:
            r10 = r16
        L_0x0039:
            boolean r0 = r7.f1764h0
            r11 = -1
            if (r0 == 0) goto L_0x0060
            r0 = r6
            o.g r0 = (p087o.C2480g) r0
            int r1 = r7.f1786s0
            int r2 = r7.f1788t0
            float r3 = r7.f1790u0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0052
            r0.mo9602w1(r3)
            goto L_0x0237
        L_0x0052:
            if (r1 == r11) goto L_0x0059
            r0.mo9600u1(r1)
            goto L_0x0237
        L_0x0059:
            if (r2 == r11) goto L_0x0237
            r0.mo9601v1(r2)
            goto L_0x0237
        L_0x0060:
            int r0 = r7.f1772l0
            int r1 = r7.f1774m0
            int r12 = r7.f1776n0
            int r13 = r7.f1778o0
            int r5 = r7.f1780p0
            int r14 = r7.f1782q0
            float r15 = r7.f1784r0
            int r2 = r7.f1779p
            if (r2 == r11) goto L_0x0083
            java.lang.Object r0 = r8.get(r2)
            o.e r0 = (p087o.C2476e) r0
            if (r0 == 0) goto L_0x0169
            float r1 = r7.f1783r
            int r2 = r7.f1781q
            r6.mo9534j(r0, r1, r2)
            goto L_0x0169
        L_0x0083:
            if (r0 == r11) goto L_0x0096
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x00ac
            o.d$b r3 = p087o.C2473d.C2475b.LEFT
            int r4 = r7.leftMargin
            r0 = r19
            r1 = r3
            goto L_0x00a9
        L_0x0096:
            if (r1 == r11) goto L_0x00ac
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x00ac
            o.d$b r1 = p087o.C2473d.C2475b.LEFT
            o.d$b r3 = p087o.C2473d.C2475b.RIGHT
            int r4 = r7.leftMargin
            r0 = r19
        L_0x00a9:
            r0.mo9519c0(r1, r2, r3, r4, r5)
        L_0x00ac:
            if (r12 == r11) goto L_0x00c0
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x00d6
            o.d$b r1 = p087o.C2473d.C2475b.RIGHT
            o.d$b r3 = p087o.C2473d.C2475b.LEFT
            int r4 = r7.rightMargin
            r0 = r19
            goto L_0x00d2
        L_0x00c0:
            if (r13 == r11) goto L_0x00d6
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x00d6
            o.d$b r3 = p087o.C2473d.C2475b.RIGHT
            int r4 = r7.rightMargin
            r0 = r19
            r1 = r3
        L_0x00d2:
            r5 = r14
            r0.mo9519c0(r1, r2, r3, r4, r5)
        L_0x00d6:
            int r0 = r7.f1765i
            if (r0 == r11) goto L_0x00ed
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x0107
            o.d$b r3 = p087o.C2473d.C2475b.TOP
            int r4 = r7.topMargin
            int r5 = r7.f1795x
            r0 = r19
            r1 = r3
            goto L_0x0104
        L_0x00ed:
            int r0 = r7.f1767j
            if (r0 == r11) goto L_0x0107
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x0107
            o.d$b r1 = p087o.C2473d.C2475b.TOP
            o.d$b r3 = p087o.C2473d.C2475b.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.f1795x
            r0 = r19
        L_0x0104:
            r0.mo9519c0(r1, r2, r3, r4, r5)
        L_0x0107:
            int r0 = r7.f1769k
            if (r0 == r11) goto L_0x011f
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x0138
            o.d$b r1 = p087o.C2473d.C2475b.BOTTOM
            o.d$b r3 = p087o.C2473d.C2475b.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.f1797z
            r0 = r19
            goto L_0x0135
        L_0x011f:
            int r0 = r7.f1771l
            if (r0 == r11) goto L_0x0138
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            o.e r2 = (p087o.C2476e) r2
            if (r2 == 0) goto L_0x0138
            o.d$b r3 = p087o.C2473d.C2475b.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.f1797z
            r0 = r19
            r1 = r3
        L_0x0135:
            r0.mo9519c0(r1, r2, r3, r4, r5)
        L_0x0138:
            int r4 = r7.f1773m
            if (r4 == r11) goto L_0x014a
            o.d$b r5 = p087o.C2473d.C2475b.BASELINE
        L_0x013e:
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.m1948y(r1, r2, r3, r4, r5)
            goto L_0x0158
        L_0x014a:
            int r4 = r7.f1775n
            if (r4 == r11) goto L_0x0151
            o.d$b r5 = p087o.C2473d.C2475b.TOP
            goto L_0x013e
        L_0x0151:
            int r4 = r7.f1777o
            if (r4 == r11) goto L_0x0158
            o.d$b r5 = p087o.C2473d.C2475b.BOTTOM
            goto L_0x013e
        L_0x0158:
            r0 = 0
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x0160
            r6.mo9484J0(r15)
        L_0x0160:
            float r1 = r7.f1730H
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0169
            r6.mo9516a1(r1)
        L_0x0169:
            if (r17 == 0) goto L_0x0178
            int r0 = r7.f1746X
            if (r0 != r11) goto L_0x0173
            int r1 = r7.f1747Y
            if (r1 == r11) goto L_0x0178
        L_0x0173:
            int r1 = r7.f1747Y
            r6.mo9512Y0(r0, r1)
        L_0x0178:
            boolean r0 = r7.f1758e0
            r1 = -2
            if (r0 != 0) goto L_0x01ab
            int r0 = r7.width
            if (r0 != r11) goto L_0x01a2
            boolean r0 = r7.f1750a0
            if (r0 == 0) goto L_0x0188
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            goto L_0x018a
        L_0x0188:
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_PARENT
        L_0x018a:
            r6.mo9490M0(r0)
            o.d$b r0 = p087o.C2473d.C2475b.LEFT
            o.d r0 = r6.mo9542m(r0)
            int r2 = r7.leftMargin
            r0.f9533g = r2
            o.d$b r0 = p087o.C2473d.C2475b.RIGHT
            o.d r0 = r6.mo9542m(r0)
            int r2 = r7.rightMargin
            r0.f9533g = r2
            goto L_0x01be
        L_0x01a2:
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            r6.mo9490M0(r0)
            r6.mo9531h1(r9)
            goto L_0x01be
        L_0x01ab:
            o.e$b r0 = p087o.C2476e.C2478b.FIXED
            r6.mo9490M0(r0)
            int r0 = r7.width
            r6.mo9531h1(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x01be
            o.e$b r0 = p087o.C2476e.C2478b.WRAP_CONTENT
            r6.mo9490M0(r0)
        L_0x01be:
            boolean r0 = r7.f1760f0
            if (r0 != 0) goto L_0x01f0
            int r0 = r7.height
            if (r0 != r11) goto L_0x01e7
            boolean r0 = r7.f1752b0
            if (r0 == 0) goto L_0x01cd
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            goto L_0x01cf
        L_0x01cd:
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_PARENT
        L_0x01cf:
            r6.mo9521d1(r0)
            o.d$b r0 = p087o.C2473d.C2475b.TOP
            o.d r0 = r6.mo9542m(r0)
            int r1 = r7.topMargin
            r0.f9533g = r1
            o.d$b r0 = p087o.C2473d.C2475b.BOTTOM
            o.d r0 = r6.mo9542m(r0)
            int r1 = r7.bottomMargin
            r0.f9533g = r1
            goto L_0x0203
        L_0x01e7:
            o.e$b r0 = p087o.C2476e.C2478b.MATCH_CONSTRAINT
            r6.mo9521d1(r0)
            r6.mo9482I0(r9)
            goto L_0x0203
        L_0x01f0:
            o.e$b r0 = p087o.C2476e.C2478b.FIXED
            r6.mo9521d1(r0)
            int r0 = r7.height
            r6.mo9482I0(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x0203
            o.e$b r0 = p087o.C2476e.C2478b.WRAP_CONTENT
            r6.mo9521d1(r0)
        L_0x0203:
            java.lang.String r0 = r7.f1731I
            r6.mo9466A0(r0)
            float r0 = r7.f1734L
            r6.mo9492O0(r0)
            float r0 = r7.f1735M
            r6.mo9527f1(r0)
            int r0 = r7.f1736N
            r6.mo9486K0(r0)
            int r0 = r7.f1737O
            r6.mo9518b1(r0)
            int r0 = r7.f1756d0
            r6.mo9533i1(r0)
            int r0 = r7.f1738P
            int r1 = r7.f1740R
            int r2 = r7.f1742T
            float r3 = r7.f1744V
            r6.mo9491N0(r0, r1, r2, r3)
            int r0 = r7.f1739Q
            int r1 = r7.f1741S
            int r2 = r7.f1743U
            float r3 = r7.f1745W
            r6.mo9524e1(r0, r1, r2, r3)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2421d(boolean, android.view.View, o.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C0462c> arrayList = this.f1700e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f1700e.get(i).mo2484q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0455b generateDefaultLayoutParams() {
        return new C0455b(-2, -2);
    }

    /* renamed from: f */
    public C0455b generateLayoutParams(AttributeSet attributeSet) {
        return new C0455b(getContext(), attributeSet);
    }

    public void forceLayout() {
        m1946r();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object mo2425g(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1711p;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1711p.get(str);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0455b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1705j;
    }

    public int getMaxWidth() {
        return this.f1704i;
    }

    public int getMinHeight() {
        return this.f1703h;
    }

    public int getMinWidth() {
        return this.f1702g;
    }

    public int getOptimizationLevel() {
        return this.f1701f.mo9574G1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1701f.f9612o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1701f.f9612o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1701f.f9612o = "parent";
            }
        }
        if (this.f1701f.mo9553r() == null) {
            C2479f fVar = this.f1701f;
            fVar.mo9567z0(fVar.f9612o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1701f.mo9553r());
        }
        Iterator<C2476e> it = this.f1701f.mo9613o1().iterator();
        while (it.hasNext()) {
            C2476e next = it.next();
            View view = (View) next.mo9551q();
            if (view != null) {
                if (next.f9612o == null && (id = view.getId()) != -1) {
                    next.f9612o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.mo9553r() == null) {
                    next.mo9567z0(next.f9612o);
                    Log.v("ConstraintLayout", " setDebugName " + next.mo9553r());
                }
            }
        }
        this.f1701f.mo9489M(sb);
        return sb.toString();
    }

    /* renamed from: k */
    public View mo2435k(int i) {
        return this.f1699d.get(i);
    }

    /* renamed from: l */
    public final C2476e mo2436l(View view) {
        if (view == this) {
            return this.f1701f;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof C0455b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof C0455b)) {
                return null;
            }
        }
        return ((C0455b) view.getLayoutParams()).f1792v0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0455b bVar = (C0455b) childAt.getLayoutParams();
            C2476e eVar = bVar.f1792v0;
            if ((childAt.getVisibility() != 8 || bVar.f1764h0 || bVar.f1766i0 || bVar.f1770k0 || isInEditMode) && !bVar.f1768j0) {
                int V = eVar.mo9505V();
                int W = eVar.mo9507W();
                int U = eVar.mo9503U() + V;
                int v = eVar.mo9560v() + W;
                childAt.layout(V, W, U, v);
                if ((childAt instanceof C0476h) && (content = ((C0476h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v);
                }
            }
        }
        int size = this.f1700e.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f1700e.get(i6).mo2479o(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1720y == i) {
            int i3 = this.f1721z;
        }
        if (!this.f1706k) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.f1706k = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.f1706k;
        this.f1720y = i;
        this.f1721z = i2;
        this.f1701f.mo9586U1(mo2437q());
        if (this.f1706k) {
            this.f1706k = false;
            if (m1949z()) {
                this.f1701f.mo9588W1();
            }
        }
        mo2448u(this.f1701f, this.f1707l, i, i2);
        mo2447t(i, i2, this.f1701f.mo9503U(), this.f1701f.mo9560v(), this.f1701f.mo9580M1(), this.f1701f.mo9578K1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C2476e l = mo2436l(view);
        if ((view instanceof Guideline) && !(l instanceof C2480g)) {
            C0455b bVar = (C0455b) view.getLayoutParams();
            C2480g gVar = new C2480g();
            bVar.f1792v0 = gVar;
            bVar.f1764h0 = true;
            gVar.mo9603x1(bVar.f1748Z);
        }
        if (view instanceof C0462c) {
            C0462c cVar = (C0462c) view;
            cVar.mo2486s();
            ((C0455b) view.getLayoutParams()).f1766i0 = true;
            if (!this.f1700e.contains(cVar)) {
                this.f1700e.add(cVar);
            }
        }
        this.f1699d.put(view.getId(), view);
        this.f1706k = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1699d.remove(view.getId());
        this.f1701f.mo9614q1(mo2436l(view));
        this.f1700e.remove(view);
        this.f1706k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo2437q() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void requestLayout() {
        m1946r();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo2390s(int i) {
        this.f1709n = new C0463d(getContext(), this, i);
    }

    public void setConstraintSet(C0466e eVar) {
        this.f1708m = eVar;
    }

    public void setId(int i) {
        this.f1699d.remove(getId());
        super.setId(i);
        this.f1699d.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1705j) {
            this.f1705j = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1704i) {
            this.f1704i = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1703h) {
            this.f1703h = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1702g) {
            this.f1702g = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0475g gVar) {
        C0463d dVar = this.f1709n;
        if (dVar != null) {
            dVar.mo2491c(gVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1707l = i;
        this.f1701f.mo9584S1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo2447t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0457c cVar = this.f1719x;
        int i5 = cVar.f1803e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.f1802d, i, 0);
        int min = Math.min(this.f1704i, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1705j, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1712q = min;
        this.f1713r = min2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo2448u(C2479f fVar, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1719x.mo2455c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? mo2437q() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        mo2450x(fVar, mode, i5, mode2, i6);
        fVar.mo9581N1(i, mode, i5, mode2, i6, this.f1712q, this.f1713r, max5, max);
    }

    /* renamed from: w */
    public void mo2449w(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1711p == null) {
                this.f1711p = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1711p.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2450x(p087o.C2479f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1719x
            int r1 = r0.f1803e
            int r0 = r0.f1802d
            o.e$b r2 = p087o.C2476e.C2478b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = r6
            goto L_0x0032
        L_0x001a:
            int r9 = r7.f1704i
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            o.e$b r9 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            o.e$b r9 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.f1702g
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = r6
            goto L_0x0051
        L_0x003a:
            int r11 = r7.f1705j
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            o.e$b r2 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            o.e$b r2 = p087o.C2476e.C2478b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.f1703h
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.mo9503U()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.mo9560v()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.mo9577J1()
        L_0x0060:
            r8.mo9536j1(r6)
            r8.mo9539k1(r6)
            int r11 = r7.f1704i
            int r11 = r11 - r0
            r8.mo9504U0(r11)
            int r11 = r7.f1705j
            int r11 = r11 - r1
            r8.mo9502T0(r11)
            r8.mo9510X0(r6)
            r8.mo9508W0(r6)
            r8.mo9490M0(r9)
            r8.mo9531h1(r10)
            r8.mo9521d1(r2)
            r8.mo9482I0(r12)
            int r9 = r7.f1702g
            int r9 = r9 - r0
            r8.mo9510X0(r9)
            int r9 = r7.f1703h
            int r9 = r9 - r1
            r8.mo9508W0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2450x(o.f, int, int, int, int):void");
    }
}
