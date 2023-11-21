package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0553a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.j0 */
public class C0336j0 {

    /* renamed from: a */
    private static final int[] f1311a = {16842912};

    /* renamed from: b */
    private static final int[] f1312b = new int[0];

    /* renamed from: c */
    public static final Rect f1313c = new Rect();

    /* renamed from: androidx.appcompat.widget.j0$a */
    static class C0337a {

        /* renamed from: a */
        private static final boolean f1314a;

        /* renamed from: b */
        private static final Method f1315b;

        /* renamed from: c */
        private static final Field f1316c;

        /* renamed from: d */
        private static final Field f1317d;

        /* renamed from: e */
        private static final Field f1318e;

        /* renamed from: f */
        private static final Field f1319f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r2
                goto L_0x0047
            L_0x002f:
                r6 = r2
                goto L_0x0046
            L_0x0031:
                r6 = r2
                goto L_0x0046
            L_0x0033:
                r6 = r2
                goto L_0x0046
            L_0x0035:
                r5 = r2
                goto L_0x003d
            L_0x0037:
                r5 = r2
                goto L_0x0041
            L_0x0039:
                r5 = r2
                goto L_0x0045
            L_0x003b:
                r4 = r2
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r2
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r2
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r8 = r1
                r3 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f1315b = r4
                f1316c = r5
                f1317d = r6
                f1318e = r7
                f1319f = r3
                f1314a = r0
                goto L_0x0064
            L_0x0058:
                f1315b = r2
                f1316c = r2
                f1317d = r2
                f1318e = r2
                f1319f = r2
                f1314a = r1
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0336j0.C0337a.<clinit>():void");
        }

        /* renamed from: a */
        static Rect m1543a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1314a) {
                try {
                    Object invoke = f1315b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1316c.getInt(invoke), f1317d.getInt(invoke), f1318e.getInt(invoke), f1319f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C0336j0.f1313c;
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    static class C0338b {
        /* renamed from: a */
        static Insets m1544a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m1538a(Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    static void m1539b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m1540c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1540c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1311a);
        } else {
            drawable.setState(f1312b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m1541d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C0337a.m1543a(C0553a.m2296i(drawable));
        }
        Insets a = C0338b.m1544a(drawable);
        return new Rect(a.left, a.top, a.right, a.bottom);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m1542e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
