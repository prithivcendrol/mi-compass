package p078m2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p018c2.C1347c;
import p018c2.C1350f;
import p018c2.C1357m;
import p055i3.C1649c;

/* renamed from: m2.a */
public class C1918a {

    /* renamed from: a */
    private Context f7292a;

    private C1918a(Context context) {
        this.f7292a = context;
    }

    /* renamed from: b */
    public static C1918a m7836b(Context context) {
        return new C1918a(context);
    }

    /* renamed from: a */
    public boolean mo6465a() {
        return this.f7292a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo6466c() {
        return this.f7292a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo6467d() {
        return this.f7292a.getResources().getDimensionPixelSize(C1350f.f4639e);
    }

    /* renamed from: e */
    public int mo6468e() {
        Context context = this.f7292a;
        int[] iArr = C1357m.f4900a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr, 16843508, 0);
        int i = C1357m.f4925f;
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(i, 0);
        obtainStyledAttributes.recycle();
        if (layoutDimension > 0) {
            return layoutDimension;
        }
        TypedArray obtainStyledAttributes2 = this.f7292a.obtainStyledAttributes((AttributeSet) null, iArr, 16843470, 0);
        int layoutDimension2 = obtainStyledAttributes2.getLayoutDimension(i, 0);
        obtainStyledAttributes2.recycle();
        return layoutDimension2;
    }

    /* renamed from: f */
    public boolean mo6469f() {
        return C1649c.m6959d(this.f7292a, C1347c.f4559a, false);
    }

    /* renamed from: g */
    public boolean mo6470g() {
        return C1649c.m6959d(this.f7292a, C1347c.f4580n, false);
    }

    /* renamed from: h */
    public boolean mo6471h() {
        return C1649c.m6959d(this.f7292a, C1347c.f4581o, false);
    }

    /* renamed from: i */
    public boolean mo6472i() {
        return true;
    }
}
