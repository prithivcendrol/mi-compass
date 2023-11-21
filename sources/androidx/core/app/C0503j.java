package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.core.app.j */
public final class C0503j {

    /* renamed from: c */
    private static final Object f2484c = new Object();

    /* renamed from: d */
    private static Set<String> f2485d = new HashSet();

    /* renamed from: e */
    private static final Object f2486e = new Object();

    /* renamed from: a */
    private final Context f2487a;

    /* renamed from: b */
    private final NotificationManager f2488b;

    private C0503j(Context context) {
        this.f2487a = context;
        this.f2488b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static C0503j m2106b(Context context) {
        return new C0503j(context);
    }

    /* renamed from: a */
    public boolean mo2560a() {
        return this.f2488b.areNotificationsEnabled();
    }
}
