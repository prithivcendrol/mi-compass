package p120u0;

import android.content.Context;
import android.util.Base64;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import javax.crypto.Cipher;
import p140y0.C2933s;

/* renamed from: u0.b */
public class C2731b {

    /* renamed from: a */
    public static final String f10523a = m11385d();

    /* renamed from: a */
    public static synchronized String m11382a(Context context, String str) {
        synchronized (C2731b.class) {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load((KeyStore.LoadStoreParameter) null);
            m11384c(context, instance2);
            Certificate certificate = instance2.getCertificate("RSA_KEY");
            if (certificate == null) {
                return null;
            }
            instance.init(1, certificate.getPublicKey());
            String encodeToString = Base64.encodeToString(instance.doFinal(str.getBytes("UTF-8")), 0);
            return encodeToString;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11383b() {
        /*
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "android.security.keystore.KeyGenParameterSpec$Builder"
            java.lang.Class r2 = java.lang.Class.forName(r2)
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]
            r5 = 0
            r4[r5] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r7 = 1
            r4[r7] = r6
            java.lang.reflect.Constructor r4 = r2.getConstructor(r4)
            java.lang.String r6 = "android.security.keystore.KeyProperties"
            java.lang.Class r6 = java.lang.Class.forName(r6)
            java.lang.String r8 = "PURPOSE_ENCRYPT"
            java.lang.reflect.Field r8 = r6.getDeclaredField(r8)
            r9 = 0
            int r8 = r8.getInt(r9)
            java.lang.String r10 = "PURPOSE_DECRYPT"
            java.lang.reflect.Field r10 = r6.getDeclaredField(r10)
            int r10 = r10.getInt(r9)
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r12 = "RSA_KEY"
            r11[r5] = r12
            r8 = r8 | r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r7] = r8
            java.lang.Object r4 = r4.newInstance(r11)
            java.lang.Class[] r8 = new java.lang.Class[r7]
            r8[r5] = r0
            java.lang.String r10 = "setDigests"
            java.lang.reflect.Method r8 = r2.getMethod(r10, r8)
            java.lang.String r10 = "DIGEST_SHA256"
            java.lang.reflect.Field r10 = r6.getDeclaredField(r10)
            java.lang.Object r10 = r10.get(r9)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "DIGEST_SHA512"
            java.lang.reflect.Field r11 = r6.getDeclaredField(r11)
            java.lang.Object r11 = r11.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String[] r13 = new java.lang.String[r3]
            r13[r5] = r10
            r13[r7] = r11
            r12[r5] = r13
            r8.invoke(r4, r12)
            java.lang.Class[] r8 = new java.lang.Class[r7]
            r8[r5] = r0
            java.lang.String r0 = "setEncryptionPaddings"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r8)
            java.lang.String r8 = "ENCRYPTION_PADDING_RSA_PKCS1"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r8)
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String[] r10 = new java.lang.String[r7]
            r10[r5] = r6
            r8[r5] = r10
            r0.invoke(r4, r8)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.String r6 = "build"
            java.lang.reflect.Method r0 = r2.getMethod(r6, r0)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r0 = r0.invoke(r4, r2)
            java.lang.String r2 = "java.security.KeyPairGenerator"
            java.lang.Class r2 = java.lang.Class.forName(r2)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            r4[r5] = r1
            r4[r7] = r1
            java.lang.String r1 = "getInstance"
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "RSA"
            r3[r5] = r4
            java.lang.String r4 = "AndroidKeyStore"
            r3[r7] = r4
            java.lang.Object r1 = r1.invoke(r9, r3)
            java.security.KeyPairGenerator r1 = (java.security.KeyPairGenerator) r1
            java.lang.Class[] r3 = new java.lang.Class[r7]
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r4 = java.security.spec.AlgorithmParameterSpec.class
            r3[r5] = r4
            java.lang.String r4 = "initialize"
            java.lang.reflect.Method r2 = r2.getMethod(r4, r3)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r5] = r0
            r2.invoke(r1, r3)
            r1.generateKeyPair()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120u0.C2731b.m11383b():void");
    }

    /* renamed from: c */
    private static void m11384c(Context context, KeyStore keyStore) {
        try {
            if (!keyStore.containsAlias("RSA_KEY")) {
                m11383b();
            }
        } catch (Exception e) {
            C2933s.m12145g("AndroidKeyStore", "createKey e", e);
        }
    }

    /* renamed from: d */
    private static String m11385d() {
        try {
            return new String("h*Y31]c!@5Ns_jPsvej!@3[(*w(!l".getBytes(), "UTF-8");
        } catch (Exception e) {
            C2933s.m12144f("AndroidKeyStore", e.getMessage());
            return "";
        }
    }

    /* renamed from: e */
    public static synchronized String m11386e(Context context, String str) {
        String str2;
        synchronized (C2731b.class) {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load((KeyStore.LoadStoreParameter) null);
            m11384c(context, instance2);
            instance.init(2, (PrivateKey) instance2.getKey("RSA_KEY", (char[]) null));
            str2 = new String(instance.doFinal(Base64.decode(str, 0)), "UTF-8");
        }
        return str2;
    }
}
