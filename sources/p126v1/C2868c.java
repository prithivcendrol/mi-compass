package p126v1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import p017c1.C1336k;
import p017c1.C1339l;
import p083n1.C2420e;

/* renamed from: v1.c */
public final class C2868c {

    /* renamed from: a */
    public static final C2867b f10947a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C2867b bVar = null;
        try {
            C1336k.C1337a aVar = C1336k.f4511d;
            obj = C1336k.m5985a(new C2866a(m11865a(Looper.getMainLooper(), true), (String) null, 2, (C2420e) null));
        } catch (Throwable th) {
            C1336k.C1337a aVar2 = C1336k.f4511d;
            obj = C1336k.m5985a(C1339l.m5989a(th));
        }
        if (!C1336k.m5987c(obj)) {
            bVar = obj;
        }
        f10947a = bVar;
    }

    /* renamed from: a */
    public static final Handler m11865a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
