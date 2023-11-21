package p102q2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p018c2.C1347c;
import p055i3.C1649c;
import p055i3.C1656j;

/* renamed from: q2.a */
public class C2582a {

    /* renamed from: a */
    private Drawable f10121a;

    /* renamed from: b */
    private Context f10122b;

    /* renamed from: c */
    private int f10123c;

    /* renamed from: d */
    private View f10124d;

    public C2582a(Context context) {
        this(context, 2);
    }

    public C2582a(Context context, int i) {
        mo9848f(i);
        this.f10122b = context;
        this.f10121a = m10989d();
    }

    /* renamed from: d */
    private Drawable m10989d() {
        return C1649c.m6963h(this.f10122b, C1347c.f4576j);
    }

    /* renamed from: e */
    private Rect m10990e(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (view == null) {
            Log.d("BadgeDrawable", "can not attach badge on a null object.");
            return null;
        } else if (this.f10121a == null) {
            Log.d("BadgeDrawable", "can not find badge drawable resource.");
            return null;
        } else {
            Rect rect = new Rect();
            int intrinsicWidth = this.f10121a.getCurrent().getIntrinsicWidth();
            int intrinsicHeight = this.f10121a.getCurrent().getIntrinsicHeight();
            view.getDrawingRect(rect);
            boolean b = C1656j.m6983b(view);
            int i6 = this.f10123c;
            boolean z = true;
            int i7 = 0;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            Log.d("BadgeDrawable", "invalid gravity value.");
                            i = 0;
                            i3 = 0;
                            i2 = 0;
                            rect.top = i7;
                            rect.left = i;
                            rect.bottom = i2;
                            rect.right = i3;
                            return rect;
                        }
                    }
                }
                i5 = rect.bottom - intrinsicHeight;
                i2 = intrinsicHeight + i5;
                if ((b || i6 != 1) && (!b || i6 != 3)) {
                    z = false;
                }
                i4 = z ? rect.left : rect.right - intrinsicWidth;
                int i8 = i4;
                int i9 = i5;
                i3 = i8 + intrinsicWidth;
                i = i8;
                i7 = i9;
                rect.top = i7;
                rect.left = i;
                rect.bottom = i2;
                rect.right = i3;
                return rect;
            }
            i5 = rect.top;
            i2 = intrinsicHeight + i5;
            if ((b || i6 != 0) && (!b || i6 != 2)) {
                z = false;
            }
            i4 = z ? rect.left : rect.right - intrinsicWidth;
            int i82 = i4;
            int i92 = i5;
            i3 = i82 + intrinsicWidth;
            i = i82;
            i7 = i92;
            rect.top = i7;
            rect.left = i;
            rect.bottom = i2;
            rect.right = i3;
            return rect;
        }
    }

    /* renamed from: a */
    public void mo9845a(View view) {
        mo9846b(view, this.f10123c);
    }

    /* renamed from: b */
    public void mo9846b(View view, int i) {
        mo9848f(i);
        Rect e = m10990e(view);
        if (e == null) {
            Log.d("BadgeDrawable", "attach failed.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        this.f10121a.setBounds(e);
        view.getOverlay().add(this.f10121a);
        this.f10124d = view;
    }

    /* renamed from: c */
    public void mo9847c() {
        View view = this.f10124d;
        if (view != null) {
            view.getOverlay().clear();
        }
    }

    /* renamed from: f */
    public void mo9848f(int i) {
        if (i < 0 || i > 3) {
            Log.d("BadgeDrawable", "set invalid gravity value.");
            this.f10123c = 2;
            return;
        }
        this.f10123c = i;
    }
}
