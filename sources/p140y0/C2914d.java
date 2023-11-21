package p140y0;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.system.Os;
import android.text.TextUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: y0.d */
public class C2914d {

    /* renamed from: a */
    private static final String[] f11088a = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    /* renamed from: a */
    public static String m12062a(int i, int i2, int i3) {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append("logcat:\n");
        if (i > 0) {
            m12068g(myPid, sb, "main", i, 'D');
        }
        if (i2 > 0) {
            m12068g(myPid, sb, "system", i2, 'W');
        }
        if (i3 > 0) {
            m12068g(myPid, sb, "events", i2, 'I');
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m12063b(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[SYNTHETIC, Splitter:B:34:0x0073] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12064c(android.content.Context r4, int r5) {
        /*
            java.lang.String r0 = "activity"
            java.lang.Object r4 = r4.getSystemService(r0)     // Catch:{ Exception -> 0x002f }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x002f
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x002f
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x002f }
        L_0x0014:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x002f }
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch:{ Exception -> 0x002f }
            int r1 = r0.pid     // Catch:{ Exception -> 0x002f }
            if (r1 != r5) goto L_0x0014
            java.lang.String r1 = r0.processName     // Catch:{ Exception -> 0x002f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x002f }
            if (r1 != 0) goto L_0x0014
            java.lang.String r4 = r0.processName     // Catch:{ Exception -> 0x002f }
            return r4
        L_0x002f:
            r4 = 0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            r2.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            r2.append(r5)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            java.lang.String r5 = "/cmdline"
            r2.append(r5)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0077, all -> 0x006e }
            java.lang.String r5 = r0.readLine()     // Catch:{ Exception -> 0x0078, all -> 0x006c }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0078, all -> 0x006c }
            if (r1 != 0) goto L_0x0068
            java.lang.String r5 = r5.trim()     // Catch:{ Exception -> 0x0078, all -> 0x006c }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0078, all -> 0x006c }
            if (r1 != 0) goto L_0x0068
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            return r5
        L_0x0068:
            r0.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x007b
        L_0x006c:
            r4 = move-exception
            goto L_0x0071
        L_0x006e:
            r5 = move-exception
            r0 = r4
            r4 = r5
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            throw r4
        L_0x0077:
            r0 = r4
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            goto L_0x0068
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p140y0.C2914d.m12064c(android.content.Context, int):java.lang.String");
    }

    /* renamed from: d */
    private static String m12065d(String str) {
        return m12066e(str, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f A[SYNTHETIC, Splitter:B:34:0x007f] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m12066e(java.lang.String r5, int r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0057 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0057 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0057 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0057 }
            r1 = 0
        L_0x0011:
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = r3.trim()     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            if (r4 <= 0) goto L_0x0011
            int r1 = r1 + 1
            if (r6 == 0) goto L_0x0027
            if (r1 > r6) goto L_0x0011
        L_0x0027:
            java.lang.String r4 = "  "
            r0.append(r4)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            r0.append(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            java.lang.String r3 = "\n"
            r0.append(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            goto L_0x0011
        L_0x0035:
            if (r6 <= 0) goto L_0x004b
            if (r1 <= r6) goto L_0x004b
            java.lang.String r6 = "  ......\n"
            r0.append(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            java.lang.String r6 = "  (number of records: "
            r0.append(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            r0.append(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
            java.lang.String r6 = ")\n"
            r0.append(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004f }
        L_0x004b:
            r2.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x0078
        L_0x004f:
            r5 = move-exception
            r1 = r2
            goto L_0x007d
        L_0x0052:
            r6 = move-exception
            r1 = r2
            goto L_0x0058
        L_0x0055:
            r5 = move-exception
            goto L_0x007d
        L_0x0057:
            r6 = move-exception
        L_0x0058:
            java.lang.String r2 = "CrashUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r3.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = "CrashUtil getInfo("
            r3.append(r4)     // Catch:{ all -> 0x0055 }
            r3.append(r5)     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = ") failed"
            r3.append(r5)     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0055 }
            p140y0.C2933s.m12147i(r2, r5, r6)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x007d:
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p140y0.C2914d.m12066e(java.lang.String, int):java.lang.String");
    }

    /* renamed from: f */
    public static String m12067f(Date date, Date date2, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\nTombstone maker: 'OneTrack 1.1.6'\nCrash type: '");
        sb.append(str);
        sb.append("'\nStart time: '");
        sb.append(simpleDateFormat.format(date));
        sb.append("'\nCrash time: '");
        sb.append(simpleDateFormat.format(date2));
        sb.append("'\nApp ID: '");
        sb.append(str2);
        sb.append("'\nApp version: '");
        sb.append(str3);
        sb.append("'\nRooted: '");
        sb.append(m12069h() ? "Yes" : "No");
        sb.append("'\nAPI level: '");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("'\nOS version: '");
        sb.append(Build.VERSION.RELEASE);
        sb.append("'\nABI list: '");
        sb.append(m12070i());
        sb.append("'\nManufacturer: '");
        sb.append(Build.MANUFACTURER);
        sb.append("'\nBrand: '");
        sb.append(Build.BRAND);
        sb.append("'\nModel: '");
        sb.append(Build.MODEL);
        sb.append("'\nBuild fingerprint: '");
        sb.append(Build.FINGERPRINT);
        sb.append("'\n");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c3 A[SYNTHETIC, Splitter:B:21:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12068g(int r3, java.lang.StringBuilder r4, java.lang.String r5, int r6, char r7) {
        /*
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "/system/bin/logcat"
            r0.add(r2)
            java.lang.String r2 = "-b"
            r0.add(r2)
            r0.add(r5)
            java.lang.String r2 = "-d"
            r0.add(r2)
            java.lang.String r2 = "-v"
            r0.add(r2)
            java.lang.String r2 = "threadtime"
            r0.add(r2)
            java.lang.String r2 = "-t"
            r0.add(r2)
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r0.add(r6)
            java.lang.String r6 = "--pid"
            r0.add(r6)
            r0.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "*:"
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            java.lang.Object[] r3 = r0.toArray()
            java.lang.String r6 = "--------- tail end of log "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = " ("
            r4.append(r5)
            java.lang.String r3 = android.text.TextUtils.join(r1, r3)
            r4.append(r3)
            java.lang.String r3 = ")\n"
            r4.append(r3)
            r3 = 0
            java.lang.ProcessBuilder r5 = new java.lang.ProcessBuilder     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.lang.ProcessBuilder r5 = r5.command(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.lang.Process r5 = r5.start()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r7.<init>(r5)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
        L_0x0099:
            java.lang.String r3 = r6.readLine()     // Catch:{ Exception -> 0x00ac }
            if (r3 == 0) goto L_0x00a8
            r4.append(r3)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r3 = "\n"
            r4.append(r3)     // Catch:{ Exception -> 0x00ac }
            goto L_0x0099
        L_0x00a8:
            r6.close()     // Catch:{ IOException -> 0x00bf }
            goto L_0x00bf
        L_0x00ac:
            r3 = move-exception
            goto L_0x00b5
        L_0x00ae:
            r4 = move-exception
            r6 = r3
            r3 = r4
            goto L_0x00c1
        L_0x00b2:
            r4 = move-exception
            r6 = r3
            r3 = r4
        L_0x00b5:
            java.lang.String r4 = "CrashUtil"
            java.lang.String r5 = "CrashUtil run logcat command failed"
            p140y0.C2933s.m12145g(r4, r5, r3)     // Catch:{ all -> 0x00c0 }
            if (r6 == 0) goto L_0x00bf
            goto L_0x00a8
        L_0x00bf:
            return
        L_0x00c0:
            r3 = move-exception
        L_0x00c1:
            if (r6 == 0) goto L_0x00c6
            r6.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p140y0.C2914d.m12068g(int, java.lang.StringBuilder, java.lang.String, int, char):void");
    }

    /* renamed from: h */
    static boolean m12069h() {
        try {
            for (String file : f11088a) {
                if (new File(file).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: i */
    static String m12070i() {
        return TextUtils.join(",", Build.SUPPORTED_ABIS);
    }

    /* renamed from: j */
    static String m12071j() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%21s %8s\n", new Object[]{"", "Pss(KB)"}));
        sb.append(String.format(locale, "%21s %8s\n", new Object[]{"", "------"}));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")}));
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")}));
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"Code:", memoryInfo.getMemoryStat("summary.code")}));
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"Stack:", memoryInfo.getMemoryStat("summary.stack")}));
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"Graphics:", memoryInfo.getMemoryStat("summary.graphics")}));
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"Private Other:", memoryInfo.getMemoryStat("summary.private-other")}));
            sb.append(String.format(locale, "%21s %8s\n", new Object[]{"System:", memoryInfo.getMemoryStat("summary.system")}));
            sb.append(String.format(locale, "%21s %8s %21s %8s\n", new Object[]{"TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")}));
        } catch (Exception e) {
            C2933s.m12145g("CrashUtil", "CrashUtil getProcessMemoryInfo failed", e);
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static String m12072k() {
        return "memory info:\n System Summary (From: /proc/meminfo)\n" + m12065d("/proc/meminfo") + "-\n Process Status (From: /proc/PID/status)\n" + m12065d("/proc/self/status") + "-\n Process Limits (From: /proc/PID/limits)\n" + m12065d("/proc/self/limits") + "-\n" + m12071j() + "\n";
    }

    /* renamed from: l */
    public static String m12073l() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "network info:\nNot supported on Android Q (API level 29) and later.\n\n";
        }
        return "network info:\n TCP over IPv4 (From: /proc/PID/net/tcp)\n" + m12066e("/proc/self/net/tcp", 1024) + "-\n TCP over IPv6 (From: /proc/PID/net/tcp6)\n" + m12066e("/proc/self/net/tcp6", 1024) + "-\n UDP over IPv4 (From: /proc/PID/net/udp)\n" + m12066e("/proc/self/net/udp", 1024) + "-\n UDP over IPv6 (From: /proc/PID/net/udp6)\n" + m12066e("/proc/self/net/udp6", 1024) + "-\n ICMP in IPv4 (From: /proc/PID/net/icmp)\n" + m12066e("/proc/self/net/icmp", 256) + "-\n ICMP in IPv6 (From: /proc/PID/net/icmp6)\n" + m12066e("/proc/self/net/icmp6", 256) + "-\n UNIX domain (From: /proc/PID/net/unix)\n" + m12066e("/proc/self/net/unix", 256) + "\n";
    }

    /* renamed from: m */
    public static String m12074m() {
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] listFiles = new File("/proc/self/fd").listFiles(new C2915e());
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file = listFiles[i];
                    String str = null;
                    try {
                        str = Os.readlink(file.getAbsolutePath());
                    } catch (Exception unused) {
                    }
                    sb.append("    fd ");
                    sb.append(file.getName());
                    sb.append(": ");
                    sb.append(TextUtils.isEmpty(str) ? "???" : str.trim());
                    sb.append(10);
                    i2++;
                    if (i2 > 1024) {
                        break;
                    }
                    i++;
                }
                if (listFiles.length > 1024) {
                    sb.append("    ......\n");
                }
                sb.append("    (number of FDs: ");
                sb.append(listFiles.length);
                sb.append(")\n");
            }
        } catch (Exception unused2) {
        }
        sb.append(10);
        return sb.toString();
    }
}
