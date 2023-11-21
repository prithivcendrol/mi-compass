package miuix.animation.physics;

public class SpringOperator implements PhysicsOperator {
    double[] params;

    public SpringOperator() {
    }

    @Deprecated
    public SpringOperator(float f, float f2) {
        double[] dArr = new double[2];
        this.params = dArr;
        getParameters(new float[]{f, f2}, dArr);
    }

    public void getParameters(float[] fArr, double[] dArr) {
        double d = (double) fArr[1];
        dArr[0] = Math.pow(6.283185307179586d / d, 2.0d);
        dArr[1] = Math.min((((double) fArr[0]) * 12.566370614359172d) / d, 60.0d);
    }

    public double updateVelocity(double d, double d2, double d3, double d4, double... dArr) {
        return (d * (1.0d - (d3 * d4))) + ((double) ((float) (d2 * (dArr[0] - dArr[1]) * d4)));
    }

    @Deprecated
    public double updateVelocity(double d, float f, float... fArr) {
        if (this.params == null) {
            return d;
        }
        double[] dArr = new double[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            dArr[i] = (double) fArr[i];
        }
        double[] dArr2 = this.params;
        return updateVelocity(d, dArr2[0], dArr2[1], (double) f, dArr);
    }
}
