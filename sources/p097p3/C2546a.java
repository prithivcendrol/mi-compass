package p097p3;

import android.content.Context;
import java.io.Serializable;
import java.util.TimeZone;
import miuix.animation.utils.CommonUtils;
import p103q3.C2586a;
import p117t2.C2699g;

/* renamed from: p3.a */
public class C2546a implements Serializable, Cloneable, Comparable<C2546a> {

    /* renamed from: m */
    private static final byte[] f10031m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: n */
    private static final int[] f10032n = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    /* renamed from: o */
    private static final String[] f10033o = {"ERA", "YEAR", "CHINESE_YEAR", "CHINESE_YEAR_SYMBOL_ANIMAL", "CHINESE_ERA_YEAR", "MONTH", "CHINESE_MONTH", "CHINESE_ERA_MONTH", "CHINESE_MONTH_IS_LEAP", "DAY_OF_MONTH", "DAY_OF_CHINESE_MONTH", "CHINESE_ERA_DAY", "DAY_OF_YEAR", "DAY_OF_CHINESE_YEAR", "DAY_OF_WEEK", "SOLAR_TERM", "DETAIL_AM_PM", "AM_PM", "HOUR", "CHINESE_ERA_HOUR", "MINUTE", "SECOND", "MILLISECOND", "ZONE_OFFSET", "DST_OFFSET"};

    /* renamed from: p */
    private static final int[] f10034p = {3, -1, -1, 12, 14, 26, 0, 18, 19, -1, 18, 5, 5, 7, -1, -1, -1, -1, 22, -1, -1, -1, 26, -1, 4, 25, -1, -1, -1, -1, -1, -1, 16, -1, 14, 9, 7, -1, -1, 18, -1, -1, 18, -1, 20, -1, -1, -1, -1, -1, 21, 15, -1, -1, 26, -1, 1, 25};

    /* renamed from: q */
    private static final int[] f10035q = {0, 384, 738, 1093, 1476, 1830, 2185, 2569, 2923, 3278, 3662, 4016, 4400, 4754, 5108, 5492, 5846, 6201, 6585, 6940, 7324, 7678, 8032, 8416, 8770, 9124, 9509, 9863, 10218, 10602, 10956, 11339, 11693, 12048, 12432, 12787, 13141, 13525, 13879, 14263, 14617, 14971, 15355, 15710, 16064, 16449, 16803, 17157, 17541, 17895, 18279, 18633, 18988, 19372, 19726, 20081, 20465, 20819, 21202, 21557, 21911, 22295, 22650, 23004, 23388, 23743, 24096, 24480, 24835, 25219, 25573, 25928, 26312, 26666, 27020, 27404, 27758, 28142, 28496, 28851, 29235, 29590, 29944, 30328, 30682, 31066, 31420, 31774, 32158, 32513, 32868, 33252, 33606, 33960, 34343, 34698, 35082, 35436, 35791, 36175, 36529, 36883, 37267, 37621, 37976, 38360, 38714, 39099, 39453, 39807, 40191, 40545, 40899, 41283, 41638, 42022, 42376, 42731, 43115, 43469, 43823, 44207, 44561, 44916, 45300, 45654, 46038, 46392, 46746, 47130, 47485, 47839, 48223, 48578, 48962, 49316, 49670, 50054, 50408, 50762, 51146, 51501, 51856, 52240, 52594, 52978, 53332, 53686, 54070, 54424, 54779, 55163, 55518, 55902, 56256, 56610, 56993, 57348, 57702, 58086, 58441, 58795, 59179, 59533, 59917, 60271, 60626, 61010, 61364, 61719, 62103, 62457, 62841, 63195, 63549, 63933, 64288, 64642, 65026, 65381, 65735, 66119, 66473, 66857, 67211, 67566, 67950, 68304, 68659, 69042, 69396, 69780, 70134, 70489, 70873, 71228, 71582, 71966, 72320, 72674, 73058, 73412};

    /* renamed from: r */
    private static final int[] f10036r = {19416, 19168, 42352, 21717, 53856, 55632, 21844, 22191, 39632, 21970, 19168, 42422, 42192, 53840, 53909, 46415, 54944, 44450, 38320, 18807, 18815, 42160, 46261, 27216, 27968, 43860, 11119, 38256, 21234, 18800, 25958, 54432, 59984, 27285, 23263, 11104, 34531, 37615, 51415, 51551, 54432, 55462, 46431, 22176, 42420, 9695, 37584, 53938, 43344, 46423, 27808, 46416, 21333, 19887, 42416, 17779, 21183, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 38310, 38335, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 23232, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 20854, 21183, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 53430, 53855, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 45653, 27951, 44448, 19299, 37759, 18936, 18800, 25776, 26790, 59999, 27424, 42692, 43759, 37600, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 19285, 19311, 42352, 21732, 53856, 59752, 54560, 55968, 27302, 22239, 19168, 43476, 42192, 53584, 62034, 54560};

    /* renamed from: s */
    private static final int[] f10037s = {4, 19, 3, 18, 4, 19, 4, 19, 4, 20, 4, 20, 6, 22, 6, 22, 6, 22, 7, 22, 6, 21, 6, 21};

    /* renamed from: t */
    private static final byte[] f10038t = "0123415341536789:;<9:=<>:=1>?012@015@015@015AB78CDE8CD=1FD01GH01GH01IH01IJ0KLMN;LMBEOPDQRST0RUH0RVH0RWH0RWM0XYMNZ[MB\\]PT^_ST`_WH`_WH`_WM`_WM`aYMbc[Mde]Sfe]gfh_gih_Wih_WjhaWjka[jkl[jmn]ope]qph_qrh_sth_W".getBytes();

    /* renamed from: u */
    private static final byte[] f10039u = "211122112122112121222211221122122222212222222221222122222232222222222222222233223232223232222222322222112122112121222211222122222222222222222222322222112122112121222111211122122222212221222221221122122222222222222222222223222232222232222222222222112122112121122111211122122122212221222221221122122222222222222221211122112122212221222211222122222232222232222222222222112122112121111111222222112121112121111111222222111121112121111111211122112122112121122111222212111121111121111111111122112122112121122111211122112122212221222221222211111121111121111111222111111121111111111111111122112121112121111111222111111111111111111111111122111121112121111111221122122222212221222221222111011111111111111111111122111121111121111111211122112122112121122211221111011111101111111111111112111121111121111111211122112122112221222211221111011111101111111110111111111121111111111111111122112121112121122111111011111121111111111111111011111111112111111111111011111111111111111111221111011111101110111110111011011111111111111111221111011011101110111110111011011111101111111111211111001011101110111110110011011111101111111111211111001011001010111110110011011111101111111110211111001011001010111100110011011011101110111110211111001011001010011100110011001011101110111110211111001010001010011000100011001011001010111110111111001010001010011000111111111111111111111111100011001011001010111100111111001010001010000000111111000010000010000000100011001011001010011100110011001011001110111110100011001010001010011000110011001011001010111110111100000010000000000000000011001010001010011000111100000000000000000000000011001010001010000000111000000000000000000000000011001010000010000000".getBytes();

    /* renamed from: d */
    private long f10040d;

    /* renamed from: e */
    private TimeZone f10041e;

    /* renamed from: f */
    private int[] f10042f;

    /* renamed from: g */
    private transient long f10043g;

    /* renamed from: h */
    private transient int f10044h;

    /* renamed from: i */
    private transient int f10045i;

    /* renamed from: j */
    private transient int f10046j;

    /* renamed from: k */
    private transient int f10047k;

    /* renamed from: l */
    private transient int f10048l;

    public C2546a() {
        this((TimeZone) null);
    }

    public C2546a(TimeZone timeZone) {
        this.f10042f = new int[25];
        this.f10043g = -12219292800000L;
        this.f10044h = 1582;
        int i = ((1582 / 100) - (1582 / 400)) - 2;
        this.f10045i = i;
        this.f10046j = (((1582 - 2000) / 400) + i) - ((1582 - 2000) / 100);
        this.f10047k = 10;
        this.f10048l = 0;
        this.f10040d = System.currentTimeMillis();
        mo9754T(timeZone);
    }

    /* renamed from: D */
    private int m10813D(int i) {
        int[] iArr = this.f10042f;
        int i2 = iArr[1];
        int offset = i2 <= 0 ? 0 : this.f10041e.getOffset(1, i2, iArr[5], iArr[9], iArr[14], i);
        int[] iArr2 = this.f10042f;
        if (iArr2[1] > 0) {
            return offset - iArr2[23];
        }
        return 0;
    }

    /* renamed from: H */
    private static int m10814H(int i) {
        int i2 = f10036r[i - 1900] & 15;
        if (i2 == 15) {
            return -1;
        }
        return i2 - 1;
    }

    /* renamed from: I */
    static int m10815I(int i) {
        if (m10814H(i) >= 0) {
            return (f10036r[(i + -1900) + 1] & 15) == 15 ? 30 : 29;
        }
        return 0;
    }

    /* renamed from: J */
    private static int m10816J(long j, int i) {
        int i2 = (int) (j % ((long) i));
        return (j >= 0 || i2 >= 0) ? i2 : i2 + i;
    }

    /* renamed from: K */
    private void m10817K() {
        int[] iArr;
        int i;
        int I;
        long j = ((long) f10035q[this.f10042f[2] - 1900]) - 25537;
        int i2 = 0;
        while (true) {
            iArr = this.f10042f;
            i = iArr[6];
            if (i2 >= i) {
                break;
            }
            j += (long) m10833q(iArr[2], i2);
            i2++;
        }
        if (iArr[8] == 1) {
            I = m10833q(iArr[2], i);
        } else {
            int H = m10814H(iArr[2]);
            if (H >= 0) {
                int[] iArr2 = this.f10042f;
                if (H < iArr2[6]) {
                    I = m10815I(iArr2[2]);
                }
            }
            m10828l(j + ((long) (this.f10042f[10] - 1)), 0);
            m10818L();
        }
        j += (long) I;
        m10828l(j + ((long) (this.f10042f[10] - 1)), 0);
        m10818L();
    }

    /* renamed from: L */
    private void m10818L() {
        int[] iArr = this.f10042f;
        int i = iArr[1];
        int i2 = iArr[5];
        long p = m10832p((long) i) + ((long) ((m10837u(mo9747G(i), i2) + iArr[9]) - 1));
        this.f10042f[14] = m10816J(p - 3, 7) + 1;
        int[] iArr2 = this.f10042f;
        long j = (p * 86400000) + ((long) ((iArr2[18] * 3600000) + (iArr2[20] * 60000) + (iArr2[21] * CommonUtils.UNIT_SECOND) + iArr2[22]));
        this.f10040d = j;
        long offset = (long) this.f10041e.getOffset(j);
        long j2 = this.f10040d;
        if (i <= 0) {
            offset = 0;
        }
        this.f10040d = j2 - offset;
        m10825i();
    }

    /* renamed from: N */
    private void m10819N() {
        long m = m10829m();
        if (m > 47550) {
            mo9751Q(2100, 0, 30, false, 12, 0, 0, 0);
            m = 47550;
        }
        if (m < -25537) {
            mo9751Q(1900, 0, 1, false, 12, 0, 0, 0);
            m = -25537;
        }
        if (!mo9748M()) {
            m10826j(m);
            m10830n();
            m10827k(m);
        }
    }

    /* renamed from: U */
    static int m10820U(int i, int i2) {
        if (i > 2100) {
            return 0;
        }
        int i3 = i2 * 2;
        int i4 = ((f10038t[i - 1900] - 48) * 24) + i3;
        int i5 = i4 + 1;
        byte[] bArr = f10039u;
        int[] iArr = f10037s;
        return (((bArr[i4] - 48) + iArr[i3]) << 8) + (bArr[i5] - 48) + iArr[i3 + 1];
    }

    /* renamed from: c */
    private void m10821c(StringBuilder sb, boolean z, boolean z2) {
        char c;
        int z3 = mo9768z(23) + mo9768z(24);
        if (z3 < 0) {
            c = '-';
            z3 = -z3;
        } else {
            c = '+';
        }
        if (z) {
            sb.append("GMT");
        }
        sb.append(c);
        m10822d(sb, 2, z3 / 3600000);
        if (z2) {
            sb.append(':');
        }
        m10822d(sb, 2, (z3 % 3600000) / 60000);
    }

    /* renamed from: d */
    private static void m10822d(StringBuilder sb, int i, int i2) {
        sb.append(C2586a.m11000c(i, i2));
    }

    /* renamed from: e */
    private void m10823e(StringBuilder sb, C2547b bVar, int i) {
        TimeZone timeZone = this.f10041e;
        int i2 = 1;
        boolean z = this.f10042f[24] != 0;
        if (i != 4) {
            i2 = 0;
        }
        String displayName = timeZone.getDisplayName(z, i2, bVar.mo9779l());
        if (displayName != null) {
            sb.append(displayName);
        } else {
            m10821c(sb, false, false);
        }
    }

    /* renamed from: f */
    private void m10824f(StringBuilder sb, C2547b bVar, char c, int i, int i2) {
        String str;
        int i3;
        if (c != 'A') {
            if (c != 'S') {
                if (c != 'a') {
                    int i4 = 12;
                    if (c != 'h') {
                        if (c == 'k') {
                            i3 = this.f10042f[18];
                        } else if (!(c == 'm' || c == 'D')) {
                            if (c != 'E') {
                                if (c != 'Y') {
                                    if (c != 'Z') {
                                        if (c != 's') {
                                            if (c == 't') {
                                                str = bVar.mo9785s()[this.f10042f[15]];
                                            } else if (c == 'y') {
                                                int[] iArr = this.f10042f;
                                                i3 = i == 2 ? iArr[1] % 100 : iArr[1];
                                            } else if (c != 'z') {
                                                switch (c) {
                                                    case 'G':
                                                        str = bVar.mo9777j()[this.f10042f[0]];
                                                        break;
                                                    case 'H':
                                                        break;
                                                    case 'I':
                                                        if (i == 2) {
                                                            sb.append(bVar.mo9778k()[this.f10042f[19] % 10]);
                                                        }
                                                        str = bVar.mo9776i()[this.f10042f[19] % 12];
                                                        break;
                                                    default:
                                                        switch (c) {
                                                            case 'K':
                                                                i3 = this.f10042f[18] % 12;
                                                                break;
                                                            case 'L':
                                                            case 'M':
                                                                if (i >= 3) {
                                                                    if (i != 4) {
                                                                        if (i != 5) {
                                                                            str = bVar.mo9781o()[this.f10042f[5]];
                                                                            break;
                                                                        } else {
                                                                            str = bVar.mo9783q()[this.f10042f[5]];
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        str = bVar.mo9780m()[this.f10042f[5]];
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i3 = this.f10042f[5] + 1;
                                                                    break;
                                                                }
                                                            case 'N':
                                                                if (i == 2) {
                                                                    sb.append(bVar.mo9778k()[this.f10042f[7] % 10]);
                                                                    str = bVar.mo9776i()[this.f10042f[7] % 12];
                                                                    break;
                                                                } else {
                                                                    sb.append(bVar.mo9772e()[this.f10042f[8]]);
                                                                    str = bVar.mo9773f()[this.f10042f[6]];
                                                                    break;
                                                                }
                                                            default:
                                                                switch (c) {
                                                                    case 'c':
                                                                        break;
                                                                    case 'd':
                                                                        break;
                                                                    case 'e':
                                                                        if (i == 2) {
                                                                            sb.append(bVar.mo9778k()[this.f10042f[11] % 10]);
                                                                            str = bVar.mo9776i()[this.f10042f[11] % 12];
                                                                            break;
                                                                        } else {
                                                                            str = bVar.mo9770c()[this.f10042f[10] - 1];
                                                                            break;
                                                                        }
                                                                    default:
                                                                        return;
                                                                }
                                                        }
                                                }
                                            } else {
                                                m10823e(sb, bVar, i);
                                                return;
                                            }
                                        }
                                    } else if (i == 4) {
                                        m10821c(sb, true, true);
                                        return;
                                    } else if (i == 5) {
                                        m10821c(sb, false, true);
                                        return;
                                    } else {
                                        m10821c(sb, false, false);
                                        return;
                                    }
                                } else if (i != 2) {
                                    String[] d = bVar.mo9771d();
                                    int i5 = this.f10042f[2];
                                    int length = sb.length();
                                    while (i5 > 0) {
                                        int i6 = i5 % 10;
                                        i5 /= 10;
                                        sb.insert(length, d[i6]);
                                    }
                                    return;
                                } else {
                                    sb.append(bVar.mo9778k()[this.f10042f[4] % 10]);
                                    str = bVar.mo9776i()[this.f10042f[4] % 12];
                                }
                            }
                            str = i == 4 ? bVar.mo9786t()[this.f10042f[14] - 1] : i == 5 ? bVar.mo9784r()[this.f10042f[14] - 1] : bVar.mo9782p()[this.f10042f[14] - 1];
                        }
                        m10822d(sb, i, i3);
                        return;
                    }
                    int i7 = this.f10042f[18] % 12;
                    if (i7 != 0) {
                        i4 = i7;
                    }
                    m10822d(sb, i, i4);
                    return;
                }
                str = i != 2 ? bVar.mo9769b()[this.f10042f[17]] : bVar.mo9775h()[this.f10042f[16]];
            }
            i3 = this.f10042f[i2];
            m10822d(sb, i, i3);
            return;
        }
        str = bVar.mo9774g()[this.f10042f[3]];
        sb.append(str);
    }

    /* renamed from: i */
    private void m10825i() {
        long m = m10829m();
        if (!mo9748M()) {
            m10826j(m);
            m10830n();
            m10827k(m);
        }
    }

    /* renamed from: j */
    private void m10826j(long j) {
        int i = (int) (j - -25537);
        int i2 = this.f10042f[1];
        int i3 = 2100;
        if (i2 < 2100) {
            i3 = i2 + 1;
        }
        int i4 = i - f10035q[i3 - 1900];
        if (i4 < 0) {
            i3--;
            i4 += m10834r(i3);
        }
        if (i4 < 0) {
            i3--;
            i4 += m10834r(i3);
        }
        int[] iArr = this.f10042f;
        iArr[2] = i3;
        iArr[13] = i4 + 1;
        int H = m10814H(i3);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < 12 && i4 > 0) {
            if (H >= 0 && i6 == H + 1 && i7 == 0) {
                i6--;
                i8 = m10815I(i3);
                i7 = 1;
            } else {
                i8 = m10833q(i3, i6);
            }
            if (i7 != 0 && i6 == H + 1) {
                i7 = 0;
            }
            i4 -= i8;
            i6++;
        }
        if (i4 != 0 || H <= 0 || i6 != H + 1) {
            i5 = i7;
        } else if (i7 == 0) {
            i6--;
            i5 = 1;
        }
        if (i4 < 0) {
            i4 += i8;
            i6--;
        }
        int[] iArr2 = this.f10042f;
        iArr2[8] = i5;
        iArr2[6] = i6;
        iArr2[10] = i4 + 1;
    }

    /* renamed from: k */
    private void m10827k(long j) {
        int[] iArr = this.f10042f;
        int i = iArr[2] - 1900;
        iArr[3] = m10816J((long) (i + 12), 12);
        this.f10042f[4] = m10816J((long) (i + 36), 60);
        int[] iArr2 = this.f10042f;
        int U = m10820U(iArr2[1], iArr2[5]) >> 8;
        int[] iArr3 = this.f10042f;
        int i2 = ((iArr3[1] - 1900) * 12) + iArr3[5];
        if (iArr3[9] >= U) {
            i2++;
        }
        iArr3[7] = m10816J((long) (i2 + 12), 60);
        int i3 = (int) (j - -25537);
        this.f10042f[11] = m10816J((long) (i3 + 40), 60);
        int[] iArr4 = this.f10042f;
        iArr4[19] = m10816J((long) ((i3 * 12) + (((iArr4[18] + 1) % 24) / 2)), 60);
    }

    /* renamed from: l */
    private void m10828l(long j, long j2) {
        int o = m10831o(j, j2);
        int[] iArr = this.f10042f;
        iArr[12] = o;
        int i = iArr[1];
        if (i == this.f10044h && this.f10043g <= j2) {
            o += this.f10047k;
        }
        int i2 = o / 32;
        boolean G = mo9747G(i);
        int u = o - m10837u(G, i2);
        if (u > m10835s(G, i2)) {
            u -= m10835s(G, i2);
            i2++;
        }
        int[] iArr2 = this.f10042f;
        iArr2[5] = i2;
        iArr2[9] = u;
        iArr2[14] = m10816J(j - 3, 7) + 1;
    }

    /* renamed from: m */
    private long m10829m() {
        int i;
        long j;
        this.f10042f[23] = this.f10041e.getRawOffset();
        long j2 = this.f10040d;
        long j3 = j2 / 86400000;
        int i2 = (int) (j2 % 86400000);
        if (i2 < 0) {
            i2 += 86400000;
            j3--;
        }
        int i3 = i2 + this.f10042f[23];
        while (i3 < 0) {
            i3 += 86400000;
            j3--;
        }
        while (i >= 86400000) {
            i3 = i - 86400000;
            j3++;
        }
        int i4 = this.f10042f[23];
        long j4 = this.f10040d;
        long j5 = ((long) i4) + j4;
        if (j4 > 0 && j5 < 0 && i4 > 0) {
            j5 = Long.MAX_VALUE;
        } else if (j4 < 0 && j5 > 0 && i4 < 0) {
            j5 = Long.MIN_VALUE;
        }
        m10828l(j3, j5);
        int D = m10813D(i);
        int[] iArr = this.f10042f;
        iArr[24] = D;
        if (D != 0) {
            i += D;
            if (i < 0) {
                i += 86400000;
                j = j3 - 1;
            } else if (i >= 86400000) {
                i -= 86400000;
                j = 1 + j3;
            } else {
                j = j3;
            }
            if (j3 != j) {
                int i5 = D - iArr[23];
                long j6 = this.f10040d;
                long j7 = ((long) i5) + j6;
                if (j6 > 0 && j7 < 0 && i5 > 0) {
                    j7 = Long.MAX_VALUE;
                } else if (j6 < 0 && j7 > 0 && i5 < 0) {
                    j7 = Long.MIN_VALUE;
                }
                m10828l(j, j7);
            }
            j3 = j;
        }
        int[] iArr2 = this.f10042f;
        int i6 = iArr2[1];
        if (i6 <= 0) {
            iArr2[0] = 0;
            iArr2[1] = 1 - i6;
        } else {
            iArr2[0] = 1;
        }
        iArr2[22] = i % CommonUtils.UNIT_SECOND;
        int i7 = i / CommonUtils.UNIT_SECOND;
        iArr2[21] = i7 % 60;
        int i8 = i7 / 60;
        iArr2[20] = i8 % 60;
        int i9 = (i8 / 60) % 24;
        iArr2[18] = i9;
        iArr2[17] = i9 > 11 ? 1 : 0;
        switch (i9) {
            case 0:
                iArr2[16] = 0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                iArr2[16] = 1;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                iArr2[16] = 2;
                break;
            case 12:
                iArr2[16] = 3;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                iArr2[16] = 4;
                break;
            case 18:
                iArr2[16] = 5;
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                iArr2[16] = 6;
                break;
        }
        return j3;
    }

    /* renamed from: n */
    private void m10830n() {
        int[] iArr = this.f10042f;
        int U = m10820U(iArr[1], iArr[5]);
        int[] iArr2 = this.f10042f;
        int i = iArr2[9];
        if (i == (U >> 8)) {
            iArr2[15] = (iArr2[5] * 2) + 1;
        } else if (i == (U & 255)) {
            iArr2[15] = (iArr2[5] * 2) + 2;
        } else {
            iArr2[15] = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m10831o(long r5, long r7) {
        /*
            r4 = this;
            long r0 = r4.f10043g
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 1970(0x7b2, float:2.76E-42)
            if (r7 >= 0) goto L_0x000e
            int r7 = r4.f10046j
            long r0 = (long) r7
        L_0x000b:
            long r0 = r5 - r0
            goto L_0x000f
        L_0x000e:
            r0 = r5
        L_0x000f:
            r2 = 365(0x16d, double:1.803E-321)
            long r2 = r0 / r2
            int r7 = (int) r2
            if (r7 == 0) goto L_0x001d
            int r8 = r8 + r7
            long r0 = (long) r8
            long r0 = r4.m10832p(r0)
            goto L_0x000b
        L_0x001d:
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x002b
            int r8 = r8 + -1
            int r5 = r4.m10836t(r8)
            long r5 = (long) r5
            long r0 = r0 + r5
        L_0x002b:
            int[] r5 = r4.f10042f
            r6 = 1
            r5[r6] = r8
            int r5 = (int) r0
            int r5 = r5 + r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p097p3.C2546a.m10831o(long, long):int");
    }

    /* renamed from: p */
    private long m10832p(long j) {
        long j2;
        long j3;
        if (j >= 1970) {
            long j4 = ((j - 1970) * 365) + ((j - 1969) / 4);
            int i = this.f10044h;
            if (j > ((long) i)) {
                return j4 - (((j - 1901) / 100) - ((j - 1601) / 400));
            }
            return j4 + ((long) (j == ((long) i) ? this.f10047k : j == ((long) (i + -1)) ? this.f10048l : this.f10046j));
        }
        long j5 = (j - 1970) * 365;
        if (j <= ((long) this.f10044h)) {
            j2 = j5 + ((j - 1972) / 4);
            j3 = (long) this.f10046j;
        } else {
            long j6 = j - 2000;
            j2 = (j5 + ((j - 1972) / 4)) - (j6 / 100);
            j3 = j6 / 400;
        }
        return j2 + j3;
    }

    /* renamed from: q */
    static int m10833q(int i, int i2) {
        return (f10036r[i + -1900] & (65536 >> (i2 + 1))) != 0 ? 30 : 29;
    }

    /* renamed from: r */
    static int m10834r(int i) {
        int[] iArr = f10035q;
        int i2 = i - 1900;
        return iArr[i2 + 1] - iArr[i2];
    }

    /* renamed from: s */
    private static int m10835s(boolean z, int i) {
        return (!z || i != 1) ? f10031m[i] : f10031m[i] + 1;
    }

    /* renamed from: t */
    private int m10836t(int i) {
        int i2 = mo9747G(i) ? 366 : 365;
        int i3 = this.f10044h;
        if (i == i3) {
            i2 -= this.f10047k;
        }
        return i == i3 + -1 ? i2 - this.f10048l : i2;
    }

    /* renamed from: u */
    private static int m10837u(boolean z, int i) {
        return (!z || i <= 1) ? f10032n[i] : f10032n[i] + 1;
    }

    /* renamed from: A */
    public int mo9742A(int i) {
        if (i < 0 || i >= 25) {
            throw new IllegalArgumentException("Field out of range [0-25]: " + i);
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return this.f10042f[0] == 1 ? 292278994 : 292269055;
            case 2:
                return 2100;
            case 3:
                return 11;
            case 4:
            case 7:
            case 11:
            case 19:
                return 59;
            case 5:
            case 6:
                return 11;
            case 8:
                return 1;
            case 9:
                return m10835s(mo9747G(this.f10042f[1]), this.f10042f[5]);
            case 10:
                if (mo9748M()) {
                    return 0;
                }
                if (mo9746F()) {
                    return m10815I(this.f10042f[2]);
                }
                int[] iArr = this.f10042f;
                return m10833q(iArr[2], iArr[6]);
            case 12:
                return m10836t(this.f10042f[1]);
            case 13:
                if (mo9748M()) {
                    return 0;
                }
                return m10834r(this.f10042f[2]);
            case 14:
                return 7;
            case 15:
                return 24;
            case 16:
                return 6;
            case 17:
                return 1;
            case 18:
                return 23;
            case 20:
            case 21:
                return 59;
            case 22:
                return 999;
            default:
                throw new IllegalArgumentException("unsupported field: " + f10033o[i]);
        }
    }

    /* renamed from: B */
    public int mo9743B(int i) {
        if (i < 0 || i >= 25) {
            throw new IllegalArgumentException("Field out of range [0-25]: " + i);
        }
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 1900;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 19:
                return 0;
            case 9:
                return 1;
            case 10:
                return mo9748M() ^ true ? 1 : 0;
            case 12:
                return 1;
            case 13:
                return mo9748M() ^ true ? 1 : 0;
            case 14:
                return 1;
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
                return 0;
            default:
                throw new IllegalArgumentException("unsupported field: " + f10033o[i]);
        }
    }

    /* renamed from: C */
    public int mo9744C() {
        return m10814H(this.f10042f[2]);
    }

    /* renamed from: E */
    public long mo9745E() {
        return this.f10040d;
    }

    /* renamed from: F */
    public boolean mo9746F() {
        return this.f10042f[8] == 1;
    }

    /* renamed from: G */
    public boolean mo9747G(int i) {
        return i > this.f10044h ? i % 4 == 0 && (i % 100 != 0 || i % 400 == 0) : i % 4 == 0;
    }

    /* renamed from: M */
    public boolean mo9748M() {
        long j = this.f10040d;
        int[] iArr = this.f10042f;
        int i = iArr[23];
        int i2 = iArr[24];
        return j < (-2206396800000L - ((long) i)) - ((long) i2) || j >= (4136400000000L - ((long) i)) - ((long) i2);
    }

    /* renamed from: O */
    public C2546a mo9749O(int i, int i2) {
        if (i == 6) {
            if (i2 < 0) {
                i2 = -i2;
                if (i2 == m10814H(this.f10042f[2])) {
                    this.f10042f[8] = 1;
                } else {
                    throw new IllegalArgumentException("year " + this.f10042f[2] + " has no such leap month:" + i2);
                }
            } else if (i2 >= mo9743B(i) || i2 <= mo9742A(i)) {
                this.f10042f[8] = 0;
            } else {
                throw new IllegalArgumentException("value is out of date range [" + mo9743B(i) + "-" + mo9742A(i) + "]: " + i2);
            }
            int[] iArr = this.f10042f;
            iArr[6] = i2;
            int I = iArr[8] == 1 ? m10815I(iArr[2]) : m10833q(iArr[2], i2);
            int[] iArr2 = this.f10042f;
            if (iArr2[10] > I) {
                iArr2[10] = I;
            }
            m10817K();
            return this;
        } else if (i2 >= mo9743B(i) || i2 <= mo9742A(i)) {
            try {
                mo9755a(i, i2 - this.f10042f[i]);
                return this;
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("unsupported set field:" + f10033o[i]);
            }
        } else {
            throw new IllegalArgumentException("value is out of date range [" + mo9743B(i) + "-" + mo9742A(i) + "]: " + i2);
        }
    }

    /* renamed from: P */
    public C2546a mo9750P(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException("Year " + i + " has no month " + i2);
        } else if (i3 <= 0 || i3 > m10835s(mo9747G(i), i2)) {
            throw new IllegalArgumentException("Year " + i + " month " + i2 + " has no day " + i3);
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException("Invalid hour " + i4);
        } else if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException("Invalid minute " + i5);
        } else if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException("Invalid second " + i6);
        } else if (i7 < 0 || i7 > 999) {
            throw new IllegalArgumentException("Invalid millisecond " + i7);
        } else {
            int[] iArr = this.f10042f;
            iArr[1] = i;
            iArr[5] = i2;
            iArr[9] = i3;
            iArr[18] = i4;
            iArr[20] = i5;
            iArr[21] = i6;
            iArr[22] = i7;
            m10818L();
            return this;
        }
    }

    /* renamed from: Q */
    public C2546a mo9751Q(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        if (i < 1900 || i > 2100) {
            throw new IllegalArgumentException("Date out of range [1900 - 2100] expected, but year is " + i);
        } else if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException("Year " + i + " has no month " + i2);
        } else if (z == 0 || m10814H(i) == i2) {
            if (z != 0) {
                if (i3 <= 0 || i3 > m10815I(i)) {
                    throw new IllegalArgumentException("Year " + i + " month " + i2 + " has no day " + i3);
                }
            } else if (i3 <= 0 || i3 > m10833q(i, i2)) {
                throw new IllegalArgumentException("Year " + i + " month " + i2 + " has no day " + i3);
            }
            if (i4 < 0 || i4 > 23) {
                throw new IllegalArgumentException("Invalid hour " + i4);
            } else if (i5 < 0 || i5 > 59) {
                throw new IllegalArgumentException("Invalid minute " + i5);
            } else if (i6 < 0 || i6 > 59) {
                throw new IllegalArgumentException("Invalid second " + i6);
            } else if (i7 < 0 || i7 > 1000) {
                throw new IllegalArgumentException("Invalid millisecond " + i7);
            } else {
                int[] iArr = this.f10042f;
                iArr[2] = i;
                iArr[6] = i2;
                iArr[10] = i3;
                iArr[8] = z;
                iArr[18] = i4;
                iArr[20] = i5;
                iArr[21] = i6;
                iArr[22] = i7;
                m10817K();
                return this;
            }
        } else {
            throw new IllegalArgumentException("Year " + i + " has no leap month " + i2);
        }
    }

    /* renamed from: R */
    public C2546a mo9752R(long j, boolean z) {
        if (!z) {
            mo9753S(j);
            return this;
        }
        this.f10040d = j;
        m10819N();
        return this;
    }

    /* renamed from: S */
    public C2546a mo9753S(long j) {
        this.f10040d = j;
        m10825i();
        return this;
    }

    /* renamed from: T */
    public C2546a mo9754T(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        TimeZone timeZone2 = this.f10041e;
        if (timeZone2 == null || !timeZone2.getID().equals(timeZone.getID())) {
            this.f10041e = timeZone;
            m10825i();
        }
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p097p3.C2546a mo9755a(int r14, int r15) {
        /*
            r13 = this;
            if (r14 < 0) goto L_0x0246
            r0 = 25
            if (r14 >= r0) goto L_0x0246
            r0 = 2
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L_0x0230
            r3 = 9
            r4 = 5
            if (r14 == r2) goto L_0x0208
            r5 = 2100(0x834, float:2.943E-42)
            r6 = 1900(0x76c, float:2.662E-42)
            java.lang.String r7 = "out of range of Chinese Lunar Year"
            r8 = 10
            r9 = 8
            r10 = 6
            if (r14 == r0) goto L_0x01bc
            r11 = 12
            if (r14 == r4) goto L_0x0181
            if (r14 == r10) goto L_0x00e5
            java.lang.String r0 = "out of range"
            if (r14 == r3) goto L_0x00c2
            if (r14 == r8) goto L_0x00c2
            if (r14 == r11) goto L_0x00c2
            r3 = 13
            if (r14 == r3) goto L_0x00c2
            r3 = 18
            if (r14 == r3) goto L_0x00a5
            switch(r14) {
                case 20: goto L_0x0088;
                case 21: goto L_0x006b;
                case 22: goto L_0x0051;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unsupported set field:"
            r0.append(r1)
            java.lang.String[] r1 = f10033o
            r14 = r1[r14]
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        L_0x0051:
            if (r15 == 0) goto L_0x0245
            long r3 = r13.f10040d
            long r5 = (long) r15
            long r5 = r5 + r3
            if (r15 <= 0) goto L_0x005b
            r14 = r2
            goto L_0x005c
        L_0x005b:
            r14 = r1
        L_0x005c:
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            if (r14 != r1) goto L_0x0065
            goto L_0x00d8
        L_0x0065:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r0)
            throw r14
        L_0x006b:
            if (r15 == 0) goto L_0x0245
            long r3 = r13.f10040d
            long r5 = (long) r15
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r5 = r5 + r3
            if (r15 <= 0) goto L_0x0078
            r14 = r2
            goto L_0x0079
        L_0x0078:
            r14 = r1
        L_0x0079:
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x007e
            r1 = r2
        L_0x007e:
            if (r14 != r1) goto L_0x0082
            goto L_0x00d8
        L_0x0082:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r0)
            throw r14
        L_0x0088:
            if (r15 == 0) goto L_0x0245
            long r3 = r13.f10040d
            long r5 = (long) r15
            r7 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 * r7
            long r5 = r5 + r3
            if (r15 <= 0) goto L_0x0096
            r14 = r2
            goto L_0x0097
        L_0x0096:
            r14 = r1
        L_0x0097:
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x009c
            r1 = r2
        L_0x009c:
            if (r14 != r1) goto L_0x009f
            goto L_0x00d8
        L_0x009f:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r0)
            throw r14
        L_0x00a5:
            if (r15 == 0) goto L_0x0245
            long r3 = r13.f10040d
            long r5 = (long) r15
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 * r7
            long r5 = r5 + r3
            if (r15 <= 0) goto L_0x00b3
            r14 = r2
            goto L_0x00b4
        L_0x00b3:
            r14 = r1
        L_0x00b4:
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b9
            r1 = r2
        L_0x00b9:
            if (r14 != r1) goto L_0x00bc
            goto L_0x00d8
        L_0x00bc:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r0)
            throw r14
        L_0x00c2:
            if (r15 == 0) goto L_0x0245
            long r3 = r13.f10040d
            long r5 = (long) r15
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 * r7
            long r5 = r5 + r3
            if (r15 <= 0) goto L_0x00d0
            r14 = r2
            goto L_0x00d1
        L_0x00d0:
            r14 = r1
        L_0x00d1:
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x00d6
            r1 = r2
        L_0x00d6:
            if (r14 != r1) goto L_0x00df
        L_0x00d8:
            r13.f10040d = r5
            r13.m10825i()
            goto L_0x0245
        L_0x00df:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r0)
            throw r14
        L_0x00e5:
            if (r15 == 0) goto L_0x0245
            boolean r14 = r13.mo9748M()
            if (r14 != 0) goto L_0x017b
            int[] r14 = r13.f10042f
            r14 = r14[r0]
            int r14 = m10814H(r14)
        L_0x00f5:
            r3 = 11
            if (r15 <= 0) goto L_0x0125
            int[] r4 = r13.f10042f
            r11 = r4[r10]
            if (r11 != r14) goto L_0x0106
            r12 = r4[r9]
            if (r12 != 0) goto L_0x0106
            r4[r9] = r2
            goto L_0x0122
        L_0x0106:
            int r11 = r11 + 1
            r4[r10] = r11
            r4[r9] = r1
            if (r11 <= r3) goto L_0x0122
            r4[r10] = r1
            r14 = r4[r0]
            int r14 = r14 + r2
            r4[r0] = r14
            if (r14 > r5) goto L_0x011c
            int r14 = m10814H(r14)
            goto L_0x0122
        L_0x011c:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r7)
            throw r14
        L_0x0122:
            int r15 = r15 + -1
            goto L_0x00f5
        L_0x0125:
            if (r15 >= 0) goto L_0x015c
            int[] r4 = r13.f10042f
            r5 = r4[r10]
            if (r5 != r14) goto L_0x0134
            r11 = r4[r9]
            if (r11 != r2) goto L_0x0134
            r4[r9] = r1
            goto L_0x0159
        L_0x0134:
            int r5 = r5 + -1
            r4[r10] = r5
            if (r5 >= 0) goto L_0x0151
            r4[r10] = r3
            int r14 = 11 - r2
            r4[r10] = r14
            r14 = r4[r0]
            if (r14 < r6) goto L_0x014b
            r14 = r4[r2]
            int r14 = m10814H(r14)
            goto L_0x0151
        L_0x014b:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r7)
            throw r14
        L_0x0151:
            int[] r4 = r13.f10042f
            r5 = r4[r10]
            if (r5 != r14) goto L_0x0159
            r4[r9] = r2
        L_0x0159:
            int r15 = r15 + 1
            goto L_0x0125
        L_0x015c:
            int[] r14 = r13.f10042f
            r15 = r14[r9]
            if (r15 != r2) goto L_0x0169
            r14 = r14[r0]
            int r14 = m10815I(r14)
            goto L_0x0171
        L_0x0169:
            r15 = r14[r0]
            r14 = r14[r10]
            int r14 = m10833q(r15, r14)
        L_0x0171:
            int[] r15 = r13.f10042f
            r0 = r15[r8]
            if (r0 <= r14) goto L_0x01fe
            r15[r8] = r14
            goto L_0x01fe
        L_0x017b:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r7)
            throw r14
        L_0x0181:
            if (r15 == 0) goto L_0x0245
            int[] r14 = r13.f10042f
            r0 = r14[r4]
            int r15 = r15 + r0
            int r0 = r15 / 12
            int r15 = r15 % r11
            if (r15 >= 0) goto L_0x0191
            int r15 = r15 + 12
            int r0 = r0 + -1
        L_0x0191:
            r14[r4] = r15
            if (r0 != 0) goto L_0x01b7
            r15 = r14[r1]
            if (r15 != 0) goto L_0x019f
            r15 = r14[r2]
            int r15 = -1 - r15
            r14[r2] = r15
        L_0x019f:
            r14 = r14[r2]
            boolean r14 = r13.mo9747G(r14)
            int[] r15 = r13.f10042f
            r15 = r15[r4]
            int r14 = m10835s(r14, r15)
            int[] r15 = r13.f10042f
            r0 = r15[r3]
            if (r0 <= r14) goto L_0x0242
            r15[r3] = r14
            goto L_0x0242
        L_0x01b7:
            r13.mo9755a(r2, r0)
            goto L_0x0245
        L_0x01bc:
            if (r15 == 0) goto L_0x0245
            int[] r14 = r13.f10042f
            r14 = r14[r0]
            int r15 = r15 + r14
            boolean r14 = r13.mo9748M()
            if (r14 != 0) goto L_0x0202
            if (r15 < r6) goto L_0x0202
            if (r15 > r5) goto L_0x0202
            int[] r14 = r13.f10042f
            r14[r0] = r15
            r3 = r14[r9]
            if (r3 != r2) goto L_0x01e1
            r14 = r14[r10]
            int r15 = m10814H(r15)
            if (r14 != r15) goto L_0x01e1
            int[] r14 = r13.f10042f
            r14[r9] = r1
        L_0x01e1:
            int[] r14 = r13.f10042f
            r15 = r14[r9]
            if (r15 != r2) goto L_0x01ee
            r14 = r14[r0]
            int r14 = m10815I(r14)
            goto L_0x01f6
        L_0x01ee:
            r15 = r14[r0]
            r14 = r14[r10]
            int r14 = m10833q(r15, r14)
        L_0x01f6:
            int[] r15 = r13.f10042f
            r0 = r15[r8]
            if (r0 <= r14) goto L_0x01fe
            r15[r8] = r14
        L_0x01fe:
            r13.m10817K()
            goto L_0x0245
        L_0x0202:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r7)
            throw r14
        L_0x0208:
            if (r15 == 0) goto L_0x0245
            int[] r14 = r13.f10042f
            r0 = r14[r1]
            if (r0 != 0) goto L_0x0216
            r0 = r14[r2]
            int r0 = -1 - r0
            r14[r2] = r0
        L_0x0216:
            r0 = r14[r2]
            int r0 = r0 + r15
            r14[r2] = r0
            boolean r14 = r13.mo9747G(r0)
            int[] r15 = r13.f10042f
            r15 = r15[r4]
            int r14 = m10835s(r14, r15)
            int[] r15 = r13.f10042f
            r0 = r15[r3]
            if (r0 <= r14) goto L_0x0242
            r15[r3] = r14
            goto L_0x0242
        L_0x0230:
            if (r15 == 0) goto L_0x0245
            int[] r14 = r13.f10042f
            r1 = r14[r1]
            int r15 = r15 + r1
            int r15 = r15 % r0
            if (r1 == r15) goto L_0x0245
            if (r1 != 0) goto L_0x0245
            r15 = r14[r2]
            int r15 = -1 - r15
            r14[r2] = r15
        L_0x0242:
            r13.m10818L()
        L_0x0245:
            return r13
        L_0x0246:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field out of range [0-25]: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p097p3.C2546a.mo9755a(int, int):p3.a");
    }

    /* renamed from: b */
    public boolean mo9756b(C2546a aVar) {
        return mo9745E() > aVar.mo9745E();
    }

    public final Object clone() {
        try {
            C2546a aVar = (C2546a) super.clone();
            aVar.f10042f = (int[]) this.f10042f.clone();
            aVar.f10041e = (TimeZone) this.f10041e.clone();
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2546a) && this.f10040d == ((C2546a) obj).f10040d);
    }

    /* renamed from: g */
    public boolean mo9760g(C2546a aVar) {
        return mo9745E() < aVar.mo9745E();
    }

    /* renamed from: h */
    public int compareTo(C2546a aVar) {
        long j = this.f10040d;
        long j2 = aVar.f10040d;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public int hashCode() {
        long j = this.f10040d;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder b = C2699g.m11290c().mo9944b();
        b.append(getClass().getName());
        b.append("[time");
        b.append(this.f10040d);
        b.append(",zone=");
        b.append(this.f10041e.getID());
        for (int i = 0; i < 25; i++) {
            b.append(',');
            b.append(f10033o[i]);
            b.append('=');
            b.append(this.f10042f[i]);
        }
        b.append(']');
        String sb = b.toString();
        C2699g.m11290c().mo9943a(b);
        return sb;
    }

    /* renamed from: v */
    public String mo9764v(Context context, CharSequence charSequence) {
        return mo9765w(context, charSequence, (C2547b) null);
    }

    /* renamed from: w */
    public String mo9765w(Context context, CharSequence charSequence, C2547b bVar) {
        StringBuilder b = C2699g.m11290c().mo9944b();
        String sb = mo9767y(context, b, charSequence, bVar).toString();
        C2699g.m11290c().mo9943a(b);
        return sb;
    }

    /* renamed from: x */
    public StringBuilder mo9766x(Context context, StringBuilder sb, CharSequence charSequence) {
        return mo9767y(context, sb, charSequence, (C2547b) null);
    }

    /* renamed from: y */
    public StringBuilder mo9767y(Context context, StringBuilder sb, CharSequence charSequence, C2547b bVar) {
        int i;
        if (bVar == null) {
            bVar = C2547b.m10861n(context);
        }
        int length = charSequence.length();
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (!z) {
                if (charAt == '\'') {
                    i = i2 + 1;
                    if (i >= length || charSequence.charAt(i) != charAt) {
                        z = true;
                    }
                    sb.append(charAt);
                    i2 = i;
                } else if (charAt >= 'A' && charAt <= 'z') {
                    int i3 = charAt - 'A';
                    if (f10034p[i3] >= 0) {
                        int i4 = i2;
                        int i5 = 1;
                        while (true) {
                            int i6 = i4 + 1;
                            if (i6 >= length || charSequence.charAt(i6) != charAt) {
                                m10824f(sb, bVar, charAt, i5, f10034p[i3]);
                                i2 = i4;
                            } else {
                                i5++;
                                i4 = i6;
                            }
                        }
                        m10824f(sb, bVar, charAt, i5, f10034p[i3]);
                        i2 = i4;
                    }
                }
                i2++;
            } else if (charAt == '\'') {
                i = i2 + 1;
                if (i >= length || charSequence.charAt(i) != charAt) {
                    z = false;
                    i2++;
                }
                sb.append(charAt);
                i2 = i;
                i2++;
            }
            sb.append(charAt);
            i2++;
        }
        return sb;
    }

    /* renamed from: z */
    public int mo9768z(int i) {
        if (i >= 0 && i < 25) {
            return this.f10042f[i];
        }
        throw new IllegalArgumentException("Field out of range [0-25]: " + i);
    }
}
