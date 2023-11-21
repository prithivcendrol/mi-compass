package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p021d.C1450d;
import p021d.C1452f;
import p021d.C1453g;
import p021d.C1455i;

/* renamed from: androidx.appcompat.widget.p1 */
class C0378p1 {

    /* renamed from: a */
    private final Context f1459a;

    /* renamed from: b */
    private final View f1460b;

    /* renamed from: c */
    private final TextView f1461c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1462d;

    /* renamed from: e */
    private final Rect f1463e = new Rect();

    /* renamed from: f */
    private final int[] f1464f = new int[2];

    /* renamed from: g */
    private final int[] f1465g = new int[2];

    C0378p1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1462d = layoutParams;
        this.f1459a = context;
        View inflate = LayoutInflater.from(context).inflate(C1453g.f5830s, (ViewGroup) null);
        this.f1460b = inflate;
        this.f1461c = (TextView) inflate.findViewById(C1452f.f5804s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1455i.f5846a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1706a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1459a.getResources().getDimensionPixelOffset(C1450d.f5722m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1459a.getResources().getDimensionPixelOffset(C1450d.f5721l);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1459a.getResources().getDimensionPixelOffset(z ? C1450d.f5724o : C1450d.f5723n);
        View b = m1707b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1463e);
        Rect rect = this.f1463e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1459a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1463e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1465g);
        view.getLocationOnScreen(this.f1464f);
        int[] iArr = this.f1464f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1465g;
        int i6 = i5 - iArr2[0];
        iArr[0] = i6;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i6 + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1460b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1460b.getMeasuredHeight();
        int i7 = this.f1464f[1];
        int i8 = ((i3 + i7) - dimensionPixelOffset3) - measuredHeight;
        int i9 = i7 + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i9 > this.f1463e.height() : i8 >= 0) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i9;
        }
    }

    /* renamed from: b */
    private static View m1707b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2131c() {
        if (mo2132d()) {
            ((WindowManager) this.f1459a.getSystemService("window")).removeView(this.f1460b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2132d() {
        return this.f1460b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2133e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2132d()) {
            mo2131c();
        }
        this.f1461c.setText(charSequence);
        m1706a(view, i, i2, z, this.f1462d);
        ((WindowManager) this.f1459a.getSystemService("window")).addView(this.f1460b, this.f1462d);
    }
}
