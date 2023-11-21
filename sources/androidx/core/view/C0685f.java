package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.f */
public class C0685f {

    /* renamed from: a */
    private static boolean f2759a = false;

    /* renamed from: b */
    private static Method f2760b = null;

    /* renamed from: c */
    private static boolean f2761c = false;

    /* renamed from: d */
    private static Field f2762d;

    /* renamed from: androidx.core.view.f$a */
    public interface C0686a {
        /* renamed from: j */
        boolean mo562j(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m2711a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2759a) {
            try {
                f2760b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f2759a = true;
        }
        Method method = f2760b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m2712b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2711a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0727l0.m2887f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m2713c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m2716f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0727l0.m2887f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m2714d(View view, KeyEvent keyEvent) {
        return C0727l0.m2889g(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m2715e(C0686a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo562j(keyEvent) : callback instanceof Activity ? m2712b((Activity) callback, keyEvent) : callback instanceof Dialog ? m2713c((Dialog) callback, keyEvent) : (view != null && C0727l0.m2887f(view, keyEvent)) || aVar.mo562j(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m2716f(Dialog dialog) {
        if (!f2761c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2762d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2761c = true;
        }
        Field field = f2762d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
