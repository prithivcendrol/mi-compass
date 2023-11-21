package p002a1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p140y0.C2933s;

/* renamed from: a1.r */
public class C0031r {
    /* renamed from: a */
    public String mo39a(Context context) {
        String str = "";
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToNext()) {
                    str = query.getString(query.getColumnIndex("value"));
                }
                query.close();
            }
        } catch (Exception e) {
            C2933s.m12141c("VivoDeviceIDHelper", e.getMessage());
        }
        return str;
    }
}
