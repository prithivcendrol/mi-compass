package p140y0;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: y0.p */
public class C2930p {
    /* renamed from: a */
    public static long m12123a(InputStream inputStream, OutputStream outputStream) {
        return m12124b(inputStream, outputStream, 4096);
    }

    /* renamed from: b */
    public static long m12124b(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: c */
    public static void m12125c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Log.e("onetrack", "closeQuietly e", e);
            }
        }
    }

    /* renamed from: d */
    public static void m12126d(InputStream inputStream) {
        m12125c(inputStream);
    }

    /* renamed from: e */
    public static void m12127e(OutputStream outputStream) {
        m12125c(outputStream);
    }

    /* renamed from: f */
    public static void m12128f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("onetrack", "close e", e);
            }
        }
    }

    /* renamed from: g */
    public static byte[] m12129g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m12123a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
