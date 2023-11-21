package p030e2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import miuix.appcompat.app.floatingactivity.multiapp.C2090a;

/* renamed from: e2.e */
public class C1536e {
    /* renamed from: a */
    public static Bitmap m6636a(Bundle bundle) {
        String str;
        int i = bundle.getInt("parcelFileLength");
        int i2 = bundle.getInt("key_width");
        int i3 = bundle.getInt("key_height");
        byte[] b = m6637b((HashMap) bundle.getSerializable("parcelFile"), i);
        Bitmap bitmap = null;
        if (b != null) {
            try {
                bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(b));
                return bitmap;
            } catch (IllegalArgumentException e) {
                e = e;
                str = "catch illegal argument exception";
            } catch (OutOfMemoryError e2) {
                e = e2;
                str = "catch oom exception";
            }
        } else {
            Log.d("MemoryFileUtil", "getSnapShot with data is null");
            return null;
        }
        Log.w("MemoryFileUtil", str, e);
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0040 A[SYNTHETIC, Splitter:B:27:0x0040] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m6637b(java.util.HashMap<java.lang.String, android.os.ParcelFileDescriptor> r5, int r6) {
        /*
            java.lang.String r0 = "catch close fd error"
            java.lang.String r1 = "MemoryFileUtil"
            java.lang.String r2 = "parcelFile"
            java.lang.Object r5 = r5.get(r2)
            android.os.ParcelFileDescriptor r5 = (android.os.ParcelFileDescriptor) r5
            r2 = 0
            if (r5 == 0) goto L_0x0049
            byte[] r6 = new byte[r6]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a, all -> 0x0028 }
            java.io.FileDescriptor r4 = r5.getFileDescriptor()     // Catch:{ Exception -> 0x002a, all -> 0x0028 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002a, all -> 0x0028 }
            r3.read(r6)     // Catch:{ Exception -> 0x0026 }
            r5.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0025:
            return r6
        L_0x0026:
            r6 = move-exception
            goto L_0x002c
        L_0x0028:
            r6 = move-exception
            goto L_0x003e
        L_0x002a:
            r6 = move-exception
            r3 = r2
        L_0x002c:
            java.lang.String r4 = "catch read from memory error"
            android.util.Log.w(r1, r4, r6)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0049
            r5.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0049
        L_0x0037:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
            goto L_0x0049
        L_0x003c:
            r6 = move-exception
            r2 = r3
        L_0x003e:
            if (r2 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0048:
            throw r6
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p030e2.C1536e.m6637b(java.util.HashMap, int):byte[]");
    }

    /* renamed from: c */
    public static void m6638c(C2090a aVar, byte[] bArr, int i, int i2, int i3, String str, int i4) {
        ParcelFileDescriptor d = m6639d(bArr, i);
        HashMap hashMap = new HashMap(1);
        hashMap.put("parcelFile", d);
        Bundle bundle = new Bundle();
        bundle.putSerializable("parcelFile", hashMap);
        bundle.putInt("parcelFileLength", i);
        bundle.putInt("key_width", i2);
        bundle.putInt("key_height", i3);
        bundle.putInt("key_task_id", i4);
        bundle.putString("key_request_identity", str);
        if (aVar != null) {
            try {
                aVar.mo7477q(7, bundle);
            } catch (RemoteException e) {
                Log.w("MemoryFileUtil", "catch stash snapshot to service error", e);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.MemoryFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r1 != null) goto L_0x0026;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.ParcelFileDescriptor m6639d(byte[] r4, int r5) {
        /*
            r0 = 0
            android.os.MemoryFile r1 = new android.os.MemoryFile     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            java.lang.String r2 = ""
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            r2 = 0
            r1.writeBytes(r4, r2, r2, r5)     // Catch:{ Exception -> 0x002a }
            java.lang.Class<android.os.MemoryFile> r4 = android.os.MemoryFile.class
            java.lang.String r5 = "getFileDescriptor"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x002a }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x002a }
            r5 = 1
            r4.setAccessible(r5)     // Catch:{ Exception -> 0x002a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x002a }
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch:{ Exception -> 0x002a }
            java.io.FileDescriptor r4 = (java.io.FileDescriptor) r4     // Catch:{ Exception -> 0x002a }
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.dup(r4)     // Catch:{ Exception -> 0x002a }
        L_0x0026:
            r1.close()
            goto L_0x003a
        L_0x002a:
            r4 = move-exception
            goto L_0x0030
        L_0x002c:
            r4 = move-exception
            goto L_0x003d
        L_0x002e:
            r4 = move-exception
            r1 = r0
        L_0x0030:
            java.lang.String r5 = "MemoryFileUtil"
            java.lang.String r2 = "catch write to memory error"
            android.util.Log.w(r5, r2, r4)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x003a
            goto L_0x0026
        L_0x003a:
            return r0
        L_0x003b:
            r4 = move-exception
            r0 = r1
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p030e2.C1536e.m6639d(byte[], int):android.os.ParcelFileDescriptor");
    }
}
