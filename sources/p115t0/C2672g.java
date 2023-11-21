package p115t0;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
import p120u0.C2732c;
import p130w0.C2874a;
import p140y0.C2925l;
import p140y0.C2930p;
import p140y0.C2933s;

/* renamed from: t0.g */
public class C2672g {

    /* renamed from: a */
    private static String f10454a = "onetrack_netaccess_%s";

    /* renamed from: b */
    private static SimpleDateFormat f10455b = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: c */
    private static boolean f10456c = false;

    /* renamed from: d */
    private static volatile boolean f10457d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile boolean f10458e = false;

    /* renamed from: a */
    public static void m11172a(String str, String str2) {
        C2925l.m12112a(new C2673h(str, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0028, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m11173b(p105r0.C2601i r2) {
        /*
            java.lang.Class<t0.g> r0 = p115t0.C2672g.class
            monitor-enter(r0)
            if (r2 == 0) goto L_0x0027
            boolean r1 = m11175d()     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x000c
            goto L_0x0027
        L_0x000c:
            boolean r1 = f10458e     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            boolean r1 = f10457d     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0015
            goto L_0x0022
        L_0x0015:
            r1 = 1
            f10458e = r1     // Catch:{ all -> 0x0024 }
            t0.i r1 = new t0.i     // Catch:{ all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ all -> 0x0024 }
            p140y0.C2925l.m12112a(r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)
            return
        L_0x0022:
            monitor-exit(r0)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x0027:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p115t0.C2672g.m11173b(r0.i):void");
    }

    /* renamed from: d */
    public static boolean m11175d() {
        return !new File(C2874a.m11876a().getFilesDir(), ".ot_net_disallowed").exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<org.json.JSONObject> m11176e() {
        /*
            java.lang.Class<t0.g> r0 = p115t0.C2672g.class
            monitor-enter(r0)
            java.text.SimpleDateFormat r1 = f10455b     // Catch:{ all -> 0x00b2 }
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x00b2 }
            r2.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = f10454a     // Catch:{ all -> 0x00b2 }
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b2 }
            r5 = 0
            r4[r5] = r1     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = java.lang.String.format(r2, r4)     // Catch:{ all -> 0x00b2 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = m11179h()     // Catch:{ all -> 0x00b2 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x00b2 }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x00b2 }
            r4 = 0
            if (r1 != 0) goto L_0x002c
            monitor-exit(r0)
            return r4
        L_0x002c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0065, all -> 0x0062 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            r2.<init>(r5)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
        L_0x003b:
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x0059 }
            if (r4 == 0) goto L_0x0052
            byte[] r4 = p120u0.C2732c.m11389c(r4)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r4 = p115t0.C2666b.m11158b(r4)     // Catch:{ Exception -> 0x0059 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0059 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0059 }
            r1.add(r6)     // Catch:{ Exception -> 0x0059 }
            goto L_0x003b
        L_0x0052:
            p140y0.C2930p.m12125c(r2)     // Catch:{ all -> 0x00b2 }
        L_0x0055:
            p140y0.C2930p.m12125c(r5)     // Catch:{ all -> 0x00b2 }
            goto L_0x008a
        L_0x0059:
            r4 = move-exception
            goto L_0x0069
        L_0x005b:
            r1 = move-exception
            goto L_0x00ab
        L_0x005d:
            r2 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L_0x0069
        L_0x0062:
            r1 = move-exception
            r5 = r4
            goto L_0x00ab
        L_0x0065:
            r2 = move-exception
            r5 = r4
            r4 = r2
            r2 = r5
        L_0x0069:
            java.lang.String r6 = "NetworkAccessManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "cta getCacheData error: "
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00a9 }
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a9 }
            p140y0.C2933s.m12144f(r6, r7)     // Catch:{ all -> 0x00a9 }
            r4.printStackTrace()     // Catch:{ all -> 0x00a9 }
            p140y0.C2930p.m12125c(r2)     // Catch:{ all -> 0x00b2 }
            goto L_0x0055
        L_0x008a:
            int r2 = r1.size()     // Catch:{ all -> 0x00b2 }
            r4 = 100
            if (r2 <= r4) goto L_0x009f
            int r2 = r1.size()     // Catch:{ all -> 0x00b2 }
            int r2 = r2 - r4
            int r4 = r1.size()     // Catch:{ all -> 0x00b2 }
            java.util.List r1 = r1.subList(r2, r4)     // Catch:{ all -> 0x00b2 }
        L_0x009f:
            int r2 = r1.size()     // Catch:{ all -> 0x00b2 }
            if (r2 <= 0) goto L_0x00a7
            f10457d = r3     // Catch:{ all -> 0x00b2 }
        L_0x00a7:
            monitor-exit(r0)
            return r1
        L_0x00a9:
            r1 = move-exception
            r4 = r2
        L_0x00ab:
            p140y0.C2930p.m12125c(r4)     // Catch:{ all -> 0x00b2 }
            p140y0.C2930p.m12125c(r5)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115t0.C2672g.m11176e():java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static synchronized void m11177f(String str, String str2) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        synchronized (C2672g.class) {
            File file = new File(m11179h(), String.format(f10454a, new Object[]{f10455b.format(new Date())}));
            BufferedWriter bufferedWriter2 = null;
            try {
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        new File(file.getParentFile().getAbsolutePath()).mkdirs();
                    }
                    file.createNewFile();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("eventName", str);
                jSONObject.put("data", str2);
                byte[] i = C2666b.m11163i(jSONObject.toString());
                fileWriter = new FileWriter(file, true);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Exception e) {
                    e = e;
                    try {
                        C2933s.m12144f("NetworkAccessManager", "cta doSaveData error: " + e.toString());
                        e.printStackTrace();
                        C2930p.m12125c(bufferedWriter2);
                        C2930p.m12125c(fileWriter);
                    } catch (Throwable th) {
                        th = th;
                        C2930p.m12125c(bufferedWriter2);
                        C2930p.m12125c(fileWriter);
                        throw th;
                    }
                }
                try {
                    bufferedWriter.write(C2732c.m11387a(i));
                    bufferedWriter.newLine();
                    f10457d = true;
                    C2930p.m12125c(bufferedWriter);
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter2 = bufferedWriter;
                    C2933s.m12144f("NetworkAccessManager", "cta doSaveData error: " + e.toString());
                    e.printStackTrace();
                    C2930p.m12125c(bufferedWriter2);
                    C2930p.m12125c(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    C2930p.m12125c(bufferedWriter2);
                    C2930p.m12125c(fileWriter);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileWriter = null;
                C2933s.m12144f("NetworkAccessManager", "cta doSaveData error: " + e.toString());
                e.printStackTrace();
                C2930p.m12125c(bufferedWriter2);
                C2930p.m12125c(fileWriter);
            } catch (Throwable th3) {
                th = th3;
                fileWriter = null;
                C2930p.m12125c(bufferedWriter2);
                C2930p.m12125c(fileWriter);
                throw th;
            }
            C2930p.m12125c(fileWriter);
        }
    }

    /* renamed from: g */
    public static synchronized void m11178g(boolean z) {
        synchronized (C2672g.class) {
            try {
                File file = new File(m11179h());
                if (file.exists()) {
                    if (file.isDirectory()) {
                        String format = String.format(f10454a, new Object[]{f10455b.format(new Date())});
                        File[] listFiles = file.listFiles();
                        for (int i = 0; i < listFiles.length; i++) {
                            if (listFiles[i].isFile()) {
                                if (z || !listFiles[i].getName().equalsIgnoreCase(format)) {
                                    listFiles[i].delete();
                                }
                            }
                        }
                        if (listFiles.length == 0) {
                            f10457d = false;
                        }
                    }
                }
                f10457d = false;
                return;
            } catch (Exception e) {
                C2933s.m12144f("NetworkAccessManager", "cta removeObsoleteEvent error: " + e.toString());
                e.printStackTrace();
            }
        }
        return;
    }

    /* renamed from: h */
    private static String m11179h() {
        Context a = C2874a.m11876a();
        return a.getFilesDir().getAbsolutePath() + File.separator + "networkAccess";
    }
}
