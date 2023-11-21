package p133w3;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: w3.a */
public class C2890a {
    /* renamed from: a */
    public static int m11913a(ContentResolver contentResolver, String str) {
        return Settings.Secure.getInt(contentResolver, str);
    }
}
