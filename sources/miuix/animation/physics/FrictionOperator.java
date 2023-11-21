package miuix.animation.physics;

public class FrictionOperator implements PhysicsOperator {
    public void getParameters(float[] fArr, double[] dArr) {
        dArr[0] = 1.0d - Math.pow(2.718281828459045d, ((double) fArr[0]) * -4.199999809265137d);
    }

    public double updateVelocity(double d, double d2, double d3, double d4, double... dArr) {
        return d * Math.pow(1.0d - d2, d4);
    }
}
