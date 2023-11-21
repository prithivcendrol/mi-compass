package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0230m;
import androidx.core.view.C0681e;
import androidx.core.view.C0727l0;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0227l {

    /* renamed from: a */
    private final Context f827a;

    /* renamed from: b */
    private final C0214g f828b;

    /* renamed from: c */
    private final boolean f829c;

    /* renamed from: d */
    private final int f830d;

    /* renamed from: e */
    private final int f831e;

    /* renamed from: f */
    private View f832f;

    /* renamed from: g */
    private int f833g;

    /* renamed from: h */
    private boolean f834h;

    /* renamed from: i */
    private C0230m.C0231a f835i;

    /* renamed from: j */
    private C0226k f836j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f837k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f838l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0228a implements PopupWindow.OnDismissListener {
        C0228a() {
        }

        public void onDismiss() {
            C0227l.this.mo1072e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    static class C0229b {
        /* renamed from: a */
        static void m1004a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0227l(Context context, C0214g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0227l(Context context, C0214g gVar, View view, boolean z, int i, int i2) {
        this.f833g = 8388611;
        this.f838l = new C0228a();
        this.f827a = context;
        this.f828b = gVar;
        this.f832f = view;
        this.f829c = z;
        this.f830d = i;
        this.f831e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0226k m990a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f827a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.C0227l.C0229b.m1004a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f827a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p021d.C1450d.f5712c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f827a
            android.view.View r3 = r14.f832f
            int r4 = r14.f830d
            int r5 = r14.f831e
            boolean r6 = r14.f829c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f827a
            androidx.appcompat.view.menu.g r9 = r14.f828b
            android.view.View r10 = r14.f832f
            int r11 = r14.f830d
            int r12 = r14.f831e
            boolean r13 = r14.f829c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.g r1 = r14.f828b
            r0.mo820i(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f838l
            r0.mo831t(r1)
            android.view.View r1 = r14.f832f
            r0.mo825o(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f835i
            r0.mo803h(r1)
            boolean r1 = r14.f834h
            r0.mo828q(r1)
            int r1 = r14.f833g
            r0.mo829r(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0227l.m990a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m991l(int i, int i2, boolean z, boolean z2) {
        C0226k c = mo1070c();
        c.mo832u(z2);
        if (z) {
            if ((C0681e.m2704a(this.f833g, C0727l0.m2916u(this.f832f)) & 7) == 5) {
                i -= this.f832f.getWidth();
            }
            c.mo830s(i);
            c.mo833v(i2);
            int i3 = (int) ((this.f827a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1068p(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo822j();
    }

    /* renamed from: b */
    public void mo1069b() {
        if (mo1071d()) {
            this.f836j.dismiss();
        }
    }

    /* renamed from: c */
    public C0226k mo1070c() {
        if (this.f836j == null) {
            this.f836j = m990a();
        }
        return this.f836j;
    }

    /* renamed from: d */
    public boolean mo1071d() {
        C0226k kVar = this.f836j;
        return kVar != null && kVar.isShowing();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1072e() {
        this.f836j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f837k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1073f(View view) {
        this.f832f = view;
    }

    /* renamed from: g */
    public void mo1074g(boolean z) {
        this.f834h = z;
        C0226k kVar = this.f836j;
        if (kVar != null) {
            kVar.mo828q(z);
        }
    }

    /* renamed from: h */
    public void mo1075h(int i) {
        this.f833g = i;
    }

    /* renamed from: i */
    public void mo1076i(PopupWindow.OnDismissListener onDismissListener) {
        this.f837k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1077j(C0230m.C0231a aVar) {
        this.f835i = aVar;
        C0226k kVar = this.f836j;
        if (kVar != null) {
            kVar.mo803h(aVar);
        }
    }

    /* renamed from: k */
    public void mo1078k() {
        if (!mo1079m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1079m() {
        if (mo1071d()) {
            return true;
        }
        if (this.f832f == null) {
            return false;
        }
        m991l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1080n(int i, int i2) {
        if (mo1071d()) {
            return true;
        }
        if (this.f832f == null) {
            return false;
        }
        m991l(i, i2, true, true);
        return true;
    }
}
