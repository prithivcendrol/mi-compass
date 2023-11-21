package p140y0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.UUID;
import p120u0.C2730a;
import p130w0.C2874a;

/* renamed from: y0.r */
public class C2932r {

    /* renamed from: c */
    private static final String f11123c = "r";

    /* renamed from: d */
    private static volatile C2932r f11124d;

    /* renamed from: e */
    private static String f11125e;

    /* renamed from: f */
    private static String f11126f;

    /* renamed from: a */
    private final Context f11127a = C2874a.m11876a();

    /* renamed from: b */
    private boolean f11128b = false;

    private C2932r() {
        f11126f = C2874a.m11880e();
    }

    /* renamed from: a */
    public static C2932r m12132a() {
        if (f11124d == null) {
            synchronized (C2932r.class) {
                if (f11124d == null) {
                    f11124d = new C2932r();
                }
            }
        }
        return f11124d;
    }

    /* renamed from: e */
    private void m12133e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse("content://com.miui.analytics.OneTrackProvider/insId");
                ContentValues contentValues = new ContentValues();
                contentValues.put(f11126f, str);
                this.f11127a.getContentResolver().insert(parse, contentValues);
            }
        } catch (Exception e) {
            C2911a.m12051u(str);
            C2933s.m12145g(f11123c, "setRemoteCacheInstanceId e", e);
        }
    }

    /* renamed from: f */
    private String m12134f() {
        String str = null;
        try {
            Uri.Builder buildUpon = Uri.parse("content://com.miui.analytics.OneTrackProvider/insId").buildUpon();
            buildUpon.appendQueryParameter("pkg", f11126f);
            buildUpon.appendQueryParameter("sign", C2730a.m11378a("insId" + f11126f));
            Cursor query = this.f11127a.getContentResolver().query(buildUpon.build(), (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    str = query.getString(0);
                }
                query.close();
            }
        } catch (Exception e) {
            C2933s.m12145g(f11123c, "getRemoteCacheInstanceId e", e);
        }
        return str;
    }

    /* renamed from: g */
    private String m12135g() {
        String e = C2911a.m12035e(this.f11127a);
        if (TextUtils.isEmpty(e)) {
            return C2911a.m12023E();
        }
        C2911a.m12051u(e);
        return e;
    }

    /* renamed from: b */
    public void mo10226b(Boolean bool) {
        this.f11128b = bool.booleanValue();
    }

    /* renamed from: c */
    public void mo10227c(String str) {
        if (!TextUtils.isEmpty(str)) {
            f11125e = str;
            if (this.f11128b) {
                m12133e(str);
            }
            C2911a.m12051u(f11125e);
        }
    }

    /* renamed from: d */
    public String mo10228d() {
        String str;
        if (!TextUtils.isEmpty(f11125e)) {
            return f11125e;
        }
        if (this.f11128b) {
            str = m12134f();
            String g = m12135g();
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(g)) {
                m12133e(g);
                str = g;
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(g)) {
                C2911a.m12051u(str);
            }
        } else {
            str = m12135g();
        }
        if (TextUtils.isEmpty(str)) {
            String uuid = UUID.randomUUID().toString();
            f11125e = uuid;
            if (this.f11128b) {
                m12133e(uuid);
            }
            C2911a.m12051u(f11125e);
        } else {
            f11125e = str;
        }
        return f11125e;
    }
}
