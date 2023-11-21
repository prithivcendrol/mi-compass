package p002a1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: a1.i */
public class C0020i {
    /* renamed from: b */
    private String m18b(Cursor cursor) {
        String str = null;
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex > 0) {
            str = cursor.getString(columnIndex);
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 > 0) {
            cursor.getInt(columnIndex2);
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 > 0) {
            cursor.getLong(columnIndex3);
        }
        return str;
    }

    /* renamed from: a */
    public String mo26a(Context context) {
        String str = "";
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), (String[]) null, (String) null, new String[]{"oaid"}, (String) null);
            str = m18b(query);
            query.close();
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }
}
