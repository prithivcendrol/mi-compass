package p075m;

import java.text.DecimalFormat;

/* renamed from: m.e */
public abstract class C1890e {

    /* renamed from: a */
    protected C1884a f7275a;

    /* renamed from: b */
    protected int[] f7276b = new int[10];

    /* renamed from: c */
    protected float[] f7277c = new float[10];

    /* renamed from: d */
    private int f7278d;

    /* renamed from: e */
    private String f7279e;

    /* renamed from: a */
    public float mo6446a(float f) {
        return (float) this.f7275a.mo6436a((double) f, 0);
    }

    public String toString() {
        String str = this.f7279e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f7278d; i++) {
            str = str + "[" + this.f7276b[i] + " , " + decimalFormat.format((double) this.f7277c[i]) + "] ";
        }
        return str;
    }
}
