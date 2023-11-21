package p055i3;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0727l0;

/* renamed from: i3.j */
public class C1656j {

    /* renamed from: i3.j$a */
    public static class C1657a {

        /* renamed from: a */
        public boolean f6524a = false;

        /* renamed from: b */
        public int f6525b;

        /* renamed from: c */
        public int f6526c;

        /* renamed from: d */
        public int f6527d;

        /* renamed from: e */
        public int f6528e;

        public C1657a(int i, int i2, int i3, int i4) {
            this.f6525b = i;
            this.f6526c = i2;
            this.f6527d = i3;
            this.f6528e = i4;
        }

        public C1657a(View view) {
            this.f6525b = C0727l0.m2921z(view);
            this.f6526c = view.getPaddingTop();
            this.f6527d = C0727l0.m2920y(view);
            this.f6528e = view.getPaddingBottom();
        }

        public C1657a(C1657a aVar) {
            this.f6525b = aVar.f6525b;
            this.f6526c = aVar.f6526c;
            this.f6527d = aVar.f6527d;
            this.f6528e = aVar.f6528e;
        }

        /* renamed from: a */
        public void mo5827a(ViewGroup viewGroup) {
            mo5828b(viewGroup);
            viewGroup.setClipToPadding(true);
        }

        /* renamed from: b */
        public void mo5828b(View view) {
            C0727l0.m2900l0(view, this.f6525b, this.f6526c, this.f6527d, this.f6528e);
        }
    }

    /* renamed from: a */
    public static int m6982a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return measuredHeight;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    public static boolean m6983b(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: c */
    public static boolean m6984c(Context context) {
        return m6985d(context.getResources().getConfiguration());
    }

    /* renamed from: d */
    public static boolean m6985d(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 30 ? configuration.isNightModeActive() : (configuration.uiMode & 48) == 32;
    }

    /* renamed from: e */
    public static void m6986e(ViewGroup viewGroup, View view, int i, int i2, int i3, int i4) {
        boolean b = m6983b(viewGroup);
        int width = viewGroup.getWidth();
        int i5 = b ? width - i3 : i;
        if (b) {
            i3 = width - i;
        }
        view.layout(i5, i2, i3, i4);
    }

    /* renamed from: f */
    public static void m6987f(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }
}
