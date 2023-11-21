package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0295b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1200a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class C0296a {
        /* renamed from: a */
        public static void m1337a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0295b(ActionBarContainer actionBarContainer) {
        this.f1200a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1200a;
        if (actionBarContainer.f874k) {
            Drawable drawable = actionBarContainer.f873j;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f871h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1200a;
        Drawable drawable3 = actionBarContainer2.f872i;
        if (drawable3 != null && actionBarContainer2.f875l) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1200a;
        if (!actionBarContainer.f874k) {
            drawable = actionBarContainer.f871h;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f873j != null) {
            drawable = actionBarContainer.f871h;
        } else {
            return;
        }
        C0296a.m1337a(drawable, outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
