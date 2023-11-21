package p135x0;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p120u0.C2733d;
import p140y0.C2930p;
import p140y0.C2933s;

/* renamed from: x0.a */
public class C2897a {

    /* renamed from: a */
    private static String f11029a = "HttpUtil";

    /* renamed from: a */
    private static String m11947a(String str, String str2, Map<String, String> map, boolean z) {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        InputStream inputStream;
        String str3;
        String str4;
        InputStream inputStream2 = null;
        if (map == null) {
            str3 = null;
        } else {
            try {
                str3 = m11950d(map, z);
            } catch (Exception e) {
                e = e;
                outputStream = null;
                httpURLConnection = null;
                inputStream = null;
                try {
                    C2933s.m12145g(f11029a, "HttpUtils POST 上传异常", e);
                    C2930p.m12126d(inputStream);
                    C2930p.m12127e(outputStream);
                    C2930p.m12128f(httpURLConnection);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    C2930p.m12126d(inputStream2);
                    C2930p.m12127e(outputStream);
                    C2930p.m12128f(httpURLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                httpURLConnection = null;
                C2930p.m12126d(inputStream2);
                C2930p.m12127e(outputStream);
                C2930p.m12128f(httpURLConnection);
                throw th;
            }
        }
        if (!"GET".equals(str) || str3 == null) {
            str4 = str2;
        } else {
            str4 = str2 + "? " + str3;
        }
        httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(15000);
            if ("GET".equals(str)) {
                httpURLConnection.setRequestMethod("GET");
            } else if ("POST".equals(str) && str3 != null) {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setDoOutput(true);
                byte[] bytes = str3.getBytes("UTF-8");
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(bytes, 0, bytes.length);
                    outputStream.flush();
                    int responseCode = httpURLConnection.getResponseCode();
                    inputStream = httpURLConnection.getInputStream();
                    byte[] g = C2930p.m12129g(inputStream);
                    C2933s.m12141c(f11029a, String.format("HttpUtils POST 上传成功 url: %s, code: %s", new Object[]{str2, Integer.valueOf(responseCode)}));
                    String str5 = new String(g, "UTF-8");
                    C2930p.m12126d(inputStream);
                    C2930p.m12127e(outputStream);
                    C2930p.m12128f(httpURLConnection);
                    return str5;
                } catch (Exception e2) {
                    e = e2;
                    inputStream = null;
                    C2933s.m12145g(f11029a, "HttpUtils POST 上传异常", e);
                    C2930p.m12126d(inputStream);
                    C2930p.m12127e(outputStream);
                    C2930p.m12128f(httpURLConnection);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    C2930p.m12126d(inputStream2);
                    C2930p.m12127e(outputStream);
                    C2930p.m12128f(httpURLConnection);
                    throw th;
                }
            }
            outputStream = null;
            int responseCode2 = httpURLConnection.getResponseCode();
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] g2 = C2930p.m12129g(inputStream);
                C2933s.m12141c(f11029a, String.format("HttpUtils POST 上传成功 url: %s, code: %s", new Object[]{str2, Integer.valueOf(responseCode2)}));
                String str52 = new String(g2, "UTF-8");
                C2930p.m12126d(inputStream);
                C2930p.m12127e(outputStream);
                C2930p.m12128f(httpURLConnection);
                return str52;
            } catch (Exception e3) {
                e = e3;
                C2933s.m12145g(f11029a, "HttpUtils POST 上传异常", e);
                C2930p.m12126d(inputStream);
                C2930p.m12127e(outputStream);
                C2930p.m12128f(httpURLConnection);
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            outputStream = null;
            inputStream = null;
            C2933s.m12145g(f11029a, "HttpUtils POST 上传异常", e);
            C2930p.m12126d(inputStream);
            C2930p.m12127e(outputStream);
            C2930p.m12128f(httpURLConnection);
            return null;
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            C2930p.m12126d(inputStream2);
            C2930p.m12127e(outputStream);
            C2930p.m12128f(httpURLConnection);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11948b(java.lang.String r11, byte[] r12) {
        /*
            java.lang.String r0 = f11029a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doPost url="
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ", len="
            r1.append(r2)
            int r2 = r12.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p140y0.C2933s.m12141c(r0, r1)
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x00e8, all -> 0x00e4 }
            r4.<init>(r11)     // Catch:{ IOException -> 0x00e8, all -> 0x00e4 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x00e8, all -> 0x00e4 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x00e8, all -> 0x00e4 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r5 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r4.setDoOutput(r2)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = "POST"
            r4.setRequestMethod(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/octet-stream"
            r4.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            u0.f r5 = p120u0.C2735f.m11403a()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String[] r5 = r5.mo9972b()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r5 = r5[r2]     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "OT_SID"
            r4.setRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "OT_ts"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r7 = java.lang.Long.toString(r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r4.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "OT_net"
            android.content.Context r7 = p130w0.C2874a.m11876a()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            q0.g$d r7 = p135x0.C2898b.m11952a(r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r4.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "OT_sender"
            java.lang.String r7 = p130w0.C2874a.m11880e()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r4.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = "OT_protocol"
            java.lang.String r7 = "3.0"
            r4.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r6 = f11029a     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r7.<init>()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r8 = "sid:"
            r7.append(r8)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            r7.append(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            p140y0.C2933s.m12141c(r6, r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            java.io.OutputStream r5 = r4.getOutputStream()     // Catch:{ IOException -> 0x00e1, all -> 0x00de }
            int r6 = r12.length     // Catch:{ IOException -> 0x00db, all -> 0x00d9 }
            r5.write(r12, r1, r6)     // Catch:{ IOException -> 0x00db, all -> 0x00d9 }
            r5.flush()     // Catch:{ IOException -> 0x00db, all -> 0x00d9 }
            int r12 = r4.getResponseCode()     // Catch:{ IOException -> 0x00db, all -> 0x00d9 }
            java.io.InputStream r6 = r4.getInputStream()     // Catch:{ IOException -> 0x00db, all -> 0x00d9 }
            byte[] r7 = p140y0.C2930p.m12129g(r6)     // Catch:{ IOException -> 0x00d7 }
            java.lang.String r8 = f11029a     // Catch:{ IOException -> 0x00d7 }
            java.lang.String r9 = "HttpUtils POST 上传成功 url: %s, code: %s"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x00d7 }
            r10[r1] = r11     // Catch:{ IOException -> 0x00d7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x00d7 }
            r10[r2] = r12     // Catch:{ IOException -> 0x00d7 }
            java.lang.String r12 = java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x00d7 }
            p140y0.C2933s.m12141c(r8, r12)     // Catch:{ IOException -> 0x00d7 }
            java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x00d7 }
            java.lang.String r8 = "UTF-8"
            r12.<init>(r7, r8)     // Catch:{ IOException -> 0x00d7 }
            p140y0.C2930p.m12126d(r6)
            p140y0.C2930p.m12127e(r5)
            p140y0.C2930p.m12128f(r4)
            return r12
        L_0x00d7:
            r12 = move-exception
            goto L_0x00ec
        L_0x00d9:
            r11 = move-exception
            goto L_0x010d
        L_0x00db:
            r12 = move-exception
            r6 = r3
            goto L_0x00ec
        L_0x00de:
            r11 = move-exception
            r5 = r3
            goto L_0x010d
        L_0x00e1:
            r12 = move-exception
            r5 = r3
            goto L_0x00eb
        L_0x00e4:
            r11 = move-exception
            r4 = r3
            r5 = r4
            goto L_0x010d
        L_0x00e8:
            r12 = move-exception
            r4 = r3
            r5 = r4
        L_0x00eb:
            r6 = r5
        L_0x00ec:
            java.lang.String r7 = f11029a     // Catch:{ all -> 0x010b }
            java.lang.String r8 = "HttpUtils POST 上传失败, url: %s, error: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x010b }
            r0[r1] = r11     // Catch:{ all -> 0x010b }
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x010b }
            r0[r2] = r11     // Catch:{ all -> 0x010b }
            java.lang.String r11 = java.lang.String.format(r8, r0)     // Catch:{ all -> 0x010b }
            p140y0.C2933s.m12144f(r7, r11)     // Catch:{ all -> 0x010b }
            p140y0.C2930p.m12126d(r6)
            p140y0.C2930p.m12127e(r5)
            p140y0.C2930p.m12128f(r4)
            return r3
        L_0x010b:
            r11 = move-exception
            r3 = r6
        L_0x010d:
            p140y0.C2930p.m12126d(r3)
            p140y0.C2930p.m12127e(r5)
            p140y0.C2930p.m12128f(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p135x0.C2897a.m11948b(java.lang.String, byte[]):java.lang.String");
    }

    /* renamed from: c */
    public static String m11949c(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            ArrayList<String> arrayList = new ArrayList<>(map.keySet());
            Collections.sort(arrayList);
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(map.get(str));
                }
            }
        }
        sb.append("miui_sdkconfig_jafej!@#)(*e@!#");
        return C2733d.m11398h(sb.toString());
    }

    /* renamed from: d */
    private static String m11950d(Map<String, String> map, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            try {
                if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                    sb.append("=");
                    sb.append(URLEncoder.encode(next.getValue() == null ? "null" : (String) next.getValue(), "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
                C2933s.m12144f(f11029a, "format params failed");
            }
        }
        if (z) {
            String c = m11949c(map);
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode("sign", "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(c, "UTF-8"));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m11951e(String str, Map<String, String> map, boolean z) {
        return m11947a("POST", str, map, z);
    }
}
