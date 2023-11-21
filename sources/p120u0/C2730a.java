package p120u0;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import p140y0.C2933s;

/* renamed from: u0.a */
public class C2730a {

    /* renamed from: a */
    private static KeyGenerator f10522a;

    static {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            f10522a = instance;
            instance.init(128);
        } catch (Exception e) {
            C2933s.m12145g(C2933s.m12139a("AES"), "AesUtil e", e);
        }
    }

    /* renamed from: a */
    public static String m11378a(String str) {
        try {
            char[] charArray = (str + C2731b.f10523a).toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                for (int i2 = 0; i2 < charArray.length - 1; i2++) {
                    char c = charArray[i];
                    char c2 = charArray[i2];
                    if (c < c2) {
                        charArray[i] = c2;
                        charArray[i2] = c;
                    }
                }
            }
            return C2733d.m11400j(new String(charArray));
        } catch (Exception unused) {
            C2933s.m12144f("AES", "encodeFromSalt " + "");
            return "";
        }
    }

    /* renamed from: b */
    public static byte[] m11379b() {
        return f10522a.generateKey().getEncoded();
    }

    /* renamed from: c */
    public static byte[] m11380c(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            C2933s.m12145g(C2933s.m12139a("AES"), "encrypt exception:", e);
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m11381d(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(2, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            C2933s.m12145g("AES", "decrypt exception:", e);
            C2933s.m12144f("AES", "content len=" + bArr.length + ", passwd len=" + bArr2.length);
            return null;
        }
    }
}
