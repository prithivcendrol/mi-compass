package p026d4;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import p026d4.C1507b;

/* renamed from: d4.c */
public class C1509c {

    /* renamed from: a */
    private static ConcurrentHashMap<Integer, C1507b> f6149a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static volatile C1509c f6150b;

    /* renamed from: a */
    public static C1509c m6557a() {
        if (f6150b == null) {
            synchronized (C1509c.class) {
                if (f6150b == null) {
                    f6150b = new C1509c();
                }
            }
        }
        return f6150b;
    }

    /* renamed from: b */
    public C1507b mo5610b(Context context, C1507b.C1508a aVar) {
        if (context == null) {
            return null;
        }
        int hashCode = context.hashCode();
        C1507b bVar = f6149a.get(Integer.valueOf(hashCode));
        if (bVar == null) {
            bVar = new C1507b();
            f6149a.put(Integer.valueOf(hashCode), bVar);
        }
        bVar.mo5608q(aVar);
        return bVar;
    }

    /* renamed from: c */
    public void mo5611c(Context context) {
        f6149a.remove(Integer.valueOf(context.hashCode()));
    }
}
