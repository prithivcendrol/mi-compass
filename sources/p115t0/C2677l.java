package p115t0;

import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p120u0.C2730a;
import p120u0.C2732c;
import p120u0.C2735f;
import p135x0.C2897a;
import p140y0.C2933s;
import p140y0.C2940y;

/* renamed from: t0.l */
public class C2677l {

    /* renamed from: b */
    private static volatile C2677l f10468b;

    /* renamed from: a */
    private C2675j f10469a;

    private C2677l() {
        m11191i();
    }

    /* renamed from: a */
    public static C2677l m11185a() {
        m11189g();
        return f10468b;
    }

    /* renamed from: d */
    private boolean m11186d(JSONArray jSONArray) {
        try {
            String e = C2940y.m12187c().mo10232e();
            String jSONArray2 = jSONArray.toString();
            C2933s.m12141c("UploaderEngine", " payload:" + jSONArray2);
            byte[] f = m11188f(m11187e(jSONArray2));
            C2933s.m12141c("UploaderEngine", "before zip and encrypt, len=" + jSONArray2.length() + ", after=" + f.length);
            String b = C2897a.m11948b(e, f);
            StringBuilder sb = new StringBuilder();
            sb.append("sendDataToServer response: ");
            sb.append(b);
            C2933s.m12141c("UploaderEngine", sb.toString());
            if (TextUtils.isEmpty(b)) {
                return false;
            }
            return m11190h(b);
        } catch (Exception e2) {
            C2933s.m12145g("UploaderEngine", "Exception while uploading ", e2);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m11187e(java.lang.String r6) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            byte[] r3 = r6.getBytes(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            int r3 = r3.length     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ Exception -> 0x0021 }
            r3.write(r6)     // Catch:{ Exception -> 0x0021 }
            r3.finish()     // Catch:{ Exception -> 0x0021 }
            byte[] r1 = r2.toByteArray()     // Catch:{ Exception -> 0x0021 }
            goto L_0x0049
        L_0x0021:
            r6 = move-exception
            goto L_0x002f
        L_0x0023:
            r6 = move-exception
            r3 = r1
            goto L_0x0051
        L_0x0026:
            r6 = move-exception
            r3 = r1
            goto L_0x002f
        L_0x0029:
            r6 = move-exception
            r3 = r1
            goto L_0x0052
        L_0x002c:
            r6 = move-exception
            r2 = r1
            r3 = r2
        L_0x002f:
            java.lang.String r0 = "UploaderEngine"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r4.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = " zipData failed! "
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0050 }
            r4.append(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0050 }
            p140y0.C2933s.m12144f(r0, r6)     // Catch:{ all -> 0x0050 }
        L_0x0049:
            p140y0.C2930p.m12127e(r2)
            p140y0.C2930p.m12127e(r3)
            return r1
        L_0x0050:
            r6 = move-exception
        L_0x0051:
            r1 = r2
        L_0x0052:
            p140y0.C2930p.m12127e(r1)
            p140y0.C2930p.m12127e(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p115t0.C2677l.m11187e(java.lang.String):byte[]");
    }

    /* renamed from: f */
    private byte[] m11188f(byte[] bArr) {
        if (bArr != null) {
            return C2730a.m11380c(bArr, C2732c.m11389c(C2735f.m11403a().mo9972b()[0]));
        }
        C2933s.m12144f("UploaderEngine", "content is null");
        return null;
    }

    /* renamed from: g */
    public static void m11189g() {
        if (f10468b == null) {
            synchronized (C2677l.class) {
                if (f10468b == null) {
                    f10468b = new C2677l();
                }
            }
        }
    }

    /* renamed from: h */
    private boolean m11190h(String str) {
        try {
            int optInt = new JSONObject(str).optInt("code");
            if (optInt == 0) {
                C2933s.m12141c("UploaderEngine", "成功发送数据到服务端");
                return true;
            } else if (optInt == -3) {
                C2933s.m12144f("UploaderEngine", "signature expired, will update");
                C2735f.m11403a().mo9973c();
                return false;
            } else {
                C2933s.m12144f("UploaderEngine", "Error: status code=" + optInt);
                return false;
            }
        } catch (Exception e) {
            C2933s.m12145g("UploaderEngine", "parseUploadingResult exception ", e);
            return false;
        }
    }

    /* renamed from: i */
    private void m11191i() {
        HandlerThread handlerThread = new HandlerThread("mi_analytics_uploader_worker");
        handlerThread.start();
        this.f10469a = new C2675j(handlerThread.getLooper());
    }

    /* renamed from: b */
    public synchronized void mo9938b(int i, boolean z) {
        C2675j jVar = this.f10469a;
        if (jVar != null) {
            jVar.mo9935c(i, z);
        } else {
            C2933s.m12144f("UploaderEngine", "*** impossible, upload timer should not be null");
        }
    }

    /* renamed from: c */
    public boolean mo9939c(int i) {
        C2933s.m12141c("UploaderEngine", "即将读取数据库并上传数据");
        while (true) {
            C2671f e = C2666b.m11160d().mo9924e(i);
            if (e != null) {
                ArrayList<Long> arrayList = e.f10452c;
                boolean d = m11186d(e.f10450a);
                C2933s.m12141c("UploaderEngine", "upload success:" + d);
                if (d) {
                    if (C2666b.m11160d().mo9923a(arrayList) != 0) {
                        if (e.f10453d) {
                            C2933s.m12141c("UploaderEngine", "No more records for prio=" + i);
                            break;
                        }
                    } else {
                        C2933s.m12145g("UploaderEngine", "delete DB failed!", new Throwable());
                        break;
                    }
                } else {
                    return false;
                }
            } else {
                C2933s.m12141c("UploaderEngine", "满足条件的记录为空，即将返回, priority=" + i);
                return true;
            }
        }
        return true;
    }
}
