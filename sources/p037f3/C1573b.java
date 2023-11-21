package p037f3;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Calendar;
import miuix.animation.utils.CommonUtils;
import p019c3.C1358a;
import p043g3.C1609b;

/* renamed from: f3.b */
public class C1573b implements C1572a {

    /* renamed from: a */
    private ThreadLocal<C1577d> f6272a = new C1574a();

    /* renamed from: f3.b$a */
    class C1574a extends ThreadLocal<C1577d> {
        C1574a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1577d initialValue() {
            return new C1577d();
        }
    }

    /* renamed from: f3.b$b */
    private static class C1575b {

        /* renamed from: a */
        private StringBuilder f6274a;

        /* renamed from: b */
        private Calendar f6275b;

        /* renamed from: c */
        private long f6276c;

        /* renamed from: d */
        private long f6277d;

        /* renamed from: e */
        private long f6278e;

        private C1575b() {
            this.f6274a = new StringBuilder();
            this.f6275b = Calendar.getInstance();
        }

        /* synthetic */ C1575b(C1574a aVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            if (r5 < 10) goto L_0x001a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r5 < 100) goto L_0x001a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            r4.append('0');
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.StringBuilder m6789a(java.lang.StringBuilder r4, int r5, int r6) {
            /*
                r3 = this;
                r0 = 2
                r1 = 48
                r2 = 10
                if (r6 == r0) goto L_0x001e
                r0 = 3
                if (r6 == r0) goto L_0x000e
            L_0x000a:
                r4.append(r5)
                goto L_0x0021
            L_0x000e:
                if (r5 >= r2) goto L_0x0016
                java.lang.String r6 = "00"
                r4.append(r6)
                goto L_0x000a
            L_0x0016:
                r6 = 100
                if (r5 >= r6) goto L_0x000a
            L_0x001a:
                r4.append(r1)
                goto L_0x000a
            L_0x001e:
                if (r5 >= r2) goto L_0x000a
                goto L_0x001a
            L_0x0021:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p037f3.C1573b.C1575b.m6789a(java.lang.StringBuilder, int, int):java.lang.StringBuilder");
        }

        /* renamed from: b */
        private void m6790b(long j) {
            this.f6274a.setLength(0);
            this.f6275b.setTimeInMillis(j);
            StringBuilder sb = this.f6274a;
            sb.append(this.f6275b.get(1));
            sb.append('-');
            m6789a(this.f6274a, this.f6275b.get(2) + 1, 2).append('-');
            m6789a(this.f6274a, this.f6275b.get(5), 2).append(' ');
            m6789a(this.f6274a, this.f6275b.get(11), 2).append(':');
            m6789a(this.f6274a, this.f6275b.get(12), 2).append(':');
            m6789a(this.f6274a, this.f6275b.get(13), 2).append(',');
            m6789a(this.f6274a, this.f6275b.get(14), 3);
        }

        /* renamed from: c */
        public void mo5728c(StringBuilder sb, long j) {
            long j2;
            if (j != this.f6276c) {
                long j3 = this.f6277d;
                if (j3 == 0 || j < j3 || j >= j3 + 60000) {
                    m6790b(j);
                    this.f6277d = (j / 60000) * 60000;
                    j2 = (j / 1000) * 1000;
                } else {
                    long j4 = this.f6278e;
                    if (j < j4 || j >= 1000 + j4) {
                        int i = (int) (j - j3);
                        int i2 = i / CommonUtils.UNIT_SECOND;
                        int i3 = i2 * CommonUtils.UNIT_SECOND;
                        StringBuilder sb2 = this.f6274a;
                        sb2.setLength(sb2.length() - 6);
                        m6789a(this.f6274a, i2, 2).append(',');
                        m6789a(this.f6274a, i - i3, 3);
                        j2 = this.f6277d + ((long) i3);
                    } else {
                        StringBuilder sb3 = this.f6274a;
                        sb3.setLength(sb3.length() - 3);
                        m6789a(this.f6274a, (int) (j - j4), 3);
                        this.f6276c = j;
                    }
                }
                this.f6278e = j2;
                this.f6276c = j;
            }
            sb.append(this.f6274a);
        }
    }

    /* renamed from: f3.b$c */
    private static class C1576c extends Writer {

        /* renamed from: d */
        private StringBuilder f6279d;

        public C1576c(StringBuilder sb) {
            this.f6279d = sb;
        }

        /* renamed from: a */
        private static void m6792a(int i, int i2, int i3) {
            if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
                throw new ArrayIndexOutOfBoundsException("length=" + i + "; regionStart=" + i2 + "; regionLength=" + i3);
            }
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) {
            m6792a(cArr.length, i, i2);
            if (i2 != 0) {
                this.f6279d.append(cArr, i, i2);
            }
        }
    }

    /* renamed from: f3.b$d */
    private static class C1577d {

        /* renamed from: a */
        C1575b f6280a = new C1575b((C1574a) null);

        /* renamed from: b */
        StringBuilder f6281b = new StringBuilder();

        /* renamed from: c */
        PrintWriter f6282c = new PrintWriter(new C1576c(this.f6281b));

        C1577d() {
        }
    }

    /* renamed from: c */
    private String m6785c(String str, String str2, long j, C1358a aVar, String str3, C1609b bVar, Throwable th) {
        C1577d dVar = this.f6272a.get();
        StringBuilder sb = dVar.f6281b;
        sb.setLength(0);
        dVar.f6280a.mo5728c(sb, j);
        sb.append(" - ");
        sb.append('[');
        sb.append(aVar.name());
        sb.append("::");
        sb.append(str);
        sb.append(']');
        sb.append(" - ");
        sb.append(str2);
        sb.append(": ");
        if (str3 == null) {
            bVar.mo5763a(sb);
        } else {
            sb.append(str3);
        }
        sb.append(10);
        if (th != null) {
            th.printStackTrace(dVar.f6282c);
        }
        if (sb.length() > 8192) {
            sb.setLength(8192);
            sb.trimToSize();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo5724a(String str, String str2, long j, C1358a aVar, String str3, Throwable th) {
        return m6785c(str, str2, j, aVar, str3, (C1609b) null, th);
    }

    /* renamed from: b */
    public String mo5725b(String str, String str2, long j, C1358a aVar, C1609b bVar) {
        return m6785c(str, str2, j, aVar, (String) null, bVar, bVar.mo5764c());
    }
}
