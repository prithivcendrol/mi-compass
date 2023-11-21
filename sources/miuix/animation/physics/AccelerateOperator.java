package miuix.animation.physics;

public class AccelerateOperator implements PhysicsOperator {
    public void getParameters(float[] fArr, double[] dArr) {
        dArr[0] = ((double) fArr[0]) * 1000.0d;
    }

    public double updateVelocity(double d, double d2, double d3, double d4, double... dArr) {
        return d + (d2 * d4);
    }
}
