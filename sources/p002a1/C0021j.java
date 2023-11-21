package p002a1;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p140y0.C2933s;

/* renamed from: a1.j */
public class C0021j {

    /* renamed from: a */
    public final LinkedBlockingQueue<C0022a> f53a = new LinkedBlockingQueue<>(1);

    /* renamed from: a1.j$a */
    private class C0022a {

        /* renamed from: a */
        Object f54a;

        /* renamed from: b */
        Method f55b;

        /* renamed from: c */
        Object[] f56c;

        public C0022a(Object obj, Method method, Object[] objArr) {
            this.f54a = obj;
            this.f55b = method;
            this.f56c = objArr;
        }
    }

    /* renamed from: a1.j$b */
    public class C0023b implements InvocationHandler {
        public C0023b() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                C0021j.this.f53a.offer(new C0022a(obj, method, objArr), 1, TimeUnit.SECONDS);
                return null;
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                    return null;
                } catch (Exception e2) {
                    C2933s.m12141c("MsaSDKHelper", e2.getMessage());
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public String mo27a(Context context) {
        try {
            Class<?> cls = Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            Class<?> cls2 = Class.forName("com.bun.supplier.IIdentifierListener");
            cls.getDeclaredMethod("InitSdk", new Class[]{Context.class, Boolean.TYPE, cls2}).invoke(cls, new Object[]{context, Boolean.TRUE, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{cls2}, new C0023b())});
            C0022a poll = this.f53a.poll(1, TimeUnit.SECONDS);
            return poll != null ? poll.f56c[1].getClass().getMethod("getOAID", new Class[0]).invoke(poll.f56c[1], new Object[0]).toString() : "";
        } catch (Exception e) {
            C2933s.m12141c("MsaSDKHelper", e.getMessage());
            return "";
        }
    }
}
