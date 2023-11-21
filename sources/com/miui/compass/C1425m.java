package com.miui.compass;

/* renamed from: com.miui.compass.m */
public class C1425m {

    /* renamed from: a */
    private static final String f5410a = "m";

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r3 != null) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[SYNTHETIC, Splitter:B:23:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[SYNTHETIC, Splitter:B:33:0x007d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6368a(java.lang.String r3, int r4, int r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x007a, all -> 0x006d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x007a, all -> 0x006d }
            java.net.URLConnection r3 = r2.openConnection()     // Catch:{ Exception -> 0x007a, all -> 0x006d }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x007a, all -> 0x006d }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            java.lang.String r2 = "GET"
            r3.setRequestMethod(r2)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r3.setConnectTimeout(r4)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r3.setReadTimeout(r5)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r4 = 0
            r3.setUseCaches(r4)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r3.connect()     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            int r4 = r3.getResponseCode()     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x0050
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r5.<init>(r2)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
        L_0x003d:
            java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r5 == 0) goto L_0x0047
            r0.append(r5)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            goto L_0x003d
        L_0x0047:
            r4.close()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            goto L_0x0082
        L_0x004b:
            r5 = move-exception
            r1 = r4
            goto L_0x006f
        L_0x004e:
            r1 = r4
            goto L_0x007b
        L_0x0050:
            java.lang.String r4 = f5410a     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r5.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            java.lang.String r2 = "request failed:"
            r5.append(r2)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            int r2 = r3.getResponseCode()     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            r5.append(r2)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x007b, all -> 0x006b }
            goto L_0x0082
        L_0x006b:
            r5 = move-exception
            goto L_0x006f
        L_0x006d:
            r5 = move-exception
            r3 = r1
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.disconnect()
        L_0x0079:
            throw r5
        L_0x007a:
            r3 = r1
        L_0x007b:
            if (r1 == 0) goto L_0x0080
            r1.close()     // Catch:{ IOException -> 0x0080 }
        L_0x0080:
            if (r3 == 0) goto L_0x0085
        L_0x0082:
            r3.disconnect()
        L_0x0085:
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.C1425m.m6368a(java.lang.String, int, int):java.lang.String");
    }
}
