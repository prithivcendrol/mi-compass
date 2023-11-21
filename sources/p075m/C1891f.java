package p075m;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: m.f */
public abstract class C1891f {

    /* renamed from: a */
    protected C1884a f7280a;

    /* renamed from: b */
    protected int f7281b = 0;

    /* renamed from: c */
    protected int[] f7282c = new int[10];

    /* renamed from: d */
    protected float[][] f7283d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e */
    protected int f7284e;

    /* renamed from: f */
    protected String f7285f;

    /* renamed from: g */
    protected float[] f7286g = new float[3];

    /* renamed from: h */
    protected boolean f7287h = false;

    /* renamed from: i */
    protected long f7288i;

    /* renamed from: j */
    protected float f7289j = Float.NaN;

    public String toString() {
        String str = this.f7285f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f7284e; i++) {
            str = str + "[" + this.f7282c[i] + " , " + decimalFormat.format(this.f7283d[i]) + "] ";
        }
        return str;
    }
}
