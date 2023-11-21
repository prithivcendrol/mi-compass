package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p021d.C1447a;
import p021d.C1448b;
import p021d.C1450d;
import p021d.C1456j;

/* renamed from: androidx.appcompat.view.a */
public class C0181a {

    /* renamed from: a */
    private Context f560a;

    private C0181a(Context context) {
        this.f560a = context;
    }

    /* renamed from: b */
    public static C0181a m696b(Context context) {
        return new C0181a(context);
    }

    /* renamed from: a */
    public boolean mo628a() {
        return this.f560a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo629c() {
        return this.f560a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo630d() {
        Configuration configuration = this.f560a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo631e() {
        return this.f560a.getResources().getDimensionPixelSize(C1450d.f5711b);
    }

    /* renamed from: f */
    public int mo632f() {
        TypedArray obtainStyledAttributes = this.f560a.obtainStyledAttributes((AttributeSet) null, C1456j.f5972a, C1447a.f5677c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1456j.f6017j, 0);
        Resources resources = this.f560a.getResources();
        if (!mo633g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1450d.f5710a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo633g() {
        return this.f560a.getResources().getBoolean(C1448b.f5701a);
    }

    /* renamed from: h */
    public boolean mo634h() {
        return true;
    }
}
