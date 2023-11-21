package p137x2;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: x2.b */
class C2904b {

    /* renamed from: a */
    private static Class f11076a;

    /* renamed from: b */
    private static Method f11077b;

    /* renamed from: c */
    private static Method f11078c;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0026 */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x000b }
            f11076a = r1     // Catch:{ Exception -> 0x000b }
            goto L_0x000e
        L_0x000b:
            r1 = 0
            f11076a = r1
        L_0x000e:
            java.lang.Class r1 = f11076a
            if (r1 == 0) goto L_0x003b
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0026 }
            r6[r2] = r0     // Catch:{ Exception -> 0x0026 }
            r6[r4] = r0     // Catch:{ Exception -> 0x0026 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ Exception -> 0x0026 }
            f11077b = r1     // Catch:{ Exception -> 0x0026 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            java.lang.Class r1 = f11076a     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = "getInt"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003b }
            r3[r2] = r0     // Catch:{ Exception -> 0x003b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x003b }
            r3[r4] = r0     // Catch:{ Exception -> 0x003b }
            java.lang.reflect.Method r0 = r1.getMethod(r5, r3)     // Catch:{ Exception -> 0x003b }
            f11078c = r0     // Catch:{ Exception -> 0x003b }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p137x2.C2904b.<clinit>():void");
    }

    /* renamed from: a */
    public static String m11996a(String str, String str2) {
        Method method = f11077b;
        if (method != null) {
            try {
                return (String) method.invoke((Object) null, new Object[]{str, str2});
            } catch (Exception e) {
                Log.e("LiteSystemProperties", "key: " + str + " detail:" + e);
            }
        }
        return str2;
    }
}
