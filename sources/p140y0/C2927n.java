package p140y0;

import android.text.TextUtils;
import android.util.LruCache;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import p130w0.C2874a;

/* renamed from: y0.n */
public class C2927n {

    /* renamed from: a */
    private static LruCache<String, C2928a> f11115a = new C2929o(1048576);

    /* renamed from: y0.n$a */
    private static class C2928a {

        /* renamed from: a */
        String f11116a;

        private C2928a() {
        }

        /* synthetic */ C2928a(C2929o oVar) {
            this();
        }
    }

    /* renamed from: a */
    public static String m12116a() {
        return m12121f("tombstone");
    }

    /* renamed from: b */
    public static String m12117b(String str) {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C2928a aVar = f11115a.get(str);
        if (aVar != null) {
            return aVar.f11116a;
        }
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(m12120e(), str);
            StringBuilder sb = new StringBuilder();
            if (file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        try {
                            C2933s.m12146h("FileUtil", "get error:" + e.toString());
                            C2930p.m12125c(bufferedReader2);
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            C2930p.m12125c(bufferedReader2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        C2930p.m12125c(bufferedReader2);
                        throw th;
                    }
                }
            } else {
                bufferedReader = null;
            }
            String sb2 = sb.toString();
            C2928a aVar2 = new C2928a((C2929o) null);
            aVar2.f11116a = sb2;
            f11115a.put(str, aVar2);
            C2930p.m12125c(bufferedReader);
            return sb2;
        } catch (Exception e2) {
            e = e2;
            C2933s.m12146h("FileUtil", "get error:" + e.toString());
            C2930p.m12125c(bufferedReader2);
            return "";
        }
    }

    /* renamed from: c */
    public static String m12118c(String str, int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(str);
            StringBuilder sb = new StringBuilder();
            if (file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append("\n");
                        if (sb.length() > i) {
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            C2933s.m12146h("FileUtil", "get error:" + e.toString());
                            C2930p.m12125c(bufferedReader);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            C2930p.m12125c(bufferedReader2);
                            throw th;
                        }
                    }
                }
            } else {
                bufferedReader = null;
            }
            if (sb.length() > i) {
                String substring = sb.substring(0, i - 1);
                C2930p.m12125c(bufferedReader);
                return substring;
            }
            String sb2 = sb.toString();
            C2930p.m12125c(bufferedReader);
            return sb2;
        } catch (Exception e2) {
            e = e2;
            bufferedReader = null;
            C2933s.m12146h("FileUtil", "get error:" + e.toString());
            C2930p.m12125c(bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C2930p.m12125c(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: d */
    public static void m12119d(File file) {
        try {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Exception e) {
            C2933s.m12146h("FileUtil", "failed to remove file: " + file.getName() + "," + e.toString());
        }
    }

    /* renamed from: e */
    private static String m12120e() {
        return m12121f("onetrack");
    }

    /* renamed from: f */
    private static String m12121f(String str) {
        String str2 = C2874a.m11876a().getFilesDir().getAbsolutePath() + File.separator + str;
        File file = new File(str2);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }
}
