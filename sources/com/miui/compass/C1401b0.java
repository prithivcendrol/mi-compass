package com.miui.compass;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: com.miui.compass.b0 */
public class C1401b0 {
    /* renamed from: a */
    public static void m6243a(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setBottomMargin: view is null, return");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: b */
    public static void m6244b(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintBottomToBottom: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1771l = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: c */
    public static void m6245c(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintBottomToTop: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1769k = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: d */
    public static void m6246d(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintEndToEnd: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1791v = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: e */
    public static void m6247e(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintEndToStart: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1789u = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: f */
    public static void m6248f(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintStartToEnd: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1785s = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: g */
    public static void m6249g(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintStartToStart: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1787t = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: h */
    public static void m6250h(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintTopToBottom: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1767j = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: i */
    public static void m6251i(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setConstraintTopToTop: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1765i = i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: j */
    public static void m6252j(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setHorizonWeight: view is null, return");
            return;
        }
        ConstraintLayout.C0455b bVar = (ConstraintLayout.C0455b) view.getLayoutParams();
        bVar.f1734L = (float) i;
        view.setLayoutParams(bVar);
    }

    /* renamed from: k */
    public static void m6253k(View view, int i) {
        if (view == null) {
            Log.d("Compass:UIUtils", "setTopMargin: view is null, return");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }
}
