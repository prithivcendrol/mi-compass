package p062j4;

/* renamed from: j4.a */
public class C1759a {

    /* renamed from: a */
    private final double f6778a;

    /* renamed from: b */
    private final double f6779b;

    public C1759a(float f, float f2) {
        double d = (double) f2;
        this.f6779b = Math.pow(6.283185307179586d / d, 2.0d);
        this.f6778a = (((double) f) * 12.566370614359172d) / d;
    }

    /* renamed from: a */
    public double mo6047a(double d, float f, double d2, double d3) {
        double d4 = (double) f;
        return (d * (1.0d - (this.f6778a * d4))) + ((double) ((float) (this.f6779b * (d2 - d3) * d4)));
    }
}
