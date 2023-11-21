package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C0619c;
import java.util.List;

/* renamed from: androidx.core.view.d */
public final class C0676d {

    /* renamed from: a */
    private final DisplayCutout f2756a;

    /* renamed from: androidx.core.view.d$a */
    static class C0677a {
        /* renamed from: a */
        static DisplayCutout m2694a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m2695b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m2696c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m2697d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m2698e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m2699f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C0676d(DisplayCutout displayCutout) {
        this.f2756a = displayCutout;
    }

    /* renamed from: e */
    static C0676d m2689e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0676d(displayCutout);
    }

    /* renamed from: a */
    public int mo2850a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0677a.m2696c(this.f2756a);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo2851b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0677a.m2697d(this.f2756a);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo2852c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0677a.m2698e(this.f2756a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo2853d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0677a.m2699f(this.f2756a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0676d.class != obj.getClass()) {
            return false;
        }
        return C0619c.m2480a(this.f2756a, ((C0676d) obj).f2756a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2756a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2756a + "}";
    }
}
