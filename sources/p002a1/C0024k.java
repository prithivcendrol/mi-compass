package p002a1;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import p140y0.C2933s;

/* renamed from: a1.k */
public class C0024k {
    /* renamed from: a */
    public String mo29a(Context context) {
        try {
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            Bundle call = acquireContentProviderClient.call("getOAID", (String) null, (Bundle) null);
            acquireContentProviderClient.close();
            return call.getInt("code", -1) == 0 ? call.getString("id") : "";
        } catch (Exception e) {
            C2933s.m12141c("NubiaDeviceIDHelper", e.getMessage());
            return "";
        }
    }
}
