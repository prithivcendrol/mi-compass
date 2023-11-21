package p055i3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import p013b3.C1318e;
import p018c2.C1350f;

/* renamed from: i3.h */
public class C1654h {

    /* renamed from: a */
    private static int f6516a = -1;

    /* renamed from: b */
    private static int f6517b = -1;

    /* renamed from: c */
    private static int f6518c = -1;

    /* renamed from: d */
    private static final int[] f6519d = {16842915, 16842916, 16842917, 16842918};

    /* renamed from: e */
    private static final int[] f6520e = {16842915};

    /* renamed from: f */
    private static final int[] f6521f = {16842916};

    /* renamed from: g */
    private static final int[] f6522g = {16842917};

    /* renamed from: h */
    private static final int[] f6523h = {16842918};

    /* renamed from: a */
    private static int m6977a(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public static void m6978b(View view, int i, int i2) {
        if (view != null && i2 != 0) {
            Drawable background = view.getBackground();
            if ((background instanceof StateListDrawable) && C1318e.m5962b((StateListDrawable) background, f6519d)) {
                C1318e eVar = new C1318e(background);
                view.setBackground(eVar);
                background = eVar;
            }
            if (background instanceof C1318e) {
                ((C1318e) background).mo5182d(i2 == 1 ? f6520e : i == 0 ? f6521f : i == i2 - 1 ? f6523h : f6522g);
            }
        }
    }

    /* renamed from: c */
    public static void m6979c(View view, int i, int i2) {
        m6978b(view, i, i2);
        m6980d(view, i, i2);
    }

    /* renamed from: d */
    public static void m6980d(View view, int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        int a;
        if (view != null && i2 != 0) {
            Context context = view.getContext();
            int paddingStart = view.getPaddingStart();
            view.getPaddingTop();
            int paddingEnd = view.getPaddingEnd();
            view.getPaddingBottom();
            if (i2 == 1) {
                if (f6518c == -1) {
                    f6518c = m6977a(context, C1350f.f4624T);
                }
                i4 = f6518c;
            } else {
                if (f6516a == -1) {
                    f6516a = m6977a(context, C1350f.f4625U);
                }
                if (f6517b == -1) {
                    f6517b = m6977a(context, C1350f.f4623S);
                }
                if (i == 0) {
                    i4 = f6517b;
                    i3 = f6516a;
                } else if (i == i2 - 1) {
                    i4 = f6516a;
                    i3 = f6517b;
                } else {
                    i4 = f6516a;
                }
                measuredHeight = view.getMeasuredHeight();
                a = m6977a(context, C1350f.f4622R);
                if (measuredHeight > 0 && measuredHeight < a) {
                    int i5 = (a - measuredHeight) / 2;
                    i4 += i5;
                    i3 += i5;
                }
                view.setPaddingRelative(paddingStart, i4, paddingEnd, i3);
            }
            i3 = i4;
            measuredHeight = view.getMeasuredHeight();
            a = m6977a(context, C1350f.f4622R);
            int i52 = (a - measuredHeight) / 2;
            i4 += i52;
            i3 += i52;
            view.setPaddingRelative(paddingStart, i4, paddingEnd, i3);
        }
    }
}
