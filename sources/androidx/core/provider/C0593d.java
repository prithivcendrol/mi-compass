package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C0521d;
import androidx.core.provider.C0602g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
class C0593d {

    /* renamed from: a */
    private static final Comparator<byte[]> f2608a = new C0592c();

    /* renamed from: androidx.core.provider.d$a */
    static class C0594a {
        /* renamed from: a */
        static Cursor m2428a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m2421b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m2422c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m2423d(C0595e eVar, Resources resources) {
        return eVar.mo2658b() != null ? eVar.mo2658b() : C0521d.m2177c(resources, eVar.mo2659c());
    }

    /* renamed from: e */
    static C0602g.C0603a m2424e(Context context, C0595e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f = m2425f(context.getPackageManager(), eVar, context.getResources());
        return f == null ? C0602g.C0603a.m2449a(1, (C0602g.C0604b[]) null) : C0602g.C0603a.m2449a(0, m2427h(context, eVar, f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m2425f(PackageManager packageManager, C0595e eVar, Resources resources) {
        String e = eVar.mo2661e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(eVar.mo2662f())) {
            List<byte[]> b = m2421b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f2608a);
            List<List<byte[]>> d = m2423d(eVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f2608a);
                if (m2422c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + eVar.mo2662f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m2426g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    static C0602g.C0604b[] m2427h(Context context, C0595e eVar, String str, CancellationSignal cancellationSignal) {
        boolean z;
        int i;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i2 = 0;
            cursor = C0594a.m2428a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.mo2663g()}, (String) null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : i2;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i2;
                    int i5 = i3;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i = i5;
                        z = false;
                    } else {
                        i = i5;
                        z = true;
                    }
                    arrayList2.add(C0602g.C0604b.m2452a(withAppendedId, i4, i6, z, i));
                    i2 = 0;
                }
                arrayList = arrayList2;
            }
            return (C0602g.C0604b[]) arrayList.toArray(new C0602g.C0604b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
