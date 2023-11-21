package p105r0;

import android.os.Process;
import java.lang.Thread;
import java.util.Date;
import p130w0.C2874a;
import p140y0.C2914d;
import p140y0.C2933s;

/* renamed from: r0.j */
public class C2602j implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f10223a;

    /* renamed from: b */
    private final Date f10224b = new Date();

    /* renamed from: c */
    private int f10225c = 50;

    /* renamed from: d */
    private int f10226d = 50;

    /* renamed from: e */
    private int f10227e = 200;

    /* renamed from: f */
    private boolean f10228f = true;

    /* renamed from: g */
    private boolean f10229g = true;

    /* renamed from: a */
    private String m11043a(Date date, Thread thread, String str) {
        return C2914d.m12067f(this.f10224b, date, "java", C2874a.m11880e(), C2914d.m12063b(C2874a.m11876a())) + "pid: " + Process.myPid() + ", tid: " + Process.myTid() + ", name: " + thread.getName() + "  >>> " + C2914d.m12064c(C2874a.m11876a(), Process.myPid()) + " <<<\n\njava stacktrace:\n" + str + "\n";
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097 A[SYNTHETIC, Splitter:B:26:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0148 A[SYNTHETIC, Splitter:B:59:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0154 A[SYNTHETIC, Splitter:B:64:0x0154] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11044c(java.lang.Thread r16, java.lang.Throwable r17) {
        /*
            r15 = this;
            r1 = r15
            java.lang.String r2 = "\n\n"
            java.lang.String r3 = "JavaCrashHandler close RandomAccessFile failed"
            java.lang.String r4 = "OneTrackExceptionHandler"
            java.lang.String r5 = "UTF-8"
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            r7 = 0
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0066 }
            java.lang.String r8 = "%s/%s_%020d_%s__%s%s"
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0066 }
            r10 = 0
            java.lang.String r11 = p140y0.C2927n.m12116a()     // Catch:{ Exception -> 0x0066 }
            r9[r10] = r11     // Catch:{ Exception -> 0x0066 }
            r10 = 1
            java.lang.String r11 = "tombstone"
            r9[r10] = r11     // Catch:{ Exception -> 0x0066 }
            r10 = 2
            java.util.Date r11 = r1.f10224b     // Catch:{ Exception -> 0x0066 }
            long r11 = r11.getTime()     // Catch:{ Exception -> 0x0066 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0066 }
            r9[r10] = r11     // Catch:{ Exception -> 0x0066 }
            r10 = 3
            android.content.Context r11 = p130w0.C2874a.m11876a()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r11 = p140y0.C2914d.m12063b(r11)     // Catch:{ Exception -> 0x0066 }
            r9[r10] = r11     // Catch:{ Exception -> 0x0066 }
            r10 = 4
            android.content.Context r11 = p130w0.C2874a.m11876a()     // Catch:{ Exception -> 0x0066 }
            int r12 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r11 = p140y0.C2914d.m12064c(r11, r12)     // Catch:{ Exception -> 0x0066 }
            r9[r10] = r11     // Catch:{ Exception -> 0x0066 }
            r10 = 5
            java.lang.String r11 = ".java.xcrash"
            r9[r10] = r11     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = java.lang.String.format(r0, r8, r9)     // Catch:{ Exception -> 0x0066 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0066 }
            boolean r0 = r8.exists()     // Catch:{ Exception -> 0x0064 }
            if (r0 != 0) goto L_0x006d
            r8.createNewFile()     // Catch:{ Exception -> 0x0064 }
            goto L_0x006d
        L_0x0064:
            r0 = move-exception
            goto L_0x0068
        L_0x0066:
            r0 = move-exception
            r8 = r7
        L_0x0068:
            java.lang.String r9 = "JavaCrashHandler createLogFile failed"
            p140y0.C2933s.m12145g(r4, r9, r0)
        L_0x006d:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ Exception -> 0x008b }
            r0.<init>()     // Catch:{ Exception -> 0x008b }
            java.io.PrintWriter r9 = new java.io.PrintWriter     // Catch:{ Exception -> 0x008b }
            r9.<init>(r0)     // Catch:{ Exception -> 0x008b }
            r10 = r17
            r10.printStackTrace(r9)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0089 }
            r11 = r16
            java.lang.String r0 = r15.m11043a(r6, r11, r9)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0095
        L_0x0087:
            r0 = move-exception
            goto L_0x008f
        L_0x0089:
            r0 = move-exception
            goto L_0x008e
        L_0x008b:
            r0 = move-exception
            r10 = r17
        L_0x008e:
            r9 = r7
        L_0x008f:
            java.lang.String r6 = "JavaCrashHandler getEmergency failed"
            p140y0.C2933s.m12145g(r4, r6, r0)
            r0 = r7
        L_0x0095:
            if (r8 == 0) goto L_0x015e
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0140 }
            java.lang.String r11 = "rws"
            r6.<init>(r8, r11)     // Catch:{ Exception -> 0x0140 }
            java.lang.String r7 = p100q0.C2565e.m10950l(r9)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r8.<init>()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r9 = "backtrace feature id:\n\t"
            r8.append(r9)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r8.append(r7)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r8.append(r2)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            byte[] r7 = r7.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r7)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r7.<init>()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r8 = "error reason:\n\t"
            r7.append(r8)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r8 = r17.toString()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r7.append(r8)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r7.append(r2)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            byte[] r2 = r2.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r2)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            if (r0 == 0) goto L_0x00e5
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r0)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
        L_0x00e5:
            int r0 = r1.f10227e     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            if (r0 > 0) goto L_0x00f1
            int r2 = r1.f10225c     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            if (r2 > 0) goto L_0x00f1
            int r2 = r1.f10226d     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            if (r2 <= 0) goto L_0x0100
        L_0x00f1:
            int r2 = r1.f10225c     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            int r7 = r1.f10226d     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r0 = p140y0.C2914d.m12062a(r0, r2, r7)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r0)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
        L_0x0100:
            boolean r0 = r1.f10228f     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = p140y0.C2914d.m12074m()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r0)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
        L_0x010f:
            boolean r0 = r1.f10229g     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = p140y0.C2914d.m12073l()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r0)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
        L_0x011e:
            java.lang.String r0 = p140y0.C2914d.m12072k()     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r0)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            java.lang.String r0 = "foreground:\nyes\n\n"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.write(r0)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.close()     // Catch:{ Exception -> 0x014c }
            goto L_0x015e
        L_0x0136:
            r0 = move-exception
            r2 = r0
            r7 = r6
            goto L_0x0152
        L_0x013a:
            r0 = move-exception
            r7 = r6
            goto L_0x0141
        L_0x013d:
            r0 = move-exception
            r2 = r0
            goto L_0x0152
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            java.lang.String r2 = "JavaCrashHandler write log file failed"
            p140y0.C2933s.m12145g(r4, r2, r0)     // Catch:{ all -> 0x013d }
            if (r7 == 0) goto L_0x015e
            r7.close()     // Catch:{ Exception -> 0x014c }
            goto L_0x015e
        L_0x014c:
            r0 = move-exception
            r2 = r0
            p140y0.C2933s.m12145g(r4, r3, r2)
            goto L_0x015e
        L_0x0152:
            if (r7 == 0) goto L_0x015d
            r7.close()     // Catch:{ Exception -> 0x0158 }
            goto L_0x015d
        L_0x0158:
            r0 = move-exception
            r5 = r0
            p140y0.C2933s.m12145g(r4, r3, r5)
        L_0x015d:
            throw r2
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p105r0.C2602j.m11044c(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: b */
    public void mo9864b() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C2602j)) {
            this.f10223a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C2933s.m12141c("OneTrackExceptionHandler", "uncaughtException start");
        m11044c(thread, th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10223a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
