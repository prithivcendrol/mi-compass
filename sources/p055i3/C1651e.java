package p055i3;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: i3.e */
public final class C1651e {

    /* renamed from: a */
    private DisplayMetrics f6508a;

    /* renamed from: b */
    private int f6509b;

    /* renamed from: c */
    private int f6510c;

    /* renamed from: d */
    private float f6511d;

    /* renamed from: e */
    private int f6512e;

    /* renamed from: f */
    private int f6513f;

    /* renamed from: g */
    private int f6514g;

    public C1651e(Context context) {
        m6969a(context);
    }

    /* renamed from: a */
    private void m6969a(Context context) {
        this.f6508a = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(this.f6508a);
        DisplayMetrics displayMetrics = this.f6508a;
        int i = displayMetrics.widthPixels;
        this.f6509b = i;
        int i2 = displayMetrics.heightPixels;
        this.f6510c = i2;
        float f = displayMetrics.density;
        this.f6511d = f;
        this.f6512e = displayMetrics.densityDpi;
        this.f6513f = (int) (((float) i) / f);
        this.f6514g = (int) (((float) i2) / f);
    }

    /* renamed from: b */
    public float mo5824b() {
        return this.f6511d;
    }

    /* renamed from: c */
    public int mo5825c() {
        return this.f6510c;
    }

    /* renamed from: d */
    public int mo5826d() {
        return this.f6509b;
    }
}
