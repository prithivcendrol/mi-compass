package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0542a;
import p021d.C1456j;

/* renamed from: androidx.appcompat.widget.b1 */
public class C0298b1 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1201a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1202b = {-16842910};

    /* renamed from: c */
    static final int[] f1203c = {16842908};

    /* renamed from: d */
    static final int[] f1204d = {16843518};

    /* renamed from: e */
    static final int[] f1205e = {16842919};

    /* renamed from: f */
    static final int[] f1206f = {16842912};

    /* renamed from: g */
    static final int[] f1207g = {16842913};

    /* renamed from: h */
    static final int[] f1208h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1209i = new int[0];

    /* renamed from: j */
    private static final int[] f1210j = new int[1];

    /* renamed from: a */
    public static void m1339a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1456j.f6093y0);
        try {
            if (!obtainStyledAttributes.hasValue(C1456j.f5866D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1340b(Context context, int i) {
        ColorStateList e = m1343e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1202b, e.getDefaultColor());
        }
        TypedValue f = m1344f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1342d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1341c(Context context, int i) {
        int[] iArr = f1210j;
        iArr[0] = i;
        C0326g1 t = C0326g1.m1454t(context, (AttributeSet) null, iArr);
        try {
            return t.mo1865b(0, 0);
        } finally {
            t.mo1882v();
        }
    }

    /* renamed from: d */
    static int m1342d(Context context, int i, float f) {
        int c = m1341c(context, i);
        return C0542a.m2250f(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1343e(Context context, int i) {
        int[] iArr = f1210j;
        iArr[0] = i;
        C0326g1 t = C0326g1.m1454t(context, (AttributeSet) null, iArr);
        try {
            return t.mo1866c(0);
        } finally {
            t.mo1882v();
        }
    }

    /* renamed from: f */
    private static TypedValue m1344f() {
        ThreadLocal<TypedValue> threadLocal = f1201a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
