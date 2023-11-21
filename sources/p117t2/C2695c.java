package p117t2;

import android.content.Intent;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import p005a4.C0039a;

/* renamed from: t2.c */
public class C2695c {
    /* renamed from: a */
    public static int m11258a(Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return ((Integer) C0039a.m54o(Intent.class, intent, "getMiuiFlags", new Class[0], new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("IntentUtils", " getMiuiFlags error: " + e);
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m11259b(Intent intent) {
        return (m11258a(intent) & 16) != 0;
    }
}
