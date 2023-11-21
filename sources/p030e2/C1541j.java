package p030e2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import miuix.appcompat.app.C2118q;
import p018c2.C1350f;
import p061j3.C1758h;
import p147z2.C2972a;

/* renamed from: e2.j */
public class C1541j {

    /* renamed from: a */
    private static float f6193a;

    /* renamed from: a */
    private static void m6651a(Context context) {
        if (f6193a == 0.0f) {
            f6193a = (float) context.getResources().getDimensionPixelSize(C1350f.f4627W);
        }
    }

    /* renamed from: b */
    private static boolean m6652b(View view) {
        return (view == null || view.getContext() == null) ? false : true;
    }

    /* renamed from: c */
    public static View m6653c(Context context, View view, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        C1758h hVar = new C1758h(context);
        hVar.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.layout(0, 0, bitmap.getWidth(), bitmap.getHeight());
        frameLayout.setBackground(new BitmapDrawable(context.getResources(), bitmap));
        hVar.addView(frameLayout);
        return hVar;
    }

    /* renamed from: d */
    public static View m6654d(Context context, C2118q qVar) {
        View G0 = qVar.mo7563G0();
        return m6653c(context, G0, m6656f(G0));
    }

    /* renamed from: e */
    public static View m6655e(View view, Bitmap bitmap) {
        return m6653c(view.getContext(), view, bitmap);
    }

    /* renamed from: f */
    public static Bitmap m6656f(View view) {
        if (!m6652b(view)) {
            return null;
        }
        m6651a(view.getContext());
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap e = C2972a.m12266e(drawingCache, f6193a);
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        return e;
    }
}
