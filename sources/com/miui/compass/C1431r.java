package com.miui.compass;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.math.BigInteger;
import java.net.URLEncoder;

/* renamed from: com.miui.compass.r */
public class C1431r {

    /* renamed from: a */
    private final int f5419a = 45000;

    /* renamed from: b */
    private String f5420b = "65537";

    /* renamed from: c */
    private String f5421c = "91260911122270127234998794195592609888073958094373010756710379192625130836419604330763856136850049911413204124223615647519195442106322096484402456126786185173546280736241523122414918124588757446468517350617150284870882239165712536054685980495005286151635113622783814352878825904710689839570887752503335468013";

    /* renamed from: d */
    private Context f5422d;

    public C1431r(Context context) {
        this.f5422d = context;
    }

    /* renamed from: a */
    private String m6376a(String str) {
        String str2 = this.f5421c;
        String str3 = this.f5420b;
        if (str == null || str2 == null || str3 == null || str.getBytes("UTF-8").length > 127) {
            return null;
        }
        BigInteger bigInteger = new BigInteger(str2);
        return URLEncoder.encode(new String(Base64.encode(new BigInteger("0".concat(str).getBytes("UTF-8")).modPow(new BigInteger(str3), bigInteger).toByteArray(), 8), "UTF-8"), "UTF-8");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        android.util.Log.e("Compass:PressureRequestor", "Fomat json failed: " + r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e A[ExcHandler: JSONException (r1v1 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m6377b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Compass:PressureRequestor"
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e, NumberFormatException -> 0x0018 }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x002e, NumberFormatException -> 0x0018 }
            java.lang.String r3 = "pressure"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ JSONException -> 0x002e, NumberFormatException -> 0x0018 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x002e, NumberFormatException -> 0x0018 }
            float r5 = java.lang.Float.parseFloat(r2)     // Catch:{ JSONException -> 0x002e, NumberFormatException -> 0x0015 }
            goto L_0x0045
        L_0x0015:
            r5 = move-exception
            r1 = r2
            goto L_0x0019
        L_0x0018:
            r5 = move-exception
        L_0x0019:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not parse data to float: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r0, r1, r5)
            goto L_0x0043
        L_0x002e:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fomat json failed: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.e(r0, r5, r1)
        L_0x0043:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.compass.C1431r.m6377b(java.lang.String):float");
    }

    /* renamed from: c */
    public int mo5409c(long j, double d, double d2) {
        StringBuilder sb;
        Log.i("Compass:PressureRequestor", "doCalibrateAltitude begin request");
        try {
            String str = "//weatherapi.market.xiaomi.com/wtr-v2/utils/pressure?latitude=" + m6376a(Double.toString(d2)) + "&longitude=" + m6376a(Double.toString(d)) + "&encoded=latitude,longitude";
            if (C1403c0.m6261h()) {
                sb = new StringBuilder();
                sb.append("https:");
                sb.append(str);
            } else {
                sb = new StringBuilder();
                sb.append("http:");
                sb.append(str);
            }
            String sb2 = sb.toString();
            int i = 0;
            int currentTimeMillis = (int) (45000 - (System.currentTimeMillis() - j));
            float b = m6377b(C1425m.m6368a(sb2, currentTimeMillis, currentTimeMillis));
            if (b <= 0.0f) {
                i = 2;
            } else {
                C1421i.m6356h(this.f5422d, b, 9999.0f);
            }
            Log.i("Compass:PressureRequestor", "doCalibrateAltitude request complete, pressure:" + b);
            return i;
        } catch (Exception e) {
            Log.e("Compass:PressureRequestor", "Error to encrypt location", e);
            return 4;
        }
    }
}
