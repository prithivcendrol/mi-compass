package p100q0;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p105r0.C2603k;
import p120u0.C2733d;
import p140y0.C2911a;
import p140y0.C2913c;
import p140y0.C2925l;
import p140y0.C2927n;
import p140y0.C2933s;

/* renamed from: q0.e */
public class C2565e {

    /* renamed from: c */
    private static final AtomicBoolean f10083c = new AtomicBoolean(false);

    /* renamed from: a */
    private final C2566a[] f10084a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2603k f10085b;

    /* renamed from: q0.e$a */
    private class C2566a {

        /* renamed from: a */
        final List<File> f10086a = new ArrayList();

        /* renamed from: b */
        final String f10087b;

        /* renamed from: c */
        final String f10088c;

        C2566a(String str) {
            this.f10088c = str;
            this.f10087b = str + ".xcrash";
        }

        /* renamed from: a */
        private String m10956a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split("__");
            if (split.length != 2) {
                return null;
            }
            String[] split2 = split[0].split("_");
            if (split2.length == 3) {
                return split2[2];
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9823b() {
            for (int i = 0; i < this.f10086a.size(); i++) {
                String absolutePath = this.f10086a.get(i).getAbsoluteFile().getAbsolutePath();
                String a = m10956a(absolutePath);
                String c = C2927n.m12118c(absolutePath, 102400);
                if (!TextUtils.isEmpty(c) && C2565e.this.f10085b != null) {
                    String b = C2565e.m10951m(c, this.f10088c);
                    String g = C2565e.m10947i(c, this.f10088c);
                    C2933s.m12141c("CrashAnalysis", "fileName: " + absolutePath);
                    C2933s.m12141c("CrashAnalysis", "feature id: " + b);
                    C2933s.m12141c("CrashAnalysis", "error: " + g);
                    C2565e.this.f10085b.mo9866d(c, g, this.f10088c, a, b);
                    C2927n.m12119d(new File(absolutePath));
                    C2933s.m12141c("CrashAnalysis", "remove reported crash file");
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo9824c(File file) {
            if (!file.getName().contains(this.f10087b)) {
                return false;
            }
            this.f10086a.add(file);
            return true;
        }
    }

    private C2565e(Context context, C2603k kVar) {
        try {
            Object newInstance = Class.forName("xcrash.XCrash$InitParameters").getConstructor(new Class[0]).newInstance(new Object[0]);
            Boolean bool = Boolean.FALSE;
            m10942d(newInstance, "setNativeDumpAllThreads", bool);
            m10942d(newInstance, "setLogDir", m10939a());
            m10942d(newInstance, "setNativeDumpMap", bool);
            m10942d(newInstance, "setNativeDumpFds", bool);
            m10942d(newInstance, "setJavaDumpAllThreads", bool);
            Class.forName("xcrash.XCrash").getDeclaredMethod("init", new Class[]{Context.class, newInstance.getClass()}).invoke((Object) null, new Object[]{context.getApplicationContext(), newInstance});
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f10085b = kVar;
        this.f10084a = new C2566a[]{new C2566a("java"), new C2566a("anr"), new C2566a("native")};
    }

    /* synthetic */ C2565e(Context context, C2603k kVar, C2563c cVar) {
        this(context, kVar);
    }

    /* renamed from: a */
    private static String m10939a() {
        return C2927n.m12116a();
    }

    /* renamed from: c */
    private void m10941c(long j) {
        C2911a.m12049s((C2913c.m12060b() * 100) + j);
    }

    /* renamed from: d */
    private void m10942d(Object obj, String str, Object obj2) {
        obj.getClass().getDeclaredMethod(str, new Class[]{obj2.getClass() == Boolean.class ? Boolean.TYPE : obj2.getClass()}).invoke(obj, new Object[]{obj2});
    }

    /* renamed from: f */
    private long m10944f() {
        String str;
        long o = C2911a.m12045o();
        if (o == 0) {
            str = "no ticket data found, return max count";
        } else {
            long b = C2913c.m12060b();
            if (o / 100 != b) {
                str = "no today's ticket, return max count";
            } else {
                long j = o - (b * 100);
                C2933s.m12141c("CrashAnalysis", "today's remain ticket is " + j);
                return j;
            }
        }
        C2933s.m12141c("CrashAnalysis", str);
        return 10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r1 != -1) goto L_0x003e;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m10947i(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "anr"
            boolean r4 = r4.equals(r0)
            r0 = -1
            if (r4 == 0) goto L_0x002c
            java.lang.String r4 = " tid=1 "
            int r4 = r3.indexOf(r4)
            if (r4 == r0) goto L_0x0043
            java.lang.String r1 = "\n  at "
            int r4 = r3.indexOf(r1, r4)
            if (r4 == r0) goto L_0x0043
            r1 = 10
            int r2 = r4 + 6
            int r1 = r3.indexOf(r1, r2)
            if (r1 == r0) goto L_0x0043
            int r4 = r4 + 2
            goto L_0x003e
        L_0x002c:
            java.lang.String r4 = "error reason:\n\t"
            int r4 = r3.indexOf(r4)
            if (r4 == r0) goto L_0x0043
            int r4 = r4 + 15
            java.lang.String r1 = "\n\n"
            int r1 = r3.indexOf(r1, r4)
            if (r1 == r0) goto L_0x0043
        L_0x003e:
            java.lang.String r3 = r3.substring(r4, r1)
            goto L_0x0045
        L_0x0043:
            java.lang.String r3 = "uncategoried"
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p100q0.C2565e.m10947i(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    private List<File> m10948j() {
        File[] listFiles = new File(m10939a()).listFiles();
        if (listFiles == null) {
            C2933s.m12141c("CrashAnalysis", "this path does not denote a directory, or if an I/O error occurs.");
            return null;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new C2564d(this));
        int size = asList.size();
        if (size <= 20) {
            return asList;
        }
        int i = size - 20;
        for (int i2 = 0; i2 < i; i2++) {
            C2927n.m12119d(asList.get(i2));
        }
        return asList.subList(i, size);
    }

    /* renamed from: l */
    public static String m10950l(String str) {
        String[] split = str.replaceAll("\\t", "").split("\\n");
        StringBuilder sb = new StringBuilder();
        int min = Math.min(split.length, 20);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            split[i2] = split[i2].replaceAll("((java:)|(length=)|(index=)|(Index:)|(Size:))\\d+", "$1XX").replaceAll("\\$[0-9a-fA-F]{1,10}@[0-9a-fA-F]{1,10}|@[0-9a-fA-F]{1,10}|0x[0-9a-fA-F]{1,10}", "XX").replaceAll("\\d+[B,KB,MB]*", "");
        }
        while (i < min && (!split[i].contains("...") || !split[i].contains("more"))) {
            sb.append(split[i]);
            sb.append(10);
            i++;
        }
        return C2733d.m11400j(sb.toString());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r3 = r3 + 23;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m10951m(java.lang.String r2, java.lang.String r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "anr"
            boolean r3 = r3.equals(r0)
            java.lang.String r0 = "\n\n"
            r1 = -1
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = " tid=1 "
            int r3 = r2.indexOf(r3)
            if (r3 == r1) goto L_0x003d
            int r0 = r2.indexOf(r0, r3)
            if (r0 == r1) goto L_0x003d
            java.lang.String r2 = r2.substring(r3, r0)
            java.lang.String r2 = m10950l(r2)
            goto L_0x003f
        L_0x0028:
            java.lang.String r3 = "backtrace feature id:\n\t"
            int r3 = r2.indexOf(r3)
            if (r3 == r1) goto L_0x003d
            int r3 = r3 + 23
            int r0 = r2.indexOf(r0, r3)
            if (r0 == r1) goto L_0x003d
            java.lang.String r2 = r2.substring(r3, r0)
            goto L_0x003f
        L_0x003d:
            java.lang.String r2 = ""
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p100q0.C2565e.m10951m(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m10952n() {
        boolean z;
        Iterator<File> it;
        List<File> j = m10948j();
        long f = m10944f();
        if (j == null || j.size() <= 0) {
            z = false;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = C2911a.m12040j();
            long j3 = 604800000;
            if (j2 > currentTimeMillis) {
                j2 = currentTimeMillis - 604800000;
            }
            Iterator<File> it2 = j.iterator();
            long j4 = 0;
            long j5 = 0;
            boolean z2 = false;
            while (it2.hasNext()) {
                File next = it2.next();
                long lastModified = next.lastModified();
                if (lastModified < currentTimeMillis - j3 || lastModified > currentTimeMillis) {
                    it = it2;
                    C2933s.m12141c("CrashAnalysis", "remove obsolete crash files: " + next.getName());
                    C2927n.m12119d(next);
                } else {
                    if (lastModified <= j2) {
                        C2933s.m12141c("CrashAnalysis", "found already reported crash file, ignore");
                    } else if (f > j4) {
                        C2566a[] aVarArr = this.f10084a;
                        int length = aVarArr.length;
                        int i = 0;
                        while (i < length) {
                            Iterator<File> it3 = it2;
                            if (aVarArr[i].mo9824c(next)) {
                                C2933s.m12141c("CrashAnalysis", "find crash file:" + next.getName());
                                f--;
                                if (j5 < lastModified) {
                                    j5 = lastModified;
                                }
                                z2 = true;
                            }
                            i++;
                            it2 = it3;
                        }
                    }
                    it = it2;
                }
                it2 = it;
                j3 = 604800000;
                j4 = 0;
            }
            if (j5 > j4) {
                C2911a.m12046p(j5);
            }
            z = z2;
        }
        if (z) {
            m10941c(f);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m10953o() {
        for (C2566a b : this.f10084a) {
            b.mo9823b();
        }
    }

    /* renamed from: p */
    public static boolean m10954p() {
        try {
            Class.forName("xcrash.XCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static void m10955q(Context context, C2603k kVar) {
        if (f10083c.compareAndSet(false, true)) {
            C2925l.m12112a(new C2563c(context, kVar));
        } else {
            C2933s.m12144f("CrashAnalysis", "run method has been invoked more than once");
        }
    }
}
