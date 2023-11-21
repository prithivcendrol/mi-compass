package p072l2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.SparseArray;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* renamed from: l2.d */
public class C1876d {

    /* renamed from: a */
    private static SparseArray<WeakReference<Object>> f7247a = new SparseArray<>();

    /* renamed from: a */
    private static Activity m7797a(Context context) {
        Activity activity = null;
        while (activity == null && context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return activity;
    }

    /* renamed from: b */
    private static int m7798b(Context context) {
        Activity a = m7797a(context);
        return a != null ? a.hashCode() : context.hashCode();
    }

    /* renamed from: c */
    private static void m7799c(Object obj) {
        if (obj instanceof PopupWindow) {
            PopupWindow popupWindow = (PopupWindow) obj;
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
            }
        }
    }

    /* renamed from: d */
    public static void m7800d(Context context, Object obj) {
        f7247a.remove(m7798b(context));
    }

    /* renamed from: e */
    public static void m7801e(Context context, Object obj) {
        Object obj2;
        int b = m7798b(context);
        if (!(f7247a.get(b) == null || (obj2 = f7247a.get(b).get()) == null || obj2 == obj)) {
            m7799c(obj2);
        }
        f7247a.put(b, new WeakReference(obj));
    }
}
