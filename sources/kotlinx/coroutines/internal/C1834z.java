package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.z */
final /* synthetic */ class C1834z {
    /* renamed from: a */
    public static final int m7588a(String str, int i, int i2, int i3) {
        return (int) C1832x.m7581c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m7589b(String str, long j, long j2, long j3) {
        String d = C1832x.m7582d(str);
        if (d == null) {
            return j;
        }
        Long a = C2688k.m11206a(d);
        if (a != null) {
            long longValue = a.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m7590c(String str, boolean z) {
        String d = C1832x.m7582d(str);
        return d == null ? z : Boolean.parseBoolean(d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m7591d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C1832x.m7580b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m7592e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C1832x.m7581c(str, j, j4, j3);
    }
}
