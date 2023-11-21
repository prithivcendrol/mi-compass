package miuix.animation.utils;

import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StyleComposer {
    private static final String TAG = "StyleComposer";

    public interface IInterceptor<T> {
        Object onMethod(Method method, Object[] objArr, T... tArr);

        boolean shouldIntercept(Method method, Object[] objArr);
    }

    public static <T> T compose(final Class<T> cls, final IInterceptor iInterceptor, final T... tArr) {
        C20551 r0 = new InvocationHandler() {
            public Object invoke(Object obj, Method method, Object[] objArr) {
                Object obj2;
                IInterceptor iInterceptor = IInterceptor.this;
                if (iInterceptor == null || !iInterceptor.shouldIntercept(method, objArr)) {
                    Object obj3 = null;
                    for (Object obj4 : tArr) {
                        try {
                            obj3 = method.invoke(obj4, objArr);
                        } catch (Exception e) {
                            Log.w(StyleComposer.TAG, "failed to invoke " + method + " for " + obj4, e.getCause());
                        }
                    }
                    obj2 = obj3;
                } else {
                    obj2 = IInterceptor.this.onMethod(method, objArr, tArr);
                }
                if (obj2 != null) {
                    Object[] objArr2 = tArr;
                    if (obj2 == objArr2[objArr2.length - 1]) {
                        return cls.cast(obj);
                    }
                }
                return obj2;
            }
        };
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, r0);
        if (cls.isInstance(newProxyInstance)) {
            return cls.cast(newProxyInstance);
        }
        return null;
    }

    public static <T> T compose(Class<T> cls, T... tArr) {
        return compose(cls, (IInterceptor) null, tArr);
    }
}
