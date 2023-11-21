package p120u0;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p140y0.C2933s;

/* renamed from: u0.d */
public class C2733d {

    /* renamed from: a */
    private static final char[] f10526a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static final char[] f10527b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m11391a(byte[] bArr, boolean z) {
        return new String(m11396f(bArr, z ? f10526a : f10527b));
    }

    /* renamed from: b */
    private static MessageDigest m11392b() {
        return m11393c("MD5");
    }

    /* renamed from: c */
    static MessageDigest m11393c(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: d */
    private static byte[] m11394d(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m11395e(byte[] bArr) {
        return m11392b().digest(bArr);
    }

    /* renamed from: f */
    private static char[] m11396f(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[(r0 << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b & 240) >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return cArr2;
    }

    /* renamed from: g */
    public static byte[] m11397g(String str) {
        return m11395e(m11394d(str, "UTF-8"));
    }

    /* renamed from: h */
    public static String m11398h(String str) {
        return m11391a(m11397g(str), true);
    }

    /* renamed from: i */
    public static String m11399i(byte[] bArr) {
        String str;
        if (bArr != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bArr);
                str = String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (Exception e) {
                C2933s.m12144f("DigestUtil", "getMD5 exception: " + e);
            }
            return str.toLowerCase();
        }
        str = "";
        return str.toLowerCase();
    }

    /* renamed from: j */
    public static String m11400j(String str) {
        return TextUtils.isEmpty(str) ? "" : m11399i(str.getBytes());
    }
}
