package p120u0;

import android.os.Build;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import p140y0.C2933s;

/* renamed from: u0.e */
public class C2734e {
    /* renamed from: a */
    private static RSAPublicKey m11401a(String str) {
        return (RSAPublicKey) (Build.VERSION.SDK_INT >= 28 ? KeyFactory.getInstance("RSA") : KeyFactory.getInstance("RSA", "BC")).generatePublic(new X509EncodedKeySpec(C2732c.m11389c(str)));
    }

    /* renamed from: b */
    public static byte[] m11402b(byte[] bArr) {
        try {
            RSAPublicKey a = m11401a("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiH0r18h2G+lOzZz0mSZT9liZY\r6ibWUv/biAioduf0zuRbWUYGb3pHobyCOaw2LpVnlf8CeCYtbRJhxL9skOyoU1Qa\rwGtoJzvVR4GbCo1MBTmZ8XThMprr0unRfzsu9GNV4+twciOdS2cNJB7INcwAYBFQ\r9vKpgXFoEjWRhIgwMwIDAQAB\r");
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding", "BC");
            instance.init(1, a);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            C2933s.m12145g(C2933s.m12139a("RsaUtils"), "RsaUtils encrypt exception:", e);
            return null;
        }
    }
}
