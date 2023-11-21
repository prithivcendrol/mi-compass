package p110s0;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: s0.g */
class C2645g implements Callable<C2646h> {

    /* renamed from: a */
    final /* synthetic */ String f10315a;

    /* renamed from: b */
    final /* synthetic */ C2642e f10316b;

    C2645g(C2642e eVar, String str) {
        this.f10316b = eVar;
        this.f10315a = str;
    }

    /* renamed from: a */
    public C2646h call() {
        Cursor query = this.f10316b.f10309a.getWritableDatabase().query("events_cloud", (String[]) null, "app_id=?", new String[]{this.f10315a}, (String) null, (String) null, (String) null);
        int columnIndex = query.getColumnIndex("app_id");
        int columnIndex2 = query.getColumnIndex("cloud_data");
        int columnIndex3 = query.getColumnIndex("data_hash");
        int columnIndex4 = query.getColumnIndex("timestamp");
        if (!query.moveToNext()) {
            return null;
        }
        C2646h hVar = new C2646h();
        hVar.f10317a = query.getString(columnIndex);
        String string = query.getString(columnIndex2);
        if (!TextUtils.isEmpty(string)) {
            hVar.f10320d = new JSONObject(string);
        }
        hVar.f10319c = query.getString(columnIndex3);
        hVar.f10318b = query.getLong(columnIndex4);
        return hVar;
    }
}
