package p055i3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: i3.c */
public class C1649c {

    /* renamed from: a */
    private static final TypedValue f6506a = new TypedValue();

    /* renamed from: b */
    private static final ThreadLocal<TypedValue> f6507b = new ThreadLocal<>();

    /* renamed from: a */
    private static TypedValue m6956a(Context context) {
        if (context.getMainLooper().getThread() == Thread.currentThread()) {
            return f6506a;
        }
        ThreadLocal<TypedValue> threadLocal = f6507b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    private static Integer m6957b(Context context, int i) {
        int i2;
        TypedValue a = m6956a(context);
        if (!context.getTheme().resolveAttribute(i, a, true)) {
            return null;
        }
        if (a.resourceId > 0) {
            i2 = context.getResources().getColor(a.resourceId);
        } else {
            int i3 = a.type;
            if (i3 < 28 || i3 > 31) {
                return null;
            }
            i2 = a.data;
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: c */
    public static int m6958c(Context context, int i) {
        TypedValue a = m6956a(context);
        if (context.getTheme().resolveAttribute(i, a, true)) {
            return a.resourceId;
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m6959d(Context context, int i, boolean z) {
        TypedValue a = m6956a(context);
        return context.getTheme().resolveAttribute(i, a, true) ? a.type == 18 && a.data != 0 : z;
    }

    /* renamed from: e */
    public static int m6960e(Context context, int i) {
        Integer b = m6957b(context, i);
        return b != null ? b.intValue() : context.getResources().getColor(-1);
    }

    /* renamed from: f */
    public static int m6961f(Context context, int i, int i2) {
        Integer b = m6957b(context, i);
        return b != null ? b.intValue() : i2;
    }

    /* renamed from: g */
    public static int m6962g(Context context, int i) {
        return context.getResources().getDimensionPixelSize(m6958c(context, i));
    }

    /* renamed from: h */
    public static Drawable m6963h(Context context, int i) {
        TypedValue a = m6956a(context);
        if (!context.getTheme().resolveAttribute(i, a, true)) {
            return null;
        }
        if (a.resourceId > 0) {
            return context.getResources().getDrawable(a.resourceId, context.getTheme());
        }
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return null;
        }
        return new ColorDrawable(a.data);
    }

    /* renamed from: i */
    public static float m6964i(Context context, int i, float f) {
        TypedValue a = m6956a(context);
        return (!context.getTheme().resolveAttribute(i, a, true) || a.type != 4) ? f : (float) a.data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r2 = r0.type;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6965j(android.content.Context r2, int r3, int r4) {
        /*
            android.util.TypedValue r0 = m6956a(r2)
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L_0x001b
            int r2 = r0.type
            r3 = 16
            if (r2 < r3) goto L_0x001b
            r3 = 31
            if (r2 > r3) goto L_0x001b
            int r4 = r0.data
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p055i3.C1649c.m6965j(android.content.Context, int, int):int");
    }

    /* renamed from: k */
    public static TypedValue m6966k(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
}
