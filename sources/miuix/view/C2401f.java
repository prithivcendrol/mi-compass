package miuix.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: miuix.view.f */
public class C2401f {
    /* renamed from: a */
    public static void m10242a(TextView textView, float f) {
        textView.setTextSize(Build.VERSION.SDK_INT >= 30 ? textView.getTextSizeUnit() : 2, f);
    }

    /* renamed from: b */
    public static void m10243b(TextView textView, float f) {
        textView.setTextSize(2, f);
    }

    /* renamed from: c */
    public static void m10244c(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = (int) (((float) marginLayoutParams.leftMargin) * f);
            marginLayoutParams.topMargin = (int) (((float) marginLayoutParams.topMargin) * f);
            marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) * f);
            marginLayoutParams.bottomMargin = (int) (((float) marginLayoutParams.bottomMargin) * f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    public static void m10245d(View view, float f) {
        view.setPadding((int) (((float) view.getPaddingLeft()) * f), (int) (((float) view.getPaddingTop()) * f), (int) (((float) view.getPaddingRight()) * f), (int) (((float) view.getPaddingBottom()) * f));
    }

    /* renamed from: e */
    public static void m10246e(View view, float f) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = layoutParams.width;
        boolean z2 = true;
        if (i > 0) {
            layoutParams.width = (int) (((float) i) * f);
            z = true;
        } else {
            z = false;
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            layoutParams.height = (int) (((float) i2) * f);
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(layoutParams);
        }
    }
}
